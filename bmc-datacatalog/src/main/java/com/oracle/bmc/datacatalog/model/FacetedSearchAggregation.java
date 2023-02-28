/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Aggregation/facets on properties of data object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FacetedSearchAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FacetedSearchAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "aggregation", "dataType", "propertyType"})
    public FacetedSearchAggregation(
            String type,
            java.util.Map<String, Long> aggregation,
            String dataType,
            PropertyType propertyType) {
        super();
        this.type = type;
        this.aggregation = aggregation;
        this.dataType = dataType;
        this.propertyType = propertyType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of data object property */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Name of data object property
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Count of number of data objects having property. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
        private java.util.Map<String, Long> aggregation;

        /**
         * Count of number of data objects having property.
         *
         * @param aggregation the value to set
         * @return this builder
         */
        public Builder aggregation(java.util.Map<String, Long> aggregation) {
            this.aggregation = aggregation;
            this.__explicitlySet__.add("aggregation");
            return this;
        }
        /** Data type of object property. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * Data type of object property.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * Type of property that indicates if it was defined by the user or system. CUSTOM_PROPERTY
         * is defined by the user on a data object. DEFAULT_PROPERTY is defined by the system on a
         * data object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
        private PropertyType propertyType;

        /**
         * Type of property that indicates if it was defined by the user or system. CUSTOM_PROPERTY
         * is defined by the user on a data object. DEFAULT_PROPERTY is defined by the system on a
         * data object.
         *
         * @param propertyType the value to set
         * @return this builder
         */
        public Builder propertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            this.__explicitlySet__.add("propertyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchAggregation build() {
            FacetedSearchAggregation model =
                    new FacetedSearchAggregation(
                            this.type, this.aggregation, this.dataType, this.propertyType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchAggregation model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("aggregation")) {
                this.aggregation(model.getAggregation());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("propertyType")) {
                this.propertyType(model.getPropertyType());
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

    /** Name of data object property */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Name of data object property
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Count of number of data objects having property. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
    private final java.util.Map<String, Long> aggregation;

    /**
     * Count of number of data objects having property.
     *
     * @return the value
     */
    public java.util.Map<String, Long> getAggregation() {
        return aggregation;
    }

    /** Data type of object property. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * Data type of object property.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Type of property that indicates if it was defined by the user or system. CUSTOM_PROPERTY is
     * defined by the user on a data object. DEFAULT_PROPERTY is defined by the system on a data
     * object.
     */
    public enum PropertyType implements com.oracle.bmc.http.internal.BmcEnum {
        CustomProperty("CUSTOM_PROPERTY"),
        DefaultProperty("DEFAULT_PROPERTY"),

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
    /**
     * Type of property that indicates if it was defined by the user or system. CUSTOM_PROPERTY is
     * defined by the user on a data object. DEFAULT_PROPERTY is defined by the system on a data
     * object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
    private final PropertyType propertyType;

    /**
     * Type of property that indicates if it was defined by the user or system. CUSTOM_PROPERTY is
     * defined by the user on a data object. DEFAULT_PROPERTY is defined by the system on a data
     * object.
     *
     * @return the value
     */
    public PropertyType getPropertyType() {
        return propertyType;
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
        sb.append("FacetedSearchAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", aggregation=").append(String.valueOf(this.aggregation));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", propertyType=").append(String.valueOf(this.propertyType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FacetedSearchAggregation)) {
            return false;
        }

        FacetedSearchAggregation other = (FacetedSearchAggregation) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.aggregation, other.aggregation)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.propertyType, other.propertyType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.aggregation == null ? 43 : this.aggregation.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.propertyType == null ? 43 : this.propertyType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
