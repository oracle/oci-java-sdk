/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the {@code routesTo} relationship between virtual network topology entities. A {@code RoutesTo} relationship
 * is defined when a routing table and a routing rule  are used to govern how to route traffic
 * from one entity to another. For example, a DRG might have a routing rule to send certain traffic to an LPG.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopologyRoutesToEntityRelationship.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopologyRoutesToEntityRelationship extends TopologyEntityRelationship {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id1")
        private String id1;

        public Builder id1(String id1) {
            this.id1 = id1;
            this.__explicitlySet__.add("id1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id2")
        private String id2;

        public Builder id2(String id2) {
            this.id2 = id2;
            this.__explicitlySet__.add("id2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeRuleDetails")
        private TopologyRoutesToRelationshipDetails routeRuleDetails;

        public Builder routeRuleDetails(TopologyRoutesToRelationshipDetails routeRuleDetails) {
            this.routeRuleDetails = routeRuleDetails;
            this.__explicitlySet__.add("routeRuleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyRoutesToEntityRelationship build() {
            TopologyRoutesToEntityRelationship model =
                    new TopologyRoutesToEntityRelationship(
                            this.id1, this.id2, this.routeRuleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyRoutesToEntityRelationship model) {
            if (model.wasPropertyExplicitlySet("id1")) {
                this.id1(model.getId1());
            }
            if (model.wasPropertyExplicitlySet("id2")) {
                this.id2(model.getId2());
            }
            if (model.wasPropertyExplicitlySet("routeRuleDetails")) {
                this.routeRuleDetails(model.getRouteRuleDetails());
            }
            return this;
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

    @Deprecated
    public TopologyRoutesToEntityRelationship(
            String id1, String id2, TopologyRoutesToRelationshipDetails routeRuleDetails) {
        super(id1, id2);
        this.routeRuleDetails = routeRuleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("routeRuleDetails")
    private final TopologyRoutesToRelationshipDetails routeRuleDetails;

    public TopologyRoutesToRelationshipDetails getRouteRuleDetails() {
        return routeRuleDetails;
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
        sb.append("TopologyRoutesToEntityRelationship(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", routeRuleDetails=").append(String.valueOf(this.routeRuleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopologyRoutesToEntityRelationship)) {
            return false;
        }

        TopologyRoutesToEntityRelationship other = (TopologyRoutesToEntityRelationship) o;
        return java.util.Objects.equals(this.routeRuleDetails, other.routeRuleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.routeRuleDetails == null ? 43 : this.routeRuleDetails.hashCode());
        return result;
    }
}
