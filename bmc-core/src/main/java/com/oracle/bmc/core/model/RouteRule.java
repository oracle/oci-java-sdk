/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A mapping between a destination IP address range and a virtual device to route matching
 * packets to (a target).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RouteRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RouteRule {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cidrBlock",
        "destination",
        "destinationType",
        "networkEntityId",
        "description",
        "routeType"
    })
    public RouteRule(
            String cidrBlock,
            String destination,
            DestinationType destinationType,
            String networkEntityId,
            String description,
            RouteType routeType) {
        super();
        this.cidrBlock = cidrBlock;
        this.destination = destination;
        this.destinationType = destinationType;
        this.networkEntityId = networkEntityId;
        this.description = description;
        this.routeType = routeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Deprecated. Instead use {@code destination} and {@code destinationType}. Requests that include both
         * {@code cidrBlock} and {@code destination} will be rejected.
         * <p>
         * A destination IP address range in CIDR notation. Matching packets will
         * be routed to the indicated network entity (the target).
         * <p>
         * Cannot be an IPv6 CIDR.
         * <p>
         * Example: {@code 0.0.0.0/0}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * Deprecated. Instead use {@code destination} and {@code destinationType}. Requests that include both
         * {@code cidrBlock} and {@code destination} will be rejected.
         * <p>
         * A destination IP address range in CIDR notation. Matching packets will
         * be routed to the indicated network entity (the target).
         * <p>
         * Cannot be an IPv6 CIDR.
         * <p>
         * Example: {@code 0.0.0.0/0}
         *
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * Conceptually, this is the range of IP addresses used for matching when routing
         * traffic. Required if you provide a {@code destinationType}.
         * <p>
         * Allowed values:
         * <p>
         * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
         *   or {@code 2001:0db8:0123:45::/56}. If you set this to an IPv6 CIDR, the route rule's target
         *   can only be a DRG or internet gateway.
         *   IPv6 addressing is supported for all commercial and government regions.
         *   See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * The {@code cidrBlock} value for a {@link Service}, if you're
         *     setting up a route rule for traffic destined for a particular {@code Service} through
         *     a service gateway. For example: {@code oci-phx-objectstorage}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * Conceptually, this is the range of IP addresses used for matching when routing
         * traffic. Required if you provide a {@code destinationType}.
         * <p>
         * Allowed values:
         * <p>
         * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
         *   or {@code 2001:0db8:0123:45::/56}. If you set this to an IPv6 CIDR, the route rule's target
         *   can only be a DRG or internet gateway.
         *   IPv6 addressing is supported for all commercial and government regions.
         *   See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * The {@code cidrBlock} value for a {@link Service}, if you're
         *     setting up a route rule for traffic destined for a particular {@code Service} through
         *     a service gateway. For example: {@code oci-phx-objectstorage}.
         *
         * @param destination the value to set
         * @return this builder
         **/
        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }
        /**
         * Type of destination for the rule. Required if you provide a {@code destination}.
         * <p>
         * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
         * <p>
         * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
         *     {@link Service} (the rule is for traffic destined for a
         *     particular {@code Service} through a service gateway).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        /**
         * Type of destination for the rule. Required if you provide a {@code destination}.
         * <p>
         * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
         * <p>
         * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
         *     {@link Service} (the rule is for traffic destined for a
         *     particular {@code Service} through a service gateway).
         *
         * @param destinationType the value to set
         * @return this builder
         **/
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the route rule's target. For information about the type of
         * targets you can specify, see
         * [Route Tables](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
        private String networkEntityId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the route rule's target. For information about the type of
         * targets you can specify, see
         * [Route Tables](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
         *
         * @param networkEntityId the value to set
         * @return this builder
         **/
        public Builder networkEntityId(String networkEntityId) {
            this.networkEntityId = networkEntityId;
            this.__explicitlySet__.add("networkEntityId");
            return this;
        }
        /**
         * An optional description of your choice for the rule.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of your choice for the rule.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A route rule can be STATIC if manually added to the route table, LOCAL if added by OCI to the route table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeType")
        private RouteType routeType;

        /**
         * A route rule can be STATIC if manually added to the route table, LOCAL if added by OCI to the route table.
         *
         * @param routeType the value to set
         * @return this builder
         **/
        public Builder routeType(RouteType routeType) {
            this.routeType = routeType;
            this.__explicitlySet__.add("routeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RouteRule build() {
            RouteRule __instance__ =
                    new RouteRule(
                            cidrBlock,
                            destination,
                            destinationType,
                            networkEntityId,
                            description,
                            routeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RouteRule o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock())
                            .destination(o.getDestination())
                            .destinationType(o.getDestinationType())
                            .networkEntityId(o.getNetworkEntityId())
                            .description(o.getDescription())
                            .routeType(o.getRouteType());

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
     * Deprecated. Instead use {@code destination} and {@code destinationType}. Requests that include both
     * {@code cidrBlock} and {@code destination} will be rejected.
     * <p>
     * A destination IP address range in CIDR notation. Matching packets will
     * be routed to the indicated network entity (the target).
     * <p>
     * Cannot be an IPv6 CIDR.
     * <p>
     * Example: {@code 0.0.0.0/0}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * Deprecated. Instead use {@code destination} and {@code destinationType}. Requests that include both
     * {@code cidrBlock} and {@code destination} will be rejected.
     * <p>
     * A destination IP address range in CIDR notation. Matching packets will
     * be routed to the indicated network entity (the target).
     * <p>
     * Cannot be an IPv6 CIDR.
     * <p>
     * Example: {@code 0.0.0.0/0}
     *
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Conceptually, this is the range of IP addresses used for matching when routing
     * traffic. Required if you provide a {@code destinationType}.
     * <p>
     * Allowed values:
     * <p>
     * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}. If you set this to an IPv6 CIDR, the route rule's target
     *   can only be a DRG or internet gateway.
     *   IPv6 addressing is supported for all commercial and government regions.
     *   See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * The {@code cidrBlock} value for a {@link Service}, if you're
     *     setting up a route rule for traffic destined for a particular {@code Service} through
     *     a service gateway. For example: {@code oci-phx-objectstorage}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * Conceptually, this is the range of IP addresses used for matching when routing
     * traffic. Required if you provide a {@code destinationType}.
     * <p>
     * Allowed values:
     * <p>
     * IP address range in CIDR notation. Can be an IPv4 or IPv6 CIDR. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}. If you set this to an IPv6 CIDR, the route rule's target
     *   can only be a DRG or internet gateway.
     *   IPv6 addressing is supported for all commercial and government regions.
     *   See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * The {@code cidrBlock} value for a {@link Service}, if you're
     *     setting up a route rule for traffic destined for a particular {@code Service} through
     *     a service gateway. For example: {@code oci-phx-objectstorage}.
     *
     * @return the value
     **/
    public String getDestination() {
        return destination;
    }

    /**
     * Type of destination for the rule. Required if you provide a {@code destination}.
     * <p>
     * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     * <p>
     * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular {@code Service} through a service gateway).
     *
     **/
    public enum DestinationType {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Type of destination for the rule. Required if you provide a {@code destination}.
     * <p>
     * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     * <p>
     * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular {@code Service} through a service gateway).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final DestinationType destinationType;

    /**
     * Type of destination for the rule. Required if you provide a {@code destination}.
     * <p>
     * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     * <p>
     * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular {@code Service} through a service gateway).
     *
     * @return the value
     **/
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the route rule's target. For information about the type of
     * targets you can specify, see
     * [Route Tables](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
    private final String networkEntityId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the route rule's target. For information about the type of
     * targets you can specify, see
     * [Route Tables](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
     *
     * @return the value
     **/
    public String getNetworkEntityId() {
        return networkEntityId;
    }

    /**
     * An optional description of your choice for the rule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of your choice for the rule.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A route rule can be STATIC if manually added to the route table, LOCAL if added by OCI to the route table.
     *
     **/
    public enum RouteType {
        Static("STATIC"),
        Local("LOCAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RouteType.class);

        private final String value;
        private static java.util.Map<String, RouteType> map;

        static {
            map = new java.util.HashMap<>();
            for (RouteType v : RouteType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RouteType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RouteType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RouteType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A route rule can be STATIC if manually added to the route table, LOCAL if added by OCI to the route table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeType")
    private final RouteType routeType;

    /**
     * A route rule can be STATIC if manually added to the route table, LOCAL if added by OCI to the route table.
     *
     * @return the value
     **/
    public RouteType getRouteType() {
        return routeType;
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
        sb.append("RouteRule(");
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", networkEntityId=").append(String.valueOf(this.networkEntityId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", routeType=").append(String.valueOf(this.routeType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RouteRule)) {
            return false;
        }

        RouteRule other = (RouteRule) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(this.networkEntityId, other.networkEntityId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.routeType, other.routeType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEntityId == null ? 43 : this.networkEntityId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.routeType == null ? 43 : this.routeType.hashCode());
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
