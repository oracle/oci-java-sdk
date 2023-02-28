/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of job executions. A job execution is a unit of work being executed on behalf of a job.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobExecutionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JobExecutionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "jobKey",
        "jobType",
        "parentKey",
        "scheduleInstanceKey",
        "lifecycleState",
        "timeCreated",
        "timeStarted",
        "timeEnded",
        "uri"
    })
    public JobExecutionSummary(
            String key,
            String jobKey,
            JobType jobType,
            String parentKey,
            String scheduleInstanceKey,
            JobExecutionState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String uri) {
        super();
        this.key = key;
        this.jobKey = jobKey;
        this.jobType = jobType;
        this.parentKey = parentKey;
        this.scheduleInstanceKey = scheduleInstanceKey;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique key of the job execution resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job execution resource.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The unique key of the parent job. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
        private String jobKey;

        /**
         * The unique key of the parent job.
         *
         * @param jobKey the value to set
         * @return this builder
         */
        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            this.__explicitlySet__.add("jobKey");
            return this;
        }
        /** Type of the job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        /**
         * Type of the job execution.
         *
         * @param jobType the value to set
         * @return this builder
         */
        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }
        /** The unique key of the parent execution or null if this job execution has no parent. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        /**
         * The unique key of the parent execution or null if this job execution has no parent.
         *
         * @param parentKey the value to set
         * @return this builder
         */
        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }
        /**
         * The unique key of the triggering external scheduler resource or null if this job
         * execution is not externally triggered.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
        private String scheduleInstanceKey;

        /**
         * The unique key of the triggering external scheduler resource or null if this job
         * execution is not externally triggered.
         *
         * @param scheduleInstanceKey the value to set
         * @return this builder
         */
        public Builder scheduleInstanceKey(String scheduleInstanceKey) {
            this.scheduleInstanceKey = scheduleInstanceKey;
            this.__explicitlySet__.add("scheduleInstanceKey");
            return this;
        }
        /** Status of the job execution, such as running, paused, or completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobExecutionState lifecycleState;

        /**
         * Status of the job execution, such as running, paused, or completed.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(JobExecutionState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the job execution was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job execution was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Time that the job execution ended or null if it hasn't yet completed. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * Time that the job execution ended or null if it hasn't yet completed. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** URI to the job execution instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job execution instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecutionSummary build() {
            JobExecutionSummary model =
                    new JobExecutionSummary(
                            this.key,
                            this.jobKey,
                            this.jobType,
                            this.parentKey,
                            this.scheduleInstanceKey,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeEnded,
                            this.uri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecutionSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("jobKey")) {
                this.jobKey(model.getJobKey());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
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
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique key of the job execution resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job execution resource.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The unique key of the parent job. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    private final String jobKey;

    /**
     * The unique key of the parent job.
     *
     * @return the value
     */
    public String getJobKey() {
        return jobKey;
    }

    /** Type of the job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    /**
     * Type of the job execution.
     *
     * @return the value
     */
    public JobType getJobType() {
        return jobType;
    }

    /** The unique key of the parent execution or null if this job execution has no parent. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     *
     * @return the value
     */
    public String getParentKey() {
        return parentKey;
    }

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is
     * not externally triggered.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleInstanceKey")
    private final String scheduleInstanceKey;

    /**
     * The unique key of the triggering external scheduler resource or null if this job execution is
     * not externally triggered.
     *
     * @return the value
     */
    public String getScheduleInstanceKey() {
        return scheduleInstanceKey;
    }

    /** Status of the job execution, such as running, paused, or completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final JobExecutionState lifecycleState;

    /**
     * Status of the job execution, such as running, paused, or completed.
     *
     * @return the value
     */
    public JobExecutionState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the job execution was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job execution was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Time that job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Time that the job execution ended or null if it hasn't yet completed. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * Time that the job execution ended or null if it hasn't yet completed. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** URI to the job execution instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job execution instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobExecutionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", scheduleInstanceKey=").append(String.valueOf(this.scheduleInstanceKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecutionSummary)) {
            return false;
        }

        JobExecutionSummary other = (JobExecutionSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.jobKey, other.jobKey)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.scheduleInstanceKey, other.scheduleInstanceKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.uri, other.uri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
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
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
