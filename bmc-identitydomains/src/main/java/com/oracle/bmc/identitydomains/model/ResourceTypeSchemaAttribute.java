/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * ResourceTypeSchemaAttribute Schema Definition <br>
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
        builder = ResourceTypeSchemaAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceTypeSchemaAttribute
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
        "idcsDisplayNameMessageId",
        "resourceType",
        "idcsSchemaUrn",
        "idcsFullyQualifiedName",
        "idcsCustomAttribute",
        "type",
        "multiValued",
        "description",
        "required",
        "canonicalValues",
        "caseExact",
        "mutability",
        "endUserMutability",
        "endUserMutabilityAllowedValues",
        "returned",
        "uniqueness",
        "idcsCsvColumnHeaderName",
        "idcsICFBundleAttributeName",
        "idcsICFRequired",
        "idcsICFAttributeType",
        "referenceTypes",
        "idcsDeprecatedSinceVersion",
        "idcsAddedSinceVersion",
        "idcsDeprecatedSinceReleaseNumber",
        "idcsAddedSinceReleaseNumber",
        "idcsMinLength",
        "idcsMaxLength",
        "idcsMinValue",
        "idcsMaxValue",
        "idcsMultiLanguage",
        "idcsRefResourceAttributes",
        "idcsIndirectRefResourceAttributes",
        "idcsAutoIncrementSeqName",
        "idcsValuePersisted",
        "idcsSensitive",
        "idcsInternal",
        "idcsTrimStringValue",
        "idcsSearchable",
        "idcsGenerated",
        "idcsAuditable",
        "idcsTargetAttributeName",
        "idcsTargetUniqueConstraintName",
        "idcsTargetNormAttributeName",
        "idcsTargetAttributeNameToMigrateFrom",
        "idcsToTargetMapper",
        "idcsFromTargetMapper",
        "idcsDisplayName",
        "idcsCanonicalValueSourceResourceType",
        "idcsCanonicalValueSourceFilter",
        "idcsValidateReference",
        "idcsCompositeKey",
        "idcsFetchComplexAttributeValues",
        "idcsScimCompliant",
        "idcsAttributeMappable",
        "idcsRefResourceAttribute",
        "idcsAttributeCacheable"
    })
    public ResourceTypeSchemaAttribute(
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
            String idcsDisplayNameMessageId,
            String resourceType,
            String idcsSchemaUrn,
            String idcsFullyQualifiedName,
            Boolean idcsCustomAttribute,
            Type type,
            Boolean multiValued,
            String description,
            Boolean required,
            java.util.List<String> canonicalValues,
            Boolean caseExact,
            Mutability mutability,
            EndUserMutability endUserMutability,
            java.util.List<EndUserMutabilityAllowedValues> endUserMutabilityAllowedValues,
            Returned returned,
            Uniqueness uniqueness,
            String idcsCsvColumnHeaderName,
            String idcsICFBundleAttributeName,
            Boolean idcsICFRequired,
            IdcsICFAttributeType idcsICFAttributeType,
            java.util.List<String> referenceTypes,
            Integer idcsDeprecatedSinceVersion,
            Integer idcsAddedSinceVersion,
            String idcsDeprecatedSinceReleaseNumber,
            String idcsAddedSinceReleaseNumber,
            Integer idcsMinLength,
            Integer idcsMaxLength,
            Integer idcsMinValue,
            Integer idcsMaxValue,
            Boolean idcsMultiLanguage,
            java.util.List<String> idcsRefResourceAttributes,
            java.util.List<String> idcsIndirectRefResourceAttributes,
            String idcsAutoIncrementSeqName,
            Boolean idcsValuePersisted,
            IdcsSensitive idcsSensitive,
            Boolean idcsInternal,
            Boolean idcsTrimStringValue,
            Boolean idcsSearchable,
            Boolean idcsGenerated,
            Boolean idcsAuditable,
            String idcsTargetAttributeName,
            String idcsTargetUniqueConstraintName,
            String idcsTargetNormAttributeName,
            String idcsTargetAttributeNameToMigrateFrom,
            String idcsToTargetMapper,
            String idcsFromTargetMapper,
            String idcsDisplayName,
            String idcsCanonicalValueSourceResourceType,
            String idcsCanonicalValueSourceFilter,
            Boolean idcsValidateReference,
            java.util.List<String> idcsCompositeKey,
            Boolean idcsFetchComplexAttributeValues,
            Boolean idcsScimCompliant,
            Boolean idcsAttributeMappable,
            String idcsRefResourceAttribute,
            Boolean idcsAttributeCacheable) {
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
        this.idcsDisplayNameMessageId = idcsDisplayNameMessageId;
        this.resourceType = resourceType;
        this.idcsSchemaUrn = idcsSchemaUrn;
        this.idcsFullyQualifiedName = idcsFullyQualifiedName;
        this.idcsCustomAttribute = idcsCustomAttribute;
        this.type = type;
        this.multiValued = multiValued;
        this.description = description;
        this.required = required;
        this.canonicalValues = canonicalValues;
        this.caseExact = caseExact;
        this.mutability = mutability;
        this.endUserMutability = endUserMutability;
        this.endUserMutabilityAllowedValues = endUserMutabilityAllowedValues;
        this.returned = returned;
        this.uniqueness = uniqueness;
        this.idcsCsvColumnHeaderName = idcsCsvColumnHeaderName;
        this.idcsICFBundleAttributeName = idcsICFBundleAttributeName;
        this.idcsICFRequired = idcsICFRequired;
        this.idcsICFAttributeType = idcsICFAttributeType;
        this.referenceTypes = referenceTypes;
        this.idcsDeprecatedSinceVersion = idcsDeprecatedSinceVersion;
        this.idcsAddedSinceVersion = idcsAddedSinceVersion;
        this.idcsDeprecatedSinceReleaseNumber = idcsDeprecatedSinceReleaseNumber;
        this.idcsAddedSinceReleaseNumber = idcsAddedSinceReleaseNumber;
        this.idcsMinLength = idcsMinLength;
        this.idcsMaxLength = idcsMaxLength;
        this.idcsMinValue = idcsMinValue;
        this.idcsMaxValue = idcsMaxValue;
        this.idcsMultiLanguage = idcsMultiLanguage;
        this.idcsRefResourceAttributes = idcsRefResourceAttributes;
        this.idcsIndirectRefResourceAttributes = idcsIndirectRefResourceAttributes;
        this.idcsAutoIncrementSeqName = idcsAutoIncrementSeqName;
        this.idcsValuePersisted = idcsValuePersisted;
        this.idcsSensitive = idcsSensitive;
        this.idcsInternal = idcsInternal;
        this.idcsTrimStringValue = idcsTrimStringValue;
        this.idcsSearchable = idcsSearchable;
        this.idcsGenerated = idcsGenerated;
        this.idcsAuditable = idcsAuditable;
        this.idcsTargetAttributeName = idcsTargetAttributeName;
        this.idcsTargetUniqueConstraintName = idcsTargetUniqueConstraintName;
        this.idcsTargetNormAttributeName = idcsTargetNormAttributeName;
        this.idcsTargetAttributeNameToMigrateFrom = idcsTargetAttributeNameToMigrateFrom;
        this.idcsToTargetMapper = idcsToTargetMapper;
        this.idcsFromTargetMapper = idcsFromTargetMapper;
        this.idcsDisplayName = idcsDisplayName;
        this.idcsCanonicalValueSourceResourceType = idcsCanonicalValueSourceResourceType;
        this.idcsCanonicalValueSourceFilter = idcsCanonicalValueSourceFilter;
        this.idcsValidateReference = idcsValidateReference;
        this.idcsCompositeKey = idcsCompositeKey;
        this.idcsFetchComplexAttributeValues = idcsFetchComplexAttributeValues;
        this.idcsScimCompliant = idcsScimCompliant;
        this.idcsAttributeMappable = idcsAttributeMappable;
        this.idcsRefResourceAttribute = idcsRefResourceAttribute;
        this.idcsAttributeCacheable = idcsAttributeCacheable;
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
         * Attribute's name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Attribute's name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
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
         * Localized schema attribute display name for use by UI client for displaying attribute
         * labels
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
        private String idcsDisplayNameMessageId;

        /**
         * Localized schema attribute display name for use by UI client for displaying attribute
         * labels
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         *
         * @param idcsDisplayNameMessageId the value to set
         * @return this builder
         */
        public Builder idcsDisplayNameMessageId(String idcsDisplayNameMessageId) {
            this.idcsDisplayNameMessageId = idcsDisplayNameMessageId;
            this.__explicitlySet__.add("idcsDisplayNameMessageId");
            return this;
        }
        /**
         * ResourceType this attribute belongs to.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * ResourceType this attribute belongs to.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Schema URN string that this attribute belongs to
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSchemaUrn")
        private String idcsSchemaUrn;

        /**
         * Schema URN string that this attribute belongs to
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         *
         * @param idcsSchemaUrn the value to set
         * @return this builder
         */
        public Builder idcsSchemaUrn(String idcsSchemaUrn) {
            this.idcsSchemaUrn = idcsSchemaUrn;
            this.__explicitlySet__.add("idcsSchemaUrn");
            return this;
        }
        /**
         * Fully qualified name of this attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFullyQualifiedName")
        private String idcsFullyQualifiedName;

        /**
         * Fully qualified name of this attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - idcsSearchable: true - uniqueness:
         * none
         *
         * @param idcsFullyQualifiedName the value to set
         * @return this builder
         */
        public Builder idcsFullyQualifiedName(String idcsFullyQualifiedName) {
            this.idcsFullyQualifiedName = idcsFullyQualifiedName;
            this.__explicitlySet__.add("idcsFullyQualifiedName");
            return this;
        }
        /**
         * custom attribute flag.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - idcsSearchable: true -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCustomAttribute")
        private Boolean idcsCustomAttribute;

        /**
         * custom attribute flag.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - idcsSearchable: true -
         * uniqueness: none
         *
         * @param idcsCustomAttribute the value to set
         * @return this builder
         */
        public Builder idcsCustomAttribute(Boolean idcsCustomAttribute) {
            this.idcsCustomAttribute = idcsCustomAttribute;
            this.__explicitlySet__.add("idcsCustomAttribute");
            return this;
        }
        /**
         * The attribute's data type--for example, String
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The attribute's data type--for example, String
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
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
         * Indicates the attribute's plurality
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
        private Boolean multiValued;

        /**
         * Indicates the attribute's plurality
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param multiValued the value to set
         * @return this builder
         */
        public Builder multiValued(Boolean multiValued) {
            this.multiValued = multiValued;
            this.__explicitlySet__.add("multiValued");
            return this;
        }
        /**
         * The attribute's human-readable description
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The attribute's human-readable description
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
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
         * Specifies if the attribute is required
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Specifies if the attribute is required
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param required the value to set
         * @return this builder
         */
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical
         * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
        private java.util.List<String> canonicalValues;

        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical
         * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param canonicalValues the value to set
         * @return this builder
         */
        public Builder canonicalValues(java.util.List<String> canonicalValues) {
            this.canonicalValues = canonicalValues;
            this.__explicitlySet__.add("canonicalValues");
            return this;
        }
        /**
         * Specifies if the String attribute is case-sensitive
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
        private Boolean caseExact;

        /**
         * Specifies if the String attribute is case-sensitive
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param caseExact the value to set
         * @return this builder
         */
        public Builder caseExact(Boolean caseExact) {
            this.caseExact = caseExact;
            this.__explicitlySet__.add("caseExact");
            return this;
        }
        /**
         * Specifies if the attribute is mutable
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mutability")
        private Mutability mutability;

        /**
         * Specifies if the attribute is mutable
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         *
         * @param mutability the value to set
         * @return this builder
         */
        public Builder mutability(Mutability mutability) {
            this.mutability = mutability;
            this.__explicitlySet__.add("mutability");
            return this;
        }
        /**
         * Specifies User mutability for this attribute
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserMutability")
        private EndUserMutability endUserMutability;

        /**
         * Specifies User mutability for this attribute
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param endUserMutability the value to set
         * @return this builder
         */
        public Builder endUserMutability(EndUserMutability endUserMutability) {
            this.endUserMutability = endUserMutability;
            this.__explicitlySet__.add("endUserMutability");
            return this;
        }
        /**
         * Specifies the list of User mutabilities allowed
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserMutabilityAllowedValues")
        private java.util.List<EndUserMutabilityAllowedValues> endUserMutabilityAllowedValues;

        /**
         * Specifies the list of User mutabilities allowed
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param endUserMutabilityAllowedValues the value to set
         * @return this builder
         */
        public Builder endUserMutabilityAllowedValues(
                java.util.List<EndUserMutabilityAllowedValues> endUserMutabilityAllowedValues) {
            this.endUserMutabilityAllowedValues = endUserMutabilityAllowedValues;
            this.__explicitlySet__.add("endUserMutabilityAllowedValues");
            return this;
        }
        /**
         * A single keyword that indicates when an attribute and associated values are returned in
         * response to a GET request or in response to a PUT, POST, or PATCH request
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("returned")
        private Returned returned;

        /**
         * A single keyword that indicates when an attribute and associated values are returned in
         * response to a GET request or in response to a PUT, POST, or PATCH request
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         *
         * @param returned the value to set
         * @return this builder
         */
        public Builder returned(Returned returned) {
            this.returned = returned;
            this.__explicitlySet__.add("returned");
            return this;
        }
        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of
         * attribute values. A server MAY reject an invalid value based on uniqueness by returning
         * an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client
         * side to a greater degree than the Service Provider enforces. For example, a client could
         * make a value unique while the server has the uniqueness of \\"none\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - required: false -
         * returned: default - idcsSearchable: true - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
        private Uniqueness uniqueness;

        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of
         * attribute values. A server MAY reject an invalid value based on uniqueness by returning
         * an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client
         * side to a greater degree than the Service Provider enforces. For example, a client could
         * make a value unique while the server has the uniqueness of \\"none\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - required: false -
         * returned: default - idcsSearchable: true - type: string - uniqueness: none
         *
         * @param uniqueness the value to set
         * @return this builder
         */
        public Builder uniqueness(Uniqueness uniqueness) {
            this.uniqueness = uniqueness;
            this.__explicitlySet__.add("uniqueness");
            return this;
        }
        /**
         * The attribute defining the CSV column header name for import/export
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvColumnHeaderName")
        private String idcsCsvColumnHeaderName;

        /**
         * The attribute defining the CSV column header name for import/export
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsCsvColumnHeaderName the value to set
         * @return this builder
         */
        public Builder idcsCsvColumnHeaderName(String idcsCsvColumnHeaderName) {
            this.idcsCsvColumnHeaderName = idcsCsvColumnHeaderName;
            this.__explicitlySet__.add("idcsCsvColumnHeaderName");
            return this;
        }
        /**
         * Maps to ICF target attribute name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFBundleAttributeName")
        private String idcsICFBundleAttributeName;

        /**
         * Maps to ICF target attribute name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsICFBundleAttributeName the value to set
         * @return this builder
         */
        public Builder idcsICFBundleAttributeName(String idcsICFBundleAttributeName) {
            this.idcsICFBundleAttributeName = idcsICFBundleAttributeName;
            this.__explicitlySet__.add("idcsICFBundleAttributeName");
            return this;
        }
        /**
         * Metadata to identify the ICF required attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFRequired")
        private Boolean idcsICFRequired;

        /**
         * Metadata to identify the ICF required attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param idcsICFRequired the value to set
         * @return this builder
         */
        public Builder idcsICFRequired(Boolean idcsICFRequired) {
            this.idcsICFRequired = idcsICFRequired;
            this.__explicitlySet__.add("idcsICFRequired");
            return this;
        }
        /**
         * Maps to ICF data type
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * idcsSearchable: true - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFAttributeType")
        private IdcsICFAttributeType idcsICFAttributeType;

        /**
         * Maps to ICF data type
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * idcsSearchable: true - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsICFAttributeType the value to set
         * @return this builder
         */
        public Builder idcsICFAttributeType(IdcsICFAttributeType idcsICFAttributeType) {
            this.idcsICFAttributeType = idcsICFAttributeType;
            this.__explicitlySet__.add("idcsICFAttributeType");
            return this;
        }
        /**
         * The names of the Resource types that may be referenced--for example, User. This is only
         * applicable for attributes that are of the \\"reference\\" data type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
        private java.util.List<String> referenceTypes;

        /**
         * The names of the Resource types that may be referenced--for example, User. This is only
         * applicable for attributes that are of the \\"reference\\" data type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param referenceTypes the value to set
         * @return this builder
         */
        public Builder referenceTypes(java.util.List<String> referenceTypes) {
            this.referenceTypes = referenceTypes;
            this.__explicitlySet__.add("referenceTypes");
            return this;
        }
        /**
         * Indicates that the schema has been deprecated since version
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
        private Integer idcsDeprecatedSinceVersion;

        /**
         * Indicates that the schema has been deprecated since version
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         *
         * @param idcsDeprecatedSinceVersion the value to set
         * @return this builder
         */
        public Builder idcsDeprecatedSinceVersion(Integer idcsDeprecatedSinceVersion) {
            this.idcsDeprecatedSinceVersion = idcsDeprecatedSinceVersion;
            this.__explicitlySet__.add("idcsDeprecatedSinceVersion");
            return this;
        }
        /**
         * Indicates that the schema has been added since version
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
        private Integer idcsAddedSinceVersion;

        /**
         * Indicates that the schema has been added since version
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         *
         * @param idcsAddedSinceVersion the value to set
         * @return this builder
         */
        public Builder idcsAddedSinceVersion(Integer idcsAddedSinceVersion) {
            this.idcsAddedSinceVersion = idcsAddedSinceVersion;
            this.__explicitlySet__.add("idcsAddedSinceVersion");
            return this;
        }
        /**
         * Indicates that the schema has been deprecated since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
        private String idcsDeprecatedSinceReleaseNumber;

        /**
         * Indicates that the schema has been deprecated since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         *
         * @param idcsDeprecatedSinceReleaseNumber the value to set
         * @return this builder
         */
        public Builder idcsDeprecatedSinceReleaseNumber(String idcsDeprecatedSinceReleaseNumber) {
            this.idcsDeprecatedSinceReleaseNumber = idcsDeprecatedSinceReleaseNumber;
            this.__explicitlySet__.add("idcsDeprecatedSinceReleaseNumber");
            return this;
        }
        /**
         * Indicates that the schema has been added since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
        private String idcsAddedSinceReleaseNumber;

        /**
         * Indicates that the schema has been added since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         *
         * @param idcsAddedSinceReleaseNumber the value to set
         * @return this builder
         */
        public Builder idcsAddedSinceReleaseNumber(String idcsAddedSinceReleaseNumber) {
            this.idcsAddedSinceReleaseNumber = idcsAddedSinceReleaseNumber;
            this.__explicitlySet__.add("idcsAddedSinceReleaseNumber");
            return this;
        }
        /**
         * Specifies the minimum length of the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
        private Integer idcsMinLength;

        /**
         * Specifies the minimum length of the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: integer
         *
         * @param idcsMinLength the value to set
         * @return this builder
         */
        public Builder idcsMinLength(Integer idcsMinLength) {
            this.idcsMinLength = idcsMinLength;
            this.__explicitlySet__.add("idcsMinLength");
            return this;
        }
        /**
         * Specifies the maximum length of the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
        private Integer idcsMaxLength;

        /**
         * Specifies the maximum length of the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: integer
         *
         * @param idcsMaxLength the value to set
         * @return this builder
         */
        public Builder idcsMaxLength(Integer idcsMaxLength) {
            this.idcsMaxLength = idcsMaxLength;
            this.__explicitlySet__.add("idcsMaxLength");
            return this;
        }
        /**
         * Specifies the minimum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * idcsSearchable: true - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
        private Integer idcsMinValue;

        /**
         * Specifies the minimum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * idcsSearchable: true - returned: default - type: integer
         *
         * @param idcsMinValue the value to set
         * @return this builder
         */
        public Builder idcsMinValue(Integer idcsMinValue) {
            this.idcsMinValue = idcsMinValue;
            this.__explicitlySet__.add("idcsMinValue");
            return this;
        }
        /**
         * Specifies the maximum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable:
         * true - required: false - returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
        private Integer idcsMaxValue;

        /**
         * Specifies the maximum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable:
         * true - required: false - returned: default - type: integer
         *
         * @param idcsMaxValue the value to set
         * @return this builder
         */
        public Builder idcsMaxValue(Integer idcsMaxValue) {
            this.idcsMaxValue = idcsMaxValue;
            this.__explicitlySet__.add("idcsMaxValue");
            return this;
        }
        /**
         * If true, specifies that the attribute can have multiple language values set for the
         * attribute on which this is set.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * idcsSearchable: true - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMultiLanguage")
        private Boolean idcsMultiLanguage;

        /**
         * If true, specifies that the attribute can have multiple language values set for the
         * attribute on which this is set.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * idcsSearchable: true - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param idcsMultiLanguage the value to set
         * @return this builder
         */
        public Builder idcsMultiLanguage(Boolean idcsMultiLanguage) {
            this.idcsMultiLanguage = idcsMultiLanguage;
            this.__explicitlySet__.add("idcsMultiLanguage");
            return this;
        }
        /**
         * Specifies the directly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
        private java.util.List<String> idcsRefResourceAttributes;

        /**
         * Specifies the directly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         *
         * @param idcsRefResourceAttributes the value to set
         * @return this builder
         */
        public Builder idcsRefResourceAttributes(java.util.List<String> idcsRefResourceAttributes) {
            this.idcsRefResourceAttributes = idcsRefResourceAttributes;
            this.__explicitlySet__.add("idcsRefResourceAttributes");
            return this;
        }
        /**
         * Specifies the indirectly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
        private java.util.List<String> idcsIndirectRefResourceAttributes;

        /**
         * Specifies the indirectly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         *
         * @param idcsIndirectRefResourceAttributes the value to set
         * @return this builder
         */
        public Builder idcsIndirectRefResourceAttributes(
                java.util.List<String> idcsIndirectRefResourceAttributes) {
            this.idcsIndirectRefResourceAttributes = idcsIndirectRefResourceAttributes;
            this.__explicitlySet__.add("idcsIndirectRefResourceAttributes");
            return this;
        }
        /**
         * Sequence tracking ID name for the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAutoIncrementSeqName")
        private String idcsAutoIncrementSeqName;

        /**
         * Sequence tracking ID name for the attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: string
         *
         * @param idcsAutoIncrementSeqName the value to set
         * @return this builder
         */
        public Builder idcsAutoIncrementSeqName(String idcsAutoIncrementSeqName) {
            this.idcsAutoIncrementSeqName = idcsAutoIncrementSeqName;
            this.__explicitlySet__.add("idcsAutoIncrementSeqName");
            return this;
        }
        /**
         * Specifies whether the value of the Resource attribute is persisted
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
        private Boolean idcsValuePersisted;

        /**
         * Specifies whether the value of the Resource attribute is persisted
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsValuePersisted the value to set
         * @return this builder
         */
        public Builder idcsValuePersisted(Boolean idcsValuePersisted) {
            this.idcsValuePersisted = idcsValuePersisted;
            this.__explicitlySet__.add("idcsValuePersisted");
            return this;
        }
        /**
         * Flag to specify if the attribute should be encrypted or hashed
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
        private IdcsSensitive idcsSensitive;

        /**
         * Flag to specify if the attribute should be encrypted or hashed
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsSensitive the value to set
         * @return this builder
         */
        public Builder idcsSensitive(IdcsSensitive idcsSensitive) {
            this.idcsSensitive = idcsSensitive;
            this.__explicitlySet__.add("idcsSensitive");
            return this;
        }
        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are
         * not exposed via REST. This attribute overrides mutability for create/update if the
         * request is internal and the attribute internalflag is set to True. This attribute
         * overrides the return attribute while building SCIM response attributes when both the
         * request is internal and the schema attribute is internal.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
        private Boolean idcsInternal;

        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are
         * not exposed via REST. This attribute overrides mutability for create/update if the
         * request is internal and the attribute internalflag is set to True. This attribute
         * overrides the return attribute while building SCIM response attributes when both the
         * request is internal and the schema attribute is internal.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsInternal the value to set
         * @return this builder
         */
        public Builder idcsInternal(Boolean idcsInternal) {
            this.idcsInternal = idcsInternal;
            this.__explicitlySet__.add("idcsInternal");
            return this;
        }
        /**
         * Trims any leading and trailing blanks from String values. Default is True.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
        private Boolean idcsTrimStringValue;

        /**
         * Trims any leading and trailing blanks from String values. Default is True.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsTrimStringValue the value to set
         * @return this builder
         */
        public Builder idcsTrimStringValue(Boolean idcsTrimStringValue) {
            this.idcsTrimStringValue = idcsTrimStringValue;
            this.__explicitlySet__.add("idcsTrimStringValue");
            return this;
        }
        /**
         * Specifies whether this attribute can be included in a search filter
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
        private Boolean idcsSearchable;

        /**
         * Specifies whether this attribute can be included in a search filter
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsSearchable the value to set
         * @return this builder
         */
        public Builder idcsSearchable(Boolean idcsSearchable) {
            this.idcsSearchable = idcsSearchable;
            this.__explicitlySet__.add("idcsSearchable");
            return this;
        }
        /**
         * Specifies whether this attribute value was generated
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
        private Boolean idcsGenerated;

        /**
         * Specifies whether this attribute value was generated
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsGenerated the value to set
         * @return this builder
         */
        public Builder idcsGenerated(Boolean idcsGenerated) {
            this.idcsGenerated = idcsGenerated;
            this.__explicitlySet__.add("idcsGenerated");
            return this;
        }
        /**
         * Specifies whether changes to this attribute value are audited
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
        private Boolean idcsAuditable;

        /**
         * Specifies whether changes to this attribute value are audited
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         *
         * @param idcsAuditable the value to set
         * @return this builder
         */
        public Builder idcsAuditable(Boolean idcsAuditable) {
            this.idcsAuditable = idcsAuditable;
            this.__explicitlySet__.add("idcsAuditable");
            return this;
        }
        /**
         * Target attribute name that this attribute gets mapped to for persistence
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
        private String idcsTargetAttributeName;

        /**
         * Target attribute name that this attribute gets mapped to for persistence
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsTargetAttributeName the value to set
         * @return this builder
         */
        public Builder idcsTargetAttributeName(String idcsTargetAttributeName) {
            this.idcsTargetAttributeName = idcsTargetAttributeName;
            this.__explicitlySet__.add("idcsTargetAttributeName");
            return this;
        }
        /**
         * Target index name created for this attribute for performance
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
        private String idcsTargetUniqueConstraintName;

        /**
         * Target index name created for this attribute for performance
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsTargetUniqueConstraintName the value to set
         * @return this builder
         */
        public Builder idcsTargetUniqueConstraintName(String idcsTargetUniqueConstraintName) {
            this.idcsTargetUniqueConstraintName = idcsTargetUniqueConstraintName;
            this.__explicitlySet__.add("idcsTargetUniqueConstraintName");
            return this;
        }
        /**
         * Target normalized attribute name that this normalized value of attribute gets mapped to
         * for persistence. Only set for caseExact=false & searchable attributes. Do not use by
         * default.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetNormAttributeName")
        private String idcsTargetNormAttributeName;

        /**
         * Target normalized attribute name that this normalized value of attribute gets mapped to
         * for persistence. Only set for caseExact=false & searchable attributes. Do not use by
         * default.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsTargetNormAttributeName the value to set
         * @return this builder
         */
        public Builder idcsTargetNormAttributeName(String idcsTargetNormAttributeName) {
            this.idcsTargetNormAttributeName = idcsTargetNormAttributeName;
            this.__explicitlySet__.add("idcsTargetNormAttributeName");
            return this;
        }
        /**
         * Old Target attribute name from child table for CSVA attribute prior to migration. This
         * maintains this attribute used to get mapped to for persistence
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
        private String idcsTargetAttributeNameToMigrateFrom;

        /**
         * Old Target attribute name from child table for CSVA attribute prior to migration. This
         * maintains this attribute used to get mapped to for persistence
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsTargetAttributeNameToMigrateFrom the value to set
         * @return this builder
         */
        public Builder idcsTargetAttributeNameToMigrateFrom(
                String idcsTargetAttributeNameToMigrateFrom) {
            this.idcsTargetAttributeNameToMigrateFrom = idcsTargetAttributeNameToMigrateFrom;
            this.__explicitlySet__.add("idcsTargetAttributeNameToMigrateFrom");
            return this;
        }
        /**
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
        private String idcsToTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsToTargetMapper the value to set
         * @return this builder
         */
        public Builder idcsToTargetMapper(String idcsToTargetMapper) {
            this.idcsToTargetMapper = idcsToTargetMapper;
            this.__explicitlySet__.add("idcsToTargetMapper");
            return this;
        }
        /**
         * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
        private String idcsFromTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsFromTargetMapper the value to set
         * @return this builder
         */
        public Builder idcsFromTargetMapper(String idcsFromTargetMapper) {
            this.idcsFromTargetMapper = idcsFromTargetMapper;
            this.__explicitlySet__.add("idcsFromTargetMapper");
            return this;
        }
        /**
         * Specifies the user-friendly displayable attribute name or catalog key used for
         * localization
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
        private String idcsDisplayName;

        /**
         * Specifies the user-friendly displayable attribute name or catalog key used for
         * localization
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - idcsSearchable: true - type: string - uniqueness:
         * none
         *
         * @param idcsDisplayName the value to set
         * @return this builder
         */
        public Builder idcsDisplayName(String idcsDisplayName) {
            this.idcsDisplayName = idcsDisplayName;
            this.__explicitlySet__.add("idcsDisplayName");
            return this;
        }
        /**
         * Specifies the Resource type to read from for dynamic canonical values
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
        private String idcsCanonicalValueSourceResourceType;

        /**
         * Specifies the Resource type to read from for dynamic canonical values
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsCanonicalValueSourceResourceType the value to set
         * @return this builder
         */
        public Builder idcsCanonicalValueSourceResourceType(
                String idcsCanonicalValueSourceResourceType) {
            this.idcsCanonicalValueSourceResourceType = idcsCanonicalValueSourceResourceType;
            this.__explicitlySet__.add("idcsCanonicalValueSourceResourceType");
            return this;
        }
        /**
         * Filter to use when getting canonical values for this schema attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceFilter")
        private String idcsCanonicalValueSourceFilter;

        /**
         * Filter to use when getting canonical values for this schema attribute
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param idcsCanonicalValueSourceFilter the value to set
         * @return this builder
         */
        public Builder idcsCanonicalValueSourceFilter(String idcsCanonicalValueSourceFilter) {
            this.idcsCanonicalValueSourceFilter = idcsCanonicalValueSourceFilter;
            this.__explicitlySet__.add("idcsCanonicalValueSourceFilter");
            return this;
        }
        /**
         * Validate payload reference value during create, replace, and update. Default is True.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValidateReference")
        private Boolean idcsValidateReference;

        /**
         * Validate payload reference value during create, replace, and update. Default is True.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param idcsValidateReference the value to set
         * @return this builder
         */
        public Builder idcsValidateReference(Boolean idcsValidateReference) {
            this.idcsValidateReference = idcsValidateReference;
            this.__explicitlySet__.add("idcsValidateReference");
            return this;
        }
        /**
         * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an
         * instance of a CMVA
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCompositeKey")
        private java.util.List<String> idcsCompositeKey;

        /**
         * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an
         * instance of a CMVA
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - idcsSearchable: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param idcsCompositeKey the value to set
         * @return this builder
         */
        public Builder idcsCompositeKey(java.util.List<String> idcsCompositeKey) {
            this.idcsCompositeKey = idcsCompositeKey;
            this.__explicitlySet__.add("idcsCompositeKey");
            return this;
        }
        /**
         * **SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness:
         * none Whether the CMVA attribute will be fetched or not for current resource in
         * AbstractResourceManager update operation before calling data provider update. Default is
         * true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFetchComplexAttributeValues")
        private Boolean idcsFetchComplexAttributeValues;

        /**
         * **SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness:
         * none Whether the CMVA attribute will be fetched or not for current resource in
         * AbstractResourceManager update operation before calling data provider update. Default is
         * true.
         *
         * @param idcsFetchComplexAttributeValues the value to set
         * @return this builder
         */
        public Builder idcsFetchComplexAttributeValues(Boolean idcsFetchComplexAttributeValues) {
            this.idcsFetchComplexAttributeValues = idcsFetchComplexAttributeValues;
            this.__explicitlySet__.add("idcsFetchComplexAttributeValues");
            return this;
        }
        /**
         * Indicates if the attribute is scim compliant, default is true
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
        private Boolean idcsScimCompliant;

        /**
         * Indicates if the attribute is scim compliant, default is true
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         *
         * @param idcsScimCompliant the value to set
         * @return this builder
         */
        public Builder idcsScimCompliant(Boolean idcsScimCompliant) {
            this.idcsScimCompliant = idcsScimCompliant;
            this.__explicitlySet__.add("idcsScimCompliant");
            return this;
        }
        /**
         * Specifies if the attribute can be used for mapping with external identity sources such as
         * AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined,
         * then this flag is ignored
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
        private Boolean idcsAttributeMappable;

        /**
         * Specifies if the attribute can be used for mapping with external identity sources such as
         * AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined,
         * then this flag is ignored
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * idcsSearchable: true - returned: default - type: boolean
         *
         * @param idcsAttributeMappable the value to set
         * @return this builder
         */
        public Builder idcsAttributeMappable(Boolean idcsAttributeMappable) {
            this.idcsAttributeMappable = idcsAttributeMappable;
            this.__explicitlySet__.add("idcsAttributeMappable");
            return this;
        }
        /**
         * Specifies the referenced Resource attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttribute")
        private String idcsRefResourceAttribute;

        /**
         * Specifies the referenced Resource attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: string
         *
         * @param idcsRefResourceAttribute the value to set
         * @return this builder
         */
        public Builder idcsRefResourceAttribute(String idcsRefResourceAttribute) {
            this.idcsRefResourceAttribute = idcsRefResourceAttribute;
            this.__explicitlySet__.add("idcsRefResourceAttribute");
            return this;
        }
        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If
         * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
         * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
         * Provider.
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
        private Boolean idcsAttributeCacheable;

        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If
         * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
         * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
         * Provider.
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable:
         * true - required: false - returned: default - type: boolean
         *
         * @param idcsAttributeCacheable the value to set
         * @return this builder
         */
        public Builder idcsAttributeCacheable(Boolean idcsAttributeCacheable) {
            this.idcsAttributeCacheable = idcsAttributeCacheable;
            this.__explicitlySet__.add("idcsAttributeCacheable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceTypeSchemaAttribute build() {
            ResourceTypeSchemaAttribute model =
                    new ResourceTypeSchemaAttribute(
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
                            this.idcsDisplayNameMessageId,
                            this.resourceType,
                            this.idcsSchemaUrn,
                            this.idcsFullyQualifiedName,
                            this.idcsCustomAttribute,
                            this.type,
                            this.multiValued,
                            this.description,
                            this.required,
                            this.canonicalValues,
                            this.caseExact,
                            this.mutability,
                            this.endUserMutability,
                            this.endUserMutabilityAllowedValues,
                            this.returned,
                            this.uniqueness,
                            this.idcsCsvColumnHeaderName,
                            this.idcsICFBundleAttributeName,
                            this.idcsICFRequired,
                            this.idcsICFAttributeType,
                            this.referenceTypes,
                            this.idcsDeprecatedSinceVersion,
                            this.idcsAddedSinceVersion,
                            this.idcsDeprecatedSinceReleaseNumber,
                            this.idcsAddedSinceReleaseNumber,
                            this.idcsMinLength,
                            this.idcsMaxLength,
                            this.idcsMinValue,
                            this.idcsMaxValue,
                            this.idcsMultiLanguage,
                            this.idcsRefResourceAttributes,
                            this.idcsIndirectRefResourceAttributes,
                            this.idcsAutoIncrementSeqName,
                            this.idcsValuePersisted,
                            this.idcsSensitive,
                            this.idcsInternal,
                            this.idcsTrimStringValue,
                            this.idcsSearchable,
                            this.idcsGenerated,
                            this.idcsAuditable,
                            this.idcsTargetAttributeName,
                            this.idcsTargetUniqueConstraintName,
                            this.idcsTargetNormAttributeName,
                            this.idcsTargetAttributeNameToMigrateFrom,
                            this.idcsToTargetMapper,
                            this.idcsFromTargetMapper,
                            this.idcsDisplayName,
                            this.idcsCanonicalValueSourceResourceType,
                            this.idcsCanonicalValueSourceFilter,
                            this.idcsValidateReference,
                            this.idcsCompositeKey,
                            this.idcsFetchComplexAttributeValues,
                            this.idcsScimCompliant,
                            this.idcsAttributeMappable,
                            this.idcsRefResourceAttribute,
                            this.idcsAttributeCacheable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceTypeSchemaAttribute model) {
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
            if (model.wasPropertyExplicitlySet("idcsDisplayNameMessageId")) {
                this.idcsDisplayNameMessageId(model.getIdcsDisplayNameMessageId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("idcsSchemaUrn")) {
                this.idcsSchemaUrn(model.getIdcsSchemaUrn());
            }
            if (model.wasPropertyExplicitlySet("idcsFullyQualifiedName")) {
                this.idcsFullyQualifiedName(model.getIdcsFullyQualifiedName());
            }
            if (model.wasPropertyExplicitlySet("idcsCustomAttribute")) {
                this.idcsCustomAttribute(model.getIdcsCustomAttribute());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("multiValued")) {
                this.multiValued(model.getMultiValued());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("required")) {
                this.required(model.getRequired());
            }
            if (model.wasPropertyExplicitlySet("canonicalValues")) {
                this.canonicalValues(model.getCanonicalValues());
            }
            if (model.wasPropertyExplicitlySet("caseExact")) {
                this.caseExact(model.getCaseExact());
            }
            if (model.wasPropertyExplicitlySet("mutability")) {
                this.mutability(model.getMutability());
            }
            if (model.wasPropertyExplicitlySet("endUserMutability")) {
                this.endUserMutability(model.getEndUserMutability());
            }
            if (model.wasPropertyExplicitlySet("endUserMutabilityAllowedValues")) {
                this.endUserMutabilityAllowedValues(model.getEndUserMutabilityAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("returned")) {
                this.returned(model.getReturned());
            }
            if (model.wasPropertyExplicitlySet("uniqueness")) {
                this.uniqueness(model.getUniqueness());
            }
            if (model.wasPropertyExplicitlySet("idcsCsvColumnHeaderName")) {
                this.idcsCsvColumnHeaderName(model.getIdcsCsvColumnHeaderName());
            }
            if (model.wasPropertyExplicitlySet("idcsICFBundleAttributeName")) {
                this.idcsICFBundleAttributeName(model.getIdcsICFBundleAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsICFRequired")) {
                this.idcsICFRequired(model.getIdcsICFRequired());
            }
            if (model.wasPropertyExplicitlySet("idcsICFAttributeType")) {
                this.idcsICFAttributeType(model.getIdcsICFAttributeType());
            }
            if (model.wasPropertyExplicitlySet("referenceTypes")) {
                this.referenceTypes(model.getReferenceTypes());
            }
            if (model.wasPropertyExplicitlySet("idcsDeprecatedSinceVersion")) {
                this.idcsDeprecatedSinceVersion(model.getIdcsDeprecatedSinceVersion());
            }
            if (model.wasPropertyExplicitlySet("idcsAddedSinceVersion")) {
                this.idcsAddedSinceVersion(model.getIdcsAddedSinceVersion());
            }
            if (model.wasPropertyExplicitlySet("idcsDeprecatedSinceReleaseNumber")) {
                this.idcsDeprecatedSinceReleaseNumber(model.getIdcsDeprecatedSinceReleaseNumber());
            }
            if (model.wasPropertyExplicitlySet("idcsAddedSinceReleaseNumber")) {
                this.idcsAddedSinceReleaseNumber(model.getIdcsAddedSinceReleaseNumber());
            }
            if (model.wasPropertyExplicitlySet("idcsMinLength")) {
                this.idcsMinLength(model.getIdcsMinLength());
            }
            if (model.wasPropertyExplicitlySet("idcsMaxLength")) {
                this.idcsMaxLength(model.getIdcsMaxLength());
            }
            if (model.wasPropertyExplicitlySet("idcsMinValue")) {
                this.idcsMinValue(model.getIdcsMinValue());
            }
            if (model.wasPropertyExplicitlySet("idcsMaxValue")) {
                this.idcsMaxValue(model.getIdcsMaxValue());
            }
            if (model.wasPropertyExplicitlySet("idcsMultiLanguage")) {
                this.idcsMultiLanguage(model.getIdcsMultiLanguage());
            }
            if (model.wasPropertyExplicitlySet("idcsRefResourceAttributes")) {
                this.idcsRefResourceAttributes(model.getIdcsRefResourceAttributes());
            }
            if (model.wasPropertyExplicitlySet("idcsIndirectRefResourceAttributes")) {
                this.idcsIndirectRefResourceAttributes(
                        model.getIdcsIndirectRefResourceAttributes());
            }
            if (model.wasPropertyExplicitlySet("idcsAutoIncrementSeqName")) {
                this.idcsAutoIncrementSeqName(model.getIdcsAutoIncrementSeqName());
            }
            if (model.wasPropertyExplicitlySet("idcsValuePersisted")) {
                this.idcsValuePersisted(model.getIdcsValuePersisted());
            }
            if (model.wasPropertyExplicitlySet("idcsSensitive")) {
                this.idcsSensitive(model.getIdcsSensitive());
            }
            if (model.wasPropertyExplicitlySet("idcsInternal")) {
                this.idcsInternal(model.getIdcsInternal());
            }
            if (model.wasPropertyExplicitlySet("idcsTrimStringValue")) {
                this.idcsTrimStringValue(model.getIdcsTrimStringValue());
            }
            if (model.wasPropertyExplicitlySet("idcsSearchable")) {
                this.idcsSearchable(model.getIdcsSearchable());
            }
            if (model.wasPropertyExplicitlySet("idcsGenerated")) {
                this.idcsGenerated(model.getIdcsGenerated());
            }
            if (model.wasPropertyExplicitlySet("idcsAuditable")) {
                this.idcsAuditable(model.getIdcsAuditable());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetAttributeName")) {
                this.idcsTargetAttributeName(model.getIdcsTargetAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetUniqueConstraintName")) {
                this.idcsTargetUniqueConstraintName(model.getIdcsTargetUniqueConstraintName());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetNormAttributeName")) {
                this.idcsTargetNormAttributeName(model.getIdcsTargetNormAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetAttributeNameToMigrateFrom")) {
                this.idcsTargetAttributeNameToMigrateFrom(
                        model.getIdcsTargetAttributeNameToMigrateFrom());
            }
            if (model.wasPropertyExplicitlySet("idcsToTargetMapper")) {
                this.idcsToTargetMapper(model.getIdcsToTargetMapper());
            }
            if (model.wasPropertyExplicitlySet("idcsFromTargetMapper")) {
                this.idcsFromTargetMapper(model.getIdcsFromTargetMapper());
            }
            if (model.wasPropertyExplicitlySet("idcsDisplayName")) {
                this.idcsDisplayName(model.getIdcsDisplayName());
            }
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueSourceResourceType")) {
                this.idcsCanonicalValueSourceResourceType(
                        model.getIdcsCanonicalValueSourceResourceType());
            }
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueSourceFilter")) {
                this.idcsCanonicalValueSourceFilter(model.getIdcsCanonicalValueSourceFilter());
            }
            if (model.wasPropertyExplicitlySet("idcsValidateReference")) {
                this.idcsValidateReference(model.getIdcsValidateReference());
            }
            if (model.wasPropertyExplicitlySet("idcsCompositeKey")) {
                this.idcsCompositeKey(model.getIdcsCompositeKey());
            }
            if (model.wasPropertyExplicitlySet("idcsFetchComplexAttributeValues")) {
                this.idcsFetchComplexAttributeValues(model.getIdcsFetchComplexAttributeValues());
            }
            if (model.wasPropertyExplicitlySet("idcsScimCompliant")) {
                this.idcsScimCompliant(model.getIdcsScimCompliant());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeMappable")) {
                this.idcsAttributeMappable(model.getIdcsAttributeMappable());
            }
            if (model.wasPropertyExplicitlySet("idcsRefResourceAttribute")) {
                this.idcsRefResourceAttribute(model.getIdcsRefResourceAttribute());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeCacheable")) {
                this.idcsAttributeCacheable(model.getIdcsAttributeCacheable());
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
     * Attribute's name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Attribute's name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Localized schema attribute display name for use by UI client for displaying attribute labels
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
    private final String idcsDisplayNameMessageId;

    /**
     * Localized schema attribute display name for use by UI client for displaying attribute labels
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsDisplayNameMessageId() {
        return idcsDisplayNameMessageId;
    }

    /**
     * ResourceType this attribute belongs to.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * ResourceType this attribute belongs to.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Schema URN string that this attribute belongs to
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSchemaUrn")
    private final String idcsSchemaUrn;

    /**
     * Schema URN string that this attribute belongs to
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsSchemaUrn() {
        return idcsSchemaUrn;
    }

    /**
     * Fully qualified name of this attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFullyQualifiedName")
    private final String idcsFullyQualifiedName;

    /**
     * Fully qualified name of this attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsFullyQualifiedName() {
        return idcsFullyQualifiedName;
    }

    /**
     * custom attribute flag.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - idcsSearchable: true - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCustomAttribute")
    private final Boolean idcsCustomAttribute;

    /**
     * custom attribute flag.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - idcsSearchable: true - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsCustomAttribute() {
        return idcsCustomAttribute;
    }

    /**
     * The attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        String("string"),
        Complex("complex"),
        Boolean("boolean"),
        Decimal("decimal"),
        Integer("integer"),
        DateTime("dateTime"),
        Reference("reference"),
        Binary("binary"),

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
     * The attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * Indicates the attribute's plurality
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
    private final Boolean multiValued;

    /**
     * Indicates the attribute's plurality
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getMultiValued() {
        return multiValued;
    }

    /**
     * The attribute's human-readable description
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The attribute's human-readable description
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Specifies if the attribute is required
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Specifies if the attribute is required
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical
     * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
    private final java.util.List<String> canonicalValues;

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical
     * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getCanonicalValues() {
        return canonicalValues;
    }

    /**
     * Specifies if the String attribute is case-sensitive
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
    private final Boolean caseExact;

    /**
     * Specifies if the String attribute is case-sensitive
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getCaseExact() {
        return caseExact;
    }

    /**
     * Specifies if the attribute is mutable
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    public enum Mutability implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("readOnly"),
        ReadWrite("readWrite"),
        Immutable("immutable"),
        WriteOnly("writeOnly"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Mutability.class);

        private final String value;
        private static java.util.Map<String, Mutability> map;

        static {
            map = new java.util.HashMap<>();
            for (Mutability v : Mutability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mutability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mutability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Mutability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies if the attribute is mutable
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mutability")
    private final Mutability mutability;

    /**
     * Specifies if the attribute is mutable
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public Mutability getMutability() {
        return mutability;
    }

    /**
     * Specifies User mutability for this attribute
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    public enum EndUserMutability implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("readOnly"),
        ReadWrite("readWrite"),
        Immutable("immutable"),
        Hidden("hidden"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EndUserMutability.class);

        private final String value;
        private static java.util.Map<String, EndUserMutability> map;

        static {
            map = new java.util.HashMap<>();
            for (EndUserMutability v : EndUserMutability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EndUserMutability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EndUserMutability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EndUserMutability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies User mutability for this attribute
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserMutability")
    private final EndUserMutability endUserMutability;

    /**
     * Specifies User mutability for this attribute
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public EndUserMutability getEndUserMutability() {
        return endUserMutability;
    }

    /** */
    public enum EndUserMutabilityAllowedValues implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("readOnly"),
        ReadWrite("readWrite"),
        Immutable("immutable"),
        Hidden("hidden"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EndUserMutabilityAllowedValues.class);

        private final String value;
        private static java.util.Map<String, EndUserMutabilityAllowedValues> map;

        static {
            map = new java.util.HashMap<>();
            for (EndUserMutabilityAllowedValues v : EndUserMutabilityAllowedValues.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EndUserMutabilityAllowedValues(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EndUserMutabilityAllowedValues create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EndUserMutabilityAllowedValues', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the list of User mutabilities allowed
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserMutabilityAllowedValues")
    private final java.util.List<EndUserMutabilityAllowedValues> endUserMutabilityAllowedValues;

    /**
     * Specifies the list of User mutabilities allowed
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<EndUserMutabilityAllowedValues> getEndUserMutabilityAllowedValues() {
        return endUserMutabilityAllowedValues;
    }

    /**
     * A single keyword that indicates when an attribute and associated values are returned in
     * response to a GET request or in response to a PUT, POST, or PATCH request
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    public enum Returned implements com.oracle.bmc.http.internal.BmcEnum {
        Always("always"),
        Never("never"),
        Default("default"),
        Request("request"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Returned.class);

        private final String value;
        private static java.util.Map<String, Returned> map;

        static {
            map = new java.util.HashMap<>();
            for (Returned v : Returned.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Returned(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Returned create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Returned', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A single keyword that indicates when an attribute and associated values are returned in
     * response to a GET request or in response to a PUT, POST, or PATCH request
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("returned")
    private final Returned returned;

    /**
     * A single keyword that indicates when an attribute and associated values are returned in
     * response to a GET request or in response to a PUT, POST, or PATCH request
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public Returned getReturned() {
        return returned;
    }

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of
     * attribute values. A server MAY reject an invalid value based on uniqueness by returning an
     * HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side
     * to a greater degree than the Service Provider enforces. For example, a client could make a
     * value unique while the server has the uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - required: false - returned:
     * default - idcsSearchable: true - type: string - uniqueness: none
     */
    public enum Uniqueness implements com.oracle.bmc.http.internal.BmcEnum {
        None("none"),
        Server("server"),
        Global("global"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Uniqueness.class);

        private final String value;
        private static java.util.Map<String, Uniqueness> map;

        static {
            map = new java.util.HashMap<>();
            for (Uniqueness v : Uniqueness.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Uniqueness(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Uniqueness create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Uniqueness', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of
     * attribute values. A server MAY reject an invalid value based on uniqueness by returning an
     * HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side
     * to a greater degree than the Service Provider enforces. For example, a client could make a
     * value unique while the server has the uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - required: false - returned:
     * default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
    private final Uniqueness uniqueness;

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of
     * attribute values. A server MAY reject an invalid value based on uniqueness by returning an
     * HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side
     * to a greater degree than the Service Provider enforces. For example, a client could make a
     * value unique while the server has the uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - required: false - returned:
     * default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public Uniqueness getUniqueness() {
        return uniqueness;
    }

    /**
     * The attribute defining the CSV column header name for import/export
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvColumnHeaderName")
    private final String idcsCsvColumnHeaderName;

    /**
     * The attribute defining the CSV column header name for import/export
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCsvColumnHeaderName() {
        return idcsCsvColumnHeaderName;
    }

    /**
     * Maps to ICF target attribute name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFBundleAttributeName")
    private final String idcsICFBundleAttributeName;

    /**
     * Maps to ICF target attribute name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsICFBundleAttributeName() {
        return idcsICFBundleAttributeName;
    }

    /**
     * Metadata to identify the ICF required attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFRequired")
    private final Boolean idcsICFRequired;

    /**
     * Metadata to identify the ICF required attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsICFRequired() {
        return idcsICFRequired;
    }

    /**
     * Maps to ICF data type
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * idcsSearchable: true - required: false - returned: default - type: string - uniqueness: none
     */
    public enum IdcsICFAttributeType implements com.oracle.bmc.http.internal.BmcEnum {
        String("string"),
        Long("long"),
        Char("char"),
        Double("double"),
        Float("float"),
        Integer("integer"),
        Boolean("boolean"),
        Bytes("bytes"),
        Bigdecimal("bigdecimal"),
        Biginteger("biginteger"),
        Guardedbytes("guardedbytes"),
        Guardedstring("guardedstring"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdcsICFAttributeType.class);

        private final String value;
        private static java.util.Map<String, IdcsICFAttributeType> map;

        static {
            map = new java.util.HashMap<>();
            for (IdcsICFAttributeType v : IdcsICFAttributeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdcsICFAttributeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdcsICFAttributeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdcsICFAttributeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maps to ICF data type
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * idcsSearchable: true - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFAttributeType")
    private final IdcsICFAttributeType idcsICFAttributeType;

    /**
     * Maps to ICF data type
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * idcsSearchable: true - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public IdcsICFAttributeType getIdcsICFAttributeType() {
        return idcsICFAttributeType;
    }

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only
     * applicable for attributes that are of the \\"reference\\" data type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
    private final java.util.List<String> referenceTypes;

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only
     * applicable for attributes that are of the \\"reference\\" data type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getReferenceTypes() {
        return referenceTypes;
    }

    /**
     * Indicates that the schema has been deprecated since version
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
    private final Integer idcsDeprecatedSinceVersion;

    /**
     * Indicates that the schema has been deprecated since version
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsDeprecatedSinceVersion() {
        return idcsDeprecatedSinceVersion;
    }

    /**
     * Indicates that the schema has been added since version
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
    private final Integer idcsAddedSinceVersion;

    /**
     * Indicates that the schema has been added since version
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsAddedSinceVersion() {
        return idcsAddedSinceVersion;
    }

    /**
     * Indicates that the schema has been deprecated since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
    private final String idcsDeprecatedSinceReleaseNumber;

    /**
     * Indicates that the schema has been deprecated since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsDeprecatedSinceReleaseNumber() {
        return idcsDeprecatedSinceReleaseNumber;
    }

    /**
     * Indicates that the schema has been added since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
    private final String idcsAddedSinceReleaseNumber;

    /**
     * Indicates that the schema has been added since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsAddedSinceReleaseNumber() {
        return idcsAddedSinceReleaseNumber;
    }

    /**
     * Specifies the minimum length of the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
    private final Integer idcsMinLength;

    /**
     * Specifies the minimum length of the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMinLength() {
        return idcsMinLength;
    }

    /**
     * Specifies the maximum length of the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
    private final Integer idcsMaxLength;

    /**
     * Specifies the maximum length of the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMaxLength() {
        return idcsMaxLength;
    }

    /**
     * Specifies the minimum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * idcsSearchable: true - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
    private final Integer idcsMinValue;

    /**
     * Specifies the minimum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * idcsSearchable: true - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMinValue() {
        return idcsMinValue;
    }

    /**
     * Specifies the maximum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable: true -
     * required: false - returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
    private final Integer idcsMaxValue;

    /**
     * Specifies the maximum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable: true -
     * required: false - returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMaxValue() {
        return idcsMaxValue;
    }

    /**
     * If true, specifies that the attribute can have multiple language values set for the attribute
     * on which this is set.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * idcsSearchable: true - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMultiLanguage")
    private final Boolean idcsMultiLanguage;

    /**
     * If true, specifies that the attribute can have multiple language values set for the attribute
     * on which this is set.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * idcsSearchable: true - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsMultiLanguage() {
        return idcsMultiLanguage;
    }

    /**
     * Specifies the directly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
    private final java.util.List<String> idcsRefResourceAttributes;

    /**
     * Specifies the directly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     *
     * @return the value
     */
    public java.util.List<String> getIdcsRefResourceAttributes() {
        return idcsRefResourceAttributes;
    }

    /**
     * Specifies the indirectly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
    private final java.util.List<String> idcsIndirectRefResourceAttributes;

    /**
     * Specifies the indirectly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     *
     * @return the value
     */
    public java.util.List<String> getIdcsIndirectRefResourceAttributes() {
        return idcsIndirectRefResourceAttributes;
    }

    /**
     * Sequence tracking ID name for the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAutoIncrementSeqName")
    private final String idcsAutoIncrementSeqName;

    /**
     * Sequence tracking ID name for the attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsAutoIncrementSeqName() {
        return idcsAutoIncrementSeqName;
    }

    /**
     * Specifies whether the value of the Resource attribute is persisted
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
    private final Boolean idcsValuePersisted;

    /**
     * Specifies whether the value of the Resource attribute is persisted
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsValuePersisted() {
        return idcsValuePersisted;
    }

    /**
     * Flag to specify if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    public enum IdcsSensitive implements com.oracle.bmc.http.internal.BmcEnum {
        Encrypt("encrypt"),
        Hash("hash"),
        HashSc("hash_sc"),
        Checksum("checksum"),
        None("none"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdcsSensitive.class);

        private final String value;
        private static java.util.Map<String, IdcsSensitive> map;

        static {
            map = new java.util.HashMap<>();
            for (IdcsSensitive v : IdcsSensitive.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdcsSensitive(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdcsSensitive create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdcsSensitive', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Flag to specify if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
    private final IdcsSensitive idcsSensitive;

    /**
     * Flag to specify if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public IdcsSensitive getIdcsSensitive() {
        return idcsSensitive;
    }

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not
     * exposed via REST. This attribute overrides mutability for create/update if the request is
     * internal and the attribute internalflag is set to True. This attribute overrides the return
     * attribute while building SCIM response attributes when both the request is internal and the
     * schema attribute is internal.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
    private final Boolean idcsInternal;

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not
     * exposed via REST. This attribute overrides mutability for create/update if the request is
     * internal and the attribute internalflag is set to True. This attribute overrides the return
     * attribute while building SCIM response attributes when both the request is internal and the
     * schema attribute is internal.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsInternal() {
        return idcsInternal;
    }

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
    private final Boolean idcsTrimStringValue;

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsTrimStringValue() {
        return idcsTrimStringValue;
    }

    /**
     * Specifies whether this attribute can be included in a search filter
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
    private final Boolean idcsSearchable;

    /**
     * Specifies whether this attribute can be included in a search filter
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsSearchable() {
        return idcsSearchable;
    }

    /**
     * Specifies whether this attribute value was generated
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
    private final Boolean idcsGenerated;

    /**
     * Specifies whether this attribute value was generated
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsGenerated() {
        return idcsGenerated;
    }

    /**
     * Specifies whether changes to this attribute value are audited
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
    private final Boolean idcsAuditable;

    /**
     * Specifies whether changes to this attribute value are audited
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsAuditable() {
        return idcsAuditable;
    }

    /**
     * Target attribute name that this attribute gets mapped to for persistence
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
    private final String idcsTargetAttributeName;

    /**
     * Target attribute name that this attribute gets mapped to for persistence
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetAttributeName() {
        return idcsTargetAttributeName;
    }

    /**
     * Target index name created for this attribute for performance
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
    private final String idcsTargetUniqueConstraintName;

    /**
     * Target index name created for this attribute for performance
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetUniqueConstraintName() {
        return idcsTargetUniqueConstraintName;
    }

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for
     * persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetNormAttributeName")
    private final String idcsTargetNormAttributeName;

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for
     * persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetNormAttributeName() {
        return idcsTargetNormAttributeName;
    }

    /**
     * Old Target attribute name from child table for CSVA attribute prior to migration. This
     * maintains this attribute used to get mapped to for persistence
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
    private final String idcsTargetAttributeNameToMigrateFrom;

    /**
     * Old Target attribute name from child table for CSVA attribute prior to migration. This
     * maintains this attribute used to get mapped to for persistence
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetAttributeNameToMigrateFrom() {
        return idcsTargetAttributeNameToMigrateFrom;
    }

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
    private final String idcsToTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsToTargetMapper() {
        return idcsToTargetMapper;
    }

    /**
     * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
    private final String idcsFromTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsFromTargetMapper() {
        return idcsFromTargetMapper;
    }

    /**
     * Specifies the user-friendly displayable attribute name or catalog key used for localization
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
    private final String idcsDisplayName;

    /**
     * Specifies the user-friendly displayable attribute name or catalog key used for localization
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - idcsSearchable: true - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsDisplayName() {
        return idcsDisplayName;
    }

    /**
     * Specifies the Resource type to read from for dynamic canonical values
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
    private final String idcsCanonicalValueSourceResourceType;

    /**
     * Specifies the Resource type to read from for dynamic canonical values
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCanonicalValueSourceResourceType() {
        return idcsCanonicalValueSourceResourceType;
    }

    /**
     * Filter to use when getting canonical values for this schema attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceFilter")
    private final String idcsCanonicalValueSourceFilter;

    /**
     * Filter to use when getting canonical values for this schema attribute
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCanonicalValueSourceFilter() {
        return idcsCanonicalValueSourceFilter;
    }

    /**
     * Validate payload reference value during create, replace, and update. Default is True.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValidateReference")
    private final Boolean idcsValidateReference;

    /**
     * Validate payload reference value during create, replace, and update. Default is True.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getIdcsValidateReference() {
        return idcsValidateReference;
    }

    /**
     * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an
     * instance of a CMVA
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCompositeKey")
    private final java.util.List<String> idcsCompositeKey;

    /**
     * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an
     * instance of a CMVA
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - idcsSearchable: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getIdcsCompositeKey() {
        return idcsCompositeKey;
    }

    /**
     * **SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness: none
     * Whether the CMVA attribute will be fetched or not for current resource in
     * AbstractResourceManager update operation before calling data provider update. Default is
     * true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFetchComplexAttributeValues")
    private final Boolean idcsFetchComplexAttributeValues;

    /**
     * **SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - idcsSearchable: true - returned: default - type: boolean - uniqueness: none
     * Whether the CMVA attribute will be fetched or not for current resource in
     * AbstractResourceManager update operation before calling data provider update. Default is
     * true.
     *
     * @return the value
     */
    public Boolean getIdcsFetchComplexAttributeValues() {
        return idcsFetchComplexAttributeValues;
    }

    /**
     * Indicates if the attribute is scim compliant, default is true
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable: true -
     * required: false - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
    private final Boolean idcsScimCompliant;

    /**
     * Indicates if the attribute is scim compliant, default is true
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - idcsSearchable: true -
     * required: false - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsScimCompliant() {
        return idcsScimCompliant;
    }

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD
     * or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then
     * this flag is ignored
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
    private final Boolean idcsAttributeMappable;

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD
     * or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then
     * this flag is ignored
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * idcsSearchable: true - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsAttributeMappable() {
        return idcsAttributeMappable;
    }

    /**
     * Specifies the referenced Resource attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttribute")
    private final String idcsRefResourceAttribute;

    /**
     * Specifies the referenced Resource attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsRefResourceAttribute() {
        return idcsRefResourceAttribute;
    }

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If
     * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
     * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
     * Provider.
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
    private final Boolean idcsAttributeCacheable;

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If
     * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
     * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
     * Provider.
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - idcsSearchable: true
     * - required: false - returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsAttributeCacheable() {
        return idcsAttributeCacheable;
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
        sb.append("ResourceTypeSchemaAttribute(");
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
        sb.append(", idcsDisplayNameMessageId=")
                .append(String.valueOf(this.idcsDisplayNameMessageId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", idcsSchemaUrn=").append(String.valueOf(this.idcsSchemaUrn));
        sb.append(", idcsFullyQualifiedName=").append(String.valueOf(this.idcsFullyQualifiedName));
        sb.append(", idcsCustomAttribute=").append(String.valueOf(this.idcsCustomAttribute));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", multiValued=").append(String.valueOf(this.multiValued));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", canonicalValues=").append(String.valueOf(this.canonicalValues));
        sb.append(", caseExact=").append(String.valueOf(this.caseExact));
        sb.append(", mutability=").append(String.valueOf(this.mutability));
        sb.append(", endUserMutability=").append(String.valueOf(this.endUserMutability));
        sb.append(", endUserMutabilityAllowedValues=")
                .append(String.valueOf(this.endUserMutabilityAllowedValues));
        sb.append(", returned=").append(String.valueOf(this.returned));
        sb.append(", uniqueness=").append(String.valueOf(this.uniqueness));
        sb.append(", idcsCsvColumnHeaderName=")
                .append(String.valueOf(this.idcsCsvColumnHeaderName));
        sb.append(", idcsICFBundleAttributeName=")
                .append(String.valueOf(this.idcsICFBundleAttributeName));
        sb.append(", idcsICFRequired=").append(String.valueOf(this.idcsICFRequired));
        sb.append(", idcsICFAttributeType=").append(String.valueOf(this.idcsICFAttributeType));
        sb.append(", referenceTypes=").append(String.valueOf(this.referenceTypes));
        sb.append(", idcsDeprecatedSinceVersion=")
                .append(String.valueOf(this.idcsDeprecatedSinceVersion));
        sb.append(", idcsAddedSinceVersion=").append(String.valueOf(this.idcsAddedSinceVersion));
        sb.append(", idcsDeprecatedSinceReleaseNumber=")
                .append(String.valueOf(this.idcsDeprecatedSinceReleaseNumber));
        sb.append(", idcsAddedSinceReleaseNumber=")
                .append(String.valueOf(this.idcsAddedSinceReleaseNumber));
        sb.append(", idcsMinLength=").append(String.valueOf(this.idcsMinLength));
        sb.append(", idcsMaxLength=").append(String.valueOf(this.idcsMaxLength));
        sb.append(", idcsMinValue=").append(String.valueOf(this.idcsMinValue));
        sb.append(", idcsMaxValue=").append(String.valueOf(this.idcsMaxValue));
        sb.append(", idcsMultiLanguage=").append(String.valueOf(this.idcsMultiLanguage));
        sb.append(", idcsRefResourceAttributes=")
                .append(String.valueOf(this.idcsRefResourceAttributes));
        sb.append(", idcsIndirectRefResourceAttributes=")
                .append(String.valueOf(this.idcsIndirectRefResourceAttributes));
        sb.append(", idcsAutoIncrementSeqName=")
                .append(String.valueOf(this.idcsAutoIncrementSeqName));
        sb.append(", idcsValuePersisted=").append(String.valueOf(this.idcsValuePersisted));
        sb.append(", idcsSensitive=").append(String.valueOf(this.idcsSensitive));
        sb.append(", idcsInternal=").append(String.valueOf(this.idcsInternal));
        sb.append(", idcsTrimStringValue=").append(String.valueOf(this.idcsTrimStringValue));
        sb.append(", idcsSearchable=").append(String.valueOf(this.idcsSearchable));
        sb.append(", idcsGenerated=").append(String.valueOf(this.idcsGenerated));
        sb.append(", idcsAuditable=").append(String.valueOf(this.idcsAuditable));
        sb.append(", idcsTargetAttributeName=")
                .append(String.valueOf(this.idcsTargetAttributeName));
        sb.append(", idcsTargetUniqueConstraintName=")
                .append(String.valueOf(this.idcsTargetUniqueConstraintName));
        sb.append(", idcsTargetNormAttributeName=")
                .append(String.valueOf(this.idcsTargetNormAttributeName));
        sb.append(", idcsTargetAttributeNameToMigrateFrom=")
                .append(String.valueOf(this.idcsTargetAttributeNameToMigrateFrom));
        sb.append(", idcsToTargetMapper=").append(String.valueOf(this.idcsToTargetMapper));
        sb.append(", idcsFromTargetMapper=").append(String.valueOf(this.idcsFromTargetMapper));
        sb.append(", idcsDisplayName=").append(String.valueOf(this.idcsDisplayName));
        sb.append(", idcsCanonicalValueSourceResourceType=")
                .append(String.valueOf(this.idcsCanonicalValueSourceResourceType));
        sb.append(", idcsCanonicalValueSourceFilter=")
                .append(String.valueOf(this.idcsCanonicalValueSourceFilter));
        sb.append(", idcsValidateReference=").append(String.valueOf(this.idcsValidateReference));
        sb.append(", idcsCompositeKey=").append(String.valueOf(this.idcsCompositeKey));
        sb.append(", idcsFetchComplexAttributeValues=")
                .append(String.valueOf(this.idcsFetchComplexAttributeValues));
        sb.append(", idcsScimCompliant=").append(String.valueOf(this.idcsScimCompliant));
        sb.append(", idcsAttributeMappable=").append(String.valueOf(this.idcsAttributeMappable));
        sb.append(", idcsRefResourceAttribute=")
                .append(String.valueOf(this.idcsRefResourceAttribute));
        sb.append(", idcsAttributeCacheable=").append(String.valueOf(this.idcsAttributeCacheable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceTypeSchemaAttribute)) {
            return false;
        }

        ResourceTypeSchemaAttribute other = (ResourceTypeSchemaAttribute) o;
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
                && java.util.Objects.equals(
                        this.idcsDisplayNameMessageId, other.idcsDisplayNameMessageId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.idcsSchemaUrn, other.idcsSchemaUrn)
                && java.util.Objects.equals(
                        this.idcsFullyQualifiedName, other.idcsFullyQualifiedName)
                && java.util.Objects.equals(this.idcsCustomAttribute, other.idcsCustomAttribute)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.multiValued, other.multiValued)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.canonicalValues, other.canonicalValues)
                && java.util.Objects.equals(this.caseExact, other.caseExact)
                && java.util.Objects.equals(this.mutability, other.mutability)
                && java.util.Objects.equals(this.endUserMutability, other.endUserMutability)
                && java.util.Objects.equals(
                        this.endUserMutabilityAllowedValues, other.endUserMutabilityAllowedValues)
                && java.util.Objects.equals(this.returned, other.returned)
                && java.util.Objects.equals(this.uniqueness, other.uniqueness)
                && java.util.Objects.equals(
                        this.idcsCsvColumnHeaderName, other.idcsCsvColumnHeaderName)
                && java.util.Objects.equals(
                        this.idcsICFBundleAttributeName, other.idcsICFBundleAttributeName)
                && java.util.Objects.equals(this.idcsICFRequired, other.idcsICFRequired)
                && java.util.Objects.equals(this.idcsICFAttributeType, other.idcsICFAttributeType)
                && java.util.Objects.equals(this.referenceTypes, other.referenceTypes)
                && java.util.Objects.equals(
                        this.idcsDeprecatedSinceVersion, other.idcsDeprecatedSinceVersion)
                && java.util.Objects.equals(this.idcsAddedSinceVersion, other.idcsAddedSinceVersion)
                && java.util.Objects.equals(
                        this.idcsDeprecatedSinceReleaseNumber,
                        other.idcsDeprecatedSinceReleaseNumber)
                && java.util.Objects.equals(
                        this.idcsAddedSinceReleaseNumber, other.idcsAddedSinceReleaseNumber)
                && java.util.Objects.equals(this.idcsMinLength, other.idcsMinLength)
                && java.util.Objects.equals(this.idcsMaxLength, other.idcsMaxLength)
                && java.util.Objects.equals(this.idcsMinValue, other.idcsMinValue)
                && java.util.Objects.equals(this.idcsMaxValue, other.idcsMaxValue)
                && java.util.Objects.equals(this.idcsMultiLanguage, other.idcsMultiLanguage)
                && java.util.Objects.equals(
                        this.idcsRefResourceAttributes, other.idcsRefResourceAttributes)
                && java.util.Objects.equals(
                        this.idcsIndirectRefResourceAttributes,
                        other.idcsIndirectRefResourceAttributes)
                && java.util.Objects.equals(
                        this.idcsAutoIncrementSeqName, other.idcsAutoIncrementSeqName)
                && java.util.Objects.equals(this.idcsValuePersisted, other.idcsValuePersisted)
                && java.util.Objects.equals(this.idcsSensitive, other.idcsSensitive)
                && java.util.Objects.equals(this.idcsInternal, other.idcsInternal)
                && java.util.Objects.equals(this.idcsTrimStringValue, other.idcsTrimStringValue)
                && java.util.Objects.equals(this.idcsSearchable, other.idcsSearchable)
                && java.util.Objects.equals(this.idcsGenerated, other.idcsGenerated)
                && java.util.Objects.equals(this.idcsAuditable, other.idcsAuditable)
                && java.util.Objects.equals(
                        this.idcsTargetAttributeName, other.idcsTargetAttributeName)
                && java.util.Objects.equals(
                        this.idcsTargetUniqueConstraintName, other.idcsTargetUniqueConstraintName)
                && java.util.Objects.equals(
                        this.idcsTargetNormAttributeName, other.idcsTargetNormAttributeName)
                && java.util.Objects.equals(
                        this.idcsTargetAttributeNameToMigrateFrom,
                        other.idcsTargetAttributeNameToMigrateFrom)
                && java.util.Objects.equals(this.idcsToTargetMapper, other.idcsToTargetMapper)
                && java.util.Objects.equals(this.idcsFromTargetMapper, other.idcsFromTargetMapper)
                && java.util.Objects.equals(this.idcsDisplayName, other.idcsDisplayName)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceResourceType,
                        other.idcsCanonicalValueSourceResourceType)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceFilter, other.idcsCanonicalValueSourceFilter)
                && java.util.Objects.equals(this.idcsValidateReference, other.idcsValidateReference)
                && java.util.Objects.equals(this.idcsCompositeKey, other.idcsCompositeKey)
                && java.util.Objects.equals(
                        this.idcsFetchComplexAttributeValues, other.idcsFetchComplexAttributeValues)
                && java.util.Objects.equals(this.idcsScimCompliant, other.idcsScimCompliant)
                && java.util.Objects.equals(this.idcsAttributeMappable, other.idcsAttributeMappable)
                && java.util.Objects.equals(
                        this.idcsRefResourceAttribute, other.idcsRefResourceAttribute)
                && java.util.Objects.equals(
                        this.idcsAttributeCacheable, other.idcsAttributeCacheable)
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
        result =
                (result * PRIME)
                        + (this.idcsDisplayNameMessageId == null
                                ? 43
                                : this.idcsDisplayNameMessageId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsSchemaUrn == null ? 43 : this.idcsSchemaUrn.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsFullyQualifiedName == null
                                ? 43
                                : this.idcsFullyQualifiedName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCustomAttribute == null
                                ? 43
                                : this.idcsCustomAttribute.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.multiValued == null ? 43 : this.multiValued.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result =
                (result * PRIME)
                        + (this.canonicalValues == null ? 43 : this.canonicalValues.hashCode());
        result = (result * PRIME) + (this.caseExact == null ? 43 : this.caseExact.hashCode());
        result = (result * PRIME) + (this.mutability == null ? 43 : this.mutability.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserMutability == null ? 43 : this.endUserMutability.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserMutabilityAllowedValues == null
                                ? 43
                                : this.endUserMutabilityAllowedValues.hashCode());
        result = (result * PRIME) + (this.returned == null ? 43 : this.returned.hashCode());
        result = (result * PRIME) + (this.uniqueness == null ? 43 : this.uniqueness.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCsvColumnHeaderName == null
                                ? 43
                                : this.idcsCsvColumnHeaderName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsICFBundleAttributeName == null
                                ? 43
                                : this.idcsICFBundleAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsICFRequired == null ? 43 : this.idcsICFRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsICFAttributeType == null
                                ? 43
                                : this.idcsICFAttributeType.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceTypes == null ? 43 : this.referenceTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDeprecatedSinceVersion == null
                                ? 43
                                : this.idcsDeprecatedSinceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAddedSinceVersion == null
                                ? 43
                                : this.idcsAddedSinceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDeprecatedSinceReleaseNumber == null
                                ? 43
                                : this.idcsDeprecatedSinceReleaseNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAddedSinceReleaseNumber == null
                                ? 43
                                : this.idcsAddedSinceReleaseNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsMinLength == null ? 43 : this.idcsMinLength.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsMaxLength == null ? 43 : this.idcsMaxLength.hashCode());
        result = (result * PRIME) + (this.idcsMinValue == null ? 43 : this.idcsMinValue.hashCode());
        result = (result * PRIME) + (this.idcsMaxValue == null ? 43 : this.idcsMaxValue.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsMultiLanguage == null ? 43 : this.idcsMultiLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRefResourceAttributes == null
                                ? 43
                                : this.idcsRefResourceAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsIndirectRefResourceAttributes == null
                                ? 43
                                : this.idcsIndirectRefResourceAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAutoIncrementSeqName == null
                                ? 43
                                : this.idcsAutoIncrementSeqName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsValuePersisted == null
                                ? 43
                                : this.idcsValuePersisted.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsSensitive == null ? 43 : this.idcsSensitive.hashCode());
        result = (result * PRIME) + (this.idcsInternal == null ? 43 : this.idcsInternal.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsTrimStringValue == null
                                ? 43
                                : this.idcsTrimStringValue.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsSearchable == null ? 43 : this.idcsSearchable.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsGenerated == null ? 43 : this.idcsGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAuditable == null ? 43 : this.idcsAuditable.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsTargetAttributeName == null
                                ? 43
                                : this.idcsTargetAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsTargetUniqueConstraintName == null
                                ? 43
                                : this.idcsTargetUniqueConstraintName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsTargetNormAttributeName == null
                                ? 43
                                : this.idcsTargetNormAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsTargetAttributeNameToMigrateFrom == null
                                ? 43
                                : this.idcsTargetAttributeNameToMigrateFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsToTargetMapper == null
                                ? 43
                                : this.idcsToTargetMapper.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsFromTargetMapper == null
                                ? 43
                                : this.idcsFromTargetMapper.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDisplayName == null ? 43 : this.idcsDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCanonicalValueSourceResourceType == null
                                ? 43
                                : this.idcsCanonicalValueSourceResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCanonicalValueSourceFilter == null
                                ? 43
                                : this.idcsCanonicalValueSourceFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsValidateReference == null
                                ? 43
                                : this.idcsValidateReference.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCompositeKey == null ? 43 : this.idcsCompositeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsFetchComplexAttributeValues == null
                                ? 43
                                : this.idcsFetchComplexAttributeValues.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsScimCompliant == null ? 43 : this.idcsScimCompliant.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAttributeMappable == null
                                ? 43
                                : this.idcsAttributeMappable.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRefResourceAttribute == null
                                ? 43
                                : this.idcsRefResourceAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAttributeCacheable == null
                                ? 43
                                : this.idcsAttributeCacheable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
