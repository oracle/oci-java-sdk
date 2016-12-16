/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
 * Optional object to specify destination ports for a UDP rule. If you specify UDP as the
 * protocol but omit this object, then all destination ports are allowed.
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

        public UdpOptions build() {
            return new UdpOptions(destinationPortRange);
        }

        @JsonIgnore
        public Builder copy(UdpOptions o) {
            return destinationPortRange(o.getDestinationPortRange());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A single destination port or a range.
     **/
    @JsonProperty("destinationPortRange")
    @Valid
    @NotNull
    PortRange destinationPortRange;
}
