/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Information about management appliance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementApplianceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementApplianceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "sddcId",
        "computeInstanceId",
        "managementAgentId",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "configuration",
        "connections",
        "timeCreated",
        "timeUpdated",
        "timeConfigurationUpdated",
        "timeLastHeartbeat",
        "heartbeatConnectionStates",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagementApplianceSummary(
            String id,
            String compartmentId,
            String sddcId,
            String computeInstanceId,
            String managementAgentId,
            String displayName,
            ManagementApplianceLifecycleState lifecycleState,
            ManagementApplianceLifecycleDetails lifecycleDetails,
            ManagementApplianceConfiguration configuration,
            java.util.List<ManagementApplianceConnection> connections,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeConfigurationUpdated,
            java.util.Date timeLastHeartbeat,
            java.util.List<ManagementApplianceConnectionStatus> heartbeatConnectionStates,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.sddcId = sddcId;
        this.computeInstanceId = computeInstanceId;
        this.managementAgentId = managementAgentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.configuration = configuration;
        this.connections = connections;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeConfigurationUpdated = timeConfigurationUpdated;
        this.timeLastHeartbeat = timeLastHeartbeat;
        this.heartbeatConnectionStates = heartbeatConnectionStates;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * management appliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * management appliance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment in OCI, that this appliance is going to be created in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment in OCI, that this appliance is going to be created in.
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
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of SDDC in
         * OCI, that this appliance is going to be registered in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
        private String sddcId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of SDDC in
         * OCI, that this appliance is going to be registered in.
         *
         * @param sddcId the value to set
         * @return this builder
         */
        public Builder sddcId(String sddcId) {
            this.sddcId = sddcId;
            this.__explicitlySet__.add("sddcId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compute instance of management appliance in OCI.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
        private String computeInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compute instance of management appliance in OCI.
         *
         * @param computeInstanceId the value to set
         * @return this builder
         */
        public Builder computeInstanceId(String computeInstanceId) {
            this.computeInstanceId = computeInstanceId;
            this.__explicitlySet__.add("computeInstanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * management agent, that this appliance is running in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * management agent, that this appliance is running in.
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * A descriptive name for the management appliance. It must be unique, start with a letter,
         * and contain only letters, digits, whitespaces, dashes and underscores. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the management appliance. It must be unique, start with a letter,
         * and contain only letters, digits, whitespaces, dashes and underscores. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Current state of the management appliance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ManagementApplianceLifecycleState lifecycleState;

        /**
         * Current state of the management appliance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ManagementApplianceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Information about current lifecycleState. For FAILED and NEEDS_ATTENTION contains
         * explanations. For other states may contain some details about their progress.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private ManagementApplianceLifecycleDetails lifecycleDetails;

        /**
         * Information about current lifecycleState. For FAILED and NEEDS_ATTENTION contains
         * explanations. For other states may contain some details about their progress.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(ManagementApplianceLifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private ManagementApplianceConfiguration configuration;

        public Builder configuration(ManagementApplianceConfiguration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /** Array of connections for management appliance. */
        @com.fasterxml.jackson.annotation.JsonProperty("connections")
        private java.util.List<ManagementApplianceConnection> connections;

        /**
         * Array of connections for management appliance.
         *
         * @param connections the value to set
         * @return this builder
         */
        public Builder connections(java.util.List<ManagementApplianceConnection> connections) {
            this.connections = connections;
            this.__explicitlySet__.add("connections");
            return this;
        }
        /**
         * The date and time the management appliance was created in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the management appliance was created in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * The date and time the management appliance was last updated in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the management appliance was last updated in the format defined by
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
         * The date and time the configuration of management appliance was last updated in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeConfigurationUpdated")
        private java.util.Date timeConfigurationUpdated;

        /**
         * The date and time the configuration of management appliance was last updated in the
         * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeConfigurationUpdated the value to set
         * @return this builder
         */
        public Builder timeConfigurationUpdated(java.util.Date timeConfigurationUpdated) {
            this.timeConfigurationUpdated = timeConfigurationUpdated;
            this.__explicitlySet__.add("timeConfigurationUpdated");
            return this;
        }
        /**
         * The date and time the management appliance has last received heartbeat in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
        private java.util.Date timeLastHeartbeat;

        /**
         * The date and time the management appliance has last received heartbeat in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeLastHeartbeat the value to set
         * @return this builder
         */
        public Builder timeLastHeartbeat(java.util.Date timeLastHeartbeat) {
            this.timeLastHeartbeat = timeLastHeartbeat;
            this.__explicitlySet__.add("timeLastHeartbeat");
            return this;
        }
        /** Current states of connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("heartbeatConnectionStates")
        private java.util.List<ManagementApplianceConnectionStatus> heartbeatConnectionStates;

        /**
         * Current states of connections.
         *
         * @param heartbeatConnectionStates the value to set
         * @return this builder
         */
        public Builder heartbeatConnectionStates(
                java.util.List<ManagementApplianceConnectionStatus> heartbeatConnectionStates) {
            this.heartbeatConnectionStates = heartbeatConnectionStates;
            this.__explicitlySet__.add("heartbeatConnectionStates");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementApplianceSummary build() {
            ManagementApplianceSummary model =
                    new ManagementApplianceSummary(
                            this.id,
                            this.compartmentId,
                            this.sddcId,
                            this.computeInstanceId,
                            this.managementAgentId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.configuration,
                            this.connections,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeConfigurationUpdated,
                            this.timeLastHeartbeat,
                            this.heartbeatConnectionStates,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementApplianceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sddcId")) {
                this.sddcId(model.getSddcId());
            }
            if (model.wasPropertyExplicitlySet("computeInstanceId")) {
                this.computeInstanceId(model.getComputeInstanceId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("connections")) {
                this.connections(model.getConnections());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeConfigurationUpdated")) {
                this.timeConfigurationUpdated(model.getTimeConfigurationUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastHeartbeat")) {
                this.timeLastHeartbeat(model.getTimeLastHeartbeat());
            }
            if (model.wasPropertyExplicitlySet("heartbeatConnectionStates")) {
                this.heartbeatConnectionStates(model.getHeartbeatConnectionStates());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * management appliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * management appliance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment in OCI, that this appliance is going to be created in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment in OCI, that this appliance is going to be created in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of SDDC in OCI,
     * that this appliance is going to be registered in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    private final String sddcId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of SDDC in OCI,
     * that this appliance is going to be registered in.
     *
     * @return the value
     */
    public String getSddcId() {
        return sddcId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of compute
     * instance of management appliance in OCI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceId")
    private final String computeInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of compute
     * instance of management appliance in OCI.
     *
     * @return the value
     */
    public String getComputeInstanceId() {
        return computeInstanceId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * management agent, that this appliance is running in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * management agent, that this appliance is running in.
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * A descriptive name for the management appliance. It must be unique, start with a letter, and
     * contain only letters, digits, whitespaces, dashes and underscores. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the management appliance. It must be unique, start with a letter, and
     * contain only letters, digits, whitespaces, dashes and underscores. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Current state of the management appliance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ManagementApplianceLifecycleState lifecycleState;

    /**
     * Current state of the management appliance.
     *
     * @return the value
     */
    public ManagementApplianceLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Information about current lifecycleState. For FAILED and NEEDS_ATTENTION contains
     * explanations. For other states may contain some details about their progress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final ManagementApplianceLifecycleDetails lifecycleDetails;

    /**
     * Information about current lifecycleState. For FAILED and NEEDS_ATTENTION contains
     * explanations. For other states may contain some details about their progress.
     *
     * @return the value
     */
    public ManagementApplianceLifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final ManagementApplianceConfiguration configuration;

    public ManagementApplianceConfiguration getConfiguration() {
        return configuration;
    }

    /** Array of connections for management appliance. */
    @com.fasterxml.jackson.annotation.JsonProperty("connections")
    private final java.util.List<ManagementApplianceConnection> connections;

    /**
     * Array of connections for management appliance.
     *
     * @return the value
     */
    public java.util.List<ManagementApplianceConnection> getConnections() {
        return connections;
    }

    /**
     * The date and time the management appliance was created in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the management appliance was created in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the management appliance was last updated in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the management appliance was last updated in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the configuration of management appliance was last updated in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeConfigurationUpdated")
    private final java.util.Date timeConfigurationUpdated;

    /**
     * The date and time the configuration of management appliance was last updated in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeConfigurationUpdated() {
        return timeConfigurationUpdated;
    }

    /**
     * The date and time the management appliance has last received heartbeat in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastHeartbeat")
    private final java.util.Date timeLastHeartbeat;

    /**
     * The date and time the management appliance has last received heartbeat in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeLastHeartbeat() {
        return timeLastHeartbeat;
    }

    /** Current states of connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("heartbeatConnectionStates")
    private final java.util.List<ManagementApplianceConnectionStatus> heartbeatConnectionStates;

    /**
     * Current states of connections.
     *
     * @return the value
     */
    public java.util.List<ManagementApplianceConnectionStatus> getHeartbeatConnectionStates() {
        return heartbeatConnectionStates;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ManagementApplianceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sddcId=").append(String.valueOf(this.sddcId));
        sb.append(", computeInstanceId=").append(String.valueOf(this.computeInstanceId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", connections=").append(String.valueOf(this.connections));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeConfigurationUpdated=")
                .append(String.valueOf(this.timeConfigurationUpdated));
        sb.append(", timeLastHeartbeat=").append(String.valueOf(this.timeLastHeartbeat));
        sb.append(", heartbeatConnectionStates=")
                .append(String.valueOf(this.heartbeatConnectionStates));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementApplianceSummary)) {
            return false;
        }

        ManagementApplianceSummary other = (ManagementApplianceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(this.computeInstanceId, other.computeInstanceId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.connections, other.connections)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.timeConfigurationUpdated, other.timeConfigurationUpdated)
                && java.util.Objects.equals(this.timeLastHeartbeat, other.timeLastHeartbeat)
                && java.util.Objects.equals(
                        this.heartbeatConnectionStates, other.heartbeatConnectionStates)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeInstanceId == null ? 43 : this.computeInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.connections == null ? 43 : this.connections.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeConfigurationUpdated == null
                                ? 43
                                : this.timeConfigurationUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastHeartbeat == null ? 43 : this.timeLastHeartbeat.hashCode());
        result =
                (result * PRIME)
                        + (this.heartbeatConnectionStates == null
                                ? 43
                                : this.heartbeatConnectionStates.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
