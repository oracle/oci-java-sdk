/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateJobExecutionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateJobExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Sub-type of this job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    String subType;

    /**
     * Type of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    JobType jobType;

    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    String parentKey;

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Time that the job execution ended or null if it hasn't yet completed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    /**
     * Status of the job execution, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    JobExecutionState lifecycleState;

    /**
     * Error code returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    String errorCode;

    /**
     * Error message returned from the job execution or null if job is still running or didn't return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
    String scheduleInstanceKey;

    /**
     * Process identifier related to the job execution if the job is an external job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processKey")
    String processKey;

    /**
     * If the job is an external process, then a URL of the job for accessing this resource and its status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalUrl")
    String externalUrl;

    /**
     * An identifier used for log message correlation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventKey")
    String eventKey;

    /**
     * The key of the associated data entity resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEntityKey")
    String dataEntityKey;

    /**
     * A map of maps that contains the execution context properties which are specific to a job execution. Each job
     * execution may define it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * job executions have required properties within the \"default\" category.
     * Example: `{\"properties\": { \"default\": { \"host\": \"host1\", \"port\": \"1521\", \"database\": \"orcl\"}}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
