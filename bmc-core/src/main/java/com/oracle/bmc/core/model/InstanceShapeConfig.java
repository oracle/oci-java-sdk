/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape configuration for an instance. The shape configuration determines the resources
 * allocated to an instance. <br>
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
        builder = InstanceShapeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceShapeConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ocpus",
        "memoryInGBs",
        "baselineOcpuUtilization",
        "processorDescription",
        "networkingBandwidthInGbps",
        "maxVnicAttachments",
        "gpus",
        "gpuDescription",
        "localDisks",
        "localDisksTotalSizeInGBs",
        "localDiskDescription",
        "vcpus"
    })
    public InstanceShapeConfig(
            Float ocpus,
            Float memoryInGBs,
            BaselineOcpuUtilization baselineOcpuUtilization,
            String processorDescription,
            Float networkingBandwidthInGbps,
            Integer maxVnicAttachments,
            Integer gpus,
            String gpuDescription,
            Integer localDisks,
            Float localDisksTotalSizeInGBs,
            String localDiskDescription,
            Integer vcpus) {
        super();
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.baselineOcpuUtilization = baselineOcpuUtilization;
        this.processorDescription = processorDescription;
        this.networkingBandwidthInGbps = networkingBandwidthInGbps;
        this.maxVnicAttachments = maxVnicAttachments;
        this.gpus = gpus;
        this.gpuDescription = gpuDescription;
        this.localDisks = localDisks;
        this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
        this.localDiskDescription = localDiskDescription;
        this.vcpus = vcpus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of OCPUs available to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * The total number of OCPUs available to the instance.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /** The total amount of memory available to the instance, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * The total amount of memory available to the instance, in gigabytes.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute
         * blank for a non-burstable instance, or explicitly specify non-burstable with {@code
         * BASELINE_1_1}.
         *
         * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of
         * an OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code
         * BASELINE_1_1} - baseline usage is the entire OCPU. This represents a non-burstable
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
        private BaselineOcpuUtilization baselineOcpuUtilization;

        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute
         * blank for a non-burstable instance, or explicitly specify non-burstable with {@code
         * BASELINE_1_1}.
         *
         * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of
         * an OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code
         * BASELINE_1_1} - baseline usage is the entire OCPU. This represents a non-burstable
         * instance.
         *
         * @param baselineOcpuUtilization the value to set
         * @return this builder
         */
        public Builder baselineOcpuUtilization(BaselineOcpuUtilization baselineOcpuUtilization) {
            this.baselineOcpuUtilization = baselineOcpuUtilization;
            this.__explicitlySet__.add("baselineOcpuUtilization");
            return this;
        }
        /** A short description of the instance's processor (CPU). */
        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        /**
         * A short description of the instance's processor (CPU).
         *
         * @param processorDescription the value to set
         * @return this builder
         */
        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }
        /** The networking bandwidth available to the instance, in gigabits per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
        private Float networkingBandwidthInGbps;

        /**
         * The networking bandwidth available to the instance, in gigabits per second.
         *
         * @param networkingBandwidthInGbps the value to set
         * @return this builder
         */
        public Builder networkingBandwidthInGbps(Float networkingBandwidthInGbps) {
            this.networkingBandwidthInGbps = networkingBandwidthInGbps;
            this.__explicitlySet__.add("networkingBandwidthInGbps");
            return this;
        }
        /** The maximum number of VNIC attachments for the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
        private Integer maxVnicAttachments;

        /**
         * The maximum number of VNIC attachments for the instance.
         *
         * @param maxVnicAttachments the value to set
         * @return this builder
         */
        public Builder maxVnicAttachments(Integer maxVnicAttachments) {
            this.maxVnicAttachments = maxVnicAttachments;
            this.__explicitlySet__.add("maxVnicAttachments");
            return this;
        }
        /** The number of GPUs available to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        /**
         * The number of GPUs available to the instance.
         *
         * @param gpus the value to set
         * @return this builder
         */
        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
            return this;
        }
        /**
         * A short description of the instance's graphics processing unit (GPU).
         *
         * <p>If the instance does not have any GPUs, this field is {@code null}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
        private String gpuDescription;

        /**
         * A short description of the instance's graphics processing unit (GPU).
         *
         * <p>If the instance does not have any GPUs, this field is {@code null}.
         *
         * @param gpuDescription the value to set
         * @return this builder
         */
        public Builder gpuDescription(String gpuDescription) {
            this.gpuDescription = gpuDescription;
            this.__explicitlySet__.add("gpuDescription");
            return this;
        }
        /** The number of local disks available to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
        private Integer localDisks;

        /**
         * The number of local disks available to the instance.
         *
         * @param localDisks the value to set
         * @return this builder
         */
        public Builder localDisks(Integer localDisks) {
            this.localDisks = localDisks;
            this.__explicitlySet__.add("localDisks");
            return this;
        }
        /**
         * The aggregate size of all local disks, in gigabytes.
         *
         * <p>If the instance does not have any local disks, this field is {@code null}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
        private Float localDisksTotalSizeInGBs;

        /**
         * The aggregate size of all local disks, in gigabytes.
         *
         * <p>If the instance does not have any local disks, this field is {@code null}.
         *
         * @param localDisksTotalSizeInGBs the value to set
         * @return this builder
         */
        public Builder localDisksTotalSizeInGBs(Float localDisksTotalSizeInGBs) {
            this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
            this.__explicitlySet__.add("localDisksTotalSizeInGBs");
            return this;
        }
        /**
         * A short description of the local disks available to this instance.
         *
         * <p>If the instance does not have any local disks, this field is {@code null}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
        private String localDiskDescription;

        /**
         * A short description of the local disks available to this instance.
         *
         * <p>If the instance does not have any local disks, this field is {@code null}.
         *
         * @param localDiskDescription the value to set
         * @return this builder
         */
        public Builder localDiskDescription(String localDiskDescription) {
            this.localDiskDescription = localDiskDescription;
            this.__explicitlySet__.add("localDiskDescription");
            return this;
        }
        /**
         * The total number of VCPUs available to the instance. This can be used instead of OCPUs,
         * in which case the actual number of OCPUs will be calculated based on this value and the
         * actual hardware. This must be a multiple of 2.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcpus")
        private Integer vcpus;

        /**
         * The total number of VCPUs available to the instance. This can be used instead of OCPUs,
         * in which case the actual number of OCPUs will be calculated based on this value and the
         * actual hardware. This must be a multiple of 2.
         *
         * @param vcpus the value to set
         * @return this builder
         */
        public Builder vcpus(Integer vcpus) {
            this.vcpus = vcpus;
            this.__explicitlySet__.add("vcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceShapeConfig build() {
            InstanceShapeConfig model =
                    new InstanceShapeConfig(
                            this.ocpus,
                            this.memoryInGBs,
                            this.baselineOcpuUtilization,
                            this.processorDescription,
                            this.networkingBandwidthInGbps,
                            this.maxVnicAttachments,
                            this.gpus,
                            this.gpuDescription,
                            this.localDisks,
                            this.localDisksTotalSizeInGBs,
                            this.localDiskDescription,
                            this.vcpus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceShapeConfig model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("baselineOcpuUtilization")) {
                this.baselineOcpuUtilization(model.getBaselineOcpuUtilization());
            }
            if (model.wasPropertyExplicitlySet("processorDescription")) {
                this.processorDescription(model.getProcessorDescription());
            }
            if (model.wasPropertyExplicitlySet("networkingBandwidthInGbps")) {
                this.networkingBandwidthInGbps(model.getNetworkingBandwidthInGbps());
            }
            if (model.wasPropertyExplicitlySet("maxVnicAttachments")) {
                this.maxVnicAttachments(model.getMaxVnicAttachments());
            }
            if (model.wasPropertyExplicitlySet("gpus")) {
                this.gpus(model.getGpus());
            }
            if (model.wasPropertyExplicitlySet("gpuDescription")) {
                this.gpuDescription(model.getGpuDescription());
            }
            if (model.wasPropertyExplicitlySet("localDisks")) {
                this.localDisks(model.getLocalDisks());
            }
            if (model.wasPropertyExplicitlySet("localDisksTotalSizeInGBs")) {
                this.localDisksTotalSizeInGBs(model.getLocalDisksTotalSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("localDiskDescription")) {
                this.localDiskDescription(model.getLocalDiskDescription());
            }
            if (model.wasPropertyExplicitlySet("vcpus")) {
                this.vcpus(model.getVcpus());
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

    /** The total number of OCPUs available to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * The total number of OCPUs available to the instance.
     *
     * @return the value
     */
    public Float getOcpus() {
        return ocpus;
    }

    /** The total amount of memory available to the instance, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * The total amount of memory available to the instance, in gigabytes.
     *
     * @return the value
     */
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is the entire OCPU. This represents a non-burstable instance.
     */
    public enum BaselineOcpuUtilization implements com.oracle.bmc.http.internal.BmcEnum {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BaselineOcpuUtilization.class);

        private final String value;
        private static java.util.Map<String, BaselineOcpuUtilization> map;

        static {
            map = new java.util.HashMap<>();
            for (BaselineOcpuUtilization v : BaselineOcpuUtilization.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BaselineOcpuUtilization(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BaselineOcpuUtilization create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BaselineOcpuUtilization', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is the entire OCPU. This represents a non-burstable instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
    private final BaselineOcpuUtilization baselineOcpuUtilization;

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is the entire OCPU. This represents a non-burstable instance.
     *
     * @return the value
     */
    public BaselineOcpuUtilization getBaselineOcpuUtilization() {
        return baselineOcpuUtilization;
    }

    /** A short description of the instance's processor (CPU). */
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    /**
     * A short description of the instance's processor (CPU).
     *
     * @return the value
     */
    public String getProcessorDescription() {
        return processorDescription;
    }

    /** The networking bandwidth available to the instance, in gigabits per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    private final Float networkingBandwidthInGbps;

    /**
     * The networking bandwidth available to the instance, in gigabits per second.
     *
     * @return the value
     */
    public Float getNetworkingBandwidthInGbps() {
        return networkingBandwidthInGbps;
    }

    /** The maximum number of VNIC attachments for the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    private final Integer maxVnicAttachments;

    /**
     * The maximum number of VNIC attachments for the instance.
     *
     * @return the value
     */
    public Integer getMaxVnicAttachments() {
        return maxVnicAttachments;
    }

    /** The number of GPUs available to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

    /**
     * The number of GPUs available to the instance.
     *
     * @return the value
     */
    public Integer getGpus() {
        return gpus;
    }

    /**
     * A short description of the instance's graphics processing unit (GPU).
     *
     * <p>If the instance does not have any GPUs, this field is {@code null}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    private final String gpuDescription;

    /**
     * A short description of the instance's graphics processing unit (GPU).
     *
     * <p>If the instance does not have any GPUs, this field is {@code null}.
     *
     * @return the value
     */
    public String getGpuDescription() {
        return gpuDescription;
    }

    /** The number of local disks available to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    private final Integer localDisks;

    /**
     * The number of local disks available to the instance.
     *
     * @return the value
     */
    public Integer getLocalDisks() {
        return localDisks;
    }

    /**
     * The aggregate size of all local disks, in gigabytes.
     *
     * <p>If the instance does not have any local disks, this field is {@code null}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    private final Float localDisksTotalSizeInGBs;

    /**
     * The aggregate size of all local disks, in gigabytes.
     *
     * <p>If the instance does not have any local disks, this field is {@code null}.
     *
     * @return the value
     */
    public Float getLocalDisksTotalSizeInGBs() {
        return localDisksTotalSizeInGBs;
    }

    /**
     * A short description of the local disks available to this instance.
     *
     * <p>If the instance does not have any local disks, this field is {@code null}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    private final String localDiskDescription;

    /**
     * A short description of the local disks available to this instance.
     *
     * <p>If the instance does not have any local disks, this field is {@code null}.
     *
     * @return the value
     */
    public String getLocalDiskDescription() {
        return localDiskDescription;
    }

    /**
     * The total number of VCPUs available to the instance. This can be used instead of OCPUs, in
     * which case the actual number of OCPUs will be calculated based on this value and the actual
     * hardware. This must be a multiple of 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcpus")
    private final Integer vcpus;

    /**
     * The total number of VCPUs available to the instance. This can be used instead of OCPUs, in
     * which case the actual number of OCPUs will be calculated based on this value and the actual
     * hardware. This must be a multiple of 2.
     *
     * @return the value
     */
    public Integer getVcpus() {
        return vcpus;
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
        sb.append("InstanceShapeConfig(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", baselineOcpuUtilization=")
                .append(String.valueOf(this.baselineOcpuUtilization));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", networkingBandwidthInGbps=")
                .append(String.valueOf(this.networkingBandwidthInGbps));
        sb.append(", maxVnicAttachments=").append(String.valueOf(this.maxVnicAttachments));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(", gpuDescription=").append(String.valueOf(this.gpuDescription));
        sb.append(", localDisks=").append(String.valueOf(this.localDisks));
        sb.append(", localDisksTotalSizeInGBs=")
                .append(String.valueOf(this.localDisksTotalSizeInGBs));
        sb.append(", localDiskDescription=").append(String.valueOf(this.localDiskDescription));
        sb.append(", vcpus=").append(String.valueOf(this.vcpus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceShapeConfig)) {
            return false;
        }

        InstanceShapeConfig other = (InstanceShapeConfig) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(
                        this.baselineOcpuUtilization, other.baselineOcpuUtilization)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(
                        this.networkingBandwidthInGbps, other.networkingBandwidthInGbps)
                && java.util.Objects.equals(this.maxVnicAttachments, other.maxVnicAttachments)
                && java.util.Objects.equals(this.gpus, other.gpus)
                && java.util.Objects.equals(this.gpuDescription, other.gpuDescription)
                && java.util.Objects.equals(this.localDisks, other.localDisks)
                && java.util.Objects.equals(
                        this.localDisksTotalSizeInGBs, other.localDisksTotalSizeInGBs)
                && java.util.Objects.equals(this.localDiskDescription, other.localDiskDescription)
                && java.util.Objects.equals(this.vcpus, other.vcpus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineOcpuUtilization == null
                                ? 43
                                : this.baselineOcpuUtilization.hashCode());
        result =
                (result * PRIME)
                        + (this.processorDescription == null
                                ? 43
                                : this.processorDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.networkingBandwidthInGbps == null
                                ? 43
                                : this.networkingBandwidthInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.maxVnicAttachments == null
                                ? 43
                                : this.maxVnicAttachments.hashCode());
        result = (result * PRIME) + (this.gpus == null ? 43 : this.gpus.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuDescription == null ? 43 : this.gpuDescription.hashCode());
        result = (result * PRIME) + (this.localDisks == null ? 43 : this.localDisks.hashCode());
        result =
                (result * PRIME)
                        + (this.localDisksTotalSizeInGBs == null
                                ? 43
                                : this.localDisksTotalSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.localDiskDescription == null
                                ? 43
                                : this.localDiskDescription.hashCode());
        result = (result * PRIME) + (this.vcpus == null ? 43 : this.vcpus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
