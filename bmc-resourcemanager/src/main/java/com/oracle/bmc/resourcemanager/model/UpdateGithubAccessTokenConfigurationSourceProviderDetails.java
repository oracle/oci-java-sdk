/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The details for updating a configuration source provider of the type `GITHUB_ACCESS_TOKEN`.
 * This type corresponds to a configuration source provider in GitHub that is authenticated with a personal access token.
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
    builder = UpdateGithubAccessTokenConfigurationSourceProviderDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceProviderType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateGithubAccessTokenConfigurationSourceProviderDetails
        extends UpdateConfigurationSourceProviderDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
        private String apiEndpoint;

        public Builder apiEndpoint(String apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            this.__explicitlySet__.add("apiEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateGithubAccessTokenConfigurationSourceProviderDetails build() {
            UpdateGithubAccessTokenConfigurationSourceProviderDetails __instance__ =
                    new UpdateGithubAccessTokenConfigurationSourceProviderDetails(
                            displayName,
                            description,
                            freeformTags,
                            definedTags,
                            apiEndpoint,
                            accessToken);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGithubAccessTokenConfigurationSourceProviderDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .apiEndpoint(o.getApiEndpoint())
                            .accessToken(o.getAccessToken());

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
    public UpdateGithubAccessTokenConfigurationSourceProviderDetails(
            String displayName,
            String description,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String apiEndpoint,
            String accessToken) {
        super(displayName, description, freeformTags, definedTags);
        this.apiEndpoint = apiEndpoint;
        this.accessToken = accessToken;
    }

    /**
     * The GitHub service endpoint.
     * Example: `https://github.com/`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiEndpoint")
    String apiEndpoint;

    /**
     * The personal access token to be configured on the GitHub repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    String accessToken;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
