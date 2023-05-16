/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate a token present in the header or query parameter. A valid policy must specify either
 * tokenHeader or tokenQueryParam. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TokenAuthenticationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TokenAuthenticationPolicy extends AuthenticationPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isAnonymousAccessAllowed")
        private Boolean isAnonymousAccessAllowed;

        public Builder isAnonymousAccessAllowed(Boolean isAnonymousAccessAllowed) {
            this.isAnonymousAccessAllowed = isAnonymousAccessAllowed;
            this.__explicitlySet__.add("isAnonymousAccessAllowed");
            return this;
        }
        /** The name of the header containing the authentication token. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
        private String tokenHeader;

        /**
         * The name of the header containing the authentication token.
         *
         * @param tokenHeader the value to set
         * @return this builder
         */
        public Builder tokenHeader(String tokenHeader) {
            this.tokenHeader = tokenHeader;
            this.__explicitlySet__.add("tokenHeader");
            return this;
        }
        /** The name of the query parameter containing the authentication token. */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
        private String tokenQueryParam;

        /**
         * The name of the query parameter containing the authentication token.
         *
         * @param tokenQueryParam the value to set
         * @return this builder
         */
        public Builder tokenQueryParam(String tokenQueryParam) {
            this.tokenQueryParam = tokenQueryParam;
            this.__explicitlySet__.add("tokenQueryParam");
            return this;
        }
        /**
         * The authentication scheme that is to be used when authenticating the token. This must to
         * be provided if "tokenHeader" is specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenAuthScheme")
        private String tokenAuthScheme;

        /**
         * The authentication scheme that is to be used when authenticating the token. This must to
         * be provided if "tokenHeader" is specified.
         *
         * @param tokenAuthScheme the value to set
         * @return this builder
         */
        public Builder tokenAuthScheme(String tokenAuthScheme) {
            this.tokenAuthScheme = tokenAuthScheme;
            this.__explicitlySet__.add("tokenAuthScheme");
            return this;
        }
        /**
         * The maximum expected time difference between the system clocks of the token issuer and
         * the API Gateway.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxClockSkewInSeconds")
        private Float maxClockSkewInSeconds;

        /**
         * The maximum expected time difference between the system clocks of the token issuer and
         * the API Gateway.
         *
         * @param maxClockSkewInSeconds the value to set
         * @return this builder
         */
        public Builder maxClockSkewInSeconds(Float maxClockSkewInSeconds) {
            this.maxClockSkewInSeconds = maxClockSkewInSeconds;
            this.__explicitlySet__.add("maxClockSkewInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationPolicy")
        private TokenAuthenticationValidationPolicy validationPolicy;

        public Builder validationPolicy(TokenAuthenticationValidationPolicy validationPolicy) {
            this.validationPolicy = validationPolicy;
            this.__explicitlySet__.add("validationPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationFailurePolicy")
        private ValidationFailurePolicy validationFailurePolicy;

        public Builder validationFailurePolicy(ValidationFailurePolicy validationFailurePolicy) {
            this.validationFailurePolicy = validationFailurePolicy;
            this.__explicitlySet__.add("validationFailurePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TokenAuthenticationPolicy build() {
            TokenAuthenticationPolicy model =
                    new TokenAuthenticationPolicy(
                            this.isAnonymousAccessAllowed,
                            this.tokenHeader,
                            this.tokenQueryParam,
                            this.tokenAuthScheme,
                            this.maxClockSkewInSeconds,
                            this.validationPolicy,
                            this.validationFailurePolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TokenAuthenticationPolicy model) {
            if (model.wasPropertyExplicitlySet("isAnonymousAccessAllowed")) {
                this.isAnonymousAccessAllowed(model.getIsAnonymousAccessAllowed());
            }
            if (model.wasPropertyExplicitlySet("tokenHeader")) {
                this.tokenHeader(model.getTokenHeader());
            }
            if (model.wasPropertyExplicitlySet("tokenQueryParam")) {
                this.tokenQueryParam(model.getTokenQueryParam());
            }
            if (model.wasPropertyExplicitlySet("tokenAuthScheme")) {
                this.tokenAuthScheme(model.getTokenAuthScheme());
            }
            if (model.wasPropertyExplicitlySet("maxClockSkewInSeconds")) {
                this.maxClockSkewInSeconds(model.getMaxClockSkewInSeconds());
            }
            if (model.wasPropertyExplicitlySet("validationPolicy")) {
                this.validationPolicy(model.getValidationPolicy());
            }
            if (model.wasPropertyExplicitlySet("validationFailurePolicy")) {
                this.validationFailurePolicy(model.getValidationFailurePolicy());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public TokenAuthenticationPolicy(
            Boolean isAnonymousAccessAllowed,
            String tokenHeader,
            String tokenQueryParam,
            String tokenAuthScheme,
            Float maxClockSkewInSeconds,
            TokenAuthenticationValidationPolicy validationPolicy,
            ValidationFailurePolicy validationFailurePolicy) {
        super(isAnonymousAccessAllowed);
        this.tokenHeader = tokenHeader;
        this.tokenQueryParam = tokenQueryParam;
        this.tokenAuthScheme = tokenAuthScheme;
        this.maxClockSkewInSeconds = maxClockSkewInSeconds;
        this.validationPolicy = validationPolicy;
        this.validationFailurePolicy = validationFailurePolicy;
    }

    /** The name of the header containing the authentication token. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
    private final String tokenHeader;

    /**
     * The name of the header containing the authentication token.
     *
     * @return the value
     */
    public String getTokenHeader() {
        return tokenHeader;
    }

    /** The name of the query parameter containing the authentication token. */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
    private final String tokenQueryParam;

    /**
     * The name of the query parameter containing the authentication token.
     *
     * @return the value
     */
    public String getTokenQueryParam() {
        return tokenQueryParam;
    }

    /**
     * The authentication scheme that is to be used when authenticating the token. This must to be
     * provided if "tokenHeader" is specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenAuthScheme")
    private final String tokenAuthScheme;

    /**
     * The authentication scheme that is to be used when authenticating the token. This must to be
     * provided if "tokenHeader" is specified.
     *
     * @return the value
     */
    public String getTokenAuthScheme() {
        return tokenAuthScheme;
    }

    /**
     * The maximum expected time difference between the system clocks of the token issuer and the
     * API Gateway.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxClockSkewInSeconds")
    private final Float maxClockSkewInSeconds;

    /**
     * The maximum expected time difference between the system clocks of the token issuer and the
     * API Gateway.
     *
     * @return the value
     */
    public Float getMaxClockSkewInSeconds() {
        return maxClockSkewInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validationPolicy")
    private final TokenAuthenticationValidationPolicy validationPolicy;

    public TokenAuthenticationValidationPolicy getValidationPolicy() {
        return validationPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validationFailurePolicy")
    private final ValidationFailurePolicy validationFailurePolicy;

    public ValidationFailurePolicy getValidationFailurePolicy() {
        return validationFailurePolicy;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TokenAuthenticationPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tokenHeader=").append(String.valueOf(this.tokenHeader));
        sb.append(", tokenQueryParam=").append(String.valueOf(this.tokenQueryParam));
        sb.append(", tokenAuthScheme=").append(String.valueOf(this.tokenAuthScheme));
        sb.append(", maxClockSkewInSeconds=").append(String.valueOf(this.maxClockSkewInSeconds));
        sb.append(", validationPolicy=").append(String.valueOf(this.validationPolicy));
        sb.append(", validationFailurePolicy=")
                .append(String.valueOf(this.validationFailurePolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TokenAuthenticationPolicy)) {
            return false;
        }

        TokenAuthenticationPolicy other = (TokenAuthenticationPolicy) o;
        return java.util.Objects.equals(this.tokenHeader, other.tokenHeader)
                && java.util.Objects.equals(this.tokenQueryParam, other.tokenQueryParam)
                && java.util.Objects.equals(this.tokenAuthScheme, other.tokenAuthScheme)
                && java.util.Objects.equals(this.maxClockSkewInSeconds, other.maxClockSkewInSeconds)
                && java.util.Objects.equals(this.validationPolicy, other.validationPolicy)
                && java.util.Objects.equals(
                        this.validationFailurePolicy, other.validationFailurePolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tokenHeader == null ? 43 : this.tokenHeader.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenQueryParam == null ? 43 : this.tokenQueryParam.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenAuthScheme == null ? 43 : this.tokenAuthScheme.hashCode());
        result =
                (result * PRIME)
                        + (this.maxClockSkewInSeconds == null
                                ? 43
                                : this.maxClockSkewInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.validationPolicy == null ? 43 : this.validationPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.validationFailurePolicy == null
                                ? 43
                                : this.validationFailurePolicy.hashCode());
        return result;
    }
}
