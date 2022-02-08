/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a SQL Tuning Advisor task.
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
    builder = SqlTuningAdvisorTaskSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
        private Long sqlTuningAdvisorTaskId;

        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private Integer instanceId;

        public Builder instanceId(Integer instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
        private SqlTuningTaskStatusTypes taskStatus;

        public Builder taskStatus(SqlTuningTaskStatusTypes taskStatus) {
            this.taskStatus = taskStatus;
            this.__explicitlySet__.add("taskStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("daysToExpire")
        private Integer daysToExpire;

        public Builder daysToExpire(Integer daysToExpire) {
            this.daysToExpire = daysToExpire;
            this.__explicitlySet__.add("daysToExpire");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionStarted")
        private java.util.Date timeExecutionStarted;

        public Builder timeExecutionStarted(java.util.Date timeExecutionStarted) {
            this.timeExecutionStarted = timeExecutionStarted;
            this.__explicitlySet__.add("timeExecutionStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionEnded")
        private java.util.Date timeExecutionEnded;

        public Builder timeExecutionEnded(java.util.Date timeExecutionEnded) {
            this.timeExecutionEnded = timeExecutionEnded;
            this.__explicitlySet__.add("timeExecutionEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSqlStatements")
        private Integer totalSqlStatements;

        public Builder totalSqlStatements(Integer totalSqlStatements) {
            this.totalSqlStatements = totalSqlStatements;
            this.__explicitlySet__.add("totalSqlStatements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
        private Integer recommendationCount;

        public Builder recommendationCount(Integer recommendationCount) {
            this.recommendationCount = recommendationCount;
            this.__explicitlySet__.add("recommendationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummary build() {
            SqlTuningAdvisorTaskSummary __instance__ =
                    new SqlTuningAdvisorTaskSummary(
                            sqlTuningAdvisorTaskId,
                            instanceId,
                            name,
                            description,
                            owner,
                            timeCreated,
                            taskStatus,
                            daysToExpire,
                            timeExecutionStarted,
                            timeExecutionEnded,
                            totalSqlStatements,
                            recommendationCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummary o) {
            Builder copiedBuilder =
                    sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId())
                            .instanceId(o.getInstanceId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .owner(o.getOwner())
                            .timeCreated(o.getTimeCreated())
                            .taskStatus(o.getTaskStatus())
                            .daysToExpire(o.getDaysToExpire())
                            .timeExecutionStarted(o.getTimeExecutionStarted())
                            .timeExecutionEnded(o.getTimeExecutionEnded())
                            .totalSqlStatements(o.getTotalSqlStatements())
                            .recommendationCount(o.getRecommendationCount());

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
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    Long sqlTuningAdvisorTaskId;

    /**
     * The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    Integer instanceId;

    /**
     * The name of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The owner of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    String owner;

    /**
     * The Creation date of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The status of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
    SqlTuningTaskStatusTypes taskStatus;

    /**
     * The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysToExpire")
    Integer daysToExpire;

    /**
     * The start time of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionStarted")
    java.util.Date timeExecutionStarted;

    /**
     * The end time of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionEnded")
    java.util.Date timeExecutionEnded;

    /**
     * The total number of SQL statements related to the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqlStatements")
    Integer totalSqlStatements;

    /**
     * The number of recommendations provided for the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
    Integer recommendationCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
