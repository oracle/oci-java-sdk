/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Request configuration details for the REST monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestMonitorConfiguration.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RestMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRedirectionEnabled")
        private Boolean isRedirectionEnabled;

        public Builder isRedirectionEnabled(Boolean isRedirectionEnabled) {
            this.isRedirectionEnabled = isRedirectionEnabled;
            this.__explicitlySet__.add("isRedirectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
        private Boolean isCertificateValidationEnabled;

        public Builder isCertificateValidationEnabled(Boolean isCertificateValidationEnabled) {
            this.isCertificateValidationEnabled = isCertificateValidationEnabled;
            this.__explicitlySet__.add("isCertificateValidationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
        private RequestMethods requestMethod;

        public Builder requestMethod(RequestMethods requestMethod) {
            this.requestMethod = requestMethod;
            this.__explicitlySet__.add("requestMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
        private RequestAuthenticationSchemes reqAuthenticationScheme;

        public Builder reqAuthenticationScheme(
                RequestAuthenticationSchemes reqAuthenticationScheme) {
            this.reqAuthenticationScheme = reqAuthenticationScheme;
            this.__explicitlySet__.add("reqAuthenticationScheme");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationDetails")
        private RequestAuthenticationDetails reqAuthenticationDetails;

        public Builder reqAuthenticationDetails(
                RequestAuthenticationDetails reqAuthenticationDetails) {
            this.reqAuthenticationDetails = reqAuthenticationDetails;
            this.__explicitlySet__.add("reqAuthenticationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.List<Header> requestHeaders;

        public Builder requestHeaders(java.util.List<Header> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestQueryParams")
        private java.util.List<RequestQueryParam> requestQueryParams;

        public Builder requestQueryParams(java.util.List<RequestQueryParam> requestQueryParams) {
            this.requestQueryParams = requestQueryParams;
            this.__explicitlySet__.add("requestQueryParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestPostBody")
        private String requestPostBody;

        public Builder requestPostBody(String requestPostBody) {
            this.requestPostBody = requestPostBody;
            this.__explicitlySet__.add("requestPostBody");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
        private String verifyResponseContent;

        public Builder verifyResponseContent(String verifyResponseContent) {
            this.verifyResponseContent = verifyResponseContent;
            this.__explicitlySet__.add("verifyResponseContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
        private java.util.List<String> verifyResponseCodes;

        public Builder verifyResponseCodes(java.util.List<String> verifyResponseCodes) {
            this.verifyResponseCodes = verifyResponseCodes;
            this.__explicitlySet__.add("verifyResponseCodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestMonitorConfiguration build() {
            RestMonitorConfiguration __instance__ =
                    new RestMonitorConfiguration(
                            isFailureRetried,
                            isRedirectionEnabled,
                            isCertificateValidationEnabled,
                            requestMethod,
                            reqAuthenticationScheme,
                            reqAuthenticationDetails,
                            requestHeaders,
                            requestQueryParams,
                            requestPostBody,
                            verifyResponseContent,
                            verifyResponseCodes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestMonitorConfiguration o) {
            Builder copiedBuilder =
                    isFailureRetried(o.getIsFailureRetried())
                            .isRedirectionEnabled(o.getIsRedirectionEnabled())
                            .isCertificateValidationEnabled(o.getIsCertificateValidationEnabled())
                            .requestMethod(o.getRequestMethod())
                            .reqAuthenticationScheme(o.getReqAuthenticationScheme())
                            .reqAuthenticationDetails(o.getReqAuthenticationDetails())
                            .requestHeaders(o.getRequestHeaders())
                            .requestQueryParams(o.getRequestQueryParams())
                            .requestPostBody(o.getRequestPostBody())
                            .verifyResponseContent(o.getVerifyResponseContent())
                            .verifyResponseCodes(o.getVerifyResponseCodes());

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

    @Deprecated
    public RestMonitorConfiguration(
            Boolean isFailureRetried,
            Boolean isRedirectionEnabled,
            Boolean isCertificateValidationEnabled,
            RequestMethods requestMethod,
            RequestAuthenticationSchemes reqAuthenticationScheme,
            RequestAuthenticationDetails reqAuthenticationDetails,
            java.util.List<Header> requestHeaders,
            java.util.List<RequestQueryParam> requestQueryParams,
            String requestPostBody,
            String verifyResponseContent,
            java.util.List<String> verifyResponseCodes) {
        super(isFailureRetried);
        this.isRedirectionEnabled = isRedirectionEnabled;
        this.isCertificateValidationEnabled = isCertificateValidationEnabled;
        this.requestMethod = requestMethod;
        this.reqAuthenticationScheme = reqAuthenticationScheme;
        this.reqAuthenticationDetails = reqAuthenticationDetails;
        this.requestHeaders = requestHeaders;
        this.requestQueryParams = requestQueryParams;
        this.requestPostBody = requestPostBody;
        this.verifyResponseContent = verifyResponseContent;
        this.verifyResponseCodes = verifyResponseCodes;
    }

    /**
     * If redirection enabled, then redirects will be allowed while accessing target URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRedirectionEnabled")
    Boolean isRedirectionEnabled;

    /**
     * If certificate validation enabled, then call will fail for certificate errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
    Boolean isCertificateValidationEnabled;

    /**
     * Request HTTP method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
    RequestMethods requestMethod;

    /**
     * Request http authentication scheme.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
    RequestAuthenticationSchemes reqAuthenticationScheme;

    @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationDetails")
    RequestAuthenticationDetails reqAuthenticationDetails;

    /**
     * List of request headers. Example: `[{\"headerName\": \"content-type\", \"headerValue\":\"json\"}]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    java.util.List<Header> requestHeaders;

    /**
     * List of request query params. Example: `[{\"paramName\": \"sortOrder\", \"paramValue\": \"asc\"}]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestQueryParams")
    java.util.List<RequestQueryParam> requestQueryParams;

    /**
     * Request post body content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestPostBody")
    String requestPostBody;

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
    String verifyResponseContent;

    /**
     * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
    java.util.List<String> verifyResponseCodes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
