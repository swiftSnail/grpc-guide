package com.swiftsnail.grpc.server.generated;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: bid.proto")
public class BidServiceGrpc {

  private BidServiceGrpc() {}

  public static final String SERVICE_NAME = "BidService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.swiftsnail.grpc.server.generated.BidRequest,
      com.swiftsnail.grpc.server.generated.BidResponse> METHOD_BID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "BidService", "bid"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.swiftsnail.grpc.server.generated.BidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.swiftsnail.grpc.server.generated.BidResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.swiftsnail.grpc.server.generated.BidRequest,
      com.swiftsnail.grpc.server.generated.BidResponse> METHOD_KEEP_BID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "BidService", "keep_bid"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.swiftsnail.grpc.server.generated.BidRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.swiftsnail.grpc.server.generated.BidResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BidServiceStub newStub(io.grpc.Channel channel) {
    return new BidServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BidServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BidServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BidServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BidServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BidServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bid(com.swiftsnail.grpc.server.generated.BidRequest request,
        io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BID, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidRequest> keepBid(
        io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_KEEP_BID, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_BID,
            asyncUnaryCall(
              new MethodHandlers<
                com.swiftsnail.grpc.server.generated.BidRequest,
                com.swiftsnail.grpc.server.generated.BidResponse>(
                  this, METHODID_BID)))
          .addMethod(
            METHOD_KEEP_BID,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.swiftsnail.grpc.server.generated.BidRequest,
                com.swiftsnail.grpc.server.generated.BidResponse>(
                  this, METHODID_KEEP_BID)))
          .build();
    }
  }

  /**
   */
  public static final class BidServiceStub extends io.grpc.stub.AbstractStub<BidServiceStub> {
    private BidServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidServiceStub(channel, callOptions);
    }

    /**
     */
    public void bid(com.swiftsnail.grpc.server.generated.BidRequest request,
        io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidRequest> keepBid(
        io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_KEEP_BID, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BidServiceBlockingStub extends io.grpc.stub.AbstractStub<BidServiceBlockingStub> {
    private BidServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.swiftsnail.grpc.server.generated.BidResponse bid(com.swiftsnail.grpc.server.generated.BidRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BidServiceFutureStub extends io.grpc.stub.AbstractStub<BidServiceFutureStub> {
    private BidServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BidServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BidServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BidServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.swiftsnail.grpc.server.generated.BidResponse> bid(
        com.swiftsnail.grpc.server.generated.BidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BID, getCallOptions()), request);
    }
  }

  private static final int METHODID_BID = 0;
  private static final int METHODID_KEEP_BID = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BidServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BidServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BID:
          serviceImpl.bid((com.swiftsnail.grpc.server.generated.BidRequest) request,
              (io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KEEP_BID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.keepBid(
              (io.grpc.stub.StreamObserver<com.swiftsnail.grpc.server.generated.BidResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_BID,
        METHOD_KEEP_BID);
  }

}
