/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An [Oracle Cloud VMware Solution](https://docs.cloud.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm) software-defined data center (SDDC) contains the resources required for a
 * functional VMware environment. Instances in an SDDC
 * (see {@link EsxiHost}) run in a virtual cloud network (VCN)
 * and are preconfigured with VMware and storage. Use the vCenter utility to manage
 * and deploy VMware virtual machines (VMs) in the SDDC.
 * <p>
 * The SDDC uses a single management subnet for provisioning the SDDC. It also uses a
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sddc.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Sddc {
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

        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
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

        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        public Builder vcenterFqdn(String vcenterFqdn) {
            this.vcenterFqdn = vcenterFqdn;
            this.__explicitlySet__.add("vcenterFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        public Builder nsxManagerFqdn(String nsxManagerFqdn) {
            this.nsxManagerFqdn = nsxManagerFqdn;
            this.__explicitlySet__.add("nsxManagerFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
        private String vcenterPrivateIpId;

        public Builder vcenterPrivateIpId(String vcenterPrivateIpId) {
            this.vcenterPrivateIpId = vcenterPrivateIpId;
            this.__explicitlySet__.add("vcenterPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
        private String nsxManagerPrivateIpId;

        public Builder nsxManagerPrivateIpId(String nsxManagerPrivateIpId) {
            this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
            this.__explicitlySet__.add("nsxManagerPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
        private String vcenterInitialPassword;

        public Builder vcenterInitialPassword(String vcenterInitialPassword) {
            this.vcenterInitialPassword = vcenterInitialPassword;
            this.__explicitlySet__.add("vcenterInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
        private String nsxManagerInitialPassword;

        public Builder nsxManagerInitialPassword(String nsxManagerInitialPassword) {
            this.nsxManagerInitialPassword = nsxManagerInitialPassword;
            this.__explicitlySet__.add("nsxManagerInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
        private String vcenterUsername;

        public Builder vcenterUsername(String vcenterUsername) {
            this.vcenterUsername = vcenterUsername;
            this.__explicitlySet__.add("vcenterUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
        private String nsxManagerUsername;

        public Builder nsxManagerUsername(String nsxManagerUsername) {
            this.nsxManagerUsername = nsxManagerUsername;
            this.__explicitlySet__.add("nsxManagerUsername");
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

        @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
        private String nsxOverlaySegmentName;

        public Builder nsxOverlaySegmentName(String nsxOverlaySegmentName) {
            this.nsxOverlaySegmentName = nsxOverlaySegmentName;
            this.__explicitlySet__.add("nsxOverlaySegmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
        private String nsxEdgeUplinkIpId;

        public Builder nsxEdgeUplinkIpId(String nsxEdgeUplinkIpId) {
            this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
            this.__explicitlySet__.add("nsxEdgeUplinkIpId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
        private String hcxPrivateIpId;

        public Builder hcxPrivateIpId(String hcxPrivateIpId) {
            this.hcxPrivateIpId = hcxPrivateIpId;
            this.__explicitlySet__.add("hcxPrivateIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        public Builder hcxFqdn(String hcxFqdn) {
            this.hcxFqdn = hcxFqdn;
            this.__explicitlySet__.add("hcxFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
        private String hcxInitialPassword;

        public Builder hcxInitialPassword(String hcxInitialPassword) {
            this.hcxInitialPassword = hcxInitialPassword;
            this.__explicitlySet__.add("hcxInitialPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
        private String hcxOnPremKey;

        public Builder hcxOnPremKey(String hcxOnPremKey) {
            this.hcxOnPremKey = hcxOnPremKey;
            this.__explicitlySet__.add("hcxOnPremKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public Sddc build() {
            Sddc __instance__ =
                    new Sddc(
                            id,
                            computeAvailabilityDomain,
                            displayName,
                            instanceDisplayNamePrefix,
                            vmwareSoftwareVersion,
                            compartmentId,
                            esxiHostsCount,
                            vcenterFqdn,
                            nsxManagerFqdn,
                            vcenterPrivateIpId,
                            nsxManagerPrivateIpId,
                            vcenterInitialPassword,
                            nsxManagerInitialPassword,
                            vcenterUsername,
                            nsxManagerUsername,
                            sshAuthorizedKeys,
                            workloadNetworkCidr,
                            nsxOverlaySegmentName,
                            nsxEdgeUplinkIpId,
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
                            hcxPrivateIpId,
                            hcxFqdn,
                            hcxInitialPassword,
                            hcxVlanId,
                            isHcxEnabled,
                            hcxOnPremKey,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sddc o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .computeAvailabilityDomain(o.getComputeAvailabilityDomain())
                            .displayName(o.getDisplayName())
                            .instanceDisplayNamePrefix(o.getInstanceDisplayNamePrefix())
                            .vmwareSoftwareVersion(o.getVmwareSoftwareVersion())
                            .compartmentId(o.getCompartmentId())
                            .esxiHostsCount(o.getEsxiHostsCount())
                            .vcenterFqdn(o.getVcenterFqdn())
                            .nsxManagerFqdn(o.getNsxManagerFqdn())
                            .vcenterPrivateIpId(o.getVcenterPrivateIpId())
                            .nsxManagerPrivateIpId(o.getNsxManagerPrivateIpId())
                            .vcenterInitialPassword(o.getVcenterInitialPassword())
                            .nsxManagerInitialPassword(o.getNsxManagerInitialPassword())
                            .vcenterUsername(o.getVcenterUsername())
                            .nsxManagerUsername(o.getNsxManagerUsername())
                            .sshAuthorizedKeys(o.getSshAuthorizedKeys())
                            .workloadNetworkCidr(o.getWorkloadNetworkCidr())
                            .nsxOverlaySegmentName(o.getNsxOverlaySegmentName())
                            .nsxEdgeUplinkIpId(o.getNsxEdgeUplinkIpId())
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
                            .hcxPrivateIpId(o.getHcxPrivateIpId())
                            .hcxFqdn(o.getHcxFqdn())
                            .hcxInitialPassword(o.getHcxInitialPassword())
                            .hcxVlanId(o.getHcxVlanId())
                            .isHcxEnabled(o.getIsHcxEnabled())
                            .hcxOnPremKey(o.getHcxOnPremKey())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The availability domain the ESXi hosts are running in.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    String computeAvailabilityDomain;

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC.
     * If this isn't set, the SDDC's `displayName` is used as the prefix.
     * <p>
     * For example, if the value is `MySDDC`, the ESXi hosts are named `MySDDC-1`,
     * `MySDDC-2`, and so on.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    String instanceDisplayNamePrefix;

    /**
     * In general, this is a specific version of bundled VMware software supported by
     * Oracle Cloud VMware Solution (see
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}).
     * <p>
     * This attribute is not guaranteed to reflect the version of
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `vmwareSoftwareVersion` with that new version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    String vmwareSoftwareVersion;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The number of ESXi hosts in the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    Integer esxiHostsCount;

    /**
     * The FQDN for vCenter.
     * <p>
     * Example: `vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    String vcenterFqdn;

    /**
     * The FQDN for NSX Manager.
     * <p>
     * Example: `nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    String nsxManagerFqdn;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the `PrivateIp` object that is
     * the virtual IP (VIP) for vCenter. For information about `PrivateIp` objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
    String vcenterPrivateIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the `PrivateIp` object that is
     * the virtual IP (VIP) for NSX Manager. For information about `PrivateIp` objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
    String nsxManagerPrivateIpId;

    /**
     * The SDDC includes an administrator username and initial password for vCenter. Make sure
     * to change this initial vCenter password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
    String vcenterInitialPassword;

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. Make sure
     * to change this initial NSX Manager password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
    String nsxManagerInitialPassword;

    /**
     * The SDDC includes an administrator username and initial password for vCenter. You can
     * change this initial username to a different value in vCenter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
    String vcenterUsername;

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. You
     * can change this initial username to a different value in NSX Manager.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
    String nsxManagerUsername;

    /**
     * One or more public SSH keys to be included in the `~/.ssh/authorized_keys` file for
     * the default user on each ESXi host. Use a newline character to separate multiple keys.
     * The SSH keys must be in the format required for the `authorized_keys` file.
     * <p>
     * This attribute is not guaranteed to reflect the public SSH keys
     * currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the public SSH keys that Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different
     * SSH keys, you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update
     * the SDDC's `sshAuthorizedKeys` with the new public keys.
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
     * The VMware NSX overlay workload segment to host your application. Connect to workload
     * portgroup in vCenter to access this overlay segment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
    String nsxOverlaySegmentName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the `PrivateIp` object that is
     * the virtual IP (VIP) for the NSX Edge Uplink. Use this OCID as the route target for
     * route table rules when setting up connectivity between the SDDC and other networks.
     * For information about `PrivateIp` objects, see the Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
    String nsxEdgeUplinkIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the management subnet used
     * to provision the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    String provisioningSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSphere component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vSphere VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vSphere VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vSphere component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `vsphereVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    String vsphereVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vMotion component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vMotion VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vMotion VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vMotion component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `vmotionVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    String vmotionVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the vSAN component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the vSAN VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the vSAN VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the vSAN component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `vsanVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    String vsanVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX VTEP component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX VTEP VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX VTEP component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `nsxVTepVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge VTEP component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge VTEP component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `nsxEdgeVTepVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge Uplink 1 component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge Uplink 1 VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge Uplink 1 component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `nsxEdgeUplink1VlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the NSX Edge Uplink 2 component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the NSX Edge Uplink 2 VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the NSX Edge Uplink 2 component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `nsxEdgeUplink2VlanId` with that new VLAN's OCID.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the `PrivateIp` object that is
     * the virtual IP (VIP) for HCX Manager. For information about `PrivateIp` objects, see the
     * Core Services API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
    String hcxPrivateIpId;

    /**
     * The FQDN for HCX Manager.
     * <p>
     * Example: `hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    String hcxFqdn;

    /**
     * The SDDC includes an administrator username and initial password for HCX Manager. Make sure
     * to change this initial HCX Manager password to a different value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
    String hcxInitialPassword;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VLAN used by the SDDC
     * for the HCX component of the VMware environment.
     * <p>
     * This attribute is not guaranteed to reflect the HCX VLAN
     * currently used by the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the HCX VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
     * for the HCX component of the VMware environment, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * `hcxVlanId` with that new VLAN's OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    String hcxVlanId;

    /**
     * Indicates whether HCX is enabled for this SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    Boolean isHcxEnabled;

    /**
     * The activation key to use on the on-premises HCX Enterprise appliance you site pair with HCX Manager in your VMware Solution.
     * Your implementation might need more than one activation key. To obtain additional keys, contact Oracle Support.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
    String hcxOnPremKey;

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

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
