/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Detector rule additional property field <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdditionalConfigPropertyDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdditionalConfigPropertyDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"propertyType", "key", "value"})
    public AdditionalConfigPropertyDefinition(PropertyType propertyType, String key, String value) {
        super();
        this.propertyType = propertyType;
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Property Type */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
        private PropertyType propertyType;

        /**
         * Property Type
         *
         * @param propertyType the value to set
         * @return this builder
         */
        public Builder propertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            this.__explicitlySet__.add("propertyType");
            return this;
        }
        /** Name for Additional Property, for example, "interpreter", "router" */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Name for Additional Property, for example, "interpreter", "router"
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Value for Property Name, for example, "generic", "cloudguard" */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value for Property Name, for example, "generic", "cloudguard"
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalConfigPropertyDefinition build() {
            AdditionalConfigPropertyDefinition model =
                    new AdditionalConfigPropertyDefinition(this.propertyType, this.key, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalConfigPropertyDefinition model) {
            if (model.wasPropertyExplicitlySet("propertyType")) {
                this.propertyType(model.getPropertyType());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /** Property Type */
    public enum PropertyType implements com.oracle.bmc.http.internal.BmcEnum {
        Hint("HINT"),
        Range("RANGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PropertyType.class);

        private final String value;
        private static java.util.Map<String, PropertyType> map;

        static {
            map = new java.util.HashMap<>();
            for (PropertyType v : PropertyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PropertyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PropertyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PropertyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Property Type */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
    private final PropertyType propertyType;

    /**
     * Property Type
     *
     * @return the value
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /** Name for Additional Property, for example, "interpreter", "router" */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Name for Additional Property, for example, "interpreter", "router"
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Value for Property Name, for example, "generic", "cloudguard" */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value for Property Name, for example, "generic", "cloudguard"
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("AdditionalConfigPropertyDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("propertyType=").append(String.valueOf(this.propertyType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalConfigPropertyDefinition)) {
            return false;
        }

        AdditionalConfigPropertyDefinition other = (AdditionalConfigPropertyDefinition) o;
        return java.util.Objects.equals(this.propertyType, other.propertyType)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.propertyType == null ? 43 : this.propertyType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
