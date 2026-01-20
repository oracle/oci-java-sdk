/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * list of merge checks. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MergeCheckCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MergeCheckCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "timeValidated"})
    public MergeCheckCollection(java.util.List<MergeCheck> items, java.util.Date timeValidated) {
        super();
        this.items = items;
        this.timeValidated = timeValidated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of pullRequest mergeCheck objects. Example: {"items": [{ "type" : "CONFLICT(ENUM
         * values)", "status" : "FAILED(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)",
         * "ruleName": "rule 1", "status" : "NEEDS_APPROVAL(ENUM values)", "totalApprovalCount":"5",
         * "currentApprovalCount":"1", "reviewers":[<Reviewer OCID>], "level":
         * "PROJECT/REPOSITORY(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)", "ruleName":
         * "rule 2", "status" : "SUCCEEDED(ENUM values)", "totalApprovalCount":"5",
         * "currentApprovalCount":"5", "reviewers":[<Reviewer OCID>], "level":
         * "PROJECT/REPOSITORY(ENUM values)"} , {"type": "BUILD(ENUM VALUE)", "pipelineId":
         * "PipelineOCID", "buildRunId": "BuildRunOCID", "status" :
         * "SUCCEEDED/PENDING/FAIlED/IN-PROGRESS(ENUM values)"} ]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<MergeCheck> items;

        /**
         * List of pullRequest mergeCheck objects. Example: {"items": [{ "type" : "CONFLICT(ENUM
         * values)", "status" : "FAILED(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)",
         * "ruleName": "rule 1", "status" : "NEEDS_APPROVAL(ENUM values)", "totalApprovalCount":"5",
         * "currentApprovalCount":"1", "reviewers":[<Reviewer OCID>], "level":
         * "PROJECT/REPOSITORY(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)", "ruleName":
         * "rule 2", "status" : "SUCCEEDED(ENUM values)", "totalApprovalCount":"5",
         * "currentApprovalCount":"5", "reviewers":[<Reviewer OCID>], "level":
         * "PROJECT/REPOSITORY(ENUM values)"} , {"type": "BUILD(ENUM VALUE)", "pipelineId":
         * "PipelineOCID", "buildRunId": "BuildRunOCID", "status" :
         * "SUCCEEDED/PENDING/FAIlED/IN-PROGRESS(ENUM values)"} ]}
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<MergeCheck> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** The time Stamp of the validation check. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
        private java.util.Date timeValidated;

        /**
         * The time Stamp of the validation check.
         *
         * @param timeValidated the value to set
         * @return this builder
         */
        public Builder timeValidated(java.util.Date timeValidated) {
            this.timeValidated = timeValidated;
            this.__explicitlySet__.add("timeValidated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MergeCheckCollection build() {
            MergeCheckCollection model = new MergeCheckCollection(this.items, this.timeValidated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MergeCheckCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("timeValidated")) {
                this.timeValidated(model.getTimeValidated());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * List of pullRequest mergeCheck objects. Example: {"items": [{ "type" : "CONFLICT(ENUM
     * values)", "status" : "FAILED(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)",
     * "ruleName": "rule 1", "status" : "NEEDS_APPROVAL(ENUM values)", "totalApprovalCount":"5",
     * "currentApprovalCount":"1", "reviewers":[<Reviewer OCID>], "level": "PROJECT/REPOSITORY(ENUM
     * values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)", "ruleName": "rule 2", "status" :
     * "SUCCEEDED(ENUM values)", "totalApprovalCount":"5", "currentApprovalCount":"5",
     * "reviewers":[<Reviewer OCID>], "level": "PROJECT/REPOSITORY(ENUM values)"} , {"type":
     * "BUILD(ENUM VALUE)", "pipelineId": "PipelineOCID", "buildRunId": "BuildRunOCID", "status" :
     * "SUCCEEDED/PENDING/FAIlED/IN-PROGRESS(ENUM values)"} ]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<MergeCheck> items;

    /**
     * List of pullRequest mergeCheck objects. Example: {"items": [{ "type" : "CONFLICT(ENUM
     * values)", "status" : "FAILED(ENUM values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)",
     * "ruleName": "rule 1", "status" : "NEEDS_APPROVAL(ENUM values)", "totalApprovalCount":"5",
     * "currentApprovalCount":"1", "reviewers":[<Reviewer OCID>], "level": "PROJECT/REPOSITORY(ENUM
     * values)"}, {"type": "APPROVAL_RULE(ENUM VALUE)", "ruleName": "rule 2", "status" :
     * "SUCCEEDED(ENUM values)", "totalApprovalCount":"5", "currentApprovalCount":"5",
     * "reviewers":[<Reviewer OCID>], "level": "PROJECT/REPOSITORY(ENUM values)"} , {"type":
     * "BUILD(ENUM VALUE)", "pipelineId": "PipelineOCID", "buildRunId": "BuildRunOCID", "status" :
     * "SUCCEEDED/PENDING/FAIlED/IN-PROGRESS(ENUM values)"} ]}
     *
     * @return the value
     */
    public java.util.List<MergeCheck> getItems() {
        return items;
    }

    /** The time Stamp of the validation check. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
    private final java.util.Date timeValidated;

    /**
     * The time Stamp of the validation check.
     *
     * @return the value
     */
    public java.util.Date getTimeValidated() {
        return timeValidated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MergeCheckCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", timeValidated=").append(String.valueOf(this.timeValidated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MergeCheckCollection)) {
            return false;
        }

        MergeCheckCollection other = (MergeCheckCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.timeValidated, other.timeValidated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidated == null ? 43 : this.timeValidated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
