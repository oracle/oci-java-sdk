/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Optimizer Statistics Collection operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OptimizerStatisticsCollectionOperationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OptimizerStatisticsCollectionOperationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "operationName",
        "target",
        "jobName",
        "status",
        "startTime",
        "endTime",
        "durationInSeconds",
        "completedCount",
        "inProgressCount",
        "failedCount",
        "timedOutCount",
        "totalObjectsCount"
    })
    public OptimizerStatisticsCollectionOperationSummary(
            Integer id,
            String operationName,
            String target,
            String jobName,
            Status status,
            String startTime,
            String endTime,
            java.math.BigDecimal durationInSeconds,
            Integer completedCount,
            Integer inProgressCount,
            Integer failedCount,
            Integer timedOutCount,
            Integer totalObjectsCount) {
        super();
        this.id = id;
        this.operationName = operationName;
        this.target = target;
        this.jobName = jobName;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationInSeconds = durationInSeconds;
        this.completedCount = completedCount;
        this.inProgressCount = inProgressCount;
        this.failedCount = failedCount;
        this.timedOutCount = timedOutCount;
        this.totalObjectsCount = totalObjectsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Integer id;

        /**
         * The ID of the operation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Integer id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        /**
         * The name of the operation.
         *
         * @param operationName the value to set
         * @return this builder
         */
        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }
        /** The target object type such as Table, Index, and Partition. */
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        /**
         * The target object type such as Table, Index, and Partition.
         *
         * @param target the value to set
         * @return this builder
         */
        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /** The name of the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the job.
         *
         * @param jobName the value to set
         * @return this builder
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /** The status of the operation such as Completed, and Failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the operation such as Completed, and Failed.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The start time of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * The start time of the operation.
         *
         * @param startTime the value to set
         * @return this builder
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /** The end time of the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private String endTime;

        /**
         * The end time of the operation.
         *
         * @param endTime the value to set
         * @return this builder
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /** The time it takes to complete the operation (in seconds). */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private java.math.BigDecimal durationInSeconds;

        /**
         * The time it takes to complete the operation (in seconds).
         *
         * @param durationInSeconds the value to set
         * @return this builder
         */
        public Builder durationInSeconds(java.math.BigDecimal durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /** The number of objects for which statistics collection is completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("completedCount")
        private Integer completedCount;

        /**
         * The number of objects for which statistics collection is completed.
         *
         * @param completedCount the value to set
         * @return this builder
         */
        public Builder completedCount(Integer completedCount) {
            this.completedCount = completedCount;
            this.__explicitlySet__.add("completedCount");
            return this;
        }
        /** The number of objects for which statistics collection is in progress. */
        @com.fasterxml.jackson.annotation.JsonProperty("inProgressCount")
        private Integer inProgressCount;

        /**
         * The number of objects for which statistics collection is in progress.
         *
         * @param inProgressCount the value to set
         * @return this builder
         */
        public Builder inProgressCount(Integer inProgressCount) {
            this.inProgressCount = inProgressCount;
            this.__explicitlySet__.add("inProgressCount");
            return this;
        }
        /** The number of objects for which statistics collection failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedCount")
        private Integer failedCount;

        /**
         * The number of objects for which statistics collection failed.
         *
         * @param failedCount the value to set
         * @return this builder
         */
        public Builder failedCount(Integer failedCount) {
            this.failedCount = failedCount;
            this.__explicitlySet__.add("failedCount");
            return this;
        }
        /** The number of objects for which statistics collection timed out. */
        @com.fasterxml.jackson.annotation.JsonProperty("timedOutCount")
        private Integer timedOutCount;

        /**
         * The number of objects for which statistics collection timed out.
         *
         * @param timedOutCount the value to set
         * @return this builder
         */
        public Builder timedOutCount(Integer timedOutCount) {
            this.timedOutCount = timedOutCount;
            this.__explicitlySet__.add("timedOutCount");
            return this;
        }
        /**
         * The total number of objects for which statistics is collected. This number is the sum of
         * all the objects with various statuses: completed, inProgress, failed, and timedOut.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsCount")
        private Integer totalObjectsCount;

        /**
         * The total number of objects for which statistics is collected. This number is the sum of
         * all the objects with various statuses: completed, inProgress, failed, and timedOut.
         *
         * @param totalObjectsCount the value to set
         * @return this builder
         */
        public Builder totalObjectsCount(Integer totalObjectsCount) {
            this.totalObjectsCount = totalObjectsCount;
            this.__explicitlySet__.add("totalObjectsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OptimizerStatisticsCollectionOperationSummary build() {
            OptimizerStatisticsCollectionOperationSummary model =
                    new OptimizerStatisticsCollectionOperationSummary(
                            this.id,
                            this.operationName,
                            this.target,
                            this.jobName,
                            this.status,
                            this.startTime,
                            this.endTime,
                            this.durationInSeconds,
                            this.completedCount,
                            this.inProgressCount,
                            this.failedCount,
                            this.timedOutCount,
                            this.totalObjectsCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OptimizerStatisticsCollectionOperationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("operationName")) {
                this.operationName(model.getOperationName());
            }
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("jobName")) {
                this.jobName(model.getJobName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("completedCount")) {
                this.completedCount(model.getCompletedCount());
            }
            if (model.wasPropertyExplicitlySet("inProgressCount")) {
                this.inProgressCount(model.getInProgressCount());
            }
            if (model.wasPropertyExplicitlySet("failedCount")) {
                this.failedCount(model.getFailedCount());
            }
            if (model.wasPropertyExplicitlySet("timedOutCount")) {
                this.timedOutCount(model.getTimedOutCount());
            }
            if (model.wasPropertyExplicitlySet("totalObjectsCount")) {
                this.totalObjectsCount(model.getTotalObjectsCount());
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

    /** The ID of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Integer id;

    /**
     * The ID of the operation.
     *
     * @return the value
     */
    public Integer getId() {
        return id;
    }

    /** The name of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    private final String operationName;

    /**
     * The name of the operation.
     *
     * @return the value
     */
    public String getOperationName() {
        return operationName;
    }

    /** The target object type such as Table, Index, and Partition. */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    /**
     * The target object type such as Table, Index, and Partition.
     *
     * @return the value
     */
    public String getTarget() {
        return target;
    }

    /** The name of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the job.
     *
     * @return the value
     */
    public String getJobName() {
        return jobName;
    }

    /** The status of the operation such as Completed, and Failed. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),
        Failed("FAILED"),
        TimedOut("TIMED_OUT"),

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
    /** The status of the operation such as Completed, and Failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the operation such as Completed, and Failed.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The start time of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * The start time of the operation.
     *
     * @return the value
     */
    public String getStartTime() {
        return startTime;
    }

    /** The end time of the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final String endTime;

    /**
     * The end time of the operation.
     *
     * @return the value
     */
    public String getEndTime() {
        return endTime;
    }

    /** The time it takes to complete the operation (in seconds). */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final java.math.BigDecimal durationInSeconds;

    /**
     * The time it takes to complete the operation (in seconds).
     *
     * @return the value
     */
    public java.math.BigDecimal getDurationInSeconds() {
        return durationInSeconds;
    }

    /** The number of objects for which statistics collection is completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("completedCount")
    private final Integer completedCount;

    /**
     * The number of objects for which statistics collection is completed.
     *
     * @return the value
     */
    public Integer getCompletedCount() {
        return completedCount;
    }

    /** The number of objects for which statistics collection is in progress. */
    @com.fasterxml.jackson.annotation.JsonProperty("inProgressCount")
    private final Integer inProgressCount;

    /**
     * The number of objects for which statistics collection is in progress.
     *
     * @return the value
     */
    public Integer getInProgressCount() {
        return inProgressCount;
    }

    /** The number of objects for which statistics collection failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedCount")
    private final Integer failedCount;

    /**
     * The number of objects for which statistics collection failed.
     *
     * @return the value
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    /** The number of objects for which statistics collection timed out. */
    @com.fasterxml.jackson.annotation.JsonProperty("timedOutCount")
    private final Integer timedOutCount;

    /**
     * The number of objects for which statistics collection timed out.
     *
     * @return the value
     */
    public Integer getTimedOutCount() {
        return timedOutCount;
    }

    /**
     * The total number of objects for which statistics is collected. This number is the sum of all
     * the objects with various statuses: completed, inProgress, failed, and timedOut.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsCount")
    private final Integer totalObjectsCount;

    /**
     * The total number of objects for which statistics is collected. This number is the sum of all
     * the objects with various statuses: completed, inProgress, failed, and timedOut.
     *
     * @return the value
     */
    public Integer getTotalObjectsCount() {
        return totalObjectsCount;
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
        sb.append("OptimizerStatisticsCollectionOperationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", operationName=").append(String.valueOf(this.operationName));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", completedCount=").append(String.valueOf(this.completedCount));
        sb.append(", inProgressCount=").append(String.valueOf(this.inProgressCount));
        sb.append(", failedCount=").append(String.valueOf(this.failedCount));
        sb.append(", timedOutCount=").append(String.valueOf(this.timedOutCount));
        sb.append(", totalObjectsCount=").append(String.valueOf(this.totalObjectsCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptimizerStatisticsCollectionOperationSummary)) {
            return false;
        }

        OptimizerStatisticsCollectionOperationSummary other =
                (OptimizerStatisticsCollectionOperationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.operationName, other.operationName)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.completedCount, other.completedCount)
                && java.util.Objects.equals(this.inProgressCount, other.inProgressCount)
                && java.util.Objects.equals(this.failedCount, other.failedCount)
                && java.util.Objects.equals(this.timedOutCount, other.timedOutCount)
                && java.util.Objects.equals(this.totalObjectsCount, other.totalObjectsCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.operationName == null ? 43 : this.operationName.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.completedCount == null ? 43 : this.completedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.inProgressCount == null ? 43 : this.inProgressCount.hashCode());
        result = (result * PRIME) + (this.failedCount == null ? 43 : this.failedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timedOutCount == null ? 43 : this.timedOutCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalObjectsCount == null ? 43 : this.totalObjectsCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
