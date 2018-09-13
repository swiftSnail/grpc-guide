package com.swiftsnail.grpc.client;

import com.swiftsnail.grpc.server.generated.BidRequest;
import com.swiftsnail.grpc.server.generated.BidResponse;
import com.swiftsnail.grpc.server.generated.BidServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ClientCallStreamObserver;
import io.grpc.stub.ClientResponseObserver;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author yaoxm
 */
@Slf4j
public class AsyncBidClient {
    private final ManagedChannel channel;
    private final BidServiceGrpc.BidServiceStub stub;

    public AsyncBidClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    public AsyncBidClient(ManagedChannel channel) {
        this.channel = channel;
        stub = BidServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public StreamObserver<BidRequest> keepBid(int count, CountDownLatch latch) {
        return stub.keepBid(new ClientResponseObserver<BidRequest, BidResponse>() {
            ClientCallStreamObserver<BidRequest> requestStream;

            @Override
            public void beforeStart(ClientCallStreamObserver<BidRequest> requestStream) {
                this.requestStream = requestStream;
                requestStream.disableAutoInboundFlowControl();

                requestStream.setOnReadyHandler(() -> {
                    int i = 0;
                    while (i < count) {
                        requestStream.onNext(BidRequest.newBuilder().setBid(UUID.randomUUID().toString()).build());
                        i++;
                    }
                    requestStream.onCompleted();
                });
            }

            @Override
            public void onNext(BidResponse response) {
                log.info("get bid result {}", response.getAd());
                requestStream.request(1);
            }

            @Override
            public void onError(Throwable t) {
                log.error("Error", t);
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                log.info("all latch");
                latch.countDown();
            }
        });
    }
}
