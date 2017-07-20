/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A rule for allowing outbound IP packets.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EgressSecurityRule.Builder.class
)
public class EgressSecurityRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
        private IcmpOptions icmpOptions;

        @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
        private Boolean isStateless;

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public EgressSecurityRule build() {
            return new EgressSecurityRule(
                    destination, icmpOptions, isStateless, protocol, tcpOptions, udpOptions);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EgressSecurityRule o) {
            return destination(o.getDestination())
                    .icmpOptions(o.getIcmpOptions())
                    .isStateless(o.getIsStateless())
                    .protocol(o.getProtocol())
                    .tcpOptions(o.getTcpOptions())
                    .udpOptions(o.getUdpOptions());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The destination CIDR block for the egress rule. This is the range of IP addresses that a
     * packet originating from the instance can go to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String destination;

    /**
     * Optional and valid only for ICMP. Use to specify a particular ICMP type and code
     * as defined in
     * [ICMP Parameters](http://www.iana.org/assignments/icmp-parameters/icmp-parameters.xhtml).
     * If you specify ICMP as the protocol but omit this object, then all ICMP types and
     * codes are allowed. If you do provide this object, the type is required and the code is optional.
     * To enable MTU negotiation for ingress internet traffic, make sure to allow type 3 (\"Destination
     * Unreachable\") code 4 (\"Fragmentation Needed and Don't Fragment was Set\"). If you need to specify
     * multiple codes for a single type, create a separate security list rule for each.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    IcmpOptions icmpOptions;

    /**
     * A stateless rule allows traffic in one direction. Remember to add a corresponding
     * stateless rule in the other direction if you need to support bidirectional traffic. For
     * example, if egress traffic allows TCP destination port 80, there should be an ingress
     * rule to allow TCP source port 80. Defaults to false, which means the rule is stateful
     * and a corresponding rule is not necessary for bidirectional traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStateless")
    Boolean isStateless;

    /**
     * The transport protocol. Specify either `all` or an IPv4 protocol number as
     * defined in
     * [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * Options are supported only for ICMP (\"1\"), TCP (\"6\"), and UDP (\"17\").
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String protocol;

    /**
     * Optional and valid only for TCP. Use to specify particular destination ports for TCP rules.
     * If you specify TCP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    TcpOptions tcpOptions;

    /**
     * Optional and valid only for UDP. Use to specify particular destination ports for UDP rules.
     * If you specify UDP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    UdpOptions udpOptions;
}
