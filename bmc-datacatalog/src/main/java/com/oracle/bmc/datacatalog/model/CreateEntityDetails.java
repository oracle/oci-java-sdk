/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in data entity create operations.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateEntityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateEntityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
        private Boolean isLogical;

        public Builder isLogical(Boolean isLogical) {
            this.isLogical = isLogical;
            this.__explicitlySet__.add("isLogical");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
        private Boolean isPartition;

        public Builder isPartition(Boolean isPartition) {
            this.isPartition = isPartition;
            this.__explicitlySet__.add("isPartition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEntityDetails build() {
            CreateEntityDetails __instance__ =
                    new CreateEntityDetails(
                            displayName,
                            description,
                            timeExternal,
                            isLogical,
                            isPartition,
                            folderKey,
                            harvestStatus,
                            lastJobKey,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEntityDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .timeExternal(o.getTimeExternal())
                            .isLogical(o.getIsLogical())
                            .isPartition(o.getIsPartition())
                            .folderKey(o.getFolderKey())
                            .harvestStatus(o.getHarvestStatus())
                            .lastJobKey(o.getLastJobKey())
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

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of a data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Last modified timestamp of the object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    java.util.Date timeExternal;

    /**
     * Property to indicate if the object is a physical materialized object or virtual. For example, View.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogical")
    Boolean isLogical;

    /**
     * Property to indicate if the object is a sub object of a parent physical object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
    Boolean isPartition;

    /**
     * Key of the associated folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    String folderKey;

    /**
     * Status of the object as updated by the harvest process. When an entity object is created , it's harvest status
     * will indicate if the entity's metadata has been fully harvested or not. The harvest process can perform
     * shallow harvesting to allow users to browse the metadata and can on-demand deep harvest on any object
     * This requires a harvest status indicator for catalog objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    HarvestStatus harvestStatus;

    /**
     * Key of the last harvest process to update this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    String lastJobKey;

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * entities have required properties within the \"default\" category. To determine the set of required and
     * optional properties for an entity type, a query can be done on '/types?type=dataEntity' that returns a
     * collection of all entity types. The appropriate entity type, which includes definitions of all of
     * it's properties, can be identified from this collection.
     * Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
