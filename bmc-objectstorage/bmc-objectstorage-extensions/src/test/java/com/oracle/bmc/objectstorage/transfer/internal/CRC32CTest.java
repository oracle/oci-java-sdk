/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CRC32CTest {

    private CRC32C crc32c;

    @Before
    public void setUp() {
        crc32c = new CRC32C();
    }

    @Test
    public void testUpdateWithSingleByte() {
        byte[] input = "123456789".getBytes(StandardCharsets.US_ASCII);
        for (byte b : input) {
            crc32c.update(b);
        }
        Assert.assertEquals("Checksum value mismatch", 0xE3069283L, crc32c.getValue());
    }

    @Test
    public void testUpdateWithByteArray() {
        byte[] input = "123456789".getBytes(StandardCharsets.US_ASCII);
        crc32c.update(input, 0, input.length);
        Assert.assertEquals("Checksum value mismatch", 0xE3069283L, crc32c.getValue());
    }

    @Test
    public void testUpdateWithByteBuffer() {
        ByteBuffer buffer = ByteBuffer.wrap("123456789".getBytes(StandardCharsets.US_ASCII));
        crc32c.update(buffer);
        Assert.assertEquals("Checksum value mismatch", 0xE3069283L, crc32c.getValue());
    }
}
