/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Defines an property of a macro, variable or query. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PropertyDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PropertyDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "type", "isGlobal"})
    public PropertyDefinition(String name, String value, Type type, Boolean isGlobal) {
        super();
        this.name = name;
        this.value = value;
        this.type = type;
        this.isGlobal = isGlobal;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the property.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Value of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the property.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Type of the property. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the property.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** True if property is for all macros. Not applicable for macro variables or query. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGlobal")
        private Boolean isGlobal;

        /**
         * True if property is for all macros. Not applicable for macro variables or query.
         *
         * @param isGlobal the value to set
         * @return this builder
         */
        public Builder isGlobal(Boolean isGlobal) {
            this.isGlobal = isGlobal;
            this.__explicitlySet__.add("isGlobal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertyDefinition build() {
            PropertyDefinition model =
                    new PropertyDefinition(this.name, this.value, this.type, this.isGlobal);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertyDefinition model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isGlobal")) {
                this.isGlobal(model.getIsGlobal());
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

    /** Name of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the property.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Value of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the property.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Type of the property. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        String("STRING"),
        Double("DOUBLE"),
        Float("FLOAT"),
        Long("LONG"),
        Integer("INTEGER"),
        Timestamp("TIMESTAMP"),

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
    /** Type of the property. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the property.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** True if property is for all macros. Not applicable for macro variables or query. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGlobal")
    private final Boolean isGlobal;

    /**
     * True if property is for all macros. Not applicable for macro variables or query.
     *
     * @return the value
     */
    public Boolean getIsGlobal() {
        return isGlobal;
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
        sb.append("PropertyDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isGlobal=").append(String.valueOf(this.isGlobal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertyDefinition)) {
            return false;
        }

        PropertyDefinition other = (PropertyDefinition) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isGlobal, other.isGlobal)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isGlobal == null ? 43 : this.isGlobal.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
