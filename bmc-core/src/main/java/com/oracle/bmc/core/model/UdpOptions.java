/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Optional object to specify ports for a UDP rule. If you specify UDP as the
 * protocol but omit this object, then all ports are allowed.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UdpOptions.Builder.class)
public class UdpOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPortRange")
        private PortRange destinationPortRange;

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePortRange")
        private PortRange sourcePortRange;

        public UdpOptions build() {
            return new UdpOptions(destinationPortRange, sourcePortRange);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UdpOptions o) {
            return destinationPortRange(o.getDestinationPortRange())
                    .sourcePortRange(o.getSourcePortRange());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * An inclusive range of allowed destination ports. Use the same number for the min and max
     * to indicate a single port. Defaults to all ports if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPortRange")
    PortRange destinationPortRange;

    /**
     * An inclusive range of allowed source ports. Use the same number for the min and max to
     * indicate a single port. Defaults to all ports if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePortRange")
    PortRange sourcePortRange;
}
