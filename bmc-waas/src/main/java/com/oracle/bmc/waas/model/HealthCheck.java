/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HealthCheck.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthCheck extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "method",
        "path",
        "headers",
        "expectedResponseCodeGroup",
        "isResponseTextCheckEnabled",
        "expectedResponseText",
        "intervalInSeconds",
        "timeoutInSeconds",
        "healthyThreshold",
        "unhealthyThreshold"
    })
    public HealthCheck(
            Boolean isEnabled,
            Method method,
            String path,
            java.util.Map<String, String> headers,
            java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup,
            Boolean isResponseTextCheckEnabled,
            String expectedResponseText,
            Integer intervalInSeconds,
            Integer timeoutInSeconds,
            Integer healthyThreshold,
            Integer unhealthyThreshold) {
        super();
        this.isEnabled = isEnabled;
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.expectedResponseCodeGroup = expectedResponseCodeGroup;
        this.isResponseTextCheckEnabled = isResponseTextCheckEnabled;
        this.expectedResponseText = expectedResponseText;
        this.intervalInSeconds = intervalInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.healthyThreshold = healthyThreshold;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables or disables the health checks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables or disables the health checks.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("method")
        private Method method;

        /**
         * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
         * @param method the value to set
         * @return this builder
         **/
        public Builder method(Method method) {
            this.method = method;
            this.__explicitlySet__.add("method");
            return this;
        }
        /**
         * Path to visit on your origins when performing the health check.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path to visit on your origins when performing the health check.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * HTTP header fields to include in health check requests, expressed as {@code "name": "value"} properties. Because HTTP header field names are case-insensitive, any use of names that are case-insensitive equal to other names will be rejected. If Host is not specified, requests will include a Host header field with value matching the policy's protected domain. If User-Agent is not specified, requests will include a User-Agent header field with value "waf health checks".
         * <p>
         **Note:** The only currently-supported header fields are Host and User-Agent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.Map<String, String> headers;

        /**
         * HTTP header fields to include in health check requests, expressed as {@code "name": "value"} properties. Because HTTP header field names are case-insensitive, any use of names that are case-insensitive equal to other names will be rejected. If Host is not specified, requests will include a Host header field with value matching the policy's protected domain. If User-Agent is not specified, requests will include a User-Agent header field with value "waf health checks".
         * <p>
         **Note:** The only currently-supported header fields are Host and User-Agent.
         * @param headers the value to set
         * @return this builder
         **/
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }
        /**
         * The HTTP response codes that signify a healthy state.
         * - **2XX:** Success response code group.
         * - **3XX:** Redirection response code group.
         * - **4XX:** Client errors response code group.
         * - **5XX:** Server errors response code group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseCodeGroup")
        private java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup;

        /**
         * The HTTP response codes that signify a healthy state.
         * - **2XX:** Success response code group.
         * - **3XX:** Redirection response code group.
         * - **4XX:** Client errors response code group.
         * - **5XX:** Server errors response code group.
         * @param expectedResponseCodeGroup the value to set
         * @return this builder
         **/
        public Builder expectedResponseCodeGroup(
                java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup) {
            this.expectedResponseCodeGroup = expectedResponseCodeGroup;
            this.__explicitlySet__.add("expectedResponseCodeGroup");
            return this;
        }
        /**
         * Enables or disables additional check for predefined text in addition to response code.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isResponseTextCheckEnabled")
        private Boolean isResponseTextCheckEnabled;

        /**
         * Enables or disables additional check for predefined text in addition to response code.
         * @param isResponseTextCheckEnabled the value to set
         * @return this builder
         **/
        public Builder isResponseTextCheckEnabled(Boolean isResponseTextCheckEnabled) {
            this.isResponseTextCheckEnabled = isResponseTextCheckEnabled;
            this.__explicitlySet__.add("isResponseTextCheckEnabled");
            return this;
        }
        /**
         * Health check will search for the given text in a case-sensitive manner within the response body and will fail if the text is not found.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseText")
        private String expectedResponseText;

        /**
         * Health check will search for the given text in a case-sensitive manner within the response body and will fail if the text is not found.
         * @param expectedResponseText the value to set
         * @return this builder
         **/
        public Builder expectedResponseText(String expectedResponseText) {
            this.expectedResponseText = expectedResponseText;
            this.__explicitlySet__.add("expectedResponseText");
            return this;
        }
        /**
         * Time between health checks of an individual origin server, in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        /**
         * Time between health checks of an individual origin server, in seconds.
         * @param intervalInSeconds the value to set
         * @return this builder
         **/
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }
        /**
         * Response timeout represents wait time until request is considered failed, in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Response timeout represents wait time until request is considered failed, in seconds.
         * @param timeoutInSeconds the value to set
         * @return this builder
         **/
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }
        /**
         * Number of successful health checks after which the server is marked up.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthyThreshold")
        private Integer healthyThreshold;

        /**
         * Number of successful health checks after which the server is marked up.
         * @param healthyThreshold the value to set
         * @return this builder
         **/
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            this.__explicitlySet__.add("healthyThreshold");
            return this;
        }
        /**
         * Number of failed health checks after which the server is marked down.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unhealthyThreshold")
        private Integer unhealthyThreshold;

        /**
         * Number of failed health checks after which the server is marked down.
         * @param unhealthyThreshold the value to set
         * @return this builder
         **/
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            this.__explicitlySet__.add("unhealthyThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthCheck build() {
            HealthCheck model =
                    new HealthCheck(
                            this.isEnabled,
                            this.method,
                            this.path,
                            this.headers,
                            this.expectedResponseCodeGroup,
                            this.isResponseTextCheckEnabled,
                            this.expectedResponseText,
                            this.intervalInSeconds,
                            this.timeoutInSeconds,
                            this.healthyThreshold,
                            this.unhealthyThreshold);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheck model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("method")) {
                this.method(model.getMethod());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
            }
            if (model.wasPropertyExplicitlySet("expectedResponseCodeGroup")) {
                this.expectedResponseCodeGroup(model.getExpectedResponseCodeGroup());
            }
            if (model.wasPropertyExplicitlySet("isResponseTextCheckEnabled")) {
                this.isResponseTextCheckEnabled(model.getIsResponseTextCheckEnabled());
            }
            if (model.wasPropertyExplicitlySet("expectedResponseText")) {
                this.expectedResponseText(model.getExpectedResponseText());
            }
            if (model.wasPropertyExplicitlySet("intervalInSeconds")) {
                this.intervalInSeconds(model.getIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("healthyThreshold")) {
                this.healthyThreshold(model.getHealthyThreshold());
            }
            if (model.wasPropertyExplicitlySet("unhealthyThreshold")) {
                this.unhealthyThreshold(model.getUnhealthyThreshold());
            }
            return this;
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
     * Enables or disables the health checks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables or disables the health checks.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
     **/
    public enum Method {
        Get("GET"),
        Head("HEAD"),
        Post("POST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Method.class);

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
    private final Method method;

    /**
     * An HTTP verb (i.e. HEAD, GET, or POST) to use when performing the health check.
     * @return the value
     **/
    public Method getMethod() {
        return method;
    }

    /**
     * Path to visit on your origins when performing the health check.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path to visit on your origins when performing the health check.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * HTTP header fields to include in health check requests, expressed as {@code "name": "value"} properties. Because HTTP header field names are case-insensitive, any use of names that are case-insensitive equal to other names will be rejected. If Host is not specified, requests will include a Host header field with value matching the policy's protected domain. If User-Agent is not specified, requests will include a User-Agent header field with value "waf health checks".
     * <p>
     **Note:** The only currently-supported header fields are Host and User-Agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.Map<String, String> headers;

    /**
     * HTTP header fields to include in health check requests, expressed as {@code "name": "value"} properties. Because HTTP header field names are case-insensitive, any use of names that are case-insensitive equal to other names will be rejected. If Host is not specified, requests will include a Host header field with value matching the policy's protected domain. If User-Agent is not specified, requests will include a User-Agent header field with value "waf health checks".
     * <p>
     **Note:** The only currently-supported header fields are Host and User-Agent.
     * @return the value
     **/
    public java.util.Map<String, String> getHeaders() {
        return headers;
    }

    /**
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExpectedResponseCodeGroup.class);

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
    private final java.util.List<ExpectedResponseCodeGroup> expectedResponseCodeGroup;

    /**
     * The HTTP response codes that signify a healthy state.
     * - **2XX:** Success response code group.
     * - **3XX:** Redirection response code group.
     * - **4XX:** Client errors response code group.
     * - **5XX:** Server errors response code group.
     * @return the value
     **/
    public java.util.List<ExpectedResponseCodeGroup> getExpectedResponseCodeGroup() {
        return expectedResponseCodeGroup;
    }

    /**
     * Enables or disables additional check for predefined text in addition to response code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseTextCheckEnabled")
    private final Boolean isResponseTextCheckEnabled;

    /**
     * Enables or disables additional check for predefined text in addition to response code.
     * @return the value
     **/
    public Boolean getIsResponseTextCheckEnabled() {
        return isResponseTextCheckEnabled;
    }

    /**
     * Health check will search for the given text in a case-sensitive manner within the response body and will fail if the text is not found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedResponseText")
    private final String expectedResponseText;

    /**
     * Health check will search for the given text in a case-sensitive manner within the response body and will fail if the text is not found.
     * @return the value
     **/
    public String getExpectedResponseText() {
        return expectedResponseText;
    }

    /**
     * Time between health checks of an individual origin server, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    private final Integer intervalInSeconds;

    /**
     * Time between health checks of an individual origin server, in seconds.
     * @return the value
     **/
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /**
     * Response timeout represents wait time until request is considered failed, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Response timeout represents wait time until request is considered failed, in seconds.
     * @return the value
     **/
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * Number of successful health checks after which the server is marked up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthyThreshold")
    private final Integer healthyThreshold;

    /**
     * Number of successful health checks after which the server is marked up.
     * @return the value
     **/
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * Number of failed health checks after which the server is marked down.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unhealthyThreshold")
    private final Integer unhealthyThreshold;

    /**
     * Number of failed health checks after which the server is marked down.
     * @return the value
     **/
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
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
        sb.append("HealthCheck(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", method=").append(String.valueOf(this.method));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(", expectedResponseCodeGroup=")
                .append(String.valueOf(this.expectedResponseCodeGroup));
        sb.append(", isResponseTextCheckEnabled=")
                .append(String.valueOf(this.isResponseTextCheckEnabled));
        sb.append(", expectedResponseText=").append(String.valueOf(this.expectedResponseText));
        sb.append(", intervalInSeconds=").append(String.valueOf(this.intervalInSeconds));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", healthyThreshold=").append(String.valueOf(this.healthyThreshold));
        sb.append(", unhealthyThreshold=").append(String.valueOf(this.unhealthyThreshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthCheck)) {
            return false;
        }

        HealthCheck other = (HealthCheck) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.method, other.method)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.headers, other.headers)
                && java.util.Objects.equals(
                        this.expectedResponseCodeGroup, other.expectedResponseCodeGroup)
                && java.util.Objects.equals(
                        this.isResponseTextCheckEnabled, other.isResponseTextCheckEnabled)
                && java.util.Objects.equals(this.expectedResponseText, other.expectedResponseText)
                && java.util.Objects.equals(this.intervalInSeconds, other.intervalInSeconds)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.healthyThreshold, other.healthyThreshold)
                && java.util.Objects.equals(this.unhealthyThreshold, other.unhealthyThreshold)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.method == null ? 43 : this.method.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedResponseCodeGroup == null
                                ? 43
                                : this.expectedResponseCodeGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.isResponseTextCheckEnabled == null
                                ? 43
                                : this.isResponseTextCheckEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedResponseText == null
                                ? 43
                                : this.expectedResponseText.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInSeconds == null ? 43 : this.intervalInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.healthyThreshold == null ? 43 : this.healthyThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.unhealthyThreshold == null
                                ? 43
                                : this.unhealthyThreshold.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
