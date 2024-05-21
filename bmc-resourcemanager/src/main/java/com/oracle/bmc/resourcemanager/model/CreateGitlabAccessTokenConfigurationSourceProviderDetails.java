/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Creation details for a configuration source provider of the type {@code GITLAB_ACCESS_TOKEN}.
 * This type corresponds to a configuration source provider in GitLab that is authenticated with a personal access token.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateGitlabAccessTokenConfigurationSourceProviderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceProviderType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGitlabAccessTokenConfigurationSourceProviderDetails
        extends CreateConfigurationSourceProviderDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateServerConfigDetails")
        private PrivateServerConfigDetails privateServerConfigDetails;

        public Builder privateServerConfigDetails(
                PrivateServerConfigDetails privateServerConfigDetails) {
            this.privateServerConfigDetails = privateServerConfigDetails;
            this.__explicitlySet__.add("privateServerConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The Git service endpoint.
         * Example: {@code https://gitlab.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
        private String apiEndpoint;

        /**
         * The Git service endpoint.
         * Example: {@code https://gitlab.com}
         *
         * @param apiEndpoint the value to set
         * @return this builder
         **/
        public Builder apiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            this.__explicitlySet__.add("apiEndpoint");
            return this;
        }
        /**
         * The personal access token to be configured on the GitLab repository. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * The personal access token to be configured on the GitLab repository. Avoid entering confidential information.
         * @param accessToken the value to set
         * @return this builder
         **/
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGitlabAccessTokenConfigurationSourceProviderDetails build() {
            CreateGitlabAccessTokenConfigurationSourceProviderDetails model =
                    new CreateGitlabAccessTokenConfigurationSourceProviderDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.privateServerConfigDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.apiEndpoint,
                            this.accessToken);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGitlabAccessTokenConfigurationSourceProviderDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("privateServerConfigDetails")) {
                this.privateServerConfigDetails(model.getPrivateServerConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("apiEndpoint")) {
                this.apiEndpoint(model.getApiEndpoint());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
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
    public CreateGitlabAccessTokenConfigurationSourceProviderDetails(
            String compartmentId,
            String displayName,
            String description,
            PrivateServerConfigDetails privateServerConfigDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String apiEndpoint,
            String accessToken) {
        super(
                compartmentId,
                displayName,
                description,
                privateServerConfigDetails,
                freeformTags,
                definedTags);
        this.apiEndpoint = apiEndpoint;
        this.accessToken = accessToken;
    }

    /**
     * The Git service endpoint.
     * Example: {@code https://gitlab.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
    private final String apiEndpoint;

    /**
     * The Git service endpoint.
     * Example: {@code https://gitlab.com}
     *
     * @return the value
     **/
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    /**
     * The personal access token to be configured on the GitLab repository. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * The personal access token to be configured on the GitLab repository. Avoid entering confidential information.
     * @return the value
     **/
    public String getAccessToken() {
        return accessToken;
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
        sb.append("CreateGitlabAccessTokenConfigurationSourceProviderDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", apiEndpoint=").append(String.valueOf(this.apiEndpoint));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGitlabAccessTokenConfigurationSourceProviderDetails)) {
            return false;
        }

        CreateGitlabAccessTokenConfigurationSourceProviderDetails other =
                (CreateGitlabAccessTokenConfigurationSourceProviderDetails) o;
        return java.util.Objects.equals(this.apiEndpoint, other.apiEndpoint)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apiEndpoint == null ? 43 : this.apiEndpoint.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        return result;
    }
}
