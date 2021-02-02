/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Multipart uploads provide efficient and resilient uploads, especially for large objects. Multipart uploads also accommodate
 * objects that are too large for a single upload operation. With multipart uploads, individual parts of an object can be
 * uploaded in parallel to reduce the amount of time you spend uploading. Multipart uploads can also minimize the impact
 * of network failures by letting you retry a failed part upload instead of requiring you to retry an entire object upload.
 * See [Using Multipart Uploads](https://docs.cloud.oracle.com/Content/Object/Tasks/usingmultipartuploads.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MultipartUpload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MultipartUpload {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
        private String uploadId;

        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            this.__explicitlySet__.add("uploadId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipartUpload build() {
            MultipartUpload __instance__ =
                    new MultipartUpload(
                            namespace, bucket, object, uploadId, timeCreated, storageTier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipartUpload o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .bucket(o.getBucket())
                            .object(o.getObject())
                            .uploadId(o.getUploadId())
                            .timeCreated(o.getTimeCreated())
                            .storageTier(o.getStorageTier());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Object Storage namespace in which the in-progress multipart upload is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The bucket in which the in-progress multipart upload is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    String bucket;

    /**
     * The object name of the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    String object;

    /**
     * The unique identifier for the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
    String uploadId;

    /**
     * The date and time the upload was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The storage tier that the object is stored in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    StorageTier storageTier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
