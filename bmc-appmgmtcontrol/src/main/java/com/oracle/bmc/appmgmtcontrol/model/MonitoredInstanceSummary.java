/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.appmgmtcontrol.model;

/**
 * Summary of the monitored instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoredInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitoredInstanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "compartmentId",
        "displayName",
        "managementAgentId",
        "lifecycleState",
        "monitoringState"
    })
    public MonitoredInstanceSummary(
            String instanceId,
            String compartmentId,
            String displayName,
            String managementAgentId,
            MonitoredInstance.LifecycleState lifecycleState,
            MonitoredInstance.MonitoringState monitoringState) {
        super();
        this.instanceId = instanceId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.managementAgentId = managementAgentId;
        this.lifecycleState = lifecycleState;
        this.monitoringState = monitoringState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored instance.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name of the monitored instance. It is binded to [Compute Instance](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
         * DisplayName is fetched from [Core Service API](https://docs.cloud.oracle.com/api/#/en/iaas/20160918/Instance/).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name of the monitored instance. It is binded to [Compute Instance](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
         * DisplayName is fetched from [Core Service API](https://docs.cloud.oracle.com/api/#/en/iaas/20160918/Instance/).
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param managementAgentId the value to set
         * @return this builder
         **/
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The current state of the monitored instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MonitoredInstance.LifecycleState lifecycleState;

        /**
         * The current state of the monitored instance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MonitoredInstance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Monitoring status. Can be either enabled or disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("monitoringState")
        private MonitoredInstance.MonitoringState monitoringState;

        /**
         * Monitoring status. Can be either enabled or disabled.
         * @param monitoringState the value to set
         * @return this builder
         **/
        public Builder monitoringState(MonitoredInstance.MonitoringState monitoringState) {
            this.monitoringState = monitoringState;
            this.__explicitlySet__.add("monitoringState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoredInstanceSummary build() {
            MonitoredInstanceSummary __instance__ =
                    new MonitoredInstanceSummary(
                            instanceId,
                            compartmentId,
                            displayName,
                            managementAgentId,
                            lifecycleState,
                            monitoringState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoredInstanceSummary o) {
            Builder copiedBuilder =
                    instanceId(o.getInstanceId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .managementAgentId(o.getManagementAgentId())
                            .lifecycleState(o.getLifecycleState())
                            .monitoringState(o.getMonitoringState());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored instance.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name of the monitored instance. It is binded to [Compute Instance](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
     * DisplayName is fetched from [Core Service API](https://docs.cloud.oracle.com/api/#/en/iaas/20160918/Instance/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name of the monitored instance. It is binded to [Compute Instance](https://docs.cloud.oracle.com/Content/Compute/Concepts/computeoverview.htm).
     * DisplayName is fetched from [Core Service API](https://docs.cloud.oracle.com/api/#/en/iaas/20160918/Instance/).
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * Management Agent Identifier [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The current state of the monitored instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MonitoredInstance.LifecycleState lifecycleState;

    /**
     * The current state of the monitored instance.
     * @return the value
     **/
    public MonitoredInstance.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Monitoring status. Can be either enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monitoringState")
    private final MonitoredInstance.MonitoringState monitoringState;

    /**
     * Monitoring status. Can be either enabled or disabled.
     * @return the value
     **/
    public MonitoredInstance.MonitoringState getMonitoringState() {
        return monitoringState;
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
        sb.append("MonitoredInstanceSummary(");
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", monitoringState=").append(String.valueOf(this.monitoringState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoredInstanceSummary)) {
            return false;
        }

        MonitoredInstanceSummary other = (MonitoredInstanceSummary) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.monitoringState, other.monitoringState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.monitoringState == null ? 43 : this.monitoringState.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
