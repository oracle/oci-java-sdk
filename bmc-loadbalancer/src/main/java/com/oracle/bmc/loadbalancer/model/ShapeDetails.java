/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details to update load balancer to a different shape.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"minimumBandwidthInMbps", "maximumBandwidthInMbps"})
    public ShapeDetails(Integer minimumBandwidthInMbps, Integer maximumBandwidthInMbps) {
        super();
        this.minimumBandwidthInMbps = minimumBandwidthInMbps;
        this.maximumBandwidthInMbps = maximumBandwidthInMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Bandwidth in Mbps that determines the total pre-provisioned bandwidth (ingress plus egress).
         * The values must be between 10 and the maximumBandwidthInMbps.
         * <p>
         * Example: {@code 150}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumBandwidthInMbps")
        private Integer minimumBandwidthInMbps;

        /**
         * Bandwidth in Mbps that determines the total pre-provisioned bandwidth (ingress plus egress).
         * The values must be between 10 and the maximumBandwidthInMbps.
         * <p>
         * Example: {@code 150}
         *
         * @param minimumBandwidthInMbps the value to set
         * @return this builder
         **/
        public Builder minimumBandwidthInMbps(Integer minimumBandwidthInMbps) {
            this.minimumBandwidthInMbps = minimumBandwidthInMbps;
            this.__explicitlySet__.add("minimumBandwidthInMbps");
            return this;
        }
        /**
         * Bandwidth in Mbps that determines the maximum bandwidth (ingress plus egress) that the load balancer can
         * achieve. This bandwidth cannot be always guaranteed. For a guaranteed bandwidth use the minimumBandwidthInMbps
         * parameter.
         * <p>
         * The values must be between minimumBandwidthInMbps and 8192 (8Gbps).
         * <p>
         * Example: {@code 1500}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximumBandwidthInMbps")
        private Integer maximumBandwidthInMbps;

        /**
         * Bandwidth in Mbps that determines the maximum bandwidth (ingress plus egress) that the load balancer can
         * achieve. This bandwidth cannot be always guaranteed. For a guaranteed bandwidth use the minimumBandwidthInMbps
         * parameter.
         * <p>
         * The values must be between minimumBandwidthInMbps and 8192 (8Gbps).
         * <p>
         * Example: {@code 1500}
         *
         * @param maximumBandwidthInMbps the value to set
         * @return this builder
         **/
        public Builder maximumBandwidthInMbps(Integer maximumBandwidthInMbps) {
            this.maximumBandwidthInMbps = maximumBandwidthInMbps;
            this.__explicitlySet__.add("maximumBandwidthInMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeDetails build() {
            ShapeDetails __instance__ =
                    new ShapeDetails(minimumBandwidthInMbps, maximumBandwidthInMbps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeDetails o) {
            Builder copiedBuilder =
                    minimumBandwidthInMbps(o.getMinimumBandwidthInMbps())
                            .maximumBandwidthInMbps(o.getMaximumBandwidthInMbps());

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
     * Bandwidth in Mbps that determines the total pre-provisioned bandwidth (ingress plus egress).
     * The values must be between 10 and the maximumBandwidthInMbps.
     * <p>
     * Example: {@code 150}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumBandwidthInMbps")
    private final Integer minimumBandwidthInMbps;

    /**
     * Bandwidth in Mbps that determines the total pre-provisioned bandwidth (ingress plus egress).
     * The values must be between 10 and the maximumBandwidthInMbps.
     * <p>
     * Example: {@code 150}
     *
     * @return the value
     **/
    public Integer getMinimumBandwidthInMbps() {
        return minimumBandwidthInMbps;
    }

    /**
     * Bandwidth in Mbps that determines the maximum bandwidth (ingress plus egress) that the load balancer can
     * achieve. This bandwidth cannot be always guaranteed. For a guaranteed bandwidth use the minimumBandwidthInMbps
     * parameter.
     * <p>
     * The values must be between minimumBandwidthInMbps and 8192 (8Gbps).
     * <p>
     * Example: {@code 1500}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumBandwidthInMbps")
    private final Integer maximumBandwidthInMbps;

    /**
     * Bandwidth in Mbps that determines the maximum bandwidth (ingress plus egress) that the load balancer can
     * achieve. This bandwidth cannot be always guaranteed. For a guaranteed bandwidth use the minimumBandwidthInMbps
     * parameter.
     * <p>
     * The values must be between minimumBandwidthInMbps and 8192 (8Gbps).
     * <p>
     * Example: {@code 1500}
     *
     * @return the value
     **/
    public Integer getMaximumBandwidthInMbps() {
        return maximumBandwidthInMbps;
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
        sb.append("ShapeDetails(");
        sb.append("minimumBandwidthInMbps=").append(String.valueOf(this.minimumBandwidthInMbps));
        sb.append(", maximumBandwidthInMbps=").append(String.valueOf(this.maximumBandwidthInMbps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeDetails)) {
            return false;
        }

        ShapeDetails other = (ShapeDetails) o;
        return java.util.Objects.equals(this.minimumBandwidthInMbps, other.minimumBandwidthInMbps)
                && java.util.Objects.equals(
                        this.maximumBandwidthInMbps, other.maximumBandwidthInMbps)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.minimumBandwidthInMbps == null
                                ? 43
                                : this.minimumBandwidthInMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumBandwidthInMbps == null
                                ? 43
                                : this.maximumBandwidthInMbps.hashCode());
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
