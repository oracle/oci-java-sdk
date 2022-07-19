/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrgRouteRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrgRouteRule {
    @Deprecated
    @java.beans.ConstructorProperties({
        "destination",
        "destinationType",
        "nextHopDrgAttachmentId",
        "routeType",
        "isConflict",
        "isBlackhole",
        "id",
        "routeProvenance",
        "attributes"
    })
    public DrgRouteRule(
            String destination,
            DestinationType destinationType,
            String nextHopDrgAttachmentId,
            RouteType routeType,
            Boolean isConflict,
            Boolean isBlackhole,
            String id,
            RouteProvenance routeProvenance,
            Object attributes) {
        super();
        this.destination = destination;
        this.destinationType = destinationType;
        this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
        this.routeType = routeType;
        this.isConflict = isConflict;
        this.isBlackhole = isBlackhole;
        this.id = id;
        this.routeProvenance = routeProvenance;
        this.attributes = attributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        private String destination;

        /**
         * Represents the range of IP addresses to match against when routing traffic.
         * <p>
         * Potential values:
         *   * An IP address range (IPv4 or IPv6) in CIDR notation. For example: {@code 192.168.1.0/24}
         *   or {@code 2001:0db8:0123:45::/56}.
         *   * When you're setting up a security rule for traffic destined for a particular {@code Service} through
         *   a service gateway, this is the {@code cidrBlock} value associated with that {@link Service}. For example: {@code oci-phx-objectstorage}.
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
        private DestinationType destinationType;

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
         * @param destinationType the value to set
         * @return this builder
         **/
        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment responsible
         * for reaching the network destination.
         * <p>
         * A value of {@code BLACKHOLE} means traffic for this route is discarded without notification.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
        private String nextHopDrgAttachmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment responsible
         * for reaching the network destination.
         * <p>
         * A value of {@code BLACKHOLE} means traffic for this route is discarded without notification.
         *
         * @param nextHopDrgAttachmentId the value to set
         * @return this builder
         **/
        public Builder nextHopDrgAttachmentId(String nextHopDrgAttachmentId) {
            this.nextHopDrgAttachmentId = nextHopDrgAttachmentId;
            this.__explicitlySet__.add("nextHopDrgAttachmentId");
            return this;
        }
        /**
         * You can specify static routes for the DRG route table using the API.
         * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeType")
        private RouteType routeType;

        /**
         * You can specify static routes for the DRG route table using the API.
         * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
         *
         * @param routeType the value to set
         * @return this builder
         **/
        public Builder routeType(RouteType routeType) {
            this.routeType = routeType;
            this.__explicitlySet__.add("routeType");
            return this;
        }
        /**
         * Indicates that the route was not imported due to a conflict between route rules.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
        private Boolean isConflict;

        /**
         * Indicates that the route was not imported due to a conflict between route rules.
         *
         * @param isConflict the value to set
         * @return this builder
         **/
        public Builder isConflict(Boolean isConflict) {
            this.isConflict = isConflict;
            this.__explicitlySet__.add("isConflict");
            return this;
        }
        /**
         * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBlackhole")
        private Boolean isBlackhole;

        /**
         * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
         *
         * @param isBlackhole the value to set
         * @return this builder
         **/
        public Builder isBlackhole(Boolean isBlackhole) {
            this.isBlackhole = isBlackhole;
            this.__explicitlySet__.add("isBlackhole");
            return this;
        }
        /**
         * The Oracle-assigned ID of the DRG route rule.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle-assigned ID of the DRG route rule.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
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
        private RouteProvenance routeProvenance;

        /**
         * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment,
         * and is propagated to peered DRGs via RPC attachments, the route's provenance in the peered DRGs remains {@code IPSEC_TUNNEL},
         * because that is the earliest origin.
         * <p>
         * No routes with a provenance {@code IPSEC_TUNNEL} or {@code VIRTUAL_CIRCUIT} will be exported to IPsec tunnel or virtual circuit attachments,
         * regardless of the attachment's export distribution.
         *
         * @param routeProvenance the value to set
         * @return this builder
         **/
        public Builder routeProvenance(RouteProvenance routeProvenance) {
            this.routeProvenance = routeProvenance;
            this.__explicitlySet__.add("routeProvenance");
            return this;
        }
        /**
         * Additional properties for the route, computed by the service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private Object attributes;

        /**
         * Additional properties for the route, computed by the service.
         *
         * @param attributes the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final String destination;

    /**
     * Represents the range of IP addresses to match against when routing traffic.
     * <p>
     * Potential values:
     *   * An IP address range (IPv4 or IPv6) in CIDR notation. For example: {@code 192.168.1.0/24}
     *   or {@code 2001:0db8:0123:45::/56}.
     *   * When you're setting up a security rule for traffic destined for a particular {@code Service} through
     *   a service gateway, this is the {@code cidrBlock} value associated with that {@link Service}. For example: {@code oci-phx-objectstorage}.
     *
     * @return the value
     **/
    public String getDestination() {
        return destination;
    }

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
    private final DestinationType destinationType;

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
     * @return the value
     **/
    public DestinationType getDestinationType() {
        return destinationType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment responsible
     * for reaching the network destination.
     * <p>
     * A value of {@code BLACKHOLE} means traffic for this route is discarded without notification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextHopDrgAttachmentId")
    private final String nextHopDrgAttachmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next hop DRG attachment responsible
     * for reaching the network destination.
     * <p>
     * A value of {@code BLACKHOLE} means traffic for this route is discarded without notification.
     *
     * @return the value
     **/
    public String getNextHopDrgAttachmentId() {
        return nextHopDrgAttachmentId;
    }

    /**
     * You can specify static routes for the DRG route table using the API.
     * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     *
     **/
    public enum RouteType {
        Static("STATIC"),
        Dynamic("DYNAMIC"),

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
     * You can specify static routes for the DRG route table using the API.
     * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeType")
    private final RouteType routeType;

    /**
     * You can specify static routes for the DRG route table using the API.
     * The DRG learns dynamic routes from the DRG attachments using various routing protocols.
     *
     * @return the value
     **/
    public RouteType getRouteType() {
        return routeType;
    }

    /**
     * Indicates that the route was not imported due to a conflict between route rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
    private final Boolean isConflict;

    /**
     * Indicates that the route was not imported due to a conflict between route rules.
     *
     * @return the value
     **/
    public Boolean getIsConflict() {
        return isConflict;
    }

    /**
     * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBlackhole")
    private final Boolean isBlackhole;

    /**
     * Indicates that if the next hop attachment does not exist, so traffic for this route is discarded without notification.
     *
     * @return the value
     **/
    public Boolean getIsBlackhole() {
        return isBlackhole;
    }

    /**
     * The Oracle-assigned ID of the DRG route rule.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle-assigned ID of the DRG route rule.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment,
     * and is propagated to peered DRGs via RPC attachments, the route's provenance in the peered DRGs remains {@code IPSEC_TUNNEL},
     * because that is the earliest origin.
     * <p>
     * No routes with a provenance {@code IPSEC_TUNNEL} or {@code VIRTUAL_CIRCUIT} will be exported to IPsec tunnel or virtual circuit attachments,
     * regardless of the attachment's export distribution.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RouteProvenance.class);

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
    private final RouteProvenance routeProvenance;

    /**
     * The earliest origin of a route. If a route is advertised to a DRG through an IPsec tunnel attachment,
     * and is propagated to peered DRGs via RPC attachments, the route's provenance in the peered DRGs remains {@code IPSEC_TUNNEL},
     * because that is the earliest origin.
     * <p>
     * No routes with a provenance {@code IPSEC_TUNNEL} or {@code VIRTUAL_CIRCUIT} will be exported to IPsec tunnel or virtual circuit attachments,
     * regardless of the attachment's export distribution.
     *
     * @return the value
     **/
    public RouteProvenance getRouteProvenance() {
        return routeProvenance;
    }

    /**
     * Additional properties for the route, computed by the service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final Object attributes;

    /**
     * Additional properties for the route, computed by the service.
     *
     * @return the value
     **/
    public Object getAttributes() {
        return attributes;
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
        sb.append("DrgRouteRule(");
        sb.append("destination=").append(String.valueOf(this.destination));
        sb.append(", destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", nextHopDrgAttachmentId=").append(String.valueOf(this.nextHopDrgAttachmentId));
        sb.append(", routeType=").append(String.valueOf(this.routeType));
        sb.append(", isConflict=").append(String.valueOf(this.isConflict));
        sb.append(", isBlackhole=").append(String.valueOf(this.isBlackhole));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", routeProvenance=").append(String.valueOf(this.routeProvenance));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgRouteRule)) {
            return false;
        }

        DrgRouteRule other = (DrgRouteRule) o;
        return java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(
                        this.nextHopDrgAttachmentId, other.nextHopDrgAttachmentId)
                && java.util.Objects.equals(this.routeType, other.routeType)
                && java.util.Objects.equals(this.isConflict, other.isConflict)
                && java.util.Objects.equals(this.isBlackhole, other.isBlackhole)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.routeProvenance, other.routeProvenance)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result =
                (result * PRIME)
                        + (this.nextHopDrgAttachmentId == null
                                ? 43
                                : this.nextHopDrgAttachmentId.hashCode());
        result = (result * PRIME) + (this.routeType == null ? 43 : this.routeType.hashCode());
        result = (result * PRIME) + (this.isConflict == null ? 43 : this.isConflict.hashCode());
        result = (result * PRIME) + (this.isBlackhole == null ? 43 : this.isBlackhole.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.routeProvenance == null ? 43 : this.routeProvenance.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
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
