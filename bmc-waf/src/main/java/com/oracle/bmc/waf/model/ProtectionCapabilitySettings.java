/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Settings for protection capabilities
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionCapabilitySettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProtectionCapabilitySettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfArguments")
        private Integer maxNumberOfArguments;

        public Builder maxNumberOfArguments(Integer maxNumberOfArguments) {
            this.maxNumberOfArguments = maxNumberOfArguments;
            this.__explicitlySet__.add("maxNumberOfArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSingleArgumentLength")
        private Integer maxSingleArgumentLength;

        public Builder maxSingleArgumentLength(Integer maxSingleArgumentLength) {
            this.maxSingleArgumentLength = maxSingleArgumentLength;
            this.__explicitlySet__.add("maxSingleArgumentLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalArgumentLength")
        private Integer maxTotalArgumentLength;

        public Builder maxTotalArgumentLength(Integer maxTotalArgumentLength) {
            this.maxTotalArgumentLength = maxTotalArgumentLength;
            this.__explicitlySet__.add("maxTotalArgumentLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaders")
        private Integer maxHttpRequestHeaders;

        public Builder maxHttpRequestHeaders(Integer maxHttpRequestHeaders) {
            this.maxHttpRequestHeaders = maxHttpRequestHeaders;
            this.__explicitlySet__.add("maxHttpRequestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaderLength")
        private Integer maxHttpRequestHeaderLength;

        public Builder maxHttpRequestHeaderLength(Integer maxHttpRequestHeaderLength) {
            this.maxHttpRequestHeaderLength = maxHttpRequestHeaderLength;
            this.__explicitlySet__.add("maxHttpRequestHeaderLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
        private java.util.List<String> allowedHttpMethods;

        public Builder allowedHttpMethods(java.util.List<String> allowedHttpMethods) {
            this.allowedHttpMethods = allowedHttpMethods;
            this.__explicitlySet__.add("allowedHttpMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilitySettings build() {
            ProtectionCapabilitySettings __instance__ =
                    new ProtectionCapabilitySettings(
                            maxNumberOfArguments,
                            maxSingleArgumentLength,
                            maxTotalArgumentLength,
                            maxHttpRequestHeaders,
                            maxHttpRequestHeaderLength,
                            allowedHttpMethods);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilitySettings o) {
            Builder copiedBuilder =
                    maxNumberOfArguments(o.getMaxNumberOfArguments())
                            .maxSingleArgumentLength(o.getMaxSingleArgumentLength())
                            .maxTotalArgumentLength(o.getMaxTotalArgumentLength())
                            .maxHttpRequestHeaders(o.getMaxHttpRequestHeaders())
                            .maxHttpRequestHeaderLength(o.getMaxHttpRequestHeaderLength())
                            .allowedHttpMethods(o.getAllowedHttpMethods());

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
     * Maximum number of arguments allowed. Used in protection capability 920380: Number of Arguments Limits.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfArguments")
    Integer maxNumberOfArguments;

    /**
     * Maximum allowed length of a single argument. Used in protection capability 920370: Limit argument value length.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSingleArgumentLength")
    Integer maxSingleArgumentLength;

    /**
     * Maximum allowed total length of all arguments. Used in protection capability 920390: Limit arguments total length.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalArgumentLength")
    Integer maxTotalArgumentLength;

    /**
     * Maximum number of headers allowed in an HTTP request. Used in protection capability 9200014: Limit Number of Request Headers.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaders")
    Integer maxHttpRequestHeaders;

    /**
     * Maximum allowed length of headers in an HTTP request. Used in protection capability: 9200024: Limit length of request header size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxHttpRequestHeaderLength")
    Integer maxHttpRequestHeaderLength;

    /**
     * List of allowed HTTP methods. Each value as a RFC7230 formated token string.
     * Used in protection capability 911100: Restrict HTTP Request Methods.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
    java.util.List<String> allowedHttpMethods;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
