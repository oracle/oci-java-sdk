/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Job log details. A job log is an audit log record inserted during the lifecycle of a job execution instance.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobLog extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "jobExecutionKey",
        "createdById",
        "updatedById",
        "timeUpdated",
        "timeCreated",
        "severity",
        "logMessage",
        "uri"
    })
    public JobLog(
            String key,
            String jobExecutionKey,
            String createdById,
            String updatedById,
            java.util.Date timeUpdated,
            java.util.Date timeCreated,
            String severity,
            String logMessage,
            String uri) {
        super();
        this.key = key;
        this.jobExecutionKey = jobExecutionKey;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
        this.severity = severity;
        this.logMessage = logMessage;
        this.uri = uri;
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
         * OCID of the user who created the log record for this job. Usually the executor of the job instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the log record for this job. Usually the executor of the job instance.
         *
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * OCID of the user who created the log record for this job. Usually the executor of the job instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who created the log record for this job. Usually the executor of the job instance.
         *
         * @param updatedById the value to set
         * @return this builder
         **/
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /**
         * Job log update time. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Job log update time. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobLog build() {
            JobLog model =
                    new JobLog(
                            this.key,
                            this.jobExecutionKey,
                            this.createdById,
                            this.updatedById,
                            this.timeUpdated,
                            this.timeCreated,
                            this.severity,
                            this.logMessage,
                            this.uri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobLog model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("jobExecutionKey")) {
                this.jobExecutionKey(model.getJobExecutionKey());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * OCID of the user who created the log record for this job. Usually the executor of the job instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the log record for this job. Usually the executor of the job instance.
     *
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who created the log record for this job. Usually the executor of the job instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who created the log record for this job. Usually the executor of the job instance.
     *
     * @return the value
     **/
    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Job log update time. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Job log update time. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("JobLog(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", jobExecutionKey=").append(String.valueOf(this.jobExecutionKey));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", logMessage=").append(String.valueOf(this.logMessage));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobLog)) {
            return false;
        }

        JobLog other = (JobLog) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.jobExecutionKey, other.jobExecutionKey)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.logMessage, other.logMessage)
                && java.util.Objects.equals(this.uri, other.uri)
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
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.logMessage == null ? 43 : this.logMessage.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
