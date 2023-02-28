/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A generic term used in the data catalog for an external organization concept used for a
 * collection of data entities or processes within a data asset. This term is an internal term which
 * models multiple external types of folder, such as file directories, database schemas, and so on.
 * Some data assets, such as Object Store containers, may contain many levels of folders. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Folder.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Folder extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "businessName",
        "description",
        "parentFolderKey",
        "typeKey",
        "timeHarvested",
        "objectRelationships",
        "path",
        "dataAssetKey",
        "customPropertyMembers",
        "properties",
        "externalKey",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "timeExternal",
        "lifecycleState",
        "harvestStatus",
        "lastJobKey",
        "uri",
        "objectStorageUrl"
    })
    public Folder(
            String key,
            String displayName,
            String businessName,
            String description,
            String parentFolderKey,
            String typeKey,
            java.util.Date timeHarvested,
            java.util.List<ObjectRelationship> objectRelationships,
            String path,
            String dataAssetKey,
            java.util.List<CustomPropertyGetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties,
            String externalKey,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            java.util.Date timeExternal,
            LifecycleState lifecycleState,
            HarvestStatus harvestStatus,
            String lastJobKey,
            String uri,
            String objectStorageUrl) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.parentFolderKey = parentFolderKey;
        this.typeKey = typeKey;
        this.timeHarvested = timeHarvested;
        this.objectRelationships = objectRelationships;
        this.path = path;
        this.dataAssetKey = dataAssetKey;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
        this.externalKey = externalKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.timeExternal = timeExternal;
        this.lifecycleState = lifecycleState;
        this.harvestStatus = harvestStatus;
        this.lastJobKey = lastJobKey;
        this.uri = uri;
        this.objectStorageUrl = objectStorageUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique folder key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique folder key that is immutable.
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
         * Optional user friendly business name of the folder. If set, this supplements the
         * harvested display name of the object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("businessName")
        private String businessName;

        /**
         * Optional user friendly business name of the folder. If set, this supplements the
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
        /** Detailed description of a folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of a folder.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The unique key of the containing folder or null if there is no parent folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
        private String parentFolderKey;

        /**
         * The unique key of the containing folder or null if there is no parent folder.
         *
         * @param parentFolderKey the value to set
         * @return this builder
         */
        public Builder parentFolderKey(String parentFolderKey) {
            this.parentFolderKey = parentFolderKey;
            this.__explicitlySet__.add("parentFolderKey");
            return this;
        }
        /** The type of folder object. Type keys can be found via the '/types' endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * The type of folder object. Type keys can be found via the '/types' endpoint.
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
         * The date and time the folder was harvested, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeHarvested")
        private java.util.Date timeHarvested;

        /**
         * The date and time the folder was harvested, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeHarvested the value to set
         * @return this builder
         */
        public Builder timeHarvested(java.util.Date timeHarvested) {
            this.timeHarvested = timeHarvested;
            this.__explicitlySet__.add("timeHarvested");
            return this;
        }
        /** List of objects and their relationships to this folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectRelationships")
        private java.util.List<ObjectRelationship> objectRelationships;

        /**
         * List of objects and their relationships to this folder.
         *
         * @param objectRelationships the value to set
         * @return this builder
         */
        public Builder objectRelationships(java.util.List<ObjectRelationship> objectRelationships) {
            this.objectRelationships = objectRelationships;
            this.__explicitlySet__.add("objectRelationships");
            return this;
        }
        /** Full path of the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Full path of the folder.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The key of the associated data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * The key of the associated data asset.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
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
        /**
         * A map of maps that contains the properties which are specific to the folder type. Each
         * folder type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most folders have required properties within
         * the "default" category. Example: {@code {"properties": { "default": { "key1":
         * "value1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the folder type. Each
         * folder type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most folders have required properties within
         * the "default" category. Example: {@code {"properties": { "default": { "key1":
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
        /** Unique external key of this object in the source system. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * Unique external key of this object in the source system.
         *
         * @param externalKey the value to set
         * @return this builder
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /**
         * The date and time the folder was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the folder was created, in the format defined by
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
         * The last time that any change was made to the folder. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the folder. An
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
        /** OCID of the user who created the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the folder.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who modified the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who modified the folder.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /** Last modified timestamp of this object in the external system. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        /**
         * Last modified timestamp of this object in the external system.
         *
         * @param timeExternal the value to set
         * @return this builder
         */
        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }
        /** The current state of the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the folder.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Status of the object as updated by the harvest process. */
        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        /**
         * Status of the object as updated by the harvest process.
         *
         * @param harvestStatus the value to set
         * @return this builder
         */
        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }
        /** The key of the last harvest process to update the metadata of this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        /**
         * The key of the last harvest process to update the metadata of this object.
         *
         * @param lastJobKey the value to set
         * @return this builder
         */
        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }
        /** URI to the folder instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the folder instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** URL of the folder in the object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUrl")
        private String objectStorageUrl;

        /**
         * URL of the folder in the object store.
         *
         * @param objectStorageUrl the value to set
         * @return this builder
         */
        public Builder objectStorageUrl(String objectStorageUrl) {
            this.objectStorageUrl = objectStorageUrl;
            this.__explicitlySet__.add("objectStorageUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Folder build() {
            Folder model =
                    new Folder(
                            this.key,
                            this.displayName,
                            this.businessName,
                            this.description,
                            this.parentFolderKey,
                            this.typeKey,
                            this.timeHarvested,
                            this.objectRelationships,
                            this.path,
                            this.dataAssetKey,
                            this.customPropertyMembers,
                            this.properties,
                            this.externalKey,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.timeExternal,
                            this.lifecycleState,
                            this.harvestStatus,
                            this.lastJobKey,
                            this.uri,
                            this.objectStorageUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Folder model) {
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
            if (model.wasPropertyExplicitlySet("parentFolderKey")) {
                this.parentFolderKey(model.getParentFolderKey());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("timeHarvested")) {
                this.timeHarvested(model.getTimeHarvested());
            }
            if (model.wasPropertyExplicitlySet("objectRelationships")) {
                this.objectRelationships(model.getObjectRelationships());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
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
            if (model.wasPropertyExplicitlySet("timeExternal")) {
                this.timeExternal(model.getTimeExternal());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("harvestStatus")) {
                this.harvestStatus(model.getHarvestStatus());
            }
            if (model.wasPropertyExplicitlySet("lastJobKey")) {
                this.lastJobKey(model.getLastJobKey());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("objectStorageUrl")) {
                this.objectStorageUrl(model.getObjectStorageUrl());
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

    /** Unique folder key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique folder key that is immutable.
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
     * Optional user friendly business name of the folder. If set, this supplements the harvested
     * display name of the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("businessName")
    private final String businessName;

    /**
     * Optional user friendly business name of the folder. If set, this supplements the harvested
     * display name of the object.
     *
     * @return the value
     */
    public String getBusinessName() {
        return businessName;
    }

    /** Detailed description of a folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of a folder.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The unique key of the containing folder or null if there is no parent folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
    private final String parentFolderKey;

    /**
     * The unique key of the containing folder or null if there is no parent folder.
     *
     * @return the value
     */
    public String getParentFolderKey() {
        return parentFolderKey;
    }

    /** The type of folder object. Type keys can be found via the '/types' endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * The type of folder object. Type keys can be found via the '/types' endpoint.
     *
     * @return the value
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * The date and time the folder was harvested, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeHarvested")
    private final java.util.Date timeHarvested;

    /**
     * The date and time the folder was harvested, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeHarvested() {
        return timeHarvested;
    }

    /** List of objects and their relationships to this folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectRelationships")
    private final java.util.List<ObjectRelationship> objectRelationships;

    /**
     * List of objects and their relationships to this folder.
     *
     * @return the value
     */
    public java.util.List<ObjectRelationship> getObjectRelationships() {
        return objectRelationships;
    }

    /** Full path of the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Full path of the folder.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The key of the associated data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * The key of the associated data asset.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
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

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most folders have required properties within the "default"
     * category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most folders have required properties within the "default"
     * category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /** Unique external key of this object in the source system. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * Unique external key of this object in the source system.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * The date and time the folder was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the folder was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the folder. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the folder. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the folder.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who modified the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who modified the folder.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /** Last modified timestamp of this object in the external system. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    private final java.util.Date timeExternal;

    /**
     * Last modified timestamp of this object in the external system.
     *
     * @return the value
     */
    public java.util.Date getTimeExternal() {
        return timeExternal;
    }

    /** The current state of the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the folder.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Status of the object as updated by the harvest process. */
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    private final HarvestStatus harvestStatus;

    /**
     * Status of the object as updated by the harvest process.
     *
     * @return the value
     */
    public HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }

    /** The key of the last harvest process to update the metadata of this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    private final String lastJobKey;

    /**
     * The key of the last harvest process to update the metadata of this object.
     *
     * @return the value
     */
    public String getLastJobKey() {
        return lastJobKey;
    }

    /** URI to the folder instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the folder instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** URL of the folder in the object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUrl")
    private final String objectStorageUrl;

    /**
     * URL of the folder in the object store.
     *
     * @return the value
     */
    public String getObjectStorageUrl() {
        return objectStorageUrl;
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
        sb.append("Folder(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parentFolderKey=").append(String.valueOf(this.parentFolderKey));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", timeHarvested=").append(String.valueOf(this.timeHarvested));
        sb.append(", objectRelationships=").append(String.valueOf(this.objectRelationships));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(", lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", objectStorageUrl=").append(String.valueOf(this.objectStorageUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Folder)) {
            return false;
        }

        Folder other = (Folder) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parentFolderKey, other.parentFolderKey)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.timeHarvested, other.timeHarvested)
                && java.util.Objects.equals(this.objectRelationships, other.objectRelationships)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.objectStorageUrl, other.objectStorageUrl)
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
        result =
                (result * PRIME)
                        + (this.parentFolderKey == null ? 43 : this.parentFolderKey.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHarvested == null ? 43 : this.timeHarvested.hashCode());
        result =
                (result * PRIME)
                        + (this.objectRelationships == null
                                ? 43
                                : this.objectRelationships.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageUrl == null ? 43 : this.objectStorageUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
