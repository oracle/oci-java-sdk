/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * CPU Usage metric for the host
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostCpuUsage.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HostCpuUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUserModeInPercent")
        private Float cpuUserModeInPercent;

        public Builder cpuUserModeInPercent(Float cpuUserModeInPercent) {
            this.cpuUserModeInPercent = cpuUserModeInPercent;
            this.__explicitlySet__.add("cpuUserModeInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuSystemModeInPercent")
        private Float cpuSystemModeInPercent;

        public Builder cpuSystemModeInPercent(Float cpuSystemModeInPercent) {
            this.cpuSystemModeInPercent = cpuSystemModeInPercent;
            this.__explicitlySet__.add("cpuSystemModeInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSec")
        private Double cpuUsageInSec;

        public Builder cpuUsageInSec(Double cpuUsageInSec) {
            this.cpuUsageInSec = cpuUsageInSec;
            this.__explicitlySet__.add("cpuUsageInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationInPercent")
        private Float cpuUtilizationInPercent;

        public Builder cpuUtilizationInPercent(Float cpuUtilizationInPercent) {
            this.cpuUtilizationInPercent = cpuUtilizationInPercent;
            this.__explicitlySet__.add("cpuUtilizationInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuStolenInPercent")
        private Float cpuStolenInPercent;

        public Builder cpuStolenInPercent(Float cpuStolenInPercent) {
            this.cpuStolenInPercent = cpuStolenInPercent;
            this.__explicitlySet__.add("cpuStolenInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuIdleInPercent")
        private Float cpuIdleInPercent;

        public Builder cpuIdleInPercent(Float cpuIdleInPercent) {
            this.cpuIdleInPercent = cpuIdleInPercent;
            this.__explicitlySet__.add("cpuIdleInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad1min")
        private Float cpuLoad1min;

        public Builder cpuLoad1min(Float cpuLoad1min) {
            this.cpuLoad1min = cpuLoad1min;
            this.__explicitlySet__.add("cpuLoad1min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad5min")
        private Float cpuLoad5min;

        public Builder cpuLoad5min(Float cpuLoad5min) {
            this.cpuLoad5min = cpuLoad5min;
            this.__explicitlySet__.add("cpuLoad5min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad15min")
        private Float cpuLoad15min;

        public Builder cpuLoad15min(Float cpuLoad15min) {
            this.cpuLoad15min = cpuLoad15min;
            this.__explicitlySet__.add("cpuLoad15min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCpuUsage build() {
            HostCpuUsage __instance__ =
                    new HostCpuUsage(
                            timeCollected,
                            cpuUserModeInPercent,
                            cpuSystemModeInPercent,
                            cpuUsageInSec,
                            cpuUtilizationInPercent,
                            cpuStolenInPercent,
                            cpuIdleInPercent,
                            cpuLoad1min,
                            cpuLoad5min,
                            cpuLoad15min);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCpuUsage o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .cpuUserModeInPercent(o.getCpuUserModeInPercent())
                            .cpuSystemModeInPercent(o.getCpuSystemModeInPercent())
                            .cpuUsageInSec(o.getCpuUsageInSec())
                            .cpuUtilizationInPercent(o.getCpuUtilizationInPercent())
                            .cpuStolenInPercent(o.getCpuStolenInPercent())
                            .cpuIdleInPercent(o.getCpuIdleInPercent())
                            .cpuLoad1min(o.getCpuLoad1min())
                            .cpuLoad5min(o.getCpuLoad5min())
                            .cpuLoad15min(o.getCpuLoad15min());

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

    @Deprecated
    public HostCpuUsage(
            java.util.Date timeCollected,
            Float cpuUserModeInPercent,
            Float cpuSystemModeInPercent,
            Double cpuUsageInSec,
            Float cpuUtilizationInPercent,
            Float cpuStolenInPercent,
            Float cpuIdleInPercent,
            Float cpuLoad1min,
            Float cpuLoad5min,
            Float cpuLoad15min) {
        super(timeCollected);
        this.cpuUserModeInPercent = cpuUserModeInPercent;
        this.cpuSystemModeInPercent = cpuSystemModeInPercent;
        this.cpuUsageInSec = cpuUsageInSec;
        this.cpuUtilizationInPercent = cpuUtilizationInPercent;
        this.cpuStolenInPercent = cpuStolenInPercent;
        this.cpuIdleInPercent = cpuIdleInPercent;
        this.cpuLoad1min = cpuLoad1min;
        this.cpuLoad5min = cpuLoad5min;
        this.cpuLoad15min = cpuLoad15min;
    }

    /**
     * Percentage of CPU time spent in user mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUserModeInPercent")
    Float cpuUserModeInPercent;

    /**
     * Percentage of CPU time spent in system mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuSystemModeInPercent")
    Float cpuSystemModeInPercent;

    /**
     * Amount of CPU Time spent in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsageInSec")
    Double cpuUsageInSec;

    /**
     * Amount of CPU Time spent in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilizationInPercent")
    Float cpuUtilizationInPercent;

    /**
     * Amount of CPU time stolen in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuStolenInPercent")
    Float cpuStolenInPercent;

    /**
     * Amount of CPU idle time in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuIdleInPercent")
    Float cpuIdleInPercent;

    /**
     * Load average in the last 1 minute
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad1min")
    Float cpuLoad1min;

    /**
     * Load average in the last 5 minutes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad5min")
    Float cpuLoad5min;

    /**
     * Load average in the last 15 minutes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuLoad15min")
    Float cpuLoad15min;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
