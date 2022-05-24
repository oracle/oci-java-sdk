/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Settings for the Authentication Provider.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuthenticationProvider.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuthenticationProvider {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("grantType")
        private AuthenticationGrantType grantType;

        public Builder grantType(AuthenticationGrantType grantType) {
            this.grantType = grantType;
            this.__explicitlySet__.add("grantType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityProvider")
        private AuthenticationIdentityProvider identityProvider;

        public Builder identityProvider(AuthenticationIdentityProvider identityProvider) {
            this.identityProvider = identityProvider;
            this.__explicitlySet__.add("identityProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUrl")
        private String tokenEndpointUrl;

        public Builder tokenEndpointUrl(String tokenEndpointUrl) {
            this.tokenEndpointUrl = tokenEndpointUrl;
            this.__explicitlySet__.add("tokenEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorizationEndpointUrl")
        private String authorizationEndpointUrl;

        public Builder authorizationEndpointUrl(String authorizationEndpointUrl) {
            this.authorizationEndpointUrl = authorizationEndpointUrl;
            this.__explicitlySet__.add("authorizationEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortAuthorizationCodeRequestUrl")
        private String shortAuthorizationCodeRequestUrl;

        public Builder shortAuthorizationCodeRequestUrl(String shortAuthorizationCodeRequestUrl) {
            this.shortAuthorizationCodeRequestUrl = shortAuthorizationCodeRequestUrl;
            this.__explicitlySet__.add("shortAuthorizationCodeRequestUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revokeTokenEndpointUrl")
        private String revokeTokenEndpointUrl;

        public Builder revokeTokenEndpointUrl(String revokeTokenEndpointUrl) {
            this.revokeTokenEndpointUrl = revokeTokenEndpointUrl;
            this.__explicitlySet__.add("revokeTokenEndpointUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private String scopes;

        public Builder scopes(String scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectClaim")
        private String subjectClaim;

        public Builder subjectClaim(String subjectClaim) {
            this.subjectClaim = subjectClaim;
            this.__explicitlySet__.add("subjectClaim");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenRetentionPeriodInDays")
        private Integer refreshTokenRetentionPeriodInDays;

        public Builder refreshTokenRetentionPeriodInDays(
                Integer refreshTokenRetentionPeriodInDays) {
            this.refreshTokenRetentionPeriodInDays = refreshTokenRetentionPeriodInDays;
            this.__explicitlySet__.add("refreshTokenRetentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
        private Boolean isVisible;

        public Builder isVisible(Boolean isVisible) {
            this.isVisible = isVisible;
            this.__explicitlySet__.add("isVisible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationProvider build() {
            AuthenticationProvider __instance__ =
                    new AuthenticationProvider(
                            id,
                            grantType,
                            identityProvider,
                            name,
                            tokenEndpointUrl,
                            authorizationEndpointUrl,
                            shortAuthorizationCodeRequestUrl,
                            revokeTokenEndpointUrl,
                            clientId,
                            scopes,
                            subjectClaim,
                            refreshTokenRetentionPeriodInDays,
                            redirectUrl,
                            isVisible,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationProvider o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .grantType(o.getGrantType())
                            .identityProvider(o.getIdentityProvider())
                            .name(o.getName())
                            .tokenEndpointUrl(o.getTokenEndpointUrl())
                            .authorizationEndpointUrl(o.getAuthorizationEndpointUrl())
                            .shortAuthorizationCodeRequestUrl(
                                    o.getShortAuthorizationCodeRequestUrl())
                            .revokeTokenEndpointUrl(o.getRevokeTokenEndpointUrl())
                            .clientId(o.getClientId())
                            .scopes(o.getScopes())
                            .subjectClaim(o.getSubjectClaim())
                            .refreshTokenRetentionPeriodInDays(
                                    o.getRefreshTokenRetentionPeriodInDays())
                            .redirectUrl(o.getRedirectUrl())
                            .isVisible(o.getIsVisible())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Unique immutable identifier that was assigned when the Authentication Provider was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The grant type for the Authentication Provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("grantType")
    AuthenticationGrantType grantType;

    /**
     * Which type of Identity Provider (IDP) you are using.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityProvider")
    AuthenticationIdentityProvider identityProvider;

    /**
     * A name to identify the Authentication Provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The IDPs URL for requesting access tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokenEndpointUrl")
    String tokenEndpointUrl;

    /**
     * The IDPs URL for the page that users authenticate with by entering the user name and password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationEndpointUrl")
    String authorizationEndpointUrl;

    /**
     * A shortened version of the authorization URL, which you can get from a URL shortener service (one that allows
     * you to send query parameters).  You might need this because the generated authorization-code-request URL
     * could be too long for SMS and older smart phones.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortAuthorizationCodeRequestUrl")
    String shortAuthorizationCodeRequestUrl;

    /**
     * If you want to revoke all the refresh tokens and access tokens of the logged-in user from a dialog flow, then
     * you need the IDP's revoke refresh token URL. If you provide this URL, then you can use the System.OAuth2ResetTokens
     * component to revoke the user's tokens for this service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revokeTokenEndpointUrl")
    String revokeTokenEndpointUrl;

    /**
     * The client ID for the IDP application (OAuth Client) that was registered as described in Identity Provider Registration.
     * With Microsoft identity platform, use the application ID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    String clientId;

    /**
     * A space-separated list of the scopes that must be included when Digital Assistant requests an access token from
     * the provider. Include all the scopes that are required to access the resources. If refresh tokens are enabled,
     * include the scope that\u2019s necessary to get the refresh token (typically offline_access).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    String scopes;

    /**
     * The access-token profile claim to use to identify the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectClaim")
    String subjectClaim;

    /**
     * The number of days to keep the refresh token in the Digital Assistant cache.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenRetentionPeriodInDays")
    Integer refreshTokenRetentionPeriodInDays;

    /**
     * The OAuth Redirect URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    String redirectUrl;

    /**
     * Whether this Authentication Provider is visible in the ODA UI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisible")
    Boolean isVisible;

    /**
     * The Authentication Provider's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
