/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Entity that represents an error identified in a plugin. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PluginErrorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PluginErrorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "agentType",
        "hostName",
        "compartmentId",
        "errors",
        "timeLastSeen",
        "timeFirstSeen"
    })
    public PluginErrorSummary(
            String managedInstanceId,
            AgentType agentType,
            String hostName,
            String compartmentId,
            java.util.List<PluginErrorDetails> errors,
            java.util.Date timeLastSeen,
            java.util.Date timeFirstSeen) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.agentType = agentType;
        this.hostName = hostName;
        this.compartmentId = compartmentId;
        this.errors = errors;
        this.timeLastSeen = timeLastSeen;
        this.timeFirstSeen = timeFirstSeen;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Instance running the plugin.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Instance running the plugin.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /** The agent type. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentType")
        private AgentType agentType;

        /**
         * The agent type.
         *
         * @param agentType the value to set
         * @return this builder
         */
        public Builder agentType(AgentType agentType) {
            this.agentType = agentType;
            this.__explicitlySet__.add("agentType");
            return this;
        }
        /** The HostName or Compute Instance name of the Managed Instance running the plugin. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The HostName or Compute Instance name of the Managed Instance running the plugin.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** List of plugin error details. */
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<PluginErrorDetails> errors;

        /**
         * List of plugin error details.
         *
         * @param errors the value to set
         * @return this builder
         */
        public Builder errors(java.util.List<PluginErrorDetails> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }
        /** The timestamp of the last time an error was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The timestamp of the last time an error was detected.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         */
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }
        /** The timestamp of the first time an error was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
        private java.util.Date timeFirstSeen;

        /**
         * The timestamp of the first time an error was detected.
         *
         * @param timeFirstSeen the value to set
         * @return this builder
         */
        public Builder timeFirstSeen(java.util.Date timeFirstSeen) {
            this.timeFirstSeen = timeFirstSeen;
            this.__explicitlySet__.add("timeFirstSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluginErrorSummary build() {
            PluginErrorSummary model =
                    new PluginErrorSummary(
                            this.managedInstanceId,
                            this.agentType,
                            this.hostName,
                            this.compartmentId,
                            this.errors,
                            this.timeLastSeen,
                            this.timeFirstSeen);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluginErrorSummary model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("agentType")) {
                this.agentType(model.getAgentType());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSeen")) {
                this.timeFirstSeen(model.getTimeFirstSeen());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Instance running the plugin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Instance running the plugin.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /** The agent type. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentType")
    private final AgentType agentType;

    /**
     * The agent type.
     *
     * @return the value
     */
    public AgentType getAgentType() {
        return agentType;
    }

    /** The HostName or Compute Instance name of the Managed Instance running the plugin. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The HostName or Compute Instance name of the Managed Instance running the plugin.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the Fleet.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** List of plugin error details. */
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<PluginErrorDetails> errors;

    /**
     * List of plugin error details.
     *
     * @return the value
     */
    public java.util.List<PluginErrorDetails> getErrors() {
        return errors;
    }

    /** The timestamp of the last time an error was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The timestamp of the last time an error was detected.
     *
     * @return the value
     */
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
    }

    /** The timestamp of the first time an error was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSeen")
    private final java.util.Date timeFirstSeen;

    /**
     * The timestamp of the first time an error was detected.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstSeen() {
        return timeFirstSeen;
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
        sb.append("PluginErrorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", agentType=").append(String.valueOf(this.agentType));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(", timeFirstSeen=").append(String.valueOf(this.timeFirstSeen));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluginErrorSummary)) {
            return false;
        }

        PluginErrorSummary other = (PluginErrorSummary) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.agentType, other.agentType)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.errors, other.errors)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && java.util.Objects.equals(this.timeFirstSeen, other.timeFirstSeen)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.agentType == null ? 43 : this.agentType.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeen == null ? 43 : this.timeFirstSeen.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
