/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of an entity attribute. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AttributeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttributeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "lifecycleDetails",
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
            String lifecycleDetails,
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
        this.lifecycleDetails = lifecycleDetails;
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
        /** Unique attribute key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique attribute key that is immutable.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Optional user friendly business name of the attribute. If set, this supplements the
         * harvested display name of the object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        /**
         * Optional user friendly business name of the attribute. If set, this supplements the
         * harvested display name of the object.
         *
         * @param businessName the value to set
         * @return this builder
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            this.__explicitlySet__.add("businessName");
            return this;
        }
        /** Detailed description of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the attribute.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The unique key of the parent entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
        private String entityKey;

        /**
         * The unique key of the parent entity.
         *
         * @param entityKey the value to set
         * @return this builder
         */
        public Builder entityKey(String entityKey) {
            this.entityKey = entityKey;
            this.__explicitlySet__.add("entityKey");
            return this;
        }
        /** Unique external key of this attribute in the external source system. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * Unique external key of this attribute in the external source system.
         *
         * @param externalKey the value to set
         * @return this builder
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /** Max allowed length of the attribute value. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Long length;

        /**
         * Max allowed length of the attribute value.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Long length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** Position of the attribute in the record definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        /**
         * Position of the attribute in the record definition.
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /** Precision of the attribute value usually applies to float data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Integer precision;

        /**
         * Precision of the attribute value usually applies to float data type.
         *
         * @param precision the value to set
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }
        /** Scale of the attribute value usually applies to float data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("scale")
        private Integer scale;

        /**
         * Scale of the attribute value usually applies to float data type.
         *
         * @param scale the value to set
         * @return this builder
         */
        public Builder scale(Integer scale) {
            this.scale = scale;
            this.__explicitlySet__.add("scale");
            return this;
        }
        /** Property that identifies if this attribute can be assigned null values. */
        @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
        private Boolean isNullable;

        /**
         * Property that identifies if this attribute can be assigned null values.
         *
         * @param isNullable the value to set
         * @return this builder
         */
        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            this.__explicitlySet__.add("isNullable");
            return this;
        }
        /** URI to the attribute instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the attribute instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** State of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the attribute.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. An object not in ACTIVE state may
         * have functional limitations, see service documentation for details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. An object not in ACTIVE state may
         * have functional limitations, see service documentation for details.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the attribute was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the attribute was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Data type of the attribute as defined in the external source system. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
        private String externalDataType;

        /**
         * Data type of the attribute as defined in the external source system.
         *
         * @param externalDataType the value to set
         * @return this builder
         */
        public Builder externalDataType(String externalDataType) {
            this.externalDataType = externalDataType;
            this.__explicitlySet__.add("externalDataType");
            return this;
        }
        /** The type of the attribute. Type keys can be found via the '/types' endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * The type of the attribute. Type keys can be found via the '/types' endpoint.
         *
         * @param typeKey the value to set
         * @return this builder
         */
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }
        /**
         * The minimum count for the number of instances of a given type stored in this collection
         * type attribute,applicable if this attribute is a complex type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minCollectionCount")
        private Integer minCollectionCount;

        /**
         * The minimum count for the number of instances of a given type stored in this collection
         * type attribute,applicable if this attribute is a complex type.
         *
         * @param minCollectionCount the value to set
         * @return this builder
         */
        public Builder minCollectionCount(Integer minCollectionCount) {
            this.minCollectionCount = minCollectionCount;
            this.__explicitlySet__.add("minCollectionCount");
            return this;
        }
        /**
         * The maximum count for the number of instances of a given type stored in this collection
         * type attribute,applicable if this attribute is a complex type. For type specifications in
         * systems that specify only "capacity" without upper or lower bound , this property can
         * also be used to just mean "capacity". Some examples are Varray size in Oracle , Occurs
         * Clause in Cobol , capacity in XmlSchemaObjectCollection , maxOccurs in Xml , maxItems in
         * Json
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxCollectionCount")
        private Integer maxCollectionCount;

        /**
         * The maximum count for the number of instances of a given type stored in this collection
         * type attribute,applicable if this attribute is a complex type. For type specifications in
         * systems that specify only "capacity" without upper or lower bound , this property can
         * also be used to just mean "capacity". Some examples are Varray size in Oracle , Occurs
         * Clause in Cobol , capacity in XmlSchemaObjectCollection , maxOccurs in Xml , maxItems in
         * Json
         *
         * @param maxCollectionCount the value to set
         * @return this builder
         */
        public Builder maxCollectionCount(Integer maxCollectionCount) {
            this.maxCollectionCount = maxCollectionCount;
            this.__explicitlySet__.add("maxCollectionCount");
            return this;
        }
        /**
         * Entity key that represents the datatype of this attribute , applicable if this attribute
         * is a complex type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("datatypeEntityKey")
        private String datatypeEntityKey;

        /**
         * Entity key that represents the datatype of this attribute , applicable if this attribute
         * is a complex type.
         *
         * @param datatypeEntityKey the value to set
         * @return this builder
         */
        public Builder datatypeEntityKey(String datatypeEntityKey) {
            this.datatypeEntityKey = datatypeEntityKey;
            this.__explicitlySet__.add("datatypeEntityKey");
            return this;
        }
        /**
         * External entity key that represents the datatype of this attribute , applicable if this
         * attribute is a complex type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
        private String externalDatatypeEntityKey;

        /**
         * External entity key that represents the datatype of this attribute , applicable if this
         * attribute is a complex type.
         *
         * @param externalDatatypeEntityKey the value to set
         * @return this builder
         */
        public Builder externalDatatypeEntityKey(String externalDatatypeEntityKey) {
            this.externalDatatypeEntityKey = externalDatatypeEntityKey;
            this.__explicitlySet__.add("externalDatatypeEntityKey");
            return this;
        }
        /**
         * Attribute key that represents the parent attribute of this attribute , applicable if the
         * parent attribute is of complex datatype.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentAttributeKey")
        private String parentAttributeKey;

        /**
         * Attribute key that represents the parent attribute of this attribute , applicable if the
         * parent attribute is of complex datatype.
         *
         * @param parentAttributeKey the value to set
         * @return this builder
         */
        public Builder parentAttributeKey(String parentAttributeKey) {
            this.parentAttributeKey = parentAttributeKey;
            this.__explicitlySet__.add("parentAttributeKey");
            return this;
        }
        /**
         * External attribute key that represents the parent attribute of this attribute ,
         * applicable if the parent attribute is of complex type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
        private String externalParentAttributeKey;

        /**
         * External attribute key that represents the parent attribute of this attribute ,
         * applicable if the parent attribute is of complex type.
         *
         * @param externalParentAttributeKey the value to set
         * @return this builder
         */
        public Builder externalParentAttributeKey(String externalParentAttributeKey) {
            this.externalParentAttributeKey = externalParentAttributeKey;
            this.__explicitlySet__.add("externalParentAttributeKey");
            return this;
        }
        /** Full path of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Full path of the attribute.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The list of customized properties along with the values for this object */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertyGetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         *
         * @param customPropertyMembers the value to set
         * @return this builder
         */
        public Builder customPropertyMembers(
                java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }
        /** Rule types associated with attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedRuleTypes")
        private java.util.List<RuleType> associatedRuleTypes;

        /**
         * Rule types associated with attribute.
         *
         * @param associatedRuleTypes the value to set
         * @return this builder
         */
        public Builder associatedRuleTypes(java.util.List<RuleType> associatedRuleTypes) {
            this.associatedRuleTypes = associatedRuleTypes;
            this.__explicitlySet__.add("associatedRuleTypes");
            return this;
        }
        /** Whether a column is derived or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDerivedAttribute")
        private Boolean isDerivedAttribute;

        /**
         * Whether a column is derived or not.
         *
         * @param isDerivedAttribute the value to set
         * @return this builder
         */
        public Builder isDerivedAttribute(Boolean isDerivedAttribute) {
            this.isDerivedAttribute = isDerivedAttribute;
            this.__explicitlySet__.add("isDerivedAttribute");
            return this;
        }
        /**
         * The last time that any change was made to the attribute. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the attribute. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the attribute type. Each
         * attribute type definition defines it's set of required and optional properties. The map
         * keys are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most attributes have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "key1":
         * "value1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the attribute type. Each
         * attribute type definition defines it's set of required and optional properties. The map
         * keys are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most attributes have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "key1":
         * "value1"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttributeSummary build() {
            AttributeSummary model =
                    new AttributeSummary(
                            this.key,
                            this.displayName,
                            this.businessName,
                            this.description,
                            this.entityKey,
                            this.externalKey,
                            this.length,
                            this.position,
                            this.precision,
                            this.scale,
                            this.isNullable,
                            this.uri,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.externalDataType,
                            this.typeKey,
                            this.minCollectionCount,
                            this.maxCollectionCount,
                            this.datatypeEntityKey,
                            this.externalDatatypeEntityKey,
                            this.parentAttributeKey,
                            this.externalParentAttributeKey,
                            this.path,
                            this.customPropertyMembers,
                            this.associatedRuleTypes,
                            this.isDerivedAttribute,
                            this.timeUpdated,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributeSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("businessName")) {
                this.businessName(model.getBusinessName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("entityKey")) {
                this.entityKey(model.getEntityKey());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("scale")) {
                this.scale(model.getScale());
            }
            if (model.wasPropertyExplicitlySet("isNullable")) {
                this.isNullable(model.getIsNullable());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("externalDataType")) {
                this.externalDataType(model.getExternalDataType());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("minCollectionCount")) {
                this.minCollectionCount(model.getMinCollectionCount());
            }
            if (model.wasPropertyExplicitlySet("maxCollectionCount")) {
                this.maxCollectionCount(model.getMaxCollectionCount());
            }
            if (model.wasPropertyExplicitlySet("datatypeEntityKey")) {
                this.datatypeEntityKey(model.getDatatypeEntityKey());
            }
            if (model.wasPropertyExplicitlySet("externalDatatypeEntityKey")) {
                this.externalDatatypeEntityKey(model.getExternalDatatypeEntityKey());
            }
            if (model.wasPropertyExplicitlySet("parentAttributeKey")) {
                this.parentAttributeKey(model.getParentAttributeKey());
            }
            if (model.wasPropertyExplicitlySet("externalParentAttributeKey")) {
                this.externalParentAttributeKey(model.getExternalParentAttributeKey());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("associatedRuleTypes")) {
                this.associatedRuleTypes(model.getAssociatedRuleTypes());
            }
            if (model.wasPropertyExplicitlySet("isDerivedAttribute")) {
                this.isDerivedAttribute(model.getIsDerivedAttribute());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Unique attribute key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique attribute key that is immutable.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional user friendly business name of the attribute. If set, this supplements the harvested
     * display name of the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    /**
     * Optional user friendly business name of the attribute. If set, this supplements the harvested
     * display name of the object.
     *
     * @return the value
     */
    public String getBusinessName() {
        return businessName;
    }

    /** Detailed description of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the attribute.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The unique key of the parent entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityKey")
    private final String entityKey;

    /**
     * The unique key of the parent entity.
     *
     * @return the value
     */
    public String getEntityKey() {
        return entityKey;
    }

    /** Unique external key of this attribute in the external source system. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * Unique external key of this attribute in the external source system.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
    }

    /** Max allowed length of the attribute value. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Long length;

    /**
     * Max allowed length of the attribute value.
     *
     * @return the value
     */
    public Long getLength() {
        return length;
    }

    /** Position of the attribute in the record definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    /**
     * Position of the attribute in the record definition.
     *
     * @return the value
     */
    public Integer getPosition() {
        return position;
    }

    /** Precision of the attribute value usually applies to float data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Integer precision;

    /**
     * Precision of the attribute value usually applies to float data type.
     *
     * @return the value
     */
    public Integer getPrecision() {
        return precision;
    }

    /** Scale of the attribute value usually applies to float data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    private final Integer scale;

    /**
     * Scale of the attribute value usually applies to float data type.
     *
     * @return the value
     */
    public Integer getScale() {
        return scale;
    }

    /** Property that identifies if this attribute can be assigned null values. */
    @com.fasterxml.jackson.annotation.JsonProperty("isNullable")
    private final Boolean isNullable;

    /**
     * Property that identifies if this attribute can be assigned null values.
     *
     * @return the value
     */
    public Boolean getIsNullable() {
        return isNullable;
    }

    /** URI to the attribute instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the attribute instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** State of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the attribute.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. An object not in ACTIVE state may have
     * functional limitations, see service documentation for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. An object not in ACTIVE state may have
     * functional limitations, see service documentation for details.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the attribute was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the attribute was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Data type of the attribute as defined in the external source system. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    private final String externalDataType;

    /**
     * Data type of the attribute as defined in the external source system.
     *
     * @return the value
     */
    public String getExternalDataType() {
        return externalDataType;
    }

    /** The type of the attribute. Type keys can be found via the '/types' endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * The type of the attribute. Type keys can be found via the '/types' endpoint.
     *
     * @return the value
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * The minimum count for the number of instances of a given type stored in this collection type
     * attribute,applicable if this attribute is a complex type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minCollectionCount")
    private final Integer minCollectionCount;

    /**
     * The minimum count for the number of instances of a given type stored in this collection type
     * attribute,applicable if this attribute is a complex type.
     *
     * @return the value
     */
    public Integer getMinCollectionCount() {
        return minCollectionCount;
    }

    /**
     * The maximum count for the number of instances of a given type stored in this collection type
     * attribute,applicable if this attribute is a complex type. For type specifications in systems
     * that specify only "capacity" without upper or lower bound , this property can also be used to
     * just mean "capacity". Some examples are Varray size in Oracle , Occurs Clause in Cobol ,
     * capacity in XmlSchemaObjectCollection , maxOccurs in Xml , maxItems in Json
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxCollectionCount")
    private final Integer maxCollectionCount;

    /**
     * The maximum count for the number of instances of a given type stored in this collection type
     * attribute,applicable if this attribute is a complex type. For type specifications in systems
     * that specify only "capacity" without upper or lower bound , this property can also be used to
     * just mean "capacity". Some examples are Varray size in Oracle , Occurs Clause in Cobol ,
     * capacity in XmlSchemaObjectCollection , maxOccurs in Xml , maxItems in Json
     *
     * @return the value
     */
    public Integer getMaxCollectionCount() {
        return maxCollectionCount;
    }

    /**
     * Entity key that represents the datatype of this attribute , applicable if this attribute is a
     * complex type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datatypeEntityKey")
    private final String datatypeEntityKey;

    /**
     * Entity key that represents the datatype of this attribute , applicable if this attribute is a
     * complex type.
     *
     * @return the value
     */
    public String getDatatypeEntityKey() {
        return datatypeEntityKey;
    }

    /**
     * External entity key that represents the datatype of this attribute , applicable if this
     * attribute is a complex type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatatypeEntityKey")
    private final String externalDatatypeEntityKey;

    /**
     * External entity key that represents the datatype of this attribute , applicable if this
     * attribute is a complex type.
     *
     * @return the value
     */
    public String getExternalDatatypeEntityKey() {
        return externalDatatypeEntityKey;
    }

    /**
     * Attribute key that represents the parent attribute of this attribute , applicable if the
     * parent attribute is of complex datatype.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentAttributeKey")
    private final String parentAttributeKey;

    /**
     * Attribute key that represents the parent attribute of this attribute , applicable if the
     * parent attribute is of complex datatype.
     *
     * @return the value
     */
    public String getParentAttributeKey() {
        return parentAttributeKey;
    }

    /**
     * External attribute key that represents the parent attribute of this attribute , applicable if
     * the parent attribute is of complex type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalParentAttributeKey")
    private final String externalParentAttributeKey;

    /**
     * External attribute key that represents the parent attribute of this attribute , applicable if
     * the parent attribute is of complex type.
     *
     * @return the value
     */
    public String getExternalParentAttributeKey() {
        return externalParentAttributeKey;
    }

    /** Full path of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Full path of the attribute.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The list of customized properties along with the values for this object */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     *
     * @return the value
     */
    public java.util.List<CustomPropertyGetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /** Rule types associated with attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedRuleTypes")
    private final java.util.List<RuleType> associatedRuleTypes;

    /**
     * Rule types associated with attribute.
     *
     * @return the value
     */
    public java.util.List<RuleType> getAssociatedRuleTypes() {
        return associatedRuleTypes;
    }

    /** Whether a column is derived or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDerivedAttribute")
    private final Boolean isDerivedAttribute;

    /**
     * Whether a column is derived or not.
     *
     * @return the value
     */
    public Boolean getIsDerivedAttribute() {
        return isDerivedAttribute;
    }

    /**
     * The last time that any change was made to the attribute. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the attribute. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each
     * attribute type definition defines it's set of required and optional properties. The map keys
     * are category names and the values are maps of property name to property value. Every property
     * is contained inside of a category. Most attributes have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the attribute type. Each
     * attribute type definition defines it's set of required and optional properties. The map keys
     * are category names and the values are maps of property name to property value. Every property
     * is contained inside of a category. Most attributes have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("AttributeSummary(");
        sb.append("super=").append(super.toString());
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
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
