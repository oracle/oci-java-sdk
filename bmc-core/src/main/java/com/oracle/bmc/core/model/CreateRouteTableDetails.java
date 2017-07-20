/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRouteTableDetails.Builder.class
)
public class CreateRouteTableDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
        private java.util.List<RouteRule> routeRules;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public CreateRouteTableDetails build() {
            return new CreateRouteTableDetails(compartmentId, displayName, routeRules, vcnId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The collection of rules used for routing destination IPs to network devices.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<RouteRule> routeRules;

    /**
     * The OCID of the VCN the route table belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;
}
