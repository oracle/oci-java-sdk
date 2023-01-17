/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Summary information about a group execution in a DR Plan Execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DrPlanGroupExecution.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrPlanGroupExecution extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "groupId",
        "type",
        "displayName",
        "status",
        "statusDetails",
        "timeStarted",
        "timeEnded",
        "executionDurationInSec",
        "stepExecutions"
    })
    public DrPlanGroupExecution(
            String groupId,
            DrPlanGroupType type,
            String displayName,
            DrPlanGroupExecutionStatus status,
            String statusDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer executionDurationInSec,
            java.util.List<DrPlanStepExecution> stepExecutions) {
        super();
        this.groupId = groupId;
        this.type = type;
        this.displayName = displayName;
        this.status = status;
        this.statusDetails = statusDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.executionDurationInSec = executionDurationInSec;
        this.stepExecutions = stepExecutions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of the group. Must not be modified by user.
         * <p>
         * Example: {@code sgid1.group..examplegroupsgid}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        /**
         * The unique id of the group. Must not be modified by user.
         * <p>
         * Example: {@code sgid1.group..examplegroupsgid}
         *
         * @param groupId the value to set
         * @return this builder
         **/
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }
        /**
         * The plan group type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DrPlanGroupType type;

        /**
         * The plan group type.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(DrPlanGroupType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The display name of group that was executed.
         * <p>
         * Example: {@code DATABASE_SWITCHOVER}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of group that was executed.
         * <p>
         * Example: {@code DATABASE_SWITCHOVER}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The status of the group execution.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private DrPlanGroupExecutionStatus status;

        /**
         * The status of the group execution.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(DrPlanGroupExecutionStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Additional details about the group execution status.
         * <p>
         * Example: {@code A total of three steps failed in the group}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private String statusDetails;

        /**
         * Additional details about the group execution status.
         * <p>
         * Example: {@code A total of three steps failed in the group}
         *
         * @param statusDetails the value to set
         * @return this builder
         **/
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }
        /**
         * The time at which group execution began. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2019-03-29T09:36:42Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time at which group execution began. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time at which group execution ended. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2019-03-29T09:36:42Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time at which group execution ended. An RFC3339 formatted datetime string.
         * <p>
         * Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The total duration in seconds taken to complete group execution.
         * <p>
         * Example: {@code 120}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
        private Integer executionDurationInSec;

        /**
         * The total duration in seconds taken to complete group execution.
         * <p>
         * Example: {@code 120}
         *
         * @param executionDurationInSec the value to set
         * @return this builder
         **/
        public Builder executionDurationInSec(Integer executionDurationInSec) {
            this.executionDurationInSec = executionDurationInSec;
            this.__explicitlySet__.add("executionDurationInSec");
            return this;
        }
        /**
         * A list of details of each step executed in this group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepExecutions")
        private java.util.List<DrPlanStepExecution> stepExecutions;

        /**
         * A list of details of each step executed in this group.
         *
         * @param stepExecutions the value to set
         * @return this builder
         **/
        public Builder stepExecutions(java.util.List<DrPlanStepExecution> stepExecutions) {
            this.stepExecutions = stepExecutions;
            this.__explicitlySet__.add("stepExecutions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanGroupExecution build() {
            DrPlanGroupExecution model =
                    new DrPlanGroupExecution(
                            this.groupId,
                            this.type,
                            this.displayName,
                            this.status,
                            this.statusDetails,
                            this.timeStarted,
                            this.timeEnded,
                            this.executionDurationInSec,
                            this.stepExecutions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanGroupExecution model) {
            if (model.wasPropertyExplicitlySet("groupId")) {
                this.groupId(model.getGroupId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("stepExecutions")) {
                this.stepExecutions(model.getStepExecutions());
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
     * The unique id of the group. Must not be modified by user.
     * <p>
     * Example: {@code sgid1.group..examplegroupsgid}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

    /**
     * The unique id of the group. Must not be modified by user.
     * <p>
     * Example: {@code sgid1.group..examplegroupsgid}
     *
     * @return the value
     **/
    public String getGroupId() {
        return groupId;
    }

    /**
     * The plan group type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DrPlanGroupType type;

    /**
     * The plan group type.
     *
     * @return the value
     **/
    public DrPlanGroupType getType() {
        return type;
    }

    /**
     * The display name of group that was executed.
     * <p>
     * Example: {@code DATABASE_SWITCHOVER}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of group that was executed.
     * <p>
     * Example: {@code DATABASE_SWITCHOVER}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The status of the group execution.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DrPlanGroupExecutionStatus status;

    /**
     * The status of the group execution.
     *
     * @return the value
     **/
    public DrPlanGroupExecutionStatus getStatus() {
        return status;
    }

    /**
     * Additional details about the group execution status.
     * <p>
     * Example: {@code A total of three steps failed in the group}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

    /**
     * Additional details about the group execution status.
     * <p>
     * Example: {@code A total of three steps failed in the group}
     *
     * @return the value
     **/
    public String getStatusDetails() {
        return statusDetails;
    }

    /**
     * The time at which group execution began. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2019-03-29T09:36:42Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time at which group execution began. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time at which group execution ended. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2019-03-29T09:36:42Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time at which group execution ended. An RFC3339 formatted datetime string.
     * <p>
     * Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The total duration in seconds taken to complete group execution.
     * <p>
     * Example: {@code 120}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
    private final Integer executionDurationInSec;

    /**
     * The total duration in seconds taken to complete group execution.
     * <p>
     * Example: {@code 120}
     *
     * @return the value
     **/
    public Integer getExecutionDurationInSec() {
        return executionDurationInSec;
    }

    /**
     * A list of details of each step executed in this group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepExecutions")
    private final java.util.List<DrPlanStepExecution> stepExecutions;

    /**
     * A list of details of each step executed in this group.
     *
     * @return the value
     **/
    public java.util.List<DrPlanStepExecution> getStepExecutions() {
        return stepExecutions;
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
        sb.append("DrPlanGroupExecution(");
        sb.append("super=").append(super.toString());
        sb.append("groupId=").append(String.valueOf(this.groupId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", executionDurationInSec=").append(String.valueOf(this.executionDurationInSec));
        sb.append(", stepExecutions=").append(String.valueOf(this.stepExecutions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanGroupExecution)) {
            return false;
        }

        DrPlanGroupExecution other = (DrPlanGroupExecution) o;
        return java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(
                        this.executionDurationInSec, other.executionDurationInSec)
                && java.util.Objects.equals(this.stepExecutions, other.stepExecutions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result =
                (result * PRIME)
                        + (this.stepExecutions == null ? 43 : this.stepExecutions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
