/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Schema used for Identity Propagation Trust. <br>
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
        builder = IdentityPropagationTrust.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityPropagationTrust
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
        "name",
        "description",
        "type",
        "issuer",
        "accountId",
        "subjectClaimName",
        "subjectMappingAttribute",
        "subjectType",
        "clientClaimName",
        "clientClaimValues",
        "active",
        "publicKeyEndpoint",
        "publicCertificate",
        "oauthClients",
        "servicePrincipals",
        "allowImpersonation",
        "clockSkewSeconds",
        "impersonationServiceUsers",
        "keytab"
    })
    public IdentityPropagationTrust(
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
            Type type,
            String issuer,
            String accountId,
            String subjectClaimName,
            String subjectMappingAttribute,
            SubjectType subjectType,
            String clientClaimName,
            java.util.List<String> clientClaimValues,
            Boolean active,
            String publicKeyEndpoint,
            String publicCertificate,
            java.util.List<String> oauthClients,
            java.util.List<String> servicePrincipals,
            Boolean allowImpersonation,
            Integer clockSkewSeconds,
            java.util.List<IdentityPropagationTrustImpersonationServiceUsers>
                    impersonationServiceUsers,
            IdentityPropagationTrustKeytab keytab) {
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
        this.type = type;
        this.issuer = issuer;
        this.accountId = accountId;
        this.subjectClaimName = subjectClaimName;
        this.subjectMappingAttribute = subjectMappingAttribute;
        this.subjectType = subjectType;
        this.clientClaimName = clientClaimName;
        this.clientClaimValues = clientClaimValues;
        this.active = active;
        this.publicKeyEndpoint = publicKeyEndpoint;
        this.publicCertificate = publicCertificate;
        this.oauthClients = oauthClients;
        this.servicePrincipals = servicePrincipals;
        this.allowImpersonation = allowImpersonation;
        this.clockSkewSeconds = clockSkewSeconds;
        this.impersonationServiceUsers = impersonationServiceUsers;
        this.keytab = keytab;
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
         * The name of the the Identity Propagation Trust.
         *
         * <p>*SCIM++ Properties:** - type: string - caseExact: false - idcsSearchable: true -
         * multiValued: false - required: true - mutability: immutable - returned: default -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the the Identity Propagation Trust.
         *
         * <p>*SCIM++ Properties:** - type: string - caseExact: false - idcsSearchable: true -
         * multiValued: false - required: true - mutability: immutable - returned: default -
         * uniqueness: none
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
         * The description of the Identity Propagation Trust.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: false -
         * idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the Identity Propagation Trust.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: false -
         * idcsSearchable: false
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
         * The type of the inbound token from the Identity cloud provider.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - required: true -
         * mutability: readWrite - returned: default - type: string - multiValued: false -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the inbound token from the Identity cloud provider.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - required: true -
         * mutability: readWrite - returned: default - type: string - multiValued: false -
         * uniqueness: none
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
         * The issuer claim of the Identity provider.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true -
         * mutability: readWrite - returned: always - caseExact: true - idcsSearchable: true -
         * uniqueness: server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("issuer")
        private String issuer;

        /**
         * The issuer claim of the Identity provider.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true -
         * mutability: readWrite - returned: always - caseExact: true - idcsSearchable: true -
         * uniqueness: server
         *
         * @param issuer the value to set
         * @return this builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            this.__explicitlySet__.add("issuer");
            return this;
        }
        /**
         * The Identity cloud provider service identifier, for example, the Azure Tenancy ID, AWS
         * Account ID, or GCP Project ID.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - caseExact: true - idcsSearchable: true -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountId")
        private String accountId;

        /**
         * The Identity cloud provider service identifier, for example, the Azure Tenancy ID, AWS
         * Account ID, or GCP Project ID.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - caseExact: true - idcsSearchable: true -
         * uniqueness: none
         *
         * @param accountId the value to set
         * @return this builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            this.__explicitlySet__.add("accountId");
            return this;
        }
        /**
         * Used for locating the subject claim from the incoming token.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: true -
         * idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectClaimName")
        private String subjectClaimName;

        /**
         * Used for locating the subject claim from the incoming token.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: true -
         * idcsSearchable: false
         *
         * @param subjectClaimName the value to set
         * @return this builder
         */
        public Builder subjectClaimName(String subjectClaimName) {
            this.subjectClaimName = subjectClaimName;
            this.__explicitlySet__.add("subjectClaimName");
            return this;
        }
        /**
         * Subject Mapping Attribute to which the value from subject claim name value would be used
         * for identity lookup.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSearchable: false -
         * required: false - mutability: readWrite - returned: default - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectMappingAttribute")
        private String subjectMappingAttribute;

        /**
         * Subject Mapping Attribute to which the value from subject claim name value would be used
         * for identity lookup.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSearchable: false -
         * required: false - mutability: readWrite - returned: default - uniqueness: none
         *
         * @param subjectMappingAttribute the value to set
         * @return this builder
         */
        public Builder subjectMappingAttribute(String subjectMappingAttribute) {
            this.subjectMappingAttribute = subjectMappingAttribute;
            this.__explicitlySet__.add("subjectMappingAttribute");
            return this;
        }
        /**
         * The type of the resource against which lookup will be made in the identity domain in IAM
         * for the incoming subject claim value.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectType")
        private SubjectType subjectType;

        /**
         * The type of the resource against which lookup will be made in the identity domain in IAM
         * for the incoming subject claim value.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param subjectType the value to set
         * @return this builder
         */
        public Builder subjectType(SubjectType subjectType) {
            this.subjectType = subjectType;
            this.__explicitlySet__.add("subjectType");
            return this;
        }
        /**
         * The claim name that identifies to whom the JWT/SAML token is issued. If AWS, then
         * \\"aud\\" or \\"client_id\\". If Azure, then \\"appid\\". If GCP, then \\"aud\\".
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientClaimName")
        private String clientClaimName;

        /**
         * The claim name that identifies to whom the JWT/SAML token is issued. If AWS, then
         * \\"aud\\" or \\"client_id\\". If Azure, then \\"appid\\". If GCP, then \\"aud\\".
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         *
         * @param clientClaimName the value to set
         * @return this builder
         */
        public Builder clientClaimName(String clientClaimName) {
            this.clientClaimName = clientClaimName;
            this.__explicitlySet__.add("clientClaimName");
            return this;
        }
        /**
         * The value that corresponds to the client claim name used to identify to whom the token is
         * issued.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: true - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: true -
         * idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientClaimValues")
        private java.util.List<String> clientClaimValues;

        /**
         * The value that corresponds to the client claim name used to identify to whom the token is
         * issued.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: true - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: true -
         * idcsSearchable: false
         *
         * @param clientClaimValues the value to set
         * @return this builder
         */
        public Builder clientClaimValues(java.util.List<String> clientClaimValues) {
            this.clientClaimValues = clientClaimValues;
            this.__explicitlySet__.add("clientClaimValues");
            return this;
        }
        /**
         * If true, specifies that this Identity Propagation Trust is in an enabled state. The
         * default value is false.
         *
         * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * If true, specifies that this Identity Propagation Trust is in an enabled state. The
         * default value is false.
         *
         * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: true
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
         * The cloud provider's public key API of SAML and OIDC providers for signature validation.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: false -
         * idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyEndpoint")
        private String publicKeyEndpoint;

        /**
         * The cloud provider's public key API of SAML and OIDC providers for signature validation.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - caseExact: false -
         * idcsSearchable: false
         *
         * @param publicKeyEndpoint the value to set
         * @return this builder
         */
        public Builder publicKeyEndpoint(String publicKeyEndpoint) {
            this.publicKeyEndpoint = publicKeyEndpoint;
            this.__explicitlySet__.add("publicKeyEndpoint");
            return this;
        }
        /**
         * Store the public key if public key cert.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        /**
         * Store the public key if public key cert.
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         *
         * @param publicCertificate the value to set
         * @return this builder
         */
        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }
        /**
         * The value of all the authorized OAuth Clients.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oauthClients")
        private java.util.List<String> oauthClients;

        /**
         * The value of all the authorized OAuth Clients.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param oauthClients the value to set
         * @return this builder
         */
        public Builder oauthClients(java.util.List<String> oauthClients) {
            this.oauthClients = oauthClients;
            this.__explicitlySet__.add("oauthClients");
            return this;
        }
        /**
         * The value of all the authorized OCI Service Principals.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipals")
        private java.util.List<String> servicePrincipals;

        /**
         * The value of all the authorized OCI Service Principals.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param servicePrincipals the value to set
         * @return this builder
         */
        public Builder servicePrincipals(java.util.List<String> servicePrincipals) {
            this.servicePrincipals = servicePrincipals;
            this.__explicitlySet__.add("servicePrincipals");
            return this;
        }
        /**
         * Allow customers to define whether the resulting token should contain the authenticated
         * user as the subject or whether the token should impersonate another Application Principal
         * in IAM.
         *
         * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowImpersonation")
        private Boolean allowImpersonation;

        /**
         * Allow customers to define whether the resulting token should contain the authenticated
         * user as the subject or whether the token should impersonate another Application Principal
         * in IAM.
         *
         * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false -
         * mutability: readWrite - returned: default - uniqueness: none - idcsSearchable: false
         *
         * @param allowImpersonation the value to set
         * @return this builder
         */
        public Builder allowImpersonation(Boolean allowImpersonation) {
            this.allowImpersonation = allowImpersonation;
            this.__explicitlySet__.add("allowImpersonation");
            return this;
        }
        /**
         * The clock skew (in secs) that's allowed for the token issue and expiry time.
         *
         * <p>*Added In:** 2308181911
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clockSkewSeconds")
        private Integer clockSkewSeconds;

        /**
         * The clock skew (in secs) that's allowed for the token issue and expiry time.
         *
         * <p>*Added In:** 2308181911
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: integer -
         * uniqueness: none
         *
         * @param clockSkewSeconds the value to set
         * @return this builder
         */
        public Builder clockSkewSeconds(Integer clockSkewSeconds) {
            this.clockSkewSeconds = clockSkewSeconds;
            this.__explicitlySet__.add("clockSkewSeconds");
            return this;
        }
        /**
         * The Impersonating Principal.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [rule, value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("impersonationServiceUsers")
        private java.util.List<IdentityPropagationTrustImpersonationServiceUsers>
                impersonationServiceUsers;

        /**
         * The Impersonating Principal.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [rule, value] - idcsSearchable: false -
         * multiValued: true - mutability: readWrite - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param impersonationServiceUsers the value to set
         * @return this builder
         */
        public Builder impersonationServiceUsers(
                java.util.List<IdentityPropagationTrustImpersonationServiceUsers>
                        impersonationServiceUsers) {
            this.impersonationServiceUsers = impersonationServiceUsers;
            this.__explicitlySet__.add("impersonationServiceUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keytab")
        private IdentityPropagationTrustKeytab keytab;

        public Builder keytab(IdentityPropagationTrustKeytab keytab) {
            this.keytab = keytab;
            this.__explicitlySet__.add("keytab");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityPropagationTrust build() {
            IdentityPropagationTrust model =
                    new IdentityPropagationTrust(
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
                            this.type,
                            this.issuer,
                            this.accountId,
                            this.subjectClaimName,
                            this.subjectMappingAttribute,
                            this.subjectType,
                            this.clientClaimName,
                            this.clientClaimValues,
                            this.active,
                            this.publicKeyEndpoint,
                            this.publicCertificate,
                            this.oauthClients,
                            this.servicePrincipals,
                            this.allowImpersonation,
                            this.clockSkewSeconds,
                            this.impersonationServiceUsers,
                            this.keytab);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityPropagationTrust model) {
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
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("issuer")) {
                this.issuer(model.getIssuer());
            }
            if (model.wasPropertyExplicitlySet("accountId")) {
                this.accountId(model.getAccountId());
            }
            if (model.wasPropertyExplicitlySet("subjectClaimName")) {
                this.subjectClaimName(model.getSubjectClaimName());
            }
            if (model.wasPropertyExplicitlySet("subjectMappingAttribute")) {
                this.subjectMappingAttribute(model.getSubjectMappingAttribute());
            }
            if (model.wasPropertyExplicitlySet("subjectType")) {
                this.subjectType(model.getSubjectType());
            }
            if (model.wasPropertyExplicitlySet("clientClaimName")) {
                this.clientClaimName(model.getClientClaimName());
            }
            if (model.wasPropertyExplicitlySet("clientClaimValues")) {
                this.clientClaimValues(model.getClientClaimValues());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("publicKeyEndpoint")) {
                this.publicKeyEndpoint(model.getPublicKeyEndpoint());
            }
            if (model.wasPropertyExplicitlySet("publicCertificate")) {
                this.publicCertificate(model.getPublicCertificate());
            }
            if (model.wasPropertyExplicitlySet("oauthClients")) {
                this.oauthClients(model.getOauthClients());
            }
            if (model.wasPropertyExplicitlySet("servicePrincipals")) {
                this.servicePrincipals(model.getServicePrincipals());
            }
            if (model.wasPropertyExplicitlySet("allowImpersonation")) {
                this.allowImpersonation(model.getAllowImpersonation());
            }
            if (model.wasPropertyExplicitlySet("clockSkewSeconds")) {
                this.clockSkewSeconds(model.getClockSkewSeconds());
            }
            if (model.wasPropertyExplicitlySet("impersonationServiceUsers")) {
                this.impersonationServiceUsers(model.getImpersonationServiceUsers());
            }
            if (model.wasPropertyExplicitlySet("keytab")) {
                this.keytab(model.getKeytab());
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
     * The name of the the Identity Propagation Trust.
     *
     * <p>*SCIM++ Properties:** - type: string - caseExact: false - idcsSearchable: true -
     * multiValued: false - required: true - mutability: immutable - returned: default - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the the Identity Propagation Trust.
     *
     * <p>*SCIM++ Properties:** - type: string - caseExact: false - idcsSearchable: true -
     * multiValued: false - required: true - mutability: immutable - returned: default - uniqueness:
     * none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The description of the Identity Propagation Trust.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: false - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the Identity Propagation Trust.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: false - idcsSearchable: false
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The type of the inbound token from the Identity cloud provider.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - required: true -
     * mutability: readWrite - returned: default - type: string - multiValued: false - uniqueness:
     * none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Jwt("JWT"),
        Saml("SAML"),
        Spnego("SPNEGO"),
        Aws("AWS"),

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
     * The type of the inbound token from the Identity cloud provider.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - required: true -
     * mutability: readWrite - returned: default - type: string - multiValued: false - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the inbound token from the Identity cloud provider.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - required: true -
     * mutability: readWrite - returned: default - type: string - multiValued: false - uniqueness:
     * none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The issuer claim of the Identity provider.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true - mutability:
     * readWrite - returned: always - caseExact: true - idcsSearchable: true - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    private final String issuer;

    /**
     * The issuer claim of the Identity provider.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true - mutability:
     * readWrite - returned: always - caseExact: true - idcsSearchable: true - uniqueness: server
     *
     * @return the value
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * The Identity cloud provider service identifier, for example, the Azure Tenancy ID, AWS
     * Account ID, or GCP Project ID.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - caseExact: true - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountId")
    private final String accountId;

    /**
     * The Identity cloud provider service identifier, for example, the Azure Tenancy ID, AWS
     * Account ID, or GCP Project ID.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - caseExact: true - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Used for locating the subject claim from the incoming token.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: true - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectClaimName")
    private final String subjectClaimName;

    /**
     * Used for locating the subject claim from the incoming token.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: true - idcsSearchable: false
     *
     * @return the value
     */
    public String getSubjectClaimName() {
        return subjectClaimName;
    }

    /**
     * Subject Mapping Attribute to which the value from subject claim name value would be used for
     * identity lookup.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSearchable: false -
     * required: false - mutability: readWrite - returned: default - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectMappingAttribute")
    private final String subjectMappingAttribute;

    /**
     * Subject Mapping Attribute to which the value from subject claim name value would be used for
     * identity lookup.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSearchable: false -
     * required: false - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public String getSubjectMappingAttribute() {
        return subjectMappingAttribute;
    }

    /**
     * The type of the resource against which lookup will be made in the identity domain in IAM for
     * the incoming subject claim value.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    public enum SubjectType implements com.oracle.bmc.http.internal.BmcEnum {
        User("User"),
        App("App"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SubjectType.class);

        private final String value;
        private static java.util.Map<String, SubjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (SubjectType v : SubjectType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SubjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SubjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SubjectType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the resource against which lookup will be made in the identity domain in IAM for
     * the incoming subject claim value.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectType")
    private final SubjectType subjectType;

    /**
     * The type of the resource against which lookup will be made in the identity domain in IAM for
     * the incoming subject claim value.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SubjectType getSubjectType() {
        return subjectType;
    }

    /**
     * The claim name that identifies to whom the JWT/SAML token is issued. If AWS, then \\"aud\\"
     * or \\"client_id\\". If Azure, then \\"appid\\". If GCP, then \\"aud\\".
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientClaimName")
    private final String clientClaimName;

    /**
     * The claim name that identifies to whom the JWT/SAML token is issued. If AWS, then \\"aud\\"
     * or \\"client_id\\". If Azure, then \\"appid\\". If GCP, then \\"aud\\".
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     *
     * @return the value
     */
    public String getClientClaimName() {
        return clientClaimName;
    }

    /**
     * The value that corresponds to the client claim name used to identify to whom the token is
     * issued.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: true - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: true - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientClaimValues")
    private final java.util.List<String> clientClaimValues;

    /**
     * The value that corresponds to the client claim name used to identify to whom the token is
     * issued.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: true - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: true - idcsSearchable: false
     *
     * @return the value
     */
    public java.util.List<String> getClientClaimValues() {
        return clientClaimValues;
    }

    /**
     * If true, specifies that this Identity Propagation Trust is in an enabled state. The default
     * value is false.
     *
     * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * If true, specifies that this Identity Propagation Trust is in an enabled state. The default
     * value is false.
     *
     * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: true
     *
     * @return the value
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * The cloud provider's public key API of SAML and OIDC providers for signature validation.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: false - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyEndpoint")
    private final String publicKeyEndpoint;

    /**
     * The cloud provider's public key API of SAML and OIDC providers for signature validation.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - caseExact: false - idcsSearchable: false
     *
     * @return the value
     */
    public String getPublicKeyEndpoint() {
        return publicKeyEndpoint;
    }

    /**
     * Store the public key if public key cert.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    private final String publicCertificate;

    /**
     * Store the public key if public key cert.
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     *
     * @return the value
     */
    public String getPublicCertificate() {
        return publicCertificate;
    }

    /**
     * The value of all the authorized OAuth Clients.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oauthClients")
    private final java.util.List<String> oauthClients;

    /**
     * The value of all the authorized OAuth Clients.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getOauthClients() {
        return oauthClients;
    }

    /**
     * The value of all the authorized OCI Service Principals.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePrincipals")
    private final java.util.List<String> servicePrincipals;

    /**
     * The value of all the authorized OCI Service Principals.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getServicePrincipals() {
        return servicePrincipals;
    }

    /**
     * Allow customers to define whether the resulting token should contain the authenticated user
     * as the subject or whether the token should impersonate another Application Principal in IAM.
     *
     * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowImpersonation")
    private final Boolean allowImpersonation;

    /**
     * Allow customers to define whether the resulting token should contain the authenticated user
     * as the subject or whether the token should impersonate another Application Principal in IAM.
     *
     * <p>*SCIM++ Properties:** - type: boolean - multiValued: false - required: false - mutability:
     * readWrite - returned: default - uniqueness: none - idcsSearchable: false
     *
     * @return the value
     */
    public Boolean getAllowImpersonation() {
        return allowImpersonation;
    }

    /**
     * The clock skew (in secs) that's allowed for the token issue and expiry time.
     *
     * <p>*Added In:** 2308181911
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clockSkewSeconds")
    private final Integer clockSkewSeconds;

    /**
     * The clock skew (in secs) that's allowed for the token issue and expiry time.
     *
     * <p>*Added In:** 2308181911
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getClockSkewSeconds() {
        return clockSkewSeconds;
    }

    /**
     * The Impersonating Principal.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [rule, value] - idcsSearchable: false -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("impersonationServiceUsers")
    private final java.util.List<IdentityPropagationTrustImpersonationServiceUsers>
            impersonationServiceUsers;

    /**
     * The Impersonating Principal.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [rule, value] - idcsSearchable: false -
     * multiValued: true - mutability: readWrite - required: false - returned: request - type:
     * complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<IdentityPropagationTrustImpersonationServiceUsers>
            getImpersonationServiceUsers() {
        return impersonationServiceUsers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keytab")
    private final IdentityPropagationTrustKeytab keytab;

    public IdentityPropagationTrustKeytab getKeytab() {
        return keytab;
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
        sb.append("IdentityPropagationTrust(");
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
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", issuer=").append(String.valueOf(this.issuer));
        sb.append(", accountId=").append(String.valueOf(this.accountId));
        sb.append(", subjectClaimName=").append(String.valueOf(this.subjectClaimName));
        sb.append(", subjectMappingAttribute=")
                .append(String.valueOf(this.subjectMappingAttribute));
        sb.append(", subjectType=").append(String.valueOf(this.subjectType));
        sb.append(", clientClaimName=").append(String.valueOf(this.clientClaimName));
        sb.append(", clientClaimValues=").append(String.valueOf(this.clientClaimValues));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", publicKeyEndpoint=").append(String.valueOf(this.publicKeyEndpoint));
        sb.append(", publicCertificate=").append(String.valueOf(this.publicCertificate));
        sb.append(", oauthClients=").append(String.valueOf(this.oauthClients));
        sb.append(", servicePrincipals=").append(String.valueOf(this.servicePrincipals));
        sb.append(", allowImpersonation=").append(String.valueOf(this.allowImpersonation));
        sb.append(", clockSkewSeconds=").append(String.valueOf(this.clockSkewSeconds));
        sb.append(", impersonationServiceUsers=")
                .append(String.valueOf(this.impersonationServiceUsers));
        sb.append(", keytab=").append(String.valueOf(this.keytab));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityPropagationTrust)) {
            return false;
        }

        IdentityPropagationTrust other = (IdentityPropagationTrust) o;
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
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.issuer, other.issuer)
                && java.util.Objects.equals(this.accountId, other.accountId)
                && java.util.Objects.equals(this.subjectClaimName, other.subjectClaimName)
                && java.util.Objects.equals(
                        this.subjectMappingAttribute, other.subjectMappingAttribute)
                && java.util.Objects.equals(this.subjectType, other.subjectType)
                && java.util.Objects.equals(this.clientClaimName, other.clientClaimName)
                && java.util.Objects.equals(this.clientClaimValues, other.clientClaimValues)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.publicKeyEndpoint, other.publicKeyEndpoint)
                && java.util.Objects.equals(this.publicCertificate, other.publicCertificate)
                && java.util.Objects.equals(this.oauthClients, other.oauthClients)
                && java.util.Objects.equals(this.servicePrincipals, other.servicePrincipals)
                && java.util.Objects.equals(this.allowImpersonation, other.allowImpersonation)
                && java.util.Objects.equals(this.clockSkewSeconds, other.clockSkewSeconds)
                && java.util.Objects.equals(
                        this.impersonationServiceUsers, other.impersonationServiceUsers)
                && java.util.Objects.equals(this.keytab, other.keytab)
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
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.issuer == null ? 43 : this.issuer.hashCode());
        result = (result * PRIME) + (this.accountId == null ? 43 : this.accountId.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectClaimName == null ? 43 : this.subjectClaimName.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectMappingAttribute == null
                                ? 43
                                : this.subjectMappingAttribute.hashCode());
        result = (result * PRIME) + (this.subjectType == null ? 43 : this.subjectType.hashCode());
        result =
                (result * PRIME)
                        + (this.clientClaimName == null ? 43 : this.clientClaimName.hashCode());
        result =
                (result * PRIME)
                        + (this.clientClaimValues == null ? 43 : this.clientClaimValues.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyEndpoint == null ? 43 : this.publicKeyEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.publicCertificate == null ? 43 : this.publicCertificate.hashCode());
        result = (result * PRIME) + (this.oauthClients == null ? 43 : this.oauthClients.hashCode());
        result =
                (result * PRIME)
                        + (this.servicePrincipals == null ? 43 : this.servicePrincipals.hashCode());
        result =
                (result * PRIME)
                        + (this.allowImpersonation == null
                                ? 43
                                : this.allowImpersonation.hashCode());
        result =
                (result * PRIME)
                        + (this.clockSkewSeconds == null ? 43 : this.clockSkewSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.impersonationServiceUsers == null
                                ? 43
                                : this.impersonationServiceUsers.hashCode());
        result = (result * PRIME) + (this.keytab == null ? 43 : this.keytab.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
