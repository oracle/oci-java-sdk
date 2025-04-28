/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A rule for allowing outbound IP packets. <br>
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
        builder = EgressSecurityRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EgressSecurityRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "destination",
        "destinationType",
        "icmpOptions",
        "isStateless",
        "protocol",
        "tcpOptions",
        "udpOptions",
        "description"
    })
    public EgressSecurityRule(
            String destination,
            DestinationType destinationType,
            IcmpOptions icmpOptions,
            Boolean isStateless,
            String protocol,
            TcpOptions tcpOptions,
            UdpOptions udpOptions,
            String description) {
        super();
        this.destination = destination;
        this.destinationType = destinationType;
        this.icmpOptions = icmpOptions;
        this.isStateless = isStateless;
        this.protocol = protocol;
        this.tcpOptions = tcpOptions;
        this.udpOptions = udpOptions;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Conceptually, this is the range of IP addresses that a packet originating from the
         * instance can go to.
         *
         * <p>Allowed values:
         *
         * <p>IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} Note that IPv6 addressing is currently supported only in certain
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * list rule for traffic destined for a particular {@code Service} through a service
         * gateway. For example: {@code oci-phx-objectstorage}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * Conceptually, this is the range of IP addresses that a packet originating from the
         * instance can go to.
         *
         * <p>Allowed values:
         *
         * <p>IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} Note that IPv6 addressing is currently supported only in certain
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * list rule for traffic destined for a particular {@code Service} through a service
         * gateway. For example: {@code oci-phx-objectstorage}.
         *
         * @param destination the value to set
         * @return this builder
         */
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * Type of destination for the rule. The default is {@code CIDR_BLOCK}.
         *
         * <p>Allowed values:
         *
         * <p>{@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR
         * notation.
         *
         * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock}
         * value for a {@link Service} (the rule is for traffic destined for a particular {@code
         * Service} through a service gateway).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        /**
         * Type of destination for the rule. The default is {@code CIDR_BLOCK}.
         *
         * <p>Allowed values:
         *
         * <p>{@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR
         * notation.
         *
         * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock}
         * value for a {@link Service} (the rule is for traffic destined for a particular {@code
         * Service} through a service gateway).
         *
         * @param destinationType the value to set
         * @return this builder
         */
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
        private IcmpOptions icmpOptions;

        public Builder icmpOptions(IcmpOptions icmpOptions) {
            this.icmpOptions = icmpOptions;
            this.__explicitlySet__.add("icmpOptions");
            return this;
        }
        /**
         * A stateless rule allows traffic in one direction. Remember to add a corresponding
         * stateless rule in the other direction if you need to support bidirectional traffic. For
         * example, if egress traffic allows TCP destination port 80, there should be an ingress
         * rule to allow TCP source port 80. Defaults to false, which means the rule is stateful and
         * a corresponding rule is not necessary for bidirectional traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
        private Boolean isStateless;

        /**
         * A stateless rule allows traffic in one direction. Remember to add a corresponding
         * stateless rule in the other direction if you need to support bidirectional traffic. For
         * example, if egress traffic allows TCP destination port 80, there should be an ingress
         * rule to allow TCP source port 80. Defaults to false, which means the rule is stateful and
         * a corresponding rule is not necessary for bidirectional traffic.
         *
         * @param isStateless the value to set
         * @return this builder
         */
        public Builder isStateless(Boolean isStateless) {
            this.isStateless = isStateless;
            this.__explicitlySet__.add("isStateless");
            return this;
        }
        /**
         * The transport protocol. Specify either {@code all} or an IPv4 protocol number as defined
         * in [Protocol
         * Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
         * Options are supported only for ICMP ("1"), TCP ("6"), UDP ("17"), and ICMPv6 ("58").
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The transport protocol. Specify either {@code all} or an IPv4 protocol number as defined
         * in [Protocol
         * Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
         * Options are supported only for ICMP ("1"), TCP ("6"), UDP ("17"), and ICMPv6 ("58").
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        public Builder tcpOptions(TcpOptions tcpOptions) {
            this.tcpOptions = tcpOptions;
            this.__explicitlySet__.add("tcpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public Builder udpOptions(UdpOptions udpOptions) {
            this.udpOptions = udpOptions;
            this.__explicitlySet__.add("udpOptions");
            return this;
        }
        /** An optional description of your choice for the rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of your choice for the rule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EgressSecurityRule build() {
            EgressSecurityRule model =
                    new EgressSecurityRule(
                            this.destination,
                            this.destinationType,
                            this.icmpOptions,
                            this.isStateless,
                            this.protocol,
                            this.tcpOptions,
                            this.udpOptions,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EgressSecurityRule model) {
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("destinationType")) {
                this.destinationType(model.getDestinationType());
            }
            if (model.wasPropertyExplicitlySet("icmpOptions")) {
                this.icmpOptions(model.getIcmpOptions());
            }
            if (model.wasPropertyExplicitlySet("isStateless")) {
                this.isStateless(model.getIsStateless());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("tcpOptions")) {
                this.tcpOptions(model.getTcpOptions());
            }
            if (model.wasPropertyExplicitlySet("udpOptions")) {
                this.udpOptions(model.getUdpOptions());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * Conceptually, this is the range of IP addresses that a packet originating from the instance
     * can go to.
     *
     * <p>Allowed values:
     *
     * <p>IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} Note that IPv6 addressing is currently supported only in certain
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security list
     * rule for traffic destined for a particular {@code Service} through a service gateway. For
     * example: {@code oci-phx-objectstorage}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * Conceptually, this is the range of IP addresses that a packet originating from the instance
     * can go to.
     *
     * <p>Allowed values:
     *
     * <p>IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} Note that IPv6 addressing is currently supported only in certain
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security list
     * rule for traffic destined for a particular {@code Service} through a service gateway. For
     * example: {@code oci-phx-objectstorage}.
     *
     * @return the value
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Type of destination for the rule. The default is {@code CIDR_BLOCK}.
     *
     * <p>Allowed values:
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR
     * notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock}
     * value for a {@link Service} (the rule is for traffic destined for a particular {@code
     * Service} through a service gateway).
     */
    public enum DestinationType implements com.oracle.bmc.http.internal.BmcEnum {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DestinationType.class);

        private final String value;
        private static java.util.Map<String, DestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (DestinationType v : DestinationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DestinationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of destination for the rule. The default is {@code CIDR_BLOCK}.
     *
     * <p>Allowed values:
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR
     * notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock}
     * value for a {@link Service} (the rule is for traffic destined for a particular {@code
     * Service} through a service gateway).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final DestinationType destinationType;

    /**
     * Type of destination for the rule. The default is {@code CIDR_BLOCK}.
     *
     * <p>Allowed values:
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR
     * notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock}
     * value for a {@link Service} (the rule is for traffic destined for a particular {@code
     * Service} through a service gateway).
     *
     * @return the value
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    private final IcmpOptions icmpOptions;

    public IcmpOptions getIcmpOptions() {
        return icmpOptions;
    }

    /**
     * A stateless rule allows traffic in one direction. Remember to add a corresponding stateless
     * rule in the other direction if you need to support bidirectional traffic. For example, if
     * egress traffic allows TCP destination port 80, there should be an ingress rule to allow TCP
     * source port 80. Defaults to false, which means the rule is stateful and a corresponding rule
     * is not necessary for bidirectional traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
    private final Boolean isStateless;

    /**
     * A stateless rule allows traffic in one direction. Remember to add a corresponding stateless
     * rule in the other direction if you need to support bidirectional traffic. For example, if
     * egress traffic allows TCP destination port 80, there should be an ingress rule to allow TCP
     * source port 80. Defaults to false, which means the rule is stateful and a corresponding rule
     * is not necessary for bidirectional traffic.
     *
     * @return the value
     */
    public Boolean getIsStateless() {
        return isStateless;
    }

    /**
     * The transport protocol. Specify either {@code all} or an IPv4 protocol number as defined in
     * [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * Options are supported only for ICMP ("1"), TCP ("6"), UDP ("17"), and ICMPv6 ("58").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The transport protocol. Specify either {@code all} or an IPv4 protocol number as defined in
     * [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * Options are supported only for ICMP ("1"), TCP ("6"), UDP ("17"), and ICMPv6 ("58").
     *
     * @return the value
     */
    public String getProtocol() {
        return protocol;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    private final TcpOptions tcpOptions;

    public TcpOptions getTcpOptions() {
        return tcpOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    private final UdpOptions udpOptions;

    public UdpOptions getUdpOptions() {
        return udpOptions;
    }

    /** An optional description of your choice for the rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of your choice for the rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("EgressSecurityRule(");
        sb.append("super=").append(super.toString());
        sb.append("destination=").append(String.valueOf(this.destination));
        sb.append(", destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", icmpOptions=").append(String.valueOf(this.icmpOptions));
        sb.append(", isStateless=").append(String.valueOf(this.isStateless));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", tcpOptions=").append(String.valueOf(this.tcpOptions));
        sb.append(", udpOptions=").append(String.valueOf(this.udpOptions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EgressSecurityRule)) {
            return false;
        }

        EgressSecurityRule other = (EgressSecurityRule) o;
        return java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(this.icmpOptions, other.icmpOptions)
                && java.util.Objects.equals(this.isStateless, other.isStateless)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.tcpOptions, other.tcpOptions)
                && java.util.Objects.equals(this.udpOptions, other.udpOptions)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result = (result * PRIME) + (this.icmpOptions == null ? 43 : this.icmpOptions.hashCode());
        result = (result * PRIME) + (this.isStateless == null ? 43 : this.isStateless.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.tcpOptions == null ? 43 : this.tcpOptions.hashCode());
        result = (result * PRIME) + (this.udpOptions == null ? 43 : this.udpOptions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
