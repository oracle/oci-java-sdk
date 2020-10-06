/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A workspace is an organizational construct to keep multiple data integration solutions and their resources (data assets, data flows, tasks, and so on) separate from each other, helping you to stay organized. For example, you could have separate workspaces for development, testing, and production.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Workspace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Workspace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
        private String dnsServerIp;

        public Builder dnsServerIp(String dnsServerIp) {
            this.dnsServerIp = dnsServerIp;
            this.__explicitlySet__.add("dnsServerIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
        private String dnsServerZone;

        public Builder dnsServerZone(String dnsServerZone) {
            this.dnsServerZone = dnsServerZone;
            this.__explicitlySet__.add("dnsServerZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
        private Boolean isPrivateNetworkEnabled;

        public Builder isPrivateNetworkEnabled(Boolean isPrivateNetworkEnabled) {
            this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
            this.__explicitlySet__.add("isPrivateNetworkEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Workspace build() {
            Workspace __instance__ =
                    new Workspace(
                            vcnId,
                            subnetId,
                            dnsServerIp,
                            dnsServerZone,
                            isPrivateNetworkEnabled,
                            freeformTags,
                            definedTags,
                            description,
                            displayName,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            stateMessage,
                            id);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Workspace o) {
            Builder copiedBuilder =
                    vcnId(o.getVcnId())
                            .subnetId(o.getSubnetId())
                            .dnsServerIp(o.getDnsServerIp())
                            .dnsServerZone(o.getDnsServerZone())
                            .isPrivateNetworkEnabled(o.getIsPrivateNetworkEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .stateMessage(o.getStateMessage())
                            .id(o.getId());

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
     * The OCID of the VCN the subnet is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * The OCID of the subnet for customer connected databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The IP of the custom DNS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
    String dnsServerIp;

    /**
     * The DNS zone of the custom DNS to use to resolve names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
    String dnsServerZone;

    /**
     * Specifies whether the private network connection is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
    Boolean isPrivateNetworkEnabled;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A detailed description for the workspace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A user-friendly display name for the workspace. Does not have to be unique, and can be modified. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the compartment containing the workspace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The date and time the workspace was created, in the timestamp format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the workspace was updated, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * Lifecycle states for workspaces in Data Integration Service
     * CREATING - The resource is being created and may not be usable until the entire metadata is defined
     * UPDATING - The resource is being updated and may not be usable until all changes are commited
     * DELETING - The resource is being deleted and might require deep cleanup of children.
     * ACTIVE   - The resource is valid and available for access
     * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
     *          administrative reasons
     * DELETED  - The resource has been deleted and isn't available
     * FAILED   - The resource is in a failed state due to validation or other errors
     * STARTING - The resource is being started and may not be usable until becomes ACTIVE again
     * STOPPING - The resource is in the process of Stopping and may not be usable until it Stops or fails
     * STOPPED  - The resource is in Stopped state due to stop operation.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Lifecycle states for workspaces in Data Integration Service
     * CREATING - The resource is being created and may not be usable until the entire metadata is defined
     * UPDATING - The resource is being updated and may not be usable until all changes are commited
     * DELETING - The resource is being deleted and might require deep cleanup of children.
     * ACTIVE   - The resource is valid and available for access
     * INACTIVE - The resource might be incomplete in its definition or might have been made unavailable for
     *          administrative reasons
     * DELETED  - The resource has been deleted and isn't available
     * FAILED   - The resource is in a failed state due to validation or other errors
     * STARTING - The resource is being started and may not be usable until becomes ACTIVE again
     * STOPPING - The resource is in the process of Stopping and may not be usable until it Stops or fails
     * STOPPED  - The resource is in Stopped state due to stop operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    String stateMessage;

    /**
     * A system-generated and immutable identifier assigned to the workspace upon creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
