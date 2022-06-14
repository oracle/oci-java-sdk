/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * The logical configuration of the API exposed by a deployment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiSpecification.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecification {
    @Deprecated
    @java.beans.ConstructorProperties({"requestPolicies", "loggingPolicies", "routes"})
    public ApiSpecification(
            ApiSpecificationRequestPolicies requestPolicies,
            ApiSpecificationLoggingPolicies loggingPolicies,
            java.util.List<ApiSpecificationRoute> routes) {
        super();
        this.requestPolicies = requestPolicies;
        this.loggingPolicies = loggingPolicies;
        this.routes = routes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
        private ApiSpecificationRequestPolicies requestPolicies;

        public Builder requestPolicies(ApiSpecificationRequestPolicies requestPolicies) {
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
        /**
         * A list of routes that this API exposes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routes")
        private java.util.List<ApiSpecificationRoute> routes;

        /**
         * A list of routes that this API exposes.
         * @param routes the value to set
         * @return this builder
         **/
        public Builder routes(java.util.List<ApiSpecificationRoute> routes) {
            this.routes = routes;
            this.__explicitlySet__.add("routes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecification build() {
            ApiSpecification __instance__ =
                    new ApiSpecification(requestPolicies, loggingPolicies, routes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecification o) {
            Builder copiedBuilder =
                    requestPolicies(o.getRequestPolicies())
                            .loggingPolicies(o.getLoggingPolicies())
                            .routes(o.getRoutes());

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

    @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
    private final ApiSpecificationRequestPolicies requestPolicies;

    public ApiSpecificationRequestPolicies getRequestPolicies() {
        return requestPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
    private final ApiSpecificationLoggingPolicies loggingPolicies;

    public ApiSpecificationLoggingPolicies getLoggingPolicies() {
        return loggingPolicies;
    }

    /**
     * A list of routes that this API exposes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routes")
    private final java.util.List<ApiSpecificationRoute> routes;

    /**
     * A list of routes that this API exposes.
     * @return the value
     **/
    public java.util.List<ApiSpecificationRoute> getRoutes() {
        return routes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiSpecification(");
        sb.append("requestPolicies=").append(String.valueOf(this.requestPolicies));
        sb.append(", loggingPolicies=").append(String.valueOf(this.loggingPolicies));
        sb.append(", routes=").append(String.valueOf(this.routes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecification)) {
            return false;
        }

        ApiSpecification other = (ApiSpecification) o;
        return java.util.Objects.equals(this.requestPolicies, other.requestPolicies)
                && java.util.Objects.equals(this.loggingPolicies, other.loggingPolicies)
                && java.util.Objects.equals(this.routes, other.routes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestPolicies == null ? 43 : this.requestPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingPolicies == null ? 43 : this.loggingPolicies.hashCode());
        result = (result * PRIME) + (this.routes == null ? 43 : this.routes.hashCode());
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
