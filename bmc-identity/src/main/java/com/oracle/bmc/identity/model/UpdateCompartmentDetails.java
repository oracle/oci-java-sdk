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
@JsonDeserialize(builder = UpdateCompartmentDetails.Builder.class)
public class UpdateCompartmentDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        public UpdateCompartmentDetails build() {
            return new UpdateCompartmentDetails(description);
        }

        @JsonIgnore
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
    @JsonProperty("description")
    @Size(min = 1, max = 400)
    String description;
}
