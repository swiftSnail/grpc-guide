// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bid.proto

package com.swiftsnail.grpc.server.generated;

/**
 * Protobuf type {@code BidRequest}
 */
public final class BidRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:BidRequest)
        BidRequestOrBuilder {
    public static final int BID_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:BidRequest)
    private static final com.swiftsnail.grpc.server.generated.BidRequest DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<BidRequest>
            PARSER = new com.google.protobuf.AbstractParser<BidRequest>() {
        @java.lang.Override
        public BidRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new BidRequest(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new com.swiftsnail.grpc.server.generated.BidRequest();
    }

    private volatile java.lang.Object bid_;
    private byte memoizedIsInitialized = -1;

    // Use BidRequest.newBuilder() to construct.
    private BidRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }
    private BidRequest() {
        bid_ = "";
    }

    private BidRequest(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        bid_ = s;
                        break;
                    }
                    default: {
                        if (!parseUnknownFieldProto3(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return com.swiftsnail.grpc.server.generated.RTB.internal_static_BidRequest_descriptor;
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.swiftsnail.grpc.server.generated.BidRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.swiftsnail.grpc.server.generated.BidRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<BidRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.swiftsnail.grpc.server.generated.RTB.internal_static_BidRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.swiftsnail.grpc.server.generated.BidRequest.class, com.swiftsnail.grpc.server.generated.BidRequest.Builder.class);
    }

    /**
     * <code>string bid = 1;</code>
     */
    public java.lang.String getBid() {
        java.lang.Object ref = bid_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            bid_ = s;
            return s;
        }
    }

    /**
     * <code>string bid = 1;</code>
     */
    public com.google.protobuf.ByteString
    getBidBytes() {
        java.lang.Object ref = bid_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            bid_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (!getBidBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bid_);
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getBidBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bid_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.swiftsnail.grpc.server.generated.BidRequest)) {
            return super.equals(obj);
        }
        com.swiftsnail.grpc.server.generated.BidRequest other = (com.swiftsnail.grpc.server.generated.BidRequest) obj;

        boolean result = true;
        result = result && getBid()
                .equals(other.getBid());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + BID_FIELD_NUMBER;
        hash = (53 * hash) + getBid().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BidRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.swiftsnail.grpc.server.generated.BidRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code BidRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:BidRequest)
            com.swiftsnail.grpc.server.generated.BidRequestOrBuilder {
        private java.lang.Object bid_ = "";

        // Construct using com.swiftsnail.grpc.server.generated.BidRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.swiftsnail.grpc.server.generated.RTB.internal_static_BidRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.swiftsnail.grpc.server.generated.RTB.internal_static_BidRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.swiftsnail.grpc.server.generated.BidRequest.class, com.swiftsnail.grpc.server.generated.BidRequest.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bid_ = "";

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return com.swiftsnail.grpc.server.generated.RTB.internal_static_BidRequest_descriptor;
        }

        @java.lang.Override
        public com.swiftsnail.grpc.server.generated.BidRequest getDefaultInstanceForType() {
            return com.swiftsnail.grpc.server.generated.BidRequest.getDefaultInstance();
        }

        @java.lang.Override
        public com.swiftsnail.grpc.server.generated.BidRequest build() {
            com.swiftsnail.grpc.server.generated.BidRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.swiftsnail.grpc.server.generated.BidRequest buildPartial() {
            com.swiftsnail.grpc.server.generated.BidRequest result = new com.swiftsnail.grpc.server.generated.BidRequest(this);
            result.bid_ = bid_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return (Builder) super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return (Builder) super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.swiftsnail.grpc.server.generated.BidRequest) {
                return mergeFrom((com.swiftsnail.grpc.server.generated.BidRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.swiftsnail.grpc.server.generated.BidRequest other) {
            if (other == com.swiftsnail.grpc.server.generated.BidRequest.getDefaultInstance()) return this;
            if (!other.getBid().isEmpty()) {
                bid_ = other.bid_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            com.swiftsnail.grpc.server.generated.BidRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (com.swiftsnail.grpc.server.generated.BidRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        /**
         * <code>string bid = 1;</code>
         */
        public java.lang.String getBid() {
            java.lang.Object ref = bid_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                bid_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string bid = 1;</code>
         */
        public Builder setBid(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            bid_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string bid = 1;</code>
         */
        public com.google.protobuf.ByteString
        getBidBytes() {
            java.lang.Object ref = bid_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                bid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string bid = 1;</code>
         */
        public Builder setBidBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            bid_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string bid = 1;</code>
         */
        public Builder clearBid() {

            bid_ = getDefaultInstance().getBid();
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:BidRequest)
    }

}
