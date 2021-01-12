/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Aggregation/facets on properties of data object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FacetedSearchAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FacetedSearchAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
        private java.util.Map<String, Long> aggregation;

        public Builder aggregation(java.util.Map<String, Long> aggregation) {
            this.aggregation = aggregation;
            this.__explicitlySet__.add("aggregation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
        private PropertyType propertyType;

        public Builder propertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            this.__explicitlySet__.add("propertyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchAggregation build() {
            FacetedSearchAggregation __instance__ =
                    new FacetedSearchAggregation(type, aggregation, dataType, propertyType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchAggregation o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .aggregation(o.getAggregation())
                            .dataType(o.getDataType())
                            .propertyType(o.getPropertyType());

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

    /**
     * Name of data object property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * Count of number of data objects having property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregation")
    java.util.Map<String, Long> aggregation;

    /**
     * Data type of object property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;
    /**
     * Type of property that indicates if it was defined by the user or system.
     * CUSTOM_PROPERTY is defined by the user on a data object.
     * DEFAULT_PROPERTY is defined by the system on a data object.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PropertyType {
        CustomProperty("CUSTOM_PROPERTY"),
        DefaultProperty("DEFAULT_PROPERTY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Type of property that indicates if it was defined by the user or system.
     * CUSTOM_PROPERTY is defined by the user on a data object.
     * DEFAULT_PROPERTY is defined by the system on a data object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
    PropertyType propertyType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
