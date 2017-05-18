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
 * An individual FastConnect location.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CrossConnectLocation.Builder.class)
public class CrossConnectLocation {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        @JsonProperty("name")
        private String name;

        public CrossConnectLocation build() {
            return new CrossConnectLocation(description, name);
        }

        @JsonIgnore
        public Builder copy(CrossConnectLocation o) {
            return description(o.getDescription()).name(o.getName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A description of the location.
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String description;

    /**
     * The name of the location.
     * <p>
     * Example: `CyrusOne, Chandler, AZ`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String name;
}
