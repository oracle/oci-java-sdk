/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateRouteTableDetails.Builder.class
)
public class UpdateRouteTableDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
        private java.util.List<RouteRule> routeRules;

        public UpdateRouteTableDetails build() {
            return new UpdateRouteTableDetails(displayName, routeRules);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The collection of rules used for routing destination IPs to network devices.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
    java.util.List<RouteRule> routeRules;
}
