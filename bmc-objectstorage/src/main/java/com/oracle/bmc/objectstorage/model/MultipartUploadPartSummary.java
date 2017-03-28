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
@JsonDeserialize(builder = MultipartUploadPartSummary.Builder.class)
public class MultipartUploadPartSummary {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("etag")
        private String etag;

        @JsonProperty("md5")
        private String md5;

        @JsonProperty("size")
        private Long size;

        @JsonProperty("partNumber")
        private Integer partNumber;

        public MultipartUploadPartSummary build() {
            return new MultipartUploadPartSummary(etag, md5, size, partNumber);
        }

        @JsonIgnore
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
    @JsonProperty("etag")
    @Valid
    @NotNull
    String etag;

    /**
     * the MD5 hash of the bytes of the part.
     **/
    @JsonProperty("md5")
    @Valid
    @NotNull
    String md5;

    /**
     * the size of the part in bytes.
     **/
    @JsonProperty("size")
    @Valid
    @NotNull
    Long size;

    /**
     * the part number for this part.
     **/
    @JsonProperty("partNumber")
    @Valid
    @NotNull
    Integer partNumber;
}
