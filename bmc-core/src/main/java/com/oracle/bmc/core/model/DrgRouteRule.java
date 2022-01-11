/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A DRG route rule is a mapping between a destination IP address range and a DRG attachment.
 * The map is used to route matching packets. Traffic will be routed across the attachments using Equal-cost multi-path routing (ECMP)
 * if there are multiple rules with identical destinations and none of the rules conflict.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrgRouteRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DrgRouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private DestinationType destinationType;

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
        private String nextHopDrgAttachmentId;

        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            this.__explicitlySet__.add("nextHopDrgAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeType")
        private RouteType routeType;

        public Builder routeType(RouteType routeType) {
            this.routeType = routeType;
            this.__explicitlySet__.add("routeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
        private Boolean isConflict;

        public Builder isConflict(Boolean isConflict) {
            this.isConflict = isConflict;
            this.__explicitlySet__.add("isConflict");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBlackhole")
        private Boolean isBlackhole;

        public Builder isBlackhole(Boolean isBlackhole) {
            this.isBlackhole = isBlackhole;
            this.__explicitlySet__.add("isBlackhole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeProvenance")
        private RouteProvenance routeProvenance;

        public Builder routeProvenance(RouteProvenance routeProvenance) {
            this.routeProvenance = routeProvenance;
            this.__explicitlySet__.add("routeProvenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private Object attributes;

        public Builder attributes(Object attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgRouteRule build() {
            DrgRouteRule __instance__ =
                    new DrgRouteRule(
                            destination,
                            destinationType,
                            nextHopDrgAttachmentId,
                            routeType,
                            isConflict,
                            isBlackhole,
                            id,
                            routeProvenance,
                            attributes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgRouteRule o) {
            Builder copiedBuilder =
                    destination(o.getDestination())
                            .destinationType(o.getDestinationType())
                            .nextHopDrgAttachmentId(o.getNextHopDrgAttachmentId())
                            .routeType(o.getRouteType())
                            .isConflict(o.getIsConflict())
                            .isBlackhole(o.getIsBlackhole())
                            .id(o.getId())
                            .routeProvenance(o.getRouteProvenance())
                            .attributes(o.getAttributes());

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

    /**
     * Represents the range of IP addresses to match against when routing traffic.
     * <p>
     * Potential values:
     *   * An IP address range (IPv4 or IPv6) in CIDR notation. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}.
     *   * When you're setting up a security rule for traffic destined for a particular {@code Service} through
     *   a service gateway, this is the {@code cidrBlock} value associated with that {@link Service}. For example: {@code oci-phx-objectstorage}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    String destination;
    /**
     * The type of destination for the rule. the type is required if {@code direction} = {@code EGRESS}.
     * <p>
     * Allowed values:
     * <p>
     * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     *   * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular {@code Service} through a service gateway).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DestinationType {
        CidrBlock("CIDR_BLOCK"),
        ServiceCidrBlock("SERVICE_CIDR_BLOCK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The type of destination for the rule. the type is required if {@code direction} = {@code EGRESS}.
     * <p>
     * Allowed values:
     * <p>
     * {@code CIDR_BLOCK}: If the rule's {@code destination} is an IP address range in CIDR notation.
     *   * {@code SERVICE_CIDR_BLOCK}: If the rule's {@code destination} is the {@code cidrBlock} value for a
     *     {@link Service} (the rule is for traffic destined for a
     *     particular {@code Service} through a service gateway).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    DestinationType destinationType;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment responsible
     * for reaching the network destination.
     * <p>
     * A value of {@code BLACKHOLE} means traffic for this route is discarded without notification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
    String nextHopDrgAttachmentId;
    /**
     * You can specify static routes for the DRG route table using the API.
     * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RouteType {
        Static("STATIC"),
        Dynamic("DYNAMIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * You can specify static routes for the DRG route table using the API.
     * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeType")
    RouteType routeType;

    /**
     * Indicates that the route was not imported due to a conflict between route rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
    Boolean isConflict;

    /**
     * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBlackhole")
    Boolean isBlackhole;

    /**
     * The Oracle-assigned ID of the DRG route rule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment,
     * and is propagated to peered DRGs via RPC attachments, the route's provenance in the peered DRGs remains {@code IPSEC_TUNNEL},
     * because that is the earliest origin.
     * <p>
     * No routes with a provenance {@code IPSEC_TUNNEL} or {@code VIRTUAL_CIRCUIT} will be exported to IPsec tunnel or virtual circuit attachments,
     * regardless of the attachment's export distribution.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RouteProvenance {
        Static("STATIC"),
        Vcn("VCN"),
        VirtualCircuit("VIRTUAL_CIRCUIT"),
        IpsecTunnel("IPSEC_TUNNEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RouteProvenance> map;

        static {
            map = new java.util.HashMap<>();
            for (RouteProvenance v : RouteProvenance.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RouteProvenance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RouteProvenance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RouteProvenance', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment,
     * and is propagated to peered DRGs via RPC attachments, the route's provenance in the peered DRGs remains {@code IPSEC_TUNNEL},
     * because that is the earliest origin.
     * <p>
     * No routes with a provenance {@code IPSEC_TUNNEL} or {@code VIRTUAL_CIRCUIT} will be exported to IPsec tunnel or virtual circuit attachments,
     * regardless of the attachment's export distribution.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeProvenance")
    RouteProvenance routeProvenance;

    /**
     * Additional properties for the route, computed by the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    Object attributes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
