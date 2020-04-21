/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a job. Jobs are scheduled instances of a job definition.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class JobSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
        private String jobDefinitionKey;

        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            this.__explicitlySet__.add("jobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobLifecycleState lifecycleState;

        public Builder lifecycleState(JobLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private String scheduleType;

        public Builder scheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
        private String scheduleCronExpression;

        public Builder scheduleCronExpression(String scheduleCronExpression) {
            this.scheduleCronExpression = scheduleCronExpression;
            this.__explicitlySet__.add("scheduleCronExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
        private java.util.Date timeScheduleBegin;

        public Builder timeScheduleBegin(java.util.Date timeScheduleBegin) {
            this.timeScheduleBegin = timeScheduleBegin;
            this.__explicitlySet__.add("timeScheduleBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionCount")
        private Integer executionCount;

        public Builder executionCount(Integer executionCount) {
            this.executionCount = executionCount;
            this.__explicitlySet__.add("executionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
        private java.util.Date timeOfLatestExecution;

        public Builder timeOfLatestExecution(java.util.Date timeOfLatestExecution) {
            this.timeOfLatestExecution = timeOfLatestExecution;
            this.__explicitlySet__.add("timeOfLatestExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private java.util.List<JobExecutionSummary> executions;

        public Builder executions(java.util.List<JobExecutionSummary> executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobSummary build() {
            JobSummary __instance__ =
                    new JobSummary(
                            key,
                            uri,
                            displayName,
                            catalogId,
                            jobDefinitionKey,
                            lifecycleState,
                            jobType,
                            scheduleType,
                            description,
                            timeCreated,
                            timeUpdated,
                            createdById,
                            updatedById,
                            scheduleCronExpression,
                            timeScheduleBegin,
                            executionCount,
                            timeOfLatestExecution,
                            executions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .uri(o.getUri())
                            .displayName(o.getDisplayName())
                            .catalogId(o.getCatalogId())
                            .jobDefinitionKey(o.getJobDefinitionKey())
                            .lifecycleState(o.getLifecycleState())
                            .jobType(o.getJobType())
                            .scheduleType(o.getScheduleType())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .scheduleCronExpression(o.getScheduleCronExpression())
                            .timeScheduleBegin(o.getTimeScheduleBegin())
                            .executionCount(o.getExecutionCount())
                            .timeOfLatestExecution(o.getTimeOfLatestExecution())
                            .executions(o.getExecutions());

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
     * Unique key of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * URI to the job instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    String catalogId;

    /**
     * The unique key of the job definition resource that defined the scope of this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
    String jobDefinitionKey;

    /**
     * Lifecycle state of the job, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    JobLifecycleState lifecycleState;

    /**
     * Type of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    JobType jobType;

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    String scheduleType;

    /**
     * Detailed description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The date and time the job was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Time that this job was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * OCID of the user who created this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    String createdById;

    /**
     * OCID of the user who updated this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    String updatedById;

    /**
     * Schedule specified in the cron expression format that has seven fields for second, minute, hour, day-of-month, month, day-of-week, year.
     * It can also include special characters like * for all and ? for any. There are also pre-defined schedules that can be specified using
     * special strings. For example, @hourly will run the job every hour.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
    String scheduleCronExpression;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
    java.util.Date timeScheduleBegin;

    /**
     * The total number of executions for this job schedule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionCount")
    Integer executionCount;

    /**
     * The date and time of the most recent execution for this job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
    java.util.Date timeOfLatestExecution;

    /**
     * Array of the executions summary associated with this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    java.util.List<JobExecutionSummary> executions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
