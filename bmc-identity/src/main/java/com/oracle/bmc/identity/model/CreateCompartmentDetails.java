/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCompartmentDetails.Builder.class
)
public class CreateCompartmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public CreateCompartmentDetails build() {
            return new CreateCompartmentDetails(compartmentId, name, description);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompartmentDetails o) {
            return compartmentId(o.getCompartmentId())
                    .name(o.getName())
                    .description(o.getDescription());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the tenancy containing the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String compartmentId;

    /**
     * The name you assign to the compartment during creation. The name must be unique across all compartments
     * in the tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the compartment during creation. Does not have to be unique, and it's changeable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 400)
    String description;
}
