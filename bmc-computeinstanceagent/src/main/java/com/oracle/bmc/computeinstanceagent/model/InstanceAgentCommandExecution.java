/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * A command's execution summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentCommandExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceAgentCommandExecution
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceAgentCommandId",
        "instanceId",
        "deliveryState",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "sequenceNumber",
        "displayName",
        "content"
    })
    public InstanceAgentCommandExecution(
            String instanceAgentCommandId,
            String instanceId,
            DeliveryState deliveryState,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Long sequenceNumber,
            String displayName,
            InstanceAgentCommandExecutionOutputContent content) {
        super();
        this.instanceAgentCommandId = instanceAgentCommandId;
        this.instanceId = instanceId;
        this.deliveryState = deliveryState;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.sequenceNumber = sequenceNumber;
        this.displayName = displayName;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the command */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
        private String instanceAgentCommandId;

        /**
         * The OCID of the command
         *
         * @param instanceAgentCommandId the value to set
         * @return this builder
         */
        public Builder instanceAgentCommandId(String instanceAgentCommandId) {
            this.instanceAgentCommandId = instanceAgentCommandId;
            this.__explicitlySet__.add("instanceAgentCommandId");
            return this;
        }
        /** The OCID of the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Specifies the command delivery state. * {@code VISIBLE} - The command is visible to
         * instance. * {@code PENDING} - The command is pending ack from the instance. * {@code
         * ACKED} - The command has been received and acked by the instance. * {@code
         * ACKED_CANCELED} - The canceled command has been received and acked by the instance. *
         * {@code EXPIRED} - The instance has not requested for commands and its delivery has
         * expired.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deliveryState")
        private DeliveryState deliveryState;

        /**
         * Specifies the command delivery state. * {@code VISIBLE} - The command is visible to
         * instance. * {@code PENDING} - The command is pending ack from the instance. * {@code
         * ACKED} - The command has been received and acked by the instance. * {@code
         * ACKED_CANCELED} - The canceled command has been received and acked by the instance. *
         * {@code EXPIRED} - The instance has not requested for commands and its delivery has
         * expired.
         *
         * @param deliveryState the value to set
         * @return this builder
         */
        public Builder deliveryState(DeliveryState deliveryState) {
            this.deliveryState = deliveryState;
            this.__explicitlySet__.add("deliveryState");
            return this;
        }
        /**
         * command execution life cycle state. * {@code ACCEPTED} - The command execution has been
         * accepted to run. * {@code IN_PROGRESS} - The command execution is in progress. * {@code
         * SUCCEEDED} - The command execution is successful. * {@code FAILED} - The command
         * execution has failed. * {@code TIMED_OUT} - The command execution has timedout. * {@code
         * CANCELED} - The command execution has canceled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * command execution life cycle state. * {@code ACCEPTED} - The command execution has been
         * accepted to run. * {@code IN_PROGRESS} - The command execution is in progress. * {@code
         * SUCCEEDED} - The command execution is successful. * {@code FAILED} - The command
         * execution has failed. * {@code TIMED_OUT} - The command execution has timedout. * {@code
         * CANCELED} - The command execution has canceled.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The command creation date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The command creation date
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The command last updated at date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The command last updated at date.
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
         * The large non-consecutive number that Run Command Service assigns to each created
         * command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sequenceNumber")
        private Long sequenceNumber;

        /**
         * The large non-consecutive number that Run Command Service assigns to each created
         * command.
         *
         * @param sequenceNumber the value to set
         * @return this builder
         */
        public Builder sequenceNumber(Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            this.__explicitlySet__.add("sequenceNumber");
            return this;
        }
        /** The user friendly display name of the command. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user friendly display name of the command.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private InstanceAgentCommandExecutionOutputContent content;

        public Builder content(InstanceAgentCommandExecutionOutputContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandExecution build() {
            InstanceAgentCommandExecution model =
                    new InstanceAgentCommandExecution(
                            this.instanceAgentCommandId,
                            this.instanceId,
                            this.deliveryState,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.sequenceNumber,
                            this.displayName,
                            this.content);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandExecution model) {
            if (model.wasPropertyExplicitlySet("instanceAgentCommandId")) {
                this.instanceAgentCommandId(model.getInstanceAgentCommandId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("deliveryState")) {
                this.deliveryState(model.getDeliveryState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("sequenceNumber")) {
                this.sequenceNumber(model.getSequenceNumber());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
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

    /** The OCID of the command */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
    private final String instanceAgentCommandId;

    /**
     * The OCID of the command
     *
     * @return the value
     */
    public String getInstanceAgentCommandId() {
        return instanceAgentCommandId;
    }

    /** The OCID of the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Specifies the command delivery state. * {@code VISIBLE} - The command is visible to instance.
     * * {@code PENDING} - The command is pending ack from the instance. * {@code ACKED} - The
     * command has been received and acked by the instance. * {@code ACKED_CANCELED} - The canceled
     * command has been received and acked by the instance. * {@code EXPIRED} - The instance has not
     * requested for commands and its delivery has expired.
     */
    public enum DeliveryState implements com.oracle.bmc.http.internal.BmcEnum {
        Visible("VISIBLE"),
        Pending("PENDING"),
        Acked("ACKED"),
        AckedCanceled("ACKED_CANCELED"),
        Expired("EXPIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeliveryState.class);

        private final String value;
        private static java.util.Map<String, DeliveryState> map;

        static {
            map = new java.util.HashMap<>();
            for (DeliveryState v : DeliveryState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeliveryState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeliveryState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeliveryState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the command delivery state. * {@code VISIBLE} - The command is visible to instance.
     * * {@code PENDING} - The command is pending ack from the instance. * {@code ACKED} - The
     * command has been received and acked by the instance. * {@code ACKED_CANCELED} - The canceled
     * command has been received and acked by the instance. * {@code EXPIRED} - The instance has not
     * requested for commands and its delivery has expired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deliveryState")
    private final DeliveryState deliveryState;

    /**
     * Specifies the command delivery state. * {@code VISIBLE} - The command is visible to instance.
     * * {@code PENDING} - The command is pending ack from the instance. * {@code ACKED} - The
     * command has been received and acked by the instance. * {@code ACKED_CANCELED} - The canceled
     * command has been received and acked by the instance. * {@code EXPIRED} - The instance has not
     * requested for commands and its delivery has expired.
     *
     * @return the value
     */
    public DeliveryState getDeliveryState() {
        return deliveryState;
    }

    /**
     * command execution life cycle state. * {@code ACCEPTED} - The command execution has been
     * accepted to run. * {@code IN_PROGRESS} - The command execution is in progress. * {@code
     * SUCCEEDED} - The command execution is successful. * {@code FAILED} - The command execution
     * has failed. * {@code TIMED_OUT} - The command execution has timedout. * {@code CANCELED} -
     * The command execution has canceled.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        TimedOut("TIMED_OUT"),
        Canceled("CANCELED"),

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
     * command execution life cycle state. * {@code ACCEPTED} - The command execution has been
     * accepted to run. * {@code IN_PROGRESS} - The command execution is in progress. * {@code
     * SUCCEEDED} - The command execution is successful. * {@code FAILED} - The command execution
     * has failed. * {@code TIMED_OUT} - The command execution has timedout. * {@code CANCELED} -
     * The command execution has canceled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * command execution life cycle state. * {@code ACCEPTED} - The command execution has been
     * accepted to run. * {@code IN_PROGRESS} - The command execution is in progress. * {@code
     * SUCCEEDED} - The command execution is successful. * {@code FAILED} - The command execution
     * has failed. * {@code TIMED_OUT} - The command execution has timedout. * {@code CANCELED} -
     * The command execution has canceled.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The command creation date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The command creation date
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The command last updated at date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The command last updated at date.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The large non-consecutive number that Run Command Service assigns to each created command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequenceNumber")
    private final Long sequenceNumber;

    /**
     * The large non-consecutive number that Run Command Service assigns to each created command.
     *
     * @return the value
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /** The user friendly display name of the command. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user friendly display name of the command.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final InstanceAgentCommandExecutionOutputContent content;

    public InstanceAgentCommandExecutionOutputContent getContent() {
        return content;
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
        sb.append("InstanceAgentCommandExecution(");
        sb.append("super=").append(super.toString());
        sb.append("instanceAgentCommandId=").append(String.valueOf(this.instanceAgentCommandId));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", deliveryState=").append(String.valueOf(this.deliveryState));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", sequenceNumber=").append(String.valueOf(this.sequenceNumber));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandExecution)) {
            return false;
        }

        InstanceAgentCommandExecution other = (InstanceAgentCommandExecution) o;
        return java.util.Objects.equals(this.instanceAgentCommandId, other.instanceAgentCommandId)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.deliveryState, other.deliveryState)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.sequenceNumber, other.sequenceNumber)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.content, other.content)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceAgentCommandId == null
                                ? 43
                                : this.instanceAgentCommandId.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.deliveryState == null ? 43 : this.deliveryState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.sequenceNumber == null ? 43 : this.sequenceNumber.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
