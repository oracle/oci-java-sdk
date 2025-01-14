/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The Group resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Group.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Group extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "displayName",
        "nonUniqueDisplayName",
        "members",
        "urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup",
        "urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup",
        "urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup",
        "urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup",
        "urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup",
        "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags"
    })
    public Group(
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
            String displayName,
            String nonUniqueDisplayName,
            java.util.List<GroupMembers> members,
            ExtensionGroupGroup urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup,
            ExtensionPosixGroup urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup,
            ExtensionRequestableGroup urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup,
            ExtensionDbcsGroup urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup,
            ExtensionDynamicGroup urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup,
            ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags) {
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
        this.displayName = displayName;
        this.nonUniqueDisplayName = nonUniqueDisplayName;
        this.members = members;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup =
                urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup =
                urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup =
                urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup =
                urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup =
                urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup;
        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags =
                urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
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
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
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
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
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
         * The Group display name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Name, deprecatedColumnHeaderName:Display
         * Name]] - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
         * true - returned: always - type: string - uniqueness: global
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The Group display name.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Name, deprecatedColumnHeaderName:Display
         * Name]] - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
         * true - returned: always - type: string - uniqueness: global
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A human readable name for the group as defined by the Service Consumer.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Non-Unique Display
         * Name - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
         * false - returned: always - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nonUniqueDisplayName")
        private String nonUniqueDisplayName;

        /**
         * A human readable name for the group as defined by the Service Consumer.
         *
         * <p>*Added In:** 2011192329
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Non-Unique Display
         * Name - idcsSearchable: true - multiValued: false - mutability: readWrite - required:
         * false - returned: always - type: string
         *
         * @param nonUniqueDisplayName the value to set
         * @return this builder
         */
        public Builder nonUniqueDisplayName(String nonUniqueDisplayName) {
            this.nonUniqueDisplayName = nonUniqueDisplayName;
            this.__explicitlySet__.add("nonUniqueDisplayName");
            return this;
        }
        /**
         * The group members. <b>Important:</b> When requesting group members, a maximum of 10,000
         * members can be returned in a single request. If the response contains more than 10,000
         * members, the request will fail. Use 'startIndex' and 'count' to return members in pages
         * instead of in a single response, for example:
         * #attributes=members[startIndex=1%26count=10]. This REST API is SCIM compliant.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:User Members,
         * mapsTo:members[User].value, multiValueDelimiter:;]] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: request -
         * idcsPaginateResponse: true - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<GroupMembers> members;

        /**
         * The group members. <b>Important:</b> When requesting group members, a maximum of 10,000
         * members can be returned in a single request. If the response contains more than 10,000
         * members, the request will fail. Use 'startIndex' and 'count' to return members in pages
         * instead of in a single response, for example:
         * #attributes=members[startIndex=1%26count=10]. This REST API is SCIM compliant.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:User Members,
         * mapsTo:members[User].value, multiValueDelimiter:;]] - idcsSearchable: true - multiValued:
         * true - mutability: readWrite - required: false - returned: request -
         * idcsPaginateResponse: true - type: complex - uniqueness: none
         *
         * @param members the value to set
         * @return this builder
         */
        public Builder members(java.util.List<GroupMembers> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:group:Group")
        private ExtensionGroupGroup urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup(
                ExtensionGroupGroup urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup =
                    urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:posix:Group")
        private ExtensionPosixGroup urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup(
                ExtensionPosixGroup urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup =
                    urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:requestable:Group")
        private ExtensionRequestableGroup
                urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup(
                ExtensionRequestableGroup
                        urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup =
                    urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup;
            this.__explicitlySet__.add(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbcs:Group")
        private ExtensionDbcsGroup urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup(
                ExtensionDbcsGroup urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup =
                    urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "urn:ietf:params:scim:schemas:oracle:idcs:extension:dynamic:Group")
        private ExtensionDynamicGroup urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup;

        public Builder urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup(
                ExtensionDynamicGroup urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup) {
            this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup =
                    urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup;
            this.__explicitlySet__.add("urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Group build() {
            Group model =
                    new Group(
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
                            this.displayName,
                            this.nonUniqueDisplayName,
                            this.members,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup,
                            this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Group model) {
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nonUniqueDisplayName")) {
                this.nonUniqueDisplayName(model.getNonUniqueDisplayName());
            }
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup());
            }
            if (model.wasPropertyExplicitlySet(
                    "urnIetfParamsScimSchemasOracleIdcsExtensionOciTags")) {
                this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                        model.getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags());
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
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
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
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * The Group display name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Name, deprecatedColumnHeaderName:Display
     * Name]] - idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
     * returned: always - type: string - uniqueness: global
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The Group display name.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Name, deprecatedColumnHeaderName:Display
     * Name]] - idcsSearchable: true - multiValued: false - mutability: readWrite - required: true -
     * returned: always - type: string - uniqueness: global
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A human readable name for the group as defined by the Service Consumer.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Non-Unique Display Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: always - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonUniqueDisplayName")
    private final String nonUniqueDisplayName;

    /**
     * A human readable name for the group as defined by the Service Consumer.
     *
     * <p>*Added In:** 2011192329
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Non-Unique Display Name -
     * idcsSearchable: true - multiValued: false - mutability: readWrite - required: false -
     * returned: always - type: string
     *
     * @return the value
     */
    public String getNonUniqueDisplayName() {
        return nonUniqueDisplayName;
    }

    /**
     * The group members. <b>Important:</b> When requesting group members, a maximum of 10,000
     * members can be returned in a single request. If the response contains more than 10,000
     * members, the request will fail. Use 'startIndex' and 'count' to return members in pages
     * instead of in a single response, for example: #attributes=members[startIndex=1%26count=10].
     * This REST API is SCIM compliant.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:User Members, mapsTo:members[User].value,
     * multiValueDelimiter:;]] - idcsSearchable: true - multiValued: true - mutability: readWrite -
     * required: false - returned: request - idcsPaginateResponse: true - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<GroupMembers> members;

    /**
     * The group members. <b>Important:</b> When requesting group members, a maximum of 10,000
     * members can be returned in a single request. If the response contains more than 10,000
     * members, the request will fail. Use 'startIndex' and 'count' to return members in pages
     * instead of in a single response, for example: #attributes=members[startIndex=1%26count=10].
     * This REST API is SCIM compliant.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:User Members, mapsTo:members[User].value,
     * multiValueDelimiter:;]] - idcsSearchable: true - multiValued: true - mutability: readWrite -
     * required: false - returned: request - idcsPaginateResponse: true - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<GroupMembers> getMembers() {
        return members;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:group:Group")
    private final ExtensionGroupGroup urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup;

    public ExtensionGroupGroup getUrnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:posix:Group")
    private final ExtensionPosixGroup urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup;

    public ExtensionPosixGroup getUrnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:requestable:Group")
    private final ExtensionRequestableGroup
            urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup;

    public ExtensionRequestableGroup
            getUrnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:dbcs:Group")
    private final ExtensionDbcsGroup urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup;

    public ExtensionDbcsGroup getUrnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:dynamic:Group")
    private final ExtensionDynamicGroup urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup;

    public ExtensionDynamicGroup getUrnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty(
            "urn:ietf:params:scim:schemas:oracle:idcs:extension:OCITags")
    private final ExtensionOCITags urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;

    public ExtensionOCITags getUrnIetfParamsScimSchemasOracleIdcsExtensionOciTags() {
        return urnIetfParamsScimSchemasOracleIdcsExtensionOciTags;
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
        sb.append("Group(");
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
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nonUniqueDisplayName=").append(String.valueOf(this.nonUniqueDisplayName));
        sb.append(", members=").append(String.valueOf(this.members));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup=")
                .append(
                        String.valueOf(
                                this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup));
        sb.append(", urnIetfParamsScimSchemasOracleIdcsExtensionOciTags=")
                .append(String.valueOf(this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Group)) {
            return false;
        }

        Group other = (Group) o;
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
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nonUniqueDisplayName, other.nonUniqueDisplayName)
                && java.util.Objects.equals(this.members, other.members)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup)
                && java.util.Objects.equals(
                        this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags,
                        other.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.nonUniqueDisplayName == null
                                ? 43
                                : this.nonUniqueDisplayName.hashCode());
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionGroupGroup
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionPosixGroup
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionRequestableGroup
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionDbcsGroup
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionDynamicGroup
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags == null
                                ? 43
                                : this.urnIetfParamsScimSchemasOracleIdcsExtensionOciTags
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
