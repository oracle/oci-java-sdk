/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Optimizer Statistics Advisor execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OptimizerStatisticsAdvisorExecutionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OptimizerStatisticsAdvisorExecutionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskName",
        "executionName",
        "timeStart",
        "timeEnd",
        "status",
        "statusMessage",
        "errorMessage",
        "findings"
    })
    public OptimizerStatisticsAdvisorExecutionSummary(
            String taskName,
            String executionName,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Status status,
            String statusMessage,
            String errorMessage,
            Integer findings) {
        super();
        this.taskName = taskName;
        this.executionName = executionName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.status = status;
        this.statusMessage = statusMessage;
        this.errorMessage = errorMessage;
        this.findings = findings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the Optimizer Statistics Advisor task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * The name of the Optimizer Statistics Advisor task.
         *
         * @param taskName the value to set
         * @return this builder
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /** The name of the Optimizer Statistics Advisor execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionName")
        private String executionName;

        /**
         * The name of the Optimizer Statistics Advisor execution.
         *
         * @param executionName the value to set
         * @return this builder
         */
        public Builder executionName(String executionName) {
            this.executionName = executionName;
            this.__explicitlySet__.add("executionName");
            return this;
        }
        /**
         * The start time of the time range to retrieve the Optimizer Statistics Advisor execution
         * of a Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The start time of the time range to retrieve the Optimizer Statistics Advisor execution
         * of a Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * The end time of the time range to retrieve the Optimizer Statistics Advisor execution of
         * a Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the time range to retrieve the Optimizer Statistics Advisor execution of
         * a Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The status of the Optimizer Statistics Advisor execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the Optimizer Statistics Advisor execution.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The Optimizer Statistics Advisor execution status message, if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        /**
         * The Optimizer Statistics Advisor execution status message, if any.
         *
         * @param statusMessage the value to set
         * @return this builder
         */
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }
        /** The errors in the Optimizer Statistics Advisor execution, if any. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The errors in the Optimizer Statistics Advisor execution, if any.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /** The number of findings generated by the Optimizer Statistics Advisor execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("findings")
        private Integer findings;

        /**
         * The number of findings generated by the Optimizer Statistics Advisor execution.
         *
         * @param findings the value to set
         * @return this builder
         */
        public Builder findings(Integer findings) {
            this.findings = findings;
            this.__explicitlySet__.add("findings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OptimizerStatisticsAdvisorExecutionSummary build() {
            OptimizerStatisticsAdvisorExecutionSummary model =
                    new OptimizerStatisticsAdvisorExecutionSummary(
                            this.taskName,
                            this.executionName,
                            this.timeStart,
                            this.timeEnd,
                            this.status,
                            this.statusMessage,
                            this.errorMessage,
                            this.findings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OptimizerStatisticsAdvisorExecutionSummary model) {
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("executionName")) {
                this.executionName(model.getExecutionName());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusMessage")) {
                this.statusMessage(model.getStatusMessage());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("findings")) {
                this.findings(model.getFindings());
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

    /** The name of the Optimizer Statistics Advisor task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * The name of the Optimizer Statistics Advisor task.
     *
     * @return the value
     */
    public String getTaskName() {
        return taskName;
    }

    /** The name of the Optimizer Statistics Advisor execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionName")
    private final String executionName;

    /**
     * The name of the Optimizer Statistics Advisor execution.
     *
     * @return the value
     */
    public String getExecutionName() {
        return executionName;
    }

    /**
     * The start time of the time range to retrieve the Optimizer Statistics Advisor execution of a
     * Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The start time of the time range to retrieve the Optimizer Statistics Advisor execution of a
     * Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * The end time of the time range to retrieve the Optimizer Statistics Advisor execution of a
     * Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the time range to retrieve the Optimizer Statistics Advisor execution of a
     * Managed Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The status of the Optimizer Statistics Advisor execution. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Executing("EXECUTING"),
        Completed("COMPLETED"),
        Interrupted("INTERRUPTED"),
        Cancelled("CANCELLED"),
        FatalError("FATAL_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the Optimizer Statistics Advisor execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the Optimizer Statistics Advisor execution.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The Optimizer Statistics Advisor execution status message, if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    private final String statusMessage;

    /**
     * The Optimizer Statistics Advisor execution status message, if any.
     *
     * @return the value
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /** The errors in the Optimizer Statistics Advisor execution, if any. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The errors in the Optimizer Statistics Advisor execution, if any.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** The number of findings generated by the Optimizer Statistics Advisor execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("findings")
    private final Integer findings;

    /**
     * The number of findings generated by the Optimizer Statistics Advisor execution.
     *
     * @return the value
     */
    public Integer getFindings() {
        return findings;
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
        sb.append("OptimizerStatisticsAdvisorExecutionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("taskName=").append(String.valueOf(this.taskName));
        sb.append(", executionName=").append(String.valueOf(this.executionName));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusMessage=").append(String.valueOf(this.statusMessage));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", findings=").append(String.valueOf(this.findings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptimizerStatisticsAdvisorExecutionSummary)) {
            return false;
        }

        OptimizerStatisticsAdvisorExecutionSummary other =
                (OptimizerStatisticsAdvisorExecutionSummary) o;
        return java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.executionName, other.executionName)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusMessage, other.statusMessage)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.findings, other.findings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result =
                (result * PRIME)
                        + (this.executionName == null ? 43 : this.executionName.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusMessage == null ? 43 : this.statusMessage.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.findings == null ? 43 : this.findings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
