/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The general information regarding the SQL Tuning Advisor task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlTuningAdvisorTaskSummaryReportTaskInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningAdvisorTaskSummaryReportTaskInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "owner",
        "status",
        "timeStarted",
        "timeEnded",
        "runningTime"
    })
    public SqlTuningAdvisorTaskSummaryReportTaskInfo(
            Long id,
            String name,
            String description,
            String owner,
            SqlTuningTaskStatusTypes status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer runningTime) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.runningTime = runningTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the SQL Tuning Advisor task. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The ID of the SQL Tuning Advisor task. This is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the SQL Tuning Advisor task. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the SQL Tuning Advisor task.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning
         * tasks.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning
         * tasks.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The owner of the SQL Tuning Advisor task. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the SQL Tuning Advisor task.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * The status of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning tasks.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private SqlTuningTaskStatusTypes status;

        /**
         * The status of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning tasks.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(SqlTuningTaskStatusTypes status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The start time of the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The start time of the task execution.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The end time of the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The end time of the task execution.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** The total running time in seconds. This is not defined for Auto SQL Tuning tasks. */
        @com.fasterxml.jackson.annotation.JsonProperty("runningTime")
        private Integer runningTime;

        /**
         * The total running time in seconds. This is not defined for Auto SQL Tuning tasks.
         *
         * @param runningTime the value to set
         * @return this builder
         */
        public Builder runningTime(Integer runningTime) {
            this.runningTime = runningTime;
            this.__explicitlySet__.add("runningTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportTaskInfo build() {
            SqlTuningAdvisorTaskSummaryReportTaskInfo model =
                    new SqlTuningAdvisorTaskSummaryReportTaskInfo(
                            this.id,
                            this.name,
                            this.description,
                            this.owner,
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.runningTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportTaskInfo model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
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
            if (model.wasPropertyExplicitlySet("runningTime")) {
                this.runningTime(model.getRunningTime());
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
     * The ID of the SQL Tuning Advisor task. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The ID of the SQL Tuning Advisor task. This is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public Long getId() {
        return id;
    }

    /** The name of the SQL Tuning Advisor task. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the SQL Tuning Advisor task.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The description of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning
     * tasks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning
     * tasks.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The owner of the SQL Tuning Advisor task. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the SQL Tuning Advisor task.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The status of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning tasks. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final SqlTuningTaskStatusTypes status;

    /**
     * The status of the SQL Tuning Advisor task. This is not defined for Auto SQL Tuning tasks.
     *
     * @return the value
     */
    public SqlTuningTaskStatusTypes getStatus() {
        return status;
    }

    /** The start time of the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The start time of the task execution.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The end time of the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The end time of the task execution.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** The total running time in seconds. This is not defined for Auto SQL Tuning tasks. */
    @com.fasterxml.jackson.annotation.JsonProperty("runningTime")
    private final Integer runningTime;

    /**
     * The total running time in seconds. This is not defined for Auto SQL Tuning tasks.
     *
     * @return the value
     */
    public Integer getRunningTime() {
        return runningTime;
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
        sb.append("SqlTuningAdvisorTaskSummaryReportTaskInfo(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", runningTime=").append(String.valueOf(this.runningTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReportTaskInfo)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReportTaskInfo other =
                (SqlTuningAdvisorTaskSummaryReportTaskInfo) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.runningTime, other.runningTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.runningTime == null ? 43 : this.runningTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
