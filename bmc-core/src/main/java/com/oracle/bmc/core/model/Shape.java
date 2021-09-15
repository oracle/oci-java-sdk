/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A compute instance shape that can be used in {@link #launchInstance(LaunchInstanceRequest) launchInstance}.
 * For more information, see [Overview of the Compute Service](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm) and
 * [Compute Shapes](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Shape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Shape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilizations")
        private java.util.List<BaselineOcpuUtilizations> baselineOcpuUtilizations;

        public Builder baselineOcpuUtilizations(
                java.util.List<BaselineOcpuUtilizations> baselineOcpuUtilizations) {
            this.baselineOcpuUtilizations = baselineOcpuUtilizations;
            this.__explicitlySet__.add("baselineOcpuUtilizations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minTotalBaselineOcpusRequired")
        private java.math.BigDecimal minTotalBaselineOcpusRequired;

        public Builder minTotalBaselineOcpusRequired(
                java.math.BigDecimal minTotalBaselineOcpusRequired) {
            this.minTotalBaselineOcpusRequired = minTotalBaselineOcpusRequired;
            this.__explicitlySet__.add("minTotalBaselineOcpusRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
        private Float networkingBandwidthInGbps;

        public Builder networkingBandwidthInGbps(Float networkingBandwidthInGbps) {
            this.networkingBandwidthInGbps = networkingBandwidthInGbps;
            this.__explicitlySet__.add("networkingBandwidthInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
        private Integer maxVnicAttachments;

        public Builder maxVnicAttachments(Integer maxVnicAttachments) {
            this.maxVnicAttachments = maxVnicAttachments;
            this.__explicitlySet__.add("maxVnicAttachments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
        private String gpuDescription;

        public Builder gpuDescription(String gpuDescription) {
            this.gpuDescription = gpuDescription;
            this.__explicitlySet__.add("gpuDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
        private Integer localDisks;

        public Builder localDisks(Integer localDisks) {
            this.localDisks = localDisks;
            this.__explicitlySet__.add("localDisks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
        private Float localDisksTotalSizeInGBs;

        public Builder localDisksTotalSizeInGBs(Float localDisksTotalSizeInGBs) {
            this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
            this.__explicitlySet__.add("localDisksTotalSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
        private String localDiskDescription;

        public Builder localDiskDescription(String localDiskDescription) {
            this.localDiskDescription = localDiskDescription;
            this.__explicitlySet__.add("localDiskDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationSupported")
        private Boolean isLiveMigrationSupported;

        public Builder isLiveMigrationSupported(Boolean isLiveMigrationSupported) {
            this.isLiveMigrationSupported = isLiveMigrationSupported;
            this.__explicitlySet__.add("isLiveMigrationSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
        private ShapeOcpuOptions ocpuOptions;

        public Builder ocpuOptions(ShapeOcpuOptions ocpuOptions) {
            this.ocpuOptions = ocpuOptions;
            this.__explicitlySet__.add("ocpuOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
        private ShapeMemoryOptions memoryOptions;

        public Builder memoryOptions(ShapeMemoryOptions memoryOptions) {
            this.memoryOptions = memoryOptions;
            this.__explicitlySet__.add("memoryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
        private ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

        public Builder networkingBandwidthOptions(
                ShapeNetworkingBandwidthOptions networkingBandwidthOptions) {
            this.networkingBandwidthOptions = networkingBandwidthOptions;
            this.__explicitlySet__.add("networkingBandwidthOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachmentOptions")
        private ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions;

        public Builder maxVnicAttachmentOptions(
                ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions) {
            this.maxVnicAttachmentOptions = maxVnicAttachmentOptions;
            this.__explicitlySet__.add("maxVnicAttachmentOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformConfigOptions")
        private ShapePlatformConfigOptions platformConfigOptions;

        public Builder platformConfigOptions(ShapePlatformConfigOptions platformConfigOptions) {
            this.platformConfigOptions = platformConfigOptions;
            this.__explicitlySet__.add("platformConfigOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Shape build() {
            Shape __instance__ =
                    new Shape(
                            baselineOcpuUtilizations,
                            minTotalBaselineOcpusRequired,
                            shape,
                            processorDescription,
                            ocpus,
                            memoryInGBs,
                            networkingBandwidthInGbps,
                            maxVnicAttachments,
                            gpus,
                            gpuDescription,
                            localDisks,
                            localDisksTotalSizeInGBs,
                            localDiskDescription,
                            isLiveMigrationSupported,
                            ocpuOptions,
                            memoryOptions,
                            networkingBandwidthOptions,
                            maxVnicAttachmentOptions,
                            platformConfigOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Shape o) {
            Builder copiedBuilder =
                    baselineOcpuUtilizations(o.getBaselineOcpuUtilizations())
                            .minTotalBaselineOcpusRequired(o.getMinTotalBaselineOcpusRequired())
                            .shape(o.getShape())
                            .processorDescription(o.getProcessorDescription())
                            .ocpus(o.getOcpus())
                            .memoryInGBs(o.getMemoryInGBs())
                            .networkingBandwidthInGbps(o.getNetworkingBandwidthInGbps())
                            .maxVnicAttachments(o.getMaxVnicAttachments())
                            .gpus(o.getGpus())
                            .gpuDescription(o.getGpuDescription())
                            .localDisks(o.getLocalDisks())
                            .localDisksTotalSizeInGBs(o.getLocalDisksTotalSizeInGBs())
                            .localDiskDescription(o.getLocalDiskDescription())
                            .isLiveMigrationSupported(o.getIsLiveMigrationSupported())
                            .ocpuOptions(o.getOcpuOptions())
                            .memoryOptions(o.getMemoryOptions())
                            .networkingBandwidthOptions(o.getNetworkingBandwidthOptions())
                            .maxVnicAttachmentOptions(o.getMaxVnicAttachmentOptions())
                            .platformConfigOptions(o.getPlatformConfigOptions());

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
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BaselineOcpuUtilizations {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BaselineOcpuUtilizations> map;

        static {
            map = new java.util.HashMap<>();
            for (BaselineOcpuUtilizations v : BaselineOcpuUtilizations.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BaselineOcpuUtilizations(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BaselineOcpuUtilizations create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BaselineOcpuUtilizations', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * For a subcore burstable VM, the supported baseline OCPU utilization for instances that use this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilizations")
    java.util.List<BaselineOcpuUtilizations> baselineOcpuUtilizations;

    /**
     * For a subcore burstable VM, the minimum total baseline OCPUs required. The total baseline OCPUs is equal to
     * baselineOcpuUtilization chosen multiplied by the number of OCPUs chosen.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minTotalBaselineOcpusRequired")
    java.math.BigDecimal minTotalBaselineOcpusRequired;

    /**
     * The name of the shape. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * A short description of the shape's processor (CPU).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    String processorDescription;

    /**
     * The default number of OCPUs available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    Float ocpus;

    /**
     * The default amount of memory available for this shape, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Float memoryInGBs;

    /**
     * The networking bandwidth available for this shape, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    Float networkingBandwidthInGbps;

    /**
     * The maximum number of VNIC attachments available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    Integer maxVnicAttachments;

    /**
     * The number of GPUs available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    Integer gpus;

    /**
     * A short description of the graphics processing unit (GPU) available for this shape.
     * <p>
     * If the shape does not have any GPUs, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    String gpuDescription;

    /**
     * The number of local disks available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    Integer localDisks;

    /**
     * The aggregate size of the local disks available for this shape, in gigabytes.
     * <p>
     * If the shape does not have any local disks, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    Float localDisksTotalSizeInGBs;

    /**
     * A short description of the local disks available for this shape.
     * <p>
     * If the shape does not have any local disks, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    String localDiskDescription;

    /**
     * Whether live migration is supported for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationSupported")
    Boolean isLiveMigrationSupported;

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    ShapeOcpuOptions ocpuOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    ShapeMemoryOptions memoryOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
    ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachmentOptions")
    ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfigOptions")
    ShapePlatformConfigOptions platformConfigOptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
