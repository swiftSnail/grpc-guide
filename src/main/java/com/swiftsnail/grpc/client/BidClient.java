package com.swiftsnail.grpc.client;

import com.swiftsnail.grpc.server.generated.BidRequest;
import com.swiftsnail.grpc.server.generated.BidResponse;
import com.swiftsnail.grpc.server.generated.BidServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

/**
 * @author yaoxm
 */
@Slf4j
public class BidClient {
    private final ManagedChannel channel;
    private final BidServiceGrpc.BidServiceBlockingStub blockingStub;

    public BidClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext().build());
    }

    public BidClient(ManagedChannel channel) {
        this.channel = channel;
        blockingStub = BidServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public BidResponse bid(@Nonnull BidRequest request) {
        return blockingStub.bid(request);
    }
}
