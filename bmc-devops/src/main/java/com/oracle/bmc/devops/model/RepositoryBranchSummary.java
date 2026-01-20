/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Branch related information. <br>
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
        builder = RepositoryBranchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "refType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RepositoryBranchSummary extends RepositoryRefSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("refName")
        private String refName;

        public Builder refName(String refName) {
            this.refName = refName;
            this.__explicitlySet__.add("refName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fullRefName")
        private String fullRefName;

        public Builder fullRefName(String fullRefName) {
            this.fullRefName = fullRefName;
            this.__explicitlySet__.add("fullRefName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Commit ID pointed to by the new branch. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * Commit ID pointed to by the new branch.
         *
         * @param commitId the value to set
         * @return this builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /** The author of latest commit */
        @com.fasterxml.jackson.annotation.JsonProperty("latestCommitAuthorName")
        private String latestCommitAuthorName;

        /**
         * The author of latest commit
         *
         * @param latestCommitAuthorName the value to set
         * @return this builder
         */
        public Builder latestCommitAuthorName(String latestCommitAuthorName) {
            this.latestCommitAuthorName = latestCommitAuthorName;
            this.__explicitlySet__.add("latestCommitAuthorName");
            return this;
        }
        /** Up to 5 pull requests associated with this branch. */
        @com.fasterxml.jackson.annotation.JsonProperty("topNPullRequests")
        private java.util.List<PullRequestSummary> topNPullRequests;

        /**
         * Up to 5 pull requests associated with this branch.
         *
         * @param topNPullRequests the value to set
         * @return this builder
         */
        public Builder topNPullRequests(java.util.List<PullRequestSummary> topNPullRequests) {
            this.topNPullRequests = topNPullRequests;
            this.__explicitlySet__.add("topNPullRequests");
            return this;
        }
        /** Counts of pull requests for this branch grouped by their state. */
        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestStateCounts")
        private java.util.Map<String, Integer> pullRequestStateCounts;

        /**
         * Counts of pull requests for this branch grouped by their state.
         *
         * @param pullRequestStateCounts the value to set
         * @return this builder
         */
        public Builder pullRequestStateCounts(
                java.util.Map<String, Integer> pullRequestStateCounts) {
            this.pullRequestStateCounts = pullRequestStateCounts;
            this.__explicitlySet__.add("pullRequestStateCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryBranchSummary build() {
            RepositoryBranchSummary model =
                    new RepositoryBranchSummary(
                            this.refName,
                            this.fullRefName,
                            this.repositoryId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.commitId,
                            this.latestCommitAuthorName,
                            this.topNPullRequests,
                            this.pullRequestStateCounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryBranchSummary model) {
            if (model.wasPropertyExplicitlySet("refName")) {
                this.refName(model.getRefName());
            }
            if (model.wasPropertyExplicitlySet("fullRefName")) {
                this.fullRefName(model.getFullRefName());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
            }
            if (model.wasPropertyExplicitlySet("latestCommitAuthorName")) {
                this.latestCommitAuthorName(model.getLatestCommitAuthorName());
            }
            if (model.wasPropertyExplicitlySet("topNPullRequests")) {
                this.topNPullRequests(model.getTopNPullRequests());
            }
            if (model.wasPropertyExplicitlySet("pullRequestStateCounts")) {
                this.pullRequestStateCounts(model.getPullRequestStateCounts());
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

    @Deprecated
    public RepositoryBranchSummary(
            String refName,
            String fullRefName,
            String repositoryId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String commitId,
            String latestCommitAuthorName,
            java.util.List<PullRequestSummary> topNPullRequests,
            java.util.Map<String, Integer> pullRequestStateCounts) {
        super(
                refName,
                fullRefName,
                repositoryId,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags,
                systemTags);
        this.commitId = commitId;
        this.latestCommitAuthorName = latestCommitAuthorName;
        this.topNPullRequests = topNPullRequests;
        this.pullRequestStateCounts = pullRequestStateCounts;
    }

    /** Commit ID pointed to by the new branch. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * Commit ID pointed to by the new branch.
     *
     * @return the value
     */
    public String getCommitId() {
        return commitId;
    }

    /** The author of latest commit */
    @com.fasterxml.jackson.annotation.JsonProperty("latestCommitAuthorName")
    private final String latestCommitAuthorName;

    /**
     * The author of latest commit
     *
     * @return the value
     */
    public String getLatestCommitAuthorName() {
        return latestCommitAuthorName;
    }

    /** Up to 5 pull requests associated with this branch. */
    @com.fasterxml.jackson.annotation.JsonProperty("topNPullRequests")
    private final java.util.List<PullRequestSummary> topNPullRequests;

    /**
     * Up to 5 pull requests associated with this branch.
     *
     * @return the value
     */
    public java.util.List<PullRequestSummary> getTopNPullRequests() {
        return topNPullRequests;
    }

    /** Counts of pull requests for this branch grouped by their state. */
    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestStateCounts")
    private final java.util.Map<String, Integer> pullRequestStateCounts;

    /**
     * Counts of pull requests for this branch grouped by their state.
     *
     * @return the value
     */
    public java.util.Map<String, Integer> getPullRequestStateCounts() {
        return pullRequestStateCounts;
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
        sb.append("RepositoryBranchSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", latestCommitAuthorName=").append(String.valueOf(this.latestCommitAuthorName));
        sb.append(", topNPullRequests=").append(String.valueOf(this.topNPullRequests));
        sb.append(", pullRequestStateCounts=").append(String.valueOf(this.pullRequestStateCounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepositoryBranchSummary)) {
            return false;
        }

        RepositoryBranchSummary other = (RepositoryBranchSummary) o;
        return java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(
                        this.latestCommitAuthorName, other.latestCommitAuthorName)
                && java.util.Objects.equals(this.topNPullRequests, other.topNPullRequests)
                && java.util.Objects.equals(
                        this.pullRequestStateCounts, other.pullRequestStateCounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result =
                (result * PRIME)
                        + (this.latestCommitAuthorName == null
                                ? 43
                                : this.latestCommitAuthorName.hashCode());
        result =
                (result * PRIME)
                        + (this.topNPullRequests == null ? 43 : this.topNPullRequests.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestStateCounts == null
                                ? 43
                                : this.pullRequestStateCounts.hashCode());
        return result;
    }
}
