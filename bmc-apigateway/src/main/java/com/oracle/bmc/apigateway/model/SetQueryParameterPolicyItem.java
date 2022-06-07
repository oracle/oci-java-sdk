/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Set will add a new query parameter if it was not in the original request.  If the parameter already exists on the
 * request, you can choose to override, append, or skip it.
 *
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
    builder = SetQueryParameterPolicyItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SetQueryParameterPolicyItem {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "values", "ifExists"})
    public SetQueryParameterPolicyItem(
            String name, java.util.List<String> values, IfExists ifExists) {
        super();
        this.name = name;
        this.values = values;
        this.ifExists = ifExists;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ifExists")
        private IfExists ifExists;

        public Builder ifExists(IfExists ifExists) {
            this.ifExists = ifExists;
            this.__explicitlySet__.add("ifExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SetQueryParameterPolicyItem build() {
            SetQueryParameterPolicyItem __instance__ =
                    new SetQueryParameterPolicyItem(name, values, ifExists);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetQueryParameterPolicyItem o) {
            Builder copiedBuilder =
                    name(o.getName()).values(o.getValues()).ifExists(o.getIfExists());

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
     * The case-sensitive name of the query parameter.  This name must be unique across transformation policies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A list of new values.  Each value can be a constant or may include one or more expressions enclosed within
     * ${} delimiters.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * If a query parameter with the same name already exists in the request, OVERWRITE will overwrite the value,
     * APPEND will append to the existing value, or SKIP will keep the existing value.
     *
     **/
    public enum IfExists {
        Overwrite("OVERWRITE"),
        Append("APPEND"),
        Skip("SKIP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IfExists.class);

        private final String value;
        private static java.util.Map<String, IfExists> map;

        static {
            map = new java.util.HashMap<>();
            for (IfExists v : IfExists.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IfExists(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IfExists create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IfExists', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If a query parameter with the same name already exists in the request, OVERWRITE will overwrite the value,
     * APPEND will append to the existing value, or SKIP will keep the existing value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ifExists")
    private final IfExists ifExists;

    public IfExists getIfExists() {
        return ifExists;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetQueryParameterPolicyItem(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", ifExists=").append(String.valueOf(this.ifExists));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetQueryParameterPolicyItem)) {
            return false;
        }

        SetQueryParameterPolicyItem other = (SetQueryParameterPolicyItem) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.ifExists, other.ifExists)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.ifExists == null ? 43 : this.ifExists.hashCode());
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
