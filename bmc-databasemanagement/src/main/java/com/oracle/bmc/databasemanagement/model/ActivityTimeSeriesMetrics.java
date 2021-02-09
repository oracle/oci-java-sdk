/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response object representing activityMetric details for a specific database at a particular time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ActivityTimeSeriesMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ActivityTimeSeriesMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
        private MetricDataPoint cpuTime;

        public Builder cpuTime(MetricDataPoint cpuTime) {
            this.cpuTime = cpuTime;
            this.__explicitlySet__.add("cpuTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
        private MetricDataPoint waitTime;

        public Builder waitTime(MetricDataPoint waitTime) {
            this.waitTime = waitTime;
            this.__explicitlySet__.add("waitTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
        private MetricDataPoint userIoTime;

        public Builder userIoTime(MetricDataPoint userIoTime) {
            this.userIoTime = userIoTime;
            this.__explicitlySet__.add("userIoTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private MetricDataPoint cpuCount;

        public Builder cpuCount(MetricDataPoint cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityTimeSeriesMetrics build() {
            ActivityTimeSeriesMetrics __instance__ =
                    new ActivityTimeSeriesMetrics(
                            timestamp, cpuTime, waitTime, userIoTime, cpuCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityTimeSeriesMetrics o) {
            Builder copiedBuilder =
                    timestamp(o.getTimestamp())
                            .cpuTime(o.getCpuTime())
                            .waitTime(o.getWaitTime())
                            .userIoTime(o.getUserIoTime())
                            .cpuCount(o.getCpuCount());

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
     * The date and time the activity metric was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
    MetricDataPoint cpuTime;

    @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
    MetricDataPoint waitTime;

    @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
    MetricDataPoint userIoTime;

    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    MetricDataPoint cpuCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
