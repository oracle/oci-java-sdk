/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRoute.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationRoute {
    @Deprecated
    @java.beans.ConstructorProperties({
        "path",
        "methods",
        "requestPolicies",
        "responsePolicies",
        "loggingPolicies",
        "backend"
    })
    public ApiSpecificationRoute(
            String path,
            java.util.List<Methods> methods,
            ApiSpecificationRouteRequestPolicies requestPolicies,
            ApiSpecificationRouteResponsePolicies responsePolicies,
            ApiSpecificationLoggingPolicies loggingPolicies,
            ApiSpecificationRouteBackend backend) {
        super();
        this.path = path;
        this.methods = methods;
        this.requestPolicies = requestPolicies;
        this.responsePolicies = responsePolicies;
        this.loggingPolicies = loggingPolicies;
        this.backend = backend;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A URL path pattern that must be matched on this route. The path pattern may contain a subset of RFC 6570 identifiers
         * to allow wildcard and parameterized matching.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * A URL path pattern that must be matched on this route. The path pattern may contain a subset of RFC 6570 identifiers
         * to allow wildcard and parameterized matching.
         *
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * A list of allowed methods on this route.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("methods")
        private java.util.List<Methods> methods;

        /**
         * A list of allowed methods on this route.
         *
         * @param methods the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("responsePolicies")
        private ApiSpecificationRouteResponsePolicies responsePolicies;

        public Builder responsePolicies(ApiSpecificationRouteResponsePolicies responsePolicies) {
            this.responsePolicies = responsePolicies;
            this.__explicitlySet__.add("responsePolicies");
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
                            path,
                            methods,
                            requestPolicies,
                            responsePolicies,
                            loggingPolicies,
                            backend);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRoute o) {
            Builder copiedBuilder =
                    path(o.getPath())
                            .methods(o.getMethods())
                            .requestPolicies(o.getRequestPolicies())
                            .responsePolicies(o.getResponsePolicies())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A URL path pattern that must be matched on this route. The path pattern may contain a subset of RFC 6570 identifiers
     * to allow wildcard and parameterized matching.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * A URL path pattern that must be matched on this route. The path pattern may contain a subset of RFC 6570 identifiers
     * to allow wildcard and parameterized matching.
     *
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Methods.class);

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
    private final java.util.List<Methods> methods;

    /**
     * A list of allowed methods on this route.
     *
     * @return the value
     **/
    public java.util.List<Methods> getMethods() {
        return methods;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
    private final ApiSpecificationRouteRequestPolicies requestPolicies;

    public ApiSpecificationRouteRequestPolicies getRequestPolicies() {
        return requestPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responsePolicies")
    private final ApiSpecificationRouteResponsePolicies responsePolicies;

    public ApiSpecificationRouteResponsePolicies getResponsePolicies() {
        return responsePolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
    private final ApiSpecificationLoggingPolicies loggingPolicies;

    public ApiSpecificationLoggingPolicies getLoggingPolicies() {
        return loggingPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backend")
    private final ApiSpecificationRouteBackend backend;

    public ApiSpecificationRouteBackend getBackend() {
        return backend;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiSpecificationRoute(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", methods=").append(String.valueOf(this.methods));
        sb.append(", requestPolicies=").append(String.valueOf(this.requestPolicies));
        sb.append(", responsePolicies=").append(String.valueOf(this.responsePolicies));
        sb.append(", loggingPolicies=").append(String.valueOf(this.loggingPolicies));
        sb.append(", backend=").append(String.valueOf(this.backend));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationRoute)) {
            return false;
        }

        ApiSpecificationRoute other = (ApiSpecificationRoute) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.methods, other.methods)
                && java.util.Objects.equals(this.requestPolicies, other.requestPolicies)
                && java.util.Objects.equals(this.responsePolicies, other.responsePolicies)
                && java.util.Objects.equals(this.loggingPolicies, other.loggingPolicies)
                && java.util.Objects.equals(this.backend, other.backend)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.methods == null ? 43 : this.methods.hashCode());
        result =
                (result * PRIME)
                        + (this.requestPolicies == null ? 43 : this.requestPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.responsePolicies == null ? 43 : this.responsePolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingPolicies == null ? 43 : this.loggingPolicies.hashCode());
        result = (result * PRIME) + (this.backend == null ? 43 : this.backend.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
