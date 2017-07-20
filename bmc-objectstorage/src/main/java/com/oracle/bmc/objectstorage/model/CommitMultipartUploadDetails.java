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
    builder = CommitMultipartUploadDetails.Builder.class
)
public class CommitMultipartUploadDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
        private java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

        @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
        private java.util.List<Integer> partsToExclude;

        public CommitMultipartUploadDetails build() {
            return new CommitMultipartUploadDetails(partsToCommit, partsToExclude);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

    /**
     * The part numbers for the parts to be excluded from the completed object.
     * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
    java.util.List<Integer> partsToExclude;
}
