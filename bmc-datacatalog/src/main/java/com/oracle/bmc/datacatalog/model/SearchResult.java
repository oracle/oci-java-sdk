/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The search result object is the definition of an element that is returned as part of search. It contains basic
 * information about the object such as key, name and description. The search result also contains the list of tags
 * for each object along with other contextual information like the data asset root, folder, or entity parents.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SearchResult {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagSummary")
        private java.util.List<SearchTagSummary> tagSummary;

        public Builder tagSummary(java.util.List<SearchTagSummary> tagSummary) {
            this.tagSummary = tagSummary;
            this.__explicitlySet__.add("tagSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termSummary")
        private java.util.List<SearchTermSummary> termSummary;

        public Builder termSummary(java.util.List<SearchTermSummary> termSummary) {
            this.termSummary = termSummary;
            this.__explicitlySet__.add("termSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
        private String externalTypeName;

        public Builder externalTypeName(String externalTypeName) {
            this.externalTypeName = externalTypeName;
            this.__explicitlySet__.add("externalTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
        private String externalDataType;

        public Builder externalDataType(String externalDataType) {
            this.externalDataType = externalDataType;
            this.__explicitlySet__.add("externalDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
        private String dataAssetType;

        public Builder dataAssetType(String dataAssetType) {
            this.dataAssetType = dataAssetType;
            this.__explicitlySet__.add("dataAssetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetName")
        private String dataAssetName;

        public Builder dataAssetName(String dataAssetName) {
            this.dataAssetName = dataAssetName;
            this.__explicitlySet__.add("dataAssetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("folderType")
        private String folderType;

        public Builder folderType(String folderType) {
            this.folderType = folderType;
            this.__explicitlySet__.add("folderType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("folderName")
        private String folderName;

        public Builder folderName(String folderName) {
            this.folderName = folderName;
            this.__explicitlySet__.add("folderName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entitykey")
        private String entitykey;

        public Builder entitykey(String entitykey) {
            this.entitykey = entitykey;
            this.__explicitlySet__.add("entitykey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
        private String glossaryName;

        public Builder glossaryName(String glossaryName) {
            this.glossaryName = glossaryName;
            this.__explicitlySet__.add("glossaryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
        private String parentTermName;

        public Builder parentTermName(String parentTermName) {
            this.parentTermName = parentTermName;
            this.__explicitlySet__.add("parentTermName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        public Builder businessName(String businessName) {
            this.businessName = businessName;
            this.__explicitlySet__.add("businessName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private String attributeType;

        public Builder attributeType(String attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.List<FacetedSearchCustomProperty> customProperties;

        public Builder customProperties(
                java.util.List<FacetedSearchCustomProperty> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResult build() {
            SearchResult __instance__ =
                    new SearchResult(
                            key,
                            name,
                            description,
                            timeCreated,
                            timeUpdated,
                            tagSummary,
                            termSummary,
                            typeName,
                            externalTypeName,
                            externalDataType,
                            dataAssetKey,
                            dataAssetType,
                            dataAssetName,
                            folderKey,
                            folderType,
                            folderName,
                            entitykey,
                            entityType,
                            entityName,
                            glossaryKey,
                            glossaryName,
                            parentTermKey,
                            parentTermName,
                            createdById,
                            updatedById,
                            path,
                            businessName,
                            lifecycleState,
                            attributeType,
                            expression,
                            customProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResult o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .name(o.getName())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .tagSummary(o.getTagSummary())
                            .termSummary(o.getTermSummary())
                            .typeName(o.getTypeName())
                            .externalTypeName(o.getExternalTypeName())
                            .externalDataType(o.getExternalDataType())
                            .dataAssetKey(o.getDataAssetKey())
                            .dataAssetType(o.getDataAssetType())
                            .dataAssetName(o.getDataAssetName())
                            .folderKey(o.getFolderKey())
                            .folderType(o.getFolderType())
                            .folderName(o.getFolderName())
                            .entitykey(o.getEntitykey())
                            .entityType(o.getEntityType())
                            .entityName(o.getEntityName())
                            .glossaryKey(o.getGlossaryKey())
                            .glossaryName(o.getGlossaryName())
                            .parentTermKey(o.getParentTermKey())
                            .parentTermName(o.getParentTermName())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .path(o.getPath())
                            .businessName(o.getBusinessName())
                            .lifecycleState(o.getLifecycleState())
                            .attributeType(o.getAttributeType())
                            .expression(o.getExpression())
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
     * Unique key of the object returned as part of the search result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Detailed description of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The date and time the result object was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the result object was updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Array of the tags associated with this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagSummary")
    java.util.List<SearchTagSummary> tagSummary;

    /**
     * Array of the terms associated with this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termSummary")
    java.util.List<SearchTermSummary> termSummary;

    /**
     * Name of the object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    String typeName;

    /**
     * Name of the external object type in the host data asset. For example, column, field, table, view, or file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
    String externalTypeName;

    /**
     * Data type of the object if the object is an attribute. Null otherwise.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    String externalDataType;

    /**
     * Unique key of the data asset that is the root parent of this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    String dataAssetKey;

    /**
     * Type name of the data asset. For example, Oracle, MySQL or Oracle Object Storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
    String dataAssetType;

    /**
     * Name of the data asset that is the root parent of this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetName")
    String dataAssetName;

    /**
     * Unique key of the folder object if this object is a sub folder, entity, or attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    String folderKey;

    /**
     * Type name of the folder. For example, schema, directory, or topic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderType")
    String folderType;

    /**
     * Name of the parent folder object if this object is a sub folder, entity, or attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    String folderName;

    /**
     * Unique key of the entity object if this object is an attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitykey")
    String entitykey;

    /**
     * Type name of the entity. For example, table, view, external table, file, or object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * Name of the parent entity object if this object is an attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * Unique id of the parent glossary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    String glossaryKey;

    /**
     * Name of the parent glossary if this object is a term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
    String glossaryName;

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    String parentTermKey;

    /**
     * Name of the parent term. Will be null if the term has no parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
    String parentTermName;

    /**
     * OCID of the user who created the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    String createdById;

    /**
     * OCID of the user who updated the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    String updatedById;

    /**
     * Absolute path of this resource, which could be a term, folder, entity etc, usually resolvable to this resource through a namespace hierarchy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * Optional user friendly business name of the data object. If set, this supplements the harvested display name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    String businessName;

    /**
     * The current state of the data object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Type name of the attribute. For example - complex, primitive, or array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    String attributeType;

    /**
     * Expression for logical entities against which names of dataObjects will be matched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    String expression;

    /**
     * Custom properties defined by users.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    java.util.List<FacetedSearchCustomProperty> customProperties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
