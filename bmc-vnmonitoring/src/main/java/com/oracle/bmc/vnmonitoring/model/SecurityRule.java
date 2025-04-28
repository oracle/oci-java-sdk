/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A security rule is one of the items in a {@link NetworkSecurityGroup}. It is a virtual firewall
 * rule for the VNICs in the network security group. A rule can be for either inbound ({@code
 * direction}= INGRESS) or outbound ({@code direction}= EGRESS) IP packets. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecurityRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "destination",
        "destinationType",
        "direction",
        "icmpOptions",
        "id",
        "isStateless",
        "isValid",
        "protocol",
        "source",
        "sourceType",
        "tcpOptions",
        "timeCreated",
        "udpOptions"
    })
    public SecurityRule(
            String description,
            String destination,
            DestinationType destinationType,
            Direction direction,
            IcmpOptions icmpOptions,
            String id,
            Boolean isStateless,
            Boolean isValid,
            String protocol,
            String source,
            SourceType sourceType,
            TcpOptions tcpOptions,
            java.util.Date timeCreated,
            UdpOptions udpOptions) {
        super();
        this.description = description;
        this.destination = destination;
        this.destinationType = destinationType;
        this.direction = direction;
        this.icmpOptions = icmpOptions;
        this.id = id;
        this.isStateless = isStateless;
        this.isValid = isValid;
        this.protocol = protocol;
        this.source = source;
        this.sourceType = sourceType;
        this.tcpOptions = tcpOptions;
        this.timeCreated = timeCreated;
        this.udpOptions = udpOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * Conceptually, this is the range of IP addresses that a packet originating from the
         * instance can go to.
         *
         * <p>Allowed values:
         *
         * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * rule for traffic destined for a particular {@code Service} through a service gateway. For
         * example: {@code oci-phx-objectstorage}.
         *
         * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule
         * belongs to if the rule's intent is to control traffic between VNICs in the same NSG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * Conceptually, this is the range of IP addresses that a packet originating from the
         * instance can go to.
         *
         * <p>Allowed values:
         *
         * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * rule for traffic destined for a particular {@code Service} through a service gateway. For
         * example: {@code oci-phx-objectstorage}.
         *
         * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule
         * belongs to if the rule's intent is to control traffic between VNICs in the same NSG.
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
         * Type of destination for the rule. Required if {@code direction} = {@code EGRESS}.
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
         * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code destination} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
         * NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        /**
         * Type of destination for the rule. Required if {@code direction} = {@code EGRESS}.
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
         * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code destination} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
         * NetworkSecurityGroup}.
         *
         * @param destinationType the value to set
         * @return this builder
         */
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * Direction of the security rule. Set to {@code EGRESS} for rules to allow outbound IP
         * packets, or {@code INGRESS} for rules to allow inbound IP packets.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private Direction direction;

        /**
         * Direction of the security rule. Set to {@code EGRESS} for rules to allow outbound IP
         * packets, or {@code INGRESS} for rules to allow inbound IP packets.
         *
         * @param direction the value to set
         * @return this builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
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
         * An Oracle-assigned identifier for the security rule. You specify this ID when you want to
         * update or delete the rule.
         *
         * <p>Example: {@code 04ABEC}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * An Oracle-assigned identifier for the security rule. You specify this ID when you want to
         * update or delete the rule.
         *
         * <p>Example: {@code 04ABEC}
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
         * Whether the rule is valid. The value is {@code True} when the rule is first created. If
         * the rule's {@code source} or {@code destination} is a network security group, the value
         * changes to {@code False} if that network security group is deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isValid")
        private Boolean isValid;

        /**
         * Whether the rule is valid. The value is {@code True} when the rule is first created. If
         * the rule's {@code source} or {@code destination} is a network security group, the value
         * changes to {@code False} if that network security group is deleted.
         *
         * @param isValid the value to set
         * @return this builder
         */
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            this.__explicitlySet__.add("isValid");
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
        /**
         * Conceptually, this is the range of IP addresses that a packet coming into the instance
         * can come from.
         *
         * <p>Allowed values:
         *
         * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * rule for traffic coming from a particular {@code Service} through a service gateway. For
         * example: {@code oci-phx-objectstorage}.
         *
         * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule
         * belongs to if the rule's intent is to control traffic between VNICs in the same NSG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Conceptually, this is the range of IP addresses that a packet coming into the instance
         * can come from.
         *
         * <p>Allowed values:
         *
         * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
         * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
         * regions. See [IPv6
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         *
         * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security
         * rule for traffic coming from a particular {@code Service} through a service gateway. For
         * example: {@code oci-phx-objectstorage}.
         *
         * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule
         * belongs to if the rule's intent is to control traffic between VNICs in the same NSG.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * Type of source for the rule. Required if {@code direction} = {@code INGRESS}.
         *
         * <p>{@code CIDR_BLOCK}: If the rule's {@code source} is an IP address range in CIDR
         * notation.
         *
         * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code source} is the {@code cidrBlock}
         * value for a {@link Service} (the rule is for traffic coming from a particular {@code
         * Service} through a service gateway).
         *
         * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code source} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
         * NetworkSecurityGroup}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * Type of source for the rule. Required if {@code direction} = {@code INGRESS}.
         *
         * <p>{@code CIDR_BLOCK}: If the rule's {@code source} is an IP address range in CIDR
         * notation.
         *
         * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code source} is the {@code cidrBlock}
         * value for a {@link Service} (the rule is for traffic coming from a particular {@code
         * Service} through a service gateway).
         *
         * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code source} is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
         * NetworkSecurityGroup}.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
        private TcpOptions tcpOptions;

        public Builder tcpOptions(TcpOptions tcpOptions) {
            this.tcpOptions = tcpOptions;
            this.__explicitlySet__.add("tcpOptions");
            return this;
        }
        /**
         * The date and time the security rule was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the security rule was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
        private UdpOptions udpOptions;

        public Builder udpOptions(UdpOptions udpOptions) {
            this.udpOptions = udpOptions;
            this.__explicitlySet__.add("udpOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityRule build() {
            SecurityRule model =
                    new SecurityRule(
                            this.description,
                            this.destination,
                            this.destinationType,
                            this.direction,
                            this.icmpOptions,
                            this.id,
                            this.isStateless,
                            this.isValid,
                            this.protocol,
                            this.source,
                            this.sourceType,
                            this.tcpOptions,
                            this.timeCreated,
                            this.udpOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityRule model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("destinationType")) {
                this.destinationType(model.getDestinationType());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
            }
            if (model.wasPropertyExplicitlySet("icmpOptions")) {
                this.icmpOptions(model.getIcmpOptions());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isStateless")) {
                this.isStateless(model.getIsStateless());
            }
            if (model.wasPropertyExplicitlySet("isValid")) {
                this.isValid(model.getIsValid());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("tcpOptions")) {
                this.tcpOptions(model.getTcpOptions());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("udpOptions")) {
                this.udpOptions(model.getUdpOptions());
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

    /**
     * Conceptually, this is the range of IP addresses that a packet originating from the instance
     * can go to.
     *
     * <p>Allowed values:
     *
     * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security rule
     * for traffic destined for a particular {@code Service} through a service gateway. For example:
     * {@code oci-phx-objectstorage}.
     *
     * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule belongs
     * to if the rule's intent is to control traffic between VNICs in the same NSG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * Conceptually, this is the range of IP addresses that a packet originating from the instance
     * can go to.
     *
     * <p>Allowed values:
     *
     * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security rule
     * for traffic destined for a particular {@code Service} through a service gateway. For example:
     * {@code oci-phx-objectstorage}.
     *
     * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule belongs
     * to if the rule's intent is to control traffic between VNICs in the same NSG.
     *
     * @return the value
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Type of destination for the rule. Required if {@code direction} = {@code EGRESS}.
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
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code destination} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     */
    public enum DestinationType implements com.oracle.bmc.http.internal.BmcEnum {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),
        NetworkSecurityGroup("NETWORK_SECURITY_GROUP"),

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
     * Type of destination for the rule. Required if {@code direction} = {@code EGRESS}.
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
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code destination} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final DestinationType destinationType;

    /**
     * Type of destination for the rule. Required if {@code direction} = {@code EGRESS}.
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
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code destination} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     *
     * @return the value
     */
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * Direction of the security rule. Set to {@code EGRESS} for rules to allow outbound IP packets,
     * or {@code INGRESS} for rules to allow inbound IP packets.
     */
    public enum Direction implements com.oracle.bmc.http.internal.BmcEnum {
        Egress("EGRESS"),
        Ingress("INGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Direction.class);

        private final String value;
        private static java.util.Map<String, Direction> map;

        static {
            map = new java.util.HashMap<>();
            for (Direction v : Direction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Direction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Direction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Direction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Direction of the security rule. Set to {@code EGRESS} for rules to allow outbound IP packets,
     * or {@code INGRESS} for rules to allow inbound IP packets.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final Direction direction;

    /**
     * Direction of the security rule. Set to {@code EGRESS} for rules to allow outbound IP packets,
     * or {@code INGRESS} for rules to allow inbound IP packets.
     *
     * @return the value
     */
    public Direction getDirection() {
        return direction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("icmpOptions")
    private final IcmpOptions icmpOptions;

    public IcmpOptions getIcmpOptions() {
        return icmpOptions;
    }

    /**
     * An Oracle-assigned identifier for the security rule. You specify this ID when you want to
     * update or delete the rule.
     *
     * <p>Example: {@code 04ABEC}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * An Oracle-assigned identifier for the security rule. You specify this ID when you want to
     * update or delete the rule.
     *
     * <p>Example: {@code 04ABEC}
     *
     * @return the value
     */
    public String getId() {
        return id;
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
     * Whether the rule is valid. The value is {@code True} when the rule is first created. If the
     * rule's {@code source} or {@code destination} is a network security group, the value changes
     * to {@code False} if that network security group is deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isValid")
    private final Boolean isValid;

    /**
     * Whether the rule is valid. The value is {@code True} when the rule is first created. If the
     * rule's {@code source} or {@code destination} is a network security group, the value changes
     * to {@code False} if that network security group is deleted.
     *
     * @return the value
     */
    public Boolean getIsValid() {
        return isValid;
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

    /**
     * Conceptually, this is the range of IP addresses that a packet coming into the instance can
     * come from.
     *
     * <p>Allowed values:
     *
     * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security rule
     * for traffic coming from a particular {@code Service} through a service gateway. For example:
     * {@code oci-phx-objectstorage}.
     *
     * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule belongs
     * to if the rule's intent is to control traffic between VNICs in the same NSG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Conceptually, this is the range of IP addresses that a packet coming into the instance can
     * come from.
     *
     * <p>Allowed values:
     *
     * <p>An IP address range in CIDR notation. For example: {@code 192.168.1.0/24} or {@code
     * 2001:0db8:0123:45::/56} IPv6 addressing is supported for all commercial and government
     * regions. See [IPv6
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     *
     * <p>The {@code cidrBlock} value for a {@link Service}, if you're setting up a security rule
     * for traffic coming from a particular {@code Service} through a service gateway. For example:
     * {@code oci-phx-objectstorage}.
     *
     * <p>The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * {@link NetworkSecurityGroup} in the same VCN. The value can be the NSG that the rule belongs
     * to if the rule's intent is to control traffic between VNICs in the same NSG.
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /**
     * Type of source for the rule. Required if {@code direction} = {@code INGRESS}.
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code source} is an IP address range in CIDR notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code source} is the {@code cidrBlock} value
     * for a {@link Service} (the rule is for traffic coming from a particular {@code Service}
     * through a service gateway).
     *
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code source} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),
        NetworkSecurityGroup("NETWORK_SECURITY_GROUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceType.class);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of source for the rule. Required if {@code direction} = {@code INGRESS}.
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code source} is an IP address range in CIDR notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code source} is the {@code cidrBlock} value
     * for a {@link Service} (the rule is for traffic coming from a particular {@code Service}
     * through a service gateway).
     *
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code source} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * Type of source for the rule. Required if {@code direction} = {@code INGRESS}.
     *
     * <p>{@code CIDR_BLOCK}: If the rule's {@code source} is an IP address range in CIDR notation.
     *
     * <p>{@code SERVICE_CIDR_BLOCK}: If the rule's {@code source} is the {@code cidrBlock} value
     * for a {@link Service} (the rule is for traffic coming from a particular {@code Service}
     * through a service gateway).
     *
     * <p>{@code NETWORK_SECURITY_GROUP}: If the rule's {@code source} is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a {@link
     * NetworkSecurityGroup}.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tcpOptions")
    private final TcpOptions tcpOptions;

    public TcpOptions getTcpOptions() {
        return tcpOptions;
    }

    /**
     * The date and time the security rule was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the security rule was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("udpOptions")
    private final UdpOptions udpOptions;

    public UdpOptions getUdpOptions() {
        return udpOptions;
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
        sb.append("SecurityRule(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", icmpOptions=").append(String.valueOf(this.icmpOptions));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isStateless=").append(String.valueOf(this.isStateless));
        sb.append(", isValid=").append(String.valueOf(this.isValid));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", tcpOptions=").append(String.valueOf(this.tcpOptions));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", udpOptions=").append(String.valueOf(this.udpOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityRule)) {
            return false;
        }

        SecurityRule other = (SecurityRule) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(this.direction, other.direction)
                && java.util.Objects.equals(this.icmpOptions, other.icmpOptions)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isStateless, other.isStateless)
                && java.util.Objects.equals(this.isValid, other.isValid)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.tcpOptions, other.tcpOptions)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.udpOptions, other.udpOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.icmpOptions == null ? 43 : this.icmpOptions.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.isStateless == null ? 43 : this.isStateless.hashCode());
        result = (result * PRIME) + (this.isValid == null ? 43 : this.isValid.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.tcpOptions == null ? 43 : this.tcpOptions.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.udpOptions == null ? 43 : this.udpOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
