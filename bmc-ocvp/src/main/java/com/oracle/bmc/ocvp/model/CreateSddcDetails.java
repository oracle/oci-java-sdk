/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSddcDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateSddcDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
        private Sku initialSku;

        public Builder initialSku(Sku initialSku) {
            this.initialSku = initialSku;
            this.__explicitlySet__.add("initialSku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
        private Boolean isHcxEnterpriseEnabled;

        public Builder isHcxEnterpriseEnabled(Boolean isHcxEnterpriseEnabled) {
            this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
            this.__explicitlySet__.add("isHcxEnterpriseEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
        private String sshAuthorizedKeys;

        public Builder sshAuthorizedKeys(String sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            this.__explicitlySet__.add("sshAuthorizedKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
        private String workloadNetworkCidr;

        public Builder workloadNetworkCidr(String workloadNetworkCidr) {
            this.workloadNetworkCidr = workloadNetworkCidr;
            this.__explicitlySet__.add("workloadNetworkCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
        private String provisioningSubnetId;

        public Builder provisioningSubnetId(String provisioningSubnetId) {
            this.provisioningSubnetId = provisioningSubnetId;
            this.__explicitlySet__.add("provisioningSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        public Builder vsphereVlanId(String vsphereVlanId) {
            this.vsphereVlanId = vsphereVlanId;
            this.__explicitlySet__.add("vsphereVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        public Builder vmotionVlanId(String vmotionVlanId) {
            this.vmotionVlanId = vmotionVlanId;
            this.__explicitlySet__.add("vmotionVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        public Builder vsanVlanId(String vsanVlanId) {
            this.vsanVlanId = vsanVlanId;
            this.__explicitlySet__.add("vsanVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        public Builder nsxVTepVlanId(String nsxVTepVlanId) {
            this.nsxVTepVlanId = nsxVTepVlanId;
            this.__explicitlySet__.add("nsxVTepVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        public Builder nsxEdgeVTepVlanId(String nsxEdgeVTepVlanId) {
            this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
            this.__explicitlySet__.add("nsxEdgeVTepVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        public Builder nsxEdgeUplink1VlanId(String nsxEdgeUplink1VlanId) {
            this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink1VlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        public Builder nsxEdgeUplink2VlanId(String nsxEdgeUplink2VlanId) {
            this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink2VlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
        private String replicationVlanId;

        public Builder replicationVlanId(String replicationVlanId) {
            this.replicationVlanId = replicationVlanId;
            this.__explicitlySet__.add("replicationVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
        private String provisioningVlanId;

        public Builder provisioningVlanId(String provisioningVlanId) {
            this.provisioningVlanId = provisioningVlanId;
            this.__explicitlySet__.add("provisioningVlanId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSddcDetails build() {
            CreateSddcDetails __instance__ =
                    new CreateSddcDetails(
                            computeAvailabilityDomain,
                            displayName,
                            vmwareSoftwareVersion,
                            compartmentId,
                            instanceDisplayNamePrefix,
                            esxiHostsCount,
                            initialSku,
                            isHcxEnabled,
                            hcxVlanId,
                            isHcxEnterpriseEnabled,
                            sshAuthorizedKeys,
                            workloadNetworkCidr,
                            provisioningSubnetId,
                            vsphereVlanId,
                            vmotionVlanId,
                            vsanVlanId,
                            nsxVTepVlanId,
                            nsxEdgeVTepVlanId,
                            nsxEdgeUplink1VlanId,
                            nsxEdgeUplink2VlanId,
                            replicationVlanId,
                            provisioningVlanId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSddcDetails o) {
            Builder copiedBuilder =
                    computeAvailabilityDomain(o.getComputeAvailabilityDomain())
                            .displayName(o.getDisplayName())
                            .vmwareSoftwareVersion(o.getVmwareSoftwareVersion())
                            .compartmentId(o.getCompartmentId())
                            .instanceDisplayNamePrefix(o.getInstanceDisplayNamePrefix())
                            .esxiHostsCount(o.getEsxiHostsCount())
                            .initialSku(o.getInitialSku())
                            .isHcxEnabled(o.getIsHcxEnabled())
                            .hcxVlanId(o.getHcxVlanId())
                            .isHcxEnterpriseEnabled(o.getIsHcxEnterpriseEnabled())
                            .sshAuthorizedKeys(o.getSshAuthorizedKeys())
                            .workloadNetworkCidr(o.getWorkloadNetworkCidr())
                            .provisioningSubnetId(o.getProvisioningSubnetId())
                            .vsphereVlanId(o.getVsphereVlanId())
                            .vmotionVlanId(o.getVmotionVlanId())
                            .vsanVlanId(o.getVsanVlanId())
                            .nsxVTepVlanId(o.getNsxVTepVlanId())
                            .nsxEdgeVTepVlanId(o.getNsxEdgeVTepVlanId())
                            .nsxEdgeUplink1VlanId(o.getNsxEdgeUplink1VlanId())
                            .nsxEdgeUplink2VlanId(o.getNsxEdgeUplink2VlanId())
                            .replicationVlanId(o.getReplicationVlanId())
                            .provisioningVlanId(o.getProvisioningVlanId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The availability domain to create the SDDC's ESXi hosts in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    String computeAvailabilityDomain;

    /**
     * A descriptive name for the SDDC.
     * SDDC name requirements are 1-16 character length limit, Must start with a letter, Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The VMware software bundle to install on the ESXi hosts in the SDDC. To get a
     * list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    String vmwareSoftwareVersion;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
     * If this isn't set, the SDDC's `displayName` is used as the prefix.
     * <p>
     * For example, if the value is `mySDDC`, the ESXi hosts are named `mySDDC-1`,
     * `mySDDC-2`, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    String instanceDisplayNamePrefix;

    /**
     * The number of ESXi hosts to create in the SDDC. You can add more hosts later
     * (see {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}).
     * <p>
     **Note:** If you later delete EXSi hosts from the SDDC to total less than 3,
     * you are still billed for the 3 minimum recommended EXSi hosts. Also,
     * you cannot add more VMware workloads to the SDDC until it again has at least
     * 3 ESXi hosts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    Integer esxiHostsCount;

    /**
     * Billing option selected during SDDC creation.
     * Oracle Cloud Infrastructure VMware Solution supports the following billing interval SKUs:
     * HOUR, MONTH, ONE_YEAR, and THREE_YEARS.
     * {@link #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
    Sku initialSku;

    /**
     * Indicates whether to enable HCX for this SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    Boolean isHcxEnabled;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the HCX
     * component of the VMware environment. This value is required only when `isHcxEnabled` is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    String hcxVlanId;

    /**
     * Indicates whether to enable HCX Enterprise for this SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
    Boolean isHcxEnterpriseEnabled;

    /**
     * One or more public SSH keys to be included in the `~/.ssh/authorized_keys` file for
     * the default user on each ESXi host. Use a newline character to separate multiple keys.
     * The SSH keys must be in the format required for the `authorized_keys` file
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
    String sshAuthorizedKeys;

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
    String workloadNetworkCidr;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet to use
     * for provisioning the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    String provisioningSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSphere
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    String vsphereVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vMotion
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    String vmotionVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the vSAN
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    String vsanVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX VTEP
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge VTEP
     * component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 1 component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN to use for the NSX Edge
     * Uplink 2 component of the VMware environment.
     * <p>
     **Note:** This VLAN is reserved for future use to deploy public-facing applications on the VMware SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    String nsxEdgeUplink2VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere Replication component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
    String replicationVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the Provisioning component of the VMware environment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
    String provisioningVlanId;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
