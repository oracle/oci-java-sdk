/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. Each
 * {@link VirtualCircuit} runs on one or
 * more cross-connects or cross-connect groups. A {@code CrossConnectMappingDetails}
 * contains the properties for an individual cross-connect or cross-connect group
 * associated with a given virtual circuit.
 * <p>
 * The details includes information about the cross-connect or
 * cross-connect group, the VLAN, and the BGP peering session.
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
    builder = CrossConnectMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CrossConnectMappingDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bgpMd5AuthKey",
        "crossConnectOrCrossConnectGroupId",
        "customerBgpPeeringIp",
        "oracleBgpPeeringIp",
        "customerBgpPeeringIpv6",
        "oracleBgpPeeringIpv6",
        "vlan",
        "ipv4BgpStatus",
        "ipv6BgpStatus",
        "ociLogicalDeviceName"
    })
    public CrossConnectMappingDetails(
            String bgpMd5AuthKey,
            String crossConnectOrCrossConnectGroupId,
            String customerBgpPeeringIp,
            String oracleBgpPeeringIp,
            String customerBgpPeeringIpv6,
            String oracleBgpPeeringIpv6,
            Integer vlan,
            Ipv4BgpStatus ipv4BgpStatus,
            Ipv6BgpStatus ipv6BgpStatus,
            String ociLogicalDeviceName) {
        super();
        this.bgpMd5AuthKey = bgpMd5AuthKey;
        this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
        this.customerBgpPeeringIp = customerBgpPeeringIp;
        this.oracleBgpPeeringIp = oracleBgpPeeringIp;
        this.customerBgpPeeringIpv6 = customerBgpPeeringIpv6;
        this.oracleBgpPeeringIpv6 = oracleBgpPeeringIpv6;
        this.vlan = vlan;
        this.ipv4BgpStatus = ipv4BgpStatus;
        this.ipv6BgpStatus = ipv6BgpStatus;
        this.ociLogicalDeviceName = ociLogicalDeviceName;
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
         * provider's edge router. Must use a subnet mask from /28 to /31.
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
         * provider's edge router. Must use a subnet mask from /28 to /31.
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
         * The IPv4 address for Oracle's end of the BGP session. Must use a subnet mask from /28 to /31.
         * If the session goes from Oracle to a customer's edge router,
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
         * The IPv4 address for Oracle's end of the BGP session. Must use a subnet mask from /28 to /31.
         * If the session goes from Oracle to a customer's edge router,
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
        /**
         * The state of the Ipv4 BGP session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4BgpStatus")
        private Ipv4BgpStatus ipv4BgpStatus;

        /**
         * The state of the Ipv4 BGP session.
         * @param ipv4BgpStatus the value to set
         * @return this builder
         **/
        public Builder ipv4BgpStatus(Ipv4BgpStatus ipv4BgpStatus) {
            this.ipv4BgpStatus = ipv4BgpStatus;
            this.__explicitlySet__.add("ipv4BgpStatus");
            return this;
        }
        /**
         * The state of the Ipv6 BGP session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6BgpStatus")
        private Ipv6BgpStatus ipv6BgpStatus;

        /**
         * The state of the Ipv6 BGP session.
         * @param ipv6BgpStatus the value to set
         * @return this builder
         **/
        public Builder ipv6BgpStatus(Ipv6BgpStatus ipv6BgpStatus) {
            this.ipv6BgpStatus = ipv6BgpStatus;
            this.__explicitlySet__.add("ipv6BgpStatus");
            return this;
        }
        /**
         * The FastConnect device that terminates the logical connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
        private String ociLogicalDeviceName;

        /**
         * The FastConnect device that terminates the logical connection.
         *
         * @param ociLogicalDeviceName the value to set
         * @return this builder
         **/
        public Builder ociLogicalDeviceName(String ociLogicalDeviceName) {
            this.ociLogicalDeviceName = ociLogicalDeviceName;
            this.__explicitlySet__.add("ociLogicalDeviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectMappingDetails build() {
            CrossConnectMappingDetails model =
                    new CrossConnectMappingDetails(
                            this.bgpMd5AuthKey,
                            this.crossConnectOrCrossConnectGroupId,
                            this.customerBgpPeeringIp,
                            this.oracleBgpPeeringIp,
                            this.customerBgpPeeringIpv6,
                            this.oracleBgpPeeringIpv6,
                            this.vlan,
                            this.ipv4BgpStatus,
                            this.ipv6BgpStatus,
                            this.ociLogicalDeviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMappingDetails model) {
            if (model.wasPropertyExplicitlySet("bgpMd5AuthKey")) {
                this.bgpMd5AuthKey(model.getBgpMd5AuthKey());
            }
            if (model.wasPropertyExplicitlySet("crossConnectOrCrossConnectGroupId")) {
                this.crossConnectOrCrossConnectGroupId(
                        model.getCrossConnectOrCrossConnectGroupId());
            }
            if (model.wasPropertyExplicitlySet("customerBgpPeeringIp")) {
                this.customerBgpPeeringIp(model.getCustomerBgpPeeringIp());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpPeeringIp")) {
                this.oracleBgpPeeringIp(model.getOracleBgpPeeringIp());
            }
            if (model.wasPropertyExplicitlySet("customerBgpPeeringIpv6")) {
                this.customerBgpPeeringIpv6(model.getCustomerBgpPeeringIpv6());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpPeeringIpv6")) {
                this.oracleBgpPeeringIpv6(model.getOracleBgpPeeringIpv6());
            }
            if (model.wasPropertyExplicitlySet("vlan")) {
                this.vlan(model.getVlan());
            }
            if (model.wasPropertyExplicitlySet("ipv4BgpStatus")) {
                this.ipv4BgpStatus(model.getIpv4BgpStatus());
            }
            if (model.wasPropertyExplicitlySet("ipv6BgpStatus")) {
                this.ipv6BgpStatus(model.getIpv6BgpStatus());
            }
            if (model.wasPropertyExplicitlySet("ociLogicalDeviceName")) {
                this.ociLogicalDeviceName(model.getOciLogicalDeviceName());
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
     * provider's edge router. Must use a subnet mask from /28 to /31.
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
     * provider's edge router. Must use a subnet mask from /28 to /31.
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
     * The IPv4 address for Oracle's end of the BGP session. Must use a subnet mask from /28 to /31.
     * If the session goes from Oracle to a customer's edge router,
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
     * The IPv4 address for Oracle's end of the BGP session. Must use a subnet mask from /28 to /31.
     * If the session goes from Oracle to a customer's edge router,
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

    /**
     * The state of the Ipv4 BGP session.
     **/
    public enum Ipv4BgpStatus {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, Ipv4BgpStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv4BgpStatus v : Ipv4BgpStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        Ipv4BgpStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv4BgpStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Ipv4BgpStatus: " + key);
        }
    };
    /**
     * The state of the Ipv4 BGP session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4BgpStatus")
    private final Ipv4BgpStatus ipv4BgpStatus;

    /**
     * The state of the Ipv4 BGP session.
     * @return the value
     **/
    public Ipv4BgpStatus getIpv4BgpStatus() {
        return ipv4BgpStatus;
    }

    /**
     * The state of the Ipv6 BGP session.
     **/
    public enum Ipv6BgpStatus {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, Ipv6BgpStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv6BgpStatus v : Ipv6BgpStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        Ipv6BgpStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv6BgpStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Ipv6BgpStatus: " + key);
        }
    };
    /**
     * The state of the Ipv6 BGP session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6BgpStatus")
    private final Ipv6BgpStatus ipv6BgpStatus;

    /**
     * The state of the Ipv6 BGP session.
     * @return the value
     **/
    public Ipv6BgpStatus getIpv6BgpStatus() {
        return ipv6BgpStatus;
    }

    /**
     * The FastConnect device that terminates the logical connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociLogicalDeviceName")
    private final String ociLogicalDeviceName;

    /**
     * The FastConnect device that terminates the logical connection.
     *
     * @return the value
     **/
    public String getOciLogicalDeviceName() {
        return ociLogicalDeviceName;
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
        sb.append("CrossConnectMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bgpMd5AuthKey=").append(String.valueOf(this.bgpMd5AuthKey));
        sb.append(", crossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.crossConnectOrCrossConnectGroupId));
        sb.append(", customerBgpPeeringIp=").append(String.valueOf(this.customerBgpPeeringIp));
        sb.append(", oracleBgpPeeringIp=").append(String.valueOf(this.oracleBgpPeeringIp));
        sb.append(", customerBgpPeeringIpv6=").append(String.valueOf(this.customerBgpPeeringIpv6));
        sb.append(", oracleBgpPeeringIpv6=").append(String.valueOf(this.oracleBgpPeeringIpv6));
        sb.append(", vlan=").append(String.valueOf(this.vlan));
        sb.append(", ipv4BgpStatus=").append(String.valueOf(this.ipv4BgpStatus));
        sb.append(", ipv6BgpStatus=").append(String.valueOf(this.ipv6BgpStatus));
        sb.append(", ociLogicalDeviceName=").append(String.valueOf(this.ociLogicalDeviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectMappingDetails)) {
            return false;
        }

        CrossConnectMappingDetails other = (CrossConnectMappingDetails) o;
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
                && java.util.Objects.equals(this.ipv4BgpStatus, other.ipv4BgpStatus)
                && java.util.Objects.equals(this.ipv6BgpStatus, other.ipv6BgpStatus)
                && java.util.Objects.equals(this.ociLogicalDeviceName, other.ociLogicalDeviceName)
                && super.equals(other);
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
                        + (this.ipv4BgpStatus == null ? 43 : this.ipv4BgpStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6BgpStatus == null ? 43 : this.ipv6BgpStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ociLogicalDeviceName == null
                                ? 43
                                : this.ociLogicalDeviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
