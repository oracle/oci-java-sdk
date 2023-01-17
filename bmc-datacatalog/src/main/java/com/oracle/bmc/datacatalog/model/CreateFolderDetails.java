/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in folder create operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateFolderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateFolderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "businessName",
        "description",
        "customPropertyMembers",
        "properties",
        "parentFolderKey",
        "timeExternal",
        "lastJobKey",
        "harvestStatus",
        "typeKey"
    })
    public CreateFolderDetails(
            String displayName,
            String businessName,
            String description,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties,
            String parentFolderKey,
            java.util.Date timeExternal,
            String lastJobKey,
            HarvestStatus harvestStatus,
            String typeKey) {
        super();
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
        this.parentFolderKey = parentFolderKey;
        this.timeExternal = timeExternal;
        this.lastJobKey = lastJobKey;
        this.harvestStatus = harvestStatus;
        this.typeKey = typeKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The list of customized properties along with the values for this object */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         *
         * @param customPropertyMembers the value to set
         * @return this builder
         */
        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the folder type. Each
         * folder type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most folders have required properties within
         * the "default" category. To determine the set of optional and required properties for a
         * folder type, a query can be done on '/types?type=folder' that returns a collection of all
         * folder types. The appropriate folder type, which includes definitions of all of it's
         * properties, can be identified from this collection. Example: {@code {"properties": {
         * "default": { "key1": "value1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the folder type. Each
         * folder type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most folders have required properties within
         * the "default" category. To determine the set of optional and required properties for a
         * folder type, a query can be done on '/types?type=folder' that returns a collection of all
         * folder types. The appropriate folder type, which includes definitions of all of it's
         * properties, can be identified from this collection. Example: {@code {"properties": {
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
        /** The key of the containing folder or null if there isn't a parent folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
        private String parentFolderKey;

        /**
         * The key of the containing folder or null if there isn't a parent folder.
         *
         * @param parentFolderKey the value to set
         * @return this builder
         */
        public Builder parentFolderKey(String parentFolderKey) {
            this.parentFolderKey = parentFolderKey;
            this.__explicitlySet__.add("parentFolderKey");
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
         * The job key of the harvest process that updated the folder definition from the source
         * system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        /**
         * The job key of the harvest process that updated the folder definition from the source
         * system.
         *
         * @param lastJobKey the value to set
         * @return this builder
         */
        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }
        /** Folder harvesting status. */
        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        /**
         * Folder harvesting status.
         *
         * @param harvestStatus the value to set
         * @return this builder
         */
        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }
        /** Type key of the object. Type keys can be found via the '/types' endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * Type key of the object. Type keys can be found via the '/types' endpoint.
         *
         * @param typeKey the value to set
         * @return this builder
         */
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFolderDetails build() {
            CreateFolderDetails model =
                    new CreateFolderDetails(
                            this.displayName,
                            this.businessName,
                            this.description,
                            this.customPropertyMembers,
                            this.properties,
                            this.parentFolderKey,
                            this.timeExternal,
                            this.lastJobKey,
                            this.harvestStatus,
                            this.typeKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFolderDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("businessName")) {
                this.businessName(model.getBusinessName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("customPropertyMembers")) {
                this.customPropertyMembers(model.getCustomPropertyMembers());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("parentFolderKey")) {
                this.parentFolderKey(model.getParentFolderKey());
            }
            if (model.wasPropertyExplicitlySet("timeExternal")) {
                this.timeExternal(model.getTimeExternal());
            }
            if (model.wasPropertyExplicitlySet("lastJobKey")) {
                this.lastJobKey(model.getLastJobKey());
            }
            if (model.wasPropertyExplicitlySet("harvestStatus")) {
                this.harvestStatus(model.getHarvestStatus());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
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

    /** The list of customized properties along with the values for this object */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     *
     * @return the value
     */
    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most folders have required properties within the "default"
     * category. To determine the set of optional and required properties for a folder type, a query
     * can be done on '/types?type=folder' that returns a collection of all folder types. The
     * appropriate folder type, which includes definitions of all of it's properties, can be
     * identified from this collection. Example: {@code {"properties": { "default": { "key1":
     * "value1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most folders have required properties within the "default"
     * category. To determine the set of optional and required properties for a folder type, a query
     * can be done on '/types?type=folder' that returns a collection of all folder types. The
     * appropriate folder type, which includes definitions of all of it's properties, can be
     * identified from this collection. Example: {@code {"properties": { "default": { "key1":
     * "value1"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    /** The key of the containing folder or null if there isn't a parent folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
    private final String parentFolderKey;

    /**
     * The key of the containing folder or null if there isn't a parent folder.
     *
     * @return the value
     */
    public String getParentFolderKey() {
        return parentFolderKey;
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
     * The job key of the harvest process that updated the folder definition from the source system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    private final String lastJobKey;

    /**
     * The job key of the harvest process that updated the folder definition from the source system.
     *
     * @return the value
     */
    public String getLastJobKey() {
        return lastJobKey;
    }

    /** Folder harvesting status. */
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    private final HarvestStatus harvestStatus;

    /**
     * Folder harvesting status.
     *
     * @return the value
     */
    public HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }

    /** Type key of the object. Type keys can be found via the '/types' endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     *
     * @return the value
     */
    public String getTypeKey() {
        return typeKey;
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
        sb.append("CreateFolderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", parentFolderKey=").append(String.valueOf(this.parentFolderKey));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(", harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFolderDetails)) {
            return false;
        }

        CreateFolderDetails other = (CreateFolderDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.parentFolderKey, other.parentFolderKey)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.parentFolderKey == null ? 43 : this.parentFolderKey.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
