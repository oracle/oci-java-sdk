/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary information about a scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduledTaskSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScheduledTaskSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ScheduledTask.LifecycleState lifecycleState;

        public Builder lifecycleState(ScheduledTask.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
        private TaskStatus taskStatus;

        public Builder taskStatus(TaskStatus taskStatus) {
            this.taskStatus = taskStatus;
            this.__explicitlySet__.add("taskStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pauseReason")
        private ScheduledTask.PauseReason pauseReason;

        public Builder pauseReason(ScheduledTask.PauseReason pauseReason) {
            this.pauseReason = pauseReason;
            this.__explicitlySet__.add("pauseReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastExecutionStatus")
        private LastExecutionStatus lastExecutionStatus;

        public Builder lastExecutionStatus(LastExecutionStatus lastExecutionStatus) {
            this.lastExecutionStatus = lastExecutionStatus;
            this.__explicitlySet__.add("lastExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
        private java.util.Date timeLastExecuted;

        public Builder timeLastExecuted(java.util.Date timeLastExecuted) {
            this.timeLastExecuted = timeLastExecuted;
            this.__explicitlySet__.add("timeLastExecuted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledTaskSummary build() {
            ScheduledTaskSummary __instance__ =
                    new ScheduledTaskSummary(
                            id,
                            taskType,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            taskStatus,
                            pauseReason,
                            workRequestId,
                            displayName,
                            freeformTags,
                            definedTags,
                            lastExecutionStatus,
                            timeLastExecuted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledTaskSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .taskType(o.getTaskType())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .taskStatus(o.getTaskStatus())
                            .pauseReason(o.getPauseReason())
                            .workRequestId(o.getWorkRequestId())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .lastExecutionStatus(o.getLastExecutionStatus())
                            .timeLastExecuted(o.getTimeLastExecuted());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the data plane resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Task type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    TaskType taskType;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The date and time the schedule task was created, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the scheduled task was last updated, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the scheduled task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    ScheduledTask.LifecycleState lifecycleState;
    /**
     * Status of the scheduled task.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TaskStatus {
        Ready("READY"),
        Paused("PAUSED"),
        Completed("COMPLETED"),
        Blocked("BLOCKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TaskStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskStatus v : TaskStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TaskStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TaskStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the scheduled task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
    TaskStatus taskStatus;

    /**
     * reason for taskStatus PAUSED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pauseReason")
    ScheduledTask.PauseReason pauseReason;

    /**
     * most recent Work Request Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the asynchronous request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    String workRequestId;

    /**
     * A user-friendly name that is changeable and that does not have to be unique.
     * Format: a leading alphanumeric, followed by zero or more
     * alphanumerics, underscores, spaces, backslashes, or hyphens in any order).
     * No trailing spaces allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
    /**
     * The most recent task execution status.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LastExecutionStatus {
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LastExecutionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LastExecutionStatus v : LastExecutionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LastExecutionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LastExecutionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LastExecutionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The most recent task execution status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastExecutionStatus")
    LastExecutionStatus lastExecutionStatus;

    /**
     * The date and time the scheduled task last executed, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
    java.util.Date timeLastExecuted;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
