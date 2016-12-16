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
@JsonDeserialize(builder = CreateRouteTableDetails.Builder.class)
public class CreateRouteTableDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("routeRules")
        private List<RouteRule> routeRules;

        @JsonProperty("vcnId")
        private String vcnId;

        public CreateRouteTableDetails build() {
            return new CreateRouteTableDetails(compartmentId, displayName, routeRules, vcnId);
        }

        @JsonIgnore
        public Builder copy(CreateRouteTableDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .routeRules(o.getRouteRules())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the route table.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

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
    @Valid
    @NotNull
    List<RouteRule> routeRules;

    /**
     * The OCID of the VCN the route table belongs to.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}
