/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * AppRole resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AppRole.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppRole extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "displayName",
        "uniqueName",
        "description",
        "legacyGroupName",
        "adminRole",
        "limitedToOneOrMoreGroups",
        "availableToUsers",
        "availableToGroups",
        "availableToClients",
        "isPublic",
        "localizedDisplayName",
        "app",
        "members"
    })
    public AppRole(
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
            String displayName,
            String uniqueName,
            String description,
            String legacyGroupName,
            Boolean adminRole,
            Boolean limitedToOneOrMoreGroups,
            Boolean availableToUsers,
            Boolean availableToGroups,
            Boolean availableToClients,
            Boolean isPublic,
            String localizedDisplayName,
            AppRoleApp app,
            java.util.List<AppRoleMembers> members) {
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
        this.displayName = displayName;
        this.uniqueName = uniqueName;
        this.description = description;
        this.legacyGroupName = legacyGroupName;
        this.adminRole = adminRole;
        this.limitedToOneOrMoreGroups = limitedToOneOrMoreGroups;
        this.availableToUsers = availableToUsers;
        this.availableToGroups = availableToGroups;
        this.availableToClients = availableToClients;
        this.isPublic = isPublic;
        this.localizedDisplayName = localizedDisplayName;
        this.app = app;
        this.members = members;
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
         * AppRole name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Entitlement Value]] - idcsSearchable:
         * true - multiValued: false - mutability: immutable - required: true - returned: always -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * AppRole name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Entitlement Value]] - idcsSearchable:
         * true - multiValued: false - mutability: immutable - required: true - returned: always -
         * type: string - uniqueness: none
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
         * AppRole unique name
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: always - type: string - uniqueness: server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueName")
        private String uniqueName;

        /**
         * AppRole unique name
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: always - type: string - uniqueness: server
         *
         * @param uniqueName the value to set
         * @return this builder
         */
        public Builder uniqueName(String uniqueName) {
            this.uniqueName = uniqueName;
            this.__explicitlySet__.add("uniqueName");
            return this;
        }
        /**
         * AppRole description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * AppRole description
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
         * The name of the legacy group associated with this AppRole.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("legacyGroupName")
        private String legacyGroupName;

        /**
         * The name of the legacy group associated with this AppRole.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * server
         *
         * @param legacyGroupName the value to set
         * @return this builder
         */
        public Builder legacyGroupName(String legacyGroupName) {
            this.legacyGroupName = legacyGroupName;
            this.__explicitlySet__.add("legacyGroupName");
            return this;
        }
        /**
         * If true, the role provides administrative access privileges.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminRole")
        private Boolean adminRole;

        /**
         * If true, the role provides administrative access privileges.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param adminRole the value to set
         * @return this builder
         */
        public Builder adminRole(Boolean adminRole) {
            this.adminRole = adminRole;
            this.__explicitlySet__.add("adminRole");
            return this;
        }
        /**
         * If true, indicates that this Oracle Identity Cloud Service AppRole can be granted to a
         * delegated administrator whose scope is limited to users that are members of one or more
         * groups.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("limitedToOneOrMoreGroups")
        private Boolean limitedToOneOrMoreGroups;

        /**
         * If true, indicates that this Oracle Identity Cloud Service AppRole can be granted to a
         * delegated administrator whose scope is limited to users that are members of one or more
         * groups.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param limitedToOneOrMoreGroups the value to set
         * @return this builder
         */
        public Builder limitedToOneOrMoreGroups(Boolean limitedToOneOrMoreGroups) {
            this.limitedToOneOrMoreGroups = limitedToOneOrMoreGroups;
            this.__explicitlySet__.add("limitedToOneOrMoreGroups");
            return this;
        }
        /**
         * If true, this AppRole can be granted to Users.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableToUsers")
        private Boolean availableToUsers;

        /**
         * If true, this AppRole can be granted to Users.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param availableToUsers the value to set
         * @return this builder
         */
        public Builder availableToUsers(Boolean availableToUsers) {
            this.availableToUsers = availableToUsers;
            this.__explicitlySet__.add("availableToUsers");
            return this;
        }
        /**
         * If true, this AppRole can be granted to Groups.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableToGroups")
        private Boolean availableToGroups;

        /**
         * If true, this AppRole can be granted to Groups.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param availableToGroups the value to set
         * @return this builder
         */
        public Builder availableToGroups(Boolean availableToGroups) {
            this.availableToGroups = availableToGroups;
            this.__explicitlySet__.add("availableToGroups");
            return this;
        }
        /**
         * If true, this AppRole can be granted to Apps.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableToClients")
        private Boolean availableToClients;

        /**
         * If true, this AppRole can be granted to Apps.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * immutable - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param availableToClients the value to set
         * @return this builder
         */
        public Builder availableToClients(Boolean availableToClients) {
            this.availableToClients = availableToClients;
            this.__explicitlySet__.add("availableToClients");
            return this;
        }
        /**
         * If true, this AppRole is available automatically to every Oracle Identity Cloud Service
         * User in this tenancy. There is no need to grant it to individual Users or Groups.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("public")
        private Boolean isPublic;

        /**
         * If true, this AppRole is available automatically to every Oracle Identity Cloud Service
         * User in this tenancy. There is no need to grant it to individual Users or Groups.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isPublic the value to set
         * @return this builder
         */
        public Builder isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            this.__explicitlySet__.add("isPublic");
            return this;
        }
        /**
         * AppRole localization name
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localizedDisplayName")
        private String localizedDisplayName;

        /**
         * AppRole localization name
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         *
         * @param localizedDisplayName the value to set
         * @return this builder
         */
        public Builder localizedDisplayName(String localizedDisplayName) {
            this.localizedDisplayName = localizedDisplayName;
            this.__explicitlySet__.add("localizedDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("app")
        private AppRoleApp app;

        public Builder app(AppRoleApp app) {
            this.app = app;
            this.__explicitlySet__.add("app");
            return this;
        }
        /**
         * AppRole members - when requesting members attribute, it is recommended to use startIndex
         * and count to return members in pages instead of in a single response, eg :
         * #attributes=members[startIndex=1%26count=10]
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, type] -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Grantee Name, mapsTo:members.value],
         * [columnHeaderName:Grantee Type, mapsTo:members.type]] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request -
         * idcsPaginateResponse: true - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("members")
        private java.util.List<AppRoleMembers> members;

        /**
         * AppRole members - when requesting members attribute, it is recommended to use startIndex
         * and count to return members in pages instead of in a single response, eg :
         * #attributes=members[startIndex=1%26count=10]
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, type] -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Grantee Name, mapsTo:members.value],
         * [columnHeaderName:Grantee Type, mapsTo:members.type]] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request -
         * idcsPaginateResponse: true - type: complex - uniqueness: none
         *
         * @param members the value to set
         * @return this builder
         */
        public Builder members(java.util.List<AppRoleMembers> members) {
            this.members = members;
            this.__explicitlySet__.add("members");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppRole build() {
            AppRole model =
                    new AppRole(
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
                            this.displayName,
                            this.uniqueName,
                            this.description,
                            this.legacyGroupName,
                            this.adminRole,
                            this.limitedToOneOrMoreGroups,
                            this.availableToUsers,
                            this.availableToGroups,
                            this.availableToClients,
                            this.isPublic,
                            this.localizedDisplayName,
                            this.app,
                            this.members);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppRole model) {
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("uniqueName")) {
                this.uniqueName(model.getUniqueName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("legacyGroupName")) {
                this.legacyGroupName(model.getLegacyGroupName());
            }
            if (model.wasPropertyExplicitlySet("adminRole")) {
                this.adminRole(model.getAdminRole());
            }
            if (model.wasPropertyExplicitlySet("limitedToOneOrMoreGroups")) {
                this.limitedToOneOrMoreGroups(model.getLimitedToOneOrMoreGroups());
            }
            if (model.wasPropertyExplicitlySet("availableToUsers")) {
                this.availableToUsers(model.getAvailableToUsers());
            }
            if (model.wasPropertyExplicitlySet("availableToGroups")) {
                this.availableToGroups(model.getAvailableToGroups());
            }
            if (model.wasPropertyExplicitlySet("availableToClients")) {
                this.availableToClients(model.getAvailableToClients());
            }
            if (model.wasPropertyExplicitlySet("isPublic")) {
                this.isPublic(model.isPublic());
            }
            if (model.wasPropertyExplicitlySet("localizedDisplayName")) {
                this.localizedDisplayName(model.getLocalizedDisplayName());
            }
            if (model.wasPropertyExplicitlySet("app")) {
                this.app(model.getApp());
            }
            if (model.wasPropertyExplicitlySet("members")) {
                this.members(model.getMembers());
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
     * AppRole name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Entitlement Value]] - idcsSearchable: true -
     * multiValued: false - mutability: immutable - required: true - returned: always - type: string
     * - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * AppRole name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Display Name -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Entitlement Value]] - idcsSearchable: true -
     * multiValued: false - mutability: immutable - required: true - returned: always - type: string
     * - uniqueness: none
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * AppRole unique name
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: always - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueName")
    private final String uniqueName;

    /**
     * AppRole unique name
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: always - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getUniqueName() {
        return uniqueName;
    }

    /**
     * AppRole description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * AppRole description
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
     * The name of the legacy group associated with this AppRole.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legacyGroupName")
    private final String legacyGroupName;

    /**
     * The name of the legacy group associated with this AppRole.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getLegacyGroupName() {
        return legacyGroupName;
    }

    /**
     * If true, the role provides administrative access privileges.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminRole")
    private final Boolean adminRole;

    /**
     * If true, the role provides administrative access privileges.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAdminRole() {
        return adminRole;
    }

    /**
     * If true, indicates that this Oracle Identity Cloud Service AppRole can be granted to a
     * delegated administrator whose scope is limited to users that are members of one or more
     * groups.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitedToOneOrMoreGroups")
    private final Boolean limitedToOneOrMoreGroups;

    /**
     * If true, indicates that this Oracle Identity Cloud Service AppRole can be granted to a
     * delegated administrator whose scope is limited to users that are members of one or more
     * groups.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getLimitedToOneOrMoreGroups() {
        return limitedToOneOrMoreGroups;
    }

    /**
     * If true, this AppRole can be granted to Users.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableToUsers")
    private final Boolean availableToUsers;

    /**
     * If true, this AppRole can be granted to Users.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAvailableToUsers() {
        return availableToUsers;
    }

    /**
     * If true, this AppRole can be granted to Groups.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableToGroups")
    private final Boolean availableToGroups;

    /**
     * If true, this AppRole can be granted to Groups.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAvailableToGroups() {
        return availableToGroups;
    }

    /**
     * If true, this AppRole can be granted to Apps.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableToClients")
    private final Boolean availableToClients;

    /**
     * If true, this AppRole can be granted to Apps.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: immutable
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAvailableToClients() {
        return availableToClients;
    }

    /**
     * If true, this AppRole is available automatically to every Oracle Identity Cloud Service User
     * in this tenancy. There is no need to grant it to individual Users or Groups.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("public")
    private final Boolean isPublic;

    /**
     * If true, this AppRole is available automatically to every Oracle Identity Cloud Service User
     * in this tenancy. There is no need to grant it to individual Users or Groups.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean isPublic() {
        return isPublic;
    }

    /**
     * AppRole localization name
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localizedDisplayName")
    private final String localizedDisplayName;

    /**
     * AppRole localization name
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLocalizedDisplayName() {
        return localizedDisplayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("app")
    private final AppRoleApp app;

    public AppRoleApp getApp() {
        return app;
    }

    /**
     * AppRole members - when requesting members attribute, it is recommended to use startIndex and
     * count to return members in pages instead of in a single response, eg :
     * #attributes=members[startIndex=1%26count=10]
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, type] - idcsCsvAttributeNameMappings:
     * [[columnHeaderName:Grantee Name, mapsTo:members.value], [columnHeaderName:Grantee Type,
     * mapsTo:members.type]] - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - idcsPaginateResponse: true - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("members")
    private final java.util.List<AppRoleMembers> members;

    /**
     * AppRole members - when requesting members attribute, it is recommended to use startIndex and
     * count to return members in pages instead of in a single response, eg :
     * #attributes=members[startIndex=1%26count=10]
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, type] - idcsCsvAttributeNameMappings:
     * [[columnHeaderName:Grantee Name, mapsTo:members.value], [columnHeaderName:Grantee Type,
     * mapsTo:members.type]] - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - idcsPaginateResponse: true - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppRoleMembers> getMembers() {
        return members;
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
        sb.append("AppRole(");
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
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", uniqueName=").append(String.valueOf(this.uniqueName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", legacyGroupName=").append(String.valueOf(this.legacyGroupName));
        sb.append(", adminRole=").append(String.valueOf(this.adminRole));
        sb.append(", limitedToOneOrMoreGroups=")
                .append(String.valueOf(this.limitedToOneOrMoreGroups));
        sb.append(", availableToUsers=").append(String.valueOf(this.availableToUsers));
        sb.append(", availableToGroups=").append(String.valueOf(this.availableToGroups));
        sb.append(", availableToClients=").append(String.valueOf(this.availableToClients));
        sb.append(", isPublic=").append(String.valueOf(this.isPublic));
        sb.append(", localizedDisplayName=").append(String.valueOf(this.localizedDisplayName));
        sb.append(", app=").append(String.valueOf(this.app));
        sb.append(", members=").append(String.valueOf(this.members));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppRole)) {
            return false;
        }

        AppRole other = (AppRole) o;
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
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.uniqueName, other.uniqueName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.legacyGroupName, other.legacyGroupName)
                && java.util.Objects.equals(this.adminRole, other.adminRole)
                && java.util.Objects.equals(
                        this.limitedToOneOrMoreGroups, other.limitedToOneOrMoreGroups)
                && java.util.Objects.equals(this.availableToUsers, other.availableToUsers)
                && java.util.Objects.equals(this.availableToGroups, other.availableToGroups)
                && java.util.Objects.equals(this.availableToClients, other.availableToClients)
                && java.util.Objects.equals(this.isPublic, other.isPublic)
                && java.util.Objects.equals(this.localizedDisplayName, other.localizedDisplayName)
                && java.util.Objects.equals(this.app, other.app)
                && java.util.Objects.equals(this.members, other.members)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.uniqueName == null ? 43 : this.uniqueName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.legacyGroupName == null ? 43 : this.legacyGroupName.hashCode());
        result = (result * PRIME) + (this.adminRole == null ? 43 : this.adminRole.hashCode());
        result =
                (result * PRIME)
                        + (this.limitedToOneOrMoreGroups == null
                                ? 43
                                : this.limitedToOneOrMoreGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.availableToUsers == null ? 43 : this.availableToUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.availableToGroups == null ? 43 : this.availableToGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.availableToClients == null
                                ? 43
                                : this.availableToClients.hashCode());
        result = (result * PRIME) + (this.isPublic == null ? 43 : this.isPublic.hashCode());
        result =
                (result * PRIME)
                        + (this.localizedDisplayName == null
                                ? 43
                                : this.localizedDisplayName.hashCode());
        result = (result * PRIME) + (this.app == null ? 43 : this.app.hashCode());
        result = (result * PRIME) + (this.members == null ? 43 : this.members.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
