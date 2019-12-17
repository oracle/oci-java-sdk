/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Enable CORS (Cross-Origin-Resource-Sharing) request handling.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CorsPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CorsPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("allowedOrigins")
        private java.util.List<String> allowedOrigins;

        public Builder allowedOrigins(java.util.List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            this.__explicitlySet__.add("allowedOrigins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
        private java.util.List<String> allowedMethods;

        public Builder allowedMethods(java.util.List<String> allowedMethods) {
            this.allowedMethods = allowedMethods;
            this.__explicitlySet__.add("allowedMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedHeaders")
        private java.util.List<String> allowedHeaders;

        public Builder allowedHeaders(java.util.List<String> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            this.__explicitlySet__.add("allowedHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exposedHeaders")
        private java.util.List<String> exposedHeaders;

        public Builder exposedHeaders(java.util.List<String> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            this.__explicitlySet__.add("exposedHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAllowCredentialsEnabled")
        private Boolean isAllowCredentialsEnabled;

        public Builder isAllowCredentialsEnabled(Boolean isAllowCredentialsEnabled) {
            this.isAllowCredentialsEnabled = isAllowCredentialsEnabled;
            this.__explicitlySet__.add("isAllowCredentialsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
        private Integer maxAgeInSeconds;

        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            this.__explicitlySet__.add("maxAgeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CorsPolicy build() {
            CorsPolicy __instance__ =
                    new CorsPolicy(
                            allowedOrigins,
                            allowedMethods,
                            allowedHeaders,
                            exposedHeaders,
                            isAllowCredentialsEnabled,
                            maxAgeInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CorsPolicy o) {
            Builder copiedBuilder =
                    allowedOrigins(o.getAllowedOrigins())
                            .allowedMethods(o.getAllowedMethods())
                            .allowedHeaders(o.getAllowedHeaders())
                            .exposedHeaders(o.getExposedHeaders())
                            .isAllowCredentialsEnabled(o.getIsAllowCredentialsEnabled())
                            .maxAgeInSeconds(o.getMaxAgeInSeconds());

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
     * The list of allowed origins that the CORS handler will use to respond to CORS requests. The gateway will
     * send the Access-Control-Allow-Origin header with the best origin match for the circumstances. '*' will match
     * any origins, and 'null' will match queries from 'file:' origins. All other origins must be qualified with the
     * scheme, full hostname, and port if necessary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedOrigins")
    java.util.List<String> allowedOrigins;

    /**
     * The list of allowed HTTP methods that will be returned for the preflight OPTIONS request in the
     * Access-Control-Allow-Methods header. '*' will allow all methods.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedMethods")
    java.util.List<String> allowedMethods;

    /**
     * The list of headers that will be allowed from the client via the Access-Control-Allow-Headers header.
     * '*' will allow all headers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHeaders")
    java.util.List<String> allowedHeaders;

    /**
     * The list of headers that the client will be allowed to see from the response as indicated by the
     * Access-Control-Expose-Headers header. '*' will expose all headers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exposedHeaders")
    java.util.List<String> exposedHeaders;

    /**
     * Whether to send the Access-Control-Allow-Credentials header to allow CORS requests with cookies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowCredentialsEnabled")
    Boolean isAllowCredentialsEnabled;

    /**
     * The time in seconds for the client to cache preflight responses. This is sent as the Access-Control-Max-Age
     * if greater than 0.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
    Integer maxAgeInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
