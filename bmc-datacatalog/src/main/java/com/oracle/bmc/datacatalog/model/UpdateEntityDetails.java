/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in entity update operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateEntityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateEntityDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "businessName",
        "description",
        "timeExternal",
        "isLogical",
        "isPartition",
        "folderKey",
        "patternKey",
        "realizedExpression",
        "harvestStatus",
        "lastJobKey",
        "customPropertyMembers",
        "properties"
    })
    public UpdateEntityDetails(
            String displayName,
            String businessName,
            String description,
            java.util.Date timeExternal,
            Boolean isLogical,
            Boolean isPartition,
            String folderKey,
            String patternKey,
            String realizedExpression,
            HarvestStatus harvestStatus,
            String lastJobKey,
            java.util.List<CustomPropertySetUsage> customPropertyMembers,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.displayName = displayName;
        this.businessName = businessName;
        this.description = description;
        this.timeExternal = timeExternal;
        this.isLogical = isLogical;
        this.isPartition = isPartition;
        this.folderKey = folderKey;
        this.patternKey = patternKey;
        this.realizedExpression = realizedExpression;
        this.harvestStatus = harvestStatus;
        this.lastJobKey = lastJobKey;
        this.customPropertyMembers = customPropertyMembers;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * Last modified timestamp of the object in the external system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        /**
         * Last modified timestamp of the object in the external system.
         * @param timeExternal the value to set
         * @return this builder
         **/
        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }
        /**
         * Property to indicate if the object is a physical materialized object or virtual. For example, View.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
        private Boolean isLogical;

        /**
         * Property to indicate if the object is a physical materialized object or virtual. For example, View.
         * @param isLogical the value to set
         * @return this builder
         **/
        public Builder isLogical(Boolean isLogical) {
            this.isLogical = isLogical;
            this.__explicitlySet__.add("isLogical");
            return this;
        }
        /**
         * Property to indicate if the object is a sub object of a parent physical object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
        private Boolean isPartition;

        /**
         * Property to indicate if the object is a sub object of a parent physical object.
         * @param isPartition the value to set
         * @return this builder
         **/
        public Builder isPartition(Boolean isPartition) {
            this.isPartition = isPartition;
            this.__explicitlySet__.add("isPartition");
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
         * Status of the object as updated by the harvest process. When an entity object is created, it's harvest status
         * will indicate if the entity's metadata has been fully harvested or not. The harvest process can perform
         * shallow harvesting to allow users to browse the metadata and can on-demand deep harvest on any object
         * This requires a harvest status indicator for catalog objects.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        /**
         * Status of the object as updated by the harvest process. When an entity object is created, it's harvest status
         * will indicate if the entity's metadata has been fully harvested or not. The harvest process can perform
         * shallow harvesting to allow users to browse the metadata and can on-demand deep harvest on any object
         * This requires a harvest status indicator for catalog objects.
         *
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
         * The list of customized properties along with the values for this object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        /**
         * The list of customized properties along with the values for this object
         * @param customPropertyMembers the value to set
         * @return this builder
         **/
        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the entity type. Each entity type
         * definition defines it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * entities have required properties within the "default" category. To determine the set of required and
         * optional properties for an entity type, a query can be done on '/types?type=dataEntity' that returns a
         * collection of all entity types. The appropriate entity type, which includes definitions of all of
         * it's properties, can be identified from this collection.
         * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the entity type. Each entity type
         * definition defines it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * entities have required properties within the "default" category. To determine the set of required and
         * optional properties for an entity type, a query can be done on '/types?type=dataEntity' that returns a
         * collection of all entity types. The appropriate entity type, which includes definitions of all of
         * it's properties, can be identified from this collection.
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

        public UpdateEntityDetails build() {
            UpdateEntityDetails __instance__ =
                    new UpdateEntityDetails(
                            displayName,
                            businessName,
                            description,
                            timeExternal,
                            isLogical,
                            isPartition,
                            folderKey,
                            patternKey,
                            realizedExpression,
                            harvestStatus,
                            lastJobKey,
                            customPropertyMembers,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateEntityDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .businessName(o.getBusinessName())
                            .description(o.getDescription())
                            .timeExternal(o.getTimeExternal())
                            .isLogical(o.getIsLogical())
                            .isPartition(o.getIsPartition())
                            .folderKey(o.getFolderKey())
                            .patternKey(o.getPatternKey())
                            .realizedExpression(o.getRealizedExpression())
                            .harvestStatus(o.getHarvestStatus())
                            .lastJobKey(o.getLastJobKey())
                            .customPropertyMembers(o.getCustomPropertyMembers())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
     * Last modified timestamp of the object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    private final java.util.Date timeExternal;

    /**
     * Last modified timestamp of the object in the external system.
     * @return the value
     **/
    public java.util.Date getTimeExternal() {
        return timeExternal;
    }

    /**
     * Property to indicate if the object is a physical materialized object or virtual. For example, View.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
    private final Boolean isLogical;

    /**
     * Property to indicate if the object is a physical materialized object or virtual. For example, View.
     * @return the value
     **/
    public Boolean getIsLogical() {
        return isLogical;
    }

    /**
     * Property to indicate if the object is a sub object of a parent physical object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
    private final Boolean isPartition;

    /**
     * Property to indicate if the object is a sub object of a parent physical object.
     * @return the value
     **/
    public Boolean getIsPartition() {
        return isPartition;
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
     * Status of the object as updated by the harvest process. When an entity object is created, it's harvest status
     * will indicate if the entity's metadata has been fully harvested or not. The harvest process can perform
     * shallow harvesting to allow users to browse the metadata and can on-demand deep harvest on any object
     * This requires a harvest status indicator for catalog objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    private final HarvestStatus harvestStatus;

    /**
     * Status of the object as updated by the harvest process. When an entity object is created, it's harvest status
     * will indicate if the entity's metadata has been fully harvested or not. The harvest process can perform
     * shallow harvesting to allow users to browse the metadata and can on-demand deep harvest on any object
     * This requires a harvest status indicator for catalog objects.
     *
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
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    private final java.util.List<CustomPropertySetUsage> customPropertyMembers;

    /**
     * The list of customized properties along with the values for this object
     * @return the value
     **/
    public java.util.List<CustomPropertySetUsage> getCustomPropertyMembers() {
        return customPropertyMembers;
    }

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * entities have required properties within the "default" category. To determine the set of required and
     * optional properties for an entity type, a query can be done on '/types?type=dataEntity' that returns a
     * collection of all entity types. The appropriate entity type, which includes definitions of all of
     * it's properties, can be identified from this collection.
     * Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * entities have required properties within the "default" category. To determine the set of required and
     * optional properties for an entity type, a query can be done on '/types?type=dataEntity' that returns a
     * collection of all entity types. The appropriate entity type, which includes definitions of all of
     * it's properties, can be identified from this collection.
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
        sb.append("UpdateEntityDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", businessName=").append(String.valueOf(this.businessName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(", isLogical=").append(String.valueOf(this.isLogical));
        sb.append(", isPartition=").append(String.valueOf(this.isPartition));
        sb.append(", folderKey=").append(String.valueOf(this.folderKey));
        sb.append(", patternKey=").append(String.valueOf(this.patternKey));
        sb.append(", realizedExpression=").append(String.valueOf(this.realizedExpression));
        sb.append(", harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(", lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(", customPropertyMembers=").append(String.valueOf(this.customPropertyMembers));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateEntityDetails)) {
            return false;
        }

        UpdateEntityDetails other = (UpdateEntityDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.isLogical, other.isLogical)
                && java.util.Objects.equals(this.isPartition, other.isPartition)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.patternKey, other.patternKey)
                && java.util.Objects.equals(this.realizedExpression, other.realizedExpression)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.customPropertyMembers, other.customPropertyMembers)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result = (result * PRIME) + (this.isLogical == null ? 43 : this.isLogical.hashCode());
        result = (result * PRIME) + (this.isPartition == null ? 43 : this.isPartition.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.patternKey == null ? 43 : this.patternKey.hashCode());
        result =
                (result * PRIME)
                        + (this.realizedExpression == null
                                ? 43
                                : this.realizedExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.customPropertyMembers == null
                                ? 43
                                : this.customPropertyMembers.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
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
