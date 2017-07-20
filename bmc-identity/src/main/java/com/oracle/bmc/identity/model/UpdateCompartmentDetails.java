/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCompartmentDetails.Builder.class
)
public class UpdateCompartmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public UpdateCompartmentDetails build() {
            return new UpdateCompartmentDetails(description);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCompartmentDetails o) {
            return description(o.getDescription());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The description you assign to the compartment. Does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.constraints.Size(min = 1, max = 400)
    String description;
}
