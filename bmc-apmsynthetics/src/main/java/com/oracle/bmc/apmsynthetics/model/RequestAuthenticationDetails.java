/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestAuthenticationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestAuthenticationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oauthScheme",
        "authUserName",
        "authUserPassword",
        "authToken",
        "authUrl",
        "authHeaders",
        "authRequestMethod",
        "authRequestPostBody"
    })
    public RequestAuthenticationDetails(
            OAuthSchemes oauthScheme,
            String authUserName,
            String authUserPassword,
            String authToken,
            String authUrl,
            java.util.List<Header> authHeaders,
            RequestMethods authRequestMethod,
            String authRequestPostBody) {
        super();
        this.oauthScheme = oauthScheme;
        this.authUserName = authUserName;
        this.authUserPassword = authUserPassword;
        this.authToken = authToken;
        this.authUrl = authUrl;
        this.authHeaders = authHeaders;
        this.authRequestMethod = authRequestMethod;
        this.authRequestPostBody = authRequestPostBody;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Request HTTP OAuth scheme.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oauthScheme")
        private OAuthSchemes oauthScheme;

        /**
         * Request HTTP OAuth scheme.
         * @param oauthScheme the value to set
         * @return this builder
         **/
        public Builder oauthScheme(OAuthSchemes oauthScheme) {
            this.oauthScheme = oauthScheme;
            this.__explicitlySet__.add("oauthScheme");
            return this;
        }
        /**
         * User name for authentication.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authUserName")
        private String authUserName;

        /**
         * User name for authentication.
         * @param authUserName the value to set
         * @return this builder
         **/
        public Builder authUserName(String authUserName) {
            this.authUserName = authUserName;
            this.__explicitlySet__.add("authUserName");
            return this;
        }
        /**
         * User password for authentication.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authUserPassword")
        private String authUserPassword;

        /**
         * User password for authentication.
         * @param authUserPassword the value to set
         * @return this builder
         **/
        public Builder authUserPassword(String authUserPassword) {
            this.authUserPassword = authUserPassword;
            this.__explicitlySet__.add("authUserPassword");
            return this;
        }
        /**
         * Authentication token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authToken")
        private String authToken;

        /**
         * Authentication token.
         * @param authToken the value to set
         * @return this builder
         **/
        public Builder authToken(String authToken) {
            this.authToken = authToken;
            this.__explicitlySet__.add("authToken");
            return this;
        }
        /**
         * URL to get authentication token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authUrl")
        private String authUrl;

        /**
         * URL to get authentication token.
         * @param authUrl the value to set
         * @return this builder
         **/
        public Builder authUrl(String authUrl) {
            this.authUrl = authUrl;
            this.__explicitlySet__.add("authUrl");
            return this;
        }
        /**
         * List of authentication headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authHeaders")
        private java.util.List<Header> authHeaders;

        /**
         * List of authentication headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
         *
         * @param authHeaders the value to set
         * @return this builder
         **/
        public Builder authHeaders(java.util.List<Header> authHeaders) {
            this.authHeaders = authHeaders;
            this.__explicitlySet__.add("authHeaders");
            return this;
        }
        /**
         * Request method.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authRequestMethod")
        private RequestMethods authRequestMethod;

        /**
         * Request method.
         * @param authRequestMethod the value to set
         * @return this builder
         **/
        public Builder authRequestMethod(RequestMethods authRequestMethod) {
            this.authRequestMethod = authRequestMethod;
            this.__explicitlySet__.add("authRequestMethod");
            return this;
        }
        /**
         * Request post body.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authRequestPostBody")
        private String authRequestPostBody;

        /**
         * Request post body.
         * @param authRequestPostBody the value to set
         * @return this builder
         **/
        public Builder authRequestPostBody(String authRequestPostBody) {
            this.authRequestPostBody = authRequestPostBody;
            this.__explicitlySet__.add("authRequestPostBody");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestAuthenticationDetails build() {
            RequestAuthenticationDetails model =
                    new RequestAuthenticationDetails(
                            this.oauthScheme,
                            this.authUserName,
                            this.authUserPassword,
                            this.authToken,
                            this.authUrl,
                            this.authHeaders,
                            this.authRequestMethod,
                            this.authRequestPostBody);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestAuthenticationDetails model) {
            if (model.wasPropertyExplicitlySet("oauthScheme")) {
                this.oauthScheme(model.getOauthScheme());
            }
            if (model.wasPropertyExplicitlySet("authUserName")) {
                this.authUserName(model.getAuthUserName());
            }
            if (model.wasPropertyExplicitlySet("authUserPassword")) {
                this.authUserPassword(model.getAuthUserPassword());
            }
            if (model.wasPropertyExplicitlySet("authToken")) {
                this.authToken(model.getAuthToken());
            }
            if (model.wasPropertyExplicitlySet("authUrl")) {
                this.authUrl(model.getAuthUrl());
            }
            if (model.wasPropertyExplicitlySet("authHeaders")) {
                this.authHeaders(model.getAuthHeaders());
            }
            if (model.wasPropertyExplicitlySet("authRequestMethod")) {
                this.authRequestMethod(model.getAuthRequestMethod());
            }
            if (model.wasPropertyExplicitlySet("authRequestPostBody")) {
                this.authRequestPostBody(model.getAuthRequestPostBody());
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
     * Request HTTP OAuth scheme.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oauthScheme")
    private final OAuthSchemes oauthScheme;

    /**
     * Request HTTP OAuth scheme.
     * @return the value
     **/
    public OAuthSchemes getOauthScheme() {
        return oauthScheme;
    }

    /**
     * User name for authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUserName")
    private final String authUserName;

    /**
     * User name for authentication.
     * @return the value
     **/
    public String getAuthUserName() {
        return authUserName;
    }

    /**
     * User password for authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUserPassword")
    private final String authUserPassword;

    /**
     * User password for authentication.
     * @return the value
     **/
    public String getAuthUserPassword() {
        return authUserPassword;
    }

    /**
     * Authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authToken")
    private final String authToken;

    /**
     * Authentication token.
     * @return the value
     **/
    public String getAuthToken() {
        return authToken;
    }

    /**
     * URL to get authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authUrl")
    private final String authUrl;

    /**
     * URL to get authentication token.
     * @return the value
     **/
    public String getAuthUrl() {
        return authUrl;
    }

    /**
     * List of authentication headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authHeaders")
    private final java.util.List<Header> authHeaders;

    /**
     * List of authentication headers. Example: {@code [{"headerName": "content-type", "headerValue":"json"}]}
     *
     * @return the value
     **/
    public java.util.List<Header> getAuthHeaders() {
        return authHeaders;
    }

    /**
     * Request method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authRequestMethod")
    private final RequestMethods authRequestMethod;

    /**
     * Request method.
     * @return the value
     **/
    public RequestMethods getAuthRequestMethod() {
        return authRequestMethod;
    }

    /**
     * Request post body.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authRequestPostBody")
    private final String authRequestPostBody;

    /**
     * Request post body.
     * @return the value
     **/
    public String getAuthRequestPostBody() {
        return authRequestPostBody;
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
        sb.append("RequestAuthenticationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("oauthScheme=").append(String.valueOf(this.oauthScheme));
        sb.append(", authUserName=").append(String.valueOf(this.authUserName));
        sb.append(", authUserPassword=").append(String.valueOf(this.authUserPassword));
        sb.append(", authToken=").append(String.valueOf(this.authToken));
        sb.append(", authUrl=").append(String.valueOf(this.authUrl));
        sb.append(", authHeaders=").append(String.valueOf(this.authHeaders));
        sb.append(", authRequestMethod=").append(String.valueOf(this.authRequestMethod));
        sb.append(", authRequestPostBody=").append(String.valueOf(this.authRequestPostBody));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestAuthenticationDetails)) {
            return false;
        }

        RequestAuthenticationDetails other = (RequestAuthenticationDetails) o;
        return java.util.Objects.equals(this.oauthScheme, other.oauthScheme)
                && java.util.Objects.equals(this.authUserName, other.authUserName)
                && java.util.Objects.equals(this.authUserPassword, other.authUserPassword)
                && java.util.Objects.equals(this.authToken, other.authToken)
                && java.util.Objects.equals(this.authUrl, other.authUrl)
                && java.util.Objects.equals(this.authHeaders, other.authHeaders)
                && java.util.Objects.equals(this.authRequestMethod, other.authRequestMethod)
                && java.util.Objects.equals(this.authRequestPostBody, other.authRequestPostBody)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.oauthScheme == null ? 43 : this.oauthScheme.hashCode());
        result = (result * PRIME) + (this.authUserName == null ? 43 : this.authUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.authUserPassword == null ? 43 : this.authUserPassword.hashCode());
        result = (result * PRIME) + (this.authToken == null ? 43 : this.authToken.hashCode());
        result = (result * PRIME) + (this.authUrl == null ? 43 : this.authUrl.hashCode());
        result = (result * PRIME) + (this.authHeaders == null ? 43 : this.authHeaders.hashCode());
        result =
                (result * PRIME)
                        + (this.authRequestMethod == null ? 43 : this.authRequestMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.authRequestPostBody == null
                                ? 43
                                : this.authRequestPostBody.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
