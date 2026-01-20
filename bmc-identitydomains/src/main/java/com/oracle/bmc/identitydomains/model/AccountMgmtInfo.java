/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Schema for AccountMgmtInfo resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccountMgmtInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AccountMgmtInfo
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
        "uid",
        "name",
        "compositeKey",
        "active",
        "accountType",
        "isAccount",
        "favorite",
        "doNotPerformActionOnTarget",
        "doNotBackFillGrants",
        "lastAccessed",
        "syncTimestamp",
        "syncSituation",
        "syncResponse",
        "previewOnly",
        "operationContext",
        "objectClass",
        "resourceType",
        "matchingOwners",
        "userWalletArtifact",
        "app",
        "owner"
    })
    public AccountMgmtInfo(
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
            String uid,
            String name,
            String compositeKey,
            Boolean active,
            String accountType,
            Boolean isAccount,
            Boolean favorite,
            Boolean doNotPerformActionOnTarget,
            Boolean doNotBackFillGrants,
            String lastAccessed,
            String syncTimestamp,
            SyncSituation syncSituation,
            String syncResponse,
            Boolean previewOnly,
            OperationContext operationContext,
            AccountMgmtInfoObjectClass objectClass,
            AccountMgmtInfoResourceType resourceType,
            java.util.List<AccountMgmtInfoMatchingOwners> matchingOwners,
            AccountMgmtInfoUserWalletArtifact userWalletArtifact,
            AccountMgmtInfoApp app,
            AccountMgmtInfoOwner owner) {
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
        this.uid = uid;
        this.name = name;
        this.compositeKey = compositeKey;
        this.active = active;
        this.accountType = accountType;
        this.isAccount = isAccount;
        this.favorite = favorite;
        this.doNotPerformActionOnTarget = doNotPerformActionOnTarget;
        this.doNotBackFillGrants = doNotBackFillGrants;
        this.lastAccessed = lastAccessed;
        this.syncTimestamp = syncTimestamp;
        this.syncSituation = syncSituation;
        this.syncResponse = syncResponse;
        this.previewOnly = previewOnly;
        this.operationContext = operationContext;
        this.objectClass = objectClass;
        this.resourceType = resourceType;
        this.matchingOwners = matchingOwners;
        this.userWalletArtifact = userWalletArtifact;
        this.app = app;
        this.owner = owner;
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
         * Unique identifier of the Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uid")
        private String uid;

        /**
         * Unique identifier of the Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param uid the value to set
         * @return this builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            this.__explicitlySet__.add("uid");
            return this;
        }
        /**
         * Name of the Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
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
         * Unique key for this AccountMgmtInfo, which is used to prevent duplicate AccountMgmtInfo
         * resources. Key is composed of a subset of app, owner and accountType.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeKey")
        private String compositeKey;

        /**
         * Unique key for this AccountMgmtInfo, which is used to prevent duplicate AccountMgmtInfo
         * resources. Key is composed of a subset of app, owner and accountType.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * server
         *
         * @param compositeKey the value to set
         * @return this builder
         */
        public Builder compositeKey(String compositeKey) {
            this.compositeKey = compositeKey;
            this.__explicitlySet__.add("compositeKey");
            return this;
        }
        /**
         * If true, the account is activated
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * If true, the account is activated
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
         * Type of Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountType")
        private String accountType;

        /**
         * Type of Account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param accountType the value to set
         * @return this builder
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            this.__explicitlySet__.add("accountType");
            return this;
        }
        /**
         * If true, indicates that this managed object is an account, which is an identity that
         * represents a user in the context of a specific application
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccount")
        private Boolean isAccount;

        /**
         * If true, indicates that this managed object is an account, which is an identity that
         * represents a user in the context of a specific application
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param isAccount the value to set
         * @return this builder
         */
        public Builder isAccount(Boolean isAccount) {
            this.isAccount = isAccount;
            this.__explicitlySet__.add("isAccount");
            return this;
        }
        /**
         * If true, this account has been marked as a favorite of the User who owns it
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("favorite")
        private Boolean favorite;

        /**
         * If true, this account has been marked as a favorite of the User who owns it
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param favorite the value to set
         * @return this builder
         */
        public Builder favorite(Boolean favorite) {
            this.favorite = favorite;
            this.__explicitlySet__.add("favorite");
            return this;
        }
        /**
         * If true, the operation will not be performed on the target
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("doNotPerformActionOnTarget")
        private Boolean doNotPerformActionOnTarget;

        /**
         * If true, the operation will not be performed on the target
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param doNotPerformActionOnTarget the value to set
         * @return this builder
         */
        public Builder doNotPerformActionOnTarget(Boolean doNotPerformActionOnTarget) {
            this.doNotPerformActionOnTarget = doNotPerformActionOnTarget;
            this.__explicitlySet__.add("doNotPerformActionOnTarget");
            return this;
        }
        /**
         * If true, a back-fill grant will not be created for a connected managed app as part of
         * account creation.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("doNotBackFillGrants")
        private Boolean doNotBackFillGrants;

        /**
         * If true, a back-fill grant will not be created for a connected managed app as part of
         * account creation.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param doNotBackFillGrants the value to set
         * @return this builder
         */
        public Builder doNotBackFillGrants(Boolean doNotBackFillGrants) {
            this.doNotBackFillGrants = doNotBackFillGrants;
            this.__explicitlySet__.add("doNotBackFillGrants");
            return this;
        }
        /**
         * Last accessed timestamp of an application
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastAccessed")
        private String lastAccessed;

        /**
         * Last accessed timestamp of an application
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         *
         * @param lastAccessed the value to set
         * @return this builder
         */
        public Builder lastAccessed(String lastAccessed) {
            this.lastAccessed = lastAccessed;
            this.__explicitlySet__.add("lastAccessed");
            return this;
        }
        /**
         * Last sync timestamp of the account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncTimestamp")
        private String syncTimestamp;

        /**
         * Last sync timestamp of the account
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
         * none
         *
         * @param syncTimestamp the value to set
         * @return this builder
         */
        public Builder syncTimestamp(String syncTimestamp) {
            this.syncTimestamp = syncTimestamp;
            this.__explicitlySet__.add("syncTimestamp");
            return this;
        }
        /**
         * Last recorded sync situation for the account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncSituation")
        private SyncSituation syncSituation;

        /**
         * Last recorded sync situation for the account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param syncSituation the value to set
         * @return this builder
         */
        public Builder syncSituation(SyncSituation syncSituation) {
            this.syncSituation = syncSituation;
            this.__explicitlySet__.add("syncSituation");
            return this;
        }
        /**
         * Last recorded sync response for the account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncResponse")
        private String syncResponse;

        /**
         * Last recorded sync response for the account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param syncResponse the value to set
         * @return this builder
         */
        public Builder syncResponse(String syncResponse) {
            this.syncResponse = syncResponse;
            this.__explicitlySet__.add("syncResponse");
            return this;
        }
        /**
         * If true, then the response to the account creation operation on a connected managed app
         * returns a preview of the account data that is evaluated by the attribute value generation
         * policy. Note that an account will not be created on the target application when this
         * attribute is set to true.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("previewOnly")
        private Boolean previewOnly;

        /**
         * If true, then the response to the account creation operation on a connected managed app
         * returns a preview of the account data that is evaluated by the attribute value generation
         * policy. Note that an account will not be created on the target application when this
         * attribute is set to true.
         *
         * <p>*Added In:** 18.2.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param previewOnly the value to set
         * @return this builder
         */
        public Builder previewOnly(Boolean previewOnly) {
            this.previewOnly = previewOnly;
            this.__explicitlySet__.add("previewOnly");
            return this;
        }
        /**
         * The context in which the operation is performed on the account.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false
         * - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationContext")
        private OperationContext operationContext;

        /**
         * The context in which the operation is performed on the account.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false
         * - returned: default - type: string - uniqueness: none
         *
         * @param operationContext the value to set
         * @return this builder
         */
        public Builder operationContext(OperationContext operationContext) {
            this.operationContext = operationContext;
            this.__explicitlySet__.add("operationContext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectClass")
        private AccountMgmtInfoObjectClass objectClass;

        public Builder objectClass(AccountMgmtInfoObjectClass objectClass) {
            this.objectClass = objectClass;
            this.__explicitlySet__.add("objectClass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private AccountMgmtInfoResourceType resourceType;

        public Builder resourceType(AccountMgmtInfoResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Matching owning users of the account
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: default - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("matchingOwners")
        private java.util.List<AccountMgmtInfoMatchingOwners> matchingOwners;

        /**
         * Matching owning users of the account
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: default - type:
         * complex - uniqueness: none
         *
         * @param matchingOwners the value to set
         * @return this builder
         */
        public Builder matchingOwners(
                java.util.List<AccountMgmtInfoMatchingOwners> matchingOwners) {
            this.matchingOwners = matchingOwners;
            this.__explicitlySet__.add("matchingOwners");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userWalletArtifact")
        private AccountMgmtInfoUserWalletArtifact userWalletArtifact;

        public Builder userWalletArtifact(AccountMgmtInfoUserWalletArtifact userWalletArtifact) {
            this.userWalletArtifact = userWalletArtifact;
            this.__explicitlySet__.add("userWalletArtifact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("app")
        private AccountMgmtInfoApp app;

        public Builder app(AccountMgmtInfoApp app) {
            this.app = app;
            this.__explicitlySet__.add("app");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private AccountMgmtInfoOwner owner;

        public Builder owner(AccountMgmtInfoOwner owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccountMgmtInfo build() {
            AccountMgmtInfo model =
                    new AccountMgmtInfo(
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
                            this.uid,
                            this.name,
                            this.compositeKey,
                            this.active,
                            this.accountType,
                            this.isAccount,
                            this.favorite,
                            this.doNotPerformActionOnTarget,
                            this.doNotBackFillGrants,
                            this.lastAccessed,
                            this.syncTimestamp,
                            this.syncSituation,
                            this.syncResponse,
                            this.previewOnly,
                            this.operationContext,
                            this.objectClass,
                            this.resourceType,
                            this.matchingOwners,
                            this.userWalletArtifact,
                            this.app,
                            this.owner);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccountMgmtInfo model) {
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
            if (model.wasPropertyExplicitlySet("uid")) {
                this.uid(model.getUid());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compositeKey")) {
                this.compositeKey(model.getCompositeKey());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("accountType")) {
                this.accountType(model.getAccountType());
            }
            if (model.wasPropertyExplicitlySet("isAccount")) {
                this.isAccount(model.getIsAccount());
            }
            if (model.wasPropertyExplicitlySet("favorite")) {
                this.favorite(model.getFavorite());
            }
            if (model.wasPropertyExplicitlySet("doNotPerformActionOnTarget")) {
                this.doNotPerformActionOnTarget(model.getDoNotPerformActionOnTarget());
            }
            if (model.wasPropertyExplicitlySet("doNotBackFillGrants")) {
                this.doNotBackFillGrants(model.getDoNotBackFillGrants());
            }
            if (model.wasPropertyExplicitlySet("lastAccessed")) {
                this.lastAccessed(model.getLastAccessed());
            }
            if (model.wasPropertyExplicitlySet("syncTimestamp")) {
                this.syncTimestamp(model.getSyncTimestamp());
            }
            if (model.wasPropertyExplicitlySet("syncSituation")) {
                this.syncSituation(model.getSyncSituation());
            }
            if (model.wasPropertyExplicitlySet("syncResponse")) {
                this.syncResponse(model.getSyncResponse());
            }
            if (model.wasPropertyExplicitlySet("previewOnly")) {
                this.previewOnly(model.getPreviewOnly());
            }
            if (model.wasPropertyExplicitlySet("operationContext")) {
                this.operationContext(model.getOperationContext());
            }
            if (model.wasPropertyExplicitlySet("objectClass")) {
                this.objectClass(model.getObjectClass());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("matchingOwners")) {
                this.matchingOwners(model.getMatchingOwners());
            }
            if (model.wasPropertyExplicitlySet("userWalletArtifact")) {
                this.userWalletArtifact(model.getUserWalletArtifact());
            }
            if (model.wasPropertyExplicitlySet("app")) {
                this.app(model.getApp());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
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
     * Unique identifier of the Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    private final String uid;

    /**
     * Unique identifier of the Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getUid() {
        return uid;
    }

    /**
     * Name of the Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Unique key for this AccountMgmtInfo, which is used to prevent duplicate AccountMgmtInfo
     * resources. Key is composed of a subset of app, owner and accountType.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
     * server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeKey")
    private final String compositeKey;

    /**
     * Unique key for this AccountMgmtInfo, which is used to prevent duplicate AccountMgmtInfo
     * resources. Key is composed of a subset of app, owner and accountType.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
     * server
     *
     * @return the value
     */
    public String getCompositeKey() {
        return compositeKey;
    }

    /**
     * If true, the account is activated
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * If true, the account is activated
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
     * Type of Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountType")
    private final String accountType;

    /**
     * Type of Account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * If true, indicates that this managed object is an account, which is an identity that
     * represents a user in the context of a specific application
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccount")
    private final Boolean isAccount;

    /**
     * If true, indicates that this managed object is an account, which is an identity that
     * represents a user in the context of a specific application
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getIsAccount() {
        return isAccount;
    }

    /**
     * If true, this account has been marked as a favorite of the User who owns it
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("favorite")
    private final Boolean favorite;

    /**
     * If true, this account has been marked as a favorite of the User who owns it
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getFavorite() {
        return favorite;
    }

    /**
     * If true, the operation will not be performed on the target
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerformActionOnTarget")
    private final Boolean doNotPerformActionOnTarget;

    /**
     * If true, the operation will not be performed on the target
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getDoNotPerformActionOnTarget() {
        return doNotPerformActionOnTarget;
    }

    /**
     * If true, a back-fill grant will not be created for a connected managed app as part of account
     * creation.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotBackFillGrants")
    private final Boolean doNotBackFillGrants;

    /**
     * If true, a back-fill grant will not be created for a connected managed app as part of account
     * creation.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getDoNotBackFillGrants() {
        return doNotBackFillGrants;
    }

    /**
     * Last accessed timestamp of an application
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastAccessed")
    private final String lastAccessed;

    /**
     * Last accessed timestamp of an application
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getLastAccessed() {
        return lastAccessed;
    }

    /**
     * Last sync timestamp of the account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncTimestamp")
    private final String syncTimestamp;

    /**
     * Last sync timestamp of the account
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getSyncTimestamp() {
        return syncTimestamp;
    }

    /**
     * Last recorded sync situation for the account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    public enum SyncSituation implements com.oracle.bmc.http.internal.BmcEnum {
        Found("Found"),
        Matched("Matched"),
        Unmatched("Unmatched"),
        Lost("Lost"),
        Disputed("Disputed"),
        Confirmed("Confirmed"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SyncSituation.class);

        private final String value;
        private static java.util.Map<String, SyncSituation> map;

        static {
            map = new java.util.HashMap<>();
            for (SyncSituation v : SyncSituation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyncSituation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncSituation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyncSituation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Last recorded sync situation for the account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncSituation")
    private final SyncSituation syncSituation;

    /**
     * Last recorded sync situation for the account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SyncSituation getSyncSituation() {
        return syncSituation;
    }

    /**
     * Last recorded sync response for the account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncResponse")
    private final String syncResponse;

    /**
     * Last recorded sync response for the account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSyncResponse() {
        return syncResponse;
    }

    /**
     * If true, then the response to the account creation operation on a connected managed app
     * returns a preview of the account data that is evaluated by the attribute value generation
     * policy. Note that an account will not be created on the target application when this
     * attribute is set to true.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("previewOnly")
    private final Boolean previewOnly;

    /**
     * If true, then the response to the account creation operation on a connected managed app
     * returns a preview of the account data that is evaluated by the attribute value generation
     * policy. Note that an account will not be created on the target application when this
     * attribute is set to true.
     *
     * <p>*Added In:** 18.2.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getPreviewOnly() {
        return previewOnly;
    }

    /**
     * The context in which the operation is performed on the account.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false -
     * returned: default - type: string - uniqueness: none
     */
    public enum OperationContext implements com.oracle.bmc.http.internal.BmcEnum {
        LifeCycleEvent("LifeCycleEvent"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationContext.class);

        private final String value;
        private static java.util.Map<String, OperationContext> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationContext v : OperationContext.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationContext(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationContext create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationContext', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The context in which the operation is performed on the account.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false -
     * returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationContext")
    private final OperationContext operationContext;

    /**
     * The context in which the operation is performed on the account.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - mutability: readOnly - required: false -
     * returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public OperationContext getOperationContext() {
        return operationContext;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectClass")
    private final AccountMgmtInfoObjectClass objectClass;

    public AccountMgmtInfoObjectClass getObjectClass() {
        return objectClass;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final AccountMgmtInfoResourceType resourceType;

    public AccountMgmtInfoResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Matching owning users of the account
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: default - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchingOwners")
    private final java.util.List<AccountMgmtInfoMatchingOwners> matchingOwners;

    /**
     * Matching owning users of the account
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: default - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AccountMgmtInfoMatchingOwners> getMatchingOwners() {
        return matchingOwners;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userWalletArtifact")
    private final AccountMgmtInfoUserWalletArtifact userWalletArtifact;

    public AccountMgmtInfoUserWalletArtifact getUserWalletArtifact() {
        return userWalletArtifact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("app")
    private final AccountMgmtInfoApp app;

    public AccountMgmtInfoApp getApp() {
        return app;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final AccountMgmtInfoOwner owner;

    public AccountMgmtInfoOwner getOwner() {
        return owner;
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
        sb.append("AccountMgmtInfo(");
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
        sb.append(", uid=").append(String.valueOf(this.uid));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compositeKey=").append(String.valueOf(this.compositeKey));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", accountType=").append(String.valueOf(this.accountType));
        sb.append(", isAccount=").append(String.valueOf(this.isAccount));
        sb.append(", favorite=").append(String.valueOf(this.favorite));
        sb.append(", doNotPerformActionOnTarget=")
                .append(String.valueOf(this.doNotPerformActionOnTarget));
        sb.append(", doNotBackFillGrants=").append(String.valueOf(this.doNotBackFillGrants));
        sb.append(", lastAccessed=").append(String.valueOf(this.lastAccessed));
        sb.append(", syncTimestamp=").append(String.valueOf(this.syncTimestamp));
        sb.append(", syncSituation=").append(String.valueOf(this.syncSituation));
        sb.append(", syncResponse=").append(String.valueOf(this.syncResponse));
        sb.append(", previewOnly=").append(String.valueOf(this.previewOnly));
        sb.append(", operationContext=").append(String.valueOf(this.operationContext));
        sb.append(", objectClass=").append(String.valueOf(this.objectClass));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", matchingOwners=").append(String.valueOf(this.matchingOwners));
        sb.append(", userWalletArtifact=").append(String.valueOf(this.userWalletArtifact));
        sb.append(", app=").append(String.valueOf(this.app));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountMgmtInfo)) {
            return false;
        }

        AccountMgmtInfo other = (AccountMgmtInfo) o;
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
                && java.util.Objects.equals(this.uid, other.uid)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compositeKey, other.compositeKey)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.accountType, other.accountType)
                && java.util.Objects.equals(this.isAccount, other.isAccount)
                && java.util.Objects.equals(this.favorite, other.favorite)
                && java.util.Objects.equals(
                        this.doNotPerformActionOnTarget, other.doNotPerformActionOnTarget)
                && java.util.Objects.equals(this.doNotBackFillGrants, other.doNotBackFillGrants)
                && java.util.Objects.equals(this.lastAccessed, other.lastAccessed)
                && java.util.Objects.equals(this.syncTimestamp, other.syncTimestamp)
                && java.util.Objects.equals(this.syncSituation, other.syncSituation)
                && java.util.Objects.equals(this.syncResponse, other.syncResponse)
                && java.util.Objects.equals(this.previewOnly, other.previewOnly)
                && java.util.Objects.equals(this.operationContext, other.operationContext)
                && java.util.Objects.equals(this.objectClass, other.objectClass)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.matchingOwners, other.matchingOwners)
                && java.util.Objects.equals(this.userWalletArtifact, other.userWalletArtifact)
                && java.util.Objects.equals(this.app, other.app)
                && java.util.Objects.equals(this.owner, other.owner)
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
        result = (result * PRIME) + (this.uid == null ? 43 : this.uid.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.compositeKey == null ? 43 : this.compositeKey.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result = (result * PRIME) + (this.accountType == null ? 43 : this.accountType.hashCode());
        result = (result * PRIME) + (this.isAccount == null ? 43 : this.isAccount.hashCode());
        result = (result * PRIME) + (this.favorite == null ? 43 : this.favorite.hashCode());
        result =
                (result * PRIME)
                        + (this.doNotPerformActionOnTarget == null
                                ? 43
                                : this.doNotPerformActionOnTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.doNotBackFillGrants == null
                                ? 43
                                : this.doNotBackFillGrants.hashCode());
        result = (result * PRIME) + (this.lastAccessed == null ? 43 : this.lastAccessed.hashCode());
        result =
                (result * PRIME)
                        + (this.syncTimestamp == null ? 43 : this.syncTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.syncSituation == null ? 43 : this.syncSituation.hashCode());
        result = (result * PRIME) + (this.syncResponse == null ? 43 : this.syncResponse.hashCode());
        result = (result * PRIME) + (this.previewOnly == null ? 43 : this.previewOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.operationContext == null ? 43 : this.operationContext.hashCode());
        result = (result * PRIME) + (this.objectClass == null ? 43 : this.objectClass.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.matchingOwners == null ? 43 : this.matchingOwners.hashCode());
        result =
                (result * PRIME)
                        + (this.userWalletArtifact == null
                                ? 43
                                : this.userWalletArtifact.hashCode());
        result = (result * PRIME) + (this.app == null ? 43 : this.app.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
