/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = UpdateRouteTableDetails.Builder.class)
public class UpdateRouteTableDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("routeRules")
        private List<RouteRule> routeRules;

        public UpdateRouteTableDetails build() {
            return new UpdateRouteTableDetails(displayName, routeRules);
        }

        @JsonIgnore
        public Builder copy(UpdateRouteTableDetails o) {
            return displayName(o.getDisplayName()).routeRules(o.getRouteRules());
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
     * The collection of rules used for routing destination IPs to network devices.
     **/
    @JsonProperty("routeRules")
    List<RouteRule> routeRules;
}
