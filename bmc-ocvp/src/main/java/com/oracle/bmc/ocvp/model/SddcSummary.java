/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A summary of the SDDC. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SddcSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SddcSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "vmwareSoftwareVersion",
        "compartmentId",
        "clustersCount",
        "hcxFqdn",
        "hcxMode",
        "vcenterFqdn",
        "nsxManagerFqdn",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "isSingleHostSddc",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SddcSummary(
            String id,
            String displayName,
            String vmwareSoftwareVersion,
            String compartmentId,
            Integer clustersCount,
            String hcxFqdn,
            HcxModes hcxMode,
            String vcenterFqdn,
            String nsxManagerFqdn,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleStates lifecycleState,
            Boolean isSingleHostSddc,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.compartmentId = compartmentId;
        this.clustersCount = clustersCount;
        this.hcxFqdn = hcxFqdn;
        this.hcxMode = hcxMode;
        this.vcenterFqdn = vcenterFqdn;
        this.nsxManagerFqdn = nsxManagerFqdn;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.isSingleHostSddc = isSingleHostSddc;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the SDDC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the SDDC.
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
        /** The number of ESXi hosts in the SDDC. */
        @com.fasterxml.jackson.annotation.JsonProperty("clustersCount")
        private Integer clustersCount;

        /**
         * The number of ESXi hosts in the SDDC.
         *
         * @param clustersCount the value to set
         * @return this builder
         */
        public Builder clustersCount(Integer clustersCount) {
            this.clustersCount = clustersCount;
            this.__explicitlySet__.add("clustersCount");
            return this;
        }
        /** HCX Fully Qualified Domain Name */
        @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
        private String hcxFqdn;

        /**
         * HCX Fully Qualified Domain Name
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
        /**
         * FQDN for vCenter
         *
         * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
        private String vcenterFqdn;

        /**
         * FQDN for vCenter
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
         * FQDN for NSX Manager
         *
         * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
        private String nsxManagerFqdn;

        /**
         * FQDN for NSX Manager
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

        public SddcSummary build() {
            SddcSummary model =
                    new SddcSummary(
                            this.id,
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.compartmentId,
                            this.clustersCount,
                            this.hcxFqdn,
                            this.hcxMode,
                            this.vcenterFqdn,
                            this.nsxManagerFqdn,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.isSingleHostSddc,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vmwareSoftwareVersion")) {
                this.vmwareSoftwareVersion(model.getVmwareSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("clustersCount")) {
                this.clustersCount(model.getClustersCount());
            }
            if (model.wasPropertyExplicitlySet("hcxFqdn")) {
                this.hcxFqdn(model.getHcxFqdn());
            }
            if (model.wasPropertyExplicitlySet("hcxMode")) {
                this.hcxMode(model.getHcxMode());
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
            if (model.wasPropertyExplicitlySet("isSingleHostSddc")) {
                this.isSingleHostSddc(model.getIsSingleHostSddc());
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
     * compartment that contains the SDDC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the SDDC.
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

    /** The number of ESXi hosts in the SDDC. */
    @com.fasterxml.jackson.annotation.JsonProperty("clustersCount")
    private final Integer clustersCount;

    /**
     * The number of ESXi hosts in the SDDC.
     *
     * @return the value
     */
    public Integer getClustersCount() {
        return clustersCount;
    }

    /** HCX Fully Qualified Domain Name */
    @com.fasterxml.jackson.annotation.JsonProperty("hcxFqdn")
    private final String hcxFqdn;

    /**
     * HCX Fully Qualified Domain Name
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

    /**
     * FQDN for vCenter
     *
     * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterFqdn")
    private final String vcenterFqdn;

    /**
     * FQDN for vCenter
     *
     * <p>Example: {@code vcenter-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     */
    public String getVcenterFqdn() {
        return vcenterFqdn;
    }

    /**
     * FQDN for NSX Manager
     *
     * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsxManagerFqdn")
    private final String nsxManagerFqdn;

    /**
     * FQDN for NSX Manager
     *
     * <p>Example: {@code nsx-my-sddc.sddc.us-phoenix-1.oraclecloud.com}
     *
     * @return the value
     */
    public String getNsxManagerFqdn() {
        return nsxManagerFqdn;
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
        sb.append("SddcSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", clustersCount=").append(String.valueOf(this.clustersCount));
        sb.append(", hcxFqdn=").append(String.valueOf(this.hcxFqdn));
        sb.append(", hcxMode=").append(String.valueOf(this.hcxMode));
        sb.append(", vcenterFqdn=").append(String.valueOf(this.vcenterFqdn));
        sb.append(", nsxManagerFqdn=").append(String.valueOf(this.nsxManagerFqdn));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
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
        if (!(o instanceof SddcSummary)) {
            return false;
        }

        SddcSummary other = (SddcSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.clustersCount, other.clustersCount)
                && java.util.Objects.equals(this.hcxFqdn, other.hcxFqdn)
                && java.util.Objects.equals(this.hcxMode, other.hcxMode)
                && java.util.Objects.equals(this.vcenterFqdn, other.vcenterFqdn)
                && java.util.Objects.equals(this.nsxManagerFqdn, other.nsxManagerFqdn)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isSingleHostSddc, other.isSingleHostSddc)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.clustersCount == null ? 43 : this.clustersCount.hashCode());
        result = (result * PRIME) + (this.hcxFqdn == null ? 43 : this.hcxFqdn.hashCode());
        result = (result * PRIME) + (this.hcxMode == null ? 43 : this.hcxMode.hashCode());
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
                        + (this.isSingleHostSddc == null ? 43 : this.isSingleHostSddc.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
