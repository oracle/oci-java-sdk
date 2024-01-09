/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Federation trusted partner Identity Provider <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdentityProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityProvider
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
        "partnerName",
        "description",
        "metadata",
        "partnerProviderId",
        "tenantProviderId",
        "succinctId",
        "idpSsoUrl",
        "logoutRequestUrl",
        "logoutResponseUrl",
        "signingCertificate",
        "encryptionCertificate",
        "nameIdFormat",
        "includeSigningCertInSignature",
        "authnRequestBinding",
        "logoutBinding",
        "logoutEnabled",
        "signatureHashAlgorithm",
        "enabled",
        "iconUrl",
        "shownOnLoginPage",
        "jitUserProvEnabled",
        "jitUserProvGroupAssertionAttributeEnabled",
        "jitUserProvGroupStaticListEnabled",
        "jitUserProvCreateUserEnabled",
        "jitUserProvAttributeUpdateEnabled",
        "jitUserProvGroupAssignmentMethod",
        "jitUserProvGroupMappingMode",
        "jitUserProvGroupSAMLAttributeName",
        "serviceInstanceIdentifier",
        "userMappingMethod",
        "userMappingStoreAttribute",
        "assertionAttribute",
        "type",
        "requireForceAuthn",
        "requiresEncryptedAssertion",
        "samlHoKRequired",
        "requestedAuthenticationContext",
        "jitUserProvIgnoreErrorOnAbsentGroups",
        "lastNotificationSentTime",
        "jitUserProvGroupMappings",
        "jitUserProvAttributes",
        "jitUserProvAssignedGroups",
        "correlationPolicy",
        "urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider",
        "urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider"
    })
    public IdentityProvider(
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
            String partnerName,
            String description,
            String metadata,
            String partnerProviderId,
            String tenantProviderId,
            String succinctId,
            String idpSsoUrl,
            String logoutRequestUrl,
            String logoutResponseUrl,
            String signingCertificate,
            String encryptionCertificate,
            String nameIdFormat,
            Boolean includeSigningCertInSignature,
            AuthnRequestBinding authnRequestBinding,
            LogoutBinding logoutBinding,
            Boolean logoutEnabled,
            SignatureHashAlgorithm signatureHashAlgorithm,
            Boolean enabled,
            String iconUrl,
            Boolean shownOnLoginPage,
            Boolean jitUserProvEnabled,
            Boolean jitUserProvGroupAssertionAttributeEnabled,
            Boolean jitUserProvGroupStaticListEnabled,
            Boolean jitUserProvCreateUserEnabled,
            Boolean jitUserProvAttributeUpdateEnabled,
            JitUserProvGroupAssignmentMethod jitUserProvGroupAssignmentMethod,
            JitUserProvGroupMappingMode jitUserProvGroupMappingMode,
            String jitUserProvGroupSAMLAttributeName,
            String serviceInstanceIdentifier,
            UserMappingMethod userMappingMethod,
            String userMappingStoreAttribute,
            String assertionAttribute,
            Type type,
            Boolean requireForceAuthn,
            Boolean requiresEncryptedAssertion,
            Boolean samlHoKRequired,
            java.util.List<String> requestedAuthenticationContext,
            Boolean jitUserProvIgnoreErrorOnAbsentGroups,
            String lastNotificationSentTime,
            java.util.List<IdentityProviderJitUserProvGroupMappings> jitUserProvGroupMappings,
            IdentityProviderJitUserProvAttributes jitUserProvAttributes,
            java.util.List<IdentityProviderJitUserProvAssignedGroups> jitUserProvAssignedGroups,
            IdentityProviderCorrelationPolicy correlationPolicy,
            ExtensionSocialIdentityProvider
                    urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider,
            ExtensionX509IdentityProvider
                    urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider) {
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
        this.partnerName = partnerName;
        this.description = description;
        this.metadata = metadata;
        this.partnerProviderId = partnerProviderId;
        this.tenantProviderId = tenantProviderId;
        this.succinctId = succinctId;
        this.idpSsoUrl = idpSsoUrl;
        this.logoutRequestUrl = logoutRequestUrl;
        this.logoutResponseUrl = logoutResponseUrl;
        this.signingCertificate = signingCertificate;
        this.encryptionCertificate = encryptionCertificate;
        this.nameIdFormat = nameIdFormat;
        this.includeSigningCertInSignature = includeSigningCertInSignature;
        this.authnRequestBinding = authnRequestBinding;
        this.logoutBinding = logoutBinding;
        this.logoutEnabled = logoutEnabled;
        this.signatureHashAlgorithm = signatureHashAlgorithm;
        this.enabled = enabled;
        this.iconUrl = iconUrl;
        this.shownOnLoginPage = shownOnLoginPage;
        this.jitUserProvEnabled = jitUserProvEnabled;
        this.jitUserProvGroupAssertionAttributeEnabled = jitUserProvGroupAssertionAttributeEnabled;
        this.jitUserProvGroupStaticListEnabled = jitUserProvGroupStaticListEnabled;
        this.jitUserProvCreateUserEnabled = jitUserProvCreateUserEnabled;
        this.jitUserProvAttributeUpdateEnabled = jitUserProvAttributeUpdateEnabled;
        this.jitUserProvGroupAssignmentMethod = jitUserProvGroupAssignmentMethod;
        this.jitUserProvGroupMappingMode = jitUserProvGroupMappingMode;
        this.jitUserProvGroupSAMLAttributeName = jitUserProvGroupSAMLAttributeName;
        this.serviceInstanceIdentifier = serviceInstanceIdentifier;
        this.userMappingMethod = userMappingMethod;
        this.userMappingStoreAttribute = userMappingStoreAttribute;
        this.assertionAttribute = assertionAttribute;
        this.type = type;
        this.requireForceAuthn = requireForceAuthn;
        this.requiresEncryptedAssertion = requiresEncryptedAssertion;
        this.samlHoKRequired = samlHoKRequired;
        this.requestedAuthenticationContext = requestedAuthenticationContext;
        this.jitUserProvIgnoreErrorOnAbsentGroups = jitUserProvIgnoreErrorOnAbsentGroups;
        this.lastNotificationSentTime = lastNotificationSentTime;
        this.jitUserProvGroupMappings = jitUserProvGroupMappings;
        this.jitUserProvAttributes = jitUserProvAttributes;
        this.jitUserProvAssignedGroups = jitUserProvAssignedGroups;
        this.correlationPolicy = correlationPolicy;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider =
                urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider =
                urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider;
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
         * Unique name of the trusted Identity Provider.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
        private String partnerName;

        /**
         * Unique name of the trusted Identity Provider.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * server
         *
         * @param partnerName the value to set
         * @return this builder
         */
        public Builder partnerName(String partnerName) {
            this.partnerName = partnerName;
            this.__explicitlySet__.add("partnerName");
            return this;
        }
        /**
         * Description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Metadata
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * Metadata
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
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
         * Provider ID
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderId")
        private String partnerProviderId;

        /**
         * Provider ID
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * server
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
         * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID
         * (instead of the one in SamlSettings) when interacting with this IdP.
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
         * (instead of the one in SamlSettings) when interacting with this IdP.
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
         * Succinct ID
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("succinctId")
        private String succinctId;

        /**
         * Succinct ID
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
         * Identity Provider SSO URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idpSsoUrl")
        private String idpSsoUrl;

        /**
         * Identity Provider SSO URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param idpSsoUrl the value to set
         * @return this builder
         */
        public Builder idpSsoUrl(String idpSsoUrl) {
            this.idpSsoUrl = idpSsoUrl;
            this.__explicitlySet__.add("idpSsoUrl");
            return this;
        }
        /**
         * Logout request URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutRequestUrl")
        private String logoutRequestUrl;

        /**
         * Logout request URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
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
         * Logout response URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutResponseUrl")
        private String logoutResponseUrl;

        /**
         * Logout response URL
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
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
         * Signing certificate
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        /**
         * Signing certificate
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
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
         * Encryption certificate
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionCertificate")
        private String encryptionCertificate;

        /**
         * Encryption certificate
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
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
         * Default authentication request name ID format.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nameIdFormat")
        private String nameIdFormat;

        /**
         * Default authentication request name ID format.
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
         * Set to true to include the signing certificate in the signature.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeSigningCertInSignature")
        private Boolean includeSigningCertInSignature;

        /**
         * Set to true to include the signing certificate in the signature.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
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
         * HTTP binding to use for authentication requests.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authnRequestBinding")
        private AuthnRequestBinding authnRequestBinding;

        /**
         * HTTP binding to use for authentication requests.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param authnRequestBinding the value to set
         * @return this builder
         */
        public Builder authnRequestBinding(AuthnRequestBinding authnRequestBinding) {
            this.authnRequestBinding = authnRequestBinding;
            this.__explicitlySet__.add("authnRequestBinding");
            return this;
        }
        /**
         * HTTP binding to use for logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutBinding")
        private LogoutBinding logoutBinding;

        /**
         * HTTP binding to use for logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
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
         * Set to true to enable logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logoutEnabled")
        private Boolean logoutEnabled;

        /**
         * Set to true to enable logout.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
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
         * Signature hash algorithm.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signatureHashAlgorithm")
        private SignatureHashAlgorithm signatureHashAlgorithm;

        /**
         * Signature hash algorithm.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
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
         * Set to true to indicate Partner enabled.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Boolean enabled;

        /**
         * Set to true to indicate Partner enabled.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param enabled the value to set
         * @return this builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }
        /**
         * Identity Provider Icon URL.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iconUrl")
        private String iconUrl;

        /**
         * Identity Provider Icon URL.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param iconUrl the value to set
         * @return this builder
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            this.__explicitlySet__.add("iconUrl");
            return this;
        }
        /**
         * Set to true to indicate whether to show IdP in login page or not.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shownOnLoginPage")
        private Boolean shownOnLoginPage;

        /**
         * Set to true to indicate whether to show IdP in login page or not.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param shownOnLoginPage the value to set
         * @return this builder
         */
        public Builder shownOnLoginPage(Boolean shownOnLoginPage) {
            this.shownOnLoginPage = shownOnLoginPage;
            this.__explicitlySet__.add("shownOnLoginPage");
            return this;
        }
        /**
         * Set to true to indicate JIT User Provisioning is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvEnabled")
        private Boolean jitUserProvEnabled;

        /**
         * Set to true to indicate JIT User Provisioning is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param jitUserProvEnabled the value to set
         * @return this builder
         */
        public Builder jitUserProvEnabled(Boolean jitUserProvEnabled) {
            this.jitUserProvEnabled = jitUserProvEnabled;
            this.__explicitlySet__.add("jitUserProvEnabled");
            return this;
        }
        /**
         * Set to true to indicate JIT User Provisioning Groups should be assigned based on
         * assertion attribute
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupAssertionAttributeEnabled")
        private Boolean jitUserProvGroupAssertionAttributeEnabled;

        /**
         * Set to true to indicate JIT User Provisioning Groups should be assigned based on
         * assertion attribute
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param jitUserProvGroupAssertionAttributeEnabled the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupAssertionAttributeEnabled(
                Boolean jitUserProvGroupAssertionAttributeEnabled) {
            this.jitUserProvGroupAssertionAttributeEnabled =
                    jitUserProvGroupAssertionAttributeEnabled;
            this.__explicitlySet__.add("jitUserProvGroupAssertionAttributeEnabled");
            return this;
        }
        /**
         * Set to true to indicate JIT User Provisioning Groups should be assigned from a static
         * list
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupStaticListEnabled")
        private Boolean jitUserProvGroupStaticListEnabled;

        /**
         * Set to true to indicate JIT User Provisioning Groups should be assigned from a static
         * list
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param jitUserProvGroupStaticListEnabled the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupStaticListEnabled(
                Boolean jitUserProvGroupStaticListEnabled) {
            this.jitUserProvGroupStaticListEnabled = jitUserProvGroupStaticListEnabled;
            this.__explicitlySet__.add("jitUserProvGroupStaticListEnabled");
            return this;
        }
        /**
         * Set to true to indicate JIT User Creation is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvCreateUserEnabled")
        private Boolean jitUserProvCreateUserEnabled;

        /**
         * Set to true to indicate JIT User Creation is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param jitUserProvCreateUserEnabled the value to set
         * @return this builder
         */
        public Builder jitUserProvCreateUserEnabled(Boolean jitUserProvCreateUserEnabled) {
            this.jitUserProvCreateUserEnabled = jitUserProvCreateUserEnabled;
            this.__explicitlySet__.add("jitUserProvCreateUserEnabled");
            return this;
        }
        /**
         * Set to true to indicate JIT User Creation is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAttributeUpdateEnabled")
        private Boolean jitUserProvAttributeUpdateEnabled;

        /**
         * Set to true to indicate JIT User Creation is enabled
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param jitUserProvAttributeUpdateEnabled the value to set
         * @return this builder
         */
        public Builder jitUserProvAttributeUpdateEnabled(
                Boolean jitUserProvAttributeUpdateEnabled) {
            this.jitUserProvAttributeUpdateEnabled = jitUserProvAttributeUpdateEnabled;
            this.__explicitlySet__.add("jitUserProvAttributeUpdateEnabled");
            return this;
        }
        /**
         * The default value is 'Overwrite', which tells Just-In-Time user-provisioning to replace
         * any current group-assignments for a User with those assigned by assertions and/or those
         * assigned statically. Specify 'Merge' if you want Just-In-Time user-provisioning to
         * combine its group-assignments with those the user already has.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupAssignmentMethod")
        private JitUserProvGroupAssignmentMethod jitUserProvGroupAssignmentMethod;

        /**
         * The default value is 'Overwrite', which tells Just-In-Time user-provisioning to replace
         * any current group-assignments for a User with those assigned by assertions and/or those
         * assigned statically. Specify 'Merge' if you want Just-In-Time user-provisioning to
         * combine its group-assignments with those the user already has.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param jitUserProvGroupAssignmentMethod the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupAssignmentMethod(
                JitUserProvGroupAssignmentMethod jitUserProvGroupAssignmentMethod) {
            this.jitUserProvGroupAssignmentMethod = jitUserProvGroupAssignmentMethod;
            this.__explicitlySet__.add("jitUserProvGroupAssignmentMethod");
            return this;
        }
        /**
         * Property to indicate the mode of group mapping
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupMappingMode")
        private JitUserProvGroupMappingMode jitUserProvGroupMappingMode;

        /**
         * Property to indicate the mode of group mapping
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param jitUserProvGroupMappingMode the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupMappingMode(
                JitUserProvGroupMappingMode jitUserProvGroupMappingMode) {
            this.jitUserProvGroupMappingMode = jitUserProvGroupMappingMode;
            this.__explicitlySet__.add("jitUserProvGroupMappingMode");
            return this;
        }
        /**
         * Name of the assertion attribute containing the users groups
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupSAMLAttributeName")
        private String jitUserProvGroupSAMLAttributeName;

        /**
         * Name of the assertion attribute containing the users groups
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param jitUserProvGroupSAMLAttributeName the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupSAMLAttributeName(String jitUserProvGroupSAMLAttributeName) {
            this.jitUserProvGroupSAMLAttributeName = jitUserProvGroupSAMLAttributeName;
            this.__explicitlySet__.add("jitUserProvGroupSAMLAttributeName");
            return this;
        }
        /**
         * The serviceInstanceIdentifier of the App that hosts this IdP. This value will match the
         * opcServiceInstanceGUID of any service-instance that the IdP represents.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: never - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceIdentifier")
        private String serviceInstanceIdentifier;

        /**
         * The serviceInstanceIdentifier of the App that hosts this IdP. This value will match the
         * opcServiceInstanceGUID of any service-instance that the IdP represents.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: never - type: string - uniqueness:
         * server
         *
         * @param serviceInstanceIdentifier the value to set
         * @return this builder
         */
        public Builder serviceInstanceIdentifier(String serviceInstanceIdentifier) {
            this.serviceInstanceIdentifier = serviceInstanceIdentifier;
            this.__explicitlySet__.add("serviceInstanceIdentifier");
            return this;
        }
        /**
         * User mapping method.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userMappingMethod")
        private UserMappingMethod userMappingMethod;

        /**
         * User mapping method.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         *
         * @param userMappingMethod the value to set
         * @return this builder
         */
        public Builder userMappingMethod(UserMappingMethod userMappingMethod) {
            this.userMappingMethod = userMappingMethod;
            this.__explicitlySet__.add("userMappingMethod");
            return this;
        }
        /**
         * This property specifies the userstore attribute value that must match the incoming
         * assertion attribute value or the incoming nameid attribute value in order to identify the
         * user during SSO.<br>
         * You can construct the userMappingStoreAttribute value by specifying attributes from the
         * Oracle Identity Cloud Service Core Users schema. For examples of how to construct the
         * userMappingStoreAttribute value, see the <b>Example of a Request Body</b> section of the
         * Examples tab for the <a href='./op-admin-v1-identityproviders-post.html'>POST</a> and <a
         * href='./op-admin-v1-identityproviders-id-put.html'>PUT</a> methods of the
         * /IdentityProviders endpoint.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userMappingStoreAttribute")
        private String userMappingStoreAttribute;

        /**
         * This property specifies the userstore attribute value that must match the incoming
         * assertion attribute value or the incoming nameid attribute value in order to identify the
         * user during SSO.<br>
         * You can construct the userMappingStoreAttribute value by specifying attributes from the
         * Oracle Identity Cloud Service Core Users schema. For examples of how to construct the
         * userMappingStoreAttribute value, see the <b>Example of a Request Body</b> section of the
         * Examples tab for the <a href='./op-admin-v1-identityproviders-post.html'>POST</a> and <a
         * href='./op-admin-v1-identityproviders-id-put.html'>PUT</a> methods of the
         * /IdentityProviders endpoint.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         *
         * @param userMappingStoreAttribute the value to set
         * @return this builder
         */
        public Builder userMappingStoreAttribute(String userMappingStoreAttribute) {
            this.userMappingStoreAttribute = userMappingStoreAttribute;
            this.__explicitlySet__.add("userMappingStoreAttribute");
            return this;
        }
        /**
         * Assertion attribute name.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assertionAttribute")
        private String assertionAttribute;

        /**
         * Assertion attribute name.
         *
         * <p>*Deprecated Since: 20.1.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none - idcsValuePersistedInOtherAttribute: true
         *
         * @param assertionAttribute the value to set
         * @return this builder
         */
        public Builder assertionAttribute(String assertionAttribute) {
            this.assertionAttribute = assertionAttribute;
            this.__explicitlySet__.add("assertionAttribute");
            return this;
        }
        /**
         * Identity Provider Type
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Identity Provider Type
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: always - type: string - uniqueness:
         * none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * This SP requires requests SAML IdP to enforce re-authentication.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requireForceAuthn")
        private Boolean requireForceAuthn;

        /**
         * This SP requires requests SAML IdP to enforce re-authentication.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param requireForceAuthn the value to set
         * @return this builder
         */
        public Builder requireForceAuthn(Boolean requireForceAuthn) {
            this.requireForceAuthn = requireForceAuthn;
            this.__explicitlySet__.add("requireForceAuthn");
            return this;
        }
        /**
         * SAML SP must accept encrypted assertion only.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requiresEncryptedAssertion")
        private Boolean requiresEncryptedAssertion;

        /**
         * SAML SP must accept encrypted assertion only.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param requiresEncryptedAssertion the value to set
         * @return this builder
         */
        public Builder requiresEncryptedAssertion(Boolean requiresEncryptedAssertion) {
            this.requiresEncryptedAssertion = requiresEncryptedAssertion;
            this.__explicitlySet__.add("requiresEncryptedAssertion");
            return this;
        }
        /**
         * SAML SP HoK Enabled.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("samlHoKRequired")
        private Boolean samlHoKRequired;

        /**
         * SAML SP HoK Enabled.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param samlHoKRequired the value to set
         * @return this builder
         */
        public Builder samlHoKRequired(Boolean samlHoKRequired) {
            this.samlHoKRequired = samlHoKRequired;
            this.__explicitlySet__.add("samlHoKRequired");
            return this;
        }
        /**
         * SAML SP authentication type.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedAuthenticationContext")
        private java.util.List<String> requestedAuthenticationContext;

        /**
         * SAML SP authentication type.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param requestedAuthenticationContext the value to set
         * @return this builder
         */
        public Builder requestedAuthenticationContext(
                java.util.List<String> requestedAuthenticationContext) {
            this.requestedAuthenticationContext = requestedAuthenticationContext;
            this.__explicitlySet__.add("requestedAuthenticationContext");
            return this;
        }
        /**
         * Set to true to indicate ignoring absence of group while provisioning
         *
         * <p>*Added In:** 2111112015
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsAddedSinceVersion: 30 - idcsSearchable:
         * false - multiValued: false - mutability: readWrite - required: false - returned: default
         * - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvIgnoreErrorOnAbsentGroups")
        private Boolean jitUserProvIgnoreErrorOnAbsentGroups;

        /**
         * Set to true to indicate ignoring absence of group while provisioning
         *
         * <p>*Added In:** 2111112015
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsAddedSinceVersion: 30 - idcsSearchable:
         * false - multiValued: false - mutability: readWrite - required: false - returned: default
         * - type: boolean - uniqueness: none
         *
         * @param jitUserProvIgnoreErrorOnAbsentGroups the value to set
         * @return this builder
         */
        public Builder jitUserProvIgnoreErrorOnAbsentGroups(
                Boolean jitUserProvIgnoreErrorOnAbsentGroups) {
            this.jitUserProvIgnoreErrorOnAbsentGroups = jitUserProvIgnoreErrorOnAbsentGroups;
            this.__explicitlySet__.add("jitUserProvIgnoreErrorOnAbsentGroups");
            return this;
        }
        /**
         * Records the notification timestamp for the IdP whose signing certificate is about to
         * expire
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
         * Records the notification timestamp for the IdP whose signing certificate is about to
         * expire
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
        /**
         * The list of mappings between the Identity Domain Group and the IDP group.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [idpGroup] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupMappings")
        private java.util.List<IdentityProviderJitUserProvGroupMappings> jitUserProvGroupMappings;

        /**
         * The list of mappings between the Identity Domain Group and the IDP group.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [idpGroup] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         *
         * @param jitUserProvGroupMappings the value to set
         * @return this builder
         */
        public Builder jitUserProvGroupMappings(
                java.util.List<IdentityProviderJitUserProvGroupMappings> jitUserProvGroupMappings) {
            this.jitUserProvGroupMappings = jitUserProvGroupMappings;
            this.__explicitlySet__.add("jitUserProvGroupMappings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAttributes")
        private IdentityProviderJitUserProvAttributes jitUserProvAttributes;

        public Builder jitUserProvAttributes(
                IdentityProviderJitUserProvAttributes jitUserProvAttributes) {
            this.jitUserProvAttributes = jitUserProvAttributes;
            this.__explicitlySet__.add("jitUserProvAttributes");
            return this;
        }
        /**
         * Refers to every group of which a JIT-provisioned User should be a member. Just-in-Time
         * user-provisioning applies this static list when jitUserProvGroupStaticListEnabled:true.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAssignedGroups")
        private java.util.List<IdentityProviderJitUserProvAssignedGroups> jitUserProvAssignedGroups;

        /**
         * Refers to every group of which a JIT-provisioned User should be a member. Just-in-Time
         * user-provisioning applies this static list when jitUserProvGroupStaticListEnabled:true.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param jitUserProvAssignedGroups the value to set
         * @return this builder
         */
        public Builder jitUserProvAssignedGroups(
                java.util.List<IdentityProviderJitUserProvAssignedGroups>
                        jitUserProvAssignedGroups) {
            this.jitUserProvAssignedGroups = jitUserProvAssignedGroups;
            this.__explicitlySet__.add("jitUserProvAssignedGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("correlationPolicy")
        private IdentityProviderCorrelationPolicy correlationPolicy;

        public Builder correlationPolicy(IdentityProviderCorrelationPolicy correlationPolicy) {
            this.correlationPolicy = correlationPolicy;
            this.__explicitlySet__.add("correlationPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:social:IdentityProvider")
        private ExtensionSocialIdentityProvider
                urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider(
                ExtensionSocialIdentityProvider
                        urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider =
                    urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:x509:IdentityProvider")
        private ExtensionX509IdentityProvider
                urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider(
                ExtensionX509IdentityProvider
                        urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider =
                    urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProvider build() {
            IdentityProvider model =
                    new IdentityProvider(
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
                            this.partnerName,
                            this.description,
                            this.metadata,
                            this.partnerProviderId,
                            this.tenantProviderId,
                            this.succinctId,
                            this.idpSsoUrl,
                            this.logoutRequestUrl,
                            this.logoutResponseUrl,
                            this.signingCertificate,
                            this.encryptionCertificate,
                            this.nameIdFormat,
                            this.includeSigningCertInSignature,
                            this.authnRequestBinding,
                            this.logoutBinding,
                            this.logoutEnabled,
                            this.signatureHashAlgorithm,
                            this.enabled,
                            this.iconUrl,
                            this.shownOnLoginPage,
                            this.jitUserProvEnabled,
                            this.jitUserProvGroupAssertionAttributeEnabled,
                            this.jitUserProvGroupStaticListEnabled,
                            this.jitUserProvCreateUserEnabled,
                            this.jitUserProvAttributeUpdateEnabled,
                            this.jitUserProvGroupAssignmentMethod,
                            this.jitUserProvGroupMappingMode,
                            this.jitUserProvGroupSAMLAttributeName,
                            this.serviceInstanceIdentifier,
                            this.userMappingMethod,
                            this.userMappingStoreAttribute,
                            this.assertionAttribute,
                            this.type,
                            this.requireForceAuthn,
                            this.requiresEncryptedAssertion,
                            this.samlHoKRequired,
                            this.requestedAuthenticationContext,
                            this.jitUserProvIgnoreErrorOnAbsentGroups,
                            this.lastNotificationSentTime,
                            this.jitUserProvGroupMappings,
                            this.jitUserProvAttributes,
                            this.jitUserProvAssignedGroups,
                            this.correlationPolicy,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProvider model) {
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
            if (model.wasPropertyExplicitlySet("partnerName")) {
                this.partnerName(model.getPartnerName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("partnerProviderId")) {
                this.partnerProviderId(model.getPartnerProviderId());
            }
            if (model.wasPropertyExplicitlySet("tenantProviderId")) {
                this.tenantProviderId(model.getTenantProviderId());
            }
            if (model.wasPropertyExplicitlySet("succinctId")) {
                this.succinctId(model.getSuccinctId());
            }
            if (model.wasPropertyExplicitlySet("idpSsoUrl")) {
                this.idpSsoUrl(model.getIdpSsoUrl());
            }
            if (model.wasPropertyExplicitlySet("logoutRequestUrl")) {
                this.logoutRequestUrl(model.getLogoutRequestUrl());
            }
            if (model.wasPropertyExplicitlySet("logoutResponseUrl")) {
                this.logoutResponseUrl(model.getLogoutResponseUrl());
            }
            if (model.wasPropertyExplicitlySet("signingCertificate")) {
                this.signingCertificate(model.getSigningCertificate());
            }
            if (model.wasPropertyExplicitlySet("encryptionCertificate")) {
                this.encryptionCertificate(model.getEncryptionCertificate());
            }
            if (model.wasPropertyExplicitlySet("nameIdFormat")) {
                this.nameIdFormat(model.getNameIdFormat());
            }
            if (model.wasPropertyExplicitlySet("includeSigningCertInSignature")) {
                this.includeSigningCertInSignature(model.getIncludeSigningCertInSignature());
            }
            if (model.wasPropertyExplicitlySet("authnRequestBinding")) {
                this.authnRequestBinding(model.getAuthnRequestBinding());
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
            if (model.wasPropertyExplicitlySet("enabled")) {
                this.enabled(model.getEnabled());
            }
            if (model.wasPropertyExplicitlySet("iconUrl")) {
                this.iconUrl(model.getIconUrl());
            }
            if (model.wasPropertyExplicitlySet("shownOnLoginPage")) {
                this.shownOnLoginPage(model.getShownOnLoginPage());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvEnabled")) {
                this.jitUserProvEnabled(model.getJitUserProvEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupAssertionAttributeEnabled")) {
                this.jitUserProvGroupAssertionAttributeEnabled(
                        model.getJitUserProvGroupAssertionAttributeEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupStaticListEnabled")) {
                this.jitUserProvGroupStaticListEnabled(
                        model.getJitUserProvGroupStaticListEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvCreateUserEnabled")) {
                this.jitUserProvCreateUserEnabled(model.getJitUserProvCreateUserEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvAttributeUpdateEnabled")) {
                this.jitUserProvAttributeUpdateEnabled(
                        model.getJitUserProvAttributeUpdateEnabled());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupAssignmentMethod")) {
                this.jitUserProvGroupAssignmentMethod(model.getJitUserProvGroupAssignmentMethod());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupMappingMode")) {
                this.jitUserProvGroupMappingMode(model.getJitUserProvGroupMappingMode());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupSAMLAttributeName")) {
                this.jitUserProvGroupSAMLAttributeName(
                        model.getJitUserProvGroupSAMLAttributeName());
            }
            if (model.wasPropertyExplicitlySet("serviceInstanceIdentifier")) {
                this.serviceInstanceIdentifier(model.getServiceInstanceIdentifier());
            }
            if (model.wasPropertyExplicitlySet("userMappingMethod")) {
                this.userMappingMethod(model.getUserMappingMethod());
            }
            if (model.wasPropertyExplicitlySet("userMappingStoreAttribute")) {
                this.userMappingStoreAttribute(model.getUserMappingStoreAttribute());
            }
            if (model.wasPropertyExplicitlySet("assertionAttribute")) {
                this.assertionAttribute(model.getAssertionAttribute());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("requireForceAuthn")) {
                this.requireForceAuthn(model.getRequireForceAuthn());
            }
            if (model.wasPropertyExplicitlySet("requiresEncryptedAssertion")) {
                this.requiresEncryptedAssertion(model.getRequiresEncryptedAssertion());
            }
            if (model.wasPropertyExplicitlySet("samlHoKRequired")) {
                this.samlHoKRequired(model.getSamlHoKRequired());
            }
            if (model.wasPropertyExplicitlySet("requestedAuthenticationContext")) {
                this.requestedAuthenticationContext(model.getRequestedAuthenticationContext());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvIgnoreErrorOnAbsentGroups")) {
                this.jitUserProvIgnoreErrorOnAbsentGroups(
                        model.getJitUserProvIgnoreErrorOnAbsentGroups());
            }
            if (model.wasPropertyExplicitlySet("lastNotificationSentTime")) {
                this.lastNotificationSentTime(model.getLastNotificationSentTime());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvGroupMappings")) {
                this.jitUserProvGroupMappings(model.getJitUserProvGroupMappings());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvAttributes")) {
                this.jitUserProvAttributes(model.getJitUserProvAttributes());
            }
            if (model.wasPropertyExplicitlySet("jitUserProvAssignedGroups")) {
                this.jitUserProvAssignedGroups(model.getJitUserProvAssignedGroups());
            }
            if (model.wasPropertyExplicitlySet("correlationPolicy")) {
                this.correlationPolicy(model.getCorrelationPolicy());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider(
                        model
                                .getUrnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider());
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
     * Unique name of the trusted Identity Provider.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerName")
    private final String partnerName;

    /**
     * Unique name of the trusted Identity Provider.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metadata
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * Metadata
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * Provider ID
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerProviderId")
    private final String partnerProviderId;

    /**
     * Provider ID
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getPartnerProviderId() {
        return partnerProviderId;
    }

    /**
     * The alternate Provider ID to be used as the Oracle Identity Cloud Service providerID (instead
     * of the one in SamlSettings) when interacting with this IdP.
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
     * of the one in SamlSettings) when interacting with this IdP.
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
     * Succinct ID
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("succinctId")
    private final String succinctId;

    /**
     * Succinct ID
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
     * Identity Provider SSO URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idpSsoUrl")
    private final String idpSsoUrl;

    /**
     * Identity Provider SSO URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdpSsoUrl() {
        return idpSsoUrl;
    }

    /**
     * Logout request URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutRequestUrl")
    private final String logoutRequestUrl;

    /**
     * Logout request URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutRequestUrl() {
        return logoutRequestUrl;
    }

    /**
     * Logout response URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutResponseUrl")
    private final String logoutResponseUrl;

    /**
     * Logout response URL
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLogoutResponseUrl() {
        return logoutResponseUrl;
    }

    /**
     * Signing certificate
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    private final String signingCertificate;

    /**
     * Signing certificate
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Encryption certificate
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionCertificate")
    private final String encryptionCertificate;

    /**
     * Encryption certificate
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getEncryptionCertificate() {
        return encryptionCertificate;
    }

    /**
     * Default authentication request name ID format.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nameIdFormat")
    private final String nameIdFormat;

    /**
     * Default authentication request name ID format.
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
     * Set to true to include the signing certificate in the signature.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeSigningCertInSignature")
    private final Boolean includeSigningCertInSignature;

    /**
     * Set to true to include the signing certificate in the signature.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getIncludeSigningCertInSignature() {
        return includeSigningCertInSignature;
    }

    /**
     * HTTP binding to use for authentication requests.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum AuthnRequestBinding implements com.oracle.bmc.http.internal.BmcEnum {
        Redirect("Redirect"),
        Post("Post"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthnRequestBinding.class);

        private final String value;
        private static java.util.Map<String, AuthnRequestBinding> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthnRequestBinding v : AuthnRequestBinding.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthnRequestBinding(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthnRequestBinding create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthnRequestBinding', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * HTTP binding to use for authentication requests.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authnRequestBinding")
    private final AuthnRequestBinding authnRequestBinding;

    /**
     * HTTP binding to use for authentication requests.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public AuthnRequestBinding getAuthnRequestBinding() {
        return authnRequestBinding;
    }

    /**
     * HTTP binding to use for logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
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
     * HTTP binding to use for logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutBinding")
    private final LogoutBinding logoutBinding;

    /**
     * HTTP binding to use for logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public LogoutBinding getLogoutBinding() {
        return logoutBinding;
    }

    /**
     * Set to true to enable logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logoutEnabled")
    private final Boolean logoutEnabled;

    /**
     * Set to true to enable logout.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getLogoutEnabled() {
        return logoutEnabled;
    }

    /**
     * Signature hash algorithm.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
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
     * Signature hash algorithm.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signatureHashAlgorithm")
    private final SignatureHashAlgorithm signatureHashAlgorithm;

    /**
     * Signature hash algorithm.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SignatureHashAlgorithm getSignatureHashAlgorithm() {
        return signatureHashAlgorithm;
    }

    /**
     * Set to true to indicate Partner enabled.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final Boolean enabled;

    /**
     * Set to true to indicate Partner enabled.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Identity Provider Icon URL.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iconUrl")
    private final String iconUrl;

    /**
     * Identity Provider Icon URL.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Set to true to indicate whether to show IdP in login page or not.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shownOnLoginPage")
    private final Boolean shownOnLoginPage;

    /**
     * Set to true to indicate whether to show IdP in login page or not.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getShownOnLoginPage() {
        return shownOnLoginPage;
    }

    /**
     * Set to true to indicate JIT User Provisioning is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvEnabled")
    private final Boolean jitUserProvEnabled;

    /**
     * Set to true to indicate JIT User Provisioning is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getJitUserProvEnabled() {
        return jitUserProvEnabled;
    }

    /**
     * Set to true to indicate JIT User Provisioning Groups should be assigned based on assertion
     * attribute
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupAssertionAttributeEnabled")
    private final Boolean jitUserProvGroupAssertionAttributeEnabled;

    /**
     * Set to true to indicate JIT User Provisioning Groups should be assigned based on assertion
     * attribute
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getJitUserProvGroupAssertionAttributeEnabled() {
        return jitUserProvGroupAssertionAttributeEnabled;
    }

    /**
     * Set to true to indicate JIT User Provisioning Groups should be assigned from a static list
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupStaticListEnabled")
    private final Boolean jitUserProvGroupStaticListEnabled;

    /**
     * Set to true to indicate JIT User Provisioning Groups should be assigned from a static list
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getJitUserProvGroupStaticListEnabled() {
        return jitUserProvGroupStaticListEnabled;
    }

    /**
     * Set to true to indicate JIT User Creation is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvCreateUserEnabled")
    private final Boolean jitUserProvCreateUserEnabled;

    /**
     * Set to true to indicate JIT User Creation is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getJitUserProvCreateUserEnabled() {
        return jitUserProvCreateUserEnabled;
    }

    /**
     * Set to true to indicate JIT User Creation is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAttributeUpdateEnabled")
    private final Boolean jitUserProvAttributeUpdateEnabled;

    /**
     * Set to true to indicate JIT User Creation is enabled
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getJitUserProvAttributeUpdateEnabled() {
        return jitUserProvAttributeUpdateEnabled;
    }

    /**
     * The default value is 'Overwrite', which tells Just-In-Time user-provisioning to replace any
     * current group-assignments for a User with those assigned by assertions and/or those assigned
     * statically. Specify 'Merge' if you want Just-In-Time user-provisioning to combine its
     * group-assignments with those the user already has.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum JitUserProvGroupAssignmentMethod implements com.oracle.bmc.http.internal.BmcEnum {
        Overwrite("Overwrite"),
        Merge("Merge"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(JitUserProvGroupAssignmentMethod.class);

        private final String value;
        private static java.util.Map<String, JitUserProvGroupAssignmentMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (JitUserProvGroupAssignmentMethod v : JitUserProvGroupAssignmentMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        JitUserProvGroupAssignmentMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static JitUserProvGroupAssignmentMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'JitUserProvGroupAssignmentMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The default value is 'Overwrite', which tells Just-In-Time user-provisioning to replace any
     * current group-assignments for a User with those assigned by assertions and/or those assigned
     * statically. Specify 'Merge' if you want Just-In-Time user-provisioning to combine its
     * group-assignments with those the user already has.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupAssignmentMethod")
    private final JitUserProvGroupAssignmentMethod jitUserProvGroupAssignmentMethod;

    /**
     * The default value is 'Overwrite', which tells Just-In-Time user-provisioning to replace any
     * current group-assignments for a User with those assigned by assertions and/or those assigned
     * statically. Specify 'Merge' if you want Just-In-Time user-provisioning to combine its
     * group-assignments with those the user already has.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public JitUserProvGroupAssignmentMethod getJitUserProvGroupAssignmentMethod() {
        return jitUserProvGroupAssignmentMethod;
    }

    /**
     * Property to indicate the mode of group mapping
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum JitUserProvGroupMappingMode implements com.oracle.bmc.http.internal.BmcEnum {
        Implicit("implicit"),
        Explicit("explicit"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(JitUserProvGroupMappingMode.class);

        private final String value;
        private static java.util.Map<String, JitUserProvGroupMappingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (JitUserProvGroupMappingMode v : JitUserProvGroupMappingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        JitUserProvGroupMappingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static JitUserProvGroupMappingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'JitUserProvGroupMappingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Property to indicate the mode of group mapping
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupMappingMode")
    private final JitUserProvGroupMappingMode jitUserProvGroupMappingMode;

    /**
     * Property to indicate the mode of group mapping
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public JitUserProvGroupMappingMode getJitUserProvGroupMappingMode() {
        return jitUserProvGroupMappingMode;
    }

    /**
     * Name of the assertion attribute containing the users groups
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupSAMLAttributeName")
    private final String jitUserProvGroupSAMLAttributeName;

    /**
     * Name of the assertion attribute containing the users groups
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getJitUserProvGroupSAMLAttributeName() {
        return jitUserProvGroupSAMLAttributeName;
    }

    /**
     * The serviceInstanceIdentifier of the App that hosts this IdP. This value will match the
     * opcServiceInstanceGUID of any service-instance that the IdP represents.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: never - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceInstanceIdentifier")
    private final String serviceInstanceIdentifier;

    /**
     * The serviceInstanceIdentifier of the App that hosts this IdP. This value will match the
     * opcServiceInstanceGUID of any service-instance that the IdP represents.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: never - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getServiceInstanceIdentifier() {
        return serviceInstanceIdentifier;
    }

    /**
     * User mapping method.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     */
    public enum UserMappingMethod implements com.oracle.bmc.http.internal.BmcEnum {
        NameIdToUserAttribute("NameIDToUserAttribute"),
        AssertionAttributeToUserAttribute("AssertionAttributeToUserAttribute"),
        CorrelationPolicyRule("CorrelationPolicyRule"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserMappingMethod.class);

        private final String value;
        private static java.util.Map<String, UserMappingMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (UserMappingMethod v : UserMappingMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserMappingMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserMappingMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserMappingMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * User mapping method.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userMappingMethod")
    private final UserMappingMethod userMappingMethod;

    /**
     * User mapping method.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     *
     * @return the value
     */
    public UserMappingMethod getUserMappingMethod() {
        return userMappingMethod;
    }

    /**
     * This property specifies the userstore attribute value that must match the incoming assertion
     * attribute value or the incoming nameid attribute value in order to identify the user during
     * SSO.<br>
     * You can construct the userMappingStoreAttribute value by specifying attributes from the
     * Oracle Identity Cloud Service Core Users schema. For examples of how to construct the
     * userMappingStoreAttribute value, see the <b>Example of a Request Body</b> section of the
     * Examples tab for the <a href='./op-admin-v1-identityproviders-post.html'>POST</a> and <a
     * href='./op-admin-v1-identityproviders-id-put.html'>PUT</a> methods of the /IdentityProviders
     * endpoint.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userMappingStoreAttribute")
    private final String userMappingStoreAttribute;

    /**
     * This property specifies the userstore attribute value that must match the incoming assertion
     * attribute value or the incoming nameid attribute value in order to identify the user during
     * SSO.<br>
     * You can construct the userMappingStoreAttribute value by specifying attributes from the
     * Oracle Identity Cloud Service Core Users schema. For examples of how to construct the
     * userMappingStoreAttribute value, see the <b>Example of a Request Body</b> section of the
     * Examples tab for the <a href='./op-admin-v1-identityproviders-post.html'>POST</a> and <a
     * href='./op-admin-v1-identityproviders-id-put.html'>PUT</a> methods of the /IdentityProviders
     * endpoint.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     *
     * @return the value
     */
    public String getUserMappingStoreAttribute() {
        return userMappingStoreAttribute;
    }

    /**
     * Assertion attribute name.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assertionAttribute")
    private final String assertionAttribute;

    /**
     * Assertion attribute name.
     *
     * <p>*Deprecated Since: 20.1.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     * - idcsValuePersistedInOtherAttribute: true
     *
     * @return the value
     */
    public String getAssertionAttribute() {
        return assertionAttribute;
    }

    /**
     * Identity Provider Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: always - type: string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Saml("SAML"),
        Social("SOCIAL"),
        Iwa("IWA"),
        X509("X509"),
        Local("LOCAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Identity Provider Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Identity Provider Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * This SP requires requests SAML IdP to enforce re-authentication.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requireForceAuthn")
    private final Boolean requireForceAuthn;

    /**
     * This SP requires requests SAML IdP to enforce re-authentication.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getRequireForceAuthn() {
        return requireForceAuthn;
    }

    /**
     * SAML SP must accept encrypted assertion only.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiresEncryptedAssertion")
    private final Boolean requiresEncryptedAssertion;

    /**
     * SAML SP must accept encrypted assertion only.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getRequiresEncryptedAssertion() {
        return requiresEncryptedAssertion;
    }

    /**
     * SAML SP HoK Enabled.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("samlHoKRequired")
    private final Boolean samlHoKRequired;

    /**
     * SAML SP HoK Enabled.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getSamlHoKRequired() {
        return samlHoKRequired;
    }

    /**
     * SAML SP authentication type.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedAuthenticationContext")
    private final java.util.List<String> requestedAuthenticationContext;

    /**
     * SAML SP authentication type.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getRequestedAuthenticationContext() {
        return requestedAuthenticationContext;
    }

    /**
     * Set to true to indicate ignoring absence of group while provisioning
     *
     * <p>*Added In:** 2111112015
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsAddedSinceVersion: 30 - idcsSearchable:
     * false - multiValued: false - mutability: readWrite - required: false - returned: default -
     * type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvIgnoreErrorOnAbsentGroups")
    private final Boolean jitUserProvIgnoreErrorOnAbsentGroups;

    /**
     * Set to true to indicate ignoring absence of group while provisioning
     *
     * <p>*Added In:** 2111112015
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsAddedSinceVersion: 30 - idcsSearchable:
     * false - multiValued: false - mutability: readWrite - required: false - returned: default -
     * type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getJitUserProvIgnoreErrorOnAbsentGroups() {
        return jitUserProvIgnoreErrorOnAbsentGroups;
    }

    /**
     * Records the notification timestamp for the IdP whose signing certificate is about to expire
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
     * Records the notification timestamp for the IdP whose signing certificate is about to expire
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

    /**
     * The list of mappings between the Identity Domain Group and the IDP group.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [idpGroup] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvGroupMappings")
    private final java.util.List<IdentityProviderJitUserProvGroupMappings> jitUserProvGroupMappings;

    /**
     * The list of mappings between the Identity Domain Group and the IDP group.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [idpGroup] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdentityProviderJitUserProvGroupMappings> getJitUserProvGroupMappings() {
        return jitUserProvGroupMappings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAttributes")
    private final IdentityProviderJitUserProvAttributes jitUserProvAttributes;

    public IdentityProviderJitUserProvAttributes getJitUserProvAttributes() {
        return jitUserProvAttributes;
    }

    /**
     * Refers to every group of which a JIT-provisioned User should be a member. Just-in-Time
     * user-provisioning applies this static list when jitUserProvGroupStaticListEnabled:true.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jitUserProvAssignedGroups")
    private final java.util.List<IdentityProviderJitUserProvAssignedGroups>
            jitUserProvAssignedGroups;

    /**
     * Refers to every group of which a JIT-provisioned User should be a member. Just-in-Time
     * user-provisioning applies this static list when jitUserProvGroupStaticListEnabled:true.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: false - multiValued:
     * true - mutability: readWrite - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdentityProviderJitUserProvAssignedGroups>
            getJitUserProvAssignedGroups() {
        return jitUserProvAssignedGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("correlationPolicy")
    private final IdentityProviderCorrelationPolicy correlationPolicy;

    public IdentityProviderCorrelationPolicy getCorrelationPolicy() {
        return correlationPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:social:IdentityProvider")
    private final ExtensionSocialIdentityProvider
            urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider;

    public ExtensionSocialIdentityProvider
            getUrnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:x509:IdentityProvider")
    private final ExtensionX509IdentityProvider
            urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider;

    public ExtensionX509IdentityProvider
            getUrnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider;
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
        sb.append("IdentityProvider(");
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
        sb.append(", partnerName=").append(String.valueOf(this.partnerName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", partnerProviderId=").append(String.valueOf(this.partnerProviderId));
        sb.append(", tenantProviderId=").append(String.valueOf(this.tenantProviderId));
        sb.append(", succinctId=").append(String.valueOf(this.succinctId));
        sb.append(", idpSsoUrl=").append(String.valueOf(this.idpSsoUrl));
        sb.append(", logoutRequestUrl=").append(String.valueOf(this.logoutRequestUrl));
        sb.append(", logoutResponseUrl=").append(String.valueOf(this.logoutResponseUrl));
        sb.append(", signingCertificate=").append(String.valueOf(this.signingCertificate));
        sb.append(", encryptionCertificate=").append(String.valueOf(this.encryptionCertificate));
        sb.append(", nameIdFormat=").append(String.valueOf(this.nameIdFormat));
        sb.append(", includeSigningCertInSignature=")
                .append(String.valueOf(this.includeSigningCertInSignature));
        sb.append(", authnRequestBinding=").append(String.valueOf(this.authnRequestBinding));
        sb.append(", logoutBinding=").append(String.valueOf(this.logoutBinding));
        sb.append(", logoutEnabled=").append(String.valueOf(this.logoutEnabled));
        sb.append(", signatureHashAlgorithm=").append(String.valueOf(this.signatureHashAlgorithm));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(", iconUrl=").append(String.valueOf(this.iconUrl));
        sb.append(", shownOnLoginPage=").append(String.valueOf(this.shownOnLoginPage));
        sb.append(", jitUserProvEnabled=").append(String.valueOf(this.jitUserProvEnabled));
        sb.append(", jitUserProvGroupAssertionAttributeEnabled=")
                .append(String.valueOf(this.jitUserProvGroupAssertionAttributeEnabled));
        sb.append(", jitUserProvGroupStaticListEnabled=")
                .append(String.valueOf(this.jitUserProvGroupStaticListEnabled));
        sb.append(", jitUserProvCreateUserEnabled=")
                .append(String.valueOf(this.jitUserProvCreateUserEnabled));
        sb.append(", jitUserProvAttributeUpdateEnabled=")
                .append(String.valueOf(this.jitUserProvAttributeUpdateEnabled));
        sb.append(", jitUserProvGroupAssignmentMethod=")
                .append(String.valueOf(this.jitUserProvGroupAssignmentMethod));
        sb.append(", jitUserProvGroupMappingMode=")
                .append(String.valueOf(this.jitUserProvGroupMappingMode));
        sb.append(", jitUserProvGroupSAMLAttributeName=")
                .append(String.valueOf(this.jitUserProvGroupSAMLAttributeName));
        sb.append(", serviceInstanceIdentifier=")
                .append(String.valueOf(this.serviceInstanceIdentifier));
        sb.append(", userMappingMethod=").append(String.valueOf(this.userMappingMethod));
        sb.append(", userMappingStoreAttribute=")
                .append(String.valueOf(this.userMappingStoreAttribute));
        sb.append(", assertionAttribute=").append(String.valueOf(this.assertionAttribute));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", requireForceAuthn=").append(String.valueOf(this.requireForceAuthn));
        sb.append(", requiresEncryptedAssertion=")
                .append(String.valueOf(this.requiresEncryptedAssertion));
        sb.append(", samlHoKRequired=").append(String.valueOf(this.samlHoKRequired));
        sb.append(", requestedAuthenticationContext=")
                .append(String.valueOf(this.requestedAuthenticationContext));
        sb.append(", jitUserProvIgnoreErrorOnAbsentGroups=")
                .append(String.valueOf(this.jitUserProvIgnoreErrorOnAbsentGroups));
        sb.append(", lastNotificationSentTime=")
                .append(String.valueOf(this.lastNotificationSentTime));
        sb.append(", jitUserProvGroupMappings=")
                .append(String.valueOf(this.jitUserProvGroupMappings));
        sb.append(", jitUserProvAttributes=").append(String.valueOf(this.jitUserProvAttributes));
        sb.append(", jitUserProvAssignedGroups=")
                .append(String.valueOf(this.jitUserProvAssignedGroups));
        sb.append(", correlationPolicy=").append(String.valueOf(this.correlationPolicy));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider=")
                .append(
                        String.valueOf(
                                this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider=")
                .append(
                        String.valueOf(
                                this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityProvider)) {
            return false;
        }

        IdentityProvider other = (IdentityProvider) o;
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
                && java.util.Objects.equals(this.partnerName, other.partnerName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.partnerProviderId, other.partnerProviderId)
                && java.util.Objects.equals(this.tenantProviderId, other.tenantProviderId)
                && java.util.Objects.equals(this.succinctId, other.succinctId)
                && java.util.Objects.equals(this.idpSsoUrl, other.idpSsoUrl)
                && java.util.Objects.equals(this.logoutRequestUrl, other.logoutRequestUrl)
                && java.util.Objects.equals(this.logoutResponseUrl, other.logoutResponseUrl)
                && java.util.Objects.equals(this.signingCertificate, other.signingCertificate)
                && java.util.Objects.equals(this.encryptionCertificate, other.encryptionCertificate)
                && java.util.Objects.equals(this.nameIdFormat, other.nameIdFormat)
                && java.util.Objects.equals(
                        this.includeSigningCertInSignature, other.includeSigningCertInSignature)
                && java.util.Objects.equals(this.authnRequestBinding, other.authnRequestBinding)
                && java.util.Objects.equals(this.logoutBinding, other.logoutBinding)
                && java.util.Objects.equals(this.logoutEnabled, other.logoutEnabled)
                && java.util.Objects.equals(
                        this.signatureHashAlgorithm, other.signatureHashAlgorithm)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && java.util.Objects.equals(this.iconUrl, other.iconUrl)
                && java.util.Objects.equals(this.shownOnLoginPage, other.shownOnLoginPage)
                && java.util.Objects.equals(this.jitUserProvEnabled, other.jitUserProvEnabled)
                && java.util.Objects.equals(
                        this.jitUserProvGroupAssertionAttributeEnabled,
                        other.jitUserProvGroupAssertionAttributeEnabled)
                && java.util.Objects.equals(
                        this.jitUserProvGroupStaticListEnabled,
                        other.jitUserProvGroupStaticListEnabled)
                && java.util.Objects.equals(
                        this.jitUserProvCreateUserEnabled, other.jitUserProvCreateUserEnabled)
                && java.util.Objects.equals(
                        this.jitUserProvAttributeUpdateEnabled,
                        other.jitUserProvAttributeUpdateEnabled)
                && java.util.Objects.equals(
                        this.jitUserProvGroupAssignmentMethod,
                        other.jitUserProvGroupAssignmentMethod)
                && java.util.Objects.equals(
                        this.jitUserProvGroupMappingMode, other.jitUserProvGroupMappingMode)
                && java.util.Objects.equals(
                        this.jitUserProvGroupSAMLAttributeName,
                        other.jitUserProvGroupSAMLAttributeName)
                && java.util.Objects.equals(
                        this.serviceInstanceIdentifier, other.serviceInstanceIdentifier)
                && java.util.Objects.equals(this.userMappingMethod, other.userMappingMethod)
                && java.util.Objects.equals(
                        this.userMappingStoreAttribute, other.userMappingStoreAttribute)
                && java.util.Objects.equals(this.assertionAttribute, other.assertionAttribute)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.requireForceAuthn, other.requireForceAuthn)
                && java.util.Objects.equals(
                        this.requiresEncryptedAssertion, other.requiresEncryptedAssertion)
                && java.util.Objects.equals(this.samlHoKRequired, other.samlHoKRequired)
                && java.util.Objects.equals(
                        this.requestedAuthenticationContext, other.requestedAuthenticationContext)
                && java.util.Objects.equals(
                        this.jitUserProvIgnoreErrorOnAbsentGroups,
                        other.jitUserProvIgnoreErrorOnAbsentGroups)
                && java.util.Objects.equals(
                        this.lastNotificationSentTime, other.lastNotificationSentTime)
                && java.util.Objects.equals(
                        this.jitUserProvGroupMappings, other.jitUserProvGroupMappings)
                && java.util.Objects.equals(this.jitUserProvAttributes, other.jitUserProvAttributes)
                && java.util.Objects.equals(
                        this.jitUserProvAssignedGroups, other.jitUserProvAssignedGroups)
                && java.util.Objects.equals(this.correlationPolicy, other.correlationPolicy)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider)
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
        result = (result * PRIME) + (this.partnerName == null ? 43 : this.partnerName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerProviderId == null ? 43 : this.partnerProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantProviderId == null ? 43 : this.tenantProviderId.hashCode());
        result = (result * PRIME) + (this.succinctId == null ? 43 : this.succinctId.hashCode());
        result = (result * PRIME) + (this.idpSsoUrl == null ? 43 : this.idpSsoUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutRequestUrl == null ? 43 : this.logoutRequestUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.logoutResponseUrl == null ? 43 : this.logoutResponseUrl.hashCode());
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
        result = (result * PRIME) + (this.nameIdFormat == null ? 43 : this.nameIdFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.includeSigningCertInSignature == null
                                ? 43
                                : this.includeSigningCertInSignature.hashCode());
        result =
                (result * PRIME)
                        + (this.authnRequestBinding == null
                                ? 43
                                : this.authnRequestBinding.hashCode());
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
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result = (result * PRIME) + (this.iconUrl == null ? 43 : this.iconUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.shownOnLoginPage == null ? 43 : this.shownOnLoginPage.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvEnabled == null
                                ? 43
                                : this.jitUserProvEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupAssertionAttributeEnabled == null
                                ? 43
                                : this.jitUserProvGroupAssertionAttributeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupStaticListEnabled == null
                                ? 43
                                : this.jitUserProvGroupStaticListEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvCreateUserEnabled == null
                                ? 43
                                : this.jitUserProvCreateUserEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvAttributeUpdateEnabled == null
                                ? 43
                                : this.jitUserProvAttributeUpdateEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupAssignmentMethod == null
                                ? 43
                                : this.jitUserProvGroupAssignmentMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupMappingMode == null
                                ? 43
                                : this.jitUserProvGroupMappingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupSAMLAttributeName == null
                                ? 43
                                : this.jitUserProvGroupSAMLAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceInstanceIdentifier == null
                                ? 43
                                : this.serviceInstanceIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.userMappingMethod == null ? 43 : this.userMappingMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.userMappingStoreAttribute == null
                                ? 43
                                : this.userMappingStoreAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.assertionAttribute == null
                                ? 43
                                : this.assertionAttribute.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.requireForceAuthn == null ? 43 : this.requireForceAuthn.hashCode());
        result =
                (result * PRIME)
                        + (this.requiresEncryptedAssertion == null
                                ? 43
                                : this.requiresEncryptedAssertion.hashCode());
        result =
                (result * PRIME)
                        + (this.samlHoKRequired == null ? 43 : this.samlHoKRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedAuthenticationContext == null
                                ? 43
                                : this.requestedAuthenticationContext.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvIgnoreErrorOnAbsentGroups == null
                                ? 43
                                : this.jitUserProvIgnoreErrorOnAbsentGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.lastNotificationSentTime == null
                                ? 43
                                : this.lastNotificationSentTime.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvGroupMappings == null
                                ? 43
                                : this.jitUserProvGroupMappings.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvAttributes == null
                                ? 43
                                : this.jitUserProvAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.jitUserProvAssignedGroups == null
                                ? 43
                                : this.jitUserProvAssignedGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.correlationPolicy == null ? 43 : this.correlationPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionSocialIdentityProvider
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider
                                        == null
                                ? 43
                                : this
                                        .urnIetfParamsScimSchemasOracleIdcsExtensionX509IdentityProvider
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
