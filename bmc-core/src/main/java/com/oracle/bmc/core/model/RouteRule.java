/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A mapping between a destination IP address range and a virtual device to route matching
 * packets to (a target).
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RouteRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
        private String networkEntityId;

        public Builder networkEntityId(String networkEntityId) {
            this.networkEntityId = networkEntityId;
            this.__explicitlySet__.add("networkEntityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RouteRule build() {
            RouteRule __instance__ =
                    new RouteRule(cidrBlock, destination, destinationType, networkEntityId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RouteRule o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock())
                            .destination(o.getDestination())
                            .destinationType(o.getDestinationType())
                            .networkEntityId(o.getNetworkEntityId());

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
     * Deprecated, Destination and DestinationType should be used instead; request including both fields will be rejected.
     * A destination IP address range in CIDR notation. Matching packets will
     * be routed to the indicated network entity (the target).
     * <p>
     * Example: `0.0.0.0/0`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * The destination service cidrBlock or destination IP address range in CIDR notation. Matching packets will
     * be routed to the indicated network entity (the target).
     * <p>
     * Examples: `10.12.0.0/16`
     *           `oci-phx-objectstorage`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    String destination;
    /**
     * Type of destination for the route rule. SERVICE_CIDR_BLOCK should be used if destination is a service
     * cidrBlock. CIDR_BLOCK should be used if destination is IP address range in CIDR notation. It must be provided
     * along with `destination`.
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
     * Type of destination for the route rule. SERVICE_CIDR_BLOCK should be used if destination is a service
     * cidrBlock. CIDR_BLOCK should be used if destination is IP address range in CIDR notation. It must be provided
     * along with `destination`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    DestinationType destinationType;

    /**
     * The OCID for the route rule's target. For information about the type of
     * targets you can specify, see
     * [Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
    String networkEntityId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
