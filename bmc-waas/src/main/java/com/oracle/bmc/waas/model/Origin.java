/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A detailed description of your web application's origin host server. An origin must be defined to set up WAF rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Origin.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Origin {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
        private Integer httpPort;

        public Builder httpPort(Integer httpPort) {
            this.httpPort = httpPort;
            this.__explicitlySet__.add("httpPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
        private Integer httpsPort;

        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            this.__explicitlySet__.add("httpsPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
        private java.util.List<Header> customHeaders;

        public Builder customHeaders(java.util.List<Header> customHeaders) {
            this.customHeaders = customHeaders;
            this.__explicitlySet__.add("customHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Origin build() {
            Origin __instance__ = new Origin(uri, httpPort, httpsPort, customHeaders);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Origin o) {
            Builder copiedBuilder =
                    uri(o.getUri())
                            .httpPort(o.getHttpPort())
                            .httpsPort(o.getHttpsPort())
                            .customHeaders(o.getCustomHeaders());

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
     * The URI of the origin. Does not support paths. Port numbers should be specified in the `httpPort` and `httpsPort` fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * The HTTP port on the origin that the web application listens on. If unspecified, defaults to `80`. If `0` is specified - the origin is not used for HTTP traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpPort")
    Integer httpPort;

    /**
     * The HTTPS port on the origin that the web application listens on. If unspecified, defaults to `443`. If `0` is specified - the origin is not used for HTTPS traffic.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpsPort")
    Integer httpsPort;

    /**
     * A list of HTTP headers to forward to your origin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customHeaders")
    java.util.List<Header> customHeaders;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
