/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Summary of the Agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AgentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "agentType",
        "agentVersion",
        "osVersion",
        "timeCreated",
        "timeUpdated",
        "timeLastSyncReceived",
        "heartBeatStatus",
        "environmentId",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AgentSummary(
            String id,
            String displayName,
            String compartmentId,
            Agent.AgentType agentType,
            String agentVersion,
            String osVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastSyncReceived,
            Agent.HeartBeatStatus heartBeatStatus,
            String environmentId,
            Agent.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.agentType = agentType;
        this.agentVersion = agentVersion;
        this.osVersion = osVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastSyncReceived = timeLastSyncReceived;
        this.heartBeatStatus = heartBeatStatus;
        this.environmentId = environmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Agent identifier, which can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Agent identifier, which can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Type of Agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentType")
        private Agent.AgentType agentType;

        /**
         * Type of Agent.
         *
         * @param agentType the value to set
         * @return this builder
         */
        public Builder agentType(Agent.AgentType agentType) {
            this.agentType = agentType;
            this.__explicitlySet__.add("agentType");
            return this;
        }
        /** Agent identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * Agent identifier.
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /** OS version. */
        @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
        private String osVersion;

        /**
         * OS version.
         *
         * @param osVersion the value to set
         * @return this builder
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            this.__explicitlySet__.add("osVersion");
            return this;
        }
        /** The time when the Agent was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the Agent was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the Agent was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the Agent was updated. An RFC3339 formatted datetime string.
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
         * The time when the last heartbeat of the Agent was noted. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSyncReceived")
        private java.util.Date timeLastSyncReceived;

        /**
         * The time when the last heartbeat of the Agent was noted. An RFC3339 formatted datetime
         * string.
         *
         * @param timeLastSyncReceived the value to set
         * @return this builder
         */
        public Builder timeLastSyncReceived(java.util.Date timeLastSyncReceived) {
            this.timeLastSyncReceived = timeLastSyncReceived;
            this.__explicitlySet__.add("timeLastSyncReceived");
            return this;
        }
        /** Current heartbeat status of the Agent based on its timeLastSyncReceived value. */
        @com.fasterxml.jackson.annotation.JsonProperty("heartBeatStatus")
        private Agent.HeartBeatStatus heartBeatStatus;

        /**
         * Current heartbeat status of the Agent based on its timeLastSyncReceived value.
         *
         * @param heartBeatStatus the value to set
         * @return this builder
         */
        public Builder heartBeatStatus(Agent.HeartBeatStatus heartBeatStatus) {
            this.heartBeatStatus = heartBeatStatus;
            this.__explicitlySet__.add("heartBeatStatus");
            return this;
        }
        /** Environment identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
        private String environmentId;

        /**
         * Environment identifier.
         *
         * @param environmentId the value to set
         * @return this builder
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            this.__explicitlySet__.add("environmentId");
            return this;
        }
        /** The current state of the Agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Agent.LifecycleState lifecycleState;

        /**
         * The current state of the Agent.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Agent.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace/scope. For more information, see
         * [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace/scope. For more information, see
         * [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
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

        public AgentSummary build() {
            AgentSummary model =
                    new AgentSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.agentType,
                            this.agentVersion,
                            this.osVersion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastSyncReceived,
                            this.heartBeatStatus,
                            this.environmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agentType")) {
                this.agentType(model.getAgentType());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("osVersion")) {
                this.osVersion(model.getOsVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSyncReceived")) {
                this.timeLastSyncReceived(model.getTimeLastSyncReceived());
            }
            if (model.wasPropertyExplicitlySet("heartBeatStatus")) {
                this.heartBeatStatus(model.getHeartBeatStatus());
            }
            if (model.wasPropertyExplicitlySet("environmentId")) {
                this.environmentId(model.getEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Agent identifier, which can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Agent identifier, which can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Type of Agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentType")
    private final Agent.AgentType agentType;

    /**
     * Type of Agent.
     *
     * @return the value
     */
    public Agent.AgentType getAgentType() {
        return agentType;
    }

    /** Agent identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * Agent identifier.
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /** OS version. */
    @com.fasterxml.jackson.annotation.JsonProperty("osVersion")
    private final String osVersion;

    /**
     * OS version.
     *
     * @return the value
     */
    public String getOsVersion() {
        return osVersion;
    }

    /** The time when the Agent was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the Agent was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the Agent was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the Agent was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time when the last heartbeat of the Agent was noted. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSyncReceived")
    private final java.util.Date timeLastSyncReceived;

    /**
     * The time when the last heartbeat of the Agent was noted. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeLastSyncReceived() {
        return timeLastSyncReceived;
    }

    /** Current heartbeat status of the Agent based on its timeLastSyncReceived value. */
    @com.fasterxml.jackson.annotation.JsonProperty("heartBeatStatus")
    private final Agent.HeartBeatStatus heartBeatStatus;

    /**
     * Current heartbeat status of the Agent based on its timeLastSyncReceived value.
     *
     * @return the value
     */
    public Agent.HeartBeatStatus getHeartBeatStatus() {
        return heartBeatStatus;
    }

    /** Environment identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
    private final String environmentId;

    /**
     * Environment identifier.
     *
     * @return the value
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /** The current state of the Agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Agent.LifecycleState lifecycleState;

    /**
     * The current state of the Agent.
     *
     * @return the value
     */
    public Agent.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace/scope. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
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
        sb.append("AgentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", agentType=").append(String.valueOf(this.agentType));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", osVersion=").append(String.valueOf(this.osVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastSyncReceived=").append(String.valueOf(this.timeLastSyncReceived));
        sb.append(", heartBeatStatus=").append(String.valueOf(this.heartBeatStatus));
        sb.append(", environmentId=").append(String.valueOf(this.environmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof AgentSummary)) {
            return false;
        }

        AgentSummary other = (AgentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.agentType, other.agentType)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.osVersion, other.osVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastSyncReceived, other.timeLastSyncReceived)
                && java.util.Objects.equals(this.heartBeatStatus, other.heartBeatStatus)
                && java.util.Objects.equals(this.environmentId, other.environmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.agentType == null ? 43 : this.agentType.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result = (result * PRIME) + (this.osVersion == null ? 43 : this.osVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSyncReceived == null
                                ? 43
                                : this.timeLastSyncReceived.hashCode());
        result =
                (result * PRIME)
                        + (this.heartBeatStatus == null ? 43 : this.heartBeatStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentId == null ? 43 : this.environmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
