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
@JsonDeserialize(builder = CommitMultipartUploadPartDetails.Builder.class)
public class CommitMultipartUploadPartDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("partNum")
        private Integer partNum;

        @JsonProperty("etag")
        private String etag;

        public CommitMultipartUploadPartDetails build() {
            return new CommitMultipartUploadPartDetails(partNum, etag);
        }

        @JsonIgnore
        public Builder copy(CommitMultipartUploadPartDetails o) {
            return partNum(o.getPartNum()).etag(o.getEtag());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The part number for this part.
     **/
    @JsonProperty("partNum")
    @Valid
    @NotNull
    Integer partNum;

    /**
     * The ETag returned when this part was uploaded.
     **/
    @JsonProperty("etag")
    @Valid
    @NotNull
    String etag;
}
