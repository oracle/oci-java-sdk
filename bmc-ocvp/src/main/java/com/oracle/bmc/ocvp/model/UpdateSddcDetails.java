/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The SDDC information to be updated.
 *
 * <p>*Important:** Only the {@code displayName}, {@code freeFormTags}, and {@code definedTags}
 * attributes affect the existing SDDC. Changing the other attributes affects the {@code Sddc}
 * object, but not the VMware environment currently running on that SDDC. Those other attributes are
 * used by the Oracle Cloud VMware Solution *only* for new ESXi hosts that you add to this SDDC in
 * the future with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSddcDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateSddcDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "vmwareSoftwareVersion",
        "sshAuthorizedKeys",
        "vsphereVlanId",
        "vmotionVlanId",
        "vsanVlanId",
        "nsxVTepVlanId",
        "nsxEdgeVTepVlanId",
        "nsxEdgeUplink1VlanId",
        "nsxEdgeUplink2VlanId",
        "replicationVlanId",
        "provisioningVlanId",
        "hcxVlanId",
        "freeformTags",
        "definedTags"
    })
    public UpdateSddcDetails(
            String displayName,
            String vmwareSoftwareVersion,
            String sshAuthorizedKeys,
            String vsphereVlanId,
            String vmotionVlanId,
            String vsanVlanId,
            String nsxVTepVlanId,
            String nsxEdgeVTepVlanId,
            String nsxEdgeUplink1VlanId,
            String nsxEdgeUplink2VlanId,
            String replicationVlanId,
            String provisioningVlanId,
            String hcxVlanId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.vsphereVlanId = vsphereVlanId;
        this.vmotionVlanId = vmotionVlanId;
        this.vsanVlanId = vsanVlanId;
        this.nsxVTepVlanId = nsxVTepVlanId;
        this.nsxEdgeVTepVlanId = nsxEdgeVTepVlanId;
        this.nsxEdgeUplink1VlanId = nsxEdgeUplink1VlanId;
        this.nsxEdgeUplink2VlanId = nsxEdgeUplink2VlanId;
        this.replicationVlanId = replicationVlanId;
        this.provisioningVlanId = provisioningVlanId;
        this.hcxVlanId = hcxVlanId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC. SDDC name requirements are 1-16 character length limit, Must start with a letter,
         * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the
         * region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * SDDC. SDDC name requirements are 1-16 character length limit, Must start with a letter,
         * Must be English letters, numbers, - only, No repeating hyphens, Must be unique within the
         * region.
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
         * The version of bundled VMware software that the Oracle Cloud VMware Solution will install
         * on any new ESXi hosts that you add to this SDDC in the future.
         *
         * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * The version of bundled VMware software that the Oracle Cloud VMware Solution will install
         * on any new ESXi hosts that you add to this SDDC in the future.
         *
         * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
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
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host, only when adding new ESXi hosts to this SDDC. Use a
         * newline character to separate multiple keys. The SSH keys must be in the format required
         * for the {@code authorized_keys} file.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
        private String sshAuthorizedKeys;

        /**
         * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for
         * the default user on each ESXi host, only when adding new ESXi hosts to this SDDC. Use a
         * newline character to separate multiple keys. The SSH keys must be in the format required
         * for the {@code authorized_keys} file.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the vSphere component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
        private String vsphereVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the vSphere component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
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
         * VLAN to use for the vMotion component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
        private String vmotionVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the vMotion component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
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
         * VLAN to use for the vSAN component of the VMware environment when adding new ESXi hosts
         * to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
        private String vsanVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the vSAN component of the VMware environment when adding new ESXi hosts
         * to the SDDC.
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
         * VLAN to use for the NSX VTEP component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
        private String nsxVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the NSX VTEP component of the VMware environment when adding new ESXi
         * hosts to the SDDC.
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
         * VLAN to use for the NSX Edge VTEP component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
        private String nsxEdgeVTepVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the NSX Edge VTEP component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
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
         * VLAN to use for the NSX Edge Uplink 1 component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
        private String nsxEdgeUplink1VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the NSX Edge Uplink 1 component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
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
         * VLAN to use for the NSX Edge Uplink 2 component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
         *
         * <p>*Note:** This VLAN is reserved for future use to deploy public-facing applications on
         * the VMware SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
        private String nsxEdgeUplink2VlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the NSX Edge Uplink 2 component of the VMware environment when adding new
         * ESXi hosts to the SDDC.
         *
         * <p>*Note:** This VLAN is reserved for future use to deploy public-facing applications on
         * the VMware SDDC.
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
         * VLAN to use for the HCX component of the VMware environment when adding new ESXi hosts to
         * the SDDC. This value can be updated only when {@code isHcxEnabled} is true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
        private String hcxVlanId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VLAN to use for the HCX component of the VMware environment when adding new ESXi hosts to
         * the SDDC. This value can be updated only when {@code isHcxEnabled} is true.
         *
         * @param hcxVlanId the value to set
         * @return this builder
         */
        public Builder hcxVlanId(String hcxVlanId) {
            this.hcxVlanId = hcxVlanId;
            this.__explicitlySet__.add("hcxVlanId");
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

        public UpdateSddcDetails build() {
            UpdateSddcDetails model =
                    new UpdateSddcDetails(
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.sshAuthorizedKeys,
                            this.vsphereVlanId,
                            this.vmotionVlanId,
                            this.vsanVlanId,
                            this.nsxVTepVlanId,
                            this.nsxEdgeVTepVlanId,
                            this.nsxEdgeUplink1VlanId,
                            this.nsxEdgeUplink2VlanId,
                            this.replicationVlanId,
                            this.provisioningVlanId,
                            this.hcxVlanId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSddcDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vmwareSoftwareVersion")) {
                this.vmwareSoftwareVersion(model.getVmwareSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("sshAuthorizedKeys")) {
                this.sshAuthorizedKeys(model.getSshAuthorizedKeys());
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
            if (model.wasPropertyExplicitlySet("hcxVlanId")) {
                this.hcxVlanId(model.getHcxVlanId());
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
     * SDDC. SDDC name requirements are 1-16 character length limit, Must start with a letter, Must
     * be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * SDDC. SDDC name requirements are 1-16 character length limit, Must start with a letter, Must
     * be English letters, numbers, - only, No repeating hyphens, Must be unique within the region.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The version of bundled VMware software that the Oracle Cloud VMware Solution will install on
     * any new ESXi hosts that you add to this SDDC in the future.
     *
     * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * The version of bundled VMware software that the Oracle Cloud VMware Solution will install on
     * any new ESXi hosts that you add to this SDDC in the future.
     *
     * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * @return the value
     */
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for the
     * default user on each ESXi host, only when adding new ESXi hosts to this SDDC. Use a newline
     * character to separate multiple keys. The SSH keys must be in the format required for the
     * {@code authorized_keys} file.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshAuthorizedKeys")
    private final String sshAuthorizedKeys;

    /**
     * One or more public SSH keys to be included in the {@code ~/.ssh/authorized_keys} file for the
     * default user on each ESXi host, only when adding new ESXi hosts to this SDDC. Use a newline
     * character to separate multiple keys. The SSH keys must be in the format required for the
     * {@code authorized_keys} file.
     *
     * @return the value
     */
    public String getSshAuthorizedKeys() {
        return sshAuthorizedKeys;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vSphere component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVlanId")
    private final String vsphereVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vSphere component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     *
     * @return the value
     */
    public String getVsphereVlanId() {
        return vsphereVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vMotion component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmotionVlanId")
    private final String vmotionVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vMotion component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     *
     * @return the value
     */
    public String getVmotionVlanId() {
        return vmotionVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vSAN component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsanVlanId")
    private final String vsanVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the vSAN component of the VMware environment when adding new ESXi hosts to
     * the SDDC.
     *
     * @return the value
     */
    public String getVsanVlanId() {
        return vsanVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX VTEP component of the VMware environment when adding new ESXi hosts
     * to the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxVTepVlanId")
    private final String nsxVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX VTEP component of the VMware environment when adding new ESXi hosts
     * to the SDDC.
     *
     * @return the value
     */
    public String getNsxVTepVlanId() {
        return nsxVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge VTEP component of the VMware environment when adding new ESXi
     * hosts to the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeVTepVlanId")
    private final String nsxEdgeVTepVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge VTEP component of the VMware environment when adding new ESXi
     * hosts to the SDDC.
     *
     * @return the value
     */
    public String getNsxEdgeVTepVlanId() {
        return nsxEdgeVTepVlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge Uplink 1 component of the VMware environment when adding new
     * ESXi hosts to the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink1VlanId")
    private final String nsxEdgeUplink1VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge Uplink 1 component of the VMware environment when adding new
     * ESXi hosts to the SDDC.
     *
     * @return the value
     */
    public String getNsxEdgeUplink1VlanId() {
        return nsxEdgeUplink1VlanId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge Uplink 2 component of the VMware environment when adding new
     * ESXi hosts to the SDDC.
     *
     * <p>*Note:** This VLAN is reserved for future use to deploy public-facing applications on the
     * VMware SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxEdgeUplink2VlanId")
    private final String nsxEdgeUplink2VlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the NSX Edge Uplink 2 component of the VMware environment when adding new
     * ESXi hosts to the SDDC.
     *
     * <p>*Note:** This VLAN is reserved for future use to deploy public-facing applications on the
     * VMware SDDC.
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
     * VLAN to use for the HCX component of the VMware environment when adding new ESXi hosts to the
     * SDDC. This value can be updated only when {@code isHcxEnabled} is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxVlanId")
    private final String hcxVlanId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VLAN to use for the HCX component of the VMware environment when adding new ESXi hosts to the
     * SDDC. This value can be updated only when {@code isHcxEnabled} is true.
     *
     * @return the value
     */
    public String getHcxVlanId() {
        return hcxVlanId;
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
        sb.append("UpdateSddcDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
        sb.append(", vsphereVlanId=").append(String.valueOf(this.vsphereVlanId));
        sb.append(", vmotionVlanId=").append(String.valueOf(this.vmotionVlanId));
        sb.append(", vsanVlanId=").append(String.valueOf(this.vsanVlanId));
        sb.append(", nsxVTepVlanId=").append(String.valueOf(this.nsxVTepVlanId));
        sb.append(", nsxEdgeVTepVlanId=").append(String.valueOf(this.nsxEdgeVTepVlanId));
        sb.append(", nsxEdgeUplink1VlanId=").append(String.valueOf(this.nsxEdgeUplink1VlanId));
        sb.append(", nsxEdgeUplink2VlanId=").append(String.valueOf(this.nsxEdgeUplink2VlanId));
        sb.append(", replicationVlanId=").append(String.valueOf(this.replicationVlanId));
        sb.append(", provisioningVlanId=").append(String.valueOf(this.provisioningVlanId));
        sb.append(", hcxVlanId=").append(String.valueOf(this.hcxVlanId));
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
        if (!(o instanceof UpdateSddcDetails)) {
            return false;
        }

        UpdateSddcDetails other = (UpdateSddcDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
                && java.util.Objects.equals(this.vsphereVlanId, other.vsphereVlanId)
                && java.util.Objects.equals(this.vmotionVlanId, other.vmotionVlanId)
                && java.util.Objects.equals(this.vsanVlanId, other.vsanVlanId)
                && java.util.Objects.equals(this.nsxVTepVlanId, other.nsxVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeVTepVlanId, other.nsxEdgeVTepVlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink1VlanId, other.nsxEdgeUplink1VlanId)
                && java.util.Objects.equals(this.nsxEdgeUplink2VlanId, other.nsxEdgeUplink2VlanId)
                && java.util.Objects.equals(this.replicationVlanId, other.replicationVlanId)
                && java.util.Objects.equals(this.provisioningVlanId, other.provisioningVlanId)
                && java.util.Objects.equals(this.hcxVlanId, other.hcxVlanId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.sshAuthorizedKeys == null ? 43 : this.sshAuthorizedKeys.hashCode());
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
        result = (result * PRIME) + (this.hcxVlanId == null ? 43 : this.hcxVlanId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
