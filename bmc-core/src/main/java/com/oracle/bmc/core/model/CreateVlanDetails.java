/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVlanDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVlanDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "cidrBlock",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "nsgIds",
        "routeTableId",
        "vcnId",
        "vlanTag"
    })
    public CreateVlanDetails(
            String availabilityDomain,
            String cidrBlock,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.List<String> nsgIds,
            String routeTableId,
            String vcnId,
            Integer vlanTag) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.cidrBlock = cidrBlock;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.nsgIds = nsgIds;
        this.routeTableId = routeTableId;
        this.vcnId = vcnId;
        this.vlanTag = vlanTag;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Controls whether the VLAN is regional or specific to an availability domain. A regional
         * VLAN has the flexibility to implement failover across availability domains. Previously,
         * all VLANs were AD-specific.
         *
         * <p>To create a regional VLAN, omit this attribute. Resources created subsequently in this
         * VLAN (such as a Compute instance) can be created in any availability domain in the
         * region.
         *
         * <p>To create an AD-specific VLAN, use this attribute to specify the availability domain.
         * Resources created in this VLAN must be in that availability domain.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Controls whether the VLAN is regional or specific to an availability domain. A regional
         * VLAN has the flexibility to implement failover across availability domains. Previously,
         * all VLANs were AD-specific.
         *
         * <p>To create a regional VLAN, omit this attribute. Resources created subsequently in this
         * VLAN (such as a Compute instance) can be created in any availability domain in the
         * region.
         *
         * <p>To create an AD-specific VLAN, use this attribute to specify the availability domain.
         * Resources created in this VLAN must be in that availability domain.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The range of IPv4 addresses that will be used for layer 3 communication with hosts
         * outside the VLAN. The CIDR must maintain the following rules -
         *
         * <p>1. The CIDR block is valid and correctly formatted. 2. The new range is within one of
         * the parent VCN ranges.
         *
         * <p>Example: {@code 192.0.2.0/24}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The range of IPv4 addresses that will be used for layer 3 communication with hosts
         * outside the VLAN. The CIDR must maintain the following rules -
         *
         * <p>1. The CIDR block is valid and correctly formatted. 2. The new range is within one of
         * the parent VCN ranges.
         *
         * <p>Example: {@code 192.0.2.0/24}
         *
         * @param cidrBlock the value to set
         * @return this builder
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the VLAN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the VLAN.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
         * A list of the OCIDs of the network security groups (NSGs) to add all VNICs in the VLAN
         * to. For more information about NSGs, see {@link NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add all VNICs in the VLAN
         * to. For more information about NSGs, see {@link NetworkSecurityGroup}.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the VLAN will use. If you don't provide a value, the VLAN uses the VCN's
         * default route table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the VLAN will use. If you don't provide a value, the VLAN uses the VCN's
         * default route table.
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN to contain the VLAN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN to contain the VLAN.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The IEEE 802.1Q VLAN tag for this VLAN. The value must be unique across all VLANs in the
         * VCN. If you don't provide a value, Oracle assigns one. You cannot change the value later.
         * VLAN tag 0 is reserved for use by Oracle.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
        private Integer vlanTag;

        /**
         * The IEEE 802.1Q VLAN tag for this VLAN. The value must be unique across all VLANs in the
         * VCN. If you don't provide a value, Oracle assigns one. You cannot change the value later.
         * VLAN tag 0 is reserved for use by Oracle.
         *
         * @param vlanTag the value to set
         * @return this builder
         */
        public Builder vlanTag(Integer vlanTag) {
            this.vlanTag = vlanTag;
            this.__explicitlySet__.add("vlanTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVlanDetails build() {
            CreateVlanDetails model =
                    new CreateVlanDetails(
                            this.availabilityDomain,
                            this.cidrBlock,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.nsgIds,
                            this.routeTableId,
                            this.vcnId,
                            this.vlanTag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVlanDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("vlanTag")) {
                this.vlanTag(model.getVlanTag());
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
     * Controls whether the VLAN is regional or specific to an availability domain. A regional VLAN
     * has the flexibility to implement failover across availability domains. Previously, all VLANs
     * were AD-specific.
     *
     * <p>To create a regional VLAN, omit this attribute. Resources created subsequently in this
     * VLAN (such as a Compute instance) can be created in any availability domain in the region.
     *
     * <p>To create an AD-specific VLAN, use this attribute to specify the availability domain.
     * Resources created in this VLAN must be in that availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Controls whether the VLAN is regional or specific to an availability domain. A regional VLAN
     * has the flexibility to implement failover across availability domains. Previously, all VLANs
     * were AD-specific.
     *
     * <p>To create a regional VLAN, omit this attribute. Resources created subsequently in this
     * VLAN (such as a Compute instance) can be created in any availability domain in the region.
     *
     * <p>To create an AD-specific VLAN, use this attribute to specify the availability domain.
     * Resources created in this VLAN must be in that availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The range of IPv4 addresses that will be used for layer 3 communication with hosts outside
     * the VLAN. The CIDR must maintain the following rules -
     *
     * <p>1. The CIDR block is valid and correctly formatted. 2. The new range is within one of the
     * parent VCN ranges.
     *
     * <p>Example: {@code 192.0.2.0/24}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The range of IPv4 addresses that will be used for layer 3 communication with hosts outside
     * the VLAN. The CIDR must maintain the following rules -
     *
     * <p>1. The CIDR block is valid and correctly formatted. 2. The new range is within one of the
     * parent VCN ranges.
     *
     * <p>Example: {@code 192.0.2.0/24}
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the VLAN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the VLAN.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * A list of the OCIDs of the network security groups (NSGs) to add all VNICs in the VLAN to.
     * For more information about NSGs, see {@link NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add all VNICs in the VLAN to.
     * For more information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the VLAN will use. If you don't provide a value, the VLAN uses the VCN's default
     * route table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the VLAN will use. If you don't provide a value, the VLAN uses the VCN's default
     * route table.
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * to contain the VLAN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * to contain the VLAN.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The IEEE 802.1Q VLAN tag for this VLAN. The value must be unique across all VLANs in the VCN.
     * If you don't provide a value, Oracle assigns one. You cannot change the value later. VLAN tag
     * 0 is reserved for use by Oracle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
    private final Integer vlanTag;

    /**
     * The IEEE 802.1Q VLAN tag for this VLAN. The value must be unique across all VLANs in the VCN.
     * If you don't provide a value, Oracle assigns one. You cannot change the value later. VLAN tag
     * 0 is reserved for use by Oracle.
     *
     * @return the value
     */
    public Integer getVlanTag() {
        return vlanTag;
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
        sb.append("CreateVlanDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", vlanTag=").append(String.valueOf(this.vlanTag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVlanDetails)) {
            return false;
        }

        CreateVlanDetails other = (CreateVlanDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.vlanTag, other.vlanTag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.vlanTag == null ? 43 : this.vlanTag.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
