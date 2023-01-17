/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A job execution is a unit of work being executed on behalf of a job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobExecution extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "jobKey",
        "jobType",
        "subType",
        "parentKey",
        "scheduleInstanceKey",
        "lifecycleState",
        "timeCreated",
        "timeStarted",
        "timeEnded",
        "errorCode",
        "errorMessage",
        "processKey",
        "externalUrl",
        "eventKey",
        "dataEntityKey",
        "createdById",
        "updatedBy",
        "uri",
        "properties"
    })
    public JobExecution(
            String key,
            String jobKey,
            JobType jobType,
            String subType,
            String parentKey,
            String scheduleInstanceKey,
            JobExecutionState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String errorCode,
            String errorMessage,
            String processKey,
            String externalUrl,
            String eventKey,
            String dataEntityKey,
            String createdById,
            String updatedBy,
            String uri,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.jobKey = jobKey;
        this.jobType = jobType;
        this.subType = subType;
        this.parentKey = parentKey;
        this.scheduleInstanceKey = scheduleInstanceKey;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.processKey = processKey;
        this.externalUrl = externalUrl;
        this.eventKey = eventKey;
        this.dataEntityKey = dataEntityKey;
        this.createdById = createdById;
        this.updatedBy = updatedBy;
        this.uri = uri;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the job execution resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job execution resource.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The unique key of the parent job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
        private String jobKey;

        /**
         * The unique key of the parent job.
         * @param jobKey the value to set
         * @return this builder
         **/
        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            this.__explicitlySet__.add("jobKey");
            return this;
        }
        /**
         * Type of the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        /**
         * Type of the job execution.
         * @param jobType the value to set
         * @return this builder
         **/
        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }
        /**
         * Sub-type of this job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subType")
        private String subType;

        /**
         * Sub-type of this job execution.
         * @param subType the value to set
         * @return this builder
         **/
        public Builder subType(String subType) {
            this.subType = subType;
            this.__explicitlySet__.add("subType");
            return this;
        }
        /**
         * The unique key of the parent execution or null if this job execution has no parent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        /**
         * The unique key of the parent execution or null if this job execution has no parent.
         * @param parentKey the value to set
         * @return this builder
         **/
        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }
        /**
         * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
        private String scheduleInstanceKey;

        /**
         * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
         * @param scheduleInstanceKey the value to set
         * @return this builder
         **/
        public Builder scheduleInstanceKey(String scheduleInstanceKey) {
            this.scheduleInstanceKey = scheduleInstanceKey;
            this.__explicitlySet__.add("scheduleInstanceKey");
            return this;
        }
        /**
         * Status of the job execution, such as running, paused, or completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobExecutionState lifecycleState;

        /**
         * Status of the job execution, such as running, paused, or completed.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(JobExecutionState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the job execution was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job execution was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Time that the job execution ended or null if it hasn't yet completed.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * Time that the job execution ended or null if it hasn't yet completed.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
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
         * Error code returned from the job execution or null if job is still running or didn't return an error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private String errorCode;

        /**
         * Error code returned from the job execution or null if job is still running or didn't return an error.
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
         * Error message returned from the job execution or null if job is still running or didn't return an error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message returned from the job execution or null if job is still running or didn't return an error.
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
         * Process identifier related to the job execution if the job is an external job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("processKey")
        private String processKey;

        /**
         * Process identifier related to the job execution if the job is an external job.
         * @param processKey the value to set
         * @return this builder
         **/
        public Builder processKey(String processKey) {
            this.processKey = processKey;
            this.__explicitlySet__.add("processKey");
            return this;
        }
        /**
         * If the job is an external process, then a URL of the job for accessing this resource and its status.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalUrl")
        private String externalUrl;

        /**
         * If the job is an external process, then a URL of the job for accessing this resource and its status.
         *
         * @param externalUrl the value to set
         * @return this builder
         **/
        public Builder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            this.__explicitlySet__.add("externalUrl");
            return this;
        }
        /**
         * An identifier used for log message correlation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eventKey")
        private String eventKey;

        /**
         * An identifier used for log message correlation.
         *
         * @param eventKey the value to set
         * @return this builder
         **/
        public Builder eventKey(String eventKey) {
            this.eventKey = eventKey;
            this.__explicitlySet__.add("eventKey");
            return this;
        }
        /**
         * The key of the associated data entity resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataEntityKey")
        private String dataEntityKey;

        /**
         * The key of the associated data entity resource.
         * @param dataEntityKey the value to set
         * @return this builder
         **/
        public Builder dataEntityKey(String dataEntityKey) {
            this.dataEntityKey = dataEntityKey;
            this.__explicitlySet__.add("dataEntityKey");
            return this;
        }
        /**
         * OCID of the user who created the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the job execution.
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * OCID of the user who updated the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * OCID of the user who updated the job execution.
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /**
         * URI to the job execution instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job execution instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * A map of maps that contains the execution context properties which are specific to a job execution. Each job
         * execution may define it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * job executions have required properties within the "default" category.
         * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the execution context properties which are specific to a job execution. Each job
         * execution may define it's set of required and optional properties. The map keys are category names and the
         * values are maps of property name to property value. Every property is contained inside of a category. Most
         * job executions have required properties within the "default" category.
         * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
         *
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecution build() {
            JobExecution model =
                    new JobExecution(
                            this.key,
                            this.jobKey,
                            this.jobType,
                            this.subType,
                            this.parentKey,
                            this.scheduleInstanceKey,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeEnded,
                            this.errorCode,
                            this.errorMessage,
                            this.processKey,
                            this.externalUrl,
                            this.eventKey,
                            this.dataEntityKey,
                            this.createdById,
                            this.updatedBy,
                            this.uri,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecution model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("jobKey")) {
                this.jobKey(model.getJobKey());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("subType")) {
                this.subType(model.getSubType());
            }
            if (model.wasPropertyExplicitlySet("parentKey")) {
                this.parentKey(model.getParentKey());
            }
            if (model.wasPropertyExplicitlySet("scheduleInstanceKey")) {
                this.scheduleInstanceKey(model.getScheduleInstanceKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("processKey")) {
                this.processKey(model.getProcessKey());
            }
            if (model.wasPropertyExplicitlySet("externalUrl")) {
                this.externalUrl(model.getExternalUrl());
            }
            if (model.wasPropertyExplicitlySet("eventKey")) {
                this.eventKey(model.getEventKey());
            }
            if (model.wasPropertyExplicitlySet("dataEntityKey")) {
                this.dataEntityKey(model.getDataEntityKey());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * Unique key of the job execution resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job execution resource.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The unique key of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    private final String jobKey;

    /**
     * The unique key of the parent job.
     * @return the value
     **/
    public String getJobKey() {
        return jobKey;
    }

    /**
     * Type of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    /**
     * Type of the job execution.
     * @return the value
     **/
    public JobType getJobType() {
        return jobType;
    }

    /**
     * Sub-type of this job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    private final String subType;

    /**
     * Sub-type of this job execution.
     * @return the value
     **/
    public String getSubType() {
        return subType;
    }

    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     * @return the value
     **/
    public String getParentKey() {
        return parentKey;
    }

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
    private final String scheduleInstanceKey;

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
     * @return the value
     **/
    public String getScheduleInstanceKey() {
        return scheduleInstanceKey;
    }

    /**
     * Status of the job execution, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobExecutionState lifecycleState;

    /**
     * Status of the job execution, such as running, paused, or completed.
     * @return the value
     **/
    public JobExecutionState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the job execution was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job execution was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Time that the job execution ended or null if it hasn't yet completed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * Time that the job execution ended or null if it hasn't yet completed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Error code returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    /**
     * Error code returned from the job execution or null if job is still running or didn't return an error.
     *
     * @return the value
     **/
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Error message returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message returned from the job execution or null if job is still running or didn't return an error.
     *
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Process identifier related to the job execution if the job is an external job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processKey")
    private final String processKey;

    /**
     * Process identifier related to the job execution if the job is an external job.
     * @return the value
     **/
    public String getProcessKey() {
        return processKey;
    }

    /**
     * If the job is an external process, then a URL of the job for accessing this resource and its status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalUrl")
    private final String externalUrl;

    /**
     * If the job is an external process, then a URL of the job for accessing this resource and its status.
     *
     * @return the value
     **/
    public String getExternalUrl() {
        return externalUrl;
    }

    /**
     * An identifier used for log message correlation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventKey")
    private final String eventKey;

    /**
     * An identifier used for log message correlation.
     *
     * @return the value
     **/
    public String getEventKey() {
        return eventKey;
    }

    /**
     * The key of the associated data entity resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEntityKey")
    private final String dataEntityKey;

    /**
     * The key of the associated data entity resource.
     * @return the value
     **/
    public String getDataEntityKey() {
        return dataEntityKey;
    }

    /**
     * OCID of the user who created the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the job execution.
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who updated the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * OCID of the user who updated the job execution.
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * URI to the job execution instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job execution instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * A map of maps that contains the execution context properties which are specific to a job execution. Each job
     * execution may define it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * job executions have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the execution context properties which are specific to a job execution. Each job
     * execution may define it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * job executions have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("JobExecution(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", subType=").append(String.valueOf(this.subType));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", scheduleInstanceKey=").append(String.valueOf(this.scheduleInstanceKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", processKey=").append(String.valueOf(this.processKey));
        sb.append(", externalUrl=").append(String.valueOf(this.externalUrl));
        sb.append(", eventKey=").append(String.valueOf(this.eventKey));
        sb.append(", dataEntityKey=").append(String.valueOf(this.dataEntityKey));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecution)) {
            return false;
        }

        JobExecution other = (JobExecution) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.jobKey, other.jobKey)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.scheduleInstanceKey, other.scheduleInstanceKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.processKey, other.processKey)
                && java.util.Objects.equals(this.externalUrl, other.externalUrl)
                && java.util.Objects.equals(this.eventKey, other.eventKey)
                && java.util.Objects.equals(this.dataEntityKey, other.dataEntityKey)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleInstanceKey == null
                                ? 43
                                : this.scheduleInstanceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.processKey == null ? 43 : this.processKey.hashCode());
        result = (result * PRIME) + (this.externalUrl == null ? 43 : this.externalUrl.hashCode());
        result = (result * PRIME) + (this.eventKey == null ? 43 : this.eventKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEntityKey == null ? 43 : this.dataEntityKey.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
