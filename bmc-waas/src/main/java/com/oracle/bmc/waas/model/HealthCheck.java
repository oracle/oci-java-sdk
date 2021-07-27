/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * Health checks monitor the status of your origin servers and only route traffic to the origins that pass the health check. If the health check fails, origin is automatically removed from the load balancing.
 * There is roughly one health check per EDGE POP per period. Any checks that pass will be reported as "healthy".
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HealthCheck.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HealthCheck {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("method")
        private Method method;

        public Builder method(Method method) {
            this.method = method;
            this.__explicitlySet__.add("method");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, String> headers;

        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseCodeGroup")
        private java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup;

        public Builder expectedResponseCodeGroup(
                java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup) {
            this.expectedResponseCodeGroup = expectedResponseCodeGroup;
            this.__explicitlySet__.add("expectedResponseCodeGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResponseTextCheckEnabled")
        private Boolean isResponseTextCheckEnabled;

        public Builder isResponseTextCheckEnabled(Boolean isResponseTextCheckEnabled) {
            this.isResponseTextCheckEnabled = isResponseTextCheckEnabled;
            this.__explicitlySet__.add("isResponseTextCheckEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseText")
        private String expectedResponseText;

        public Builder expectedResponseText(String expectedResponseText) {
            this.expectedResponseText = expectedResponseText;
            this.__explicitlySet__.add("expectedResponseText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthyThreshold")
        private Integer healthyThreshold;

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            this.__explicitlySet__.add("healthyThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unhealthyThreshold")
        private Integer unhealthyThreshold;

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            this.__explicitlySet__.add("unhealthyThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthCheck build() {
            HealthCheck __instance__ =
                    new HealthCheck(
                            isEnabled,
                            method,
                            path,
                            headers,
                            expectedResponseCodeGroup,
                            isResponseTextCheckEnabled,
                            expectedResponseText,
                            intervalInSeconds,
                            timeoutInSeconds,
                            healthyThreshold,
                            unhealthyThreshold);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheck o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .method(o.getMethod())
                            .path(o.getPath())
                            .headers(o.getHeaders())
                            .expectedResponseCodeGroup(o.getExpectedResponseCodeGroup())
                            .isResponseTextCheckEnabled(o.getIsResponseTextCheckEnabled())
                            .expectedResponseText(o.getExpectedResponseText())
                            .intervalInSeconds(o.getIntervalInSeconds())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .healthyThreshold(o.getHealthyThreshold())
                            .unhealthyThreshold(o.getUnhealthyThreshold());

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
     * Enables or disables the health checks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;
    /**
     * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Method {
        Get("GET"),
        Head("HEAD"),
        Post("POST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Method> map;

        static {
            map = new java.util.HashMap<>();
            for (Method v : Method.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Method(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Method create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Method', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    Method method;

    /**
     * Path to visit on your origins when performing the health check.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * HTTP header fields to include in health check requests, expressed as {@code "name": "value"} properties. Because HTTP header field names are case-insensitive, any use of names that are case-insensitive equal to other names will be rejected. If Host is not specified, requests will include a Host header field with value matching the policy's protected domain. If User-Agent is not specified, requests will include a User-Agent header field with value "waf health checks".
     * <p>
     **Note:** The only currently-supported header fields are Host and User-Agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    java.util.Map<String, String> headers;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExpectedResponseCodeGroup {
        _2Xx("2XX"),
        _3Xx("3XX"),
        _4Xx("4XX"),
        _5Xx("5XX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ExpectedResponseCodeGroup> map;

        static {
            map = new java.util.HashMap<>();
            for (ExpectedResponseCodeGroup v : ExpectedResponseCodeGroup.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExpectedResponseCodeGroup(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExpectedResponseCodeGroup create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExpectedResponseCodeGroup', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The HTTP response codes that signify a healthy state.
     * - **2XX:** Success response code group.
     * - **3XX:** Redirection response code group.
     * - **4XX:** Client errors response code group.
     * - **5XX:** Server errors response code group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseCodeGroup")
    java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup;

    /**
     * Enables or disables additional check for predefined text in addition to response code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseTextCheckEnabled")
    Boolean isResponseTextCheckEnabled;

    /**
     * Health check will search for the given text in a case-sensitive manner within the response body and will fail if the text is not found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseText")
    String expectedResponseText;

    /**
     * Time between health checks of an individual origin server, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    Integer intervalInSeconds;

    /**
     * Response timeout represents wait time until request is considered failed, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    Integer timeoutInSeconds;

    /**
     * Number of successful health checks after which the server is marked up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthyThreshold")
    Integer healthyThreshold;

    /**
     * Number of failed health checks after which the server is marked down.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unhealthyThreshold")
    Integer unhealthyThreshold;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
