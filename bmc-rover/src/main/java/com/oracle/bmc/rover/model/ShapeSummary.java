/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * A shape of a node on a Rover device.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "gpuDescription",
        "gpus",
        "memoryInGBs",
        "networkingBandwidthInGbps",
        "ocpus",
        "processorDescription",
        "shape",
        "usbControllerDescription",
        "numberOfUsbControllers",
        "tags",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ShapeSummary(
            String gpuDescription,
            Integer gpus,
            Float memoryInGBs,
            Float networkingBandwidthInGbps,
            Integer ocpus,
            String processorDescription,
            String shape,
            String usbControllerDescription,
            Integer numberOfUsbControllers,
            String tags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.gpuDescription = gpuDescription;
        this.gpus = gpus;
        this.memoryInGBs = memoryInGBs;
        this.networkingBandwidthInGbps = networkingBandwidthInGbps;
        this.ocpus = ocpus;
        this.processorDescription = processorDescription;
        this.shape = shape;
        this.usbControllerDescription = usbControllerDescription;
        this.numberOfUsbControllers = numberOfUsbControllers;
        this.tags = tags;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
        private String gpuDescription;

        public Builder gpuDescription(String gpuDescription) {
            this.gpuDescription = gpuDescription;
            this.__explicitlySet__.add("gpuDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
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

        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

        public Builder ocpus(Integer ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usbControllerDescription")
        private String usbControllerDescription;

        public Builder usbControllerDescription(String usbControllerDescription) {
            this.usbControllerDescription = usbControllerDescription;
            this.__explicitlySet__.add("usbControllerDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfUsbControllers")
        private Integer numberOfUsbControllers;

        public Builder numberOfUsbControllers(Integer numberOfUsbControllers) {
            this.numberOfUsbControllers = numberOfUsbControllers;
            this.__explicitlySet__.add("numberOfUsbControllers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private String tags;

        public Builder tags(String tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeSummary build() {
            ShapeSummary __instance__ =
                    new ShapeSummary(
                            gpuDescription,
                            gpus,
                            memoryInGBs,
                            networkingBandwidthInGbps,
                            ocpus,
                            processorDescription,
                            shape,
                            usbControllerDescription,
                            numberOfUsbControllers,
                            tags,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeSummary o) {
            Builder copiedBuilder =
                    gpuDescription(o.getGpuDescription())
                            .gpus(o.getGpus())
                            .memoryInGBs(o.getMemoryInGBs())
                            .networkingBandwidthInGbps(o.getNetworkingBandwidthInGbps())
                            .ocpus(o.getOcpus())
                            .processorDescription(o.getProcessorDescription())
                            .shape(o.getShape())
                            .usbControllerDescription(o.getUsbControllerDescription())
                            .numberOfUsbControllers(o.getNumberOfUsbControllers())
                            .tags(o.getTags())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * A short description of the graphics processing unit (GPU) available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    private final String gpuDescription;

    public String getGpuDescription() {
        return gpuDescription;
    }

    /**
     * The number of GPUs available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

    public Integer getGpus() {
        return gpus;
    }

    /**
     * The default amount of memory available for this shape, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The networking bandwidth available for this shape, in gigabits per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    private final Float networkingBandwidthInGbps;

    public Float getNetworkingBandwidthInGbps() {
        return networkingBandwidthInGbps;
    }

    /**
     * The default number of OCPUs available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

    public Integer getOcpus() {
        return ocpus;
    }

    /**
     * A short description of the shape's processor (CPU).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    public String getProcessorDescription() {
        return processorDescription;
    }

    /**
     * The name of the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    public String getShape() {
        return shape;
    }

    /**
     * A short description of the USB controller available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usbControllerDescription")
    private final String usbControllerDescription;

    public String getUsbControllerDescription() {
        return usbControllerDescription;
    }

    /**
     * The number of USB controllers available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfUsbControllers")
    private final Integer numberOfUsbControllers;

    public Integer getNumberOfUsbControllers() {
        return numberOfUsbControllers;
    }

    /**
     * The tags associated with tagSlug.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final String tags;

    public String getTags() {
        return tags;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeSummary(");
        sb.append("gpuDescription=").append(String.valueOf(this.gpuDescription));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", networkingBandwidthInGbps=")
                .append(String.valueOf(this.networkingBandwidthInGbps));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", usbControllerDescription=")
                .append(String.valueOf(this.usbControllerDescription));
        sb.append(", numberOfUsbControllers=").append(String.valueOf(this.numberOfUsbControllers));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeSummary)) {
            return false;
        }

        ShapeSummary other = (ShapeSummary) o;
        return java.util.Objects.equals(this.gpuDescription, other.gpuDescription)
                && java.util.Objects.equals(this.gpus, other.gpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(
                        this.networkingBandwidthInGbps, other.networkingBandwidthInGbps)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.usbControllerDescription, other.usbControllerDescription)
                && java.util.Objects.equals(
                        this.numberOfUsbControllers, other.numberOfUsbControllers)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.gpuDescription == null ? 43 : this.gpuDescription.hashCode());
        result = (result * PRIME) + (this.gpus == null ? 43 : this.gpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.networkingBandwidthInGbps == null
                                ? 43
                                : this.networkingBandwidthInGbps.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result =
                (result * PRIME)
                        + (this.processorDescription == null
                                ? 43
                                : this.processorDescription.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.usbControllerDescription == null
                                ? 43
                                : this.usbControllerDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfUsbControllers == null
                                ? 43
                                : this.numberOfUsbControllers.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
