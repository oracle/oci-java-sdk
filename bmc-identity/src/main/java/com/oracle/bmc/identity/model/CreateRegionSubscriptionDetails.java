/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = CreateRegionSubscriptionDetails.Builder.class)
public class CreateRegionSubscriptionDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("regionKey")
        private String regionKey;

        public CreateRegionSubscriptionDetails build() {
            return new CreateRegionSubscriptionDetails(regionKey);
        }

        @JsonIgnore
        public Builder copy(CreateRegionSubscriptionDetails o) {
            return regionKey(o.getRegionKey());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The regions's key.
     * <p>
     * Allowed values are:
     * - `PHX`
     * - `IAD`
     * <p>
     * Example: `PHX`
     *
     **/
    @JsonProperty("regionKey")
    @Valid
    @NotNull
    @Size(min = 1, max = 16)
    String regionKey;
}
