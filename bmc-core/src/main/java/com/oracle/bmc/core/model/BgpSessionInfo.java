/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information for establishing a BGP session for the IPSec tunnel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BgpSessionInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BgpSessionInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oracleInterfaceIp",
        "customerInterfaceIp",
        "oracleInterfaceIpv6",
        "customerInterfaceIpv6",
        "oracleBgpAsn",
        "customerBgpAsn",
        "bgpState",
        "bgpIpv6State"
    })
    public BgpSessionInfo(
            String oracleInterfaceIp,
            String customerInterfaceIp,
            String oracleInterfaceIpv6,
            String customerInterfaceIpv6,
            String oracleBgpAsn,
            String customerBgpAsn,
            BgpState bgpState,
            BgpIpv6State bgpIpv6State) {
        super();
        this.oracleInterfaceIp = oracleInterfaceIp;
        this.customerInterfaceIp = customerInterfaceIp;
        this.oracleInterfaceIpv6 = oracleInterfaceIpv6;
        this.customerInterfaceIpv6 = customerInterfaceIpv6;
        this.oracleBgpAsn = oracleBgpAsn;
        this.customerBgpAsn = customerBgpAsn;
        this.bgpState = bgpState;
        this.bgpIpv6State = bgpIpv6State;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP address for the Oracle end of the inside tunnel interface.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is required and used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
         * address so you can troubleshoot or monitor the tunnel.
         * <p>
         * The value must be a /30 or /31.
         * <p>
         * Example: {@code 10.0.0.4/31}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
        private String oracleInterfaceIp;

        /**
         * The IP address for the Oracle end of the inside tunnel interface.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is required and used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
         * address so you can troubleshoot or monitor the tunnel.
         * <p>
         * The value must be a /30 or /31.
         * <p>
         * Example: {@code 10.0.0.4/31}
         *
         * @param oracleInterfaceIp the value to set
         * @return this builder
         **/
        public Builder oracleInterfaceIp(String oracleInterfaceIp) {
            this.oracleInterfaceIp = oracleInterfaceIp;
            this.__explicitlySet__.add("oracleInterfaceIp");
            return this;
        }
        /**
         * The IP address for the CPE end of the inside tunnel interface.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is required and used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
         * address so you can troubleshoot or monitor the tunnel.
         * <p>
         * The value must be a /30 or /31.
         * <p>
         * Example: {@code 10.0.0.5/31}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
        private String customerInterfaceIp;

        /**
         * The IP address for the CPE end of the inside tunnel interface.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is required and used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
         * address so you can troubleshoot or monitor the tunnel.
         * <p>
         * The value must be a /30 or /31.
         * <p>
         * Example: {@code 10.0.0.5/31}
         *
         * @param customerInterfaceIp the value to set
         * @return this builder
         **/
        public Builder customerInterfaceIp(String customerInterfaceIp) {
            this.customerInterfaceIp = customerInterfaceIp;
            this.__explicitlySet__.add("customerInterfaceIp");
            return this;
        }
        /**
         * The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, you can set this IP
         * address to troubleshoot or monitor the tunnel.
         * <p>
         * Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIpv6")
        private String oracleInterfaceIpv6;

        /**
         * The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, you can set this IP
         * address to troubleshoot or monitor the tunnel.
         * <p>
         * Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         * @param oracleInterfaceIpv6 the value to set
         * @return this builder
         **/
        public Builder oracleInterfaceIpv6(String oracleInterfaceIpv6) {
            this.oracleInterfaceIpv6 = oracleInterfaceIpv6;
            this.__explicitlySet__.add("oracleInterfaceIpv6");
            return this;
        }
        /**
         * The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, you can set this IP
         * address to troubleshoot or monitor the tunnel.
         * <p>
         * Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIpv6")
        private String customerInterfaceIpv6;

        /**
         * The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
         * <p>
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this IP address
         * is used for the tunnel's BGP session.
         * <p>
         * If {@code routing} is instead set to {@code STATIC}, you can set this IP
         * address to troubleshoot or monitor the tunnel.
         * <p>
         * Only subnet masks from /64 up to /127 are allowed.
         * <p>
         * Example: {@code 2001:db8::1/64}
         *
         * @param customerInterfaceIpv6 the value to set
         * @return this builder
         **/
        public Builder customerInterfaceIpv6(String customerInterfaceIpv6) {
            this.customerInterfaceIpv6 = customerInterfaceIpv6;
            this.__explicitlySet__.add("customerInterfaceIpv6");
            return this;
        }
        /**
         * The Oracle BGP ASN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
        private String oracleBgpAsn;

        /**
         * The Oracle BGP ASN.
         *
         * @param oracleBgpAsn the value to set
         * @return this builder
         **/
        public Builder oracleBgpAsn(String oracleBgpAsn) {
            this.oracleBgpAsn = oracleBgpAsn;
            this.__explicitlySet__.add("oracleBgpAsn");
            return this;
        }
        /**
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this ASN
         * is required and used for the tunnel's BGP session. This is the ASN of the network on the
         * CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
         * <p>
         * If the tunnel uses static routing, the {@code customerBgpAsn} must be null.
         * <p>
         * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private String customerBgpAsn;

        /**
         * If the tunnel's {@code routing} attribute is set to {@code BGP}
         * (see {@link IPSecConnectionTunnel}), this ASN
         * is required and used for the tunnel's BGP session. This is the ASN of the network on the
         * CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
         * <p>
         * If the tunnel uses static routing, the {@code customerBgpAsn} must be null.
         * <p>
         * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
         *
         * @param customerBgpAsn the value to set
         * @return this builder
         **/
        public Builder customerBgpAsn(String customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }
        /**
         * The state of the BGP session.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bgpState")
        private BgpState bgpState;

        /**
         * The state of the BGP session.
         *
         * @param bgpState the value to set
         * @return this builder
         **/
        public Builder bgpState(BgpState bgpState) {
            this.bgpState = bgpState;
            this.__explicitlySet__.add("bgpState");
            return this;
        }
        /**
         * The state of the BGP IPv6 session.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bgpIpv6State")
        private BgpIpv6State bgpIpv6State;

        /**
         * The state of the BGP IPv6 session.
         *
         * @param bgpIpv6State the value to set
         * @return this builder
         **/
        public Builder bgpIpv6State(BgpIpv6State bgpIpv6State) {
            this.bgpIpv6State = bgpIpv6State;
            this.__explicitlySet__.add("bgpIpv6State");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BgpSessionInfo build() {
            BgpSessionInfo model =
                    new BgpSessionInfo(
                            this.oracleInterfaceIp,
                            this.customerInterfaceIp,
                            this.oracleInterfaceIpv6,
                            this.customerInterfaceIpv6,
                            this.oracleBgpAsn,
                            this.customerBgpAsn,
                            this.bgpState,
                            this.bgpIpv6State);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BgpSessionInfo model) {
            if (model.wasPropertyExplicitlySet("oracleInterfaceIp")) {
                this.oracleInterfaceIp(model.getOracleInterfaceIp());
            }
            if (model.wasPropertyExplicitlySet("customerInterfaceIp")) {
                this.customerInterfaceIp(model.getCustomerInterfaceIp());
            }
            if (model.wasPropertyExplicitlySet("oracleInterfaceIpv6")) {
                this.oracleInterfaceIpv6(model.getOracleInterfaceIpv6());
            }
            if (model.wasPropertyExplicitlySet("customerInterfaceIpv6")) {
                this.customerInterfaceIpv6(model.getCustomerInterfaceIpv6());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpAsn")) {
                this.oracleBgpAsn(model.getOracleBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("customerBgpAsn")) {
                this.customerBgpAsn(model.getCustomerBgpAsn());
            }
            if (model.wasPropertyExplicitlySet("bgpState")) {
                this.bgpState(model.getBgpState());
            }
            if (model.wasPropertyExplicitlySet("bgpIpv6State")) {
                this.bgpIpv6State(model.getBgpIpv6State());
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
     * The IP address for the Oracle end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: {@code 10.0.0.4/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
    private final String oracleInterfaceIp;

    /**
     * The IP address for the Oracle end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: {@code 10.0.0.4/31}
     *
     * @return the value
     **/
    public String getOracleInterfaceIp() {
        return oracleInterfaceIp;
    }

    /**
     * The IP address for the CPE end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: {@code 10.0.0.5/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
    private final String customerInterfaceIp;

    /**
     * The IP address for the CPE end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: {@code 10.0.0.5/31}
     *
     * @return the value
     **/
    public String getCustomerInterfaceIp() {
        return customerInterfaceIp;
    }

    /**
     * The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIpv6")
    private final String oracleInterfaceIpv6;

    /**
     * The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     * @return the value
     **/
    public String getOracleInterfaceIpv6() {
        return oracleInterfaceIpv6;
    }

    /**
     * The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIpv6")
    private final String customerInterfaceIpv6;

    /**
     * The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     * @return the value
     **/
    public String getCustomerInterfaceIpv6() {
        return customerInterfaceIpv6;
    }

    /**
     * The Oracle BGP ASN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
    private final String oracleBgpAsn;

    /**
     * The Oracle BGP ASN.
     *
     * @return the value
     **/
    public String getOracleBgpAsn() {
        return oracleBgpAsn;
    }

    /**
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this ASN
     * is required and used for the tunnel's BGP session. This is the ASN of the network on the
     * CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     * <p>
     * If the tunnel uses static routing, the {@code customerBgpAsn} must be null.
     * <p>
     * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    private final String customerBgpAsn;

    /**
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this ASN
     * is required and used for the tunnel's BGP session. This is the ASN of the network on the
     * CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses "asplain" format.
     * <p>
     * If the tunnel uses static routing, the {@code customerBgpAsn} must be null.
     * <p>
     * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
     *
     * @return the value
     **/
    public String getCustomerBgpAsn() {
        return customerBgpAsn;
    }

    /**
     * The state of the BGP session.
     *
     **/
    public enum BgpState {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpState.class);

        private final String value;
        private static java.util.Map<String, BgpState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpState v : BgpState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the BGP session.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpState")
    private final BgpState bgpState;

    /**
     * The state of the BGP session.
     *
     * @return the value
     **/
    public BgpState getBgpState() {
        return bgpState;
    }

    /**
     * The state of the BGP IPv6 session.
     *
     **/
    public enum BgpIpv6State {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpIpv6State.class);

        private final String value;
        private static java.util.Map<String, BgpIpv6State> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpIpv6State v : BgpIpv6State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpIpv6State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpIpv6State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpIpv6State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the BGP IPv6 session.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpIpv6State")
    private final BgpIpv6State bgpIpv6State;

    /**
     * The state of the BGP IPv6 session.
     *
     * @return the value
     **/
    public BgpIpv6State getBgpIpv6State() {
        return bgpIpv6State;
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
        sb.append("BgpSessionInfo(");
        sb.append("super=").append(super.toString());
        sb.append("oracleInterfaceIp=").append(String.valueOf(this.oracleInterfaceIp));
        sb.append(", customerInterfaceIp=").append(String.valueOf(this.customerInterfaceIp));
        sb.append(", oracleInterfaceIpv6=").append(String.valueOf(this.oracleInterfaceIpv6));
        sb.append(", customerInterfaceIpv6=").append(String.valueOf(this.customerInterfaceIpv6));
        sb.append(", oracleBgpAsn=").append(String.valueOf(this.oracleBgpAsn));
        sb.append(", customerBgpAsn=").append(String.valueOf(this.customerBgpAsn));
        sb.append(", bgpState=").append(String.valueOf(this.bgpState));
        sb.append(", bgpIpv6State=").append(String.valueOf(this.bgpIpv6State));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BgpSessionInfo)) {
            return false;
        }

        BgpSessionInfo other = (BgpSessionInfo) o;
        return java.util.Objects.equals(this.oracleInterfaceIp, other.oracleInterfaceIp)
                && java.util.Objects.equals(this.customerInterfaceIp, other.customerInterfaceIp)
                && java.util.Objects.equals(this.oracleInterfaceIpv6, other.oracleInterfaceIpv6)
                && java.util.Objects.equals(this.customerInterfaceIpv6, other.customerInterfaceIpv6)
                && java.util.Objects.equals(this.oracleBgpAsn, other.oracleBgpAsn)
                && java.util.Objects.equals(this.customerBgpAsn, other.customerBgpAsn)
                && java.util.Objects.equals(this.bgpState, other.bgpState)
                && java.util.Objects.equals(this.bgpIpv6State, other.bgpIpv6State)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.oracleInterfaceIp == null ? 43 : this.oracleInterfaceIp.hashCode());
        result =
                (result * PRIME)
                        + (this.customerInterfaceIp == null
                                ? 43
                                : this.customerInterfaceIp.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleInterfaceIpv6 == null
                                ? 43
                                : this.oracleInterfaceIpv6.hashCode());
        result =
                (result * PRIME)
                        + (this.customerInterfaceIpv6 == null
                                ? 43
                                : this.customerInterfaceIpv6.hashCode());
        result = (result * PRIME) + (this.oracleBgpAsn == null ? 43 : this.oracleBgpAsn.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpAsn == null ? 43 : this.customerBgpAsn.hashCode());
        result = (result * PRIME) + (this.bgpState == null ? 43 : this.bgpState.hashCode());
        result = (result * PRIME) + (this.bgpIpv6State == null ? 43 : this.bgpIpv6State.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
