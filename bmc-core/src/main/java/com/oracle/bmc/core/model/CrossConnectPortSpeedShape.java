/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An individual port speed level for cross-connects.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrossConnectPortSpeedShape.Builder.class
)
public class CrossConnectPortSpeedShape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedInGbps")
        private Integer portSpeedInGbps;

        public CrossConnectPortSpeedShape build() {
            return new CrossConnectPortSpeedShape(name, portSpeedInGbps);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String name;

    /**
     * The port speed in Gbps.
     * <p>
     * Example: `10`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedInGbps")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer portSpeedInGbps;
}
