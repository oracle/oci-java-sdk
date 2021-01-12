/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a job. Jobs are scheduled instances of a job definition.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Job.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Job {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobLifecycleState lifecycleState;

        public Builder lifecycleState(JobLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
        private java.util.Date timeScheduleEnd;

        public Builder timeScheduleEnd(java.util.Date timeScheduleEnd) {
            this.timeScheduleEnd = timeScheduleEnd;
            this.__explicitlySet__.add("timeScheduleEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private JobScheduleType scheduleType;

        public Builder scheduleType(JobScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
        private String jobDefinitionKey;

        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            this.__explicitlySet__.add("jobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
        private String internalVersion;

        public Builder internalVersion(String internalVersion) {
            this.internalVersion = internalVersion;
            this.__explicitlySet__.add("internalVersion");
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

        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
        private String jobDefinitionName;

        public Builder jobDefinitionName(String jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            this.__explicitlySet__.add("jobDefinitionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Job build() {
            Job __instance__ =
                    new Job(
                            key,
                            displayName,
                            description,
                            catalogId,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            jobType,
                            scheduleCronExpression,
                            timeScheduleBegin,
                            timeScheduleEnd,
                            scheduleType,
                            connectionKey,
                            jobDefinitionKey,
                            internalVersion,
                            executionCount,
                            timeOfLatestExecution,
                            createdById,
                            updatedById,
                            jobDefinitionName,
                            errorCode,
                            errorMessage,
                            uri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .catalogId(o.getCatalogId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .jobType(o.getJobType())
                            .scheduleCronExpression(o.getScheduleCronExpression())
                            .timeScheduleBegin(o.getTimeScheduleBegin())
                            .timeScheduleEnd(o.getTimeScheduleEnd())
                            .scheduleType(o.getScheduleType())
                            .connectionKey(o.getConnectionKey())
                            .jobDefinitionKey(o.getJobDefinitionKey())
                            .internalVersion(o.getInternalVersion())
                            .executionCount(o.getExecutionCount())
                            .timeOfLatestExecution(o.getTimeOfLatestExecution())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .jobDefinitionName(o.getJobDefinitionName())
                            .errorCode(o.getErrorCode())
                            .errorMessage(o.getErrorMessage())
                            .uri(o.getUri());

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
     * Unique key of the job resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    String catalogId;

    /**
     * Lifecycle state for job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    JobLifecycleState lifecycleState;

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
     * Type of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    JobType jobType;

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
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
    java.util.Date timeScheduleEnd;

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    JobScheduleType scheduleType;

    /**
     * The key of the connection used by the job. This connection will override the default connection specified in
     * the associated job definition. All executions will use this connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    String connectionKey;

    /**
     * The unique key of the job definition resource that defined the scope of this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
    String jobDefinitionKey;

    /**
     * Internal version of the job resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
    String internalVersion;

    /**
     * The total number of executions for this job schedule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionCount")
    Integer executionCount;

    /**
     * The date and time of the most recent execution for this Job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
    java.util.Date timeOfLatestExecution;

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
     * The display name of the job definition resource that defined the scope of this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
    String jobDefinitionName;

    /**
     * Error code returned from the latest job execution for this job. Useful when the latest Job execution is in FAILED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    String errorCode;

    /**
     * Error message returned from the latest job execution for this job. Useful when the latest Job Execution is in a FAILED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * URI to the job instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
