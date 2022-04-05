/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Aggregated data for top processes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopProcessesUsageTrend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TopProcessesUsageTrend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
        private Double cpuUsage;

        public Builder cpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            this.__explicitlySet__.add("cpuUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
        private Double cpuUtilization;

        public Builder cpuUtilization(Double cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            this.__explicitlySet__.add("cpuUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
        private Double memoryUtilization;

        public Builder memoryUtilization(Double memoryUtilization) {
            this.memoryUtilization = memoryUtilization;
            this.__explicitlySet__.add("memoryUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
        private Double virtualMemoryInMBs;

        public Builder virtualMemoryInMBs(Double virtualMemoryInMBs) {
            this.virtualMemoryInMBs = virtualMemoryInMBs;
            this.__explicitlySet__.add("virtualMemoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
        private Double physicalMemoryInMBs;

        public Builder physicalMemoryInMBs(Double physicalMemoryInMBs) {
            this.physicalMemoryInMBs = physicalMemoryInMBs;
            this.__explicitlySet__.add("physicalMemoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
        private Integer maxProcessCount;

        public Builder maxProcessCount(Integer maxProcessCount) {
            this.maxProcessCount = maxProcessCount;
            this.__explicitlySet__.add("maxProcessCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopProcessesUsageTrend build() {
            TopProcessesUsageTrend __instance__ =
                    new TopProcessesUsageTrend(
                            endTimestamp,
                            cpuUsage,
                            cpuUtilization,
                            memoryUtilization,
                            virtualMemoryInMBs,
                            physicalMemoryInMBs,
                            maxProcessCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopProcessesUsageTrend o) {
            Builder copiedBuilder =
                    endTimestamp(o.getEndTimestamp())
                            .cpuUsage(o.getCpuUsage())
                            .cpuUtilization(o.getCpuUtilization())
                            .memoryUtilization(o.getMemoryUtilization())
                            .virtualMemoryInMBs(o.getVirtualMemoryInMBs())
                            .physicalMemoryInMBs(o.getPhysicalMemoryInMBs())
                            .maxProcessCount(o.getMaxProcessCount());

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
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    java.util.Date endTimestamp;

    /**
     * Process CPU usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsage")
    Double cpuUsage;

    /**
     * Process CPU utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUtilization")
    Double cpuUtilization;

    /**
     * Process memory utilization percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilization")
    Double memoryUtilization;

    /**
     * Process virtual memory in Megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualMemoryInMBs")
    Double virtualMemoryInMBs;

    /**
     * Procress physical memory in Megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("physicalMemoryInMBs")
    Double physicalMemoryInMBs;

    /**
     * Maximum number of processes running at time of collection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxProcessCount")
    Integer maxProcessCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
