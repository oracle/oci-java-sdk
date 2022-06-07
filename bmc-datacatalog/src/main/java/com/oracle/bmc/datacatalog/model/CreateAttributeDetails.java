/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAttributeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAttributeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "businessName",
        "description",
        "externalDataType",
        "isIncrementalData",
        "isNullable",
        "length",
        "position",
        "precision",
        "scale",
        "timeExternal",
        "minCollectionCount",
        "maxCollectionCount",
        "externalDatatypeEntityKey",
        "externalParentAttributeKey",
        "customPropertyMembers",
        "typeKey",
        "properties"
    })
    public CreateAttributeDetails(
            String displayName,
            String businessName,
            String description,
            String externalDataType,
            Boolean isIncrementalData,
            Boolean isNullable,
            Long length,
            Integer position,
            Integer precision,
            Integer scale,
            java.util.Date timeExternal,
            Integer minCollectionCount,
            Integer maxCollectionCount,
            String externalDatatypeEntityKey,
            String externalParentAttributeKey,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            String typeKey,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.externalDataType = externalDataType;
        this.isIncrementalData = isIncrementalData;
        this.isNullable = isNullable;
        this.length = length;
        this.position = position;
        this.precision = precision;
        this.scale = scale;
        this.timeExternal = timeExternal;
        this.minCollectionCount = minCollectionCount;
        this.maxCollectionCount = maxCollectionCount;
        this.externalDatatypeEntityKey = externalDatatypeEntityKey;
        this.externalParentAttributeKey = externalParentAttributeKey;
        this.customPropertyMembers = customPropertyMembers;
        this.typeKey = typeKey;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        public Builder businessName(String businessName) {
            this.businessName = businessName;
            this.__explicitlySet__.add("businessName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("minCollectionCount")
        private Integer minCollectionCount;

        public Builder minCollectionCount(Integer minCollectionCount) {
            this.minCollectionCount = minCollectionCount;
            this.__explicitlySet__.add("minCollectionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxCollectionCount")
        private Integer maxCollectionCount;

        public Builder maxCollectionCount(Integer maxCollectionCount) {
            this.maxCollectionCount = maxCollectionCount;
            this.__explicitlySet__.add("maxCollectionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
        private String externalDatatypeEntityKey;

        public Builder externalDatatypeEntityKey(String externalDatatypeEntityKey) {
            this.externalDatatypeEntityKey = externalDatatypeEntityKey;
            this.__explicitlySet__.add("externalDatatypeEntityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
        private String externalParentAttributeKey;

        public Builder externalParentAttributeKey(String externalParentAttributeKey) {
            this.externalParentAttributeKey = externalParentAttributeKey;
            this.__explicitlySet__.add("externalParentAttributeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
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
                            businessName,
                            description,
                            externalDataType,
                            isIncrementalData,
                            isNullable,
                            length,
                            position,
                            precision,
                            scale,
                            timeExternal,
                            minCollectionCount,
                            maxCollectionCount,
                            externalDatatypeEntityKey,
                            externalParentAttributeKey,
                            customPropertyMembers,
                            typeKey,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAttributeDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .businessName(o.getBusinessName())
                            .description(o.getDescription())
                            .externalDataType(o.getExternalDataType())
                            .isIncrementalData(o.getIsIncrementalData())
                            .isNullable(o.getIsNullable())
                            .length(o.getLength())
                            .position(o.getPosition())
                            .precision(o.getPrecision())
                            .scale(o.getScale())
                            .timeExternal(o.getTimeExternal())
                            .minCollectionCount(o.getMinCollectionCount())
                            .maxCollectionCount(o.getMaxCollectionCount())
                            .externalDatatypeEntityKey(o.getExternalDatatypeEntityKey())
                            .externalParentAttributeKey(o.getExternalParentAttributeKey())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .typeKey(o.getTypeKey())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional user friendly business name of the attribute. If set, this supplements the harvested display name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    public String getBusinessName() {
        return businessName;
    }

    /**
     * Detailed description of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Data type of the attribute as defined in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    private final String externalDataType;

    public String getExternalDataType() {
        return externalDataType;
    }

    /**
     * Property that identifies if this attribute can be used as a watermark to extract incremental data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncrementalData")
    private final Boolean isIncrementalData;

    public Boolean getIsIncrementalData() {
        return isIncrementalData;
    }

    /**
     * Property that identifies if this attribute can be assigned null values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    private final Boolean isNullable;

    public Boolean getIsNullable() {
        return isNullable;
    }

    /**
     * Max allowed length of the attribute value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Long length;

    public Long getLength() {
        return length;
    }

    /**
     * Position of the attribute in the record definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    public Integer getPosition() {
        return position;
    }

    /**
     * Precision of the attribute value usually applies to float data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Integer precision;

    public Integer getPrecision() {
        return precision;
    }

    /**
     * Scale of the attribute value usually applies to float data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    private final Integer scale;

    public Integer getScale() {
        return scale;
    }

    /**
     * Last modified timestamp of this object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    private final java.util.Date timeExternal;

    public java.util.Date getTimeExternal() {
        return timeExternal;
    }

    /**
     * The minimum count for the number of instances of a given type stored in this collection type attribute,applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minCollectionCount")
    private final Integer minCollectionCount;

    public Integer getMinCollectionCount() {
        return minCollectionCount;
    }

    /**
     * The maximum count for the number of instances of a given type stored in this collection type attribute,applicable if this attribute is a complex type.
     * For type specifications in systems that specify only "capacity" without upper or lower bound , this property can also be used to just mean "capacity".
     * Some examples are Varray size in Oracle , Occurs Clause in Cobol , capacity in XmlSchemaObjectCollection , maxOccurs in  Xml , maxItems in Json
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCollectionCount")
    private final Integer maxCollectionCount;

    public Integer getMaxCollectionCount() {
        return maxCollectionCount;
    }

    /**
     * External entity key that represents the datatype of this attribute , applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
    private final String externalDatatypeEntityKey;

    public String getExternalDatatypeEntityKey() {
        return externalDatatypeEntityKey;
    }

    /**
     * External attribute key that represents the parent attribute  of this attribute , applicable if the parent attribute is of complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
    private final String externalParentAttributeKey;

    public String getExternalParentAttributeKey() {
        return externalParentAttributeKey;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    public String getTypeKey() {
        return typeKey;
    }

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each attribute type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * attributes have required properties within the "default" category. To determine the set of required and
     * optional properties for an attribute type, a query can be done on '/types?type=attribute' that returns a
     * collection of all attribute types. The appropriate attribute type, which will include definitions of all
     * of it's properties, can be identified from this collection.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAttributeDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", externalDataType=").append(String.valueOf(this.externalDataType));
        sb.append(", isIncrementalData=").append(String.valueOf(this.isIncrementalData));
        sb.append(", isNullable=").append(String.valueOf(this.isNullable));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", scale=").append(String.valueOf(this.scale));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", minCollectionCount=").append(String.valueOf(this.minCollectionCount));
        sb.append(", maxCollectionCount=").append(String.valueOf(this.maxCollectionCount));
        sb.append(", externalDatatypeEntityKey=")
                .append(String.valueOf(this.externalDatatypeEntityKey));
        sb.append(", externalParentAttributeKey=")
                .append(String.valueOf(this.externalParentAttributeKey));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAttributeDetails)) {
            return false;
        }

        CreateAttributeDetails other = (CreateAttributeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.externalDataType, other.externalDataType)
                && java.util.Objects.equals(this.isIncrementalData, other.isIncrementalData)
                && java.util.Objects.equals(this.isNullable, other.isNullable)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.scale, other.scale)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.minCollectionCount, other.minCollectionCount)
                && java.util.Objects.equals(this.maxCollectionCount, other.maxCollectionCount)
                && java.util.Objects.equals(
                        this.externalDatatypeEntityKey, other.externalDatatypeEntityKey)
                && java.util.Objects.equals(
                        this.externalParentAttributeKey, other.externalParentAttributeKey)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDataType == null ? 43 : this.externalDataType.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncrementalData == null ? 43 : this.isIncrementalData.hashCode());
        result = (result * PRIME) + (this.isNullable == null ? 43 : this.isNullable.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.scale == null ? 43 : this.scale.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result =
                (result * PRIME)
                        + (this.minCollectionCount == null
                                ? 43
                                : this.minCollectionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxCollectionCount == null
                                ? 43
                                : this.maxCollectionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatatypeEntityKey == null
                                ? 43
                                : this.externalDatatypeEntityKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalParentAttributeKey == null
                                ? 43
                                : this.externalParentAttributeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
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
