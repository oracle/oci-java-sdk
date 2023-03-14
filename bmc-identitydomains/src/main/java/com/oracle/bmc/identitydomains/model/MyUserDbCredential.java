/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's Db Credential <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MyUserDbCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MyUserDbCredential
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
        "dbPassword",
        "description",
        "mixedDbPassword",
        "salt",
        "mixedSalt",
        "lastSetDate",
        "expired",
        "status",
        "expiresOn",
        "user"
    })
    public MyUserDbCredential(
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
            String dbPassword,
            String description,
            String mixedDbPassword,
            String salt,
            String mixedSalt,
            String lastSetDate,
            Boolean expired,
            Status status,
            String expiresOn,
            MyUserDbCredentialsUser user) {
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
        this.dbPassword = dbPassword;
        this.description = description;
        this.mixedDbPassword = mixedDbPassword;
        this.salt = salt;
        this.mixedSalt = mixedSalt;
        this.lastSetDate = lastSetDate;
        this.expired = expired;
        this.status = status;
        this.expiresOn = expiresOn;
        this.user = user;
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
         * Name
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readOnly -
         * required: false - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readOnly -
         * required: false - returned: default
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
         * The db password of the user
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: immutable - returned: default -
         * required: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPassword")
        private String dbPassword;

        /**
         * The db password of the user
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: immutable - returned: default -
         * required: true
         *
         * @param dbPassword the value to set
         * @return this builder
         */
        public Builder dbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            this.__explicitlySet__.add("dbPassword");
            return this;
        }
        /**
         * Description
         *
         * <p>*Added In:** 2109020413
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
         * required: false - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description
         *
         * <p>*Added In:** 2109020413
         *
         * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
         * required: false - returned: default
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
         * The db password of the user with mixed salt
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mixedDbPassword")
        private String mixedDbPassword;

        /**
         * The db password of the user with mixed salt
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         *
         * @param mixedDbPassword the value to set
         * @return this builder
         */
        public Builder mixedDbPassword(String mixedDbPassword) {
            this.mixedDbPassword = mixedDbPassword;
            this.__explicitlySet__.add("mixedDbPassword");
            return this;
        }
        /**
         * The salt of the password
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("salt")
        private String salt;

        /**
         * The salt of the password
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         *
         * @param salt the value to set
         * @return this builder
         */
        public Builder salt(String salt) {
            this.salt = salt;
            this.__explicitlySet__.add("salt");
            return this;
        }
        /**
         * The mixed salt of the password
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mixedSalt")
        private String mixedSalt;

        /**
         * The mixed salt of the password
         *
         * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
         * required: false
         *
         * @param mixedSalt the value to set
         * @return this builder
         */
        public Builder mixedSalt(String mixedSalt) {
            this.mixedSalt = mixedSalt;
            this.__explicitlySet__.add("mixedSalt");
            return this;
        }
        /**
         * A DateTime that specifies the date and time when the current db password was set
         *
         * <p>*SCIM++ Properties:** - type: dateTime - mutability: readOnly - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSetDate")
        private String lastSetDate;

        /**
         * A DateTime that specifies the date and time when the current db password was set
         *
         * <p>*SCIM++ Properties:** - type: dateTime - mutability: readOnly - returned: default
         *
         * @param lastSetDate the value to set
         * @return this builder
         */
        public Builder lastSetDate(String lastSetDate) {
            this.lastSetDate = lastSetDate;
            this.__explicitlySet__.add("lastSetDate");
            return this;
        }
        /**
         * Indicates that the db password has expired
         *
         * <p>*SCIM++ Properties:** - type: boolean - mutability: readOnly - returned: default
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expired")
        private Boolean expired;

        /**
         * Indicates that the db password has expired
         *
         * <p>*SCIM++ Properties:** - type: boolean - mutability: readOnly - returned: default
         *
         * @param expired the value to set
         * @return this builder
         */
        public Builder expired(Boolean expired) {
            this.expired = expired;
            this.__explicitlySet__.add("expired");
            return this;
        }
        /**
         * User credential status
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: never - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * User credential status
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: never - type: string - uniqueness:
         * none
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * User credential expires on
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: default - type: dateTime -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
        private String expiresOn;

        /**
         * User credential expires on
         *
         * <p>*Added In:** 2109090424
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: default - type: dateTime -
         * uniqueness: none
         *
         * @param expiresOn the value to set
         * @return this builder
         */
        public Builder expiresOn(String expiresOn) {
            this.expiresOn = expiresOn;
            this.__explicitlySet__.add("expiresOn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private MyUserDbCredentialsUser user;

        public Builder user(MyUserDbCredentialsUser user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyUserDbCredential build() {
            MyUserDbCredential model =
                    new MyUserDbCredential(
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
                            this.dbPassword,
                            this.description,
                            this.mixedDbPassword,
                            this.salt,
                            this.mixedSalt,
                            this.lastSetDate,
                            this.expired,
                            this.status,
                            this.expiresOn,
                            this.user);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyUserDbCredential model) {
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
            if (model.wasPropertyExplicitlySet("dbPassword")) {
                this.dbPassword(model.getDbPassword());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("mixedDbPassword")) {
                this.mixedDbPassword(model.getMixedDbPassword());
            }
            if (model.wasPropertyExplicitlySet("salt")) {
                this.salt(model.getSalt());
            }
            if (model.wasPropertyExplicitlySet("mixedSalt")) {
                this.mixedSalt(model.getMixedSalt());
            }
            if (model.wasPropertyExplicitlySet("lastSetDate")) {
                this.lastSetDate(model.getLastSetDate());
            }
            if (model.wasPropertyExplicitlySet("expired")) {
                this.expired(model.getExpired());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("expiresOn")) {
                this.expiresOn(model.getExpiresOn());
            }
            if (model.wasPropertyExplicitlySet("user")) {
                this.user(model.getUser());
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
     * Name
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readOnly - required:
     * false - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readOnly - required:
     * false - returned: default
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The db password of the user
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: immutable - returned: default -
     * required: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPassword")
    private final String dbPassword;

    /**
     * The db password of the user
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: immutable - returned: default -
     * required: true
     *
     * @return the value
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * Description
     *
     * <p>*Added In:** 2109020413
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
     * required: false - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description
     *
     * <p>*Added In:** 2109020413
     *
     * <p>*SCIM++ Properties:** - caseExact: false - type: string - mutability: readWrite -
     * required: false - returned: default
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The db password of the user with mixed salt
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mixedDbPassword")
    private final String mixedDbPassword;

    /**
     * The db password of the user with mixed salt
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     *
     * @return the value
     */
    public String getMixedDbPassword() {
        return mixedDbPassword;
    }

    /**
     * The salt of the password
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("salt")
    private final String salt;

    /**
     * The salt of the password
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     *
     * @return the value
     */
    public String getSalt() {
        return salt;
    }

    /**
     * The mixed salt of the password
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mixedSalt")
    private final String mixedSalt;

    /**
     * The mixed salt of the password
     *
     * <p>*SCIM++ Properties:** - type: string - mutability: readOnly - returned: default -
     * required: false
     *
     * @return the value
     */
    public String getMixedSalt() {
        return mixedSalt;
    }

    /**
     * A DateTime that specifies the date and time when the current db password was set
     *
     * <p>*SCIM++ Properties:** - type: dateTime - mutability: readOnly - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSetDate")
    private final String lastSetDate;

    /**
     * A DateTime that specifies the date and time when the current db password was set
     *
     * <p>*SCIM++ Properties:** - type: dateTime - mutability: readOnly - returned: default
     *
     * @return the value
     */
    public String getLastSetDate() {
        return lastSetDate;
    }

    /**
     * Indicates that the db password has expired
     *
     * <p>*SCIM++ Properties:** - type: boolean - mutability: readOnly - returned: default
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expired")
    private final Boolean expired;

    /**
     * Indicates that the db password has expired
     *
     * <p>*SCIM++ Properties:** - type: boolean - mutability: readOnly - returned: default
     *
     * @return the value
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * User credential status
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: never - type: string - uniqueness: none
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * User credential status
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: never - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * User credential status
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: never - type: string - uniqueness: none
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * User credential expires on
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: dateTime - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
    private final String expiresOn;

    /**
     * User credential expires on
     *
     * <p>*Added In:** 2109090424
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: dateTime - uniqueness:
     * none
     *
     * @return the value
     */
    public String getExpiresOn() {
        return expiresOn;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final MyUserDbCredentialsUser user;

    public MyUserDbCredentialsUser getUser() {
        return user;
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
        sb.append("MyUserDbCredential(");
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
        sb.append(", dbPassword=").append(String.valueOf(this.dbPassword));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", mixedDbPassword=").append(String.valueOf(this.mixedDbPassword));
        sb.append(", salt=").append(String.valueOf(this.salt));
        sb.append(", mixedSalt=").append(String.valueOf(this.mixedSalt));
        sb.append(", lastSetDate=").append(String.valueOf(this.lastSetDate));
        sb.append(", expired=").append(String.valueOf(this.expired));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", expiresOn=").append(String.valueOf(this.expiresOn));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyUserDbCredential)) {
            return false;
        }

        MyUserDbCredential other = (MyUserDbCredential) o;
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
                && java.util.Objects.equals(this.dbPassword, other.dbPassword)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.mixedDbPassword, other.mixedDbPassword)
                && java.util.Objects.equals(this.salt, other.salt)
                && java.util.Objects.equals(this.mixedSalt, other.mixedSalt)
                && java.util.Objects.equals(this.lastSetDate, other.lastSetDate)
                && java.util.Objects.equals(this.expired, other.expired)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.expiresOn, other.expiresOn)
                && java.util.Objects.equals(this.user, other.user)
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
        result = (result * PRIME) + (this.dbPassword == null ? 43 : this.dbPassword.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.mixedDbPassword == null ? 43 : this.mixedDbPassword.hashCode());
        result = (result * PRIME) + (this.salt == null ? 43 : this.salt.hashCode());
        result = (result * PRIME) + (this.mixedSalt == null ? 43 : this.mixedSalt.hashCode());
        result = (result * PRIME) + (this.lastSetDate == null ? 43 : this.lastSetDate.hashCode());
        result = (result * PRIME) + (this.expired == null ? 43 : this.expired.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.expiresOn == null ? 43 : this.expiresOn.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
