/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Extends a Verify configuration with appropriate data to reach and use the build service provided
 * by a GitHub Action. <br>
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
        builder = GitHubActionsConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "buildServiceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GitHubActionsConfiguration extends VerifyConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The location of the repository where the GitHub Actions is defined. For Non-Enterprise
         * GitHub the expected format is https://github.com/[owner]/[repoName] For Enterprise GitHub
         * the expected format is http(s)://[hostname]/api/v3/repos/[owner]/[repoName]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

        /**
         * The location of the repository where the GitHub Actions is defined. For Non-Enterprise
         * GitHub the expected format is https://github.com/[owner]/[repoName] For Enterprise GitHub
         * the expected format is http(s)://[hostname]/api/v3/repos/[owner]/[repoName]
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
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitHub
         * Action.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
        private String patSecretId;

        /**
         * The Oracle Cloud Identifier
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitHub
         * Action.
         *
         * @param patSecretId the value to set
         * @return this builder
         */
        public Builder patSecretId(String patSecretId) {
            this.patSecretId = patSecretId;
            this.__explicitlySet__.add("patSecretId");
            return this;
        }
        /** The username that will trigger the GitHub Action. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username that will trigger the GitHub Action.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** The name of the GitHub Actions workflow that defines the build pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowName")
        private String workflowName;

        /**
         * The name of the GitHub Actions workflow that defines the build pipeline.
         *
         * @param workflowName the value to set
         * @return this builder
         */
        public Builder workflowName(String workflowName) {
            this.workflowName = workflowName;
            this.__explicitlySet__.add("workflowName");
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

        public GitHubActionsConfiguration build() {
            GitHubActionsConfiguration model =
                    new GitHubActionsConfiguration(
                            this.repositoryUrl,
                            this.patSecretId,
                            this.username,
                            this.workflowName,
                            this.additionalParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitHubActionsConfiguration model) {
            if (model.wasPropertyExplicitlySet("repositoryUrl")) {
                this.repositoryUrl(model.getRepositoryUrl());
            }
            if (model.wasPropertyExplicitlySet("patSecretId")) {
                this.patSecretId(model.getPatSecretId());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("workflowName")) {
                this.workflowName(model.getWorkflowName());
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
    public GitHubActionsConfiguration(
            String repositoryUrl,
            String patSecretId,
            String username,
            String workflowName,
            java.util.Map<String, String> additionalParameters) {
        super();
        this.repositoryUrl = repositoryUrl;
        this.patSecretId = patSecretId;
        this.username = username;
        this.workflowName = workflowName;
        this.additionalParameters = additionalParameters;
    }

    /**
     * The location of the repository where the GitHub Actions is defined. For Non-Enterprise GitHub
     * the expected format is https://github.com/[owner]/[repoName] For Enterprise GitHub the
     * expected format is http(s)://[hostname]/api/v3/repos/[owner]/[repoName]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

    /**
     * The location of the repository where the GitHub Actions is defined. For Non-Enterprise GitHub
     * the expected format is https://github.com/[owner]/[repoName] For Enterprise GitHub the
     * expected format is http(s)://[hostname]/api/v3/repos/[owner]/[repoName]
     *
     * @return the value
     */
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitHub
     * Action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
    private final String patSecretId;

    /**
     * The Oracle Cloud Identifier
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * Private Access Token (PAT) Secret. The PAT provides the credentials to access the GitHub
     * Action.
     *
     * @return the value
     */
    public String getPatSecretId() {
        return patSecretId;
    }

    /** The username that will trigger the GitHub Action. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username that will trigger the GitHub Action.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** The name of the GitHub Actions workflow that defines the build pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowName")
    private final String workflowName;

    /**
     * The name of the GitHub Actions workflow that defines the build pipeline.
     *
     * @return the value
     */
    public String getWorkflowName() {
        return workflowName;
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
        sb.append("GitHubActionsConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", patSecretId=").append(String.valueOf(this.patSecretId));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", workflowName=").append(String.valueOf(this.workflowName));
        sb.append(", additionalParameters=").append(String.valueOf(this.additionalParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitHubActionsConfiguration)) {
            return false;
        }

        GitHubActionsConfiguration other = (GitHubActionsConfiguration) o;
        return java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl)
                && java.util.Objects.equals(this.patSecretId, other.patSecretId)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.workflowName, other.workflowName)
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
        result = (result * PRIME) + (this.patSecretId == null ? 43 : this.patSecretId.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.workflowName == null ? 43 : this.workflowName.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalParameters == null
                                ? 43
                                : this.additionalParameters.hashCode());
        return result;
    }
}
