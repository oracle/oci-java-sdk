/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. Each
 * {@link VirtualCircuit} runs on one or
 * more cross-connects or cross-connect groups. A {@code CrossConnectMapping}
 * contains the properties for an individual cross-connect or cross-connect group
 * associated with a given virtual circuit.
 * <p>
 * The mapping includes information about the cross-connect or
 * cross-connect group, the VLAN, and the BGP peering session.
 * <p>
 * If you're a customer who is colocated with Oracle, that means you own both
 * the virtual circuit and the physical connection it runs on (cross-connect or
 * cross-connect group), so you specify all the information in the mapping. There's
 * one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
 * addresses.
 * <p>
 * If you're a provider, then you own the physical connection that the customer's
 * virtual circuit runs on, so you contribute information about the cross-connect
 * or cross-connect group and VLAN.
 * <p>
 * Who specifies the BGP peering information in the case of customer connection via
 * provider? If the BGP session goes from Oracle to the provider's edge router, then
 * the provider also specifies the BGP peering information. If the BGP session instead
 * goes from Oracle to the customer's edge router, then the customer specifies the BGP
 * peering information. There's one exception: for a public virtual circuit, Oracle
 * specifies the BGP IPv4 addresses.
 * <p>
 * Every {@code CrossConnectMapping} must have BGP IPv4 peering addresses. BGP IPv6 peering
 * addresses are optional. If BGP IPv6 addresses are provided, the customer can
 * exchange IPv6 routes with Oracle.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrossConnectMapping.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CrossConnectMapping {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bgpMd5AuthKey",
        "crossConnectOrCrossConnectGroupId",
        "customerBgpPeeringIp",
        "oracleBgpPeeringIp",
        "customerBgpPeeringIpv6",
        "oracleBgpPeeringIpv6",
        "vlan"
    })
    public CrossConnectMapping(
            String bgpMd5AuthKey,
            String crossConnectOrCrossConnectGroupId,
            String customerBgpPeeringIp,
            String oracleBgpPeeringIp,
            String customerBgpPeeringIpv6,
            String oracleBgpPeeringIpv6,
            Integer vlan) {
        super();
        this.bgpMd5AuthKey = bgpMd5AuthKey;
        this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
        this.customerBgpPeeringIp = customerBgpPeeringIp;
        this.oracleBgpPeeringIp = oracleBgpPeeringIp;
        this.customerBgpPeeringIpv6 = customerBgpPeeringIpv6;
        this.oracleBgpPeeringIpv6 = oracleBgpPeeringIpv6;
        this.vlan = vlan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key for BGP MD5 authentication. Only applicable if your system
         * requires MD5 authentication. If empty or not set (null), that
         * means you don't use BGP MD5 authentication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
        private String bgpMd5AuthKey;

        /**
         * The key for BGP MD5 authentication. Only applicable if your system
         * requires MD5 authentication. If empty or not set (null), that
         * means you don't use BGP MD5 authentication.
         *
         * @param bgpMd5AuthKey the value to set
         * @return this builder
         **/
        public Builder bgpMd5AuthKey(String bgpMd5AuthKey) {
            this.bgpMd5AuthKey = bgpMd5AuthKey;
            this.__explicitlySet__.add("bgpMd5AuthKey");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect or cross-connect group for this mapping.
         * Specified by the owner of the cross-connect or cross-connect group (the
         * customer if the customer is colocated with Oracle, or the provider if the
         * customer is connecting via provider).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
        private String crossConnectOrCrossConnectGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect or cross-connect group for this mapping.
         * Specified by the owner of the cross-connect or cross-connect group (the
         * customer if the customer is colocated with Oracle, or the provider if the
         * customer is connecting via provider).
         *
         * @param crossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         **/
        public Builder crossConnectOrCrossConnectGroupId(String crossConnectOrCrossConnectGroupId) {
            this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("crossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * The BGP IPv4 address for the router on the other end of the BGP session from
         * Oracle. Specified by the owner of that router. If the session goes from Oracle
         * to a customer, this is the BGP IPv4 address of the customer's edge router. If the
         * session goes from Oracle to a provider, this is the BGP IPv4 address of the
         * provider's edge router. Must use a /30 or /31 subnet mask.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
         * <p>
         * Example: {@code 10.0.0.18/31}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
        private String customerBgpPeeringIp;

        /**
         * The BGP IPv4 address for the router on the other end of the BGP session from
         * Oracle. Specified by the owner of that router. If the session goes from Oracle
         * to a customer, this is the BGP IPv4 address of the customer's edge router. If the
         * session goes from Oracle to a provider, this is the BGP IPv4 address of the
         * provider's edge router. Must use a /30 or /31 subnet mask.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
         * <p>
         * Example: {@code 10.0.0.18/31}
         *
         * @param customerBgpPeeringIp the value to set
         * @return this builder
         **/
        public Builder customerBgpPeeringIp(String customerBgpPeeringIp) {
            this.customerBgpPeeringIp = customerBgpPeeringIp;
            this.__explicitlySet__.add("customerBgpPeeringIp");
            return this;
        }
        /**
         * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31
         * subnet mask. If the session goes from Oracle to a customer's edge router,
         * the customer specifies this information. If the session goes from Oracle to
         * a provider's edge router, the provider specifies this.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
         * <p>
         * Example: {@code 10.0.0.19/31}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
        private String oracleBgpPeeringIp;

        /**
         * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31
         * subnet mask. If the session goes from Oracle to a customer's edge router,
         * the customer specifies this information. If the session goes from Oracle to
         * a provider's edge router, the provider specifies this.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
         * <p>
         * Example: {@code 10.0.0.19/31}
         *
         * @param oracleBgpPeeringIp the value to set
         * @return this builder
         **/
        public Builder oracleBgpPeeringIp(String oracleBgpPeeringIp) {
            this.oracleBgpPeeringIp = oracleBgpPeeringIp;
            this.__explicitlySet__.add("oracleBgpPeeringIp");
            return this;
        }
        /**
         * The BGP IPv6 address for the router on the other end of the BGP session from
         * Oracle. Specified by the owner of that router. If the session goes from Oracle
         * to a customer, this is the BGP IPv6 address of the customer's edge router. If the
         * session goes from Oracle to a provider, this is the BGP IPv6 address of the
         * provider's edge router. Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
         * <p>
         * IPv6 addressing is supported for all commercial and government regions. See
         * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIpv6")
        private String customerBgpPeeringIpv6;

        /**
         * The BGP IPv6 address for the router on the other end of the BGP session from
         * Oracle. Specified by the owner of that router. If the session goes from Oracle
         * to a customer, this is the BGP IPv6 address of the customer's edge router. If the
         * session goes from Oracle to a provider, this is the BGP IPv6 address of the
         * provider's edge router. Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
         * <p>
         * IPv6 addressing is supported for all commercial and government regions. See
         * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         * @param customerBgpPeeringIpv6 the value to set
         * @return this builder
         **/
        public Builder customerBgpPeeringIpv6(String customerBgpPeeringIpv6) {
            this.customerBgpPeeringIpv6 = customerBgpPeeringIpv6;
            this.__explicitlySet__.add("customerBgpPeeringIpv6");
            return this;
        }
        /**
         * The IPv6 address for Oracle's end of the BGP session. Only subnet masks from /64 up to /127 are allowed.
         * If the session goes from Oracle to a customer's edge router,
         * the customer specifies this information. If the session goes from Oracle to
         * a provider's edge router, the provider specifies this.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
         * <p>
         * Note that IPv6 addressing is currently supported only in certain regions. See
         * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:db8::2/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIpv6")
        private String oracleBgpPeeringIpv6;

        /**
         * The IPv6 address for Oracle's end of the BGP session. Only subnet masks from /64 up to /127 are allowed.
         * If the session goes from Oracle to a customer's edge router,
         * the customer specifies this information. If the session goes from Oracle to
         * a provider's edge router, the provider specifies this.
         * <p>
         * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
         * <p>
         * Note that IPv6 addressing is currently supported only in certain regions. See
         * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:db8::2/64}
         *
         * @param oracleBgpPeeringIpv6 the value to set
         * @return this builder
         **/
        public Builder oracleBgpPeeringIpv6(String oracleBgpPeeringIpv6) {
            this.oracleBgpPeeringIpv6 = oracleBgpPeeringIpv6;
            this.__explicitlySet__.add("oracleBgpPeeringIpv6");
            return this;
        }
        /**
         * The number of the specific VLAN (on the cross-connect or cross-connect group)
         * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
         * or cross-connect group (the customer if the customer is colocated with Oracle, or
         * the provider if the customer is connecting via provider).
         * <p>
         * Example: {@code 200}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlan")
        private Integer vlan;

        /**
         * The number of the specific VLAN (on the cross-connect or cross-connect group)
         * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
         * or cross-connect group (the customer if the customer is colocated with Oracle, or
         * the provider if the customer is connecting via provider).
         * <p>
         * Example: {@code 200}
         *
         * @param vlan the value to set
         * @return this builder
         **/
        public Builder vlan(Integer vlan) {
            this.vlan = vlan;
            this.__explicitlySet__.add("vlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectMapping build() {
            CrossConnectMapping __instance__ =
                    new CrossConnectMapping(
                            bgpMd5AuthKey,
                            crossConnectOrCrossConnectGroupId,
                            customerBgpPeeringIp,
                            oracleBgpPeeringIp,
                            customerBgpPeeringIpv6,
                            oracleBgpPeeringIpv6,
                            vlan);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMapping o) {
            Builder copiedBuilder =
                    bgpMd5AuthKey(o.getBgpMd5AuthKey())
                            .crossConnectOrCrossConnectGroupId(
                                    o.getCrossConnectOrCrossConnectGroupId())
                            .customerBgpPeeringIp(o.getCustomerBgpPeeringIp())
                            .oracleBgpPeeringIp(o.getOracleBgpPeeringIp())
                            .customerBgpPeeringIpv6(o.getCustomerBgpPeeringIpv6())
                            .oracleBgpPeeringIpv6(o.getOracleBgpPeeringIpv6())
                            .vlan(o.getVlan());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The key for BGP MD5 authentication. Only applicable if your system
     * requires MD5 authentication. If empty or not set (null), that
     * means you don't use BGP MD5 authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
    private final String bgpMd5AuthKey;

    /**
     * The key for BGP MD5 authentication. Only applicable if your system
     * requires MD5 authentication. If empty or not set (null), that
     * means you don't use BGP MD5 authentication.
     *
     * @return the value
     **/
    public String getBgpMd5AuthKey() {
        return bgpMd5AuthKey;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect or cross-connect group for this mapping.
     * Specified by the owner of the cross-connect or cross-connect group (the
     * customer if the customer is colocated with Oracle, or the provider if the
     * customer is connecting via provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
    private final String crossConnectOrCrossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect or cross-connect group for this mapping.
     * Specified by the owner of the cross-connect or cross-connect group (the
     * customer if the customer is colocated with Oracle, or the provider if the
     * customer is connecting via provider).
     *
     * @return the value
     **/
    public String getCrossConnectOrCrossConnectGroupId() {
        return crossConnectOrCrossConnectGroupId;
    }

    /**
     * The BGP IPv4 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv4 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv4 address of the
     * provider's edge router. Must use a /30 or /31 subnet mask.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.18/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
    private final String customerBgpPeeringIp;

    /**
     * The BGP IPv4 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv4 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv4 address of the
     * provider's edge router. Must use a /30 or /31 subnet mask.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.18/31}
     *
     * @return the value
     **/
    public String getCustomerBgpPeeringIp() {
        return customerBgpPeeringIp;
    }

    /**
     * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31
     * subnet mask. If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.19/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
    private final String oracleBgpPeeringIp;

    /**
     * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31
     * subnet mask. If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.19/31}
     *
     * @return the value
     **/
    public String getOracleBgpPeeringIp() {
        return oracleBgpPeeringIp;
    }

    /**
     * The BGP IPv6 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv6 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv6 address of the
     * provider's edge router. Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * IPv6 addressing is supported for all commercial and government regions. See
     * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIpv6")
    private final String customerBgpPeeringIpv6;

    /**
     * The BGP IPv6 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv6 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv6 address of the
     * provider's edge router. Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * IPv6 addressing is supported for all commercial and government regions. See
     * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     * @return the value
     **/
    public String getCustomerBgpPeeringIpv6() {
        return customerBgpPeeringIpv6;
    }

    /**
     * The IPv6 address for Oracle's end of the BGP session. Only subnet masks from /64 up to /127 are allowed.
     * If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * Note that IPv6 addressing is currently supported only in certain regions. See
     * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:db8::2/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIpv6")
    private final String oracleBgpPeeringIpv6;

    /**
     * The IPv6 address for Oracle's end of the BGP session. Only subnet masks from /64 up to /127 are allowed.
     * If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * Note that IPv6 addressing is currently supported only in certain regions. See
     * [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:db8::2/64}
     *
     * @return the value
     **/
    public String getOracleBgpPeeringIpv6() {
        return oracleBgpPeeringIpv6;
    }

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group)
     * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
     * or cross-connect group (the customer if the customer is colocated with Oracle, or
     * the provider if the customer is connecting via provider).
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlan")
    private final Integer vlan;

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group)
     * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
     * or cross-connect group (the customer if the customer is colocated with Oracle, or
     * the provider if the customer is connecting via provider).
     * <p>
     * Example: {@code 200}
     *
     * @return the value
     **/
    public Integer getVlan() {
        return vlan;
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
        sb.append("CrossConnectMapping(");
        sb.append("bgpMd5AuthKey=").append(String.valueOf(this.bgpMd5AuthKey));
        sb.append(", crossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.crossConnectOrCrossConnectGroupId));
        sb.append(", customerBgpPeeringIp=").append(String.valueOf(this.customerBgpPeeringIp));
        sb.append(", oracleBgpPeeringIp=").append(String.valueOf(this.oracleBgpPeeringIp));
        sb.append(", customerBgpPeeringIpv6=").append(String.valueOf(this.customerBgpPeeringIpv6));
        sb.append(", oracleBgpPeeringIpv6=").append(String.valueOf(this.oracleBgpPeeringIpv6));
        sb.append(", vlan=").append(String.valueOf(this.vlan));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectMapping)) {
            return false;
        }

        CrossConnectMapping other = (CrossConnectMapping) o;
        return java.util.Objects.equals(this.bgpMd5AuthKey, other.bgpMd5AuthKey)
                && java.util.Objects.equals(
                        this.crossConnectOrCrossConnectGroupId,
                        other.crossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.customerBgpPeeringIp, other.customerBgpPeeringIp)
                && java.util.Objects.equals(this.oracleBgpPeeringIp, other.oracleBgpPeeringIp)
                && java.util.Objects.equals(
                        this.customerBgpPeeringIpv6, other.customerBgpPeeringIpv6)
                && java.util.Objects.equals(this.oracleBgpPeeringIpv6, other.oracleBgpPeeringIpv6)
                && java.util.Objects.equals(this.vlan, other.vlan)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bgpMd5AuthKey == null ? 43 : this.bgpMd5AuthKey.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectOrCrossConnectGroupId == null
                                ? 43
                                : this.crossConnectOrCrossConnectGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpPeeringIp == null
                                ? 43
                                : this.customerBgpPeeringIp.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleBgpPeeringIp == null
                                ? 43
                                : this.oracleBgpPeeringIp.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpPeeringIpv6 == null
                                ? 43
                                : this.customerBgpPeeringIpv6.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleBgpPeeringIpv6 == null
                                ? 43
                                : this.oracleBgpPeeringIpv6.hashCode());
        result = (result * PRIME) + (this.vlan == null ? 43 : this.vlan.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
