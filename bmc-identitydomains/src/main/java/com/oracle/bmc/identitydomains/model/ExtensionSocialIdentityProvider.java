/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Social Identity Provider Extension Schema <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionSocialIdentityProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionSocialIdentityProvider
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "accountLinkingEnabled",
        "registrationEnabled",
        "status",
        "authzUrl",
        "accessTokenUrl",
        "relayIdpParamMappings",
        "profileUrl",
        "scope",
        "adminScope",
        "consumerKey",
        "consumerSecret",
        "serviceProviderName",
        "clockSkewInSeconds",
        "redirectUrl",
        "discoveryUrl",
        "clientCredentialInPayload",
        "idAttribute"
    })
    public ExtensionSocialIdentityProvider(
            Boolean accountLinkingEnabled,
            Boolean registrationEnabled,
            Status status,
            String authzUrl,
            String accessTokenUrl,
            java.util.List<IdentityProviderRelayIdpParamMappings> relayIdpParamMappings,
            String profileUrl,
            java.util.List<String> scope,
            java.util.List<String> adminScope,
            String consumerKey,
            String consumerSecret,
            String serviceProviderName,
            Integer clockSkewInSeconds,
            String redirectUrl,
            String discoveryUrl,
            Boolean clientCredentialInPayload,
            String idAttribute) {
        super();
        this.accountLinkingEnabled = accountLinkingEnabled;
        this.registrationEnabled = registrationEnabled;
        this.status = status;
        this.authzUrl = authzUrl;
        this.accessTokenUrl = accessTokenUrl;
        this.relayIdpParamMappings = relayIdpParamMappings;
        this.profileUrl = profileUrl;
        this.scope = scope;
        this.adminScope = adminScope;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.serviceProviderName = serviceProviderName;
        this.clockSkewInSeconds = clockSkewInSeconds;
        this.redirectUrl = redirectUrl;
        this.discoveryUrl = discoveryUrl;
        this.clientCredentialInPayload = clientCredentialInPayload;
        this.idAttribute = idAttribute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether account linking is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountLinkingEnabled")
        private Boolean accountLinkingEnabled;

        /**
         * Whether account linking is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param accountLinkingEnabled the value to set
         * @return this builder
         */
        public Builder accountLinkingEnabled(Boolean accountLinkingEnabled) {
            this.accountLinkingEnabled = accountLinkingEnabled;
            this.__explicitlySet__.add("accountLinkingEnabled");
            return this;
        }
        /**
         * Whether registration is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("registrationEnabled")
        private Boolean registrationEnabled;

        /**
         * Whether registration is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param registrationEnabled the value to set
         * @return this builder
         */
        public Builder registrationEnabled(Boolean registrationEnabled) {
            this.registrationEnabled = registrationEnabled;
            this.__explicitlySet__.add("registrationEnabled");
            return this;
        }
        /**
         * Status
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Social IDP Authorization URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authzUrl")
        private String authzUrl;

        /**
         * Social IDP Authorization URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param authzUrl the value to set
         * @return this builder
         */
        public Builder authzUrl(String authzUrl) {
            this.authzUrl = authzUrl;
            this.__explicitlySet__.add("authzUrl");
            return this;
        }
        /**
         * Social IDP Access token URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
        private String accessTokenUrl;

        /**
         * Social IDP Access token URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param accessTokenUrl the value to set
         * @return this builder
         */
        public Builder accessTokenUrl(String accessTokenUrl) {
            this.accessTokenUrl = accessTokenUrl;
            this.__explicitlySet__.add("accessTokenUrl");
            return this;
        }
        /**
         * Relay Param variable for Social IDP
         *
         * <p>*Added In:** 2305190132
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [relayParamKey] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relayIdpParamMappings")
        private java.util.List<IdentityProviderRelayIdpParamMappings> relayIdpParamMappings;

        /**
         * Relay Param variable for Social IDP
         *
         * <p>*Added In:** 2305190132
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [relayParamKey] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param relayIdpParamMappings the value to set
         * @return this builder
         */
        public Builder relayIdpParamMappings(
                java.util.List<IdentityProviderRelayIdpParamMappings> relayIdpParamMappings) {
            this.relayIdpParamMappings = relayIdpParamMappings;
            this.__explicitlySet__.add("relayIdpParamMappings");
            return this;
        }
        /**
         * Social IDP User profile URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
        private String profileUrl;

        /**
         * Social IDP User profile URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param profileUrl the value to set
         * @return this builder
         */
        public Builder profileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
            this.__explicitlySet__.add("profileUrl");
            return this;
        }
        /**
         * Scope to request
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private java.util.List<String> scope;

        /**
         * Scope to request
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(java.util.List<String> scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Admin scope to request
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminScope")
        private java.util.List<String> adminScope;

        /**
         * Admin scope to request
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param adminScope the value to set
         * @return this builder
         */
        public Builder adminScope(java.util.List<String> adminScope) {
            this.adminScope = adminScope;
            this.__explicitlySet__.add("adminScope");
            return this;
        }
        /**
         * Social IDP Client Application Client ID
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consumerKey")
        private String consumerKey;

        /**
         * Social IDP Client Application Client ID
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param consumerKey the value to set
         * @return this builder
         */
        public Builder consumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
            this.__explicitlySet__.add("consumerKey");
            return this;
        }
        /**
         * Social IDP Client Application Client Secret
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: true - returned: default
         * - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consumerSecret")
        private String consumerSecret;

        /**
         * Social IDP Client Application Client Secret
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive:
         * encrypt - multiValued: false - mutability: readWrite - required: true - returned: default
         * - type: string - uniqueness: none
         *
         * @param consumerSecret the value to set
         * @return this builder
         */
        public Builder consumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
            this.__explicitlySet__.add("consumerSecret");
            return this;
        }
        /**
         * Service Provider Name
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderName")
        private String serviceProviderName;

        /**
         * Service Provider Name
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param serviceProviderName the value to set
         * @return this builder
         */
        public Builder serviceProviderName(String serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            this.__explicitlySet__.add("serviceProviderName");
            return this;
        }
        /**
         * Social IDP allowed clock skew time
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSkewInSeconds")
        private Integer clockSkewInSeconds;

        /**
         * Social IDP allowed clock skew time
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param clockSkewInSeconds the value to set
         * @return this builder
         */
        public Builder clockSkewInSeconds(Integer clockSkewInSeconds) {
            this.clockSkewInSeconds = clockSkewInSeconds;
            this.__explicitlySet__.add("clockSkewInSeconds");
            return this;
        }
        /**
         * redirect URL for social idp
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        /**
         * redirect URL for social idp
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param redirectUrl the value to set
         * @return this builder
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }
        /**
         * Discovery URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryUrl")
        private String discoveryUrl;

        /**
         * Discovery URL
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param discoveryUrl the value to set
         * @return this builder
         */
        public Builder discoveryUrl(String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            this.__explicitlySet__.add("discoveryUrl");
            return this;
        }
        /**
         * Whether the client credential is contained in payload
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientCredentialInPayload")
        private Boolean clientCredentialInPayload;

        /**
         * Whether the client credential is contained in payload
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param clientCredentialInPayload the value to set
         * @return this builder
         */
        public Builder clientCredentialInPayload(Boolean clientCredentialInPayload) {
            this.clientCredentialInPayload = clientCredentialInPayload;
            this.__explicitlySet__.add("clientCredentialInPayload");
            return this;
        }
        /**
         * Id attribute used for account linking
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idAttribute")
        private String idAttribute;

        /**
         * Id attribute used for account linking
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param idAttribute the value to set
         * @return this builder
         */
        public Builder idAttribute(String idAttribute) {
            this.idAttribute = idAttribute;
            this.__explicitlySet__.add("idAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionSocialIdentityProvider build() {
            ExtensionSocialIdentityProvider model =
                    new ExtensionSocialIdentityProvider(
                            this.accountLinkingEnabled,
                            this.registrationEnabled,
                            this.status,
                            this.authzUrl,
                            this.accessTokenUrl,
                            this.relayIdpParamMappings,
                            this.profileUrl,
                            this.scope,
                            this.adminScope,
                            this.consumerKey,
                            this.consumerSecret,
                            this.serviceProviderName,
                            this.clockSkewInSeconds,
                            this.redirectUrl,
                            this.discoveryUrl,
                            this.clientCredentialInPayload,
                            this.idAttribute);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionSocialIdentityProvider model) {
            if (model.wasPropertyExplicitlySet("accountLinkingEnabled")) {
                this.accountLinkingEnabled(model.getAccountLinkingEnabled());
            }
            if (model.wasPropertyExplicitlySet("registrationEnabled")) {
                this.registrationEnabled(model.getRegistrationEnabled());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("authzUrl")) {
                this.authzUrl(model.getAuthzUrl());
            }
            if (model.wasPropertyExplicitlySet("accessTokenUrl")) {
                this.accessTokenUrl(model.getAccessTokenUrl());
            }
            if (model.wasPropertyExplicitlySet("relayIdpParamMappings")) {
                this.relayIdpParamMappings(model.getRelayIdpParamMappings());
            }
            if (model.wasPropertyExplicitlySet("profileUrl")) {
                this.profileUrl(model.getProfileUrl());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("adminScope")) {
                this.adminScope(model.getAdminScope());
            }
            if (model.wasPropertyExplicitlySet("consumerKey")) {
                this.consumerKey(model.getConsumerKey());
            }
            if (model.wasPropertyExplicitlySet("consumerSecret")) {
                this.consumerSecret(model.getConsumerSecret());
            }
            if (model.wasPropertyExplicitlySet("serviceProviderName")) {
                this.serviceProviderName(model.getServiceProviderName());
            }
            if (model.wasPropertyExplicitlySet("clockSkewInSeconds")) {
                this.clockSkewInSeconds(model.getClockSkewInSeconds());
            }
            if (model.wasPropertyExplicitlySet("redirectUrl")) {
                this.redirectUrl(model.getRedirectUrl());
            }
            if (model.wasPropertyExplicitlySet("discoveryUrl")) {
                this.discoveryUrl(model.getDiscoveryUrl());
            }
            if (model.wasPropertyExplicitlySet("clientCredentialInPayload")) {
                this.clientCredentialInPayload(model.getClientCredentialInPayload());
            }
            if (model.wasPropertyExplicitlySet("idAttribute")) {
                this.idAttribute(model.getIdAttribute());
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

    /**
     * Whether account linking is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountLinkingEnabled")
    private final Boolean accountLinkingEnabled;

    /**
     * Whether account linking is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAccountLinkingEnabled() {
        return accountLinkingEnabled;
    }

    /**
     * Whether registration is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registrationEnabled")
    private final Boolean registrationEnabled;

    /**
     * Whether registration is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getRegistrationEnabled() {
        return registrationEnabled;
    }

    /**
     * Status
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Created("created"),
        Deleted("deleted"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Social IDP Authorization URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authzUrl")
    private final String authzUrl;

    /**
     * Social IDP Authorization URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAuthzUrl() {
        return authzUrl;
    }

    /**
     * Social IDP Access token URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
    private final String accessTokenUrl;

    /**
     * Social IDP Access token URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    /**
     * Relay Param variable for Social IDP
     *
     * <p>*Added In:** 2305190132
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [relayParamKey] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relayIdpParamMappings")
    private final java.util.List<IdentityProviderRelayIdpParamMappings> relayIdpParamMappings;

    /**
     * Relay Param variable for Social IDP
     *
     * <p>*Added In:** 2305190132
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [relayParamKey] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: default - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdentityProviderRelayIdpParamMappings> getRelayIdpParamMappings() {
        return relayIdpParamMappings;
    }

    /**
     * Social IDP User profile URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
    private final String profileUrl;

    /**
     * Social IDP User profile URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Scope to request
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final java.util.List<String> scope;

    /**
     * Scope to request
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * Admin scope to request
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminScope")
    private final java.util.List<String> adminScope;

    /**
     * Admin scope to request
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getAdminScope() {
        return adminScope;
    }

    /**
     * Social IDP Client Application Client ID
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumerKey")
    private final String consumerKey;

    /**
     * Social IDP Client Application Client ID
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Social IDP Client Application Client Secret
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consumerSecret")
    private final String consumerSecret;

    /**
     * Social IDP Client Application Client Secret
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsSensitive: encrypt -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Service Provider Name
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderName")
    private final String serviceProviderName;

    /**
     * Service Provider Name
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * Social IDP allowed clock skew time
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSkewInSeconds")
    private final Integer clockSkewInSeconds;

    /**
     * Social IDP allowed clock skew time
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getClockSkewInSeconds() {
        return clockSkewInSeconds;
    }

    /**
     * redirect URL for social idp
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    /**
     * redirect URL for social idp
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Discovery URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryUrl")
    private final String discoveryUrl;

    /**
     * Discovery URL
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    /**
     * Whether the client credential is contained in payload
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCredentialInPayload")
    private final Boolean clientCredentialInPayload;

    /**
     * Whether the client credential is contained in payload
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getClientCredentialInPayload() {
        return clientCredentialInPayload;
    }

    /**
     * Id attribute used for account linking
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idAttribute")
    private final String idAttribute;

    /**
     * Id attribute used for account linking
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdAttribute() {
        return idAttribute;
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
        sb.append("ExtensionSocialIdentityProvider(");
        sb.append("super=").append(super.toString());
        sb.append("accountLinkingEnabled=").append(String.valueOf(this.accountLinkingEnabled));
        sb.append(", registrationEnabled=").append(String.valueOf(this.registrationEnabled));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", authzUrl=").append(String.valueOf(this.authzUrl));
        sb.append(", accessTokenUrl=").append(String.valueOf(this.accessTokenUrl));
        sb.append(", relayIdpParamMappings=").append(String.valueOf(this.relayIdpParamMappings));
        sb.append(", profileUrl=").append(String.valueOf(this.profileUrl));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", adminScope=").append(String.valueOf(this.adminScope));
        sb.append(", consumerKey=").append(String.valueOf(this.consumerKey));
        sb.append(", consumerSecret=").append(String.valueOf(this.consumerSecret));
        sb.append(", serviceProviderName=").append(String.valueOf(this.serviceProviderName));
        sb.append(", clockSkewInSeconds=").append(String.valueOf(this.clockSkewInSeconds));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", discoveryUrl=").append(String.valueOf(this.discoveryUrl));
        sb.append(", clientCredentialInPayload=")
                .append(String.valueOf(this.clientCredentialInPayload));
        sb.append(", idAttribute=").append(String.valueOf(this.idAttribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionSocialIdentityProvider)) {
            return false;
        }

        ExtensionSocialIdentityProvider other = (ExtensionSocialIdentityProvider) o;
        return java.util.Objects.equals(this.accountLinkingEnabled, other.accountLinkingEnabled)
                && java.util.Objects.equals(this.registrationEnabled, other.registrationEnabled)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.authzUrl, other.authzUrl)
                && java.util.Objects.equals(this.accessTokenUrl, other.accessTokenUrl)
                && java.util.Objects.equals(this.relayIdpParamMappings, other.relayIdpParamMappings)
                && java.util.Objects.equals(this.profileUrl, other.profileUrl)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.adminScope, other.adminScope)
                && java.util.Objects.equals(this.consumerKey, other.consumerKey)
                && java.util.Objects.equals(this.consumerSecret, other.consumerSecret)
                && java.util.Objects.equals(this.serviceProviderName, other.serviceProviderName)
                && java.util.Objects.equals(this.clockSkewInSeconds, other.clockSkewInSeconds)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.discoveryUrl, other.discoveryUrl)
                && java.util.Objects.equals(
                        this.clientCredentialInPayload, other.clientCredentialInPayload)
                && java.util.Objects.equals(this.idAttribute, other.idAttribute)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.accountLinkingEnabled == null
                                ? 43
                                : this.accountLinkingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationEnabled == null
                                ? 43
                                : this.registrationEnabled.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.authzUrl == null ? 43 : this.authzUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTokenUrl == null ? 43 : this.accessTokenUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.relayIdpParamMappings == null
                                ? 43
                                : this.relayIdpParamMappings.hashCode());
        result = (result * PRIME) + (this.profileUrl == null ? 43 : this.profileUrl.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.adminScope == null ? 43 : this.adminScope.hashCode());
        result = (result * PRIME) + (this.consumerKey == null ? 43 : this.consumerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerSecret == null ? 43 : this.consumerSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceProviderName == null
                                ? 43
                                : this.serviceProviderName.hashCode());
        result =
                (result * PRIME)
                        + (this.clockSkewInSeconds == null
                                ? 43
                                : this.clockSkewInSeconds.hashCode());
        result = (result * PRIME) + (this.redirectUrl == null ? 43 : this.redirectUrl.hashCode());
        result = (result * PRIME) + (this.discoveryUrl == null ? 43 : this.discoveryUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCredentialInPayload == null
                                ? 43
                                : this.clientCredentialInPayload.hashCode());
        result = (result * PRIME) + (this.idAttribute == null ? 43 : this.idAttribute.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
