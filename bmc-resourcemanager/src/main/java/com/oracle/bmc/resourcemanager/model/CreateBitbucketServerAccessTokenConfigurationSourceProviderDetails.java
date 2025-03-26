/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The details for creating a configuration source provider of the type {@code BITBUCKET_SERVER_ACCESS_TOKEN}.
 * This type corresponds to a configuration source provider in Bitbucket server that is authenticated with a personal access token.
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
    builder = CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceProviderType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails
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
         * The secret ocid which is used to authorize the user.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The secret ocid which is used to authorize the user.
         *
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The Bitbucket Server service endpoint
         * Example: {@code https://bitbucket.org/}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
        private String apiEndpoint;

        /**
         * The Bitbucket Server service endpoint
         * Example: {@code https://bitbucket.org/}
         *
         * @param apiEndpoint the value to set
         * @return this builder
         **/
        public Builder apiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            this.__explicitlySet__.add("apiEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails build() {
            CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails model =
                    new CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.privateServerConfigDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.secretId,
                            this.apiEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails model) {
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
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("apiEndpoint")) {
                this.apiEndpoint(model.getApiEndpoint());
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
    public CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails(
            String compartmentId,
            String displayName,
            String description,
            PrivateServerConfigDetails privateServerConfigDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String secretId,
            String apiEndpoint) {
        super(
                compartmentId,
                displayName,
                description,
                privateServerConfigDetails,
                freeformTags,
                definedTags);
        this.secretId = secretId;
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * The secret ocid which is used to authorize the user.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The secret ocid which is used to authorize the user.
     *
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
    }

    /**
     * The Bitbucket Server service endpoint
     * Example: {@code https://bitbucket.org/}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
    private final String apiEndpoint;

    /**
     * The Bitbucket Server service endpoint
     * Example: {@code https://bitbucket.org/}
     *
     * @return the value
     **/
    public String getApiEndpoint() {
        return apiEndpoint;
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
        sb.append("CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", apiEndpoint=").append(String.valueOf(this.apiEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails)) {
            return false;
        }

        CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails other =
                (CreateBitbucketServerAccessTokenConfigurationSourceProviderDetails) o;
        return java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.apiEndpoint, other.apiEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.apiEndpoint == null ? 43 : this.apiEndpoint.hashCode());
        return result;
    }
}
