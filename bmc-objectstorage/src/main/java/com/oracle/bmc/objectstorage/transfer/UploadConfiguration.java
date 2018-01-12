/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.io.DuplicatableInputStream;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UploadConfiguration {
    private static final int MAX_PARTS_IN_MULTI_PART_UPLOAD = 10000;
    private static final int MIN_LENGTH_FOR_MULTI_PART_UPLOAD = 128;
    private static final int MIN_LENGTH_PER_UPLOAD_PART = 128;

    /**
     * Minimum length in MiB before an upload is performed using multi-part upload, default 128.
     */
    private final long minimumLengthForMultipartUpload;
    /**
     * Minimum length in MiB for each part of a multi-part upload (except the last), default 128.
     */
    private final long minimumLengthPerUploadPart;
    /**
     * Maximum number of parts to split an upload into, default 10000 (max allowable parts by Object Storage Service).
     */
    private final int maxPartsForMultipartUpload;
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

    // Explicit @Builder on constructor so we can enforce default values.
    @Builder
    private UploadConfiguration(
            Integer minimumLengthForMultipartUpload,
            Integer minimumLengthPerUploadPart,
            Integer maxPartsForMultipartUpload,
            Boolean enforceMd5BeforeUpload,
            Boolean enforceMd5BeforeMultipartUpload,
            Boolean allowMultipartUploads,
            Boolean allowParallelUploads,
            Boolean disableAutoAbort) {
        this.minimumLengthForMultipartUpload =
                getOrDefault(minimumLengthForMultipartUpload, MIN_LENGTH_FOR_MULTI_PART_UPLOAD);
        this.minimumLengthPerUploadPart =
                getOrDefault(minimumLengthPerUploadPart, MIN_LENGTH_PER_UPLOAD_PART);
        this.maxPartsForMultipartUpload =
                getOrDefault(maxPartsForMultipartUpload, MAX_PARTS_IN_MULTI_PART_UPLOAD);
        this.enforceMd5BeforeUpload = getOrDefault(enforceMd5BeforeUpload, false);
        this.enforceMd5BeforeMultipartUpload = getOrDefault(enforceMd5BeforeMultipartUpload, false);
        this.allowMultipartUploads = getOrDefault(allowMultipartUploads, true);
        this.allowParallelUploads = getOrDefault(allowParallelUploads, true);
        this.disableAutoAbort = getOrDefault(disableAutoAbort, false);
    }

    public static class UploadConfigurationBuilder {
        /**
         * Sets the enforce MD5 flag for both {@link #enforceMd5OnUpload(Boolean)} and {@link #enforceMd5OnMultipartUploadParts(Boolean)}
         * in a single call.
         * @param enforceMd5 true to enforce MD5 everywhere, false to enforce it nowhere, null to use default values.
         * @return the current builder instance
         */
        public UploadConfigurationBuilder enforceMd5(Boolean enforceMd5) {
            this.enforceMd5BeforeUpload = enforceMd5;
            this.enforceMd5BeforeMultipartUpload = enforceMd5;
            return this;
        }
    }

    private static <T> T getOrDefault(T value, T defaultValue) {
        return (value == null) ? defaultValue : value;
    }
}
