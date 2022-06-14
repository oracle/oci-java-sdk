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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostCpuHardwareConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostCpuHardwareConfiguration extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Total number of CPU Sockets
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
        private Integer totalSockets;

        /**
         * Total number of CPU Sockets
         * @param totalSockets the value to set
         * @return this builder
         **/
        public Builder totalSockets(Integer totalSockets) {
            this.totalSockets = totalSockets;
            this.__explicitlySet__.add("totalSockets");
            return this;
        }
        /**
         * Name of the CPU vendor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        /**
         * Name of the CPU vendor
         * @param vendorName the value to set
         * @return this builder
         **/
        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * Clock frequency of the processor in megahertz
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyInMhz")
        private Double frequencyInMhz;

        /**
         * Clock frequency of the processor in megahertz
         * @param frequencyInMhz the value to set
         * @return this builder
         **/
        public Builder frequencyInMhz(Double frequencyInMhz) {
            this.frequencyInMhz = frequencyInMhz;
            this.__explicitlySet__.add("frequencyInMhz");
            return this;
        }
        /**
         * Size of cache memory in megabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cacheInMB")
        private Double cacheInMB;

        /**
         * Size of cache memory in megabytes
         * @param cacheInMB the value to set
         * @return this builder
         **/
        public Builder cacheInMB(Double cacheInMB) {
            this.cacheInMB = cacheInMB;
            this.__explicitlySet__.add("cacheInMB");
            return this;
        }
        /**
         * Model name of processor
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
        private String cpuImplementation;

        /**
         * Model name of processor
         * @param cpuImplementation the value to set
         * @return this builder
         **/
        public Builder cpuImplementation(String cpuImplementation) {
            this.cpuImplementation = cpuImplementation;
            this.__explicitlySet__.add("cpuImplementation");
            return this;
        }
        /**
         * CPU model
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("model")
        private String model;

        /**
         * CPU model
         * @param model the value to set
         * @return this builder
         **/
        public Builder model(String model) {
            this.model = model;
            this.__explicitlySet__.add("model");
            return this;
        }
        /**
         * Type of processor in the system
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuFamily")
        private String cpuFamily;

        /**
         * Type of processor in the system
         * @param cpuFamily the value to set
         * @return this builder
         **/
        public Builder cpuFamily(String cpuFamily) {
            this.cpuFamily = cpuFamily;
            this.__explicitlySet__.add("cpuFamily");
            return this;
        }
        /**
         * Number of cores per socket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
        private Integer coresPerSocket;

        /**
         * Number of cores per socket
         * @param coresPerSocket the value to set
         * @return this builder
         **/
        public Builder coresPerSocket(Integer coresPerSocket) {
            this.coresPerSocket = coresPerSocket;
            this.__explicitlySet__.add("coresPerSocket");
            return this;
        }
        /**
         * Number of threads per socket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
        private Integer threadsPerSocket;

        /**
         * Number of threads per socket
         * @param threadsPerSocket the value to set
         * @return this builder
         **/
        public Builder threadsPerSocket(Integer threadsPerSocket) {
            this.threadsPerSocket = threadsPerSocket;
            this.__explicitlySet__.add("threadsPerSocket");
            return this;
        }
        /**
         * Indicates if hyper-threading is enabled or not
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hyperThreadingEnabled")
        private String hyperThreadingEnabled;

        /**
         * Indicates if hyper-threading is enabled or not
         * @param hyperThreadingEnabled the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final Integer totalSockets;

    /**
     * Total number of CPU Sockets
     * @return the value
     **/
    public Integer getTotalSockets() {
        return totalSockets;
    }

    /**
     * Name of the CPU vendor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final String vendorName;

    /**
     * Name of the CPU vendor
     * @return the value
     **/
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Clock frequency of the processor in megahertz
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyInMhz")
    private final Double frequencyInMhz;

    /**
     * Clock frequency of the processor in megahertz
     * @return the value
     **/
    public Double getFrequencyInMhz() {
        return frequencyInMhz;
    }

    /**
     * Size of cache memory in megabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cacheInMB")
    private final Double cacheInMB;

    /**
     * Size of cache memory in megabytes
     * @return the value
     **/
    public Double getCacheInMB() {
        return cacheInMB;
    }

    /**
     * Model name of processor
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
    private final String cpuImplementation;

    /**
     * Model name of processor
     * @return the value
     **/
    public String getCpuImplementation() {
        return cpuImplementation;
    }

    /**
     * CPU model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    private final String model;

    /**
     * CPU model
     * @return the value
     **/
    public String getModel() {
        return model;
    }

    /**
     * Type of processor in the system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuFamily")
    private final String cpuFamily;

    /**
     * Type of processor in the system
     * @return the value
     **/
    public String getCpuFamily() {
        return cpuFamily;
    }

    /**
     * Number of cores per socket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
    private final Integer coresPerSocket;

    /**
     * Number of cores per socket
     * @return the value
     **/
    public Integer getCoresPerSocket() {
        return coresPerSocket;
    }

    /**
     * Number of threads per socket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
    private final Integer threadsPerSocket;

    /**
     * Number of threads per socket
     * @return the value
     **/
    public Integer getThreadsPerSocket() {
        return threadsPerSocket;
    }

    /**
     * Indicates if hyper-threading is enabled or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hyperThreadingEnabled")
    private final String hyperThreadingEnabled;

    /**
     * Indicates if hyper-threading is enabled or not
     * @return the value
     **/
    public String getHyperThreadingEnabled() {
        return hyperThreadingEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HostCpuHardwareConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append(", totalSockets=").append(String.valueOf(this.totalSockets));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", frequencyInMhz=").append(String.valueOf(this.frequencyInMhz));
        sb.append(", cacheInMB=").append(String.valueOf(this.cacheInMB));
        sb.append(", cpuImplementation=").append(String.valueOf(this.cpuImplementation));
        sb.append(", model=").append(String.valueOf(this.model));
        sb.append(", cpuFamily=").append(String.valueOf(this.cpuFamily));
        sb.append(", coresPerSocket=").append(String.valueOf(this.coresPerSocket));
        sb.append(", threadsPerSocket=").append(String.valueOf(this.threadsPerSocket));
        sb.append(", hyperThreadingEnabled=").append(String.valueOf(this.hyperThreadingEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostCpuHardwareConfiguration)) {
            return false;
        }

        HostCpuHardwareConfiguration other = (HostCpuHardwareConfiguration) o;
        return java.util.Objects.equals(this.totalSockets, other.totalSockets)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.frequencyInMhz, other.frequencyInMhz)
                && java.util.Objects.equals(this.cacheInMB, other.cacheInMB)
                && java.util.Objects.equals(this.cpuImplementation, other.cpuImplementation)
                && java.util.Objects.equals(this.model, other.model)
                && java.util.Objects.equals(this.cpuFamily, other.cpuFamily)
                && java.util.Objects.equals(this.coresPerSocket, other.coresPerSocket)
                && java.util.Objects.equals(this.threadsPerSocket, other.threadsPerSocket)
                && java.util.Objects.equals(this.hyperThreadingEnabled, other.hyperThreadingEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.totalSockets == null ? 43 : this.totalSockets.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyInMhz == null ? 43 : this.frequencyInMhz.hashCode());
        result = (result * PRIME) + (this.cacheInMB == null ? 43 : this.cacheInMB.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuImplementation == null ? 43 : this.cpuImplementation.hashCode());
        result = (result * PRIME) + (this.model == null ? 43 : this.model.hashCode());
        result = (result * PRIME) + (this.cpuFamily == null ? 43 : this.cpuFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.coresPerSocket == null ? 43 : this.coresPerSocket.hashCode());
        result =
                (result * PRIME)
                        + (this.threadsPerSocket == null ? 43 : this.threadsPerSocket.hashCode());
        result =
                (result * PRIME)
                        + (this.hyperThreadingEnabled == null
                                ? 43
                                : this.hyperThreadingEnabled.hashCode());
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
