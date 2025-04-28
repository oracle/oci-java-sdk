/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * An [Oracle Cloud VMware
 * Solution](https://docs.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm) software-defined
 * data center (SDDC) contains the resources required for a functional VMware environment. Instances
 * in an SDDC (see {@link EsxiHost}) run in a virtual cloud network (VCN) and are preconfigured with
 * VMware and storage. Use the vCenter utility to manage and deploy VMware virtual machines (VMs) in
 * the SDDC.
 *
 * <p>The SDDC uses a single management subnet for provisioning the SDDC. It also uses a set of
 * VLANs for various components of the VMware environment (vSphere, vMotion, vSAN, and so on). See
 * the Core Services API for information about VCN subnets and VLANs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Sddc.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Sddc extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "vmwareSoftwareVersion",
        "esxiSoftwareVersion",
        "compartmentId",
        "clustersCount",
        "vcenterFqdn",
        "nsxManagerFqdn",
        "vcenterPrivateIpId",
        "nsxManagerPrivateIpId",
        "vcenterUsername",
        "nsxManagerUsername",
        "sshAuthorizedKeys",
        "nsxEdgeUplinkIpId",
        "hcxPrivateIpId",
        "hcxFqdn",
        "hcxMode",
        "initialConfiguration",
        "isHcxPendingDowngrade",
        "hcxOnPremLicenses",
        "timeHcxBillingCycleEnd",
        "timeHcxLicenseStatusUpdated",
        "isSingleHostSddc",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Sddc(
            String id,
            String displayName,
            String vmwareSoftwareVersion,
            String esxiSoftwareVersion,
            String compartmentId,
            Integer clustersCount,
            String vcenterFqdn,
            String nsxManagerFqdn,
            String vcenterPrivateIpId,
            String nsxManagerPrivateIpId,
            String vcenterUsername,
            String nsxManagerUsername,
            String sshAuthorizedKeys,
            String nsxEdgeUplinkIpId,
            String hcxPrivateIpId,
            String hcxFqdn,
            HcxModes hcxMode,
            InitialConfiguration initialConfiguration,
            Boolean isHcxPendingDowngrade,
            java.util.List<HcxLicenseSummary> hcxOnPremLicenses,
            java.util.Date timeHcxBillingCycleEnd,
            java.util.Date timeHcxLicenseStatusUpdated,
            Boolean isSingleHostSddc,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.compartmentId = compartmentId;
        this.clustersCount = clustersCount;
        this.vcenterFqdn = vcenterFqdn;
        this.nsxManagerFqdn = nsxManagerFqdn;
        this.vcenterPrivateIpId = vcenterPrivateIpId;
        this.nsxManagerPrivateIpId = nsxManagerPrivateIpId;
        this.vcenterUsername = vcenterUsername;
        this.nsxManagerUsername = nsxManagerUsername;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.nsxEdgeUplinkIpId = nsxEdgeUplinkIpId;
        this.hcxPrivateIpId = hcxPrivateIpId;
        this.hcxFqdn = hcxFqdn;
        this.hcxMode = hcxMode;
        this.initialConfiguration = initialConfiguration;
        this.isHcxPendingDowngrade = isHcxPendingDowngrade;
        this.hcxOnPremLicenses = hcxOnPremLicenses;
        this.timeHcxBillingCycleEnd = timeHcxBillingCycleEnd;
        this.timeHcxLicenseStatusUpdated = timeHcxLicenseStatusUpdated;
        this.isSingleHostSddc = isSingleHostSddc;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * In general, this is a specific version of bundled ESXi software supported by Oracle Cloud
         * VMware Solution (see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         *
         * <p>This attribute is not guaranteed to reflect the version of software currently
         * installed on the ESXi hosts in the SDDC. The purpose of this attribute is to show the
         * version of software that the Oracle Cloud VMware Solution will install on any new ESXi
         * hosts that you *add to this SDDC in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost} unless a different version is
         * configured on the Cluster or ESXi host level.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version
         * of bundled ESXi software supported by the Oracle Cloud VMware Solution, you should use
         * {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * vmwareSoftwareVersion} with that new version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * In general, this is a specific version of bundled ESXi software supported by Oracle Cloud
         * VMware Solution (see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         *
         * <p>This attribute is not guaranteed to reflect the version of software currently
         * installed on the ESXi hosts in the SDDC. The purpose of this attribute is to show the
         * version of software that the Oracle Cloud VMware Solution will install on any new ESXi
         * hosts that you *add to this SDDC in the future* with {@link
         * #createEsxiHost(CreateEsxiHostRequest) createEsxiHost} unless a different version is
         * configured on the Cluster or ESXi host level.
         *
         * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version
         * of bundled ESXi software supported by the Oracle Cloud VMware Solution, you should use
         * {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code
         * vmwareSoftwareVersion} with that new version.
         *
         * @param esxiSoftwareVersion the value to set
         * @return this builder
         */
        public Builder esxiSoftwareVersion(String esxiSoftwareVersion) {
            this.esxiSoftwareVersion = esxiSoftwareVersion;
            this.__explicitlySet__.add("esxiSoftwareVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** The number of Clusters in the SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("clustersCount")
        private Integer clustersCount;

        /**
         * The number of Clusters in the SDDC.
         *
         * @param clustersCount the value to set
         * @return this builder
         */
        public Builder clustersCount(Integer clustersCount) {
            this.clustersCount = clustersCount;
            this.__explicitlySet__.add("clustersCount");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
         * {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
        private String vcenterPrivateIpId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
        private String nsxManagerPrivateIpId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The SDDC includes an administrator username and password for vCenter. You can change this
         * initial username to a different value in vCenter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
        private String vcenterUsername;

        /**
         * The SDDC includes an administrator username and password for vCenter. You can change this
         * initial username to a different value in vCenter.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this
         * OCID as the route target for route table rules when setting up connectivity between the
         * SDDC and other networks. For information about {@code PrivateIp} objects, see the Core
         * Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
        private String nsxEdgeUplinkIpId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information
         * about {@code PrivateIp} objects, see the Core Services API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
        private String hcxPrivateIpId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** HCX configuration of the SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxMode")
        private HcxModes hcxMode;

        /**
         * HCX configuration of the SDDC.
         *
         * @param hcxMode the value to set
         * @return this builder
         */
        public Builder hcxMode(HcxModes hcxMode) {
            this.hcxMode = hcxMode;
            this.__explicitlySet__.add("hcxMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialConfiguration")
        private InitialConfiguration initialConfiguration;

        public Builder initialConfiguration(InitialConfiguration initialConfiguration) {
            this.initialConfiguration = initialConfiguration;
            this.__explicitlySet__.add("initialConfiguration");
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {orcl-cloud: {free-tier-retain: true}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Sddc build() {
            Sddc model =
                    new Sddc(
                            this.id,
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.esxiSoftwareVersion,
                            this.compartmentId,
                            this.clustersCount,
                            this.vcenterFqdn,
                            this.nsxManagerFqdn,
                            this.vcenterPrivateIpId,
                            this.nsxManagerPrivateIpId,
                            this.vcenterUsername,
                            this.nsxManagerUsername,
                            this.sshAuthorizedKeys,
                            this.nsxEdgeUplinkIpId,
                            this.hcxPrivateIpId,
                            this.hcxFqdn,
                            this.hcxMode,
                            this.initialConfiguration,
                            this.isHcxPendingDowngrade,
                            this.hcxOnPremLicenses,
                            this.timeHcxBillingCycleEnd,
                            this.timeHcxLicenseStatusUpdated,
                            this.isSingleHostSddc,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("clustersCount")) {
                this.clustersCount(model.getClustersCount());
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
            if (model.wasPropertyExplicitlySet("vcenterUsername")) {
                this.vcenterUsername(model.getVcenterUsername());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerUsername")) {
                this.nsxManagerUsername(model.getNsxManagerUsername());
            }
            if (model.wasPropertyExplicitlySet("sshAuthorizedKeys")) {
                this.sshAuthorizedKeys(model.getSshAuthorizedKeys());
            }
            if (model.wasPropertyExplicitlySet("nsxEdgeUplinkIpId")) {
                this.nsxEdgeUplinkIpId(model.getNsxEdgeUplinkIpId());
            }
            if (model.wasPropertyExplicitlySet("hcxPrivateIpId")) {
                this.hcxPrivateIpId(model.getHcxPrivateIpId());
            }
            if (model.wasPropertyExplicitlySet("hcxFqdn")) {
                this.hcxFqdn(model.getHcxFqdn());
            }
            if (model.wasPropertyExplicitlySet("hcxMode")) {
                this.hcxMode(model.getHcxMode());
            }
            if (model.wasPropertyExplicitlySet("initialConfiguration")) {
                this.initialConfiguration(model.getInitialConfiguration());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * SDDC.
     *
     * @return the value
     */
    public String getId() {
        return id;
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
     * In general, this is a specific version of bundled ESXi software supported by Oracle Cloud
     * VMware Solution (see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * <p>This attribute is not guaranteed to reflect the version of software currently installed on
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the version of software
     * that the Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
     * unless a different version is configured on the Cluster or ESXi host level.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version of
     * bundled ESXi software supported by the Oracle Cloud VMware Solution, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmwareSoftwareVersion}
     * with that new version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * In general, this is a specific version of bundled ESXi software supported by Oracle Cloud
     * VMware Solution (see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * <p>This attribute is not guaranteed to reflect the version of software currently installed on
     * the ESXi hosts in the SDDC. The purpose of this attribute is to show the version of software
     * that the Oracle Cloud VMware Solution will install on any new ESXi hosts that you *add to
     * this SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}
     * unless a different version is configured on the Cluster or ESXi host level.
     *
     * <p>Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer version of
     * bundled ESXi software supported by the Oracle Cloud VMware Solution, you should use {@link
     * #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's {@code vmwareSoftwareVersion}
     * with that new version.
     *
     * @return the value
     */
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the SDDC.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The number of Clusters in the SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("clustersCount")
    private final Integer clustersCount;

    /**
     * The number of Clusters in the SDDC.
     *
     * @return the value
     */
    public Integer getClustersCount() {
        return clustersCount;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterPrivateIpId")
    private final String vcenterPrivateIpId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for vCenter. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getVcenterPrivateIpId() {
        return vcenterPrivateIpId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerPrivateIpId")
    private final String nsxManagerPrivateIpId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for NSX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     *
     * @return the value
     */
    public String getNsxManagerPrivateIpId() {
        return nsxManagerPrivateIpId;
    }

    /**
     * The SDDC includes an administrator username and password for vCenter. You can change this
     * initial username to a different value in vCenter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterUsername")
    private final String vcenterUsername;

    /**
     * The SDDC includes an administrator username and password for vCenter. You can change this
     * initial username to a different value in vCenter.
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for the NSX Edge Uplink. Use this OCID
     * as the route target for route table rules when setting up connectivity between the SDDC and
     * other networks. For information about {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplinkIpId")
    private final String nsxEdgeUplinkIpId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@code PrivateIp} object that is the virtual IP (VIP) for HCX Manager. For information about
     * {@code PrivateIp} objects, see the Core Services API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxPrivateIpId")
    private final String hcxPrivateIpId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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

    /** HCX configuration of the SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxMode")
    private final HcxModes hcxMode;

    /**
     * HCX configuration of the SDDC.
     *
     * @return the value
     */
    public HcxModes getHcxMode() {
        return hcxMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialConfiguration")
    private final InitialConfiguration initialConfiguration;

    public InitialConfiguration getInitialConfiguration() {
        return initialConfiguration;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {orcl-cloud: {free-tier-retain: true}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clustersCount=").append(String.valueOf(this.clustersCount));
        sb.append(", vcenterFqdn=").append(String.valueOf(this.vcenterFqdn));
        sb.append(", nsxManagerFqdn=").append(String.valueOf(this.nsxManagerFqdn));
        sb.append(", vcenterPrivateIpId=").append(String.valueOf(this.vcenterPrivateIpId));
        sb.append(", nsxManagerPrivateIpId=").append(String.valueOf(this.nsxManagerPrivateIpId));
        sb.append(", vcenterUsername=").append(String.valueOf(this.vcenterUsername));
        sb.append(", nsxManagerUsername=").append(String.valueOf(this.nsxManagerUsername));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
        sb.append(", nsxEdgeUplinkIpId=").append(String.valueOf(this.nsxEdgeUplinkIpId));
        sb.append(", hcxPrivateIpId=").append(String.valueOf(this.hcxPrivateIpId));
        sb.append(", hcxFqdn=").append(String.valueOf(this.hcxFqdn));
        sb.append(", hcxMode=").append(String.valueOf(this.hcxMode));
        sb.append(", initialConfiguration=").append(String.valueOf(this.initialConfiguration));
        sb.append(", isHcxPendingDowngrade=").append(String.valueOf(this.isHcxPendingDowngrade));
        sb.append(", hcxOnPremLicenses=").append(String.valueOf(this.hcxOnPremLicenses));
        sb.append(", timeHcxBillingCycleEnd=").append(String.valueOf(this.timeHcxBillingCycleEnd));
        sb.append(", timeHcxLicenseStatusUpdated=")
                .append(String.valueOf(this.timeHcxLicenseStatusUpdated));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
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
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.clustersCount, other.clustersCount)
                && java.util.Objects.equals(this.vcenterFqdn, other.vcenterFqdn)
                && java.util.Objects.equals(this.nsxManagerFqdn, other.nsxManagerFqdn)
                && java.util.Objects.equals(this.vcenterPrivateIpId, other.vcenterPrivateIpId)
                && java.util.Objects.equals(this.nsxManagerPrivateIpId, other.nsxManagerPrivateIpId)
                && java.util.Objects.equals(this.vcenterUsername, other.vcenterUsername)
                && java.util.Objects.equals(this.nsxManagerUsername, other.nsxManagerUsername)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
                && java.util.Objects.equals(this.nsxEdgeUplinkIpId, other.nsxEdgeUplinkIpId)
                && java.util.Objects.equals(this.hcxPrivateIpId, other.hcxPrivateIpId)
                && java.util.Objects.equals(this.hcxFqdn, other.hcxFqdn)
                && java.util.Objects.equals(this.hcxMode, other.hcxMode)
                && java.util.Objects.equals(this.initialConfiguration, other.initialConfiguration)
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
        result =
                (result * PRIME)
                        + (this.clustersCount == null ? 43 : this.clustersCount.hashCode());
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
                        + (this.nsxEdgeUplinkIpId == null ? 43 : this.nsxEdgeUplinkIpId.hashCode());
        result =
                (result * PRIME)
                        + (this.hcxPrivateIpId == null ? 43 : this.hcxPrivateIpId.hashCode());
        result = (result * PRIME) + (this.hcxFqdn == null ? 43 : this.hcxFqdn.hashCode());
        result = (result * PRIME) + (this.hcxMode == null ? 43 : this.hcxMode.hashCode());
        result =
                (result * PRIME)
                        + (this.initialConfiguration == null
                                ? 43
                                : this.initialConfiguration.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
