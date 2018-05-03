/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A \"path route rule\" to evaluate an incoming URI path, and then route a matching request to the specified backend set.
 * <p>
 * Path route rules apply only to HTTP and HTTPS requests. They have no effect on TCP requests.
 *
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PathRoute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class PathRoute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathMatchType")
        private PathMatchType pathMatchType;

        public Builder pathMatchType(PathMatchType pathMatchType) {
            this.pathMatchType = pathMatchType;
            this.__explicitlySet__.add("pathMatchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathRoute build() {
            PathRoute __instance__ = new PathRoute(backendSetName, path, pathMatchType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathRoute o) {
            Builder copiedBuilder =
                    backendSetName(o.getBackendSetName())
                            .path(o.getPath())
                            .pathMatchType(o.getPathMatchType());

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
     * The name of the target backend set for requests where the incoming URI matches the specified path.
     * <p>
     * Example: `example_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    String backendSetName;

    /**
     * The path string to match against the incoming URI path.
     * <p>
     *  Path strings are case-insensitive.
     * <p>
     *  Asterisk (*) wildcards are not supported.
     * <p>
     *  Regular expressions are not supported.
     * <p>
     * Example: `/example/video/123`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The type of matching to apply to incoming URIs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathMatchType")
    PathMatchType pathMatchType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
