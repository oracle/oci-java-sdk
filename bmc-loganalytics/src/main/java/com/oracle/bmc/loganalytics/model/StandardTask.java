/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log analytics scheduled task resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StandardTask.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StandardTask extends ScheduledTask {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedules")
        private java.util.List<Schedule> schedules;

        public Builder schedules(java.util.List<Schedule> schedules) {
            this.schedules = schedules;
            this.__explicitlySet__.add("schedules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
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
        private PauseReason pauseReason;

        public Builder pauseReason(PauseReason pauseReason) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("numOccurrences")
        private Long numOccurrences;

        public Builder numOccurrences(Long numOccurrences) {
            this.numOccurrences = numOccurrences;
            this.__explicitlySet__.add("numOccurrences");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextExecution")
        private java.util.Date timeOfNextExecution;

        public Builder timeOfNextExecution(java.util.Date timeOfNextExecution) {
            this.timeOfNextExecution = timeOfNextExecution;
            this.__explicitlySet__.add("timeOfNextExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public StandardTask build() {
            StandardTask __instance__ =
                    new StandardTask(
                            id,
                            displayName,
                            taskType,
                            schedules,
                            action,
                            taskStatus,
                            pauseReason,
                            workRequestId,
                            numOccurrences,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            timeOfNextExecution,
                            lifecycleState,
                            freeformTags,
                            definedTags,
                            lastExecutionStatus,
                            timeLastExecuted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardTask o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .taskType(o.getTaskType())
                            .schedules(o.getSchedules())
                            .action(o.getAction())
                            .taskStatus(o.getTaskStatus())
                            .pauseReason(o.getPauseReason())
                            .workRequestId(o.getWorkRequestId())
                            .numOccurrences(o.getNumOccurrences())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .timeOfNextExecution(o.getTimeOfNextExecution())
                            .lifecycleState(o.getLifecycleState())
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

    @Deprecated
    public StandardTask(
            String id,
            String displayName,
            TaskType taskType,
            java.util.List<Schedule> schedules,
            Action action,
            TaskStatus taskStatus,
            PauseReason pauseReason,
            String workRequestId,
            Long numOccurrences,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeOfNextExecution,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            LastExecutionStatus lastExecutionStatus,
            java.util.Date timeLastExecuted) {
        super(
                id,
                displayName,
                taskType,
                schedules,
                action,
                taskStatus,
                pauseReason,
                workRequestId,
                numOccurrences,
                compartmentId,
                timeCreated,
                timeUpdated,
                timeOfNextExecution,
                lifecycleState,
                freeformTags,
                definedTags);
        this.lastExecutionStatus = lastExecutionStatus;
        this.timeLastExecuted = timeLastExecuted;
    }

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
