/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Task associated with the Job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StepSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StepSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskRecordId",
        "stepName",
        "sequence",
        "status",
        "timeStarted",
        "timeEnded",
        "isRollbackTask",
        "description",
        "systemTags"
    })
    public StepSummary(
            String taskRecordId,
            String stepName,
            String sequence,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Boolean isRollbackTask,
            String description,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.taskRecordId = taskRecordId;
        this.stepName = stepName;
        this.sequence = sequence;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.isRollbackTask = isRollbackTask;
        this.description = description;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of taskRecord assocaited with the step
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
        private String taskRecordId;

        /**
         * The OCID of taskRecord assocaited with the step
         * @param taskRecordId the value to set
         * @return this builder
         **/
        public Builder taskRecordId(String taskRecordId) {
            this.taskRecordId = taskRecordId;
            this.__explicitlySet__.add("taskRecordId");
            return this;
        }
        /**
         * Name of the Step
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Name of the Step
         * @param stepName the value to set
         * @return this builder
         **/
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /**
         * The sequence of the step
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sequence")
        private String sequence;

        /**
         * The sequence of the step
         * @param sequence the value to set
         * @return this builder
         **/
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            this.__explicitlySet__.add("sequence");
            return this;
        }
        /**
         * Status of the Task
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Task
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The time the task started. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the task started. An RFC3339 formatted datetime string
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time the task ended. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the task ended. An RFC3339 formatted datetime string
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Is this a rollback task?
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRollbackTask")
        private Boolean isRollbackTask;

        /**
         * Is this a rollback task?
         * @param isRollbackTask the value to set
         * @return this builder
         **/
        public Builder isRollbackTask(Boolean isRollbackTask) {
            this.isRollbackTask = isRollbackTask;
            this.__explicitlySet__.add("isRollbackTask");
            return this;
        }
        /**
         * Description of the step Execution
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the step Execution
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StepSummary build() {
            StepSummary model =
                    new StepSummary(
                            this.taskRecordId,
                            this.stepName,
                            this.sequence,
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.isRollbackTask,
                            this.description,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StepSummary model) {
            if (model.wasPropertyExplicitlySet("taskRecordId")) {
                this.taskRecordId(model.getTaskRecordId());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("sequence")) {
                this.sequence(model.getSequence());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of taskRecord assocaited with the step
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
    private final String taskRecordId;

    /**
     * The OCID of taskRecord assocaited with the step
     * @return the value
     **/
    public String getTaskRecordId() {
        return taskRecordId;
    }

    /**
     * Name of the Step
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Name of the Step
     * @return the value
     **/
    public String getStepName() {
        return stepName;
    }

    /**
     * The sequence of the step
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    private final String sequence;

    /**
     * The sequence of the step
     * @return the value
     **/
    public String getSequence() {
        return sequence;
    }

    /**
     * Status of the Task
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Task
     * @return the value
     **/
    public JobStatus getStatus() {
        return status;
    }

    /**
     * The time the task started. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the task started. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time the task ended. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the task ended. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Is this a rollback task?
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRollbackTask")
    private final Boolean isRollbackTask;

    /**
     * Is this a rollback task?
     * @return the value
     **/
    public Boolean getIsRollbackTask() {
        return isRollbackTask;
    }

    /**
     * Description of the step Execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the step Execution
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StepSummary(");
        sb.append("super=").append(super.toString());
        sb.append("taskRecordId=").append(String.valueOf(this.taskRecordId));
        sb.append(", stepName=").append(String.valueOf(this.stepName));
        sb.append(", sequence=").append(String.valueOf(this.sequence));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", isRollbackTask=").append(String.valueOf(this.isRollbackTask));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StepSummary)) {
            return false;
        }

        StepSummary other = (StepSummary) o;
        return java.util.Objects.equals(this.taskRecordId, other.taskRecordId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.sequence, other.sequence)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.isRollbackTask, other.isRollbackTask)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskRecordId == null ? 43 : this.taskRecordId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.isRollbackTask == null ? 43 : this.isRollbackTask.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
