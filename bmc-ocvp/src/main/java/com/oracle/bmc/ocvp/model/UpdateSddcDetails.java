/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSddcDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSddcDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "vmwareSoftwareVersion",
        "esxiSoftwareVersion",
        "sshAuthorizedKeys",
        "freeformTags",
        "definedTags"
    })
    public UpdateSddcDetails(
            String displayName,
            String vmwareSoftwareVersion,
            String esxiSoftwareVersion,
            String sshAuthorizedKeys,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.vmwareSoftwareVersion = vmwareSoftwareVersion;
        this.esxiSoftwareVersion = esxiSoftwareVersion;
        this.sshAuthorizedKeys = sshAuthorizedKeys;
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
         * on any new ESXi hosts that you add to this SDDC in the future unless a specific version
         * is configured on the Cluster level.
         *
         * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
        private String vmwareSoftwareVersion;

        /**
         * The version of bundled VMware software that the Oracle Cloud VMware Solution will install
         * on any new ESXi hosts that you add to this SDDC in the future unless a specific version
         * is configured on the Cluster level.
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
         * The version of bundled ESXi software that the Oracle Cloud VMware Solution will install
         * on any new ESXi hosts that you add to this SDDC in the future unless a specific version
         * is configured on the Cluster level.
         *
         * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
        private String esxiSoftwareVersion;

        /**
         * The version of bundled ESXi software that the Oracle Cloud VMware Solution will install
         * on any new ESXi hosts that you add to this SDDC in the future unless a specific version
         * is configured on the Cluster level.
         *
         * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
         * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
         * listSupportedVmwareSoftwareVersions}).
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
                            this.esxiSoftwareVersion,
                            this.sshAuthorizedKeys,
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
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersion")) {
                this.esxiSoftwareVersion(model.getEsxiSoftwareVersion());
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
     * any new ESXi hosts that you add to this SDDC in the future unless a specific version is
     * configured on the Cluster level.
     *
     * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmwareSoftwareVersion")
    private final String vmwareSoftwareVersion;

    /**
     * The version of bundled VMware software that the Oracle Cloud VMware Solution will install on
     * any new ESXi hosts that you add to this SDDC in the future unless a specific version is
     * configured on the Cluster level.
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
     * The version of bundled ESXi software that the Oracle Cloud VMware Solution will install on
     * any new ESXi hosts that you add to this SDDC in the future unless a specific version is
     * configured on the Cluster level.
     *
     * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersion")
    private final String esxiSoftwareVersion;

    /**
     * The version of bundled ESXi software that the Oracle Cloud VMware Solution will install on
     * any new ESXi hosts that you add to this SDDC in the future unless a specific version is
     * configured on the Cluster level.
     *
     * <p>For the list of versions supported by the Oracle Cloud VMware Solution, see {@link
     * #listSupportedVmwareSoftwareVersions(ListSupportedVmwareSoftwareVersionsRequest)
     * listSupportedVmwareSoftwareVersions}).
     *
     * @return the value
     */
    public String getEsxiSoftwareVersion() {
        return esxiSoftwareVersion;
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
        sb.append(", esxiSoftwareVersion=").append(String.valueOf(this.esxiSoftwareVersion));
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
        if (!(o instanceof UpdateSddcDetails)) {
            return false;
        }

        UpdateSddcDetails other = (UpdateSddcDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vmwareSoftwareVersion, other.vmwareSoftwareVersion)
                && java.util.Objects.equals(this.esxiSoftwareVersion, other.esxiSoftwareVersion)
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
                        + (this.sshAuthorizedKeys == null ? 43 : this.sshAuthorizedKeys.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
