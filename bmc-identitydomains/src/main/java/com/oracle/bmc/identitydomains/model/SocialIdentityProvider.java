/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Social Identity Provider
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SocialIdentityProvider.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SocialIdentityProvider
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "name",
        "description",
        "enabled",
        "accountLinkingEnabled",
        "socialJitProvisioningEnabled",
        "jitProvGroupStaticListEnabled",
        "jitProvAssignedGroups",
        "registrationEnabled",
        "autoRedirectEnabled",
        "showOnLogin",
        "status",
        "idAttribute",
        "authzUrl",
        "accessTokenUrl",
        "profileUrl",
        "scope",
        "adminScope",
        "consumerKey",
        "consumerSecret",
        "serviceProviderName",
        "clockSkewInSeconds",
        "redirectUrl",
        "iconUrl",
        "discoveryUrl",
        "clientCredentialInPayload",
        "refreshTokenUrl",
        "relayIdpParamMappings"
    })
    public SocialIdentityProvider(
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
            String name,
            String description,
            Boolean enabled,
            Boolean accountLinkingEnabled,
            Boolean socialJitProvisioningEnabled,
            Boolean jitProvGroupStaticListEnabled,
            java.util.List<SocialIdentityProviderJitProvAssignedGroups> jitProvAssignedGroups,
            Boolean registrationEnabled,
            Boolean autoRedirectEnabled,
            Boolean showOnLogin,
            Status status,
            String idAttribute,
            String authzUrl,
            String accessTokenUrl,
            String profileUrl,
            java.util.List<String> scope,
            java.util.List<String> adminScope,
            String consumerKey,
            String consumerSecret,
            String serviceProviderName,
            Integer clockSkewInSeconds,
            String redirectUrl,
            String iconUrl,
            String discoveryUrl,
            Boolean clientCredentialInPayload,
            String refreshTokenUrl,
            java.util.List<SocialIdentityProviderRelayIdpParamMappings> relayIdpParamMappings) {
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
        this.name = name;
        this.description = description;
        this.enabled = enabled;
        this.accountLinkingEnabled = accountLinkingEnabled;
        this.socialJitProvisioningEnabled = socialJitProvisioningEnabled;
        this.jitProvGroupStaticListEnabled = jitProvGroupStaticListEnabled;
        this.jitProvAssignedGroups = jitProvAssignedGroups;
        this.registrationEnabled = registrationEnabled;
        this.autoRedirectEnabled = autoRedirectEnabled;
        this.showOnLogin = showOnLogin;
        this.status = status;
        this.idAttribute = idAttribute;
        this.authzUrl = authzUrl;
        this.accessTokenUrl = accessTokenUrl;
        this.profileUrl = profileUrl;
        this.scope = scope;
        this.adminScope = adminScope;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.serviceProviderName = serviceProviderName;
        this.clockSkewInSeconds = clockSkewInSeconds;
        this.redirectUrl = redirectUrl;
        this.iconUrl = iconUrl;
        this.discoveryUrl = discoveryUrl;
        this.clientCredentialInPayload = clientCredentialInPayload;
        this.refreshTokenUrl = refreshTokenUrl;
        this.relayIdpParamMappings = relayIdpParamMappings;
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
         * Social provider name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Social provider name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: global
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Social IDP description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
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
         * Social IDP description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
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
         * Whether the IDP is enabled or not
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Boolean enabled;

        /**
         * Whether the IDP is enabled or not
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param enabled the value to set
         * @return this builder
         **/
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }
        /**
         * Whether account linking is enabled
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountLinkingEnabled")
        private Boolean accountLinkingEnabled;

        /**
         * Whether account linking is enabled
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param accountLinkingEnabled the value to set
         * @return this builder
         **/
        public Builder accountLinkingEnabled(Boolean accountLinkingEnabled) {
            this.accountLinkingEnabled = accountLinkingEnabled;
            this.__explicitlySet__.add("accountLinkingEnabled");
            return this;
        }
        /**
         * Whether Social JIT Provisioning is enabled
         * <p>
         **Added In:** 2307282043
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("socialJitProvisioningEnabled")
        private Boolean socialJitProvisioningEnabled;

        /**
         * Whether Social JIT Provisioning is enabled
         * <p>
         **Added In:** 2307282043
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param socialJitProvisioningEnabled the value to set
         * @return this builder
         **/
        public Builder socialJitProvisioningEnabled(Boolean socialJitProvisioningEnabled) {
            this.socialJitProvisioningEnabled = socialJitProvisioningEnabled;
            this.__explicitlySet__.add("socialJitProvisioningEnabled");
            return this;
        }
        /**
         * Set to true to indicate Social JIT User Provisioning Groups should be assigned from a static list
         * <p>
         **Added In:** 2309290043
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jitProvGroupStaticListEnabled")
        private Boolean jitProvGroupStaticListEnabled;

        /**
         * Set to true to indicate Social JIT User Provisioning Groups should be assigned from a static list
         * <p>
         **Added In:** 2309290043
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param jitProvGroupStaticListEnabled the value to set
         * @return this builder
         **/
        public Builder jitProvGroupStaticListEnabled(Boolean jitProvGroupStaticListEnabled) {
            this.jitProvGroupStaticListEnabled = jitProvGroupStaticListEnabled;
            this.__explicitlySet__.add("jitProvGroupStaticListEnabled");
            return this;
        }
        /**
         * Lists the groups each social JIT-provisioned user is a member. Just-in-Time user-provisioning applies this static list when jitProvGroupStaticListEnabled:true.
         * <p>
         **Added In:** 2309290043
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jitProvAssignedGroups")
        private java.util.List<SocialIdentityProviderJitProvAssignedGroups> jitProvAssignedGroups;

        /**
         * Lists the groups each social JIT-provisioned user is a member. Just-in-Time user-provisioning applies this static list when jitProvGroupStaticListEnabled:true.
         * <p>
         **Added In:** 2309290043
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param jitProvAssignedGroups the value to set
         * @return this builder
         **/
        public Builder jitProvAssignedGroups(
                java.util.List<SocialIdentityProviderJitProvAssignedGroups> jitProvAssignedGroups) {
            this.jitProvAssignedGroups = jitProvAssignedGroups;
            this.__explicitlySet__.add("jitProvAssignedGroups");
            return this;
        }
        /**
         * Whether registration is enabled
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("registrationEnabled")
        private Boolean registrationEnabled;

        /**
         * Whether registration is enabled
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param registrationEnabled the value to set
         * @return this builder
         **/
        public Builder registrationEnabled(Boolean registrationEnabled) {
            this.registrationEnabled = registrationEnabled;
            this.__explicitlySet__.add("registrationEnabled");
            return this;
        }
        /**
         * Whether social auto redirect is enabled. The IDP policy should be configured with only one Social IDP, and without username/password selected.
         * <p>
         **Added In:** 2310202314
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoRedirectEnabled")
        private Boolean autoRedirectEnabled;

        /**
         * Whether social auto redirect is enabled. The IDP policy should be configured with only one Social IDP, and without username/password selected.
         * <p>
         **Added In:** 2310202314
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param autoRedirectEnabled the value to set
         * @return this builder
         **/
        public Builder autoRedirectEnabled(Boolean autoRedirectEnabled) {
            this.autoRedirectEnabled = autoRedirectEnabled;
            this.__explicitlySet__.add("autoRedirectEnabled");
            return this;
        }
        /**
         * Whether show on login
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("showOnLogin")
        private Boolean showOnLogin;

        /**
         * Whether show on login
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param showOnLogin the value to set
         * @return this builder
         **/
        public Builder showOnLogin(Boolean showOnLogin) {
            this.showOnLogin = showOnLogin;
            this.__explicitlySet__.add("showOnLogin");
            return this;
        }
        /**
         * Status
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Id attribute used for account linking
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idAttribute")
        private String idAttribute;

        /**
         * Id attribute used for account linking
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idAttribute the value to set
         * @return this builder
         **/
        public Builder idAttribute(String idAttribute) {
            this.idAttribute = idAttribute;
            this.__explicitlySet__.add("idAttribute");
            return this;
        }
        /**
         * Social IDP Authorization URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authzUrl")
        private String authzUrl;

        /**
         * Social IDP Authorization URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param authzUrl the value to set
         * @return this builder
         **/
        public Builder authzUrl(String authzUrl) {
            this.authzUrl = authzUrl;
            this.__explicitlySet__.add("authzUrl");
            return this;
        }
        /**
         * Social IDP Access token URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
        private String accessTokenUrl;

        /**
         * Social IDP Access token URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param accessTokenUrl the value to set
         * @return this builder
         **/
        public Builder accessTokenUrl(String accessTokenUrl) {
            this.accessTokenUrl = accessTokenUrl;
            this.__explicitlySet__.add("accessTokenUrl");
            return this;
        }
        /**
         * Social IDP User profile URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
        private String profileUrl;

        /**
         * Social IDP User profile URL
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
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
         * Scope to request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private java.util.List<String> scope;

        /**
         * Scope to request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(java.util.List<String> scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Admin scope to request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminScope")
        private java.util.List<String> adminScope;

        /**
         * Admin scope to request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param adminScope the value to set
         * @return this builder
         **/
        public Builder adminScope(java.util.List<String> adminScope) {
            this.adminScope = adminScope;
            this.__explicitlySet__.add("adminScope");
            return this;
        }
        /**
         * Social IDP Client Application Client ID
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumerKey")
        private String consumerKey;

        /**
         * Social IDP Client Application Client ID
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param consumerKey the value to set
         * @return this builder
         **/
        public Builder consumerKey(String consumerKey) {
            this.consumerKey = consumerKey;
            this.__explicitlySet__.add("consumerKey");
            return this;
        }
        /**
         * Social IDP Client Application Client Secret
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsSensitive: encrypt
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumerSecret")
        private String consumerSecret;

        /**
         * Social IDP Client Application Client Secret
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - idcsSensitive: encrypt
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param consumerSecret the value to set
         * @return this builder
         **/
        public Builder consumerSecret(String consumerSecret) {
            this.consumerSecret = consumerSecret;
            this.__explicitlySet__.add("consumerSecret");
            return this;
        }
        /**
         * Service Provider Name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderName")
        private String serviceProviderName;

        /**
         * Service Provider Name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param serviceProviderName the value to set
         * @return this builder
         **/
        public Builder serviceProviderName(String serviceProviderName) {
            this.serviceProviderName = serviceProviderName;
            this.__explicitlySet__.add("serviceProviderName");
            return this;
        }
        /**
         * Social IDP allowed clock skew time
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
        @com.fasterxml.jackson.annotation.JsonProperty("clockSkewInSeconds")
        private Integer clockSkewInSeconds;

        /**
         * Social IDP allowed clock skew time
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param clockSkewInSeconds the value to set
         * @return this builder
         **/
        public Builder clockSkewInSeconds(Integer clockSkewInSeconds) {
            this.clockSkewInSeconds = clockSkewInSeconds;
            this.__explicitlySet__.add("clockSkewInSeconds");
            return this;
        }
        /**
         * redirect URL for social idp
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
        private String redirectUrl;

        /**
         * redirect URL for social idp
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param redirectUrl the value to set
         * @return this builder
         **/
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            this.__explicitlySet__.add("redirectUrl");
            return this;
        }
        /**
         * ICON URL for social idp
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("iconUrl")
        private String iconUrl;

        /**
         * ICON URL for social idp
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param iconUrl the value to set
         * @return this builder
         **/
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            this.__explicitlySet__.add("iconUrl");
            return this;
        }
        /**
         * Discovery URL
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryUrl")
        private String discoveryUrl;

        /**
         * Discovery URL
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param discoveryUrl the value to set
         * @return this builder
         **/
        public Builder discoveryUrl(String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            this.__explicitlySet__.add("discoveryUrl");
            return this;
        }
        /**
         * Whether the client credential is contained in payload
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientCredentialInPayload")
        private Boolean clientCredentialInPayload;

        /**
         * Whether the client credential is contained in payload
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param clientCredentialInPayload the value to set
         * @return this builder
         **/
        public Builder clientCredentialInPayload(Boolean clientCredentialInPayload) {
            this.clientCredentialInPayload = clientCredentialInPayload;
            this.__explicitlySet__.add("clientCredentialInPayload");
            return this;
        }
        /**
         * Social IDP Refresh token URL
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenUrl")
        private String refreshTokenUrl;

        /**
         * Social IDP Refresh token URL
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param refreshTokenUrl the value to set
         * @return this builder
         **/
        public Builder refreshTokenUrl(String refreshTokenUrl) {
            this.refreshTokenUrl = refreshTokenUrl;
            this.__explicitlySet__.add("refreshTokenUrl");
            return this;
        }
        /**
         * Relay Param variable for Social IDP
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [relayParamKey]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relayIdpParamMappings")
        private java.util.List<SocialIdentityProviderRelayIdpParamMappings> relayIdpParamMappings;

        /**
         * Relay Param variable for Social IDP
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [relayParamKey]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param relayIdpParamMappings the value to set
         * @return this builder
         **/
        public Builder relayIdpParamMappings(
                java.util.List<SocialIdentityProviderRelayIdpParamMappings> relayIdpParamMappings) {
            this.relayIdpParamMappings = relayIdpParamMappings;
            this.__explicitlySet__.add("relayIdpParamMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SocialIdentityProvider build() {
            SocialIdentityProvider model =
                    new SocialIdentityProvider(
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
                            this.name,
                            this.description,
                            this.enabled,
                            this.accountLinkingEnabled,
                            this.socialJitProvisioningEnabled,
                            this.jitProvGroupStaticListEnabled,
                            this.jitProvAssignedGroups,
                            this.registrationEnabled,
                            this.autoRedirectEnabled,
                            this.showOnLogin,
                            this.status,
                            this.idAttribute,
                            this.authzUrl,
                            this.accessTokenUrl,
                            this.profileUrl,
                            this.scope,
                            this.adminScope,
                            this.consumerKey,
                            this.consumerSecret,
                            this.serviceProviderName,
                            this.clockSkewInSeconds,
                            this.redirectUrl,
                            this.iconUrl,
                            this.discoveryUrl,
                            this.clientCredentialInPayload,
                            this.refreshTokenUrl,
                            this.relayIdpParamMappings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SocialIdentityProvider model) {
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("enabled")) {
                this.enabled(model.getEnabled());
            }
            if (model.wasPropertyExplicitlySet("accountLinkingEnabled")) {
                this.accountLinkingEnabled(model.getAccountLinkingEnabled());
            }
            if (model.wasPropertyExplicitlySet("socialJitProvisioningEnabled")) {
                this.socialJitProvisioningEnabled(model.getSocialJitProvisioningEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitProvGroupStaticListEnabled")) {
                this.jitProvGroupStaticListEnabled(model.getJitProvGroupStaticListEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitProvAssignedGroups")) {
                this.jitProvAssignedGroups(model.getJitProvAssignedGroups());
            }
            if (model.wasPropertyExplicitlySet("registrationEnabled")) {
                this.registrationEnabled(model.getRegistrationEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoRedirectEnabled")) {
                this.autoRedirectEnabled(model.getAutoRedirectEnabled());
            }
            if (model.wasPropertyExplicitlySet("showOnLogin")) {
                this.showOnLogin(model.getShowOnLogin());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("idAttribute")) {
                this.idAttribute(model.getIdAttribute());
            }
            if (model.wasPropertyExplicitlySet("authzUrl")) {
                this.authzUrl(model.getAuthzUrl());
            }
            if (model.wasPropertyExplicitlySet("accessTokenUrl")) {
                this.accessTokenUrl(model.getAccessTokenUrl());
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
            if (model.wasPropertyExplicitlySet("iconUrl")) {
                this.iconUrl(model.getIconUrl());
            }
            if (model.wasPropertyExplicitlySet("discoveryUrl")) {
                this.discoveryUrl(model.getDiscoveryUrl());
            }
            if (model.wasPropertyExplicitlySet("clientCredentialInPayload")) {
                this.clientCredentialInPayload(model.getClientCredentialInPayload());
            }
            if (model.wasPropertyExplicitlySet("refreshTokenUrl")) {
                this.refreshTokenUrl(model.getRefreshTokenUrl());
            }
            if (model.wasPropertyExplicitlySet("relayIdpParamMappings")) {
                this.relayIdpParamMappings(model.getRelayIdpParamMappings());
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
     * Social provider name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Social provider name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: global
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Social IDP description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
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
     * Social IDP description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
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
     * Whether the IDP is enabled or not
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final Boolean enabled;

    /**
     * Whether the IDP is enabled or not
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Whether account linking is enabled
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountLinkingEnabled")
    private final Boolean accountLinkingEnabled;

    /**
     * Whether account linking is enabled
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getAccountLinkingEnabled() {
        return accountLinkingEnabled;
    }

    /**
     * Whether Social JIT Provisioning is enabled
     * <p>
     **Added In:** 2307282043
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("socialJitProvisioningEnabled")
    private final Boolean socialJitProvisioningEnabled;

    /**
     * Whether Social JIT Provisioning is enabled
     * <p>
     **Added In:** 2307282043
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getSocialJitProvisioningEnabled() {
        return socialJitProvisioningEnabled;
    }

    /**
     * Set to true to indicate Social JIT User Provisioning Groups should be assigned from a static list
     * <p>
     **Added In:** 2309290043
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jitProvGroupStaticListEnabled")
    private final Boolean jitProvGroupStaticListEnabled;

    /**
     * Set to true to indicate Social JIT User Provisioning Groups should be assigned from a static list
     * <p>
     **Added In:** 2309290043
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getJitProvGroupStaticListEnabled() {
        return jitProvGroupStaticListEnabled;
    }

    /**
     * Lists the groups each social JIT-provisioned user is a member. Just-in-Time user-provisioning applies this static list when jitProvGroupStaticListEnabled:true.
     * <p>
     **Added In:** 2309290043
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jitProvAssignedGroups")
    private final java.util.List<SocialIdentityProviderJitProvAssignedGroups> jitProvAssignedGroups;

    /**
     * Lists the groups each social JIT-provisioned user is a member. Just-in-Time user-provisioning applies this static list when jitProvGroupStaticListEnabled:true.
     * <p>
     **Added In:** 2309290043
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<SocialIdentityProviderJitProvAssignedGroups> getJitProvAssignedGroups() {
        return jitProvAssignedGroups;
    }

    /**
     * Whether registration is enabled
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("registrationEnabled")
    private final Boolean registrationEnabled;

    /**
     * Whether registration is enabled
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getRegistrationEnabled() {
        return registrationEnabled;
    }

    /**
     * Whether social auto redirect is enabled. The IDP policy should be configured with only one Social IDP, and without username/password selected.
     * <p>
     **Added In:** 2310202314
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoRedirectEnabled")
    private final Boolean autoRedirectEnabled;

    /**
     * Whether social auto redirect is enabled. The IDP policy should be configured with only one Social IDP, and without username/password selected.
     * <p>
     **Added In:** 2310202314
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getAutoRedirectEnabled() {
        return autoRedirectEnabled;
    }

    /**
     * Whether show on login
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("showOnLogin")
    private final Boolean showOnLogin;

    /**
     * Whether show on login
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getShowOnLogin() {
        return showOnLogin;
    }

    /**
     * Status
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Status {
        Created("created"),
        Deleted("deleted"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Id attribute used for account linking
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idAttribute")
    private final String idAttribute;

    /**
     * Id attribute used for account linking
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdAttribute() {
        return idAttribute;
    }

    /**
     * Social IDP Authorization URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authzUrl")
    private final String authzUrl;

    /**
     * Social IDP Authorization URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAuthzUrl() {
        return authzUrl;
    }

    /**
     * Social IDP Access token URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenUrl")
    private final String accessTokenUrl;

    /**
     * Social IDP Access token URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    /**
     * Social IDP User profile URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profileUrl")
    private final String profileUrl;

    /**
     * Social IDP User profile URL
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getProfileUrl() {
        return profileUrl;
    }

    /**
     * Scope to request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final java.util.List<String> scope;

    /**
     * Scope to request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * Admin scope to request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminScope")
    private final java.util.List<String> adminScope;

    /**
     * Admin scope to request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getAdminScope() {
        return adminScope;
    }

    /**
     * Social IDP Client Application Client ID
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerKey")
    private final String consumerKey;

    /**
     * Social IDP Client Application Client ID
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Social IDP Client Application Client Secret
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsSensitive: encrypt
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerSecret")
    private final String consumerSecret;

    /**
     * Social IDP Client Application Client Secret
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - idcsSensitive: encrypt
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Service Provider Name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderName")
    private final String serviceProviderName;

    /**
     * Service Provider Name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * Social IDP allowed clock skew time
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
    @com.fasterxml.jackson.annotation.JsonProperty("clockSkewInSeconds")
    private final Integer clockSkewInSeconds;

    /**
     * Social IDP allowed clock skew time
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
    public Integer getClockSkewInSeconds() {
        return clockSkewInSeconds;
    }

    /**
     * redirect URL for social idp
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUrl")
    private final String redirectUrl;

    /**
     * redirect URL for social idp
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * ICON URL for social idp
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iconUrl")
    private final String iconUrl;

    /**
     * ICON URL for social idp
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Discovery URL
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryUrl")
    private final String discoveryUrl;

    /**
     * Discovery URL
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    /**
     * Whether the client credential is contained in payload
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientCredentialInPayload")
    private final Boolean clientCredentialInPayload;

    /**
     * Whether the client credential is contained in payload
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getClientCredentialInPayload() {
        return clientCredentialInPayload;
    }

    /**
     * Social IDP Refresh token URL
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenUrl")
    private final String refreshTokenUrl;

    /**
     * Social IDP Refresh token URL
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getRefreshTokenUrl() {
        return refreshTokenUrl;
    }

    /**
     * Relay Param variable for Social IDP
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [relayParamKey]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relayIdpParamMappings")
    private final java.util.List<SocialIdentityProviderRelayIdpParamMappings> relayIdpParamMappings;

    /**
     * Relay Param variable for Social IDP
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [relayParamKey]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<SocialIdentityProviderRelayIdpParamMappings> getRelayIdpParamMappings() {
        return relayIdpParamMappings;
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
        sb.append("SocialIdentityProvider(");
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
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(", accountLinkingEnabled=").append(String.valueOf(this.accountLinkingEnabled));
        sb.append(", socialJitProvisioningEnabled=")
                .append(String.valueOf(this.socialJitProvisioningEnabled));
        sb.append(", jitProvGroupStaticListEnabled=")
                .append(String.valueOf(this.jitProvGroupStaticListEnabled));
        sb.append(", jitProvAssignedGroups=").append(String.valueOf(this.jitProvAssignedGroups));
        sb.append(", registrationEnabled=").append(String.valueOf(this.registrationEnabled));
        sb.append(", autoRedirectEnabled=").append(String.valueOf(this.autoRedirectEnabled));
        sb.append(", showOnLogin=").append(String.valueOf(this.showOnLogin));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", idAttribute=").append(String.valueOf(this.idAttribute));
        sb.append(", authzUrl=").append(String.valueOf(this.authzUrl));
        sb.append(", accessTokenUrl=").append(String.valueOf(this.accessTokenUrl));
        sb.append(", profileUrl=").append(String.valueOf(this.profileUrl));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", adminScope=").append(String.valueOf(this.adminScope));
        sb.append(", consumerKey=").append(String.valueOf(this.consumerKey));
        sb.append(", consumerSecret=").append(String.valueOf(this.consumerSecret));
        sb.append(", serviceProviderName=").append(String.valueOf(this.serviceProviderName));
        sb.append(", clockSkewInSeconds=").append(String.valueOf(this.clockSkewInSeconds));
        sb.append(", redirectUrl=").append(String.valueOf(this.redirectUrl));
        sb.append(", iconUrl=").append(String.valueOf(this.iconUrl));
        sb.append(", discoveryUrl=").append(String.valueOf(this.discoveryUrl));
        sb.append(", clientCredentialInPayload=")
                .append(String.valueOf(this.clientCredentialInPayload));
        sb.append(", refreshTokenUrl=").append(String.valueOf(this.refreshTokenUrl));
        sb.append(", relayIdpParamMappings=").append(String.valueOf(this.relayIdpParamMappings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SocialIdentityProvider)) {
            return false;
        }

        SocialIdentityProvider other = (SocialIdentityProvider) o;
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
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && java.util.Objects.equals(this.accountLinkingEnabled, other.accountLinkingEnabled)
                && java.util.Objects.equals(
                        this.socialJitProvisioningEnabled, other.socialJitProvisioningEnabled)
                && java.util.Objects.equals(
                        this.jitProvGroupStaticListEnabled, other.jitProvGroupStaticListEnabled)
                && java.util.Objects.equals(this.jitProvAssignedGroups, other.jitProvAssignedGroups)
                && java.util.Objects.equals(this.registrationEnabled, other.registrationEnabled)
                && java.util.Objects.equals(this.autoRedirectEnabled, other.autoRedirectEnabled)
                && java.util.Objects.equals(this.showOnLogin, other.showOnLogin)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.idAttribute, other.idAttribute)
                && java.util.Objects.equals(this.authzUrl, other.authzUrl)
                && java.util.Objects.equals(this.accessTokenUrl, other.accessTokenUrl)
                && java.util.Objects.equals(this.profileUrl, other.profileUrl)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.adminScope, other.adminScope)
                && java.util.Objects.equals(this.consumerKey, other.consumerKey)
                && java.util.Objects.equals(this.consumerSecret, other.consumerSecret)
                && java.util.Objects.equals(this.serviceProviderName, other.serviceProviderName)
                && java.util.Objects.equals(this.clockSkewInSeconds, other.clockSkewInSeconds)
                && java.util.Objects.equals(this.redirectUrl, other.redirectUrl)
                && java.util.Objects.equals(this.iconUrl, other.iconUrl)
                && java.util.Objects.equals(this.discoveryUrl, other.discoveryUrl)
                && java.util.Objects.equals(
                        this.clientCredentialInPayload, other.clientCredentialInPayload)
                && java.util.Objects.equals(this.refreshTokenUrl, other.refreshTokenUrl)
                && java.util.Objects.equals(this.relayIdpParamMappings, other.relayIdpParamMappings)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result =
                (result * PRIME)
                        + (this.accountLinkingEnabled == null
                                ? 43
                                : this.accountLinkingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.socialJitProvisioningEnabled == null
                                ? 43
                                : this.socialJitProvisioningEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitProvGroupStaticListEnabled == null
                                ? 43
                                : this.jitProvGroupStaticListEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitProvAssignedGroups == null
                                ? 43
                                : this.jitProvAssignedGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.registrationEnabled == null
                                ? 43
                                : this.registrationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoRedirectEnabled == null
                                ? 43
                                : this.autoRedirectEnabled.hashCode());
        result = (result * PRIME) + (this.showOnLogin == null ? 43 : this.showOnLogin.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.idAttribute == null ? 43 : this.idAttribute.hashCode());
        result = (result * PRIME) + (this.authzUrl == null ? 43 : this.authzUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTokenUrl == null ? 43 : this.accessTokenUrl.hashCode());
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
        result = (result * PRIME) + (this.iconUrl == null ? 43 : this.iconUrl.hashCode());
        result = (result * PRIME) + (this.discoveryUrl == null ? 43 : this.discoveryUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCredentialInPayload == null
                                ? 43
                                : this.clientCredentialInPayload.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshTokenUrl == null ? 43 : this.refreshTokenUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.relayIdpParamMappings == null
                                ? 43
                                : this.relayIdpParamMappings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
