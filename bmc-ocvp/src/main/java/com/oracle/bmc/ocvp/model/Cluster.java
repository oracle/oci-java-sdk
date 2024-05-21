/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An [Oracle Cloud VMware Solution](https://docs.cloud.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm) Cluster contains the resources required for a
 * functional VMware environment. Instances in a Cluster
 * (see {@link EsxiHost}) run in a virtual cloud network (VCN)
 * and are preconfigured with VMware and storage. Use the vCenter utility to manage
 * and deploy VMware virtual machines (VMs) in the Cluster.
 * <p>
 * The Cluster uses a single management subnet for provisioning the Cluster. It also uses a
 * set of VLANs for various components of the VMware environment (vSphere, vMotion,
 * vSAN, and so on). See the Core Services API for information about VCN subnets and VLANs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Cluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Cluster extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "computeAvailabilityDomain",
        "displayName",
        "instanceDisplayNamePrefix",
        "vmwareSoftwareVersion",
        "esxiSoftwareVersion",
        "compartmentId",
        "sddcId",
        "esxiHostsCount",
        "initialCommitment",
        "workloadNetworkCidr",
        "networkConfiguration",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "upgradeLicenses",
        "vsphereUpgradeObjects",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isShieldedInstanceEnabled",
        "capacityReservationId",
        "datastores",
        "vsphereType",
        "freeformTags",
        "definedTags"
    })
    public Cluster(
            String id,
            String computeAvailabilityDomain,
            String displayName,
            String instanceDisplayNamePrefix,
            String vmwareSoftwareVersion,
            String esxiSoftwareVersion,
            String compartmentId,
            String sddcId,
            Integer esxiHostsCount,
            Commitment initialCommitment,
            String workloadNetworkCidr,
            NetworkConfiguration networkConfiguration,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            java.util.List<VsphereLicense> upgradeLicenses,
            java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isShieldedInstanceEnabled,
            String capacityReservationId,
            java.util.List<DatastoreDetails> datastores,
            VsphereTypes vsphereType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.compartmentId = compartmentId;
        this.sddcId = sddcId;
        this.esxiHostsCount = esxiHostsCount;
        this.initialCommitment = initialCommitment;
        this.workloadNetworkCidr = workloadNetworkCidr;
        this.networkConfiguration = networkConfiguration;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.upgradeLicenses = upgradeLicenses;
        this.vsphereUpgradeObjects = vsphereUpgradeObjects;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.capacityReservationId = capacityReservationId;
        this.datastores = datastores;
        this.vsphereType = vsphereType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Cluster.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The availability domain the ESXi hosts are running in. For Multi-AD Cluster, it is {@code multi-AD}.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain the ESXi hosts are running in. For Multi-AD Cluster, it is {@code multi-AD}.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
         *
         * @param computeAvailabilityDomain the value to set
         * @return this builder
         **/
        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }
        /**
         * A descriptive name for the Cluster. It must be unique, start with a letter, and contain only letters, digits,
         * whitespaces, dashes and underscores.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the Cluster. It must be unique, start with a letter, and contain only letters, digits,
         * whitespaces, dashes and underscores.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A prefix used in the name of each ESXi host and Compute instance in the Cluster.
         * If this isn't set, the Cluster's {@code displayName} is used as the prefix.
         * <p>
         * For example, if the value is {@code MyCluster}, the ESXi hosts are named {@code MyCluster-1},
         * {@code MyCluster-2}, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        /**
         * A prefix used in the name of each ESXi host and Compute instance in the Cluster.
         * If this isn't set, the Cluster's {@code displayName} is used as the prefix.
         * <p>
         * For example, if the value is {@code MyCluster}, the ESXi hosts are named {@code MyCluster-1},
         * {@code MyCluster-2}, and so on.
         *
         * @param instanceDisplayNamePrefix the value to set
         * @return this builder
         **/
        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
            return this;
        }
        /**
         * In general, this is a specific version of bundled VMware software supported by
         * Oracle Cloud VMware Solution (see
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
         * <p>
         * This attribute is not guaranteed to reflect the version of
         * software currently installed on the ESXi hosts in the Cluster. The purpose
         * of this attribute is to show the version of software that the Oracle
         * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         * <p>
         * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
         * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
         * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
         * {@code vmwareSoftwareVersion} with that new version.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * In general, this is a specific version of bundled VMware software supported by
         * Oracle Cloud VMware Solution (see
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
         * <p>
         * This attribute is not guaranteed to reflect the version of
         * software currently installed on the ESXi hosts in the Cluster. The purpose
         * of this attribute is to show the version of software that the Oracle
         * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
         * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         * <p>
         * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
         * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
         * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
         * {@code vmwareSoftwareVersion} with that new version.
         *
         * @param vmwareSoftwareVersion the value to set
         * @return this builder
         **/
        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }
        /**
         * In general, this is a specific version of bundled ESXi software supported by
         * Oracle Cloud VMware Solution (see
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
         * <p>
         * This attribute is not guaranteed to reflect the version of
         * software currently installed on the ESXi hosts in the SDDC. The purpose
         * of this attribute is to show the version of software that the Oracle
         * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
         * unless a different version is configured on the ESXi host level.
         * <p>
         * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
         * version of bundled ESXi software supported by the Oracle Cloud VMware Solution, you
         * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
         * {@code esxiSoftwareVersion} with that new version.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * In general, this is a specific version of bundled ESXi software supported by
         * Oracle Cloud VMware Solution (see
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
         * <p>
         * This attribute is not guaranteed to reflect the version of
         * software currently installed on the ESXi hosts in the SDDC. The purpose
         * of this attribute is to show the version of software that the Oracle
         * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
         * unless a different version is configured on the ESXi host level.
         * <p>
         * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
         * version of bundled ESXi software supported by the Oracle Cloud VMware Solution, you
         * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
         * {@code esxiSoftwareVersion} with that new version.
         *
         * @param esxiSoftwareVersion the value to set
         * @return this builder
         **/
        public Builder esxiSoftwareVersion(String esxiSoftwareVersion) {
            this.esxiSoftwareVersion = esxiSoftwareVersion;
            this.__explicitlySet__.add("esxiSoftwareVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the Cluster.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
         * Cluster belongs to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
        private String sddcId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
         * Cluster belongs to.
         *
         * @param sddcId the value to set
         * @return this builder
         **/
        public Builder sddcId(String sddcId) {
            this.sddcId = sddcId;
            this.__explicitlySet__.add("sddcId");
            return this;
        }
        /**
         * The number of ESXi hosts in the Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        /**
         * The number of ESXi hosts in the Cluster.
         * @param esxiHostsCount the value to set
         * @return this builder
         **/
        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }
        /**
         * The billing option selected during Cluster creation.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialCommitment")
        private Commitment initialCommitment;

        /**
         * The billing option selected during Cluster creation.
         * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
         *
         * @param initialCommitment the value to set
         * @return this builder
         **/
        public Builder initialCommitment(Commitment initialCommitment) {
            this.initialCommitment = initialCommitment;
            this.__explicitlySet__.add("initialCommitment");
            return this;
        }
        /**
         * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
         * workloads.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
        private String workloadNetworkCidr;

        /**
         * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
         * workloads.
         *
         * @param workloadNetworkCidr the value to set
         * @return this builder
         **/
        public Builder workloadNetworkCidr(String workloadNetworkCidr) {
            this.workloadNetworkCidr = workloadNetworkCidr;
            this.__explicitlySet__.add("workloadNetworkCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }
        /**
         * The date and time the Cluster was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Cluster was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Cluster was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Cluster was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the Cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The vSphere licenses to use when upgrading the Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeLicenses")
        private java.util.List<VsphereLicense> upgradeLicenses;

        /**
         * The vSphere licenses to use when upgrading the Cluster.
         *
         * @param upgradeLicenses the value to set
         * @return this builder
         **/
        public Builder upgradeLicenses(java.util.List<VsphereLicense> upgradeLicenses) {
            this.upgradeLicenses = upgradeLicenses;
            this.__explicitlySet__.add("upgradeLicenses");
            return this;
        }
        /**
         * The links to binary objects needed to upgrade vSphere.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeObjects")
        private java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects;

        /**
         * The links to binary objects needed to upgrade vSphere.
         *
         * @param vsphereUpgradeObjects the value to set
         * @return this builder
         **/
        public Builder vsphereUpgradeObjects(
                java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects) {
            this.vsphereUpgradeObjects = vsphereUpgradeObjects;
            this.__explicitlySet__.add("vsphereUpgradeObjects");
            return this;
        }
        /**
         * The initial compute shape of the Cluster's ESXi hosts.
         * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
        private String initialHostShapeName;

        /**
         * The initial compute shape of the Cluster's ESXi hosts.
         * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         * @param initialHostShapeName the value to set
         * @return this builder
         **/
        public Builder initialHostShapeName(String initialHostShapeName) {
            this.initialHostShapeName = initialHostShapeName;
            this.__explicitlySet__.add("initialHostShapeName");
            return this;
        }
        /**
         * The initial OCPU count of the Cluster's ESXi hosts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
        private Float initialHostOcpuCount;

        /**
         * The initial OCPU count of the Cluster's ESXi hosts.
         *
         * @param initialHostOcpuCount the value to set
         * @return this builder
         **/
        public Builder initialHostOcpuCount(Float initialHostOcpuCount) {
            this.initialHostOcpuCount = initialHostOcpuCount;
            this.__explicitlySet__.add("initialHostOcpuCount");
            return this;
        }
        /**
         * Indicates whether shielded instance is enabled at the Cluster level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        /**
         * Indicates whether shielded instance is enabled at the Cluster level.
         *
         * @param isShieldedInstanceEnabled the value to set
         * @return this builder
         **/
        public Builder isShieldedInstanceEnabled(Boolean isShieldedInstanceEnabled) {
            this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
            this.__explicitlySet__.add("isShieldedInstanceEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         **/
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * Datastores used for the Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datastores")
        private java.util.List<DatastoreDetails> datastores;

        /**
         * Datastores used for the Cluster.
         *
         * @param datastores the value to set
         * @return this builder
         **/
        public Builder datastores(java.util.List<DatastoreDetails> datastores) {
            this.datastores = datastores;
            this.__explicitlySet__.add("datastores");
            return this;
        }
        /**
         * vSphere Cluster types.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereType")
        private VsphereTypes vsphereType;

        /**
         * vSphere Cluster types.
         *
         * @param vsphereType the value to set
         * @return this builder
         **/
        public Builder vsphereType(VsphereTypes vsphereType) {
            this.vsphereType = vsphereType;
            this.__explicitlySet__.add("vsphereType");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Cluster build() {
            Cluster model =
                    new Cluster(
                            this.id,
                            this.computeAvailabilityDomain,
                            this.displayName,
                            this.instanceDisplayNamePrefix,
                            this.vmwareSoftwareVersion,
                            this.esxiSoftwareVersion,
                            this.compartmentId,
                            this.sddcId,
                            this.esxiHostsCount,
                            this.initialCommitment,
                            this.workloadNetworkCidr,
                            this.networkConfiguration,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.upgradeLicenses,
                            this.vsphereUpgradeObjects,
                            this.initialHostShapeName,
                            this.initialHostOcpuCount,
                            this.isShieldedInstanceEnabled,
                            this.capacityReservationId,
                            this.datastores,
                            this.vsphereType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Cluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("computeAvailabilityDomain")) {
                this.computeAvailabilityDomain(model.getComputeAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("instanceDisplayNamePrefix")) {
                this.instanceDisplayNamePrefix(model.getInstanceDisplayNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("vmwareSoftwareVersion")) {
                this.vmwareSoftwareVersion(model.getVmwareSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersion")) {
                this.esxiSoftwareVersion(model.getEsxiSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sddcId")) {
                this.sddcId(model.getSddcId());
            }
            if (model.wasPropertyExplicitlySet("esxiHostsCount")) {
                this.esxiHostsCount(model.getEsxiHostsCount());
            }
            if (model.wasPropertyExplicitlySet("initialCommitment")) {
                this.initialCommitment(model.getInitialCommitment());
            }
            if (model.wasPropertyExplicitlySet("workloadNetworkCidr")) {
                this.workloadNetworkCidr(model.getWorkloadNetworkCidr());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("upgradeLicenses")) {
                this.upgradeLicenses(model.getUpgradeLicenses());
            }
            if (model.wasPropertyExplicitlySet("vsphereUpgradeObjects")) {
                this.vsphereUpgradeObjects(model.getVsphereUpgradeObjects());
            }
            if (model.wasPropertyExplicitlySet("initialHostShapeName")) {
                this.initialHostShapeName(model.getInitialHostShapeName());
            }
            if (model.wasPropertyExplicitlySet("initialHostOcpuCount")) {
                this.initialHostOcpuCount(model.getInitialHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("isShieldedInstanceEnabled")) {
                this.isShieldedInstanceEnabled(model.getIsShieldedInstanceEnabled());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("datastores")) {
                this.datastores(model.getDatastores());
            }
            if (model.wasPropertyExplicitlySet("vsphereType")) {
                this.vsphereType(model.getVsphereType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Cluster.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The availability domain the ESXi hosts are running in. For Multi-AD Cluster, it is {@code multi-AD}.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain the ESXi hosts are running in. For Multi-AD Cluster, it is {@code multi-AD}.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
     *
     * @return the value
     **/
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the Cluster. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the Cluster. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the Cluster.
     * If this isn't set, the Cluster's {@code displayName} is used as the prefix.
     * <p>
     * For example, if the value is {@code MyCluster}, the ESXi hosts are named {@code MyCluster-1},
     * {@code MyCluster-2}, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    private final String instanceDisplayNamePrefix;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the Cluster.
     * If this isn't set, the Cluster's {@code displayName} is used as the prefix.
     * <p>
     * For example, if the value is {@code MyCluster}, the ESXi hosts are named {@code MyCluster-1},
     * {@code MyCluster-2}, and so on.
     *
     * @return the value
     **/
    public String getInstanceDisplayNamePrefix() {
        return instanceDisplayNamePrefix;
    }

    /**
     * In general, this is a specific version of bundled VMware software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the Cluster. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
     * {@code vmwareSoftwareVersion} with that new version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * In general, this is a specific version of bundled VMware software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the Cluster. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * Cluster in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
     * {@code vmwareSoftwareVersion} with that new version.
     *
     * @return the value
     **/
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * In general, this is a specific version of bundled ESXi software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
     * unless a different version is configured on the ESXi host level.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
     * version of bundled ESXi software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
     * {@code esxiSoftwareVersion} with that new version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * In general, this is a specific version of bundled ESXi software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
     * unless a different version is configured on the ESXi host level.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the Cluster to use a newer
     * version of bundled ESXi software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateCluster(UpdateClusterRequest) updateCluster} to update the Cluster's
     * {@code esxiSoftwareVersion} with that new version.
     *
     * @return the value
     **/
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the Cluster.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
     * Cluster belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sddcId")
    private final String sddcId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC that the
     * Cluster belongs to.
     *
     * @return the value
     **/
    public String getSddcId() {
        return sddcId;
    }

    /**
     * The number of ESXi hosts in the Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    /**
     * The number of ESXi hosts in the Cluster.
     * @return the value
     **/
    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    /**
     * The billing option selected during Cluster creation.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialCommitment")
    private final Commitment initialCommitment;

    /**
     * The billing option selected during Cluster creation.
     * {@link #listSupportedCommitments(ListSupportedCommitmentsRequest) listSupportedCommitments}.
     *
     * @return the value
     **/
    public Commitment getInitialCommitment() {
        return initialCommitment;
    }

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
    private final String workloadNetworkCidr;

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     *
     * @return the value
     **/
    public String getWorkloadNetworkCidr() {
        return workloadNetworkCidr;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * The date and time the Cluster was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Cluster was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Cluster was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Cluster was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the Cluster.
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The vSphere licenses to use when upgrading the Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeLicenses")
    private final java.util.List<VsphereLicense> upgradeLicenses;

    /**
     * The vSphere licenses to use when upgrading the Cluster.
     *
     * @return the value
     **/
    public java.util.List<VsphereLicense> getUpgradeLicenses() {
        return upgradeLicenses;
    }

    /**
     * The links to binary objects needed to upgrade vSphere.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeObjects")
    private final java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects;

    /**
     * The links to binary objects needed to upgrade vSphere.
     *
     * @return the value
     **/
    public java.util.List<VsphereUpgradeObject> getVsphereUpgradeObjects() {
        return vsphereUpgradeObjects;
    }

    /**
     * The initial compute shape of the Cluster's ESXi hosts.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
    private final String initialHostShapeName;

    /**
     * The initial compute shape of the Cluster's ESXi hosts.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     **/
    public String getInitialHostShapeName() {
        return initialHostShapeName;
    }

    /**
     * The initial OCPU count of the Cluster's ESXi hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
    private final Float initialHostOcpuCount;

    /**
     * The initial OCPU count of the Cluster's ESXi hosts.
     *
     * @return the value
     **/
    public Float getInitialHostOcpuCount() {
        return initialHostOcpuCount;
    }

    /**
     * Indicates whether shielded instance is enabled at the Cluster level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    /**
     * Indicates whether shielded instance is enabled at the Cluster level.
     *
     * @return the value
     **/
    public Boolean getIsShieldedInstanceEnabled() {
        return isShieldedInstanceEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Capacity Reservation.
     *
     * @return the value
     **/
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * Datastores used for the Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datastores")
    private final java.util.List<DatastoreDetails> datastores;

    /**
     * Datastores used for the Cluster.
     *
     * @return the value
     **/
    public java.util.List<DatastoreDetails> getDatastores() {
        return datastores;
    }

    /**
     * vSphere Cluster types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereType")
    private final VsphereTypes vsphereType;

    /**
     * vSphere Cluster types.
     *
     * @return the value
     **/
    public VsphereTypes getVsphereType() {
        return vsphereType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Cluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceDisplayNamePrefix=")
                .append(String.valueOf(this.instanceDisplayNamePrefix));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sddcId=").append(String.valueOf(this.sddcId));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", initialCommitment=").append(String.valueOf(this.initialCommitment));
        sb.append(", workloadNetworkCidr=").append(String.valueOf(this.workloadNetworkCidr));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", upgradeLicenses=").append(String.valueOf(this.upgradeLicenses));
        sb.append(", vsphereUpgradeObjects=").append(String.valueOf(this.vsphereUpgradeObjects));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", datastores=").append(String.valueOf(this.datastores));
        sb.append(", vsphereType=").append(String.valueOf(this.vsphereType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cluster)) {
            return false;
        }

        Cluster other = (Cluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.instanceDisplayNamePrefix, other.instanceDisplayNamePrefix)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sddcId, other.sddcId)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.initialCommitment, other.initialCommitment)
                && java.util.Objects.equals(this.workloadNetworkCidr, other.workloadNetworkCidr)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.upgradeLicenses, other.upgradeLicenses)
                && java.util.Objects.equals(this.vsphereUpgradeObjects, other.vsphereUpgradeObjects)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.datastores, other.datastores)
                && java.util.Objects.equals(this.vsphereType, other.vsphereType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDisplayNamePrefix == null
                                ? 43
                                : this.instanceDisplayNamePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiSoftwareVersion == null
                                ? 43
                                : this.esxiSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sddcId == null ? 43 : this.sddcId.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.initialCommitment == null ? 43 : this.initialCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadNetworkCidr == null
                                ? 43
                                : this.workloadNetworkCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeLicenses == null ? 43 : this.upgradeLicenses.hashCode());
        result =
                (result * PRIME)
                        + (this.vsphereUpgradeObjects == null
                                ? 43
                                : this.vsphereUpgradeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostShapeName == null
                                ? 43
                                : this.initialHostShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.initialHostOcpuCount == null
                                ? 43
                                : this.initialHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isShieldedInstanceEnabled == null
                                ? 43
                                : this.isShieldedInstanceEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result = (result * PRIME) + (this.datastores == null ? 43 : this.datastores.hashCode());
        result = (result * PRIME) + (this.vsphereType == null ? 43 : this.vsphereType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
