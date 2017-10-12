/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MultipartUpload.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipartUpload build() {
            MultipartUpload __instance__ =
                    new MultipartUpload(namespace, bucket, object, uploadId, timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipartUpload o) {
            return namespace(o.getNamespace())
                    .bucket(o.getBucket())
                    .object(o.getObject())
                    .uploadId(o.getUploadId())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The namespace in which the in-progress multipart upload is stored.
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
     * The date and time when the upload was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
