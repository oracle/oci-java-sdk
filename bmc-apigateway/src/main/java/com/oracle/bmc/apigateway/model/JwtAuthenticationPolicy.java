/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JwtAuthenticationPolicy.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class JwtAuthenticationPolicy extends AuthenticationPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
    String tokenHeader;

    /**
     * The name of the query parameter containing the authentication token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenQueryParam")
    String tokenQueryParam;

    /**
     * The authentication scheme that is to be used when authenticating
     * the token. This must to be provided if \"tokenHeader\" is specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenAuthScheme")
    String tokenAuthScheme;

    /**
     * A list of parties that could have issued the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuers")
    java.util.List<String> issuers;

    /**
     * The list of intended recipients for the token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("audiences")
    java.util.List<String> audiences;

    /**
     * A list of claims which should be validated to consider the token valid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyClaims")
    java.util.List<JsonWebTokenClaim> verifyClaims;

    /**
     * The maximum expected time difference between the system clocks
     * of the token issuer and the API Gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxClockSkewInSeconds")
    Float maxClockSkewInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("publicKeys")
    PublicKeySet publicKeys;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
