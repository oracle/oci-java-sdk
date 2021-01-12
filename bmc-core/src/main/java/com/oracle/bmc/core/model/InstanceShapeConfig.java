/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape configuration for an instance. The shape configuration determines
 * the resources allocated to an instance.
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
    builder = InstanceShapeConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceShapeConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceShapeConfig build() {
            InstanceShapeConfig __instance__ =
                    new InstanceShapeConfig(
                            ocpus,
                            memoryInGBs,
                            processorDescription,
                            networkingBandwidthInGbps,
                            maxVnicAttachments,
                            gpus,
                            gpuDescription,
                            localDisks,
                            localDisksTotalSizeInGBs,
                            localDiskDescription);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceShapeConfig o) {
            Builder copiedBuilder =
                    ocpus(o.getOcpus())
                            .memoryInGBs(o.getMemoryInGBs())
                            .processorDescription(o.getProcessorDescription())
                            .networkingBandwidthInGbps(o.getNetworkingBandwidthInGbps())
                            .maxVnicAttachments(o.getMaxVnicAttachments())
                            .gpus(o.getGpus())
                            .gpuDescription(o.getGpuDescription())
                            .localDisks(o.getLocalDisks())
                            .localDisksTotalSizeInGBs(o.getLocalDisksTotalSizeInGBs())
                            .localDiskDescription(o.getLocalDiskDescription());

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
     * The total number of OCPUs available to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    Float ocpus;

    /**
     * The total amount of memory available to the instance, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Float memoryInGBs;

    /**
     * A short description of the instance's processor (CPU).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    String processorDescription;

    /**
     * The networking bandwidth available to the instance, in gigabits per second.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    Float networkingBandwidthInGbps;

    /**
     * The maximum number of VNIC attachments for the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    Integer maxVnicAttachments;

    /**
     * The number of GPUs available to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    Integer gpus;

    /**
     * A short description of the instance's graphics processing unit (GPU).
     * <p>
     * If the instance does not have any GPUs, this field is `null`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    String gpuDescription;

    /**
     * The number of local disks available to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    Integer localDisks;

    /**
     * The aggregate size of all local disks, in gigabytes.
     * <p>
     * If the instance does not have any local disks, this field is `null`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    Float localDisksTotalSizeInGBs;

    /**
     * A short description of the local disks available to this instance.
     * <p>
     * If the instance does not have any local disks, this field is `null`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    String localDiskDescription;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
