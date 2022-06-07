/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of an entity attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AttributeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AttributeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "businessName",
        "description",
        "entityKey",
        "externalKey",
        "length",
        "position",
        "precision",
        "scale",
        "isNullable",
        "uri",
        "lifecycleState",
        "timeCreated",
        "externalDataType",
        "typeKey",
        "minCollectionCount",
        "maxCollectionCount",
        "datatypeEntityKey",
        "externalDatatypeEntityKey",
        "parentAttributeKey",
        "externalParentAttributeKey",
        "path",
        "customPropertyMembers",
        "associatedRuleTypes",
        "isDerivedAttribute",
        "timeUpdated",
        "properties"
    })
    public AttributeSummary(
            String key,
            String displayName,
            String businessName,
            String description,
            String entityKey,
            String externalKey,
            Long length,
            Integer position,
            Integer precision,
            Integer scale,
            Boolean isNullable,
            String uri,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String externalDataType,
            String typeKey,
            Integer minCollectionCount,
            Integer maxCollectionCount,
            String datatypeEntityKey,
            String externalDatatypeEntityKey,
            String parentAttributeKey,
            String externalParentAttributeKey,
            String path,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers,
            java.util.List<RuleType> associatedRuleTypes,
            Boolean isDerivedAttribute,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.entityKey = entityKey;
        this.externalKey = externalKey;
        this.length = length;
        this.position = position;
        this.precision = precision;
        this.scale = scale;
        this.isNullable = isNullable;
        this.uri = uri;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.externalDataType = externalDataType;
        this.typeKey = typeKey;
        this.minCollectionCount = minCollectionCount;
        this.maxCollectionCount = maxCollectionCount;
        this.datatypeEntityKey = datatypeEntityKey;
        this.externalDatatypeEntityKey = externalDatatypeEntityKey;
        this.parentAttributeKey = parentAttributeKey;
        this.externalParentAttributeKey = externalParentAttributeKey;
        this.path = path;
        this.customPropertyMembers = customPropertyMembers;
        this.associatedRuleTypes = associatedRuleTypes;
        this.isDerivedAttribute = isDerivedAttribute;
        this.timeUpdated = timeUpdated;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
        private String entityKey;

        public Builder entityKey(String entityKey) {
            this.entityKey = entityKey;
            this.__explicitlySet__.add("entityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
        private Boolean isNullable;

        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            this.__explicitlySet__.add("isNullable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
        private String externalDataType;

        public Builder externalDataType(String externalDataType) {
            this.externalDataType = externalDataType;
            this.__explicitlySet__.add("externalDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("datatypeEntityKey")
        private String datatypeEntityKey;

        public Builder datatypeEntityKey(String datatypeEntityKey) {
            this.datatypeEntityKey = datatypeEntityKey;
            this.__explicitlySet__.add("datatypeEntityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
        private String externalDatatypeEntityKey;

        public Builder externalDatatypeEntityKey(String externalDatatypeEntityKey) {
            this.externalDatatypeEntityKey = externalDatatypeEntityKey;
            this.__explicitlySet__.add("externalDatatypeEntityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentAttributeKey")
        private String parentAttributeKey;

        public Builder parentAttributeKey(String parentAttributeKey) {
            this.parentAttributeKey = parentAttributeKey;
            this.__explicitlySet__.add("parentAttributeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
        private String externalParentAttributeKey;

        public Builder externalParentAttributeKey(String externalParentAttributeKey) {
            this.externalParentAttributeKey = externalParentAttributeKey;
            this.__explicitlySet__.add("externalParentAttributeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertyGetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedRuleTypes")
        private java.util.List<RuleType> associatedRuleTypes;

        public Builder associatedRuleTypes(java.util.List<RuleType> associatedRuleTypes) {
            this.associatedRuleTypes = associatedRuleTypes;
            this.__explicitlySet__.add("associatedRuleTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDerivedAttribute")
        private Boolean isDerivedAttribute;

        public Builder isDerivedAttribute(Boolean isDerivedAttribute) {
            this.isDerivedAttribute = isDerivedAttribute;
            this.__explicitlySet__.add("isDerivedAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        public AttributeSummary build() {
            AttributeSummary __instance__ =
                    new AttributeSummary(
                            key,
                            displayName,
                            businessName,
                            description,
                            entityKey,
                            externalKey,
                            length,
                            position,
                            precision,
                            scale,
                            isNullable,
                            uri,
                            lifecycleState,
                            timeCreated,
                            externalDataType,
                            typeKey,
                            minCollectionCount,
                            maxCollectionCount,
                            datatypeEntityKey,
                            externalDatatypeEntityKey,
                            parentAttributeKey,
                            externalParentAttributeKey,
                            path,
                            customPropertyMembers,
                            associatedRuleTypes,
                            isDerivedAttribute,
                            timeUpdated,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributeSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .businessName(o.getBusinessName())
                            .description(o.getDescription())
                            .entityKey(o.getEntityKey())
                            .externalKey(o.getExternalKey())
                            .length(o.getLength())
                            .position(o.getPosition())
                            .precision(o.getPrecision())
                            .scale(o.getScale())
                            .isNullable(o.getIsNullable())
                            .uri(o.getUri())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .externalDataType(o.getExternalDataType())
                            .typeKey(o.getTypeKey())
                            .minCollectionCount(o.getMinCollectionCount())
                            .maxCollectionCount(o.getMaxCollectionCount())
                            .datatypeEntityKey(o.getDatatypeEntityKey())
                            .externalDatatypeEntityKey(o.getExternalDatatypeEntityKey())
                            .parentAttributeKey(o.getParentAttributeKey())
                            .externalParentAttributeKey(o.getExternalParentAttributeKey())
                            .path(o.getPath())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .associatedRuleTypes(o.getAssociatedRuleTypes())
                            .isDerivedAttribute(o.getIsDerivedAttribute())
                            .timeUpdated(o.getTimeUpdated())
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
     * Unique attribute key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
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
     * The unique key of the parent entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
    private final String entityKey;

    public String getEntityKey() {
        return entityKey;
    }

    /**
     * Unique external key of this attribute in the external source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    public String getExternalKey() {
        return externalKey;
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
     * Property that identifies if this attribute can be assigned null values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    private final Boolean isNullable;

    public Boolean getIsNullable() {
        return isNullable;
    }

    /**
     * URI to the attribute instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    /**
     * State of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the attribute was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Data type of the attribute as defined in the external source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    private final String externalDataType;

    public String getExternalDataType() {
        return externalDataType;
    }

    /**
     * The type of the attribute. Type keys can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    public String getTypeKey() {
        return typeKey;
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
     * Entity key that represents the datatype of this attribute , applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatypeEntityKey")
    private final String datatypeEntityKey;

    public String getDatatypeEntityKey() {
        return datatypeEntityKey;
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
     * Attribute key that represents the parent attribute of this attribute , applicable if the parent attribute is of complex datatype.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentAttributeKey")
    private final String parentAttributeKey;

    public String getParentAttributeKey() {
        return parentAttributeKey;
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
     * Full path of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    public String getPath() {
        return path;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    public java.util.List<CustomPropertyGetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * Rule types associated with attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedRuleTypes")
    private final java.util.List<RuleType> associatedRuleTypes;

    public java.util.List<RuleType> getAssociatedRuleTypes() {
        return associatedRuleTypes;
    }

    /**
     * Whether a column is derived or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDerivedAttribute")
    private final Boolean isDerivedAttribute;

    public Boolean getIsDerivedAttribute() {
        return isDerivedAttribute;
    }

    /**
     * The last time that any change was made to the attribute. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each attribute type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * attributes have required properties within the "default" category.
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
        sb.append("AttributeSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", entityKey=").append(String.valueOf(this.entityKey));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", scale=").append(String.valueOf(this.scale));
        sb.append(", isNullable=").append(String.valueOf(this.isNullable));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", externalDataType=").append(String.valueOf(this.externalDataType));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", minCollectionCount=").append(String.valueOf(this.minCollectionCount));
        sb.append(", maxCollectionCount=").append(String.valueOf(this.maxCollectionCount));
        sb.append(", datatypeEntityKey=").append(String.valueOf(this.datatypeEntityKey));
        sb.append(", externalDatatypeEntityKey=")
                .append(String.valueOf(this.externalDatatypeEntityKey));
        sb.append(", parentAttributeKey=").append(String.valueOf(this.parentAttributeKey));
        sb.append(", externalParentAttributeKey=")
                .append(String.valueOf(this.externalParentAttributeKey));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", associatedRuleTypes=").append(String.valueOf(this.associatedRuleTypes));
        sb.append(", isDerivedAttribute=").append(String.valueOf(this.isDerivedAttribute));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof AttributeSummary)) {
            return false;
        }

        AttributeSummary other = (AttributeSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.entityKey, other.entityKey)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.scale, other.scale)
                && java.util.Objects.equals(this.isNullable, other.isNullable)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.externalDataType, other.externalDataType)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.minCollectionCount, other.minCollectionCount)
                && java.util.Objects.equals(this.maxCollectionCount, other.maxCollectionCount)
                && java.util.Objects.equals(this.datatypeEntityKey, other.datatypeEntityKey)
                && java.util.Objects.equals(
                        this.externalDatatypeEntityKey, other.externalDatatypeEntityKey)
                && java.util.Objects.equals(this.parentAttributeKey, other.parentAttributeKey)
                && java.util.Objects.equals(
                        this.externalParentAttributeKey, other.externalParentAttributeKey)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.associatedRuleTypes, other.associatedRuleTypes)
                && java.util.Objects.equals(this.isDerivedAttribute, other.isDerivedAttribute)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.entityKey == null ? 43 : this.entityKey.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.scale == null ? 43 : this.scale.hashCode());
        result = (result * PRIME) + (this.isNullable == null ? 43 : this.isNullable.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDataType == null ? 43 : this.externalDataType.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
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
                        + (this.datatypeEntityKey == null ? 43 : this.datatypeEntityKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatatypeEntityKey == null
                                ? 43
                                : this.externalDatatypeEntityKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentAttributeKey == null
                                ? 43
                                : this.parentAttributeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.externalParentAttributeKey == null
                                ? 43
                                : this.externalParentAttributeKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedRuleTypes == null
                                ? 43
                                : this.associatedRuleTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.isDerivedAttribute == null
                                ? 43
                                : this.isDerivedAttribute.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
