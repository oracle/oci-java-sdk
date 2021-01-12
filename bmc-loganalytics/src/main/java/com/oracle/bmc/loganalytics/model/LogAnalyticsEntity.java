/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Description of a log analytics entity.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEntity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeInternalName")
        private String entityTypeInternalName;

        public Builder entityTypeInternalName(String entityTypeInternalName) {
            this.entityTypeInternalName = entityTypeInternalName;
            this.__explicitlySet__.add("entityTypeInternalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EntityLifecycleStates lifecycleState;

        public Builder lifecycleState(EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentDisplayName")
        private String managementAgentDisplayName;

        public Builder managementAgentDisplayName(String managementAgentDisplayName) {
            this.managementAgentDisplayName = managementAgentDisplayName;
            this.__explicitlySet__.add("managementAgentDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentCompartmentId")
        private String managementAgentCompartmentId;

        public Builder managementAgentCompartmentId(String managementAgentCompartmentId) {
            this.managementAgentCompartmentId = managementAgentCompartmentId;
            this.__explicitlySet__.add("managementAgentCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
        private String timezoneRegion;

        public Builder timezoneRegion(String timezoneRegion) {
            this.timezoneRegion = timezoneRegion;
            this.__explicitlySet__.add("timezoneRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
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

        @com.fasterxml.jackson.annotation.JsonProperty("areLogsCollected")
        private Boolean areLogsCollected;

        public Builder areLogsCollected(Boolean areLogsCollected) {
            this.areLogsCollected = areLogsCollected;
            this.__explicitlySet__.add("areLogsCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
        private String cloudResourceId;

        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            this.__explicitlySet__.add("cloudResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntity build() {
            LogAnalyticsEntity __instance__ =
                    new LogAnalyticsEntity(
                            id,
                            name,
                            compartmentId,
                            entityTypeName,
                            entityTypeInternalName,
                            lifecycleState,
                            lifecycleDetails,
                            managementAgentId,
                            managementAgentDisplayName,
                            managementAgentCompartmentId,
                            timezoneRegion,
                            properties,
                            timeCreated,
                            timeUpdated,
                            areLogsCollected,
                            cloudResourceId,
                            hostname,
                            sourceId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntity o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .entityTypeName(o.getEntityTypeName())
                            .entityTypeInternalName(o.getEntityTypeInternalName())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .managementAgentId(o.getManagementAgentId())
                            .managementAgentDisplayName(o.getManagementAgentDisplayName())
                            .managementAgentCompartmentId(o.getManagementAgentCompartmentId())
                            .timezoneRegion(o.getTimezoneRegion())
                            .properties(o.getProperties())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .areLogsCollected(o.getAreLogsCollected())
                            .cloudResourceId(o.getCloudResourceId())
                            .hostname(o.getHostname())
                            .sourceId(o.getSourceId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it represents
     * a resource that is provisioned and managed by the customer on their premises or on the cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Log analytics entity name. The name must be unique, within the tenancy, and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Log analytics entity type name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    String entityTypeName;

    /**
     * Internal name for the log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeInternalName")
    String entityTypeInternalName;

    /**
     * The current state of the log analytics entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    EntityLifecycleStates lifecycleState;

    /**
     * lifecycleDetails has additional information regarding substeps such as management agent plugin deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The OCID of the Management Agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    String managementAgentId;

    /**
     * Management agent (management-agents resource kind) display name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentDisplayName")
    String managementAgentDisplayName;

    /**
     * Management agent (management-agents resource kind) compartment OCID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentCompartmentId")
    String managementAgentCompartmentId;

    /**
     * The timezone region of the log analytics entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
    String timezoneRegion;

    /**
     * The name/value pairs for parameter values to be used in file patterns specified in log sources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, String> properties;

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The Boolean flag to indicate if logs are collected for an entity for log analytics usage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areLogsCollected")
    Boolean areLogsCollected;

    /**
     * The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity
     * represents a non-cloud resource that the customer may have on their premises.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
    String cloudResourceId;

    /**
     * The hostname where the entity represented here is actually present. This would be the output one would get if
     * they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from
     * management agents host since logs may be collected remotely.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
