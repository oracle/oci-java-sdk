/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A named set of path route rules to add to the load balancer.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePathRouteSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreatePathRouteSetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
        private java.util.List<PathRoute> pathRoutes;

        public Builder pathRoutes(java.util.List<PathRoute> pathRoutes) {
            this.pathRoutes = pathRoutes;
            this.__explicitlySet__.add("pathRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePathRouteSetDetails build() {
            CreatePathRouteSetDetails __instance__ =
                    new CreatePathRouteSetDetails(name, pathRoutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePathRouteSetDetails o) {
            Builder copiedBuilder = name(o.getName()).pathRoutes(o.getPathRoutes());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name for this set of path route rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: `example_path_route_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The set of path route rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
    java.util.List<PathRoute> pathRoutes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
