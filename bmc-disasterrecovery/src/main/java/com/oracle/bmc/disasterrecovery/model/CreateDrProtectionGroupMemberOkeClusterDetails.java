/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create properties for an OKE member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDrProtectionGroupMemberOkeClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDrProtectionGroupMemberOkeClusterDetails
        extends CreateDrProtectionGroupMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * The OCID of the peer OKE cluster. This property applies to the OKE cluster member in both
         * the primary and standby region.
         *
         * <p>Example: {@code ocid1.cluster.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerClusterId")
        private String peerClusterId;

        /**
         * The OCID of the peer OKE cluster. This property applies to the OKE cluster member in both
         * the primary and standby region.
         *
         * <p>Example: {@code ocid1.cluster.oc1..uniqueID}
         *
         * @param peerClusterId the value to set
         * @return this builder
         */
        public Builder peerClusterId(String peerClusterId) {
            this.peerClusterId = peerClusterId;
            this.__explicitlySet__.add("peerClusterId");
            return this;
        }
        /**
         * The OCID of the compute instance member that is designated as a jump host. This compute
         * instance will be used to perform DR operations on the cluster using Oracle Cloud Agent's
         * Run Command feature.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jumpHostId")
        private String jumpHostId;

        /**
         * The OCID of the compute instance member that is designated as a jump host. This compute
         * instance will be used to perform DR operations on the cluster using Oracle Cloud Agent's
         * Run Command feature.
         *
         * <p>Example: {@code ocid1.instance.oc1..uniqueID}
         *
         * @param jumpHostId the value to set
         * @return this builder
         */
        public Builder jumpHostId(String jumpHostId) {
            this.jumpHostId = jumpHostId;
            this.__explicitlySet__.add("jumpHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
        private CreateOkeBackupLocationDetails backupLocation;

        public Builder backupLocation(CreateOkeBackupLocationDetails backupLocation) {
            this.backupLocation = backupLocation;
            this.__explicitlySet__.add("backupLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private CreateOkeClusterBackupConfigDetails backupConfig;

        public Builder backupConfig(CreateOkeClusterBackupConfigDetails backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }
        /**
         * The list of source-to-destination load balancer mappings required for DR operations. This
         * property applies to the OKE cluster member in primary region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMappings")
        private java.util.List<CreateOkeClusterLoadBalancerMappingDetails> loadBalancerMappings;

        /**
         * The list of source-to-destination load balancer mappings required for DR operations. This
         * property applies to the OKE cluster member in primary region.
         *
         * @param loadBalancerMappings the value to set
         * @return this builder
         */
        public Builder loadBalancerMappings(
                java.util.List<CreateOkeClusterLoadBalancerMappingDetails> loadBalancerMappings) {
            this.loadBalancerMappings = loadBalancerMappings;
            this.__explicitlySet__.add("loadBalancerMappings");
            return this;
        }
        /**
         * The list of source-to-destination network load balancer mappings required for DR
         * operations. This property applies to the OKE cluster member in primary region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkLoadBalancerMappings")
        private java.util.List<CreateOkeClusterNetworkLoadBalancerMappingDetails>
                networkLoadBalancerMappings;

        /**
         * The list of source-to-destination network load balancer mappings required for DR
         * operations. This property applies to the OKE cluster member in primary region.
         *
         * @param networkLoadBalancerMappings the value to set
         * @return this builder
         */
        public Builder networkLoadBalancerMappings(
                java.util.List<CreateOkeClusterNetworkLoadBalancerMappingDetails>
                        networkLoadBalancerMappings) {
            this.networkLoadBalancerMappings = networkLoadBalancerMappings;
            this.__explicitlySet__.add("networkLoadBalancerMappings");
            return this;
        }
        /**
         * The list of source-to-destination vault mappings required for DR operations. This
         * property applies to the OKE cluster member in primary region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultMappings")
        private java.util.List<CreateOkeClusterVaultMappingDetails> vaultMappings;

        /**
         * The list of source-to-destination vault mappings required for DR operations. This
         * property applies to the OKE cluster member in primary region.
         *
         * @param vaultMappings the value to set
         * @return this builder
         */
        public Builder vaultMappings(
                java.util.List<CreateOkeClusterVaultMappingDetails> vaultMappings) {
            this.vaultMappings = vaultMappings;
            this.__explicitlySet__.add("vaultMappings");
            return this;
        }
        /**
         * The list of managed node pools with configurations for minimum and maximum node counts.
         * This property applies to the OKE cluster member in both the primary and standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedNodePoolConfigs")
        private java.util.List<CreateOkeClusterManagedNodePoolConfigurationDetails>
                managedNodePoolConfigs;

        /**
         * The list of managed node pools with configurations for minimum and maximum node counts.
         * This property applies to the OKE cluster member in both the primary and standby region.
         *
         * @param managedNodePoolConfigs the value to set
         * @return this builder
         */
        public Builder managedNodePoolConfigs(
                java.util.List<CreateOkeClusterManagedNodePoolConfigurationDetails>
                        managedNodePoolConfigs) {
            this.managedNodePoolConfigs = managedNodePoolConfigs;
            this.__explicitlySet__.add("managedNodePoolConfigs");
            return this;
        }
        /**
         * The list of virtual node pools with configurations for minimum and maximum node counts.
         * This property applies to the OKE cluster member in both the primary and standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualNodePoolConfigs")
        private java.util.List<CreateOkeClusterVirtualNodePoolConfigurationDetails>
                virtualNodePoolConfigs;

        /**
         * The list of virtual node pools with configurations for minimum and maximum node counts.
         * This property applies to the OKE cluster member in both the primary and standby region.
         *
         * @param virtualNodePoolConfigs the value to set
         * @return this builder
         */
        public Builder virtualNodePoolConfigs(
                java.util.List<CreateOkeClusterVirtualNodePoolConfigurationDetails>
                        virtualNodePoolConfigs) {
            this.virtualNodePoolConfigs = virtualNodePoolConfigs;
            this.__explicitlySet__.add("virtualNodePoolConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrProtectionGroupMemberOkeClusterDetails build() {
            CreateDrProtectionGroupMemberOkeClusterDetails model =
                    new CreateDrProtectionGroupMemberOkeClusterDetails(
                            this.memberId,
                            this.peerClusterId,
                            this.jumpHostId,
                            this.backupLocation,
                            this.backupConfig,
                            this.loadBalancerMappings,
                            this.networkLoadBalancerMappings,
                            this.vaultMappings,
                            this.managedNodePoolConfigs,
                            this.virtualNodePoolConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrProtectionGroupMemberOkeClusterDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("peerClusterId")) {
                this.peerClusterId(model.getPeerClusterId());
            }
            if (model.wasPropertyExplicitlySet("jumpHostId")) {
                this.jumpHostId(model.getJumpHostId());
            }
            if (model.wasPropertyExplicitlySet("backupLocation")) {
                this.backupLocation(model.getBackupLocation());
            }
            if (model.wasPropertyExplicitlySet("backupConfig")) {
                this.backupConfig(model.getBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerMappings")) {
                this.loadBalancerMappings(model.getLoadBalancerMappings());
            }
            if (model.wasPropertyExplicitlySet("networkLoadBalancerMappings")) {
                this.networkLoadBalancerMappings(model.getNetworkLoadBalancerMappings());
            }
            if (model.wasPropertyExplicitlySet("vaultMappings")) {
                this.vaultMappings(model.getVaultMappings());
            }
            if (model.wasPropertyExplicitlySet("managedNodePoolConfigs")) {
                this.managedNodePoolConfigs(model.getManagedNodePoolConfigs());
            }
            if (model.wasPropertyExplicitlySet("virtualNodePoolConfigs")) {
                this.virtualNodePoolConfigs(model.getVirtualNodePoolConfigs());
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
    public CreateDrProtectionGroupMemberOkeClusterDetails(
            String memberId,
            String peerClusterId,
            String jumpHostId,
            CreateOkeBackupLocationDetails backupLocation,
            CreateOkeClusterBackupConfigDetails backupConfig,
            java.util.List<CreateOkeClusterLoadBalancerMappingDetails> loadBalancerMappings,
            java.util.List<CreateOkeClusterNetworkLoadBalancerMappingDetails>
                    networkLoadBalancerMappings,
            java.util.List<CreateOkeClusterVaultMappingDetails> vaultMappings,
            java.util.List<CreateOkeClusterManagedNodePoolConfigurationDetails>
                    managedNodePoolConfigs,
            java.util.List<CreateOkeClusterVirtualNodePoolConfigurationDetails>
                    virtualNodePoolConfigs) {
        super(memberId);
        this.peerClusterId = peerClusterId;
        this.jumpHostId = jumpHostId;
        this.backupLocation = backupLocation;
        this.backupConfig = backupConfig;
        this.loadBalancerMappings = loadBalancerMappings;
        this.networkLoadBalancerMappings = networkLoadBalancerMappings;
        this.vaultMappings = vaultMappings;
        this.managedNodePoolConfigs = managedNodePoolConfigs;
        this.virtualNodePoolConfigs = virtualNodePoolConfigs;
    }

    /**
     * The OCID of the peer OKE cluster. This property applies to the OKE cluster member in both the
     * primary and standby region.
     *
     * <p>Example: {@code ocid1.cluster.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerClusterId")
    private final String peerClusterId;

    /**
     * The OCID of the peer OKE cluster. This property applies to the OKE cluster member in both the
     * primary and standby region.
     *
     * <p>Example: {@code ocid1.cluster.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPeerClusterId() {
        return peerClusterId;
    }

    /**
     * The OCID of the compute instance member that is designated as a jump host. This compute
     * instance will be used to perform DR operations on the cluster using Oracle Cloud Agent's Run
     * Command feature.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jumpHostId")
    private final String jumpHostId;

    /**
     * The OCID of the compute instance member that is designated as a jump host. This compute
     * instance will be used to perform DR operations on the cluster using Oracle Cloud Agent's Run
     * Command feature.
     *
     * <p>Example: {@code ocid1.instance.oc1..uniqueID}
     *
     * @return the value
     */
    public String getJumpHostId() {
        return jumpHostId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupLocation")
    private final CreateOkeBackupLocationDetails backupLocation;

    public CreateOkeBackupLocationDetails getBackupLocation() {
        return backupLocation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    private final CreateOkeClusterBackupConfigDetails backupConfig;

    public CreateOkeClusterBackupConfigDetails getBackupConfig() {
        return backupConfig;
    }

    /**
     * The list of source-to-destination load balancer mappings required for DR operations. This
     * property applies to the OKE cluster member in primary region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerMappings")
    private final java.util.List<CreateOkeClusterLoadBalancerMappingDetails> loadBalancerMappings;

    /**
     * The list of source-to-destination load balancer mappings required for DR operations. This
     * property applies to the OKE cluster member in primary region.
     *
     * @return the value
     */
    public java.util.List<CreateOkeClusterLoadBalancerMappingDetails> getLoadBalancerMappings() {
        return loadBalancerMappings;
    }

    /**
     * The list of source-to-destination network load balancer mappings required for DR operations.
     * This property applies to the OKE cluster member in primary region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkLoadBalancerMappings")
    private final java.util.List<CreateOkeClusterNetworkLoadBalancerMappingDetails>
            networkLoadBalancerMappings;

    /**
     * The list of source-to-destination network load balancer mappings required for DR operations.
     * This property applies to the OKE cluster member in primary region.
     *
     * @return the value
     */
    public java.util.List<CreateOkeClusterNetworkLoadBalancerMappingDetails>
            getNetworkLoadBalancerMappings() {
        return networkLoadBalancerMappings;
    }

    /**
     * The list of source-to-destination vault mappings required for DR operations. This property
     * applies to the OKE cluster member in primary region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultMappings")
    private final java.util.List<CreateOkeClusterVaultMappingDetails> vaultMappings;

    /**
     * The list of source-to-destination vault mappings required for DR operations. This property
     * applies to the OKE cluster member in primary region.
     *
     * @return the value
     */
    public java.util.List<CreateOkeClusterVaultMappingDetails> getVaultMappings() {
        return vaultMappings;
    }

    /**
     * The list of managed node pools with configurations for minimum and maximum node counts. This
     * property applies to the OKE cluster member in both the primary and standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedNodePoolConfigs")
    private final java.util.List<CreateOkeClusterManagedNodePoolConfigurationDetails>
            managedNodePoolConfigs;

    /**
     * The list of managed node pools with configurations for minimum and maximum node counts. This
     * property applies to the OKE cluster member in both the primary and standby region.
     *
     * @return the value
     */
    public java.util.List<CreateOkeClusterManagedNodePoolConfigurationDetails>
            getManagedNodePoolConfigs() {
        return managedNodePoolConfigs;
    }

    /**
     * The list of virtual node pools with configurations for minimum and maximum node counts. This
     * property applies to the OKE cluster member in both the primary and standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualNodePoolConfigs")
    private final java.util.List<CreateOkeClusterVirtualNodePoolConfigurationDetails>
            virtualNodePoolConfigs;

    /**
     * The list of virtual node pools with configurations for minimum and maximum node counts. This
     * property applies to the OKE cluster member in both the primary and standby region.
     *
     * @return the value
     */
    public java.util.List<CreateOkeClusterVirtualNodePoolConfigurationDetails>
            getVirtualNodePoolConfigs() {
        return virtualNodePoolConfigs;
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
        sb.append("CreateDrProtectionGroupMemberOkeClusterDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", peerClusterId=").append(String.valueOf(this.peerClusterId));
        sb.append(", jumpHostId=").append(String.valueOf(this.jumpHostId));
        sb.append(", backupLocation=").append(String.valueOf(this.backupLocation));
        sb.append(", backupConfig=").append(String.valueOf(this.backupConfig));
        sb.append(", loadBalancerMappings=").append(String.valueOf(this.loadBalancerMappings));
        sb.append(", networkLoadBalancerMappings=")
                .append(String.valueOf(this.networkLoadBalancerMappings));
        sb.append(", vaultMappings=").append(String.valueOf(this.vaultMappings));
        sb.append(", managedNodePoolConfigs=").append(String.valueOf(this.managedNodePoolConfigs));
        sb.append(", virtualNodePoolConfigs=").append(String.valueOf(this.virtualNodePoolConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrProtectionGroupMemberOkeClusterDetails)) {
            return false;
        }

        CreateDrProtectionGroupMemberOkeClusterDetails other =
                (CreateDrProtectionGroupMemberOkeClusterDetails) o;
        return java.util.Objects.equals(this.peerClusterId, other.peerClusterId)
                && java.util.Objects.equals(this.jumpHostId, other.jumpHostId)
                && java.util.Objects.equals(this.backupLocation, other.backupLocation)
                && java.util.Objects.equals(this.backupConfig, other.backupConfig)
                && java.util.Objects.equals(this.loadBalancerMappings, other.loadBalancerMappings)
                && java.util.Objects.equals(
                        this.networkLoadBalancerMappings, other.networkLoadBalancerMappings)
                && java.util.Objects.equals(this.vaultMappings, other.vaultMappings)
                && java.util.Objects.equals(
                        this.managedNodePoolConfigs, other.managedNodePoolConfigs)
                && java.util.Objects.equals(
                        this.virtualNodePoolConfigs, other.virtualNodePoolConfigs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.peerClusterId == null ? 43 : this.peerClusterId.hashCode());
        result = (result * PRIME) + (this.jumpHostId == null ? 43 : this.jumpHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupLocation == null ? 43 : this.backupLocation.hashCode());
        result = (result * PRIME) + (this.backupConfig == null ? 43 : this.backupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerMappings == null
                                ? 43
                                : this.loadBalancerMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerMappings == null
                                ? 43
                                : this.networkLoadBalancerMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.vaultMappings == null ? 43 : this.vaultMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.managedNodePoolConfigs == null
                                ? 43
                                : this.managedNodePoolConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualNodePoolConfigs == null
                                ? 43
                                : this.virtualNodePoolConfigs.hashCode());
        return result;
    }
}
