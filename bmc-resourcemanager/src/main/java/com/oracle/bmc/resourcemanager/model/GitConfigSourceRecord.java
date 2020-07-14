/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Metadata about the Git configuration source.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GitConfigSourceRecord.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceRecordType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GitConfigSourceRecord extends ConfigSourceRecord {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
        private String configurationSourceProviderId;

        public Builder configurationSourceProviderId(String configurationSourceProviderId) {
            this.configurationSourceProviderId = configurationSourceProviderId;
            this.__explicitlySet__.add("configurationSourceProviderId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GitConfigSourceRecord build() {
            GitConfigSourceRecord __instance__ =
                    new GitConfigSourceRecord(
                            configurationSourceProviderId, repositoryUrl, branchName, commitId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitConfigSourceRecord o) {
            Builder copiedBuilder =
                    configurationSourceProviderId(o.getConfigurationSourceProviderId())
                            .repositoryUrl(o.getRepositoryUrl())
                            .branchName(o.getBranchName())
                            .commitId(o.getCommitId());

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

    @Deprecated
    public GitConfigSourceRecord(
            String configurationSourceProviderId,
            String repositoryUrl,
            String branchName,
            String commitId) {
        super();
        this.configurationSourceProviderId = configurationSourceProviderId;
        this.repositoryUrl = repositoryUrl;
        this.branchName = branchName;
        this.commitId = commitId;
    }

    /**
     * Unique identifier ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm))
     * for the Git configuration source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
    String configurationSourceProviderId;

    /**
     * The URL of the Git repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    String repositoryUrl;

    /**
     * The name of the branch within the Git repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    String branchName;

    /**
     * The unique identifier (SHA-1 hash) of the individual change to the Git repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    String commitId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
