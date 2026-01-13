/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Self Registration Profile <br>
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
        builder = SelfRegistrationProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SelfRegistrationProfile
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
        "name",
        "activationEmailRequired",
        "numberOfDaysRedirectUrlIsValid",
        "active",
        "showOnLoginPage",
        "allowedEmailDomains",
        "disallowedEmailDomains",
        "headerLogo",
        "footerLogo",
        "redirectUrl",
        "consentTextPresent",
        "displayName",
        "afterSubmitText",
        "userAttributes",
        "emailTemplate",
        "defaultGroups",
        "headerText",
        "footerText",
        "consentText"
    })
    public SelfRegistrationProfile(
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
            String name,
            Boolean activationEmailRequired,
            Integer numberOfDaysRedirectUrlIsValid,
            Boolean active,
            Boolean showOnLoginPage,
            java.util.List<String> allowedEmailDomains,
            java.util.List<String> disallowedEmailDomains,
            String headerLogo,
            String footerLogo,
            String redirectUrl,
            Boolean consentTextPresent,
            java.util.List<SelfRegistrationProfileDisplayName> displayName,
            java.util.List<SelfRegistrationProfileAfterSubmitText> afterSubmitText,
            java.util.List<SelfRegistrationProfileUserAttributes> userAttributes,
            SelfRegistrationProfileEmailTemplate emailTemplate,
            java.util.List<SelfRegistrationProfileDefaultGroups> defaultGroups,
            java.util.List<SelfRegistrationProfileHeaderText> headerText,
            java.util.List<SelfRegistrationProfileFooterText> footerText,
            java.util.List<SelfRegistrationProfileConsentText> consentText) {
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
        this.name = name;
        this.activationEmailRequired = activationEmailRequired;
        this.numberOfDaysRedirectUrlIsValid = numberOfDaysRedirectUrlIsValid;
        this.active = active;
        this.showOnLoginPage = showOnLoginPage;
        this.allowedEmailDomains = allowedEmailDomains;
        this.disallowedEmailDomains = disallowedEmailDomains;
        this.headerLogo = headerLogo;
        this.footerLogo = footerLogo;
        this.redirectUrl = redirectUrl;
        this.consentTextPresent = consentTextPresent;
        this.displayName = displayName;
        this.afterSubmitText = afterSubmitText;
        this.userAttributes = userAttributes;
        this.emailTemplate = emailTemplate;
        this.defaultGroups = defaultGroups;
        this.headerText = headerText;
        this.footerText = footerText;
        this.consentText = consentText;
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string - uniqueness: none
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
         * Name of the profile
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the profile
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * global
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * **SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none A Boolean value that indicates whether Account verification email is required to be
         * sent before login or not
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activationEmailRequired")
        private Boolean activationEmailRequired;

        /**
         * **SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none A Boolean value that indicates whether Account verification email is required to be
         * sent before login or not
         *
         * @param activationEmailRequired the value to set
         * @return this builder
         */
        public Builder activationEmailRequired(Boolean activationEmailRequired) {
            this.activationEmailRequired = activationEmailRequired;
            this.__explicitlySet__.add("activationEmailRequired");
            return this;
        }
        /**
         * Number of days redirect URL is valid
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfDaysRedirectUrlIsValid")
        private Integer numberOfDaysRedirectUrlIsValid;

        /**
         * Number of days redirect URL is valid
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: integer - uniqueness: none
         *
         * @param numberOfDaysRedirectUrlIsValid the value to set
         * @return this builder
         */
        public Builder numberOfDaysRedirectUrlIsValid(Integer numberOfDaysRedirectUrlIsValid) {
            this.numberOfDaysRedirectUrlIsValid = numberOfDaysRedirectUrlIsValid;
            this.__explicitlySet__.add("numberOfDaysRedirectUrlIsValid");
            return this;
        }
        /**
         * A Boolean value that indicates whether the profile is enabled or not
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * A Boolean value that indicates whether the profile is enabled or not
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param active the value to set
         * @return this builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * A Boolean value that indicates whether the profile should be displayed on login page
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("showOnLoginPage")
        private Boolean showOnLoginPage;

        /**
         * A Boolean value that indicates whether the profile should be displayed on login page
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param showOnLoginPage the value to set
         * @return this builder
         */
        public Builder showOnLoginPage(Boolean showOnLoginPage) {
            this.showOnLoginPage = showOnLoginPage;
            this.__explicitlySet__.add("showOnLoginPage");
            return this;
        }
        /**
         * A Multivalue String value for Email domains which are valid for this profile
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedEmailDomains")
        private java.util.List<String> allowedEmailDomains;

        /**
         * A Multivalue String value for Email domains which are valid for this profile
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param allowedEmailDomains the value to set
         * @return this builder
         */
        public Builder allowedEmailDomains(java.util.List<String> allowedEmailDomains) {
            this.allowedEmailDomains = allowedEmailDomains;
            this.__explicitlySet__.add("allowedEmailDomains");
            return this;
        }
        /**
         * A Multivalue String Value for Email domains to be handled as exceptions
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disallowedEmailDomains")
        private java.util.List<String> disallowedEmailDomains;

        /**
         * A Multivalue String Value for Email domains to be handled as exceptions
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param disallowedEmailDomains the value to set
         * @return this builder
         */
        public Builder disallowedEmailDomains(java.util.List<String> disallowedEmailDomains) {
            this.disallowedEmailDomains = disallowedEmailDomains;
            this.__explicitlySet__.add("disallowedEmailDomains");
            return this;
        }
        /**
         * Reference to header logo
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headerLogo")
        private String headerLogo;

        /**
         * Reference to header logo
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference
         *
         * @param headerLogo the value to set
         * @return this builder
         */
        public Builder headerLogo(String headerLogo) {
            this.headerLogo = headerLogo;
            this.__explicitlySet__.add("headerLogo");
            return this;
        }
        /**
         * References to footer logo
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference
         */
        @com.fasterxml.jackson.annotation.JsonProperty("footerLogo")
        private String footerLogo;

        /**
         * References to footer logo
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: reference
         *
         * @param footerLogo the value to set
         * @return this builder
         */
        public Builder footerLogo(String footerLogo) {
            this.footerLogo = footerLogo;
            this.__explicitlySet__.add("footerLogo");
            return this;
        }
        /**
         * This URL will be replaced in email notification sent to user. When activation email
         * required is set to true, user is created in \\"pending verification\\" state, upon
         * clicking this link user will be able to activate himself. When activation email required
         * is set to false, user is created in \\"verified\\" state, this link will be used to
         * verify user's email.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        /**
         * This URL will be replaced in email notification sent to user. When activation email
         * required is set to true, user is created in \\"pending verification\\" state, upon
         * clicking this link user will be able to activate himself. When activation email required
         * is set to false, user is created in \\"verified\\" state, this link will be used to
         * verify user's email.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
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
         * A boolean value that indicates whether the consent text is present.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consentTextPresent")
        private Boolean consentTextPresent;

        /**
         * A boolean value that indicates whether the consent text is present.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param consentTextPresent the value to set
         * @return this builder
         */
        public Builder consentTextPresent(Boolean consentTextPresent) {
            this.consentTextPresent = consentTextPresent;
            this.__explicitlySet__.add("consentTextPresent");
            return this;
        }
        /**
         * Registration page name
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: true -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private java.util.List<SelfRegistrationProfileDisplayName> displayName;

        /**
         * Registration page name
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: true -
         * returned: default - type: complex - uniqueness: none
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(java.util.List<SelfRegistrationProfileDisplayName> displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Text to be displayed on UI after doing self registration
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("afterSubmitText")
        private java.util.List<SelfRegistrationProfileAfterSubmitText> afterSubmitText;

        /**
         * Text to be displayed on UI after doing self registration
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         *
         * @param afterSubmitText the value to set
         * @return this builder
         */
        public Builder afterSubmitText(
                java.util.List<SelfRegistrationProfileAfterSubmitText> afterSubmitText) {
            this.afterSubmitText = afterSubmitText;
            this.__explicitlySet__.add("afterSubmitText");
            return this;
        }
        /**
         * **SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none User Attributes
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userAttributes")
        private java.util.List<SelfRegistrationProfileUserAttributes> userAttributes;

        /**
         * **SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: default - type: complex -
         * uniqueness: none User Attributes
         *
         * @param userAttributes the value to set
         * @return this builder
         */
        public Builder userAttributes(
                java.util.List<SelfRegistrationProfileUserAttributes> userAttributes) {
            this.userAttributes = userAttributes;
            this.__explicitlySet__.add("userAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailTemplate")
        private SelfRegistrationProfileEmailTemplate emailTemplate;

        public Builder emailTemplate(SelfRegistrationProfileEmailTemplate emailTemplate) {
            this.emailTemplate = emailTemplate;
            this.__explicitlySet__.add("emailTemplate");
            return this;
        }
        /**
         * Default groups assigned to the user
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultGroups")
        private java.util.List<SelfRegistrationProfileDefaultGroups> defaultGroups;

        /**
         * Default groups assigned to the user
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex
         *
         * @param defaultGroups the value to set
         * @return this builder
         */
        public Builder defaultGroups(
                java.util.List<SelfRegistrationProfileDefaultGroups> defaultGroups) {
            this.defaultGroups = defaultGroups;
            this.__explicitlySet__.add("defaultGroups");
            return this;
        }
        /**
         * Header text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headerText")
        private java.util.List<SelfRegistrationProfileHeaderText> headerText;

        /**
         * Header text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         *
         * @param headerText the value to set
         * @return this builder
         */
        public Builder headerText(java.util.List<SelfRegistrationProfileHeaderText> headerText) {
            this.headerText = headerText;
            this.__explicitlySet__.add("headerText");
            return this;
        }
        /**
         * Footer text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("footerText")
        private java.util.List<SelfRegistrationProfileFooterText> footerText;

        /**
         * Footer text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         *
         * @param footerText the value to set
         * @return this builder
         */
        public Builder footerText(java.util.List<SelfRegistrationProfileFooterText> footerText) {
            this.footerText = footerText;
            this.__explicitlySet__.add("footerText");
            return this;
        }
        /**
         * Consent text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("consentText")
        private java.util.List<SelfRegistrationProfileConsentText> consentText;

        /**
         * Consent text
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
         * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: complex - uniqueness: none
         *
         * @param consentText the value to set
         * @return this builder
         */
        public Builder consentText(java.util.List<SelfRegistrationProfileConsentText> consentText) {
            this.consentText = consentText;
            this.__explicitlySet__.add("consentText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SelfRegistrationProfile build() {
            SelfRegistrationProfile model =
                    new SelfRegistrationProfile(
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
                            this.name,
                            this.activationEmailRequired,
                            this.numberOfDaysRedirectUrlIsValid,
                            this.active,
                            this.showOnLoginPage,
                            this.allowedEmailDomains,
                            this.disallowedEmailDomains,
                            this.headerLogo,
                            this.footerLogo,
                            this.redirectUrl,
                            this.consentTextPresent,
                            this.displayName,
                            this.afterSubmitText,
                            this.userAttributes,
                            this.emailTemplate,
                            this.defaultGroups,
                            this.headerText,
                            this.footerText,
                            this.consentText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SelfRegistrationProfile model) {
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("activationEmailRequired")) {
                this.activationEmailRequired(model.getActivationEmailRequired());
            }
            if (model.wasPropertyExplicitlySet("numberOfDaysRedirectUrlIsValid")) {
                this.numberOfDaysRedirectUrlIsValid(model.getNumberOfDaysRedirectUrlIsValid());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("showOnLoginPage")) {
                this.showOnLoginPage(model.getShowOnLoginPage());
            }
            if (model.wasPropertyExplicitlySet("allowedEmailDomains")) {
                this.allowedEmailDomains(model.getAllowedEmailDomains());
            }
            if (model.wasPropertyExplicitlySet("disallowedEmailDomains")) {
                this.disallowedEmailDomains(model.getDisallowedEmailDomains());
            }
            if (model.wasPropertyExplicitlySet("headerLogo")) {
                this.headerLogo(model.getHeaderLogo());
            }
            if (model.wasPropertyExplicitlySet("footerLogo")) {
                this.footerLogo(model.getFooterLogo());
            }
            if (model.wasPropertyExplicitlySet("redirectUrl")) {
                this.redirectUrl(model.getRedirectUrl());
            }
            if (model.wasPropertyExplicitlySet("consentTextPresent")) {
                this.consentTextPresent(model.getConsentTextPresent());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("afterSubmitText")) {
                this.afterSubmitText(model.getAfterSubmitText());
            }
            if (model.wasPropertyExplicitlySet("userAttributes")) {
                this.userAttributes(model.getUserAttributes());
            }
            if (model.wasPropertyExplicitlySet("emailTemplate")) {
                this.emailTemplate(model.getEmailTemplate());
            }
            if (model.wasPropertyExplicitlySet("defaultGroups")) {
                this.defaultGroups(model.getDefaultGroups());
            }
            if (model.wasPropertyExplicitlySet("headerText")) {
                this.headerText(model.getHeaderText());
            }
            if (model.wasPropertyExplicitlySet("footerText")) {
                this.footerText(model.getFooterText());
            }
            if (model.wasPropertyExplicitlySet("consentText")) {
                this.consentText(model.getConsentText());
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
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
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
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Name of the profile
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the profile
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: global
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * **SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     * A Boolean value that indicates whether Account verification email is required to be sent
     * before login or not
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activationEmailRequired")
    private final Boolean activationEmailRequired;

    /**
     * **SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     * A Boolean value that indicates whether Account verification email is required to be sent
     * before login or not
     *
     * @return the value
     */
    public Boolean getActivationEmailRequired() {
        return activationEmailRequired;
    }

    /**
     * Number of days redirect URL is valid
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfDaysRedirectUrlIsValid")
    private final Integer numberOfDaysRedirectUrlIsValid;

    /**
     * Number of days redirect URL is valid
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getNumberOfDaysRedirectUrlIsValid() {
        return numberOfDaysRedirectUrlIsValid;
    }

    /**
     * A Boolean value that indicates whether the profile is enabled or not
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * A Boolean value that indicates whether the profile is enabled or not
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * A Boolean value that indicates whether the profile should be displayed on login page
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("showOnLoginPage")
    private final Boolean showOnLoginPage;

    /**
     * A Boolean value that indicates whether the profile should be displayed on login page
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getShowOnLoginPage() {
        return showOnLoginPage;
    }

    /**
     * A Multivalue String value for Email domains which are valid for this profile
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedEmailDomains")
    private final java.util.List<String> allowedEmailDomains;

    /**
     * A Multivalue String value for Email domains which are valid for this profile
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getAllowedEmailDomains() {
        return allowedEmailDomains;
    }

    /**
     * A Multivalue String Value for Email domains to be handled as exceptions
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disallowedEmailDomains")
    private final java.util.List<String> disallowedEmailDomains;

    /**
     * A Multivalue String Value for Email domains to be handled as exceptions
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getDisallowedEmailDomains() {
        return disallowedEmailDomains;
    }

    /**
     * Reference to header logo
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerLogo")
    private final String headerLogo;

    /**
     * Reference to header logo
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference
     *
     * @return the value
     */
    public String getHeaderLogo() {
        return headerLogo;
    }

    /**
     * References to footer logo
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference
     */
    @com.fasterxml.jackson.annotation.JsonProperty("footerLogo")
    private final String footerLogo;

    /**
     * References to footer logo
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: reference
     *
     * @return the value
     */
    public String getFooterLogo() {
        return footerLogo;
    }

    /**
     * This URL will be replaced in email notification sent to user. When activation email required
     * is set to true, user is created in \\"pending verification\\" state, upon clicking this link
     * user will be able to activate himself. When activation email required is set to false, user
     * is created in \\"verified\\" state, this link will be used to verify user's email.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    /**
     * This URL will be replaced in email notification sent to user. When activation email required
     * is set to true, user is created in \\"pending verification\\" state, upon clicking this link
     * user will be able to activate himself. When activation email required is set to false, user
     * is created in \\"verified\\" state, this link will be used to verify user's email.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * A boolean value that indicates whether the consent text is present.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consentTextPresent")
    private final Boolean consentTextPresent;

    /**
     * A boolean value that indicates whether the consent text is present.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getConsentTextPresent() {
        return consentTextPresent;
    }

    /**
     * Registration page name
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: true - returned:
     * default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final java.util.List<SelfRegistrationProfileDisplayName> displayName;

    /**
     * Registration page name
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: true - returned:
     * default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileDisplayName> getDisplayName() {
        return displayName;
    }

    /**
     * Text to be displayed on UI after doing self registration
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("afterSubmitText")
    private final java.util.List<SelfRegistrationProfileAfterSubmitText> afterSubmitText;

    /**
     * Text to be displayed on UI after doing self registration
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileAfterSubmitText> getAfterSubmitText() {
        return afterSubmitText;
    }

    /**
     * **SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued: true
     * - mutability: readWrite - required: false - returned: default - type: complex - uniqueness:
     * none User Attributes
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userAttributes")
    private final java.util.List<SelfRegistrationProfileUserAttributes> userAttributes;

    /**
     * **SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued: true
     * - mutability: readWrite - required: false - returned: default - type: complex - uniqueness:
     * none User Attributes
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileUserAttributes> getUserAttributes() {
        return userAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("emailTemplate")
    private final SelfRegistrationProfileEmailTemplate emailTemplate;

    public SelfRegistrationProfileEmailTemplate getEmailTemplate() {
        return emailTemplate;
    }

    /**
     * Default groups assigned to the user
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultGroups")
    private final java.util.List<SelfRegistrationProfileDefaultGroups> defaultGroups;

    /**
     * Default groups assigned to the user
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readWrite - required: false - returned: request - type: complex
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileDefaultGroups> getDefaultGroups() {
        return defaultGroups;
    }

    /**
     * Header text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerText")
    private final java.util.List<SelfRegistrationProfileHeaderText> headerText;

    /**
     * Header text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileHeaderText> getHeaderText() {
        return headerText;
    }

    /**
     * Footer text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("footerText")
    private final java.util.List<SelfRegistrationProfileFooterText> footerText;

    /**
     * Footer text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileFooterText> getFooterText() {
        return footerText;
    }

    /**
     * Consent text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("consentText")
    private final java.util.List<SelfRegistrationProfileConsentText> consentText;

    /**
     * Consent text
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [locale] - idcsMultiLanguage: true -
     * idcsSearchable: true - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<SelfRegistrationProfileConsentText> getConsentText() {
        return consentText;
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
        sb.append("SelfRegistrationProfile(");
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
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", activationEmailRequired=")
                .append(String.valueOf(this.activationEmailRequired));
        sb.append(", numberOfDaysRedirectUrlIsValid=")
                .append(String.valueOf(this.numberOfDaysRedirectUrlIsValid));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", showOnLoginPage=").append(String.valueOf(this.showOnLoginPage));
        sb.append(", allowedEmailDomains=").append(String.valueOf(this.allowedEmailDomains));
        sb.append(", disallowedEmailDomains=").append(String.valueOf(this.disallowedEmailDomains));
        sb.append(", headerLogo=").append(String.valueOf(this.headerLogo));
        sb.append(", footerLogo=").append(String.valueOf(this.footerLogo));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", consentTextPresent=").append(String.valueOf(this.consentTextPresent));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", afterSubmitText=").append(String.valueOf(this.afterSubmitText));
        sb.append(", userAttributes=").append(String.valueOf(this.userAttributes));
        sb.append(", emailTemplate=").append(String.valueOf(this.emailTemplate));
        sb.append(", defaultGroups=").append(String.valueOf(this.defaultGroups));
        sb.append(", headerText=").append(String.valueOf(this.headerText));
        sb.append(", footerText=").append(String.valueOf(this.footerText));
        sb.append(", consentText=").append(String.valueOf(this.consentText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SelfRegistrationProfile)) {
            return false;
        }

        SelfRegistrationProfile other = (SelfRegistrationProfile) o;
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
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.activationEmailRequired, other.activationEmailRequired)
                && java.util.Objects.equals(
                        this.numberOfDaysRedirectUrlIsValid, other.numberOfDaysRedirectUrlIsValid)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.showOnLoginPage, other.showOnLoginPage)
                && java.util.Objects.equals(this.allowedEmailDomains, other.allowedEmailDomains)
                && java.util.Objects.equals(
                        this.disallowedEmailDomains, other.disallowedEmailDomains)
                && java.util.Objects.equals(this.headerLogo, other.headerLogo)
                && java.util.Objects.equals(this.footerLogo, other.footerLogo)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.consentTextPresent, other.consentTextPresent)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.afterSubmitText, other.afterSubmitText)
                && java.util.Objects.equals(this.userAttributes, other.userAttributes)
                && java.util.Objects.equals(this.emailTemplate, other.emailTemplate)
                && java.util.Objects.equals(this.defaultGroups, other.defaultGroups)
                && java.util.Objects.equals(this.headerText, other.headerText)
                && java.util.Objects.equals(this.footerText, other.footerText)
                && java.util.Objects.equals(this.consentText, other.consentText)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.activationEmailRequired == null
                                ? 43
                                : this.activationEmailRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfDaysRedirectUrlIsValid == null
                                ? 43
                                : this.numberOfDaysRedirectUrlIsValid.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result =
                (result * PRIME)
                        + (this.showOnLoginPage == null ? 43 : this.showOnLoginPage.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedEmailDomains == null
                                ? 43
                                : this.allowedEmailDomains.hashCode());
        result =
                (result * PRIME)
                        + (this.disallowedEmailDomains == null
                                ? 43
                                : this.disallowedEmailDomains.hashCode());
        result = (result * PRIME) + (this.headerLogo == null ? 43 : this.headerLogo.hashCode());
        result = (result * PRIME) + (this.footerLogo == null ? 43 : this.footerLogo.hashCode());
        result = (result * PRIME) + (this.redirectUrl == null ? 43 : this.redirectUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.consentTextPresent == null
                                ? 43
                                : this.consentTextPresent.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.afterSubmitText == null ? 43 : this.afterSubmitText.hashCode());
        result =
                (result * PRIME)
                        + (this.userAttributes == null ? 43 : this.userAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.emailTemplate == null ? 43 : this.emailTemplate.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultGroups == null ? 43 : this.defaultGroups.hashCode());
        result = (result * PRIME) + (this.headerText == null ? 43 : this.headerText.hashCode());
        result = (result * PRIME) + (this.footerText == null ? 43 : this.footerText.hashCode());
        result = (result * PRIME) + (this.consentText == null ? 43 : this.consentText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
