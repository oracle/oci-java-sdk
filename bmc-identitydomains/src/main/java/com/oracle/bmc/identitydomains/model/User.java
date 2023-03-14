/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User Account
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class User extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "userName",
        "description",
        "displayName",
        "nickName",
        "profileUrl",
        "title",
        "userType",
        "locale",
        "preferredLanguage",
        "timezone",
        "active",
        "password",
        "name",
        "emails",
        "phoneNumbers",
        "ims",
        "photos",
        "addresses",
        "groups",
        "entitlements",
        "roles",
        "x509Certificates",
        "urnIetfParamsScimSchemasExtensionEnterprise2_0User",
        "urnIetfParamsScimSchemasOracleIdcsExtensionUserUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSffUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags",
        "urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser"
    })
    public User(
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
            String userName,
            String description,
            String displayName,
            String nickName,
            String profileUrl,
            String title,
            UserType userType,
            String locale,
            String preferredLanguage,
            String timezone,
            Boolean active,
            String password,
            UserName name,
            java.util.List<UserEmails> emails,
            java.util.List<UserPhoneNumbers> phoneNumbers,
            java.util.List<UserIms> ims,
            java.util.List<UserPhotos> photos,
            java.util.List<Addresses> addresses,
            java.util.List<UserGroups> groups,
            java.util.List<UserEntitlements> entitlements,
            java.util.List<UserRoles> roles,
            java.util.List<UserX509Certificates> x509Certificates,
            ExtensionEnterprise20User urnIetfParamsScimSchemasExtensionEnterprise2_0User,
            ExtensionUserUser urnIetfParamsScimSchemasOracleIdcsExtensionUserUser,
            ExtensionPasswordStateUser urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser,
            ExtensionUserStateUser urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser,
            ExtensionPosixUser urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser,
            ExtensionKerberosUserUser urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser,
            ExtensionMfaUser urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser,
            ExtensionAdaptiveUser urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser,
            ExtensionSffUser urnIetfParamsScimSchemasOracleIdcsExtensionSffUser,
            ExtensionSecurityQuestionsUser
                    urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser,
            ExtensionSelfRegistrationUser
                    urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser,
            ExtensionSocialAccountUser urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser,
            ExtensionDbUserUser urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser,
            ExtensionTermsOfUseUser urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser,
            ExtensionPasswordlessUser urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser,
            ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
            ExtensionUserCredentialsUser
                    urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser,
            ExtensionCapabilitiesUser urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser,
            ExtensionDbCredentialsUser urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser,
            ExtensionSelfChangeUser urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser) {
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
        this.userName = userName;
        this.description = description;
        this.displayName = displayName;
        this.nickName = nickName;
        this.profileUrl = profileUrl;
        this.title = title;
        this.userType = userType;
        this.locale = locale;
        this.preferredLanguage = preferredLanguage;
        this.timezone = timezone;
        this.active = active;
        this.password = password;
        this.name = name;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
        this.ims = ims;
        this.photos = photos;
        this.addresses = addresses;
        this.groups = groups;
        this.entitlements = entitlements;
        this.roles = roles;
        this.x509Certificates = x509Certificates;
        this.urnIetfParamsScimSchemasExtensionEnterprise2_0User =
                urnIetfParamsScimSchemasExtensionEnterprise2_0User;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionUserUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionSffUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags =
                urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser =
                urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser;
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
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:External Id]]
         *  - idcsPii: true
         *  - idcsSearchable: true
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
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:External Id]]
         *  - idcsPii: true
         *  - idcsSearchable: true
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
         * User name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: User ID
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Name, deprecatedColumnHeaderName:User ID]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * User name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: User ID
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Name, deprecatedColumnHeaderName:User ID]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * Description of the user
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsPii: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the user
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsPii: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Display name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Display Name
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Display Name]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Display Name
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Display Name]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Nick name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Nick Name
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Nick Name]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nickName")
        private String nickName;

        /**
         * Nick name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Nick Name
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Nick Name]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param nickName the value to set
         * @return this builder
         **/
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            this.__explicitlySet__.add("nickName");
            return this;
        }
        /**
         * A fully-qualified URL to a page representing the User's online profile
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Profile URL
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Profile Url]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
        private String profileUrl;

        /**
         * A fully-qualified URL to a page representing the User's online profile
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Profile URL
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Profile Url]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param profileUrl the value to set
         * @return this builder
         **/
        public Builder profileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
            this.__explicitlySet__.add("profileUrl");
            return this;
        }
        /**
         * Title
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Title
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Title]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Title
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Title
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Title]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * Used to identify the organization-to-user relationship
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: User Type
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Type]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userType")
        private UserType userType;

        /**
         * Used to identify the organization-to-user relationship
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: User Type
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Type]]
         *  - idcsPii: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param userType the value to set
         * @return this builder
         **/
        public Builder userType(UserType userType) {
            this.userType = userType;
            this.__explicitlySet__.add("userType");
            return this;
        }
        /**
         * Used to indicate the User's default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Locale
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Locale]]
         *  - idcsSearchable: true
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
         * Used to indicate the User's default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Locale
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Locale]]
         *  - idcsSearchable: true
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
         * User's preferred written or spoken language used for localized user interfaces
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Preferred Language
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Preferred Language]]
         *  - idcsSearchable: true
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
         * User's preferred written or spoken language used for localized user interfaces
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Preferred Language
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Preferred Language]]
         *  - idcsSearchable: true
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
         *  - idcsCsvAttributeName: TimeZone
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Time Zone, deprecatedColumnHeaderName:TimeZone]]
         *  - idcsSearchable: true
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
         *  - idcsCsvAttributeName: TimeZone
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Time Zone, deprecatedColumnHeaderName:TimeZone]]
         *  - idcsSearchable: true
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
         * User status
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Active
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Active]]
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * User status
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsCsvAttributeName: Active
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Active]]
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param active the value to set
         * @return this builder
         **/
        public Builder active(Boolean active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * Password attribute. Max length for password is controlled via Password Policy.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCsvAttributeName: Password
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Password]]
         *  - idcsPii: true
         *  - idcsSearchable: false
         *  - idcsSensitive: hash
         *  - multiValued: false
         *  - mutability: writeOnly
         *  - required: false
         *  - returned: never
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * Password attribute. Max length for password is controlled via Password Policy.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCsvAttributeName: Password
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Password]]
         *  - idcsPii: true
         *  - idcsSearchable: false
         *  - idcsSensitive: hash
         *  - multiValued: false
         *  - mutability: writeOnly
         *  - required: false
         *  - returned: never
         *  - type: string
         *  - uniqueness: none
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private UserName name;

        public Builder name(UserName name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A complex attribute representing emails
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Email, mapsTo:emails[work].value], [columnHeaderName:Home Email, mapsTo:emails[home].value], [columnHeaderName:Primary Email Type, mapsTo:emails[$(type)].primary], [columnHeaderName:Other Email, mapsTo:emails[other].value], [columnHeaderName:Recovery Email, mapsTo:emails[recovery].value], [columnHeaderName:Work Email Verified, mapsTo:emails[work].verified], [columnHeaderName:Home Email Verified, mapsTo:emails[home].verified], [columnHeaderName:Other Email Verified, mapsTo:emails[other].verified], [columnHeaderName:Recovery Email Verified, mapsTo:emails[recovery].verified]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emails")
        private java.util.List<UserEmails> emails;

        /**
         * A complex attribute representing emails
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Email, mapsTo:emails[work].value], [columnHeaderName:Home Email, mapsTo:emails[home].value], [columnHeaderName:Primary Email Type, mapsTo:emails[$(type)].primary], [columnHeaderName:Other Email, mapsTo:emails[other].value], [columnHeaderName:Recovery Email, mapsTo:emails[recovery].value], [columnHeaderName:Work Email Verified, mapsTo:emails[work].verified], [columnHeaderName:Home Email Verified, mapsTo:emails[home].verified], [columnHeaderName:Other Email Verified, mapsTo:emails[other].verified], [columnHeaderName:Recovery Email Verified, mapsTo:emails[recovery].verified]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param emails the value to set
         * @return this builder
         **/
        public Builder emails(java.util.List<UserEmails> emails) {
            this.emails = emails;
            this.__explicitlySet__.add("emails");
            return this;
        }
        /**
         * Phone numbers
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Phone, mapsTo:phoneNumbers[work].value], [columnHeaderName:Mobile No, mapsTo:phoneNumbers[mobile].value], [columnHeaderName:Home Phone, mapsTo:phoneNumbers[home].value], [columnHeaderName:Fax, mapsTo:phoneNumbers[fax].value], [columnHeaderName:Pager, mapsTo:phoneNumbers[pager].value], [columnHeaderName:Other Phone, mapsTo:phoneNumbers[other].value], [columnHeaderName:Recovery Phone, mapsTo:phoneNumbers[recovery].value], [columnHeaderName:Primary Phone Type, mapsTo:phoneNumbers[$(type)].primary]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumbers")
        private java.util.List<UserPhoneNumbers> phoneNumbers;

        /**
         * Phone numbers
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Phone, mapsTo:phoneNumbers[work].value], [columnHeaderName:Mobile No, mapsTo:phoneNumbers[mobile].value], [columnHeaderName:Home Phone, mapsTo:phoneNumbers[home].value], [columnHeaderName:Fax, mapsTo:phoneNumbers[fax].value], [columnHeaderName:Pager, mapsTo:phoneNumbers[pager].value], [columnHeaderName:Other Phone, mapsTo:phoneNumbers[other].value], [columnHeaderName:Recovery Phone, mapsTo:phoneNumbers[recovery].value], [columnHeaderName:Primary Phone Type, mapsTo:phoneNumbers[$(type)].primary]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param phoneNumbers the value to set
         * @return this builder
         **/
        public Builder phoneNumbers(java.util.List<UserPhoneNumbers> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            this.__explicitlySet__.add("phoneNumbers");
            return this;
        }
        /**
         * User's instant messaging addresses
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ims")
        private java.util.List<UserIms> ims;

        /**
         * User's instant messaging addresses
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param ims the value to set
         * @return this builder
         **/
        public Builder ims(java.util.List<UserIms> ims) {
            this.ims = ims;
            this.__explicitlySet__.add("ims");
            return this;
        }
        /**
         * URLs of photos for the User
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("photos")
        private java.util.List<UserPhotos> photos;

        /**
         * URLs of photos for the User
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param photos the value to set
         * @return this builder
         **/
        public Builder photos(java.util.List<UserPhotos> photos) {
            this.photos = photos;
            this.__explicitlySet__.add("photos");
            return this;
        }
        /**
         * A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Address Street, deprecatedColumnHeaderName:Work Street Address, mapsTo:addresses[work].streetAddress], [columnHeaderName:Work Address Locality, deprecatedColumnHeaderName:Work City, mapsTo:addresses[work].locality], [columnHeaderName:Work Address Region, deprecatedColumnHeaderName:Work State, mapsTo:addresses[work].region], [columnHeaderName:Work Address Postal Code, deprecatedColumnHeaderName:Work Postal Code, mapsTo:addresses[work].postalCode], [columnHeaderName:Work Address Country, deprecatedColumnHeaderName:Work Country, mapsTo:addresses[work].country], [columnHeaderName:Work Address Formatted, mapsTo:addresses[work].formatted], [columnHeaderName:Home Address Formatted, mapsTo:addresses[home].formatted], [columnHeaderName:Other Address Formatted, mapsTo:addresses[other].formatted], [columnHeaderName:Home Address Street, mapsTo:addresses[home].streetAddress], [columnHeaderName:Other Address Street, mapsTo:addresses[other].streetAddress], [columnHeaderName:Home Address Locality, mapsTo:addresses[home].locality], [columnHeaderName:Other Address Locality, mapsTo:addresses[other].locality], [columnHeaderName:Home Address Region, mapsTo:addresses[home].region], [columnHeaderName:Other Address Region, mapsTo:addresses[other].region], [columnHeaderName:Home Address Country, mapsTo:addresses[home].country], [columnHeaderName:Other Address Country, mapsTo:addresses[other].country], [columnHeaderName:Home Address Postal Code, mapsTo:addresses[home].postalCode], [columnHeaderName:Other Address Postal Code, mapsTo:addresses[other].postalCode], [columnHeaderName:Primary Address Type, mapsTo:addresses[$(type)].primary]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addresses")
        private java.util.List<Addresses> addresses;

        /**
         * A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Address Street, deprecatedColumnHeaderName:Work Street Address, mapsTo:addresses[work].streetAddress], [columnHeaderName:Work Address Locality, deprecatedColumnHeaderName:Work City, mapsTo:addresses[work].locality], [columnHeaderName:Work Address Region, deprecatedColumnHeaderName:Work State, mapsTo:addresses[work].region], [columnHeaderName:Work Address Postal Code, deprecatedColumnHeaderName:Work Postal Code, mapsTo:addresses[work].postalCode], [columnHeaderName:Work Address Country, deprecatedColumnHeaderName:Work Country, mapsTo:addresses[work].country], [columnHeaderName:Work Address Formatted, mapsTo:addresses[work].formatted], [columnHeaderName:Home Address Formatted, mapsTo:addresses[home].formatted], [columnHeaderName:Other Address Formatted, mapsTo:addresses[other].formatted], [columnHeaderName:Home Address Street, mapsTo:addresses[home].streetAddress], [columnHeaderName:Other Address Street, mapsTo:addresses[other].streetAddress], [columnHeaderName:Home Address Locality, mapsTo:addresses[home].locality], [columnHeaderName:Other Address Locality, mapsTo:addresses[other].locality], [columnHeaderName:Home Address Region, mapsTo:addresses[home].region], [columnHeaderName:Other Address Region, mapsTo:addresses[other].region], [columnHeaderName:Home Address Country, mapsTo:addresses[home].country], [columnHeaderName:Other Address Country, mapsTo:addresses[other].country], [columnHeaderName:Home Address Postal Code, mapsTo:addresses[home].postalCode], [columnHeaderName:Other Address Postal Code, mapsTo:addresses[other].postalCode], [columnHeaderName:Primary Address Type, mapsTo:addresses[$(type)].primary]]
         *  - idcsPii: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param addresses the value to set
         * @return this builder
         **/
        public Builder addresses(java.util.List<Addresses> addresses) {
            this.addresses = addresses;
            this.__explicitlySet__.add("addresses");
            return this;
        }
        /**
         * A list of groups that the user belongs to, either thorough direct membership, nested groups, or dynamically calculated
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<UserGroups> groups;

        /**
         * A list of groups that the user belongs to, either thorough direct membership, nested groups, or dynamically calculated
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         * @param groups the value to set
         * @return this builder
         **/
        public Builder groups(java.util.List<UserGroups> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }
        /**
         * A list of entitlements for the User that represent a thing the User has.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entitlements")
        private java.util.List<UserEntitlements> entitlements;

        /**
         * A list of entitlements for the User that represent a thing the User has.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param entitlements the value to set
         * @return this builder
         **/
        public Builder entitlements(java.util.List<UserEntitlements> entitlements) {
            this.entitlements = entitlements;
            this.__explicitlySet__.add("entitlements");
            return this;
        }
        /**
         * A list of roles for the User that collectively represent who the User is; e.g., 'Student', 'Faculty'.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("roles")
        private java.util.List<UserRoles> roles;

        /**
         * A list of roles for the User that collectively represent who the User is; e.g., 'Student', 'Faculty'.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value, type]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param roles the value to set
         * @return this builder
         **/
        public Builder roles(java.util.List<UserRoles> roles) {
            this.roles = roles;
            this.__explicitlySet__.add("roles");
            return this;
        }
        /**
         * A list of certificates issued to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("x509Certificates")
        private java.util.List<UserX509Certificates> x509Certificates;

        /**
         * A list of certificates issued to the User.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param x509Certificates the value to set
         * @return this builder
         **/
        public Builder x509Certificates(java.util.List<UserX509Certificates> x509Certificates) {
            this.x509Certificates = x509Certificates;
            this.__explicitlySet__.add("x509Certificates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
        private ExtensionEnterprise20User urnIetfParamsScimSchemasExtensionEnterprise2_0User;

        public Builder urnIetfParamsScimSchemasExtensionEnterprise2_0User(
                ExtensionEnterprise20User urnIetfParamsScimSchemasExtensionEnterprise2_0User) {
            this.urnIetfParamsScimSchemasExtensionEnterprise2_0User =
                    urnIetfParamsScimSchemasExtensionEnterprise2_0User;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasExtensionEnterprise2_0User");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:user:User")
        private ExtensionUserUser urnIetfParamsScimSchemasOracleIdcsExtensionUserUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionUserUser(
                ExtensionUserUser urnIetfParamsScimSchemasOracleIdcsExtensionUserUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionUserUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionUserUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:passwordState:User")
        private ExtensionPasswordStateUser
                urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser(
                ExtensionPasswordStateUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:userState:User")
        private ExtensionUserStateUser urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser(
                ExtensionUserStateUser urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:posix:User")
        private ExtensionPosixUser urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser(
                ExtensionPosixUser urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:kerberosUser:User")
        private ExtensionKerberosUserUser
                urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser(
                ExtensionKerberosUserUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:mfa:User")
        private ExtensionMfaUser urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser(
                ExtensionMfaUser urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:adaptive:User")
        private ExtensionAdaptiveUser urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser(
                ExtensionAdaptiveUser urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:sff:User")
        private ExtensionSffUser urnIetfParamsScimSchemasOracleIdcsExtensionSffUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSffUser(
                ExtensionSffUser urnIetfParamsScimSchemasOracleIdcsExtensionSffUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSffUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionSffUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:securityQuestions:User")
        private ExtensionSecurityQuestionsUser
                urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser(
                ExtensionSecurityQuestionsUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:selfRegistration:User")
        private ExtensionSelfRegistrationUser
                urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser(
                ExtensionSelfRegistrationUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:socialAccount:User")
        private ExtensionSocialAccountUser
                urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser(
                ExtensionSocialAccountUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbUser:User")
        private ExtensionDbUserUser urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser(
                ExtensionDbUserUser urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:termsOfUse:User")
        private ExtensionTermsOfUseUser urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser(
                ExtensionTermsOfUseUser urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:passwordless:User")
        private ExtensionPasswordlessUser
                urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser(
                ExtensionPasswordlessUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:OCITags")
        private ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags =
                    urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionOciTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:userCredentials:User")
        private ExtensionUserCredentialsUser
                urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser(
                ExtensionUserCredentialsUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:capabilities:User")
        private ExtensionCapabilitiesUser
                urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser(
                ExtensionCapabilitiesUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbCredentials:User")
        private ExtensionDbCredentialsUser
                urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser(
                ExtensionDbCredentialsUser
                        urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:selfChange:User")
        private ExtensionSelfChangeUser urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser(
                ExtensionSelfChangeUser urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User model =
                    new User(
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
                            this.userName,
                            this.description,
                            this.displayName,
                            this.nickName,
                            this.profileUrl,
                            this.title,
                            this.userType,
                            this.locale,
                            this.preferredLanguage,
                            this.timezone,
                            this.active,
                            this.password,
                            this.name,
                            this.emails,
                            this.phoneNumbers,
                            this.ims,
                            this.photos,
                            this.addresses,
                            this.groups,
                            this.entitlements,
                            this.roles,
                            this.x509Certificates,
                            this.urnIetfParamsScimSchemasExtensionEnterprise2_0User,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User model) {
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
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nickName")) {
                this.nickName(model.getNickName());
            }
            if (model.wasPropertyExplicitlySet("profileUrl")) {
                this.profileUrl(model.getProfileUrl());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("userType")) {
                this.userType(model.getUserType());
            }
            if (model.wasPropertyExplicitlySet("locale")) {
                this.locale(model.getLocale());
            }
            if (model.wasPropertyExplicitlySet("preferredLanguage")) {
                this.preferredLanguage(model.getPreferredLanguage());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("emails")) {
                this.emails(model.getEmails());
            }
            if (model.wasPropertyExplicitlySet("phoneNumbers")) {
                this.phoneNumbers(model.getPhoneNumbers());
            }
            if (model.wasPropertyExplicitlySet("ims")) {
                this.ims(model.getIms());
            }
            if (model.wasPropertyExplicitlySet("photos")) {
                this.photos(model.getPhotos());
            }
            if (model.wasPropertyExplicitlySet("addresses")) {
                this.addresses(model.getAddresses());
            }
            if (model.wasPropertyExplicitlySet("groups")) {
                this.groups(model.getGroups());
            }
            if (model.wasPropertyExplicitlySet("entitlements")) {
                this.entitlements(model.getEntitlements());
            }
            if (model.wasPropertyExplicitlySet("roles")) {
                this.roles(model.getRoles());
            }
            if (model.wasPropertyExplicitlySet("x509Certificates")) {
                this.x509Certificates(model.getX509Certificates());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasExtensionEnterprise2_0User")) {
                this.urnIetfParamsScimSchemasExtensionEnterprise2_0User(
                        model.getUrnIetfParamsScimSchemasExtensionEnterprise2_0User());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionUserUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionUserUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionPosixUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionMfaUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSffUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionSffUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser(
                        model
                                .getUrnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser());
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
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:External Id]]
     *  - idcsPii: true
     *  - idcsSearchable: true
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
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:External Id]]
     *  - idcsPii: true
     *  - idcsSearchable: true
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
     * User name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: User ID
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Name, deprecatedColumnHeaderName:User ID]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * User name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: User ID
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Name, deprecatedColumnHeaderName:User ID]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * Description of the user
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsPii: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the user
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsPii: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Display name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Display Name
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Display Name]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Display Name
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Display Name]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Nick name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Nick Name
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Nick Name]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nickName")
    private final String nickName;

    /**
     * Nick name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Nick Name
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Nick Name]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getNickName() {
        return nickName;
    }

    /**
     * A fully-qualified URL to a page representing the User's online profile
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Profile URL
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Profile Url]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
    private final String profileUrl;

    /**
     * A fully-qualified URL to a page representing the User's online profile
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Profile URL
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Profile Url]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Title
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Title
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Title]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Title
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Title
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Title]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * Used to identify the organization-to-user relationship
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: User Type
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Type]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum UserType {
        Contractor("Contractor"),
        Employee("Employee"),
        Intern("Intern"),
        Temp("Temp"),
        External("External"),
        Service("Service"),
        Generic("Generic"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserType.class);

        private final String value;
        private static java.util.Map<String, UserType> map;

        static {
            map = new java.util.HashMap<>();
            for (UserType v : UserType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used to identify the organization-to-user relationship
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: User Type
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Type]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userType")
    private final UserType userType;

    /**
     * Used to identify the organization-to-user relationship
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: User Type
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:User Type]]
     *  - idcsPii: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public UserType getUserType() {
        return userType;
    }

    /**
     * Used to indicate the User's default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Locale
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Locale]]
     *  - idcsSearchable: true
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
     * Used to indicate the User's default location for purposes of localizing items such as currency, date and time format, numerical representations, and so on.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Locale
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Locale]]
     *  - idcsSearchable: true
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
     * User's preferred written or spoken language used for localized user interfaces
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Preferred Language
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Preferred Language]]
     *  - idcsSearchable: true
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
     * User's preferred written or spoken language used for localized user interfaces
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Preferred Language
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Preferred Language]]
     *  - idcsSearchable: true
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
     *  - idcsCsvAttributeName: TimeZone
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Time Zone, deprecatedColumnHeaderName:TimeZone]]
     *  - idcsSearchable: true
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
     *  - idcsCsvAttributeName: TimeZone
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Time Zone, deprecatedColumnHeaderName:TimeZone]]
     *  - idcsSearchable: true
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
     * User status
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Active
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Active]]
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * User status
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsCsvAttributeName: Active
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Active]]
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getActive() {
        return active;
    }

    /**
     * Password attribute. Max length for password is controlled via Password Policy.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCsvAttributeName: Password
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Password]]
     *  - idcsPii: true
     *  - idcsSearchable: false
     *  - idcsSensitive: hash
     *  - multiValued: false
     *  - mutability: writeOnly
     *  - required: false
     *  - returned: never
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * Password attribute. Max length for password is controlled via Password Policy.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCsvAttributeName: Password
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Password]]
     *  - idcsPii: true
     *  - idcsSearchable: false
     *  - idcsSensitive: hash
     *  - multiValued: false
     *  - mutability: writeOnly
     *  - required: false
     *  - returned: never
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final UserName name;

    public UserName getName() {
        return name;
    }

    /**
     * A complex attribute representing emails
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Email, mapsTo:emails[work].value], [columnHeaderName:Home Email, mapsTo:emails[home].value], [columnHeaderName:Primary Email Type, mapsTo:emails[$(type)].primary], [columnHeaderName:Other Email, mapsTo:emails[other].value], [columnHeaderName:Recovery Email, mapsTo:emails[recovery].value], [columnHeaderName:Work Email Verified, mapsTo:emails[work].verified], [columnHeaderName:Home Email Verified, mapsTo:emails[home].verified], [columnHeaderName:Other Email Verified, mapsTo:emails[other].verified], [columnHeaderName:Recovery Email Verified, mapsTo:emails[recovery].verified]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emails")
    private final java.util.List<UserEmails> emails;

    /**
     * A complex attribute representing emails
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Email, mapsTo:emails[work].value], [columnHeaderName:Home Email, mapsTo:emails[home].value], [columnHeaderName:Primary Email Type, mapsTo:emails[$(type)].primary], [columnHeaderName:Other Email, mapsTo:emails[other].value], [columnHeaderName:Recovery Email, mapsTo:emails[recovery].value], [columnHeaderName:Work Email Verified, mapsTo:emails[work].verified], [columnHeaderName:Home Email Verified, mapsTo:emails[home].verified], [columnHeaderName:Other Email Verified, mapsTo:emails[other].verified], [columnHeaderName:Recovery Email Verified, mapsTo:emails[recovery].verified]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserEmails> getEmails() {
        return emails;
    }

    /**
     * Phone numbers
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Phone, mapsTo:phoneNumbers[work].value], [columnHeaderName:Mobile No, mapsTo:phoneNumbers[mobile].value], [columnHeaderName:Home Phone, mapsTo:phoneNumbers[home].value], [columnHeaderName:Fax, mapsTo:phoneNumbers[fax].value], [columnHeaderName:Pager, mapsTo:phoneNumbers[pager].value], [columnHeaderName:Other Phone, mapsTo:phoneNumbers[other].value], [columnHeaderName:Recovery Phone, mapsTo:phoneNumbers[recovery].value], [columnHeaderName:Primary Phone Type, mapsTo:phoneNumbers[$(type)].primary]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumbers")
    private final java.util.List<UserPhoneNumbers> phoneNumbers;

    /**
     * Phone numbers
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Phone, mapsTo:phoneNumbers[work].value], [columnHeaderName:Mobile No, mapsTo:phoneNumbers[mobile].value], [columnHeaderName:Home Phone, mapsTo:phoneNumbers[home].value], [columnHeaderName:Fax, mapsTo:phoneNumbers[fax].value], [columnHeaderName:Pager, mapsTo:phoneNumbers[pager].value], [columnHeaderName:Other Phone, mapsTo:phoneNumbers[other].value], [columnHeaderName:Recovery Phone, mapsTo:phoneNumbers[recovery].value], [columnHeaderName:Primary Phone Type, mapsTo:phoneNumbers[$(type)].primary]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserPhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * User's instant messaging addresses
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ims")
    private final java.util.List<UserIms> ims;

    /**
     * User's instant messaging addresses
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserIms> getIms() {
        return ims;
    }

    /**
     * URLs of photos for the User
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("photos")
    private final java.util.List<UserPhotos> photos;

    /**
     * URLs of photos for the User
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserPhotos> getPhotos() {
        return photos;
    }

    /**
     * A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Address Street, deprecatedColumnHeaderName:Work Street Address, mapsTo:addresses[work].streetAddress], [columnHeaderName:Work Address Locality, deprecatedColumnHeaderName:Work City, mapsTo:addresses[work].locality], [columnHeaderName:Work Address Region, deprecatedColumnHeaderName:Work State, mapsTo:addresses[work].region], [columnHeaderName:Work Address Postal Code, deprecatedColumnHeaderName:Work Postal Code, mapsTo:addresses[work].postalCode], [columnHeaderName:Work Address Country, deprecatedColumnHeaderName:Work Country, mapsTo:addresses[work].country], [columnHeaderName:Work Address Formatted, mapsTo:addresses[work].formatted], [columnHeaderName:Home Address Formatted, mapsTo:addresses[home].formatted], [columnHeaderName:Other Address Formatted, mapsTo:addresses[other].formatted], [columnHeaderName:Home Address Street, mapsTo:addresses[home].streetAddress], [columnHeaderName:Other Address Street, mapsTo:addresses[other].streetAddress], [columnHeaderName:Home Address Locality, mapsTo:addresses[home].locality], [columnHeaderName:Other Address Locality, mapsTo:addresses[other].locality], [columnHeaderName:Home Address Region, mapsTo:addresses[home].region], [columnHeaderName:Other Address Region, mapsTo:addresses[other].region], [columnHeaderName:Home Address Country, mapsTo:addresses[home].country], [columnHeaderName:Other Address Country, mapsTo:addresses[other].country], [columnHeaderName:Home Address Postal Code, mapsTo:addresses[home].postalCode], [columnHeaderName:Other Address Postal Code, mapsTo:addresses[other].postalCode], [columnHeaderName:Primary Address Type, mapsTo:addresses[$(type)].primary]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    private final java.util.List<Addresses> addresses;

    /**
     * A physical mailing address for this User, as described in (address Element). Canonical Type Values of work, home, and other. The value attribute is a complex type with the following sub-attributes.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Work Address Street, deprecatedColumnHeaderName:Work Street Address, mapsTo:addresses[work].streetAddress], [columnHeaderName:Work Address Locality, deprecatedColumnHeaderName:Work City, mapsTo:addresses[work].locality], [columnHeaderName:Work Address Region, deprecatedColumnHeaderName:Work State, mapsTo:addresses[work].region], [columnHeaderName:Work Address Postal Code, deprecatedColumnHeaderName:Work Postal Code, mapsTo:addresses[work].postalCode], [columnHeaderName:Work Address Country, deprecatedColumnHeaderName:Work Country, mapsTo:addresses[work].country], [columnHeaderName:Work Address Formatted, mapsTo:addresses[work].formatted], [columnHeaderName:Home Address Formatted, mapsTo:addresses[home].formatted], [columnHeaderName:Other Address Formatted, mapsTo:addresses[other].formatted], [columnHeaderName:Home Address Street, mapsTo:addresses[home].streetAddress], [columnHeaderName:Other Address Street, mapsTo:addresses[other].streetAddress], [columnHeaderName:Home Address Locality, mapsTo:addresses[home].locality], [columnHeaderName:Other Address Locality, mapsTo:addresses[other].locality], [columnHeaderName:Home Address Region, mapsTo:addresses[home].region], [columnHeaderName:Other Address Region, mapsTo:addresses[other].region], [columnHeaderName:Home Address Country, mapsTo:addresses[home].country], [columnHeaderName:Other Address Country, mapsTo:addresses[other].country], [columnHeaderName:Home Address Postal Code, mapsTo:addresses[home].postalCode], [columnHeaderName:Other Address Postal Code, mapsTo:addresses[other].postalCode], [columnHeaderName:Primary Address Type, mapsTo:addresses[$(type)].primary]]
     *  - idcsPii: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<Addresses> getAddresses() {
        return addresses;
    }

    /**
     * A list of groups that the user belongs to, either thorough direct membership, nested groups, or dynamically calculated
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<UserGroups> groups;

    /**
     * A list of groups that the user belongs to, either thorough direct membership, nested groups, or dynamically calculated
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserGroups> getGroups() {
        return groups;
    }

    /**
     * A list of entitlements for the User that represent a thing the User has.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entitlements")
    private final java.util.List<UserEntitlements> entitlements;

    /**
     * A list of entitlements for the User that represent a thing the User has.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserEntitlements> getEntitlements() {
        return entitlements;
    }

    /**
     * A list of roles for the User that collectively represent who the User is; e.g., 'Student', 'Faculty'.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    private final java.util.List<UserRoles> roles;

    /**
     * A list of roles for the User that collectively represent who the User is; e.g., 'Student', 'Faculty'.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value, type]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserRoles> getRoles() {
        return roles;
    }

    /**
     * A list of certificates issued to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("x509Certificates")
    private final java.util.List<UserX509Certificates> x509Certificates;

    /**
     * A list of certificates issued to the User.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserX509Certificates> getX509Certificates() {
        return x509Certificates;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
    private final ExtensionEnterprise20User urnIetfParamsScimSchemasExtensionEnterprise2_0User;

    public ExtensionEnterprise20User getUrnIetfParamsScimSchemasExtensionEnterprise2_0User() {
        return urnIetfParamsScimSchemasExtensionEnterprise2_0User;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:user:User")
    private final ExtensionUserUser urnIetfParamsScimSchemasOracleIdcsExtensionUserUser;

    public ExtensionUserUser getUrnIetfParamsScimSchemasOracleIdcsExtensionUserUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionUserUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:passwordState:User")
    private final ExtensionPasswordStateUser
            urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser;

    public ExtensionPasswordStateUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:userState:User")
    private final ExtensionUserStateUser urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser;

    public ExtensionUserStateUser getUrnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:posix:User")
    private final ExtensionPosixUser urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser;

    public ExtensionPosixUser getUrnIetfParamsScimSchemasOracleIdcsExtensionPosixUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:kerberosUser:User")
    private final ExtensionKerberosUserUser
            urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser;

    public ExtensionKerberosUserUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:mfa:User")
    private final ExtensionMfaUser urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser;

    public ExtensionMfaUser getUrnIetfParamsScimSchemasOracleIdcsExtensionMfaUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:adaptive:User")
    private final ExtensionAdaptiveUser urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser;

    public ExtensionAdaptiveUser getUrnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:sff:User")
    private final ExtensionSffUser urnIetfParamsScimSchemasOracleIdcsExtensionSffUser;

    public ExtensionSffUser getUrnIetfParamsScimSchemasOracleIdcsExtensionSffUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSffUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:securityQuestions:User")
    private final ExtensionSecurityQuestionsUser
            urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser;

    public ExtensionSecurityQuestionsUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:selfRegistration:User")
    private final ExtensionSelfRegistrationUser
            urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser;

    public ExtensionSelfRegistrationUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:socialAccount:User")
    private final ExtensionSocialAccountUser
            urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser;

    public ExtensionSocialAccountUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbUser:User")
    private final ExtensionDbUserUser urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser;

    public ExtensionDbUserUser getUrnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:termsOfUse:User")
    private final ExtensionTermsOfUseUser urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser;

    public ExtensionTermsOfUseUser getUrnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:passwordless:User")
    private final ExtensionPasswordlessUser
            urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser;

    public ExtensionPasswordlessUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:OCITags")
    private final ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;

    public ExtensionOCITags getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:userCredentials:User")
    private final ExtensionUserCredentialsUser
            urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser;

    public ExtensionUserCredentialsUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:capabilities:User")
    private final ExtensionCapabilitiesUser
            urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser;

    public ExtensionCapabilitiesUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbCredentials:User")
    private final ExtensionDbCredentialsUser
            urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser;

    public ExtensionDbCredentialsUser
            getUrnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:selfChange:User")
    private final ExtensionSelfChangeUser urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser;

    public ExtensionSelfChangeUser getUrnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser;
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
        sb.append("User(");
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
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nickName=").append(String.valueOf(this.nickName));
        sb.append(", profileUrl=").append(String.valueOf(this.profileUrl));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", userType=").append(String.valueOf(this.userType));
        sb.append(", locale=").append(String.valueOf(this.locale));
        sb.append(", preferredLanguage=").append(String.valueOf(this.preferredLanguage));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", emails=").append(String.valueOf(this.emails));
        sb.append(", phoneNumbers=").append(String.valueOf(this.phoneNumbers));
        sb.append(", ims=").append(String.valueOf(this.ims));
        sb.append(", photos=").append(String.valueOf(this.photos));
        sb.append(", addresses=").append(String.valueOf(this.addresses));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", entitlements=").append(String.valueOf(this.entitlements));
        sb.append(", roles=").append(String.valueOf(this.roles));
        sb.append(", x509Certificates=").append(String.valueOf(this.x509Certificates));
        sb.append(", urnIetfParamsScimSchemasExtensionEnterprise2_0User=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasExtensionEnterprise2_0User));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionUserUser=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSffUser=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionOciTags=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
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
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nickName, other.nickName)
                && java.util.Objects.equals(this.profileUrl, other.profileUrl)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.userType, other.userType)
                && java.util.Objects.equals(this.locale, other.locale)
                && java.util.Objects.equals(this.preferredLanguage, other.preferredLanguage)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.emails, other.emails)
                && java.util.Objects.equals(this.phoneNumbers, other.phoneNumbers)
                && java.util.Objects.equals(this.ims, other.ims)
                && java.util.Objects.equals(this.photos, other.photos)
                && java.util.Objects.equals(this.addresses, other.addresses)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(this.entitlements, other.entitlements)
                && java.util.Objects.equals(this.roles, other.roles)
                && java.util.Objects.equals(this.x509Certificates, other.x509Certificates)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasExtensionEnterprise2_0User,
                        other.urnIetfParamsScimSchemasExtensionEnterprise2_0User)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser)
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
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.nickName == null ? 43 : this.nickName.hashCode());
        result = (result * PRIME) + (this.profileUrl == null ? 43 : this.profileUrl.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.userType == null ? 43 : this.userType.hashCode());
        result = (result * PRIME) + (this.locale == null ? 43 : this.locale.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredLanguage == null ? 43 : this.preferredLanguage.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.emails == null ? 43 : this.emails.hashCode());
        result = (result * PRIME) + (this.phoneNumbers == null ? 43 : this.phoneNumbers.hashCode());
        result = (result * PRIME) + (this.ims == null ? 43 : this.ims.hashCode());
        result = (result * PRIME) + (this.photos == null ? 43 : this.photos.hashCode());
        result = (result * PRIME) + (this.addresses == null ? 43 : this.addresses.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result = (result * PRIME) + (this.entitlements == null ? 43 : this.entitlements.hashCode());
        result = (result * PRIME) + (this.roles == null ? 43 : this.roles.hashCode());
        result =
                (result * PRIME)
                        + (this.x509Certificates == null ? 43 : this.x509Certificates.hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasExtensionEnterprise2_0User == null
                                ? 43
                                : this.urnIetfParamsScimSchemasExtensionEnterprise2_0User
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionUserUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordStateUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionUserStateUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionKerberosUserUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionMfaUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionAdaptiveUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionSffUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSecurityQuestionsUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSelfRegistrationUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialAccountUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionDbUserUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionTermsOfUseUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionPasswordlessUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionUserCredentialsUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionDbCredentialsUser
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
