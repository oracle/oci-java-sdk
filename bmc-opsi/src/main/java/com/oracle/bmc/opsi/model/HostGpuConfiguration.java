/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * GPU configuration metrics <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostGpuConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostGpuConfiguration extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** GPU Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
        private Integer gpuId;

        /**
         * GPU Identifier
         *
         * @param gpuId the value to set
         * @return this builder
         */
        public Builder gpuId(Integer gpuId) {
            this.gpuId = gpuId;
            this.__explicitlySet__.add("gpuId");
            return this;
        }
        /** GPU Product Name */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * GPU Product Name
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /** GPU Vendor */
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * GPU Vendor
         *
         * @param vendor the value to set
         * @return this builder
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /** Bus Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("busId")
        private String busId;

        /**
         * Bus Identifier
         *
         * @param busId the value to set
         * @return this builder
         */
        public Builder busId(String busId) {
            this.busId = busId;
            this.__explicitlySet__.add("busId");
            return this;
        }
        /** Bus Width */
        @com.fasterxml.jackson.annotation.JsonProperty("busWidth")
        private Integer busWidth;

        /**
         * Bus Width
         *
         * @param busWidth the value to set
         * @return this builder
         */
        public Builder busWidth(Integer busWidth) {
            this.busWidth = busWidth;
            this.__explicitlySet__.add("busWidth");
            return this;
        }
        /** GPU Capabilities */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuCapabilities")
        private String gpuCapabilities;

        /**
         * GPU Capabilities
         *
         * @param gpuCapabilities the value to set
         * @return this builder
         */
        public Builder gpuCapabilities(String gpuCapabilities) {
            this.gpuCapabilities = gpuCapabilities;
            this.__explicitlySet__.add("gpuCapabilities");
            return this;
        }
        /** Power Capacity */
        @com.fasterxml.jackson.annotation.JsonProperty("totalPower")
        private Double totalPower;

        /**
         * Power Capacity
         *
         * @param totalPower the value to set
         * @return this builder
         */
        public Builder totalPower(Double totalPower) {
            this.totalPower = totalPower;
            this.__explicitlySet__.add("totalPower");
            return this;
        }
        /** Total Memory Allocated to GPU */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemory")
        private Double totalMemory;

        /**
         * Total Memory Allocated to GPU
         *
         * @param totalMemory the value to set
         * @return this builder
         */
        public Builder totalMemory(Double totalMemory) {
            this.totalMemory = totalMemory;
            this.__explicitlySet__.add("totalMemory");
            return this;
        }
        /** Max Video Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("totalVideoClockSpeed")
        private Double totalVideoClockSpeed;

        /**
         * Max Video Clock Speed
         *
         * @param totalVideoClockSpeed the value to set
         * @return this builder
         */
        public Builder totalVideoClockSpeed(Double totalVideoClockSpeed) {
            this.totalVideoClockSpeed = totalVideoClockSpeed;
            this.__explicitlySet__.add("totalVideoClockSpeed");
            return this;
        }
        /** Max SM (Streaming Multiprocessor) Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSmClockSpeed")
        private Double totalSmClockSpeed;

        /**
         * Max SM (Streaming Multiprocessor) Clock Speed
         *
         * @param totalSmClockSpeed the value to set
         * @return this builder
         */
        public Builder totalSmClockSpeed(Double totalSmClockSpeed) {
            this.totalSmClockSpeed = totalSmClockSpeed;
            this.__explicitlySet__.add("totalSmClockSpeed");
            return this;
        }
        /** Max Graphics Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("totalGraphicsClockSpeed")
        private Double totalGraphicsClockSpeed;

        /**
         * Max Graphics Clock Speed
         *
         * @param totalGraphicsClockSpeed the value to set
         * @return this builder
         */
        public Builder totalGraphicsClockSpeed(Double totalGraphicsClockSpeed) {
            this.totalGraphicsClockSpeed = totalGraphicsClockSpeed;
            this.__explicitlySet__.add("totalGraphicsClockSpeed");
            return this;
        }
        /** Max Memory Clock Speed */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryClockSpeed")
        private Double totalMemoryClockSpeed;

        /**
         * Max Memory Clock Speed
         *
         * @param totalMemoryClockSpeed the value to set
         * @return this builder
         */
        public Builder totalMemoryClockSpeed(Double totalMemoryClockSpeed) {
            this.totalMemoryClockSpeed = totalMemoryClockSpeed;
            this.__explicitlySet__.add("totalMemoryClockSpeed");
            return this;
        }
        /** CUDA library version */
        @com.fasterxml.jackson.annotation.JsonProperty("cudaVersion")
        private String cudaVersion;

        /**
         * CUDA library version
         *
         * @param cudaVersion the value to set
         * @return this builder
         */
        public Builder cudaVersion(String cudaVersion) {
            this.cudaVersion = cudaVersion;
            this.__explicitlySet__.add("cudaVersion");
            return this;
        }
        /** GPU Driver version */
        @com.fasterxml.jackson.annotation.JsonProperty("driverVersion")
        private String driverVersion;

        /**
         * GPU Driver version
         *
         * @param driverVersion the value to set
         * @return this builder
         */
        public Builder driverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            this.__explicitlySet__.add("driverVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostGpuConfiguration build() {
            HostGpuConfiguration model =
                    new HostGpuConfiguration(
                            this.timeCollected,
                            this.gpuId,
                            this.productName,
                            this.vendor,
                            this.busId,
                            this.busWidth,
                            this.gpuCapabilities,
                            this.totalPower,
                            this.totalMemory,
                            this.totalVideoClockSpeed,
                            this.totalSmClockSpeed,
                            this.totalGraphicsClockSpeed,
                            this.totalMemoryClockSpeed,
                            this.cudaVersion,
                            this.driverVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostGpuConfiguration model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("gpuId")) {
                this.gpuId(model.getGpuId());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("busId")) {
                this.busId(model.getBusId());
            }
            if (model.wasPropertyExplicitlySet("busWidth")) {
                this.busWidth(model.getBusWidth());
            }
            if (model.wasPropertyExplicitlySet("gpuCapabilities")) {
                this.gpuCapabilities(model.getGpuCapabilities());
            }
            if (model.wasPropertyExplicitlySet("totalPower")) {
                this.totalPower(model.getTotalPower());
            }
            if (model.wasPropertyExplicitlySet("totalMemory")) {
                this.totalMemory(model.getTotalMemory());
            }
            if (model.wasPropertyExplicitlySet("totalVideoClockSpeed")) {
                this.totalVideoClockSpeed(model.getTotalVideoClockSpeed());
            }
            if (model.wasPropertyExplicitlySet("totalSmClockSpeed")) {
                this.totalSmClockSpeed(model.getTotalSmClockSpeed());
            }
            if (model.wasPropertyExplicitlySet("totalGraphicsClockSpeed")) {
                this.totalGraphicsClockSpeed(model.getTotalGraphicsClockSpeed());
            }
            if (model.wasPropertyExplicitlySet("totalMemoryClockSpeed")) {
                this.totalMemoryClockSpeed(model.getTotalMemoryClockSpeed());
            }
            if (model.wasPropertyExplicitlySet("cudaVersion")) {
                this.cudaVersion(model.getCudaVersion());
            }
            if (model.wasPropertyExplicitlySet("driverVersion")) {
                this.driverVersion(model.getDriverVersion());
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

    @Deprecated
    public HostGpuConfiguration(
            java.util.Date timeCollected,
            Integer gpuId,
            String productName,
            String vendor,
            String busId,
            Integer busWidth,
            String gpuCapabilities,
            Double totalPower,
            Double totalMemory,
            Double totalVideoClockSpeed,
            Double totalSmClockSpeed,
            Double totalGraphicsClockSpeed,
            Double totalMemoryClockSpeed,
            String cudaVersion,
            String driverVersion) {
        super(timeCollected);
        this.gpuId = gpuId;
        this.productName = productName;
        this.vendor = vendor;
        this.busId = busId;
        this.busWidth = busWidth;
        this.gpuCapabilities = gpuCapabilities;
        this.totalPower = totalPower;
        this.totalMemory = totalMemory;
        this.totalVideoClockSpeed = totalVideoClockSpeed;
        this.totalSmClockSpeed = totalSmClockSpeed;
        this.totalGraphicsClockSpeed = totalGraphicsClockSpeed;
        this.totalMemoryClockSpeed = totalMemoryClockSpeed;
        this.cudaVersion = cudaVersion;
        this.driverVersion = driverVersion;
    }

    /** GPU Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuId")
    private final Integer gpuId;

    /**
     * GPU Identifier
     *
     * @return the value
     */
    public Integer getGpuId() {
        return gpuId;
    }

    /** GPU Product Name */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * GPU Product Name
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /** GPU Vendor */
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * GPU Vendor
     *
     * @return the value
     */
    public String getVendor() {
        return vendor;
    }

    /** Bus Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("busId")
    private final String busId;

    /**
     * Bus Identifier
     *
     * @return the value
     */
    public String getBusId() {
        return busId;
    }

    /** Bus Width */
    @com.fasterxml.jackson.annotation.JsonProperty("busWidth")
    private final Integer busWidth;

    /**
     * Bus Width
     *
     * @return the value
     */
    public Integer getBusWidth() {
        return busWidth;
    }

    /** GPU Capabilities */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuCapabilities")
    private final String gpuCapabilities;

    /**
     * GPU Capabilities
     *
     * @return the value
     */
    public String getGpuCapabilities() {
        return gpuCapabilities;
    }

    /** Power Capacity */
    @com.fasterxml.jackson.annotation.JsonProperty("totalPower")
    private final Double totalPower;

    /**
     * Power Capacity
     *
     * @return the value
     */
    public Double getTotalPower() {
        return totalPower;
    }

    /** Total Memory Allocated to GPU */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemory")
    private final Double totalMemory;

    /**
     * Total Memory Allocated to GPU
     *
     * @return the value
     */
    public Double getTotalMemory() {
        return totalMemory;
    }

    /** Max Video Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("totalVideoClockSpeed")
    private final Double totalVideoClockSpeed;

    /**
     * Max Video Clock Speed
     *
     * @return the value
     */
    public Double getTotalVideoClockSpeed() {
        return totalVideoClockSpeed;
    }

    /** Max SM (Streaming Multiprocessor) Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSmClockSpeed")
    private final Double totalSmClockSpeed;

    /**
     * Max SM (Streaming Multiprocessor) Clock Speed
     *
     * @return the value
     */
    public Double getTotalSmClockSpeed() {
        return totalSmClockSpeed;
    }

    /** Max Graphics Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("totalGraphicsClockSpeed")
    private final Double totalGraphicsClockSpeed;

    /**
     * Max Graphics Clock Speed
     *
     * @return the value
     */
    public Double getTotalGraphicsClockSpeed() {
        return totalGraphicsClockSpeed;
    }

    /** Max Memory Clock Speed */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryClockSpeed")
    private final Double totalMemoryClockSpeed;

    /**
     * Max Memory Clock Speed
     *
     * @return the value
     */
    public Double getTotalMemoryClockSpeed() {
        return totalMemoryClockSpeed;
    }

    /** CUDA library version */
    @com.fasterxml.jackson.annotation.JsonProperty("cudaVersion")
    private final String cudaVersion;

    /**
     * CUDA library version
     *
     * @return the value
     */
    public String getCudaVersion() {
        return cudaVersion;
    }

    /** GPU Driver version */
    @com.fasterxml.jackson.annotation.JsonProperty("driverVersion")
    private final String driverVersion;

    /**
     * GPU Driver version
     *
     * @return the value
     */
    public String getDriverVersion() {
        return driverVersion;
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
        sb.append("HostGpuConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", gpuId=").append(String.valueOf(this.gpuId));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", busId=").append(String.valueOf(this.busId));
        sb.append(", busWidth=").append(String.valueOf(this.busWidth));
        sb.append(", gpuCapabilities=").append(String.valueOf(this.gpuCapabilities));
        sb.append(", totalPower=").append(String.valueOf(this.totalPower));
        sb.append(", totalMemory=").append(String.valueOf(this.totalMemory));
        sb.append(", totalVideoClockSpeed=").append(String.valueOf(this.totalVideoClockSpeed));
        sb.append(", totalSmClockSpeed=").append(String.valueOf(this.totalSmClockSpeed));
        sb.append(", totalGraphicsClockSpeed=")
                .append(String.valueOf(this.totalGraphicsClockSpeed));
        sb.append(", totalMemoryClockSpeed=").append(String.valueOf(this.totalMemoryClockSpeed));
        sb.append(", cudaVersion=").append(String.valueOf(this.cudaVersion));
        sb.append(", driverVersion=").append(String.valueOf(this.driverVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostGpuConfiguration)) {
            return false;
        }

        HostGpuConfiguration other = (HostGpuConfiguration) o;
        return java.util.Objects.equals(this.gpuId, other.gpuId)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(this.busId, other.busId)
                && java.util.Objects.equals(this.busWidth, other.busWidth)
                && java.util.Objects.equals(this.gpuCapabilities, other.gpuCapabilities)
                && java.util.Objects.equals(this.totalPower, other.totalPower)
                && java.util.Objects.equals(this.totalMemory, other.totalMemory)
                && java.util.Objects.equals(this.totalVideoClockSpeed, other.totalVideoClockSpeed)
                && java.util.Objects.equals(this.totalSmClockSpeed, other.totalSmClockSpeed)
                && java.util.Objects.equals(
                        this.totalGraphicsClockSpeed, other.totalGraphicsClockSpeed)
                && java.util.Objects.equals(this.totalMemoryClockSpeed, other.totalMemoryClockSpeed)
                && java.util.Objects.equals(this.cudaVersion, other.cudaVersion)
                && java.util.Objects.equals(this.driverVersion, other.driverVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.gpuId == null ? 43 : this.gpuId.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.busId == null ? 43 : this.busId.hashCode());
        result = (result * PRIME) + (this.busWidth == null ? 43 : this.busWidth.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuCapabilities == null ? 43 : this.gpuCapabilities.hashCode());
        result = (result * PRIME) + (this.totalPower == null ? 43 : this.totalPower.hashCode());
        result = (result * PRIME) + (this.totalMemory == null ? 43 : this.totalMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.totalVideoClockSpeed == null
                                ? 43
                                : this.totalVideoClockSpeed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSmClockSpeed == null ? 43 : this.totalSmClockSpeed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalGraphicsClockSpeed == null
                                ? 43
                                : this.totalGraphicsClockSpeed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryClockSpeed == null
                                ? 43
                                : this.totalMemoryClockSpeed.hashCode());
        result = (result * PRIME) + (this.cudaVersion == null ? 43 : this.cudaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.driverVersion == null ? 43 : this.driverVersion.hashCode());
        return result;
    }
}
