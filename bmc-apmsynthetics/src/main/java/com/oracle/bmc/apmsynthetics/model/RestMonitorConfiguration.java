/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestMonitorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RestMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /**
         * If redirection enabled, then redirects will be allowed while accessing target URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRedirectionEnabled")
        private Boolean isRedirectionEnabled;

        /**
         * If redirection enabled, then redirects will be allowed while accessing target URL.
         * @param isRedirectionEnabled the value to set
         * @return this builder
         **/
        public Builder isRedirectionEnabled(Boolean isRedirectionEnabled) {
            this.isRedirectionEnabled = isRedirectionEnabled;
            this.__explicitlySet__.add("isRedirectionEnabled");
            return this;
        }
        /**
         * If certificate validation enabled, then call will fail for certificate errors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
        private Boolean isCertificateValidationEnabled;

        /**
         * If certificate validation enabled, then call will fail for certificate errors.
         * @param isCertificateValidationEnabled the value to set
         * @return this builder
         **/
        public Builder isCertificateValidationEnabled(Boolean isCertificateValidationEnabled) {
            this.isCertificateValidationEnabled = isCertificateValidationEnabled;
            this.__explicitlySet__.add("isCertificateValidationEnabled");
            return this;
        }
        /**
         * Request HTTP method.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
        private RequestMethods requestMethod;

        /**
         * Request HTTP method.
         * @param requestMethod the value to set
         * @return this builder
         **/
        public Builder requestMethod(RequestMethods requestMethod) {
            this.requestMethod = requestMethod;
            this.__explicitlySet__.add("requestMethod");
            return this;
        }
        /**
         * Request http authentication scheme.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
        private RequestAuthenticationSchemes reqAuthenticationScheme;

        /**
         * Request http authentication scheme.
         * @param reqAuthenticationScheme the value to set
         * @return this builder
         **/
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
        /**
         * List of request headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.List<Header> requestHeaders;

        /**
         * List of request headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
         *
         * @param requestHeaders the value to set
         * @return this builder
         **/
        public Builder requestHeaders(java.util.List<Header> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }
        /**
         * List of request query params. Example: {@code [{"paramName": "sortOrder", "paramValue": "asc"}]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestQueryParams")
        private java.util.List<RequestQueryParam> requestQueryParams;

        /**
         * List of request query params. Example: {@code [{"paramName": "sortOrder", "paramValue": "asc"}]}
         *
         * @param requestQueryParams the value to set
         * @return this builder
         **/
        public Builder requestQueryParams(java.util.List<RequestQueryParam> requestQueryParams) {
            this.requestQueryParams = requestQueryParams;
            this.__explicitlySet__.add("requestQueryParams");
            return this;
        }
        /**
         * Request post body content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestPostBody")
        private String requestPostBody;

        /**
         * Request post body content.
         * @param requestPostBody the value to set
         * @return this builder
         **/
        public Builder requestPostBody(String requestPostBody) {
            this.requestPostBody = requestPostBody;
            this.__explicitlySet__.add("requestPostBody");
            return this;
        }
        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
        private String verifyResponseContent;

        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         * @param verifyResponseContent the value to set
         * @return this builder
         **/
        public Builder verifyResponseContent(String verifyResponseContent) {
            this.verifyResponseContent = verifyResponseContent;
            this.__explicitlySet__.add("verifyResponseContent");
            return this;
        }
        /**
         * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
        private java.util.List<String> verifyResponseCodes;

        /**
         * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
         *
         * @param verifyResponseCodes the value to set
         * @return this builder
         **/
        public Builder verifyResponseCodes(java.util.List<String> verifyResponseCodes) {
            this.verifyResponseCodes = verifyResponseCodes;
            this.__explicitlySet__.add("verifyResponseCodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestMonitorConfiguration build() {
            RestMonitorConfiguration model =
                    new RestMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.isRedirectionEnabled,
                            this.isCertificateValidationEnabled,
                            this.requestMethod,
                            this.reqAuthenticationScheme,
                            this.reqAuthenticationDetails,
                            this.requestHeaders,
                            this.requestQueryParams,
                            this.requestPostBody,
                            this.verifyResponseContent,
                            this.verifyResponseCodes,
                            this.networkConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("isRedirectionEnabled")) {
                this.isRedirectionEnabled(model.getIsRedirectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isCertificateValidationEnabled")) {
                this.isCertificateValidationEnabled(model.getIsCertificateValidationEnabled());
            }
            if (model.wasPropertyExplicitlySet("requestMethod")) {
                this.requestMethod(model.getRequestMethod());
            }
            if (model.wasPropertyExplicitlySet("reqAuthenticationScheme")) {
                this.reqAuthenticationScheme(model.getReqAuthenticationScheme());
            }
            if (model.wasPropertyExplicitlySet("reqAuthenticationDetails")) {
                this.reqAuthenticationDetails(model.getReqAuthenticationDetails());
            }
            if (model.wasPropertyExplicitlySet("requestHeaders")) {
                this.requestHeaders(model.getRequestHeaders());
            }
            if (model.wasPropertyExplicitlySet("requestQueryParams")) {
                this.requestQueryParams(model.getRequestQueryParams());
            }
            if (model.wasPropertyExplicitlySet("requestPostBody")) {
                this.requestPostBody(model.getRequestPostBody());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseContent")) {
                this.verifyResponseContent(model.getVerifyResponseContent());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseCodes")) {
                this.verifyResponseCodes(model.getVerifyResponseCodes());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
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

    @Deprecated
    public RestMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            Boolean isRedirectionEnabled,
            Boolean isCertificateValidationEnabled,
            RequestMethods requestMethod,
            RequestAuthenticationSchemes reqAuthenticationScheme,
            RequestAuthenticationDetails reqAuthenticationDetails,
            java.util.List<Header> requestHeaders,
            java.util.List<RequestQueryParam> requestQueryParams,
            String requestPostBody,
            String verifyResponseContent,
            java.util.List<String> verifyResponseCodes,
            NetworkConfiguration networkConfiguration) {
        super(isFailureRetried, dnsConfiguration);
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
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * If redirection enabled, then redirects will be allowed while accessing target URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRedirectionEnabled")
    private final Boolean isRedirectionEnabled;

    /**
     * If redirection enabled, then redirects will be allowed while accessing target URL.
     * @return the value
     **/
    public Boolean getIsRedirectionEnabled() {
        return isRedirectionEnabled;
    }

    /**
     * If certificate validation enabled, then call will fail for certificate errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCertificateValidationEnabled")
    private final Boolean isCertificateValidationEnabled;

    /**
     * If certificate validation enabled, then call will fail for certificate errors.
     * @return the value
     **/
    public Boolean getIsCertificateValidationEnabled() {
        return isCertificateValidationEnabled;
    }

    /**
     * Request HTTP method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
    private final RequestMethods requestMethod;

    /**
     * Request HTTP method.
     * @return the value
     **/
    public RequestMethods getRequestMethod() {
        return requestMethod;
    }

    /**
     * Request http authentication scheme.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
    private final RequestAuthenticationSchemes reqAuthenticationScheme;

    /**
     * Request http authentication scheme.
     * @return the value
     **/
    public RequestAuthenticationSchemes getReqAuthenticationScheme() {
        return reqAuthenticationScheme;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationDetails")
    private final RequestAuthenticationDetails reqAuthenticationDetails;

    public RequestAuthenticationDetails getReqAuthenticationDetails() {
        return reqAuthenticationDetails;
    }

    /**
     * List of request headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    private final java.util.List<Header> requestHeaders;

    /**
     * List of request headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
     *
     * @return the value
     **/
    public java.util.List<Header> getRequestHeaders() {
        return requestHeaders;
    }

    /**
     * List of request query params. Example: {@code [{"paramName": "sortOrder", "paramValue": "asc"}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestQueryParams")
    private final java.util.List<RequestQueryParam> requestQueryParams;

    /**
     * List of request query params. Example: {@code [{"paramName": "sortOrder", "paramValue": "asc"}]}
     *
     * @return the value
     **/
    public java.util.List<RequestQueryParam> getRequestQueryParams() {
        return requestQueryParams;
    }

    /**
     * Request post body content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestPostBody")
    private final String requestPostBody;

    /**
     * Request post body content.
     * @return the value
     **/
    public String getRequestPostBody() {
        return requestPostBody;
    }

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
    private final String verifyResponseContent;

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     * @return the value
     **/
    public String getVerifyResponseContent() {
        return verifyResponseContent;
    }

    /**
     * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
    private final java.util.List<String> verifyResponseCodes;

    /**
     * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
     *
     * @return the value
     **/
    public java.util.List<String> getVerifyResponseCodes() {
        return verifyResponseCodes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
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
        sb.append("RestMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isRedirectionEnabled=").append(String.valueOf(this.isRedirectionEnabled));
        sb.append(", isCertificateValidationEnabled=")
                .append(String.valueOf(this.isCertificateValidationEnabled));
        sb.append(", requestMethod=").append(String.valueOf(this.requestMethod));
        sb.append(", reqAuthenticationScheme=")
                .append(String.valueOf(this.reqAuthenticationScheme));
        sb.append(", reqAuthenticationDetails=")
                .append(String.valueOf(this.reqAuthenticationDetails));
        sb.append(", requestHeaders=").append(String.valueOf(this.requestHeaders));
        sb.append(", requestQueryParams=").append(String.valueOf(this.requestQueryParams));
        sb.append(", requestPostBody=").append(String.valueOf(this.requestPostBody));
        sb.append(", verifyResponseContent=").append(String.valueOf(this.verifyResponseContent));
        sb.append(", verifyResponseCodes=").append(String.valueOf(this.verifyResponseCodes));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestMonitorConfiguration)) {
            return false;
        }

        RestMonitorConfiguration other = (RestMonitorConfiguration) o;
        return java.util.Objects.equals(this.isRedirectionEnabled, other.isRedirectionEnabled)
                && java.util.Objects.equals(
                        this.isCertificateValidationEnabled, other.isCertificateValidationEnabled)
                && java.util.Objects.equals(this.requestMethod, other.requestMethod)
                && java.util.Objects.equals(
                        this.reqAuthenticationScheme, other.reqAuthenticationScheme)
                && java.util.Objects.equals(
                        this.reqAuthenticationDetails, other.reqAuthenticationDetails)
                && java.util.Objects.equals(this.requestHeaders, other.requestHeaders)
                && java.util.Objects.equals(this.requestQueryParams, other.requestQueryParams)
                && java.util.Objects.equals(this.requestPostBody, other.requestPostBody)
                && java.util.Objects.equals(this.verifyResponseContent, other.verifyResponseContent)
                && java.util.Objects.equals(this.verifyResponseCodes, other.verifyResponseCodes)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isRedirectionEnabled == null
                                ? 43
                                : this.isRedirectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isCertificateValidationEnabled == null
                                ? 43
                                : this.isCertificateValidationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.requestMethod == null ? 43 : this.requestMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.reqAuthenticationScheme == null
                                ? 43
                                : this.reqAuthenticationScheme.hashCode());
        result =
                (result * PRIME)
                        + (this.reqAuthenticationDetails == null
                                ? 43
                                : this.reqAuthenticationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.requestHeaders == null ? 43 : this.requestHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.requestQueryParams == null
                                ? 43
                                : this.requestQueryParams.hashCode());
        result =
                (result * PRIME)
                        + (this.requestPostBody == null ? 43 : this.requestPostBody.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseContent == null
                                ? 43
                                : this.verifyResponseContent.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseCodes == null
                                ? 43
                                : this.verifyResponseCodes.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        return result;
    }
}
