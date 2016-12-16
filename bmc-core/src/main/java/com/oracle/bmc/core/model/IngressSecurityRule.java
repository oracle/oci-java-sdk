/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A rule for allowing inbound IP packets.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = IngressSecurityRule.Builder.class)
public class IngressSecurityRule {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("icmpOptions")
        private IcmpOptions icmpOptions;

        @JsonProperty("protocol")
        private String protocol;

        @JsonProperty("source")
        private String source;

        @JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        @JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public IngressSecurityRule build() {
            return new IngressSecurityRule(icmpOptions, protocol, source, tcpOptions, udpOptions);
        }

        @JsonIgnore
        public Builder copy(IngressSecurityRule o) {
            return icmpOptions(o.getIcmpOptions())
                    .protocol(o.getProtocol())
                    .source(o.getSource())
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
    @JsonProperty("icmpOptions")
    IcmpOptions icmpOptions;

    /**
     * The transport protocol. Specify either `all` or an IPv4 protocol number as
     * defined in
     * [Protocol Numbers](http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     * Options are supported only for ICMP (\"1\"), TCP (\"6\"), and UDP (\"17\").
     *
     **/
    @JsonProperty("protocol")
    @Valid
    @NotNull
    String protocol;

    /**
     * The source CIDR block for the ingress rule. This is the range of IP addresses that a
     * packet coming into the instance can come from.
     *
     **/
    @JsonProperty("source")
    @Valid
    @NotNull
    String source;

    /**
     * Optional and valid only for TCP. Use to specify particular destination ports for TCP rules.
     * If you specify TCP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @JsonProperty("tcpOptions")
    TcpOptions tcpOptions;

    /**
     * Optional and valid only for UDP. Use to specify particular destination ports for UDP rules.
     * If you specify UDP as the protocol but omit this object, then all destination ports are allowed.
     *
     **/
    @JsonProperty("udpOptions")
    UdpOptions udpOptions;
}
