/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PortRange.Builder.class)
public class PortRange {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Integer max;

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        public PortRange build() {
            return new PortRange(max, min);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Min(1)
    @javax.validation.constraints.Max(65535)
    Integer max;

    /**
     * The minimum port number. Must not be greater than the maximum port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Min(1)
    @javax.validation.constraints.Max(65535)
    Integer min;
}
