/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.transfer.UploadConfiguration;

import com.oracle.bmc.util.internal.Validate;
import jakarta.annotation.Nonnull;

public final class MultipartUtils {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MultipartUtils.class);

    @VisibleForTesting public static final long MiB = 1024L * 1024L;

    /*
     * Max supported sizes are specified @
     * https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingmultipartuploads.htm
     */
    static final long MAX_SUPPORTED_CONTENT_LENGTH = 10L * MiB * MiB; // 10 TiB

    /**
     * Test whether an object of a given size is large enough to warrant using multi-part uploads.
     *
     * @param config The configuration to use.
     * @param contentLength The length of the object in bytes.
     * @return true if multi-part uploads should be used, false if not.
     */
    public static boolean shouldUseMultipart(
            @Nonnull UploadConfiguration config, long contentLength) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        return config.isAllowMultipartUploads() && meetsMinimumSize(config, contentLength);
    }

    /**
     * Calculate the part size, in bytes, that should be used per multi-part upload part.
     *
     * @param config The configuration to use.
     * @param contentLength The length of the object in bytes.
     * @return The part size to use.
     */
    public static long calculatePartSize(@Nonnull UploadConfiguration config, long contentLength) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        Validate.isTrue(
                contentLength <= MAX_SUPPORTED_CONTENT_LENGTH,
                String.format(
                        "Content length [%s] exceeds max supported by ObjectStorage [%s]",
                        contentLength, MAX_SUPPORTED_CONTENT_LENGTH));

        final long configuredSizePerPart = config.getMinimumLengthPerUploadPart() * MiB;
        return isCalculatedPartsLessThanOrEqualToMaxParts(configuredSizePerPart, contentLength)
                ? configuredSizePerPart
                : fetchSizePerPartBasedOnMaxAllowed(contentLength, configuredSizePerPart);
    }

    /**
     * Test whether or not the MD5 value should be calculated for the given request when issuing a
     * single upload (non-multipart) request.
     *
     * @param config The configuration to use.
     * @param request The request being sent.
     * @return true to calculate MD5, false if it's not necessary.
     */
    public static boolean shouldCalculateMd5(
            @Nonnull UploadConfiguration config, @Nonnull PutObjectRequest request) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }
        return config.isEnforceMd5BeforeUpload() && request.getContentMD5() == null;
    }

    /**
     * Test whether or not the additional checksum value should be calculated for the given request
     * when issuing a single upload (non-multipart) request.
     *
     * @param config The configuration to use.
     * @param request The request being sent.
     * @return true to calculate additional checksum, false if it's not necessary.
     */
    public static boolean shouldCalculateAdditionalChecksum(
            @Nonnull UploadConfiguration config, @Nonnull PutObjectRequest request) {
        if (config == null) {
            throw new java.lang.NullPointerException("config is marked non-null but is null");
        }
        if (request == null) {
            throw new java.lang.NullPointerException("request is marked non-null but is null");
        }

        ChecksumAlgorithm checksumAlgorithm = config.getEnforceAdditionalChecksumBeforeUpload();
        ChecksumAlgorithm additionalChecksumAlgorithm = config.getAdditionalChecksumAlgorithm();

        if (checksumAlgorithm == null) {
            return false;
        }

        if (additionalChecksumAlgorithm != null
                && !checksumAlgorithm.equals(additionalChecksumAlgorithm)) {
            throw new IllegalArgumentException(
                    "If both additionalChecksumAlgorithm and enforceAdditionalChecksumBeforeUpload are provided, they must be the same.");
        }

        switch (checksumAlgorithm) {
            case Crc32C:
                return request.getOpcContentCrc32c() == null;
            case Sha256:
                return request.getOpcContentSha256() == null;
            case Sha384:
                return request.getOpcContentSha384() == null;
            default:
                return false;
        }
    }

    /**
     * Determines whether an additional checksum value should be set for the given request.
     *
     * <p>This method covers the following cases:
     *
     * <ul>
     *   <li>If the request already has a checksum algorithm set, the method returns false, as
     *       there's no need to set it again.
     *   <li>If both the configuration's additional checksum algorithm and the request's checksum
     *       algorithm are provided but differ, an IllegalArgumentException is thrown.
     *   <li>If the configuration has no additional checksum algorithm and the request has no
     *       checksum algorithm, the method returns false, as there's nothing to set.
     *   <li>If the configuration has an additional checksum algorithm, and the request has no
     *       checksum algorithm, the method returns true, indicating that the additional checksum
     *       should be set.
     * </ul>
     *
     * @param config The configuration to use.
     * @param request The request being sent.
     * @return true if the additional checksum should be set, false otherwise.
     * @throws NullPointerException if config or request is null.
     * @throws IllegalArgumentException if both the configuration and the request have different
     *     checksum algorithms.
     */
    public static boolean shouldSetAdditionalChecksum(
            @Nonnull UploadConfiguration config, @Nonnull PutObjectRequest request) {
        if (config == null) {
            throw new NullPointerException("config is marked non-null but is null");
        }
        if (request == null) {
            throw new NullPointerException("request is marked non-null but is null");
        }

        ChecksumAlgorithm additionalChecksumAlgorithm = config.getAdditionalChecksumAlgorithm();
        ChecksumAlgorithm requestChecksumAlgorithm = request.getOpcChecksumAlgorithm();

        if (requestChecksumAlgorithm != null) {
            if (additionalChecksumAlgorithm != null
                    && !additionalChecksumAlgorithm.equals(requestChecksumAlgorithm)) {
                throw new IllegalArgumentException(
                        "If you are providing ChecksumAlgorithm in the upload request and setting the additionalChecksumAlgorithm, then both must be the same.");
            }
            return false;
        }

        if (additionalChecksumAlgorithm == null) {
            return false;
        }

        return true;
    }

    private static boolean meetsMinimumSize(UploadConfiguration config, long contentLength) {
        long min = (config.getMinimumLengthForMultipartUpload() * MiB);
        return contentLength >= min;
    }

    private static boolean isCalculatedPartsLessThanOrEqualToMaxParts(
            long configuredLengthPerPart, long contentLength) {
        final long calculatedNumParts =
                (long) Math.ceil((double) contentLength / configuredLengthPerPart);
        if (calculatedNumParts <= UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS) {
            return true;
        }
        LOG.warn(
                "Number of parts to upload [%s] is greater than the maximum number of parts allowed [%s] for given "
                        + "content length [%s]. Consider increasing the MinimumLengthPerUploadPart configuration option",
                calculatedNumParts, contentLength);
        return false;
    }

    /**
     * Fetches the size per part based on {@link UploadConfiguration#MAXIMUM_NUM_ALLOWED_PARTS}.
     *
     * @param contentLength the length in bytes of the object to upload
     * @param configuredSizePerPart the configured size per part in bytes
     * @return the size per part in bytes
     */
    private static long fetchSizePerPartBasedOnMaxAllowed(
            long contentLength, long configuredSizePerPart) {
        final double calculatedSizePerPart =
                (double) contentLength / UploadConfiguration.MAXIMUM_NUM_ALLOWED_PARTS;
        final long sizePerPart = (long) Math.ceil(calculatedSizePerPart);

        /*
         * At this point, the enforcement of the configured part size is relaxed in order to try and upload the
         * object for the customer.
         *
         * This means that there are over 10,000 calculated parts based on MinimumLengthPerUploadPart.
         * Given that the max supported content-length for a single file is 10 TiB:
         * 10 TiB / 10,000 parts * 1024 (GiB/TiB) = 1.024 (GiB/part).
         * 1.024 (GiB/part) < max size allowed per part of 50 (GiB/part).
         *
         * If the length per part is configured at the smallest allowed value of 10 MiB, then the configured
         * size per part is ignored and recalculated based on the the maximum number of allowed parts (10,000).
         *
         * So this assertion should never be tripped.
         */
        assert sizePerPart <= (UploadConfiguration.MAXIMUM_ALLOWED_LENGTH_PER_PART_MB * MiB);

        LOG.info(
                "Ignoring MinimumLengthPerUploadPart [{} bytes] and using {} bytes per part for upload",
                configuredSizePerPart,
                sizePerPart);

        return sizePerPart;
    }

    private MultipartUtils() {}
}
