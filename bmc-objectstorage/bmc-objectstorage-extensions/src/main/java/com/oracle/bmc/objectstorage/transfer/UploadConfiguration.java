/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.io.DuplicatableInputStream;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Validate;

/**
 * The configuration for the {@code UploadManager}.  For more information, please refer to the online documentation
 * found <a href="https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingmultipartuploads.htm">here</a>.
 */
@Slf4j
@Getter
@ToString
public class UploadConfiguration {
    /*
     * Max supported sizes are specified @
     * https://docs.cloud.oracle.com/iaas/Content/Object/Tasks/usingmultipartuploads.htm
     */
    public static final int MAXIMUM_NUM_ALLOWED_PARTS = 10000;
    public static final long MINIMUM_ALLOWED_LENGTH_PER_PART_MB = 1L; // 1 MiB
    public static final long MAXIMUM_ALLOWED_LENGTH_PER_PART_MB = 50L * 1024L; // 50 GiB

    private static final int DEFAULT_MIN_LENGTH_FOR_MULTI_PART_UPLOAD = 128;
    private static final int DEFAULT_LENGTH_PER_UPLOAD_PART = 128;

    /**
     * Minimum length in MiB before an upload is performed using multi-part upload, default 128.
     * <p>
     * Note: Accepted values: 0 - 51200.  Using a large value is not recommended.
     */
    private final long minimumLengthForMultipartUpload;
    /**
     * Length in MiB for each part of a multi-part upload (except the last), default 128.
     * <p>
     * Accepted values: 1 - 51200.  Using a large value is not recommended.
     */
    private final long lengthPerUploadPart;
    /**
     * Maximum number of parts to split an upload into, default 10,000 (max allowable parts by Object Storage Service).
     * <p>
     * Note: Accepted values: 1 - 10000
     * @deprecated no longer configurable as maxPartsForMultipartUpload is always configured as the default of 10,000.
     * Use {@link #MAXIMUM_NUM_ALLOWED_PARTS instead}
     */
    @Deprecated private final int maxPartsForMultipartUpload;
    /**
     * Flag to indicate that MD5 should be set on every PutObject call.  If not provided, the SDK will calculate it before
     * uploading the object. Default is false.
     * <p>
     * Note, having the SDK calculate it could lead to OutOfMemory exceptions if the stream cannot be duplicated,
     * ie does not implement {@link DuplicatableInputStream}, as the entire stream will have to be read into memory.
     */
    private final boolean enforceMd5BeforeUpload;
    /**
     * Flag to indicate that MD5 should be set on every part of a multi-part upload.  The SDK will calculate the MD5 before uploading
     * for each part it creates.  Default is false.
     * <p>
     * Note, having the SDK calculate it could lead to OutOfMemory exceptions if the source stream for the part cannot be duplicated,
     * ie does not implement {@link DuplicatableInputStream}, as the entire part will have to be read into memory.
     */
    private final boolean enforceMd5BeforeMultipartUpload;
    /**
     * Flag to indicate that multi-part uploads can be used.  Default is true.
     */
    private final boolean allowMultipartUploads;
    /**
     * Flag to indicate that multi-part uploads can upload individual parts in parallel if possible.  Default is true.
     */
    private final boolean allowParallelUploads;
    /**
     * Flag to indicate that uploads that fail should not be automatically aborted (client is reponsible for always cleaning up
     * failed uploads themselves).  Default is false.
     */
    private final boolean disableAutoAbort;

    @Deprecated
    public long getMinimumLengthPerUploadPart() {
        return lengthPerUploadPart;
    }

    // Explicit @Builder on constructor so we can enforce default values.
    @Builder
    private UploadConfiguration(
            Integer minimumLengthForMultipartUpload,
            Integer lengthPerUploadPart,
            Boolean enforceMd5BeforeUpload,
            Boolean enforceMd5BeforeMultipartUpload,
            Boolean allowMultipartUploads,
            Boolean allowParallelUploads,
            Boolean disableAutoAbort) {
        this.minimumLengthForMultipartUpload =
                getOrDefault(
                        minimumLengthForMultipartUpload, DEFAULT_MIN_LENGTH_FOR_MULTI_PART_UPLOAD);
        this.lengthPerUploadPart =
                getOrDefault(lengthPerUploadPart, DEFAULT_LENGTH_PER_UPLOAD_PART);
        this.maxPartsForMultipartUpload = MAXIMUM_NUM_ALLOWED_PARTS;
        this.enforceMd5BeforeUpload = getOrDefault(enforceMd5BeforeUpload, false);
        this.enforceMd5BeforeMultipartUpload = getOrDefault(enforceMd5BeforeMultipartUpload, false);
        this.allowMultipartUploads = getOrDefault(allowMultipartUploads, true);
        this.allowParallelUploads = getOrDefault(allowParallelUploads, true);
        this.disableAutoAbort = getOrDefault(disableAutoAbort, false);

        Validate.isTrue(
                this.minimumLengthForMultipartUpload >= 0L,
                String.format(
                        "minimumLengthForMultipartUpload [%s] must be greater than or equal to %s",
                        this.minimumLengthForMultipartUpload,
                        0L));
        Validate.inclusiveBetween(
                MINIMUM_ALLOWED_LENGTH_PER_PART_MB,
                MAXIMUM_ALLOWED_LENGTH_PER_PART_MB,
                this.lengthPerUploadPart,
                String.format(
                        "lengthPerUploadPart [%s] must be between %s-%s (inclusive)",
                        this.lengthPerUploadPart,
                        MINIMUM_ALLOWED_LENGTH_PER_PART_MB,
                        MAXIMUM_ALLOWED_LENGTH_PER_PART_MB));
    }

    public static class UploadConfigurationBuilder {
        /**
         * Sets the enforce MD5 flag for both {@link #enforceMd5BeforeUpload(Boolean)} and
         * {@link #enforceMd5BeforeMultipartUpload(Boolean)} (Boolean)} in a single call.
         * @param enforceMd5 true to enforce MD5 everywhere, false to enforce it nowhere, null to use default values.
         * @return the current builder instance
         */
        public UploadConfigurationBuilder enforceMd5(Boolean enforceMd5) {
            this.enforceMd5BeforeUpload = enforceMd5;
            this.enforceMd5BeforeMultipartUpload = enforceMd5;
            return this;
        }

        /**
         * @deprecated maxPartsForMultipartUpload is no longer configurable and will always be set to
         * {@link #MAXIMUM_NUM_ALLOWED_PARTS}
         */
        @Deprecated
        public UploadConfigurationBuilder maxPartsForMultipartUpload(
                Integer maxPartsForMultipartUpload) {
            LOG.info(
                    "Configuring MaxPartsForMultipartUpload is deprecated and is ignored. "
                            + "Using value of {}",
                    MAXIMUM_NUM_ALLOWED_PARTS);
            return this;
        }

        /**
         * @deprecated use {@link #lengthPerUploadPart(Integer)} instead.
         */
        @Deprecated
        public UploadConfigurationBuilder minimumLengthPerUploadPart(
                Integer minimumLengthPerUploadPart) {
            LOG.info(
                    "MinimumLengthPerUploadPart is deprecated.  Setting lengthPerUploadPart to {} instead",
                    minimumLengthPerUploadPart);
            this.lengthPerUploadPart = minimumLengthPerUploadPart;
            return this;
        }
    }

    private static <T> T getOrDefault(T value, T defaultValue) {
        return (value == null) ? defaultValue : value;
    }
}
