/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary details of an AI provider and its supported models.
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
    builder = AiProviderSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AiProviderSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "providerType",
        "displayName",
        "description",
        "authType",
        "defaultBaseUrl",
        "models"
    })
    public AiProviderSummary(
            ProviderType providerType,
            String displayName,
            String description,
            java.util.List<AiModelAuthType> authType,
            String defaultBaseUrl,
            java.util.List<AiModelSummary> models) {
        super();
        this.providerType = providerType;
        this.displayName = displayName;
        this.description = description;
        this.authType = authType;
        this.defaultBaseUrl = defaultBaseUrl;
        this.models = models;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * AI Provider type used by the AI Model Connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerType")
        private ProviderType providerType;

        /**
         * AI Provider type used by the AI Model Connection.
         *
         * @param providerType the value to set
         * @return this builder
         **/
        public Builder providerType(ProviderType providerType) {
            this.providerType = providerType;
            this.__explicitlySet__.add("providerType");
            return this;
        }
        /**
         * An object's Display Name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Metadata about this specific object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Metadata about this specific object.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Authentication types supported by the AI provider.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authType")
        private java.util.List<AiModelAuthType> authType;

        /**
         * Authentication types supported by the AI provider.
         *
         * @param authType the value to set
         * @return this builder
         **/
        public Builder authType(java.util.List<AiModelAuthType> authType) {
            this.authType = authType;
            this.__explicitlySet__.add("authType");
            return this;
        }
        /**
         * Default base URL for the AI provider.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBaseUrl")
        private String defaultBaseUrl;

        /**
         * Default base URL for the AI provider.
         *
         * @param defaultBaseUrl the value to set
         * @return this builder
         **/
        public Builder defaultBaseUrl(String defaultBaseUrl) {
            this.defaultBaseUrl = defaultBaseUrl;
            this.__explicitlySet__.add("defaultBaseUrl");
            return this;
        }
        /**
         * List of AI models supported by this provider, when available. This
         * field is null when the provider's models can be retrieved only after
         * supplying additional context. For example, OCI_GENERATIVE_AI model
         * availability may vary by region.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("models")
        private java.util.List<AiModelSummary> models;

        /**
         * List of AI models supported by this provider, when available. This
         * field is null when the provider's models can be retrieved only after
         * supplying additional context. For example, OCI_GENERATIVE_AI model
         * availability may vary by region.
         *
         * @param models the value to set
         * @return this builder
         **/
        public Builder models(java.util.List<AiModelSummary> models) {
            this.models = models;
            this.__explicitlySet__.add("models");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AiProviderSummary build() {
            AiProviderSummary model =
                    new AiProviderSummary(
                            this.providerType,
                            this.displayName,
                            this.description,
                            this.authType,
                            this.defaultBaseUrl,
                            this.models);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AiProviderSummary model) {
            if (model.wasPropertyExplicitlySet("providerType")) {
                this.providerType(model.getProviderType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("authType")) {
                this.authType(model.getAuthType());
            }
            if (model.wasPropertyExplicitlySet("defaultBaseUrl")) {
                this.defaultBaseUrl(model.getDefaultBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("models")) {
                this.models(model.getModels());
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

    /**
     * AI Provider type used by the AI Model Connection.
     *
     **/
    public enum ProviderType {
        OciGenerativeAi("OCI_GENERATIVE_AI"),
        Gemini("GEMINI"),
        OpenAi("OPEN_AI"),
        VoyageAi("VOYAGE_AI"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProviderType.class);

        private final String value;
        private static java.util.Map<String, ProviderType> map;

        static {
            map = new java.util.HashMap<>();
            for (ProviderType v : ProviderType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProviderType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProviderType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProviderType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * AI Provider type used by the AI Model Connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerType")
    private final ProviderType providerType;

    /**
     * AI Provider type used by the AI Model Connection.
     *
     * @return the value
     **/
    public ProviderType getProviderType() {
        return providerType;
    }

    /**
     * An object's Display Name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Metadata about this specific object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Metadata about this specific object.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Authentication types supported by the AI provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authType")
    private final java.util.List<AiModelAuthType> authType;

    /**
     * Authentication types supported by the AI provider.
     *
     * @return the value
     **/
    public java.util.List<AiModelAuthType> getAuthType() {
        return authType;
    }

    /**
     * Default base URL for the AI provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBaseUrl")
    private final String defaultBaseUrl;

    /**
     * Default base URL for the AI provider.
     *
     * @return the value
     **/
    public String getDefaultBaseUrl() {
        return defaultBaseUrl;
    }

    /**
     * List of AI models supported by this provider, when available. This
     * field is null when the provider's models can be retrieved only after
     * supplying additional context. For example, OCI_GENERATIVE_AI model
     * availability may vary by region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("models")
    private final java.util.List<AiModelSummary> models;

    /**
     * List of AI models supported by this provider, when available. This
     * field is null when the provider's models can be retrieved only after
     * supplying additional context. For example, OCI_GENERATIVE_AI model
     * availability may vary by region.
     *
     * @return the value
     **/
    public java.util.List<AiModelSummary> getModels() {
        return models;
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
        sb.append("AiProviderSummary(");
        sb.append("super=").append(super.toString());
        sb.append("providerType=").append(String.valueOf(this.providerType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", authType=").append(String.valueOf(this.authType));
        sb.append(", defaultBaseUrl=").append(String.valueOf(this.defaultBaseUrl));
        sb.append(", models=").append(String.valueOf(this.models));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AiProviderSummary)) {
            return false;
        }

        AiProviderSummary other = (AiProviderSummary) o;
        return java.util.Objects.equals(this.providerType, other.providerType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.authType, other.authType)
                && java.util.Objects.equals(this.defaultBaseUrl, other.defaultBaseUrl)
                && java.util.Objects.equals(this.models, other.models)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.providerType == null ? 43 : this.providerType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.authType == null ? 43 : this.authType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultBaseUrl == null ? 43 : this.defaultBaseUrl.hashCode());
        result = (result * PRIME) + (this.models == null ? 43 : this.models.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
