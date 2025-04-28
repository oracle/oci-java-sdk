/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateVcnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVcnDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cidrBlock",
        "cidrBlocks",
        "compartmentId",
        "ipv6PrivateCidrBlocks",
        "isOracleGuaAllocationEnabled",
        "byoipv6CidrDetails",
        "definedTags",
        "displayName",
        "dnsLabel",
        "freeformTags",
        "isIpv6Enabled"
    })
    public CreateVcnDetails(
            String cidrBlock,
            java.util.List<String> cidrBlocks,
            String compartmentId,
            java.util.List<String> ipv6PrivateCidrBlocks,
            Boolean isOracleGuaAllocationEnabled,
            java.util.List<Byoipv6CidrDetails> byoipv6CidrDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String dnsLabel,
            java.util.Map<String, String> freeformTags,
            Boolean isIpv6Enabled) {
        super();
        this.cidrBlock = cidrBlock;
        this.cidrBlocks = cidrBlocks;
        this.compartmentId = compartmentId;
        this.ipv6PrivateCidrBlocks = ipv6PrivateCidrBlocks;
        this.isOracleGuaAllocationEnabled = isOracleGuaAllocationEnabled;
        this.byoipv6CidrDetails = byoipv6CidrDetails;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.dnsLabel = dnsLabel;
        this.freeformTags = freeformTags;
        this.isIpv6Enabled = isIpv6Enabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * **Deprecated.** Do *not* set this value. Use {@code cidrBlocks} instead. Example: {@code
         * 10.0.0.0/16}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * **Deprecated.** Do *not* set this value. Use {@code cidrBlocks} instead. Example: {@code
         * 10.0.0.0/16}
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
         * The list of one or more IPv4 CIDR blocks for the VCN that meet the following criteria: -
         * The CIDR blocks must be valid. - They must not overlap with each other or with the
         * on-premises network CIDR block. - The number of CIDR blocks must not exceed the limit of
         * CIDR blocks allowed per VCN.
         *
         * <p>*Important:** Do *not* specify a value for {@code cidrBlock}. Use this parameter
         * instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        /**
         * The list of one or more IPv4 CIDR blocks for the VCN that meet the following criteria: -
         * The CIDR blocks must be valid. - They must not overlap with each other or with the
         * on-premises network CIDR block. - The number of CIDR blocks must not exceed the limit of
         * CIDR blocks allowed per VCN.
         *
         * <p>*Important:** Do *not* specify a value for {@code cidrBlock}. Use this parameter
         * instead.
         *
         * @param cidrBlocks the value to set
         * @return this builder
         */
        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            this.__explicitlySet__.add("cidrBlocks");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to contain the VCN.
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
         * The list of one or more ULA or Private IPv6 CIDR blocks for the vcn that meets the
         * following criteria: - The CIDR blocks must be valid. - Multiple CIDR blocks must not
         * overlap each other or the on-premises network CIDR block. - The number of CIDR blocks
         * must not exceed the limit of IPv6 CIDR blocks allowed to a vcn.
         *
         * <p>*Important:** Do *not* specify a value for {@code ipv6CidrBlock}. Use this parameter
         * instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlocks")
        private java.util.List<String> ipv6PrivateCidrBlocks;

        /**
         * The list of one or more ULA or Private IPv6 CIDR blocks for the vcn that meets the
         * following criteria: - The CIDR blocks must be valid. - Multiple CIDR blocks must not
         * overlap each other or the on-premises network CIDR block. - The number of CIDR blocks
         * must not exceed the limit of IPv6 CIDR blocks allowed to a vcn.
         *
         * <p>*Important:** Do *not* specify a value for {@code ipv6CidrBlock}. Use this parameter
         * instead.
         *
         * @param ipv6PrivateCidrBlocks the value to set
         * @return this builder
         */
        public Builder ipv6PrivateCidrBlocks(java.util.List<String> ipv6PrivateCidrBlocks) {
            this.ipv6PrivateCidrBlocks = ipv6PrivateCidrBlocks;
            this.__explicitlySet__.add("ipv6PrivateCidrBlocks");
            return this;
        }
        /**
         * Specifies whether to skip Oracle allocated IPv6 GUA. By default, Oracle will allocate one
         * GUA of /56 size for an IPv6 enabled VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
        private Boolean isOracleGuaAllocationEnabled;

        /**
         * Specifies whether to skip Oracle allocated IPv6 GUA. By default, Oracle will allocate one
         * GUA of /56 size for an IPv6 enabled VCN.
         *
         * @param isOracleGuaAllocationEnabled the value to set
         * @return this builder
         */
        public Builder isOracleGuaAllocationEnabled(Boolean isOracleGuaAllocationEnabled) {
            this.isOracleGuaAllocationEnabled = isOracleGuaAllocationEnabled;
            this.__explicitlySet__.add("isOracleGuaAllocationEnabled");
            return this;
        }
        /**
         * The list of BYOIPv6 OCIDs and BYOIPv6 CIDR blocks required to create a VCN that uses
         * BYOIPv6 ranges.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrDetails")
        private java.util.List<Byoipv6CidrDetails> byoipv6CidrDetails;

        /**
         * The list of BYOIPv6 OCIDs and BYOIPv6 CIDR blocks required to create a VCN that uses
         * BYOIPv6 ranges.
         *
         * @param byoipv6CidrDetails the value to set
         * @return this builder
         */
        public Builder byoipv6CidrDetails(java.util.List<Byoipv6CidrDetails> byoipv6CidrDetails) {
            this.byoipv6CidrDetails = byoipv6CidrDetails;
            this.__explicitlySet__.add("byoipv6CidrDetails");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS
         * label to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for
         * example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Not required to be unique,
         * but it's a best practice to set unique DNS labels for VCNs in your tenancy. Must be an
         * alphanumeric string that begins with a letter. The value cannot be changed.
         *
         * <p>You must set this value if you want instances to be able to use hostnames to resolve
         * other instances in the VCN. Otherwise the Internet and VCN Resolver will not work.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code vcn1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        /**
         * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS
         * label to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for
         * example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Not required to be unique,
         * but it's a best practice to set unique DNS labels for VCNs in your tenancy. Must be an
         * alphanumeric string that begins with a letter. The value cannot be changed.
         *
         * <p>You must set this value if you want instances to be able to use hostnames to resolve
         * other instances in the VCN. Otherwise the Internet and VCN Resolver will not work.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code vcn1}
         *
         * @param dnsLabel the value to set
         * @return this builder
         */
        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Whether IPv6 is enabled for the VCN. Default is {@code false}. If enabled, Oracle will
         * assign the VCN a IPv6 /56 CIDR block. You may skip having Oracle allocate the VCN a IPv6
         * /56 CIDR block by setting isOracleGuaAllocationEnabled to {@code false}. For important
         * details about IPv6 addressing in a VCN, see [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIpv6Enabled")
        private Boolean isIpv6Enabled;

        /**
         * Whether IPv6 is enabled for the VCN. Default is {@code false}. If enabled, Oracle will
         * assign the VCN a IPv6 /56 CIDR block. You may skip having Oracle allocate the VCN a IPv6
         * /56 CIDR block by setting isOracleGuaAllocationEnabled to {@code false}. For important
         * details about IPv6 addressing in a VCN, see [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>Example: {@code true}
         *
         * @param isIpv6Enabled the value to set
         * @return this builder
         */
        public Builder isIpv6Enabled(Boolean isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            this.__explicitlySet__.add("isIpv6Enabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVcnDetails build() {
            CreateVcnDetails model =
                    new CreateVcnDetails(
                            this.cidrBlock,
                            this.cidrBlocks,
                            this.compartmentId,
                            this.ipv6PrivateCidrBlocks,
                            this.isOracleGuaAllocationEnabled,
                            this.byoipv6CidrDetails,
                            this.definedTags,
                            this.displayName,
                            this.dnsLabel,
                            this.freeformTags,
                            this.isIpv6Enabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVcnDetails model) {
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("cidrBlocks")) {
                this.cidrBlocks(model.getCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("ipv6PrivateCidrBlocks")) {
                this.ipv6PrivateCidrBlocks(model.getIpv6PrivateCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("isOracleGuaAllocationEnabled")) {
                this.isOracleGuaAllocationEnabled(model.getIsOracleGuaAllocationEnabled());
            }
            if (model.wasPropertyExplicitlySet("byoipv6CidrDetails")) {
                this.byoipv6CidrDetails(model.getByoipv6CidrDetails());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dnsLabel")) {
                this.dnsLabel(model.getDnsLabel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("isIpv6Enabled")) {
                this.isIpv6Enabled(model.getIsIpv6Enabled());
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
     * **Deprecated.** Do *not* set this value. Use {@code cidrBlocks} instead. Example: {@code
     * 10.0.0.0/16}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * **Deprecated.** Do *not* set this value. Use {@code cidrBlocks} instead. Example: {@code
     * 10.0.0.0/16}
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The list of one or more IPv4 CIDR blocks for the VCN that meet the following criteria: - The
     * CIDR blocks must be valid. - They must not overlap with each other or with the on-premises
     * network CIDR block. - The number of CIDR blocks must not exceed the limit of CIDR blocks
     * allowed per VCN.
     *
     * <p>*Important:** Do *not* specify a value for {@code cidrBlock}. Use this parameter instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    private final java.util.List<String> cidrBlocks;

    /**
     * The list of one or more IPv4 CIDR blocks for the VCN that meet the following criteria: - The
     * CIDR blocks must be valid. - They must not overlap with each other or with the on-premises
     * network CIDR block. - The number of CIDR blocks must not exceed the limit of CIDR blocks
     * allowed per VCN.
     *
     * <p>*Important:** Do *not* specify a value for {@code cidrBlock}. Use this parameter instead.
     *
     * @return the value
     */
    public java.util.List<String> getCidrBlocks() {
        return cidrBlocks;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to contain the VCN.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The list of one or more ULA or Private IPv6 CIDR blocks for the vcn that meets the following
     * criteria: - The CIDR blocks must be valid. - Multiple CIDR blocks must not overlap each other
     * or the on-premises network CIDR block. - The number of CIDR blocks must not exceed the limit
     * of IPv6 CIDR blocks allowed to a vcn.
     *
     * <p>*Important:** Do *not* specify a value for {@code ipv6CidrBlock}. Use this parameter
     * instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlocks")
    private final java.util.List<String> ipv6PrivateCidrBlocks;

    /**
     * The list of one or more ULA or Private IPv6 CIDR blocks for the vcn that meets the following
     * criteria: - The CIDR blocks must be valid. - Multiple CIDR blocks must not overlap each other
     * or the on-premises network CIDR block. - The number of CIDR blocks must not exceed the limit
     * of IPv6 CIDR blocks allowed to a vcn.
     *
     * <p>*Important:** Do *not* specify a value for {@code ipv6CidrBlock}. Use this parameter
     * instead.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6PrivateCidrBlocks() {
        return ipv6PrivateCidrBlocks;
    }

    /**
     * Specifies whether to skip Oracle allocated IPv6 GUA. By default, Oracle will allocate one GUA
     * of /56 size for an IPv6 enabled VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOracleGuaAllocationEnabled")
    private final Boolean isOracleGuaAllocationEnabled;

    /**
     * Specifies whether to skip Oracle allocated IPv6 GUA. By default, Oracle will allocate one GUA
     * of /56 size for an IPv6 enabled VCN.
     *
     * @return the value
     */
    public Boolean getIsOracleGuaAllocationEnabled() {
        return isOracleGuaAllocationEnabled;
    }

    /**
     * The list of BYOIPv6 OCIDs and BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6
     * ranges.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrDetails")
    private final java.util.List<Byoipv6CidrDetails> byoipv6CidrDetails;

    /**
     * The list of BYOIPv6 OCIDs and BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6
     * ranges.
     *
     * @return the value
     */
    public java.util.List<Byoipv6CidrDetails> getByoipv6CidrDetails() {
        return byoipv6CidrDetails;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS label
     * to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for example,
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Not required to be unique, but it's a best
     * practice to set unique DNS labels for VCNs in your tenancy. Must be an alphanumeric string
     * that begins with a letter. The value cannot be changed.
     *
     * <p>You must set this value if you want instances to be able to use hostnames to resolve other
     * instances in the VCN. Otherwise the Internet and VCN Resolver will not work.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    private final String dnsLabel;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS label
     * to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for example,
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Not required to be unique, but it's a best
     * practice to set unique DNS labels for VCNs in your tenancy. Must be an alphanumeric string
     * that begins with a letter. The value cannot be changed.
     *
     * <p>You must set this value if you want instances to be able to use hostnames to resolve other
     * instances in the VCN. Otherwise the Internet and VCN Resolver will not work.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1}
     *
     * @return the value
     */
    public String getDnsLabel() {
        return dnsLabel;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Whether IPv6 is enabled for the VCN. Default is {@code false}. If enabled, Oracle will assign
     * the VCN a IPv6 /56 CIDR block. You may skip having Oracle allocate the VCN a IPv6 /56 CIDR
     * block by setting isOracleGuaAllocationEnabled to {@code false}. For important details about
     * IPv6 addressing in a VCN, see [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIpv6Enabled")
    private final Boolean isIpv6Enabled;

    /**
     * Whether IPv6 is enabled for the VCN. Default is {@code false}. If enabled, Oracle will assign
     * the VCN a IPv6 /56 CIDR block. You may skip having Oracle allocate the VCN a IPv6 /56 CIDR
     * block by setting isOracleGuaAllocationEnabled to {@code false}. For important details about
     * IPv6 addressing in a VCN, see [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsIpv6Enabled() {
        return isIpv6Enabled;
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
        sb.append("CreateVcnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", cidrBlocks=").append(String.valueOf(this.cidrBlocks));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", ipv6PrivateCidrBlocks=").append(String.valueOf(this.ipv6PrivateCidrBlocks));
        sb.append(", isOracleGuaAllocationEnabled=")
                .append(String.valueOf(this.isOracleGuaAllocationEnabled));
        sb.append(", byoipv6CidrDetails=").append(String.valueOf(this.byoipv6CidrDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dnsLabel=").append(String.valueOf(this.dnsLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", isIpv6Enabled=").append(String.valueOf(this.isIpv6Enabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVcnDetails)) {
            return false;
        }

        CreateVcnDetails other = (CreateVcnDetails) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.cidrBlocks, other.cidrBlocks)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.ipv6PrivateCidrBlocks, other.ipv6PrivateCidrBlocks)
                && java.util.Objects.equals(
                        this.isOracleGuaAllocationEnabled, other.isOracleGuaAllocationEnabled)
                && java.util.Objects.equals(this.byoipv6CidrDetails, other.byoipv6CidrDetails)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dnsLabel, other.dnsLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.isIpv6Enabled, other.isIpv6Enabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result = (result * PRIME) + (this.cidrBlocks == null ? 43 : this.cidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6PrivateCidrBlocks == null
                                ? 43
                                : this.ipv6PrivateCidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleGuaAllocationEnabled == null
                                ? 43
                                : this.isOracleGuaAllocationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.byoipv6CidrDetails == null
                                ? 43
                                : this.byoipv6CidrDetails.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dnsLabel == null ? 43 : this.dnsLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isIpv6Enabled == null ? 43 : this.isIpv6Enabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
