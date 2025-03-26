/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSddcDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSddcDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "vmwareSoftwareVersion",
        "esxiSoftwareVersion",
        "compartmentId",
        "hcxMode",
        "initialConfiguration",
        "isSingleHostSddc",
        "sshAuthorizedKeys",
        "freeformTags",
        "definedTags"
    })
    public CreateSddcDetails(
            String displayName,
            String vmwareSoftwareVersion,
            String esxiSoftwareVersion,
            String compartmentId,
            HcxModes hcxMode,
            InitialConfiguration initialConfiguration,
            Boolean isSingleHostSddc,
            String sshAuthorizedKeys,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.compartmentId = compartmentId;
        this.hcxMode = hcxMode;
        this.initialConfiguration = initialConfiguration;
        this.isSingleHostSddc = isSingleHostSddc;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The ESXi software bundle to install on the ESXi hosts in the SDDC.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * The ESXi software bundle to install on the ESXi hosts in the SDDC.
         * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
         * To get a list of the available versions, use
         * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
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
         * HCX configuration of the SDDC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hcxMode")
        private HcxModes hcxMode;

        /**
         * HCX configuration of the SDDC.
         *
         * @param hcxMode the value to set
         * @return this builder
         **/
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
                            this.displayName,
                            this.vmwareSoftwareVersion,
                            this.esxiSoftwareVersion,
                            this.compartmentId,
                            this.hcxMode,
                            this.initialConfiguration,
                            this.isSingleHostSddc,
                            this.sshAuthorizedKeys,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSddcDetails model) {
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
            if (model.wasPropertyExplicitlySet("hcxMode")) {
                this.hcxMode(model.getHcxMode());
            }
            if (model.wasPropertyExplicitlySet("initialConfiguration")) {
                this.initialConfiguration(model.getInitialConfiguration());
            }
            if (model.wasPropertyExplicitlySet("isSingleHostSddc")) {
                this.isSingleHostSddc(model.getIsSingleHostSddc());
            }
            if (model.wasPropertyExplicitlySet("sshAuthorizedKeys")) {
                this.sshAuthorizedKeys(model.getSshAuthorizedKeys());
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
     * The ESXi software bundle to install on the ESXi hosts in the SDDC.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * The ESXi software bundle to install on the ESXi hosts in the SDDC.
     * Only versions under the same vmwareSoftwareVersion and have been validate by Oracle Cloud VMware Solution will be accepted.
     * To get a list of the available versions, use
     * {@link #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest) listSupportedVmwareSoftwareVersions}.
     *
     * @return the value
     **/
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the SDDC.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * HCX configuration of the SDDC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hcxMode")
    private final HcxModes hcxMode;

    /**
     * HCX configuration of the SDDC.
     *
     * @return the value
     **/
    public HcxModes getHcxMode() {
        return hcxMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialConfiguration")
    private final InitialConfiguration initialConfiguration;

    public InitialConfiguration getInitialConfiguration() {
        return initialConfiguration;
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", vmwareSoftwareVersion=").append(String.valueOf(this.vmwareSoftwareVersion));
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", hcxMode=").append(String.valueOf(this.hcxMode));
        sb.append(", initialConfiguration=").append(String.valueOf(this.initialConfiguration));
        sb.append(", isSingleHostSddc=").append(String.valueOf(this.isSingleHostSddc));
        sb.append(", sshAuthorizedKeys=").append(String.valueOf(this.sshAuthorizedKeys));
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
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hcxMode, other.hcxMode)
                && java.util.Objects.equals(this.initialConfiguration, other.initialConfiguration)
                && java.util.Objects.equals(this.isSingleHostSddc, other.isSingleHostSddc)
                && java.util.Objects.equals(this.sshAuthorizedKeys, other.sshAuthorizedKeys)
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
                        + (this.esxiSoftwareVersion == null
                                ? 43
                                : this.esxiSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hcxMode == null ? 43 : this.hcxMode.hashCode());
        result =
                (result * PRIME)
                        + (this.initialConfiguration == null
                                ? 43
                                : this.initialConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleHostSddc == null ? 43 : this.isSingleHostSddc.hashCode());
        result =
                (result * PRIME)
                        + (this.sshAuthorizedKeys == null ? 43 : this.sshAuthorizedKeys.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
