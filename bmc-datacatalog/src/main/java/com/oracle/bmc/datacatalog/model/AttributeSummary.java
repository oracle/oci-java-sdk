/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AttributeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AttributeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Unique attribute key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Optional user friendly business name of the attribute. If set, this supplements the harvested display name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    String businessName;

    /**
     * Detailed description of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The unique key of the parent entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
    String entityKey;

    /**
     * Unique external key of this attribute in the external source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    String externalKey;

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
     * Property that identifies if this attribute can be assigned null values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    Boolean isNullable;

    /**
     * URI to the attribute instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * State of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the attribute was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Data type of the attribute as defined in the external source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    String externalDataType;

    /**
     * The type of the attribute. Type keys can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    String typeKey;

    /**
     * The minimum count for the number of instances of a given type stored in this collection type attribute,applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minCollectionCount")
    Integer minCollectionCount;

    /**
     * The maximum count for the number of instances of a given type stored in this collection type attribute,applicable if this attribute is a complex type.
     * For type specifications in systems that specify only "capacity" without upper or lower bound , this property can also be used to just mean "capacity".
     * Some examples are Varray size in Oracle , Occurs Clause in Cobol , capacity in XmlSchemaObjectCollection , maxOccurs in  Xml , maxItems in Json
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCollectionCount")
    Integer maxCollectionCount;

    /**
     * Entity key that represents the datatype of this attribute , applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatypeEntityKey")
    String datatypeEntityKey;

    /**
     * External entity key that represents the datatype of this attribute , applicable if this attribute is a complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
    String externalDatatypeEntityKey;

    /**
     * Attribute key that represents the parent attribute of this attribute , applicable if the parent attribute is of complex datatype.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentAttributeKey")
    String parentAttributeKey;

    /**
     * External attribute key that represents the parent attribute  of this attribute , applicable if the parent attribute is of complex type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
    String externalParentAttributeKey;

    /**
     * Full path of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    /**
     * Rule types associated with attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedRuleTypes")
    java.util.List<RuleType> associatedRuleTypes;

    /**
     * Whether a column is derived or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDerivedAttribute")
    Boolean isDerivedAttribute;

    /**
     * The last time that any change was made to the attribute. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each attribute type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * attributes have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
