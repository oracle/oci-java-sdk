/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * A rule which must be satisfied for matching pull requests before the pull request can be merged
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApprovalRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApprovalRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "destinationBranch",
        "reviewers",
        "minApprovalsCount"
    })
    public ApprovalRule(
            String name,
            String destinationBranch,
            java.util.List<PrincipalDetails> reviewers,
            Integer minApprovalsCount) {
        super();
        this.name = name;
        this.destinationBranch = destinationBranch;
        this.reviewers = reviewers;
        this.minApprovalsCount = minApprovalsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name which is used to uniquely identify an approval rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name which is used to uniquely identify an approval rule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Branch name where pull requests targeting the branch must satisfy the approval rule. This
         * value being null means the rule applies to all pull requests
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
        private String destinationBranch;

        /**
         * Branch name where pull requests targeting the branch must satisfy the approval rule. This
         * value being null means the rule applies to all pull requests
         *
         * @param destinationBranch the value to set
         * @return this builder
         */
        public Builder destinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
            this.__explicitlySet__.add("destinationBranch");
            return this;
        }
        /**
         * List of users who must provide approvals up to the minApprovalsCount specified in the
         * rule. An empty list means the approvals can come from any user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
        private java.util.List<PrincipalDetails> reviewers;

        /**
         * List of users who must provide approvals up to the minApprovalsCount specified in the
         * rule. An empty list means the approvals can come from any user.
         *
         * @param reviewers the value to set
         * @return this builder
         */
        public Builder reviewers(java.util.List<PrincipalDetails> reviewers) {
            this.reviewers = reviewers;
            this.__explicitlySet__.add("reviewers");
            return this;
        }
        /**
         * Minimum number of approvals which must be provided by the reviewers specified in the list
         * before the rule can be satisfied
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minApprovalsCount")
        private Integer minApprovalsCount;

        /**
         * Minimum number of approvals which must be provided by the reviewers specified in the list
         * before the rule can be satisfied
         *
         * @param minApprovalsCount the value to set
         * @return this builder
         */
        public Builder minApprovalsCount(Integer minApprovalsCount) {
            this.minApprovalsCount = minApprovalsCount;
            this.__explicitlySet__.add("minApprovalsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApprovalRule build() {
            ApprovalRule model =
                    new ApprovalRule(
                            this.name,
                            this.destinationBranch,
                            this.reviewers,
                            this.minApprovalsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApprovalRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("destinationBranch")) {
                this.destinationBranch(model.getDestinationBranch());
            }
            if (model.wasPropertyExplicitlySet("reviewers")) {
                this.reviewers(model.getReviewers());
            }
            if (model.wasPropertyExplicitlySet("minApprovalsCount")) {
                this.minApprovalsCount(model.getMinApprovalsCount());
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

    /** Name which is used to uniquely identify an approval rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name which is used to uniquely identify an approval rule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Branch name where pull requests targeting the branch must satisfy the approval rule. This
     * value being null means the rule applies to all pull requests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
    private final String destinationBranch;

    /**
     * Branch name where pull requests targeting the branch must satisfy the approval rule. This
     * value being null means the rule applies to all pull requests
     *
     * @return the value
     */
    public String getDestinationBranch() {
        return destinationBranch;
    }

    /**
     * List of users who must provide approvals up to the minApprovalsCount specified in the rule.
     * An empty list means the approvals can come from any user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reviewers")
    private final java.util.List<PrincipalDetails> reviewers;

    /**
     * List of users who must provide approvals up to the minApprovalsCount specified in the rule.
     * An empty list means the approvals can come from any user.
     *
     * @return the value
     */
    public java.util.List<PrincipalDetails> getReviewers() {
        return reviewers;
    }

    /**
     * Minimum number of approvals which must be provided by the reviewers specified in the list
     * before the rule can be satisfied
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minApprovalsCount")
    private final Integer minApprovalsCount;

    /**
     * Minimum number of approvals which must be provided by the reviewers specified in the list
     * before the rule can be satisfied
     *
     * @return the value
     */
    public Integer getMinApprovalsCount() {
        return minApprovalsCount;
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
        sb.append("ApprovalRule(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", destinationBranch=").append(String.valueOf(this.destinationBranch));
        sb.append(", reviewers=").append(String.valueOf(this.reviewers));
        sb.append(", minApprovalsCount=").append(String.valueOf(this.minApprovalsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovalRule)) {
            return false;
        }

        ApprovalRule other = (ApprovalRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.destinationBranch, other.destinationBranch)
                && java.util.Objects.equals(this.reviewers, other.reviewers)
                && java.util.Objects.equals(this.minApprovalsCount, other.minApprovalsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBranch == null ? 43 : this.destinationBranch.hashCode());
        result = (result * PRIME) + (this.reviewers == null ? 43 : this.reviewers.hashCode());
        result =
                (result * PRIME)
                        + (this.minApprovalsCount == null ? 43 : this.minApprovalsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
