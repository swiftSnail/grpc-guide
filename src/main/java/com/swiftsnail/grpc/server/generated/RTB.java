// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bid.proto

package com.swiftsnail.grpc.server.generated;

public final class RTB {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BidRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BidRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BidResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BidResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\tbid.proto\"\031\n\nBidRequest\022\013\n\003bid\030\001 \001(\t\"&" +
                        "\n\013BidResponse\022\013\n\003bid\030\001 \001(\t\022\n\n\002ad\030\002 \001(\t2]" +
                        "\n\nBidService\022\"\n\003bid\022\013.BidRequest\032\014.BidRe" +
                        "sponse\"\000\022+\n\010keep_bid\022\013.BidRequest\032\014.BidR" +
                        "esponse\"\000(\0010\001B/\n$com.swiftsnail.grpc.ser" +
                        "ver.generatedB\003RTBH\001P\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_BidRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_BidRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BidRequest_descriptor,
                new java.lang.String[]{"Bid",});
        internal_static_BidResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_BidResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_BidResponse_descriptor,
                new java.lang.String[]{"Bid", "Ad",});
    }
    private RTB() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
