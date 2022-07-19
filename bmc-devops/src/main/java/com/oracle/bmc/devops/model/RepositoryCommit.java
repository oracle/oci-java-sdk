/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Commit object with commit information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RepositoryCommit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryCommit {
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
        "treeId"
    })
    public RepositoryCommit(
            String commitId,
            String commitMessage,
            String authorName,
            String authorEmail,
            String committerName,
            String committerEmail,
            java.util.List<String> parentCommitIds,
            java.util.Date timeCreated,
            String treeId) {
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
         * The time at which commit was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which commit was created.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryCommit build() {
            RepositoryCommit __instance__ =
                    new RepositoryCommit(
                            commitId,
                            commitMessage,
                            authorName,
                            authorEmail,
                            committerName,
                            committerEmail,
                            parentCommitIds,
                            timeCreated,
                            treeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryCommit o) {
            Builder copiedBuilder =
                    commitId(o.getCommitId())
                            .commitMessage(o.getCommitMessage())
                            .authorName(o.getAuthorName())
                            .authorEmail(o.getAuthorEmail())
                            .committerName(o.getCommitterName())
                            .committerEmail(o.getCommitterEmail())
                            .parentCommitIds(o.getParentCommitIds())
                            .timeCreated(o.getTimeCreated())
                            .treeId(o.getTreeId());

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
     * The time at which commit was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which commit was created.
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
        sb.append("RepositoryCommit(");
        sb.append("commitId=").append(String.valueOf(this.commitId));
        sb.append(", commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(", authorName=").append(String.valueOf(this.authorName));
        sb.append(", authorEmail=").append(String.valueOf(this.authorEmail));
        sb.append(", committerName=").append(String.valueOf(this.committerName));
        sb.append(", committerEmail=").append(String.valueOf(this.committerEmail));
        sb.append(", parentCommitIds=").append(String.valueOf(this.parentCommitIds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", treeId=").append(String.valueOf(this.treeId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepositoryCommit)) {
            return false;
        }

        RepositoryCommit other = (RepositoryCommit) o;
        return java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.commitMessage, other.commitMessage)
                && java.util.Objects.equals(this.authorName, other.authorName)
                && java.util.Objects.equals(this.authorEmail, other.authorEmail)
                && java.util.Objects.equals(this.committerName, other.committerName)
                && java.util.Objects.equals(this.committerEmail, other.committerEmail)
                && java.util.Objects.equals(this.parentCommitIds, other.parentCommitIds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.treeId, other.treeId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
