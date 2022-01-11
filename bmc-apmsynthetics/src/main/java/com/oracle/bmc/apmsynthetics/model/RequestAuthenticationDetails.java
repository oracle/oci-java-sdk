/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details for request HTTP authentication.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestAuthenticationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestAuthenticationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("oauthScheme")
        private OAuthSchemes oauthScheme;

        public Builder oauthScheme(OAuthSchemes oauthScheme) {
            this.oauthScheme = oauthScheme;
            this.__explicitlySet__.add("oauthScheme");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authUserName")
        private String authUserName;

        public Builder authUserName(String authUserName) {
            this.authUserName = authUserName;
            this.__explicitlySet__.add("authUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authUserPassword")
        private String authUserPassword;

        public Builder authUserPassword(String authUserPassword) {
            this.authUserPassword = authUserPassword;
            this.__explicitlySet__.add("authUserPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private String authToken;

        public Builder authToken(String authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authUrl")
        private String authUrl;

        public Builder authUrl(String authUrl) {
            this.authUrl = authUrl;
            this.__explicitlySet__.add("authUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authHeaders")
        private java.util.List<Header> authHeaders;

        public Builder authHeaders(java.util.List<Header> authHeaders) {
            this.authHeaders = authHeaders;
            this.__explicitlySet__.add("authHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authRequestMethod")
        private RequestMethods authRequestMethod;

        public Builder authRequestMethod(RequestMethods authRequestMethod) {
            this.authRequestMethod = authRequestMethod;
            this.__explicitlySet__.add("authRequestMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authRequestPostBody")
        private String authRequestPostBody;

        public Builder authRequestPostBody(String authRequestPostBody) {
            this.authRequestPostBody = authRequestPostBody;
            this.__explicitlySet__.add("authRequestPostBody");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestAuthenticationDetails build() {
            RequestAuthenticationDetails __instance__ =
                    new RequestAuthenticationDetails(
                            oauthScheme,
                            authUserName,
                            authUserPassword,
                            authToken,
                            authUrl,
                            authHeaders,
                            authRequestMethod,
                            authRequestPostBody);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestAuthenticationDetails o) {
            Builder copiedBuilder =
                    oauthScheme(o.getOauthScheme())
                            .authUserName(o.getAuthUserName())
                            .authUserPassword(o.getAuthUserPassword())
                            .authToken(o.getAuthToken())
                            .authUrl(o.getAuthUrl())
                            .authHeaders(o.getAuthHeaders())
                            .authRequestMethod(o.getAuthRequestMethod())
                            .authRequestPostBody(o.getAuthRequestPostBody());

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
     * Request http oauth scheme.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oauthScheme")
    OAuthSchemes oauthScheme;

    /**
     * Username for authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUserName")
    String authUserName;

    /**
     * User password for authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUserPassword")
    String authUserPassword;

    /**
     * Authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    String authToken;

    /**
     * URL to get authetication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUrl")
    String authUrl;

    /**
     * List of authentication headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authHeaders")
    java.util.List<Header> authHeaders;

    /**
     * Request method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authRequestMethod")
    RequestMethods authRequestMethod;

    /**
     * Request post body.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authRequestPostBody")
    String authRequestPostBody;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
