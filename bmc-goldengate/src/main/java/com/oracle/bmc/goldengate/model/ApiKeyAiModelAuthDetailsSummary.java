/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of API key authentication details for an AI Model connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiKeyAiModelAuthDetailsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "authType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiKeyAiModelAuthDetailsSummary extends AiModelAuthDetailsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base URL of the AI model endpoint.
         * If not specified, the default base URL for the selected AI provider will be used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * Base URL of the AI model endpoint.
         * If not specified, the default base URL for the selected AI provider will be used.
         *
         * @param baseUrl the value to set
         * @return this builder
         **/
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }
        /**
         * API key secret OCID for the AI model connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
        private String apiKeySecretId;

        /**
         * API key secret OCID for the AI model connection.
         *
         * @param apiKeySecretId the value to set
         * @return this builder
         **/
        public Builder apiKeySecretId(String apiKeySecretId) {
            this.apiKeySecretId = apiKeySecretId;
            this.__explicitlySet__.add("apiKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiKeyAiModelAuthDetailsSummary build() {
            ApiKeyAiModelAuthDetailsSummary model =
                    new ApiKeyAiModelAuthDetailsSummary(this.baseUrl, this.apiKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiKeyAiModelAuthDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("baseUrl")) {
                this.baseUrl(model.getBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("apiKeySecretId")) {
                this.apiKeySecretId(model.getApiKeySecretId());
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
    public ApiKeyAiModelAuthDetailsSummary(String baseUrl, String apiKeySecretId) {
        super();
        this.baseUrl = baseUrl;
        this.apiKeySecretId = apiKeySecretId;
    }

    /**
     * Base URL of the AI model endpoint.
     * If not specified, the default base URL for the selected AI provider will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * Base URL of the AI model endpoint.
     * If not specified, the default base URL for the selected AI provider will be used.
     *
     * @return the value
     **/
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * API key secret OCID for the AI model connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
    private final String apiKeySecretId;

    /**
     * API key secret OCID for the AI model connection.
     *
     * @return the value
     **/
    public String getApiKeySecretId() {
        return apiKeySecretId;
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
        sb.append("ApiKeyAiModelAuthDetailsSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", apiKeySecretId=").append(String.valueOf(this.apiKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiKeyAiModelAuthDetailsSummary)) {
            return false;
        }

        ApiKeyAiModelAuthDetailsSummary other = (ApiKeyAiModelAuthDetailsSummary) o;
        return java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.apiKeySecretId, other.apiKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.apiKeySecretId == null ? 43 : this.apiKeySecretId.hashCode());
        return result;
    }
}
