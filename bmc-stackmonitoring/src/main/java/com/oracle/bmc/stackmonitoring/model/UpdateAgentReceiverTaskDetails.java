/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Request details for enabling/disabling the metric receiver on the management agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateAgentReceiverTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAgentReceiverTaskDetails extends MonitoredResourceTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Management Agent Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * Management Agent Identifier
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /** Type of the handler. */
        @com.fasterxml.jackson.annotation.JsonProperty("handlerType")
        private HandlerType handlerType;

        /**
         * Type of the handler.
         *
         * @param handlerType the value to set
         * @return this builder
         */
        public Builder handlerType(HandlerType handlerType) {
            this.handlerType = handlerType;
            this.__explicitlySet__.add("handlerType");
            return this;
        }
        /** True to enable the receiver and false to disable the receiver on the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnable")
        private Boolean isEnable;

        /**
         * True to enable the receiver and false to disable the receiver on the agent.
         *
         * @param isEnable the value to set
         * @return this builder
         */
        public Builder isEnable(Boolean isEnable) {
            this.isEnable = isEnable;
            this.__explicitlySet__.add("isEnable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("receiverProperties")
        private AgentReceiverProperties receiverProperties;

        public Builder receiverProperties(AgentReceiverProperties receiverProperties) {
            this.receiverProperties = receiverProperties;
            this.__explicitlySet__.add("receiverProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAgentReceiverTaskDetails build() {
            UpdateAgentReceiverTaskDetails model =
                    new UpdateAgentReceiverTaskDetails(
                            this.agentId, this.handlerType, this.isEnable, this.receiverProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentReceiverTaskDetails model) {
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("handlerType")) {
                this.handlerType(model.getHandlerType());
            }
            if (model.wasPropertyExplicitlySet("isEnable")) {
                this.isEnable(model.getIsEnable());
            }
            if (model.wasPropertyExplicitlySet("receiverProperties")) {
                this.receiverProperties(model.getReceiverProperties());
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
    public UpdateAgentReceiverTaskDetails(
            String agentId,
            HandlerType handlerType,
            Boolean isEnable,
            AgentReceiverProperties receiverProperties) {
        super();
        this.agentId = agentId;
        this.handlerType = handlerType;
        this.isEnable = isEnable;
        this.receiverProperties = receiverProperties;
    }

    /**
     * Management Agent Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * Management Agent Identifier
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /** Type of the handler. */
    @com.fasterxml.jackson.annotation.JsonProperty("handlerType")
    private final HandlerType handlerType;

    /**
     * Type of the handler.
     *
     * @return the value
     */
    public HandlerType getHandlerType() {
        return handlerType;
    }

    /** True to enable the receiver and false to disable the receiver on the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnable")
    private final Boolean isEnable;

    /**
     * True to enable the receiver and false to disable the receiver on the agent.
     *
     * @return the value
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("receiverProperties")
    private final AgentReceiverProperties receiverProperties;

    public AgentReceiverProperties getReceiverProperties() {
        return receiverProperties;
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
        sb.append("UpdateAgentReceiverTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", handlerType=").append(String.valueOf(this.handlerType));
        sb.append(", isEnable=").append(String.valueOf(this.isEnable));
        sb.append(", receiverProperties=").append(String.valueOf(this.receiverProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentReceiverTaskDetails)) {
            return false;
        }

        UpdateAgentReceiverTaskDetails other = (UpdateAgentReceiverTaskDetails) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.handlerType, other.handlerType)
                && java.util.Objects.equals(this.isEnable, other.isEnable)
                && java.util.Objects.equals(this.receiverProperties, other.receiverProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + (this.handlerType == null ? 43 : this.handlerType.hashCode());
        result = (result * PRIME) + (this.isEnable == null ? 43 : this.isEnable.hashCode());
        result =
                (result * PRIME)
                        + (this.receiverProperties == null
                                ? 43
                                : this.receiverProperties.hashCode());
        return result;
    }
}
