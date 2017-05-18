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
 * An individual port speed level for cross-connects.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CrossConnectPortSpeedShape.Builder.class)
public class CrossConnectPortSpeedShape {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("portSpeedInGbps")
        private Integer portSpeedInGbps;

        public CrossConnectPortSpeedShape build() {
            return new CrossConnectPortSpeedShape(name, portSpeedInGbps);
        }

        @JsonIgnore
        public Builder copy(CrossConnectPortSpeedShape o) {
            return name(o.getName()).portSpeedInGbps(o.getPortSpeedInGbps());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the port speed shape.
     * <p>
     * Example: `10 Gbps`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String name;

    /**
     * The port speed in Gbps.
     * <p>
     * Example: `10`
     *
     **/
    @JsonProperty("portSpeedInGbps")
    @Valid
    @NotNull
    Integer portSpeedInGbps;
}
