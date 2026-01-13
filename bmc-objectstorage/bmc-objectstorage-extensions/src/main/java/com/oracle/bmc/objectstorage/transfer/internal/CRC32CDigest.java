/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.security.MessageDigest;
import java.nio.ByteBuffer;

public class CRC32CDigest extends MessageDigest {

    private final CRC32C crc32c;

    public CRC32CDigest() {
        super("CRC32C");
        crc32c = new CRC32C();
    }

    @Override
    protected void engineUpdate(byte input) {
        crc32c.update(input);
    }

    @Override
    protected void engineUpdate(byte[] input, int offset, int len) {
        crc32c.update(input, offset, len);
    }

    @Override
    protected byte[] engineDigest() {
        long crcValue = crc32c.getValue();
        byte[] crcBytes = ByteBuffer.allocate(4).putInt((int) crcValue).array();
        engineReset();
        return crcBytes;
    }

    @Override
    protected void engineReset() {
        crc32c.reset();
    }
}
