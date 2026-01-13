/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.http.client.io.DuplicatableInputStream;

import com.oracle.bmc.objectstorage.model.ChecksumAlgorithm;
import com.oracle.bmc.util.internal.Validate;

/**
 * The configuration for the {@code UploadManager}. For more information, please refer to the online
 * documentation found <a
 * href="https://docs.oracle.com/iaas/Content/Object/Tasks/usingmultipartuploads.htm">here</a>.
 */
public class UploadConfiguration {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(UploadConfiguration.class);
    /*
     * Max supported sizes are specified @
     * https://docs.oracle.com/iaas/Content/Object/Tasks/usingmultipartuploads.htm
     */
    public static final int MAXIMUM_NUM_ALLOWED_PARTS = 10000;
    public static final long MINIMUM_ALLOWED_LENGTH_PER_PART_MB = 1L; // 1 MiB
    public static final long MAXIMUM_ALLOWED_LENGTH_PER_PART_MB = 50L * 1024L; // 50 GiB

    private static final int DEFAULT_MIN_LENGTH_FOR_MULTI_PART_UPLOAD = 128;
    private static final int DEFAULT_LENGTH_PER_UPLOAD_PART = 128;

    /**
     * Minimum length in MiB before an upload is performed using multi-part upload, default 128.
     *
     * <p>Note: Accepted values: 0 - 51200. Using a large value is not recommended.
     */
    private final long minimumLengthForMultipartUpload;
    /**
     * Length in MiB for each part of a multi-part upload (except the last), default 128.
     *
     * <p>Accepted values: 1 - 51200. Using a large value is not recommended.
     */
    private final long lengthPerUploadPart;
    /**
     * Maximum number of parts to split an upload into, default 10,000 (max allowable parts by
     * Object Storage Service).
     *
     * <p>Note: Accepted values: 1 - 10000
     *
     * @deprecated no longer configurable as maxPartsForMultipartUpload is always configured as the
     *     default of 10,000. Use {@link #MAXIMUM_NUM_ALLOWED_PARTS instead}
     */
    @Deprecated private final int maxPartsForMultipartUpload;
    /**
     * Flag to indicate that MD5 should be set on every PutObject call. If not provided, the SDK
     * will calculate it before uploading the object. Default is false.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the stream
     * cannot be duplicated, ie does not implement {@link DuplicatableInputStream}, as the entire
     * stream will have to be read into memory.
     */
    private final boolean enforceMd5BeforeUpload;
    /**
     * Flag to indicate that MD5 should be set on every part of a multi-part upload. The SDK will
     * calculate the MD5 before uploading for each part it creates. Default is false.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the source
     * stream for the part cannot be duplicated, ie does not implement {@link
     * DuplicatableInputStream}, as the entire part will have to be read into memory.
     */
    private final boolean enforceMd5BeforeMultipartUpload;

    /**
     * Flag to indicate that additional checksum should be set on every PutObject call. If not
     * provided, the SDK will calculate it before uploading the object. Default is null.
     *
     * <p>Note: Valid values are {@link ChecksumAlgorithm#Crc32C}, {@link ChecksumAlgorithm#Sha256},
     * {@link ChecksumAlgorithm#Sha384}.
     *
     * <p>Note: If {@link #additionalChecksumAlgorithm} is provided, this value must match it.
     *
     * <p>When this value is set, the SDK will set the corresponding header:
     *
     * <ul>
     *   <li>{@code opc-content-crc32c} if the value is "Crc32C"
     *   <li>{@code opc-content-sha256} if the value is "Sha256"
     *   <li>{@code opc-content-sha384} if the value is "Sha384"
     * </ul>
     *
     * <p>If {@link #additionalChecksumAlgorithm} has a matching value or is null, the header {@code
     * opc-checksum-algorithm} will also be set.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the source
     * stream for the part cannot be duplicated, i.e., does not implement {@link
     * DuplicatableInputStream}, as the entire part will have to be read into memory.
     */
    private final ChecksumAlgorithm enforceAdditionalChecksumBeforeUpload;

