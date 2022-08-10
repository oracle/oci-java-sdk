/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate the HTTP headers on the incoming API requests on a specific route.
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
    builder = HeaderValidationRequestPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HeaderValidationRequestPolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"headers", "validationMode"})
    public HeaderValidationRequestPolicy(
            java.util.List<HeaderValidationItem> headers, ValidationMode validationMode) {
        super();
        this.headers = headers;
        this.validationMode = validationMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<HeaderValidationItem> headers;

        public Builder headers(java.util.List<HeaderValidationItem> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
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

        public HeaderValidationRequestPolicy build() {
            HeaderValidationRequestPolicy model =
                    new HeaderValidationRequestPolicy(this.headers, this.validationMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeaderValidationRequestPolicy model) {
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("validationMode")) {
                this.validationMode(model.getValidationMode());
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

    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.List<HeaderValidationItem> headers;

    public java.util.List<HeaderValidationItem> getHeaders() {
        return headers;
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HeaderValidationRequestPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("headers=").append(String.valueOf(this.headers));
        sb.append(", validationMode=").append(String.valueOf(this.validationMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeaderValidationRequestPolicy)) {
            return false;
        }

        HeaderValidationRequestPolicy other = (HeaderValidationRequestPolicy) o;
        return java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(this.validationMode, other.validationMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMode == null ? 43 : this.validationMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
