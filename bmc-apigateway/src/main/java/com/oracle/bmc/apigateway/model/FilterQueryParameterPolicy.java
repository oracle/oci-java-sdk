/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Filter parameters from the query string as they pass through the gateway. The gateway applies
 * filters after other transformations, so any parameters set or renamed must also be listed here
 * when using an ALLOW type policy. <br>
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
        builder = FilterQueryParameterPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FilterQueryParameterPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "items"})
    public FilterQueryParameterPolicy(
            Type type, java.util.List<FilterQueryParameterPolicyItem> items) {
        super();
        this.type = type;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * BLOCK drops any query parameters that are in the list of items, so it acts as an
         * exclusion list. ALLOW permits only the parameters in the list and removes all others, so
         * it acts as an inclusion list.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * BLOCK drops any query parameters that are in the list of items, so it acts as an
         * exclusion list. ALLOW permits only the parameters in the list and removes all others, so
         * it acts as an inclusion list.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The list of query parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<FilterQueryParameterPolicyItem> items;

        /**
         * The list of query parameters.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<FilterQueryParameterPolicyItem> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterQueryParameterPolicy build() {
            FilterQueryParameterPolicy model =
                    new FilterQueryParameterPolicy(this.type, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterQueryParameterPolicy model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /**
     * BLOCK drops any query parameters that are in the list of items, so it acts as an exclusion
     * list. ALLOW permits only the parameters in the list and removes all others, so it acts as an
     * inclusion list.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
        Block("BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * BLOCK drops any query parameters that are in the list of items, so it acts as an exclusion
     * list. ALLOW permits only the parameters in the list and removes all others, so it acts as an
     * inclusion list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * BLOCK drops any query parameters that are in the list of items, so it acts as an exclusion
     * list. ALLOW permits only the parameters in the list and removes all others, so it acts as an
     * inclusion list.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The list of query parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<FilterQueryParameterPolicyItem> items;

    /**
     * The list of query parameters.
     *
     * @return the value
     */
    public java.util.List<FilterQueryParameterPolicyItem> getItems() {
        return items;
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
        sb.append("FilterQueryParameterPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterQueryParameterPolicy)) {
            return false;
        }

        FilterQueryParameterPolicy other = (FilterQueryParameterPolicy) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
