/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate the payload body of the incoming API requests on a specific route. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BodyValidationRequestPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BodyValidationRequestPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"required", "content", "validationMode"})
    public BodyValidationRequestPolicy(
            Boolean required,
            java.util.Map<String, ContentValidation> content,
            ValidationMode validationMode) {
        super();
        this.required = required;
        this.content = content;
        this.validationMode = validationMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Determines if the request body is required in the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Determines if the request body is required in the request.
         *
         * @param required the value to set
         * @return this builder
         */
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * The content of the request body. The key is a [media type
         * range](https://tools.ietf.org/html/rfc7231#appendix-D) subset restricted to the following
         * schema
         *
         * <p>key ::= ( / ( "*" "/" "*" ) / ( type "/" "*" ) / ( type "/" subtype ) )
         *
         * <p>For requests that match multiple keys, only the most specific key is applicable. e.g.
         * {@code text/plain} overrides {@code text/*}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private java.util.Map<String, ContentValidation> content;

        /**
         * The content of the request body. The key is a [media type
         * range](https://tools.ietf.org/html/rfc7231#appendix-D) subset restricted to the following
         * schema
         *
         * <p>key ::= ( / ( "*" "/" "*" ) / ( type "/" "*" ) / ( type "/" subtype ) )
         *
         * <p>For requests that match multiple keys, only the most specific key is applicable. e.g.
         * {@code text/plain} overrides {@code text/*}
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(java.util.Map<String, ContentValidation> content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * Validation behavior mode.
         *
         * <p>In {@code ENFORCING} mode, upon a validation failure, the request will be rejected
         * with a 4xx response and not sent to the backend.
         *
         * <p>In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics
         * while the request will follow the normal path.
         *
         * <p>{@code DISABLED} type turns the validation off.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
        private ValidationMode validationMode;

        /**
         * Validation behavior mode.
         *
         * <p>In {@code ENFORCING} mode, upon a validation failure, the request will be rejected
         * with a 4xx response and not sent to the backend.
         *
         * <p>In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics
         * while the request will follow the normal path.
         *
         * <p>{@code DISABLED} type turns the validation off.
         *
         * @param validationMode the value to set
         * @return this builder
         */
        public Builder validationMode(ValidationMode validationMode) {
            this.validationMode = validationMode;
            this.__explicitlySet__.add("validationMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BodyValidationRequestPolicy build() {
            BodyValidationRequestPolicy model =
                    new BodyValidationRequestPolicy(
                            this.required, this.content, this.validationMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BodyValidationRequestPolicy model) {
            if (model.wasPropertyExplicitlySet("required")) {
                this.required(model.getRequired());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("validationMode")) {
                this.validationMode(model.getValidationMode());
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

    /** Determines if the request body is required in the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Determines if the request body is required in the request.
     *
     * @return the value
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * The content of the request body. The key is a [media type
     * range](https://tools.ietf.org/html/rfc7231#appendix-D) subset restricted to the following
     * schema
     *
     * <p>key ::= ( / ( "*" "/" "*" ) / ( type "/" "*" ) / ( type "/" subtype ) )
     *
     * <p>For requests that match multiple keys, only the most specific key is applicable. e.g.
     * {@code text/plain} overrides {@code text/*}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final java.util.Map<String, ContentValidation> content;

    /**
     * The content of the request body. The key is a [media type
     * range](https://tools.ietf.org/html/rfc7231#appendix-D) subset restricted to the following
     * schema
     *
     * <p>key ::= ( / ( "*" "/" "*" ) / ( type "/" "*" ) / ( type "/" subtype ) )
     *
     * <p>For requests that match multiple keys, only the most specific key is applicable. e.g.
     * {@code text/plain} overrides {@code text/*}
     *
     * @return the value
     */
    public java.util.Map<String, ContentValidation> getContent() {
        return content;
    }

    /**
     * Validation behavior mode.
     *
     * <p>In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a
     * 4xx response and not sent to the backend.
     *
     * <p>In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while
     * the request will follow the normal path.
     *
     * <p>{@code DISABLED} type turns the validation off.
     */
    public enum ValidationMode implements com.oracle.bmc.http.internal.BmcEnum {
        Enforcing("ENFORCING"),
        Permissive("PERMISSIVE"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValidationMode.class);

        private final String value;
        private static java.util.Map<String, ValidationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationMode v : ValidationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValidationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Validation behavior mode.
     *
     * <p>In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a
     * 4xx response and not sent to the backend.
     *
     * <p>In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while
     * the request will follow the normal path.
     *
     * <p>{@code DISABLED} type turns the validation off.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
    private final ValidationMode validationMode;

    /**
     * Validation behavior mode.
     *
     * <p>In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a
     * 4xx response and not sent to the backend.
     *
     * <p>In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while
     * the request will follow the normal path.
     *
     * <p>{@code DISABLED} type turns the validation off.
     *
     * @return the value
     */
    public ValidationMode getValidationMode() {
        return validationMode;
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
        sb.append("BodyValidationRequestPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("required=").append(String.valueOf(this.required));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", validationMode=").append(String.valueOf(this.validationMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BodyValidationRequestPolicy)) {
            return false;
        }

        BodyValidationRequestPolicy other = (BodyValidationRequestPolicy) o;
        return java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.validationMode, other.validationMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMode == null ? 43 : this.validationMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
