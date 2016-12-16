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
 * Optional object to specify destination ports for a TCP rule. If you specify TCP as the
 * protocol but omit this object, then all destination ports are allowed.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = TcpOptions.Builder.class)
public class TcpOptions {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("destinationPortRange")
        private PortRange destinationPortRange;

        public TcpOptions build() {
            return new TcpOptions(destinationPortRange);
        }

        @JsonIgnore
        public Builder copy(TcpOptions o) {
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
