/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobLogSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "jobExecutionKey",
        "uri",
        "timeCreated",
        "severity",
        "logMessage"
    })
    public JobLogSummary(
            String key,
            String jobExecutionKey,
            String uri,
            java.util.Date timeCreated,
            String severity,
            String logMessage) {
        super();
        this.key = key;
        this.jobExecutionKey = jobExecutionKey;
        this.uri = uri;
        this.timeCreated = timeCreated;
        this.severity = severity;
        this.logMessage = logMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique key of the job log that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job log that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The unique key of the parent job execution for which the log resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
        private String jobExecutionKey;

        /**
         * The unique key of the parent job execution for which the log resource was created.
         * @param jobExecutionKey the value to set
         * @return this builder
         **/
        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            this.__explicitlySet__.add("jobExecutionKey");
            return this;
        }
        /**
         * URI to the job log instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job log instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * The date and time the job log was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job log was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
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
         * Severity level for this log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private String severity;

        /**
         * Severity level for this log.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(String severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * Message for this job log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
        private String logMessage;

        /**
         * Message for this job log.
         * @param logMessage the value to set
         * @return this builder
         **/
        public Builder logMessage(String logMessage) {
            this.logMessage = logMessage;
            this.__explicitlySet__.add("logMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobLogSummary build() {
            JobLogSummary model =
                    new JobLogSummary(
                            this.key,
                            this.jobExecutionKey,
                            this.uri,
                            this.timeCreated,
                            this.severity,
                            this.logMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobLogSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("jobExecutionKey")) {
                this.jobExecutionKey(model.getJobExecutionKey());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("logMessage")) {
                this.logMessage(model.getLogMessage());
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
     * Unique key of the job log that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job log that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The unique key of the parent job execution for which the log resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
    private final String jobExecutionKey;

    /**
     * The unique key of the parent job execution for which the log resource was created.
     * @return the value
     **/
    public String getJobExecutionKey() {
        return jobExecutionKey;
    }

    /**
     * URI to the job log instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job log instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * The date and time the job log was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job log was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Severity level for this log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final String severity;

    /**
     * Severity level for this log.
     * @return the value
     **/
    public String getSeverity() {
        return severity;
    }

    /**
     * Message for this job log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMessage")
    private final String logMessage;

    /**
     * Message for this job log.
     * @return the value
     **/
    public String getLogMessage() {
        return logMessage;
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
        sb.append("JobLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", jobExecutionKey=").append(String.valueOf(this.jobExecutionKey));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", logMessage=").append(String.valueOf(this.logMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobLogSummary)) {
            return false;
        }

        JobLogSummary other = (JobLogSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.jobExecutionKey, other.jobExecutionKey)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.logMessage, other.logMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.jobExecutionKey == null ? 43 : this.jobExecutionKey.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.logMessage == null ? 43 : this.logMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
