/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Brand Settings schema <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BrandingSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BrandingSetting
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
        "externalId",
        "customBranding",
        "preferredLanguage",
        "timezone",
        "locale",
        "enableTermsOfUse",
        "termsOfUseUrl",
        "privacyPolicyUrl",
        "isHostedPage",
        "customHtmlLocation",
        "customCssLocation",
        "customTranslation",
        "defaultCompanyNames",
        "defaultLoginTexts",
        "defaultImages",
        "companyNames",
        "loginTexts",
        "images"
    })
    public BrandingSetting(
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
            Boolean customBranding,
            String preferredLanguage,
            String timezone,
            String locale,
            Boolean enableTermsOfUse,
            String termsOfUseUrl,
            String privacyPolicyUrl,
            Boolean isHostedPage,
            String customHtmlLocation,
            String customCssLocation,
            String customTranslation,
            java.util.List<BrandingSettingsDefaultCompanyNames> defaultCompanyNames,
            java.util.List<BrandingSettingsDefaultLoginTexts> defaultLoginTexts,
            java.util.List<BrandingSettingsDefaultImages> defaultImages,
            java.util.List<BrandingSettingsCompanyNames> companyNames,
            java.util.List<BrandingSettingsLoginTexts> loginTexts,
            java.util.List<BrandingSettingsImages> images) {
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
        this.customBranding = customBranding;
        this.preferredLanguage = preferredLanguage;
        this.timezone = timezone;
        this.locale = locale;
        this.enableTermsOfUse = enableTermsOfUse;
        this.termsOfUseUrl = termsOfUseUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.isHostedPage = isHostedPage;
        this.customHtmlLocation = customHtmlLocation;
        this.customCssLocation = customCssLocation;
        this.customTranslation = customTranslation;
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
         * An identifier for the Resource as defined by the Service Consumer. The externalId may
         * simplify identification of the Resource between Service Consumer and Service Provider by
         * allowing the Consumer to refer to the Resource with its own identifier, obviating the
         * need to store a local mapping between the local identifier of the Resource and the
         * identifier used by the Service Provider. Each Resource MAY include a non-empty externalId
         * value. The value of the externalId attribute is always issued by the Service Consumer and
         * can never be specified by the Service Provider. The Service Provider MUST always
         * interpret the externalId as scoped to the Service Consumer's tenant.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * An identifier for the Resource as defined by the Service Consumer. The externalId may
         * simplify identification of the Resource between Service Consumer and Service Provider by
         * allowing the Consumer to refer to the Resource with its own identifier, obviating the
         * need to store a local mapping between the local identifier of the Resource and the
         * identifier used by the Service Provider. Each Resource MAY include a non-empty externalId
         * value. The value of the externalId attribute is always issued by the Service Consumer and
         * can never be specified by the Service Provider. The Service Provider MUST always
         * interpret the externalId as scoped to the Service Consumer's tenant.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /**
         * Indicates if the branding is default or is custom branding
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customBranding")
        private Boolean customBranding;

        /**
         * Indicates if the branding is default or is custom branding
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         *
         * @param customBranding the value to set
         * @return this builder
         */
        public Builder customBranding(Boolean customBranding) {
            this.customBranding = customBranding;
            this.__explicitlySet__.add("customBranding");
            return this;
        }
        /**
         * Preferred written or spoken language used for localized user interfaces
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredLanguage")
        private String preferredLanguage;

        /**
         * Preferred written or spoken language used for localized user interfaces
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param preferredLanguage the value to set
         * @return this builder
         */
        public Builder preferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            this.__explicitlySet__.add("preferredLanguage");
            return this;
        }
        /**
         * User's timezone
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * User's timezone
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * Default location for purposes of localizing items such as currency, date and time format,
         * numerical representations, and so on
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locale")
        private String locale;

        /**
         * Default location for purposes of localizing items such as currency, date and time format,
         * numerical representations, and so on
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param locale the value to set
         * @return this builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            this.__explicitlySet__.add("locale");
            return this;
        }
        /**
         * Indicates if Terms of Use is enabled in UI
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableTermsOfUse")
        private Boolean enableTermsOfUse;

        /**
         * Indicates if Terms of Use is enabled in UI
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param enableTermsOfUse the value to set
         * @return this builder
         */
        public Builder enableTermsOfUse(Boolean enableTermsOfUse) {
            this.enableTermsOfUse = enableTermsOfUse;
            this.__explicitlySet__.add("enableTermsOfUse");
            return this;
        }
        /**
         * Terms of Use URL
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("termsOfUseUrl")
        private String termsOfUseUrl;

        /**
         * Terms of Use URL
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param termsOfUseUrl the value to set
         * @return this builder
         */
        public Builder termsOfUseUrl(String termsOfUseUrl) {
            this.termsOfUseUrl = termsOfUseUrl;
            this.__explicitlySet__.add("termsOfUseUrl");
            return this;
        }
        /**
         * Privacy Policy URL
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
        private String privacyPolicyUrl;

        /**
         * Privacy Policy URL
         *
         * <p>*Added In:** 18.2.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param privacyPolicyUrl the value to set
         * @return this builder
         */
        public Builder privacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            this.__explicitlySet__.add("privacyPolicyUrl");
            return this;
        }
        /**
         * Indicates if 'hosted' option was selected
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHostedPage")
        private Boolean isHostedPage;

        /**
         * Indicates if 'hosted' option was selected
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isHostedPage the value to set
         * @return this builder
         */
        public Builder isHostedPage(Boolean isHostedPage) {
            this.isHostedPage = isHostedPage;
            this.__explicitlySet__.add("isHostedPage");
            return this;
        }
        /**
         * Storage URL location where the sanitized custom html is located
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customHtmlLocation")
        private String customHtmlLocation;

        /**
         * Storage URL location where the sanitized custom html is located
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param customHtmlLocation the value to set
         * @return this builder
         */
        public Builder customHtmlLocation(String customHtmlLocation) {
            this.customHtmlLocation = customHtmlLocation;
            this.__explicitlySet__.add("customHtmlLocation");
            return this;
        }
        /**
         * Storage URL location where the sanitized custom css is located
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customCssLocation")
        private String customCssLocation;

        /**
         * Storage URL location where the sanitized custom css is located
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param customCssLocation the value to set
         * @return this builder
         */
        public Builder customCssLocation(String customCssLocation) {
            this.customCssLocation = customCssLocation;
            this.__explicitlySet__.add("customCssLocation");
            return this;
        }
        /**
         * Custom translations (JSON String)
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customTranslation")
        private String customTranslation;

        /**
         * Custom translations (JSON String)
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param customTranslation the value to set
         * @return this builder
         */
        public Builder customTranslation(String customTranslation) {
            this.customTranslation = customTranslation;
            this.__explicitlySet__.add("customTranslation");
            return this;
        }
        /**
         * Default name of the Company in different locales
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCompanyNames")
        private java.util.List<BrandingSettingsDefaultCompanyNames> defaultCompanyNames;

        /**
         * Default name of the Company in different locales
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param defaultCompanyNames the value to set
         * @return this builder
         */
        public Builder defaultCompanyNames(
                java.util.List<BrandingSettingsDefaultCompanyNames> defaultCompanyNames) {
            this.defaultCompanyNames = defaultCompanyNames;
            this.__explicitlySet__.add("defaultCompanyNames");
            return this;
        }
        /**
         * Default Login text in different locales
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultLoginTexts")
        private java.util.List<BrandingSettingsDefaultLoginTexts> defaultLoginTexts;

        /**
         * Default Login text in different locales
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param defaultLoginTexts the value to set
         * @return this builder
         */
        public Builder defaultLoginTexts(
                java.util.List<BrandingSettingsDefaultLoginTexts> defaultLoginTexts) {
            this.defaultLoginTexts = defaultLoginTexts;
            this.__explicitlySet__.add("defaultLoginTexts");
            return this;
        }
        /**
         * References to various images
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultImages")
        private java.util.List<BrandingSettingsDefaultImages> defaultImages;

        /**
         * References to various images
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param defaultImages the value to set
         * @return this builder
         */
        public Builder defaultImages(java.util.List<BrandingSettingsDefaultImages> defaultImages) {
            this.defaultImages = defaultImages;
            this.__explicitlySet__.add("defaultImages");
            return this;
        }
        /**
         * Name of the company in different locales
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("companyNames")
        private java.util.List<BrandingSettingsCompanyNames> companyNames;

        /**
         * Name of the company in different locales
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param companyNames the value to set
         * @return this builder
         */
        public Builder companyNames(java.util.List<BrandingSettingsCompanyNames> companyNames) {
            this.companyNames = companyNames;
            this.__explicitlySet__.add("companyNames");
            return this;
        }
        /**
         * Login text in different locales
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginTexts")
        private java.util.List<BrandingSettingsLoginTexts> loginTexts;

        /**
         * Login text in different locales
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param loginTexts the value to set
         * @return this builder
         */
        public Builder loginTexts(java.util.List<BrandingSettingsLoginTexts> loginTexts) {
            this.loginTexts = loginTexts;
            this.__explicitlySet__.add("loginTexts");
            return this;
        }
        /**
         * References to various images
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<BrandingSettingsImages> images;

        /**
         * References to various images
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
         * readOnly - required: false - returned: default - type: complex
         *
         * @param images the value to set
         * @return this builder
         */
        public Builder images(java.util.List<BrandingSettingsImages> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BrandingSetting build() {
            BrandingSetting model =
                    new BrandingSetting(
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
                            this.customBranding,
                            this.preferredLanguage,
                            this.timezone,
                            this.locale,
                            this.enableTermsOfUse,
                            this.termsOfUseUrl,
                            this.privacyPolicyUrl,
                            this.isHostedPage,
                            this.customHtmlLocation,
                            this.customCssLocation,
                            this.customTranslation,
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
        public Builder copy(BrandingSetting model) {
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
            if (model.wasPropertyExplicitlySet("customBranding")) {
                this.customBranding(model.getCustomBranding());
            }
            if (model.wasPropertyExplicitlySet("preferredLanguage")) {
                this.preferredLanguage(model.getPreferredLanguage());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
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
     * An identifier for the Resource as defined by the Service Consumer. The externalId may
     * simplify identification of the Resource between Service Consumer and Service Provider by
     * allowing the Consumer to refer to the Resource with its own identifier, obviating the need to
     * store a local mapping between the local identifier of the Resource and the identifier used by
     * the Service Provider. Each Resource MAY include a non-empty externalId value. The value of
     * the externalId attribute is always issued by the Service Consumer and can never be specified
     * by the Service Provider. The Service Provider MUST always interpret the externalId as scoped
     * to the Service Consumer's tenant.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * An identifier for the Resource as defined by the Service Consumer. The externalId may
     * simplify identification of the Resource between Service Consumer and Service Provider by
     * allowing the Consumer to refer to the Resource with its own identifier, obviating the need to
     * store a local mapping between the local identifier of the Resource and the identifier used by
     * the Service Provider. Each Resource MAY include a non-empty externalId value. The value of
     * the externalId attribute is always issued by the Service Consumer and can never be specified
     * by the Service Provider. The Service Provider MUST always interpret the externalId as scoped
     * to the Service Consumer's tenant.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Indicates if the branding is default or is custom branding
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customBranding")
    private final Boolean customBranding;

    /**
     * Indicates if the branding is default or is custom branding
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getCustomBranding() {
        return customBranding;
    }

    /**
     * Preferred written or spoken language used for localized user interfaces
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredLanguage")
    private final String preferredLanguage;

    /**
     * Preferred written or spoken language used for localized user interfaces
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * User's timezone
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * User's timezone
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Default location for purposes of localizing items such as currency, date and time format,
     * numerical representations, and so on
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locale")
    private final String locale;

    /**
     * Default location for purposes of localizing items such as currency, date and time format,
     * numerical representations, and so on
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Indicates if Terms of Use is enabled in UI
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableTermsOfUse")
    private final Boolean enableTermsOfUse;

    /**
     * Indicates if Terms of Use is enabled in UI
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getEnableTermsOfUse() {
        return enableTermsOfUse;
    }

    /**
     * Terms of Use URL
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("termsOfUseUrl")
    private final String termsOfUseUrl;

    /**
     * Terms of Use URL
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getTermsOfUseUrl() {
        return termsOfUseUrl;
    }

    /**
     * Privacy Policy URL
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privacyPolicyUrl")
    private final String privacyPolicyUrl;

    /**
     * Privacy Policy URL
     *
     * <p>*Added In:** 18.2.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Indicates if 'hosted' option was selected
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHostedPage")
    private final Boolean isHostedPage;

    /**
     * Indicates if 'hosted' option was selected
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsHostedPage() {
        return isHostedPage;
    }

    /**
     * Storage URL location where the sanitized custom html is located
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customHtmlLocation")
    private final String customHtmlLocation;

    /**
     * Storage URL location where the sanitized custom html is located
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCustomHtmlLocation() {
        return customHtmlLocation;
    }

    /**
     * Storage URL location where the sanitized custom css is located
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customCssLocation")
    private final String customCssLocation;

    /**
     * Storage URL location where the sanitized custom css is located
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCustomCssLocation() {
        return customCssLocation;
    }

    /**
     * Custom translations (JSON String)
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customTranslation")
    private final String customTranslation;

    /**
     * Custom translations (JSON String)
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCustomTranslation() {
        return customTranslation;
    }

    /**
     * Default name of the Company in different locales
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCompanyNames")
    private final java.util.List<BrandingSettingsDefaultCompanyNames> defaultCompanyNames;

    /**
     * Default name of the Company in different locales
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsDefaultCompanyNames> getDefaultCompanyNames() {
        return defaultCompanyNames;
    }

    /**
     * Default Login text in different locales
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultLoginTexts")
    private final java.util.List<BrandingSettingsDefaultLoginTexts> defaultLoginTexts;

    /**
     * Default Login text in different locales
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsDefaultLoginTexts> getDefaultLoginTexts() {
        return defaultLoginTexts;
    }

    /**
     * References to various images
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultImages")
    private final java.util.List<BrandingSettingsDefaultImages> defaultImages;

    /**
     * References to various images
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsDefaultImages> getDefaultImages() {
        return defaultImages;
    }

    /**
     * Name of the company in different locales
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("companyNames")
    private final java.util.List<BrandingSettingsCompanyNames> companyNames;

    /**
     * Name of the company in different locales
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsCompanyNames> getCompanyNames() {
        return companyNames;
    }

    /**
     * Login text in different locales
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginTexts")
    private final java.util.List<BrandingSettingsLoginTexts> loginTexts;

    /**
     * Login text in different locales
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsLoginTexts> getLoginTexts() {
        return loginTexts;
    }

    /**
     * References to various images
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    private final java.util.List<BrandingSettingsImages> images;

    /**
     * References to various images
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [type] - multiValued: true - mutability:
     * readOnly - required: false - returned: default - type: complex
     *
     * @return the value
     */
    public java.util.List<BrandingSettingsImages> getImages() {
        return images;
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
        sb.append("BrandingSetting(");
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
        sb.append(", customBranding=").append(String.valueOf(this.customBranding));
        sb.append(", preferredLanguage=").append(String.valueOf(this.preferredLanguage));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", enableTermsOfUse=").append(String.valueOf(this.enableTermsOfUse));
        sb.append(", termsOfUseUrl=").append(String.valueOf(this.termsOfUseUrl));
        sb.append(", privacyPolicyUrl=").append(String.valueOf(this.privacyPolicyUrl));
        sb.append(", isHostedPage=").append(String.valueOf(this.isHostedPage));
        sb.append(", customHtmlLocation=").append(String.valueOf(this.customHtmlLocation));
        sb.append(", customCssLocation=").append(String.valueOf(this.customCssLocation));
        sb.append(", customTranslation=").append(String.valueOf(this.customTranslation));
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
        if (!(o instanceof BrandingSetting)) {
            return false;
        }

        BrandingSetting other = (BrandingSetting) o;
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
                && java.util.Objects.equals(this.customBranding, other.customBranding)
                && java.util.Objects.equals(this.preferredLanguage, other.preferredLanguage)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.enableTermsOfUse, other.enableTermsOfUse)
                && java.util.Objects.equals(this.termsOfUseUrl, other.termsOfUseUrl)
                && java.util.Objects.equals(this.privacyPolicyUrl, other.privacyPolicyUrl)
                && java.util.Objects.equals(this.isHostedPage, other.isHostedPage)
                && java.util.Objects.equals(this.customHtmlLocation, other.customHtmlLocation)
                && java.util.Objects.equals(this.customCssLocation, other.customCssLocation)
                && java.util.Objects.equals(this.customTranslation, other.customTranslation)
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
                        + (this.customBranding == null ? 43 : this.customBranding.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredLanguage == null ? 43 : this.preferredLanguage.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result =
                (result * PRIME)
                        + (this.enableTermsOfUse == null ? 43 : this.enableTermsOfUse.hashCode());
        result =
                (result * PRIME)
                        + (this.termsOfUseUrl == null ? 43 : this.termsOfUseUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.privacyPolicyUrl == null ? 43 : this.privacyPolicyUrl.hashCode());
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
