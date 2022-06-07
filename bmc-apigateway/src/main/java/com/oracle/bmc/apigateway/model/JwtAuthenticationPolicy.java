/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate a JWT token present in the header or query parameter. A valid
 * policy must specify either tokenHeader or tokenQueryParam.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JwtAuthenticationPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JwtAuthenticationPolicy extends AuthenticationPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isAnonymousAccessAllowed")
        private Boolean isAnonymousAccessAllowed;

        public Builder isAnonymousAccessAllowed(Boolean isAnonymousAccessAllowed) {
            this.isAnonymousAccessAllowed = isAnonymousAccessAllowed;
            this.__explicitlySet__.add("isAnonymousAccessAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
        private String tokenHeader;

        public Builder tokenHeader(String tokenHeader) {
            this.tokenHeader = tokenHeader;
            this.__explicitlySet__.add("tokenHeader");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
        private String tokenQueryParam;

        public Builder tokenQueryParam(String tokenQueryParam) {
            this.tokenQueryParam = tokenQueryParam;
            this.__explicitlySet__.add("tokenQueryParam");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenAuthScheme")
        private String tokenAuthScheme;

        public Builder tokenAuthScheme(String tokenAuthScheme) {
            this.tokenAuthScheme = tokenAuthScheme;
            this.__explicitlySet__.add("tokenAuthScheme");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issuers")
        private java.util.List<String> issuers;

        public Builder issuers(java.util.List<String> issuers) {
            this.issuers = issuers;
            this.__explicitlySet__.add("issuers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("audiences")
        private java.util.List<String> audiences;

        public Builder audiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            this.__explicitlySet__.add("audiences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyClaims")
        private java.util.List<JsonWebTokenClaim> verifyClaims;

        public Builder verifyClaims(java.util.List<JsonWebTokenClaim> verifyClaims) {
            this.verifyClaims = verifyClaims;
            this.__explicitlySet__.add("verifyClaims");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxClockSkewInSeconds")
        private Float maxClockSkewInSeconds;

        public Builder maxClockSkewInSeconds(Float maxClockSkewInSeconds) {
            this.maxClockSkewInSeconds = maxClockSkewInSeconds;
            this.__explicitlySet__.add("maxClockSkewInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicKeys")
        private PublicKeySet publicKeys;

        public Builder publicKeys(PublicKeySet publicKeys) {
            this.publicKeys = publicKeys;
            this.__explicitlySet__.add("publicKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JwtAuthenticationPolicy build() {
            JwtAuthenticationPolicy __instance__ =
                    new JwtAuthenticationPolicy(
                            isAnonymousAccessAllowed,
                            tokenHeader,
                            tokenQueryParam,
                            tokenAuthScheme,
                            issuers,
                            audiences,
                            verifyClaims,
                            maxClockSkewInSeconds,
                            publicKeys);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JwtAuthenticationPolicy o) {
            Builder copiedBuilder =
                    isAnonymousAccessAllowed(o.getIsAnonymousAccessAllowed())
                            .tokenHeader(o.getTokenHeader())
                            .tokenQueryParam(o.getTokenQueryParam())
                            .tokenAuthScheme(o.getTokenAuthScheme())
                            .issuers(o.getIssuers())
                            .audiences(o.getAudiences())
                            .verifyClaims(o.getVerifyClaims())
                            .maxClockSkewInSeconds(o.getMaxClockSkewInSeconds())
                            .publicKeys(o.getPublicKeys());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public JwtAuthenticationPolicy(
            Boolean isAnonymousAccessAllowed,
            String tokenHeader,
            String tokenQueryParam,
            String tokenAuthScheme,
            java.util.List<String> issuers,
            java.util.List<String> audiences,
            java.util.List<JsonWebTokenClaim> verifyClaims,
            Float maxClockSkewInSeconds,
            PublicKeySet publicKeys) {
        super(isAnonymousAccessAllowed);
        this.tokenHeader = tokenHeader;
        this.tokenQueryParam = tokenQueryParam;
        this.tokenAuthScheme = tokenAuthScheme;
        this.issuers = issuers;
        this.audiences = audiences;
        this.verifyClaims = verifyClaims;
        this.maxClockSkewInSeconds = maxClockSkewInSeconds;
        this.publicKeys = publicKeys;
    }

    /**
     * The name of the header containing the authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenHeader")
    private final String tokenHeader;

    public String getTokenHeader() {
        return tokenHeader;
    }

    /**
     * The name of the query parameter containing the authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
    private final String tokenQueryParam;

    public String getTokenQueryParam() {
        return tokenQueryParam;
    }

    /**
     * The authentication scheme that is to be used when authenticating
     * the token. This must to be provided if "tokenHeader" is specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenAuthScheme")
    private final String tokenAuthScheme;

    public String getTokenAuthScheme() {
        return tokenAuthScheme;
    }

    /**
     * A list of parties that could have issued the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuers")
    private final java.util.List<String> issuers;

    public java.util.List<String> getIssuers() {
        return issuers;
    }

    /**
     * The list of intended recipients for the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("audiences")
    private final java.util.List<String> audiences;

    public java.util.List<String> getAudiences() {
        return audiences;
    }

    /**
     * A list of claims which should be validated to consider the token valid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyClaims")
    private final java.util.List<JsonWebTokenClaim> verifyClaims;

    public java.util.List<JsonWebTokenClaim> getVerifyClaims() {
        return verifyClaims;
    }

    /**
     * The maximum expected time difference between the system clocks
     * of the token issuer and the API Gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxClockSkewInSeconds")
    private final Float maxClockSkewInSeconds;

    public Float getMaxClockSkewInSeconds() {
        return maxClockSkewInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publicKeys")
    private final PublicKeySet publicKeys;

    public PublicKeySet getPublicKeys() {
        return publicKeys;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JwtAuthenticationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append(", tokenHeader=").append(String.valueOf(this.tokenHeader));
        sb.append(", tokenQueryParam=").append(String.valueOf(this.tokenQueryParam));
        sb.append(", tokenAuthScheme=").append(String.valueOf(this.tokenAuthScheme));
        sb.append(", issuers=").append(String.valueOf(this.issuers));
        sb.append(", audiences=").append(String.valueOf(this.audiences));
        sb.append(", verifyClaims=").append(String.valueOf(this.verifyClaims));
        sb.append(", maxClockSkewInSeconds=").append(String.valueOf(this.maxClockSkewInSeconds));
        sb.append(", publicKeys=").append(String.valueOf(this.publicKeys));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JwtAuthenticationPolicy)) {
            return false;
        }

        JwtAuthenticationPolicy other = (JwtAuthenticationPolicy) o;
        return java.util.Objects.equals(this.tokenHeader, other.tokenHeader)
                && java.util.Objects.equals(this.tokenQueryParam, other.tokenQueryParam)
                && java.util.Objects.equals(this.tokenAuthScheme, other.tokenAuthScheme)
                && java.util.Objects.equals(this.issuers, other.issuers)
                && java.util.Objects.equals(this.audiences, other.audiences)
                && java.util.Objects.equals(this.verifyClaims, other.verifyClaims)
                && java.util.Objects.equals(this.maxClockSkewInSeconds, other.maxClockSkewInSeconds)
                && java.util.Objects.equals(this.publicKeys, other.publicKeys)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
        result = (result * PRIME) + (this.issuers == null ? 43 : this.issuers.hashCode());
        result = (result * PRIME) + (this.audiences == null ? 43 : this.audiences.hashCode());
        result = (result * PRIME) + (this.verifyClaims == null ? 43 : this.verifyClaims.hashCode());
        result =
                (result * PRIME)
                        + (this.maxClockSkewInSeconds == null
                                ? 43
                                : this.maxClockSkewInSeconds.hashCode());
        result = (result * PRIME) + (this.publicKeys == null ? 43 : this.publicKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
