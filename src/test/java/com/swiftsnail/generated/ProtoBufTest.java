package com.swiftsnail.generated;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Assert;
import org.junit.Test;

public class ProtoBufTest {

    /**
     * protobuf2会使用bitField0_标识出是否对某个字段进行过设置，bitField0_会被序列化。
     */
    @Test
    public void testHasFieldV2() throws InvalidProtocolBufferException {
        // required 字段一定返回true。
        Assert.assertTrue(V2.Person.parseFrom(V2.Person.newBuilder().setName("").build().toByteArray()).hasName());

        Assert.assertFalse(V2.Person.parseFrom(V2.Person.newBuilder().setName("").build().toByteArray()).hasAge());

        Assert.assertTrue(V2.Person.parseFrom(V2.Person.newBuilder().setName("").setAge(0).build().toByteArray()).hasAge());
    }

    @Test
    public void testHasFieldV3() throws InvalidProtocolBufferException {
        V3.Person.parseFrom(V3.Person.newBuilder().setName("").build().toByteArray());
    }
}
