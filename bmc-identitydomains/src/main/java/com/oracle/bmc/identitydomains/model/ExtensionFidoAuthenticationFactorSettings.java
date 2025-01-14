/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage Multi-Factor Authentication settings of fido
 * authentication <br>
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
        builder = ExtensionFidoAuthenticationFactorSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionFidoAuthenticationFactorSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attestation",
        "authenticatorSelectionAttachment",
        "authenticatorSelectionUserVerification",
        "authenticatorSelectionResidentKey",
        "timeout",
        "authenticatorSelectionRequireResidentKey",
        "publicKeyTypes",
        "excludeCredentials",
        "domainValidationLevel"
    })
    public ExtensionFidoAuthenticationFactorSettings(
            Attestation attestation,
            AuthenticatorSelectionAttachment authenticatorSelectionAttachment,
            AuthenticatorSelectionUserVerification authenticatorSelectionUserVerification,
            AuthenticatorSelectionResidentKey authenticatorSelectionResidentKey,
            Integer timeout,
            Boolean authenticatorSelectionRequireResidentKey,
            java.util.List<PublicKeyTypes> publicKeyTypes,
            Boolean excludeCredentials,
            Integer domainValidationLevel) {
        super();
        this.attestation = attestation;
        this.authenticatorSelectionAttachment = authenticatorSelectionAttachment;
        this.authenticatorSelectionUserVerification = authenticatorSelectionUserVerification;
        this.authenticatorSelectionResidentKey = authenticatorSelectionResidentKey;
        this.timeout = timeout;
        this.authenticatorSelectionRequireResidentKey = authenticatorSelectionRequireResidentKey;
        this.publicKeyTypes = publicKeyTypes;
        this.excludeCredentials = excludeCredentials;
        this.domainValidationLevel = domainValidationLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Attribute used to define the type of attestation required.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attestation")
        private Attestation attestation;

        /**
         * Attribute used to define the type of attestation required.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param attestation the value to set
         * @return this builder
         */
        public Builder attestation(Attestation attestation) {
            this.attestation = attestation;
            this.__explicitlySet__.add("attestation");
            return this;
        }
        /**
         * Attribute used to define authenticator selection attachment.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionAttachment")
        private AuthenticatorSelectionAttachment authenticatorSelectionAttachment;

        /**
         * Attribute used to define authenticator selection attachment.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param authenticatorSelectionAttachment the value to set
         * @return this builder
         */
        public Builder authenticatorSelectionAttachment(
                AuthenticatorSelectionAttachment authenticatorSelectionAttachment) {
            this.authenticatorSelectionAttachment = authenticatorSelectionAttachment;
            this.__explicitlySet__.add("authenticatorSelectionAttachment");
            return this;
        }
        /**
         * Attribute used to define authenticator selection verification.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionUserVerification")
        private AuthenticatorSelectionUserVerification authenticatorSelectionUserVerification;

        /**
         * Attribute used to define authenticator selection verification.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param authenticatorSelectionUserVerification the value to set
         * @return this builder
         */
        public Builder authenticatorSelectionUserVerification(
                AuthenticatorSelectionUserVerification authenticatorSelectionUserVerification) {
            this.authenticatorSelectionUserVerification = authenticatorSelectionUserVerification;
            this.__explicitlySet__.add("authenticatorSelectionUserVerification");
            return this;
        }
        /**
         * Attribute used to define authenticator selection resident key requirement.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionResidentKey")
        private AuthenticatorSelectionResidentKey authenticatorSelectionResidentKey;

        /**
         * Attribute used to define authenticator selection resident key requirement.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param authenticatorSelectionResidentKey the value to set
         * @return this builder
         */
        public Builder authenticatorSelectionResidentKey(
                AuthenticatorSelectionResidentKey authenticatorSelectionResidentKey) {
            this.authenticatorSelectionResidentKey = authenticatorSelectionResidentKey;
            this.__explicitlySet__.add("authenticatorSelectionResidentKey");
            return this;
        }
        /**
         * Timeout for the fido authentication to complete
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - idcsMaxValue: 600000 - idcsMinValue: 10000 - required: true - returned:
         * default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private Integer timeout;

        /**
         * Timeout for the fido authentication to complete
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - idcsMaxValue: 600000 - idcsMinValue: 10000 - required: true - returned:
         * default - type: integer - uniqueness: none
         *
         * @param timeout the value to set
         * @return this builder
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }
        /**
         * Flag used to indicate authenticator selection is required or not
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionRequireResidentKey")
        private Boolean authenticatorSelectionRequireResidentKey;

        /**
         * Flag used to indicate authenticator selection is required or not
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param authenticatorSelectionRequireResidentKey the value to set
         * @return this builder
         */
        public Builder authenticatorSelectionRequireResidentKey(
                Boolean authenticatorSelectionRequireResidentKey) {
            this.authenticatorSelectionRequireResidentKey =
                    authenticatorSelectionRequireResidentKey;
            this.__explicitlySet__.add("authenticatorSelectionRequireResidentKey");
            return this;
        }
        /**
         * List of server supported public key algorithms
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyTypes")
        private java.util.List<PublicKeyTypes> publicKeyTypes;

        /**
         * List of server supported public key algorithms
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param publicKeyTypes the value to set
         * @return this builder
         */
        public Builder publicKeyTypes(java.util.List<PublicKeyTypes> publicKeyTypes) {
            this.publicKeyTypes = publicKeyTypes;
            this.__explicitlySet__.add("publicKeyTypes");
            return this;
        }
        /**
         * Flag used to indicate whether we need to restrict creation of multiple credentials in
         * same authenticator
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeCredentials")
        private Boolean excludeCredentials;

        /**
         * Flag used to indicate whether we need to restrict creation of multiple credentials in
         * same authenticator
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param excludeCredentials the value to set
         * @return this builder
         */
        public Builder excludeCredentials(Boolean excludeCredentials) {
            this.excludeCredentials = excludeCredentials;
            this.__explicitlySet__.add("excludeCredentials");
            return this;
        }
        /**
         * Number of domain levels Oracle Identity Cloud Service should use for origin comparision
         *
         * <p>*Added In:** 2109020413
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - idcsMaxValue: 2 - idcsMinValue: 0 - required: false - returned: default -
         * type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainValidationLevel")
        private Integer domainValidationLevel;

        /**
         * Number of domain levels Oracle Identity Cloud Service should use for origin comparision
         *
         * <p>*Added In:** 2109020413
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - idcsMaxValue: 2 - idcsMinValue: 0 - required: false - returned: default -
         * type: integer - uniqueness: none
         *
         * @param domainValidationLevel the value to set
         * @return this builder
         */
        public Builder domainValidationLevel(Integer domainValidationLevel) {
            this.domainValidationLevel = domainValidationLevel;
            this.__explicitlySet__.add("domainValidationLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionFidoAuthenticationFactorSettings build() {
            ExtensionFidoAuthenticationFactorSettings model =
                    new ExtensionFidoAuthenticationFactorSettings(
                            this.attestation,
                            this.authenticatorSelectionAttachment,
                            this.authenticatorSelectionUserVerification,
                            this.authenticatorSelectionResidentKey,
                            this.timeout,
                            this.authenticatorSelectionRequireResidentKey,
                            this.publicKeyTypes,
                            this.excludeCredentials,
                            this.domainValidationLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionFidoAuthenticationFactorSettings model) {
            if (model.wasPropertyExplicitlySet("attestation")) {
                this.attestation(model.getAttestation());
            }
            if (model.wasPropertyExplicitlySet("authenticatorSelectionAttachment")) {
                this.authenticatorSelectionAttachment(model.getAuthenticatorSelectionAttachment());
            }
            if (model.wasPropertyExplicitlySet("authenticatorSelectionUserVerification")) {
                this.authenticatorSelectionUserVerification(
                        model.getAuthenticatorSelectionUserVerification());
            }
            if (model.wasPropertyExplicitlySet("authenticatorSelectionResidentKey")) {
                this.authenticatorSelectionResidentKey(
                        model.getAuthenticatorSelectionResidentKey());
            }
            if (model.wasPropertyExplicitlySet("timeout")) {
                this.timeout(model.getTimeout());
            }
            if (model.wasPropertyExplicitlySet("authenticatorSelectionRequireResidentKey")) {
                this.authenticatorSelectionRequireResidentKey(
                        model.getAuthenticatorSelectionRequireResidentKey());
            }
            if (model.wasPropertyExplicitlySet("publicKeyTypes")) {
                this.publicKeyTypes(model.getPublicKeyTypes());
            }
            if (model.wasPropertyExplicitlySet("excludeCredentials")) {
                this.excludeCredentials(model.getExcludeCredentials());
            }
            if (model.wasPropertyExplicitlySet("domainValidationLevel")) {
                this.domainValidationLevel(model.getDomainValidationLevel());
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
     * Attribute used to define the type of attestation required.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum Attestation implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Direct("DIRECT"),
        Indirect("INDIRECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Attestation.class);

        private final String value;
        private static java.util.Map<String, Attestation> map;

        static {
            map = new java.util.HashMap<>();
            for (Attestation v : Attestation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Attestation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Attestation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Attestation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Attribute used to define the type of attestation required.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attestation")
    private final Attestation attestation;

    /**
     * Attribute used to define the type of attestation required.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Attestation getAttestation() {
        return attestation;
    }

    /**
     * Attribute used to define authenticator selection attachment.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum AuthenticatorSelectionAttachment implements com.oracle.bmc.http.internal.BmcEnum {
        Platform("PLATFORM"),
        CrossPlatform("CROSS-PLATFORM"),
        Both("BOTH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticatorSelectionAttachment.class);

        private final String value;
        private static java.util.Map<String, AuthenticatorSelectionAttachment> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticatorSelectionAttachment v : AuthenticatorSelectionAttachment.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticatorSelectionAttachment(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticatorSelectionAttachment create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticatorSelectionAttachment', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Attribute used to define authenticator selection attachment.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionAttachment")
    private final AuthenticatorSelectionAttachment authenticatorSelectionAttachment;

    /**
     * Attribute used to define authenticator selection attachment.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public AuthenticatorSelectionAttachment getAuthenticatorSelectionAttachment() {
        return authenticatorSelectionAttachment;
    }

    /**
     * Attribute used to define authenticator selection verification.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum AuthenticatorSelectionUserVerification
            implements com.oracle.bmc.http.internal.BmcEnum {
        Required("REQUIRED"),
        Preferred("PREFERRED"),
        Discouraged("DISCOURAGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticatorSelectionUserVerification.class);

        private final String value;
        private static java.util.Map<String, AuthenticatorSelectionUserVerification> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticatorSelectionUserVerification v :
                    AuthenticatorSelectionUserVerification.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticatorSelectionUserVerification(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticatorSelectionUserVerification create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticatorSelectionUserVerification', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Attribute used to define authenticator selection verification.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionUserVerification")
    private final AuthenticatorSelectionUserVerification authenticatorSelectionUserVerification;

    /**
     * Attribute used to define authenticator selection verification.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public AuthenticatorSelectionUserVerification getAuthenticatorSelectionUserVerification() {
        return authenticatorSelectionUserVerification;
    }

    /**
     * Attribute used to define authenticator selection resident key requirement.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum AuthenticatorSelectionResidentKey implements com.oracle.bmc.http.internal.BmcEnum {
        Required("REQUIRED"),
        Preferred("PREFERRED"),
        Discouraged("DISCOURAGED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticatorSelectionResidentKey.class);

        private final String value;
        private static java.util.Map<String, AuthenticatorSelectionResidentKey> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticatorSelectionResidentKey v : AuthenticatorSelectionResidentKey.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticatorSelectionResidentKey(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticatorSelectionResidentKey create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticatorSelectionResidentKey', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Attribute used to define authenticator selection resident key requirement.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionResidentKey")
    private final AuthenticatorSelectionResidentKey authenticatorSelectionResidentKey;

    /**
     * Attribute used to define authenticator selection resident key requirement.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public AuthenticatorSelectionResidentKey getAuthenticatorSelectionResidentKey() {
        return authenticatorSelectionResidentKey;
    }

    /**
     * Timeout for the fido authentication to complete
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - idcsMaxValue: 600000 - idcsMinValue: 10000 - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final Integer timeout;

    /**
     * Timeout for the fido authentication to complete
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - idcsMaxValue: 600000 - idcsMinValue: 10000 - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Flag used to indicate authenticator selection is required or not
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticatorSelectionRequireResidentKey")
    private final Boolean authenticatorSelectionRequireResidentKey;

    /**
     * Flag used to indicate authenticator selection is required or not
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAuthenticatorSelectionRequireResidentKey() {
        return authenticatorSelectionRequireResidentKey;
    }

    /** */
    public enum PublicKeyTypes implements com.oracle.bmc.http.internal.BmcEnum {
        Rs1("RS1"),
        Rs256("RS256"),
        Es256("ES256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PublicKeyTypes.class);

        private final String value;
        private static java.util.Map<String, PublicKeyTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicKeyTypes v : PublicKeyTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PublicKeyTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicKeyTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PublicKeyTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * List of server supported public key algorithms
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyTypes")
    private final java.util.List<PublicKeyTypes> publicKeyTypes;

    /**
     * List of server supported public key algorithms
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<PublicKeyTypes> getPublicKeyTypes() {
        return publicKeyTypes;
    }

    /**
     * Flag used to indicate whether we need to restrict creation of multiple credentials in same
     * authenticator
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeCredentials")
    private final Boolean excludeCredentials;

    /**
     * Flag used to indicate whether we need to restrict creation of multiple credentials in same
     * authenticator
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getExcludeCredentials() {
        return excludeCredentials;
    }

    /**
     * Number of domain levels Oracle Identity Cloud Service should use for origin comparision
     *
     * <p>*Added In:** 2109020413
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - idcsMaxValue: 2 - idcsMinValue: 0 - required: false - returned: default - type: integer -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainValidationLevel")
    private final Integer domainValidationLevel;

    /**
     * Number of domain levels Oracle Identity Cloud Service should use for origin comparision
     *
     * <p>*Added In:** 2109020413
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - idcsMaxValue: 2 - idcsMinValue: 0 - required: false - returned: default - type: integer -
     * uniqueness: none
     *
     * @return the value
     */
    public Integer getDomainValidationLevel() {
        return domainValidationLevel;
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
        sb.append("ExtensionFidoAuthenticationFactorSettings(");
        sb.append("super=").append(super.toString());
        sb.append("attestation=").append(String.valueOf(this.attestation));
        sb.append(", authenticatorSelectionAttachment=")
                .append(String.valueOf(this.authenticatorSelectionAttachment));
        sb.append(", authenticatorSelectionUserVerification=")
                .append(String.valueOf(this.authenticatorSelectionUserVerification));
        sb.append(", authenticatorSelectionResidentKey=")
                .append(String.valueOf(this.authenticatorSelectionResidentKey));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", authenticatorSelectionRequireResidentKey=")
                .append(String.valueOf(this.authenticatorSelectionRequireResidentKey));
        sb.append(", publicKeyTypes=").append(String.valueOf(this.publicKeyTypes));
        sb.append(", excludeCredentials=").append(String.valueOf(this.excludeCredentials));
        sb.append(", domainValidationLevel=").append(String.valueOf(this.domainValidationLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionFidoAuthenticationFactorSettings)) {
            return false;
        }

        ExtensionFidoAuthenticationFactorSettings other =
                (ExtensionFidoAuthenticationFactorSettings) o;
        return java.util.Objects.equals(this.attestation, other.attestation)
                && java.util.Objects.equals(
                        this.authenticatorSelectionAttachment,
                        other.authenticatorSelectionAttachment)
                && java.util.Objects.equals(
                        this.authenticatorSelectionUserVerification,
                        other.authenticatorSelectionUserVerification)
                && java.util.Objects.equals(
                        this.authenticatorSelectionResidentKey,
                        other.authenticatorSelectionResidentKey)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(
                        this.authenticatorSelectionRequireResidentKey,
                        other.authenticatorSelectionRequireResidentKey)
                && java.util.Objects.equals(this.publicKeyTypes, other.publicKeyTypes)
                && java.util.Objects.equals(this.excludeCredentials, other.excludeCredentials)
                && java.util.Objects.equals(this.domainValidationLevel, other.domainValidationLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.attestation == null ? 43 : this.attestation.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticatorSelectionAttachment == null
                                ? 43
                                : this.authenticatorSelectionAttachment.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticatorSelectionUserVerification == null
                                ? 43
                                : this.authenticatorSelectionUserVerification.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticatorSelectionResidentKey == null
                                ? 43
                                : this.authenticatorSelectionResidentKey.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticatorSelectionRequireResidentKey == null
                                ? 43
                                : this.authenticatorSelectionRequireResidentKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyTypes == null ? 43 : this.publicKeyTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeCredentials == null
                                ? 43
                                : this.excludeCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.domainValidationLevel == null
                                ? 43
                                : this.domainValidationLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
