/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Metadata about the Bitbucket Server configuration source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BitbucketServerConfigSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BitbucketServerConfigSource extends ConfigSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
        private String workingDirectory;

        public Builder workingDirectory(String workingDirectory) {
            this.workingDirectory = workingDirectory;
            this.__explicitlySet__.add("workingDirectory");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Bitbucket Server configuration source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
        private String configurationSourceProviderId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Bitbucket Server configuration source.
         *
         * @param configurationSourceProviderId the value to set
         * @return this builder
         */
        public Builder configurationSourceProviderId(String configurationSourceProviderId) {
            this.configurationSourceProviderId = configurationSourceProviderId;
            this.__explicitlySet__.add("configurationSourceProviderId");
            return this;
        }
        /** The URL of the Bitbucket Server repository for the configuration source. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The URL of the Bitbucket Server repository for the configuration source.
         *
         * @param repositoryUrl the value to set
         * @return this builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /**
         * The name of the branch in the Bitbucket Server repository for the configuration source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * The name of the branch in the Bitbucket Server repository for the configuration source.
         *
         * @param branchName the value to set
         * @return this builder
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }
        /** Unique identifier for a Bitbucket Server project. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * Unique identifier for a Bitbucket Server project.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /** Bitbucket Server repository identifier, usually identified as <repository>.git. */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * Bitbucket Server repository identifier, usually identified as <repository>.git.
         *
         * @param repositoryId the value to set
         * @return this builder
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /** The clone URL of Bitbucket Server configuration source. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloneUrl")
        private String cloneUrl;

        /**
         * The clone URL of Bitbucket Server configuration source.
         *
         * @param cloneUrl the value to set
         * @return this builder
         */
        public Builder cloneUrl(String cloneUrl) {
            this.cloneUrl = cloneUrl;
            this.__explicitlySet__.add("cloneUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BitbucketServerConfigSource build() {
            BitbucketServerConfigSource model =
                    new BitbucketServerConfigSource(
                            this.workingDirectory,
                            this.configurationSourceProviderId,
                            this.repositoryUrl,
                            this.branchName,
                            this.projectId,
                            this.repositoryId,
                            this.cloneUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BitbucketServerConfigSource model) {
            if (model.wasPropertyExplicitlySet("workingDirectory")) {
                this.workingDirectory(model.getWorkingDirectory());
            }
            if (model.wasPropertyExplicitlySet("configurationSourceProviderId")) {
                this.configurationSourceProviderId(model.getConfigurationSourceProviderId());
            }
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
            }
            if (model.wasPropertyExplicitlySet("cloneUrl")) {
                this.cloneUrl(model.getCloneUrl());
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
    public BitbucketServerConfigSource(
            String workingDirectory,
            String configurationSourceProviderId,
            String repositoryUrl,
            String branchName,
            String projectId,
            String repositoryId,
            String cloneUrl) {
        super(workingDirectory);
        this.configurationSourceProviderId = configurationSourceProviderId;
        this.repositoryUrl = repositoryUrl;
        this.branchName = branchName;
        this.projectId = projectId;
        this.repositoryId = repositoryId;
        this.cloneUrl = cloneUrl;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Bitbucket Server configuration source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationSourceProviderId")
    private final String configurationSourceProviderId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Bitbucket Server configuration source.
     *
     * @return the value
     */
    public String getConfigurationSourceProviderId() {
        return configurationSourceProviderId;
    }

    /** The URL of the Bitbucket Server repository for the configuration source. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The URL of the Bitbucket Server repository for the configuration source.
     *
     * @return the value
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /** The name of the branch in the Bitbucket Server repository for the configuration source. */
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * The name of the branch in the Bitbucket Server repository for the configuration source.
     *
     * @return the value
     */
    public String getBranchName() {
        return branchName;
    }

    /** Unique identifier for a Bitbucket Server project. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * Unique identifier for a Bitbucket Server project.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /** Bitbucket Server repository identifier, usually identified as <repository>.git. */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * Bitbucket Server repository identifier, usually identified as <repository>.git.
     *
     * @return the value
     */
    public String getRepositoryId() {
        return repositoryId;
    }

    /** The clone URL of Bitbucket Server configuration source. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloneUrl")
    private final String cloneUrl;

    /**
     * The clone URL of Bitbucket Server configuration source.
     *
     * @return the value
     */
    public String getCloneUrl() {
        return cloneUrl;
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
        sb.append("BitbucketServerConfigSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configurationSourceProviderId=")
                .append(String.valueOf(this.configurationSourceProviderId));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(", cloneUrl=").append(String.valueOf(this.cloneUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BitbucketServerConfigSource)) {
            return false;
        }

        BitbucketServerConfigSource other = (BitbucketServerConfigSource) o;
        return java.util.Objects.equals(
                        this.configurationSourceProviderId, other.configurationSourceProviderId)
                && java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.branchName, other.branchName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.cloneUrl, other.cloneUrl)
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
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.cloneUrl == null ? 43 : this.cloneUrl.hashCode());
        return result;
    }
}
