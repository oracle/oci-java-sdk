/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties for creating a new job execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateJobExecutionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJobExecutionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subType",
        "jobType",
        "parentKey",
        "timeStarted",
        "timeEnded",
        "lifecycleState",
        "errorCode",
        "errorMessage",
        "scheduleInstanceKey",
        "processKey",
        "externalUrl",
        "eventKey",
        "dataEntityKey",
        "properties"
    })
    public CreateJobExecutionDetails(
            String subType,
            JobType jobType,
            String parentKey,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            JobExecutionState lifecycleState,
            String errorCode,
            String errorMessage,
            String scheduleInstanceKey,
            String processKey,
            String externalUrl,
            String eventKey,
            String dataEntityKey,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.subType = subType;
        this.jobType = jobType;
        this.parentKey = parentKey;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.lifecycleState = lifecycleState;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.scheduleInstanceKey = scheduleInstanceKey;
        this.processKey = processKey;
        this.externalUrl = externalUrl;
        this.eventKey = eventKey;
        this.dataEntityKey = dataEntityKey;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subType")
        private String subType;

        public Builder subType(String subType) {
            this.subType = subType;
            this.__explicitlySet__.add("subType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobExecutionState lifecycleState;

        public Builder lifecycleState(JobExecutionState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
        private String scheduleInstanceKey;

        public Builder scheduleInstanceKey(String scheduleInstanceKey) {
            this.scheduleInstanceKey = scheduleInstanceKey;
            this.__explicitlySet__.add("scheduleInstanceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processKey")
        private String processKey;

        public Builder processKey(String processKey) {
            this.processKey = processKey;
            this.__explicitlySet__.add("processKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalUrl")
        private String externalUrl;

        public Builder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            this.__explicitlySet__.add("externalUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventKey")
        private String eventKey;

        public Builder eventKey(String eventKey) {
            this.eventKey = eventKey;
            this.__explicitlySet__.add("eventKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEntityKey")
        private String dataEntityKey;

        public Builder dataEntityKey(String dataEntityKey) {
            this.dataEntityKey = dataEntityKey;
            this.__explicitlySet__.add("dataEntityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJobExecutionDetails build() {
            CreateJobExecutionDetails __instance__ =
                    new CreateJobExecutionDetails(
                            subType,
                            jobType,
                            parentKey,
                            timeStarted,
                            timeEnded,
                            lifecycleState,
                            errorCode,
                            errorMessage,
                            scheduleInstanceKey,
                            processKey,
                            externalUrl,
                            eventKey,
                            dataEntityKey,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobExecutionDetails o) {
            Builder copiedBuilder =
                    subType(o.getSubType())
                            .jobType(o.getJobType())
                            .parentKey(o.getParentKey())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .lifecycleState(o.getLifecycleState())
                            .errorCode(o.getErrorCode())
                            .errorMessage(o.getErrorMessage())
                            .scheduleInstanceKey(o.getScheduleInstanceKey())
                            .processKey(o.getProcessKey())
                            .externalUrl(o.getExternalUrl())
                            .eventKey(o.getEventKey())
                            .dataEntityKey(o.getDataEntityKey())
                            .properties(o.getProperties());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Sub-type of this job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    private final String subType;

    public String getSubType() {
        return subType;
    }

    /**
     * Type of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    public JobType getJobType() {
        return jobType;
    }

    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    public String getParentKey() {
        return parentKey;
    }

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

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

    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Status of the job execution, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobExecutionState lifecycleState;

    public JobExecutionState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Error code returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Error message returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
    private final String scheduleInstanceKey;

    public String getScheduleInstanceKey() {
        return scheduleInstanceKey;
    }

    /**
     * Process identifier related to the job execution if the job is an external job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processKey")
    private final String processKey;

    public String getProcessKey() {
        return processKey;
    }

    /**
     * If the job is an external process, then a URL of the job for accessing this resource and its status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalUrl")
    private final String externalUrl;

    public String getExternalUrl() {
        return externalUrl;
    }

    /**
     * An identifier used for log message correlation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventKey")
    private final String eventKey;

    public String getEventKey() {
        return eventKey;
    }

    /**
     * The key of the associated data entity resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEntityKey")
    private final String dataEntityKey;

    public String getDataEntityKey() {
        return dataEntityKey;
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

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateJobExecutionDetails(");
        sb.append("subType=").append(String.valueOf(this.subType));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", scheduleInstanceKey=").append(String.valueOf(this.scheduleInstanceKey));
        sb.append(", processKey=").append(String.valueOf(this.processKey));
        sb.append(", externalUrl=").append(String.valueOf(this.externalUrl));
        sb.append(", eventKey=").append(String.valueOf(this.eventKey));
        sb.append(", dataEntityKey=").append(String.valueOf(this.dataEntityKey));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobExecutionDetails)) {
            return false;
        }

        CreateJobExecutionDetails other = (CreateJobExecutionDetails) o;
        return java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.scheduleInstanceKey, other.scheduleInstanceKey)
                && java.util.Objects.equals(this.processKey, other.processKey)
                && java.util.Objects.equals(this.externalUrl, other.externalUrl)
                && java.util.Objects.equals(this.eventKey, other.eventKey)
                && java.util.Objects.equals(this.dataEntityKey, other.dataEntityKey)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleInstanceKey == null
                                ? 43
                                : this.scheduleInstanceKey.hashCode());
        result = (result * PRIME) + (this.processKey == null ? 43 : this.processKey.hashCode());
        result = (result * PRIME) + (this.externalUrl == null ? 43 : this.externalUrl.hashCode());
        result = (result * PRIME) + (this.eventKey == null ? 43 : this.eventKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEntityKey == null ? 43 : this.dataEntityKey.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
