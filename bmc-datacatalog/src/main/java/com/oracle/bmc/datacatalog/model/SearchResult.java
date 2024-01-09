/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The search result object is the definition of an element that is returned as part of search. It
 * contains basic information about the object such as key, name and description. The search result
 * also contains the list of tags for each object along with other contextual information like the
 * data asset root, folder, or entity parents. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchResult extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "description",
        "timeCreated",
        "timeUpdated",
        "tagSummary",
        "termSummary",
        "typeName",
        "externalTypeName",
        "externalDataType",
        "dataAssetKey",
        "dataAssetType",
        "dataAssetName",
        "folderKey",
        "folderType",
        "folderName",
        "entitykey",
        "entityType",
        "entityName",
        "glossaryKey",
        "glossaryName",
        "parentTermKey",
        "parentTermName",
        "createdById",
        "updatedById",
        "path",
        "businessName",
        "lifecycleState",
        "attributeType",
        "expression",
        "customProperties",
        "properties"
    })
    public SearchResult(
            String key,
            String name,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<SearchTagSummary> tagSummary,
            java.util.List<SearchTermSummary> termSummary,
            String typeName,
            String externalTypeName,
            String externalDataType,
            String dataAssetKey,
            String dataAssetType,
            String dataAssetName,
            String folderKey,
            String folderType,
            String folderName,
            String entitykey,
            String entityType,
            String entityName,
            String glossaryKey,
            String glossaryName,
            String parentTermKey,
            String parentTermName,
            String createdById,
            String updatedById,
            String path,
            String businessName,
            LifecycleState lifecycleState,
            String attributeType,
            String expression,
            java.util.List<FacetedSearchCustomProperty> customProperties,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.name = name;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.tagSummary = tagSummary;
        this.termSummary = termSummary;
        this.typeName = typeName;
        this.externalTypeName = externalTypeName;
        this.externalDataType = externalDataType;
        this.dataAssetKey = dataAssetKey;
        this.dataAssetType = dataAssetType;
        this.dataAssetName = dataAssetName;
        this.folderKey = folderKey;
        this.folderType = folderType;
        this.folderName = folderName;
        this.entitykey = entitykey;
        this.entityType = entityType;
        this.entityName = entityName;
        this.glossaryKey = glossaryKey;
        this.glossaryName = glossaryName;
        this.parentTermKey = parentTermKey;
        this.parentTermName = parentTermName;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.path = path;
        this.businessName = businessName;
        this.lifecycleState = lifecycleState;
        this.attributeType = attributeType;
        this.expression = expression;
        this.customProperties = customProperties;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique key of the object returned as part of the search result. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the object returned as part of the search result.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Name of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the object.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Detailed description of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time the result object was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the result object was created, in the format defined by
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
        /**
         * The date and time the result object was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the result object was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Array of the tags associated with this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagSummary")
        private java.util.List<SearchTagSummary> tagSummary;

        /**
         * Array of the tags associated with this object.
         *
         * @param tagSummary the value to set
         * @return this builder
         */
        public Builder tagSummary(java.util.List<SearchTagSummary> tagSummary) {
            this.tagSummary = tagSummary;
            this.__explicitlySet__.add("tagSummary");
            return this;
        }
        /** Array of the terms associated with this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("termSummary")
        private java.util.List<SearchTermSummary> termSummary;

        /**
         * Array of the terms associated with this object.
         *
         * @param termSummary the value to set
         * @return this builder
         */
        public Builder termSummary(java.util.List<SearchTermSummary> termSummary) {
            this.termSummary = termSummary;
            this.__explicitlySet__.add("termSummary");
            return this;
        }
        /** Name of the object type. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Name of the object type.
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /**
         * Name of the external object type in the host data asset. For example, column, field,
         * table, view, or file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
        private String externalTypeName;

        /**
         * Name of the external object type in the host data asset. For example, column, field,
         * table, view, or file.
         *
         * @param externalTypeName the value to set
         * @return this builder
         */
        public Builder externalTypeName(String externalTypeName) {
            this.externalTypeName = externalTypeName;
            this.__explicitlySet__.add("externalTypeName");
            return this;
        }
        /** Data type of the object if the object is an attribute. Null otherwise. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
        private String externalDataType;

        /**
         * Data type of the object if the object is an attribute. Null otherwise.
         *
         * @param externalDataType the value to set
         * @return this builder
         */
        public Builder externalDataType(String externalDataType) {
            this.externalDataType = externalDataType;
            this.__explicitlySet__.add("externalDataType");
            return this;
        }
        /** Unique key of the data asset that is the root parent of this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * Unique key of the data asset that is the root parent of this object.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /** Type name of the data asset. For example, Oracle, MySQL or Oracle Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
        private String dataAssetType;

        /**
         * Type name of the data asset. For example, Oracle, MySQL or Oracle Object Storage.
         *
         * @param dataAssetType the value to set
         * @return this builder
         */
        public Builder dataAssetType(String dataAssetType) {
            this.dataAssetType = dataAssetType;
            this.__explicitlySet__.add("dataAssetType");
            return this;
        }
        /** Name of the data asset that is the root parent of this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetName")
        private String dataAssetName;

        /**
         * Name of the data asset that is the root parent of this object.
         *
         * @param dataAssetName the value to set
         * @return this builder
         */
        public Builder dataAssetName(String dataAssetName) {
            this.dataAssetName = dataAssetName;
            this.__explicitlySet__.add("dataAssetName");
            return this;
        }
        /** Unique key of the folder object if this object is a sub folder, entity, or attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        /**
         * Unique key of the folder object if this object is a sub folder, entity, or attribute.
         *
         * @param folderKey the value to set
         * @return this builder
         */
        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }
        /** Type name of the folder. For example, schema, directory, or topic. */
        @com.fasterxml.jackson.annotation.JsonProperty("folderType")
        private String folderType;

        /**
         * Type name of the folder. For example, schema, directory, or topic.
         *
         * @param folderType the value to set
         * @return this builder
         */
        public Builder folderType(String folderType) {
            this.folderType = folderType;
            this.__explicitlySet__.add("folderType");
            return this;
        }
        /**
         * Name of the parent folder object if this object is a sub folder, entity, or attribute.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("folderName")
        private String folderName;

        /**
         * Name of the parent folder object if this object is a sub folder, entity, or attribute.
         *
         * @param folderName the value to set
         * @return this builder
         */
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            this.__explicitlySet__.add("folderName");
            return this;
        }
        /** Unique key of the entity object if this object is an attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("entitykey")
        private String entitykey;

        /**
         * Unique key of the entity object if this object is an attribute.
         *
         * @param entitykey the value to set
         * @return this builder
         */
        public Builder entitykey(String entitykey) {
            this.entitykey = entitykey;
            this.__explicitlySet__.add("entitykey");
            return this;
        }
        /** Type name of the entity. For example, table, view, external table, file, or object. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Type name of the entity. For example, table, view, external table, file, or object.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** Name of the parent entity object if this object is an attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of the parent entity object if this object is an attribute.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /** Unique id of the parent glossary. */
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique id of the parent glossary.
         *
         * @param glossaryKey the value to set
         * @return this builder
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
            return this;
        }
        /** Name of the parent glossary if this object is a term. */
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
        private String glossaryName;

        /**
         * Name of the parent glossary if this object is a term.
         *
         * @param glossaryName the value to set
         * @return this builder
         */
        public Builder glossaryName(String glossaryName) {
            this.glossaryName = glossaryName;
            this.__explicitlySet__.add("glossaryName");
            return this;
        }
        /** This terms parent term key. Will be null if the term has no parent term. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        /**
         * This terms parent term key. Will be null if the term has no parent term.
         *
         * @param parentTermKey the value to set
         * @return this builder
         */
        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }
        /** Name of the parent term. Will be null if the term has no parent term. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
        private String parentTermName;

        /**
         * Name of the parent term. Will be null if the term has no parent term.
         *
         * @param parentTermName the value to set
         * @return this builder
         */
        public Builder parentTermName(String parentTermName) {
            this.parentTermName = parentTermName;
            this.__explicitlySet__.add("parentTermName");
            return this;
        }
        /** OCID of the user who created the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the resource.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who updated the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who updated the resource.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /**
         * Absolute path of this resource, which could be a term, folder, entity etc, usually
         * resolvable to this resource through a namespace hierarchy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Absolute path of this resource, which could be a term, folder, entity etc, usually
         * resolvable to this resource through a namespace hierarchy.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Optional user friendly business name of the data object. If set, this supplements the
         * harvested display name of the object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        /**
         * Optional user friendly business name of the data object. If set, this supplements the
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
        /** The current state of the data object. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the data object.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Type name of the attribute. For example - complex, primitive, or array. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private String attributeType;

        /**
         * Type name of the attribute. For example - complex, primitive, or array.
         *
         * @param attributeType the value to set
         * @return this builder
         */
        public Builder attributeType(String attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }
        /** Expression for logical entities against which names of dataObjects will be matched. */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private String expression;

        /**
         * Expression for logical entities against which names of dataObjects will be matched.
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(String expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /** Custom properties defined by users. */
        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.List<FacetedSearchCustomProperty> customProperties;

        /**
         * Custom properties defined by users.
         *
         * @param customProperties the value to set
         * @return this builder
         */
        public Builder customProperties(
                java.util.List<FacetedSearchCustomProperty> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the element type in the
         * search result. The map keys are category names and the values are maps of property name
         * to property value. Every property is contained inside of a category. Most element types
         * have required properties within the "default" category. Example: {@code {"properties": {
         * "default": { "key1": "value1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the element type in the
         * search result. The map keys are category names and the values are maps of property name
         * to property value. Every property is contained inside of a category. Most element types
         * have required properties within the "default" category. Example: {@code {"properties": {
         * "default": { "key1": "value1"}}}}
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

        public SearchResult build() {
            SearchResult model =
                    new SearchResult(
                            this.key,
                            this.name,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.tagSummary,
                            this.termSummary,
                            this.typeName,
                            this.externalTypeName,
                            this.externalDataType,
                            this.dataAssetKey,
                            this.dataAssetType,
                            this.dataAssetName,
                            this.folderKey,
                            this.folderType,
                            this.folderName,
                            this.entitykey,
                            this.entityType,
                            this.entityName,
                            this.glossaryKey,
                            this.glossaryName,
                            this.parentTermKey,
                            this.parentTermName,
                            this.createdById,
                            this.updatedById,
                            this.path,
                            this.businessName,
                            this.lifecycleState,
                            this.attributeType,
                            this.expression,
                            this.customProperties,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("tagSummary")) {
                this.tagSummary(model.getTagSummary());
            }
            if (model.wasPropertyExplicitlySet("termSummary")) {
                this.termSummary(model.getTermSummary());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("externalTypeName")) {
                this.externalTypeName(model.getExternalTypeName());
            }
            if (model.wasPropertyExplicitlySet("externalDataType")) {
                this.externalDataType(model.getExternalDataType());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("dataAssetType")) {
                this.dataAssetType(model.getDataAssetType());
            }
            if (model.wasPropertyExplicitlySet("dataAssetName")) {
                this.dataAssetName(model.getDataAssetName());
            }
            if (model.wasPropertyExplicitlySet("folderKey")) {
                this.folderKey(model.getFolderKey());
            }
            if (model.wasPropertyExplicitlySet("folderType")) {
                this.folderType(model.getFolderType());
            }
            if (model.wasPropertyExplicitlySet("folderName")) {
                this.folderName(model.getFolderName());
            }
            if (model.wasPropertyExplicitlySet("entitykey")) {
                this.entitykey(model.getEntitykey());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("glossaryName")) {
                this.glossaryName(model.getGlossaryName());
            }
            if (model.wasPropertyExplicitlySet("parentTermKey")) {
                this.parentTermKey(model.getParentTermKey());
            }
            if (model.wasPropertyExplicitlySet("parentTermName")) {
                this.parentTermName(model.getParentTermName());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("businessName")) {
                this.businessName(model.getBusinessName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("attributeType")) {
                this.attributeType(model.getAttributeType());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("customProperties")) {
                this.customProperties(model.getCustomProperties());
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

    /** Unique key of the object returned as part of the search result. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the object returned as part of the search result.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Name of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the object.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Detailed description of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The date and time the result object was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the result object was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the result object was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the result object was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Array of the tags associated with this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagSummary")
    private final java.util.List<SearchTagSummary> tagSummary;

    /**
     * Array of the tags associated with this object.
     *
     * @return the value
     */
    public java.util.List<SearchTagSummary> getTagSummary() {
        return tagSummary;
    }

    /** Array of the terms associated with this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("termSummary")
    private final java.util.List<SearchTermSummary> termSummary;

    /**
     * Array of the terms associated with this object.
     *
     * @return the value
     */
    public java.util.List<SearchTermSummary> getTermSummary() {
        return termSummary;
    }

    /** Name of the object type. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Name of the object type.
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Name of the external object type in the host data asset. For example, column, field, table,
     * view, or file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalTypeName")
    private final String externalTypeName;

    /**
     * Name of the external object type in the host data asset. For example, column, field, table,
     * view, or file.
     *
     * @return the value
     */
    public String getExternalTypeName() {
        return externalTypeName;
    }

    /** Data type of the object if the object is an attribute. Null otherwise. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDataType")
    private final String externalDataType;

    /**
     * Data type of the object if the object is an attribute. Null otherwise.
     *
     * @return the value
     */
    public String getExternalDataType() {
        return externalDataType;
    }

    /** Unique key of the data asset that is the root parent of this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * Unique key of the data asset that is the root parent of this object.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /** Type name of the data asset. For example, Oracle, MySQL or Oracle Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
    private final String dataAssetType;

    /**
     * Type name of the data asset. For example, Oracle, MySQL or Oracle Object Storage.
     *
     * @return the value
     */
    public String getDataAssetType() {
        return dataAssetType;
    }

    /** Name of the data asset that is the root parent of this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetName")
    private final String dataAssetName;

    /**
     * Name of the data asset that is the root parent of this object.
     *
     * @return the value
     */
    public String getDataAssetName() {
        return dataAssetName;
    }

    /** Unique key of the folder object if this object is a sub folder, entity, or attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    private final String folderKey;

    /**
     * Unique key of the folder object if this object is a sub folder, entity, or attribute.
     *
     * @return the value
     */
    public String getFolderKey() {
        return folderKey;
    }

    /** Type name of the folder. For example, schema, directory, or topic. */
    @com.fasterxml.jackson.annotation.JsonProperty("folderType")
    private final String folderType;

    /**
     * Type name of the folder. For example, schema, directory, or topic.
     *
     * @return the value
     */
    public String getFolderType() {
        return folderType;
    }

    /** Name of the parent folder object if this object is a sub folder, entity, or attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    private final String folderName;

    /**
     * Name of the parent folder object if this object is a sub folder, entity, or attribute.
     *
     * @return the value
     */
    public String getFolderName() {
        return folderName;
    }

    /** Unique key of the entity object if this object is an attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("entitykey")
    private final String entitykey;

    /**
     * Unique key of the entity object if this object is an attribute.
     *
     * @return the value
     */
    public String getEntitykey() {
        return entitykey;
    }

    /** Type name of the entity. For example, table, view, external table, file, or object. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Type name of the entity. For example, table, view, external table, file, or object.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /** Name of the parent entity object if this object is an attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of the parent entity object if this object is an attribute.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /** Unique id of the parent glossary. */
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique id of the parent glossary.
     *
     * @return the value
     */
    public String getGlossaryKey() {
        return glossaryKey;
    }

    /** Name of the parent glossary if this object is a term. */
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryName")
    private final String glossaryName;

    /**
     * Name of the parent glossary if this object is a term.
     *
     * @return the value
     */
    public String getGlossaryName() {
        return glossaryName;
    }

    /** This terms parent term key. Will be null if the term has no parent term. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    private final String parentTermKey;

    /**
     * This terms parent term key. Will be null if the term has no parent term.
     *
     * @return the value
     */
    public String getParentTermKey() {
        return parentTermKey;
    }

    /** Name of the parent term. Will be null if the term has no parent term. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermName")
    private final String parentTermName;

    /**
     * Name of the parent term. Will be null if the term has no parent term.
     *
     * @return the value
     */
    public String getParentTermName() {
        return parentTermName;
    }

    /** OCID of the user who created the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the resource.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who updated the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who updated the resource.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Absolute path of this resource, which could be a term, folder, entity etc, usually resolvable
     * to this resource through a namespace hierarchy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Absolute path of this resource, which could be a term, folder, entity etc, usually resolvable
     * to this resource through a namespace hierarchy.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * Optional user friendly business name of the data object. If set, this supplements the
     * harvested display name of the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    /**
     * Optional user friendly business name of the data object. If set, this supplements the
     * harvested display name of the object.
     *
     * @return the value
     */
    public String getBusinessName() {
        return businessName;
    }

    /** The current state of the data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the data object.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Type name of the attribute. For example - complex, primitive, or array. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final String attributeType;

    /**
     * Type name of the attribute. For example - complex, primitive, or array.
     *
     * @return the value
     */
    public String getAttributeType() {
        return attributeType;
    }

    /** Expression for logical entities against which names of dataObjects will be matched. */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final String expression;

    /**
     * Expression for logical entities against which names of dataObjects will be matched.
     *
     * @return the value
     */
    public String getExpression() {
        return expression;
    }

    /** Custom properties defined by users. */
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    private final java.util.List<FacetedSearchCustomProperty> customProperties;

    /**
     * Custom properties defined by users.
     *
     * @return the value
     */
    public java.util.List<FacetedSearchCustomProperty> getCustomProperties() {
        return customProperties;
    }

    /**
     * A map of maps that contains the properties which are specific to the element type in the
     * search result. The map keys are category names and the values are maps of property name to
     * property value. Every property is contained inside of a category. Most element types have
     * required properties within the "default" category. Example: {@code {"properties": {
     * "default": { "key1": "value1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the element type in the
     * search result. The map keys are category names and the values are maps of property name to
     * property value. Every property is contained inside of a category. Most element types have
     * required properties within the "default" category. Example: {@code {"properties": {
     * "default": { "key1": "value1"}}}}
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
        sb.append("SearchResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", tagSummary=").append(String.valueOf(this.tagSummary));
        sb.append(", termSummary=").append(String.valueOf(this.termSummary));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", externalTypeName=").append(String.valueOf(this.externalTypeName));
        sb.append(", externalDataType=").append(String.valueOf(this.externalDataType));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", dataAssetType=").append(String.valueOf(this.dataAssetType));
        sb.append(", dataAssetName=").append(String.valueOf(this.dataAssetName));
        sb.append(", folderKey=").append(String.valueOf(this.folderKey));
        sb.append(", folderType=").append(String.valueOf(this.folderType));
        sb.append(", folderName=").append(String.valueOf(this.folderName));
        sb.append(", entitykey=").append(String.valueOf(this.entitykey));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", glossaryName=").append(String.valueOf(this.glossaryName));
        sb.append(", parentTermKey=").append(String.valueOf(this.parentTermKey));
        sb.append(", parentTermName=").append(String.valueOf(this.parentTermName));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", attributeType=").append(String.valueOf(this.attributeType));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", customProperties=").append(String.valueOf(this.customProperties));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResult)) {
            return false;
        }

        SearchResult other = (SearchResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.tagSummary, other.tagSummary)
                && java.util.Objects.equals(this.termSummary, other.termSummary)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.externalTypeName, other.externalTypeName)
                && java.util.Objects.equals(this.externalDataType, other.externalDataType)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.dataAssetType, other.dataAssetType)
                && java.util.Objects.equals(this.dataAssetName, other.dataAssetName)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.folderType, other.folderType)
                && java.util.Objects.equals(this.folderName, other.folderName)
                && java.util.Objects.equals(this.entitykey, other.entitykey)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.glossaryName, other.glossaryName)
                && java.util.Objects.equals(this.parentTermKey, other.parentTermKey)
                && java.util.Objects.equals(this.parentTermName, other.parentTermName)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.attributeType, other.attributeType)
                && java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.customProperties, other.customProperties)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.tagSummary == null ? 43 : this.tagSummary.hashCode());
        result = (result * PRIME) + (this.termSummary == null ? 43 : this.termSummary.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result =
                (result * PRIME)
                        + (this.externalTypeName == null ? 43 : this.externalTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDataType == null ? 43 : this.externalDataType.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dataAssetType == null ? 43 : this.dataAssetType.hashCode());
        result =
                (result * PRIME)
                        + (this.dataAssetName == null ? 43 : this.dataAssetName.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.folderType == null ? 43 : this.folderType.hashCode());
        result = (result * PRIME) + (this.folderName == null ? 43 : this.folderName.hashCode());
        result = (result * PRIME) + (this.entitykey == null ? 43 : this.entitykey.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.glossaryName == null ? 43 : this.glossaryName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermKey == null ? 43 : this.parentTermKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTermName == null ? 43 : this.parentTermName.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result =
                (result * PRIME)
                        + (this.customProperties == null ? 43 : this.customProperties.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
