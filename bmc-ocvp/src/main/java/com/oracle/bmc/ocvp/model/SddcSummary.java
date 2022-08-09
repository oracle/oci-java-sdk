/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A summary of the SDDC.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SddcSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SddcSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "computeAvailabilityDomain",
        "displayName",
        "vmwareSoftwareVersion",
        "compartmentId",
        "esxiHostsCount",
        "hcxFqdn",
        "isHcxEnabled",
        "vcenterFqdn",
        "nsxManagerFqdn",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "isShieldedInstanceEnabled",
        "initialHostShapeName",
        "initialHostOcpuCount",
        "isSingleHostSddc",
        "freeformTags",
        "definedTags"
    })
    public SddcSummary(
            String id,
            String computeAvailabilityDomain,
            String displayName,
            String vmwareSoftwareVersion,
            String compartmentId,
            Integer esxiHostsCount,
            String hcxFqdn,
            Boolean isHcxEnabled,
            String vcenterFqdn,
            String nsxManagerFqdn,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            Boolean isShieldedInstanceEnabled,
            String initialHostShapeName,
            Float initialHostOcpuCount,
            Boolean isSingleHostSddc,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.computeAvailabilityDomain = computeAvailabilityDomain;
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.compartmentId = compartmentId;
        this.esxiHostsCount = esxiHostsCount;
        this.hcxFqdn = hcxFqdn;
        this.isHcxEnabled = isHcxEnabled;
        this.vcenterFqdn = vcenterFqdn;
        this.nsxManagerFqdn = nsxManagerFqdn;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.isShieldedInstanceEnabled = isShieldedInstanceEnabled;
        this.initialHostShapeName = initialHostShapeName;
        this.initialHostOcpuCount = initialHostOcpuCount;
        this.isSingleHostSddc = isSingleHostSddc;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the SDDC.
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
         * The availability domain that the SDDC's ESXi hosts are running in. For Multi-AD SDDC, it is {@code multi-AD}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
        private String computeAvailabilityDomain;

        /**
         * The availability domain that the SDDC's ESXi hosts are running in. For Multi-AD SDDC, it is {@code multi-AD}.
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
         * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
         * whitespaces, dashes and underscores.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
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
         * software currently installed on the ESXi hosts in the SDDC. The purpose
         * of this attribute is to show the version of software that the Oracle
         * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
         * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
         * <p>
         * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer
         * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
         * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
         * contains the SDDC.
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
         * The number of ESXi hosts in the SDDC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
        private Integer esxiHostsCount;

        /**
         * The number of ESXi hosts in the SDDC.
         * @param esxiHostsCount the value to set
         * @return this builder
         **/
        public Builder esxiHostsCount(Integer esxiHostsCount) {
            this.esxiHostsCount = esxiHostsCount;
            this.__explicitlySet__.add("esxiHostsCount");
            return this;
        }
        /**
         * HCX Fully Qualified Domain Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        /**
         * HCX Fully Qualified Domain Name
         * @param hcxFqdn the value to set
         * @return this builder
         **/
        public Builder hcxFqdn(String hcxFqdn) {
            this.hcxFqdn = hcxFqdn;
            this.__explicitlySet__.add("hcxFqdn");
            return this;
        }
        /**
         * Indicates whether HCX is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
        private Boolean isHcxEnabled;

        /**
         * Indicates whether HCX is enabled.
         * @param isHcxEnabled the value to set
         * @return this builder
         **/
        public Builder isHcxEnabled(Boolean isHcxEnabled) {
            this.isHcxEnabled = isHcxEnabled;
            this.__explicitlySet__.add("isHcxEnabled");
            return this;
        }
        /**
         * FQDN for vCenter
         * <p>
         * Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        /**
         * FQDN for vCenter
         * <p>
         * Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         * @param vcenterFqdn the value to set
         * @return this builder
         **/
        public Builder vcenterFqdn(String vcenterFqdn) {
            this.vcenterFqdn = vcenterFqdn;
            this.__explicitlySet__.add("vcenterFqdn");
            return this;
        }
        /**
         * FQDN for NSX Manager
         * <p>
         * Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        /**
         * FQDN for NSX Manager
         * <p>
         * Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         *
         * @param nsxManagerFqdn the value to set
         * @return this builder
         **/
        public Builder nsxManagerFqdn(String nsxManagerFqdn) {
            this.nsxManagerFqdn = nsxManagerFqdn;
            this.__explicitlySet__.add("nsxManagerFqdn");
            return this;
        }
        /**
         * The date and time the SDDC was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the SDDC was created, in the format defined by
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
         * The date and time the SDDC was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the SDDC was updated, in the format defined by
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
         * The current state of the SDDC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the SDDC.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Indicates whether shielded instance is enabled at the SDDC level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
        private Boolean isShieldedInstanceEnabled;

        /**
         * Indicates whether shielded instance is enabled at the SDDC level.
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
         * Indicates whether this SDDC is designated for only single ESXi host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
        private Boolean isSingleHostSddc;

        /**
         * Indicates whether this SDDC is designated for only single ESXi host.
         * @param isSingleHostSddc the value to set
         * @return this builder
         **/
        public Builder isSingleHostSddc(Boolean isSingleHostSddc) {
            this.isSingleHostSddc = isSingleHostSddc;
            this.__explicitlySet__.add("isSingleHostSddc");
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

        public SddcSummary build() {
            SddcSummary model =
                    new SddcSummary(
                            this.id,
                            this.computeAvailabilityDomain,
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.compartmentId,
                            this.esxiHostsCount,
                            this.hcxFqdn,
                            this.isHcxEnabled,
                            this.vcenterFqdn,
                            this.nsxManagerFqdn,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.isShieldedInstanceEnabled,
                            this.initialHostShapeName,
                            this.initialHostOcpuCount,
                            this.isSingleHostSddc,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SddcSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("esxiHostsCount")) {
                this.esxiHostsCount(model.getEsxiHostsCount());
            }
            if (model.wasPropertyExplicitlySet("hcxFqdn")) {
                this.hcxFqdn(model.getHcxFqdn());
            }
            if (model.wasPropertyExplicitlySet("isHcxEnabled")) {
                this.isHcxEnabled(model.getIsHcxEnabled());
            }
            if (model.wasPropertyExplicitlySet("vcenterFqdn")) {
                this.vcenterFqdn(model.getVcenterFqdn());
            }
            if (model.wasPropertyExplicitlySet("nsxManagerFqdn")) {
                this.nsxManagerFqdn(model.getNsxManagerFqdn());
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
            if (model.wasPropertyExplicitlySet("isShieldedInstanceEnabled")) {
                this.isShieldedInstanceEnabled(model.getIsShieldedInstanceEnabled());
            }
            if (model.wasPropertyExplicitlySet("initialHostShapeName")) {
                this.initialHostShapeName(model.getInitialHostShapeName());
            }
            if (model.wasPropertyExplicitlySet("initialHostOcpuCount")) {
                this.initialHostOcpuCount(model.getInitialHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("isSingleHostSddc")) {
                this.isSingleHostSddc(model.getIsSingleHostSddc());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The availability domain that the SDDC's ESXi hosts are running in. For Multi-AD SDDC, it is {@code multi-AD}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeAvailabilityDomain")
    private final String computeAvailabilityDomain;

    /**
     * The availability domain that the SDDC's ESXi hosts are running in. For Multi-AD SDDC, it is {@code multi-AD}.
     *
     * @return the value
     **/
    public String getComputeAvailabilityDomain() {
        return computeAvailabilityDomain;
    }

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A descriptive name for the SDDC. It must be unique, start with a letter, and contain only letters, digits,
     * whitespaces, dashes and underscores.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

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
     * software currently installed on the ESXi hosts in the SDDC. The purpose
     * of this attribute is to show the version of software that the Oracle
     * Cloud VMware Solution will install on any new ESXi hosts that you *add to this
     * SDDC in the future* with {@link #createEsxiHost(CreateEsxiHostRequest) createEsxiHost}.
     * <p>
     * Therefore, if you upgrade the existing ESXi hosts in the SDDC to use a newer
     * version of bundled VMware software supported by the Oracle Cloud VMware Solution, you
     * should use {@link #updateSddc(UpdateSddcRequest) updateSddc} to update the SDDC's
     * {@code vmwareSoftwareVersion} with that new version.
     *
     * @return the value
     **/
    public String getVmwareSoftwareVersion() {
        return vmwareSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment that
     * contains the SDDC.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The number of ESXi hosts in the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiHostsCount")
    private final Integer esxiHostsCount;

    /**
     * The number of ESXi hosts in the SDDC.
     * @return the value
     **/
    public Integer getEsxiHostsCount() {
        return esxiHostsCount;
    }

    /**
     * HCX Fully Qualified Domain Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    private final String hcxFqdn;

    /**
     * HCX Fully Qualified Domain Name
     * @return the value
     **/
    public String getHcxFqdn() {
        return hcxFqdn;
    }

    /**
     * Indicates whether HCX is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHcxEnabled")
    private final Boolean isHcxEnabled;

    /**
     * Indicates whether HCX is enabled.
     * @return the value
     **/
    public Boolean getIsHcxEnabled() {
        return isHcxEnabled;
    }

    /**
     * FQDN for vCenter
     * <p>
     * Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    private final String vcenterFqdn;

    /**
     * FQDN for vCenter
     * <p>
     * Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     **/
    public String getVcenterFqdn() {
        return vcenterFqdn;
    }

    /**
     * FQDN for NSX Manager
     * <p>
     * Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    private final String nsxManagerFqdn;

    /**
     * FQDN for NSX Manager
     * <p>
     * Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     **/
    public String getNsxManagerFqdn() {
        return nsxManagerFqdn;
    }

    /**
     * The date and time the SDDC was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the SDDC was created, in the format defined by
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
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the SDDC was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the SDDC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the SDDC.
     * @return the value
     **/
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Indicates whether shielded instance is enabled at the SDDC level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShieldedInstanceEnabled")
    private final Boolean isShieldedInstanceEnabled;

    /**
     * Indicates whether shielded instance is enabled at the SDDC level.
     *
     * @return the value
     **/
    public Boolean getIsShieldedInstanceEnabled() {
        return isShieldedInstanceEnabled;
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
     * Indicates whether this SDDC is designated for only single ESXi host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleHostSddc")
    private final Boolean isSingleHostSddc;

    /**
     * Indicates whether this SDDC is designated for only single ESXi host.
     * @return the value
     **/
    public Boolean getIsSingleHostSddc() {
        return isSingleHostSddc;
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
        sb.append("SddcSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", computeAvailabilityDomain=")
                .append(String.valueOf(this.computeAvailabilityDomain));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", esxiHostsCount=").append(String.valueOf(this.esxiHostsCount));
        sb.append(", hcxFqdn=").append(String.valueOf(this.hcxFqdn));
        sb.append(", isHcxEnabled=").append(String.valueOf(this.isHcxEnabled));
        sb.append(", vcenterFqdn=").append(String.valueOf(this.vcenterFqdn));
        sb.append(", nsxManagerFqdn=").append(String.valueOf(this.nsxManagerFqdn));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isShieldedInstanceEnabled=")
                .append(String.valueOf(this.isShieldedInstanceEnabled));
        sb.append(", initialHostShapeName=").append(String.valueOf(this.initialHostShapeName));
        sb.append(", initialHostOcpuCount=").append(String.valueOf(this.initialHostOcpuCount));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
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
        if (!(o instanceof SddcSummary)) {
            return false;
        }

        SddcSummary other = (SddcSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.computeAvailabilityDomain, other.computeAvailabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.esxiHostsCount, other.esxiHostsCount)
                && java.util.Objects.equals(this.hcxFqdn, other.hcxFqdn)
                && java.util.Objects.equals(this.isHcxEnabled, other.isHcxEnabled)
                && java.util.Objects.equals(this.vcenterFqdn, other.vcenterFqdn)
                && java.util.Objects.equals(this.nsxManagerFqdn, other.nsxManagerFqdn)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.isShieldedInstanceEnabled, other.isShieldedInstanceEnabled)
                && java.util.Objects.equals(this.initialHostShapeName, other.initialHostShapeName)
                && java.util.Objects.equals(this.initialHostOcpuCount, other.initialHostOcpuCount)
                && java.util.Objects.equals(this.isSingleHostSddc, other.isSingleHostSddc)
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
                        + (this.vmwareSoftwareVersion == null
                                ? 43
                                : this.vmwareSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiHostsCount == null ? 43 : this.esxiHostsCount.hashCode());
        result = (result * PRIME) + (this.hcxFqdn == null ? 43 : this.hcxFqdn.hashCode());
        result = (result * PRIME) + (this.isHcxEnabled == null ? 43 : this.isHcxEnabled.hashCode());
        result = (result * PRIME) + (this.vcenterFqdn == null ? 43 : this.vcenterFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.nsxManagerFqdn == null ? 43 : this.nsxManagerFqdn.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isShieldedInstanceEnabled == null
                                ? 43
                                : this.isShieldedInstanceEnabled.hashCode());
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
                        + (this.isSingleHostSddc == null ? 43 : this.isSingleHostSddc.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
