/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings schema
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Setting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Setting extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "externalId",
        "contactEmails",
        "customBranding",
        "preferredLanguage",
        "timezone",
        "diagnosticRecordForSearchIdentifiesReturnedResources",
        "reAuthWhenChangingMyAuthenticationFactors",
        "reAuthFactor",
        "locale",
        "csrAccess",
        "signingCertPublicAccess",
        "subMappingAttr",
        "accountAlwaysTrustScope",
        "defaultTrustScope",
        "issuer",
        "prevIssuer",
        "diagnosticLevel",
        "diagnosticTracingUpto",
        "allowedDomains",
        "enableTermsOfUse",
        "termsOfUseUrl",
        "privacyPolicyUrl",
        "migrationStatus",
        "onPremisesProvisioning",
        "allowedForgotPasswordFlowReturnUrls",
        "allowedNotificationRedirectUrls",
        "auditEventRetentionPeriod",
        "isHostedPage",
        "customHtmlLocation",
        "customCssLocation",
        "customTranslation",
        "cloudAccountName",
        "cloudMigrationUrlEnabled",
        "cloudMigrationCustomUrl",
        "serviceAdminCannotListOtherUsers",
        "maxNoOfAppRoleMembersToReturn",
        "maxNoOfAppCMVAToReturn",
        "iamUpstSessionExpiry",
        "cloudGateCorsSettings",
        "certificateValidation",
        "tenantCustomClaims",
        "purgeConfigs",
        "defaultCompanyNames",
        "defaultLoginTexts",
        "defaultImages",
        "companyNames",
        "loginTexts",
        "images"
    })
    public Setting(
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
            String externalId,
            java.util.List<String> contactEmails,
            Boolean customBranding,
            String preferredLanguage,
            String timezone,
            Boolean diagnosticRecordForSearchIdentifiesReturnedResources,
            Boolean reAuthWhenChangingMyAuthenticationFactors,
            java.util.List<ReAuthFactor> reAuthFactor,
            String locale,
            CsrAccess csrAccess,
            Boolean signingCertPublicAccess,
            String subMappingAttr,
            Boolean accountAlwaysTrustScope,
            DefaultTrustScope defaultTrustScope,
            String issuer,
            String prevIssuer,
            Integer diagnosticLevel,
            String diagnosticTracingUpto,
            java.util.List<String> allowedDomains,
            Boolean enableTermsOfUse,
            String termsOfUseUrl,
            String privacyPolicyUrl,
            String migrationStatus,
            Boolean onPremisesProvisioning,
            java.util.List<String> allowedForgotPasswordFlowReturnUrls,
            java.util.List<String> allowedNotificationRedirectUrls,
            Integer auditEventRetentionPeriod,
            Boolean isHostedPage,
            String customHtmlLocation,
            String customCssLocation,
            String customTranslation,
            String cloudAccountName,
            Boolean cloudMigrationUrlEnabled,
            String cloudMigrationCustomUrl,
            Boolean serviceAdminCannotListOtherUsers,
            Integer maxNoOfAppRoleMembersToReturn,
            Integer maxNoOfAppCMVAToReturn,
            Integer iamUpstSessionExpiry,
            SettingsCloudGateCorsSettings cloudGateCorsSettings,
            SettingsCertificateValidation certificateValidation,
            java.util.List<SettingsTenantCustomClaims> tenantCustomClaims,
            java.util.List<SettingsPurgeConfigs> purgeConfigs,
            java.util.List<SettingsDefaultCompanyNames> defaultCompanyNames,
            java.util.List<SettingsDefaultLoginTexts> defaultLoginTexts,
            java.util.List<SettingsDefaultImages> defaultImages,
            java.util.List<SettingsCompanyNames> companyNames,
            java.util.List<SettingsLoginTexts> loginTexts,
            java.util.List<SettingsImages> images) {
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
        this.externalId = externalId;
        this.contactEmails = contactEmails;
        this.customBranding = customBranding;
        this.preferredLanguage = preferredLanguage;
        this.timezone = timezone;
        this.diagnosticRecordForSearchIdentifiesReturnedResources =
                diagnosticRecordForSearchIdentifiesReturnedResources;
        this.reAuthWhenChangingMyAuthenticationFactors = reAuthWhenChangingMyAuthenticationFactors;
        this.reAuthFactor = reAuthFactor;
        this.locale = locale;
        this.csrAccess = csrAccess;
        this.signingCertPublicAccess = signingCertPublicAccess;
        this.subMappingAttr = subMappingAttr;
        this.accountAlwaysTrustScope = accountAlwaysTrustScope;
        this.defaultTrustScope = defaultTrustScope;
        this.issuer = issuer;
        this.prevIssuer = prevIssuer;
        this.diagnosticLevel = diagnosticLevel;
        this.diagnosticTracingUpto = diagnosticTracingUpto;
        this.allowedDomains = allowedDomains;
        this.enableTermsOfUse = enableTermsOfUse;
        this.termsOfUseUrl = termsOfUseUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.migrationStatus = migrationStatus;
        this.onPremisesProvisioning = onPremisesProvisioning;
        this.allowedForgotPasswordFlowReturnUrls = allowedForgotPasswordFlowReturnUrls;
        this.allowedNotificationRedirectUrls = allowedNotificationRedirectUrls;
        this.auditEventRetentionPeriod = auditEventRetentionPeriod;
        this.isHostedPage = isHostedPage;
        this.customHtmlLocation = customHtmlLocation;
        this.customCssLocation = customCssLocation;
        this.customTranslation = customTranslation;
        this.cloudAccountName = cloudAccountName;
        this.cloudMigrationUrlEnabled = cloudMigrationUrlEnabled;
        this.cloudMigrationCustomUrl = cloudMigrationCustomUrl;
        this.serviceAdminCannotListOtherUsers = serviceAdminCannotListOtherUsers;
        this.maxNoOfAppRoleMembersToReturn = maxNoOfAppRoleMembersToReturn;
        this.maxNoOfAppCMVAToReturn = maxNoOfAppCMVAToReturn;
        this.iamUpstSessionExpiry = iamUpstSessionExpiry;
        this.cloudGateCorsSettings = cloudGateCorsSettings;
        this.certificateValidation = certificateValidation;
        this.tenantCustomClaims = tenantCustomClaims;
        this.purgeConfigs = purgeConfigs;
        this.defaultCompanyNames = defaultCompanyNames;
        this.defaultLoginTexts = defaultLoginTexts;
        this.defaultImages = defaultImages;
        this.companyNames = companyNames;
        this.loginTexts = loginTexts;
        this.images = images;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each representation of the Resource MUST include a non-empty id value. This identifier MUST be unique across the Service Provider's entire set of Resources. It MUST be a stable, non-reassignable identifier that does not change when the same Resource is returned in subsequent requests. The value of the id attribute is always issued by the Service Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST NOT be used in the unique identifier.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the SCIM Resource as defined by the Service Provider. Each representation of the Resource MUST include a non-empty id value. This identifier MUST be unique across the Service Provider's entire set of Resources. It MUST be a stable, non-reassignable identifier that does not change when the same Resource is returned in subsequent requests. The value of the id attribute is always issued by the Service Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST NOT be used in the unique identifier.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique OCI identifier for the SCIM Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: global
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocid")
        private String ocid;

        /**
         * Unique OCI identifier for the SCIM Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: global
         * @param ocid the value to set
         * @return this builder
         **/
        public Builder ocid(String ocid) {
            this.ocid = ocid;
            this.__explicitlySet__.add("ocid");
            return this;
        }
        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param schemas the value to set
         * @return this builder
         **/
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
         * Each value of this attribute specifies an operation that only an internal client may perform on this particular resource.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
        private java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

        /**
         * Each value of this attribute specifies an operation that only an internal client may perform on this particular resource.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param idcsPreventedOperations the value to set
         * @return this builder
         **/
        public Builder idcsPreventedOperations(
                java.util.List<IdcsPreventedOperations> idcsPreventedOperations) {
            this.idcsPreventedOperations = idcsPreventedOperations;
            this.__explicitlySet__.add("idcsPreventedOperations");
            return this;
        }
        /**
         * A list of tags on this resource.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [key, value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tags> tags;

        /**
         * A list of tags on this resource.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [key, value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         * @param tags the value to set
         * @return this builder
         **/
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to true when synchronous deletion of the resource would take too long.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
        private Boolean deleteInProgress;

        /**
         * A boolean flag indicating this resource in the process of being deleted. Usually set to true when synchronous deletion of the resource would take too long.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param deleteInProgress the value to set
         * @return this builder
         **/
        public Builder deleteInProgress(Boolean deleteInProgress) {
            this.deleteInProgress = deleteInProgress;
            this.__explicitlySet__.add("deleteInProgress");
            return this;
        }
        /**
         * The release number when the resource was upgraded.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
        private String idcsLastUpgradedInRelease;

        /**
         * The release number when the resource was upgraded.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param idcsLastUpgradedInRelease the value to set
         * @return this builder
         **/
        public Builder idcsLastUpgradedInRelease(String idcsLastUpgradedInRelease) {
            this.idcsLastUpgradedInRelease = idcsLastUpgradedInRelease;
            this.__explicitlySet__.add("idcsLastUpgradedInRelease");
            return this;
        }
        /**
         * OCI Domain Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
        private String domainOcid;

        /**
         * OCI Domain Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param domainOcid the value to set
         * @return this builder
         **/
        public Builder domainOcid(String domainOcid) {
            this.domainOcid = domainOcid;
            this.__explicitlySet__.add("domainOcid");
            return this;
        }
        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
        private String compartmentOcid;

        /**
         * OCI Compartment Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param compartmentOcid the value to set
         * @return this builder
         **/
        public Builder compartmentOcid(String compartmentOcid) {
            this.compartmentOcid = compartmentOcid;
            this.__explicitlySet__.add("compartmentOcid");
            return this;
        }
        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
        private String tenancyOcid;

        /**
         * OCI Tenant Id (ocid) in which the resource lives.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param tenancyOcid the value to set
         * @return this builder
         **/
        public Builder tenancyOcid(String tenancyOcid) {
            this.tenancyOcid = tenancyOcid;
            this.__explicitlySet__.add("tenancyOcid");
            return this;
        }
        /**
         * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param externalId the value to set
         * @return this builder
         **/
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Contact emails used to notify tenants. Can be one or more user or group alias emails.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmails")
        private java.util.List<String> contactEmails;

        /**
         * Contact emails used to notify tenants. Can be one or more user or group alias emails.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param contactEmails the value to set
         * @return this builder
         **/
        public Builder contactEmails(java.util.List<String> contactEmails) {
            this.contactEmails = contactEmails;
            this.__explicitlySet__.add("contactEmails");
            return this;
        }
        /**
         * Indicates if the branding is default or custom
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customBranding")
        private Boolean customBranding;

        /**
         * Indicates if the branding is default or custom
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param customBranding the value to set
         * @return this builder
         **/
        public Builder customBranding(Boolean customBranding) {
            this.customBranding = customBranding;
            this.__explicitlySet__.add("customBranding");
            return this;
        }
        /**
         * Preferred written or spoken language used for localized user interfaces
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "languages" and attrValues.value eq "$(preferredLanguage)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preferredLanguage")
        private String preferredLanguage;

        /**
         * Preferred written or spoken language used for localized user interfaces
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "languages" and attrValues.value eq "$(preferredLanguage)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param preferredLanguage the value to set
         * @return this builder
         **/
        public Builder preferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            this.__explicitlySet__.add("preferredLanguage");
            return this;
        }
        /**
         * User's timezone
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "timezones" and attrValues.value eq "$(timezone)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * User's timezone
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "timezones" and attrValues.value eq "$(timezone)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param timezone the value to set
         * @return this builder
         **/
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * Controls whether DiagnosticRecords for external search-operations (against SCIM resource-types in the Admin service) identify returned resources.  If true, indicates that for each successful external search-operation at least one DiagnosticRecord will include at least one identifier for each matching resource that is returned in that search-response.  If false, no DiagnosticRecord should be expected to identify returned resources for a search-operation.  The default value is false.
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "diagnosticRecordForSearchIdentifiesReturnedResources")
        private Boolean diagnosticRecordForSearchIdentifiesReturnedResources;

        /**
         * Controls whether DiagnosticRecords for external search-operations (against SCIM resource-types in the Admin service) identify returned resources.  If true, indicates that for each successful external search-operation at least one DiagnosticRecord will include at least one identifier for each matching resource that is returned in that search-response.  If false, no DiagnosticRecord should be expected to identify returned resources for a search-operation.  The default value is false.
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param diagnosticRecordForSearchIdentifiesReturnedResources the value to set
         * @return this builder
         **/
        public Builder diagnosticRecordForSearchIdentifiesReturnedResources(
                Boolean diagnosticRecordForSearchIdentifiesReturnedResources) {
            this.diagnosticRecordForSearchIdentifiesReturnedResources =
                    diagnosticRecordForSearchIdentifiesReturnedResources;
            this.__explicitlySet__.add("diagnosticRecordForSearchIdentifiesReturnedResources");
            return this;
        }
        /**
         * Specifies whether re-authentication is required or not when a user changes one of their security factors such as password or email. Default is true to ensure more secure behavior.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reAuthWhenChangingMyAuthenticationFactors")
        private Boolean reAuthWhenChangingMyAuthenticationFactors;

        /**
         * Specifies whether re-authentication is required or not when a user changes one of their security factors such as password or email. Default is true to ensure more secure behavior.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param reAuthWhenChangingMyAuthenticationFactors the value to set
         * @return this builder
         **/
        public Builder reAuthWhenChangingMyAuthenticationFactors(
                Boolean reAuthWhenChangingMyAuthenticationFactors) {
            this.reAuthWhenChangingMyAuthenticationFactors =
                    reAuthWhenChangingMyAuthenticationFactors;
            this.__explicitlySet__.add("reAuthWhenChangingMyAuthenticationFactors");
            return this;
        }
        /**
         * If reAuthWhenChangingMyAuthenticationFactors is true (default), this attribute specifies which re-authentication factor to use. Allowed value is \\"password\\".
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reAuthFactor")
        private java.util.List<ReAuthFactor> reAuthFactor;

        /**
         * If reAuthWhenChangingMyAuthenticationFactors is true (default), this attribute specifies which re-authentication factor to use. Allowed value is \\"password\\".
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param reAuthFactor the value to set
         * @return this builder
         **/
        public Builder reAuthFactor(java.util.List<ReAuthFactor> reAuthFactor) {
            this.reAuthFactor = reAuthFactor;
            this.__explicitlySet__.add("reAuthFactor");
            return this;
        }
        /**
         * Default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "locales" and attrValues.value eq "$(locale)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private String locale;

        /**
         * Default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCanonicalValueSourceFilter: attrName eq "locales" and attrValues.value eq "$(locale)"
         *  - idcsCanonicalValueSourceResourceType: AllowedValue
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param locale the value to set
         * @return this builder
         **/
        public Builder locale(String locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }
        /**
         * This value indicates whether Customer Service Representatives can login and have readOnly or readWrite access.  A value of 'none' means CSR cannot login to the services.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csrAccess")
        private CsrAccess csrAccess;

        /**
         * This value indicates whether Customer Service Representatives can login and have readOnly or readWrite access.  A value of 'none' means CSR cannot login to the services.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         * @param csrAccess the value to set
         * @return this builder
         **/
        public Builder csrAccess(CsrAccess csrAccess) {
            this.csrAccess = csrAccess;
            this.__explicitlySet__.add("csrAccess");
            return this;
        }
        /**
         * Indicates if access on SigningCert is allowed to public or not
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertPublicAccess")
        private Boolean signingCertPublicAccess;

        /**
         * Indicates if access on SigningCert is allowed to public or not
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param signingCertPublicAccess the value to set
         * @return this builder
         **/
        public Builder signingCertPublicAccess(Boolean signingCertPublicAccess) {
            this.signingCertPublicAccess = signingCertPublicAccess;
            this.__explicitlySet__.add("signingCertPublicAccess");
            return this;
        }
        /**
         * **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         * - caseExact: false
         * - multiValued: false
         * - mutability: readWrite
         * - required: false
         * - returned: default
         * - type: string
         * - uniqueness: none
         * Subject mapping user profile attribute. The input format should be SCIM compliant. This attribute should be of type String and multivalued to false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subMappingAttr")
        private String subMappingAttr;

        /**
         * **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         * - caseExact: false
         * - multiValued: false
         * - mutability: readWrite
         * - required: false
         * - returned: default
         * - type: string
         * - uniqueness: none
         * Subject mapping user profile attribute. The input format should be SCIM compliant. This attribute should be of type String and multivalued to false.
         * @param subMappingAttr the value to set
         * @return this builder
         **/
        public Builder subMappingAttr(String subMappingAttr) {
            this.subMappingAttr = subMappingAttr;
            this.__explicitlySet__.add("subMappingAttr");
            return this;
        }
        /**
         * Indicates whether all the Apps in this customer tenancy should trust each other. A value of true overrides the 'defaultTrustScope' attribute here in Settings, as well as any App-specific 'trustScope' attribute, to force in effect 'trustScope=Account' for every App in this customer tenancy.
         * <p>
         **Added In:** 18.1.6
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountAlwaysTrustScope")
        private Boolean accountAlwaysTrustScope;

        /**
         * Indicates whether all the Apps in this customer tenancy should trust each other. A value of true overrides the 'defaultTrustScope' attribute here in Settings, as well as any App-specific 'trustScope' attribute, to force in effect 'trustScope=Account' for every App in this customer tenancy.
         * <p>
         **Added In:** 18.1.6
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param accountAlwaysTrustScope the value to set
         * @return this builder
         **/
        public Builder accountAlwaysTrustScope(Boolean accountAlwaysTrustScope) {
            this.accountAlwaysTrustScope = accountAlwaysTrustScope;
            this.__explicitlySet__.add("accountAlwaysTrustScope");
            return this;
        }
        /**
         * **Deprecated Since: 18.3.6**
         * <p>
         **SCIM++ Properties:**
         * - multiValued: false
         * - mutability: readWrite
         * - required: false
         * - returned: default
         * - type: string
         * Indicates the default trust scope for all apps
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultTrustScope")
        private DefaultTrustScope defaultTrustScope;

        /**
         * **Deprecated Since: 18.3.6**
         * <p>
         **SCIM++ Properties:**
         * - multiValued: false
         * - mutability: readWrite
         * - required: false
         * - returned: default
         * - type: string
         * Indicates the default trust scope for all apps
         * @param defaultTrustScope the value to set
         * @return this builder
         **/
        public Builder defaultTrustScope(DefaultTrustScope defaultTrustScope) {
            this.defaultTrustScope = defaultTrustScope;
            this.__explicitlySet__.add("defaultTrustScope");
            return this;
        }
        /**
         * Tenant issuer.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuer")
        private String issuer;

        /**
         * Tenant issuer.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param issuer the value to set
         * @return this builder
         **/
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            this.__explicitlySet__.add("issuer");
            return this;
        }
        /**
         * Previous Tenant issuer. This is an Oracle Identity Cloud Service internal attribute which is not meant to be directly modified by ID Admin. Even if the request body (Settings) contains this attribute, the actual value will be set according to the Oracle Identity Cloud Service internal logic rather than solely based on the value provided in the request payload.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prevIssuer")
        private String prevIssuer;

        /**
         * Previous Tenant issuer. This is an Oracle Identity Cloud Service internal attribute which is not meant to be directly modified by ID Admin. Even if the request body (Settings) contains this attribute, the actual value will be set according to the Oracle Identity Cloud Service internal logic rather than solely based on the value provided in the request payload.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param prevIssuer the value to set
         * @return this builder
         **/
        public Builder prevIssuer(String prevIssuer) {
            this.prevIssuer = prevIssuer;
            this.__explicitlySet__.add("prevIssuer");
            return this;
        }
        /**
         * The level of diagnostic logging that is currently in effect. A level of 0 (zero) indicates that diagnostic logging is disabled. A level of 1 (one) indicates that diagnostic logging is enabled.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticLevel")
        private Integer diagnosticLevel;

        /**
         * The level of diagnostic logging that is currently in effect. A level of 0 (zero) indicates that diagnostic logging is disabled. A level of 1 (one) indicates that diagnostic logging is enabled.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param diagnosticLevel the value to set
         * @return this builder
         **/
        public Builder diagnosticLevel(Integer diagnosticLevel) {
            this.diagnosticLevel = diagnosticLevel;
            this.__explicitlySet__.add("diagnosticLevel");
            return this;
        }
        /**
         * The end time up to which diagnostic recording is switched on
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticTracingUpto")
        private String diagnosticTracingUpto;

        /**
         * The end time up to which diagnostic recording is switched on
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         * @param diagnosticTracingUpto the value to set
         * @return this builder
         **/
        public Builder diagnosticTracingUpto(String diagnosticTracingUpto) {
            this.diagnosticTracingUpto = diagnosticTracingUpto;
            this.__explicitlySet__.add("diagnosticTracingUpto");
            return this;
        }
        /**
         * One or more email domains allowed in a user's email field. If unassigned, any domain is allowed.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
        private java.util.List<String> allowedDomains;

        /**
         * One or more email domains allowed in a user's email field. If unassigned, any domain is allowed.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param allowedDomains the value to set
         * @return this builder
         **/
        public Builder allowedDomains(java.util.List<String> allowedDomains) {
            this.allowedDomains = allowedDomains;
            this.__explicitlySet__.add("allowedDomains");
            return this;
        }
        /**
         * Indicates if Terms of Use is enabled in UI
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enableTermsOfUse")
        private Boolean enableTermsOfUse;

        /**
         * Indicates if Terms of Use is enabled in UI
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param enableTermsOfUse the value to set
         * @return this builder
         **/
        public Builder enableTermsOfUse(Boolean enableTermsOfUse) {
            this.enableTermsOfUse = enableTermsOfUse;
            this.__explicitlySet__.add("enableTermsOfUse");
            return this;
        }
        /**
         * Terms of Use URL
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termsOfUseUrl")
        private String termsOfUseUrl;

        /**
         * Terms of Use URL
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param termsOfUseUrl the value to set
         * @return this builder
         **/
        public Builder termsOfUseUrl(String termsOfUseUrl) {
            this.termsOfUseUrl = termsOfUseUrl;
            this.__explicitlySet__.add("termsOfUseUrl");
            return this;
        }
        /**
         * Privacy Policy URL
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
        private String privacyPolicyUrl;

        /**
         * Privacy Policy URL
         * <p>
         **Added In:** 18.2.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param privacyPolicyUrl the value to set
         * @return this builder
         **/
        public Builder privacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            this.__explicitlySet__.add("privacyPolicyUrl");
            return this;
        }
        /**
         * Database Migration Status
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("migrationStatus")
        private String migrationStatus;

        /**
         * Database Migration Status
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param migrationStatus the value to set
         * @return this builder
         **/
        public Builder migrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            this.__explicitlySet__.add("migrationStatus");
            return this;
        }
        /**
         * On-Premises provisioning feature toggle.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("onPremisesProvisioning")
        private Boolean onPremisesProvisioning;

        /**
         * On-Premises provisioning feature toggle.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param onPremisesProvisioning the value to set
         * @return this builder
         **/
        public Builder onPremisesProvisioning(Boolean onPremisesProvisioning) {
            this.onPremisesProvisioning = onPremisesProvisioning;
            this.__explicitlySet__.add("onPremisesProvisioning");
            return this;
        }
        /**
         * If specified, indicates the set of Urls which can be returned to after successful forgot password flow
         * <p>
         **Added In:** 19.3.3
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedForgotPasswordFlowReturnUrls")
        private java.util.List<String> allowedForgotPasswordFlowReturnUrls;

        /**
         * If specified, indicates the set of Urls which can be returned to after successful forgot password flow
         * <p>
         **Added In:** 19.3.3
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         * @param allowedForgotPasswordFlowReturnUrls the value to set
         * @return this builder
         **/
        public Builder allowedForgotPasswordFlowReturnUrls(
                java.util.List<String> allowedForgotPasswordFlowReturnUrls) {
            this.allowedForgotPasswordFlowReturnUrls = allowedForgotPasswordFlowReturnUrls;
            this.__explicitlySet__.add("allowedForgotPasswordFlowReturnUrls");
            return this;
        }
        /**
         * If specified, indicates the set of allowed notification redirect Urls which can be specified as the value of \\"notificationRedirectUrl\\" in the POST .../admin/v1/MePasswordResetRequestor request payload, which will then be included in the reset password email notification sent to a user as part of the forgot password / password reset flow.
         * <p>
         **Added In:** 2009041201
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedNotificationRedirectUrls")
        private java.util.List<String> allowedNotificationRedirectUrls;

        /**
         * If specified, indicates the set of allowed notification redirect Urls which can be specified as the value of \\"notificationRedirectUrl\\" in the POST .../admin/v1/MePasswordResetRequestor request payload, which will then be included in the reset password email notification sent to a user as part of the forgot password / password reset flow.
         * <p>
         **Added In:** 2009041201
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         * @param allowedNotificationRedirectUrls the value to set
         * @return this builder
         **/
        public Builder allowedNotificationRedirectUrls(
                java.util.List<String> allowedNotificationRedirectUrls) {
            this.allowedNotificationRedirectUrls = allowedNotificationRedirectUrls;
            this.__explicitlySet__.add("allowedNotificationRedirectUrls");
            return this;
        }
        /**
         * Audit Event retention period. If set, overrides default of 30 days after which Audit Events will be purged
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditEventRetentionPeriod")
        private Integer auditEventRetentionPeriod;

        /**
         * Audit Event retention period. If set, overrides default of 30 days after which Audit Events will be purged
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param auditEventRetentionPeriod the value to set
         * @return this builder
         **/
        public Builder auditEventRetentionPeriod(Integer auditEventRetentionPeriod) {
            this.auditEventRetentionPeriod = auditEventRetentionPeriod;
            this.__explicitlySet__.add("auditEventRetentionPeriod");
            return this;
        }
        /**
         * Indicates if 'hosted' option was selected
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHostedPage")
        private Boolean isHostedPage;

        /**
         * Indicates if 'hosted' option was selected
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param isHostedPage the value to set
         * @return this builder
         **/
        public Builder isHostedPage(Boolean isHostedPage) {
            this.isHostedPage = isHostedPage;
            this.__explicitlySet__.add("isHostedPage");
            return this;
        }
        /**
         * Storage URL location where the sanitized custom html is located
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customHtmlLocation")
        private String customHtmlLocation;

        /**
         * Storage URL location where the sanitized custom html is located
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param customHtmlLocation the value to set
         * @return this builder
         **/
        public Builder customHtmlLocation(String customHtmlLocation) {
            this.customHtmlLocation = customHtmlLocation;
            this.__explicitlySet__.add("customHtmlLocation");
            return this;
        }
        /**
         * Storage URL location where the sanitized custom css is located
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customCssLocation")
        private String customCssLocation;

        /**
         * Storage URL location where the sanitized custom css is located
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param customCssLocation the value to set
         * @return this builder
         **/
        public Builder customCssLocation(String customCssLocation) {
            this.customCssLocation = customCssLocation;
            this.__explicitlySet__.add("customCssLocation");
            return this;
        }
        /**
         * Custom translations (JSON String)
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customTranslation")
        private String customTranslation;

        /**
         * Custom translations (JSON String)
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param customTranslation the value to set
         * @return this builder
         **/
        public Builder customTranslation(String customTranslation) {
            this.customTranslation = customTranslation;
            this.__explicitlySet__.add("customTranslation");
            return this;
        }
        /**
         * The attribute to store the cloud account name
         * <p>
         **Deprecated Since: 2011192329**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
        private String cloudAccountName;

        /**
         * The attribute to store the cloud account name
         * <p>
         **Deprecated Since: 2011192329**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param cloudAccountName the value to set
         * @return this builder
         **/
        public Builder cloudAccountName(String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            this.__explicitlySet__.add("cloudAccountName");
            return this;
        }
        /**
         * CloudAccountMigration: Enable Custom SIM Migrator Url.
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudMigrationUrlEnabled")
        private Boolean cloudMigrationUrlEnabled;

        /**
         * CloudAccountMigration: Enable Custom SIM Migrator Url.
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param cloudMigrationUrlEnabled the value to set
         * @return this builder
         **/
        public Builder cloudMigrationUrlEnabled(Boolean cloudMigrationUrlEnabled) {
            this.cloudMigrationUrlEnabled = cloudMigrationUrlEnabled;
            this.__explicitlySet__.add("cloudMigrationUrlEnabled");
            return this;
        }
        /**
         * If specified, indicates the custom SIM Migrator Url which can be used while SIM to Oracle Identity Cloud Service CloudAccount Migration.
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudMigrationCustomUrl")
        private String cloudMigrationCustomUrl;

        /**
         * If specified, indicates the custom SIM Migrator Url which can be used while SIM to Oracle Identity Cloud Service CloudAccount Migration.
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - caseExact: false
         * @param cloudMigrationCustomUrl the value to set
         * @return this builder
         **/
        public Builder cloudMigrationCustomUrl(String cloudMigrationCustomUrl) {
            this.cloudMigrationCustomUrl = cloudMigrationCustomUrl;
            this.__explicitlySet__.add("cloudMigrationCustomUrl");
            return this;
        }
        /**
         * By default, a service admin can list all users in stripe. If true, a service admin cannot list other users.
         * <p>
         **Added In:** 2108190438
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAdminCannotListOtherUsers")
        private Boolean serviceAdminCannotListOtherUsers;

        /**
         * By default, a service admin can list all users in stripe. If true, a service admin cannot list other users.
         * <p>
         **Added In:** 2108190438
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param serviceAdminCannotListOtherUsers the value to set
         * @return this builder
         **/
        public Builder serviceAdminCannotListOtherUsers(Boolean serviceAdminCannotListOtherUsers) {
            this.serviceAdminCannotListOtherUsers = serviceAdminCannotListOtherUsers;
            this.__explicitlySet__.add("serviceAdminCannotListOtherUsers");
            return this;
        }
        /**
         * Limit the maximum return of members for an AppRole
         * <p>
         **Added In:** 2111112015
         * <p>
         **SCIM++ Properties:**
         *  - idcsMinValue: 0
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxNoOfAppRoleMembersToReturn")
        private Integer maxNoOfAppRoleMembersToReturn;

        /**
         * Limit the maximum return of members for an AppRole
         * <p>
         **Added In:** 2111112015
         * <p>
         **SCIM++ Properties:**
         *  - idcsMinValue: 0
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxNoOfAppRoleMembersToReturn the value to set
         * @return this builder
         **/
        public Builder maxNoOfAppRoleMembersToReturn(Integer maxNoOfAppRoleMembersToReturn) {
            this.maxNoOfAppRoleMembersToReturn = maxNoOfAppRoleMembersToReturn;
            this.__explicitlySet__.add("maxNoOfAppRoleMembersToReturn");
            return this;
        }
        /**
         * Limit the maximum return of CMVA for an App
         * <p>
         **Added In:** 2111112015
         * <p>
         **SCIM++ Properties:**
         *  - idcsMinValue: 0
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxNoOfAppCMVAToReturn")
        private Integer maxNoOfAppCMVAToReturn;

        /**
         * Limit the maximum return of CMVA for an App
         * <p>
         **Added In:** 2111112015
         * <p>
         **SCIM++ Properties:**
         *  - idcsMinValue: 0
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxNoOfAppCMVAToReturn the value to set
         * @return this builder
         **/
        public Builder maxNoOfAppCMVAToReturn(Integer maxNoOfAppCMVAToReturn) {
            this.maxNoOfAppCMVAToReturn = maxNoOfAppCMVAToReturn;
            this.__explicitlySet__.add("maxNoOfAppCMVAToReturn");
            return this;
        }
        /**
         * Maximum duration for IAM User Principal Session Token expiry
         * <p>
         **Added In:** 2307071836
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("iamUpstSessionExpiry")
        private Integer iamUpstSessionExpiry;

        /**
         * Maximum duration for IAM User Principal Session Token expiry
         * <p>
         **Added In:** 2307071836
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param iamUpstSessionExpiry the value to set
         * @return this builder
         **/
        public Builder iamUpstSessionExpiry(Integer iamUpstSessionExpiry) {
            this.iamUpstSessionExpiry = iamUpstSessionExpiry;
            this.__explicitlySet__.add("iamUpstSessionExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsSettings")
        private SettingsCloudGateCorsSettings cloudGateCorsSettings;

        public Builder cloudGateCorsSettings(SettingsCloudGateCorsSettings cloudGateCorsSettings) {
            this.cloudGateCorsSettings = cloudGateCorsSettings;
            this.__explicitlySet__.add("cloudGateCorsSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateValidation")
        private SettingsCertificateValidation certificateValidation;

        public Builder certificateValidation(SettingsCertificateValidation certificateValidation) {
            this.certificateValidation = certificateValidation;
            this.__explicitlySet__.add("certificateValidation");
            return this;
        }
        /**
         * Custom claims associated with the specific tenant
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [name]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantCustomClaims")
        private java.util.List<SettingsTenantCustomClaims> tenantCustomClaims;

        /**
         * Custom claims associated with the specific tenant
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [name]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param tenantCustomClaims the value to set
         * @return this builder
         **/
        public Builder tenantCustomClaims(
                java.util.List<SettingsTenantCustomClaims> tenantCustomClaims) {
            this.tenantCustomClaims = tenantCustomClaims;
            this.__explicitlySet__.add("tenantCustomClaims");
            return this;
        }
        /**
         * Purge Configs for different Resource Types
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [resourceName]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeConfigs")
        private java.util.List<SettingsPurgeConfigs> purgeConfigs;

        /**
         * Purge Configs for different Resource Types
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [resourceName]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param purgeConfigs the value to set
         * @return this builder
         **/
        public Builder purgeConfigs(java.util.List<SettingsPurgeConfigs> purgeConfigs) {
            this.purgeConfigs = purgeConfigs;
            this.__explicitlySet__.add("purgeConfigs");
            return this;
        }
        /**
         * Default name of the Company in different locales
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCompanyNames")
        private java.util.List<SettingsDefaultCompanyNames> defaultCompanyNames;

        /**
         * Default name of the Company in different locales
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param defaultCompanyNames the value to set
         * @return this builder
         **/
        public Builder defaultCompanyNames(
                java.util.List<SettingsDefaultCompanyNames> defaultCompanyNames) {
            this.defaultCompanyNames = defaultCompanyNames;
            this.__explicitlySet__.add("defaultCompanyNames");
            return this;
        }
        /**
         * Default Login text in different locales
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultLoginTexts")
        private java.util.List<SettingsDefaultLoginTexts> defaultLoginTexts;

        /**
         * Default Login text in different locales
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param defaultLoginTexts the value to set
         * @return this builder
         **/
        public Builder defaultLoginTexts(
                java.util.List<SettingsDefaultLoginTexts> defaultLoginTexts) {
            this.defaultLoginTexts = defaultLoginTexts;
            this.__explicitlySet__.add("defaultLoginTexts");
            return this;
        }
        /**
         * References to various images
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultImages")
        private java.util.List<SettingsDefaultImages> defaultImages;

        /**
         * References to various images
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param defaultImages the value to set
         * @return this builder
         **/
        public Builder defaultImages(java.util.List<SettingsDefaultImages> defaultImages) {
            this.defaultImages = defaultImages;
            this.__explicitlySet__.add("defaultImages");
            return this;
        }
        /**
         * Name of the company in different locales
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("companyNames")
        private java.util.List<SettingsCompanyNames> companyNames;

        /**
         * Name of the company in different locales
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param companyNames the value to set
         * @return this builder
         **/
        public Builder companyNames(java.util.List<SettingsCompanyNames> companyNames) {
            this.companyNames = companyNames;
            this.__explicitlySet__.add("companyNames");
            return this;
        }
        /**
         * Login text in different locales
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loginTexts")
        private java.util.List<SettingsLoginTexts> loginTexts;

        /**
         * Login text in different locales
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [locale]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param loginTexts the value to set
         * @return this builder
         **/
        public Builder loginTexts(java.util.List<SettingsLoginTexts> loginTexts) {
            this.loginTexts = loginTexts;
            this.__explicitlySet__.add("loginTexts");
            return this;
        }
        /**
         * References to various images
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<SettingsImages> images;

        /**
         * References to various images
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param images the value to set
         * @return this builder
         **/
        public Builder images(java.util.List<SettingsImages> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Setting build() {
            Setting model =
                    new Setting(
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
                            this.externalId,
                            this.contactEmails,
                            this.customBranding,
                            this.preferredLanguage,
                            this.timezone,
                            this.diagnosticRecordForSearchIdentifiesReturnedResources,
                            this.reAuthWhenChangingMyAuthenticationFactors,
                            this.reAuthFactor,
                            this.locale,
                            this.csrAccess,
                            this.signingCertPublicAccess,
                            this.subMappingAttr,
                            this.accountAlwaysTrustScope,
                            this.defaultTrustScope,
                            this.issuer,
                            this.prevIssuer,
                            this.diagnosticLevel,
                            this.diagnosticTracingUpto,
                            this.allowedDomains,
                            this.enableTermsOfUse,
                            this.termsOfUseUrl,
                            this.privacyPolicyUrl,
                            this.migrationStatus,
                            this.onPremisesProvisioning,
                            this.allowedForgotPasswordFlowReturnUrls,
                            this.allowedNotificationRedirectUrls,
                            this.auditEventRetentionPeriod,
                            this.isHostedPage,
                            this.customHtmlLocation,
                            this.customCssLocation,
                            this.customTranslation,
                            this.cloudAccountName,
                            this.cloudMigrationUrlEnabled,
                            this.cloudMigrationCustomUrl,
                            this.serviceAdminCannotListOtherUsers,
                            this.maxNoOfAppRoleMembersToReturn,
                            this.maxNoOfAppCMVAToReturn,
                            this.iamUpstSessionExpiry,
                            this.cloudGateCorsSettings,
                            this.certificateValidation,
                            this.tenantCustomClaims,
                            this.purgeConfigs,
                            this.defaultCompanyNames,
                            this.defaultLoginTexts,
                            this.defaultImages,
                            this.companyNames,
                            this.loginTexts,
                            this.images);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Setting model) {
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
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("contactEmails")) {
                this.contactEmails(model.getContactEmails());
            }
            if (model.wasPropertyExplicitlySet("customBranding")) {
                this.customBranding(model.getCustomBranding());
            }
            if (model.wasPropertyExplicitlySet("preferredLanguage")) {
                this.preferredLanguage(model.getPreferredLanguage());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet(
                    "diagnosticRecordForSearchIdentifiesReturnedResources")) {
                this.diagnosticRecordForSearchIdentifiesReturnedResources(
                        model.getDiagnosticRecordForSearchIdentifiesReturnedResources());
            }
            if (model.wasPropertyExplicitlySet("reAuthWhenChangingMyAuthenticationFactors")) {
                this.reAuthWhenChangingMyAuthenticationFactors(
                        model.getReAuthWhenChangingMyAuthenticationFactors());
            }
            if (model.wasPropertyExplicitlySet("reAuthFactor")) {
                this.reAuthFactor(model.getReAuthFactor());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("csrAccess")) {
                this.csrAccess(model.getCsrAccess());
            }
            if (model.wasPropertyExplicitlySet("signingCertPublicAccess")) {
                this.signingCertPublicAccess(model.getSigningCertPublicAccess());
            }
            if (model.wasPropertyExplicitlySet("subMappingAttr")) {
                this.subMappingAttr(model.getSubMappingAttr());
            }
            if (model.wasPropertyExplicitlySet("accountAlwaysTrustScope")) {
                this.accountAlwaysTrustScope(model.getAccountAlwaysTrustScope());
            }
            if (model.wasPropertyExplicitlySet("defaultTrustScope")) {
                this.defaultTrustScope(model.getDefaultTrustScope());
            }
            if (model.wasPropertyExplicitlySet("issuer")) {
                this.issuer(model.getIssuer());
            }
            if (model.wasPropertyExplicitlySet("prevIssuer")) {
                this.prevIssuer(model.getPrevIssuer());
            }
            if (model.wasPropertyExplicitlySet("diagnosticLevel")) {
                this.diagnosticLevel(model.getDiagnosticLevel());
            }
            if (model.wasPropertyExplicitlySet("diagnosticTracingUpto")) {
                this.diagnosticTracingUpto(model.getDiagnosticTracingUpto());
            }
            if (model.wasPropertyExplicitlySet("allowedDomains")) {
                this.allowedDomains(model.getAllowedDomains());
            }
            if (model.wasPropertyExplicitlySet("enableTermsOfUse")) {
                this.enableTermsOfUse(model.getEnableTermsOfUse());
            }
            if (model.wasPropertyExplicitlySet("termsOfUseUrl")) {
                this.termsOfUseUrl(model.getTermsOfUseUrl());
            }
            if (model.wasPropertyExplicitlySet("privacyPolicyUrl")) {
                this.privacyPolicyUrl(model.getPrivacyPolicyUrl());
            }
            if (model.wasPropertyExplicitlySet("migrationStatus")) {
                this.migrationStatus(model.getMigrationStatus());
            }
            if (model.wasPropertyExplicitlySet("onPremisesProvisioning")) {
                this.onPremisesProvisioning(model.getOnPremisesProvisioning());
            }
            if (model.wasPropertyExplicitlySet("allowedForgotPasswordFlowReturnUrls")) {
                this.allowedForgotPasswordFlowReturnUrls(
                        model.getAllowedForgotPasswordFlowReturnUrls());
            }
            if (model.wasPropertyExplicitlySet("allowedNotificationRedirectUrls")) {
                this.allowedNotificationRedirectUrls(model.getAllowedNotificationRedirectUrls());
            }
            if (model.wasPropertyExplicitlySet("auditEventRetentionPeriod")) {
                this.auditEventRetentionPeriod(model.getAuditEventRetentionPeriod());
            }
            if (model.wasPropertyExplicitlySet("isHostedPage")) {
                this.isHostedPage(model.getIsHostedPage());
            }
            if (model.wasPropertyExplicitlySet("customHtmlLocation")) {
                this.customHtmlLocation(model.getCustomHtmlLocation());
            }
            if (model.wasPropertyExplicitlySet("customCssLocation")) {
                this.customCssLocation(model.getCustomCssLocation());
            }
            if (model.wasPropertyExplicitlySet("customTranslation")) {
                this.customTranslation(model.getCustomTranslation());
            }
            if (model.wasPropertyExplicitlySet("cloudAccountName")) {
                this.cloudAccountName(model.getCloudAccountName());
            }
            if (model.wasPropertyExplicitlySet("cloudMigrationUrlEnabled")) {
                this.cloudMigrationUrlEnabled(model.getCloudMigrationUrlEnabled());
            }
            if (model.wasPropertyExplicitlySet("cloudMigrationCustomUrl")) {
                this.cloudMigrationCustomUrl(model.getCloudMigrationCustomUrl());
            }
            if (model.wasPropertyExplicitlySet("serviceAdminCannotListOtherUsers")) {
                this.serviceAdminCannotListOtherUsers(model.getServiceAdminCannotListOtherUsers());
            }
            if (model.wasPropertyExplicitlySet("maxNoOfAppRoleMembersToReturn")) {
                this.maxNoOfAppRoleMembersToReturn(model.getMaxNoOfAppRoleMembersToReturn());
            }
            if (model.wasPropertyExplicitlySet("maxNoOfAppCMVAToReturn")) {
                this.maxNoOfAppCMVAToReturn(model.getMaxNoOfAppCMVAToReturn());
            }
            if (model.wasPropertyExplicitlySet("iamUpstSessionExpiry")) {
                this.iamUpstSessionExpiry(model.getIamUpstSessionExpiry());
            }
            if (model.wasPropertyExplicitlySet("cloudGateCorsSettings")) {
                this.cloudGateCorsSettings(model.getCloudGateCorsSettings());
            }
            if (model.wasPropertyExplicitlySet("certificateValidation")) {
                this.certificateValidation(model.getCertificateValidation());
            }
            if (model.wasPropertyExplicitlySet("tenantCustomClaims")) {
                this.tenantCustomClaims(model.getTenantCustomClaims());
            }
            if (model.wasPropertyExplicitlySet("purgeConfigs")) {
                this.purgeConfigs(model.getPurgeConfigs());
            }
            if (model.wasPropertyExplicitlySet("defaultCompanyNames")) {
                this.defaultCompanyNames(model.getDefaultCompanyNames());
            }
            if (model.wasPropertyExplicitlySet("defaultLoginTexts")) {
                this.defaultLoginTexts(model.getDefaultLoginTexts());
            }
            if (model.wasPropertyExplicitlySet("defaultImages")) {
                this.defaultImages(model.getDefaultImages());
            }
            if (model.wasPropertyExplicitlySet("companyNames")) {
                this.companyNames(model.getCompanyNames());
            }
            if (model.wasPropertyExplicitlySet("loginTexts")) {
                this.loginTexts(model.getLoginTexts());
            }
            if (model.wasPropertyExplicitlySet("images")) {
                this.images(model.getImages());
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
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each representation of the Resource MUST include a non-empty id value. This identifier MUST be unique across the Service Provider's entire set of Resources. It MUST be a stable, non-reassignable identifier that does not change when the same Resource is returned in subsequent requests. The value of the id attribute is always issued by the Service Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST NOT be used in the unique identifier.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the SCIM Resource as defined by the Service Provider. Each representation of the Resource MUST include a non-empty id value. This identifier MUST be unique across the Service Provider's entire set of Resources. It MUST be a stable, non-reassignable identifier that does not change when the same Resource is returned in subsequent requests. The value of the id attribute is always issued by the Service Provider and MUST never be specified by the Service Consumer. bulkId: is a reserved keyword and MUST NOT be used in the unique identifier.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Unique OCI identifier for the SCIM Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: global
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocid")
    private final String ocid;

    /**
     * Unique OCI identifier for the SCIM Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: global
     * @return the value
     **/
    public String getOcid() {
        return ocid;
    }

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * REQUIRED. The schemas attribute is an array of Strings which allows introspection of the supported schema version for a SCIM representation as well any schema extensions supported by that representation. Each String value must be a unique URI. This specification defines URIs for User, Group, and a standard \\"enterprise\\" extension. All representations of SCIM schema MUST include a non-zero value array with value(s) of the URIs supported by that representation. Duplicate values MUST NOT be included. Value order is not specified and MUST not impact behavior.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
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
     * Each value of this attribute specifies an operation that only an internal client may perform on this particular resource.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPreventedOperations")
    private final java.util.List<IdcsPreventedOperations> idcsPreventedOperations;

    /**
     * Each value of this attribute specifies an operation that only an internal client may perform on this particular resource.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<IdcsPreventedOperations> getIdcsPreventedOperations() {
        return idcsPreventedOperations;
    }

    /**
     * A list of tags on this resource.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [key, value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tags> tags;

    /**
     * A list of tags on this resource.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [key, value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<Tags> getTags() {
        return tags;
    }

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true when synchronous deletion of the resource would take too long.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deleteInProgress")
    private final Boolean deleteInProgress;

    /**
     * A boolean flag indicating this resource in the process of being deleted. Usually set to true when synchronous deletion of the resource would take too long.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getDeleteInProgress() {
        return deleteInProgress;
    }

    /**
     * The release number when the resource was upgraded.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsLastUpgradedInRelease")
    private final String idcsLastUpgradedInRelease;

    /**
     * The release number when the resource was upgraded.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsLastUpgradedInRelease() {
        return idcsLastUpgradedInRelease;
    }

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainOcid")
    private final String domainOcid;

    /**
     * OCI Domain Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDomainOcid() {
        return domainOcid;
    }

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentOcid")
    private final String compartmentOcid;

    /**
     * OCI Compartment Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCompartmentOcid() {
        return compartmentOcid;
    }

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyOcid")
    private final String tenancyOcid;

    /**
     * OCI Tenant Id (ocid) in which the resource lives.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getTenancyOcid() {
        return tenancyOcid;
    }

    /**
     * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * An identifier for the Resource as defined by the Service Consumer. The externalId may simplify identification of the Resource between Service Consumer and Service Provider by allowing the Consumer to refer to the Resource with its own identifier, obviating the need to store a local mapping between the local identifier of the Resource and the identifier used by the Service Provider. Each Resource MAY include a non-empty externalId value. The value of the externalId attribute is always issued by the Service Consumer and can never be specified by the Service Provider. The Service Provider MUST always interpret the externalId as scoped to the Service Consumer's tenant.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getExternalId() {
        return externalId;
    }

    /**
     * Contact emails used to notify tenants. Can be one or more user or group alias emails.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmails")
    private final java.util.List<String> contactEmails;

    /**
     * Contact emails used to notify tenants. Can be one or more user or group alias emails.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getContactEmails() {
        return contactEmails;
    }

    /**
     * Indicates if the branding is default or custom
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customBranding")
    private final Boolean customBranding;

    /**
     * Indicates if the branding is default or custom
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getCustomBranding() {
        return customBranding;
    }

    /**
     * Preferred written or spoken language used for localized user interfaces
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "languages" and attrValues.value eq "$(preferredLanguage)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredLanguage")
    private final String preferredLanguage;

    /**
     * Preferred written or spoken language used for localized user interfaces
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "languages" and attrValues.value eq "$(preferredLanguage)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * User's timezone
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "timezones" and attrValues.value eq "$(timezone)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * User's timezone
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "timezones" and attrValues.value eq "$(timezone)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getTimezone() {
        return timezone;
    }

    /**
     * Controls whether DiagnosticRecords for external search-operations (against SCIM resource-types in the Admin service) identify returned resources.  If true, indicates that for each successful external search-operation at least one DiagnosticRecord will include at least one identifier for each matching resource that is returned in that search-response.  If false, no DiagnosticRecord should be expected to identify returned resources for a search-operation.  The default value is false.
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "diagnosticRecordForSearchIdentifiesReturnedResources")
    private final Boolean diagnosticRecordForSearchIdentifiesReturnedResources;

    /**
     * Controls whether DiagnosticRecords for external search-operations (against SCIM resource-types in the Admin service) identify returned resources.  If true, indicates that for each successful external search-operation at least one DiagnosticRecord will include at least one identifier for each matching resource that is returned in that search-response.  If false, no DiagnosticRecord should be expected to identify returned resources for a search-operation.  The default value is false.
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getDiagnosticRecordForSearchIdentifiesReturnedResources() {
        return diagnosticRecordForSearchIdentifiesReturnedResources;
    }

    /**
     * Specifies whether re-authentication is required or not when a user changes one of their security factors such as password or email. Default is true to ensure more secure behavior.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reAuthWhenChangingMyAuthenticationFactors")
    private final Boolean reAuthWhenChangingMyAuthenticationFactors;

    /**
     * Specifies whether re-authentication is required or not when a user changes one of their security factors such as password or email. Default is true to ensure more secure behavior.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getReAuthWhenChangingMyAuthenticationFactors() {
        return reAuthWhenChangingMyAuthenticationFactors;
    }

    /**
     **/
    public enum ReAuthFactor {
        Password("password"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReAuthFactor.class);

        private final String value;
        private static java.util.Map<String, ReAuthFactor> map;

        static {
            map = new java.util.HashMap<>();
            for (ReAuthFactor v : ReAuthFactor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReAuthFactor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReAuthFactor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReAuthFactor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If reAuthWhenChangingMyAuthenticationFactors is true (default), this attribute specifies which re-authentication factor to use. Allowed value is \\"password\\".
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reAuthFactor")
    private final java.util.List<ReAuthFactor> reAuthFactor;

    /**
     * If reAuthWhenChangingMyAuthenticationFactors is true (default), this attribute specifies which re-authentication factor to use. Allowed value is \\"password\\".
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public java.util.List<ReAuthFactor> getReAuthFactor() {
        return reAuthFactor;
    }

    /**
     * Default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "locales" and attrValues.value eq "$(locale)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final String locale;

    /**
     * Default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCanonicalValueSourceFilter: attrName eq "locales" and attrValues.value eq "$(locale)"
     *  - idcsCanonicalValueSourceResourceType: AllowedValue
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getLocale() {
        return locale;
    }

    /**
     * This value indicates whether Customer Service Representatives can login and have readOnly or readWrite access.  A value of 'none' means CSR cannot login to the services.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     **/
    public enum CsrAccess {
        ReadOnly("readOnly"),
        ReadWrite("readWrite"),
        None("none"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CsrAccess.class);

        private final String value;
        private static java.util.Map<String, CsrAccess> map;

        static {
            map = new java.util.HashMap<>();
            for (CsrAccess v : CsrAccess.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CsrAccess(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CsrAccess create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CsrAccess', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This value indicates whether Customer Service Representatives can login and have readOnly or readWrite access.  A value of 'none' means CSR cannot login to the services.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csrAccess")
    private final CsrAccess csrAccess;

    /**
     * This value indicates whether Customer Service Representatives can login and have readOnly or readWrite access.  A value of 'none' means CSR cannot login to the services.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public CsrAccess getCsrAccess() {
        return csrAccess;
    }

    /**
     * Indicates if access on SigningCert is allowed to public or not
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertPublicAccess")
    private final Boolean signingCertPublicAccess;

    /**
     * Indicates if access on SigningCert is allowed to public or not
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getSigningCertPublicAccess() {
        return signingCertPublicAccess;
    }

    /**
     * **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     * - caseExact: false
     * - multiValued: false
     * - mutability: readWrite
     * - required: false
     * - returned: default
     * - type: string
     * - uniqueness: none
     * Subject mapping user profile attribute. The input format should be SCIM compliant. This attribute should be of type String and multivalued to false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subMappingAttr")
    private final String subMappingAttr;

    /**
     * **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     * - caseExact: false
     * - multiValued: false
     * - mutability: readWrite
     * - required: false
     * - returned: default
     * - type: string
     * - uniqueness: none
     * Subject mapping user profile attribute. The input format should be SCIM compliant. This attribute should be of type String and multivalued to false.
     * @return the value
     **/
    public String getSubMappingAttr() {
        return subMappingAttr;
    }

    /**
     * Indicates whether all the Apps in this customer tenancy should trust each other. A value of true overrides the 'defaultTrustScope' attribute here in Settings, as well as any App-specific 'trustScope' attribute, to force in effect 'trustScope=Account' for every App in this customer tenancy.
     * <p>
     **Added In:** 18.1.6
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountAlwaysTrustScope")
    private final Boolean accountAlwaysTrustScope;

    /**
     * Indicates whether all the Apps in this customer tenancy should trust each other. A value of true overrides the 'defaultTrustScope' attribute here in Settings, as well as any App-specific 'trustScope' attribute, to force in effect 'trustScope=Account' for every App in this customer tenancy.
     * <p>
     **Added In:** 18.1.6
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getAccountAlwaysTrustScope() {
        return accountAlwaysTrustScope;
    }

    /**
     * **Deprecated Since: 18.3.6**
     * <p>
     **SCIM++ Properties:**
     * - multiValued: false
     * - mutability: readWrite
     * - required: false
     * - returned: default
     * - type: string
     * Indicates the default trust scope for all apps
     **/
    public enum DefaultTrustScope {
        Explicit("Explicit"),
        Account("Account"),
        Tags("Tags"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DefaultTrustScope.class);

        private final String value;
        private static java.util.Map<String, DefaultTrustScope> map;

        static {
            map = new java.util.HashMap<>();
            for (DefaultTrustScope v : DefaultTrustScope.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DefaultTrustScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DefaultTrustScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DefaultTrustScope', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * **Deprecated Since: 18.3.6**
     * <p>
     **SCIM++ Properties:**
     * - multiValued: false
     * - mutability: readWrite
     * - required: false
     * - returned: default
     * - type: string
     * Indicates the default trust scope for all apps
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultTrustScope")
    private final DefaultTrustScope defaultTrustScope;

    /**
     * **Deprecated Since: 18.3.6**
     * <p>
     **SCIM++ Properties:**
     * - multiValued: false
     * - mutability: readWrite
     * - required: false
     * - returned: default
     * - type: string
     * Indicates the default trust scope for all apps
     * @return the value
     **/
    public DefaultTrustScope getDefaultTrustScope() {
        return defaultTrustScope;
    }

    /**
     * Tenant issuer.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    private final String issuer;

    /**
     * Tenant issuer.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIssuer() {
        return issuer;
    }

    /**
     * Previous Tenant issuer. This is an Oracle Identity Cloud Service internal attribute which is not meant to be directly modified by ID Admin. Even if the request body (Settings) contains this attribute, the actual value will be set according to the Oracle Identity Cloud Service internal logic rather than solely based on the value provided in the request payload.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prevIssuer")
    private final String prevIssuer;

    /**
     * Previous Tenant issuer. This is an Oracle Identity Cloud Service internal attribute which is not meant to be directly modified by ID Admin. Even if the request body (Settings) contains this attribute, the actual value will be set according to the Oracle Identity Cloud Service internal logic rather than solely based on the value provided in the request payload.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getPrevIssuer() {
        return prevIssuer;
    }

    /**
     * The level of diagnostic logging that is currently in effect. A level of 0 (zero) indicates that diagnostic logging is disabled. A level of 1 (one) indicates that diagnostic logging is enabled.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticLevel")
    private final Integer diagnosticLevel;

    /**
     * The level of diagnostic logging that is currently in effect. A level of 0 (zero) indicates that diagnostic logging is disabled. A level of 1 (one) indicates that diagnostic logging is enabled.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getDiagnosticLevel() {
        return diagnosticLevel;
    }

    /**
     * The end time up to which diagnostic recording is switched on
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticTracingUpto")
    private final String diagnosticTracingUpto;

    /**
     * The end time up to which diagnostic recording is switched on
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getDiagnosticTracingUpto() {
        return diagnosticTracingUpto;
    }

    /**
     * One or more email domains allowed in a user's email field. If unassigned, any domain is allowed.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedDomains")
    private final java.util.List<String> allowedDomains;

    /**
     * One or more email domains allowed in a user's email field. If unassigned, any domain is allowed.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getAllowedDomains() {
        return allowedDomains;
    }

    /**
     * Indicates if Terms of Use is enabled in UI
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enableTermsOfUse")
    private final Boolean enableTermsOfUse;

    /**
     * Indicates if Terms of Use is enabled in UI
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getEnableTermsOfUse() {
        return enableTermsOfUse;
    }

    /**
     * Terms of Use URL
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termsOfUseUrl")
    private final String termsOfUseUrl;

    /**
     * Terms of Use URL
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getTermsOfUseUrl() {
        return termsOfUseUrl;
    }

    /**
     * Privacy Policy URL
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /**
     * Privacy Policy URL
     * <p>
     **Added In:** 18.2.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Database Migration Status
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("migrationStatus")
    private final String migrationStatus;

    /**
     * Database Migration Status
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getMigrationStatus() {
        return migrationStatus;
    }

    /**
     * On-Premises provisioning feature toggle.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onPremisesProvisioning")
    private final Boolean onPremisesProvisioning;

    /**
     * On-Premises provisioning feature toggle.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getOnPremisesProvisioning() {
        return onPremisesProvisioning;
    }

    /**
     * If specified, indicates the set of Urls which can be returned to after successful forgot password flow
     * <p>
     **Added In:** 19.3.3
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedForgotPasswordFlowReturnUrls")
    private final java.util.List<String> allowedForgotPasswordFlowReturnUrls;

    /**
     * If specified, indicates the set of Urls which can be returned to after successful forgot password flow
     * <p>
     **Added In:** 19.3.3
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     * @return the value
     **/
    public java.util.List<String> getAllowedForgotPasswordFlowReturnUrls() {
        return allowedForgotPasswordFlowReturnUrls;
    }

    /**
     * If specified, indicates the set of allowed notification redirect Urls which can be specified as the value of \\"notificationRedirectUrl\\" in the POST .../admin/v1/MePasswordResetRequestor request payload, which will then be included in the reset password email notification sent to a user as part of the forgot password / password reset flow.
     * <p>
     **Added In:** 2009041201
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedNotificationRedirectUrls")
    private final java.util.List<String> allowedNotificationRedirectUrls;

    /**
     * If specified, indicates the set of allowed notification redirect Urls which can be specified as the value of \\"notificationRedirectUrl\\" in the POST .../admin/v1/MePasswordResetRequestor request payload, which will then be included in the reset password email notification sent to a user as part of the forgot password / password reset flow.
     * <p>
     **Added In:** 2009041201
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     * @return the value
     **/
    public java.util.List<String> getAllowedNotificationRedirectUrls() {
        return allowedNotificationRedirectUrls;
    }

    /**
     * Audit Event retention period. If set, overrides default of 30 days after which Audit Events will be purged
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventRetentionPeriod")
    private final Integer auditEventRetentionPeriod;

    /**
     * Audit Event retention period. If set, overrides default of 30 days after which Audit Events will be purged
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getAuditEventRetentionPeriod() {
        return auditEventRetentionPeriod;
    }

    /**
     * Indicates if 'hosted' option was selected
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHostedPage")
    private final Boolean isHostedPage;

    /**
     * Indicates if 'hosted' option was selected
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsHostedPage() {
        return isHostedPage;
    }

    /**
     * Storage URL location where the sanitized custom html is located
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customHtmlLocation")
    private final String customHtmlLocation;

    /**
     * Storage URL location where the sanitized custom html is located
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCustomHtmlLocation() {
        return customHtmlLocation;
    }

    /**
     * Storage URL location where the sanitized custom css is located
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customCssLocation")
    private final String customCssLocation;

    /**
     * Storage URL location where the sanitized custom css is located
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCustomCssLocation() {
        return customCssLocation;
    }

    /**
     * Custom translations (JSON String)
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customTranslation")
    private final String customTranslation;

    /**
     * Custom translations (JSON String)
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCustomTranslation() {
        return customTranslation;
    }

    /**
     * The attribute to store the cloud account name
     * <p>
     **Deprecated Since: 2011192329**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAccountName")
    private final String cloudAccountName;

    /**
     * The attribute to store the cloud account name
     * <p>
     **Deprecated Since: 2011192329**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getCloudAccountName() {
        return cloudAccountName;
    }

    /**
     * CloudAccountMigration: Enable Custom SIM Migrator Url.
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudMigrationUrlEnabled")
    private final Boolean cloudMigrationUrlEnabled;

    /**
     * CloudAccountMigration: Enable Custom SIM Migrator Url.
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCloudMigrationUrlEnabled() {
        return cloudMigrationUrlEnabled;
    }

    /**
     * If specified, indicates the custom SIM Migrator Url which can be used while SIM to Oracle Identity Cloud Service CloudAccount Migration.
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudMigrationCustomUrl")
    private final String cloudMigrationCustomUrl;

    /**
     * If specified, indicates the custom SIM Migrator Url which can be used while SIM to Oracle Identity Cloud Service CloudAccount Migration.
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - caseExact: false
     * @return the value
     **/
    public String getCloudMigrationCustomUrl() {
        return cloudMigrationCustomUrl;
    }

    /**
     * By default, a service admin can list all users in stripe. If true, a service admin cannot list other users.
     * <p>
     **Added In:** 2108190438
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAdminCannotListOtherUsers")
    private final Boolean serviceAdminCannotListOtherUsers;

    /**
     * By default, a service admin can list all users in stripe. If true, a service admin cannot list other users.
     * <p>
     **Added In:** 2108190438
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getServiceAdminCannotListOtherUsers() {
        return serviceAdminCannotListOtherUsers;
    }

    /**
     * Limit the maximum return of members for an AppRole
     * <p>
     **Added In:** 2111112015
     * <p>
     **SCIM++ Properties:**
     *  - idcsMinValue: 0
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNoOfAppRoleMembersToReturn")
    private final Integer maxNoOfAppRoleMembersToReturn;

    /**
     * Limit the maximum return of members for an AppRole
     * <p>
     **Added In:** 2111112015
     * <p>
     **SCIM++ Properties:**
     *  - idcsMinValue: 0
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxNoOfAppRoleMembersToReturn() {
        return maxNoOfAppRoleMembersToReturn;
    }

    /**
     * Limit the maximum return of CMVA for an App
     * <p>
     **Added In:** 2111112015
     * <p>
     **SCIM++ Properties:**
     *  - idcsMinValue: 0
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNoOfAppCMVAToReturn")
    private final Integer maxNoOfAppCMVAToReturn;

    /**
     * Limit the maximum return of CMVA for an App
     * <p>
     **Added In:** 2111112015
     * <p>
     **SCIM++ Properties:**
     *  - idcsMinValue: 0
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxNoOfAppCMVAToReturn() {
        return maxNoOfAppCMVAToReturn;
    }

    /**
     * Maximum duration for IAM User Principal Session Token expiry
     * <p>
     **Added In:** 2307071836
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iamUpstSessionExpiry")
    private final Integer iamUpstSessionExpiry;

    /**
     * Maximum duration for IAM User Principal Session Token expiry
     * <p>
     **Added In:** 2307071836
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getIamUpstSessionExpiry() {
        return iamUpstSessionExpiry;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudGateCorsSettings")
    private final SettingsCloudGateCorsSettings cloudGateCorsSettings;

    public SettingsCloudGateCorsSettings getCloudGateCorsSettings() {
        return cloudGateCorsSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateValidation")
    private final SettingsCertificateValidation certificateValidation;

    public SettingsCertificateValidation getCertificateValidation() {
        return certificateValidation;
    }

    /**
     * Custom claims associated with the specific tenant
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [name]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantCustomClaims")
    private final java.util.List<SettingsTenantCustomClaims> tenantCustomClaims;

    /**
     * Custom claims associated with the specific tenant
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [name]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<SettingsTenantCustomClaims> getTenantCustomClaims() {
        return tenantCustomClaims;
    }

    /**
     * Purge Configs for different Resource Types
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [resourceName]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeConfigs")
    private final java.util.List<SettingsPurgeConfigs> purgeConfigs;

    /**
     * Purge Configs for different Resource Types
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [resourceName]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsPurgeConfigs> getPurgeConfigs() {
        return purgeConfigs;
    }

    /**
     * Default name of the Company in different locales
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCompanyNames")
    private final java.util.List<SettingsDefaultCompanyNames> defaultCompanyNames;

    /**
     * Default name of the Company in different locales
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsDefaultCompanyNames> getDefaultCompanyNames() {
        return defaultCompanyNames;
    }

    /**
     * Default Login text in different locales
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultLoginTexts")
    private final java.util.List<SettingsDefaultLoginTexts> defaultLoginTexts;

    /**
     * Default Login text in different locales
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsDefaultLoginTexts> getDefaultLoginTexts() {
        return defaultLoginTexts;
    }

    /**
     * References to various images
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultImages")
    private final java.util.List<SettingsDefaultImages> defaultImages;

    /**
     * References to various images
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsDefaultImages> getDefaultImages() {
        return defaultImages;
    }

    /**
     * Name of the company in different locales
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyNames")
    private final java.util.List<SettingsCompanyNames> companyNames;

    /**
     * Name of the company in different locales
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsCompanyNames> getCompanyNames() {
        return companyNames;
    }

    /**
     * Login text in different locales
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loginTexts")
    private final java.util.List<SettingsLoginTexts> loginTexts;

    /**
     * Login text in different locales
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [locale]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsLoginTexts> getLoginTexts() {
        return loginTexts;
    }

    /**
     * References to various images
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    private final java.util.List<SettingsImages> images;

    /**
     * References to various images
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SettingsImages> getImages() {
        return images;
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
        sb.append("Setting(");
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
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", contactEmails=").append(String.valueOf(this.contactEmails));
        sb.append(", customBranding=").append(String.valueOf(this.customBranding));
        sb.append(", preferredLanguage=").append(String.valueOf(this.preferredLanguage));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", diagnosticRecordForSearchIdentifiesReturnedResources=")
                .append(String.valueOf(this.diagnosticRecordForSearchIdentifiesReturnedResources));
        sb.append(", reAuthWhenChangingMyAuthenticationFactors=")
                .append(String.valueOf(this.reAuthWhenChangingMyAuthenticationFactors));
        sb.append(", reAuthFactor=").append(String.valueOf(this.reAuthFactor));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", csrAccess=").append(String.valueOf(this.csrAccess));
        sb.append(", signingCertPublicAccess=")
                .append(String.valueOf(this.signingCertPublicAccess));
        sb.append(", subMappingAttr=").append(String.valueOf(this.subMappingAttr));
        sb.append(", accountAlwaysTrustScope=")
                .append(String.valueOf(this.accountAlwaysTrustScope));
        sb.append(", defaultTrustScope=").append(String.valueOf(this.defaultTrustScope));
        sb.append(", issuer=").append(String.valueOf(this.issuer));
        sb.append(", prevIssuer=").append(String.valueOf(this.prevIssuer));
        sb.append(", diagnosticLevel=").append(String.valueOf(this.diagnosticLevel));
        sb.append(", diagnosticTracingUpto=").append(String.valueOf(this.diagnosticTracingUpto));
        sb.append(", allowedDomains=").append(String.valueOf(this.allowedDomains));
        sb.append(", enableTermsOfUse=").append(String.valueOf(this.enableTermsOfUse));
        sb.append(", termsOfUseUrl=").append(String.valueOf(this.termsOfUseUrl));
        sb.append(", privacyPolicyUrl=").append(String.valueOf(this.privacyPolicyUrl));
        sb.append(", migrationStatus=").append(String.valueOf(this.migrationStatus));
        sb.append(", onPremisesProvisioning=").append(String.valueOf(this.onPremisesProvisioning));
        sb.append(", allowedForgotPasswordFlowReturnUrls=")
                .append(String.valueOf(this.allowedForgotPasswordFlowReturnUrls));
        sb.append(", allowedNotificationRedirectUrls=")
                .append(String.valueOf(this.allowedNotificationRedirectUrls));
        sb.append(", auditEventRetentionPeriod=")
                .append(String.valueOf(this.auditEventRetentionPeriod));
        sb.append(", isHostedPage=").append(String.valueOf(this.isHostedPage));
        sb.append(", customHtmlLocation=").append(String.valueOf(this.customHtmlLocation));
        sb.append(", customCssLocation=").append(String.valueOf(this.customCssLocation));
        sb.append(", customTranslation=").append(String.valueOf(this.customTranslation));
        sb.append(", cloudAccountName=").append(String.valueOf(this.cloudAccountName));
        sb.append(", cloudMigrationUrlEnabled=")
                .append(String.valueOf(this.cloudMigrationUrlEnabled));
        sb.append(", cloudMigrationCustomUrl=")
                .append(String.valueOf(this.cloudMigrationCustomUrl));
        sb.append(", serviceAdminCannotListOtherUsers=")
                .append(String.valueOf(this.serviceAdminCannotListOtherUsers));
        sb.append(", maxNoOfAppRoleMembersToReturn=")
                .append(String.valueOf(this.maxNoOfAppRoleMembersToReturn));
        sb.append(", maxNoOfAppCMVAToReturn=").append(String.valueOf(this.maxNoOfAppCMVAToReturn));
        sb.append(", iamUpstSessionExpiry=").append(String.valueOf(this.iamUpstSessionExpiry));
        sb.append(", cloudGateCorsSettings=").append(String.valueOf(this.cloudGateCorsSettings));
        sb.append(", certificateValidation=").append(String.valueOf(this.certificateValidation));
        sb.append(", tenantCustomClaims=").append(String.valueOf(this.tenantCustomClaims));
        sb.append(", purgeConfigs=").append(String.valueOf(this.purgeConfigs));
        sb.append(", defaultCompanyNames=").append(String.valueOf(this.defaultCompanyNames));
        sb.append(", defaultLoginTexts=").append(String.valueOf(this.defaultLoginTexts));
        sb.append(", defaultImages=").append(String.valueOf(this.defaultImages));
        sb.append(", companyNames=").append(String.valueOf(this.companyNames));
        sb.append(", loginTexts=").append(String.valueOf(this.loginTexts));
        sb.append(", images=").append(String.valueOf(this.images));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Setting)) {
            return false;
        }

        Setting other = (Setting) o;
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
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.contactEmails, other.contactEmails)
                && java.util.Objects.equals(this.customBranding, other.customBranding)
                && java.util.Objects.equals(this.preferredLanguage, other.preferredLanguage)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(
                        this.diagnosticRecordForSearchIdentifiesReturnedResources,
                        other.diagnosticRecordForSearchIdentifiesReturnedResources)
                && java.util.Objects.equals(
                        this.reAuthWhenChangingMyAuthenticationFactors,
                        other.reAuthWhenChangingMyAuthenticationFactors)
                && java.util.Objects.equals(this.reAuthFactor, other.reAuthFactor)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.csrAccess, other.csrAccess)
                && java.util.Objects.equals(
                        this.signingCertPublicAccess, other.signingCertPublicAccess)
                && java.util.Objects.equals(this.subMappingAttr, other.subMappingAttr)
                && java.util.Objects.equals(
                        this.accountAlwaysTrustScope, other.accountAlwaysTrustScope)
                && java.util.Objects.equals(this.defaultTrustScope, other.defaultTrustScope)
                && java.util.Objects.equals(this.issuer, other.issuer)
                && java.util.Objects.equals(this.prevIssuer, other.prevIssuer)
                && java.util.Objects.equals(this.diagnosticLevel, other.diagnosticLevel)
                && java.util.Objects.equals(this.diagnosticTracingUpto, other.diagnosticTracingUpto)
                && java.util.Objects.equals(this.allowedDomains, other.allowedDomains)
                && java.util.Objects.equals(this.enableTermsOfUse, other.enableTermsOfUse)
                && java.util.Objects.equals(this.termsOfUseUrl, other.termsOfUseUrl)
                && java.util.Objects.equals(this.privacyPolicyUrl, other.privacyPolicyUrl)
                && java.util.Objects.equals(this.migrationStatus, other.migrationStatus)
                && java.util.Objects.equals(
                        this.onPremisesProvisioning, other.onPremisesProvisioning)
                && java.util.Objects.equals(
                        this.allowedForgotPasswordFlowReturnUrls,
                        other.allowedForgotPasswordFlowReturnUrls)
                && java.util.Objects.equals(
                        this.allowedNotificationRedirectUrls, other.allowedNotificationRedirectUrls)
                && java.util.Objects.equals(
                        this.auditEventRetentionPeriod, other.auditEventRetentionPeriod)
                && java.util.Objects.equals(this.isHostedPage, other.isHostedPage)
                && java.util.Objects.equals(this.customHtmlLocation, other.customHtmlLocation)
                && java.util.Objects.equals(this.customCssLocation, other.customCssLocation)
                && java.util.Objects.equals(this.customTranslation, other.customTranslation)
                && java.util.Objects.equals(this.cloudAccountName, other.cloudAccountName)
                && java.util.Objects.equals(
                        this.cloudMigrationUrlEnabled, other.cloudMigrationUrlEnabled)
                && java.util.Objects.equals(
                        this.cloudMigrationCustomUrl, other.cloudMigrationCustomUrl)
                && java.util.Objects.equals(
                        this.serviceAdminCannotListOtherUsers,
                        other.serviceAdminCannotListOtherUsers)
                && java.util.Objects.equals(
                        this.maxNoOfAppRoleMembersToReturn, other.maxNoOfAppRoleMembersToReturn)
                && java.util.Objects.equals(
                        this.maxNoOfAppCMVAToReturn, other.maxNoOfAppCMVAToReturn)
                && java.util.Objects.equals(this.iamUpstSessionExpiry, other.iamUpstSessionExpiry)
                && java.util.Objects.equals(this.cloudGateCorsSettings, other.cloudGateCorsSettings)
                && java.util.Objects.equals(this.certificateValidation, other.certificateValidation)
                && java.util.Objects.equals(this.tenantCustomClaims, other.tenantCustomClaims)
                && java.util.Objects.equals(this.purgeConfigs, other.purgeConfigs)
                && java.util.Objects.equals(this.defaultCompanyNames, other.defaultCompanyNames)
                && java.util.Objects.equals(this.defaultLoginTexts, other.defaultLoginTexts)
                && java.util.Objects.equals(this.defaultImages, other.defaultImages)
                && java.util.Objects.equals(this.companyNames, other.companyNames)
                && java.util.Objects.equals(this.loginTexts, other.loginTexts)
                && java.util.Objects.equals(this.images, other.images)
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
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result =
                (result * PRIME)
                        + (this.contactEmails == null ? 43 : this.contactEmails.hashCode());
        result =
                (result * PRIME)
                        + (this.customBranding == null ? 43 : this.customBranding.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredLanguage == null ? 43 : this.preferredLanguage.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result =
                (result * PRIME)
                        + (this.diagnosticRecordForSearchIdentifiesReturnedResources == null
                                ? 43
                                : this.diagnosticRecordForSearchIdentifiesReturnedResources
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.reAuthWhenChangingMyAuthenticationFactors == null
                                ? 43
                                : this.reAuthWhenChangingMyAuthenticationFactors.hashCode());
        result = (result * PRIME) + (this.reAuthFactor == null ? 43 : this.reAuthFactor.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result = (result * PRIME) + (this.csrAccess == null ? 43 : this.csrAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.signingCertPublicAccess == null
                                ? 43
                                : this.signingCertPublicAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.subMappingAttr == null ? 43 : this.subMappingAttr.hashCode());
        result =
                (result * PRIME)
                        + (this.accountAlwaysTrustScope == null
                                ? 43
                                : this.accountAlwaysTrustScope.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultTrustScope == null ? 43 : this.defaultTrustScope.hashCode());
        result = (result * PRIME) + (this.issuer == null ? 43 : this.issuer.hashCode());
        result = (result * PRIME) + (this.prevIssuer == null ? 43 : this.prevIssuer.hashCode());
        result =
                (result * PRIME)
                        + (this.diagnosticLevel == null ? 43 : this.diagnosticLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.diagnosticTracingUpto == null
                                ? 43
                                : this.diagnosticTracingUpto.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedDomains == null ? 43 : this.allowedDomains.hashCode());
        result =
                (result * PRIME)
                        + (this.enableTermsOfUse == null ? 43 : this.enableTermsOfUse.hashCode());
        result =
                (result * PRIME)
                        + (this.termsOfUseUrl == null ? 43 : this.termsOfUseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.privacyPolicyUrl == null ? 43 : this.privacyPolicyUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.migrationStatus == null ? 43 : this.migrationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.onPremisesProvisioning == null
                                ? 43
                                : this.onPremisesProvisioning.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedForgotPasswordFlowReturnUrls == null
                                ? 43
                                : this.allowedForgotPasswordFlowReturnUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedNotificationRedirectUrls == null
                                ? 43
                                : this.allowedNotificationRedirectUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.auditEventRetentionPeriod == null
                                ? 43
                                : this.auditEventRetentionPeriod.hashCode());
        result = (result * PRIME) + (this.isHostedPage == null ? 43 : this.isHostedPage.hashCode());
        result =
                (result * PRIME)
                        + (this.customHtmlLocation == null
                                ? 43
                                : this.customHtmlLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.customCssLocation == null ? 43 : this.customCssLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.customTranslation == null ? 43 : this.customTranslation.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAccountName == null ? 43 : this.cloudAccountName.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudMigrationUrlEnabled == null
                                ? 43
                                : this.cloudMigrationUrlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudMigrationCustomUrl == null
                                ? 43
                                : this.cloudMigrationCustomUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceAdminCannotListOtherUsers == null
                                ? 43
                                : this.serviceAdminCannotListOtherUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.maxNoOfAppRoleMembersToReturn == null
                                ? 43
                                : this.maxNoOfAppRoleMembersToReturn.hashCode());
        result =
                (result * PRIME)
                        + (this.maxNoOfAppCMVAToReturn == null
                                ? 43
                                : this.maxNoOfAppCMVAToReturn.hashCode());
        result =
                (result * PRIME)
                        + (this.iamUpstSessionExpiry == null
                                ? 43
                                : this.iamUpstSessionExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudGateCorsSettings == null
                                ? 43
                                : this.cloudGateCorsSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateValidation == null
                                ? 43
                                : this.certificateValidation.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantCustomClaims == null
                                ? 43
                                : this.tenantCustomClaims.hashCode());
        result = (result * PRIME) + (this.purgeConfigs == null ? 43 : this.purgeConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultCompanyNames == null
                                ? 43
                                : this.defaultCompanyNames.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultLoginTexts == null ? 43 : this.defaultLoginTexts.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultImages == null ? 43 : this.defaultImages.hashCode());
        result = (result * PRIME) + (this.companyNames == null ? 43 : this.companyNames.hashCode());
        result = (result * PRIME) + (this.loginTexts == null ? 43 : this.loginTexts.hashCode());
        result = (result * PRIME) + (this.images == null ? 43 : this.images.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
