/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CommitMultipartUploadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CommitMultipartUploadDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
        private java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

        public Builder partsToCommit(
                java.util.List<CommitMultipartUploadPartDetails> partsToCommit) {
            this.partsToCommit = partsToCommit;
            this.__explicitlySet__.add("partsToCommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
        private java.util.List<Integer> partsToExclude;

        public Builder partsToExclude(java.util.List<Integer> partsToExclude) {
            this.partsToExclude = partsToExclude;
            this.__explicitlySet__.add("partsToExclude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitMultipartUploadDetails build() {
            CommitMultipartUploadDetails __instance__ =
                    new CommitMultipartUploadDetails(partsToCommit, partsToExclude);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitMultipartUploadDetails o) {
            Builder copiedBuilder =
                    partsToCommit(o.getPartsToCommit()).partsToExclude(o.getPartsToExclude());

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
     * The part numbers and ETags for the parts to be committed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partsToCommit")
    java.util.List<CommitMultipartUploadPartDetails> partsToCommit;

    /**
     * The part numbers for the parts to be excluded from the completed object.
     * Each part created for this upload must be in either partsToExclude or partsToCommit, but cannot be in both.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partsToExclude")
    java.util.List<Integer> partsToExclude;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
