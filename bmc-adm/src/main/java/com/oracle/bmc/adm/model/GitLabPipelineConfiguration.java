/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Extends a Verify configuration with appropriate data to reach and use the build service provided
 * by a GitLab Pipeline. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GitLabPipelineConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildServiceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GitLabPipelineConfiguration extends VerifyConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The location of the Repository where the GitLab Pipeline will be run. The expected format
         * is https://gitlab.com/[groupName]/[repoName]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The location of the Repository where the GitLab Pipeline will be run. The expected format
         * is https://gitlab.com/[groupName]/[repoName]
         *
         * @param repositoryUrl the value to set
         * @return this builder
         */
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = repositoryUrl;
            this.__explicitlySet__.add("repositoryUrl");
            return this;
        }
        /** The username that will trigger the GitLab Pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username that will trigger the GitLab Pipeline.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitLab
         * pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
        private String patSecretId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitLab
         * pipeline.
         *
         * @param patSecretId the value to set
         * @return this builder
         */
        public Builder patSecretId(String patSecretId) {
            this.patSecretId = patSecretId;
            this.__explicitlySet__.add("patSecretId");
            return this;
        }
        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * trigger Secret. The Secret provides access to the trigger for a GitLab pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("triggerSecretId")
        private String triggerSecretId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
         * trigger Secret. The Secret provides access to the trigger for a GitLab pipeline.
         *
         * @param triggerSecretId the value to set
         * @return this builder
         */
        public Builder triggerSecretId(String triggerSecretId) {
            this.triggerSecretId = triggerSecretId;
            this.__explicitlySet__.add("triggerSecretId");
            return this;
        }
        /**
         * Additional key-value pairs passed as parameters to the build service when running an
         * experiment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
        private java.util.Map<String, String> additionalParameters;

        /**
         * Additional key-value pairs passed as parameters to the build service when running an
         * experiment.
         *
         * @param additionalParameters the value to set
         * @return this builder
         */
        public Builder additionalParameters(java.util.Map<String, String> additionalParameters) {
            this.additionalParameters = additionalParameters;
            this.__explicitlySet__.add("additionalParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GitLabPipelineConfiguration build() {
            GitLabPipelineConfiguration model =
                    new GitLabPipelineConfiguration(
                            this.repositoryUrl,
                            this.username,
                            this.patSecretId,
                            this.triggerSecretId,
                            this.additionalParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitLabPipelineConfiguration model) {
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("patSecretId")) {
                this.patSecretId(model.getPatSecretId());
            }
            if (model.wasPropertyExplicitlySet("triggerSecretId")) {
                this.triggerSecretId(model.getTriggerSecretId());
            }
            if (model.wasPropertyExplicitlySet("additionalParameters")) {
                this.additionalParameters(model.getAdditionalParameters());
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
    public GitLabPipelineConfiguration(
            String repositoryUrl,
            String username,
            String patSecretId,
            String triggerSecretId,
            java.util.Map<String, String> additionalParameters) {
        super();
        this.repositoryUrl = repositoryUrl;
        this.username = username;
        this.patSecretId = patSecretId;
        this.triggerSecretId = triggerSecretId;
        this.additionalParameters = additionalParameters;
    }

    /**
     * The location of the Repository where the GitLab Pipeline will be run. The expected format is
     * https://gitlab.com/[groupName]/[repoName]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The location of the Repository where the GitLab Pipeline will be run. The expected format is
     * https://gitlab.com/[groupName]/[repoName]
     *
     * @return the value
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /** The username that will trigger the GitLab Pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username that will trigger the GitLab Pipeline.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitLab
     * pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
    private final String patSecretId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitLab
     * pipeline.
     *
     * @return the value
     */
    public String getPatSecretId() {
        return patSecretId;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * trigger Secret. The Secret provides access to the trigger for a GitLab pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("triggerSecretId")
    private final String triggerSecretId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) of the
     * trigger Secret. The Secret provides access to the trigger for a GitLab pipeline.
     *
     * @return the value
     */
    public String getTriggerSecretId() {
        return triggerSecretId;
    }

    /**
     * Additional key-value pairs passed as parameters to the build service when running an
     * experiment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
    private final java.util.Map<String, String> additionalParameters;

    /**
     * Additional key-value pairs passed as parameters to the build service when running an
     * experiment.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
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
        sb.append("GitLabPipelineConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", patSecretId=").append(String.valueOf(this.patSecretId));
        sb.append(", triggerSecretId=").append(String.valueOf(this.triggerSecretId));
        sb.append(", additionalParameters=").append(String.valueOf(this.additionalParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitLabPipelineConfiguration)) {
            return false;
        }

        GitLabPipelineConfiguration other = (GitLabPipelineConfiguration) o;
        return java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.patSecretId, other.patSecretId)
                && java.util.Objects.equals(this.triggerSecretId, other.triggerSecretId)
                && java.util.Objects.equals(this.additionalParameters, other.additionalParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.patSecretId == null ? 43 : this.patSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.triggerSecretId == null ? 43 : this.triggerSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalParameters == null
                                ? 43
                                : this.additionalParameters.hashCode());
        return result;
    }
}
