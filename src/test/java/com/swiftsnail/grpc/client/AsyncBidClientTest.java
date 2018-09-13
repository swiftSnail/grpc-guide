package com.swiftsnail.grpc.client;

import com.swiftsnail.grpc.server.generated.BidRequest;
import io.grpc.stub.StreamObserver;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class AsyncBidClientTest {

    private final AsyncBidClient bidClient = new AsyncBidClient("localhost", 9090);

    @Test
    public void testKeepBid() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<BidRequest> a = bidClient.keepBid(10, latch);
        latch.await();

        bidClient.shutdown();
    }
}
