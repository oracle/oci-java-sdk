/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines route rule details for a {@code routesTo} relationship. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TopologyRoutesToRelationshipDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TopologyRoutesToRelationshipDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "destinationType",
        "destination",
        "routeTableId",
        "routeType"
    })
    public TopologyRoutesToRelationshipDetails(
            String destinationType, String destination, String routeTableId, RouteType routeType) {
        super();
        this.destinationType = destinationType;
        this.destination = destination;
        this.routeTableId = routeTableId;
        this.routeType = routeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The destinationType can be set to one of two values:
         *
         * <p>Use {@code CIDR_BLOCK} if the rule's {@code destination} is an IP address range in
         * CIDR notation.
         *
         * <p>Use {@code SERVICE_CIDR_BLOCK} if the rule's {@code destination} is the {@code
         * cidrBlock} value for a {@link Service}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private String destinationType;

        /**
         * The destinationType can be set to one of two values:
         *
         * <p>Use {@code CIDR_BLOCK} if the rule's {@code destination} is an IP address range in
         * CIDR notation.
         *
         * <p>Use {@code SERVICE_CIDR_BLOCK} if the rule's {@code destination} is the {@code
         * cidrBlock} value for a {@link Service}.
         *
         * @param destinationType the value to set
         * @return this builder
         */
        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }
        /**
         * An IP address range in CIDR notation or the {@code cidrBlock} value for a {@link
         * Service}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        /**
         * An IP address range in CIDR notation or the {@code cidrBlock} value for a {@link
         * Service}.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the routing table that contains the route rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the routing table that contains the route rule.
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * A route rule can be {@code STATIC} if manually added to the route table or {@code
         * DYNAMIC} if imported from another route table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeType")
        private RouteType routeType;

        /**
         * A route rule can be {@code STATIC} if manually added to the route table or {@code
         * DYNAMIC} if imported from another route table.
         *
         * @param routeType the value to set
         * @return this builder
         */
        public Builder routeType(RouteType routeType) {
            this.routeType = routeType;
            this.__explicitlySet__.add("routeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyRoutesToRelationshipDetails build() {
            TopologyRoutesToRelationshipDetails model =
                    new TopologyRoutesToRelationshipDetails(
                            this.destinationType,
                            this.destination,
                            this.routeTableId,
                            this.routeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyRoutesToRelationshipDetails model) {
            if (model.wasPropertyExplicitlySet("destinationType")) {
                this.destinationType(model.getDestinationType());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("routeType")) {
                this.routeType(model.getRouteType());
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
     * The destinationType can be set to one of two values:
     *
     * <p>Use {@code CIDR_BLOCK} if the rule's {@code destination} is an IP address range in CIDR
     * notation.
     *
     * <p>Use {@code SERVICE_CIDR_BLOCK} if the rule's {@code destination} is the {@code cidrBlock}
     * value for a {@link Service}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    private final String destinationType;

    /**
     * The destinationType can be set to one of two values:
     *
     * <p>Use {@code CIDR_BLOCK} if the rule's {@code destination} is an IP address range in CIDR
     * notation.
     *
     * <p>Use {@code SERVICE_CIDR_BLOCK} if the rule's {@code destination} is the {@code cidrBlock}
     * value for a {@link Service}.
     *
     * @return the value
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * An IP address range in CIDR notation or the {@code cidrBlock} value for a {@link Service}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

    /**
     * An IP address range in CIDR notation or the {@code cidrBlock} value for a {@link Service}.
     *
     * @return the value
     */
    public String getDestination() {
        return destination;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the routing table that contains the route rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the routing table that contains the route rule.
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * A route rule can be {@code STATIC} if manually added to the route table or {@code DYNAMIC} if
     * imported from another route table.
     */
    public enum RouteType implements com.oracle.bmc.http.internal.BmcEnum {
        Static("STATIC"),
        Dynamic("DYNAMIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * A route rule can be {@code STATIC} if manually added to the route table or {@code DYNAMIC} if
     * imported from another route table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeType")
    private final RouteType routeType;

    /**
     * A route rule can be {@code STATIC} if manually added to the route table or {@code DYNAMIC} if
     * imported from another route table.
     *
     * @return the value
     */
    public RouteType getRouteType() {
        return routeType;
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
        sb.append("TopologyRoutesToRelationshipDetails(");
        sb.append("super=").append(super.toString());
        sb.append("destinationType=").append(String.valueOf(this.destinationType));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", routeType=").append(String.valueOf(this.routeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopologyRoutesToRelationshipDetails)) {
            return false;
        }

        TopologyRoutesToRelationshipDetails other = (TopologyRoutesToRelationshipDetails) o;
        return java.util.Objects.equals(this.destinationType, other.destinationType)
                && java.util.Objects.equals(this.destination, other.destination)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.routeType, other.routeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.destinationType == null ? 43 : this.destinationType.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.routeType == null ? 43 : this.routeType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
