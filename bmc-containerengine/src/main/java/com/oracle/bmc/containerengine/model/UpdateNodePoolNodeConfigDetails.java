/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The size and placement configuration of nodes in the node pool.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNodePoolNodeConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateNodePoolNodeConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "size",
        "nsgIds",
        "kmsKeyId",
        "isPvEncryptionInTransitEnabled",
        "freeformTags",
        "definedTags",
        "placementConfigs",
        "nodePoolPodNetworkOptionDetails"
    })
    public UpdateNodePoolNodeConfigDetails(
            Integer size,
            java.util.List<String> nsgIds,
            String kmsKeyId,
            Boolean isPvEncryptionInTransitEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<NodePoolPlacementConfigDetails> placementConfigs,
            NodePoolPodNetworkOptionDetails nodePoolPodNetworkOptionDetails) {
        super();
        this.size = size;
        this.nsgIds = nsgIds;
        this.kmsKeyId = kmsKeyId;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.placementConfigs = placementConfigs;
        this.nodePoolPodNetworkOptionDetails = nodePoolPodNetworkOptionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of nodes in the node pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * The number of nodes in the node pool.
         *
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The OCID of the Key Management Service key assigned to the boot volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Key Management Service key assigned to the boot volume.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        /**
         * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
         * @param isPvEncryptionInTransitEnabled the value to set
         * @return this builder
         **/
        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The placement configurations for the node pool. Provide one placement
         * configuration for each availability domain in which you intend to launch a node.
         * <p>
         * To use the node pool with a regional subnet, provide a placement configuration for
         * each availability domain, and include the regional subnet in each placement
         * configuration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("placementConfigs")
        private java.util.List<NodePoolPlacementConfigDetails> placementConfigs;

        /**
         * The placement configurations for the node pool. Provide one placement
         * configuration for each availability domain in which you intend to launch a node.
         * <p>
         * To use the node pool with a regional subnet, provide a placement configuration for
         * each availability domain, and include the regional subnet in each placement
         * configuration.
         *
         * @param placementConfigs the value to set
         * @return this builder
         **/
        public Builder placementConfigs(
                java.util.List<NodePoolPlacementConfigDetails> placementConfigs) {
            this.placementConfigs = placementConfigs;
            this.__explicitlySet__.add("placementConfigs");
            return this;
        }
        /**
         * The CNI related configuration of pods in the node pool.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodePoolPodNetworkOptionDetails")
        private NodePoolPodNetworkOptionDetails nodePoolPodNetworkOptionDetails;

        /**
         * The CNI related configuration of pods in the node pool.
         *
         * @param nodePoolPodNetworkOptionDetails the value to set
         * @return this builder
         **/
        public Builder nodePoolPodNetworkOptionDetails(
                NodePoolPodNetworkOptionDetails nodePoolPodNetworkOptionDetails) {
            this.nodePoolPodNetworkOptionDetails = nodePoolPodNetworkOptionDetails;
            this.__explicitlySet__.add("nodePoolPodNetworkOptionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNodePoolNodeConfigDetails build() {
            UpdateNodePoolNodeConfigDetails __instance__ =
                    new UpdateNodePoolNodeConfigDetails(
                            size,
                            nsgIds,
                            kmsKeyId,
                            isPvEncryptionInTransitEnabled,
                            freeformTags,
                            definedTags,
                            placementConfigs,
                            nodePoolPodNetworkOptionDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNodePoolNodeConfigDetails o) {
            Builder copiedBuilder =
                    size(o.getSize())
                            .nsgIds(o.getNsgIds())
                            .kmsKeyId(o.getKmsKeyId())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .placementConfigs(o.getPlacementConfigs())
                            .nodePoolPodNetworkOptionDetails(
                                    o.getNodePoolPodNetworkOptionDetails());

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
     * The number of nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * The number of nodes in the node pool.
     *
     * @return the value
     **/
    public Integer getSize() {
        return size;
    }

    /**
     * The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The OCIDs of the Network Security Group(s) to associate nodes for this node pool with. For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The OCID of the Key Management Service key assigned to the boot volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Key Management Service key assigned to the boot volume.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether to enable in-transit encryption for the data volume's paravirtualized attachment. This field applies to both block volumes and boot volumes. The default value is false.
     * @return the value
     **/
    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The placement configurations for the node pool. Provide one placement
     * configuration for each availability domain in which you intend to launch a node.
     * <p>
     * To use the node pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement
     * configuration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfigs")
    private final java.util.List<NodePoolPlacementConfigDetails> placementConfigs;

    /**
     * The placement configurations for the node pool. Provide one placement
     * configuration for each availability domain in which you intend to launch a node.
     * <p>
     * To use the node pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement
     * configuration.
     *
     * @return the value
     **/
    public java.util.List<NodePoolPlacementConfigDetails> getPlacementConfigs() {
        return placementConfigs;
    }

    /**
     * The CNI related configuration of pods in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodePoolPodNetworkOptionDetails")
    private final NodePoolPodNetworkOptionDetails nodePoolPodNetworkOptionDetails;

    /**
     * The CNI related configuration of pods in the node pool.
     *
     * @return the value
     **/
    public NodePoolPodNetworkOptionDetails getNodePoolPodNetworkOptionDetails() {
        return nodePoolPodNetworkOptionDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateNodePoolNodeConfigDetails(");
        sb.append("size=").append(String.valueOf(this.size));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", placementConfigs=").append(String.valueOf(this.placementConfigs));
        sb.append(", nodePoolPodNetworkOptionDetails=")
                .append(String.valueOf(this.nodePoolPodNetworkOptionDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNodePoolNodeConfigDetails)) {
            return false;
        }

        UpdateNodePoolNodeConfigDetails other = (UpdateNodePoolNodeConfigDetails) o;
        return java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.placementConfigs, other.placementConfigs)
                && java.util.Objects.equals(
                        this.nodePoolPodNetworkOptionDetails, other.nodePoolPodNetworkOptionDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.placementConfigs == null ? 43 : this.placementConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.nodePoolPodNetworkOptionDetails == null
                                ? 43
                                : this.nodePoolPodNetworkOptionDetails.hashCode());
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