    /**
     * Flag to indicate that additional checksum should be set on every part of a multi-part upload.
     * The SDK will calculate the additional checksum before uploading for each part it creates.
     * Default is null.
     *
     * <p>Note: Valid values are {@link ChecksumAlgorithm#Crc32C}, {@link ChecksumAlgorithm#Sha256},
     * {@link ChecksumAlgorithm#Sha384}.
     *
     * <p>Note: If {@link #additionalChecksumAlgorithm} is provided, this value must match it.
     *
     * <p>When this value is set, the SDK will set the corresponding header:
     *
     * <ul>
     *   <li>{@code opc-content-crc32c} if the value is "Crc32C"
     *   <li>{@code opc-content-sha256} if the value is "Sha256"
     *   <li>{@code opc-content-sha384} if the value is "Sha384"
     * </ul>
     *
     * <p>If {@link #additionalChecksumAlgorithm} has a matching value or is null, the header {@code
     * opc-checksum-algorithm} will also be set.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the source
     * stream for the part cannot be duplicated, i.e., does not implement {@link
     * DuplicatableInputStream}, as the entire part will have to be read into memory.
     */
    private final ChecksumAlgorithm enforceAdditionalChecksumBeforeMultipartUpload;

    /** Flag to indicate that multi-part uploads can be used. Default is true. */
    private final boolean allowMultipartUploads;
    /**
     * Flag to indicate that multi-part uploads can upload individual parts in parallel if possible.
     * Default is true.
     */
    private final boolean allowParallelUploads;
    /**
     * Flag to indicate that uploads that fail should not be automatically aborted (client is
     * reponsible for always cleaning up failed uploads themselves). Default is false.
     */
    private final boolean disableAutoAbort;
    /**
     * The value of the additional checksum algorithm to be used for data integrity checks. Default
     * is null.
     *
     * <p>Note: Valid values are {@link ChecksumAlgorithm#Crc32C}, {@link ChecksumAlgorithm#Sha256},
     * {@link ChecksumAlgorithm#Sha384}.
     *
     * <p>Note: If provided, {@link #enforceAdditionalChecksumBeforeUpload} and {@link
     * #enforceAdditionalChecksumBeforeMultipartUpload} must match this value.
     *
     * <p>When this value is provided, the additional checksum algorithm will be set for both single
     * PutObject requests and each part of a multipart upload. Specifically, the header
     * `opc-checksum-algorithm` will be set to the value of this algorithm.
     */
    private final ChecksumAlgorithm additionalChecksumAlgorithm;

    @Deprecated
    public long getMinimumLengthPerUploadPart() {
        return lengthPerUploadPart;
    }

    // Explicit @Builder on constructor so we can enforce default values.
    private UploadConfiguration(
            Integer minimumLengthForMultipartUpload,
            Integer lengthPerUploadPart,
            Boolean enforceMd5BeforeUpload,
            Boolean enforceMd5BeforeMultipartUpload,
            ChecksumAlgorithm enforceAdditionalChecksumBeforeUpload,
            ChecksumAlgorithm enforceAdditionalChecksumBeforeMultipartUpload,
            Boolean allowMultipartUploads,
            Boolean allowParallelUploads,
            Boolean disableAutoAbort,
            ChecksumAlgorithm additionalChecksumAlgorithm) {
        this.minimumLengthForMultipartUpload =
                getOrDefault(
                        minimumLengthForMultipartUpload, DEFAULT_MIN_LENGTH_FOR_MULTI_PART_UPLOAD);
        this.lengthPerUploadPart =
                getOrDefault(lengthPerUploadPart, DEFAULT_LENGTH_PER_UPLOAD_PART);
        this.maxPartsForMultipartUpload = MAXIMUM_NUM_ALLOWED_PARTS;
        this.enforceMd5BeforeUpload = getOrDefault(enforceMd5BeforeUpload, false);
        this.enforceMd5BeforeMultipartUpload = getOrDefault(enforceMd5BeforeMultipartUpload, false);
        this.enforceAdditionalChecksumBeforeUpload =
                getOrDefault(enforceAdditionalChecksumBeforeUpload, null);
        this.enforceAdditionalChecksumBeforeMultipartUpload =
                getOrDefault(enforceAdditionalChecksumBeforeMultipartUpload, null);
        this.allowMultipartUploads = getOrDefault(allowMultipartUploads, true);
        this.allowParallelUploads = getOrDefault(allowParallelUploads, true);
        this.disableAutoAbort = getOrDefault(disableAutoAbort, false);
        this.additionalChecksumAlgorithm = getOrDefault(additionalChecksumAlgorithm, null);

        Validate.isTrue(
                this.minimumLengthForMultipartUpload >= 0L,
                String.format(
                        "minimumLengthForMultipartUpload [%s] must be greater than or equal to %s",
                        this.minimumLengthForMultipartUpload, 0L));
        Validate.inclusiveBetween(
                MINIMUM_ALLOWED_LENGTH_PER_PART_MB,
                MAXIMUM_ALLOWED_LENGTH_PER_PART_MB,
                this.lengthPerUploadPart,
                String.format(
                        "lengthPerUploadPart [%s] must be between %s-%s (inclusive)",
                        this.lengthPerUploadPart,
                        MINIMUM_ALLOWED_LENGTH_PER_PART_MB,
                        MAXIMUM_ALLOWED_LENGTH_PER_PART_MB));
        Validate.isTrue(
                this.enforceAdditionalChecksumBeforeUpload == null
                        || this.enforceAdditionalChecksumBeforeUpload == ChecksumAlgorithm.Sha256
                        || this.enforceAdditionalChecksumBeforeUpload == ChecksumAlgorithm.Sha384
                        || this.enforceAdditionalChecksumBeforeUpload == ChecksumAlgorithm.Crc32C,
                "Invalid value for enforceAdditionalChecksumBeforeUpload. Valid values are: SHA256, SHA384, CRC32C.");
        Validate.isTrue(
                this.enforceAdditionalChecksumBeforeMultipartUpload == null
                        || this.enforceAdditionalChecksumBeforeMultipartUpload
                                == ChecksumAlgorithm.Sha256
                        || this.enforceAdditionalChecksumBeforeMultipartUpload
                                == ChecksumAlgorithm.Sha384
                        || this.enforceAdditionalChecksumBeforeMultipartUpload
                                == ChecksumAlgorithm.Crc32C,
                "Invalid value for enforceAdditionalChecksumBeforeMultipartUpload. Valid values are: SHA256, SHA384, CRC32C.");
    }

