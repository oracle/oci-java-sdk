/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters detailing the compute performance for a specified DB system shape. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputePerformanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputePerformanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The number of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores available.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /** The amount of memory allocated for the VMDB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Double memoryInGBs;

        /**
         * The amount of memory allocated for the VMDB System.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Double memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /** The network bandwidth of the VMDB system in gbps. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
        private Float networkBandwidthInGbps;

        /**
         * The network bandwidth of the VMDB system in gbps.
         *
         * @param networkBandwidthInGbps the value to set
         * @return this builder
         */
        public Builder networkBandwidthInGbps(Float networkBandwidthInGbps) {
            this.networkBandwidthInGbps = networkBandwidthInGbps;
            this.__explicitlySet__.add("networkBandwidthInGbps");
            return this;
        }
        /** IOPS for the VMDB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
        private Float networkIops;

        /**
         * IOPS for the VMDB System.
         *
         * @param networkIops the value to set
         * @return this builder
         */
        public Builder networkIops(Float networkIops) {
            this.networkIops = networkIops;
            this.__explicitlySet__.add("networkIops");
            return this;
        }
        /** Network throughput for the VMDB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
        private Float networkThroughputInMbps;

        /**
         * Network throughput for the VMDB System.
         *
         * @param networkThroughputInMbps the value to set
         * @return this builder
         */
        public Builder networkThroughputInMbps(Float networkThroughputInMbps) {
            this.networkThroughputInMbps = networkThroughputInMbps;
            this.__explicitlySet__.add("networkThroughputInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputePerformanceSummary build() {
            ComputePerformanceSummary model =
                    new ComputePerformanceSummary(
                            this.cpuCoreCount,
                            this.memoryInGBs,
                            this.networkBandwidthInGbps,
                            this.networkIops,
                            this.networkThroughputInMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputePerformanceSummary model) {
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("networkBandwidthInGbps")) {
                this.networkBandwidthInGbps(model.getNetworkBandwidthInGbps());
            }
            if (model.wasPropertyExplicitlySet("networkIops")) {
                this.networkIops(model.getNetworkIops());
            }
            if (model.wasPropertyExplicitlySet("networkThroughputInMbps")) {
                this.networkThroughputInMbps(model.getNetworkThroughputInMbps());
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

    /** The number of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores available.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /** The amount of memory allocated for the VMDB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Double memoryInGBs;

    /**
     * The amount of memory allocated for the VMDB System.
     *
     * @return the value
     */
    public Double getMemoryInGBs() {
        return memoryInGBs;
    }

    /** The network bandwidth of the VMDB system in gbps. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthInGbps")
    private final Float networkBandwidthInGbps;

    /**
     * The network bandwidth of the VMDB system in gbps.
     *
     * @return the value
     */
    public Float getNetworkBandwidthInGbps() {
        return networkBandwidthInGbps;
    }

    /** IOPS for the VMDB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkIops")
    private final Float networkIops;

    /**
     * IOPS for the VMDB System.
     *
     * @return the value
     */
    public Float getNetworkIops() {
        return networkIops;
    }

    /** Network throughput for the VMDB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkThroughputInMbps")
    private final Float networkThroughputInMbps;

    /**
     * Network throughput for the VMDB System.
     *
     * @return the value
     */
    public Float getNetworkThroughputInMbps() {
        return networkThroughputInMbps;
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
        sb.append("ComputePerformanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", networkBandwidthInGbps=").append(String.valueOf(this.networkBandwidthInGbps));
        sb.append(", networkIops=").append(String.valueOf(this.networkIops));
        sb.append(", networkThroughputInMbps=")
                .append(String.valueOf(this.networkThroughputInMbps));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
