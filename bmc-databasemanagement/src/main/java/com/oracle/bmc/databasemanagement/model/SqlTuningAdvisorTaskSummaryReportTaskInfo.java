/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * SQL Tuning advisor task general info.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryReportTaskInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReportTaskInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private SqlTuningTaskStatusTypes status;

        public Builder status(SqlTuningTaskStatusTypes status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runningTime")
        private Integer runningTime;

        public Builder runningTime(Integer runningTime) {
            this.runningTime = runningTime;
            this.__explicitlySet__.add("runningTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportTaskInfo build() {
            SqlTuningAdvisorTaskSummaryReportTaskInfo __instance__ =
                    new SqlTuningAdvisorTaskSummaryReportTaskInfo(
                            id,
                            name,
                            description,
                            owner,
                            status,
                            timeStarted,
                            timeEnded,
                            runningTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportTaskInfo o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .owner(o.getOwner())
                            .status(o.getStatus())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .runningTime(o.getRunningTime());

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
     * The SQL Tuning Advisor task id. It is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    Long id;

    /**
     * The SQL Tuning Advisor task name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The SQL Tuning Advisor task description. Not defined on Auto SQL Tuning tasks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The SQL Tuning Advisor task user owner.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    String owner;

    /**
     * The SQL Tuning Advisor task status. Not defined on Auto SQL Tuning tasks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    SqlTuningTaskStatusTypes status;

    /**
     * Start timestamp of task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * End timestamp of task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    /**
     * The total running time in seconds. Not defined on Auto SQL Tuning tasks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runningTime")
    Integer runningTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
