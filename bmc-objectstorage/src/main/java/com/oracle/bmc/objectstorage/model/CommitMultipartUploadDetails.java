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
@JsonDeserialize(builder = CommitMultipartUploadDetails.Builder.class)
public class CommitMultipartUploadDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("partsToCommit")
        private List<CommitMultipartUploadPartDetails> partsToCommit;

        @JsonProperty("partsToExclude")
        private List<Integer> partsToExclude;

        public CommitMultipartUploadDetails build() {
            return new CommitMultipartUploadDetails(partsToCommit, partsToExclude);
        }

        @JsonIgnore
        public Builder copy(CommitMultipartUploadDetails o) {
            return partsToCommit(o.getPartsToCommit()).partsToExclude(o.getPartsToExclude());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The part numbers and ETags for the parts to be committed.
     **/
    @JsonProperty("partsToCommit")
    @Valid
    @NotNull
    List<CommitMultipartUploadPartDetails> partsToCommit;

    /**
     * The part numbers for the parts to be excluded from the completed object.
     * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
     *
     **/
    @JsonProperty("partsToExclude")
    List<Integer> partsToExclude;
}
