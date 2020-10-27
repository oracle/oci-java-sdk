/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * A command's execution summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommandExecutionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceAgentCommandExecutionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
        private String instanceAgentCommandId;

        public Builder instanceAgentCommandId(String instanceAgentCommandId) {
            this.instanceAgentCommandId = instanceAgentCommandId;
            this.__explicitlySet__.add("instanceAgentCommandId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveryState")
        private DeliveryState deliveryState;

        public Builder deliveryState(DeliveryState deliveryState) {
            this.deliveryState = deliveryState;
            this.__explicitlySet__.add("deliveryState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sequenceNumber")
        private Long sequenceNumber;

        public Builder sequenceNumber(Long sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
            this.__explicitlySet__.add("sequenceNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

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

        public InstanceAgentCommandExecutionSummary build() {
            InstanceAgentCommandExecutionSummary __instance__ =
                    new InstanceAgentCommandExecutionSummary(
                            instanceAgentCommandId,
                            instanceId,
                            deliveryState,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            sequenceNumber,
                            displayName,
                            content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandExecutionSummary o) {
            Builder copiedBuilder =
                    instanceAgentCommandId(o.getInstanceAgentCommandId())
                            .instanceId(o.getInstanceId())
                            .deliveryState(o.getDeliveryState())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .sequenceNumber(o.getSequenceNumber())
                            .displayName(o.getDisplayName())
                            .content(o.getContent());

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
     * The OCID of the command
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAgentCommandId")
    String instanceAgentCommandId;

    /**
     * The OCID of the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;
    /**
     * Specifies the command delivery state.
     *  * `VISIBLE` - The command is visible to instance.
     *  * `PENDING` - The command is pending ack from the instance.
     *  * `ACKED` - The command has been received and acked by the instance.
     *  * `ACKED_CANCELED` - The canceled command has been received and acked by the instance.
     *  * `EXPIRED` - The instance has not requested for commands and its delivery has expired.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DeliveryState {
        Visible("VISIBLE"),
        Pending("PENDING"),
        Acked("ACKED"),
        AckedCanceled("ACKED_CANCELED"),
        Expired("EXPIRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Specifies the command delivery state.
     *  * `VISIBLE` - The command is visible to instance.
     *  * `PENDING` - The command is pending ack from the instance.
     *  * `ACKED` - The command has been received and acked by the instance.
     *  * `ACKED_CANCELED` - The canceled command has been received and acked by the instance.
     *  * `EXPIRED` - The instance has not requested for commands and its delivery has expired.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliveryState")
    DeliveryState deliveryState;
    /**
     * command execution life cycle state.
     * * `ACCEPTED` - The command execution has been accepted to run.
     * * `IN_PROGRESS` - The command execution is in progress.
     * * `SUCCEEDED` - The command execution is successful.
     * * `FAILED` - The command execution has failed.
     * * `TIMED_OUT` - The command execution has timedout.
     * * `CANCELED` - The command execution has canceled.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        TimedOut("TIMED_OUT"),
        Canceled("CANCELED"),

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
     * command execution life cycle state.
     * * `ACCEPTED` - The command execution has been accepted to run.
     * * `IN_PROGRESS` - The command execution is in progress.
     * * `SUCCEEDED` - The command execution is successful.
     * * `FAILED` - The command execution has failed.
     * * `TIMED_OUT` - The command execution has timedout.
     * * `CANCELED` - The command execution has canceled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The command creation date
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The command last updated at date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The large non-consecutive number that Run Command Service assigns to each created command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sequenceNumber")
    Long sequenceNumber;

    /**
     * The user friendly display name of the command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    InstanceAgentCommandExecutionOutputContent content;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
