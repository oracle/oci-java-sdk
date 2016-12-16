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
@JsonDeserialize(builder = UpdateStateDetails.Builder.class)
public class UpdateStateDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("blocked")
        private Boolean blocked;

        public UpdateStateDetails build() {
            return new UpdateStateDetails(blocked);
        }

        @JsonIgnore
        public Builder copy(UpdateStateDetails o) {
            return blocked(o.getBlocked());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Update state to blocked or unblocked. Only \"false\" is supported (for changing the state to unblocked).
     *
     **/
    @JsonProperty("blocked")
    Boolean blocked;
}
