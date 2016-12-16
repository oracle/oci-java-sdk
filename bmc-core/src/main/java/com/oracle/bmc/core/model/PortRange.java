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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = PortRange.Builder.class)
public class PortRange {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("max")
        private Integer max;

        @JsonProperty("min")
        private Integer min;

        public PortRange build() {
            return new PortRange(max, min);
        }

        @JsonIgnore
        public Builder copy(PortRange o) {
            return max(o.getMax()).min(o.getMin());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The maximum port number. Must not be lower than the minimum port number. To specify
     * a single port number, set both the min and max to the same value.
     *
     **/
    @JsonProperty("max")
    @Valid
    @NotNull
    @Min(1)
    @Max(65535)
    Integer max;

    /**
     * The minimum port number. Must not be greater than the maximum port number.
     **/
    @JsonProperty("min")
    @Valid
    @NotNull
    @Min(1)
    @Max(65535)
    Integer min;
}
