/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Type.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Type {
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
                            customProperties);
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
                            .customProperties(o.getCustomProperties());

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
     * Unique type key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The immutable name of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Detailed description of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    String catalogId;

    /**
     * A map of arrays which defines the type specific properties, both required and optional. The map keys are
     * category names and the values are arrays contiaing all property details. Every property is contained inside
     * of a category. Most types have required properties within the \"default\" category.
     * Example:
     * `{
     *    \"properties\": {
     *      \"default\": {
     *        \"attributes:\": [
     *          {
     *            \"name\": \"host\",
     *            \"type\": \"string\",
     *            \"isRequired\": true,
     *            \"isUpdatable\": false
     *          },
     *          ...
     *        ]
     *      }
     *    }
     *  }`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.List<PropertyDefinition>> properties;

    /**
     * The current state of the type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Indicates whether the type is internal, making it unavailable for use by metadata elements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInternal")
    Boolean isInternal;

    /**
     * Indicates whether the type can be used for tagging metadata elements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTag")
    Boolean isTag;

    /**
     * Indicates whether the type is approved for use as a classifying object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApproved")
    Boolean isApproved;

    /**
     * Indicates the category this type belongs to. For instance, data assets, connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeCategory")
    String typeCategory;

    /**
     * Mapping type equivalence in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
    String externalTypeName;

    /**
     * URI to the type instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * Custom properties associated with this Type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    java.util.List<CustomPropertySummary> customProperties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
