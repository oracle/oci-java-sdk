/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = UpdateInternetGatewayDetails.Builder.class)
public class UpdateInternetGatewayDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("isEnabled")
        private Boolean isEnabled;

        public UpdateInternetGatewayDetails build() {
            return new UpdateInternetGatewayDetails(displayName, isEnabled);
        }

        @JsonIgnore
        public Builder copy(UpdateInternetGatewayDetails o) {
            return displayName(o.getDisplayName()).isEnabled(o.getIsEnabled());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Whether the gateway is enabled.
     **/
    @JsonProperty("isEnabled")
    Boolean isEnabled;
}
