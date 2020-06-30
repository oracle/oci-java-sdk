/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiSpecification.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApiSpecification {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("routes")
        private java.util.List<ApiSpecificationRoute> routes;

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

    @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
    ApiSpecificationRequestPolicies requestPolicies;

    @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
    ApiSpecificationLoggingPolicies loggingPolicies;

    /**
     * A list of routes that this API exposes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routes")
    java.util.List<ApiSpecificationRoute> routes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
