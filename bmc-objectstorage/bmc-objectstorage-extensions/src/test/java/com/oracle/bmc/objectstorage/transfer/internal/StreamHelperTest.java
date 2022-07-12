/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.DigestOutputStream;

import com.oracle.bmc.util.internal.StringUtils;
import org.junit.Test;

public class StreamHelperTest {
    private static final String TEST_STR = "abcdefghijklmnopqrstuvwxyz";

    @Test
    public void copy() throws Exception {
        String testString = StringUtils.repeat(TEST_STR, 10000);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        StreamHelper.copy(new ByteArrayInputStream(testString.getBytes()), baos);
        assertEquals(testString, new String(baos.toByteArray()));
    }

    @Test
    public void base64Encode() throws IOException {
        DigestOutputStream digestOutputStream =
                StreamHelper.createMd5MessageOutputStream(new StreamHelper.NullOutputStream());
        assertEquals(
                "1B2M2Y8AsgTpgAmY7PhCfg==",
                StreamHelper.base64Encode(digestOutputStream.getMessageDigest()));
        digestOutputStream.write(TEST_STR.getBytes());
        assertEquals(
                "w/zT12GS5AB9+0lsymfhOw==",
                StreamHelper.base64Encode(digestOutputStream.getMessageDigest()));
        // digest reset
        assertEquals(
                "1B2M2Y8AsgTpgAmY7PhCfg==",
                StreamHelper.base64Encode(digestOutputStream.getMessageDigest()));
    }

    @Test
    public void base64EncodeMd5Digest() {
        assertEquals(
                "w/zT12GS5AB9+0lsymfhOw==",
                StreamHelper.base64EncodeMd5Digest(TEST_STR.getBytes()));
    }
}
