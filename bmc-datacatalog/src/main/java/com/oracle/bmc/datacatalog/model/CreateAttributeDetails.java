/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in attribute create operations.
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
    builder = CreateAttributeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAttributeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
        private String externalDataType;

        public Builder externalDataType(String externalDataType) {
            this.externalDataType = externalDataType;
            this.__explicitlySet__.add("externalDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncrementalData")
        private Boolean isIncrementalData;

        public Builder isIncrementalData(Boolean isIncrementalData) {
            this.isIncrementalData = isIncrementalData;
            this.__explicitlySet__.add("isIncrementalData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
        private Boolean isNullable;

        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            this.__explicitlySet__.add("isNullable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Long length;

        public Builder length(Long length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Integer precision;

        public Builder precision(Integer precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scale")
        private Integer scale;

        public Builder scale(Integer scale) {
            this.scale = scale;
            this.__explicitlySet__.add("scale");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAttributeDetails build() {
            CreateAttributeDetails __instance__ =
                    new CreateAttributeDetails(
                            displayName,
                            description,
                            externalDataType,
                            isIncrementalData,
                            isNullable,
                            length,
                            position,
                            precision,
                            scale,
                            timeExternal,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAttributeDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .externalDataType(o.getExternalDataType())
                            .isIncrementalData(o.getIsIncrementalData())
                            .isNullable(o.getIsNullable())
                            .length(o.getLength())
                            .position(o.getPosition())
                            .precision(o.getPrecision())
                            .scale(o.getScale())
                            .timeExternal(o.getTimeExternal())
                            .properties(o.getProperties());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Data type of the attribute as defined in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    String externalDataType;

    /**
     * Property that identifies if this attribute can be used as a watermark to extract incremental data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncrementalData")
    Boolean isIncrementalData;

    /**
     * Property that identifies if this attribute can be assigned null values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    Boolean isNullable;

    /**
     * Max allowed length of the attribute value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    Long length;

    /**
     * Position of the attribute in the record definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Integer position;

    /**
     * Precision of the attribute value usually applies to float data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    Integer precision;

    /**
     * Scale of the attribute value usually applies to float data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    Integer scale;

    /**
     * Last modified timestamp of this object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    java.util.Date timeExternal;

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each attribute type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * attributes have required properties within the \"default\" category. To determine the set of required and
     * optional properties for an attribute type, a query can be done on '/types?type=attribute' that returns a
     * collection of all attribute types. The appropriate attribute type, which will include definitions of all
     * of it's properties, can be identified from this collection.
     * Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
