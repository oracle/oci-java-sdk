/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Multi Factor Authentication Settings for Tenant <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuthenticationFactorSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuthenticationFactorSetting
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "ocid",
        "schemas",
        "meta",
        "idcsCreatedBy",
        "idcsLastModifiedBy",
        "idcsPreventedOperations",
        "tags",
        "deleteInProgress",
        "idcsLastUpgradedInRelease",
        "domainOcid",
        "compartmentOcid",
        "tenancyOcid",
        "emailEnabled",
        "smsEnabled",
        "phoneCallEnabled",
        "totpEnabled",
        "pushEnabled",
        "bypassCodeEnabled",
        "securityQuestionsEnabled",
        "fidoAuthenticatorEnabled",
        "yubicoOtpEnabled",
        "mfaEnrollmentType",
        "mfaEnabledCategory",
        "hideBackupFactorEnabled",
        "autoEnrollEmailFactorDisabled",
        "userEnrollmentDisabledFactors",
        "emailSettings",
        "thirdPartyFactor",
        "notificationSettings",
        "identityStoreSettings",
        "bypassCodeSettings",
        "clientAppSettings",
        "endpointRestrictions",
        "compliancePolicy",
        "totpSettings",
        "urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings",
        "urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings"
    })
    public AuthenticationFactorSetting(
            String id,
            String ocid,
            java.util.List<String> schemas,
            Meta meta,
            IdcsCreatedBy idcsCreatedBy,
            IdcsLastModifiedBy idcsLastModifiedBy,
            java.util.List<IdcsPreventedOperations> idcsPreventedOperations,
            java.util.List<Tags> tags,
            Boolean deleteInProgress,
            String idcsLastUpgradedInRelease,
            String domainOcid,
            String compartmentOcid,
            String tenancyOcid,
            Boolean emailEnabled,
            Boolean smsEnabled,
            Boolean phoneCallEnabled,
            Boolean totpEnabled,
            Boolean pushEnabled,
            Boolean bypassCodeEnabled,
            Boolean securityQuestionsEnabled,
            Boolean fidoAuthenticatorEnabled,
            Boolean yubicoOtpEnabled,
            String mfaEnrollmentType,
            String mfaEnabledCategory,
            Boolean hideBackupFactorEnabled,
            Boolean autoEnrollEmailFactorDisabled,
            java.util.List<UserEnrollmentDisabledFactors> userEnrollmentDisabledFactors,
            AuthenticationFactorSettingsEmailSettings emailSettings,
            AuthenticationFactorSettingsThirdPartyFactor thirdPartyFactor,
            AuthenticationFactorSettingsNotificationSettings notificationSettings,
            AuthenticationFactorSettingsIdentityStoreSettings identityStoreSettings,
            AuthenticationFactorSettingsBypassCodeSettings bypassCodeSettings,
            AuthenticationFactorSettingsClientAppSettings clientAppSettings,
            AuthenticationFactorSettingsEndpointRestrictions endpointRestrictions,
            java.util.List<AuthenticationFactorSettingsCompliancePolicy> compliancePolicy,
            AuthenticationFactorSettingsTotpSettings totpSettings,
            ExtensionThirdPartyAuthenticationFactorSettings
                    urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings,
            ExtensionFidoAuthenticationFactorSettings
                    urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings) {
        super();
        this.id = id;
        this.ocid = ocid;
        this.schemas = schemas;
        this.meta = meta;
        this.idcsCreatedBy = idcsCreatedBy;
        this.idcsLastModifiedBy = idcsLastModifiedBy;
        this.idcsPreventedOperations = idcsPreventedOperations;
        this.tags = tags;
        this.deleteInProgress = deleteInProgress;
        this.idcsLastUpgradedInRelease = idcsLastUpgradedInRelease;
        this.domainOcid = domainOcid;
        this.compartmentOcid = compartmentOcid;
        this.tenancyOcid = tenancyOcid;
        this.emailEnabled = emailEnabled;
        this.smsEnabled = smsEnabled;
        this.phoneCallEnabled = phoneCallEnabled;
        this.totpEnabled = totpEnabled;
        this.pushEnabled = pushEnabled;
        this.bypassCodeEnabled = bypassCodeEnabled;
        this.securityQuestionsEnabled = securityQuestionsEnabled;
        this.fidoAuthenticatorEnabled = fidoAuthenticatorEnabled;
        this.yubicoOtpEnabled = yubicoOtpEnabled;
        this.mfaEnrollmentType = mfaEnrollmentType;
        this.mfaEnabledCategory = mfaEnabledCategory;
        this.hideBackupFactorEnabled = hideBackupFactorEnabled;
        this.autoEnrollEmailFactorDisabled = autoEnrollEmailFactorDisabled;
        this.userEnrollmentDisabledFactors = userEnrollmentDisabledFactors;
        this.emailSettings = emailSettings;
        this.thirdPartyFactor = thirdPartyFactor;
        this.notificationSettings = notificationSettings;
        this.identityStoreSettings = identityStoreSettings;
        this.bypassCodeSettings = bypassCodeSettings;
        this.clientAppSettings = clientAppSettings;
        this.endpointRestrictions = endpointRestrictions;
        this.compliancePolicy = compliancePolicy;
        this.totpSettings = totpSettings;
        this.urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings =
                urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings;
        this.urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings =
                urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
         * representation of the Resource MUST include a non-empty id value. This identifier MUST be
         * unique across the Service Provider's entire set of Resources. It MUST be a stable,
         * non-reassignable identifier that does not change when the same Resource is returned in
         * subsequent requests. The value of the id attribute is always issued by the Service
         * Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved
         * keyword and MUST NOT be used in the unique identifier.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
         * representation of the Resource MUST include a non-empty id value. This identifier MUST be
         * unique across the Service Provider's entire set of Resources. It MUST be a stable,
         * non-reassignable identifier that does not change when the same Resource is returned in
         * subsequent requests. The value of the id attribute is always issued by the Service
         * Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved
         * keyword and MUST NOT be used in the unique identifier.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: always - type: string - uniqueness:
         * global
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique OCI identifier for the SCIM Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * Unique OCI identifier for the SCIM Resource.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * global
         *
         * @param ocid the value to set
         * @return this builder
         */
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }
        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
         * supported schema version for a SCIM representation as well any schema extensions
         * supported by that representation. Each String value must be a unique URI. This
         * specification defines URIs for User, Group, and a standard \\"enterprise\\" extension.
         * All representations of SCIM schema MUST include a non-zero value array with value(s) of
         * the URIs supported by that representation. Duplicate values MUST NOT be included. Value
         * order is not specified and MUST not impact behavior.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
         * supported schema version for a SCIM representation as well any schema extensions
         * supported by that representation. Each String value must be a unique URI. This
         * specification defines URIs for User, Group, and a standard \\"enterprise\\" extension.
         * All representations of SCIM schema MUST include a non-zero value array with value(s) of
         * the URIs supported by that representation. Duplicate values MUST NOT be included. Value
         * order is not specified and MUST not impact behavior.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("meta")
        private Meta meta;

        public Builder meta(Meta meta) {
            this.meta = meta;
            this.__explicitlySet__.add("meta");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsCreatedBy")
        private IdcsCreatedBy idcsCreatedBy;

        public Builder idcsCreatedBy(IdcsCreatedBy idcsCreatedBy) {
            this.idcsCreatedBy = idcsCreatedBy;
            this.__explicitlySet__.add("idcsCreatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsLastModifiedBy")
        private IdcsLastModifiedBy idcsLastModifiedBy;

        public Builder idcsLastModifiedBy(IdcsLastModifiedBy idcsLastModifiedBy) {
            this.idcsLastModifiedBy = idcsLastModifiedBy;
            this.__explicitlySet__.add("idcsLastModifiedBy");
            return this;
        }
        /**
         * Each value of this attribute specifies an operation that only an internal client may
         * perform on this particular resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
        private java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

        /**
         * Each value of this attribute specifies an operation that only an internal client may
         * perform on this particular resource.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         *
         * @param idcsPreventedOperations the value to set
         * @return this builder
         */
        public Builder idcsPreventedOperations(
                java.util.List<IdcsPreventedOperations> idcsPreventedOperations) {
            this.idcsPreventedOperations = idcsPreventedOperations;
            this.__explicitlySet__.add("idcsPreventedOperations");
            return this;
        }
        /**
         * A list of tags on this resource.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tags> tags;

        /**
         * A list of tags on this resource.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to
         * true when synchronous deletion of the resource would take too long.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
        private Boolean deleteInProgress;

        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to
         * true when synchronous deletion of the resource would take too long.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param deleteInProgress the value to set
         * @return this builder
         */
        public Builder deleteInProgress(Boolean deleteInProgress) {
            this.deleteInProgress = deleteInProgress;
            this.__explicitlySet__.add("deleteInProgress");
            return this;
        }
        /**
         * The release number when the resource was upgraded.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
        private String idcsLastUpgradedInRelease;

        /**
         * The release number when the resource was upgraded.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         *
         * @param idcsLastUpgradedInRelease the value to set
         * @return this builder
         */
        public Builder idcsLastUpgradedInRelease(String idcsLastUpgradedInRelease) {
            this.idcsLastUpgradedInRelease = idcsLastUpgradedInRelease;
            this.__explicitlySet__.add("idcsLastUpgradedInRelease");
            return this;
        }
        /**
         * OCI Domain Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
        private String domainOcid;

        /**
         * OCI Domain Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param domainOcid the value to set
         * @return this builder
         */
        public Builder domainOcid(String domainOcid) {
            this.domainOcid = domainOcid;
            this.__explicitlySet__.add("domainOcid");
            return this;
        }
        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
        private String compartmentOcid;

        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param compartmentOcid the value to set
         * @return this builder
         */
        public Builder compartmentOcid(String compartmentOcid) {
            this.compartmentOcid = compartmentOcid;
            this.__explicitlySet__.add("compartmentOcid");
            return this;
        }
        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
        private String tenancyOcid;

        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param tenancyOcid the value to set
         * @return this builder
         */
        public Builder tenancyOcid(String tenancyOcid) {
            this.tenancyOcid = tenancyOcid;
            this.__explicitlySet__.add("tenancyOcid");
            return this;
        }
        /**
         * If true, indicates that the EMAIL channel is enabled for authentication
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("emailEnabled")
        private Boolean emailEnabled;

        /**
         * If true, indicates that the EMAIL channel is enabled for authentication
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param emailEnabled the value to set
         * @return this builder
         */
        public Builder emailEnabled(Boolean emailEnabled) {
            this.emailEnabled = emailEnabled;
            this.__explicitlySet__.add("emailEnabled");
            return this;
        }
        /**
         * If true, indicates that the Short Message Service (SMS) channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smsEnabled")
        private Boolean smsEnabled;

        /**
         * If true, indicates that the Short Message Service (SMS) channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param smsEnabled the value to set
         * @return this builder
         */
        public Builder smsEnabled(Boolean smsEnabled) {
            this.smsEnabled = smsEnabled;
            this.__explicitlySet__.add("smsEnabled");
            return this;
        }
        /**
         * If true, indicates that the phone (PHONE_CALL) channel is enabled for authentication
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("phoneCallEnabled")
        private Boolean phoneCallEnabled;

        /**
         * If true, indicates that the phone (PHONE_CALL) channel is enabled for authentication
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param phoneCallEnabled the value to set
         * @return this builder
         */
        public Builder phoneCallEnabled(Boolean phoneCallEnabled) {
            this.phoneCallEnabled = phoneCallEnabled;
            this.__explicitlySet__.add("phoneCallEnabled");
            return this;
        }
        /**
         * If true, indicates that the Mobile App One Time Passcode channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totpEnabled")
        private Boolean totpEnabled;

        /**
         * If true, indicates that the Mobile App One Time Passcode channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param totpEnabled the value to set
         * @return this builder
         */
        public Builder totpEnabled(Boolean totpEnabled) {
            this.totpEnabled = totpEnabled;
            this.__explicitlySet__.add("totpEnabled");
            return this;
        }
        /**
         * If true, indicates that the Mobile App Push Notification channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pushEnabled")
        private Boolean pushEnabled;

        /**
         * If true, indicates that the Mobile App Push Notification channel is enabled for
         * authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param pushEnabled the value to set
         * @return this builder
         */
        public Builder pushEnabled(Boolean pushEnabled) {
            this.pushEnabled = pushEnabled;
            this.__explicitlySet__.add("pushEnabled");
            return this;
        }
        /**
         * If true, indicates that Bypass Code is enabled for authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bypassCodeEnabled")
        private Boolean bypassCodeEnabled;

        /**
         * If true, indicates that Bypass Code is enabled for authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param bypassCodeEnabled the value to set
         * @return this builder
         */
        public Builder bypassCodeEnabled(Boolean bypassCodeEnabled) {
            this.bypassCodeEnabled = bypassCodeEnabled;
            this.__explicitlySet__.add("bypassCodeEnabled");
            return this;
        }
        /**
         * If true, indicates that Security Questions are enabled for authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityQuestionsEnabled")
        private Boolean securityQuestionsEnabled;

        /**
         * If true, indicates that Security Questions are enabled for authentication
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param securityQuestionsEnabled the value to set
         * @return this builder
         */
        public Builder securityQuestionsEnabled(Boolean securityQuestionsEnabled) {
            this.securityQuestionsEnabled = securityQuestionsEnabled;
            this.__explicitlySet__.add("securityQuestionsEnabled");
            return this;
        }
        /**
         * If true, indicates that the Fido Authenticator channels are enabled for authentication
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fidoAuthenticatorEnabled")
        private Boolean fidoAuthenticatorEnabled;

        /**
         * If true, indicates that the Fido Authenticator channels are enabled for authentication
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param fidoAuthenticatorEnabled the value to set
         * @return this builder
         */
        public Builder fidoAuthenticatorEnabled(Boolean fidoAuthenticatorEnabled) {
            this.fidoAuthenticatorEnabled = fidoAuthenticatorEnabled;
            this.__explicitlySet__.add("fidoAuthenticatorEnabled");
            return this;
        }
        /**
         * If true, indicates that the Yubico OTP is enabled for authentication
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("yubicoOtpEnabled")
        private Boolean yubicoOtpEnabled;

        /**
         * If true, indicates that the Yubico OTP is enabled for authentication
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param yubicoOtpEnabled the value to set
         * @return this builder
         */
        public Builder yubicoOtpEnabled(Boolean yubicoOtpEnabled) {
            this.yubicoOtpEnabled = yubicoOtpEnabled;
            this.__explicitlySet__.add("yubicoOtpEnabled");
            return this;
        }
        /**
         * Specifies if Multi-Factor Authentication enrollment is mandatory or optional for a user
         *
         * <p>*Deprecated Since: 18.1.2**
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "mfaEnrollmentType" and attrValues.value eq "$(mfaEnrollmentType)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mfaEnrollmentType")
        private String mfaEnrollmentType;

        /**
         * Specifies if Multi-Factor Authentication enrollment is mandatory or optional for a user
         *
         * <p>*Deprecated Since: 18.1.2**
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "mfaEnrollmentType" and attrValues.value eq "$(mfaEnrollmentType)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         *
         * @param mfaEnrollmentType the value to set
         * @return this builder
         */
        public Builder mfaEnrollmentType(String mfaEnrollmentType) {
            this.mfaEnrollmentType = mfaEnrollmentType;
            this.__explicitlySet__.add("mfaEnrollmentType");
            return this;
        }
        /**
         * Specifies the category of people for whom Multi-Factor Authentication is enabled. This is
         * a readOnly attribute which reflects the value of mfaEnabledCategory attribute in
         * SsoSettings
         *
         * <p>*Deprecated Since: 18.1.2**
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mfaEnabledCategory")
        private String mfaEnabledCategory;

        /**
         * Specifies the category of people for whom Multi-Factor Authentication is enabled. This is
         * a readOnly attribute which reflects the value of mfaEnabledCategory attribute in
         * SsoSettings
         *
         * <p>*Deprecated Since: 18.1.2**
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param mfaEnabledCategory the value to set
         * @return this builder
         */
        public Builder mfaEnabledCategory(String mfaEnabledCategory) {
            this.mfaEnabledCategory = mfaEnabledCategory;
            this.__explicitlySet__.add("mfaEnabledCategory");
            return this;
        }
        /**
         * If true, indicates that 'Show backup factor(s)' button will be hidden during
         * authentication
         *
         * <p>*Added In:** 19.3.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hideBackupFactorEnabled")
        private Boolean hideBackupFactorEnabled;

        /**
         * If true, indicates that 'Show backup factor(s)' button will be hidden during
         * authentication
         *
         * <p>*Added In:** 19.3.3
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param hideBackupFactorEnabled the value to set
         * @return this builder
         */
        public Builder hideBackupFactorEnabled(Boolean hideBackupFactorEnabled) {
            this.hideBackupFactorEnabled = hideBackupFactorEnabled;
            this.__explicitlySet__.add("hideBackupFactorEnabled");
            return this;
        }
        /**
         * If true, indicates that email will not be enrolled as a MFA factor automatically if it a
         * account recovery factor
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoEnrollEmailFactorDisabled")
        private Boolean autoEnrollEmailFactorDisabled;

        /**
         * If true, indicates that email will not be enrolled as a MFA factor automatically if it a
         * account recovery factor
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param autoEnrollEmailFactorDisabled the value to set
         * @return this builder
         */
        public Builder autoEnrollEmailFactorDisabled(Boolean autoEnrollEmailFactorDisabled) {
            this.autoEnrollEmailFactorDisabled = autoEnrollEmailFactorDisabled;
            this.__explicitlySet__.add("autoEnrollEmailFactorDisabled");
            return this;
        }
        /**
         * Factors for which enrollment should be blocked for End User
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userEnrollmentDisabledFactors")
        private java.util.List<UserEnrollmentDisabledFactors> userEnrollmentDisabledFactors;

        /**
         * Factors for which enrollment should be blocked for End User
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param userEnrollmentDisabledFactors the value to set
         * @return this builder
         */
        public Builder userEnrollmentDisabledFactors(
                java.util.List<UserEnrollmentDisabledFactors> userEnrollmentDisabledFactors) {
            this.userEnrollmentDisabledFactors = userEnrollmentDisabledFactors;
            this.__explicitlySet__.add("userEnrollmentDisabledFactors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailSettings")
        private AuthenticationFactorSettingsEmailSettings emailSettings;

        public Builder emailSettings(AuthenticationFactorSettingsEmailSettings emailSettings) {
            this.emailSettings = emailSettings;
            this.__explicitlySet__.add("emailSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactor")
        private AuthenticationFactorSettingsThirdPartyFactor thirdPartyFactor;

        public Builder thirdPartyFactor(
                AuthenticationFactorSettingsThirdPartyFactor thirdPartyFactor) {
            this.thirdPartyFactor = thirdPartyFactor;
            this.__explicitlySet__.add("thirdPartyFactor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notificationSettings")
        private AuthenticationFactorSettingsNotificationSettings notificationSettings;

        public Builder notificationSettings(
                AuthenticationFactorSettingsNotificationSettings notificationSettings) {
            this.notificationSettings = notificationSettings;
            this.__explicitlySet__.add("notificationSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityStoreSettings")
        private AuthenticationFactorSettingsIdentityStoreSettings identityStoreSettings;

        public Builder identityStoreSettings(
                AuthenticationFactorSettingsIdentityStoreSettings identityStoreSettings) {
            this.identityStoreSettings = identityStoreSettings;
            this.__explicitlySet__.add("identityStoreSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bypassCodeSettings")
        private AuthenticationFactorSettingsBypassCodeSettings bypassCodeSettings;

        public Builder bypassCodeSettings(
                AuthenticationFactorSettingsBypassCodeSettings bypassCodeSettings) {
            this.bypassCodeSettings = bypassCodeSettings;
            this.__explicitlySet__.add("bypassCodeSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientAppSettings")
        private AuthenticationFactorSettingsClientAppSettings clientAppSettings;

        public Builder clientAppSettings(
                AuthenticationFactorSettingsClientAppSettings clientAppSettings) {
            this.clientAppSettings = clientAppSettings;
            this.__explicitlySet__.add("clientAppSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpointRestrictions")
        private AuthenticationFactorSettingsEndpointRestrictions endpointRestrictions;

        public Builder endpointRestrictions(
                AuthenticationFactorSettingsEndpointRestrictions endpointRestrictions) {
            this.endpointRestrictions = endpointRestrictions;
            this.__explicitlySet__.add("endpointRestrictions");
            return this;
        }
        /**
         * Compliance Policy that defines actions to be taken when a condition is violated
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: true - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicy")
        private java.util.List<AuthenticationFactorSettingsCompliancePolicy> compliancePolicy;

        /**
         * Compliance Policy that defines actions to be taken when a condition is violated
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: true - returned: default - type:
         * complex - uniqueness: none
         *
         * @param compliancePolicy the value to set
         * @return this builder
         */
        public Builder compliancePolicy(
                java.util.List<AuthenticationFactorSettingsCompliancePolicy> compliancePolicy) {
            this.compliancePolicy = compliancePolicy;
            this.__explicitlySet__.add("compliancePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totpSettings")
        private AuthenticationFactorSettingsTotpSettings totpSettings;

        public Builder totpSettings(AuthenticationFactorSettingsTotpSettings totpSettings) {
            this.totpSettings = totpSettings;
            this.__explicitlySet__.add("totpSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:thirdParty:AuthenticationFactorSettings")
        private ExtensionThirdPartyAuthenticationFactorSettings
                urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings;

        public Builder
                urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings(
                        ExtensionThirdPartyAuthenticationFactorSettings
                                urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings) {
            this.urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings =
                    urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings;
            this.__explicitlySet__.add(
                    "urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:fido:AuthenticationFactorSettings")
        private ExtensionFidoAuthenticationFactorSettings
                urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings;

        public Builder urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings(
                ExtensionFidoAuthenticationFactorSettings
                        urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings) {
            this.urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings =
                    urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings;
            this.__explicitlySet__.add(
                    "urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSetting build() {
            AuthenticationFactorSetting model =
                    new AuthenticationFactorSetting(
                            this.id,
                            this.ocid,
                            this.schemas,
                            this.meta,
                            this.idcsCreatedBy,
                            this.idcsLastModifiedBy,
                            this.idcsPreventedOperations,
                            this.tags,
                            this.deleteInProgress,
                            this.idcsLastUpgradedInRelease,
                            this.domainOcid,
                            this.compartmentOcid,
                            this.tenancyOcid,
                            this.emailEnabled,
                            this.smsEnabled,
                            this.phoneCallEnabled,
                            this.totpEnabled,
                            this.pushEnabled,
                            this.bypassCodeEnabled,
                            this.securityQuestionsEnabled,
                            this.fidoAuthenticatorEnabled,
                            this.yubicoOtpEnabled,
                            this.mfaEnrollmentType,
                            this.mfaEnabledCategory,
                            this.hideBackupFactorEnabled,
                            this.autoEnrollEmailFactorDisabled,
                            this.userEnrollmentDisabledFactors,
                            this.emailSettings,
                            this.thirdPartyFactor,
                            this.notificationSettings,
                            this.identityStoreSettings,
                            this.bypassCodeSettings,
                            this.clientAppSettings,
                            this.endpointRestrictions,
                            this.compliancePolicy,
                            this.totpSettings,
                            this
                                    .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings,
                            this
                                    .urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSetting model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ocid")) {
                this.ocid(model.getOcid());
            }
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("meta")) {
                this.meta(model.getMeta());
            }
            if (model.wasPropertyExplicitlySet("idcsCreatedBy")) {
                this.idcsCreatedBy(model.getIdcsCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("idcsLastModifiedBy")) {
                this.idcsLastModifiedBy(model.getIdcsLastModifiedBy());
            }
            if (model.wasPropertyExplicitlySet("idcsPreventedOperations")) {
                this.idcsPreventedOperations(model.getIdcsPreventedOperations());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("deleteInProgress")) {
                this.deleteInProgress(model.getDeleteInProgress());
            }
            if (model.wasPropertyExplicitlySet("idcsLastUpgradedInRelease")) {
                this.idcsLastUpgradedInRelease(model.getIdcsLastUpgradedInRelease());
            }
            if (model.wasPropertyExplicitlySet("domainOcid")) {
                this.domainOcid(model.getDomainOcid());
            }
            if (model.wasPropertyExplicitlySet("compartmentOcid")) {
                this.compartmentOcid(model.getCompartmentOcid());
            }
            if (model.wasPropertyExplicitlySet("tenancyOcid")) {
                this.tenancyOcid(model.getTenancyOcid());
            }
            if (model.wasPropertyExplicitlySet("emailEnabled")) {
                this.emailEnabled(model.getEmailEnabled());
            }
            if (model.wasPropertyExplicitlySet("smsEnabled")) {
                this.smsEnabled(model.getSmsEnabled());
            }
            if (model.wasPropertyExplicitlySet("phoneCallEnabled")) {
                this.phoneCallEnabled(model.getPhoneCallEnabled());
            }
            if (model.wasPropertyExplicitlySet("totpEnabled")) {
                this.totpEnabled(model.getTotpEnabled());
            }
            if (model.wasPropertyExplicitlySet("pushEnabled")) {
                this.pushEnabled(model.getPushEnabled());
            }
            if (model.wasPropertyExplicitlySet("bypassCodeEnabled")) {
                this.bypassCodeEnabled(model.getBypassCodeEnabled());
            }
            if (model.wasPropertyExplicitlySet("securityQuestionsEnabled")) {
                this.securityQuestionsEnabled(model.getSecurityQuestionsEnabled());
            }
            if (model.wasPropertyExplicitlySet("fidoAuthenticatorEnabled")) {
                this.fidoAuthenticatorEnabled(model.getFidoAuthenticatorEnabled());
            }
            if (model.wasPropertyExplicitlySet("yubicoOtpEnabled")) {
                this.yubicoOtpEnabled(model.getYubicoOtpEnabled());
            }
            if (model.wasPropertyExplicitlySet("mfaEnrollmentType")) {
                this.mfaEnrollmentType(model.getMfaEnrollmentType());
            }
            if (model.wasPropertyExplicitlySet("mfaEnabledCategory")) {
                this.mfaEnabledCategory(model.getMfaEnabledCategory());
            }
            if (model.wasPropertyExplicitlySet("hideBackupFactorEnabled")) {
                this.hideBackupFactorEnabled(model.getHideBackupFactorEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoEnrollEmailFactorDisabled")) {
                this.autoEnrollEmailFactorDisabled(model.getAutoEnrollEmailFactorDisabled());
            }
            if (model.wasPropertyExplicitlySet("userEnrollmentDisabledFactors")) {
                this.userEnrollmentDisabledFactors(model.getUserEnrollmentDisabledFactors());
            }
            if (model.wasPropertyExplicitlySet("emailSettings")) {
                this.emailSettings(model.getEmailSettings());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyFactor")) {
                this.thirdPartyFactor(model.getThirdPartyFactor());
            }
            if (model.wasPropertyExplicitlySet("notificationSettings")) {
                this.notificationSettings(model.getNotificationSettings());
            }
            if (model.wasPropertyExplicitlySet("identityStoreSettings")) {
                this.identityStoreSettings(model.getIdentityStoreSettings());
            }
            if (model.wasPropertyExplicitlySet("bypassCodeSettings")) {
                this.bypassCodeSettings(model.getBypassCodeSettings());
            }
            if (model.wasPropertyExplicitlySet("clientAppSettings")) {
                this.clientAppSettings(model.getClientAppSettings());
            }
            if (model.wasPropertyExplicitlySet("endpointRestrictions")) {
                this.endpointRestrictions(model.getEndpointRestrictions());
            }
            if (model.wasPropertyExplicitlySet("compliancePolicy")) {
                this.compliancePolicy(model.getCompliancePolicy());
            }
            if (model.wasPropertyExplicitlySet("totpSettings")) {
                this.totpSettings(model.getTotpSettings());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings")) {
                this
                        .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings(
                                model
                                        .getUrnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings")) {
                this.urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings(
                        model
                                .getUrnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings());
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
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
     * representation of the Resource MUST include a non-empty id value. This identifier MUST be
     * unique across the Service Provider's entire set of Resources. It MUST be a stable,
     * non-reassignable identifier that does not change when the same Resource is returned in
     * subsequent requests. The value of the id attribute is always issued by the Service Provider
     * and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST
     * NOT be used in the unique identifier.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each
     * representation of the Resource MUST include a non-empty id value. This identifier MUST be
     * unique across the Service Provider's entire set of Resources. It MUST be a stable,
     * non-reassignable identifier that does not change when the same Resource is returned in
     * subsequent requests. The value of the id attribute is always issued by the Service Provider
     * and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST
     * NOT be used in the unique identifier.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: always - type: string - uniqueness: global
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Unique OCI identifier for the SCIM Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * Unique OCI identifier for the SCIM Resource.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * global
     *
     * @return the value
     */
    public String getOcid() {
        return ocid;
    }

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
     * supported schema version for a SCIM representation as well any schema extensions supported by
     * that representation. Each String value must be a unique URI. This specification defines URIs
     * for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM
     * schema MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the
     * supported schema version for a SCIM representation as well any schema extensions supported by
     * that representation. Each String value must be a unique URI. This specification defines URIs
     * for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM
     * schema MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    private final Meta meta;

    public Meta getMeta() {
        return meta;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsCreatedBy")
    private final IdcsCreatedBy idcsCreatedBy;

    public IdcsCreatedBy getIdcsCreatedBy() {
        return idcsCreatedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsLastModifiedBy")
    private final IdcsLastModifiedBy idcsLastModifiedBy;

    public IdcsLastModifiedBy getIdcsLastModifiedBy() {
        return idcsLastModifiedBy;
    }

    /**
     * Each value of this attribute specifies an operation that only an internal client may perform
     * on this particular resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
    private final java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

    /**
     * Each value of this attribute specifies an operation that only an internal client may perform
     * on this particular resource.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdcsPreventedOperations> getIdcsPreventedOperations() {
        return idcsPreventedOperations;
    }

    /**
     * A list of tags on this resource.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tags> tags;

    /**
     * A list of tags on this resource.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [key, value] - idcsSearchable: true -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<Tags> getTags() {
        return tags;
    }

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true
     * when synchronous deletion of the resource would take too long.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
    private final Boolean deleteInProgress;

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true
     * when synchronous deletion of the resource would take too long.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getDeleteInProgress() {
        return deleteInProgress;
    }

    /**
     * The release number when the resource was upgraded.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
    private final String idcsLastUpgradedInRelease;

    /**
     * The release number when the resource was upgraded.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsLastUpgradedInRelease() {
        return idcsLastUpgradedInRelease;
    }

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
    private final String domainOcid;

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDomainOcid() {
        return domainOcid;
    }

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
    private final String compartmentOcid;

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCompartmentOcid() {
        return compartmentOcid;
    }

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
    private final String tenancyOcid;

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTenancyOcid() {
        return tenancyOcid;
    }

    /**
     * If true, indicates that the EMAIL channel is enabled for authentication
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emailEnabled")
    private final Boolean emailEnabled;

    /**
     * If true, indicates that the EMAIL channel is enabled for authentication
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getEmailEnabled() {
        return emailEnabled;
    }

    /**
     * If true, indicates that the Short Message Service (SMS) channel is enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smsEnabled")
    private final Boolean smsEnabled;

    /**
     * If true, indicates that the Short Message Service (SMS) channel is enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getSmsEnabled() {
        return smsEnabled;
    }

    /**
     * If true, indicates that the phone (PHONE_CALL) channel is enabled for authentication
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phoneCallEnabled")
    private final Boolean phoneCallEnabled;

    /**
     * If true, indicates that the phone (PHONE_CALL) channel is enabled for authentication
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getPhoneCallEnabled() {
        return phoneCallEnabled;
    }

    /**
     * If true, indicates that the Mobile App One Time Passcode channel is enabled for
     * authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totpEnabled")
    private final Boolean totpEnabled;

    /**
     * If true, indicates that the Mobile App One Time Passcode channel is enabled for
     * authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getTotpEnabled() {
        return totpEnabled;
    }

    /**
     * If true, indicates that the Mobile App Push Notification channel is enabled for
     * authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pushEnabled")
    private final Boolean pushEnabled;

    /**
     * If true, indicates that the Mobile App Push Notification channel is enabled for
     * authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getPushEnabled() {
        return pushEnabled;
    }

    /**
     * If true, indicates that Bypass Code is enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bypassCodeEnabled")
    private final Boolean bypassCodeEnabled;

    /**
     * If true, indicates that Bypass Code is enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getBypassCodeEnabled() {
        return bypassCodeEnabled;
    }

    /**
     * If true, indicates that Security Questions are enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityQuestionsEnabled")
    private final Boolean securityQuestionsEnabled;

    /**
     * If true, indicates that Security Questions are enabled for authentication
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getSecurityQuestionsEnabled() {
        return securityQuestionsEnabled;
    }

    /**
     * If true, indicates that the Fido Authenticator channels are enabled for authentication
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fidoAuthenticatorEnabled")
    private final Boolean fidoAuthenticatorEnabled;

    /**
     * If true, indicates that the Fido Authenticator channels are enabled for authentication
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getFidoAuthenticatorEnabled() {
        return fidoAuthenticatorEnabled;
    }

    /**
     * If true, indicates that the Yubico OTP is enabled for authentication
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("yubicoOtpEnabled")
    private final Boolean yubicoOtpEnabled;

    /**
     * If true, indicates that the Yubico OTP is enabled for authentication
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getYubicoOtpEnabled() {
        return yubicoOtpEnabled;
    }

    /**
     * Specifies if Multi-Factor Authentication enrollment is mandatory or optional for a user
     *
     * <p>*Deprecated Since: 18.1.2**
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mfaEnrollmentType"
     * and attrValues.value eq "$(mfaEnrollmentType)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - idcsSearchable: false - multiValued: false - mutability: readWrite - required:
     * true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mfaEnrollmentType")
    private final String mfaEnrollmentType;

    /**
     * Specifies if Multi-Factor Authentication enrollment is mandatory or optional for a user
     *
     * <p>*Deprecated Since: 18.1.2**
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mfaEnrollmentType"
     * and attrValues.value eq "$(mfaEnrollmentType)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - idcsSearchable: false - multiValued: false - mutability: readWrite - required:
     * true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMfaEnrollmentType() {
        return mfaEnrollmentType;
    }

    /**
     * Specifies the category of people for whom Multi-Factor Authentication is enabled. This is a
     * readOnly attribute which reflects the value of mfaEnabledCategory attribute in SsoSettings
     *
     * <p>*Deprecated Since: 18.1.2**
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mfaEnabledCategory")
    private final String mfaEnabledCategory;

    /**
     * Specifies the category of people for whom Multi-Factor Authentication is enabled. This is a
     * readOnly attribute which reflects the value of mfaEnabledCategory attribute in SsoSettings
     *
     * <p>*Deprecated Since: 18.1.2**
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMfaEnabledCategory() {
        return mfaEnabledCategory;
    }

    /**
     * If true, indicates that 'Show backup factor(s)' button will be hidden during authentication
     *
     * <p>*Added In:** 19.3.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hideBackupFactorEnabled")
    private final Boolean hideBackupFactorEnabled;

    /**
     * If true, indicates that 'Show backup factor(s)' button will be hidden during authentication
     *
     * <p>*Added In:** 19.3.3
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getHideBackupFactorEnabled() {
        return hideBackupFactorEnabled;
    }

    /**
     * If true, indicates that email will not be enrolled as a MFA factor automatically if it a
     * account recovery factor
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoEnrollEmailFactorDisabled")
    private final Boolean autoEnrollEmailFactorDisabled;

    /**
     * If true, indicates that email will not be enrolled as a MFA factor automatically if it a
     * account recovery factor
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAutoEnrollEmailFactorDisabled() {
        return autoEnrollEmailFactorDisabled;
    }

    /** */
    public enum UserEnrollmentDisabledFactors implements com.oracle.bmc.http.internal.BmcEnum {
        Email("EMAIL"),
        Sms("SMS"),
        Totp("TOTP"),
        Push("PUSH"),
        Offlinetotp("OFFLINETOTP"),
        Voice("VOICE"),
        PhoneCall("PHONE_CALL"),
        Thirdparty("THIRDPARTY"),
        FidoAuthenticator("FIDO_AUTHENTICATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserEnrollmentDisabledFactors.class);

        private final String value;
        private static java.util.Map<String, UserEnrollmentDisabledFactors> map;

        static {
            map = new java.util.HashMap<>();
            for (UserEnrollmentDisabledFactors v : UserEnrollmentDisabledFactors.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserEnrollmentDisabledFactors(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserEnrollmentDisabledFactors create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserEnrollmentDisabledFactors', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Factors for which enrollment should be blocked for End User
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userEnrollmentDisabledFactors")
    private final java.util.List<UserEnrollmentDisabledFactors> userEnrollmentDisabledFactors;

    /**
     * Factors for which enrollment should be blocked for End User
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserEnrollmentDisabledFactors> getUserEnrollmentDisabledFactors() {
        return userEnrollmentDisabledFactors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("emailSettings")
    private final AuthenticationFactorSettingsEmailSettings emailSettings;

    public AuthenticationFactorSettingsEmailSettings getEmailSettings() {
        return emailSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactor")
    private final AuthenticationFactorSettingsThirdPartyFactor thirdPartyFactor;

    public AuthenticationFactorSettingsThirdPartyFactor getThirdPartyFactor() {
        return thirdPartyFactor;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notificationSettings")
    private final AuthenticationFactorSettingsNotificationSettings notificationSettings;

    public AuthenticationFactorSettingsNotificationSettings getNotificationSettings() {
        return notificationSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("identityStoreSettings")
    private final AuthenticationFactorSettingsIdentityStoreSettings identityStoreSettings;

    public AuthenticationFactorSettingsIdentityStoreSettings getIdentityStoreSettings() {
        return identityStoreSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bypassCodeSettings")
    private final AuthenticationFactorSettingsBypassCodeSettings bypassCodeSettings;

    public AuthenticationFactorSettingsBypassCodeSettings getBypassCodeSettings() {
        return bypassCodeSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clientAppSettings")
    private final AuthenticationFactorSettingsClientAppSettings clientAppSettings;

    public AuthenticationFactorSettingsClientAppSettings getClientAppSettings() {
        return clientAppSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endpointRestrictions")
    private final AuthenticationFactorSettingsEndpointRestrictions endpointRestrictions;

    public AuthenticationFactorSettingsEndpointRestrictions getEndpointRestrictions() {
        return endpointRestrictions;
    }

    /**
     * Compliance Policy that defines actions to be taken when a condition is violated
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: true - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicy")
    private final java.util.List<AuthenticationFactorSettingsCompliancePolicy> compliancePolicy;

    /**
     * Compliance Policy that defines actions to be taken when a condition is violated
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [name] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: true - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AuthenticationFactorSettingsCompliancePolicy> getCompliancePolicy() {
        return compliancePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("totpSettings")
    private final AuthenticationFactorSettingsTotpSettings totpSettings;

    public AuthenticationFactorSettingsTotpSettings getTotpSettings() {
        return totpSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:thirdParty:AuthenticationFactorSettings")
    private final ExtensionThirdPartyAuthenticationFactorSettings
            urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings;

    public ExtensionThirdPartyAuthenticationFactorSettings
            getUrnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings() {
        return urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:fido:AuthenticationFactorSettings")
    private final ExtensionFidoAuthenticationFactorSettings
            urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings;

    public ExtensionFidoAuthenticationFactorSettings
            getUrnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings() {
        return urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings;
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
        sb.append("AuthenticationFactorSetting(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", ocid=").append(String.valueOf(this.ocid));
        sb.append(", schemas=").append(String.valueOf(this.schemas));
        sb.append(", meta=").append(String.valueOf(this.meta));
        sb.append(", idcsCreatedBy=").append(String.valueOf(this.idcsCreatedBy));
        sb.append(", idcsLastModifiedBy=").append(String.valueOf(this.idcsLastModifiedBy));
        sb.append(", idcsPreventedOperations=")
                .append(String.valueOf(this.idcsPreventedOperations));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", deleteInProgress=").append(String.valueOf(this.deleteInProgress));
        sb.append(", idcsLastUpgradedInRelease=")
                .append(String.valueOf(this.idcsLastUpgradedInRelease));
        sb.append(", domainOcid=").append(String.valueOf(this.domainOcid));
        sb.append(", compartmentOcid=").append(String.valueOf(this.compartmentOcid));
        sb.append(", tenancyOcid=").append(String.valueOf(this.tenancyOcid));
        sb.append(", emailEnabled=").append(String.valueOf(this.emailEnabled));
        sb.append(", smsEnabled=").append(String.valueOf(this.smsEnabled));
        sb.append(", phoneCallEnabled=").append(String.valueOf(this.phoneCallEnabled));
        sb.append(", totpEnabled=").append(String.valueOf(this.totpEnabled));
        sb.append(", pushEnabled=").append(String.valueOf(this.pushEnabled));
        sb.append(", bypassCodeEnabled=").append(String.valueOf(this.bypassCodeEnabled));
        sb.append(", securityQuestionsEnabled=")
                .append(String.valueOf(this.securityQuestionsEnabled));
        sb.append(", fidoAuthenticatorEnabled=")
                .append(String.valueOf(this.fidoAuthenticatorEnabled));
        sb.append(", yubicoOtpEnabled=").append(String.valueOf(this.yubicoOtpEnabled));
        sb.append(", mfaEnrollmentType=").append(String.valueOf(this.mfaEnrollmentType));
        sb.append(", mfaEnabledCategory=").append(String.valueOf(this.mfaEnabledCategory));
        sb.append(", hideBackupFactorEnabled=")
                .append(String.valueOf(this.hideBackupFactorEnabled));
        sb.append(", autoEnrollEmailFactorDisabled=")
                .append(String.valueOf(this.autoEnrollEmailFactorDisabled));
        sb.append(", userEnrollmentDisabledFactors=")
                .append(String.valueOf(this.userEnrollmentDisabledFactors));
        sb.append(", emailSettings=").append(String.valueOf(this.emailSettings));
        sb.append(", thirdPartyFactor=").append(String.valueOf(this.thirdPartyFactor));
        sb.append(", notificationSettings=").append(String.valueOf(this.notificationSettings));
        sb.append(", identityStoreSettings=").append(String.valueOf(this.identityStoreSettings));
        sb.append(", bypassCodeSettings=").append(String.valueOf(this.bypassCodeSettings));
        sb.append(", clientAppSettings=").append(String.valueOf(this.clientAppSettings));
        sb.append(", endpointRestrictions=").append(String.valueOf(this.endpointRestrictions));
        sb.append(", compliancePolicy=").append(String.valueOf(this.compliancePolicy));
        sb.append(", totpSettings=").append(String.valueOf(this.totpSettings));
        sb.append(
                        ", urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings=")
                .append(
                        String.valueOf(
                                this
                                        .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings));
        sb.append(", urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings=")
                .append(
                        String.valueOf(
                                this
                                        .urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSetting)) {
            return false;
        }

        AuthenticationFactorSetting other = (AuthenticationFactorSetting) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ocid, other.ocid)
                && java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.meta, other.meta)
                && java.util.Objects.equals(this.idcsCreatedBy, other.idcsCreatedBy)
                && java.util.Objects.equals(this.idcsLastModifiedBy, other.idcsLastModifiedBy)
                && java.util.Objects.equals(
                        this.idcsPreventedOperations, other.idcsPreventedOperations)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.deleteInProgress, other.deleteInProgress)
                && java.util.Objects.equals(
                        this.idcsLastUpgradedInRelease, other.idcsLastUpgradedInRelease)
                && java.util.Objects.equals(this.domainOcid, other.domainOcid)
                && java.util.Objects.equals(this.compartmentOcid, other.compartmentOcid)
                && java.util.Objects.equals(this.tenancyOcid, other.tenancyOcid)
                && java.util.Objects.equals(this.emailEnabled, other.emailEnabled)
                && java.util.Objects.equals(this.smsEnabled, other.smsEnabled)
                && java.util.Objects.equals(this.phoneCallEnabled, other.phoneCallEnabled)
                && java.util.Objects.equals(this.totpEnabled, other.totpEnabled)
                && java.util.Objects.equals(this.pushEnabled, other.pushEnabled)
                && java.util.Objects.equals(this.bypassCodeEnabled, other.bypassCodeEnabled)
                && java.util.Objects.equals(
                        this.securityQuestionsEnabled, other.securityQuestionsEnabled)
                && java.util.Objects.equals(
                        this.fidoAuthenticatorEnabled, other.fidoAuthenticatorEnabled)
                && java.util.Objects.equals(this.yubicoOtpEnabled, other.yubicoOtpEnabled)
                && java.util.Objects.equals(this.mfaEnrollmentType, other.mfaEnrollmentType)
                && java.util.Objects.equals(this.mfaEnabledCategory, other.mfaEnabledCategory)
                && java.util.Objects.equals(
                        this.hideBackupFactorEnabled, other.hideBackupFactorEnabled)
                && java.util.Objects.equals(
                        this.autoEnrollEmailFactorDisabled, other.autoEnrollEmailFactorDisabled)
                && java.util.Objects.equals(
                        this.userEnrollmentDisabledFactors, other.userEnrollmentDisabledFactors)
                && java.util.Objects.equals(this.emailSettings, other.emailSettings)
                && java.util.Objects.equals(this.thirdPartyFactor, other.thirdPartyFactor)
                && java.util.Objects.equals(this.notificationSettings, other.notificationSettings)
                && java.util.Objects.equals(this.identityStoreSettings, other.identityStoreSettings)
                && java.util.Objects.equals(this.bypassCodeSettings, other.bypassCodeSettings)
                && java.util.Objects.equals(this.clientAppSettings, other.clientAppSettings)
                && java.util.Objects.equals(this.endpointRestrictions, other.endpointRestrictions)
                && java.util.Objects.equals(this.compliancePolicy, other.compliancePolicy)
                && java.util.Objects.equals(this.totpSettings, other.totpSettings)
                && java.util.Objects.equals(
                        this
                                .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings,
                        other.urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings)
                && java.util.Objects.equals(
                        this
                                .urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings,
                        other.urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ocid == null ? 43 : this.ocid.hashCode());
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.meta == null ? 43 : this.meta.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCreatedBy == null ? 43 : this.idcsCreatedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsLastModifiedBy == null
                                ? 43
                                : this.idcsLastModifiedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsPreventedOperations == null
                                ? 43
                                : this.idcsPreventedOperations.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteInProgress == null ? 43 : this.deleteInProgress.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsLastUpgradedInRelease == null
                                ? 43
                                : this.idcsLastUpgradedInRelease.hashCode());
        result = (result * PRIME) + (this.domainOcid == null ? 43 : this.domainOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentOcid == null ? 43 : this.compartmentOcid.hashCode());
        result = (result * PRIME) + (this.tenancyOcid == null ? 43 : this.tenancyOcid.hashCode());
        result = (result * PRIME) + (this.emailEnabled == null ? 43 : this.emailEnabled.hashCode());
        result = (result * PRIME) + (this.smsEnabled == null ? 43 : this.smsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.phoneCallEnabled == null ? 43 : this.phoneCallEnabled.hashCode());
        result = (result * PRIME) + (this.totpEnabled == null ? 43 : this.totpEnabled.hashCode());
        result = (result * PRIME) + (this.pushEnabled == null ? 43 : this.pushEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.bypassCodeEnabled == null ? 43 : this.bypassCodeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.securityQuestionsEnabled == null
                                ? 43
                                : this.securityQuestionsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.fidoAuthenticatorEnabled == null
                                ? 43
                                : this.fidoAuthenticatorEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.yubicoOtpEnabled == null ? 43 : this.yubicoOtpEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.mfaEnrollmentType == null ? 43 : this.mfaEnrollmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.mfaEnabledCategory == null
                                ? 43
                                : this.mfaEnabledCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.hideBackupFactorEnabled == null
                                ? 43
                                : this.hideBackupFactorEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoEnrollEmailFactorDisabled == null
                                ? 43
                                : this.autoEnrollEmailFactorDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.userEnrollmentDisabledFactors == null
                                ? 43
                                : this.userEnrollmentDisabledFactors.hashCode());
        result =
                (result * PRIME)
                        + (this.emailSettings == null ? 43 : this.emailSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.thirdPartyFactor == null ? 43 : this.thirdPartyFactor.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationSettings == null
                                ? 43
                                : this.notificationSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.identityStoreSettings == null
                                ? 43
                                : this.identityStoreSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.bypassCodeSettings == null
                                ? 43
                                : this.bypassCodeSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.clientAppSettings == null ? 43 : this.clientAppSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointRestrictions == null
                                ? 43
                                : this.endpointRestrictions.hashCode());
        result =
                (result * PRIME)
                        + (this.compliancePolicy == null ? 43 : this.compliancePolicy.hashCode());
        result = (result * PRIME) + (this.totpSettings == null ? 43 : this.totpSettings.hashCode());
        result =
                (result * PRIME)
                        + (this
                                                .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings
                                        == null
                                ? 43
                                : this
                                        .urnietfparamsscimschemasoracleidcsextensionthirdPartyAuthenticationFactorSettings
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this
                                                .urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings
                                        == null
                                ? 43
                                : this
                                        .urnietfparamsscimschemasoracleidcsextensionfidoAuthenticationFactorSettings
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
