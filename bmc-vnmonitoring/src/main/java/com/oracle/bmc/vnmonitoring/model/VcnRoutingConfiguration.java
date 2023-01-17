/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Identifies the VCN route table and rule that allowed the traffic to be forwarded. <br>
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
        builder = VcnRoutingConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VcnRoutingConfiguration extends ForwardedRoutingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VCN route table that allowed the traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnRouteTableId")
        private String vcnRouteTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VCN route table that allowed the traffic.
         *
         * @param vcnRouteTableId the value to set
         * @return this builder
         */
        public Builder vcnRouteTableId(String vcnRouteTableId) {
            this.vcnRouteTableId = vcnRouteTableId;
            this.__explicitlySet__.add("vcnRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeRule")
        private RouteRule routeRule;

        public Builder routeRule(RouteRule routeRule) {
            this.routeRule = routeRule;
            this.__explicitlySet__.add("routeRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcnRoutingConfiguration build() {
            VcnRoutingConfiguration model =
                    new VcnRoutingConfiguration(this.vcnRouteTableId, this.routeRule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcnRoutingConfiguration model) {
            if (model.wasPropertyExplicitlySet("vcnRouteTableId")) {
                this.vcnRouteTableId(model.getVcnRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("routeRule")) {
                this.routeRule(model.getRouteRule());
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

    @Deprecated
    public VcnRoutingConfiguration(String vcnRouteTableId, RouteRule routeRule) {
        super();
        this.vcnRouteTableId = vcnRouteTableId;
        this.routeRule = routeRule;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VCN
     * route table that allowed the traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnRouteTableId")
    private final String vcnRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VCN
     * route table that allowed the traffic.
     *
     * @return the value
     */
    public String getVcnRouteTableId() {
        return vcnRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("routeRule")
    private final RouteRule routeRule;

    public RouteRule getRouteRule() {
        return routeRule;
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
        sb.append("VcnRoutingConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vcnRouteTableId=").append(String.valueOf(this.vcnRouteTableId));
        sb.append(", routeRule=").append(String.valueOf(this.routeRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcnRoutingConfiguration)) {
            return false;
        }

        VcnRoutingConfiguration other = (VcnRoutingConfiguration) o;
        return java.util.Objects.equals(this.vcnRouteTableId, other.vcnRouteTableId)
                && java.util.Objects.equals(this.routeRule, other.routeRule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vcnRouteTableId == null ? 43 : this.vcnRouteTableId.hashCode());
        result = (result * PRIME) + (this.routeRule == null ? 43 : this.routeRule.hashCode());
        return result;
    }
}
