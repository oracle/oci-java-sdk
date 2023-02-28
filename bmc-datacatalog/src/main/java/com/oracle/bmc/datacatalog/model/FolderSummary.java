/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of a folder. A generic term used in the data catalog for an external organization concept
 * used for a collection of data entities or processes within a data asset. This term is an internal
 * term which models multiple external types of folder, such as file directories, database schemas,
 * and so on. Some data assets, such as Object Store containers, may contain many levels of folders.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FolderSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FolderSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "businessName",
        "description",
        "dataAssetKey",
        "parentFolderKey",
        "typeKey",
        "path",
        "externalKey",
        "timeExternal",
        "timeCreated",
        "timeUpdated",
        "uri",
        "objectStorageUrl",
        "lifecycleState"
    })
    public FolderSummary(
            String key,
            String displayName,
            String businessName,
            String description,
            String dataAssetKey,
            String parentFolderKey,
            String typeKey,
            String path,
            String externalKey,
            java.util.Date timeExternal,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String uri,
            String objectStorageUrl,
            LifecycleState lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.dataAssetKey = dataAssetKey;
        this.parentFolderKey = parentFolderKey;
        this.typeKey = typeKey;
        this.path = path;
        this.externalKey = externalKey;
        this.timeExternal = timeExternal;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.uri = uri;
        this.objectStorageUrl = objectStorageUrl;
        this.lifecycleState = lifecycleState;
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
        /** The unique key of the parent data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * The unique key of the parent data asset.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /** The key of the containing folder or null if there is no parent. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
        private String parentFolderKey;

        /**
         * The key of the containing folder or null if there is no parent.
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
        /** Unique external key of this object from the source systems. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * Unique external key of this object from the source systems.
         *
         * @param externalKey the value to set
         * @return this builder
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
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
         * The date and time the folder was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-03-25T21:10:29.600Z
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the folder was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-03-25T21:10:29.600Z
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** URI of the folder resource within the data catalog API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI of the folder resource within the data catalog API.
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
        /** State of the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the folder.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FolderSummary build() {
            FolderSummary model =
                    new FolderSummary(
                            this.key,
                            this.displayName,
                            this.businessName,
                            this.description,
                            this.dataAssetKey,
                            this.parentFolderKey,
                            this.typeKey,
                            this.path,
                            this.externalKey,
                            this.timeExternal,
                            this.timeCreated,
                            this.timeUpdated,
                            this.uri,
                            this.objectStorageUrl,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FolderSummary model) {
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
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("parentFolderKey")) {
                this.parentFolderKey(model.getParentFolderKey());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("timeExternal")) {
                this.timeExternal(model.getTimeExternal());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("objectStorageUrl")) {
                this.objectStorageUrl(model.getObjectStorageUrl());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** The unique key of the parent data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * The unique key of the parent data asset.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /** The key of the containing folder or null if there is no parent. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
    private final String parentFolderKey;

    /**
     * The key of the containing folder or null if there is no parent.
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

    /** Unique external key of this object from the source systems. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * Unique external key of this object from the source systems.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
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
     * The date and time the folder was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-03-25T21:10:29.600Z
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the folder was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2019-03-25T21:10:29.600Z
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** URI of the folder resource within the data catalog API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI of the folder resource within the data catalog API.
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

    /** State of the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the folder.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("FolderSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", parentFolderKey=").append(String.valueOf(this.parentFolderKey));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", objectStorageUrl=").append(String.valueOf(this.objectStorageUrl));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FolderSummary)) {
            return false;
        }

        FolderSummary other = (FolderSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.parentFolderKey, other.parentFolderKey)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.objectStorageUrl, other.objectStorageUrl)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentFolderKey == null ? 43 : this.parentFolderKey.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageUrl == null ? 43 : this.objectStorageUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
