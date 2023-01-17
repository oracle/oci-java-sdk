/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "uri",
        "displayName",
        "catalogId",
        "jobDefinitionKey",
        "lifecycleState",
        "jobType",
        "scheduleType",
        "description",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "scheduleCronExpression",
        "timeScheduleBegin",
        "executionCount",
        "timeOfLatestExecution",
        "jobDefinitionName",
        "dataAssetKey",
        "errorCode",
        "errorMessage",
        "executions"
    })
    public JobSummary(
            String key,
            String uri,
            String displayName,
            String catalogId,
            String jobDefinitionKey,
            JobLifecycleState lifecycleState,
            JobType jobType,
            String scheduleType,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String scheduleCronExpression,
            java.util.Date timeScheduleBegin,
            Integer executionCount,
            java.util.Date timeOfLatestExecution,
            String jobDefinitionName,
            String dataAssetKey,
            String errorCode,
            String errorMessage,
            java.util.List<JobExecutionSummary> executions) {
        super();
        this.key = key;
        this.uri = uri;
        this.displayName = displayName;
        this.catalogId = catalogId;
        this.jobDefinitionKey = jobDefinitionKey;
        this.lifecycleState = lifecycleState;
        this.jobType = jobType;
        this.scheduleType = scheduleType;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.scheduleCronExpression = scheduleCronExpression;
        this.timeScheduleBegin = timeScheduleBegin;
        this.executionCount = executionCount;
        this.timeOfLatestExecution = timeOfLatestExecution;
        this.jobDefinitionName = jobDefinitionName;
        this.dataAssetKey = dataAssetKey;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.executions = executions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * URI to the job instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * The data catalog's OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         * @param catalogId the value to set
         * @return this builder
         **/
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /**
         * The unique key of the job definition resource that defined the scope of this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
        private String jobDefinitionKey;

        /**
         * The unique key of the job definition resource that defined the scope of this job.
         * @param jobDefinitionKey the value to set
         * @return this builder
         **/
        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            this.__explicitlySet__.add("jobDefinitionKey");
            return this;
        }
        /**
         * Lifecycle state of the job, such as running, paused, or completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobLifecycleState lifecycleState;

        /**
         * Lifecycle state of the job, such as running, paused, or completed.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(JobLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Type of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        /**
         * Type of the job.
         * @param jobType the value to set
         * @return this builder
         **/
        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }
        /**
         * Type of job schedule that is inferred from the scheduling properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private String scheduleType;

        /**
         * Type of job schedule that is inferred from the scheduling properties.
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * Detailed description of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the job.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time the job was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time that this job was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time that this job was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * OCID of the user who created this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created this job.
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * OCID of the user who updated this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who updated this job.
         * @param updatedById the value to set
         * @return this builder
         **/
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
        private String scheduleCronExpression;

        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         *
         * @param scheduleCronExpression the value to set
         * @return this builder
         **/
        public Builder scheduleCronExpression(String scheduleCronExpression) {
            this.scheduleCronExpression = scheduleCronExpression;
            this.__explicitlySet__.add("scheduleCronExpression");
            return this;
        }
        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
        private java.util.Date timeScheduleBegin;

        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleBegin the value to set
         * @return this builder
         **/
        public Builder timeScheduleBegin(java.util.Date timeScheduleBegin) {
            this.timeScheduleBegin = timeScheduleBegin;
            this.__explicitlySet__.add("timeScheduleBegin");
            return this;
        }
        /**
         * The total number of executions for this job schedule.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionCount")
        private Integer executionCount;

        /**
         * The total number of executions for this job schedule.
         *
         * @param executionCount the value to set
         * @return this builder
         **/
        public Builder executionCount(Integer executionCount) {
            this.executionCount = executionCount;
            this.__explicitlySet__.add("executionCount");
            return this;
        }
        /**
         * The date and time of the most recent execution for this job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
        private java.util.Date timeOfLatestExecution;

        /**
         * The date and time of the most recent execution for this job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeOfLatestExecution the value to set
         * @return this builder
         **/
        public Builder timeOfLatestExecution(java.util.Date timeOfLatestExecution) {
            this.timeOfLatestExecution = timeOfLatestExecution;
            this.__explicitlySet__.add("timeOfLatestExecution");
            return this;
        }
        /**
         * The display name of the job definition resource that defined the scope of this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
        private String jobDefinitionName;

        /**
         * The display name of the job definition resource that defined the scope of this job.
         * @param jobDefinitionName the value to set
         * @return this builder
         **/
        public Builder jobDefinitionName(String jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            this.__explicitlySet__.add("jobDefinitionName");
            return this;
        }
        /**
         * Unique key of the data asset to which this job applies, if the job involves a data asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * Unique key of the data asset to which this job applies, if the job involves a data asset.
         * @param dataAssetKey the value to set
         * @return this builder
         **/
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /**
         * Error code returned from the latest job execution for this job. Useful when the latest Job execution is in FAILED state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        /**
         * Error code returned from the latest job execution for this job. Useful when the latest Job execution is in FAILED state.
         *
         * @param errorCode the value to set
         * @return this builder
         **/
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /**
         * Error message returned from the latest job execution for this job. Useful when the latest Job Execution is in a FAILED state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message returned from the latest job execution for this job. Useful when the latest Job Execution is in a FAILED state.
         *
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * Array of the executions summary associated with this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executions")
        private java.util.List<JobExecutionSummary> executions;

        /**
         * Array of the executions summary associated with this job.
         * @param executions the value to set
         * @return this builder
         **/
        public Builder executions(java.util.List<JobExecutionSummary> executions) {
            this.executions = executions;
            this.__explicitlySet__.add("executions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobSummary build() {
            JobSummary model =
                    new JobSummary(
                            this.key,
                            this.uri,
                            this.displayName,
                            this.catalogId,
                            this.jobDefinitionKey,
                            this.lifecycleState,
                            this.jobType,
                            this.scheduleType,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.scheduleCronExpression,
                            this.timeScheduleBegin,
                            this.executionCount,
                            this.timeOfLatestExecution,
                            this.jobDefinitionName,
                            this.dataAssetKey,
                            this.errorCode,
                            this.errorMessage,
                            this.executions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("jobDefinitionKey")) {
                this.jobDefinitionKey(model.getJobDefinitionKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("scheduleCronExpression")) {
                this.scheduleCronExpression(model.getScheduleCronExpression());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleBegin")) {
                this.timeScheduleBegin(model.getTimeScheduleBegin());
            }
            if (model.wasPropertyExplicitlySet("executionCount")) {
                this.executionCount(model.getExecutionCount());
            }
            if (model.wasPropertyExplicitlySet("timeOfLatestExecution")) {
                this.timeOfLatestExecution(model.getTimeOfLatestExecution());
            }
            if (model.wasPropertyExplicitlySet("jobDefinitionName")) {
                this.jobDefinitionName(model.getJobDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("executions")) {
                this.executions(model.getExecutions());
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
     * Unique key of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * URI to the job instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     * @return the value
     **/
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * The unique key of the job definition resource that defined the scope of this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
    private final String jobDefinitionKey;

    /**
     * The unique key of the job definition resource that defined the scope of this job.
     * @return the value
     **/
    public String getJobDefinitionKey() {
        return jobDefinitionKey;
    }

    /**
     * Lifecycle state of the job, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobLifecycleState lifecycleState;

    /**
     * Lifecycle state of the job, such as running, paused, or completed.
     * @return the value
     **/
    public JobLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Type of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    /**
     * Type of the job.
     * @return the value
     **/
    public JobType getJobType() {
        return jobType;
    }

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final String scheduleType;

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     * @return the value
     **/
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Detailed description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The date and time the job was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time that this job was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time that this job was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * OCID of the user who created this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created this job.
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who updated this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who updated this job.
     * @return the value
     **/
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
    private final String scheduleCronExpression;

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     *
     * @return the value
     **/
    public String getScheduleCronExpression() {
        return scheduleCronExpression;
    }

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
    private final java.util.Date timeScheduleBegin;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduleBegin() {
        return timeScheduleBegin;
    }

    /**
     * The total number of executions for this job schedule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionCount")
    private final Integer executionCount;

    /**
     * The total number of executions for this job schedule.
     *
     * @return the value
     **/
    public Integer getExecutionCount() {
        return executionCount;
    }

    /**
     * The date and time of the most recent execution for this job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
    private final java.util.Date timeOfLatestExecution;

    /**
     * The date and time of the most recent execution for this job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeOfLatestExecution() {
        return timeOfLatestExecution;
    }

    /**
     * The display name of the job definition resource that defined the scope of this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
    private final String jobDefinitionName;

    /**
     * The display name of the job definition resource that defined the scope of this job.
     * @return the value
     **/
    public String getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Unique key of the data asset to which this job applies, if the job involves a data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * Unique key of the data asset to which this job applies, if the job involves a data asset.
     * @return the value
     **/
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /**
     * Error code returned from the latest job execution for this job. Useful when the latest Job execution is in FAILED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    /**
     * Error code returned from the latest job execution for this job. Useful when the latest Job execution is in FAILED state.
     *
     * @return the value
     **/
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Error message returned from the latest job execution for this job. Useful when the latest Job Execution is in a FAILED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message returned from the latest job execution for this job. Useful when the latest Job Execution is in a FAILED state.
     *
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Array of the executions summary associated with this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executions")
    private final java.util.List<JobExecutionSummary> executions;

    /**
     * Array of the executions summary associated with this job.
     * @return the value
     **/
    public java.util.List<JobExecutionSummary> getExecutions() {
        return executions;
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
        sb.append("JobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", jobDefinitionKey=").append(String.valueOf(this.jobDefinitionKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", scheduleCronExpression=").append(String.valueOf(this.scheduleCronExpression));
        sb.append(", timeScheduleBegin=").append(String.valueOf(this.timeScheduleBegin));
        sb.append(", executionCount=").append(String.valueOf(this.executionCount));
        sb.append(", timeOfLatestExecution=").append(String.valueOf(this.timeOfLatestExecution));
        sb.append(", jobDefinitionName=").append(String.valueOf(this.jobDefinitionName));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", executions=").append(String.valueOf(this.executions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobSummary)) {
            return false;
        }

        JobSummary other = (JobSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.jobDefinitionKey, other.jobDefinitionKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(
                        this.scheduleCronExpression, other.scheduleCronExpression)
                && java.util.Objects.equals(this.timeScheduleBegin, other.timeScheduleBegin)
                && java.util.Objects.equals(this.executionCount, other.executionCount)
                && java.util.Objects.equals(this.timeOfLatestExecution, other.timeOfLatestExecution)
                && java.util.Objects.equals(this.jobDefinitionName, other.jobDefinitionName)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.executions, other.executions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionKey == null ? 43 : this.jobDefinitionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleCronExpression == null
                                ? 43
                                : this.scheduleCronExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleBegin == null ? 43 : this.timeScheduleBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.executionCount == null ? 43 : this.executionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLatestExecution == null
                                ? 43
                                : this.timeOfLatestExecution.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionName == null ? 43 : this.jobDefinitionName.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.executions == null ? 43 : this.executions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
