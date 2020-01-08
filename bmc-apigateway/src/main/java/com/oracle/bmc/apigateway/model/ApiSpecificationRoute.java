/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A single route that forwards requests to a particular backend and may contain some additional policies.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRoute.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ApiSpecificationRoute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("methods")
        private java.util.List<Methods> methods;

        public Builder methods(java.util.List<Methods> methods) {
            this.methods = methods;
            this.__explicitlySet__.add("methods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
        private ApiSpecificationRouteRequestPolicies requestPolicies;

        public Builder requestPolicies(ApiSpecificationRouteRequestPolicies requestPolicies) {
            this.requestPolicies = requestPolicies;
            this.__explicitlySet__.add("requestPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
        private ApiSpecificationLoggingPolicies loggingPolicies;

        public Builder loggingPolicies(ApiSpecificationLoggingPolicies loggingPolicies) {
            this.loggingPolicies = loggingPolicies;
            this.__explicitlySet__.add("loggingPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backend")
        private ApiSpecificationRouteBackend backend;

        public Builder backend(ApiSpecificationRouteBackend backend) {
            this.backend = backend;
            this.__explicitlySet__.add("backend");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRoute build() {
            ApiSpecificationRoute __instance__ =
                    new ApiSpecificationRoute(
                            path, methods, requestPolicies, loggingPolicies, backend);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRoute o) {
            Builder copiedBuilder =
                    path(o.getPath())
                            .methods(o.getMethods())
                            .requestPolicies(o.getRequestPolicies())
                            .loggingPolicies(o.getLoggingPolicies())
                            .backend(o.getBackend());

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
     * A URL path pattern that must be matched on this route. The path pattern may contain a subset of RFC 6570 identifiers
     * to allow wildcard and parameterized matching.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Methods {
        Any("ANY"),
        Head("HEAD"),
        Get("GET"),
        Post("POST"),
        Put("PUT"),
        Patch("PATCH"),
        Delete("DELETE"),
        Options("OPTIONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Methods> map;

        static {
            map = new java.util.HashMap<>();
            for (Methods v : Methods.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Methods(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Methods create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Methods', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A list of allowed methods on this route.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("methods")
    java.util.List<Methods> methods;

    @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
    ApiSpecificationRouteRequestPolicies requestPolicies;

    @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
    ApiSpecificationLoggingPolicies loggingPolicies;

    @com.fasterxml.jackson.annotation.JsonProperty("backend")
    ApiSpecificationRouteBackend backend;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
