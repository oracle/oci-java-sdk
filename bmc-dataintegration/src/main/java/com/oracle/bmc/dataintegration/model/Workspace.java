/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A workspace is an organizational construct to keep multiple data integration solutions and their
 * resources (data assets, data flows, tasks, and so on) separate from each other, helping you to
 * stay organized. For example, you could have separate workspaces for development, testing, and
 * production. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Workspace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Workspace extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcnId",
        "subnetId",
        "dnsServerIp",
        "dnsServerZone",
        "isPrivateNetworkEnabled",
        "freeformTags",
        "definedTags",
        "description",
        "displayName",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "stateMessage",
        "id",
        "endpointId",
        "endpointName",
        "registryId",
        "workspaceProperties"
    })
    public Workspace(
            String vcnId,
            String subnetId,
            String dnsServerIp,
            String dnsServerZone,
            Boolean isPrivateNetworkEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String stateMessage,
            String id,
            String endpointId,
            String endpointName,
            String registryId,
            java.util.Map<String, String> workspaceProperties) {
        super();
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.dnsServerIp = dnsServerIp;
        this.dnsServerZone = dnsServerZone;
        this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.stateMessage = stateMessage;
        this.id = id;
        this.endpointId = endpointId;
        this.endpointName = endpointName;
        this.registryId = registryId;
        this.workspaceProperties = workspaceProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the VCN the subnet is in. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the VCN the subnet is in.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** The OCID of the subnet for customer connected databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet for customer connected databases.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The IP of the custom DNS. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
        private String dnsServerIp;

        /**
         * The IP of the custom DNS.
         *
         * @param dnsServerIp the value to set
         * @return this builder
         */
        public Builder dnsServerIp(String dnsServerIp) {
            this.dnsServerIp = dnsServerIp;
            this.__explicitlySet__.add("dnsServerIp");
            return this;
        }
        /** The DNS zone of the custom DNS to use to resolve names. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
        private String dnsServerZone;

        /**
         * The DNS zone of the custom DNS to use to resolve names.
         *
         * @param dnsServerZone the value to set
         * @return this builder
         */
        public Builder dnsServerZone(String dnsServerZone) {
            this.dnsServerZone = dnsServerZone;
            this.__explicitlySet__.add("dnsServerZone");
            return this;
        }
        /** Specifies whether the private network connection is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
        private Boolean isPrivateNetworkEnabled;

        /**
         * Specifies whether the private network connection is enabled or disabled.
         *
         * @param isPrivateNetworkEnabled the value to set
         * @return this builder
         */
        public Builder isPrivateNetworkEnabled(Boolean isPrivateNetworkEnabled) {
            this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
            this.__explicitlySet__.add("isPrivateNetworkEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** A detailed description for the workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A detailed description for the workspace.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-friendly display name for the workspace. Does not have to be unique, and can be
         * modified. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the workspace. Does not have to be unique, and can be
         * modified. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment containing the workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the workspace.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time the workspace was created, in the timestamp format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the workspace was created, in the timestamp format defined by RFC3339.
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
         * The date and time the workspace was updated, in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the workspace was updated, in the timestamp format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Lifecycle states for workspaces in Data Integration Service CREATING - The resource is
         * being created and may not be usable until the entire metadata is defined UPDATING - The
         * resource is being updated and may not be usable until all changes are commited DELETING -
         * The resource is being deleted and might require deep cleanup of children. ACTIVE - The
         * resource is valid and available for access INACTIVE - The resource might be incomplete in
         * its definition or might have been made unavailable for administrative reasons DELETED -
         * The resource has been deleted and isn't available FAILED - The resource is in a failed
         * state due to validation or other errors STARTING - The resource is being started and may
         * not be usable until becomes ACTIVE again STOPPING - The resource is in the process of
         * Stopping and may not be usable until it Stops or fails STOPPED - The resource is in
         * Stopped state due to stop operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for workspaces in Data Integration Service CREATING - The resource is
         * being created and may not be usable until the entire metadata is defined UPDATING - The
         * resource is being updated and may not be usable until all changes are commited DELETING -
         * The resource is being deleted and might require deep cleanup of children. ACTIVE - The
         * resource is valid and available for access INACTIVE - The resource might be incomplete in
         * its definition or might have been made unavailable for administrative reasons DELETED -
         * The resource has been deleted and isn't available FAILED - The resource is in a failed
         * state due to validation or other errors STARTING - The resource is being started and may
         * not be usable until becomes ACTIVE again STOPPING - The resource is in the process of
         * Stopping and may not be usable until it Stops or fails STOPPED - The resource is in
         * Stopped state due to stop operation.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in failed state.
         *
         * @param stateMessage the value to set
         * @return this builder
         */
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /** A system-generated and immutable identifier assigned to the workspace upon creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A system-generated and immutable identifier assigned to the workspace upon creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the private endpoint associated with the container/workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * OCID of the private endpoint associated with the container/workspace.
         *
         * @param endpointId the value to set
         * @return this builder
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /** Name of the private endpoint associated with the container/workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
        private String endpointName;

        /**
         * Name of the private endpoint associated with the container/workspace.
         *
         * @param endpointName the value to set
         * @return this builder
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            this.__explicitlySet__.add("endpointName");
            return this;
        }
        /** DCMS Registry ID associated with the container/workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("registryId")
        private String registryId;

        /**
         * DCMS Registry ID associated with the container/workspace.
         *
         * @param registryId the value to set
         * @return this builder
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            this.__explicitlySet__.add("registryId");
            return this;
        }
        /** key-value pairs of workspace properties */
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceProperties")
        private java.util.Map<String, String> workspaceProperties;

        /**
         * key-value pairs of workspace properties
         *
         * @param workspaceProperties the value to set
         * @return this builder
         */
        public Builder workspaceProperties(java.util.Map<String, String> workspaceProperties) {
            this.workspaceProperties = workspaceProperties;
            this.__explicitlySet__.add("workspaceProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Workspace build() {
            Workspace model =
                    new Workspace(
                            this.vcnId,
                            this.subnetId,
                            this.dnsServerIp,
                            this.dnsServerZone,
                            this.isPrivateNetworkEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.description,
                            this.displayName,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.stateMessage,
                            this.id,
                            this.endpointId,
                            this.endpointName,
                            this.registryId,
                            this.workspaceProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Workspace model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("dnsServerIp")) {
                this.dnsServerIp(model.getDnsServerIp());
            }
            if (model.wasPropertyExplicitlySet("dnsServerZone")) {
                this.dnsServerZone(model.getDnsServerZone());
            }
            if (model.wasPropertyExplicitlySet("isPrivateNetworkEnabled")) {
                this.isPrivateNetworkEnabled(model.getIsPrivateNetworkEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("stateMessage")) {
                this.stateMessage(model.getStateMessage());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("endpointName")) {
                this.endpointName(model.getEndpointName());
            }
            if (model.wasPropertyExplicitlySet("registryId")) {
                this.registryId(model.getRegistryId());
            }
            if (model.wasPropertyExplicitlySet("workspaceProperties")) {
                this.workspaceProperties(model.getWorkspaceProperties());
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

    /** The OCID of the VCN the subnet is in. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the VCN the subnet is in.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** The OCID of the subnet for customer connected databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet for customer connected databases.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The IP of the custom DNS. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
    private final String dnsServerIp;

    /**
     * The IP of the custom DNS.
     *
     * @return the value
     */
    public String getDnsServerIp() {
        return dnsServerIp;
    }

    /** The DNS zone of the custom DNS to use to resolve names. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
    private final String dnsServerZone;

    /**
     * The DNS zone of the custom DNS to use to resolve names.
     *
     * @return the value
     */
    public String getDnsServerZone() {
        return dnsServerZone;
    }

    /** Specifies whether the private network connection is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
    private final Boolean isPrivateNetworkEnabled;

    /**
     * Specifies whether the private network connection is enabled or disabled.
     *
     * @return the value
     */
    public Boolean getIsPrivateNetworkEnabled() {
        return isPrivateNetworkEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A detailed description for the workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A detailed description for the workspace.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly display name for the workspace. Does not have to be unique, and can be
     * modified. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the workspace. Does not have to be unique, and can be
     * modified. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment containing the workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the workspace.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The date and time the workspace was created, in the timestamp format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the workspace was created, in the timestamp format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the workspace was updated, in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the workspace was updated, in the timestamp format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Lifecycle states for workspaces in Data Integration Service CREATING - The resource is being
     * created and may not be usable until the entire metadata is defined UPDATING - The resource is
     * being updated and may not be usable until all changes are commited DELETING - The resource is
     * being deleted and might require deep cleanup of children. ACTIVE - The resource is valid and
     * available for access INACTIVE - The resource might be incomplete in its definition or might
     * have been made unavailable for administrative reasons DELETED - The resource has been deleted
     * and isn't available FAILED - The resource is in a failed state due to validation or other
     * errors STARTING - The resource is being started and may not be usable until becomes ACTIVE
     * again STOPPING - The resource is in the process of Stopping and may not be usable until it
     * Stops or fails STOPPED - The resource is in Stopped state due to stop operation.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
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
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
     * Lifecycle states for workspaces in Data Integration Service CREATING - The resource is being
     * created and may not be usable until the entire metadata is defined UPDATING - The resource is
     * being updated and may not be usable until all changes are commited DELETING - The resource is
     * being deleted and might require deep cleanup of children. ACTIVE - The resource is valid and
     * available for access INACTIVE - The resource might be incomplete in its definition or might
     * have been made unavailable for administrative reasons DELETED - The resource has been deleted
     * and isn't available FAILED - The resource is in a failed state due to validation or other
     * errors STARTING - The resource is being started and may not be usable until becomes ACTIVE
     * again STOPPING - The resource is in the process of Stopping and may not be usable until it
     * Stops or fails STOPPED - The resource is in Stopped state due to stop operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for workspaces in Data Integration Service CREATING - The resource is being
     * created and may not be usable until the entire metadata is defined UPDATING - The resource is
     * being updated and may not be usable until all changes are commited DELETING - The resource is
     * being deleted and might require deep cleanup of children. ACTIVE - The resource is valid and
     * available for access INACTIVE - The resource might be incomplete in its definition or might
     * have been made unavailable for administrative reasons DELETED - The resource has been deleted
     * and isn't available FAILED - The resource is in a failed state due to validation or other
     * errors STARTING - The resource is being started and may not be usable until becomes ACTIVE
     * again STOPPING - The resource is in the process of Stopping and may not be usable until it
     * Stops or fails STOPPED - The resource is in Stopped state due to stop operation.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in failed state.
     *
     * @return the value
     */
    public String getStateMessage() {
        return stateMessage;
    }

    /** A system-generated and immutable identifier assigned to the workspace upon creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A system-generated and immutable identifier assigned to the workspace upon creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the private endpoint associated with the container/workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * OCID of the private endpoint associated with the container/workspace.
     *
     * @return the value
     */
    public String getEndpointId() {
        return endpointId;
    }

    /** Name of the private endpoint associated with the container/workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
    private final String endpointName;

    /**
     * Name of the private endpoint associated with the container/workspace.
     *
     * @return the value
     */
    public String getEndpointName() {
        return endpointName;
    }

    /** DCMS Registry ID associated with the container/workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("registryId")
    private final String registryId;

    /**
     * DCMS Registry ID associated with the container/workspace.
     *
     * @return the value
     */
    public String getRegistryId() {
        return registryId;
    }

    /** key-value pairs of workspace properties */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceProperties")
    private final java.util.Map<String, String> workspaceProperties;

    /**
     * key-value pairs of workspace properties
     *
     * @return the value
     */
    public java.util.Map<String, String> getWorkspaceProperties() {
        return workspaceProperties;
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
        sb.append("Workspace(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", dnsServerIp=").append(String.valueOf(this.dnsServerIp));
        sb.append(", dnsServerZone=").append(String.valueOf(this.dnsServerZone));
        sb.append(", isPrivateNetworkEnabled=")
                .append(String.valueOf(this.isPrivateNetworkEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", endpointName=").append(String.valueOf(this.endpointName));
        sb.append(", registryId=").append(String.valueOf(this.registryId));
        sb.append(", workspaceProperties=").append(String.valueOf(this.workspaceProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Workspace)) {
            return false;
        }

        Workspace other = (Workspace) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.dnsServerIp, other.dnsServerIp)
                && java.util.Objects.equals(this.dnsServerZone, other.dnsServerZone)
                && java.util.Objects.equals(
                        this.isPrivateNetworkEnabled, other.isPrivateNetworkEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.endpointName, other.endpointName)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.workspaceProperties, other.workspaceProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.dnsServerIp == null ? 43 : this.dnsServerIp.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsServerZone == null ? 43 : this.dnsServerZone.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrivateNetworkEnabled == null
                                ? 43
                                : this.isPrivateNetworkEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + (this.endpointName == null ? 43 : this.endpointName.hashCode());
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.workspaceProperties == null
                                ? 43
                                : this.workspaceProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
