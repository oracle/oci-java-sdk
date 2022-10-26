/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An [Oracle Cloud VMware
 * Solution](https://docs.cloud.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm)
 * software-defined data center (SDDC) contains the resources required for a functional VMware
 * environment. Instances in an SDDC (see {@link EsxiHost}) run in a virtual cloud network (VCN) and
 * are preconfigured with VMware and storage. Use the vCenter utility to manage and deploy VMware
 * virtual machines (VMs) in the SDDC.
 *
 * <p>The SDDC uses a single management subnet for provisioning the SDDC. It also uses a set of
 * VLANs for various components of the VMware environment (vSphere, vMotion, vSAN, and so on). See
 * the Core Services API for information about VCN subnets and VLANs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sddc.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Sddc extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "computeAvailabilityDomain",
        "displayName",
        "instanceDisplayNamePrefix",
        "vmwareSoftwareVersion",
        "compartmentId",
        "esxiHostsCount",
        "initialSku",
        "vcenterFqdn",
        "nsxManagerFqdn",
        "vcenterPrivateIpId",
        "nsxManagerPrivateIpId",
        "vcenterInitialPassword",
        "nsxManagerInitialPassword",
        "vcenterUsername",
        "nsxManagerUsername",
        "sshAuthorizedKeys",
        "workloadNetworkCidr",
        "nsxOverlaySegmentName",
        "nsxEdgeUplinkIpId",
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
        "hcxPrivateIpId",
        "hcxFqdn",
        "hcxInitialPassword",
        "hcxVlanId",
        "isHcxEnabled",
        "hcxOnPremKey",
        "isHcxEnterpriseEnabled",
        "isHcxPendingDowngrade",
        "hcxOnPremLicenses",
        "timeHcxBillingCycleEnd",
        "timeHcxLicenseStatusUpdated",
        "isSingleHostSddc",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "upgradeLicenses",
        "vsphereUpgradeGuide",
        "vsphereUpgradeObjects",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isShieldedInstanceEnabled",
        "capacityReservationId",
        "freeformTags",
        "definedTags"
    })
    public Sddc(
            String id,
            String computeAvailabilityDomain,
            String displayName,
            String instanceDisplayNamePrefix,
            String vmwareSoftwareVersion,
            String compartmentId,
            Integer esxiHostsCount,
            Sku initialSku,
            String vcenterFqdn,
            String nsxManagerFqdn,
            String vcenterPrivateIpId,
            String nsxManagerPrivateIpId,
            String vcenterInitialPassword,
            String nsxManagerInitialPassword,
            String vcenterUsername,
            String nsxManagerUsername,
            String sshAuthorizedKeys,
            String workloadNetworkCidr,
            String nsxOverlaySegmentName,
            String nsxEdgeUplinkIpId,
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
            String hcxPrivateIpId,
            String hcxFqdn,
            String hcxInitialPassword,
            String hcxVlanId,
            Boolean isHcxEnabled,
            String hcxOnPremKey,
            Boolean isHcxEnterpriseEnabled,
            Boolean isHcxPendingDowngrade,
            java.util.List<HcxLicenseSummary> hcxOnPremLicenses,
            java.util.Date timeHcxBillingCycleEnd,
            java.util.Date timeHcxLicenseStatusUpdated,
            Boolean isSingleHostSddc,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            java.util.List<VsphereLicense> upgradeLicenses,
            String vsphereUpgradeGuide,
            java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isShieldedInstanceEnabled,
            String capacityReservationId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.compartmentId = compartmentId;
        this.esxiHostsCount = esxiHostsCount;
        this.initialSku = initialSku;
        this.vcenterFqdn = vcenterFqdn;
        this.nsxManagerFqdn = nsxManagerFqdn;
        this.vcenterPrivateIpId = vcenterPrivateIpId;
        this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
        this.vcenterInitialPassword = vcenterInitialPassword;
        this.nsxManagerInitialPassword = nsxManagerInitialPassword;
        this.vcenterUsername = vcenterUsername;
        this.nsxManagerUsername = nsxManagerUsername;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.workloadNetworkCidr = workloadNetworkCidr;
        this.nsxOverlaySegmentName = nsxOverlaySegmentName;
        this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
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
        this.hcxPrivateIpId = hcxPrivateIpId;
        this.hcxFqdn = hcxFqdn;
        this.hcxInitialPassword = hcxInitialPassword;
        this.hcxVlanId = hcxVlanId;
        this.isHcxEnabled = isHcxEnabled;
        this.hcxOnPremKey = hcxOnPremKey;
        this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
        this.isHcxPendingDowngrade = isHcxPendingDowngrade;
        this.hcxOnPremLicenses = hcxOnPremLicenses;
        this.timeHcxBillingCycleEnd = timeHcxBillingCycleEnd;
        this.timeHcxLicenseStatusUpdated = timeHcxLicenseStatusUpdated;
        this.isSingleHostSddc = isSingleHostSddc;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.upgradeLicenses = upgradeLicenses;
        this.vsphereUpgradeGuide = vsphereUpgradeGuide;
        this.vsphereUpgradeObjects = vsphereUpgradeObjects;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.capacityReservationId = capacityReservationId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The availability domain the ESXi hosts are running in. For Multi-AD SDDC, it is {@code
         * multi-AD}.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain the ESXi hosts are running in. For Multi-AD SDDC, it is {@code
         * multi-AD}.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
         *
         * @param computeAvailabilityDomain the value to set
         * @return this builder
         */
        public Builder computeAvailabilityDomain(String computeAvailabilityDomain) {
            this.computeAvailabilityDomain = computeAvailabilityDomain;
            this.__explicitlySet__.add("computeAvailabilityDomain");
            return this;
        }
        /**
         * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only
         * letters, digits, whitespaces, dashes and underscores. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only
         * letters, digits, whitespaces, dashes and underscores. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A prefix used in the name of each ESXi host and Compute instance in the SDDC. If this
         * isn't set, the SDDC's {@code displayName} is used as the prefix.
         *
         * <p>For example, if the value is {@code MySDDC}, the ESXi hosts are named {@code
         * MySDDC-1}, {@code MySDDC-2}, and so on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
        private String instanceDisplayNamePrefix;

        /**
         * A prefix used in the name of each ESXi host and Compute instance in the SDDC. If this
         * isn't set, the SDDC's {@code displayName} is used as the prefix.
         *
         * <p>For example, if the value is {@code MySDDC}, the ESXi hosts are named {@code
         * MySDDC-1}, {@code MySDDC-2}, and so on.
         *
         * @param instanceDisplayNamePrefix the value to set
         * @return this builder
         */
        public Builder instanceDisplayNamePrefix(String instanceDisplayNamePrefix) {
            this.instanceDisplayNamePrefix = instanceDisplayNamePrefix;
            this.__explicitlySet__.add("instanceDisplayNamePrefix");
            return this;
        }
        /**
         * In general, this is a specific version of bundled VMware software supported by Oracle
         * Cloud VMware Solution (see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         *
         * <p>This attribute is not guaranteed to reflect the version of software currently
         * installed on the ESXi hosts in the SDDC. The purpose of this attribute is to show the
         * version of software that the Oracle Cloud VMware Solution will install on any new ESXi
         * hosts that you *add to this SDDC in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version
         * of bundled VMware software supported by the Oracle Cloud VMware Solution, you should use
         * {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * vmwareSoftwareVersion} with that new version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * In general, this is a specific version of bundled VMware software supported by Oracle
         * Cloud VMware Solution (see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         *
         * <p>This attribute is not guaranteed to reflect the version of software currently
         * installed on the ESXi hosts in the SDDC. The purpose of this attribute is to show the
         * version of software that the Oracle Cloud VMware Solution will install on any new ESXi
         * hosts that you *add to this SDDC in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version
         * of bundled VMware software supported by the Oracle Cloud VMware Solution, you should use
         * {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * vmwareSoftwareVersion} with that new version.
         *
         * @param vmwareSoftwareVersion the value to set
         * @return this builder
         */
        public Builder vmwareSoftwareVersion(String vmwareSoftwareVersion) {
            this.vmwareSoftwareVersion = vmwareSoftwareVersion;
            this.__explicitlySet__.add("vmwareSoftwareVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the SDDC.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The number of ESXi hosts in the SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        /**
         * The number of ESXi hosts in the SDDC.
         *
         * @param esxiHostsCount the value to set
         * @return this builder
         */
        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }
        /**
         * The billing option selected during SDDC creation. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
        private Sku initialSku;

        /**
         * The billing option selected during SDDC creation. {@link
         * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
         *
         * @param initialSku the value to set
         * @return this builder
         */
        public Builder initialSku(Sku initialSku) {
            this.initialSku = initialSku;
            this.__explicitlySet__.add("initialSku");
            return this;
        }
        /**
         * The FQDN for vCenter.
         *
         * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        /**
         * The FQDN for vCenter.
         *
         * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         * @param vcenterFqdn the value to set
         * @return this builder
         */
        public Builder vcenterFqdn(String vcenterFqdn) {
            this.vcenterFqdn = vcenterFqdn;
            this.__explicitlySet__.add("vcenterFqdn");
            return this;
        }
        /**
         * The FQDN for NSX Manager.
         *
         * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        /**
         * The FQDN for NSX Manager.
         *
         * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         * @param nsxManagerFqdn the value to set
         * @return this builder
         */
        public Builder nsxManagerFqdn(String nsxManagerFqdn) {
            this.nsxManagerFqdn = nsxManagerFqdn;
            this.__explicitlySet__.add("nsxManagerFqdn");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
         * {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
        private String vcenterPrivateIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
         * {@code PrivateIp} objects, see the Core Services API.
         *
         * @param vcenterPrivateIpId the value to set
         * @return this builder
         */
        public Builder vcenterPrivateIpId(String vcenterPrivateIpId) {
            this.vcenterPrivateIpId = vcenterPrivateIpId;
            this.__explicitlySet__.add("vcenterPrivateIpId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
        private String nsxManagerPrivateIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         *
         * @param nsxManagerPrivateIpId the value to set
         * @return this builder
         */
        public Builder nsxManagerPrivateIpId(String nsxManagerPrivateIpId) {
            this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
            this.__explicitlySet__.add("nsxManagerPrivateIpId");
            return this;
        }
        /**
         * The SDDC includes an administrator username and initial password for vCenter. Make sure
         * to change this initial vCenter password to a different value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
        private String vcenterInitialPassword;

        /**
         * The SDDC includes an administrator username and initial password for vCenter. Make sure
         * to change this initial vCenter password to a different value.
         *
         * @param vcenterInitialPassword the value to set
         * @return this builder
         */
        public Builder vcenterInitialPassword(String vcenterInitialPassword) {
            this.vcenterInitialPassword = vcenterInitialPassword;
            this.__explicitlySet__.add("vcenterInitialPassword");
            return this;
        }
        /**
         * The SDDC includes an administrator username and initial password for NSX Manager. Make
         * sure to change this initial NSX Manager password to a different value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
        private String nsxManagerInitialPassword;

        /**
         * The SDDC includes an administrator username and initial password for NSX Manager. Make
         * sure to change this initial NSX Manager password to a different value.
         *
         * @param nsxManagerInitialPassword the value to set
         * @return this builder
         */
        public Builder nsxManagerInitialPassword(String nsxManagerInitialPassword) {
            this.nsxManagerInitialPassword = nsxManagerInitialPassword;
            this.__explicitlySet__.add("nsxManagerInitialPassword");
            return this;
        }
        /**
         * The SDDC includes an administrator username and initial password for vCenter. You can
         * change this initial username to a different value in vCenter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
        private String vcenterUsername;

        /**
         * The SDDC includes an administrator username and initial password for vCenter. You can
         * change this initial username to a different value in vCenter.
         *
         * @param vcenterUsername the value to set
         * @return this builder
         */
        public Builder vcenterUsername(String vcenterUsername) {
            this.vcenterUsername = vcenterUsername;
            this.__explicitlySet__.add("vcenterUsername");
            return this;
        }
        /**
         * The SDDC includes an administrator username and initial password for NSX Manager. You can
         * change this initial username to a different value in NSX Manager.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
        private String nsxManagerUsername;

        /**
         * The SDDC includes an administrator username and initial password for NSX Manager. You can
         * change this initial username to a different value in NSX Manager.
         *
         * @param nsxManagerUsername the value to set
         * @return this builder
         */
        public Builder nsxManagerUsername(String nsxManagerUsername) {
            this.nsxManagerUsername = nsxManagerUsername;
            this.__explicitlySet__.add("nsxManagerUsername");
            return this;
        }
        /**
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host. Use a newline character to separate multiple keys.
         * The SSH keys must be in the format required for the {@code authorized_keys} file.
         *
         * <p>This attribute is not guaranteed to reflect the public SSH keys currently installed on
         * the ESXi hosts in the SDDC. The purpose of this attribute is to show the public SSH keys
         * that Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
         * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different SSH
         * keys, you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the
         * SDDC's {@code sshAuthorizedKeys} with the new public keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
        private String sshAuthorizedKeys;

        /**
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host. Use a newline character to separate multiple keys.
         * The SSH keys must be in the format required for the {@code authorized_keys} file.
         *
         * <p>This attribute is not guaranteed to reflect the public SSH keys currently installed on
         * the ESXi hosts in the SDDC. The purpose of this attribute is to show the public SSH keys
         * that Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
         * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different SSH
         * keys, you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the
         * SDDC's {@code sshAuthorizedKeys} with the new public keys.
         *
         * @param sshAuthorizedKeys the value to set
         * @return this builder
         */
        public Builder sshAuthorizedKeys(String sshAuthorizedKeys) {
            this.sshAuthorizedKeys = sshAuthorizedKeys;
            this.__explicitlySet__.add("sshAuthorizedKeys");
            return this;
        }
        /**
         * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
         * workloads.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
        private String workloadNetworkCidr;

        /**
         * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
         * workloads.
         *
         * @param workloadNetworkCidr the value to set
         * @return this builder
         */
        public Builder workloadNetworkCidr(String workloadNetworkCidr) {
            this.workloadNetworkCidr = workloadNetworkCidr;
            this.__explicitlySet__.add("workloadNetworkCidr");
            return this;
        }
        /**
         * The VMware NSX overlay workload segment to host your application. Connect to workload
         * portgroup in vCenter to access this overlay segment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
        private String nsxOverlaySegmentName;

        /**
         * The VMware NSX overlay workload segment to host your application. Connect to workload
         * portgroup in vCenter to access this overlay segment.
         *
         * @param nsxOverlaySegmentName the value to set
         * @return this builder
         */
        public Builder nsxOverlaySegmentName(String nsxOverlaySegmentName) {
            this.nsxOverlaySegmentName = nsxOverlaySegmentName;
            this.__explicitlySet__.add("nsxOverlaySegmentName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this
         * OCID as the route target for route table rules when setting up connectivity between the
         * SDDC and other networks. For information about {@code PrivateIp} objects, see the Core
         * Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
        private String nsxEdgeUplinkIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this
         * OCID as the route target for route table rules when setting up connectivity between the
         * SDDC and other networks. For information about {@code PrivateIp} objects, see the Core
         * Services API.
         *
         * @param nsxEdgeUplinkIpId the value to set
         * @return this builder
         */
        public Builder nsxEdgeUplinkIpId(String nsxEdgeUplinkIpId) {
            this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
            this.__explicitlySet__.add("nsxEdgeUplinkIpId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * management subnet used to provision the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
        private String provisioningSubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * management subnet used to provision the SDDC.
         *
         * @param provisioningSubnetId the value to set
         * @return this builder
         */
        public Builder provisioningSubnetId(String provisioningSubnetId) {
            this.provisioningSubnetId = provisioningSubnetId;
            this.__explicitlySet__.add("provisioningSubnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the vSphere VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vSphere component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsphereVlanId}
         * with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the vSphere VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vSphere component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsphereVlanId}
         * with that new VLAN's OCID.
         *
         * @param vsphereVlanId the value to set
         * @return this builder
         */
        public Builder vsphereVlanId(String vsphereVlanId) {
            this.vsphereVlanId = vsphereVlanId;
            this.__explicitlySet__.add("vsphereVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vMotion component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the vMotion VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vMotion component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmotionVlanId}
         * with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vMotion component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the vMotion VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vMotion component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmotionVlanId}
         * with that new VLAN's OCID.
         *
         * @param vmotionVlanId the value to set
         * @return this builder
         */
        public Builder vmotionVlanId(String vmotionVlanId) {
            this.vmotionVlanId = vmotionVlanId;
            this.__explicitlySet__.add("vmotionVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSAN component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the vSAN VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vSAN component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsanVlanId} with
         * that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSAN component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the vSAN VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the vSAN component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsanVlanId} with
         * that new VLAN's OCID.
         *
         * @param vsanVlanId the value to set
         * @return this builder
         */
        public Builder vsanVlanId(String vsanVlanId) {
            this.vsanVlanId = vsanVlanId;
            this.__explicitlySet__.add("vsanVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX VTEP VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX VTEP component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxVTepVlanId}
         * with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the
         * ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX VTEP VLAN that
         * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX VTEP component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxVTepVlanId}
         * with that new VLAN's OCID.
         *
         * @param nsxVTepVlanId the value to set
         * @return this builder
         */
        public Builder nsxVTepVlanId(String nsxVTepVlanId) {
            this.nsxVTepVlanId = nsxVTepVlanId;
            this.__explicitlySet__.add("nsxVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by
         * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge VTEP
         * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add
         * to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge VTEP component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeVTepVlanId}
         * with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge VTEP component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by
         * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge VTEP
         * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add
         * to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge VTEP component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeVTepVlanId}
         * with that new VLAN's OCID.
         *
         * @param nsxEdgeVTepVlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeVTepVlanId(String nsxEdgeVTepVlanId) {
            this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
            this.__explicitlySet__.add("nsxEdgeVTepVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used
         * by the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge
         * Uplink 1 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used
         * by the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge
         * Uplink 1 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * nsxEdgeUplink1VlanId} with that new VLAN's OCID.
         *
         * @param nsxEdgeUplink1VlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeUplink1VlanId(String nsxEdgeUplink1VlanId) {
            this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink1VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used
         * by the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge
         * Uplink 2 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used
         * by the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge
         * Uplink 2 VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that
         * you *add to this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest)
         * createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * nsxEdgeUplink2VlanId} with that new VLAN's OCID.
         *
         * @param nsxEdgeUplink2VlanId the value to set
         * @return this builder
         */
        public Builder nsxEdgeUplink2VlanId(String nsxEdgeUplink2VlanId) {
            this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
            this.__explicitlySet__.add("nsxEdgeUplink2VlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere Replication component of the VMware environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
        private String replicationVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the vSphere Replication component of the VMware environment.
         *
         * @param replicationVlanId the value to set
         * @return this builder
         */
        public Builder replicationVlanId(String replicationVlanId) {
            this.replicationVlanId = replicationVlanId;
            this.__explicitlySet__.add("replicationVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the Provisioning component of the VMware environment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
        private String provisioningVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the Provisioning component of the VMware environment.
         *
         * @param provisioningVlanId the value to set
         * @return this builder
         */
        public Builder provisioningVlanId(String provisioningVlanId) {
            this.provisioningVlanId = provisioningVlanId;
            this.__explicitlySet__.add("provisioningVlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
        private String hcxPrivateIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         *
         * @param hcxPrivateIpId the value to set
         * @return this builder
         */
        public Builder hcxPrivateIpId(String hcxPrivateIpId) {
            this.hcxPrivateIpId = hcxPrivateIpId;
            this.__explicitlySet__.add("hcxPrivateIpId");
            return this;
        }
        /**
         * The FQDN for HCX Manager.
         *
         * <p>Example: {@code hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        /**
         * The FQDN for HCX Manager.
         *
         * <p>Example: {@code hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         * @param hcxFqdn the value to set
         * @return this builder
         */
        public Builder hcxFqdn(String hcxFqdn) {
            this.hcxFqdn = hcxFqdn;
            this.__explicitlySet__.add("hcxFqdn");
            return this;
        }
        /**
         * The SDDC includes an administrator username and initial password for HCX Manager. Make
         * sure to change this initial HCX Manager password to a different value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
        private String hcxInitialPassword;

        /**
         * The SDDC includes an administrator username and initial password for HCX Manager. Make
         * sure to change this initial HCX Manager password to a different value.
         *
         * @param hcxInitialPassword the value to set
         * @return this builder
         */
        public Builder hcxInitialPassword(String hcxInitialPassword) {
            this.hcxInitialPassword = hcxInitialPassword;
            this.__explicitlySet__.add("hcxInitialPassword");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the HCX component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the HCX component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with
         * that new VLAN's OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN used by the SDDC for the HCX component of the VMware environment.
         *
         * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi
         * hosts in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle
         * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
         * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         *
         * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN
         * for the HCX component of the VMware environment, you should use {@link
         * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with
         * that new VLAN's OCID.
         *
         * @param hcxVlanId the value to set
         * @return this builder
         */
        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
            return this;
        }
        /** Indicates whether HCX is enabled for this SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        /**
         * Indicates whether HCX is enabled for this SDDC.
         *
         * @param isHcxEnabled the value to set
         * @return this builder
         */
        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }
        /**
         * The activation keys to use on the on-premises HCX Enterprise appliances you site pair
         * with HCX Manager in your VMware Solution. The number of keys provided depends on the HCX
         * license type. HCX Advanced provides 3 activation keys. HCX Enterprise provides 10
         * activation keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
        private String hcxOnPremKey;

        /**
         * The activation keys to use on the on-premises HCX Enterprise appliances you site pair
         * with HCX Manager in your VMware Solution. The number of keys provided depends on the HCX
         * license type. HCX Advanced provides 3 activation keys. HCX Enterprise provides 10
         * activation keys.
         *
         * @param hcxOnPremKey the value to set
         * @return this builder
         */
        public Builder hcxOnPremKey(String hcxOnPremKey) {
            this.hcxOnPremKey = hcxOnPremKey;
            this.__explicitlySet__.add("hcxOnPremKey");
            return this;
        }
        /** Indicates whether HCX Enterprise is enabled for this SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
        private Boolean isHcxEnterpriseEnabled;

        /**
         * Indicates whether HCX Enterprise is enabled for this SDDC.
         *
         * @param isHcxEnterpriseEnabled the value to set
         * @return this builder
         */
        public Builder isHcxEnterpriseEnabled(Boolean isHcxEnterpriseEnabled) {
            this.isHcxEnterpriseEnabled = isHcxEnterpriseEnabled;
            this.__explicitlySet__.add("isHcxEnterpriseEnabled");
            return this;
        }
        /** Indicates whether SDDC is pending downgrade from HCX Enterprise to HCX Advanced. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxPendingDowngrade")
        private Boolean isHcxPendingDowngrade;

        /**
         * Indicates whether SDDC is pending downgrade from HCX Enterprise to HCX Advanced.
         *
         * @param isHcxPendingDowngrade the value to set
         * @return this builder
         */
        public Builder isHcxPendingDowngrade(Boolean isHcxPendingDowngrade) {
            this.isHcxPendingDowngrade = isHcxPendingDowngrade;
            this.__explicitlySet__.add("isHcxPendingDowngrade");
            return this;
        }
        /**
         * The activation licenses to use on the on-premises HCX Enterprise appliance you site pair
         * with HCX Manager in your VMware Solution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremLicenses")
        private java.util.List<HcxLicenseSummary> hcxOnPremLicenses;

        /**
         * The activation licenses to use on the on-premises HCX Enterprise appliance you site pair
         * with HCX Manager in your VMware Solution.
         *
         * @param hcxOnPremLicenses the value to set
         * @return this builder
         */
        public Builder hcxOnPremLicenses(java.util.List<HcxLicenseSummary> hcxOnPremLicenses) {
            this.hcxOnPremLicenses = hcxOnPremLicenses;
            this.__explicitlySet__.add("hcxOnPremLicenses");
            return this;
        }
        /**
         * The date and time current HCX Enterprise billing cycle ends, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeHcxBillingCycleEnd")
        private java.util.Date timeHcxBillingCycleEnd;

        /**
         * The date and time current HCX Enterprise billing cycle ends, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeHcxBillingCycleEnd the value to set
         * @return this builder
         */
        public Builder timeHcxBillingCycleEnd(java.util.Date timeHcxBillingCycleEnd) {
            this.timeHcxBillingCycleEnd = timeHcxBillingCycleEnd;
            this.__explicitlySet__.add("timeHcxBillingCycleEnd");
            return this;
        }
        /**
         * The date and time the SDDC's HCX on-premise license status was updated, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeHcxLicenseStatusUpdated")
        private java.util.Date timeHcxLicenseStatusUpdated;

        /**
         * The date and time the SDDC's HCX on-premise license status was updated, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeHcxLicenseStatusUpdated the value to set
         * @return this builder
         */
        public Builder timeHcxLicenseStatusUpdated(java.util.Date timeHcxLicenseStatusUpdated) {
            this.timeHcxLicenseStatusUpdated = timeHcxLicenseStatusUpdated;
            this.__explicitlySet__.add("timeHcxLicenseStatusUpdated");
            return this;
        }
        /** Indicates whether this SDDC is designated for only single ESXi host. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
        private Boolean isSingleHostSddc;

        /**
         * Indicates whether this SDDC is designated for only single ESXi host.
         *
         * @param isSingleHostSddc the value to set
         * @return this builder
         */
        public Builder isSingleHostSddc(Boolean isSingleHostSddc) {
            this.isSingleHostSddc = isSingleHostSddc;
            this.__explicitlySet__.add("isSingleHostSddc");
            return this;
        }
        /**
         * The date and time the SDDC was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the SDDC was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the SDDC was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the SDDC was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the SDDC.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The vSphere licenses to be used when upgrade SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeLicenses")
        private java.util.List<VsphereLicense> upgradeLicenses;

        /**
         * The vSphere licenses to be used when upgrade SDDC.
         *
         * @param upgradeLicenses the value to set
         * @return this builder
         */
        public Builder upgradeLicenses(java.util.List<VsphereLicense> upgradeLicenses) {
            this.upgradeLicenses = upgradeLicenses;
            this.__explicitlySet__.add("upgradeLicenses");
            return this;
        }
        /** The link of guidance to upgrade vSphere. */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeGuide")
        private String vsphereUpgradeGuide;

        /**
         * The link of guidance to upgrade vSphere.
         *
         * @param vsphereUpgradeGuide the value to set
         * @return this builder
         */
        public Builder vsphereUpgradeGuide(String vsphereUpgradeGuide) {
            this.vsphereUpgradeGuide = vsphereUpgradeGuide;
            this.__explicitlySet__.add("vsphereUpgradeGuide");
            return this;
        }
        /** The links of binary objects needed for upgrade vSphere. */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeObjects")
        private java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects;

        /**
         * The links of binary objects needed for upgrade vSphere.
         *
         * @param vsphereUpgradeObjects the value to set
         * @return this builder
         */
        public Builder vsphereUpgradeObjects(
                java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects) {
            this.vsphereUpgradeObjects = vsphereUpgradeObjects;
            this.__explicitlySet__.add("vsphereUpgradeObjects");
            return this;
        }
        /**
         * The initial compute shape of the SDDC's ESXi hosts. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
        private String initialHostShapeName;

        /**
         * The initial compute shape of the SDDC's ESXi hosts. {@link
         * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
         *
         * @param initialHostShapeName the value to set
         * @return this builder
         */
        public Builder initialHostShapeName(String initialHostShapeName) {
            this.initialHostShapeName = initialHostShapeName;
            this.__explicitlySet__.add("initialHostShapeName");
            return this;
        }
        /** The initial OCPU count of the SDDC's ESXi hosts. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
        private Float initialHostOcpuCount;

        /**
         * The initial OCPU count of the SDDC's ESXi hosts.
         *
         * @param initialHostOcpuCount the value to set
         * @return this builder
         */
        public Builder initialHostOcpuCount(Float initialHostOcpuCount) {
            this.initialHostOcpuCount = initialHostOcpuCount;
            this.__explicitlySet__.add("initialHostOcpuCount");
            return this;
        }
        /** Indicates whether shielded instance is enabled at the SDDC level. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        /**
         * Indicates whether shielded instance is enabled at the SDDC level.
         *
         * @param isShieldedInstanceEnabled the value to set
         * @return this builder
         */
        public Builder isShieldedInstanceEnabled(Boolean isShieldedInstanceEnabled) {
            this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
            this.__explicitlySet__.add("isShieldedInstanceEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Capacity Reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Capacity Reservation.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Sddc build() {
            Sddc model =
                    new Sddc(
                            this.id,
                            this.computeAvailabilityDomain,
                            this.displayName,
                            this.instanceDisplayNamePrefix,
                            this.vmwareSoftwareVersion,
                            this.compartmentId,
                            this.esxiHostsCount,
                            this.initialSku,
                            this.vcenterFqdn,
                            this.nsxManagerFqdn,
                            this.vcenterPrivateIpId,
                            this.nsxManagerPrivateIpId,
                            this.vcenterInitialPassword,
                            this.nsxManagerInitialPassword,
                            this.vcenterUsername,
                            this.nsxManagerUsername,
                            this.sshAuthorizedKeys,
                            this.workloadNetworkCidr,
                            this.nsxOverlaySegmentName,
                            this.nsxEdgeUplinkIpId,
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
                            this.hcxPrivateIpId,
                            this.hcxFqdn,
                            this.hcxInitialPassword,
                            this.hcxVlanId,
                            this.isHcxEnabled,
                            this.hcxOnPremKey,
                            this.isHcxEnterpriseEnabled,
                            this.isHcxPendingDowngrade,
                            this.hcxOnPremLicenses,
                            this.timeHcxBillingCycleEnd,
                            this.timeHcxLicenseStatusUpdated,
                            this.isSingleHostSddc,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.upgradeLicenses,
                            this.vsphereUpgradeGuide,
                            this.vsphereUpgradeObjects,
                            this.initialHostShapeName,
                            this.initialHostOcpuCount,
                            this.isShieldedInstanceEnabled,
                            this.capacityReservationId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Sddc model) {
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("esxiHostsCount")) {
                this.esxiHostsCount(model.getEsxiHostsCount());
            }
            if (model.wasPropertyExplicitlySet("initialSku")) {
                this.initialSku(model.getInitialSku());
            }
            if (model.wasPropertyExplicitlySet("vcenterFqdn")) {
                this.vcenterFqdn(model.getVcenterFqdn());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerFqdn")) {
                this.nsxManagerFqdn(model.getNsxManagerFqdn());
            }
            if (model.wasPropertyExplicitlySet("vcenterPrivateIpId")) {
                this.vcenterPrivateIpId(model.getVcenterPrivateIpId());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerPrivateIpId")) {
                this.nsxManagerPrivateIpId(model.getNsxManagerPrivateIpId());
            }
            if (model.wasPropertyExplicitlySet("vcenterInitialPassword")) {
                this.vcenterInitialPassword(model.getVcenterInitialPassword());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerInitialPassword")) {
                this.nsxManagerInitialPassword(model.getNsxManagerInitialPassword());
            }
            if (model.wasPropertyExplicitlySet("vcenterUsername")) {
                this.vcenterUsername(model.getVcenterUsername());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerUsername")) {
                this.nsxManagerUsername(model.getNsxManagerUsername());
            }
            if (model.wasPropertyExplicitlySet("sshAuthorizedKeys")) {
                this.sshAuthorizedKeys(model.getSshAuthorizedKeys());
            }
            if (model.wasPropertyExplicitlySet("workloadNetworkCidr")) {
                this.workloadNetworkCidr(model.getWorkloadNetworkCidr());
            }
            if (model.wasPropertyExplicitlySet("nsxOverlaySegmentName")) {
                this.nsxOverlaySegmentName(model.getNsxOverlaySegmentName());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplinkIpId")) {
                this.nsxEdgeUplinkIpId(model.getNsxEdgeUplinkIpId());
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
            if (model.wasPropertyExplicitlySet("hcxPrivateIpId")) {
                this.hcxPrivateIpId(model.getHcxPrivateIpId());
            }
            if (model.wasPropertyExplicitlySet("hcxFqdn")) {
                this.hcxFqdn(model.getHcxFqdn());
            }
            if (model.wasPropertyExplicitlySet("hcxInitialPassword")) {
                this.hcxInitialPassword(model.getHcxInitialPassword());
            }
            if (model.wasPropertyExplicitlySet("hcxVlanId")) {
                this.hcxVlanId(model.getHcxVlanId());
            }
            if (model.wasPropertyExplicitlySet("isHcxEnabled")) {
                this.isHcxEnabled(model.getIsHcxEnabled());
            }
            if (model.wasPropertyExplicitlySet("hcxOnPremKey")) {
                this.hcxOnPremKey(model.getHcxOnPremKey());
            }
            if (model.wasPropertyExplicitlySet("isHcxEnterpriseEnabled")) {
                this.isHcxEnterpriseEnabled(model.getIsHcxEnterpriseEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHcxPendingDowngrade")) {
                this.isHcxPendingDowngrade(model.getIsHcxPendingDowngrade());
            }
            if (model.wasPropertyExplicitlySet("hcxOnPremLicenses")) {
                this.hcxOnPremLicenses(model.getHcxOnPremLicenses());
            }
            if (model.wasPropertyExplicitlySet("timeHcxBillingCycleEnd")) {
                this.timeHcxBillingCycleEnd(model.getTimeHcxBillingCycleEnd());
            }
            if (model.wasPropertyExplicitlySet("timeHcxLicenseStatusUpdated")) {
                this.timeHcxLicenseStatusUpdated(model.getTimeHcxLicenseStatusUpdated());
            }
            if (model.wasPropertyExplicitlySet("isSingleHostSddc")) {
                this.isSingleHostSddc(model.getIsSingleHostSddc());
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
            if (model.wasPropertyExplicitlySet("vsphereUpgradeGuide")) {
                this.vsphereUpgradeGuide(model.getVsphereUpgradeGuide());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * SDDC.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The availability domain the ESXi hosts are running in. For Multi-AD SDDC, it is {@code
     * multi-AD}.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain the ESXi hosts are running in. For Multi-AD SDDC, it is {@code
     * multi-AD}.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}, {@code multi-AD}
     *
     * @return the value
     */
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only
     * letters, digits, whitespaces, dashes and underscores. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only
     * letters, digits, whitespaces, dashes and underscores. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC. If this isn't
     * set, the SDDC's {@code displayName} is used as the prefix.
     *
     * <p>For example, if the value is {@code MySDDC}, the ESXi hosts are named {@code MySDDC-1},
     * {@code MySDDC-2}, and so on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNamePrefix")
    private final String instanceDisplayNamePrefix;

    /**
     * A prefix used in the name of each ESXi host and Compute instance in the SDDC. If this isn't
     * set, the SDDC's {@code displayName} is used as the prefix.
     *
     * <p>For example, if the value is {@code MySDDC}, the ESXi hosts are named {@code MySDDC-1},
     * {@code MySDDC-2}, and so on.
     *
     * @return the value
     */
    public String getInstanceDisplayNamePrefix() {
        return instanceDisplayNamePrefix;
    }

    /**
     * In general, this is a specific version of bundled VMware software supported by Oracle Cloud
     * VMware Solution (see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * <p>This attribute is not guaranteed to reflect the version of software currently installed on
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the version of software
     * that the Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version of
     * bundled VMware software supported by the Oracle Cloud VMware Solution, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmwareSoftwareVersion}
     * with that new version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * In general, this is a specific version of bundled VMware software supported by Oracle Cloud
     * VMware Solution (see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * <p>This attribute is not guaranteed to reflect the version of software currently installed on
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the version of software
     * that the Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version of
     * bundled VMware software supported by the Oracle Cloud VMware Solution, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmwareSoftwareVersion}
     * with that new version.
     *
     * @return the value
     */
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the SDDC.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The number of ESXi hosts in the SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    /**
     * The number of ESXi hosts in the SDDC.
     *
     * @return the value
     */
    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    /**
     * The billing option selected during SDDC creation. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialSku")
    private final Sku initialSku;

    /**
     * The billing option selected during SDDC creation. {@link
     * #listSupportedSkus(ListSupportedSkusRequest) listSupportedSkus}.
     *
     * @return the value
     */
    public Sku getInitialSku() {
        return initialSku;
    }

    /**
     * The FQDN for vCenter.
     *
     * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    private final String vcenterFqdn;

    /**
     * The FQDN for vCenter.
     *
     * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     */
    public String getVcenterFqdn() {
        return vcenterFqdn;
    }

    /**
     * The FQDN for NSX Manager.
     *
     * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    private final String nsxManagerFqdn;

    /**
     * The FQDN for NSX Manager.
     *
     * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     */
    public String getNsxManagerFqdn() {
        return nsxManagerFqdn;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
    private final String vcenterPrivateIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getVcenterPrivateIpId() {
        return vcenterPrivateIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
    private final String nsxManagerPrivateIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getNsxManagerPrivateIpId() {
        return nsxManagerPrivateIpId;
    }

    /**
     * The SDDC includes an administrator username and initial password for vCenter. Make sure to
     * change this initial vCenter password to a different value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterInitialPassword")
    private final String vcenterInitialPassword;

    /**
     * The SDDC includes an administrator username and initial password for vCenter. Make sure to
     * change this initial vCenter password to a different value.
     *
     * @return the value
     */
    public String getVcenterInitialPassword() {
        return vcenterInitialPassword;
    }

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. Make sure
     * to change this initial NSX Manager password to a different value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerInitialPassword")
    private final String nsxManagerInitialPassword;

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. Make sure
     * to change this initial NSX Manager password to a different value.
     *
     * @return the value
     */
    public String getNsxManagerInitialPassword() {
        return nsxManagerInitialPassword;
    }

    /**
     * The SDDC includes an administrator username and initial password for vCenter. You can change
     * this initial username to a different value in vCenter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
    private final String vcenterUsername;

    /**
     * The SDDC includes an administrator username and initial password for vCenter. You can change
     * this initial username to a different value in vCenter.
     *
     * @return the value
     */
    public String getVcenterUsername() {
        return vcenterUsername;
    }

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. You can
     * change this initial username to a different value in NSX Manager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerUsername")
    private final String nsxManagerUsername;

    /**
     * The SDDC includes an administrator username and initial password for NSX Manager. You can
     * change this initial username to a different value in NSX Manager.
     *
     * @return the value
     */
    public String getNsxManagerUsername() {
        return nsxManagerUsername;
    }

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for the
     * default user on each ESXi host. Use a newline character to separate multiple keys. The SSH
     * keys must be in the format required for the {@code authorized_keys} file.
     *
     * <p>This attribute is not guaranteed to reflect the public SSH keys currently installed on the
     * ESXi hosts in the SDDC. The purpose of this attribute is to show the public SSH keys that
     * Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to this SDDC in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different SSH keys,
     * you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
     * sshAuthorizedKeys} with the new public keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
    private final String sshAuthorizedKeys;

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for the
     * default user on each ESXi host. Use a newline character to separate multiple keys. The SSH
     * keys must be in the format required for the {@code authorized_keys} file.
     *
     * <p>This attribute is not guaranteed to reflect the public SSH keys currently installed on the
     * ESXi hosts in the SDDC. The purpose of this attribute is to show the public SSH keys that
     * Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to this SDDC in
     * the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use different SSH keys,
     * you should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
     * sshAuthorizedKeys} with the new public keys.
     *
     * @return the value
     */
    public String getSshAuthorizedKeys() {
        return sshAuthorizedKeys;
    }

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadNetworkCidr")
    private final String workloadNetworkCidr;

    /**
     * The CIDR block for the IP addresses that VMware VMs in the SDDC use to run application
     * workloads.
     *
     * @return the value
     */
    public String getWorkloadNetworkCidr() {
        return workloadNetworkCidr;
    }

    /**
     * The VMware NSX overlay workload segment to host your application. Connect to workload
     * portgroup in vCenter to access this overlay segment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxOverlaySegmentName")
    private final String nsxOverlaySegmentName;

    /**
     * The VMware NSX overlay workload segment to host your application. Connect to workload
     * portgroup in vCenter to access this overlay segment.
     *
     * @return the value
     */
    public String getNsxOverlaySegmentName() {
        return nsxOverlaySegmentName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this OCID
     * as the route target for route table rules when setting up connectivity between the SDDC and
     * other networks. For information about {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
    private final String nsxEdgeUplinkIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this OCID
     * as the route target for route table rules when setting up connectivity between the SDDC and
     * other networks. For information about {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getNsxEdgeUplinkIpId() {
        return nsxEdgeUplinkIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * management subnet used to provision the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSubnetId")
    private final String provisioningSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * management subnet used to provision the SDDC.
     *
     * @return the value
     */
    public String getProvisioningSubnetId() {
        return provisioningSubnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSphere component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the vSphere VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vSphere component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsphereVlanId} with
     * that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    private final String vsphereVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSphere component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSphere VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the vSphere VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vSphere component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsphereVlanId} with
     * that new VLAN's OCID.
     *
     * @return the value
     */
    public String getVsphereVlanId() {
        return vsphereVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vMotion component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the vMotion VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vMotion component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmotionVlanId} with
     * that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    private final String vmotionVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vMotion component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vMotion VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the vMotion VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vMotion component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmotionVlanId} with
     * that new VLAN's OCID.
     *
     * @return the value
     */
    public String getVmotionVlanId() {
        return vmotionVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSAN component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the vSAN VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vSAN component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsanVlanId} with that
     * new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    private final String vsanVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSAN component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the vSAN VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the vSAN VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the vSAN component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vsanVlanId} with that
     * new VLAN's OCID.
     *
     * @return the value
     */
    public String getVsanVlanId() {
        return vsanVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the NSX VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX VTEP component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxVTepVlanId} with
     * that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    private final String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX VTEP VLAN currently used by the ESXi
     * hosts in the SDDC. The purpose of this attribute is to show the NSX VTEP VLAN that the Oracle
     * Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the
     * future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX VTEP component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxVTepVlanId} with
     * that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxVTepVlanId() {
        return nsxVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by the
     * ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge VTEP VLAN that
     * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC
     * in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge VTEP component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeVTepVlanId}
     * with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    private final String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge VTEP component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge VTEP VLAN currently used by the
     * ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge VTEP VLAN that
     * the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to this SDDC
     * in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge VTEP component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeVTepVlanId}
     * with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeVTepVlanId() {
        return nsxEdgeVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used by
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge Uplink 1
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeUplink1VlanId}
     * with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    private final String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge Uplink 1 component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 1 VLAN currently used by
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge Uplink 1
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge Uplink 1 component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeUplink1VlanId}
     * with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeUplink1VlanId() {
        return nsxEdgeUplink1VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used by
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge Uplink 2
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeUplink2VlanId}
     * with that new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    private final String nsxEdgeUplink2VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the NSX Edge Uplink 2 component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the NSX Edge Uplink 2 VLAN currently used by
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the NSX Edge Uplink 2
     * VLAN that the Oracle Cloud VMware Solution will use for any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the NSX Edge Uplink 2 component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code nsxEdgeUplink2VlanId}
     * with that new VLAN's OCID.
     *
     * @return the value
     */
    public String getNsxEdgeUplink2VlanId() {
        return nsxEdgeUplink2VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSphere Replication component of the VMware environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationVlanId")
    private final String replicationVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the vSphere Replication component of the VMware environment.
     *
     * @return the value
     */
    public String getReplicationVlanId() {
        return replicationVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the Provisioning component of the VMware environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningVlanId")
    private final String provisioningVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the Provisioning component of the VMware environment.
     *
     * @return the value
     */
    public String getProvisioningVlanId() {
        return provisioningVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
    private final String hcxPrivateIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getHcxPrivateIpId() {
        return hcxPrivateIpId;
    }

    /**
     * The FQDN for HCX Manager.
     *
     * <p>Example: {@code hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    private final String hcxFqdn;

    /**
     * The FQDN for HCX Manager.
     *
     * <p>Example: {@code hcx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     */
    public String getHcxFqdn() {
        return hcxFqdn;
    }

    /**
     * The SDDC includes an administrator username and initial password for HCX Manager. Make sure
     * to change this initial HCX Manager password to a different value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxInitialPassword")
    private final String hcxInitialPassword;

    /**
     * The SDDC includes an administrator username and initial password for HCX Manager. Make sure
     * to change this initial HCX Manager password to a different value.
     *
     * @return the value
     */
    public String getHcxInitialPassword() {
        return hcxInitialPassword;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the HCX component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the HCX component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with that
     * new VLAN's OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    private final String hcxVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN used by the SDDC for the HCX component of the VMware environment.
     *
     * <p>This attribute is not guaranteed to reflect the HCX VLAN currently used by the ESXi hosts
     * in the SDDC. The purpose of this attribute is to show the HCX VLAN that the Oracle Cloud
     * VMware Solution will use for any new ESXi hosts that you *add to this SDDC in the future*
     * with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     *
     * <p>Therefore, if you change the existing ESXi hosts in the SDDC to use a different VLAN for
     * the HCX component of the VMware environment, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code hcxVlanId} with that
     * new VLAN's OCID.
     *
     * @return the value
     */
    public String getHcxVlanId() {
        return hcxVlanId;
    }

    /** Indicates whether HCX is enabled for this SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    private final Boolean isHcxEnabled;

    /**
     * Indicates whether HCX is enabled for this SDDC.
     *
     * @return the value
     */
    public Boolean getIsHcxEnabled() {
        return isHcxEnabled;
    }

    /**
     * The activation keys to use on the on-premises HCX Enterprise appliances you site pair with
     * HCX Manager in your VMware Solution. The number of keys provided depends on the HCX license
     * type. HCX Advanced provides 3 activation keys. HCX Enterprise provides 10 activation keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremKey")
    private final String hcxOnPremKey;

    /**
     * The activation keys to use on the on-premises HCX Enterprise appliances you site pair with
     * HCX Manager in your VMware Solution. The number of keys provided depends on the HCX license
     * type. HCX Advanced provides 3 activation keys. HCX Enterprise provides 10 activation keys.
     *
     * @return the value
     */
    public String getHcxOnPremKey() {
        return hcxOnPremKey;
    }

    /** Indicates whether HCX Enterprise is enabled for this SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnterpriseEnabled")
    private final Boolean isHcxEnterpriseEnabled;

    /**
     * Indicates whether HCX Enterprise is enabled for this SDDC.
     *
     * @return the value
     */
    public Boolean getIsHcxEnterpriseEnabled() {
        return isHcxEnterpriseEnabled;
    }

    /** Indicates whether SDDC is pending downgrade from HCX Enterprise to HCX Advanced. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxPendingDowngrade")
    private final Boolean isHcxPendingDowngrade;

    /**
     * Indicates whether SDDC is pending downgrade from HCX Enterprise to HCX Advanced.
     *
     * @return the value
     */
    public Boolean getIsHcxPendingDowngrade() {
        return isHcxPendingDowngrade;
    }

    /**
     * The activation licenses to use on the on-premises HCX Enterprise appliance you site pair with
     * HCX Manager in your VMware Solution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxOnPremLicenses")
    private final java.util.List<HcxLicenseSummary> hcxOnPremLicenses;

    /**
     * The activation licenses to use on the on-premises HCX Enterprise appliance you site pair with
     * HCX Manager in your VMware Solution.
     *
     * @return the value
     */
    public java.util.List<HcxLicenseSummary> getHcxOnPremLicenses() {
        return hcxOnPremLicenses;
    }

    /**
     * The date and time current HCX Enterprise billing cycle ends, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeHcxBillingCycleEnd")
    private final java.util.Date timeHcxBillingCycleEnd;

    /**
     * The date and time current HCX Enterprise billing cycle ends, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeHcxBillingCycleEnd() {
        return timeHcxBillingCycleEnd;
    }

    /**
     * The date and time the SDDC's HCX on-premise license status was updated, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeHcxLicenseStatusUpdated")
    private final java.util.Date timeHcxLicenseStatusUpdated;

    /**
     * The date and time the SDDC's HCX on-premise license status was updated, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeHcxLicenseStatusUpdated() {
        return timeHcxLicenseStatusUpdated;
    }

    /** Indicates whether this SDDC is designated for only single ESXi host. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
    private final Boolean isSingleHostSddc;

    /**
     * Indicates whether this SDDC is designated for only single ESXi host.
     *
     * @return the value
     */
    public Boolean getIsSingleHostSddc() {
        return isSingleHostSddc;
    }

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the SDDC.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** The vSphere licenses to be used when upgrade SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeLicenses")
    private final java.util.List<VsphereLicense> upgradeLicenses;

    /**
     * The vSphere licenses to be used when upgrade SDDC.
     *
     * @return the value
     */
    public java.util.List<VsphereLicense> getUpgradeLicenses() {
        return upgradeLicenses;
    }

    /** The link of guidance to upgrade vSphere. */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeGuide")
    private final String vsphereUpgradeGuide;

    /**
     * The link of guidance to upgrade vSphere.
     *
     * @return the value
     */
    public String getVsphereUpgradeGuide() {
        return vsphereUpgradeGuide;
    }

    /** The links of binary objects needed for upgrade vSphere. */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereUpgradeObjects")
    private final java.util.List<VsphereUpgradeObject> vsphereUpgradeObjects;

    /**
     * The links of binary objects needed for upgrade vSphere.
     *
     * @return the value
     */
    public java.util.List<VsphereUpgradeObject> getVsphereUpgradeObjects() {
        return vsphereUpgradeObjects;
    }

    /**
     * The initial compute shape of the SDDC's ESXi hosts. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostShapeName")
    private final String initialHostShapeName;

    /**
     * The initial compute shape of the SDDC's ESXi hosts. {@link
     * #listSupportedHostShapes(ListSupportedHostShapesRequest) listSupportedHostShapes}.
     *
     * @return the value
     */
    public String getInitialHostShapeName() {
        return initialHostShapeName;
    }

    /** The initial OCPU count of the SDDC's ESXi hosts. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialHostOcpuCount")
    private final Float initialHostOcpuCount;

    /**
     * The initial OCPU count of the SDDC's ESXi hosts.
     *
     * @return the value
     */
    public Float getInitialHostOcpuCount() {
        return initialHostOcpuCount;
    }

    /** Indicates whether shielded instance is enabled at the SDDC level. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    /**
     * Indicates whether shielded instance is enabled at the SDDC level.
     *
     * @return the value
     */
    public Boolean getIsShieldedInstanceEnabled() {
        return isShieldedInstanceEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Capacity Reservation.
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Sddc(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceDisplayNamePrefix=")
                .append(String.valueOf(this.instanceDisplayNamePrefix));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", initialSku=").append(String.valueOf(this.initialSku));
        sb.append(", vcenterFqdn=").append(String.valueOf(this.vcenterFqdn));
        sb.append(", nsxManagerFqdn=").append(String.valueOf(this.nsxManagerFqdn));
        sb.append(", vcenterPrivateIpId=").append(String.valueOf(this.vcenterPrivateIpId));
        sb.append(", nsxManagerPrivateIpId=").append(String.valueOf(this.nsxManagerPrivateIpId));
        sb.append(", vcenterInitialPassword=").append(String.valueOf(this.vcenterInitialPassword));
        sb.append(", nsxManagerInitialPassword=")
                .append(String.valueOf(this.nsxManagerInitialPassword));
        sb.append(", vcenterUsername=").append(String.valueOf(this.vcenterUsername));
        sb.append(", nsxManagerUsername=").append(String.valueOf(this.nsxManagerUsername));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
        sb.append(", workloadNetworkCidr=").append(String.valueOf(this.workloadNetworkCidr));
        sb.append(", nsxOverlaySegmentName=").append(String.valueOf(this.nsxOverlaySegmentName));
        sb.append(", nsxEdgeUplinkIpId=").append(String.valueOf(this.nsxEdgeUplinkIpId));
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
        sb.append(", hcxPrivateIpId=").append(String.valueOf(this.hcxPrivateIpId));
        sb.append(", hcxFqdn=").append(String.valueOf(this.hcxFqdn));
        sb.append(", hcxInitialPassword=").append(String.valueOf(this.hcxInitialPassword));
        sb.append(", hcxVlanId=").append(String.valueOf(this.hcxVlanId));
        sb.append(", isHcxEnabled=").append(String.valueOf(this.isHcxEnabled));
        sb.append(", hcxOnPremKey=").append(String.valueOf(this.hcxOnPremKey));
        sb.append(", isHcxEnterpriseEnabled=").append(String.valueOf(this.isHcxEnterpriseEnabled));
        sb.append(", isHcxPendingDowngrade=").append(String.valueOf(this.isHcxPendingDowngrade));
        sb.append(", hcxOnPremLicenses=").append(String.valueOf(this.hcxOnPremLicenses));
        sb.append(", timeHcxBillingCycleEnd=").append(String.valueOf(this.timeHcxBillingCycleEnd));
        sb.append(", timeHcxLicenseStatusUpdated=")
                .append(String.valueOf(this.timeHcxLicenseStatusUpdated));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", upgradeLicenses=").append(String.valueOf(this.upgradeLicenses));
        sb.append(", vsphereUpgradeGuide=").append(String.valueOf(this.vsphereUpgradeGuide));
        sb.append(", vsphereUpgradeObjects=").append(String.valueOf(this.vsphereUpgradeObjects));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
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
        if (!(o instanceof Sddc)) {
            return false;
        }

        Sddc other = (Sddc) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.instanceDisplayNamePrefix, other.instanceDisplayNamePrefix)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.initialSku, other.initialSku)
                && java.util.Objects.equals(this.vcenterFqdn, other.vcenterFqdn)
                && java.util.Objects.equals(this.nsxManagerFqdn, other.nsxManagerFqdn)
                && java.util.Objects.equals(this.vcenterPrivateIpId, other.vcenterPrivateIpId)
                && java.util.Objects.equals(this.nsxManagerPrivateIpId, other.nsxManagerPrivateIpId)
                && java.util.Objects.equals(
                        this.vcenterInitialPassword, other.vcenterInitialPassword)
                && java.util.Objects.equals(
                        this.nsxManagerInitialPassword, other.nsxManagerInitialPassword)
                && java.util.Objects.equals(this.vcenterUsername, other.vcenterUsername)
                && java.util.Objects.equals(this.nsxManagerUsername, other.nsxManagerUsername)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
                && java.util.Objects.equals(this.workloadNetworkCidr, other.workloadNetworkCidr)
                && java.util.Objects.equals(this.nsxOverlaySegmentName, other.nsxOverlaySegmentName)
                && java.util.Objects.equals(this.nsxEdgeUplinkIpId, other.nsxEdgeUplinkIpId)
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
                && java.util.Objects.equals(this.hcxPrivateIpId, other.hcxPrivateIpId)
                && java.util.Objects.equals(this.hcxFqdn, other.hcxFqdn)
                && java.util.Objects.equals(this.hcxInitialPassword, other.hcxInitialPassword)
                && java.util.Objects.equals(this.hcxVlanId, other.hcxVlanId)
                && java.util.Objects.equals(this.isHcxEnabled, other.isHcxEnabled)
                && java.util.Objects.equals(this.hcxOnPremKey, other.hcxOnPremKey)
                && java.util.Objects.equals(
                        this.isHcxEnterpriseEnabled, other.isHcxEnterpriseEnabled)
                && java.util.Objects.equals(this.isHcxPendingDowngrade, other.isHcxPendingDowngrade)
                && java.util.Objects.equals(this.hcxOnPremLicenses, other.hcxOnPremLicenses)
                && java.util.Objects.equals(
                        this.timeHcxBillingCycleEnd, other.timeHcxBillingCycleEnd)
                && java.util.Objects.equals(
                        this.timeHcxLicenseStatusUpdated, other.timeHcxLicenseStatusUpdated)
                && java.util.Objects.equals(this.isSingleHostSddc, other.isSingleHostSddc)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.upgradeLicenses, other.upgradeLicenses)
                && java.util.Objects.equals(this.vsphereUpgradeGuide, other.vsphereUpgradeGuide)
                && java.util.Objects.equals(this.vsphereUpgradeObjects, other.vsphereUpgradeObjects)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result = (result * PRIME) + (this.initialSku == null ? 43 : this.initialSku.hashCode());
        result = (result * PRIME) + (this.vcenterFqdn == null ? 43 : this.vcenterFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerFqdn == null ? 43 : this.nsxManagerFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterPrivateIpId == null
                                ? 43
                                : this.vcenterPrivateIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerPrivateIpId == null
                                ? 43
                                : this.nsxManagerPrivateIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterInitialPassword == null
                                ? 43
                                : this.vcenterInitialPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerInitialPassword == null
                                ? 43
                                : this.nsxManagerInitialPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterUsername == null ? 43 : this.vcenterUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerUsername == null
                                ? 43
                                : this.nsxManagerUsername.hashCode());
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
                        + (this.nsxOverlaySegmentName == null
                                ? 43
                                : this.nsxOverlaySegmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxEdgeUplinkIpId == null ? 43 : this.nsxEdgeUplinkIpId.hashCode());
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
                        + (this.hcxPrivateIpId == null ? 43 : this.hcxPrivateIpId.hashCode());
        result = (result * PRIME) + (this.hcxFqdn == null ? 43 : this.hcxFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxInitialPassword == null
                                ? 43
                                : this.hcxInitialPassword.hashCode());
        result = (result * PRIME) + (this.hcxVlanId == null ? 43 : this.hcxVlanId.hashCode());
        result = (result * PRIME) + (this.isHcxEnabled == null ? 43 : this.isHcxEnabled.hashCode());
        result = (result * PRIME) + (this.hcxOnPremKey == null ? 43 : this.hcxOnPremKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isHcxEnterpriseEnabled == null
                                ? 43
                                : this.isHcxEnterpriseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHcxPendingDowngrade == null
                                ? 43
                                : this.isHcxPendingDowngrade.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxOnPremLicenses == null ? 43 : this.hcxOnPremLicenses.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHcxBillingCycleEnd == null
                                ? 43
                                : this.timeHcxBillingCycleEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timeHcxLicenseStatusUpdated == null
                                ? 43
                                : this.timeHcxLicenseStatusUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleHostSddc == null ? 43 : this.isSingleHostSddc.hashCode());
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
                        + (this.vsphereUpgradeGuide == null
                                ? 43
                                : this.vsphereUpgradeGuide.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
