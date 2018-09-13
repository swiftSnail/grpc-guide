package com.swiftsnail.grpc.client;

import com.swiftsnail.grpc.server.generated.BidRequest;
import com.swiftsnail.grpc.server.generated.BidResponse;
import org.junit.Assert;
import org.junit.Test;

public class BidClientTest {
    private final BidClient bidClient = new BidClient("localhost", 9090);

    @Test
    public void testBid() {
        BidResponse bidResponse = bidClient.bid(BidRequest.newBuilder().setBid("12345").build());
        Assert.assertEquals("12345", bidResponse.getBid());
        Assert.assertFalse(bidResponse.getAd().isEmpty());
    }

}
