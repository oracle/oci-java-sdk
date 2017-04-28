/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * An individual bandwidth level for virtual circuits.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = VirtualCircuitBandwidthShape.Builder.class)
public class VirtualCircuitBandwidthShape {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("bandwidthInMbps")
        private Integer bandwidthInMbps;

        @JsonProperty("name")
        private String name;

        public VirtualCircuitBandwidthShape build() {
            return new VirtualCircuitBandwidthShape(bandwidthInMbps, name);
        }

        @JsonIgnore
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
    @JsonProperty("bandwidthInMbps")
    Integer bandwidthInMbps;

    /**
     * The name of the bandwidth shape.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String name;
}
