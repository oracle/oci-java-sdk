/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in folder create operations.
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
    builder = CreateFolderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateFolderDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
        private java.util.List<CustomPropertySetUsage> customPropertyMembers;

        public Builder customPropertyMembers(
                java.util.List<CustomPropertySetUsage> customPropertyMembers) {
            this.customPropertyMembers = customPropertyMembers;
            this.__explicitlySet__.add("customPropertyMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
        private String parentFolderKey;

        public Builder parentFolderKey(String parentFolderKey) {
            this.parentFolderKey = parentFolderKey;
            this.__explicitlySet__.add("parentFolderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
        private java.util.Date timeExternal;

        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            this.__explicitlySet__.add("timeExternal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
        private String lastJobKey;

        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            this.__explicitlySet__.add("lastJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
        private HarvestStatus harvestStatus;

        public Builder harvestStatus(HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            this.__explicitlySet__.add("harvestStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFolderDetails build() {
            CreateFolderDetails __instance__ =
                    new CreateFolderDetails(
                            displayName,
                            description,
                            customPropertyMembers,
                            properties,
                            parentFolderKey,
                            timeExternal,
                            lastJobKey,
                            harvestStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFolderDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .customPropertyMembers(o.getCustomPropertyMembers())
                            .properties(o.getProperties())
                            .parentFolderKey(o.getParentFolderKey())
                            .timeExternal(o.getTimeExternal())
                            .lastJobKey(o.getLastJobKey())
                            .harvestStatus(o.getHarvestStatus());

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
     * Detailed description of a folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The list of customized properties along with the values for this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyMembers")
    java.util.List<CustomPropertySetUsage> customPropertyMembers;

    /**
     * A map of maps that contains the properties which are specific to the folder type. Each folder type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * folders have required properties within the \"default\" category. To determine the set of optional and
     * required properties for a folder type, a query can be done on '/types?type=folder' that returns a
     * collection of all folder types. The appropriate folder type, which includes definitions of all of
     * it's properties, can be identified from this collection.
     * Example: `{\"properties\": { \"default\": { \"key1\": \"value1\"}}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * The key of the containing folder or null if there isn't a parent folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentFolderKey")
    String parentFolderKey;

    /**
     * Last modified timestamp of this object in the external system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExternal")
    java.util.Date timeExternal;

    /**
     * The job key of the harvest process that updated the folder definition from the source system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastJobKey")
    String lastJobKey;

    /**
     * Folder harvesting status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("harvestStatus")
    HarvestStatus harvestStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
