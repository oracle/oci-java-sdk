/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of job execution logs.
 * A job log is an audit log record inserted during the lifecycle of a job execution instance.
 * There can be one or more logs for an execution instance.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobLogSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
        private String jobExecutionKey;

        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            this.__explicitlySet__.add("jobExecutionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private String severity;

        public Builder severity(String severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
        private String logMessage;

        public Builder logMessage(String logMessage) {
            this.logMessage = logMessage;
            this.__explicitlySet__.add("logMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobLogSummary build() {
            JobLogSummary __instance__ =
                    new JobLogSummary(key, jobExecutionKey, uri, timeCreated, severity, logMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobLogSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .jobExecutionKey(o.getJobExecutionKey())
                            .uri(o.getUri())
                            .timeCreated(o.getTimeCreated())
                            .severity(o.getSeverity())
                            .logMessage(o.getLogMessage());

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
     * Unique key of the job log that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The unique key of the parent job execution for which the log resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
    String jobExecutionKey;

    /**
     * URI to the job log instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * The date and time the job log was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Severity level for this log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    String severity;

    /**
     * Message for this job log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
    String logMessage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
