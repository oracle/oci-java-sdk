/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration for Agent as a Tool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AgentToolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentToolConfig extends ToolConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The AgentEndpoint OCID to be used as a tool in this agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentEndpointId")
        private String agentEndpointId;

        /**
         * The AgentEndpoint OCID to be used as a tool in this agent.
         *
         * @param agentEndpointId the value to set
         * @return this builder
         */
        public Builder agentEndpointId(String agentEndpointId) {
            this.agentEndpointId = agentEndpointId;
            this.__explicitlySet__.add("agentEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentToolConfig build() {
            AgentToolConfig model = new AgentToolConfig(this.agentEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentToolConfig model) {
            if (model.wasPropertyExplicitlySet("agentEndpointId")) {
                this.agentEndpointId(model.getAgentEndpointId());
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

    @Deprecated
    public AgentToolConfig(String agentEndpointId) {
        super();
        this.agentEndpointId = agentEndpointId;
    }

    /** The AgentEndpoint OCID to be used as a tool in this agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentEndpointId")
    private final String agentEndpointId;

    /**
     * The AgentEndpoint OCID to be used as a tool in this agent.
     *
     * @return the value
     */
    public String getAgentEndpointId() {
        return agentEndpointId;
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
        sb.append("AgentToolConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", agentEndpointId=").append(String.valueOf(this.agentEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentToolConfig)) {
            return false;
        }

        AgentToolConfig other = (AgentToolConfig) o;
        return java.util.Objects.equals(this.agentEndpointId, other.agentEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.agentEndpointId == null ? 43 : this.agentEndpointId.hashCode());
        return result;
    }
}
