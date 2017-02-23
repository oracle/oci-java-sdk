/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
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
 * Optional object to specify ports for a UDP rule. If you specify UDP as the
 * protocol but omit this object, then all ports are allowed.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UdpOptions.Builder.class)
public class UdpOptions {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("destinationPortRange")
        private PortRange destinationPortRange;

        @JsonProperty("sourcePortRange")
        private PortRange sourcePortRange;

        public UdpOptions build() {
            return new UdpOptions(destinationPortRange, sourcePortRange);
        }

        @JsonIgnore
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
    @JsonProperty("destinationPortRange")
    PortRange destinationPortRange;

    /**
     * An inclusive range of allowed source ports. Use the same number for the min and max to
     * indicate a single port. Defaults to all ports if not specified.
     *
     **/
    @JsonProperty("sourcePortRange")
    PortRange sourcePortRange;
}
