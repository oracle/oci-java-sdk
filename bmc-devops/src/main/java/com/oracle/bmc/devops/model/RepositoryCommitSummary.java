/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Commit summary with commit information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RepositoryCommitSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryCommitSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commitId",
        "commitMessage",
        "authorName",
        "authorEmail",
        "committerName",
        "committerEmail",
        "parentCommitIds",
        "timeCreated",
        "treeId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RepositoryCommitSummary(
            String commitId,
            String commitMessage,
            String authorName,
            String authorEmail,
            String committerName,
            String committerEmail,
            java.util.List<String> parentCommitIds,
            java.util.Date timeCreated,
            String treeId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.commitId = commitId;
        this.commitMessage = commitMessage;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.committerName = committerName;
        this.committerEmail = committerEmail;
        this.parentCommitIds = parentCommitIds;
        this.timeCreated = timeCreated;
        this.treeId = treeId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Commit hash pointed to by reference name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * Commit hash pointed to by reference name.
         * @param commitId the value to set
         * @return this builder
         **/
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /**
         * The commit message.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
        private String commitMessage;

        /**
         * The commit message.
         * @param commitMessage the value to set
         * @return this builder
         **/
        public Builder commitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            this.__explicitlySet__.add("commitMessage");
            return this;
        }
        /**
         * Name of the author of the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorName")
        private String authorName;

        /**
         * Name of the author of the repository.
         * @param authorName the value to set
         * @return this builder
         **/
        public Builder authorName(String authorName) {
            this.authorName = authorName;
            this.__explicitlySet__.add("authorName");
            return this;
        }
        /**
         * Email of the author of the repository.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
        private String authorEmail;

        /**
         * Email of the author of the repository.
         * @param authorEmail the value to set
         * @return this builder
         **/
        public Builder authorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            this.__explicitlySet__.add("authorEmail");
            return this;
        }
        /**
         * Name of who creates the commit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("committerName")
        private String committerName;

        /**
         * Name of who creates the commit.
         * @param committerName the value to set
         * @return this builder
         **/
        public Builder committerName(String committerName) {
            this.committerName = committerName;
            this.__explicitlySet__.add("committerName");
            return this;
        }
        /**
         * Email of who creates the commit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("committerEmail")
        private String committerEmail;

        /**
         * Email of who creates the commit.
         * @param committerEmail the value to set
         * @return this builder
         **/
        public Builder committerEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            this.__explicitlySet__.add("committerEmail");
            return this;
        }
        /**
         * An array of parent commit IDs of created commit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentCommitIds")
        private java.util.List<String> parentCommitIds;

        /**
         * An array of parent commit IDs of created commit.
         * @param parentCommitIds the value to set
         * @return this builder
         **/
        public Builder parentCommitIds(java.util.List<String> parentCommitIds) {
            this.parentCommitIds = parentCommitIds;
            this.__explicitlySet__.add("parentCommitIds");
            return this;
        }
        /**
         * The time to create the commit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time to create the commit.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Tree information for the specified commit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("treeId")
        private String treeId;

        /**
         * Tree information for the specified commit.
         * @param treeId the value to set
         * @return this builder
         **/
        public Builder treeId(String treeId) {
            this.treeId = treeId;
            this.__explicitlySet__.add("treeId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryCommitSummary build() {
            RepositoryCommitSummary model =
                    new RepositoryCommitSummary(
                            this.commitId,
                            this.commitMessage,
                            this.authorName,
                            this.authorEmail,
                            this.committerName,
                            this.committerEmail,
                            this.parentCommitIds,
                            this.timeCreated,
                            this.treeId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryCommitSummary model) {
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
            }
            if (model.wasPropertyExplicitlySet("commitMessage")) {
                this.commitMessage(model.getCommitMessage());
            }
            if (model.wasPropertyExplicitlySet("authorName")) {
                this.authorName(model.getAuthorName());
            }
            if (model.wasPropertyExplicitlySet("authorEmail")) {
                this.authorEmail(model.getAuthorEmail());
            }
            if (model.wasPropertyExplicitlySet("committerName")) {
                this.committerName(model.getCommitterName());
            }
            if (model.wasPropertyExplicitlySet("committerEmail")) {
                this.committerEmail(model.getCommitterEmail());
            }
            if (model.wasPropertyExplicitlySet("parentCommitIds")) {
                this.parentCommitIds(model.getParentCommitIds());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("treeId")) {
                this.treeId(model.getTreeId());
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
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Commit hash pointed to by reference name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * Commit hash pointed to by reference name.
     * @return the value
     **/
    public String getCommitId() {
        return commitId;
    }

    /**
     * The commit message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    private final String commitMessage;

    /**
     * The commit message.
     * @return the value
     **/
    public String getCommitMessage() {
        return commitMessage;
    }

    /**
     * Name of the author of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorName")
    private final String authorName;

    /**
     * Name of the author of the repository.
     * @return the value
     **/
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Email of the author of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
    private final String authorEmail;

    /**
     * Email of the author of the repository.
     * @return the value
     **/
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     * Name of who creates the commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committerName")
    private final String committerName;

    /**
     * Name of who creates the commit.
     * @return the value
     **/
    public String getCommitterName() {
        return committerName;
    }

    /**
     * Email of who creates the commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committerEmail")
    private final String committerEmail;

    /**
     * Email of who creates the commit.
     * @return the value
     **/
    public String getCommitterEmail() {
        return committerEmail;
    }

    /**
     * An array of parent commit IDs of created commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCommitIds")
    private final java.util.List<String> parentCommitIds;

    /**
     * An array of parent commit IDs of created commit.
     * @return the value
     **/
    public java.util.List<String> getParentCommitIds() {
        return parentCommitIds;
    }

    /**
     * The time to create the commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time to create the commit.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Tree information for the specified commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("treeId")
    private final String treeId;

    /**
     * Tree information for the specified commit.
     * @return the value
     **/
    public String getTreeId() {
        return treeId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"bar-key": "value"}}
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. See [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RepositoryCommitSummary(");
        sb.append("super=").append(super.toString());
        sb.append("commitId=").append(String.valueOf(this.commitId));
        sb.append(", commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(", authorName=").append(String.valueOf(this.authorName));
        sb.append(", authorEmail=").append(String.valueOf(this.authorEmail));
        sb.append(", committerName=").append(String.valueOf(this.committerName));
        sb.append(", committerEmail=").append(String.valueOf(this.committerEmail));
        sb.append(", parentCommitIds=").append(String.valueOf(this.parentCommitIds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", treeId=").append(String.valueOf(this.treeId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepositoryCommitSummary)) {
            return false;
        }

        RepositoryCommitSummary other = (RepositoryCommitSummary) o;
        return java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.commitMessage, other.commitMessage)
                && java.util.Objects.equals(this.authorName, other.authorName)
                && java.util.Objects.equals(this.authorEmail, other.authorEmail)
                && java.util.Objects.equals(this.committerName, other.committerName)
                && java.util.Objects.equals(this.committerEmail, other.committerEmail)
                && java.util.Objects.equals(this.parentCommitIds, other.parentCommitIds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.treeId, other.treeId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result =
                (result * PRIME)
                        + (this.commitMessage == null ? 43 : this.commitMessage.hashCode());
        result = (result * PRIME) + (this.authorName == null ? 43 : this.authorName.hashCode());
        result = (result * PRIME) + (this.authorEmail == null ? 43 : this.authorEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.committerName == null ? 43 : this.committerName.hashCode());
        result =
                (result * PRIME)
                        + (this.committerEmail == null ? 43 : this.committerEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.parentCommitIds == null ? 43 : this.parentCommitIds.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.treeId == null ? 43 : this.treeId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
