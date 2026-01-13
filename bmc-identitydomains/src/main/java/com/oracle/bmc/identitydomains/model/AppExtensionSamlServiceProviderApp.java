/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes related to the Service Providers configuration. <br>
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
        builder = AppExtensionSamlServiceProviderApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionSamlServiceProviderApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metadata",
        "partnerProviderId",
        "partnerProviderPattern",
        "tenantProviderId",
        "succinctId",
        "assertionConsumerUrl",
        "logoutRequestUrl",
        "logoutResponseUrl",
        "nameIdFormat",
        "signingCertificate",
        "encryptionCertificate",
        "encryptionAlgorithm",
        "keyEncryptionAlgorithm",
        "encryptAssertion",
        "signResponseOrAssertion",
        "includeSigningCertInSignature",
        "logoutBinding",
        "logoutEnabled",
        "signatureHashAlgorithm",
        "federationProtocol",
        "nameIdUserstoreAttribute",
        "hokRequired",
        "hokAcsUrl",
        "lastNotificationSentTime",
        "outboundAssertionAttributes",
        "userAssertionAttributes",
        "groupAssertionAttributes"
    })
    public AppExtensionSamlServiceProviderApp(
            String metadata,
            String partnerProviderId,
            String partnerProviderPattern,
            String tenantProviderId,
            String succinctId,
            String assertionConsumerUrl,
            String logoutRequestUrl,
            String logoutResponseUrl,
            String nameIdFormat,
            String signingCertificate,
            String encryptionCertificate,
            EncryptionAlgorithm encryptionAlgorithm,
            KeyEncryptionAlgorithm keyEncryptionAlgorithm,
            Boolean encryptAssertion,
            SignResponseOrAssertion signResponseOrAssertion,
            Boolean includeSigningCertInSignature,
            LogoutBinding logoutBinding,
            Boolean logoutEnabled,
            SignatureHashAlgorithm signatureHashAlgorithm,
            FederationProtocol federationProtocol,
            String nameIdUserstoreAttribute,
            Boolean hokRequired,
            String hokAcsUrl,
            String lastNotificationSentTime,
            AppOutboundAssertionAttributes outboundAssertionAttributes,
            java.util.List<AppUserAssertionAttributes> userAssertionAttributes,
            java.util.List<AppGroupAssertionAttributes> groupAssertionAttributes) {
        super();
        this.metadata = metadata;
        this.partnerProviderId = partnerProviderId;
        this.partnerProviderPattern = partnerProviderPattern;
        this.tenantProviderId = tenantProviderId;
        this.succinctId = succinctId;
        this.assertionConsumerUrl = assertionConsumerUrl;
        this.logoutRequestUrl = logoutRequestUrl;
        this.logoutResponseUrl = logoutResponseUrl;
        this.nameIdFormat = nameIdFormat;
        this.signingCertificate = signingCertificate;
        this.encryptionCertificate = encryptionCertificate;
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
        this.encryptAssertion = encryptAssertion;
        this.signResponseOrAssertion = signResponseOrAssertion;
        this.includeSigningCertInSignature = includeSigningCertInSignature;
        this.logoutBinding = logoutBinding;
        this.logoutEnabled = logoutEnabled;
        this.signatureHashAlgorithm = signatureHashAlgorithm;
        this.federationProtocol = federationProtocol;
        this.nameIdUserstoreAttribute = nameIdUserstoreAttribute;
        this.hokRequired = hokRequired;
        this.hokAcsUrl = hokAcsUrl;
        this.lastNotificationSentTime = lastNotificationSentTime;
        this.outboundAssertionAttributes = outboundAssertionAttributes;
        this.userAssertionAttributes = userAssertionAttributes;
        this.groupAssertionAttributes = groupAssertionAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This attribute represents the metadata of a Security Provider in the Security Assertion
         * Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * This attribute represents the metadata of a Security Provider in the Security Assertion
         * Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The ID of the Provider. This value corresponds to the entityID from the Service Provider
         * metadata.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderId")
        private String partnerProviderId;

        /**
         * The ID of the Provider. This value corresponds to the entityID from the Service Provider
         * metadata.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param partnerProviderId the value to set
         * @return this builder
         */
        public Builder partnerProviderId(String partnerProviderId) {
            this.partnerProviderId = partnerProviderId;
            this.__explicitlySet__.add("partnerProviderId");
            return this;
        }
        /**
         * The pattern of the Provider. This value corresponds to the entityID from the Service
         * Provider metadata.
         *
         * <p>*Added In:** 2202230830
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: request - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderPattern")
        private String partnerProviderPattern;

        /**
         * The pattern of the Provider. This value corresponds to the entityID from the Service
         * Provider metadata.
         *
         * <p>*Added In:** 2202230830
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: request - type: string -
         * uniqueness: none
         *
         * @param partnerProviderPattern the value to set
         * @return this builder
         */
        public Builder partnerProviderPattern(String partnerProviderPattern) {
            this.partnerProviderPattern = partnerProviderPattern;
            this.__explicitlySet__.add("partnerProviderPattern");
            return this;
        }
        /**
         * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID
         * (instead of the one in SamlSettings) when interacting with this SP.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantProviderId")
        private String tenantProviderId;

        /**
         * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID
         * (instead of the one in SamlSettings) when interacting with this SP.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param tenantProviderId the value to set
         * @return this builder
         */
        public Builder tenantProviderId(String tenantProviderId) {
            this.tenantProviderId = tenantProviderId;
            this.__explicitlySet__.add("tenantProviderId");
            return this;
        }
        /**
         * This attribute represents the Succinct ID.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("succinctId")
        private String succinctId;

        /**
         * This attribute represents the Succinct ID.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * server
         *
         * @param succinctId the value to set
         * @return this builder
         */
        public Builder succinctId(String succinctId) {
            this.succinctId = succinctId;
            this.__explicitlySet__.add("succinctId");
            return this;
        }
        /**
         * The attribute represents the URL to which the SAML Assertions will be sent by the SAML
         * IdP.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assertionConsumerUrl")
        private String assertionConsumerUrl;

        /**
         * The attribute represents the URL to which the SAML Assertions will be sent by the SAML
         * IdP.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param assertionConsumerUrl the value to set
         * @return this builder
         */
        public Builder assertionConsumerUrl(String assertionConsumerUrl) {
            this.assertionConsumerUrl = assertionConsumerUrl;
            this.__explicitlySet__.add("assertionConsumerUrl");
            return this;
        }
        /**
         * The URL to which the partner sends the logout request.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutRequestUrl")
        private String logoutRequestUrl;

        /**
         * The URL to which the partner sends the logout request.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param logoutRequestUrl the value to set
         * @return this builder
         */
        public Builder logoutRequestUrl(String logoutRequestUrl) {
            this.logoutRequestUrl = logoutRequestUrl;
            this.__explicitlySet__.add("logoutRequestUrl");
            return this;
        }
        /**
         * The URL to which the partner sends the logout response.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutResponseUrl")
        private String logoutResponseUrl;

        /**
         * The URL to which the partner sends the logout response.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param logoutResponseUrl the value to set
         * @return this builder
         */
        public Builder logoutResponseUrl(String logoutResponseUrl) {
            this.logoutResponseUrl = logoutResponseUrl;
            this.__explicitlySet__.add("logoutResponseUrl");
            return this;
        }
        /**
         * This can be any string, but there are a set of standard nameIdFormats. If a nameIdFormat
         * other than the standard list is chosen, it will be considered a custom nameidformat. The
         * standard nameidformats include: saml-x509, saml-emailaddress, saml-windowsnamequalifier,
         * saml-kerberos, saml-persistent, saml-transient, saml-unspecified, saml-none, and
         * saml-persistent-opaque.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nameIdFormat")
        private String nameIdFormat;

        /**
         * This can be any string, but there are a set of standard nameIdFormats. If a nameIdFormat
         * other than the standard list is chosen, it will be considered a custom nameidformat. The
         * standard nameidformats include: saml-x509, saml-emailaddress, saml-windowsnamequalifier,
         * saml-kerberos, saml-persistent, saml-transient, saml-unspecified, saml-none, and
         * saml-persistent-opaque.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param nameIdFormat the value to set
         * @return this builder
         */
        public Builder nameIdFormat(String nameIdFormat) {
            this.nameIdFormat = nameIdFormat;
            this.__explicitlySet__.add("nameIdFormat");
            return this;
        }
        /**
         * This attribute represents the signing certificate that an App uses to verify the signed
         * authentication request.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        /**
         * This attribute represents the signing certificate that an App uses to verify the signed
         * authentication request.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param signingCertificate the value to set
         * @return this builder
         */
        public Builder signingCertificate(String signingCertificate) {
            this.signingCertificate = signingCertificate;
            this.__explicitlySet__.add("signingCertificate");
            return this;
        }
        /**
         * This attribute represents the encryption certificate that an App uses to encrypt the
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionCertificate")
        private String encryptionCertificate;

        /**
         * This attribute represents the encryption certificate that an App uses to encrypt the
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param encryptionCertificate the value to set
         * @return this builder
         */
        public Builder encryptionCertificate(String encryptionCertificate) {
            this.encryptionCertificate = encryptionCertificate;
            this.__explicitlySet__.add("encryptionCertificate");
            return this;
        }
        /**
         * This attribute indicates the encryption algorithm used to encrypt the SAML assertion.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        /**
         * This attribute indicates the encryption algorithm used to encrypt the SAML assertion.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }
        /**
         * This attribute indicates the key encryption algorithm.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyEncryptionAlgorithm")
        private KeyEncryptionAlgorithm keyEncryptionAlgorithm;

        /**
         * This attribute indicates the key encryption algorithm.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param keyEncryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder keyEncryptionAlgorithm(KeyEncryptionAlgorithm keyEncryptionAlgorithm) {
            this.keyEncryptionAlgorithm = keyEncryptionAlgorithm;
            this.__explicitlySet__.add("keyEncryptionAlgorithm");
            return this;
        }
        /**
         * If true, indicates that the system must encrypt the Security Assertion Markup Language
         * (SAML) assertion.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptAssertion")
        private Boolean encryptAssertion;

        /**
         * If true, indicates that the system must encrypt the Security Assertion Markup Language
         * (SAML) assertion.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param encryptAssertion the value to set
         * @return this builder
         */
        public Builder encryptAssertion(Boolean encryptAssertion) {
            this.encryptAssertion = encryptAssertion;
            this.__explicitlySet__.add("encryptAssertion");
            return this;
        }
        /**
         * Indicates which part of the response should be signed. A value of \\"Assertion\\"
         * indicates that the Assertion should be signed. A value of \\"Response\\" indicates that
         * the SSO Response should be signed. A value of \\"AssertionAndResponse\\" indicates that
         * both the Assertion and the SSO Response should be signed.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signResponseOrAssertion")
        private SignResponseOrAssertion signResponseOrAssertion;

        /**
         * Indicates which part of the response should be signed. A value of \\"Assertion\\"
         * indicates that the Assertion should be signed. A value of \\"Response\\" indicates that
         * the SSO Response should be signed. A value of \\"AssertionAndResponse\\" indicates that
         * both the Assertion and the SSO Response should be signed.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param signResponseOrAssertion the value to set
         * @return this builder
         */
        public Builder signResponseOrAssertion(SignResponseOrAssertion signResponseOrAssertion) {
            this.signResponseOrAssertion = signResponseOrAssertion;
            this.__explicitlySet__.add("signResponseOrAssertion");
            return this;
        }
        /**
         * If true, then the signing certificate is included in the signature.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeSigningCertInSignature")
        private Boolean includeSigningCertInSignature;

        /**
         * If true, then the signing certificate is included in the signature.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param includeSigningCertInSignature the value to set
         * @return this builder
         */
        public Builder includeSigningCertInSignature(Boolean includeSigningCertInSignature) {
            this.includeSigningCertInSignature = includeSigningCertInSignature;
            this.__explicitlySet__.add("includeSigningCertInSignature");
            return this;
        }
        /**
         * This attribute represents the HTTP binding that would be used while logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutBinding")
        private LogoutBinding logoutBinding;

        /**
         * This attribute represents the HTTP binding that would be used while logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param logoutBinding the value to set
         * @return this builder
         */
        public Builder logoutBinding(LogoutBinding logoutBinding) {
            this.logoutBinding = logoutBinding;
            this.__explicitlySet__.add("logoutBinding");
            return this;
        }
        /**
         * If true, then the SAML Service supports logout for this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutEnabled")
        private Boolean logoutEnabled;

        /**
         * If true, then the SAML Service supports logout for this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param logoutEnabled the value to set
         * @return this builder
         */
        public Builder logoutEnabled(Boolean logoutEnabled) {
            this.logoutEnabled = logoutEnabled;
            this.__explicitlySet__.add("logoutEnabled");
            return this;
        }
        /**
         * This attribute represents the algorithm used to hash the signature.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signatureHashAlgorithm")
        private SignatureHashAlgorithm signatureHashAlgorithm;

        /**
         * This attribute represents the algorithm used to hash the signature.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param signatureHashAlgorithm the value to set
         * @return this builder
         */
        public Builder signatureHashAlgorithm(SignatureHashAlgorithm signatureHashAlgorithm) {
            this.signatureHashAlgorithm = signatureHashAlgorithm;
            this.__explicitlySet__.add("signatureHashAlgorithm");
            return this;
        }
        /**
         * Specifies the preferred federation protocol (SAML2.0 or WS-Fed1.1).
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsDefaultValue: SAML2.0 - idcsSearchable:
         * true - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("federationProtocol")
        private FederationProtocol federationProtocol;

        /**
         * Specifies the preferred federation protocol (SAML2.0 or WS-Fed1.1).
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsDefaultValue: SAML2.0 - idcsSearchable:
         * true - multiValued: false - mutability: readWrite - required: false - returned: default -
         * type: string - uniqueness: none
         *
         * @param federationProtocol the value to set
         * @return this builder
         */
        public Builder federationProtocol(FederationProtocol federationProtocol) {
            this.federationProtocol = federationProtocol;
            this.__explicitlySet__.add("federationProtocol");
            return this;
        }
        /**
         * **Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none This property
         * specifies which user attribute is used as the NameID value in the SAML assertion. This
         * attribute can be constructed by using attributes from the Oracle Identity Cloud Service
         * Core Users schema.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nameIdUserstoreAttribute")
        private String nameIdUserstoreAttribute;

        /**
         * **Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true -
         * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none This property
         * specifies which user attribute is used as the NameID value in the SAML assertion. This
         * attribute can be constructed by using attributes from the Oracle Identity Cloud Service
         * Core Users schema.
         *
         * @param nameIdUserstoreAttribute the value to set
         * @return this builder
         */
        public Builder nameIdUserstoreAttribute(String nameIdUserstoreAttribute) {
            this.nameIdUserstoreAttribute = nameIdUserstoreAttribute;
            this.__explicitlySet__.add("nameIdUserstoreAttribute");
            return this;
        }
        /**
         * If enabled, then the SAML Service supports Hok for this App.
         *
         * <p>*Added In:** 2101262133
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hokRequired")
        private Boolean hokRequired;

        /**
         * If enabled, then the SAML Service supports Hok for this App.
         *
         * <p>*Added In:** 2101262133
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param hokRequired the value to set
         * @return this builder
         */
        public Builder hokRequired(Boolean hokRequired) {
            this.hokRequired = hokRequired;
            this.__explicitlySet__.add("hokRequired");
            return this;
        }
        /**
         * Hok Assertion Consumer Service Url
         *
         * <p>*Added In:** 2101262133
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hokAcsUrl")
        private String hokAcsUrl;

        /**
         * Hok Assertion Consumer Service Url
         *
         * <p>*Added In:** 2101262133
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param hokAcsUrl the value to set
         * @return this builder
         */
        public Builder hokAcsUrl(String hokAcsUrl) {
            this.hokAcsUrl = hokAcsUrl;
            this.__explicitlySet__.add("hokAcsUrl");
            return this;
        }
        /**
         * Records the notification timestamp for the SP whose signing certificate is about to
         * expire.
         *
         * <p>*Added In:** 2302092332
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: dateTime -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastNotificationSentTime")
        private String lastNotificationSentTime;

        /**
         * Records the notification timestamp for the SP whose signing certificate is about to
         * expire.
         *
         * <p>*Added In:** 2302092332
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: dateTime -
         * uniqueness: none
         *
         * @param lastNotificationSentTime the value to set
         * @return this builder
         */
        public Builder lastNotificationSentTime(String lastNotificationSentTime) {
            this.lastNotificationSentTime = lastNotificationSentTime;
            this.__explicitlySet__.add("lastNotificationSentTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outboundAssertionAttributes")
        private AppOutboundAssertionAttributes outboundAssertionAttributes;

        public Builder outboundAssertionAttributes(
                AppOutboundAssertionAttributes outboundAssertionAttributes) {
            this.outboundAssertionAttributes = outboundAssertionAttributes;
            this.__explicitlySet__.add("outboundAssertionAttributes");
            return this;
        }
        /**
         * Each value of this attribute describes an attribute of User that will be sent in a
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userAssertionAttributes")
        private java.util.List<AppUserAssertionAttributes> userAssertionAttributes;

        /**
         * Each value of this attribute describes an attribute of User that will be sent in a
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         *
         * @param userAssertionAttributes the value to set
         * @return this builder
         */
        public Builder userAssertionAttributes(
                java.util.List<AppUserAssertionAttributes> userAssertionAttributes) {
            this.userAssertionAttributes = userAssertionAttributes;
            this.__explicitlySet__.add("userAssertionAttributes");
            return this;
        }
        /**
         * Each value of this attribute describes an attribute of Group that will be sent in a
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupAssertionAttributes")
        private java.util.List<AppGroupAssertionAttributes> groupAssertionAttributes;

        /**
         * Each value of this attribute describes an attribute of Group that will be sent in a
         * Security Assertion Markup Language (SAML) assertion.
         *
         * <p>*Deprecated Since: 18.2.2**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
         * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         *
         * @param groupAssertionAttributes the value to set
         * @return this builder
         */
        public Builder groupAssertionAttributes(
                java.util.List<AppGroupAssertionAttributes> groupAssertionAttributes) {
            this.groupAssertionAttributes = groupAssertionAttributes;
            this.__explicitlySet__.add("groupAssertionAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionSamlServiceProviderApp build() {
            AppExtensionSamlServiceProviderApp model =
                    new AppExtensionSamlServiceProviderApp(
                            this.metadata,
                            this.partnerProviderId,
                            this.partnerProviderPattern,
                            this.tenantProviderId,
                            this.succinctId,
                            this.assertionConsumerUrl,
                            this.logoutRequestUrl,
                            this.logoutResponseUrl,
                            this.nameIdFormat,
                            this.signingCertificate,
                            this.encryptionCertificate,
                            this.encryptionAlgorithm,
                            this.keyEncryptionAlgorithm,
                            this.encryptAssertion,
                            this.signResponseOrAssertion,
                            this.includeSigningCertInSignature,
                            this.logoutBinding,
                            this.logoutEnabled,
                            this.signatureHashAlgorithm,
                            this.federationProtocol,
                            this.nameIdUserstoreAttribute,
                            this.hokRequired,
                            this.hokAcsUrl,
                            this.lastNotificationSentTime,
                            this.outboundAssertionAttributes,
                            this.userAssertionAttributes,
                            this.groupAssertionAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionSamlServiceProviderApp model) {
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("partnerProviderId")) {
                this.partnerProviderId(model.getPartnerProviderId());
            }
            if (model.wasPropertyExplicitlySet("partnerProviderPattern")) {
                this.partnerProviderPattern(model.getPartnerProviderPattern());
            }
            if (model.wasPropertyExplicitlySet("tenantProviderId")) {
                this.tenantProviderId(model.getTenantProviderId());
            }
            if (model.wasPropertyExplicitlySet("succinctId")) {
                this.succinctId(model.getSuccinctId());
            }
            if (model.wasPropertyExplicitlySet("assertionConsumerUrl")) {
                this.assertionConsumerUrl(model.getAssertionConsumerUrl());
            }
            if (model.wasPropertyExplicitlySet("logoutRequestUrl")) {
                this.logoutRequestUrl(model.getLogoutRequestUrl());
            }
            if (model.wasPropertyExplicitlySet("logoutResponseUrl")) {
                this.logoutResponseUrl(model.getLogoutResponseUrl());
            }
            if (model.wasPropertyExplicitlySet("nameIdFormat")) {
                this.nameIdFormat(model.getNameIdFormat());
            }
            if (model.wasPropertyExplicitlySet("signingCertificate")) {
                this.signingCertificate(model.getSigningCertificate());
            }
            if (model.wasPropertyExplicitlySet("encryptionCertificate")) {
                this.encryptionCertificate(model.getEncryptionCertificate());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("keyEncryptionAlgorithm")) {
                this.keyEncryptionAlgorithm(model.getKeyEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("encryptAssertion")) {
                this.encryptAssertion(model.getEncryptAssertion());
            }
            if (model.wasPropertyExplicitlySet("signResponseOrAssertion")) {
                this.signResponseOrAssertion(model.getSignResponseOrAssertion());
            }
            if (model.wasPropertyExplicitlySet("includeSigningCertInSignature")) {
                this.includeSigningCertInSignature(model.getIncludeSigningCertInSignature());
            }
            if (model.wasPropertyExplicitlySet("logoutBinding")) {
                this.logoutBinding(model.getLogoutBinding());
            }
            if (model.wasPropertyExplicitlySet("logoutEnabled")) {
                this.logoutEnabled(model.getLogoutEnabled());
            }
            if (model.wasPropertyExplicitlySet("signatureHashAlgorithm")) {
                this.signatureHashAlgorithm(model.getSignatureHashAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("federationProtocol")) {
                this.federationProtocol(model.getFederationProtocol());
            }
            if (model.wasPropertyExplicitlySet("nameIdUserstoreAttribute")) {
                this.nameIdUserstoreAttribute(model.getNameIdUserstoreAttribute());
            }
            if (model.wasPropertyExplicitlySet("hokRequired")) {
                this.hokRequired(model.getHokRequired());
            }
            if (model.wasPropertyExplicitlySet("hokAcsUrl")) {
                this.hokAcsUrl(model.getHokAcsUrl());
            }
            if (model.wasPropertyExplicitlySet("lastNotificationSentTime")) {
                this.lastNotificationSentTime(model.getLastNotificationSentTime());
            }
            if (model.wasPropertyExplicitlySet("outboundAssertionAttributes")) {
                this.outboundAssertionAttributes(model.getOutboundAssertionAttributes());
            }
            if (model.wasPropertyExplicitlySet("userAssertionAttributes")) {
                this.userAssertionAttributes(model.getUserAssertionAttributes());
            }
            if (model.wasPropertyExplicitlySet("groupAssertionAttributes")) {
                this.groupAssertionAttributes(model.getGroupAssertionAttributes());
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
     * This attribute represents the metadata of a Security Provider in the Security Assertion
     * Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * This attribute represents the metadata of a Security Provider in the Security Assertion
     * Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * The ID of the Provider. This value corresponds to the entityID from the Service Provider
     * metadata.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderId")
    private final String partnerProviderId;

    /**
     * The ID of the Provider. This value corresponds to the entityID from the Service Provider
     * metadata.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPartnerProviderId() {
        return partnerProviderId;
    }

    /**
     * The pattern of the Provider. This value corresponds to the entityID from the Service Provider
     * metadata.
     *
     * <p>*Added In:** 2202230830
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderPattern")
    private final String partnerProviderPattern;

    /**
     * The pattern of the Provider. This value corresponds to the entityID from the Service Provider
     * metadata.
     *
     * <p>*Added In:** 2202230830
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPartnerProviderPattern() {
        return partnerProviderPattern;
    }

    /**
     * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID (instead
     * of the one in SamlSettings) when interacting with this SP.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantProviderId")
    private final String tenantProviderId;

    /**
     * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID (instead
     * of the one in SamlSettings) when interacting with this SP.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTenantProviderId() {
        return tenantProviderId;
    }

    /**
     * This attribute represents the Succinct ID.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("succinctId")
    private final String succinctId;

    /**
     * This attribute represents the Succinct ID.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getSuccinctId() {
        return succinctId;
    }

    /**
     * The attribute represents the URL to which the SAML Assertions will be sent by the SAML IdP.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assertionConsumerUrl")
    private final String assertionConsumerUrl;

    /**
     * The attribute represents the URL to which the SAML Assertions will be sent by the SAML IdP.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAssertionConsumerUrl() {
        return assertionConsumerUrl;
    }

    /**
     * The URL to which the partner sends the logout request.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutRequestUrl")
    private final String logoutRequestUrl;

    /**
     * The URL to which the partner sends the logout request.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutRequestUrl() {
        return logoutRequestUrl;
    }

    /**
     * The URL to which the partner sends the logout response.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutResponseUrl")
    private final String logoutResponseUrl;

    /**
     * The URL to which the partner sends the logout response.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutResponseUrl() {
        return logoutResponseUrl;
    }

    /**
     * This can be any string, but there are a set of standard nameIdFormats. If a nameIdFormat
     * other than the standard list is chosen, it will be considered a custom nameidformat. The
     * standard nameidformats include: saml-x509, saml-emailaddress, saml-windowsnamequalifier,
     * saml-kerberos, saml-persistent, saml-transient, saml-unspecified, saml-none, and
     * saml-persistent-opaque.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameIdFormat")
    private final String nameIdFormat;

    /**
     * This can be any string, but there are a set of standard nameIdFormats. If a nameIdFormat
     * other than the standard list is chosen, it will be considered a custom nameidformat. The
     * standard nameidformats include: saml-x509, saml-emailaddress, saml-windowsnamequalifier,
     * saml-kerberos, saml-persistent, saml-transient, saml-unspecified, saml-none, and
     * saml-persistent-opaque.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getNameIdFormat() {
        return nameIdFormat;
    }

    /**
     * This attribute represents the signing certificate that an App uses to verify the signed
     * authentication request.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    private final String signingCertificate;

    /**
     * This attribute represents the signing certificate that an App uses to verify the signed
     * authentication request.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * This attribute represents the encryption certificate that an App uses to encrypt the Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionCertificate")
    private final String encryptionCertificate;

    /**
     * This attribute represents the encryption certificate that an App uses to encrypt the Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getEncryptionCertificate() {
        return encryptionCertificate;
    }

    /**
     * This attribute indicates the encryption algorithm used to encrypt the SAML assertion.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum EncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        _3Des("3DES"),
        Aes128("AES-128"),
        Aes256("AES-256"),
        Aes192("AES-192"),
        Aes128Gcm("AES-128-GCM"),
        Aes256Gcm("AES-256-GCM"),
        Aes192Gcm("AES-192-GCM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EncryptionAlgorithm.class);

        private final String value;
        private static java.util.Map<String, EncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionAlgorithm v : EncryptionAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncryptionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncryptionAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This attribute indicates the encryption algorithm used to encrypt the SAML assertion.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final EncryptionAlgorithm encryptionAlgorithm;

    /**
     * This attribute indicates the encryption algorithm used to encrypt the SAML assertion.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    /**
     * This attribute indicates the key encryption algorithm.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum KeyEncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        RsaV15("RSA-v1.5"),
        RsaOaep("RSA-OAEP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyEncryptionAlgorithm.class);

        private final String value;
        private static java.util.Map<String, KeyEncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyEncryptionAlgorithm v : KeyEncryptionAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyEncryptionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyEncryptionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyEncryptionAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This attribute indicates the key encryption algorithm.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyEncryptionAlgorithm")
    private final KeyEncryptionAlgorithm keyEncryptionAlgorithm;

    /**
     * This attribute indicates the key encryption algorithm.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public KeyEncryptionAlgorithm getKeyEncryptionAlgorithm() {
        return keyEncryptionAlgorithm;
    }

    /**
     * If true, indicates that the system must encrypt the Security Assertion Markup Language (SAML)
     * assertion.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptAssertion")
    private final Boolean encryptAssertion;

    /**
     * If true, indicates that the system must encrypt the Security Assertion Markup Language (SAML)
     * assertion.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getEncryptAssertion() {
        return encryptAssertion;
    }

    /**
     * Indicates which part of the response should be signed. A value of \\"Assertion\\" indicates
     * that the Assertion should be signed. A value of \\"Response\\" indicates that the SSO
     * Response should be signed. A value of \\"AssertionAndResponse\\" indicates that both the
     * Assertion and the SSO Response should be signed.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum SignResponseOrAssertion implements com.oracle.bmc.http.internal.BmcEnum {
        Assertion("Assertion"),
        Response("Response"),
        AssertionAndResponse("AssertionAndResponse"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SignResponseOrAssertion.class);

        private final String value;
        private static java.util.Map<String, SignResponseOrAssertion> map;

        static {
            map = new java.util.HashMap<>();
            for (SignResponseOrAssertion v : SignResponseOrAssertion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SignResponseOrAssertion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SignResponseOrAssertion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SignResponseOrAssertion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates which part of the response should be signed. A value of \\"Assertion\\" indicates
     * that the Assertion should be signed. A value of \\"Response\\" indicates that the SSO
     * Response should be signed. A value of \\"AssertionAndResponse\\" indicates that both the
     * Assertion and the SSO Response should be signed.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signResponseOrAssertion")
    private final SignResponseOrAssertion signResponseOrAssertion;

    /**
     * Indicates which part of the response should be signed. A value of \\"Assertion\\" indicates
     * that the Assertion should be signed. A value of \\"Response\\" indicates that the SSO
     * Response should be signed. A value of \\"AssertionAndResponse\\" indicates that both the
     * Assertion and the SSO Response should be signed.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SignResponseOrAssertion getSignResponseOrAssertion() {
        return signResponseOrAssertion;
    }

    /**
     * If true, then the signing certificate is included in the signature.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeSigningCertInSignature")
    private final Boolean includeSigningCertInSignature;

    /**
     * If true, then the signing certificate is included in the signature.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIncludeSigningCertInSignature() {
        return includeSigningCertInSignature;
    }

    /**
     * This attribute represents the HTTP binding that would be used while logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum LogoutBinding implements com.oracle.bmc.http.internal.BmcEnum {
        Redirect("Redirect"),
        Post("Post"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LogoutBinding.class);

        private final String value;
        private static java.util.Map<String, LogoutBinding> map;

        static {
            map = new java.util.HashMap<>();
            for (LogoutBinding v : LogoutBinding.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LogoutBinding(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogoutBinding create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LogoutBinding', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This attribute represents the HTTP binding that would be used while logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutBinding")
    private final LogoutBinding logoutBinding;

    /**
     * This attribute represents the HTTP binding that would be used while logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public LogoutBinding getLogoutBinding() {
        return logoutBinding;
    }

    /**
     * If true, then the SAML Service supports logout for this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutEnabled")
    private final Boolean logoutEnabled;

    /**
     * If true, then the SAML Service supports logout for this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getLogoutEnabled() {
        return logoutEnabled;
    }

    /**
     * This attribute represents the algorithm used to hash the signature.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum SignatureHashAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Sha1("SHA-1"),
        Sha256("SHA-256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SignatureHashAlgorithm.class);

        private final String value;
        private static java.util.Map<String, SignatureHashAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SignatureHashAlgorithm v : SignatureHashAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SignatureHashAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SignatureHashAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SignatureHashAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This attribute represents the algorithm used to hash the signature.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signatureHashAlgorithm")
    private final SignatureHashAlgorithm signatureHashAlgorithm;

    /**
     * This attribute represents the algorithm used to hash the signature.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SignatureHashAlgorithm getSignatureHashAlgorithm() {
        return signatureHashAlgorithm;
    }

    /**
     * Specifies the preferred federation protocol (SAML2.0 or WS-Fed1.1).
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsDefaultValue: SAML2.0 - idcsSearchable: true
     * - multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    public enum FederationProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        Saml20("SAML2.0"),
        WsFed11("WS-Fed1.1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FederationProtocol.class);

        private final String value;
        private static java.util.Map<String, FederationProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (FederationProtocol v : FederationProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FederationProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FederationProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FederationProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the preferred federation protocol (SAML2.0 or WS-Fed1.1).
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsDefaultValue: SAML2.0 - idcsSearchable: true
     * - multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("federationProtocol")
    private final FederationProtocol federationProtocol;

    /**
     * Specifies the preferred federation protocol (SAML2.0 or WS-Fed1.1).
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsDefaultValue: SAML2.0 - idcsSearchable: true
     * - multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public FederationProtocol getFederationProtocol() {
        return federationProtocol;
    }

    /**
     * **Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none This property specifies
     * which user attribute is used as the NameID value in the SAML assertion. This attribute can be
     * constructed by using attributes from the Oracle Identity Cloud Service Core Users schema.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameIdUserstoreAttribute")
    private final String nameIdUserstoreAttribute;

    /**
     * **Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true -
     * idcsValuePersistedInOtherAttribute: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none This property specifies
     * which user attribute is used as the NameID value in the SAML assertion. This attribute can be
     * constructed by using attributes from the Oracle Identity Cloud Service Core Users schema.
     *
     * @return the value
     */
    public String getNameIdUserstoreAttribute() {
        return nameIdUserstoreAttribute;
    }

    /**
     * If enabled, then the SAML Service supports Hok for this App.
     *
     * <p>*Added In:** 2101262133
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hokRequired")
    private final Boolean hokRequired;

    /**
     * If enabled, then the SAML Service supports Hok for this App.
     *
     * <p>*Added In:** 2101262133
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getHokRequired() {
        return hokRequired;
    }

    /**
     * Hok Assertion Consumer Service Url
     *
     * <p>*Added In:** 2101262133
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hokAcsUrl")
    private final String hokAcsUrl;

    /**
     * Hok Assertion Consumer Service Url
     *
     * <p>*Added In:** 2101262133
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getHokAcsUrl() {
        return hokAcsUrl;
    }

    /**
     * Records the notification timestamp for the SP whose signing certificate is about to expire.
     *
     * <p>*Added In:** 2302092332
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastNotificationSentTime")
    private final String lastNotificationSentTime;

    /**
     * Records the notification timestamp for the SP whose signing certificate is about to expire.
     *
     * <p>*Added In:** 2302092332
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getLastNotificationSentTime() {
        return lastNotificationSentTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outboundAssertionAttributes")
    private final AppOutboundAssertionAttributes outboundAssertionAttributes;

    public AppOutboundAssertionAttributes getOutboundAssertionAttributes() {
        return outboundAssertionAttributes;
    }

    /**
     * Each value of this attribute describes an attribute of User that will be sent in a Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userAssertionAttributes")
    private final java.util.List<AppUserAssertionAttributes> userAssertionAttributes;

    /**
     * Each value of this attribute describes an attribute of User that will be sent in a Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppUserAssertionAttributes> getUserAssertionAttributes() {
        return userAssertionAttributes;
    }

    /**
     * Each value of this attribute describes an attribute of Group that will be sent in a Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupAssertionAttributes")
    private final java.util.List<AppGroupAssertionAttributes> groupAssertionAttributes;

    /**
     * Each value of this attribute describes an attribute of Group that will be sent in a Security
     * Assertion Markup Language (SAML) assertion.
     *
     * <p>*Deprecated Since: 18.2.2**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [name] - idcsSearchable:
     * false - idcsValuePersistedInOtherAttribute: true - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppGroupAssertionAttributes> getGroupAssertionAttributes() {
        return groupAssertionAttributes;
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
        sb.append("AppExtensionSamlServiceProviderApp(");
        sb.append("super=").append(super.toString());
        sb.append("metadata=").append(String.valueOf(this.metadata));
        sb.append(", partnerProviderId=").append(String.valueOf(this.partnerProviderId));
        sb.append(", partnerProviderPattern=").append(String.valueOf(this.partnerProviderPattern));
        sb.append(", tenantProviderId=").append(String.valueOf(this.tenantProviderId));
        sb.append(", succinctId=").append(String.valueOf(this.succinctId));
        sb.append(", assertionConsumerUrl=").append(String.valueOf(this.assertionConsumerUrl));
        sb.append(", logoutRequestUrl=").append(String.valueOf(this.logoutRequestUrl));
        sb.append(", logoutResponseUrl=").append(String.valueOf(this.logoutResponseUrl));
        sb.append(", nameIdFormat=").append(String.valueOf(this.nameIdFormat));
        sb.append(", signingCertificate=").append(String.valueOf(this.signingCertificate));
        sb.append(", encryptionCertificate=").append(String.valueOf(this.encryptionCertificate));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(", keyEncryptionAlgorithm=").append(String.valueOf(this.keyEncryptionAlgorithm));
        sb.append(", encryptAssertion=").append(String.valueOf(this.encryptAssertion));
        sb.append(", signResponseOrAssertion=")
                .append(String.valueOf(this.signResponseOrAssertion));
        sb.append(", includeSigningCertInSignature=")
                .append(String.valueOf(this.includeSigningCertInSignature));
        sb.append(", logoutBinding=").append(String.valueOf(this.logoutBinding));
        sb.append(", logoutEnabled=").append(String.valueOf(this.logoutEnabled));
        sb.append(", signatureHashAlgorithm=").append(String.valueOf(this.signatureHashAlgorithm));
        sb.append(", federationProtocol=").append(String.valueOf(this.federationProtocol));
        sb.append(", nameIdUserstoreAttribute=")
                .append(String.valueOf(this.nameIdUserstoreAttribute));
        sb.append(", hokRequired=").append(String.valueOf(this.hokRequired));
        sb.append(", hokAcsUrl=").append(String.valueOf(this.hokAcsUrl));
        sb.append(", lastNotificationSentTime=")
                .append(String.valueOf(this.lastNotificationSentTime));
        sb.append(", outboundAssertionAttributes=")
                .append(String.valueOf(this.outboundAssertionAttributes));
        sb.append(", userAssertionAttributes=")
                .append(String.valueOf(this.userAssertionAttributes));
        sb.append(", groupAssertionAttributes=")
                .append(String.valueOf(this.groupAssertionAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionSamlServiceProviderApp)) {
            return false;
        }

        AppExtensionSamlServiceProviderApp other = (AppExtensionSamlServiceProviderApp) o;
        return java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.partnerProviderId, other.partnerProviderId)
                && java.util.Objects.equals(
                        this.partnerProviderPattern, other.partnerProviderPattern)
                && java.util.Objects.equals(this.tenantProviderId, other.tenantProviderId)
                && java.util.Objects.equals(this.succinctId, other.succinctId)
                && java.util.Objects.equals(this.assertionConsumerUrl, other.assertionConsumerUrl)
                && java.util.Objects.equals(this.logoutRequestUrl, other.logoutRequestUrl)
                && java.util.Objects.equals(this.logoutResponseUrl, other.logoutResponseUrl)
                && java.util.Objects.equals(this.nameIdFormat, other.nameIdFormat)
                && java.util.Objects.equals(this.signingCertificate, other.signingCertificate)
                && java.util.Objects.equals(this.encryptionCertificate, other.encryptionCertificate)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && java.util.Objects.equals(
                        this.keyEncryptionAlgorithm, other.keyEncryptionAlgorithm)
                && java.util.Objects.equals(this.encryptAssertion, other.encryptAssertion)
                && java.util.Objects.equals(
                        this.signResponseOrAssertion, other.signResponseOrAssertion)
                && java.util.Objects.equals(
                        this.includeSigningCertInSignature, other.includeSigningCertInSignature)
                && java.util.Objects.equals(this.logoutBinding, other.logoutBinding)
                && java.util.Objects.equals(this.logoutEnabled, other.logoutEnabled)
                && java.util.Objects.equals(
                        this.signatureHashAlgorithm, other.signatureHashAlgorithm)
                && java.util.Objects.equals(this.federationProtocol, other.federationProtocol)
                && java.util.Objects.equals(
                        this.nameIdUserstoreAttribute, other.nameIdUserstoreAttribute)
                && java.util.Objects.equals(this.hokRequired, other.hokRequired)
                && java.util.Objects.equals(this.hokAcsUrl, other.hokAcsUrl)
                && java.util.Objects.equals(
                        this.lastNotificationSentTime, other.lastNotificationSentTime)
                && java.util.Objects.equals(
                        this.outboundAssertionAttributes, other.outboundAssertionAttributes)
                && java.util.Objects.equals(
                        this.userAssertionAttributes, other.userAssertionAttributes)
                && java.util.Objects.equals(
                        this.groupAssertionAttributes, other.groupAssertionAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerProviderId == null ? 43 : this.partnerProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerProviderPattern == null
                                ? 43
                                : this.partnerProviderPattern.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantProviderId == null ? 43 : this.tenantProviderId.hashCode());
        result = (result * PRIME) + (this.succinctId == null ? 43 : this.succinctId.hashCode());
        result =
                (result * PRIME)
                        + (this.assertionConsumerUrl == null
                                ? 43
                                : this.assertionConsumerUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutRequestUrl == null ? 43 : this.logoutRequestUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutResponseUrl == null ? 43 : this.logoutResponseUrl.hashCode());
        result = (result * PRIME) + (this.nameIdFormat == null ? 43 : this.nameIdFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.signingCertificate == null
                                ? 43
                                : this.signingCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionCertificate == null
                                ? 43
                                : this.encryptionCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithm == null
                                ? 43
                                : this.encryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.keyEncryptionAlgorithm == null
                                ? 43
                                : this.keyEncryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptAssertion == null ? 43 : this.encryptAssertion.hashCode());
        result =
                (result * PRIME)
                        + (this.signResponseOrAssertion == null
                                ? 43
                                : this.signResponseOrAssertion.hashCode());
        result =
                (result * PRIME)
                        + (this.includeSigningCertInSignature == null
                                ? 43
                                : this.includeSigningCertInSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutBinding == null ? 43 : this.logoutBinding.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutEnabled == null ? 43 : this.logoutEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureHashAlgorithm == null
                                ? 43
                                : this.signatureHashAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.federationProtocol == null
                                ? 43
                                : this.federationProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.nameIdUserstoreAttribute == null
                                ? 43
                                : this.nameIdUserstoreAttribute.hashCode());
        result = (result * PRIME) + (this.hokRequired == null ? 43 : this.hokRequired.hashCode());
        result = (result * PRIME) + (this.hokAcsUrl == null ? 43 : this.hokAcsUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.lastNotificationSentTime == null
                                ? 43
                                : this.lastNotificationSentTime.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundAssertionAttributes == null
                                ? 43
                                : this.outboundAssertionAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.userAssertionAttributes == null
                                ? 43
                                : this.userAssertionAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.groupAssertionAttributes == null
                                ? 43
                                : this.groupAssertionAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
