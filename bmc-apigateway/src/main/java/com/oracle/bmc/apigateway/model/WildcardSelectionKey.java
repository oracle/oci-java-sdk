/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * When dynamically routing and dynamically authenticating requests, the route or authentication
 * server associated with a selection key containing a wildcard is used if the context variable in
 * an incoming request matches that key. <br>
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
        builder = WildcardSelectionKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WildcardSelectionKey extends DynamicSelectionKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A selection key string containing a wildcard to match with the context variable in an
         * incoming request. If the context variable matches the string, the request is sent to the
         * route or authentication server associated with the selection key. Valid wildcards are '*'
         * (zero or more characters) and '+' (one or more characters). The string can only contain
         * one wildcard, and the wildcard must be at the start or the end of the string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * A selection key string containing a wildcard to match with the context variable in an
         * incoming request. If the context variable matches the string, the request is sent to the
         * route or authentication server associated with the selection key. Valid wildcards are '*'
         * (zero or more characters) and '+' (one or more characters). The string can only contain
         * one wildcard, and the wildcard must be at the start or the end of the string.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WildcardSelectionKey build() {
            WildcardSelectionKey model =
                    new WildcardSelectionKey(this.isDefault, this.name, this.expression);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WildcardSelectionKey model) {
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
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
    public WildcardSelectionKey(Boolean isDefault, String name, String expression) {
        super(isDefault, name);
        this.expression = expression;
    }

    /**
     * A selection key string containing a wildcard to match with the context variable in an
     * incoming request. If the context variable matches the string, the request is sent to the
     * route or authentication server associated with the selection key. Valid wildcards are '*'
     * (zero or more characters) and '+' (one or more characters). The string can only contain one
     * wildcard, and the wildcard must be at the start or the end of the string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * A selection key string containing a wildcard to match with the context variable in an
     * incoming request. If the context variable matches the string, the request is sent to the
     * route or authentication server associated with the selection key. Valid wildcards are '*'
     * (zero or more characters) and '+' (one or more characters). The string can only contain one
     * wildcard, and the wildcard must be at the start or the end of the string.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
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
        sb.append("WildcardSelectionKey(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WildcardSelectionKey)) {
            return false;
        }

        WildcardSelectionKey other = (WildcardSelectionKey) o;
        return java.util.Objects.equals(this.expression, other.expression) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        return result;
    }
}
