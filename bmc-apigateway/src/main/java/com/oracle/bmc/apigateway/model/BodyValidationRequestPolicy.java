/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate the payload body of the incoming API requests on a specific route.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BodyValidationRequestPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BodyValidationRequestPolicy {
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
        /**
         * Determines if the request body is required in the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Determines if the request body is required in the request.
         * @param required the value to set
         * @return this builder
         **/
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * The content of the request body. The key is a [media type range](https://tools.ietf.org/html/rfc7231#appendix-D)
         * subset restricted to the following schema
         * <p>
         * key ::= (
         *           / (  "*" "/" "*" )
         *           / ( type "/" "*" )
         *           / ( type "/" subtype )
         *           )
         * <p>
         * For requests that match multiple keys, only the most specific key is applicable.
         * e.g. {@code text/plain} overrides {@code text/*}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private java.util.Map<String, ContentValidation> content;

        /**
         * The content of the request body. The key is a [media type range](https://tools.ietf.org/html/rfc7231#appendix-D)
         * subset restricted to the following schema
         * <p>
         * key ::= (
         *           / (  "*" "/" "*" )
         *           / ( type "/" "*" )
         *           / ( type "/" subtype )
         *           )
         * <p>
         * For requests that match multiple keys, only the most specific key is applicable.
         * e.g. {@code text/plain} overrides {@code text/*}
         *
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(java.util.Map<String, ContentValidation> content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * Validation behavior mode.
         * <p>
         * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
         * and not sent to the backend.
         * <p>
         * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
         * will follow the normal path.
         * <p>
         * {@code DISABLED} type turns the validation off.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
        private ValidationMode validationMode;

        /**
         * Validation behavior mode.
         * <p>
         * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
         * and not sent to the backend.
         * <p>
         * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
         * will follow the normal path.
         * <p>
         * {@code DISABLED} type turns the validation off.
         *
         * @param validationMode the value to set
         * @return this builder
         **/
        public Builder validationMode(ValidationMode validationMode) {
            this.validationMode = validationMode;
            this.__explicitlySet__.add("validationMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BodyValidationRequestPolicy build() {
            BodyValidationRequestPolicy __instance__ =
                    new BodyValidationRequestPolicy(required, content, validationMode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BodyValidationRequestPolicy o) {
            Builder copiedBuilder =
                    required(o.getRequired())
                            .content(o.getContent())
                            .validationMode(o.getValidationMode());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Determines if the request body is required in the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Determines if the request body is required in the request.
     * @return the value
     **/
    public Boolean getRequired() {
        return required;
    }

    /**
     * The content of the request body. The key is a [media type range](https://tools.ietf.org/html/rfc7231#appendix-D)
     * subset restricted to the following schema
     * <p>
     * key ::= (
     *           / (  "*" "/" "*" )
     *           / ( type "/" "*" )
     *           / ( type "/" subtype )
     *           )
     * <p>
     * For requests that match multiple keys, only the most specific key is applicable.
     * e.g. {@code text/plain} overrides {@code text/*}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final java.util.Map<String, ContentValidation> content;

    /**
     * The content of the request body. The key is a [media type range](https://tools.ietf.org/html/rfc7231#appendix-D)
     * subset restricted to the following schema
     * <p>
     * key ::= (
     *           / (  "*" "/" "*" )
     *           / ( type "/" "*" )
     *           / ( type "/" subtype )
     *           )
     * <p>
     * For requests that match multiple keys, only the most specific key is applicable.
     * e.g. {@code text/plain} overrides {@code text/*}
     *
     * @return the value
     **/
    public java.util.Map<String, ContentValidation> getContent() {
        return content;
    }

    /**
     * Validation behavior mode.
     * <p>
     * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
     * and not sent to the backend.
     * <p>
     * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
     * will follow the normal path.
     * <p>
     * {@code DISABLED} type turns the validation off.
     *
     **/
    public enum ValidationMode {
        Enforcing("ENFORCING"),
        Permissive("PERMISSIVE"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, ValidationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationMode v : ValidationMode.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ValidationMode: " + key);
        }
    };
    /**
     * Validation behavior mode.
     * <p>
     * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
     * and not sent to the backend.
     * <p>
     * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
     * will follow the normal path.
     * <p>
     * {@code DISABLED} type turns the validation off.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
    private final ValidationMode validationMode;

    /**
     * Validation behavior mode.
     * <p>
     * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
     * and not sent to the backend.
     * <p>
     * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
     * will follow the normal path.
     * <p>
     * {@code DISABLED} type turns the validation off.
     *
     * @return the value
     **/
    public ValidationMode getValidationMode() {
        return validationMode;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BodyValidationRequestPolicy(");
        sb.append("required=").append(String.valueOf(this.required));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", validationMode=").append(String.valueOf(this.validationMode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
