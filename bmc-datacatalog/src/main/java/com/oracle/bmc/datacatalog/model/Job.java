/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Job.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Job extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "catalogId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "jobType",
        "scheduleCronExpression",
        "timeScheduleBegin",
        "timeScheduleEnd",
        "scheduleType",
        "connectionKey",
        "jobDefinitionKey",
        "internalVersion",
        "executionCount",
        "timeOfLatestExecution",
        "createdById",
        "updatedById",
        "jobDefinitionName",
        "dataAssetKey",
        "glossaryKey",
        "errorCode",
        "errorMessage",
        "uri"
    })
    public Job(
            String key,
            String displayName,
            String description,
            String catalogId,
            JobLifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            JobType jobType,
            String scheduleCronExpression,
            java.util.Date timeScheduleBegin,
            java.util.Date timeScheduleEnd,
            JobScheduleType scheduleType,
            String connectionKey,
            String jobDefinitionKey,
            String internalVersion,
            Integer executionCount,
            java.util.Date timeOfLatestExecution,
            String createdById,
            String updatedById,
            String jobDefinitionName,
            String dataAssetKey,
            String glossaryKey,
            String errorCode,
            String errorMessage,
            String uri) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogId = catalogId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.jobType = jobType;
        this.scheduleCronExpression = scheduleCronExpression;
        this.timeScheduleBegin = timeScheduleBegin;
        this.timeScheduleEnd = timeScheduleEnd;
        this.scheduleType = scheduleType;
        this.connectionKey = connectionKey;
        this.jobDefinitionKey = jobDefinitionKey;
        this.internalVersion = internalVersion;
        this.executionCount = executionCount;
        this.timeOfLatestExecution = timeOfLatestExecution;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.jobDefinitionName = jobDefinitionName;
        this.dataAssetKey = dataAssetKey;
        this.glossaryKey = glossaryKey;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the job resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job resource.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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
         * Lifecycle state for job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobLifecycleState lifecycleState;

        /**
         * Lifecycle state for job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(JobLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
        private String scheduleCronExpression;

        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
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
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
        private java.util.Date timeScheduleEnd;

        /**
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleEnd the value to set
         * @return this builder
         **/
        public Builder timeScheduleEnd(java.util.Date timeScheduleEnd) {
            this.timeScheduleEnd = timeScheduleEnd;
            this.__explicitlySet__.add("timeScheduleEnd");
            return this;
        }
        /**
         * Type of job schedule that is inferred from the scheduling properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private JobScheduleType scheduleType;

        /**
         * Type of job schedule that is inferred from the scheduling properties.
         * @param scheduleType the value to set
         * @return this builder
         **/
        public Builder scheduleType(JobScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * The key of the connection used by the job. This connection will override the default connection specified in
         * the associated job definition. All executions will use this connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * The key of the connection used by the job. This connection will override the default connection specified in
         * the associated job definition. All executions will use this connection.
         *
         * @param connectionKey the value to set
         * @return this builder
         **/
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
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
         * Internal version of the job resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
        private String internalVersion;

        /**
         * Internal version of the job resource.
         * @param internalVersion the value to set
         * @return this builder
         **/
        public Builder internalVersion(String internalVersion) {
            this.internalVersion = internalVersion;
            this.__explicitlySet__.add("internalVersion");
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
         * The date and time of the most recent execution for this Job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
        private java.util.Date timeOfLatestExecution;

        /**
         * The date and time of the most recent execution for this Job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * Unique key of the glossary to which this job applies.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique key of the glossary to which this job applies.
         * @param glossaryKey the value to set
         * @return this builder
         **/
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Job build() {
            Job model =
                    new Job(
                            this.key,
                            this.displayName,
                            this.description,
                            this.catalogId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.jobType,
                            this.scheduleCronExpression,
                            this.timeScheduleBegin,
                            this.timeScheduleEnd,
                            this.scheduleType,
                            this.connectionKey,
                            this.jobDefinitionKey,
                            this.internalVersion,
                            this.executionCount,
                            this.timeOfLatestExecution,
                            this.createdById,
                            this.updatedById,
                            this.jobDefinitionName,
                            this.dataAssetKey,
                            this.glossaryKey,
                            this.errorCode,
                            this.errorMessage,
                            this.uri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Job model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("scheduleCronExpression")) {
                this.scheduleCronExpression(model.getScheduleCronExpression());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleBegin")) {
                this.timeScheduleBegin(model.getTimeScheduleBegin());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleEnd")) {
                this.timeScheduleEnd(model.getTimeScheduleEnd());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
            }
            if (model.wasPropertyExplicitlySet("jobDefinitionKey")) {
                this.jobDefinitionKey(model.getJobDefinitionKey());
            }
            if (model.wasPropertyExplicitlySet("internalVersion")) {
                this.internalVersion(model.getInternalVersion());
            }
            if (model.wasPropertyExplicitlySet("executionCount")) {
                this.executionCount(model.getExecutionCount());
            }
            if (model.wasPropertyExplicitlySet("timeOfLatestExecution")) {
                this.timeOfLatestExecution(model.getTimeOfLatestExecution());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("jobDefinitionName")) {
                this.jobDefinitionName(model.getJobDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
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
     * Unique key of the job resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job resource.
     * @return the value
     **/
    public String getKey() {
        return key;
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
     * Lifecycle state for job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobLifecycleState lifecycleState;

    /**
     * Lifecycle state for job.
     * @return the value
     **/
    public JobLifecycleState getLifecycleState() {
        return lifecycleState;
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
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
    private final String scheduleCronExpression;

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
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
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
    private final java.util.Date timeScheduleEnd;

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduleEnd() {
        return timeScheduleEnd;
    }

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final JobScheduleType scheduleType;

    /**
     * Type of job schedule that is inferred from the scheduling properties.
     * @return the value
     **/
    public JobScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * The key of the connection used by the job. This connection will override the default connection specified in
     * the associated job definition. All executions will use this connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * The key of the connection used by the job. This connection will override the default connection specified in
     * the associated job definition. All executions will use this connection.
     *
     * @return the value
     **/
    public String getConnectionKey() {
        return connectionKey;
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
     * Internal version of the job resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
    private final String internalVersion;

    /**
     * Internal version of the job resource.
     * @return the value
     **/
    public String getInternalVersion() {
        return internalVersion;
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
     * The date and time of the most recent execution for this Job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLatestExecution")
    private final java.util.Date timeOfLatestExecution;

    /**
     * The date and time of the most recent execution for this Job, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeOfLatestExecution() {
        return timeOfLatestExecution;
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
     * Unique key of the glossary to which this job applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique key of the glossary to which this job applies.
     * @return the value
     **/
    public String getGlossaryKey() {
        return glossaryKey;
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
        sb.append("Job(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", scheduleCronExpression=").append(String.valueOf(this.scheduleCronExpression));
        sb.append(", timeScheduleBegin=").append(String.valueOf(this.timeScheduleBegin));
        sb.append(", timeScheduleEnd=").append(String.valueOf(this.timeScheduleEnd));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(", jobDefinitionKey=").append(String.valueOf(this.jobDefinitionKey));
        sb.append(", internalVersion=").append(String.valueOf(this.internalVersion));
        sb.append(", executionCount=").append(String.valueOf(this.executionCount));
        sb.append(", timeOfLatestExecution=").append(String.valueOf(this.timeOfLatestExecution));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", jobDefinitionName=").append(String.valueOf(this.jobDefinitionName));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(
                        this.scheduleCronExpression, other.scheduleCronExpression)
                && java.util.Objects.equals(this.timeScheduleBegin, other.timeScheduleBegin)
                && java.util.Objects.equals(this.timeScheduleEnd, other.timeScheduleEnd)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.jobDefinitionKey, other.jobDefinitionKey)
                && java.util.Objects.equals(this.internalVersion, other.internalVersion)
                && java.util.Objects.equals(this.executionCount, other.executionCount)
                && java.util.Objects.equals(this.timeOfLatestExecution, other.timeOfLatestExecution)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.jobDefinitionName, other.jobDefinitionName)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.uri, other.uri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
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
                        + (this.timeScheduleEnd == null ? 43 : this.timeScheduleEnd.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionKey == null ? 43 : this.jobDefinitionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.internalVersion == null ? 43 : this.internalVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.executionCount == null ? 43 : this.executionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLatestExecution == null
                                ? 43
                                : this.timeOfLatestExecution.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionName == null ? 43 : this.jobDefinitionName.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
