/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An individual FastConnect location.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrossConnectLocation.Builder.class
)
public class CrossConnectLocation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public CrossConnectLocation build() {
            return new CrossConnectLocation(description, name);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String description;

    /**
     * The name of the location.
     * <p>
     * Example: `CyrusOne, Chandler, AZ`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String name;
}
