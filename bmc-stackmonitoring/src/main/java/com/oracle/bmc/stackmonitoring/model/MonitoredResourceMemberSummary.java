/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Monitored resource member
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoredResourceMemberSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitoredResourceMemberSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
        private String resourceDisplayName;

        public Builder resourceDisplayName(String resourceDisplayName) {
            this.resourceDisplayName = resourceDisplayName;
            this.__explicitlySet__.add("resourceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ResourceLifecycleState lifecycleState;

        public Builder lifecycleState(ResourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoredResourceMemberSummary build() {
            MonitoredResourceMemberSummary __instance__ =
                    new MonitoredResourceMemberSummary(
                            resourceId,
                            resourceName,
                            resourceDisplayName,
                            resourceType,
                            hostName,
                            parentId,
                            lifecycleState,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredResourceMemberSummary o) {
            Builder copiedBuilder =
                    resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceDisplayName(o.getResourceDisplayName())
                            .resourceType(o.getResourceType())
                            .hostName(o.getHostName())
                            .parentId(o.getParentId())
                            .lifecycleState(o.getLifecycleState())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * Monitored resource identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * Monitored resource name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * Monitored resource display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceDisplayName")
    String resourceDisplayName;

    /**
     * Monitored resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;

    /**
     * Monitored Resource Host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    String hostName;

    /**
     * Parent monitored resource identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    String parentId;

    /**
     * The current state of the Resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ResourceLifecycleState lifecycleState;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
