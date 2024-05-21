/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Extends a Verify configuration with appropriate data to reach and use the build service provided by a Jenkins Pipeline.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JenkinsPipelineConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "buildServiceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JenkinsPipelineConfiguration extends VerifyConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The username that will be used to authenticate with Jenkins.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username that will be used to authenticate with Jenkins.
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the Private Access Token (PAT) Secret.
         * The PAT provides the credentials to access the Jenkins Pipeline.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
        private String patSecretId;

        /**
         * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the Private Access Token (PAT) Secret.
         * The PAT provides the credentials to access the Jenkins Pipeline.
         *
         * @param patSecretId the value to set
         * @return this builder
         **/
        public Builder patSecretId(String patSecretId) {
            this.patSecretId = patSecretId;
            this.__explicitlySet__.add("patSecretId");
            return this;
        }
        /**
         * The URL that locates the Jenkins pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jenkinsUrl")
        private String jenkinsUrl;

        /**
         * The URL that locates the Jenkins pipeline.
         * @param jenkinsUrl the value to set
         * @return this builder
         **/
        public Builder jenkinsUrl(String jenkinsUrl) {
            this.jenkinsUrl = jenkinsUrl;
            this.__explicitlySet__.add("jenkinsUrl");
            return this;
        }
        /**
         * The name of the Jenkins pipeline job that identifies the build pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the Jenkins pipeline job that identifies the build pipeline.
         * @param jobName the value to set
         * @return this builder
         **/
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /**
         * Additional key-value pairs passed as parameters to the build service when running an experiment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
        private java.util.Map<String, String> additionalParameters;

        /**
         * Additional key-value pairs passed as parameters to the build service when running an experiment.
         * @param additionalParameters the value to set
         * @return this builder
         **/
        public Builder additionalParameters(java.util.Map<String, String> additionalParameters) {
            this.additionalParameters = additionalParameters;
            this.__explicitlySet__.add("additionalParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JenkinsPipelineConfiguration build() {
            JenkinsPipelineConfiguration model =
                    new JenkinsPipelineConfiguration(
                            this.username,
                            this.patSecretId,
                            this.jenkinsUrl,
                            this.jobName,
                            this.additionalParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JenkinsPipelineConfiguration model) {
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("patSecretId")) {
                this.patSecretId(model.getPatSecretId());
            }
            if (model.wasPropertyExplicitlySet("jenkinsUrl")) {
                this.jenkinsUrl(model.getJenkinsUrl());
            }
            if (model.wasPropertyExplicitlySet("jobName")) {
                this.jobName(model.getJobName());
            }
            if (model.wasPropertyExplicitlySet("additionalParameters")) {
                this.additionalParameters(model.getAdditionalParameters());
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

    @Deprecated
    public JenkinsPipelineConfiguration(
            String username,
            String patSecretId,
            String jenkinsUrl,
            String jobName,
            java.util.Map<String, String> additionalParameters) {
        super();
        this.username = username;
        this.patSecretId = patSecretId;
        this.jenkinsUrl = jenkinsUrl;
        this.jobName = jobName;
        this.additionalParameters = additionalParameters;
    }

    /**
     * The username that will be used to authenticate with Jenkins.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username that will be used to authenticate with Jenkins.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the Private Access Token (PAT) Secret.
     * The PAT provides the credentials to access the Jenkins Pipeline.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patSecretId")
    private final String patSecretId;

    /**
     * The Oracle Cloud Identifier ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the Private Access Token (PAT) Secret.
     * The PAT provides the credentials to access the Jenkins Pipeline.
     *
     * @return the value
     **/
    public String getPatSecretId() {
        return patSecretId;
    }

    /**
     * The URL that locates the Jenkins pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jenkinsUrl")
    private final String jenkinsUrl;

    /**
     * The URL that locates the Jenkins pipeline.
     * @return the value
     **/
    public String getJenkinsUrl() {
        return jenkinsUrl;
    }

    /**
     * The name of the Jenkins pipeline job that identifies the build pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the Jenkins pipeline job that identifies the build pipeline.
     * @return the value
     **/
    public String getJobName() {
        return jobName;
    }

    /**
     * Additional key-value pairs passed as parameters to the build service when running an experiment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
    private final java.util.Map<String, String> additionalParameters;

    /**
     * Additional key-value pairs passed as parameters to the build service when running an experiment.
     * @return the value
     **/
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
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
        sb.append("JenkinsPipelineConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", patSecretId=").append(String.valueOf(this.patSecretId));
        sb.append(", jenkinsUrl=").append(String.valueOf(this.jenkinsUrl));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", additionalParameters=").append(String.valueOf(this.additionalParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JenkinsPipelineConfiguration)) {
            return false;
        }

        JenkinsPipelineConfiguration other = (JenkinsPipelineConfiguration) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.patSecretId, other.patSecretId)
                && java.util.Objects.equals(this.jenkinsUrl, other.jenkinsUrl)
                && java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(this.additionalParameters, other.additionalParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.patSecretId == null ? 43 : this.patSecretId.hashCode());
        result = (result * PRIME) + (this.jenkinsUrl == null ? 43 : this.jenkinsUrl.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalParameters == null
                                ? 43
                                : this.additionalParameters.hashCode());
        return result;
    }
}
