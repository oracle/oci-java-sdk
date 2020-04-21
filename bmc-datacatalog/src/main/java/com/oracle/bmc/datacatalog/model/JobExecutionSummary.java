/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of job executions. A job execution is a unit of work being executed on behalf of a job.
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
    builder = JobExecutionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class JobExecutionSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
        private String jobKey;

        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            this.__explicitlySet__.add("jobKey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
        private String scheduleInstanceKey;

        public Builder scheduleInstanceKey(String scheduleInstanceKey) {
            this.scheduleInstanceKey = scheduleInstanceKey;
            this.__explicitlySet__.add("scheduleInstanceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobExecutionState lifecycleState;

        public Builder lifecycleState(JobExecutionState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecutionSummary build() {
            JobExecutionSummary __instance__ =
                    new JobExecutionSummary(
                            key,
                            jobKey,
                            jobType,
                            parentKey,
                            scheduleInstanceKey,
                            lifecycleState,
                            timeCreated,
                            timeStarted,
                            timeEnded,
                            uri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecutionSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .jobKey(o.getJobKey())
                            .jobType(o.getJobType())
                            .parentKey(o.getParentKey())
                            .scheduleInstanceKey(o.getScheduleInstanceKey())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
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
     * Unique key of the job execution resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The unique key of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    String jobKey;

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
     * The unique key of the triggering external scheduler resource or null if this job execution is not externally triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
    String scheduleInstanceKey;

    /**
     * Status of the job execution, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    JobExecutionState lifecycleState;

    /**
     * The date and time the job execution was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

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
     * URI to the job execution instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
