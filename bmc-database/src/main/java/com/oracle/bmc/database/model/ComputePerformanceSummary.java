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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputePerformanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputePerformanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpuCoreCount",
        "memoryInGBs",
        "networkBandwidthInGbps",
        "networkIops",
        "networkThroughputInMbps"
    })
    public ComputePerformanceSummary(
            Integer cpuCoreCount,
            Double memoryInGBs,
            Float networkBandwidthInGbps,
            Float networkIops,
            Float networkThroughputInMbps) {
        super();
        this.cpuCoreCount = cpuCoreCount;
        this.memoryInGBs = memoryInGBs;
        this.networkBandwidthInGbps = networkBandwidthInGbps;
        this.networkIops = networkIops;
        this.networkThroughputInMbps = networkThroughputInMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of OCPU cores available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of OCPU cores available.
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The amount of memory allocated for the VMDB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Double memoryInGBs;

        /**
         * The amount of memory allocated for the VMDB System.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Double memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * The network bandwidth of the VMDB system in gbps.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
        private Float networkBandwidthInGbps;

        /**
         * The network bandwidth of the VMDB system in gbps.
         * @param networkBandwidthInGbps the value to set
         * @return this builder
         **/
        public Builder networkBandwidthInGbps(Float networkBandwidthInGbps) {
            this.networkBandwidthInGbps = networkBandwidthInGbps;
            this.__explicitlySet__.add("networkBandwidthInGbps");
            return this;
        }
        /**
         * IOPS for the VMDB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
        private Float networkIops;

        /**
         * IOPS for the VMDB System.
         * @param networkIops the value to set
         * @return this builder
         **/
        public Builder networkIops(Float networkIops) {
            this.networkIops = networkIops;
            this.__explicitlySet__.add("networkIops");
            return this;
        }
        /**
         * Network throughput for the VMDB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
        private Float networkThroughputInMbps;

        /**
         * Network throughput for the VMDB System.
         * @param networkThroughputInMbps the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of OCPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of OCPU cores available.
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The amount of memory allocated for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Double memoryInGBs;

    /**
     * The amount of memory allocated for the VMDB System.
     * @return the value
     **/
    public Double getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The network bandwidth of the VMDB system in gbps.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
    private final Float networkBandwidthInGbps;

    /**
     * The network bandwidth of the VMDB system in gbps.
     * @return the value
     **/
    public Float getNetworkBandwidthInGbps() {
        return networkBandwidthInGbps;
    }

    /**
     * IOPS for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
    private final Float networkIops;

    /**
     * IOPS for the VMDB System.
     * @return the value
     **/
    public Float getNetworkIops() {
        return networkIops;
    }

    /**
     * Network throughput for the VMDB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
    private final Float networkThroughputInMbps;

    /**
     * Network throughput for the VMDB System.
     * @return the value
     **/
    public Float getNetworkThroughputInMbps() {
        return networkThroughputInMbps;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComputePerformanceSummary(");
        sb.append("cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", networkBandwidthInGbps=").append(String.valueOf(this.networkBandwidthInGbps));
        sb.append(", networkIops=").append(String.valueOf(this.networkIops));
        sb.append(", networkThroughputInMbps=")
                .append(String.valueOf(this.networkThroughputInMbps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputePerformanceSummary)) {
            return false;
        }

        ComputePerformanceSummary other = (ComputePerformanceSummary) o;
        return java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(
                        this.networkBandwidthInGbps, other.networkBandwidthInGbps)
                && java.util.Objects.equals(this.networkIops, other.networkIops)
                && java.util.Objects.equals(
                        this.networkThroughputInMbps, other.networkThroughputInMbps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBandwidthInGbps == null
                                ? 43
                                : this.networkBandwidthInGbps.hashCode());
        result = (result * PRIME) + (this.networkIops == null ? 43 : this.networkIops.hashCode());
        result =
                (result * PRIME)
                        + (this.networkThroughputInMbps == null
                                ? 43
                                : this.networkThroughputInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
