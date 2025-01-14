/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Description Preview after Scaling. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScaledBlockchainPlatformPreview.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScaledBlockchainPlatformPreview
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "computeShape",
        "storageSizeInTBs",
        "storageSizeInTBsPostScaling",
        "componentDetails",
        "replicas",
        "componentDetailsPostScaling",
        "replicasPostScaling",
        "hostOcpuUtilizationInfo",
        "hostOcpuUtilizationInfoPostScaling",
        "newVmCount",
        "meteringPreview",
        "scalePayload"
    })
    public ScaledBlockchainPlatformPreview(
            String id,
            String displayName,
            String compartmentId,
            String description,
            String computeShape,
            Double storageSizeInTBs,
            Double storageSizeInTBsPostScaling,
            BlockchainPlatformComponentDetails componentDetails,
            ReplicaDetails replicas,
            BlockchainPlatformComponentDetails componentDetailsPostScaling,
            ReplicaDetails replicasPostScaling,
            java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo,
            java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling,
            Integer newVmCount,
            ScaledPlatformMeteringPreview meteringPreview,
            ScaleBlockchainPlatformDetails scalePayload) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.computeShape = computeShape;
        this.storageSizeInTBs = storageSizeInTBs;
        this.storageSizeInTBsPostScaling = storageSizeInTBsPostScaling;
        this.componentDetails = componentDetails;
        this.replicas = replicas;
        this.componentDetailsPostScaling = componentDetailsPostScaling;
        this.replicasPostScaling = replicasPostScaling;
        this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
        this.hostOcpuUtilizationInfoPostScaling = hostOcpuUtilizationInfoPostScaling;
        this.newVmCount = newVmCount;
        this.meteringPreview = meteringPreview;
        this.scalePayload = scalePayload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Platform Instance Display name, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Platform Instance Display name, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Platform Instance Description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Platform Instance Description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private String computeShape;

        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         *
         * @param computeShape the value to set
         * @return this builder
         */
        public Builder computeShape(String computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }
        /** Storage size in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        /**
         * Storage size in TBs
         *
         * @param storageSizeInTBs the value to set
         * @return this builder
         */
        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }
        /** Storage size in TBs post scaling */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBsPostScaling")
        private Double storageSizeInTBsPostScaling;

        /**
         * Storage size in TBs post scaling
         *
         * @param storageSizeInTBsPostScaling the value to set
         * @return this builder
         */
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
        /** List of OcpuUtilization for all hosts */
        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

        /**
         * List of OcpuUtilization for all hosts
         *
         * @param hostOcpuUtilizationInfo the value to set
         * @return this builder
         */
        public Builder hostOcpuUtilizationInfo(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo) {
            this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
            this.__explicitlySet__.add("hostOcpuUtilizationInfo");
            return this;
        }
        /** List of OcpuUtilization for all hosts after scaling */
        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfoPostScaling")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling;

        /**
         * List of OcpuUtilization for all hosts after scaling
         *
         * @param hostOcpuUtilizationInfoPostScaling the value to set
         * @return this builder
         */
        public Builder hostOcpuUtilizationInfoPostScaling(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling) {
            this.hostOcpuUtilizationInfoPostScaling = hostOcpuUtilizationInfoPostScaling;
            this.__explicitlySet__.add("hostOcpuUtilizationInfoPostScaling");
            return this;
        }
        /** Number of new VMs that would be created */
        @com.fasterxml.jackson.annotation.JsonProperty("newVmCount")
        private Integer newVmCount;

        /**
         * Number of new VMs that would be created
         *
         * @param newVmCount the value to set
         * @return this builder
         */
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
            ScaledBlockchainPlatformPreview model =
                    new ScaledBlockchainPlatformPreview(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.computeShape,
                            this.storageSizeInTBs,
                            this.storageSizeInTBsPostScaling,
                            this.componentDetails,
                            this.replicas,
                            this.componentDetailsPostScaling,
                            this.replicasPostScaling,
                            this.hostOcpuUtilizationInfo,
                            this.hostOcpuUtilizationInfoPostScaling,
                            this.newVmCount,
                            this.meteringPreview,
                            this.scalePayload);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScaledBlockchainPlatformPreview model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("computeShape")) {
                this.computeShape(model.getComputeShape());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInTBs")) {
                this.storageSizeInTBs(model.getStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInTBsPostScaling")) {
                this.storageSizeInTBsPostScaling(model.getStorageSizeInTBsPostScaling());
            }
            if (model.wasPropertyExplicitlySet("componentDetails")) {
                this.componentDetails(model.getComponentDetails());
            }
            if (model.wasPropertyExplicitlySet("replicas")) {
                this.replicas(model.getReplicas());
            }
            if (model.wasPropertyExplicitlySet("componentDetailsPostScaling")) {
                this.componentDetailsPostScaling(model.getComponentDetailsPostScaling());
            }
            if (model.wasPropertyExplicitlySet("replicasPostScaling")) {
                this.replicasPostScaling(model.getReplicasPostScaling());
            }
            if (model.wasPropertyExplicitlySet("hostOcpuUtilizationInfo")) {
                this.hostOcpuUtilizationInfo(model.getHostOcpuUtilizationInfo());
            }
            if (model.wasPropertyExplicitlySet("hostOcpuUtilizationInfoPostScaling")) {
                this.hostOcpuUtilizationInfoPostScaling(
                        model.getHostOcpuUtilizationInfoPostScaling());
            }
            if (model.wasPropertyExplicitlySet("newVmCount")) {
                this.newVmCount(model.getNewVmCount());
            }
            if (model.wasPropertyExplicitlySet("meteringPreview")) {
                this.meteringPreview(model.getMeteringPreview());
            }
            if (model.wasPropertyExplicitlySet("scalePayload")) {
                this.scalePayload(model.getScalePayload());
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

    /** unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Platform Instance Display name, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Platform Instance Display name, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Platform Instance Description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Platform Instance Description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    private final String computeShape;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     *
     * @return the value
     */
    public String getComputeShape() {
        return computeShape;
    }

    /** Storage size in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    private final Double storageSizeInTBs;

    /**
     * Storage size in TBs
     *
     * @return the value
     */
    public Double getStorageSizeInTBs() {
        return storageSizeInTBs;
    }

    /** Storage size in TBs post scaling */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBsPostScaling")
    private final Double storageSizeInTBsPostScaling;

    /**
     * Storage size in TBs post scaling
     *
     * @return the value
     */
    public Double getStorageSizeInTBsPostScaling() {
        return storageSizeInTBsPostScaling;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
    private final BlockchainPlatformComponentDetails componentDetails;

    public BlockchainPlatformComponentDetails getComponentDetails() {
        return componentDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    private final ReplicaDetails replicas;

    public ReplicaDetails getReplicas() {
        return replicas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetailsPostScaling")
    private final BlockchainPlatformComponentDetails componentDetailsPostScaling;

    public BlockchainPlatformComponentDetails getComponentDetailsPostScaling() {
        return componentDetailsPostScaling;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicasPostScaling")
    private final ReplicaDetails replicasPostScaling;

    public ReplicaDetails getReplicasPostScaling() {
        return replicasPostScaling;
    }

    /** List of OcpuUtilization for all hosts */
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
    private final java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

    /**
     * List of OcpuUtilization for all hosts
     *
     * @return the value
     */
    public java.util.List<OcpuUtilizationInfo> getHostOcpuUtilizationInfo() {
        return hostOcpuUtilizationInfo;
    }

    /** List of OcpuUtilization for all hosts after scaling */
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfoPostScaling")
    private final java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfoPostScaling;

    /**
     * List of OcpuUtilization for all hosts after scaling
     *
     * @return the value
     */
    public java.util.List<OcpuUtilizationInfo> getHostOcpuUtilizationInfoPostScaling() {
        return hostOcpuUtilizationInfoPostScaling;
    }

    /** Number of new VMs that would be created */
    @com.fasterxml.jackson.annotation.JsonProperty("newVmCount")
    private final Integer newVmCount;

    /**
     * Number of new VMs that would be created
     *
     * @return the value
     */
    public Integer getNewVmCount() {
        return newVmCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("meteringPreview")
    private final ScaledPlatformMeteringPreview meteringPreview;

    public ScaledPlatformMeteringPreview getMeteringPreview() {
        return meteringPreview;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scalePayload")
    private final ScaleBlockchainPlatformDetails scalePayload;

    public ScaleBlockchainPlatformDetails getScalePayload() {
        return scalePayload;
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
        sb.append("ScaledBlockchainPlatformPreview(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", computeShape=").append(String.valueOf(this.computeShape));
        sb.append(", storageSizeInTBs=").append(String.valueOf(this.storageSizeInTBs));
        sb.append(", storageSizeInTBsPostScaling=")
                .append(String.valueOf(this.storageSizeInTBsPostScaling));
        sb.append(", componentDetails=").append(String.valueOf(this.componentDetails));
        sb.append(", replicas=").append(String.valueOf(this.replicas));
        sb.append(", componentDetailsPostScaling=")
                .append(String.valueOf(this.componentDetailsPostScaling));
        sb.append(", replicasPostScaling=").append(String.valueOf(this.replicasPostScaling));
        sb.append(", hostOcpuUtilizationInfo=")
                .append(String.valueOf(this.hostOcpuUtilizationInfo));
        sb.append(", hostOcpuUtilizationInfoPostScaling=")
                .append(String.valueOf(this.hostOcpuUtilizationInfoPostScaling));
        sb.append(", newVmCount=").append(String.valueOf(this.newVmCount));
        sb.append(", meteringPreview=").append(String.valueOf(this.meteringPreview));
        sb.append(", scalePayload=").append(String.valueOf(this.scalePayload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScaledBlockchainPlatformPreview)) {
            return false;
        }

        ScaledBlockchainPlatformPreview other = (ScaledBlockchainPlatformPreview) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.computeShape, other.computeShape)
                && java.util.Objects.equals(this.storageSizeInTBs, other.storageSizeInTBs)
                && java.util.Objects.equals(
                        this.storageSizeInTBsPostScaling, other.storageSizeInTBsPostScaling)
                && java.util.Objects.equals(this.componentDetails, other.componentDetails)
                && java.util.Objects.equals(this.replicas, other.replicas)
                && java.util.Objects.equals(
                        this.componentDetailsPostScaling, other.componentDetailsPostScaling)
                && java.util.Objects.equals(this.replicasPostScaling, other.replicasPostScaling)
                && java.util.Objects.equals(
                        this.hostOcpuUtilizationInfo, other.hostOcpuUtilizationInfo)
                && java.util.Objects.equals(
                        this.hostOcpuUtilizationInfoPostScaling,
                        other.hostOcpuUtilizationInfoPostScaling)
                && java.util.Objects.equals(this.newVmCount, other.newVmCount)
                && java.util.Objects.equals(this.meteringPreview, other.meteringPreview)
                && java.util.Objects.equals(this.scalePayload, other.scalePayload)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.computeShape == null ? 43 : this.computeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInTBs == null ? 43 : this.storageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInTBsPostScaling == null
                                ? 43
                                : this.storageSizeInTBsPostScaling.hashCode());
        result =
                (result * PRIME)
                        + (this.componentDetails == null ? 43 : this.componentDetails.hashCode());
        result = (result * PRIME) + (this.replicas == null ? 43 : this.replicas.hashCode());
        result =
                (result * PRIME)
                        + (this.componentDetailsPostScaling == null
                                ? 43
                                : this.componentDetailsPostScaling.hashCode());
        result =
                (result * PRIME)
                        + (this.replicasPostScaling == null
                                ? 43
                                : this.replicasPostScaling.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOcpuUtilizationInfo == null
                                ? 43
                                : this.hostOcpuUtilizationInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOcpuUtilizationInfoPostScaling == null
                                ? 43
                                : this.hostOcpuUtilizationInfoPostScaling.hashCode());
        result = (result * PRIME) + (this.newVmCount == null ? 43 : this.newVmCount.hashCode());
        result =
                (result * PRIME)
                        + (this.meteringPreview == null ? 43 : this.meteringPreview.hashCode());
        result = (result * PRIME) + (this.scalePayload == null ? 43 : this.scalePayload.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
