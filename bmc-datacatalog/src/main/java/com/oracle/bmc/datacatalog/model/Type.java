/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full data catalog type definition. Fully defines a type of the data catalog. All types are statically defined
 * in the system and are immutable. It isn't possible to create new types or update existing types via the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Type.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Type {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "description",
        "catalogId",
        "properties",
        "lifecycleState",
        "isInternal",
        "isTag",
        "isApproved",
        "typeCategory",
        "externalTypeName",
        "uri",
        "customProperties",
        "parentTypeKey",
        "parentTypeName"
    })
    public Type(
            String key,
            String name,
            String description,
            String catalogId,
            java.util.Map<String, java.util.List<PropertyDefinition>> properties,
            LifecycleState lifecycleState,
            Boolean isInternal,
            Boolean isTag,
            Boolean isApproved,
            String typeCategory,
            String externalTypeName,
            String uri,
            java.util.List<CustomPropertySummary> customProperties,
            String parentTypeKey,
            String parentTypeName) {
        super();
        this.key = key;
        this.name = name;
        this.description = description;
        this.catalogId = catalogId;
        this.properties = properties;
        this.lifecycleState = lifecycleState;
        this.isInternal = isInternal;
        this.isTag = isTag;
        this.isApproved = isApproved;
        this.typeCategory = typeCategory;
        this.externalTypeName = externalTypeName;
        this.uri = uri;
        this.customProperties = customProperties;
        this.parentTypeKey = parentTypeKey;
        this.parentTypeName = parentTypeName;
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.List<PropertyDefinition>> properties;

        public Builder properties(
                java.util.Map<String, java.util.List<PropertyDefinition>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInternal")
        private Boolean isInternal;

        public Builder isInternal(Boolean isInternal) {
            this.isInternal = isInternal;
            this.__explicitlySet__.add("isInternal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTag")
        private Boolean isTag;

        public Builder isTag(Boolean isTag) {
            this.isTag = isTag;
            this.__explicitlySet__.add("isTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isApproved")
        private Boolean isApproved;

        public Builder isApproved(Boolean isApproved) {
            this.isApproved = isApproved;
            this.__explicitlySet__.add("isApproved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeCategory")
        private String typeCategory;

        public Builder typeCategory(String typeCategory) {
            this.typeCategory = typeCategory;
            this.__explicitlySet__.add("typeCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
        private String externalTypeName;

        public Builder externalTypeName(String externalTypeName) {
            this.externalTypeName = externalTypeName;
            this.__explicitlySet__.add("externalTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.List<CustomPropertySummary> customProperties;

        public Builder customProperties(java.util.List<CustomPropertySummary> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTypeKey")
        private String parentTypeKey;

        public Builder parentTypeKey(String parentTypeKey) {
            this.parentTypeKey = parentTypeKey;
            this.__explicitlySet__.add("parentTypeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTypeName")
        private String parentTypeName;

        public Builder parentTypeName(String parentTypeName) {
            this.parentTypeName = parentTypeName;
            this.__explicitlySet__.add("parentTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Type build() {
            Type __instance__ =
                    new Type(
                            key,
                            name,
                            description,
                            catalogId,
                            properties,
                            lifecycleState,
                            isInternal,
                            isTag,
                            isApproved,
                            typeCategory,
                            externalTypeName,
                            uri,
                            customProperties,
                            parentTypeKey,
                            parentTypeName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Type o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .name(o.getName())
                            .description(o.getDescription())
                            .catalogId(o.getCatalogId())
                            .properties(o.getProperties())
                            .lifecycleState(o.getLifecycleState())
                            .isInternal(o.getIsInternal())
                            .isTag(o.getIsTag())
                            .isApproved(o.getIsApproved())
                            .typeCategory(o.getTypeCategory())
                            .externalTypeName(o.getExternalTypeName())
                            .uri(o.getUri())
                            .customProperties(o.getCustomProperties())
                            .parentTypeKey(o.getParentTypeKey())
                            .parentTypeName(o.getParentTypeName());

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
     * Unique type key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * The immutable name of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Detailed description of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    public String getCatalogId() {
        return catalogId;
    }

    /**
     * A map of arrays which defines the type specific properties, both required and optional. The map keys are
     * category names and the values are arrays contiaing all property details. Every property is contained inside
     * of a category. Most types have required properties within the "default" category.
     * Example:
     * {@code {
     *    "properties": {
     *      "default": {
     *        "attributes:": [
     *          {
     *            "name": "host",
     *            "type": "string",
     *            "isRequired": true,
     *            "isUpdatable": false
     *          },
     *          ...
     *        ]
     *      }
     *    }
     *  }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.List<PropertyDefinition>> properties;

    public java.util.Map<String, java.util.List<PropertyDefinition>> getProperties() {
        return properties;
    }

    /**
     * The current state of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Indicates whether the type is internal, making it unavailable for use by metadata elements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInternal")
    private final Boolean isInternal;

    public Boolean getIsInternal() {
        return isInternal;
    }

    /**
     * Indicates whether the type can be used for tagging metadata elements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTag")
    private final Boolean isTag;

    public Boolean getIsTag() {
        return isTag;
    }

    /**
     * Indicates whether the type is approved for use as a classifying object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApproved")
    private final Boolean isApproved;

    public Boolean getIsApproved() {
        return isApproved;
    }

    /**
     * Indicates the category this type belongs to. For instance, data assets, connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeCategory")
    private final String typeCategory;

    public String getTypeCategory() {
        return typeCategory;
    }

    /**
     * Mapping type equivalence in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
    private final String externalTypeName;

    public String getExternalTypeName() {
        return externalTypeName;
    }

    /**
     * URI to the type instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    /**
     * Custom properties associated with this Type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    private final java.util.List<CustomPropertySummary> customProperties;

    public java.util.List<CustomPropertySummary> getCustomProperties() {
        return customProperties;
    }

    /**
     * Unique key of the parent type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTypeKey")
    private final String parentTypeKey;

    public String getParentTypeKey() {
        return parentTypeKey;
    }

    /**
     * Name of the parent type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTypeName")
    private final String parentTypeName;

    public String getParentTypeName() {
        return parentTypeName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Type(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isInternal=").append(String.valueOf(this.isInternal));
        sb.append(", isTag=").append(String.valueOf(this.isTag));
        sb.append(", isApproved=").append(String.valueOf(this.isApproved));
        sb.append(", typeCategory=").append(String.valueOf(this.typeCategory));
        sb.append(", externalTypeName=").append(String.valueOf(this.externalTypeName));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", customProperties=").append(String.valueOf(this.customProperties));
        sb.append(", parentTypeKey=").append(String.valueOf(this.parentTypeKey));
        sb.append(", parentTypeName=").append(String.valueOf(this.parentTypeName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Type)) {
            return false;
        }

        Type other = (Type) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isInternal, other.isInternal)
                && java.util.Objects.equals(this.isTag, other.isTag)
                && java.util.Objects.equals(this.isApproved, other.isApproved)
                && java.util.Objects.equals(this.typeCategory, other.typeCategory)
                && java.util.Objects.equals(this.externalTypeName, other.externalTypeName)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.customProperties, other.customProperties)
                && java.util.Objects.equals(this.parentTypeKey, other.parentTypeKey)
                && java.util.Objects.equals(this.parentTypeName, other.parentTypeName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isInternal == null ? 43 : this.isInternal.hashCode());
        result = (result * PRIME) + (this.isTag == null ? 43 : this.isTag.hashCode());
        result = (result * PRIME) + (this.isApproved == null ? 43 : this.isApproved.hashCode());
        result = (result * PRIME) + (this.typeCategory == null ? 43 : this.typeCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.externalTypeName == null ? 43 : this.externalTypeName.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.customProperties == null ? 43 : this.customProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTypeKey == null ? 43 : this.parentTypeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTypeName == null ? 43 : this.parentTypeName.hashCode());
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
