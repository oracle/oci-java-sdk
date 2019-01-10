/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;

import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.transfer.UploadConfiguration;
import org.junit.rules.ExpectedException;

public class MultipartUtilsTest {
    private static final long LARGE_ENOUGH_FOR_MULTIPART = 128L * MultipartUtils.MiB;
    private static final long TOO_LARGE_FOR_MULTIPART =
            UploadConfiguration.MAXIMUM_ALLOWED_LENGTH_PER_PART_MB
                            * UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS
                            * MultipartUtils.MiB
                    + 1L;

    @Rule public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldUseMultipart() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertTrue(MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART));
    }

    @Test
    public void shouldUseMultipart_multipartsDisabled_shouldReturnFalse() {
        UploadConfiguration configuration =
                UploadConfiguration.builder().allowMultipartUploads(false).build();

        assertFalse(MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART));
    }

    @Test
    public void shouldUseMultipart_objectNotLargeEnough_shouldReturnFalse() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertFalse(
                MultipartUtils.shouldUseMultipart(configuration, LARGE_ENOUGH_FOR_MULTIPART - 1L));
    }

    @Test
    public void shouldUseMultipart_objectTooLarge_shouldReturnTrue() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertTrue(MultipartUtils.shouldUseMultipart(configuration, TOO_LARGE_FOR_MULTIPART));
    }

    @Test
    public void shouldUseMultipart_objectNotTooLarge_shouldReturnTrue() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();

        assertTrue(MultipartUtils.shouldUseMultipart(configuration, TOO_LARGE_FOR_MULTIPART - 1L));
    }

    @Test
    public void calculatePartSize_exactChunkSplit_partSizeShouldBeEqual() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();
        long objectSize =
                configuration.getLengthPerUploadPart()
                        * MultipartUtils.MiB
                        * UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS;
        long partSize = objectSize / UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS;

        assertEquals(partSize, MultipartUtils.calculatePartSize(configuration, objectSize));
    }

    @Test
    public void calculatePartSize_inexactChunkSplit_partSizeShouldBeOneMore() {
        UploadConfiguration configuration = UploadConfiguration.builder().build();
        long objectSize =
                configuration.getLengthPerUploadPart()
                        * MultipartUtils.MiB
                        * UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS;
        long partSize = objectSize / UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS;

        // increasing object size by even 1 means we'd go over the max parts allowed,
        // so part size increases by 1 to compensate
        objectSize += 1;
        partSize += 1;

        assertEquals(partSize, MultipartUtils.calculatePartSize(configuration, objectSize));
    }

    @Test
    public void calculatePartSize_nullConfig_shouldThrowException() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("config");

        MultipartUtils.calculatePartSize(null, LARGE_ENOUGH_FOR_MULTIPART);
    }

    @Test
    public void calculatePartSize_objectTooLarge_shouldThrowException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("exceeds max supported by ObjectStorage");

        UploadConfiguration configuration = UploadConfiguration.builder().build();
        MultipartUtils.calculatePartSize(configuration, TOO_LARGE_FOR_MULTIPART);
    }

    @Test
    public void calculatePartSize_partSizeLessThanMinimum_shouldReturnMinimum() {
        UploadConfiguration configuration =
                UploadConfiguration.builder()
                        .lengthPerUploadPart(10 /* MiB */)
                        .minimumLengthForMultipartUpload(10 /* MiB */)
                        .build();
        long expected = configuration.getMinimumLengthPerUploadPart() * MultipartUtils.MiB;
        long contentLength = 5L * MultipartUtils.MiB;

        long actual = MultipartUtils.calculatePartSize(configuration, contentLength);

        assertEquals("PartSize should be equal to the configured minimum", expected, actual);
    }

    /**
     * Covers the use-case where we still try to make a best attempt to upload an object even though it exceeds the
     * configured number of upload parts.  No need to check for the case where the configured max allowed number
     * of parts is > max allowed by the service as this is covered by the validation of the content length being less
     * than the max supported content length (see {@link #calculatePartSize_objectTooLarge_shouldThrowException()}
     */
    @Test
    public void
            calculatePartSize_partSizeGreaterThanConfigured_shouldReturnSizeGreaterThanConfiguredMax() {
        int lengthPerPartMiB = 10;
        UploadConfiguration configuration =
                UploadConfiguration.builder()
                        .lengthPerUploadPart(lengthPerPartMiB)
                        .minimumLengthForMultipartUpload(lengthPerPartMiB)
                        .build();
        long contentLength = 120000L * MultipartUtils.MiB;
        long expected = lengthPerPartMiB * MultipartUtils.MiB;

        long actual = MultipartUtils.calculatePartSize(configuration, contentLength);

        assertTrue("PartSize should be greater than configured max", expected < actual);
    }

    @Test
    public void calculatePartSize_objectSizeEqualsMaxAllowed_shouldReturnCalculatedPartSizes() {
        int lengthPerPartMiB = 10;
        UploadConfiguration configuration =
                UploadConfiguration.builder()
                        .lengthPerUploadPart(lengthPerPartMiB)
                        .minimumLengthForMultipartUpload(lengthPerPartMiB)
                        .build();
        long expected =
                (long)
                        Math.ceil(
                                (double) MultipartUtils.MAX_SUPPORTED_CONTENT_LENGTH
                                        / UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS);

        long actual =
                MultipartUtils.calculatePartSize(
                        configuration, MultipartUtils.MAX_SUPPORTED_CONTENT_LENGTH);

        assertEquals("PartSize should be equal", expected, actual);
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
