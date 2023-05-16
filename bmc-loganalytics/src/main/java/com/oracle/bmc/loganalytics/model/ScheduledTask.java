/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Log analytics scheduled task resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = ScheduledTask.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StandardTask.class,
            name = "STANDARD")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ScheduledTask extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "taskType",
        "schedules",
        "action",
        "taskStatus",
        "pauseReason",
        "workRequestId",
        "numOccurrences",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "timeOfNextExecution",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    protected ScheduledTask(
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
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.taskType = taskType;
        this.schedules = schedules;
        this.action = action;
        this.taskStatus = taskStatus;
        this.pauseReason = pauseReason;
        this.workRequestId = workRequestId;
        this.numOccurrences = numOccurrences;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeOfNextExecution = timeOfNextExecution;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the data plane resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the data plane resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name that is changeable and that does not have to be unique. Format: a
     * leading alphanumeric, followed by zero or more alphanumerics, underscores, spaces,
     * backslashes, or hyphens in any order). No trailing spaces allowed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name that is changeable and that does not have to be unique. Format: a
     * leading alphanumeric, followed by zero or more alphanumerics, underscores, spaces,
     * backslashes, or hyphens in any order). No trailing spaces allowed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Task type. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * Task type.
     *
     * @return the value
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /** Schedules. */
    @com.fasterxml.jackson.annotation.JsonProperty("schedules")
    private final java.util.List<Schedule> schedules;

    /**
     * Schedules.
     *
     * @return the value
     */
    public java.util.List<Schedule> getSchedules() {
        return schedules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    public Action getAction() {
        return action;
    }

    /** Status of the scheduled task. */
    public enum TaskStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Ready("READY"),
        Paused("PAUSED"),
        Completed("COMPLETED"),
        Blocked("BLOCKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TaskStatus.class);

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
    /** Status of the scheduled task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
    private final TaskStatus taskStatus;

    /**
     * Status of the scheduled task.
     *
     * @return the value
     */
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    /** reason for taskStatus PAUSED. */
    public enum PauseReason implements com.oracle.bmc.http.internal.BmcEnum {
        MetricExtractionNotValid("METRIC_EXTRACTION_NOT_VALID"),
        SavedSearchNotValid("SAVED_SEARCH_NOT_VALID"),
        SavedSearchNotFound("SAVED_SEARCH_NOT_FOUND"),
        QueryStringNotValid("QUERY_STRING_NOT_VALID"),
        UserAction("USER_ACTION"),
        TenancyLifecycle("TENANCY_LIFECYCLE"),
        PurgeResourceNotFound("PURGE_RESOURCE_NOT_FOUND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PauseReason.class);

        private final String value;
        private static java.util.Map<String, PauseReason> map;

        static {
            map = new java.util.HashMap<>();
            for (PauseReason v : PauseReason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PauseReason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PauseReason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PauseReason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** reason for taskStatus PAUSED. */
    @com.fasterxml.jackson.annotation.JsonProperty("pauseReason")
    private final PauseReason pauseReason;

    /**
     * reason for taskStatus PAUSED.
     *
     * @return the value
     */
    public PauseReason getPauseReason() {
        return pauseReason;
    }

    /**
     * most recent Work Request Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * asynchronous request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * most recent Work Request Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * asynchronous request.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /** Number of execution occurrences. */
    @com.fasterxml.jackson.annotation.JsonProperty("numOccurrences")
    private final Long numOccurrences;

    /**
     * Number of execution occurrences.
     *
     * @return the value
     */
    public Long getNumOccurrences() {
        return numOccurrences;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The date and time the scheduled task was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the scheduled task was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the scheduled task was last updated, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the scheduled task was last updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time the scheduled task will execute next, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextExecution")
    private final java.util.Date timeOfNextExecution;

    /**
     * The date and time the scheduled task will execute next, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeOfNextExecution() {
        return timeOfNextExecution;
    }

    /** The current state of the scheduled task. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),

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
    /** The current state of the scheduled task. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the scheduled task.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ScheduledTask(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", schedules=").append(String.valueOf(this.schedules));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", taskStatus=").append(String.valueOf(this.taskStatus));
        sb.append(", pauseReason=").append(String.valueOf(this.pauseReason));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", numOccurrences=").append(String.valueOf(this.numOccurrences));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeOfNextExecution=").append(String.valueOf(this.timeOfNextExecution));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledTask)) {
            return false;
        }

        ScheduledTask other = (ScheduledTask) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.schedules, other.schedules)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.taskStatus, other.taskStatus)
                && java.util.Objects.equals(this.pauseReason, other.pauseReason)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.numOccurrences, other.numOccurrences)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeOfNextExecution, other.timeOfNextExecution)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.schedules == null ? 43 : this.schedules.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.taskStatus == null ? 43 : this.taskStatus.hashCode());
        result = (result * PRIME) + (this.pauseReason == null ? 43 : this.pauseReason.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.numOccurrences == null ? 43 : this.numOccurrences.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfNextExecution == null
                                ? 43
                                : this.timeOfNextExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Discriminator. */
    public enum Kind implements com.oracle.bmc.http.internal.BmcEnum {
        Acceleration("ACCELERATION"),
        Standard("STANDARD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kind.class);

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kind create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Kind', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
