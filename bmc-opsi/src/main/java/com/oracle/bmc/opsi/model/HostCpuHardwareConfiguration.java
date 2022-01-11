/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * CPU Hardware Configuration metric for the host
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostCpuHardwareConfiguration.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HostCpuHardwareConfiguration extends HostConfigurationMetricGroup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
        private Integer totalSockets;

        public Builder totalSockets(Integer totalSockets) {
            this.totalSockets = totalSockets;
            this.__explicitlySet__.add("totalSockets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("frequencyInMhz")
        private Double frequencyInMhz;

        public Builder frequencyInMhz(Double frequencyInMhz) {
            this.frequencyInMhz = frequencyInMhz;
            this.__explicitlySet__.add("frequencyInMhz");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cacheInMB")
        private Double cacheInMB;

        public Builder cacheInMB(Double cacheInMB) {
            this.cacheInMB = cacheInMB;
            this.__explicitlySet__.add("cacheInMB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
        private String cpuImplementation;

        public Builder cpuImplementation(String cpuImplementation) {
            this.cpuImplementation = cpuImplementation;
            this.__explicitlySet__.add("cpuImplementation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("model")
        private String model;

        public Builder model(String model) {
            this.model = model;
            this.__explicitlySet__.add("model");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuFamily")
        private String cpuFamily;

        public Builder cpuFamily(String cpuFamily) {
            this.cpuFamily = cpuFamily;
            this.__explicitlySet__.add("cpuFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
        private Integer coresPerSocket;

        public Builder coresPerSocket(Integer coresPerSocket) {
            this.coresPerSocket = coresPerSocket;
            this.__explicitlySet__.add("coresPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
        private Integer threadsPerSocket;

        public Builder threadsPerSocket(Integer threadsPerSocket) {
            this.threadsPerSocket = threadsPerSocket;
            this.__explicitlySet__.add("threadsPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hyperThreadingEnabled")
        private String hyperThreadingEnabled;

        public Builder hyperThreadingEnabled(String hyperThreadingEnabled) {
            this.hyperThreadingEnabled = hyperThreadingEnabled;
            this.__explicitlySet__.add("hyperThreadingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCpuHardwareConfiguration build() {
            HostCpuHardwareConfiguration __instance__ =
                    new HostCpuHardwareConfiguration(
                            timeCollected,
                            totalSockets,
                            vendorName,
                            frequencyInMhz,
                            cacheInMB,
                            cpuImplementation,
                            model,
                            cpuFamily,
                            coresPerSocket,
                            threadsPerSocket,
                            hyperThreadingEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCpuHardwareConfiguration o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .totalSockets(o.getTotalSockets())
                            .vendorName(o.getVendorName())
                            .frequencyInMhz(o.getFrequencyInMhz())
                            .cacheInMB(o.getCacheInMB())
                            .cpuImplementation(o.getCpuImplementation())
                            .model(o.getModel())
                            .cpuFamily(o.getCpuFamily())
                            .coresPerSocket(o.getCoresPerSocket())
                            .threadsPerSocket(o.getThreadsPerSocket())
                            .hyperThreadingEnabled(o.getHyperThreadingEnabled());

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
    public HostCpuHardwareConfiguration(
            java.util.Date timeCollected,
            Integer totalSockets,
            String vendorName,
            Double frequencyInMhz,
            Double cacheInMB,
            String cpuImplementation,
            String model,
            String cpuFamily,
            Integer coresPerSocket,
            Integer threadsPerSocket,
            String hyperThreadingEnabled) {
        super(timeCollected);
        this.totalSockets = totalSockets;
        this.vendorName = vendorName;
        this.frequencyInMhz = frequencyInMhz;
        this.cacheInMB = cacheInMB;
        this.cpuImplementation = cpuImplementation;
        this.model = model;
        this.cpuFamily = cpuFamily;
        this.coresPerSocket = coresPerSocket;
        this.threadsPerSocket = threadsPerSocket;
        this.hyperThreadingEnabled = hyperThreadingEnabled;
    }

    /**
     * Total number of CPU Sockets
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
    Integer totalSockets;

    /**
     * Name of the CPU vendor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    String vendorName;

    /**
     * Clock frequency of the processor in megahertz
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyInMhz")
    Double frequencyInMhz;

    /**
     * Size of cache memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cacheInMB")
    Double cacheInMB;

    /**
     * Model name of processor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
    String cpuImplementation;

    /**
     * CPU model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    String model;

    /**
     * Type of processor in the system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuFamily")
    String cpuFamily;

    /**
     * Number of cores per socket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
    Integer coresPerSocket;

    /**
     * Number of threads per socket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
    Integer threadsPerSocket;

    /**
     * Indicates if hyper-threading is enabled or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hyperThreadingEnabled")
    String hyperThreadingEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
