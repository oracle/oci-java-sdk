/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Task Execution associated with the Job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Execution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Execution extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "taskRecordId",
        "stepName",
        "processReferenceId",
        "sequence",
        "subjects",
        "status",
        "outcome",
        "targetId",
        "timeStarted",
        "timeEnded",
        "isRollbackTask",
        "description",
        "resourceId",
        "systemTags"
    })
    public Execution(
            String id,
            String taskRecordId,
            String stepName,
            String processReferenceId,
            String sequence,
            java.util.List<String> subjects,
            JobStatus status,
            Outcome outcome,
            String targetId,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Boolean isRollbackTask,
            String description,
            String resourceId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.taskRecordId = taskRecordId;
        this.stepName = stepName;
        this.processReferenceId = processReferenceId;
        this.sequence = sequence;
        this.subjects = subjects;
        this.status = status;
        this.outcome = outcome;
        this.targetId = targetId;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.isRollbackTask = isRollbackTask;
        this.description = description;
        this.resourceId = resourceId;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique Id associated with the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique Id associated with the task execution.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of taskRecord. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
        private String taskRecordId;

        /**
         * The OCID of taskRecord.
         *
         * @param taskRecordId the value to set
         * @return this builder
         */
        public Builder taskRecordId(String taskRecordId) {
            this.taskRecordId = taskRecordId;
            this.__explicitlySet__.add("taskRecordId");
            return this;
        }
        /** Name of the step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Name of the step.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /**
         * Unique process-reference identifier returned by the execution client. In some cases, this
         * can be a runcommand OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("processReferenceId")
        private String processReferenceId;

        /**
         * Unique process-reference identifier returned by the execution client. In some cases, this
         * can be a runcommand OCID.
         *
         * @param processReferenceId the value to set
         * @return this builder
         */
        public Builder processReferenceId(String processReferenceId) {
            this.processReferenceId = processReferenceId;
            this.__explicitlySet__.add("processReferenceId");
            return this;
        }
        /** The sequence of the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("sequence")
        private String sequence;

        /**
         * The sequence of the task.
         *
         * @param sequence the value to set
         * @return this builder
         */
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            this.__explicitlySet__.add("sequence");
            return this;
        }
        /** Subjects that are tied to the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("subjects")
        private java.util.List<String> subjects;

        /**
         * Subjects that are tied to the task.
         *
         * @param subjects the value to set
         * @return this builder
         */
        public Builder subjects(java.util.List<String> subjects) {
            this.subjects = subjects;
            this.__explicitlySet__.add("subjects");
            return this;
        }
        /** Status of the Task */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Task
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outcome")
        private Outcome outcome;

        public Builder outcome(Outcome outcome) {
            this.outcome = outcome;
            this.__explicitlySet__.add("outcome");
            return this;
        }
        /** Target associated with the execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Target associated with the execution.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The time the task started. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the task started. An RFC3339 formatted datetime string.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time the task ended. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the task ended. An RFC3339 formatted datetime string.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Is this a rollback task? */
        @com.fasterxml.jackson.annotation.JsonProperty("isRollbackTask")
        private Boolean isRollbackTask;

        /**
         * Is this a rollback task?
         *
         * @param isRollbackTask the value to set
         * @return this builder
         */
        public Builder isRollbackTask(Boolean isRollbackTask) {
            this.isRollbackTask = isRollbackTask;
            this.__explicitlySet__.add("isRollbackTask");
            return this;
        }
        /**
         * Description of the Execution status. If there are any errors, this can also include a
         * short error message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Execution status. If there are any errors, this can also include a
         * short error message.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Resource Identifier associated with the Work Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Resource Identifier associated with the Work Request.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Execution build() {
            Execution model =
                    new Execution(
                            this.id,
                            this.taskRecordId,
                            this.stepName,
                            this.processReferenceId,
                            this.sequence,
                            this.subjects,
                            this.status,
                            this.outcome,
                            this.targetId,
                            this.timeStarted,
                            this.timeEnded,
                            this.isRollbackTask,
                            this.description,
                            this.resourceId,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Execution model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("taskRecordId")) {
                this.taskRecordId(model.getTaskRecordId());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("processReferenceId")) {
                this.processReferenceId(model.getProcessReferenceId());
            }
            if (model.wasPropertyExplicitlySet("sequence")) {
                this.sequence(model.getSequence());
            }
            if (model.wasPropertyExplicitlySet("subjects")) {
                this.subjects(model.getSubjects());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("outcome")) {
                this.outcome(model.getOutcome());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("isRollbackTask")) {
                this.isRollbackTask(model.getIsRollbackTask());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique Id associated with the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique Id associated with the task execution.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of taskRecord. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
    private final String taskRecordId;

    /**
     * The OCID of taskRecord.
     *
     * @return the value
     */
    public String getTaskRecordId() {
        return taskRecordId;
    }

    /** Name of the step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Name of the step.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /**
     * Unique process-reference identifier returned by the execution client. In some cases, this can
     * be a runcommand OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("processReferenceId")
    private final String processReferenceId;

    /**
     * Unique process-reference identifier returned by the execution client. In some cases, this can
     * be a runcommand OCID.
     *
     * @return the value
     */
    public String getProcessReferenceId() {
        return processReferenceId;
    }

    /** The sequence of the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    private final String sequence;

    /**
     * The sequence of the task.
     *
     * @return the value
     */
    public String getSequence() {
        return sequence;
    }

    /** Subjects that are tied to the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("subjects")
    private final java.util.List<String> subjects;

    /**
     * Subjects that are tied to the task.
     *
     * @return the value
     */
    public java.util.List<String> getSubjects() {
        return subjects;
    }

    /** Status of the Task */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Task
     *
     * @return the value
     */
    public JobStatus getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    private final Outcome outcome;

    public Outcome getOutcome() {
        return outcome;
    }

    /** Target associated with the execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Target associated with the execution.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The time the task started. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the task started. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the task ended. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the task ended. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Is this a rollback task? */
    @com.fasterxml.jackson.annotation.JsonProperty("isRollbackTask")
    private final Boolean isRollbackTask;

    /**
     * Is this a rollback task?
     *
     * @return the value
     */
    public Boolean getIsRollbackTask() {
        return isRollbackTask;
    }

    /**
     * Description of the Execution status. If there are any errors, this can also include a short
     * error message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Execution status. If there are any errors, this can also include a short
     * error message.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Resource Identifier associated with the Work Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Resource Identifier associated with the Work Request.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Execution(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", taskRecordId=").append(String.valueOf(this.taskRecordId));
        sb.append(", stepName=").append(String.valueOf(this.stepName));
        sb.append(", processReferenceId=").append(String.valueOf(this.processReferenceId));
        sb.append(", sequence=").append(String.valueOf(this.sequence));
        sb.append(", subjects=").append(String.valueOf(this.subjects));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", outcome=").append(String.valueOf(this.outcome));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", isRollbackTask=").append(String.valueOf(this.isRollbackTask));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Execution)) {
            return false;
        }

        Execution other = (Execution) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.taskRecordId, other.taskRecordId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.processReferenceId, other.processReferenceId)
                && java.util.Objects.equals(this.sequence, other.sequence)
                && java.util.Objects.equals(this.subjects, other.subjects)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.outcome, other.outcome)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.isRollbackTask, other.isRollbackTask)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.taskRecordId == null ? 43 : this.taskRecordId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.processReferenceId == null
                                ? 43
                                : this.processReferenceId.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.subjects == null ? 43 : this.subjects.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.outcome == null ? 43 : this.outcome.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.isRollbackTask == null ? 43 : this.isRollbackTask.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
