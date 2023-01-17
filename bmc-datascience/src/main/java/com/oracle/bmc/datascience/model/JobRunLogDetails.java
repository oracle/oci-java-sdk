/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Customer logging details for job run.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobRunLogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobRunLogDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"logGroupId", "logId"})
    public JobRunLogDetails(String logGroupId, String logId) {
        super();
        this.logGroupId = logGroupId;
        this.logId = logId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log group id for where log objects will be for job runs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * The log group id for where log objects will be for job runs.
         *
         * @param logGroupId the value to set
         * @return this builder
         **/
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * The log id of the log object the job run logs will be shipped to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logId")
        private String logId;

        /**
         * The log id of the log object the job run logs will be shipped to.
         *
         * @param logId the value to set
         * @return this builder
         **/
        public Builder logId(String logId) {
            this.logId = logId;
            this.__explicitlySet__.add("logId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobRunLogDetails build() {
            JobRunLogDetails model = new JobRunLogDetails(this.logGroupId, this.logId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRunLogDetails model) {
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("logId")) {
                this.logId(model.getLogId());
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
     * The log group id for where log objects will be for job runs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * The log group id for where log objects will be for job runs.
     *
     * @return the value
     **/
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * The log id of the log object the job run logs will be shipped to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logId")
    private final String logId;

    /**
     * The log id of the log object the job run logs will be shipped to.
     *
     * @return the value
     **/
    public String getLogId() {
        return logId;
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
        sb.append("JobRunLogDetails(");
        sb.append("super=").append(super.toString());
        sb.append("logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", logId=").append(String.valueOf(this.logId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobRunLogDetails)) {
            return false;
        }

        JobRunLogDetails other = (JobRunLogDetails) o;
        return java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logId, other.logId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
