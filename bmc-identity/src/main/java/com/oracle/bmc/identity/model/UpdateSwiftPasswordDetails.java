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
@JsonDeserialize(builder = UpdateSwiftPasswordDetails.Builder.class)
public class UpdateSwiftPasswordDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        public UpdateSwiftPasswordDetails build() {
            return new UpdateSwiftPasswordDetails(description);
        }

        @JsonIgnore
        public Builder copy(UpdateSwiftPasswordDetails o) {
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
     * The description you assign to the Swift password. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("description")
    String description;
}
