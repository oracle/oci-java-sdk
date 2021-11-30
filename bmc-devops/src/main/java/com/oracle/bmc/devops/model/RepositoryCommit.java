/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RepositoryCommit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RepositoryCommit {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
        private String commitMessage;

        public Builder commitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            this.__explicitlySet__.add("commitMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorName")
        private String authorName;

        public Builder authorName(String authorName) {
            this.authorName = authorName;
            this.__explicitlySet__.add("authorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
        private String authorEmail;

        public Builder authorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            this.__explicitlySet__.add("authorEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("committerName")
        private String committerName;

        public Builder committerName(String committerName) {
            this.committerName = committerName;
            this.__explicitlySet__.add("committerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("committerEmail")
        private String committerEmail;

        public Builder committerEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            this.__explicitlySet__.add("committerEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentCommitIds")
        private java.util.List<String> parentCommitIds;

        public Builder parentCommitIds(java.util.List<String> parentCommitIds) {
            this.parentCommitIds = parentCommitIds;
            this.__explicitlySet__.add("parentCommitIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("treeId")
        private String treeId;

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

    /**
     * Commit hash pointed to by reference name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    String commitId;

    /**
     * The commit message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    String commitMessage;

    /**
     * Name of the author of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorName")
    String authorName;

    /**
     * Email of the author of the repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
    String authorEmail;

    /**
     * Name of who creates the commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committerName")
    String committerName;

    /**
     * Email of who creates the commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("committerEmail")
    String committerEmail;

    /**
     * An array of parent commit IDs of created commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCommitIds")
    java.util.List<String> parentCommitIds;

    /**
     * The time at which commit was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Tree information for the specified commit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("treeId")
    String treeId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
