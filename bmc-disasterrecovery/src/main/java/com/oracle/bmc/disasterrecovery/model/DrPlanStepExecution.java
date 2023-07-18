/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Summary information about a step execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrPlanStepExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanStepExecution
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stepId",
        "type",
        "groupId",
        "displayName",
        "logLocation",
        "status",
        "statusDetails",
        "timeStarted",
        "timeEnded",
        "executionDurationInSec"
    })
    public DrPlanStepExecution(
            String stepId,
            DrPlanStepType type,
            String groupId,
            String displayName,
            ObjectStorageLogLocation logLocation,
            DrPlanStepExecutionStatus status,
            String statusDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer executionDurationInSec) {
        super();
        this.stepId = stepId;
        this.type = type;
        this.groupId = groupId;
        this.displayName = displayName;
        this.logLocation = logLocation;
        this.status = status;
        this.statusDetails = statusDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.executionDurationInSec = executionDurationInSec;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of this step. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.step..&lt;unique_id&gt;}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private String stepId;

        /**
         * The unique id of this step. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.step..&lt;unique_id&gt;}
         *
         * @param stepId the value to set
         * @return this builder
         */
        public Builder stepId(String stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }
        /** The plan step type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DrPlanStepType type;

        /**
         * The plan step type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DrPlanStepType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The unique id of the group to which this step belongs. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.group..&lt;unique_id&gt;}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        /**
         * The unique id of the group to which this step belongs. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.group..&lt;unique_id&gt;}
         *
         * @param groupId the value to set
         * @return this builder
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }
        /**
         * The display name of the step.
         *
         * <p>Example: {@code DATABASE_SWITCHOVER}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the step.
         *
         * <p>Example: {@code DATABASE_SWITCHOVER}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private ObjectStorageLogLocation logLocation;

        public Builder logLocation(ObjectStorageLogLocation logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }
        /** The status of the step execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DrPlanStepExecutionStatus status;

        /**
         * The status of the step execution.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(DrPlanStepExecutionStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Additional details about the step execution status.
         *
         * <p>Example: {@code This step failed to complete due to a timeout}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        /**
         * Additional details about the step execution status.
         *
         * <p>Example: {@code This step failed to complete due to a timeout}
         *
         * @param statusDetails the value to set
         * @return this builder
         */
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }
        /**
         * The time at which step execution began. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time at which step execution began. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time at which step execution ended. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time at which step execution ended. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The total duration in seconds taken to complete step execution.
         *
         * <p>Example: {@code 35}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
        private Integer executionDurationInSec;

        /**
         * The total duration in seconds taken to complete step execution.
         *
         * <p>Example: {@code 35}
         *
         * @param executionDurationInSec the value to set
         * @return this builder
         */
        public Builder executionDurationInSec(Integer executionDurationInSec) {
            this.executionDurationInSec = executionDurationInSec;
            this.__explicitlySet__.add("executionDurationInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanStepExecution build() {
            DrPlanStepExecution model =
                    new DrPlanStepExecution(
                            this.stepId,
                            this.type,
                            this.groupId,
                            this.displayName,
                            this.logLocation,
                            this.status,
                            this.statusDetails,
                            this.timeStarted,
                            this.timeEnded,
                            this.executionDurationInSec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanStepExecution model) {
            if (model.wasPropertyExplicitlySet("stepId")) {
                this.stepId(model.getStepId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("groupId")) {
                this.groupId(model.getGroupId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("logLocation")) {
                this.logLocation(model.getLogLocation());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetails")) {
                this.statusDetails(model.getStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("executionDurationInSec")) {
                this.executionDurationInSec(model.getExecutionDurationInSec());
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
     * The unique id of this step. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.step..&lt;unique_id&gt;}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final String stepId;

    /**
     * The unique id of this step. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.step..&lt;unique_id&gt;}
     *
     * @return the value
     */
    public String getStepId() {
        return stepId;
    }

    /** The plan step type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DrPlanStepType type;

    /**
     * The plan step type.
     *
     * @return the value
     */
    public DrPlanStepType getType() {
        return type;
    }

    /**
     * The unique id of the group to which this step belongs. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.group..&lt;unique_id&gt;}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

    /**
     * The unique id of the group to which this step belongs. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.group..&lt;unique_id&gt;}
     *
     * @return the value
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * The display name of the step.
     *
     * <p>Example: {@code DATABASE_SWITCHOVER}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the step.
     *
     * <p>Example: {@code DATABASE_SWITCHOVER}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    private final ObjectStorageLogLocation logLocation;

    public ObjectStorageLogLocation getLogLocation() {
        return logLocation;
    }

    /** The status of the step execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DrPlanStepExecutionStatus status;

    /**
     * The status of the step execution.
     *
     * @return the value
     */
    public DrPlanStepExecutionStatus getStatus() {
        return status;
    }

    /**
     * Additional details about the step execution status.
     *
     * <p>Example: {@code This step failed to complete due to a timeout}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

    /**
     * Additional details about the step execution status.
     *
     * <p>Example: {@code This step failed to complete due to a timeout}
     *
     * @return the value
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * The time at which step execution began. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time at which step execution began. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time at which step execution ended. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time at which step execution ended. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The total duration in seconds taken to complete step execution.
     *
     * <p>Example: {@code 35}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
    private final Integer executionDurationInSec;

    /**
     * The total duration in seconds taken to complete step execution.
     *
     * <p>Example: {@code 35}
     *
     * @return the value
     */
    public Integer getExecutionDurationInSec() {
        return executionDurationInSec;
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
        sb.append("DrPlanStepExecution(");
        sb.append("super=").append(super.toString());
        sb.append("stepId=").append(String.valueOf(this.stepId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", groupId=").append(String.valueOf(this.groupId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", executionDurationInSec=").append(String.valueOf(this.executionDurationInSec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanStepExecution)) {
            return false;
        }

        DrPlanStepExecution other = (DrPlanStepExecution) o;
        return java.util.Objects.equals(this.stepId, other.stepId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(
                        this.executionDurationInSec, other.executionDurationInSec)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.executionDurationInSec == null
                                ? 43
                                : this.executionDurationInSec.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
