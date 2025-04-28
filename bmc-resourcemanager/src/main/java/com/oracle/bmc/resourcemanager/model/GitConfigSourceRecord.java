/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Metadata about the Git configuration source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GitConfigSourceRecord.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configSourceRecordType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GitConfigSourceRecord extends ConfigSourceRecord {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
         * Git configuration source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
        private String configurationSourceProviderId;

        /**
         * Unique identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
         * Git configuration source.
         *
         * @param configurationSourceProviderId the value to set
         * @return this builder
         */
        public Builder configurationSourceProviderId(String configurationSourceProviderId) {
            this.configurationSourceProviderId = configurationSourceProviderId;
            this.__explicitlySet__.add("configurationSourceProviderId");
            return this;
        }
        /** The URL of the Git repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The URL of the Git repository.
         *
         * @param repositoryUrl the value to set
         * @return this builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /** The name of the branch within the Git repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * The name of the branch within the Git repository.
         *
         * @param branchName the value to set
         * @return this builder
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }
        /** The unique identifier (SHA-1 hash) of the individual change to the Git repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * The unique identifier (SHA-1 hash) of the individual change to the Git repository.
         *
         * @param commitId the value to set
         * @return this builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GitConfigSourceRecord build() {
            GitConfigSourceRecord model =
                    new GitConfigSourceRecord(
                            this.configurationSourceProviderId,
                            this.repositoryUrl,
                            this.branchName,
                            this.commitId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitConfigSourceRecord model) {
            if (model.wasPropertyExplicitlySet("configurationSourceProviderId")) {
                this.configurationSourceProviderId(model.getConfigurationSourceProviderId());
            }
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
            }
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
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
     * Unique identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the Git
     * configuration source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
    private final String configurationSourceProviderId;

    /**
     * Unique identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the Git
     * configuration source.
     *
     * @return the value
     */
    public String getConfigurationSourceProviderId() {
        return configurationSourceProviderId;
    }

    /** The URL of the Git repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The URL of the Git repository.
     *
     * @return the value
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /** The name of the branch within the Git repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * The name of the branch within the Git repository.
     *
     * @return the value
     */
    public String getBranchName() {
        return branchName;
    }

    /** The unique identifier (SHA-1 hash) of the individual change to the Git repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * The unique identifier (SHA-1 hash) of the individual change to the Git repository.
     *
     * @return the value
     */
    public String getCommitId() {
        return commitId;
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
        sb.append("GitConfigSourceRecord(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configurationSourceProviderId=")
                .append(String.valueOf(this.configurationSourceProviderId));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitConfigSourceRecord)) {
            return false;
        }

        GitConfigSourceRecord other = (GitConfigSourceRecord) o;
        return java.util.Objects.equals(
                        this.configurationSourceProviderId, other.configurationSourceProviderId)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.branchName, other.branchName)
                && java.util.Objects.equals(this.commitId, other.commitId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configurationSourceProviderId == null
                                ? 43
                                : this.configurationSourceProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        return result;
    }
}
