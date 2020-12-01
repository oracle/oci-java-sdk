/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Description Preview after Scaling.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScaledBlockchainPlatformPreview.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScaledBlockchainPlatformPreview {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private String computeShape;

        public Builder computeShape(String computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBsPostScaling")
        private Double storageSizeInTBsPostScaling;

        public Builder storageSizeInTBsPostScaling(Double storageSizeInTBsPostScaling) {
            this.storageSizeInTBsPostScaling = storageSizeInTBsPostScaling;
            this.__explicitlySet__.add("storageSizeInTBsPostScaling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
        private BlockchainPlatformComponentDetails componentDetails;

        public Builder componentDetails(BlockchainPlatformComponentDetails componentDetails) {
            this.componentDetails = componentDetails;
            this.__explicitlySet__.add("componentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private ReplicaDetails replicas;

        public Builder replicas(ReplicaDetails replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentDetailsPostScaling")
        private BlockchainPlatformComponentDetails componentDetailsPostScaling;

        public Builder componentDetailsPostScaling(
                BlockchainPlatformComponentDetails componentDetailsPostScaling) {
            this.componentDetailsPostScaling = componentDetailsPostScaling;
            this.__explicitlySet__.add("componentDetailsPostScaling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicasPostScaling")
        private ReplicaDetails replicasPostScaling;

        public Builder replicasPostScaling(ReplicaDetails replicasPostScaling) {
            this.replicasPostScaling = replicasPostScaling;
            this.__explicitlySet__.add("replicasPostScaling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

        public Builder hostOcpuUtilizationInfo(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo) {
            this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
            this.__explicitlySet__.add("hostOcpuUtilizationInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfoPostScaling")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling;

        public Builder hostOcpuUtilizationInfoPostScaling(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling) {
            this.hostOcpuUtilizationInfoPostScaling = hostOcpuUtilizationInfoPostScaling;
            this.__explicitlySet__.add("hostOcpuUtilizationInfoPostScaling");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newVmCount")
        private Integer newVmCount;

        public Builder newVmCount(Integer newVmCount) {
            this.newVmCount = newVmCount;
            this.__explicitlySet__.add("newVmCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("meteringPreview")
        private ScaledPlatformMeteringPreview meteringPreview;

        public Builder meteringPreview(ScaledPlatformMeteringPreview meteringPreview) {
            this.meteringPreview = meteringPreview;
            this.__explicitlySet__.add("meteringPreview");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scalePayload")
        private ScaleBlockchainPlatformDetails scalePayload;

        public Builder scalePayload(ScaleBlockchainPlatformDetails scalePayload) {
            this.scalePayload = scalePayload;
            this.__explicitlySet__.add("scalePayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScaledBlockchainPlatformPreview build() {
            ScaledBlockchainPlatformPreview __instance__ =
                    new ScaledBlockchainPlatformPreview(
                            id,
                            displayName,
                            compartmentId,
                            description,
                            computeShape,
                            storageSizeInTBs,
                            storageSizeInTBsPostScaling,
                            componentDetails,
                            replicas,
                            componentDetailsPostScaling,
                            replicasPostScaling,
                            hostOcpuUtilizationInfo,
                            hostOcpuUtilizationInfoPostScaling,
                            newVmCount,
                            meteringPreview,
                            scalePayload);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaledBlockchainPlatformPreview o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .description(o.getDescription())
                            .computeShape(o.getComputeShape())
                            .storageSizeInTBs(o.getStorageSizeInTBs())
                            .storageSizeInTBsPostScaling(o.getStorageSizeInTBsPostScaling())
                            .componentDetails(o.getComponentDetails())
                            .replicas(o.getReplicas())
                            .componentDetailsPostScaling(o.getComponentDetailsPostScaling())
                            .replicasPostScaling(o.getReplicasPostScaling())
                            .hostOcpuUtilizationInfo(o.getHostOcpuUtilizationInfo())
                            .hostOcpuUtilizationInfoPostScaling(
                                    o.getHostOcpuUtilizationInfoPostScaling())
                            .newVmCount(o.getNewVmCount())
                            .meteringPreview(o.getMeteringPreview())
                            .scalePayload(o.getScalePayload());

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
     * unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Platform Instance Display name, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Platform Instance Description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    String computeShape;

    /**
     * Storage size in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    Double storageSizeInTBs;

    /**
     * Storage size in TBs post scaling
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBsPostScaling")
    Double storageSizeInTBsPostScaling;

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
    BlockchainPlatformComponentDetails componentDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    ReplicaDetails replicas;

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetailsPostScaling")
    BlockchainPlatformComponentDetails componentDetailsPostScaling;

    @com.fasterxml.jackson.annotation.JsonProperty("replicasPostScaling")
    ReplicaDetails replicasPostScaling;

    /**
     * List of OcpuUtilization for all hosts
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
    java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

    /**
     * List of OcpuUtilization for all hosts after scaling
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfoPostScaling")
    java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling;

    /**
     * Number of new VMs that would be created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newVmCount")
    Integer newVmCount;

    @com.fasterxml.jackson.annotation.JsonProperty("meteringPreview")
    ScaledPlatformMeteringPreview meteringPreview;

    @com.fasterxml.jackson.annotation.JsonProperty("scalePayload")
    ScaleBlockchainPlatformDetails scalePayload;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
