/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * OAuth Partner Certificate schema <br>
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
        builder = OAuthPartnerCertificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OAuthPartnerCertificate
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
        "keyStoreName",
        "map",
        "keyStorePassword",
        "keyStoreId",
        "certificateAlias",
        "sha1Thumbprint",
        "sha256Thumbprint",
        "certStartDate",
        "x509Base64Certificate",
        "certEndDate"
    })
    public OAuthPartnerCertificate(
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
            String keyStoreName,
            String map,
            String keyStorePassword,
            String keyStoreId,
            String certificateAlias,
            String sha1Thumbprint,
            String sha256Thumbprint,
            String certStartDate,
            String x509Base64Certificate,
            String certEndDate) {
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
        this.keyStoreName = keyStoreName;
        this.map = map;
        this.keyStorePassword = keyStorePassword;
        this.keyStoreId = keyStoreId;
        this.certificateAlias = certificateAlias;
        this.sha1Thumbprint = sha1Thumbprint;
        this.sha256Thumbprint = sha256Thumbprint;
        this.certStartDate = certStartDate;
        this.x509Base64Certificate = x509Base64Certificate;
        this.certEndDate = certEndDate;
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
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - mutability: readWrite - returned: default - uniqueness: none
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
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - mutability: readWrite - returned: default - uniqueness: none
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
         * Key store name
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - returned: always - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreName")
        private String keyStoreName;

        /**
         * Key store name
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - returned: always - uniqueness: none
         *
         * @param keyStoreName the value to set
         * @return this builder
         */
        public Builder keyStoreName(String keyStoreName) {
            this.keyStoreName = keyStoreName;
            this.__explicitlySet__.add("keyStoreName");
            return this;
        }
        /**
         * Map
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - returned: always - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("map")
        private String map;

        /**
         * Map
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: false - returned: always - uniqueness: none
         *
         * @param map the value to set
         * @return this builder
         */
        public Builder map(String map) {
            this.map = map;
            this.__explicitlySet__.add("map");
            return this;
        }
        /**
         * Key store password
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSensitive: none -
         * required: false - caseExact: true - returned: never - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
        private String keyStorePassword;

        /**
         * Key store password
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSensitive: none -
         * required: false - caseExact: true - returned: never - uniqueness: none
         *
         * @param keyStorePassword the value to set
         * @return this builder
         */
        public Builder keyStorePassword(String keyStorePassword) {
            this.keyStorePassword = keyStorePassword;
            this.__explicitlySet__.add("keyStorePassword");
            return this;
        }
        /**
         * Key store ID
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: never - uniqueness: none - idcsSearchable: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        /**
         * Key store ID
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: never - uniqueness: none - idcsSearchable: true
         *
         * @param keyStoreId the value to set
         * @return this builder
         */
        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }
        /**
         * Certificate alias
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true -
         * caseExact: false - mutability: readWrite - returned: always - uniqueness: none -
         * idcsSearchable: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAlias")
        private String certificateAlias;

        /**
         * Certificate alias
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true -
         * caseExact: false - mutability: readWrite - returned: always - uniqueness: none -
         * idcsSearchable: true
         *
         * @param certificateAlias the value to set
         * @return this builder
         */
        public Builder certificateAlias(String certificateAlias) {
            this.certificateAlias = certificateAlias;
            this.__explicitlySet__.add("certificateAlias");
            return this;
        }
        /**
         * SHA-1 Thumbprint
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: default - idcsSearchable: true - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sha1Thumbprint")
        private String sha1Thumbprint;

        /**
         * SHA-1 Thumbprint
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: default - idcsSearchable: true - uniqueness: none
         *
         * @param sha1Thumbprint the value to set
         * @return this builder
         */
        public Builder sha1Thumbprint(String sha1Thumbprint) {
            this.sha1Thumbprint = sha1Thumbprint;
            this.__explicitlySet__.add("sha1Thumbprint");
            return this;
        }
        /**
         * SHA-256 Thumbprint
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: default - idcsSearchable: true - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sha256Thumbprint")
        private String sha256Thumbprint;

        /**
         * SHA-256 Thumbprint
         *
         * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false -
         * caseExact: true - returned: default - idcsSearchable: true - uniqueness: none
         *
         * @param sha256Thumbprint the value to set
         * @return this builder
         */
        public Builder sha256Thumbprint(String sha256Thumbprint) {
            this.sha256Thumbprint = sha256Thumbprint;
            this.__explicitlySet__.add("sha256Thumbprint");
            return this;
        }
        /**
         * Certificate start date
         *
         * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false -
         * caseExact: true - mutability: readWrite - returned: default - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certStartDate")
        private String certStartDate;

        /**
         * Certificate start date
         *
         * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false -
         * caseExact: true - mutability: readWrite - returned: default - uniqueness: none
         *
         * @param certStartDate the value to set
         * @return this builder
         */
        public Builder certStartDate(String certStartDate) {
            this.certStartDate = certStartDate;
            this.__explicitlySet__.add("certStartDate");
            return this;
        }
        /**
         * Base 64Key data attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("x509Base64Certificate")
        private String x509Base64Certificate;

        /**
         * Base 64Key data attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param x509Base64Certificate the value to set
         * @return this builder
         */
        public Builder x509Base64Certificate(String x509Base64Certificate) {
            this.x509Base64Certificate = x509Base64Certificate;
            this.__explicitlySet__.add("x509Base64Certificate");
            return this;
        }
        /**
         * Certificate end date
         *
         * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false -
         * caseExact: true - mutability: readWrite - returned: default - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certEndDate")
        private String certEndDate;

        /**
         * Certificate end date
         *
         * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false -
         * caseExact: true - mutability: readWrite - returned: default - uniqueness: none
         *
         * @param certEndDate the value to set
         * @return this builder
         */
        public Builder certEndDate(String certEndDate) {
            this.certEndDate = certEndDate;
            this.__explicitlySet__.add("certEndDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OAuthPartnerCertificate build() {
            OAuthPartnerCertificate model =
                    new OAuthPartnerCertificate(
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
                            this.keyStoreName,
                            this.map,
                            this.keyStorePassword,
                            this.keyStoreId,
                            this.certificateAlias,
                            this.sha1Thumbprint,
                            this.sha256Thumbprint,
                            this.certStartDate,
                            this.x509Base64Certificate,
                            this.certEndDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuthPartnerCertificate model) {
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
            if (model.wasPropertyExplicitlySet("keyStoreName")) {
                this.keyStoreName(model.getKeyStoreName());
            }
            if (model.wasPropertyExplicitlySet("map")) {
                this.map(model.getMap());
            }
            if (model.wasPropertyExplicitlySet("keyStorePassword")) {
                this.keyStorePassword(model.getKeyStorePassword());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("certificateAlias")) {
                this.certificateAlias(model.getCertificateAlias());
            }
            if (model.wasPropertyExplicitlySet("sha1Thumbprint")) {
                this.sha1Thumbprint(model.getSha1Thumbprint());
            }
            if (model.wasPropertyExplicitlySet("sha256Thumbprint")) {
                this.sha256Thumbprint(model.getSha256Thumbprint());
            }
            if (model.wasPropertyExplicitlySet("certStartDate")) {
                this.certStartDate(model.getCertStartDate());
            }
            if (model.wasPropertyExplicitlySet("x509Base64Certificate")) {
                this.x509Base64Certificate(model.getX509Base64Certificate());
            }
            if (model.wasPropertyExplicitlySet("certEndDate")) {
                this.certEndDate(model.getCertEndDate());
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
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - mutability: readWrite - returned: default - uniqueness: none
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
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Key store name
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - returned: always - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreName")
    private final String keyStoreName;

    /**
     * Key store name
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - returned: always - uniqueness: none
     *
     * @return the value
     */
    public String getKeyStoreName() {
        return keyStoreName;
    }

    /**
     * Map
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - returned: always - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("map")
    private final String map;

    /**
     * Map
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * false - returned: always - uniqueness: none
     *
     * @return the value
     */
    public String getMap() {
        return map;
    }

    /**
     * Key store password
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSensitive: none -
     * required: false - caseExact: true - returned: never - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStorePassword")
    private final String keyStorePassword;

    /**
     * Key store password
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - idcsSensitive: none -
     * required: false - caseExact: true - returned: never - uniqueness: none
     *
     * @return the value
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * Key store ID
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: never - uniqueness: none - idcsSearchable: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * Key store ID
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: never - uniqueness: none - idcsSearchable: true
     *
     * @return the value
     */
    public String getKeyStoreId() {
        return keyStoreId;
    }

    /**
     * Certificate alias
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true - caseExact:
     * false - mutability: readWrite - returned: always - uniqueness: none - idcsSearchable: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAlias")
    private final String certificateAlias;

    /**
     * Certificate alias
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: true - caseExact:
     * false - mutability: readWrite - returned: always - uniqueness: none - idcsSearchable: true
     *
     * @return the value
     */
    public String getCertificateAlias() {
        return certificateAlias;
    }

    /**
     * SHA-1 Thumbprint
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: default - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sha1Thumbprint")
    private final String sha1Thumbprint;

    /**
     * SHA-1 Thumbprint
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: default - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getSha1Thumbprint() {
        return sha1Thumbprint;
    }

    /**
     * SHA-256 Thumbprint
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: default - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sha256Thumbprint")
    private final String sha256Thumbprint;

    /**
     * SHA-256 Thumbprint
     *
     * <p>*SCIM++ Properties:** - type: string - multiValued: false - required: false - caseExact:
     * true - returned: default - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getSha256Thumbprint() {
        return sha256Thumbprint;
    }

    /**
     * Certificate start date
     *
     * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false - caseExact:
     * true - mutability: readWrite - returned: default - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certStartDate")
    private final String certStartDate;

    /**
     * Certificate start date
     *
     * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false - caseExact:
     * true - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public String getCertStartDate() {
        return certStartDate;
    }

    /**
     * Base 64Key data attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("x509Base64Certificate")
    private final String x509Base64Certificate;

    /**
     * Base 64Key data attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getX509Base64Certificate() {
        return x509Base64Certificate;
    }

    /**
     * Certificate end date
     *
     * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false - caseExact:
     * true - mutability: readWrite - returned: default - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certEndDate")
    private final String certEndDate;

    /**
     * Certificate end date
     *
     * <p>*SCIM++ Properties:** - type: dateTime - multiValued: false - required: false - caseExact:
     * true - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public String getCertEndDate() {
        return certEndDate;
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
        sb.append("OAuthPartnerCertificate(");
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
        sb.append(", keyStoreName=").append(String.valueOf(this.keyStoreName));
        sb.append(", map=").append(String.valueOf(this.map));
        sb.append(", keyStorePassword=").append(String.valueOf(this.keyStorePassword));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", certificateAlias=").append(String.valueOf(this.certificateAlias));
        sb.append(", sha1Thumbprint=").append(String.valueOf(this.sha1Thumbprint));
        sb.append(", sha256Thumbprint=").append(String.valueOf(this.sha256Thumbprint));
        sb.append(", certStartDate=").append(String.valueOf(this.certStartDate));
        sb.append(", x509Base64Certificate=").append(String.valueOf(this.x509Base64Certificate));
        sb.append(", certEndDate=").append(String.valueOf(this.certEndDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuthPartnerCertificate)) {
            return false;
        }

        OAuthPartnerCertificate other = (OAuthPartnerCertificate) o;
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
                && java.util.Objects.equals(this.keyStoreName, other.keyStoreName)
                && java.util.Objects.equals(this.map, other.map)
                && java.util.Objects.equals(this.keyStorePassword, other.keyStorePassword)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.certificateAlias, other.certificateAlias)
                && java.util.Objects.equals(this.sha1Thumbprint, other.sha1Thumbprint)
                && java.util.Objects.equals(this.sha256Thumbprint, other.sha256Thumbprint)
                && java.util.Objects.equals(this.certStartDate, other.certStartDate)
                && java.util.Objects.equals(this.x509Base64Certificate, other.x509Base64Certificate)
                && java.util.Objects.equals(this.certEndDate, other.certEndDate)
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
        result = (result * PRIME) + (this.keyStoreName == null ? 43 : this.keyStoreName.hashCode());
        result = (result * PRIME) + (this.map == null ? 43 : this.map.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStorePassword == null ? 43 : this.keyStorePassword.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAlias == null ? 43 : this.certificateAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.sha1Thumbprint == null ? 43 : this.sha1Thumbprint.hashCode());
        result =
                (result * PRIME)
                        + (this.sha256Thumbprint == null ? 43 : this.sha256Thumbprint.hashCode());
        result =
                (result * PRIME)
                        + (this.certStartDate == null ? 43 : this.certStartDate.hashCode());
        result =
                (result * PRIME)
                        + (this.x509Base64Certificate == null
                                ? 43
                                : this.x509Base64Certificate.hashCode());
        result = (result * PRIME) + (this.certEndDate == null ? 43 : this.certEndDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