    public static class UploadConfigurationBuilder {
        private Integer minimumLengthForMultipartUpload;
        private Integer lengthPerUploadPart;
        private Boolean enforceMd5BeforeUpload;
        private Boolean enforceMd5BeforeMultipartUpload;
        private ChecksumAlgorithm enforceAdditionalChecksumBeforeUpload;
        private ChecksumAlgorithm enforceAdditionalChecksumBeforeMultipartUpload;
        private Boolean allowMultipartUploads;
        private Boolean allowParallelUploads;
        private Boolean disableAutoAbort;
        private ChecksumAlgorithm additionalChecksumAlgorithm;

        /**
         * Sets the enforce MD5 flag for both {@link #enforceMd5BeforeUpload(Boolean)} and {@link
         * #enforceMd5BeforeMultipartUpload(Boolean)} (Boolean)} in a single call.
         *
         * @param enforceMd5 true to enforce MD5 everywhere, false to enforce it nowhere, null to
         *     use default values.
         * @return the current builder instance
         */
        public UploadConfigurationBuilder enforceMd5(Boolean enforceMd5) {
            this.enforceMd5BeforeUpload = enforceMd5;
            this.enforceMd5BeforeMultipartUpload = enforceMd5;
            return this;
        }

        /**
         * Sets the enforce additional checksum flag for both {@link
         * #enforceAdditionalChecksumBeforeUpload(ChecksumAlgorithm)} and {@link
         * #enforceAdditionalChecksumBeforeMultipartUpload(ChecksumAlgorithm)} in a single call.
         *
         * @param enforceAdditionalChecksum the additional checksum algorithm to enforce everywhere,
         *     null to use default values.
         * @return the current builder instance
         */
        public UploadConfigurationBuilder enforceAdditionalChecksum(
                ChecksumAlgorithm enforceAdditionalChecksum) {
            this.enforceAdditionalChecksumBeforeUpload = enforceAdditionalChecksum;
            this.enforceAdditionalChecksumBeforeMultipartUpload = enforceAdditionalChecksum;
            return this;
        }

        /**
         * @deprecated maxPartsForMultipartUpload is no longer configurable and will always be set
         *     to {@link #MAXIMUM_NUM_ALLOWED_PARTS}
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

        /** @deprecated use {@link #lengthPerUploadPart(Integer)} instead. */
        @Deprecated
        public UploadConfigurationBuilder minimumLengthPerUploadPart(
                Integer minimumLengthPerUploadPart) {
            LOG.info(
                    "MinimumLengthPerUploadPart is deprecated.  Setting lengthPerUploadPart to {} instead",
                    minimumLengthPerUploadPart);
            this.lengthPerUploadPart = minimumLengthPerUploadPart;
            return this;
        }

