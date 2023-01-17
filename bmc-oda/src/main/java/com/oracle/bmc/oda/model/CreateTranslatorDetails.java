/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create a Translator. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateTranslatorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateTranslatorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "baseUrl",
        "authToken",
        "properties",
        "freeformTags",
        "definedTags"
    })
    public CreateTranslatorDetails(
            TranslationService type,
            String baseUrl,
            String authToken,
            java.util.Map<String, String> properties,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.type = type;
        this.baseUrl = baseUrl;
        this.authToken = authToken;
        this.properties = properties;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Translation Service to use for this Translator. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private TranslationService type;

        /**
         * The Translation Service to use for this Translator.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(TranslationService type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The base URL for invoking the Translation Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
        private String baseUrl;

        /**
         * The base URL for invoking the Translation Service.
         *
         * @param baseUrl the value to set
         * @return this builder
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            this.__explicitlySet__.add("baseUrl");
            return this;
        }
        /** The authentication token to use when invoking the Translation Service */
        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private String authToken;

        /**
         * The authentication token to use when invoking the Translation Service
         *
         * @param authToken the value to set
         * @return this builder
         */
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
            return this;
        }
        /**
         * Properties used when invoking the translation service. Each property is a simple
         * key-value pair.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        /**
         * Properties used when invoking the translation service. Each property is a simple
         * key-value pair.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTranslatorDetails build() {
            CreateTranslatorDetails model =
                    new CreateTranslatorDetails(
                            this.type,
                            this.baseUrl,
                            this.authToken,
                            this.properties,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTranslatorDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("baseUrl")) {
                this.baseUrl(model.getBaseUrl());
            }
            if (model.wasPropertyExplicitlySet("authToken")) {
                this.authToken(model.getAuthToken());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The Translation Service to use for this Translator. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final TranslationService type;

    /**
     * The Translation Service to use for this Translator.
     *
     * @return the value
     */
    public TranslationService getType() {
        return type;
    }

    /** The base URL for invoking the Translation Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("baseUrl")
    private final String baseUrl;

    /**
     * The base URL for invoking the Translation Service.
     *
     * @return the value
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /** The authentication token to use when invoking the Translation Service */
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    private final String authToken;

    /**
     * The authentication token to use when invoking the Translation Service
     *
     * @return the value
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Properties used when invoking the translation service. Each property is a simple key-value
     * pair.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

    /**
     * Properties used when invoking the translation service. Each property is a simple key-value
     * pair.
     *
     * @return the value
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateTranslatorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", baseUrl=").append(String.valueOf(this.baseUrl));
        sb.append(", authToken=").append("<redacted>");
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTranslatorDetails)) {
            return false;
        }

        CreateTranslatorDetails other = (CreateTranslatorDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.baseUrl, other.baseUrl)
                && java.util.Objects.equals(this.authToken, other.authToken)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.baseUrl == null ? 43 : this.baseUrl.hashCode());
        result = (result * PRIME) + (this.authToken == null ? 43 : this.authToken.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
