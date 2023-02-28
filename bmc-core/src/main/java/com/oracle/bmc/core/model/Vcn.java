/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A virtual cloud network (VCN). For more information, see [Overview of the Networking
 * Service](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vcn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Vcn extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "byoipv6CidrBlocks",
        "ipv6PrivateCidrBlocks",
        "cidrBlock",
        "cidrBlocks",
        "compartmentId",
        "defaultDhcpOptionsId",
        "defaultRouteTableId",
        "defaultSecurityListId",
        "definedTags",
        "displayName",
        "dnsLabel",
        "freeformTags",
        "id",
        "ipv6CidrBlocks",
        "lifecycleState",
        "timeCreated",
        "vcnDomainName"
    })
    public Vcn(
            java.util.List<String> byoipv6CidrBlocks,
            java.util.List<String> ipv6PrivateCidrBlocks,
            String cidrBlock,
            java.util.List<String> cidrBlocks,
            String compartmentId,
            String defaultDhcpOptionsId,
            String defaultRouteTableId,
            String defaultSecurityListId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String dnsLabel,
            java.util.Map<String, String> freeformTags,
            String id,
            java.util.List<String> ipv6CidrBlocks,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String vcnDomainName) {
        super();
        this.byoipv6CidrBlocks = byoipv6CidrBlocks;
        this.ipv6PrivateCidrBlocks = ipv6PrivateCidrBlocks;
        this.cidrBlock = cidrBlock;
        this.cidrBlocks = cidrBlocks;
        this.compartmentId = compartmentId;
        this.defaultDhcpOptionsId = defaultDhcpOptionsId;
        this.defaultRouteTableId = defaultRouteTableId;
        this.defaultSecurityListId = defaultSecurityListId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.dnsLabel = dnsLabel;
        this.freeformTags = freeformTags;
        this.id = id;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.vcnDomainName = vcnDomainName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6 ranges. */
        @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrBlocks")
        private java.util.List<String> byoipv6CidrBlocks;

        /**
         * The list of BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6 ranges.
         *
         * @param byoipv6CidrBlocks the value to set
         * @return this builder
         */
        public Builder byoipv6CidrBlocks(java.util.List<String> byoipv6CidrBlocks) {
            this.byoipv6CidrBlocks = byoipv6CidrBlocks;
            this.__explicitlySet__.add("byoipv6CidrBlocks");
            return this;
        }
        /**
         * For an IPv6-enabled VCN, this is the list of Private IPv6 CIDR blocks for the VCN's IP
         * address space.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlocks")
        private java.util.List<String> ipv6PrivateCidrBlocks;

        /**
         * For an IPv6-enabled VCN, this is the list of Private IPv6 CIDR blocks for the VCN's IP
         * address space.
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
         * Deprecated. The first CIDR IP address from cidrBlocks.
         *
         * <p>Example: {@code 172.16.0.0/16}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * Deprecated. The first CIDR IP address from cidrBlocks.
         *
         * <p>Example: {@code 172.16.0.0/16}
         *
         * @param cidrBlock the value to set
         * @return this builder
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /** The list of IPv4 CIDR blocks the VCN will use. */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        /**
         * The list of IPv4 CIDR blocks the VCN will use.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the VCN.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default set of DHCP options.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultDhcpOptionsId")
        private String defaultDhcpOptionsId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default set of DHCP options.
         *
         * @param defaultDhcpOptionsId the value to set
         * @return this builder
         */
        public Builder defaultDhcpOptionsId(String defaultDhcpOptionsId) {
            this.defaultDhcpOptionsId = defaultDhcpOptionsId;
            this.__explicitlySet__.add("defaultDhcpOptionsId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default route table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultRouteTableId")
        private String defaultRouteTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default route table.
         *
         * @param defaultRouteTableId the value to set
         * @return this builder
         */
        public Builder defaultRouteTableId(String defaultRouteTableId) {
            this.defaultRouteTableId = defaultRouteTableId;
            this.__explicitlySet__.add("defaultRouteTableId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default security list.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultSecurityListId")
        private String defaultSecurityListId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the VCN's default security list.
         *
         * @param defaultSecurityListId the value to set
         * @return this builder
         */
        public Builder defaultSecurityListId(String defaultSecurityListId) {
            this.defaultSecurityListId = defaultSecurityListId;
            this.__explicitlySet__.add("defaultSecurityListId");
            return this;
        }
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
         * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS
         * label to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for
         * example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be an alphanumeric
         * string that begins with a letter. The value cannot be changed.
         *
         * <p>The absence of this parameter means the Internet and VCN Resolver will not work for
         * this VCN.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code vcn1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        /**
         * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS
         * label to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for
         * example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be an alphanumeric
         * string that begins with a letter. The value cannot be changed.
         *
         * <p>The absence of this parameter means the Internet and VCN Resolver will not work for
         * this VCN.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
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
         * The VCN's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The VCN's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
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
         * For an IPv6-enabled VCN, this is the list of IPv6 CIDR blocks for the VCN's IP address
         * space. The CIDRs are provided by Oracle and the sizes are always /56.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
        private java.util.List<String> ipv6CidrBlocks;

        /**
         * For an IPv6-enabled VCN, this is the list of IPv6 CIDR blocks for the VCN's IP address
         * space. The CIDRs are provided by Oracle and the sizes are always /56.
         *
         * @param ipv6CidrBlocks the value to set
         * @return this builder
         */
        public Builder ipv6CidrBlocks(java.util.List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.__explicitlySet__.add("ipv6CidrBlocks");
            return this;
        }
        /** The VCN's current state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The VCN's current state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the VCN was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the VCN was created, in the format defined by
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
         * The VCN's domain name, which consists of the VCN's DNS label, and the {@code
         * oraclevcn.com} domain.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code vcn1.oraclevcn.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnDomainName")
        private String vcnDomainName;

        /**
         * The VCN's domain name, which consists of the VCN's DNS label, and the {@code
         * oraclevcn.com} domain.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>Example: {@code vcn1.oraclevcn.com}
         *
         * @param vcnDomainName the value to set
         * @return this builder
         */
        public Builder vcnDomainName(String vcnDomainName) {
            this.vcnDomainName = vcnDomainName;
            this.__explicitlySet__.add("vcnDomainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vcn build() {
            Vcn model =
                    new Vcn(
                            this.byoipv6CidrBlocks,
                            this.ipv6PrivateCidrBlocks,
                            this.cidrBlock,
                            this.cidrBlocks,
                            this.compartmentId,
                            this.defaultDhcpOptionsId,
                            this.defaultRouteTableId,
                            this.defaultSecurityListId,
                            this.definedTags,
                            this.displayName,
                            this.dnsLabel,
                            this.freeformTags,
                            this.id,
                            this.ipv6CidrBlocks,
                            this.lifecycleState,
                            this.timeCreated,
                            this.vcnDomainName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vcn model) {
            if (model.wasPropertyExplicitlySet("byoipv6CidrBlocks")) {
                this.byoipv6CidrBlocks(model.getByoipv6CidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("ipv6PrivateCidrBlocks")) {
                this.ipv6PrivateCidrBlocks(model.getIpv6PrivateCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("cidrBlocks")) {
                this.cidrBlocks(model.getCidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("defaultDhcpOptionsId")) {
                this.defaultDhcpOptionsId(model.getDefaultDhcpOptionsId());
            }
            if (model.wasPropertyExplicitlySet("defaultRouteTableId")) {
                this.defaultRouteTableId(model.getDefaultRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("defaultSecurityListId")) {
                this.defaultSecurityListId(model.getDefaultSecurityListId());
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
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlocks")) {
                this.ipv6CidrBlocks(model.getIpv6CidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vcnDomainName")) {
                this.vcnDomainName(model.getVcnDomainName());
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

    /** The list of BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6 ranges. */
    @com.fasterxml.jackson.annotation.JsonProperty("byoipv6CidrBlocks")
    private final java.util.List<String> byoipv6CidrBlocks;

    /**
     * The list of BYOIPv6 CIDR blocks required to create a VCN that uses BYOIPv6 ranges.
     *
     * @return the value
     */
    public java.util.List<String> getByoipv6CidrBlocks() {
        return byoipv6CidrBlocks;
    }

    /**
     * For an IPv6-enabled VCN, this is the list of Private IPv6 CIDR blocks for the VCN's IP
     * address space.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PrivateCidrBlocks")
    private final java.util.List<String> ipv6PrivateCidrBlocks;

    /**
     * For an IPv6-enabled VCN, this is the list of Private IPv6 CIDR blocks for the VCN's IP
     * address space.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6PrivateCidrBlocks() {
        return ipv6PrivateCidrBlocks;
    }

    /**
     * Deprecated. The first CIDR IP address from cidrBlocks.
     *
     * <p>Example: {@code 172.16.0.0/16}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * Deprecated. The first CIDR IP address from cidrBlocks.
     *
     * <p>Example: {@code 172.16.0.0/16}
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /** The list of IPv4 CIDR blocks the VCN will use. */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    private final java.util.List<String> cidrBlocks;

    /**
     * The list of IPv4 CIDR blocks the VCN will use.
     *
     * @return the value
     */
    public java.util.List<String> getCidrBlocks() {
        return cidrBlocks;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the VCN.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default set of DHCP options.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultDhcpOptionsId")
    private final String defaultDhcpOptionsId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default set of DHCP options.
     *
     * @return the value
     */
    public String getDefaultDhcpOptionsId() {
        return defaultDhcpOptionsId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default route table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRouteTableId")
    private final String defaultRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default route table.
     *
     * @return the value
     */
    public String getDefaultRouteTableId() {
        return defaultRouteTableId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default security list.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSecurityListId")
    private final String defaultSecurityListId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the VCN's default security list.
     *
     * @return the value
     */
    public String getDefaultSecurityListId() {
        return defaultSecurityListId;
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
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS label
     * to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for example,
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be an alphanumeric string that begins
     * with a letter. The value cannot be changed.
     *
     * <p>The absence of this parameter means the Internet and VCN Resolver will not work for this
     * VCN.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    private final String dnsLabel;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and subnet's DNS label
     * to form a fully qualified domain name (FQDN) for each VNIC within this subnet (for example,
     * {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be an alphanumeric string that begins
     * with a letter. The value cannot be changed.
     *
     * <p>The absence of this parameter means the Internet and VCN Resolver will not work for this
     * VCN.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1}
     *
     * @return the value
     */
    public String getDnsLabel() {
        return dnsLabel;
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
     * The VCN's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The VCN's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * For an IPv6-enabled VCN, this is the list of IPv6 CIDR blocks for the VCN's IP address space.
     * The CIDRs are provided by Oracle and the sizes are always /56.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
    private final java.util.List<String> ipv6CidrBlocks;

    /**
     * For an IPv6-enabled VCN, this is the list of IPv6 CIDR blocks for the VCN's IP address space.
     * The CIDRs are provided by Oracle and the sizes are always /56.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6CidrBlocks() {
        return ipv6CidrBlocks;
    }

    /** The VCN's current state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The VCN's current state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The VCN's current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the VCN was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the VCN was created, in the format defined by
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
     * The VCN's domain name, which consists of the VCN's DNS label, and the {@code oraclevcn.com}
     * domain.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1.oraclevcn.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnDomainName")
    private final String vcnDomainName;

    /**
     * The VCN's domain name, which consists of the VCN's DNS label, and the {@code oraclevcn.com}
     * domain.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>Example: {@code vcn1.oraclevcn.com}
     *
     * @return the value
     */
    public String getVcnDomainName() {
        return vcnDomainName;
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
        sb.append("Vcn(");
        sb.append("super=").append(super.toString());
        sb.append("byoipv6CidrBlocks=").append(String.valueOf(this.byoipv6CidrBlocks));
        sb.append(", ipv6PrivateCidrBlocks=").append(String.valueOf(this.ipv6PrivateCidrBlocks));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", cidrBlocks=").append(String.valueOf(this.cidrBlocks));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", defaultDhcpOptionsId=").append(String.valueOf(this.defaultDhcpOptionsId));
        sb.append(", defaultRouteTableId=").append(String.valueOf(this.defaultRouteTableId));
        sb.append(", defaultSecurityListId=").append(String.valueOf(this.defaultSecurityListId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dnsLabel=").append(String.valueOf(this.dnsLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", ipv6CidrBlocks=").append(String.valueOf(this.ipv6CidrBlocks));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vcnDomainName=").append(String.valueOf(this.vcnDomainName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vcn)) {
            return false;
        }

        Vcn other = (Vcn) o;
        return java.util.Objects.equals(this.byoipv6CidrBlocks, other.byoipv6CidrBlocks)
                && java.util.Objects.equals(this.ipv6PrivateCidrBlocks, other.ipv6PrivateCidrBlocks)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.cidrBlocks, other.cidrBlocks)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.defaultDhcpOptionsId, other.defaultDhcpOptionsId)
                && java.util.Objects.equals(this.defaultRouteTableId, other.defaultRouteTableId)
                && java.util.Objects.equals(this.defaultSecurityListId, other.defaultSecurityListId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dnsLabel, other.dnsLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipv6CidrBlocks, other.ipv6CidrBlocks)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vcnDomainName, other.vcnDomainName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.byoipv6CidrBlocks == null ? 43 : this.byoipv6CidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6PrivateCidrBlocks == null
                                ? 43
                                : this.ipv6PrivateCidrBlocks.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result = (result * PRIME) + (this.cidrBlocks == null ? 43 : this.cidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultDhcpOptionsId == null
                                ? 43
                                : this.defaultDhcpOptionsId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultRouteTableId == null
                                ? 43
                                : this.defaultRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultSecurityListId == null
                                ? 43
                                : this.defaultSecurityListId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dnsLabel == null ? 43 : this.dnsLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlocks == null ? 43 : this.ipv6CidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.vcnDomainName == null ? 43 : this.vcnDomainName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
