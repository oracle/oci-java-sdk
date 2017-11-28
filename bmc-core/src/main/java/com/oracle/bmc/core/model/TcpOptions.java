/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Optional object to specify ports for a TCP rule. If you specify TCP as the
 * protocol but omit this object, then all ports are allowed.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TcpOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TcpOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("destinationPortRange")
        private PortRange destinationPortRange;

        public Builder destinationPortRange(PortRange destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            this.__explicitlySet__.add("destinationPortRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePortRange")
        private PortRange sourcePortRange;

        public Builder sourcePortRange(PortRange sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            this.__explicitlySet__.add("sourcePortRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TcpOptions build() {
            TcpOptions __instance__ = new TcpOptions(destinationPortRange, sourcePortRange);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpOptions o) {
            Builder copiedBuilder =
                    destinationPortRange(o.getDestinationPortRange())
                            .sourcePortRange(o.getSourcePortRange());

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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
