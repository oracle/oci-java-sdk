/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Shape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Shape {
    @Deprecated
    @java.beans.ConstructorProperties({
        "baselineOcpuUtilizations",
        "minTotalBaselineOcpusRequired",
        "shape",
        "processorDescription",
        "ocpus",
        "memoryInGBs",
        "networkPorts",
        "networkingBandwidthInGbps",
        "maxVnicAttachments",
        "gpus",
        "gpuDescription",
        "localDisks",
        "localDisksTotalSizeInGBs",
        "localDiskDescription",
        "rdmaPorts",
        "rdmaBandwidthInGbps",
        "isLiveMigrationSupported",
        "ocpuOptions",
        "memoryOptions",
        "networkingBandwidthOptions",
        "maxVnicAttachmentOptions",
        "platformConfigOptions",
        "isBilledForStoppedInstance",
        "billingType",
        "quotaNames",
        "isSubcore",
        "isFlexible",
        "resizeCompatibleShapes",
        "recommendedAlternatives"
    })
    public Shape(
            java.util.List<BaselineOcpuUtilizations> baselineOcpuUtilizations,
            java.math.BigDecimal minTotalBaselineOcpusRequired,
            String shape,
            String processorDescription,
            Float ocpus,
            Float memoryInGBs,
            Integer networkPorts,
            Float networkingBandwidthInGbps,
            Integer maxVnicAttachments,
            Integer gpus,
            String gpuDescription,
            Integer localDisks,
            Float localDisksTotalSizeInGBs,
            String localDiskDescription,
            Integer rdmaPorts,
            Integer rdmaBandwidthInGbps,
            Boolean isLiveMigrationSupported,
            ShapeOcpuOptions ocpuOptions,
            ShapeMemoryOptions memoryOptions,
            ShapeNetworkingBandwidthOptions networkingBandwidthOptions,
            ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions,
            ShapePlatformConfigOptions platformConfigOptions,
            Boolean isBilledForStoppedInstance,
            BillingType billingType,
            java.util.List<String> quotaNames,
            Boolean isSubcore,
            Boolean isFlexible,
            java.util.List<String> resizeCompatibleShapes,
            java.util.List<ShapeAlternativeObject> recommendedAlternatives) {
        super();
        this.baselineOcpuUtilizations = baselineOcpuUtilizations;
        this.minTotalBaselineOcpusRequired = minTotalBaselineOcpusRequired;
        this.shape = shape;
        this.processorDescription = processorDescription;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.networkPorts = networkPorts;
        this.networkingBandwidthInGbps = networkingBandwidthInGbps;
        this.maxVnicAttachments = maxVnicAttachments;
        this.gpus = gpus;
        this.gpuDescription = gpuDescription;
        this.localDisks = localDisks;
        this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
        this.localDiskDescription = localDiskDescription;
        this.rdmaPorts = rdmaPorts;
        this.rdmaBandwidthInGbps = rdmaBandwidthInGbps;
        this.isLiveMigrationSupported = isLiveMigrationSupported;
        this.ocpuOptions = ocpuOptions;
        this.memoryOptions = memoryOptions;
        this.networkingBandwidthOptions = networkingBandwidthOptions;
        this.maxVnicAttachmentOptions = maxVnicAttachmentOptions;
        this.platformConfigOptions = platformConfigOptions;
        this.isBilledForStoppedInstance = isBilledForStoppedInstance;
        this.billingType = billingType;
        this.quotaNames = quotaNames;
        this.isSubcore = isSubcore;
        this.isFlexible = isFlexible;
        this.resizeCompatibleShapes = resizeCompatibleShapes;
        this.recommendedAlternatives = recommendedAlternatives;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("networkPorts")
        private Integer networkPorts;

        public Builder networkPorts(Integer networkPorts) {
            this.networkPorts = networkPorts;
            this.__explicitlySet__.add("networkPorts");
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

        @com.fasterxml.jackson.annotation.JsonProperty("rdmaPorts")
        private Integer rdmaPorts;

        public Builder rdmaPorts(Integer rdmaPorts) {
            this.rdmaPorts = rdmaPorts;
            this.__explicitlySet__.add("rdmaPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdmaBandwidthInGbps")
        private Integer rdmaBandwidthInGbps;

        public Builder rdmaBandwidthInGbps(Integer rdmaBandwidthInGbps) {
            this.rdmaBandwidthInGbps = rdmaBandwidthInGbps;
            this.__explicitlySet__.add("rdmaBandwidthInGbps");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isBilledForStoppedInstance")
        private Boolean isBilledForStoppedInstance;

        public Builder isBilledForStoppedInstance(Boolean isBilledForStoppedInstance) {
            this.isBilledForStoppedInstance = isBilledForStoppedInstance;
            this.__explicitlySet__.add("isBilledForStoppedInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingType")
        private BillingType billingType;

        public Builder billingType(BillingType billingType) {
            this.billingType = billingType;
            this.__explicitlySet__.add("billingType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quotaNames")
        private java.util.List<String> quotaNames;

        public Builder quotaNames(java.util.List<String> quotaNames) {
            this.quotaNames = quotaNames;
            this.__explicitlySet__.add("quotaNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSubcore")
        private Boolean isSubcore;

        public Builder isSubcore(Boolean isSubcore) {
            this.isSubcore = isSubcore;
            this.__explicitlySet__.add("isSubcore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
        private Boolean isFlexible;

        public Builder isFlexible(Boolean isFlexible) {
            this.isFlexible = isFlexible;
            this.__explicitlySet__.add("isFlexible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resizeCompatibleShapes")
        private java.util.List<String> resizeCompatibleShapes;

        public Builder resizeCompatibleShapes(java.util.List<String> resizeCompatibleShapes) {
            this.resizeCompatibleShapes = resizeCompatibleShapes;
            this.__explicitlySet__.add("resizeCompatibleShapes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAlternatives")
        private java.util.List<ShapeAlternativeObject> recommendedAlternatives;

        public Builder recommendedAlternatives(
                java.util.List<ShapeAlternativeObject> recommendedAlternatives) {
            this.recommendedAlternatives = recommendedAlternatives;
            this.__explicitlySet__.add("recommendedAlternatives");
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
                            networkPorts,
                            networkingBandwidthInGbps,
                            maxVnicAttachments,
                            gpus,
                            gpuDescription,
                            localDisks,
                            localDisksTotalSizeInGBs,
                            localDiskDescription,
                            rdmaPorts,
                            rdmaBandwidthInGbps,
                            isLiveMigrationSupported,
                            ocpuOptions,
                            memoryOptions,
                            networkingBandwidthOptions,
                            maxVnicAttachmentOptions,
                            platformConfigOptions,
                            isBilledForStoppedInstance,
                            billingType,
                            quotaNames,
                            isSubcore,
                            isFlexible,
                            resizeCompatibleShapes,
                            recommendedAlternatives);
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
                            .networkPorts(o.getNetworkPorts())
                            .networkingBandwidthInGbps(o.getNetworkingBandwidthInGbps())
                            .maxVnicAttachments(o.getMaxVnicAttachments())
                            .gpus(o.getGpus())
                            .gpuDescription(o.getGpuDescription())
                            .localDisks(o.getLocalDisks())
                            .localDisksTotalSizeInGBs(o.getLocalDisksTotalSizeInGBs())
                            .localDiskDescription(o.getLocalDiskDescription())
                            .rdmaPorts(o.getRdmaPorts())
                            .rdmaBandwidthInGbps(o.getRdmaBandwidthInGbps())
                            .isLiveMigrationSupported(o.getIsLiveMigrationSupported())
                            .ocpuOptions(o.getOcpuOptions())
                            .memoryOptions(o.getMemoryOptions())
                            .networkingBandwidthOptions(o.getNetworkingBandwidthOptions())
                            .maxVnicAttachmentOptions(o.getMaxVnicAttachmentOptions())
                            .platformConfigOptions(o.getPlatformConfigOptions())
                            .isBilledForStoppedInstance(o.getIsBilledForStoppedInstance())
                            .billingType(o.getBillingType())
                            .quotaNames(o.getQuotaNames())
                            .isSubcore(o.getIsSubcore())
                            .isFlexible(o.getIsFlexible())
                            .resizeCompatibleShapes(o.getResizeCompatibleShapes())
                            .recommendedAlternatives(o.getRecommendedAlternatives());

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
     **/
    public enum BaselineOcpuUtilizations {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BaselineOcpuUtilizations.class);

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
    private final java.util.List<BaselineOcpuUtilizations> baselineOcpuUtilizations;

    public java.util.List<BaselineOcpuUtilizations> getBaselineOcpuUtilizations() {
        return baselineOcpuUtilizations;
    }

    /**
     * For a subcore burstable VM, the minimum total baseline OCPUs required. The total baseline OCPUs is equal to
     * baselineOcpuUtilization chosen multiplied by the number of OCPUs chosen.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minTotalBaselineOcpusRequired")
    private final java.math.BigDecimal minTotalBaselineOcpusRequired;

    public java.math.BigDecimal getMinTotalBaselineOcpusRequired() {
        return minTotalBaselineOcpusRequired;
    }

    /**
     * The name of the shape. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    public String getShape() {
        return shape;
    }

    /**
     * A short description of the shape's processor (CPU).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    public String getProcessorDescription() {
        return processorDescription;
    }

    /**
     * The default number of OCPUs available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    public Float getOcpus() {
        return ocpus;
    }

    /**
     * The default amount of memory available for this shape, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The number of physical network interface card (NIC) ports available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkPorts")
    private final Integer networkPorts;

    public Integer getNetworkPorts() {
        return networkPorts;
    }

    /**
     * The networking bandwidth available for this shape, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    private final Float networkingBandwidthInGbps;

    public Float getNetworkingBandwidthInGbps() {
        return networkingBandwidthInGbps;
    }

    /**
     * The maximum number of VNIC attachments available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    private final Integer maxVnicAttachments;

    public Integer getMaxVnicAttachments() {
        return maxVnicAttachments;
    }

    /**
     * The number of GPUs available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

    public Integer getGpus() {
        return gpus;
    }

    /**
     * A short description of the graphics processing unit (GPU) available for this shape.
     * <p>
     * If the shape does not have any GPUs, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    private final String gpuDescription;

    public String getGpuDescription() {
        return gpuDescription;
    }

    /**
     * The number of local disks available for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    private final Integer localDisks;

    public Integer getLocalDisks() {
        return localDisks;
    }

    /**
     * The aggregate size of the local disks available for this shape, in gigabytes.
     * <p>
     * If the shape does not have any local disks, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    private final Float localDisksTotalSizeInGBs;

    public Float getLocalDisksTotalSizeInGBs() {
        return localDisksTotalSizeInGBs;
    }

    /**
     * A short description of the local disks available for this shape.
     * <p>
     * If the shape does not have any local disks, this field is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    private final String localDiskDescription;

    public String getLocalDiskDescription() {
        return localDiskDescription;
    }

    /**
     * The number of networking ports available for the remote direct memory access (RDMA) network between nodes in
     * a high performance computing (HPC) cluster network. If the shape does not support cluster networks, this
     * value is {@code 0}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdmaPorts")
    private final Integer rdmaPorts;

    public Integer getRdmaPorts() {
        return rdmaPorts;
    }

    /**
     * The networking bandwidth available for the remote direct memory access (RDMA) network for this shape, in
     * gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdmaBandwidthInGbps")
    private final Integer rdmaBandwidthInGbps;

    public Integer getRdmaBandwidthInGbps() {
        return rdmaBandwidthInGbps;
    }

    /**
     * Whether live migration is supported for this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationSupported")
    private final Boolean isLiveMigrationSupported;

    public Boolean getIsLiveMigrationSupported() {
        return isLiveMigrationSupported;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    private final ShapeOcpuOptions ocpuOptions;

    public ShapeOcpuOptions getOcpuOptions() {
        return ocpuOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    private final ShapeMemoryOptions memoryOptions;

    public ShapeMemoryOptions getMemoryOptions() {
        return memoryOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
    private final ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

    public ShapeNetworkingBandwidthOptions getNetworkingBandwidthOptions() {
        return networkingBandwidthOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachmentOptions")
    private final ShapeMaxVnicAttachmentOptions maxVnicAttachmentOptions;

    public ShapeMaxVnicAttachmentOptions getMaxVnicAttachmentOptions() {
        return maxVnicAttachmentOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("platformConfigOptions")
    private final ShapePlatformConfigOptions platformConfigOptions;

    public ShapePlatformConfigOptions getPlatformConfigOptions() {
        return platformConfigOptions;
    }

    /**
     * Whether billing continues when the instances that use this shape are in the stopped state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBilledForStoppedInstance")
    private final Boolean isBilledForStoppedInstance;

    public Boolean getIsBilledForStoppedInstance() {
        return isBilledForStoppedInstance;
    }

    /**
     * How instances that use this shape are charged.
     *
     **/
    public enum BillingType {
        AlwaysFree("ALWAYS_FREE"),
        LimitedFree("LIMITED_FREE"),
        Paid("PAID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BillingType.class);

        private final String value;
        private static java.util.Map<String, BillingType> map;

        static {
            map = new java.util.HashMap<>();
            for (BillingType v : BillingType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BillingType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BillingType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BillingType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * How instances that use this shape are charged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingType")
    private final BillingType billingType;

    public BillingType getBillingType() {
        return billingType;
    }

    /**
     * The list of of compartment quotas for the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quotaNames")
    private final java.util.List<String> quotaNames;

    public java.util.List<String> getQuotaNames() {
        return quotaNames;
    }

    /**
     * Whether the shape supports creating subcore or burstable instances. A [burstable instance](https://docs.cloud.oracle.com/iaas/Content/Compute/References/burstable-instances.htm)
     * is a virtual machine (VM) instance that provides a baseline level of CPU performance with the ability to burst to a higher level to support occasional
     * spikes in usage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSubcore")
    private final Boolean isSubcore;

    public Boolean getIsSubcore() {
        return isSubcore;
    }

    /**
     * Whether the shape supports creating flexible instances. A [flexible shape](https://docs.cloud.oracle.com/iaas/Content/Compute/References/computeshapes.htm#flexible)
     * is a shape that lets you customize the number of OCPUs and the amount of memory when launching or resizing your instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
    private final Boolean isFlexible;

    public Boolean getIsFlexible() {
        return isFlexible;
    }

    /**
     * The list of compatible shapes that this shape can be changed to. For more information,
     * see [Changing the Shape of an Instance](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/resizinginstances.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resizeCompatibleShapes")
    private final java.util.List<String> resizeCompatibleShapes;

    public java.util.List<String> getResizeCompatibleShapes() {
        return resizeCompatibleShapes;
    }

    /**
     * The list of shapes and shape details (if applicable) that Oracle recommends that you use as an alternative to the current shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAlternatives")
    private final java.util.List<ShapeAlternativeObject> recommendedAlternatives;

    public java.util.List<ShapeAlternativeObject> getRecommendedAlternatives() {
        return recommendedAlternatives;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Shape(");
        sb.append("baselineOcpuUtilizations=")
                .append(String.valueOf(this.baselineOcpuUtilizations));
        sb.append(", minTotalBaselineOcpusRequired=")
                .append(String.valueOf(this.minTotalBaselineOcpusRequired));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", networkPorts=").append(String.valueOf(this.networkPorts));
        sb.append(", networkingBandwidthInGbps=")
                .append(String.valueOf(this.networkingBandwidthInGbps));
        sb.append(", maxVnicAttachments=").append(String.valueOf(this.maxVnicAttachments));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(", gpuDescription=").append(String.valueOf(this.gpuDescription));
        sb.append(", localDisks=").append(String.valueOf(this.localDisks));
        sb.append(", localDisksTotalSizeInGBs=")
                .append(String.valueOf(this.localDisksTotalSizeInGBs));
        sb.append(", localDiskDescription=").append(String.valueOf(this.localDiskDescription));
        sb.append(", rdmaPorts=").append(String.valueOf(this.rdmaPorts));
        sb.append(", rdmaBandwidthInGbps=").append(String.valueOf(this.rdmaBandwidthInGbps));
        sb.append(", isLiveMigrationSupported=")
                .append(String.valueOf(this.isLiveMigrationSupported));
        sb.append(", ocpuOptions=").append(String.valueOf(this.ocpuOptions));
        sb.append(", memoryOptions=").append(String.valueOf(this.memoryOptions));
        sb.append(", networkingBandwidthOptions=")
                .append(String.valueOf(this.networkingBandwidthOptions));
        sb.append(", maxVnicAttachmentOptions=")
                .append(String.valueOf(this.maxVnicAttachmentOptions));
        sb.append(", platformConfigOptions=").append(String.valueOf(this.platformConfigOptions));
        sb.append(", isBilledForStoppedInstance=")
                .append(String.valueOf(this.isBilledForStoppedInstance));
        sb.append(", billingType=").append(String.valueOf(this.billingType));
        sb.append(", quotaNames=").append(String.valueOf(this.quotaNames));
        sb.append(", isSubcore=").append(String.valueOf(this.isSubcore));
        sb.append(", isFlexible=").append(String.valueOf(this.isFlexible));
        sb.append(", resizeCompatibleShapes=").append(String.valueOf(this.resizeCompatibleShapes));
        sb.append(", recommendedAlternatives=")
                .append(String.valueOf(this.recommendedAlternatives));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Shape)) {
            return false;
        }

        Shape other = (Shape) o;
        return java.util.Objects.equals(
                        this.baselineOcpuUtilizations, other.baselineOcpuUtilizations)
                && java.util.Objects.equals(
                        this.minTotalBaselineOcpusRequired, other.minTotalBaselineOcpusRequired)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.networkPorts, other.networkPorts)
                && java.util.Objects.equals(
                        this.networkingBandwidthInGbps, other.networkingBandwidthInGbps)
                && java.util.Objects.equals(this.maxVnicAttachments, other.maxVnicAttachments)
                && java.util.Objects.equals(this.gpus, other.gpus)
                && java.util.Objects.equals(this.gpuDescription, other.gpuDescription)
                && java.util.Objects.equals(this.localDisks, other.localDisks)
                && java.util.Objects.equals(
                        this.localDisksTotalSizeInGBs, other.localDisksTotalSizeInGBs)
                && java.util.Objects.equals(this.localDiskDescription, other.localDiskDescription)
                && java.util.Objects.equals(this.rdmaPorts, other.rdmaPorts)
                && java.util.Objects.equals(this.rdmaBandwidthInGbps, other.rdmaBandwidthInGbps)
                && java.util.Objects.equals(
                        this.isLiveMigrationSupported, other.isLiveMigrationSupported)
                && java.util.Objects.equals(this.ocpuOptions, other.ocpuOptions)
                && java.util.Objects.equals(this.memoryOptions, other.memoryOptions)
                && java.util.Objects.equals(
                        this.networkingBandwidthOptions, other.networkingBandwidthOptions)
                && java.util.Objects.equals(
                        this.maxVnicAttachmentOptions, other.maxVnicAttachmentOptions)
                && java.util.Objects.equals(this.platformConfigOptions, other.platformConfigOptions)
                && java.util.Objects.equals(
                        this.isBilledForStoppedInstance, other.isBilledForStoppedInstance)
                && java.util.Objects.equals(this.billingType, other.billingType)
                && java.util.Objects.equals(this.quotaNames, other.quotaNames)
                && java.util.Objects.equals(this.isSubcore, other.isSubcore)
                && java.util.Objects.equals(this.isFlexible, other.isFlexible)
                && java.util.Objects.equals(
                        this.resizeCompatibleShapes, other.resizeCompatibleShapes)
                && java.util.Objects.equals(
                        this.recommendedAlternatives, other.recommendedAlternatives)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.baselineOcpuUtilizations == null
                                ? 43
                                : this.baselineOcpuUtilizations.hashCode());
        result =
                (result * PRIME)
                        + (this.minTotalBaselineOcpusRequired == null
                                ? 43
                                : this.minTotalBaselineOcpusRequired.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.processorDescription == null
                                ? 43
                                : this.processorDescription.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.networkPorts == null ? 43 : this.networkPorts.hashCode());
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
        result = (result * PRIME) + (this.rdmaPorts == null ? 43 : this.rdmaPorts.hashCode());
        result =
                (result * PRIME)
                        + (this.rdmaBandwidthInGbps == null
                                ? 43
                                : this.rdmaBandwidthInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.isLiveMigrationSupported == null
                                ? 43
                                : this.isLiveMigrationSupported.hashCode());
        result = (result * PRIME) + (this.ocpuOptions == null ? 43 : this.ocpuOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryOptions == null ? 43 : this.memoryOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.networkingBandwidthOptions == null
                                ? 43
                                : this.networkingBandwidthOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.maxVnicAttachmentOptions == null
                                ? 43
                                : this.maxVnicAttachmentOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.platformConfigOptions == null
                                ? 43
                                : this.platformConfigOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.isBilledForStoppedInstance == null
                                ? 43
                                : this.isBilledForStoppedInstance.hashCode());
        result = (result * PRIME) + (this.billingType == null ? 43 : this.billingType.hashCode());
        result = (result * PRIME) + (this.quotaNames == null ? 43 : this.quotaNames.hashCode());
        result = (result * PRIME) + (this.isSubcore == null ? 43 : this.isSubcore.hashCode());
        result = (result * PRIME) + (this.isFlexible == null ? 43 : this.isFlexible.hashCode());
        result =
                (result * PRIME)
                        + (this.resizeCompatibleShapes == null
                                ? 43
                                : this.resizeCompatibleShapes.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAlternatives == null
                                ? 43
                                : this.recommendedAlternatives.hashCode());
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
