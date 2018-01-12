/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.transfer.UploadConfiguration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MultipartUtils {
    static final int MiB = 1024 * 1024;

    /**
     * Test whether an object of a given size is large enough to warrant using multi-part uploads.
     *
     * @param config The configuration to use.
     * @param contentLength The length of the object in bytes.
     * @return true if multi-part uploads should be used, false if not.
     */
    public static boolean shouldUseMultipart(UploadConfiguration config, long contentLength) {
        return config.isAllowMultipartUploads() && meetsMinimumSize(config, contentLength);
    }

    /**
     * Calculate the part size, in bytes, that should be used per multi-part upload part.
     *
     * @param config The configuration to use.
     * @param contentLength The length of the object in bytes.
     * @return The part size to use.
     */
    public static long calculatePartSize(UploadConfiguration config, long contentLength) {
        // use ceil so the number of parts needed does not exceed the max number configured
        double equalPartSize =
                Math.ceil((double) contentLength / config.getMaxPartsForMultipartUpload());
        long sizePerPart =
                (long) Math.max(equalPartSize, (config.getMinimumLengthPerUploadPart() * MiB));
        return sizePerPart;
    }

    /**
     * Test whether or not the MD5 value should be calculated for the given request when issuing a single
     * upload (non-multipart) request.
     *
     * @param config The configuration to use.
     * @param request The request being sent.
     * @return true to calculate MD5, false if it's not necessary.
     */
    public static boolean shouldCalculateMd5(UploadConfiguration config, PutObjectRequest request) {
        return config.isEnforceMd5BeforeUpload() && request.getContentMD5() == null;
    }

    private static boolean meetsMinimumSize(UploadConfiguration config, long contentLength) {
        long min = (config.getMinimumLengthForMultipartUpload() * MiB);
        return contentLength >= min;
    }
}
