/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details for new log analytics entity to be added.
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
    builder = CreateLogAnalyticsEntityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateLogAnalyticsEntityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
        private String cloudResourceId;

        public Builder cloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            this.__explicitlySet__.add("cloudResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
        private String timezoneRegion;

        public Builder timezoneRegion(String timezoneRegion) {
            this.timezoneRegion = timezoneRegion;
            this.__explicitlySet__.add("timezoneRegion");
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

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
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

        public CreateLogAnalyticsEntityDetails build() {
            CreateLogAnalyticsEntityDetails __instance__ =
                    new CreateLogAnalyticsEntityDetails(
                            name,
                            compartmentId,
                            entityTypeName,
                            managementAgentId,
                            cloudResourceId,
                            timezoneRegion,
                            hostname,
                            sourceId,
                            properties,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLogAnalyticsEntityDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .entityTypeName(o.getEntityTypeName())
                            .managementAgentId(o.getManagementAgentId())
                            .cloudResourceId(o.getCloudResourceId())
                            .timezoneRegion(o.getTimezoneRegion())
                            .hostname(o.getHostname())
                            .sourceId(o.getSourceId())
                            .properties(o.getProperties())
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
     * The OCID of the Management Agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    String managementAgentId;

    /**
     * The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity
     * represents a non-cloud resource that the customer may have on their premises.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudResourceId")
    String cloudResourceId;

    /**
     * The timezone region of the log analytics entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezoneRegion")
    String timezoneRegion;

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
     * The name/value pairs for parameter values to be used in file patterns specified in log sources.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, String> properties;

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
