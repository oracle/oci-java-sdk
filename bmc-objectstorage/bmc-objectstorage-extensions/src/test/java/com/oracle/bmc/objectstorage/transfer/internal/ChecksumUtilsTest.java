/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ChecksumUtilsTest {

    private static final String TEST_DATA = "123456789";
    private static final long CONTENT_LENGTH = TEST_DATA.length();
    private static final String PRECOMPUTED_MD5 = "JfnnlDI7RTiF9RgfG2JNCw==";
    private static final String PRECOMPUTED_SHA256 = "FeKw08M4keuw8e9gnsQZQgwg4yDOlMZfvIwzEkSOsiU=";
    private static final String PRECOMPUTED_SHA384 =
            "60VdVtLBpp3mToMgEfM5PUXz+jHWhC8hr5LS/kacSZ2l4xeYRzNKGEecjR3t6hvj";
    private static final String PRECOMPUTED_CRC32C = "4waSgw==";

    @Test
    public void testCalculateMd5() {
        InputStream stream = new ByteArrayInputStream(TEST_DATA.getBytes(StandardCharsets.UTF_8));
        ChecksumUtils.MD5Calculation result = ChecksumUtils.calculateMd5(stream, CONTENT_LENGTH);

        Assert.assertNotNull(result);
        Assert.assertEquals(PRECOMPUTED_MD5, result.getMd5());
    }

    @Test
    public void testCalculateSha384() {
        InputStream stream = new ByteArrayInputStream(TEST_DATA.getBytes(StandardCharsets.UTF_8));
        ChecksumUtils.SHA384Calculation result =
                ChecksumUtils.calculateSha384(stream, CONTENT_LENGTH);

        Assert.assertNotNull(result);
        Assert.assertEquals(PRECOMPUTED_SHA384, result.getSha384());
    }

    @Test
    public void testCalculateSha256() {
        InputStream stream = new ByteArrayInputStream(TEST_DATA.getBytes(StandardCharsets.UTF_8));
        ChecksumUtils.SHA256Calculation result =
                ChecksumUtils.calculateSha256(stream, CONTENT_LENGTH);

        Assert.assertNotNull(result);
        Assert.assertEquals(PRECOMPUTED_SHA256, result.getSha256());
    }

    @Test
    public void testCalculateCrc32c() {
        InputStream stream = new ByteArrayInputStream(TEST_DATA.getBytes(StandardCharsets.UTF_8));
        ChecksumUtils.CRC32CCalculation result =
                ChecksumUtils.calculateCrc32c(stream, CONTENT_LENGTH);

        Assert.assertNotNull(result);
        Assert.assertEquals(PRECOMPUTED_CRC32C, result.getCrc32c());
    }

    @Test
    public void testCalculateCrc32cChecksum() {
        String result =
                ChecksumUtils.calculateCrc32cChecksum(TEST_DATA.getBytes(StandardCharsets.UTF_8));
        Assert.assertEquals(PRECOMPUTED_CRC32C, result);
    }
}
