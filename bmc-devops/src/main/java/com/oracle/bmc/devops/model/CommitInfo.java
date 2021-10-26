/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Commit details that need to be used for the BuildRun
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CommitInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CommitInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryBranch")
        private String repositoryBranch;

        public Builder repositoryBranch(String repositoryBranch) {
            this.repositoryBranch = repositoryBranch;
            this.__explicitlySet__.add("repositoryBranch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitHash")
        private String commitHash;

        public Builder commitHash(String commitHash) {
            this.commitHash = commitHash;
            this.__explicitlySet__.add("commitHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitInfo build() {
            CommitInfo __instance__ = new CommitInfo(repositoryUrl, repositoryBranch, commitHash);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitInfo o) {
            Builder copiedBuilder =
                    repositoryUrl(o.getRepositoryUrl())
                            .repositoryBranch(o.getRepositoryBranch())
                            .commitHash(o.getCommitHash());

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
     * Repository URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    String repositoryUrl;

    /**
     * Name of the repository branch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryBranch")
    String repositoryBranch;

    /**
     * Commit Hash pertinent to the repository URL and Branch specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitHash")
    String commitHash;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}