/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Information about a JmsPlugin that has been registered.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JmsPlugin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JmsPlugin extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "agentId",
        "agentType",
        "lifecycleState",
        "availabilityStatus",
        "fleetId",
        "compartmentId",
        "hostname",
        "osFamily",
        "osArchitecture",
        "osDistribution",
        "pluginVersion",
        "timeRegistered",
        "timeLastSeen",
        "definedTags",
        "freeformTags",
        "systemTags"
    })
    public JmsPlugin(
            String id,
            String agentId,
            AgentType agentType,
            JmsPluginLifecycleState lifecycleState,
            JmsPluginAvailabilityStatus availabilityStatus,
            String fleetId,
            String compartmentId,
            String hostname,
            OsFamily osFamily,
            String osArchitecture,
            String osDistribution,
            String pluginVersion,
            java.util.Date timeRegistered,
            java.util.Date timeLastSeen,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.agentId = agentId;
        this.agentType = agentType;
        this.lifecycleState = lifecycleState;
        this.availabilityStatus = availabilityStatus;
        this.fleetId = fleetId;
        this.compartmentId = compartmentId;
        this.hostname = hostname;
        this.osFamily = osFamily;
        this.osArchitecture = osArchitecture;
        this.osDistribution = osDistribution;
        this.pluginVersion = pluginVersion;
        this.timeRegistered = timeRegistered;
        this.timeLastSeen = timeLastSeen;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to identify this JmsPlugin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to identify this JmsPlugin.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Management Agent (OMA) or the Oracle Cloud Agent (OCA) instance where the JMS plugin is deployed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Management Agent (OMA) or the Oracle Cloud Agent (OCA) instance where the JMS plugin is deployed.
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * The agent type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentType")
        private AgentType agentType;

        /**
         * The agent type.
         * @param agentType the value to set
         * @return this builder
         **/
        public Builder agentType(AgentType agentType) {
            this.agentType = agentType;
            this.__explicitlySet__.add("agentType");
            return this;
        }
        /**
         * The lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JmsPluginLifecycleState lifecycleState;

        /**
         * The lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(JmsPluginLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The availability status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private JmsPluginAvailabilityStatus availabilityStatus;

        /**
         * The availability status.
         * @param availabilityStatus the value to set
         * @return this builder
         **/
        public Builder availabilityStatus(JmsPluginAvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the fleet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         **/
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /**
         * The OMA/OCA agent's compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OMA/OCA agent's compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The hostname of the agent.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname of the agent.
         *
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The operating system family for the plugin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The operating system family for the plugin.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The architecture of the operating system of the plugin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osArchitecture")
        private String osArchitecture;

        /**
         * The architecture of the operating system of the plugin.
         * @param osArchitecture the value to set
         * @return this builder
         **/
        public Builder osArchitecture(String osArchitecture) {
            this.osArchitecture = osArchitecture;
            this.__explicitlySet__.add("osArchitecture");
            return this;
        }
        /**
         * The distribution of the operating system of the plugin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osDistribution")
        private String osDistribution;

        /**
         * The distribution of the operating system of the plugin.
         * @param osDistribution the value to set
         * @return this builder
         **/
        public Builder osDistribution(String osDistribution) {
            this.osDistribution = osDistribution;
            this.__explicitlySet__.add("osDistribution");
            return this;
        }
        /**
         * The version of the plugin.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pluginVersion")
        private String pluginVersion;

        /**
         * The version of the plugin.
         * @param pluginVersion the value to set
         * @return this builder
         **/
        public Builder pluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            this.__explicitlySet__.add("pluginVersion");
            return this;
        }
        /**
         * The date and time the plugin was registered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRegistered")
        private java.util.Date timeRegistered;

        /**
         * The date and time the plugin was registered.
         *
         * @param timeRegistered the value to set
         * @return this builder
         **/
        public Builder timeRegistered(java.util.Date timeRegistered) {
            this.timeRegistered = timeRegistered;
            this.__explicitlySet__.add("timeRegistered");
            return this;
        }
        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The date and time the resource was _last_ reported to JMS.
         * This is potentially _after_ the specified time period provided by the filters.
         * For example, a resource can be last reported to JMS before the start of a specified time period,
         * if it is also reported during the time period.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         **/
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JmsPlugin build() {
            JmsPlugin model =
                    new JmsPlugin(
                            this.id,
                            this.agentId,
                            this.agentType,
                            this.lifecycleState,
                            this.availabilityStatus,
                            this.fleetId,
                            this.compartmentId,
                            this.hostname,
                            this.osFamily,
                            this.osArchitecture,
                            this.osDistribution,
                            this.pluginVersion,
                            this.timeRegistered,
                            this.timeLastSeen,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JmsPlugin model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("agentType")) {
                this.agentType(model.getAgentType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("availabilityStatus")) {
                this.availabilityStatus(model.getAvailabilityStatus());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("osArchitecture")) {
                this.osArchitecture(model.getOsArchitecture());
            }
            if (model.wasPropertyExplicitlySet("osDistribution")) {
                this.osDistribution(model.getOsDistribution());
            }
            if (model.wasPropertyExplicitlySet("pluginVersion")) {
                this.pluginVersion(model.getPluginVersion());
            }
            if (model.wasPropertyExplicitlySet("timeRegistered")) {
                this.timeRegistered(model.getTimeRegistered());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to identify this JmsPlugin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) to identify this JmsPlugin.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Management Agent (OMA) or the Oracle Cloud Agent (OCA) instance where the JMS plugin is deployed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Management Agent (OMA) or the Oracle Cloud Agent (OCA) instance where the JMS plugin is deployed.
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * The agent type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentType")
    private final AgentType agentType;

    /**
     * The agent type.
     * @return the value
     **/
    public AgentType getAgentType() {
        return agentType;
    }

    /**
     * The lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JmsPluginLifecycleState lifecycleState;

    /**
     * The lifecycle state.
     * @return the value
     **/
    public JmsPluginLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The availability status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final JmsPluginAvailabilityStatus availabilityStatus;

    /**
     * The availability status.
     * @return the value
     **/
    public JmsPluginAvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the fleet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the fleet.
     *
     * @return the value
     **/
    public String getFleetId() {
        return fleetId;
    }

    /**
     * The OMA/OCA agent's compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OMA/OCA agent's compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The hostname of the agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname of the agent.
     *
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The operating system family for the plugin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The operating system family for the plugin.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * The architecture of the operating system of the plugin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osArchitecture")
    private final String osArchitecture;

    /**
     * The architecture of the operating system of the plugin.
     * @return the value
     **/
    public String getOsArchitecture() {
        return osArchitecture;
    }

    /**
     * The distribution of the operating system of the plugin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osDistribution")
    private final String osDistribution;

    /**
     * The distribution of the operating system of the plugin.
     * @return the value
     **/
    public String getOsDistribution() {
        return osDistribution;
    }

    /**
     * The version of the plugin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pluginVersion")
    private final String pluginVersion;

    /**
     * The version of the plugin.
     * @return the value
     **/
    public String getPluginVersion() {
        return pluginVersion;
    }

    /**
     * The date and time the plugin was registered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRegistered")
    private final java.util.Date timeRegistered;

    /**
     * The date and time the plugin was registered.
     *
     * @return the value
     **/
    public java.util.Date getTimeRegistered() {
        return timeRegistered;
    }

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The date and time the resource was _last_ reported to JMS.
     * This is potentially _after_ the specified time period provided by the filters.
     * For example, a resource can be last reported to JMS before the start of a specified time period,
     * if it is also reported during the time period.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("JmsPlugin(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", agentType=").append(String.valueOf(this.agentType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", osArchitecture=").append(String.valueOf(this.osArchitecture));
        sb.append(", osDistribution=").append(String.valueOf(this.osDistribution));
        sb.append(", pluginVersion=").append(String.valueOf(this.pluginVersion));
        sb.append(", timeRegistered=").append(String.valueOf(this.timeRegistered));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JmsPlugin)) {
            return false;
        }

        JmsPlugin other = (JmsPlugin) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.agentType, other.agentType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.osArchitecture, other.osArchitecture)
                && java.util.Objects.equals(this.osDistribution, other.osDistribution)
                && java.util.Objects.equals(this.pluginVersion, other.pluginVersion)
                && java.util.Objects.equals(this.timeRegistered, other.timeRegistered)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.agentType == null ? 43 : this.agentType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.osArchitecture == null ? 43 : this.osArchitecture.hashCode());
        result =
                (result * PRIME)
                        + (this.osDistribution == null ? 43 : this.osDistribution.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginVersion == null ? 43 : this.pluginVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRegistered == null ? 43 : this.timeRegistered.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
