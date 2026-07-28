/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about new API key authentication details for an AI Model connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateApiKeyAiModelAuthDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateApiKeyAiModelAuthDetails extends CreateAiModelAuthDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base URL of the AI model endpoint. If not specified, the default base URL for the
         * selected AI provider will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * Base URL of the AI model endpoint. If not specified, the default base URL for the
         * selected AI provider will be used.
         *
         * @param baseUrl the value to set
         * @return this builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }
        /**
         * API key for the AI model connection. Deprecated: This field is deprecated and replaced by
         * "apiKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
         * deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("apiKey")
        private char[] apiKey;

        /**
         * API key for the AI model connection. Deprecated: This field is deprecated and replaced by
         * "apiKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
         * deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param apiKey the value to set
         * @return this builder
         */
        public Builder apiKey(char[] apiKey) {
            this.apiKey = apiKey;
            this.__explicitlySet__.add("apiKey");
            return this;
        }

        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey != null ? apiKey.toCharArray() : null;
            this.__explicitlySet__.add("apiKey");
            return this;
        }
        /** API key secret OCID for the AI model connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
        private String apiKeySecretId;

        /**
         * API key secret OCID for the AI model connection.
         *
         * @param apiKeySecretId the value to set
         * @return this builder
         */
        public Builder apiKeySecretId(String apiKeySecretId) {
            this.apiKeySecretId = apiKeySecretId;
            this.__explicitlySet__.add("apiKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateApiKeyAiModelAuthDetails build() {
            CreateApiKeyAiModelAuthDetails model =
                    new CreateApiKeyAiModelAuthDetails(
                            this.baseUrl, this.apiKey, this.apiKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateApiKeyAiModelAuthDetails model) {
            if (model.wasPropertyExplicitlySet("baseUrl")) {
                this.baseUrl(model.getBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("apiKey")) {
                this.apiKey(model.getApiKey());
            }
            if (model.wasPropertyExplicitlySet("apiKeySecretId")) {
                this.apiKeySecretId(model.getApiKeySecretId());
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
    public CreateApiKeyAiModelAuthDetails(String baseUrl, String apiKey, String apiKeySecretId) {
        super();
        this.baseUrl = baseUrl;
        this.apiKey = apiKey != null ? apiKey.toCharArray() : null;
        this.apiKeySecretId = apiKeySecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateApiKeyAiModelAuthDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("baseUrl") String baseUrl,
            @com.fasterxml.jackson.annotation.JsonProperty("apiKey") char[] apiKey,
            @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
                    String apiKeySecretId) {
        super();
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
        this.apiKeySecretId = apiKeySecretId;
    }

    /**
     * Base URL of the AI model endpoint. If not specified, the default base URL for the selected AI
     * provider will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * Base URL of the AI model endpoint. If not specified, the default base URL for the selected AI
     * provider will be used.
     *
     * @return the value
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * API key for the AI model connection. Deprecated: This field is deprecated and replaced by
     * "apiKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
     * deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiKey")
    private final char[] apiKey;

    /**
     * API key for the AI model connection. Deprecated: This field is deprecated and replaced by
     * &quot;apiKeySecretId&quot;. This change follows the GoldenGate &quot;Plain Text Fields in
     * Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getApiKey__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getApiKey() {
        return apiKey != null ? new String(apiKey) : null;
    }

    /**
     * API key for the AI model connection. Deprecated: This field is deprecated and replaced by
     * "apiKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
     * deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiKey")
    public char[] getApiKey__AsCharArray() {
        return apiKey;
    }

    /** API key secret OCID for the AI model connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("apiKeySecretId")
    private final String apiKeySecretId;

    /**
     * API key secret OCID for the AI model connection.
     *
     * @return the value
     */
    public String getApiKeySecretId() {
        return apiKeySecretId;
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
        sb.append("CreateApiKeyAiModelAuthDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", apiKey=").append("<redacted>");
        sb.append(", apiKeySecretId=").append(String.valueOf(this.apiKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateApiKeyAiModelAuthDetails)) {
            return false;
        }

        CreateApiKeyAiModelAuthDetails other = (CreateApiKeyAiModelAuthDetails) o;
        return java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.apiKey, other.apiKey)
                && java.util.Objects.equals(this.apiKeySecretId, other.apiKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result = (result * PRIME) + (this.apiKey == null ? 43 : this.apiKey.hashCode());
        result =
                (result * PRIME)
                        + (this.apiKeySecretId == null ? 43 : this.apiKeySecretId.hashCode());
        return result;
    }
}
