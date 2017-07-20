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
public class MultipartUpload {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
        private String uploadId;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public MultipartUpload build() {
            return new MultipartUpload(namespace, bucket, object, uploadId, timeCreated);
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String namespace;

    /**
     * The bucket in which the in-progress multipart upload is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String bucket;

    /**
     * The object name of the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String object;

    /**
     * The unique identifier for the in-progress multipart upload.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String uploadId;

    /**
     * The date and time when the upload was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeCreated;
}
