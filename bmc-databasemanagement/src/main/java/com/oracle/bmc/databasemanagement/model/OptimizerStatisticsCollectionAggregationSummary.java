/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the Optimizer Statistics Collection, which includes the aggregated number of tasks
 * grouped by status. <br>
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
        builder = OptimizerStatisticsCollectionAggregationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OptimizerStatisticsCollectionAggregationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "groupBy",
        "timeStart",
        "timeEnd",
        "pending",
        "inProgress",
        "completed",
        "failed",
        "skipped",
        "timedOut",
        "unknown",
        "total"
    })
    public OptimizerStatisticsCollectionAggregationSummary(
            OptimizerStatisticsGroupByTypes groupBy,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Integer pending,
            Integer inProgress,
            Integer completed,
            Integer failed,
            Integer skipped,
            Integer timedOut,
            Integer unknown,
            Integer total) {
        super();
        this.groupBy = groupBy;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.pending = pending;
        this.inProgress = inProgress;
        this.completed = completed;
        this.failed = failed;
        this.skipped = skipped;
        this.timedOut = timedOut;
        this.unknown = unknown;
        this.total = total;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The optimizer statistics tasks grouped by type. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private OptimizerStatisticsGroupByTypes groupBy;

        /**
         * The optimizer statistics tasks grouped by type.
         *
         * @param groupBy the value to set
         * @return this builder
         */
        public Builder groupBy(OptimizerStatisticsGroupByTypes groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }
        /** Indicates the start of the hour as the statistics are aggregated per hour. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Indicates the start of the hour as the statistics are aggregated per hour.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Indicates the end of the hour as the statistics are aggregated per hour. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Indicates the end of the hour as the statistics are aggregated per hour.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The number of tasks or objects for which statistics are yet to be gathered. */
        @com.fasterxml.jackson.annotation.JsonProperty("pending")
        private Integer pending;

        /**
         * The number of tasks or objects for which statistics are yet to be gathered.
         *
         * @param pending the value to set
         * @return this builder
         */
        public Builder pending(Integer pending) {
            this.pending = pending;
            this.__explicitlySet__.add("pending");
            return this;
        }
        /** The number of tasks or objects for which statistics gathering is in progress. */
        @com.fasterxml.jackson.annotation.JsonProperty("inProgress")
        private Integer inProgress;

        /**
         * The number of tasks or objects for which statistics gathering is in progress.
         *
         * @param inProgress the value to set
         * @return this builder
         */
        public Builder inProgress(Integer inProgress) {
            this.inProgress = inProgress;
            this.__explicitlySet__.add("inProgress");
            return this;
        }
        /** The number of tasks or objects for which statistics gathering is completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("completed")
        private Integer completed;

        /**
         * The number of tasks or objects for which statistics gathering is completed.
         *
         * @param completed the value to set
         * @return this builder
         */
        public Builder completed(Integer completed) {
            this.completed = completed;
            this.__explicitlySet__.add("completed");
            return this;
        }
        /** The number of tasks or objects for which statistics gathering failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("failed")
        private Integer failed;

        /**
         * The number of tasks or objects for which statistics gathering failed.
         *
         * @param failed the value to set
         * @return this builder
         */
        public Builder failed(Integer failed) {
            this.failed = failed;
            this.__explicitlySet__.add("failed");
            return this;
        }
        /** The number of tasks or objects for which statistics gathering was skipped. */
        @com.fasterxml.jackson.annotation.JsonProperty("skipped")
        private Integer skipped;

        /**
         * The number of tasks or objects for which statistics gathering was skipped.
         *
         * @param skipped the value to set
         * @return this builder
         */
        public Builder skipped(Integer skipped) {
            this.skipped = skipped;
            this.__explicitlySet__.add("skipped");
            return this;
        }
        /** The number of tasks or objects for which statistics gathering timed out. */
        @com.fasterxml.jackson.annotation.JsonProperty("timedOut")
        private Integer timedOut;

        /**
         * The number of tasks or objects for which statistics gathering timed out.
         *
         * @param timedOut the value to set
         * @return this builder
         */
        public Builder timedOut(Integer timedOut) {
            this.timedOut = timedOut;
            this.__explicitlySet__.add("timedOut");
            return this;
        }
        /**
         * The number of tasks or objects for which the status of statistics gathering is unknown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unknown")
        private Integer unknown;

        /**
         * The number of tasks or objects for which the status of statistics gathering is unknown.
         *
         * @param unknown the value to set
         * @return this builder
         */
        public Builder unknown(Integer unknown) {
            this.unknown = unknown;
            this.__explicitlySet__.add("unknown");
            return this;
        }
        /**
         * The total number of tasks or objects for which statistics collection is finished. This
         * number is the sum of all the tasks or objects with various statuses: pending, inProgress,
         * completed, failed, skipped, timedOut, and unknown.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * The total number of tasks or objects for which statistics collection is finished. This
         * number is the sum of all the tasks or objects with various statuses: pending, inProgress,
         * completed, failed, skipped, timedOut, and unknown.
         *
         * @param total the value to set
         * @return this builder
         */
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OptimizerStatisticsCollectionAggregationSummary build() {
            OptimizerStatisticsCollectionAggregationSummary model =
                    new OptimizerStatisticsCollectionAggregationSummary(
                            this.groupBy,
                            this.timeStart,
                            this.timeEnd,
                            this.pending,
                            this.inProgress,
                            this.completed,
                            this.failed,
                            this.skipped,
                            this.timedOut,
                            this.unknown,
                            this.total);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OptimizerStatisticsCollectionAggregationSummary model) {
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("pending")) {
                this.pending(model.getPending());
            }
            if (model.wasPropertyExplicitlySet("inProgress")) {
                this.inProgress(model.getInProgress());
            }
            if (model.wasPropertyExplicitlySet("completed")) {
                this.completed(model.getCompleted());
            }
            if (model.wasPropertyExplicitlySet("failed")) {
                this.failed(model.getFailed());
            }
            if (model.wasPropertyExplicitlySet("skipped")) {
                this.skipped(model.getSkipped());
            }
            if (model.wasPropertyExplicitlySet("timedOut")) {
                this.timedOut(model.getTimedOut());
            }
            if (model.wasPropertyExplicitlySet("unknown")) {
                this.unknown(model.getUnknown());
            }
            if (model.wasPropertyExplicitlySet("total")) {
                this.total(model.getTotal());
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

    /** The optimizer statistics tasks grouped by type. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final OptimizerStatisticsGroupByTypes groupBy;

    /**
     * The optimizer statistics tasks grouped by type.
     *
     * @return the value
     */
    public OptimizerStatisticsGroupByTypes getGroupBy() {
        return groupBy;
    }

    /** Indicates the start of the hour as the statistics are aggregated per hour. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Indicates the start of the hour as the statistics are aggregated per hour.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Indicates the end of the hour as the statistics are aggregated per hour. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Indicates the end of the hour as the statistics are aggregated per hour.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The number of tasks or objects for which statistics are yet to be gathered. */
    @com.fasterxml.jackson.annotation.JsonProperty("pending")
    private final Integer pending;

    /**
     * The number of tasks or objects for which statistics are yet to be gathered.
     *
     * @return the value
     */
    public Integer getPending() {
        return pending;
    }

    /** The number of tasks or objects for which statistics gathering is in progress. */
    @com.fasterxml.jackson.annotation.JsonProperty("inProgress")
    private final Integer inProgress;

    /**
     * The number of tasks or objects for which statistics gathering is in progress.
     *
     * @return the value
     */
    public Integer getInProgress() {
        return inProgress;
    }

    /** The number of tasks or objects for which statistics gathering is completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("completed")
    private final Integer completed;

    /**
     * The number of tasks or objects for which statistics gathering is completed.
     *
     * @return the value
     */
    public Integer getCompleted() {
        return completed;
    }

    /** The number of tasks or objects for which statistics gathering failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("failed")
    private final Integer failed;

    /**
     * The number of tasks or objects for which statistics gathering failed.
     *
     * @return the value
     */
    public Integer getFailed() {
        return failed;
    }

    /** The number of tasks or objects for which statistics gathering was skipped. */
    @com.fasterxml.jackson.annotation.JsonProperty("skipped")
    private final Integer skipped;

    /**
     * The number of tasks or objects for which statistics gathering was skipped.
     *
     * @return the value
     */
    public Integer getSkipped() {
        return skipped;
    }

    /** The number of tasks or objects for which statistics gathering timed out. */
    @com.fasterxml.jackson.annotation.JsonProperty("timedOut")
    private final Integer timedOut;

    /**
     * The number of tasks or objects for which statistics gathering timed out.
     *
     * @return the value
     */
    public Integer getTimedOut() {
        return timedOut;
    }

    /** The number of tasks or objects for which the status of statistics gathering is unknown. */
    @com.fasterxml.jackson.annotation.JsonProperty("unknown")
    private final Integer unknown;

    /**
     * The number of tasks or objects for which the status of statistics gathering is unknown.
     *
     * @return the value
     */
    public Integer getUnknown() {
        return unknown;
    }

    /**
     * The total number of tasks or objects for which statistics collection is finished. This number
     * is the sum of all the tasks or objects with various statuses: pending, inProgress, completed,
     * failed, skipped, timedOut, and unknown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * The total number of tasks or objects for which statistics collection is finished. This number
     * is the sum of all the tasks or objects with various statuses: pending, inProgress, completed,
     * failed, skipped, timedOut, and unknown.
     *
     * @return the value
     */
    public Integer getTotal() {
        return total;
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
        sb.append("OptimizerStatisticsCollectionAggregationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("groupBy=").append(String.valueOf(this.groupBy));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", pending=").append(String.valueOf(this.pending));
        sb.append(", inProgress=").append(String.valueOf(this.inProgress));
        sb.append(", completed=").append(String.valueOf(this.completed));
        sb.append(", failed=").append(String.valueOf(this.failed));
        sb.append(", skipped=").append(String.valueOf(this.skipped));
        sb.append(", timedOut=").append(String.valueOf(this.timedOut));
        sb.append(", unknown=").append(String.valueOf(this.unknown));
        sb.append(", total=").append(String.valueOf(this.total));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptimizerStatisticsCollectionAggregationSummary)) {
            return false;
        }

        OptimizerStatisticsCollectionAggregationSummary other =
                (OptimizerStatisticsCollectionAggregationSummary) o;
        return java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.pending, other.pending)
                && java.util.Objects.equals(this.inProgress, other.inProgress)
                && java.util.Objects.equals(this.completed, other.completed)
                && java.util.Objects.equals(this.failed, other.failed)
                && java.util.Objects.equals(this.skipped, other.skipped)
                && java.util.Objects.equals(this.timedOut, other.timedOut)
                && java.util.Objects.equals(this.unknown, other.unknown)
                && java.util.Objects.equals(this.total, other.total)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.pending == null ? 43 : this.pending.hashCode());
        result = (result * PRIME) + (this.inProgress == null ? 43 : this.inProgress.hashCode());
        result = (result * PRIME) + (this.completed == null ? 43 : this.completed.hashCode());
        result = (result * PRIME) + (this.failed == null ? 43 : this.failed.hashCode());
        result = (result * PRIME) + (this.skipped == null ? 43 : this.skipped.hashCode());
        result = (result * PRIME) + (this.timedOut == null ? 43 : this.timedOut.hashCode());
        result = (result * PRIME) + (this.unknown == null ? 43 : this.unknown.hashCode());
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
