/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * Details of the SDDC.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSddcDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSddcDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeAvailabilityDomain",
        "displayName",
        "vmwareSoftwareVersion",
        "compartmentId",
        "instanceDisplayNamePrefix",
        "esxiHostsCount",
        "initialSku",
        "isHcxEnabled",
        "hcxVlanId",
        "isHcxEnterpriseEnabled",
        "isSingleHostSddc",
        "sshAuthorizedKeys",
        "workloadNetworkCidr",
        "provisioningSubnetId",
        "vsphereVlanId",
        "vmotionVlanId",
        "vsanVlanId",
        "nsxVTepVlanId",
        "nsxEdgeVTepVlanId",
        "nsxEdgeUplink1VlanId",
        "nsxEdgeUplink2VlanId",
        "replicationVlanId",
        "provisioningVlanId",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isShieldedInstanceEnabled",
        "capacityReservationId",
        "datastores",
        "freeformTags",
        "definedTags"
    })
    public CreateSddcDetails(
            String computeAvailabilityDomain,
            String displayName,
            String vmwareSoftwareVersion,
            String compartmentId,
            String instanceDisplayNamePrefix,
            Integer esxiHostsCount,
            Sku initialSku,
            Boolean isHcxEnabled,
            String hcxVlanId,
            Boolean isHcxEnterpriseEnabled,
            Boolean isSingleHostSddc,
            String sshAuthorizedKeys,
            String workloadNetworkCidr,
            String provisioningSubnetId,
            String vsphereVlanId,
            String vmotionVlanId,
            String vsanVlanId,
            String nsxVTepVlanId,
            String nsxEdgeVTepVlanId,
            String nsxEdgeUplink1VlanId,
            String nsxEdgeUplink2VlanId,
            String replicationVlanId,
            String provisioningVlanId,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isShieldedInstanceEnabled,
            String capacityReservationId,
            java.util.List<DatastoreInfo> datastores,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.compartmentId = compartmentId;
        this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
        this.esxiHostsCount = esxiHostsCount;
        this.initialSku = initialSku;
        this.isHcxEnabled = isHcxEnabled;
        this.hcxVlanId = hcxVlanId;
        this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
        this.isSingleHostSddc = isSingleHostSddc;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.workloadNetworkCidr = workloadNetworkCidr;
        this.provisioningSubnetId = provisioningSubnetId;
        this.vsphereVlanId = vsphereVlanId;
        this.vmotionVlanId = vmotionVlanId;
        this.vsanVlanId = vsanVlanId;
        this.nsxVTepVlanId = nsxVTepVlanId;
        this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
        this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
        this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
        this.replicationVlanId = replicationVlanId;
        this.provisioningVlanId = provisioningVlanId;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.capacityReservationId = capacityReservationId;
        this.datastores = datastores;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain to create the SDDC's ESXi hosts in. For multi-AD SDDC deployment, set to {@code multi-AD}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain to create the SDDC's ESXi hosts in. For multi-AD SDDC deployment, set to {@code multi-AD}.
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
         * A descriptive name for the SDDC.
         * SDDC name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the SDDC.
         * SDDC name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
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
         * The VMware software bundle to install on the ESXi hosts in the SDDC. To get a
         * list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * The VMware software bundle to install on the ESXi hosts in the SDDC. To get a
         * list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
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
         * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
         * If this isn't set, the SDDC's {@code displayName} is used as the prefix.
         * <p>
         * For example, if the value is {@code mySDDC}, the ESXi hosts are named {@code mySDDC-1},
         * {@code mySDDC-2}, and so on.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        /**
         * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
         * If this isn't set, the SDDC's {@code displayName} is used as the prefix.
         * <p>
         * For example, if the value is {@code mySDDC}, the ESXi hosts are named {@code mySDDC-1},
         * {@code mySDDC-2}, and so on.
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
         * The number of ESXi hosts to create in the SDDC. You can add more hosts later
         * (see {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating
         * a SDDC with a ESXi host count of 1 will be considered a single ESXi host SDDC.
         * <p>
         **Note:** If you later delete EXSi hosts from a production SDDC to total less
         * than 3, you are still billed for the 3 minimum recommended ESXi hosts. Also,
         * you cannot add more VMware workloads to the SDDC until it again has at least
         * 3 ESXi hosts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        /**
         * The number of ESXi hosts to create in the SDDC. You can add more hosts later
         * (see {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating
         * a SDDC with a ESXi host count of 1 will be considered a single ESXi host SDDC.
         * <p>
         **Note:** If you later delete EXSi hosts from a production SDDC to total less
         * than 3, you are still billed for the 3 minimum recommended ESXi hosts. Also,
         * you cannot add more VMware workloads to the SDDC until it again has at least
         * 3 ESXi hosts.
         *
         * @param esxiHostsCount the value to set
         * @return this builder
         **/
        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }
        /**
         * The billing option selected during SDDC creation.
         * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
        private Sku initialSku;

        /**
         * The billing option selected during SDDC creation.
         * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         *
         * @param initialSku the value to set
         * @return this builder
         **/
        public Builder initialSku(Sku initialSku) {
            this.initialSku = initialSku;
            this.__explicitlySet__.add("initialSku");
            return this;
        }
        /**
         * For SDDC with dense compute shapes, this parameter indicates whether to enable HCX Advanced for this SDDC.
         * For SDDC with standard compute shapes, this parameter is equivalent to {@code isHcxEnterpriseEnabled}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        /**
         * For SDDC with dense compute shapes, this parameter indicates whether to enable HCX Advanced for this SDDC.
         * For SDDC with standard compute shapes, this parameter is equivalent to {@code isHcxEnterpriseEnabled}.
         *
         * @param isHcxEnabled the value to set
         * @return this builder
         **/
        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the HCX
         * component of the VMware environment. This value is required only when {@code isHcxEnabled} is true.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the HCX
         * component of the VMware environment. This value is required only when {@code isHcxEnabled} is true.
         *
         * @param hcxVlanId the value to set
         * @return this builder
         **/
        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }
        /**
         * Indicates whether to enable HCX Enterprise for this SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
        private Boolean isHcxEnterpriseEnabled;

        /**
         * Indicates whether to enable HCX Enterprise for this SDDC.
         *
         * @param isHcxEnterpriseEnabled the value to set
         * @return this builder
         **/
        public Builder isHcxEnterpriseEnabled(Boolean isHcxEnterpriseEnabled) {
            this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
            this.__explicitlySet__.add("isHcxEnterpriseEnabled");
            return this;
        }
        /**
         * Indicates whether this SDDC is designated for only single ESXi host.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
        private Boolean isSingleHostSddc;

        /**
         * Indicates whether this SDDC is designated for only single ESXi host.
         *
         * @param isSingleHostSddc the value to set
         * @return this builder
         **/
        public Builder isSingleHostSddc(Boolean isSingleHostSddc) {
            this.isSingleHostSddc = isSingleHostSddc;
            this.__explicitlySet__.add("isSingleHostSddc");
            return this;
        }
        /**
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host. Use a newline character to separate multiple keys.
         * The SSH keys must be in the format required for the {@code authorized_keys} file
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
        private String sshAuthorizedKeys;

        /**
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host. Use a newline character to separate multiple keys.
         * The SSH keys must be in the format required for the {@code authorized_keys} file
         *
         * @param sshAuthorizedKeys the value to set
         * @return this builder
         **/
        public Builder sshAuthorizedKeys(String sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            this.__explicitlySet__.add("sshAuthorizedKeys");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet to use
         * for provisioning the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
        private String provisioningSubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet to use
         * for provisioning the SDDC.
         *
         * @param provisioningSubnetId the value to set
         * @return this builder
         **/
        public Builder provisioningSubnetId(String provisioningSubnetId) {
            this.provisioningSubnetId = provisioningSubnetId;
            this.__explicitlySet__.add("provisioningSubnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSphere
         * component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSphere
         * component of the VMware environment.
         *
         * @param vsphereVlanId the value to set
         * @return this builder
         **/
        public Builder vsphereVlanId(String vsphereVlanId) {
            this.vsphereVlanId = vsphereVlanId;
            this.__explicitlySet__.add("vsphereVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vMotion
         * component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vMotion
         * component of the VMware environment.
         *
         * @param vmotionVlanId the value to set
         * @return this builder
         **/
        public Builder vmotionVlanId(String vmotionVlanId) {
            this.vmotionVlanId = vmotionVlanId;
            this.__explicitlySet__.add("vmotionVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSAN
         * component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSAN
         * component of the VMware environment.
         *
         * @param vsanVlanId the value to set
         * @return this builder
         **/
        public Builder vsanVlanId(String vsanVlanId) {
            this.vsanVlanId = vsanVlanId;
            this.__explicitlySet__.add("vsanVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX VTEP
         * component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX VTEP
         * component of the VMware environment.
         *
         * @param nsxVTepVlanId the value to set
         * @return this builder
         **/
        public Builder nsxVTepVlanId(String nsxVTepVlanId) {
            this.nsxVTepVlanId = nsxVTepVlanId;
            this.__explicitlySet__.add("nsxVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge VTEP
         * component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge VTEP
         * component of the VMware environment.
         *
         * @param nsxEdgeVTepVlanId the value to set
         * @return this builder
         **/
        public Builder nsxEdgeVTepVlanId(String nsxEdgeVTepVlanId) {
            this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
            this.__explicitlySet__.add("nsxEdgeVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
         * Uplink 1 component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
         * Uplink 1 component of the VMware environment.
         *
         * @param nsxEdgeUplink1VlanId the value to set
         * @return this builder
         **/
        public Builder nsxEdgeUplink1VlanId(String nsxEdgeUplink1VlanId) {
            this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink1VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
         * Uplink 2 component of the VMware environment.
         * <p>
         **Note:** This VLAN is reserved for future use to deploy public-facing applications on the VMware SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
         * Uplink 2 component of the VMware environment.
         * <p>
         **Note:** This VLAN is reserved for future use to deploy public-facing applications on the VMware SDDC.
         *
         * @param nsxEdgeUplink2VlanId the value to set
         * @return this builder
         **/
        public Builder nsxEdgeUplink2VlanId(String nsxEdgeUplink2VlanId) {
            this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink2VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
         * for the vSphere Replication component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
        private String replicationVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
         * for the vSphere Replication component of the VMware environment.
         *
         * @param replicationVlanId the value to set
         * @return this builder
         **/
        public Builder replicationVlanId(String replicationVlanId) {
            this.replicationVlanId = replicationVlanId;
            this.__explicitlySet__.add("replicationVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
         * for the Provisioning component of the VMware environment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
        private String provisioningVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
         * for the Provisioning component of the VMware environment.
         *
         * @param provisioningVlanId the value to set
         * @return this builder
         **/
        public Builder provisioningVlanId(String provisioningVlanId) {
            this.provisioningVlanId = provisioningVlanId;
            this.__explicitlySet__.add("provisioningVlanId");
            return this;
        }
        /**
         * The initial compute shape of the SDDC's ESXi hosts.
         * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
        private String initialHostShapeName;

        /**
         * The initial compute shape of the SDDC's ESXi hosts.
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
         * The initial OCPU count of the SDDC's ESXi hosts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
        private Float initialHostOcpuCount;

        /**
         * The initial OCPU count of the SDDC's ESXi hosts.
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
         * Indicates whether shielded instance is enabled for this SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        /**
         * Indicates whether shielded instance is enabled for this SDDC.
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
         * A list of datastore info for the SDDC.
         * This value is required only when {@code initialHostShapeName} is a standard shape.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datastores")
        private java.util.List<DatastoreInfo> datastores;

        /**
         * A list of datastore info for the SDDC.
         * This value is required only when {@code initialHostShapeName} is a standard shape.
         *
         * @param datastores the value to set
         * @return this builder
         **/
        public Builder datastores(java.util.List<DatastoreInfo> datastores) {
            this.datastores = datastores;
            this.__explicitlySet__.add("datastores");
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

        public CreateSddcDetails build() {
            CreateSddcDetails model =
                    new CreateSddcDetails(
                            this.computeAvailabilityDomain,
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.compartmentId,
                            this.instanceDisplayNamePrefix,
                            this.esxiHostsCount,
                            this.initialSku,
                            this.isHcxEnabled,
                            this.hcxVlanId,
                            this.isHcxEnterpriseEnabled,
                            this.isSingleHostSddc,
                            this.sshAuthorizedKeys,
                            this.workloadNetworkCidr,
                            this.provisioningSubnetId,
                            this.vsphereVlanId,
                            this.vmotionVlanId,
                            this.vsanVlanId,
                            this.nsxVTepVlanId,
                            this.nsxEdgeVTepVlanId,
                            this.nsxEdgeUplink1VlanId,
                            this.nsxEdgeUplink2VlanId,
                            this.replicationVlanId,
                            this.provisioningVlanId,
                            this.initialHostShapeName,
                            this.initialHostOcpuCount,
                            this.isShieldedInstanceEnabled,
                            this.capacityReservationId,
                            this.datastores,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSddcDetails model) {
            if (model.wasPropertyExplicitlySet("computeAvailabilityDomain")) {
                this.computeAvailabilityDomain(model.getComputeAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vmwareSoftwareVersion")) {
                this.vmwareSoftwareVersion(model.getVmwareSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("instanceDisplayNamePrefix")) {
                this.instanceDisplayNamePrefix(model.getInstanceDisplayNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("esxiHostsCount")) {
                this.esxiHostsCount(model.getEsxiHostsCount());
            }
            if (model.wasPropertyExplicitlySet("initialSku")) {
                this.initialSku(model.getInitialSku());
            }
            if (model.wasPropertyExplicitlySet("isHcxEnabled")) {
                this.isHcxEnabled(model.getIsHcxEnabled());
            }
            if (model.wasPropertyExplicitlySet("hcxVlanId")) {
                this.hcxVlanId(model.getHcxVlanId());
            }
            if (model.wasPropertyExplicitlySet("isHcxEnterpriseEnabled")) {
                this.isHcxEnterpriseEnabled(model.getIsHcxEnterpriseEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSingleHostSddc")) {
                this.isSingleHostSddc(model.getIsSingleHostSddc());
            }
            if (model.wasPropertyExplicitlySet("sshAuthorizedKeys")) {
                this.sshAuthorizedKeys(model.getSshAuthorizedKeys());
            }
            if (model.wasPropertyExplicitlySet("workloadNetworkCidr")) {
                this.workloadNetworkCidr(model.getWorkloadNetworkCidr());
            }
            if (model.wasPropertyExplicitlySet("provisioningSubnetId")) {
                this.provisioningSubnetId(model.getProvisioningSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vsphereVlanId")) {
                this.vsphereVlanId(model.getVsphereVlanId());
            }
            if (model.wasPropertyExplicitlySet("vmotionVlanId")) {
                this.vmotionVlanId(model.getVmotionVlanId());
            }
            if (model.wasPropertyExplicitlySet("vsanVlanId")) {
                this.vsanVlanId(model.getVsanVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxVTepVlanId")) {
                this.nsxVTepVlanId(model.getNsxVTepVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeVTepVlanId")) {
                this.nsxEdgeVTepVlanId(model.getNsxEdgeVTepVlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplink1VlanId")) {
                this.nsxEdgeUplink1VlanId(model.getNsxEdgeUplink1VlanId());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplink2VlanId")) {
                this.nsxEdgeUplink2VlanId(model.getNsxEdgeUplink2VlanId());
            }
            if (model.wasPropertyExplicitlySet("replicationVlanId")) {
                this.replicationVlanId(model.getReplicationVlanId());
            }
            if (model.wasPropertyExplicitlySet("provisioningVlanId")) {
                this.provisioningVlanId(model.getProvisioningVlanId());
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
     * The availability domain to create the SDDC's ESXi hosts in. For multi-AD SDDC deployment, set to {@code multi-AD}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain to create the SDDC's ESXi hosts in. For multi-AD SDDC deployment, set to {@code multi-AD}.
     *
     * @return the value
     **/
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the SDDC.
     * SDDC name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the SDDC.
     * SDDC name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The VMware software bundle to install on the ESXi hosts in the SDDC. To get a
     * list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * The VMware software bundle to install on the ESXi hosts in the SDDC. To get a
     * list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     * @return the value
     **/
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
     * If this isn't set, the SDDC's {@code displayName} is used as the prefix.
     * <p>
     * For example, if the value is {@code mySDDC}, the ESXi hosts are named {@code mySDDC-1},
     * {@code mySDDC-2}, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    private final String instanceDisplayNamePrefix;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
     * If this isn't set, the SDDC's {@code displayName} is used as the prefix.
     * <p>
     * For example, if the value is {@code mySDDC}, the ESXi hosts are named {@code mySDDC-1},
     * {@code mySDDC-2}, and so on.
     *
     * @return the value
     **/
    public String getInstanceDisplayNamePrefix() {
        return instanceDisplayNamePrefix;
    }

    /**
     * The number of ESXi hosts to create in the SDDC. You can add more hosts later
     * (see {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating
     * a SDDC with a ESXi host count of 1 will be considered a single ESXi host SDDC.
     * <p>
     **Note:** If you later delete EXSi hosts from a production SDDC to total less
     * than 3, you are still billed for the 3 minimum recommended ESXi hosts. Also,
     * you cannot add more VMware workloads to the SDDC until it again has at least
     * 3 ESXi hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    /**
     * The number of ESXi hosts to create in the SDDC. You can add more hosts later
     * (see {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}). Creating
     * a SDDC with a ESXi host count of 1 will be considered a single ESXi host SDDC.
     * <p>
     **Note:** If you later delete EXSi hosts from a production SDDC to total less
     * than 3, you are still billed for the 3 minimum recommended ESXi hosts. Also,
     * you cannot add more VMware workloads to the SDDC until it again has at least
     * 3 ESXi hosts.
     *
     * @return the value
     **/
    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    /**
     * The billing option selected during SDDC creation.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
    private final Sku initialSku;

    /**
     * The billing option selected during SDDC creation.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     * @return the value
     **/
    public Sku getInitialSku() {
        return initialSku;
    }

    /**
     * For SDDC with dense compute shapes, this parameter indicates whether to enable HCX Advanced for this SDDC.
     * For SDDC with standard compute shapes, this parameter is equivalent to {@code isHcxEnterpriseEnabled}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    private final Boolean isHcxEnabled;

    /**
     * For SDDC with dense compute shapes, this parameter indicates whether to enable HCX Advanced for this SDDC.
     * For SDDC with standard compute shapes, this parameter is equivalent to {@code isHcxEnterpriseEnabled}.
     *
     * @return the value
     **/
    public Boolean getIsHcxEnabled() {
        return isHcxEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the HCX
     * component of the VMware environment. This value is required only when {@code isHcxEnabled} is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    private final String hcxVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the HCX
     * component of the VMware environment. This value is required only when {@code isHcxEnabled} is true.
     *
     * @return the value
     **/
    public String getHcxVlanId() {
        return hcxVlanId;
    }

    /**
     * Indicates whether to enable HCX Enterprise for this SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
    private final Boolean isHcxEnterpriseEnabled;

    /**
     * Indicates whether to enable HCX Enterprise for this SDDC.
     *
     * @return the value
     **/
    public Boolean getIsHcxEnterpriseEnabled() {
        return isHcxEnterpriseEnabled;
    }

    /**
     * Indicates whether this SDDC is designated for only single ESXi host.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
    private final Boolean isSingleHostSddc;

    /**
     * Indicates whether this SDDC is designated for only single ESXi host.
     *
     * @return the value
     **/
    public Boolean getIsSingleHostSddc() {
        return isSingleHostSddc;
    }

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
     * the default user on each ESXi host. Use a newline character to separate multiple keys.
     * The SSH keys must be in the format required for the {@code authorized_keys} file
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
    private final String sshAuthorizedKeys;

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
     * the default user on each ESXi host. Use a newline character to separate multiple keys.
     * The SSH keys must be in the format required for the {@code authorized_keys} file
     *
     * @return the value
     **/
    public String getSshAuthorizedKeys() {
        return sshAuthorizedKeys;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet to use
     * for provisioning the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    private final String provisioningSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet to use
     * for provisioning the SDDC.
     *
     * @return the value
     **/
    public String getProvisioningSubnetId() {
        return provisioningSubnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSphere
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    private final String vsphereVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSphere
     * component of the VMware environment.
     *
     * @return the value
     **/
    public String getVsphereVlanId() {
        return vsphereVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vMotion
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    private final String vmotionVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vMotion
     * component of the VMware environment.
     *
     * @return the value
     **/
    public String getVmotionVlanId() {
        return vmotionVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSAN
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    private final String vsanVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSAN
     * component of the VMware environment.
     *
     * @return the value
     **/
    public String getVsanVlanId() {
        return vsanVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX VTEP
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    private final String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX VTEP
     * component of the VMware environment.
     *
     * @return the value
     **/
    public String getNsxVTepVlanId() {
        return nsxVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge VTEP
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    private final String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge VTEP
     * component of the VMware environment.
     *
     * @return the value
     **/
    public String getNsxEdgeVTepVlanId() {
        return nsxEdgeVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 1 component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    private final String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 1 component of the VMware environment.
     *
     * @return the value
     **/
    public String getNsxEdgeUplink1VlanId() {
        return nsxEdgeUplink1VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 2 component of the VMware environment.
     * <p>
     **Note:** This VLAN is reserved for future use to deploy public-facing applications on the VMware SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    private final String nsxEdgeUplink2VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 2 component of the VMware environment.
     * <p>
     **Note:** This VLAN is reserved for future use to deploy public-facing applications on the VMware SDDC.
     *
     * @return the value
     **/
    public String getNsxEdgeUplink2VlanId() {
        return nsxEdgeUplink2VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere Replication component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
    private final String replicationVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere Replication component of the VMware environment.
     *
     * @return the value
     **/
    public String getReplicationVlanId() {
        return replicationVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the Provisioning component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
    private final String provisioningVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the Provisioning component of the VMware environment.
     *
     * @return the value
     **/
    public String getProvisioningVlanId() {
        return provisioningVlanId;
    }

    /**
     * The initial compute shape of the SDDC's ESXi hosts.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
    private final String initialHostShapeName;

    /**
     * The initial compute shape of the SDDC's ESXi hosts.
     * {@link #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     **/
    public String getInitialHostShapeName() {
        return initialHostShapeName;
    }

    /**
     * The initial OCPU count of the SDDC's ESXi hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
    private final Float initialHostOcpuCount;

    /**
     * The initial OCPU count of the SDDC's ESXi hosts.
     *
     * @return the value
     **/
    public Float getInitialHostOcpuCount() {
        return initialHostOcpuCount;
    }

    /**
     * Indicates whether shielded instance is enabled for this SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    /**
     * Indicates whether shielded instance is enabled for this SDDC.
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
     * A list of datastore info for the SDDC.
     * This value is required only when {@code initialHostShapeName} is a standard shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datastores")
    private final java.util.List<DatastoreInfo> datastores;

    /**
     * A list of datastore info for the SDDC.
     * This value is required only when {@code initialHostShapeName} is a standard shape.
     *
     * @return the value
     **/
    public java.util.List<DatastoreInfo> getDatastores() {
        return datastores;
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
        sb.append("CreateSddcDetails(");
        sb.append("super=").append(super.toString());
        sb.append("computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", instanceDisplayNamePrefix=")
                .append(String.valueOf(this.instanceDisplayNamePrefix));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", initialSku=").append(String.valueOf(this.initialSku));
        sb.append(", isHcxEnabled=").append(String.valueOf(this.isHcxEnabled));
        sb.append(", hcxVlanId=").append(String.valueOf(this.hcxVlanId));
        sb.append(", isHcxEnterpriseEnabled=").append(String.valueOf(this.isHcxEnterpriseEnabled));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
        sb.append(", workloadNetworkCidr=").append(String.valueOf(this.workloadNetworkCidr));
        sb.append(", provisioningSubnetId=").append(String.valueOf(this.provisioningSubnetId));
        sb.append(", vsphereVlanId=").append(String.valueOf(this.vsphereVlanId));
        sb.append(", vmotionVlanId=").append(String.valueOf(this.vmotionVlanId));
        sb.append(", vsanVlanId=").append(String.valueOf(this.vsanVlanId));
        sb.append(", nsxVTepVlanId=").append(String.valueOf(this.nsxVTepVlanId));
        sb.append(", nsxEdgeVTepVlanId=").append(String.valueOf(this.nsxEdgeVTepVlanId));
        sb.append(", nsxEdgeUplink1VlanId=").append(String.valueOf(this.nsxEdgeUplink1VlanId));
        sb.append(", nsxEdgeUplink2VlanId=").append(String.valueOf(this.nsxEdgeUplink2VlanId));
        sb.append(", replicationVlanId=").append(String.valueOf(this.replicationVlanId));
        sb.append(", provisioningVlanId=").append(String.valueOf(this.provisioningVlanId));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", datastores=").append(String.valueOf(this.datastores));
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
        if (!(o instanceof CreateSddcDetails)) {
            return false;
        }

        CreateSddcDetails other = (CreateSddcDetails) o;
        return java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.instanceDisplayNamePrefix, other.instanceDisplayNamePrefix)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.initialSku, other.initialSku)
                && java.util.Objects.equals(this.isHcxEnabled, other.isHcxEnabled)
                && java.util.Objects.equals(this.hcxVlanId, other.hcxVlanId)
                && java.util.Objects.equals(
                        this.isHcxEnterpriseEnabled, other.isHcxEnterpriseEnabled)
                && java.util.Objects.equals(this.isSingleHostSddc, other.isSingleHostSddc)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
                && java.util.Objects.equals(this.workloadNetworkCidr, other.workloadNetworkCidr)
                && java.util.Objects.equals(this.provisioningSubnetId, other.provisioningSubnetId)
                && java.util.Objects.equals(this.vsphereVlanId, other.vsphereVlanId)
                && java.util.Objects.equals(this.vmotionVlanId, other.vmotionVlanId)
                && java.util.Objects.equals(this.vsanVlanId, other.vsanVlanId)
                && java.util.Objects.equals(this.nsxVTepVlanId, other.nsxVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeVTepVlanId, other.nsxEdgeVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink1VlanId, other.nsxEdgeUplink1VlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink2VlanId, other.nsxEdgeUplink2VlanId)
                && java.util.Objects.equals(this.replicationVlanId, other.replicationVlanId)
                && java.util.Objects.equals(this.provisioningVlanId, other.provisioningVlanId)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.datastores, other.datastores)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.computeAvailabilityDomain == null
                                ? 43
                                : this.computeAvailabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDisplayNamePrefix == null
                                ? 43
                                : this.instanceDisplayNamePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result = (result * PRIME) + (this.initialSku == null ? 43 : this.initialSku.hashCode());
        result = (result * PRIME) + (this.isHcxEnabled == null ? 43 : this.isHcxEnabled.hashCode());
        result = (result * PRIME) + (this.hcxVlanId == null ? 43 : this.hcxVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHcxEnterpriseEnabled == null
                                ? 43
                                : this.isHcxEnterpriseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleHostSddc == null ? 43 : this.isSingleHostSddc.hashCode());
        result =
                (result * PRIME)
                        + (this.sshAuthorizedKeys == null ? 43 : this.sshAuthorizedKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.workloadNetworkCidr == null
                                ? 43
                                : this.workloadNetworkCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningSubnetId == null
                                ? 43
                                : this.provisioningSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.vsphereVlanId == null ? 43 : this.vsphereVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmotionVlanId == null ? 43 : this.vmotionVlanId.hashCode());
        result = (result * PRIME) + (this.vsanVlanId == null ? 43 : this.vsanVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxVTepVlanId == null ? 43 : this.nsxVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeVTepVlanId == null ? 43 : this.nsxEdgeVTepVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink1VlanId == null
                                ? 43
                                : this.nsxEdgeUplink1VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplink2VlanId == null
                                ? 43
                                : this.nsxEdgeUplink2VlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationVlanId == null ? 43 : this.replicationVlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningVlanId == null
                                ? 43
                                : this.provisioningVlanId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
