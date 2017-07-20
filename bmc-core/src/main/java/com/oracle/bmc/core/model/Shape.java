/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A compute instance shape that can be used in {@link #launchInstance(LaunchInstanceRequest) launchInstance}.
 * For more information, see [Overview of the Compute Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Compute/Concepts/computeoverview.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Shape.Builder.class)
public class Shape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Shape build() {
            return new Shape(shape);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Shape o) {
            return shape(o.getShape());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the shape. You can enumerate all available shapes by calling
     * {@link #listShapes(ListShapesRequest) listShapes}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String shape;
}
