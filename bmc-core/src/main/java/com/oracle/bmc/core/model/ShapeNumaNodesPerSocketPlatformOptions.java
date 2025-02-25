/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration options for NUMA nodes per socket.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeNumaNodesPerSocketPlatformOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeNumaNodesPerSocketPlatformOptions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowedValues", "defaultValue"})
    public ShapeNumaNodesPerSocketPlatformOptions(
            java.util.List<AllowedValues> allowedValues, String defaultValue) {
        super();
        this.allowedValues = allowedValues;
        this.defaultValue = defaultValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The supported values for this platform configuration property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<AllowedValues> allowedValues;

        /**
         * The supported values for this platform configuration property.
         *
         * @param allowedValues the value to set
         * @return this builder
         **/
        public Builder allowedValues(java.util.List<AllowedValues> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /**
         * The default NUMA nodes per socket configuration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default NUMA nodes per socket configuration.
         *
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeNumaNodesPerSocketPlatformOptions build() {
            ShapeNumaNodesPerSocketPlatformOptions model =
                    new ShapeNumaNodesPerSocketPlatformOptions(
                            this.allowedValues, this.defaultValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeNumaNodesPerSocketPlatformOptions model) {
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
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
     **/
    public enum AllowedValues {
        Nps0("NPS0"),
        Nps1("NPS1"),
        Nps2("NPS2"),
        Nps4("NPS4"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllowedValues.class);

        private final String value;
        private static java.util.Map<String, AllowedValues> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedValues v : AllowedValues.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedValues(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedValues create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedValues', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The supported values for this platform configuration property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<AllowedValues> allowedValues;

    /**
     * The supported values for this platform configuration property.
     *
     * @return the value
     **/
    public java.util.List<AllowedValues> getAllowedValues() {
        return allowedValues;
    }

    /**
     * The default NUMA nodes per socket configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default NUMA nodes per socket configuration.
     *
     * @return the value
     **/
    public String getDefaultValue() {
        return defaultValue;
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
        sb.append("ShapeNumaNodesPerSocketPlatformOptions(");
        sb.append("super=").append(super.toString());
        sb.append("allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeNumaNodesPerSocketPlatformOptions)) {
            return false;
        }

        ShapeNumaNodesPerSocketPlatformOptions other = (ShapeNumaNodesPerSocketPlatformOptions) o;
        return java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
