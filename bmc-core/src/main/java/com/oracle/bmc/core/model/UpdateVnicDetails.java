/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVnicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateVnicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "hostnameLabel",
        "nsgIds",
        "skipSourceDestCheck"
    })
    public UpdateVnicDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String hostnameLabel,
            java.util.List<String> nsgIds,
            Boolean skipSourceDestCheck) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.hostnameLabel = hostnameLabel;
        this.nsgIds = nsgIds;
        this.skipSourceDestCheck = skipSourceDestCheck;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
         * and also the {@link PrivateIp} object returned by {@link
         * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
         * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
         * and also the {@link PrivateIp} object returned by {@link
         * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
         * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. Setting
         * this as an empty array removes the VNIC from all network security groups.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead,
         * the VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
         *
         * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. Setting
         * this as an empty array removes the VNIC from all network security groups.
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead,
         * the VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
         *
         * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code skipSourceDestCheck} attribute is
         * ignored. This is because the source/destination check is always disabled for VNICs in a
         * VLAN. Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
         * belonging to a subnet), the value of the {@code skipSourceDestCheck} attribute is
         * ignored. This is because the source/destination check is always disabled for VNICs in a
         * VLAN. Example: {@code true}
         *
         * @param skipSourceDestCheck the value to set
         * @return this builder
         */
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVnicDetails build() {
            UpdateVnicDetails model =
                    new UpdateVnicDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.hostnameLabel,
                            this.nsgIds,
                            this.skipSourceDestCheck);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVnicDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("skipSourceDestCheck")) {
                this.skipSourceDestCheck(model.getSkipSourceDestCheck());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
     * and also the {@link PrivateIp} object returned by {@link
     * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
     * and also the {@link PrivateIp} object returned by {@link
     * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. Setting this as
     * an empty array removes the VNIC from all network security groups.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead, the
     * VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
     *
     * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. Setting this as
     * an empty array removes the VNIC from all network security groups.
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code nsgIds} attribute is ignored. Instead, the
     * VNIC belongs to the NSGs that are associated with the VLAN itself. See {@link Vlan}.
     *
     * <p>For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code skipSourceDestCheck} attribute is ignored.
     * This is because the source/destination check is always disabled for VNICs in a VLAN. Example:
     * {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    private final Boolean skipSourceDestCheck;

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution (instead of
     * belonging to a subnet), the value of the {@code skipSourceDestCheck} attribute is ignored.
     * This is because the source/destination check is always disabled for VNICs in a VLAN. Example:
     * {@code true}
     *
     * @return the value
     */
    public Boolean getSkipSourceDestCheck() {
        return skipSourceDestCheck;
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
        sb.append("UpdateVnicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", skipSourceDestCheck=").append(String.valueOf(this.skipSourceDestCheck));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVnicDetails)) {
            return false;
        }

        UpdateVnicDetails other = (UpdateVnicDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.skipSourceDestCheck, other.skipSourceDestCheck)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.skipSourceDestCheck == null
                                ? 43
                                : this.skipSourceDestCheck.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
