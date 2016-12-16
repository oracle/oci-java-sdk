/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

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
@JsonDeserialize(builder = CreateUserDetails.Builder.class)
public class CreateUserDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

        public CreateUserDetails build() {
            return new CreateUserDetails(compartmentId, name, description);
        }

        @JsonIgnore
        public Builder copy(CreateUserDetails o) {
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
     * The OCID of the tenancy containing the user.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the user during creation. This is the user's login for the Console.
     * The name must be unique across all users in the tenancy and cannot be changed.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the user during creation. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
    String description;
}
