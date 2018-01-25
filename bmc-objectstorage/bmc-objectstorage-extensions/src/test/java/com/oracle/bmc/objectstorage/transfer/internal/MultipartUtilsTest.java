/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.transfer.UploadConfiguration;

public class MultipartUtilsTest {
    private static final long LARGE_ENOUGH_FOR_MULTIPART = 128L * MultipartUtils.MiB;

    @Test
    public void shouldUseMultipart() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertTrue(MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART));
    }

    @Test
    public void shouldUseMultipart_multipartsDisabled() {
        UploadConfiguration configuration =
                UploadConfiguration.builder().allowMultipartUploads(false).build();

        assertFalse(MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART));
    }

    @Test
    public void shouldUseMultipart_objectNotLargeEnough() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertFalse(
                MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART - 1));
    }

    @Test
    public void calculatePartSize_exactChunkSplit() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();
        long objectSize =
                configuration.getMinimumLengthPerUploadPart()
                        * MultipartUtils.MiB
                        * configuration.getMaxPartsForMultipartUpload();
        long partSize = objectSize / configuration.getMaxPartsForMultipartUpload();

        assertEquals(partSize, MultipartUtils.calculatePartSize(configuration, objectSize));
    }

    @Test
    public void calculatePartSize_inexactChunkSplit() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();
        long objectSize =
                configuration.getMinimumLengthPerUploadPart()
                        * MultipartUtils.MiB
                        * configuration.getMaxPartsForMultipartUpload();
        long partSize = objectSize / configuration.getMaxPartsForMultipartUpload();

        // increasing object size by even 1 means we'd go over the max parts allowed,
        // so part size increases by 1 to compensate
        objectSize += 1;
        partSize += 1;

        assertEquals(partSize, MultipartUtils.calculatePartSize(configuration, objectSize));
    }

    @Test
    public void shouldCalculateMd5_disabled() {
        assertFalse(
                MultipartUtils.shouldCalculateMd5(
                        UploadConfiguration.builder().enforceMd5(false).build(),
                        PutObjectRequest.builder().build()));
    }

    @Test
    public void shouldCalculateMd5_enabled_alreadySet() {
        assertFalse(
                MultipartUtils.shouldCalculateMd5(
                        UploadConfiguration.builder().enforceMd5(true).build(),
                        PutObjectRequest.builder().contentMD5("md5").build()));
    }

    @Test
    public void shouldCalculateMd5_enabled_notSet() {
        assertTrue(
                MultipartUtils.shouldCalculateMd5(
                        UploadConfiguration.builder().enforceMd5(true).build(),
                        PutObjectRequest.builder().build()));
    }
}
