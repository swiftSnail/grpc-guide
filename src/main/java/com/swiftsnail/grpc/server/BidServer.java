package com.swiftsnail.grpc.server;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.swiftsnail.grpc.server.generated.BidRequest;
import com.swiftsnail.grpc.server.generated.BidResponse;
import com.swiftsnail.grpc.server.generated.BidServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author yaoxm
 */
@Slf4j
public class BidServer {
    private int port = 9090;
    private Server server;
    private ExecutorService workerExecutorService;

    public static void main(String[] args) throws IOException, InterruptedException {
        final BidServer bidServer = new BidServer();
        bidServer.start();
        bidServer.blockUntilShutdown();
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private void start() throws IOException {
        initWorkerExecutor();

        server = ServerBuilder.forPort(port)
                .executor(workerExecutorService)
                .addService(new BidServiceImpl())
                .build()
                .start();
        log.info("bid server start on port {}", port);

        Runtime.getRuntime()
                .addShutdownHook(
                        new Thread(
                                () -> {
                                    log.info("***shutting down gPRC server since JVM is shutting down.***");
                                    BidServer.this.stop();
                                    log.info("***bid server shut down.***");
                                }));
    }

    private void initWorkerExecutor() {
        workerExecutorService = new ThreadPoolExecutor(
                4,
                256,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(1),
                new ThreadFactoryBuilder().setNameFormat("worker-pool-%d").build(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }

        if (!workerExecutorService.isShutdown()) {
            workerExecutorService.shutdown();
        }
    }

    private static class BidServiceImpl extends BidServiceGrpc.BidServiceImplBase {
        @Override
        public void bid(BidRequest request, StreamObserver<BidResponse> responseObserver) {
            BidResponse bidResponse =
                    BidResponse.newBuilder().setAd("image").setBid(request.getBid()).build();
            responseObserver.onNext(bidResponse);
            responseObserver.onCompleted();
        }

        @Override
        public StreamObserver<BidRequest> keepBid(final StreamObserver<BidResponse> responseObserver) {
            final ServerCallStreamObserver<BidResponse> serverCallStreamObserver =
                    (ServerCallStreamObserver<BidResponse>) responseObserver;
            serverCallStreamObserver.disableAutoInboundFlowControl();

            final AtomicBoolean wasReady = new AtomicBoolean(false);

            serverCallStreamObserver.setOnReadyHandler(() -> {
                if (serverCallStreamObserver.isReady() && wasReady.compareAndSet(false, true)) {
                    log.info("READY");
                    serverCallStreamObserver.request(1);
                }
            });

            return new StreamObserver<BidRequest>() {
                @Override
                public void onNext(BidRequest request) {
                    try {
                        Thread.sleep(1000);
                        BidResponse response = BidResponse.newBuilder()
                                .setBid(request.getBid())
                                .setAd("ad for " + request.getBid())
                                .build();
                        responseObserver.onNext(response);

                        if (serverCallStreamObserver.isReady()) {
                            serverCallStreamObserver.request(1);
                        } else {
                            wasReady.set(false);
                        }
                    } catch (InterruptedException e) {
                        log.error("", e);
                    }
                }

                @Override
                public void onError(Throwable t) {
                    log.error("", t);
                    responseObserver.onCompleted();
                }

                @Override
                public void onCompleted() {
                    log.info("COMPLETED");
                    responseObserver.onCompleted();
                }
            };
        }
    }
}
