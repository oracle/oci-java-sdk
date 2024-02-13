/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary information about a scheduled task. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduledTaskSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledTaskSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "taskType",
        "targetService",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "taskStatus",
        "pauseReason",
        "workRequestId",
        "displayName",
        "freeformTags",
        "definedTags",
        "lastExecutionStatus",
        "timeLastExecuted"
    })
    public ScheduledTaskSummary(
            String id,
            TaskType taskType,
            String targetService,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ScheduledTask.LifecycleState lifecycleState,
            TaskStatus taskStatus,
            ScheduledTask.PauseReason pauseReason,
            String workRequestId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            LastExecutionStatus lastExecutionStatus,
            java.util.Date timeLastExecuted) {
        super();
        this.id = id;
        this.taskType = taskType;
        this.targetService = targetService;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.taskStatus = taskStatus;
        this.pauseReason = pauseReason;
        this.workRequestId = workRequestId;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lastExecutionStatus = lastExecutionStatus;
        this.timeLastExecuted = timeLastExecuted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the data plane resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the data plane resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Task type. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * Task type.
         *
         * @param taskType the value to set
         * @return this builder
         */
        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }
        /** Target Service */
        @com.fasterxml.jackson.annotation.JsonProperty("targetService")
        private String targetService;

        /**
         * Target Service
         *
         * @param targetService the value to set
         * @return this builder
         */
        public Builder targetService(String targetService) {
            this.targetService = targetService;
            this.__explicitlySet__.add("targetService");
            return this;
        }
        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The date and time the schedule task was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the schedule task was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the scheduled task was last updated, in the format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the scheduled task was last updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the scheduled task. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ScheduledTask.LifecycleState lifecycleState;

        /**
         * The current state of the scheduled task.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ScheduledTask.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Status of the scheduled task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
        private TaskStatus taskStatus;

        /**
         * Status of the scheduled task.
         *
         * @param taskStatus the value to set
         * @return this builder
         */
        public Builder taskStatus(TaskStatus taskStatus) {
            this.taskStatus = taskStatus;
            this.__explicitlySet__.add("taskStatus");
            return this;
        }
        /** reason for taskStatus PAUSED. */
        @com.fasterxml.jackson.annotation.JsonProperty("pauseReason")
        private ScheduledTask.PauseReason pauseReason;

        /**
         * reason for taskStatus PAUSED.
         *
         * @param pauseReason the value to set
         * @return this builder
         */
        public Builder pauseReason(ScheduledTask.PauseReason pauseReason) {
            this.pauseReason = pauseReason;
            this.__explicitlySet__.add("pauseReason");
            return this;
        }
        /**
         * most recent Work Request Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * asynchronous request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * most recent Work Request Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * asynchronous request.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * A user-friendly name that is changeable and that does not have to be unique. Format: a
         * leading alphanumeric, followed by zero or more alphanumerics, underscores, spaces,
         * backslashes, or hyphens in any order). No trailing spaces allowed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name that is changeable and that does not have to be unique. Format: a
         * leading alphanumeric, followed by zero or more alphanumerics, underscores, spaces,
         * backslashes, or hyphens in any order). No trailing spaces allowed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /** The most recent task execution status. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastExecutionStatus")
        private LastExecutionStatus lastExecutionStatus;

        /**
         * The most recent task execution status.
         *
         * @param lastExecutionStatus the value to set
         * @return this builder
         */
        public Builder lastExecutionStatus(LastExecutionStatus lastExecutionStatus) {
            this.lastExecutionStatus = lastExecutionStatus;
            this.__explicitlySet__.add("lastExecutionStatus");
            return this;
        }
        /** The date and time the scheduled task last executed, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
        private java.util.Date timeLastExecuted;

        /**
         * The date and time the scheduled task last executed, in the format defined by RFC3339.
         *
         * @param timeLastExecuted the value to set
         * @return this builder
         */
        public Builder timeLastExecuted(java.util.Date timeLastExecuted) {
            this.timeLastExecuted = timeLastExecuted;
            this.__explicitlySet__.add("timeLastExecuted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledTaskSummary build() {
            ScheduledTaskSummary model =
                    new ScheduledTaskSummary(
                            this.id,
                            this.taskType,
                            this.targetService,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.taskStatus,
                            this.pauseReason,
                            this.workRequestId,
                            this.displayName,
                            this.freeformTags,
                            this.definedTags,
                            this.lastExecutionStatus,
                            this.timeLastExecuted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledTaskSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("targetService")) {
                this.targetService(model.getTargetService());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("taskStatus")) {
                this.taskStatus(model.getTaskStatus());
            }
            if (model.wasPropertyExplicitlySet("pauseReason")) {
                this.pauseReason(model.getPauseReason());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("lastExecutionStatus")) {
                this.lastExecutionStatus(model.getLastExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("timeLastExecuted")) {
                this.timeLastExecuted(model.getTimeLastExecuted());
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

    /** Target Service */
    @com.fasterxml.jackson.annotation.JsonProperty("targetService")
    private final String targetService;

    /**
     * Target Service
     *
     * @return the value
     */
    public String getTargetService() {
        return targetService;
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

    /** The date and time the schedule task was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the schedule task was created, in the format defined by RFC3339.
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

    /** The current state of the scheduled task. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ScheduledTask.LifecycleState lifecycleState;

    /**
     * The current state of the scheduled task.
     *
     * @return the value
     */
    public ScheduledTask.LifecycleState getLifecycleState() {
        return lifecycleState;
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
    @com.fasterxml.jackson.annotation.JsonProperty("pauseReason")
    private final ScheduledTask.PauseReason pauseReason;

    /**
     * reason for taskStatus PAUSED.
     *
     * @return the value
     */
    public ScheduledTask.PauseReason getPauseReason() {
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

    /** The most recent task execution status. */
    public enum LastExecutionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LastExecutionStatus.class);

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
    /** The most recent task execution status. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastExecutionStatus")
    private final LastExecutionStatus lastExecutionStatus;

    /**
     * The most recent task execution status.
     *
     * @return the value
     */
    public LastExecutionStatus getLastExecutionStatus() {
        return lastExecutionStatus;
    }

    /** The date and time the scheduled task last executed, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastExecuted")
    private final java.util.Date timeLastExecuted;

    /**
     * The date and time the scheduled task last executed, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeLastExecuted() {
        return timeLastExecuted;
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
        sb.append("ScheduledTaskSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", targetService=").append(String.valueOf(this.targetService));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", taskStatus=").append(String.valueOf(this.taskStatus));
        sb.append(", pauseReason=").append(String.valueOf(this.pauseReason));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lastExecutionStatus=").append(String.valueOf(this.lastExecutionStatus));
        sb.append(", timeLastExecuted=").append(String.valueOf(this.timeLastExecuted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledTaskSummary)) {
            return false;
        }

        ScheduledTaskSummary other = (ScheduledTaskSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.targetService, other.targetService)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.taskStatus, other.taskStatus)
                && java.util.Objects.equals(this.pauseReason, other.pauseReason)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lastExecutionStatus, other.lastExecutionStatus)
                && java.util.Objects.equals(this.timeLastExecuted, other.timeLastExecuted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetService == null ? 43 : this.targetService.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.taskStatus == null ? 43 : this.taskStatus.hashCode());
        result = (result * PRIME) + (this.pauseReason == null ? 43 : this.pauseReason.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lastExecutionStatus == null
                                ? 43
                                : this.lastExecutionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecuted == null ? 43 : this.timeLastExecuted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
