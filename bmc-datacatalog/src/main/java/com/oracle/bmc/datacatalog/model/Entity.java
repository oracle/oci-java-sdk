/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Data entity details. A representation of data with a set of attributes, normally representing a single
 * business entity. Synonymous with 'table' or 'view' in a database, or a single logical file structure
 * that one or many files may match.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Entity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Entity extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "businessName",
        "description",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "lifecycleState",
        "externalKey",
        "patternKey",
        "realizedExpression",
        "timeExternal",
        "timeHarvested",
        "objectRelationships",
        "timeStatusUpdated",
        "isLogical",
        "isPartition",
        "dataAssetKey",
        "folderKey",
        "folderName",
        "path",
        "harvestStatus",
        "lastJobKey",
        "typeKey",
        "uri",
        "objectStorageUrl",
        "customPropertyMembers",
        "properties"
    })
    public Entity(
            String key,
            String displayName,
            String businessName,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            LifecycleState lifecycleState,
            String externalKey,
            String patternKey,
            String realizedExpression,
            java.util.Date timeExternal,
            java.util.Date timeHarvested,
            java.util.List<ObjectRelationship> objectRelationships,
            java.util.Date timeStatusUpdated,
            Boolean isLogical,
            Boolean isPartition,
            String dataAssetKey,
            String folderKey,
            String folderName,
            String path,
            HarvestStatus harvestStatus,
            String lastJobKey,
            String typeKey,
            String uri,
            String objectStorageUrl,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.lifecycleState = lifecycleState;
        this.externalKey = externalKey;
        this.patternKey = patternKey;
        this.realizedExpression = realizedExpression;
        this.timeExternal = timeExternal;
        this.timeHarvested = timeHarvested;
        this.objectRelationships = objectRelationships;
        this.timeStatusUpdated = timeStatusUpdated;
        this.isLogical = isLogical;
        this.isPartition = isPartition;
        this.dataAssetKey = dataAssetKey;
        this.folderKey = folderKey;
        this.folderName = folderName;
        this.path = path;
        this.harvestStatus = harvestStatus;
        this.lastJobKey = lastJobKey;
        this.typeKey = typeKey;
        this.uri = uri;
        this.objectStorageUrl = objectStorageUrl;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique data entity key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique data entity key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Optional user friendly business name of the data entity. If set, this supplements the harvested display name of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        /**
         * Optional user friendly business name of the data entity. If set, this supplements the harvested display name of the object.
         * @param businessName the value to set
         * @return this builder
         **/
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            this.__explicitlySet__.add("businessName");
            return this;
        }
        /**
         * Detailed description of a data entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of a data entity.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time the data entity was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the data entity was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time that any change was made to the data entity. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the data entity. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * OCID of the user who created this object in the data catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created this object in the data catalog.
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * OCID of the user who updated this object in the data catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who updated this object in the data catalog.
         * @param updatedById the value to set
         * @return this builder
         **/
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /**
         * The current state of the data entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the data entity.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Unique external key of this object in the source system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * Unique external key of this object in the source system.
         * @param externalKey the value to set
         * @return this builder
         **/
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /**
         * Key of the associated pattern if this is a logical entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patternKey")
        private String patternKey;

        /**
         * Key of the associated pattern if this is a logical entity.
         * @param patternKey the value to set
         * @return this builder
         **/
        public Builder patternKey(String patternKey) {
            this.patternKey = patternKey;
            this.__explicitlySet__.add("patternKey");
            return this;
        }
        /**
         * The expression realized after resolving qualifiers . Used in deriving this logical entity
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
        private String realizedExpression;

        /**
         * The expression realized after resolving qualifiers . Used in deriving this logical entity
         * @param realizedExpression the value to set
         * @return this builder
         **/
        public Builder realizedExpression(String realizedExpression) {
            this.realizedExpression = realizedExpression;
            this.__explicitlySet__.add("realizedExpression");
            return this;
        }
        /**
         * Last modified timestamp of this object in the external system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        /**
         * Last modified timestamp of this object in the external system.
         * @param timeExternal the value to set
         * @return this builder
         **/
        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }
        /**
         * The date and time the entity was harvested, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeHarvested")
        private java.util.Date timeHarvested;

        /**
         * The date and time the entity was harvested, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeHarvested the value to set
         * @return this builder
         **/
        public Builder timeHarvested(java.util.Date timeHarvested) {
            this.timeHarvested = timeHarvested;
            this.__explicitlySet__.add("timeHarvested");
            return this;
        }
        /**
         * List of objects and their relationships to this entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectRelationships")
        private java.util.List<ObjectRelationship> objectRelationships;

        /**
         * List of objects and their relationships to this entity.
         * @param objectRelationships the value to set
         * @return this builder
         **/
        public Builder objectRelationships(java.util.List<ObjectRelationship> objectRelationships) {
            this.objectRelationships = objectRelationships;
            this.__explicitlySet__.add("objectRelationships");
            return this;
        }
        /**
         * Time that the data entities status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        /**
         * Time that the data entities status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeStatusUpdated the value to set
         * @return this builder
         **/
        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }
        /**
         * Property that identifies if the object is a physical object (materialized) or virtual/logical object
         * defined on other objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
        private Boolean isLogical;

        /**
         * Property that identifies if the object is a physical object (materialized) or virtual/logical object
         * defined on other objects.
         *
         * @param isLogical the value to set
         * @return this builder
         **/
        public Builder isLogical(Boolean isLogical) {
            this.isLogical = isLogical;
            this.__explicitlySet__.add("isLogical");
            return this;
        }
        /**
         * Property that identifies if an object is a sub object of a physical or materialized parent object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
        private Boolean isPartition;

        /**
         * Property that identifies if an object is a sub object of a physical or materialized parent object.
         * @param isPartition the value to set
         * @return this builder
         **/
        public Builder isPartition(Boolean isPartition) {
            this.isPartition = isPartition;
            this.__explicitlySet__.add("isPartition");
            return this;
        }
        /**
         * Unique key of the parent data asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * Unique key of the parent data asset.
         * @param dataAssetKey the value to set
         * @return this builder
         **/
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /**
         * Key of the associated folder.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        /**
         * Key of the associated folder.
         * @param folderKey the value to set
         * @return this builder
         **/
        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }
        /**
         * Name of the associated folder. This name is harvested from the source data asset when the parent folder for the entiy is harvested.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("folderName")
        private String folderName;

        /**
         * Name of the associated folder. This name is harvested from the source data asset when the parent folder for the entiy is harvested.
         * @param folderName the value to set
         * @return this builder
         **/
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            this.__explicitlySet__.add("folderName");
            return this;
        }
        /**
         * Full path of the data entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Full path of the data entity.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Status of the object as updated by the harvest process.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        /**
         * Status of the object as updated by the harvest process.
         * @param harvestStatus the value to set
         * @return this builder
         **/
        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }
        /**
         * Key of the last harvest process to update this object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        /**
         * Key of the last harvest process to update this object.
         * @param lastJobKey the value to set
         * @return this builder
         **/
        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }
        /**
         * The type of data entity object. Type key's can be found via the '/types' endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * The type of data entity object. Type key's can be found via the '/types' endpoint.
         * @param typeKey the value to set
         * @return this builder
         **/
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }
        /**
         * URI to the data entity instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the data entity instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * URL of the data entity in the object store.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUrl")
        private String objectStorageUrl;

        /**
         * URL of the data entity in the object store.
         * @param objectStorageUrl the value to set
         * @return this builder
         **/
        public Builder objectStorageUrl(String objectStorageUrl) {
            this.objectStorageUrl = objectStorageUrl;
            this.__explicitlySet__.add("objectStorageUrl");
            return this;
        }
        /**
         * The list of customized properties along with the values for this object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertyGetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         * @param customPropertyMembers the value to set
         * @return this builder
         **/
        public Builder customPropertyMembers(
                java.util.List<CustomPropertyGetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the entity type. Each entity type
         * definition defines it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * data entities have required properties within the "default" category.
         * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the entity type. Each entity type
         * definition defines it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * data entities have required properties within the "default" category.
         * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
         *
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Entity build() {
            Entity model =
                    new Entity(
                            this.key,
                            this.displayName,
                            this.businessName,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.lifecycleState,
                            this.externalKey,
                            this.patternKey,
                            this.realizedExpression,
                            this.timeExternal,
                            this.timeHarvested,
                            this.objectRelationships,
                            this.timeStatusUpdated,
                            this.isLogical,
                            this.isPartition,
                            this.dataAssetKey,
                            this.folderKey,
                            this.folderName,
                            this.path,
                            this.harvestStatus,
                            this.lastJobKey,
                            this.typeKey,
                            this.uri,
                            this.objectStorageUrl,
                            this.customPropertyMembers,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Entity model) {
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("patternKey")) {
                this.patternKey(model.getPatternKey());
            }
            if (model.wasPropertyExplicitlySet("realizedExpression")) {
                this.realizedExpression(model.getRealizedExpression());
            }
            if (model.wasPropertyExplicitlySet("timeExternal")) {
                this.timeExternal(model.getTimeExternal());
            }
            if (model.wasPropertyExplicitlySet("timeHarvested")) {
                this.timeHarvested(model.getTimeHarvested());
            }
            if (model.wasPropertyExplicitlySet("objectRelationships")) {
                this.objectRelationships(model.getObjectRelationships());
            }
            if (model.wasPropertyExplicitlySet("timeStatusUpdated")) {
                this.timeStatusUpdated(model.getTimeStatusUpdated());
            }
            if (model.wasPropertyExplicitlySet("isLogical")) {
                this.isLogical(model.getIsLogical());
            }
            if (model.wasPropertyExplicitlySet("isPartition")) {
                this.isPartition(model.getIsPartition());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("folderKey")) {
                this.folderKey(model.getFolderKey());
            }
            if (model.wasPropertyExplicitlySet("folderName")) {
                this.folderName(model.getFolderName());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("harvestStatus")) {
                this.harvestStatus(model.getHarvestStatus());
            }
            if (model.wasPropertyExplicitlySet("lastJobKey")) {
                this.lastJobKey(model.getLastJobKey());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("objectStorageUrl")) {
                this.objectStorageUrl(model.getObjectStorageUrl());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            return this;
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
     * Unique data entity key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique data entity key that is immutable.
     * @return the value
     **/
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

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional user friendly business name of the data entity. If set, this supplements the harvested display name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    /**
     * Optional user friendly business name of the data entity. If set, this supplements the harvested display name of the object.
     * @return the value
     **/
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Detailed description of a data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of a data entity.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The date and time the data entity was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the data entity was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the data entity. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the data entity. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * OCID of the user who created this object in the data catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created this object in the data catalog.
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who updated this object in the data catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who updated this object in the data catalog.
     * @return the value
     **/
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * The current state of the data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the data entity.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Unique external key of this object in the source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * Unique external key of this object in the source system.
     * @return the value
     **/
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Key of the associated pattern if this is a logical entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternKey")
    private final String patternKey;

    /**
     * Key of the associated pattern if this is a logical entity.
     * @return the value
     **/
    public String getPatternKey() {
        return patternKey;
    }

    /**
     * The expression realized after resolving qualifiers . Used in deriving this logical entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realizedExpression")
    private final String realizedExpression;

    /**
     * The expression realized after resolving qualifiers . Used in deriving this logical entity
     * @return the value
     **/
    public String getRealizedExpression() {
        return realizedExpression;
    }

    /**
     * Last modified timestamp of this object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    private final java.util.Date timeExternal;

    /**
     * Last modified timestamp of this object in the external system.
     * @return the value
     **/
    public java.util.Date getTimeExternal() {
        return timeExternal;
    }

    /**
     * The date and time the entity was harvested, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeHarvested")
    private final java.util.Date timeHarvested;

    /**
     * The date and time the entity was harvested, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeHarvested() {
        return timeHarvested;
    }

    /**
     * List of objects and their relationships to this entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectRelationships")
    private final java.util.List<ObjectRelationship> objectRelationships;

    /**
     * List of objects and their relationships to this entity.
     * @return the value
     **/
    public java.util.List<ObjectRelationship> getObjectRelationships() {
        return objectRelationships;
    }

    /**
     * Time that the data entities status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    private final java.util.Date timeStatusUpdated;

    /**
     * Time that the data entities status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeStatusUpdated() {
        return timeStatusUpdated;
    }

    /**
     * Property that identifies if the object is a physical object (materialized) or virtual/logical object
     * defined on other objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
    private final Boolean isLogical;

    /**
     * Property that identifies if the object is a physical object (materialized) or virtual/logical object
     * defined on other objects.
     *
     * @return the value
     **/
    public Boolean getIsLogical() {
        return isLogical;
    }

    /**
     * Property that identifies if an object is a sub object of a physical or materialized parent object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
    private final Boolean isPartition;

    /**
     * Property that identifies if an object is a sub object of a physical or materialized parent object.
     * @return the value
     **/
    public Boolean getIsPartition() {
        return isPartition;
    }

    /**
     * Unique key of the parent data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * Unique key of the parent data asset.
     * @return the value
     **/
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /**
     * Key of the associated folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    private final String folderKey;

    /**
     * Key of the associated folder.
     * @return the value
     **/
    public String getFolderKey() {
        return folderKey;
    }

    /**
     * Name of the associated folder. This name is harvested from the source data asset when the parent folder for the entiy is harvested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    private final String folderName;

    /**
     * Name of the associated folder. This name is harvested from the source data asset when the parent folder for the entiy is harvested.
     * @return the value
     **/
    public String getFolderName() {
        return folderName;
    }

    /**
     * Full path of the data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Full path of the data entity.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * Status of the object as updated by the harvest process.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    private final HarvestStatus harvestStatus;

    /**
     * Status of the object as updated by the harvest process.
     * @return the value
     **/
    public HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }

    /**
     * Key of the last harvest process to update this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    private final String lastJobKey;

    /**
     * Key of the last harvest process to update this object.
     * @return the value
     **/
    public String getLastJobKey() {
        return lastJobKey;
    }

    /**
     * The type of data entity object. Type key's can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * The type of data entity object. Type key's can be found via the '/types' endpoint.
     * @return the value
     **/
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * URI to the data entity instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the data entity instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * URL of the data entity in the object store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUrl")
    private final String objectStorageUrl;

    /**
     * URL of the data entity in the object store.
     * @return the value
     **/
    public String getObjectStorageUrl() {
        return objectStorageUrl;
    }

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertyGetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     * @return the value
     **/
    public java.util.List<CustomPropertyGetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * data entities have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * data entities have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Entity(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", patternKey=").append(String.valueOf(this.patternKey));
        sb.append(", realizedExpression=").append(String.valueOf(this.realizedExpression));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", timeHarvested=").append(String.valueOf(this.timeHarvested));
        sb.append(", objectRelationships=").append(String.valueOf(this.objectRelationships));
        sb.append(", timeStatusUpdated=").append(String.valueOf(this.timeStatusUpdated));
        sb.append(", isLogical=").append(String.valueOf(this.isLogical));
        sb.append(", isPartition=").append(String.valueOf(this.isPartition));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", folderKey=").append(String.valueOf(this.folderKey));
        sb.append(", folderName=").append(String.valueOf(this.folderName));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(", lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", objectStorageUrl=").append(String.valueOf(this.objectStorageUrl));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Entity)) {
            return false;
        }

        Entity other = (Entity) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.patternKey, other.patternKey)
                && java.util.Objects.equals(this.realizedExpression, other.realizedExpression)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.timeHarvested, other.timeHarvested)
                && java.util.Objects.equals(this.objectRelationships, other.objectRelationships)
                && java.util.Objects.equals(this.timeStatusUpdated, other.timeStatusUpdated)
                && java.util.Objects.equals(this.isLogical, other.isLogical)
                && java.util.Objects.equals(this.isPartition, other.isPartition)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.folderName, other.folderName)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.objectStorageUrl, other.objectStorageUrl)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.patternKey == null ? 43 : this.patternKey.hashCode());
        result =
                (result * PRIME)
                        + (this.realizedExpression == null
                                ? 43
                                : this.realizedExpression.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHarvested == null ? 43 : this.timeHarvested.hashCode());
        result =
                (result * PRIME)
                        + (this.objectRelationships == null
                                ? 43
                                : this.objectRelationships.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusUpdated == null ? 43 : this.timeStatusUpdated.hashCode());
        result = (result * PRIME) + (this.isLogical == null ? 43 : this.isLogical.hashCode());
        result = (result * PRIME) + (this.isPartition == null ? 43 : this.isPartition.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.folderName == null ? 43 : this.folderName.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageUrl == null ? 43 : this.objectStorageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
