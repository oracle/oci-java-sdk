/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An individual bandwidth level for virtual circuits.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualCircuitBandwidthShape.Builder.class
)
public class VirtualCircuitBandwidthShape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthInMbps")
        private Integer bandwidthInMbps;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public VirtualCircuitBandwidthShape build() {
            return new VirtualCircuitBandwidthShape(bandwidthInMbps, name);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitBandwidthShape o) {
            return bandwidthInMbps(o.getBandwidthInMbps()).name(o.getName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The bandwidth in Mbps.
     * <p>
     * Example: `10000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthInMbps")
    Integer bandwidthInMbps;

    /**
     * The name of the bandwidth shape.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String name;
}
