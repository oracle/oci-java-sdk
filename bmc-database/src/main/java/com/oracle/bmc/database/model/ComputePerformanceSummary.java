/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters detailing the compute performance for a specified DB system shape.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputePerformanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ComputePerformanceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Double memoryInGBs;

        public Builder memoryInGBs(Double memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
        private Float networkBandwidthInGbps;

        public Builder networkBandwidthInGbps(Float networkBandwidthInGbps) {
            this.networkBandwidthInGbps = networkBandwidthInGbps;
            this.__explicitlySet__.add("networkBandwidthInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
        private Float networkIops;

        public Builder networkIops(Float networkIops) {
            this.networkIops = networkIops;
            this.__explicitlySet__.add("networkIops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
        private Float networkThroughputInMbps;

        public Builder networkThroughputInMbps(Float networkThroughputInMbps) {
            this.networkThroughputInMbps = networkThroughputInMbps;
            this.__explicitlySet__.add("networkThroughputInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputePerformanceSummary build() {
            ComputePerformanceSummary __instance__ =
                    new ComputePerformanceSummary(
                            cpuCoreCount,
                            memoryInGBs,
                            networkBandwidthInGbps,
                            networkIops,
                            networkThroughputInMbps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputePerformanceSummary o) {
            Builder copiedBuilder =
                    cpuCoreCount(o.getCpuCoreCount())
                            .memoryInGBs(o.getMemoryInGBs())
                            .networkBandwidthInGbps(o.getNetworkBandwidthInGbps())
                            .networkIops(o.getNetworkIops())
                            .networkThroughputInMbps(o.getNetworkThroughputInMbps());

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
     * The number of OCPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The amount of memory allocated for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Double memoryInGBs;

    /**
     * The network bandwidth of the VMDB system in gbps.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
    Float networkBandwidthInGbps;

    /**
     * IOPS for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
    Float networkIops;

    /**
     * Network throughput for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
    Float networkThroughputInMbps;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
