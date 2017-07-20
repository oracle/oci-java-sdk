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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MultipartUploadPartSummary.Builder.class
)
public class MultipartUploadPartSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        @com.fasterxml.jackson.annotation.JsonProperty("md5")
        private String md5;

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;

        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private Integer partNumber;

        public MultipartUploadPartSummary build() {
            return new MultipartUploadPartSummary(etag, md5, size, partNumber);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipartUploadPartSummary o) {
            return etag(o.getEtag())
                    .md5(o.getMd5())
                    .size(o.getSize())
                    .partNumber(o.getPartNumber());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * the current entity tag for the part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String etag;

    /**
     * the MD5 hash of the bytes of the part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String md5;

    /**
     * the size of the part in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Long size;

    /**
     * the part number for this part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer partNumber;
}