        UploadConfigurationBuilder() {}

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder minimumLengthForMultipartUpload(
                final Integer minimumLengthForMultipartUpload) {
            this.minimumLengthForMultipartUpload = minimumLengthForMultipartUpload;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder lengthPerUploadPart(
                final Integer lengthPerUploadPart) {
            this.lengthPerUploadPart = lengthPerUploadPart;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder enforceMd5BeforeUpload(
                final Boolean enforceMd5BeforeUpload) {
            this.enforceMd5BeforeUpload = enforceMd5BeforeUpload;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder enforceMd5BeforeMultipartUpload(
                final Boolean enforceMd5BeforeMultipartUpload) {
            this.enforceMd5BeforeMultipartUpload = enforceMd5BeforeMultipartUpload;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder enforceAdditionalChecksumBeforeUpload(
                final ChecksumAlgorithm enforceAdditionalChecksumBeforeUpload) {
            this.enforceAdditionalChecksumBeforeUpload = enforceAdditionalChecksumBeforeUpload;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder
                enforceAdditionalChecksumBeforeMultipartUpload(
                        final ChecksumAlgorithm enforceAdditionalChecksumBeforeMultipartUpload) {
            this.enforceAdditionalChecksumBeforeMultipartUpload =
                    enforceAdditionalChecksumBeforeMultipartUpload;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder allowMultipartUploads(
                final Boolean allowMultipartUploads) {
            this.allowMultipartUploads = allowMultipartUploads;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder allowParallelUploads(
                final Boolean allowParallelUploads) {
            this.allowParallelUploads = allowParallelUploads;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder disableAutoAbort(
                final Boolean disableAutoAbort) {
            this.disableAutoAbort = disableAutoAbort;
            return this;
        }

        /** @return {@code this}. */
        public UploadConfiguration.UploadConfigurationBuilder additionalChecksumAlgorithm(
                final ChecksumAlgorithm additionalChecksumAlgorithm) {
            this.additionalChecksumAlgorithm = additionalChecksumAlgorithm;
            return this;
        }

        public UploadConfiguration build() {
            return new UploadConfiguration(
                    this.minimumLengthForMultipartUpload,
                    this.lengthPerUploadPart,
                    this.enforceMd5BeforeUpload,
                    this.enforceMd5BeforeMultipartUpload,
                    this.enforceAdditionalChecksumBeforeUpload,
                    this.enforceAdditionalChecksumBeforeMultipartUpload,
                    this.allowMultipartUploads,
                    this.allowParallelUploads,
                    this.disableAutoAbort,
                    this.additionalChecksumAlgorithm);
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "UploadConfiguration.UploadConfigurationBuilder(minimumLengthForMultipartUpload="
                    + this.minimumLengthForMultipartUpload
                    + ", lengthPerUploadPart="
                    + this.lengthPerUploadPart
                    + ", enforceMd5BeforeUpload="
                    + this.enforceMd5BeforeUpload
                    + ", enforceMd5BeforeMultipartUpload="
                    + this.enforceMd5BeforeMultipartUpload
                    + ", enforceAdditionalChecksumBeforeUpload="
                    + this.enforceAdditionalChecksumBeforeUpload
                    + ", enforceAdditionalChecksumBeforeMultipartUpload="
                    + this.enforceAdditionalChecksumBeforeMultipartUpload
                    + ", allowMultipartUploads="
                    + this.allowMultipartUploads
                    + ", allowParallelUploads="
                    + this.allowParallelUploads
                    + ", disableAutoAbort="
                    + this.disableAutoAbort
                    + ", additionalChecksumAlgorithm="
                    + this.additionalChecksumAlgorithm
                    + ")";
        }
    }

    private static <T> T getOrDefault(T value, T defaultValue) {
        return (value == null) ? defaultValue : value;
    }

    public static UploadConfiguration.UploadConfigurationBuilder builder() {
        return new UploadConfiguration.UploadConfigurationBuilder();
    }

    /**
     * Minimum length in MiB before an upload is performed using multi-part upload, default 128.
     *
     * <p>Note: Accepted values: 0 - 51200. Using a large value is not recommended.
     */
    public long getMinimumLengthForMultipartUpload() {
        return this.minimumLengthForMultipartUpload;
    }

    /**
     * Length in MiB for each part of a multi-part upload (except the last), default 128.
     *
     * <p>Accepted values: 1 - 51200. Using a large value is not recommended.
     */
    public long getLengthPerUploadPart() {
        return this.lengthPerUploadPart;
    }

    /**
     * Maximum number of parts to split an upload into, default 10,000 (max allowable parts by
     * Object Storage Service).
     *
     * <p>Note: Accepted values: 1 - 10000
     *
     * @deprecated no longer configurable as maxPartsForMultipartUpload is always configured as the
     *     default of 10,000. Use {@link #MAXIMUM_NUM_ALLOWED_PARTS instead}
     */
    @java.lang.Deprecated
    public int getMaxPartsForMultipartUpload() {
        return this.maxPartsForMultipartUpload;
    }

    /**
     * Flag to indicate that MD5 should be set on every PutObject call. If not provided, the SDK
     * will calculate it before uploading the object. Default is false.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the stream
     * cannot be duplicated, ie does not implement {@link DuplicatableInputStream}, as the entire
     * stream will have to be read into memory.
     */
    public boolean isEnforceMd5BeforeUpload() {
        return this.enforceMd5BeforeUpload;
    }

    /**
     * Flag to indicate that MD5 should be set on every part of a multi-part upload. The SDK will
     * calculate the MD5 before uploading for each part it creates. Default is false.
     *
     * <p>Note, having the SDK calculate it could lead to OutOfMemory exceptions if the source
     * stream for the part cannot be duplicated, ie does not implement {@link
     * DuplicatableInputStream}, as the entire part will have to be read into memory.
     */
    public boolean isEnforceMd5BeforeMultipartUpload() {
        return this.enforceMd5BeforeMultipartUpload;
    }

    /**
     * Flag to indicate that additional checksum should be set on every PutObject call. If not
     * provided, the SDK will calculate it before uploading the object. Default is null.
     *
     * <p>Note: Valid values are "SHA256", "SHA384", "CRC32C".
     */
    public ChecksumAlgorithm getEnforceAdditionalChecksumBeforeUpload() {
        return this.enforceAdditionalChecksumBeforeUpload;
    }

    /**
     * Flag to indicate that additional checksum should be set on every part of a multi-part upload.
     * The SDK will calculate the additional checksum before uploading for each part it creates.
     * Default is null.
     *
     * <p>Note: Valid values are "SHA256", "SHA384", "CRC32C".
     */
    public ChecksumAlgorithm getEnforceAdditionalChecksumBeforeMultipartUpload() {
        return this.enforceAdditionalChecksumBeforeMultipartUpload;
    }

    /** Flag to indicate that multi-part uploads can be used. Default is true. */
    public boolean isAllowMultipartUploads() {
        return this.allowMultipartUploads;
    }

    /**
     * Flag to indicate that multi-part uploads can upload individual parts in parallel if possible.
     * Default is true.
     */
    public boolean isAllowParallelUploads() {
        return this.allowParallelUploads;
    }

    /**
     * Flag to indicate that uploads that fail should not be automatically aborted (client is
     * reponsible for always cleaning up failed uploads themselves). Default is false.
     */
    public boolean isDisableAutoAbort() {
        return this.disableAutoAbort;
    }

    /** The value of the additional checksum algorithm. Default is null. */
    public ChecksumAlgorithm getAdditionalChecksumAlgorithm() {
        return this.additionalChecksumAlgorithm;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "UploadConfiguration(minimumLengthForMultipartUpload="
                + this.getMinimumLengthForMultipartUpload()
                + ", lengthPerUploadPart="
                + this.getLengthPerUploadPart()
                + ", maxPartsForMultipartUpload="
                + this.getMaxPartsForMultipartUpload()
                + ", enforceMd5BeforeUpload="
                + this.isEnforceMd5BeforeUpload()
                + ", enforceMd5BeforeMultipartUpload="
                + this.isEnforceMd5BeforeMultipartUpload()
                + ", enforceAdditionalChecksumBeforeUpload="
                + this.getEnforceAdditionalChecksumBeforeUpload()
                + ", enforceAdditionalChecksumBeforeMultipartUpload="
                + this.getEnforceAdditionalChecksumBeforeMultipartUpload()
                + ", allowMultipartUploads="
                + this.isAllowMultipartUploads()
                + ", allowParallelUploads="
                + this.isAllowParallelUploads()
                + ", disableAutoAbort="
                + this.isDisableAutoAbort()
                + ", additionalChecksumAlgorithm="
                + this.getAdditionalChecksumAlgorithm()
                + ")";
    }
}
