/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The details for creating a connection of the type {@code BITBUCKET_SERVER_ACCESS_TOKEN}. This
 * type corresponds to a connection in Bitbucket that is authenticated with a personal access token.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBitbucketServerAccessTokenConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBitbucketServerAccessTokenConnectionDetails
        extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
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
        /** The OCID of personal access token saved in secret store. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * The OCID of personal access token saved in secret store.
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /** The Base URL of the hosted BitbucketServer. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * The Base URL of the hosted BitbucketServer.
         *
         * @param baseUrl the value to set
         * @return this builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
        private TlsVerifyConfig tlsVerifyConfig;

        public Builder tlsVerifyConfig(TlsVerifyConfig tlsVerifyConfig) {
            this.tlsVerifyConfig = tlsVerifyConfig;
            this.__explicitlySet__.add("tlsVerifyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBitbucketServerAccessTokenConnectionDetails build() {
            CreateBitbucketServerAccessTokenConnectionDetails model =
                    new CreateBitbucketServerAccessTokenConnectionDetails(
                            this.description,
                            this.displayName,
                            this.projectId,
                            this.freeformTags,
                            this.definedTags,
                            this.accessToken,
                            this.baseUrl,
                            this.tlsVerifyConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBitbucketServerAccessTokenConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("baseUrl")) {
                this.baseUrl(model.getBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("tlsVerifyConfig")) {
                this.tlsVerifyConfig(model.getTlsVerifyConfig());
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
    public CreateBitbucketServerAccessTokenConnectionDetails(
            String description,
            String displayName,
            String projectId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String accessToken,
            String baseUrl,
            TlsVerifyConfig tlsVerifyConfig) {
        super(description, displayName, projectId, freeformTags, definedTags);
        this.accessToken = accessToken;
        this.baseUrl = baseUrl;
        this.tlsVerifyConfig = tlsVerifyConfig;
    }

    /** The OCID of personal access token saved in secret store. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * The OCID of personal access token saved in secret store.
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
    }

    /** The Base URL of the hosted BitbucketServer. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * The Base URL of the hosted BitbucketServer.
     *
     * @return the value
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tlsVerifyConfig")
    private final TlsVerifyConfig tlsVerifyConfig;

    public TlsVerifyConfig getTlsVerifyConfig() {
        return tlsVerifyConfig;
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
        sb.append("CreateBitbucketServerAccessTokenConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", tlsVerifyConfig=").append(String.valueOf(this.tlsVerifyConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBitbucketServerAccessTokenConnectionDetails)) {
            return false;
        }

        CreateBitbucketServerAccessTokenConnectionDetails other =
                (CreateBitbucketServerAccessTokenConnectionDetails) o;
        return java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.tlsVerifyConfig, other.tlsVerifyConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.tlsVerifyConfig == null ? 43 : this.tlsVerifyConfig.hashCode());
        return result;
    }
}
