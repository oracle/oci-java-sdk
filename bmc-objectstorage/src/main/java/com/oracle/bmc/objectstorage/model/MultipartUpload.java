/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = MultipartUpload.Builder.class)
public class MultipartUpload {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("namespace")
        private String namespace;

        @JsonProperty("bucket")
        private String bucket;

        @JsonProperty("object")
        private String object;

        @JsonProperty("uploadId")
        private String uploadId;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public MultipartUpload build() {
            return new MultipartUpload(namespace, bucket, object, uploadId, timeCreated);
        }

        @JsonIgnore
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
    @JsonProperty("namespace")
    @Valid
    @NotNull
    String namespace;

    /**
     * The bucket in which the in-progress multipart upload is stored.
     **/
    @JsonProperty("bucket")
    @Valid
    @NotNull
    String bucket;

    /**
     * The object name of the in-progress multipart upload.
     **/
    @JsonProperty("object")
    @Valid
    @NotNull
    String object;

    /**
     * The unique identifier for the in-progress multipart upload.
     **/
    @JsonProperty("uploadId")
    @Valid
    @NotNull
    String uploadId;

    /**
     * The date and time when the upload was created.
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
}
