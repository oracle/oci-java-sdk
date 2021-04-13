/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines route rule details for a `routesTo` relationship.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopologyRoutesToRelationshipDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TopologyRoutesToRelationshipDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
        private String destinationType;

        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            this.__explicitlySet__.add("destinationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private String destination;

        public Builder destination(String destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyRoutesToRelationshipDetails build() {
            TopologyRoutesToRelationshipDetails __instance__ =
                    new TopologyRoutesToRelationshipDetails(
                            destinationType, destination, routeTableId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyRoutesToRelationshipDetails o) {
            Builder copiedBuilder =
                    destinationType(o.getDestinationType())
                            .destination(o.getDestination())
                            .routeTableId(o.getRouteTableId());

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
     * The destinationType can be set to one of two values:
     * <p>
     * Use `CIDR_BLOCK` if the rule's `destination` is an IP address range in CIDR notation.
     * <p>
     * Use `SERVICE_CIDR_BLOCK` if the rule's `destination` is the `cidrBlock` value for a {@link Service}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationType")
    String destinationType;

    /**
     * An IP address range in CIDR notation or the `cidrBlock` value for a {@link Service}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    String destination;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the routing table that contains the route rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
