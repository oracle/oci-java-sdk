/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * PasswordPolicy resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PasswordPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PasswordPolicy
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
        "name",
        "description",
        "maxLength",
        "minLength",
        "minAlphas",
        "minNumerals",
        "minAlphaNumerals",
        "minSpecialChars",
        "maxSpecialChars",
        "minLowerCase",
        "minUpperCase",
        "minUniqueChars",
        "maxRepeatedChars",
        "startsWithAlphabet",
        "firstNameDisallowed",
        "lastNameDisallowed",
        "userNameDisallowed",
        "disallowedUserAttributeValues",
        "minPasswordAge",
        "passwordExpiresAfter",
        "passwordExpireWarning",
        "requiredChars",
        "disallowedChars",
        "allowedChars",
        "disallowedSubstrings",
        "dictionaryWordDisallowed",
        "dictionaryLocation",
        "dictionaryDelimiter",
        "maxIncorrectAttempts",
        "lockoutDuration",
        "numPasswordsInHistory",
        "passwordStrength",
        "forcePasswordReset",
        "distinctCharacters",
        "priority",
        "groups",
        "configuredPasswordPolicyRules"
    })
    public PasswordPolicy(
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
            String name,
            String description,
            Integer maxLength,
            Integer minLength,
            Integer minAlphas,
            Integer minNumerals,
            Integer minAlphaNumerals,
            Integer minSpecialChars,
            Integer maxSpecialChars,
            Integer minLowerCase,
            Integer minUpperCase,
            Integer minUniqueChars,
            Integer maxRepeatedChars,
            Boolean startsWithAlphabet,
            Boolean firstNameDisallowed,
            Boolean lastNameDisallowed,
            Boolean userNameDisallowed,
            java.util.List<String> disallowedUserAttributeValues,
            Integer minPasswordAge,
            Integer passwordExpiresAfter,
            Integer passwordExpireWarning,
            String requiredChars,
            String disallowedChars,
            String allowedChars,
            java.util.List<String> disallowedSubstrings,
            Boolean dictionaryWordDisallowed,
            String dictionaryLocation,
            String dictionaryDelimiter,
            Integer maxIncorrectAttempts,
            Integer lockoutDuration,
            Integer numPasswordsInHistory,
            PasswordStrength passwordStrength,
            Boolean forcePasswordReset,
            Integer distinctCharacters,
            Integer priority,
            java.util.List<PasswordPolicyGroups> groups,
            java.util.List<PasswordPolicyConfiguredPasswordPolicyRules>
                    configuredPasswordPolicyRules) {
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
        this.name = name;
        this.description = description;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.minAlphas = minAlphas;
        this.minNumerals = minNumerals;
        this.minAlphaNumerals = minAlphaNumerals;
        this.minSpecialChars = minSpecialChars;
        this.maxSpecialChars = maxSpecialChars;
        this.minLowerCase = minLowerCase;
        this.minUpperCase = minUpperCase;
        this.minUniqueChars = minUniqueChars;
        this.maxRepeatedChars = maxRepeatedChars;
        this.startsWithAlphabet = startsWithAlphabet;
        this.firstNameDisallowed = firstNameDisallowed;
        this.lastNameDisallowed = lastNameDisallowed;
        this.userNameDisallowed = userNameDisallowed;
        this.disallowedUserAttributeValues = disallowedUserAttributeValues;
        this.minPasswordAge = minPasswordAge;
        this.passwordExpiresAfter = passwordExpiresAfter;
        this.passwordExpireWarning = passwordExpireWarning;
        this.requiredChars = requiredChars;
        this.disallowedChars = disallowedChars;
        this.allowedChars = allowedChars;
        this.disallowedSubstrings = disallowedSubstrings;
        this.dictionaryWordDisallowed = dictionaryWordDisallowed;
        this.dictionaryLocation = dictionaryLocation;
        this.dictionaryDelimiter = dictionaryDelimiter;
        this.maxIncorrectAttempts = maxIncorrectAttempts;
        this.lockoutDuration = lockoutDuration;
        this.numPasswordsInHistory = numPasswordsInHistory;
        this.passwordStrength = passwordStrength;
        this.forcePasswordReset = forcePasswordReset;
        this.distinctCharacters = distinctCharacters;
        this.priority = priority;
        this.groups = groups;
        this.configuredPasswordPolicyRules = configuredPasswordPolicyRules;
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
         * A String that is the name of the policy to display to the user. This is the only
         * mandatory attribute for a password policy.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: always - type: string - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A String that is the name of the policy to display to the user. This is the only
         * mandatory attribute for a password policy.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: true - returned: always - type: string - uniqueness:
         * server
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
         * A String that describes the password policy
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A String that describes the password policy
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
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
         * The maximum password length (in characters). A value of 0 or no value indicates no
         * maximum length restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private Integer maxLength;

        /**
         * The maximum password length (in characters). A value of 0 or no value indicates no
         * maximum length restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
         * none
         *
         * @param maxLength the value to set
         * @return this builder
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }
        /**
         * The minimum password length (in characters). A value of 0 or no value indicates no
         * minimum length restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private Integer minLength;

        /**
         * The minimum password length (in characters). A value of 0 or no value indicates no
         * minimum length restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minLength the value to set
         * @return this builder
         */
        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }
        /**
         * The minimum number of alphabetic characters in a password. A value of 0 or no value
         * indicates no minimum alphas restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minAlphas")
        private Integer minAlphas;

        /**
         * The minimum number of alphabetic characters in a password. A value of 0 or no value
         * indicates no minimum alphas restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minAlphas the value to set
         * @return this builder
         */
        public Builder minAlphas(Integer minAlphas) {
            this.minAlphas = minAlphas;
            this.__explicitlySet__.add("minAlphas");
            return this;
        }
        /**
         * The minimum number of numeric characters in a password. A value of 0 or no value
         * indicates no minimum numeric character restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minNumerals")
        private Integer minNumerals;

        /**
         * The minimum number of numeric characters in a password. A value of 0 or no value
         * indicates no minimum numeric character restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minNumerals the value to set
         * @return this builder
         */
        public Builder minNumerals(Integer minNumerals) {
            this.minNumerals = minNumerals;
            this.__explicitlySet__.add("minNumerals");
            return this;
        }
        /**
         * The minimum number of a combination of alphabetic and numeric characters in a password. A
         * value of 0 or no value indicates no minimum alphanumeric character restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minAlphaNumerals")
        private Integer minAlphaNumerals;

        /**
         * The minimum number of a combination of alphabetic and numeric characters in a password. A
         * value of 0 or no value indicates no minimum alphanumeric character restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minAlphaNumerals the value to set
         * @return this builder
         */
        public Builder minAlphaNumerals(Integer minAlphaNumerals) {
            this.minAlphaNumerals = minAlphaNumerals;
            this.__explicitlySet__.add("minAlphaNumerals");
            return this;
        }
        /**
         * The minimum number of special characters in a password. A value of 0 or no value
         * indicates no minimum special characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minSpecialChars")
        private Integer minSpecialChars;

        /**
         * The minimum number of special characters in a password. A value of 0 or no value
         * indicates no minimum special characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minSpecialChars the value to set
         * @return this builder
         */
        public Builder minSpecialChars(Integer minSpecialChars) {
            this.minSpecialChars = minSpecialChars;
            this.__explicitlySet__.add("minSpecialChars");
            return this;
        }
        /**
         * The maximum number of special characters in a password. A value of 0 or no value
         * indicates no maximum special characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSpecialChars")
        private Integer maxSpecialChars;

        /**
         * The maximum number of special characters in a password. A value of 0 or no value
         * indicates no maximum special characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param maxSpecialChars the value to set
         * @return this builder
         */
        public Builder maxSpecialChars(Integer maxSpecialChars) {
            this.maxSpecialChars = maxSpecialChars;
            this.__explicitlySet__.add("maxSpecialChars");
            return this;
        }
        /**
         * The minimum number of lowercase alphabetic characters in a password. A value of 0 or no
         * value indicates no minimum lowercase restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minLowerCase")
        private Integer minLowerCase;

        /**
         * The minimum number of lowercase alphabetic characters in a password. A value of 0 or no
         * value indicates no minimum lowercase restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minLowerCase the value to set
         * @return this builder
         */
        public Builder minLowerCase(Integer minLowerCase) {
            this.minLowerCase = minLowerCase;
            this.__explicitlySet__.add("minLowerCase");
            return this;
        }
        /**
         * The minimum number of uppercase alphabetic characters in a password. A value of 0 or no
         * value indicates no minimum uppercase restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minUpperCase")
        private Integer minUpperCase;

        /**
         * The minimum number of uppercase alphabetic characters in a password. A value of 0 or no
         * value indicates no minimum uppercase restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minUpperCase the value to set
         * @return this builder
         */
        public Builder minUpperCase(Integer minUpperCase) {
            this.minUpperCase = minUpperCase;
            this.__explicitlySet__.add("minUpperCase");
            return this;
        }
        /**
         * The minimum number of unique characters in a password. A value of 0 or no value indicates
         * no minimum unique characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minUniqueChars")
        private Integer minUniqueChars;

        /**
         * The minimum number of unique characters in a password. A value of 0 or no value indicates
         * no minimum unique characters restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minUniqueChars the value to set
         * @return this builder
         */
        public Builder minUniqueChars(Integer minUniqueChars) {
            this.minUniqueChars = minUniqueChars;
            this.__explicitlySet__.add("minUniqueChars");
            return this;
        }
        /**
         * The maximum number of repeated characters allowed in a password. A value of 0 or no value
         * indicates no such restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxRepeatedChars")
        private Integer maxRepeatedChars;

        /**
         * The maximum number of repeated characters allowed in a password. A value of 0 or no value
         * indicates no such restriction.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param maxRepeatedChars the value to set
         * @return this builder
         */
        public Builder maxRepeatedChars(Integer maxRepeatedChars) {
            this.maxRepeatedChars = maxRepeatedChars;
            this.__explicitlySet__.add("maxRepeatedChars");
            return this;
        }
        /**
         * Indicates that the password must begin with an alphabetic character
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startsWithAlphabet")
        private Boolean startsWithAlphabet;

        /**
         * Indicates that the password must begin with an alphabetic character
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param startsWithAlphabet the value to set
         * @return this builder
         */
        public Builder startsWithAlphabet(Boolean startsWithAlphabet) {
            this.startsWithAlphabet = startsWithAlphabet;
            this.__explicitlySet__.add("startsWithAlphabet");
            return this;
        }
        /**
         * Indicates a sequence of characters that match the user's first name of given name cannot
         * be the password. Password validation against policy will be ignored if length of first
         * name is less than or equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("firstNameDisallowed")
        private Boolean firstNameDisallowed;

        /**
         * Indicates a sequence of characters that match the user's first name of given name cannot
         * be the password. Password validation against policy will be ignored if length of first
         * name is less than or equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param firstNameDisallowed the value to set
         * @return this builder
         */
        public Builder firstNameDisallowed(Boolean firstNameDisallowed) {
            this.firstNameDisallowed = firstNameDisallowed;
            this.__explicitlySet__.add("firstNameDisallowed");
            return this;
        }
        /**
         * Indicates a sequence of characters that match the user's last name of given name cannot
         * be the password. Password validation against policy will be ignored if length of last
         * name is less than or equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastNameDisallowed")
        private Boolean lastNameDisallowed;

        /**
         * Indicates a sequence of characters that match the user's last name of given name cannot
         * be the password. Password validation against policy will be ignored if length of last
         * name is less than or equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param lastNameDisallowed the value to set
         * @return this builder
         */
        public Builder lastNameDisallowed(Boolean lastNameDisallowed) {
            this.lastNameDisallowed = lastNameDisallowed;
            this.__explicitlySet__.add("lastNameDisallowed");
            return this;
        }
        /**
         * Indicates a sequence of characters that match the username cannot be the password.
         * Password validation against policy will be ignored if length of user name is less than or
         * equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userNameDisallowed")
        private Boolean userNameDisallowed;

        /**
         * Indicates a sequence of characters that match the username cannot be the password.
         * Password validation against policy will be ignored if length of user name is less than or
         * equal to 3 characters.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param userNameDisallowed the value to set
         * @return this builder
         */
        public Builder userNameDisallowed(Boolean userNameDisallowed) {
            this.userNameDisallowed = userNameDisallowed;
            this.__explicitlySet__.add("userNameDisallowed");
            return this;
        }
        /**
         * List of User attributes whose values are not allowed in the password.
         *
         * <p>*Added In:** 2303212224
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disallowedUserAttributeValues")
        private java.util.List<String> disallowedUserAttributeValues;

        /**
         * List of User attributes whose values are not allowed in the password.
         *
         * <p>*Added In:** 2303212224
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param disallowedUserAttributeValues the value to set
         * @return this builder
         */
        public Builder disallowedUserAttributeValues(
                java.util.List<String> disallowedUserAttributeValues) {
            this.disallowedUserAttributeValues = disallowedUserAttributeValues;
            this.__explicitlySet__.add("disallowedUserAttributeValues");
            return this;
        }
        /**
         * Minimum time after which the user can resubmit the reset password request
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minPasswordAge")
        private Integer minPasswordAge;

        /**
         * Minimum time after which the user can resubmit the reset password request
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param minPasswordAge the value to set
         * @return this builder
         */
        public Builder minPasswordAge(Integer minPasswordAge) {
            this.minPasswordAge = minPasswordAge;
            this.__explicitlySet__.add("minPasswordAge");
            return this;
        }
        /**
         * The number of days after which the password expires automatically
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordExpiresAfter")
        private Integer passwordExpiresAfter;

        /**
         * The number of days after which the password expires automatically
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param passwordExpiresAfter the value to set
         * @return this builder
         */
        public Builder passwordExpiresAfter(Integer passwordExpiresAfter) {
            this.passwordExpiresAfter = passwordExpiresAfter;
            this.__explicitlySet__.add("passwordExpiresAfter");
            return this;
        }
        /**
         * An integer indicating the number of days before which the user should be warned about
         * password expiry.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordExpireWarning")
        private Integer passwordExpireWarning;

        /**
         * An integer indicating the number of days before which the user should be warned about
         * password expiry.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param passwordExpireWarning the value to set
         * @return this builder
         */
        public Builder passwordExpireWarning(Integer passwordExpireWarning) {
            this.passwordExpireWarning = passwordExpireWarning;
            this.__explicitlySet__.add("passwordExpireWarning");
            return this;
        }
        /**
         * A String value whose contents indicate a set of characters that must appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requiredChars")
        private String requiredChars;

        /**
         * A String value whose contents indicate a set of characters that must appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param requiredChars the value to set
         * @return this builder
         */
        public Builder requiredChars(String requiredChars) {
            this.requiredChars = requiredChars;
            this.__explicitlySet__.add("requiredChars");
            return this;
        }
        /**
         * A String value whose contents indicate a set of characters that cannot appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disallowedChars")
        private String disallowedChars;

        /**
         * A String value whose contents indicate a set of characters that cannot appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param disallowedChars the value to set
         * @return this builder
         */
        public Builder disallowedChars(String disallowedChars) {
            this.disallowedChars = disallowedChars;
            this.__explicitlySet__.add("disallowedChars");
            return this;
        }
        /**
         * A String value whose contents indicate a set of characters that can appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedChars")
        private String allowedChars;

        /**
         * A String value whose contents indicate a set of characters that can appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param allowedChars the value to set
         * @return this builder
         */
        public Builder allowedChars(String allowedChars) {
            this.allowedChars = allowedChars;
            this.__explicitlySet__.add("allowedChars");
            return this;
        }
        /**
         * A String value whose contents indicate a set of substrings that cannot appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disallowedSubstrings")
        private java.util.List<String> disallowedSubstrings;

        /**
         * A String value whose contents indicate a set of substrings that cannot appear, in any
         * sequence, in a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param disallowedSubstrings the value to set
         * @return this builder
         */
        public Builder disallowedSubstrings(java.util.List<String> disallowedSubstrings) {
            this.disallowedSubstrings = disallowedSubstrings;
            this.__explicitlySet__.add("disallowedSubstrings");
            return this;
        }
        /**
         * Indicates whether the password can match a dictionary word
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dictionaryWordDisallowed")
        private Boolean dictionaryWordDisallowed;

        /**
         * Indicates whether the password can match a dictionary word
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param dictionaryWordDisallowed the value to set
         * @return this builder
         */
        public Builder dictionaryWordDisallowed(Boolean dictionaryWordDisallowed) {
            this.dictionaryWordDisallowed = dictionaryWordDisallowed;
            this.__explicitlySet__.add("dictionaryWordDisallowed");
            return this;
        }
        /**
         * A Reference value that contains the URI of a dictionary of words not allowed to appear
         * within a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dictionaryLocation")
        private String dictionaryLocation;

        /**
         * A Reference value that contains the URI of a dictionary of words not allowed to appear
         * within a password value
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param dictionaryLocation the value to set
         * @return this builder
         */
        public Builder dictionaryLocation(String dictionaryLocation) {
            this.dictionaryLocation = dictionaryLocation;
            this.__explicitlySet__.add("dictionaryLocation");
            return this;
        }
        /**
         * A delimiter used to separate characters in the dictionary file
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dictionaryDelimiter")
        private String dictionaryDelimiter;

        /**
         * A delimiter used to separate characters in the dictionary file
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param dictionaryDelimiter the value to set
         * @return this builder
         */
        public Builder dictionaryDelimiter(String dictionaryDelimiter) {
            this.dictionaryDelimiter = dictionaryDelimiter;
            this.__explicitlySet__.add("dictionaryDelimiter");
            return this;
        }
        /**
         * An integer that represents the maximum number of failed logins before an account is
         * locked
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxIncorrectAttempts")
        private Integer maxIncorrectAttempts;

        /**
         * An integer that represents the maximum number of failed logins before an account is
         * locked
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param maxIncorrectAttempts the value to set
         * @return this builder
         */
        public Builder maxIncorrectAttempts(Integer maxIncorrectAttempts) {
            this.maxIncorrectAttempts = maxIncorrectAttempts;
            this.__explicitlySet__.add("maxIncorrectAttempts");
            return this;
        }
        /**
         * The time period in minutes to lock out a user account when the threshold of invalid login
         * attempts is reached. The available range is from 5 through 1440 minutes (24 hours).
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockoutDuration")
        private Integer lockoutDuration;

        /**
         * The time period in minutes to lock out a user account when the threshold of invalid login
         * attempts is reached. The available range is from 5 through 1440 minutes (24 hours).
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param lockoutDuration the value to set
         * @return this builder
         */
        public Builder lockoutDuration(Integer lockoutDuration) {
            this.lockoutDuration = lockoutDuration;
            this.__explicitlySet__.add("lockoutDuration");
            return this;
        }
        /**
         * The number of passwords that will be kept in history that may not be used as a password
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("numPasswordsInHistory")
        private Integer numPasswordsInHistory;

        /**
         * The number of passwords that will be kept in history that may not be used as a password
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param numPasswordsInHistory the value to set
         * @return this builder
         */
        public Builder numPasswordsInHistory(Integer numPasswordsInHistory) {
            this.numPasswordsInHistory = numPasswordsInHistory;
            this.__explicitlySet__.add("numPasswordsInHistory");
            return this;
        }
        /**
         * Indicates whether the password policy is configured as Simple, Standard, or Custom.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordStrength")
        private PasswordStrength passwordStrength;

        /**
         * Indicates whether the password policy is configured as Simple, Standard, or Custom.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param passwordStrength the value to set
         * @return this builder
         */
        public Builder passwordStrength(PasswordStrength passwordStrength) {
            this.passwordStrength = passwordStrength;
            this.__explicitlySet__.add("passwordStrength");
            return this;
        }
        /**
         * Indicates whether all of the users should be forced to reset their password on the next
         * login (to comply with new password policy changes)
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: writeOnly
         * - required: false - returned: never - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("forcePasswordReset")
        private Boolean forcePasswordReset;

        /**
         * Indicates whether all of the users should be forced to reset their password on the next
         * login (to comply with new password policy changes)
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: writeOnly
         * - required: false - returned: never - type: boolean - uniqueness: none
         *
         * @param forcePasswordReset the value to set
         * @return this builder
         */
        public Builder forcePasswordReset(Boolean forcePasswordReset) {
            this.forcePasswordReset = forcePasswordReset;
            this.__explicitlySet__.add("forcePasswordReset");
            return this;
        }
        /**
         * The number of distinct characters between old password and new password
         *
         * <p>*Added In:** 2303212224
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("distinctCharacters")
        private Integer distinctCharacters;

        /**
         * The number of distinct characters between old password and new password
         *
         * <p>*Added In:** 2303212224
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - uniqueness: none
         *
         * @param distinctCharacters the value to set
         * @return this builder
         */
        public Builder distinctCharacters(Integer distinctCharacters) {
            this.distinctCharacters = distinctCharacters;
            this.__explicitlySet__.add("distinctCharacters");
            return this;
        }
        /**
         * Password policy priority
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - idcsMinValue: 1 - uniqueness:
         * server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Password policy priority
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: integer - idcsMinValue: 1 - uniqueness:
         * server
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * A list of groups that the password policy belongs to.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<PasswordPolicyGroups> groups;

        /**
         * A list of groups that the password policy belongs to.
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
         * true - multiValued: true - mutability: readWrite - required: false - returned: default -
         * type: complex - uniqueness: none
         *
         * @param groups the value to set
         * @return this builder
         */
        public Builder groups(java.util.List<PasswordPolicyGroups> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }
        /**
         * List of password policy rules that have values set. This map of stringKey:stringValue
         * pairs can be used to aid users while setting/resetting password
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [key] - multiValued: true
         * - mutability: readOnly - required: false - returned: request - type: complex -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configuredPasswordPolicyRules")
        private java.util.List<PasswordPolicyConfiguredPasswordPolicyRules>
                configuredPasswordPolicyRules;

        /**
         * List of password policy rules that have values set. This map of stringKey:stringValue
         * pairs can be used to aid users while setting/resetting password
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [key] - multiValued: true
         * - mutability: readOnly - required: false - returned: request - type: complex -
         * uniqueness: none
         *
         * @param configuredPasswordPolicyRules the value to set
         * @return this builder
         */
        public Builder configuredPasswordPolicyRules(
                java.util.List<PasswordPolicyConfiguredPasswordPolicyRules>
                        configuredPasswordPolicyRules) {
            this.configuredPasswordPolicyRules = configuredPasswordPolicyRules;
            this.__explicitlySet__.add("configuredPasswordPolicyRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordPolicy build() {
            PasswordPolicy model =
                    new PasswordPolicy(
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
                            this.name,
                            this.description,
                            this.maxLength,
                            this.minLength,
                            this.minAlphas,
                            this.minNumerals,
                            this.minAlphaNumerals,
                            this.minSpecialChars,
                            this.maxSpecialChars,
                            this.minLowerCase,
                            this.minUpperCase,
                            this.minUniqueChars,
                            this.maxRepeatedChars,
                            this.startsWithAlphabet,
                            this.firstNameDisallowed,
                            this.lastNameDisallowed,
                            this.userNameDisallowed,
                            this.disallowedUserAttributeValues,
                            this.minPasswordAge,
                            this.passwordExpiresAfter,
                            this.passwordExpireWarning,
                            this.requiredChars,
                            this.disallowedChars,
                            this.allowedChars,
                            this.disallowedSubstrings,
                            this.dictionaryWordDisallowed,
                            this.dictionaryLocation,
                            this.dictionaryDelimiter,
                            this.maxIncorrectAttempts,
                            this.lockoutDuration,
                            this.numPasswordsInHistory,
                            this.passwordStrength,
                            this.forcePasswordReset,
                            this.distinctCharacters,
                            this.priority,
                            this.groups,
                            this.configuredPasswordPolicyRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordPolicy model) {
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
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("maxLength")) {
                this.maxLength(model.getMaxLength());
            }
            if (model.wasPropertyExplicitlySet("minLength")) {
                this.minLength(model.getMinLength());
            }
            if (model.wasPropertyExplicitlySet("minAlphas")) {
                this.minAlphas(model.getMinAlphas());
            }
            if (model.wasPropertyExplicitlySet("minNumerals")) {
                this.minNumerals(model.getMinNumerals());
            }
            if (model.wasPropertyExplicitlySet("minAlphaNumerals")) {
                this.minAlphaNumerals(model.getMinAlphaNumerals());
            }
            if (model.wasPropertyExplicitlySet("minSpecialChars")) {
                this.minSpecialChars(model.getMinSpecialChars());
            }
            if (model.wasPropertyExplicitlySet("maxSpecialChars")) {
                this.maxSpecialChars(model.getMaxSpecialChars());
            }
            if (model.wasPropertyExplicitlySet("minLowerCase")) {
                this.minLowerCase(model.getMinLowerCase());
            }
            if (model.wasPropertyExplicitlySet("minUpperCase")) {
                this.minUpperCase(model.getMinUpperCase());
            }
            if (model.wasPropertyExplicitlySet("minUniqueChars")) {
                this.minUniqueChars(model.getMinUniqueChars());
            }
            if (model.wasPropertyExplicitlySet("maxRepeatedChars")) {
                this.maxRepeatedChars(model.getMaxRepeatedChars());
            }
            if (model.wasPropertyExplicitlySet("startsWithAlphabet")) {
                this.startsWithAlphabet(model.getStartsWithAlphabet());
            }
            if (model.wasPropertyExplicitlySet("firstNameDisallowed")) {
                this.firstNameDisallowed(model.getFirstNameDisallowed());
            }
            if (model.wasPropertyExplicitlySet("lastNameDisallowed")) {
                this.lastNameDisallowed(model.getLastNameDisallowed());
            }
            if (model.wasPropertyExplicitlySet("userNameDisallowed")) {
                this.userNameDisallowed(model.getUserNameDisallowed());
            }
            if (model.wasPropertyExplicitlySet("disallowedUserAttributeValues")) {
                this.disallowedUserAttributeValues(model.getDisallowedUserAttributeValues());
            }
            if (model.wasPropertyExplicitlySet("minPasswordAge")) {
                this.minPasswordAge(model.getMinPasswordAge());
            }
            if (model.wasPropertyExplicitlySet("passwordExpiresAfter")) {
                this.passwordExpiresAfter(model.getPasswordExpiresAfter());
            }
            if (model.wasPropertyExplicitlySet("passwordExpireWarning")) {
                this.passwordExpireWarning(model.getPasswordExpireWarning());
            }
            if (model.wasPropertyExplicitlySet("requiredChars")) {
                this.requiredChars(model.getRequiredChars());
            }
            if (model.wasPropertyExplicitlySet("disallowedChars")) {
                this.disallowedChars(model.getDisallowedChars());
            }
            if (model.wasPropertyExplicitlySet("allowedChars")) {
                this.allowedChars(model.getAllowedChars());
            }
            if (model.wasPropertyExplicitlySet("disallowedSubstrings")) {
                this.disallowedSubstrings(model.getDisallowedSubstrings());
            }
            if (model.wasPropertyExplicitlySet("dictionaryWordDisallowed")) {
                this.dictionaryWordDisallowed(model.getDictionaryWordDisallowed());
            }
            if (model.wasPropertyExplicitlySet("dictionaryLocation")) {
                this.dictionaryLocation(model.getDictionaryLocation());
            }
            if (model.wasPropertyExplicitlySet("dictionaryDelimiter")) {
                this.dictionaryDelimiter(model.getDictionaryDelimiter());
            }
            if (model.wasPropertyExplicitlySet("maxIncorrectAttempts")) {
                this.maxIncorrectAttempts(model.getMaxIncorrectAttempts());
            }
            if (model.wasPropertyExplicitlySet("lockoutDuration")) {
                this.lockoutDuration(model.getLockoutDuration());
            }
            if (model.wasPropertyExplicitlySet("numPasswordsInHistory")) {
                this.numPasswordsInHistory(model.getNumPasswordsInHistory());
            }
            if (model.wasPropertyExplicitlySet("passwordStrength")) {
                this.passwordStrength(model.getPasswordStrength());
            }
            if (model.wasPropertyExplicitlySet("forcePasswordReset")) {
                this.forcePasswordReset(model.getForcePasswordReset());
            }
            if (model.wasPropertyExplicitlySet("distinctCharacters")) {
                this.distinctCharacters(model.getDistinctCharacters());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("groups")) {
                this.groups(model.getGroups());
            }
            if (model.wasPropertyExplicitlySet("configuredPasswordPolicyRules")) {
                this.configuredPasswordPolicyRules(model.getConfiguredPasswordPolicyRules());
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
     * A String that is the name of the policy to display to the user. This is the only mandatory
     * attribute for a password policy.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: always - type: string - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A String that is the name of the policy to display to the user. This is the only mandatory
     * attribute for a password policy.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: true - returned: always - type: string - uniqueness: server
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A String that describes the password policy
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A String that describes the password policy
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The maximum password length (in characters). A value of 0 or no value indicates no maximum
     * length restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private final Integer maxLength;

    /**
     * The maximum password length (in characters). A value of 0 or no value indicates no maximum
     * length restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: integer - uniqueness:
     * none
     *
     * @return the value
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * The minimum password length (in characters). A value of 0 or no value indicates no minimum
     * length restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private final Integer minLength;

    /**
     * The minimum password length (in characters). A value of 0 or no value indicates no minimum
     * length restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * The minimum number of alphabetic characters in a password. A value of 0 or no value indicates
     * no minimum alphas restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minAlphas")
    private final Integer minAlphas;

    /**
     * The minimum number of alphabetic characters in a password. A value of 0 or no value indicates
     * no minimum alphas restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinAlphas() {
        return minAlphas;
    }

    /**
     * The minimum number of numeric characters in a password. A value of 0 or no value indicates no
     * minimum numeric character restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minNumerals")
    private final Integer minNumerals;

    /**
     * The minimum number of numeric characters in a password. A value of 0 or no value indicates no
     * minimum numeric character restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinNumerals() {
        return minNumerals;
    }

    /**
     * The minimum number of a combination of alphabetic and numeric characters in a password. A
     * value of 0 or no value indicates no minimum alphanumeric character restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minAlphaNumerals")
    private final Integer minAlphaNumerals;

    /**
     * The minimum number of a combination of alphabetic and numeric characters in a password. A
     * value of 0 or no value indicates no minimum alphanumeric character restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinAlphaNumerals() {
        return minAlphaNumerals;
    }

    /**
     * The minimum number of special characters in a password. A value of 0 or no value indicates no
     * minimum special characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minSpecialChars")
    private final Integer minSpecialChars;

    /**
     * The minimum number of special characters in a password. A value of 0 or no value indicates no
     * minimum special characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinSpecialChars() {
        return minSpecialChars;
    }

    /**
     * The maximum number of special characters in a password. A value of 0 or no value indicates no
     * maximum special characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSpecialChars")
    private final Integer maxSpecialChars;

    /**
     * The maximum number of special characters in a password. A value of 0 or no value indicates no
     * maximum special characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxSpecialChars() {
        return maxSpecialChars;
    }

    /**
     * The minimum number of lowercase alphabetic characters in a password. A value of 0 or no value
     * indicates no minimum lowercase restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minLowerCase")
    private final Integer minLowerCase;

    /**
     * The minimum number of lowercase alphabetic characters in a password. A value of 0 or no value
     * indicates no minimum lowercase restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinLowerCase() {
        return minLowerCase;
    }

    /**
     * The minimum number of uppercase alphabetic characters in a password. A value of 0 or no value
     * indicates no minimum uppercase restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minUpperCase")
    private final Integer minUpperCase;

    /**
     * The minimum number of uppercase alphabetic characters in a password. A value of 0 or no value
     * indicates no minimum uppercase restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinUpperCase() {
        return minUpperCase;
    }

    /**
     * The minimum number of unique characters in a password. A value of 0 or no value indicates no
     * minimum unique characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minUniqueChars")
    private final Integer minUniqueChars;

    /**
     * The minimum number of unique characters in a password. A value of 0 or no value indicates no
     * minimum unique characters restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinUniqueChars() {
        return minUniqueChars;
    }

    /**
     * The maximum number of repeated characters allowed in a password. A value of 0 or no value
     * indicates no such restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRepeatedChars")
    private final Integer maxRepeatedChars;

    /**
     * The maximum number of repeated characters allowed in a password. A value of 0 or no value
     * indicates no such restriction.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxRepeatedChars() {
        return maxRepeatedChars;
    }

    /**
     * Indicates that the password must begin with an alphabetic character
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startsWithAlphabet")
    private final Boolean startsWithAlphabet;

    /**
     * Indicates that the password must begin with an alphabetic character
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getStartsWithAlphabet() {
        return startsWithAlphabet;
    }

    /**
     * Indicates a sequence of characters that match the user's first name of given name cannot be
     * the password. Password validation against policy will be ignored if length of first name is
     * less than or equal to 3 characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firstNameDisallowed")
    private final Boolean firstNameDisallowed;

    /**
     * Indicates a sequence of characters that match the user's first name of given name cannot be
     * the password. Password validation against policy will be ignored if length of first name is
     * less than or equal to 3 characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getFirstNameDisallowed() {
        return firstNameDisallowed;
    }

    /**
     * Indicates a sequence of characters that match the user's last name of given name cannot be
     * the password. Password validation against policy will be ignored if length of last name is
     * less than or equal to 3 characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastNameDisallowed")
    private final Boolean lastNameDisallowed;

    /**
     * Indicates a sequence of characters that match the user's last name of given name cannot be
     * the password. Password validation against policy will be ignored if length of last name is
     * less than or equal to 3 characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getLastNameDisallowed() {
        return lastNameDisallowed;
    }

    /**
     * Indicates a sequence of characters that match the username cannot be the password. Password
     * validation against policy will be ignored if length of user name is less than or equal to 3
     * characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userNameDisallowed")
    private final Boolean userNameDisallowed;

    /**
     * Indicates a sequence of characters that match the username cannot be the password. Password
     * validation against policy will be ignored if length of user name is less than or equal to 3
     * characters.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getUserNameDisallowed() {
        return userNameDisallowed;
    }

    /**
     * List of User attributes whose values are not allowed in the password.
     *
     * <p>*Added In:** 2303212224
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disallowedUserAttributeValues")
    private final java.util.List<String> disallowedUserAttributeValues;

    /**
     * List of User attributes whose values are not allowed in the password.
     *
     * <p>*Added In:** 2303212224
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: true - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getDisallowedUserAttributeValues() {
        return disallowedUserAttributeValues;
    }

    /**
     * Minimum time after which the user can resubmit the reset password request
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minPasswordAge")
    private final Integer minPasswordAge;

    /**
     * Minimum time after which the user can resubmit the reset password request
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinPasswordAge() {
        return minPasswordAge;
    }

    /**
     * The number of days after which the password expires automatically
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordExpiresAfter")
    private final Integer passwordExpiresAfter;

    /**
     * The number of days after which the password expires automatically
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getPasswordExpiresAfter() {
        return passwordExpiresAfter;
    }

    /**
     * An integer indicating the number of days before which the user should be warned about
     * password expiry.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordExpireWarning")
    private final Integer passwordExpireWarning;

    /**
     * An integer indicating the number of days before which the user should be warned about
     * password expiry.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getPasswordExpireWarning() {
        return passwordExpireWarning;
    }

    /**
     * A String value whose contents indicate a set of characters that must appear, in any sequence,
     * in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredChars")
    private final String requiredChars;

    /**
     * A String value whose contents indicate a set of characters that must appear, in any sequence,
     * in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRequiredChars() {
        return requiredChars;
    }

    /**
     * A String value whose contents indicate a set of characters that cannot appear, in any
     * sequence, in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disallowedChars")
    private final String disallowedChars;

    /**
     * A String value whose contents indicate a set of characters that cannot appear, in any
     * sequence, in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisallowedChars() {
        return disallowedChars;
    }

    /**
     * A String value whose contents indicate a set of characters that can appear, in any sequence,
     * in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedChars")
    private final String allowedChars;

    /**
     * A String value whose contents indicate a set of characters that can appear, in any sequence,
     * in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAllowedChars() {
        return allowedChars;
    }

    /**
     * A String value whose contents indicate a set of substrings that cannot appear, in any
     * sequence, in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disallowedSubstrings")
    private final java.util.List<String> disallowedSubstrings;

    /**
     * A String value whose contents indicate a set of substrings that cannot appear, in any
     * sequence, in a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getDisallowedSubstrings() {
        return disallowedSubstrings;
    }

    /**
     * Indicates whether the password can match a dictionary word
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dictionaryWordDisallowed")
    private final Boolean dictionaryWordDisallowed;

    /**
     * Indicates whether the password can match a dictionary word
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getDictionaryWordDisallowed() {
        return dictionaryWordDisallowed;
    }

    /**
     * A Reference value that contains the URI of a dictionary of words not allowed to appear within
     * a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dictionaryLocation")
    private final String dictionaryLocation;

    /**
     * A Reference value that contains the URI of a dictionary of words not allowed to appear within
     * a password value
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDictionaryLocation() {
        return dictionaryLocation;
    }

    /**
     * A delimiter used to separate characters in the dictionary file
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dictionaryDelimiter")
    private final String dictionaryDelimiter;

    /**
     * A delimiter used to separate characters in the dictionary file
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDictionaryDelimiter() {
        return dictionaryDelimiter;
    }

    /**
     * An integer that represents the maximum number of failed logins before an account is locked
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxIncorrectAttempts")
    private final Integer maxIncorrectAttempts;

    /**
     * An integer that represents the maximum number of failed logins before an account is locked
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxIncorrectAttempts() {
        return maxIncorrectAttempts;
    }

    /**
     * The time period in minutes to lock out a user account when the threshold of invalid login
     * attempts is reached. The available range is from 5 through 1440 minutes (24 hours).
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockoutDuration")
    private final Integer lockoutDuration;

    /**
     * The time period in minutes to lock out a user account when the threshold of invalid login
     * attempts is reached. The available range is from 5 through 1440 minutes (24 hours).
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * The number of passwords that will be kept in history that may not be used as a password
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("numPasswordsInHistory")
    private final Integer numPasswordsInHistory;

    /**
     * The number of passwords that will be kept in history that may not be used as a password
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getNumPasswordsInHistory() {
        return numPasswordsInHistory;
    }

    /**
     * Indicates whether the password policy is configured as Simple, Standard, or Custom.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    public enum PasswordStrength implements com.oracle.bmc.http.internal.BmcEnum {
        Simple("Simple"),
        Standard("Standard"),
        Custom("Custom"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PasswordStrength.class);

        private final String value;
        private static java.util.Map<String, PasswordStrength> map;

        static {
            map = new java.util.HashMap<>();
            for (PasswordStrength v : PasswordStrength.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PasswordStrength(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PasswordStrength create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PasswordStrength', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the password policy is configured as Simple, Standard, or Custom.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordStrength")
    private final PasswordStrength passwordStrength;

    /**
     * Indicates whether the password policy is configured as Simple, Standard, or Custom.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public PasswordStrength getPasswordStrength() {
        return passwordStrength;
    }

    /**
     * Indicates whether all of the users should be forced to reset their password on the next login
     * (to comply with new password policy changes)
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: writeOnly -
     * required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forcePasswordReset")
    private final Boolean forcePasswordReset;

    /**
     * Indicates whether all of the users should be forced to reset their password on the next login
     * (to comply with new password policy changes)
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: writeOnly -
     * required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getForcePasswordReset() {
        return forcePasswordReset;
    }

    /**
     * The number of distinct characters between old password and new password
     *
     * <p>*Added In:** 2303212224
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distinctCharacters")
    private final Integer distinctCharacters;

    /**
     * The number of distinct characters between old password and new password
     *
     * <p>*Added In:** 2303212224
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getDistinctCharacters() {
        return distinctCharacters;
    }

    /**
     * Password policy priority
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - idcsMinValue: 1 - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Password policy priority
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: integer - idcsMinValue: 1 - uniqueness: server
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * A list of groups that the password policy belongs to.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * true - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<PasswordPolicyGroups> groups;

    /**
     * A list of groups that the password policy belongs to.
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [value] - idcsSearchable:
     * true - multiValued: true - mutability: readWrite - required: false - returned: default -
     * type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<PasswordPolicyGroups> getGroups() {
        return groups;
    }

    /**
     * List of password policy rules that have values set. This map of stringKey:stringValue pairs
     * can be used to aid users while setting/resetting password
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [key] - multiValued: true -
     * mutability: readOnly - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuredPasswordPolicyRules")
    private final java.util.List<PasswordPolicyConfiguredPasswordPolicyRules>
            configuredPasswordPolicyRules;

    /**
     * List of password policy rules that have values set. This map of stringKey:stringValue pairs
     * can be used to aid users while setting/resetting password
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCompositeKey: [key] - multiValued: true -
     * mutability: readOnly - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<PasswordPolicyConfiguredPasswordPolicyRules>
            getConfiguredPasswordPolicyRules() {
        return configuredPasswordPolicyRules;
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
        sb.append("PasswordPolicy(");
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
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", maxLength=").append(String.valueOf(this.maxLength));
        sb.append(", minLength=").append(String.valueOf(this.minLength));
        sb.append(", minAlphas=").append(String.valueOf(this.minAlphas));
        sb.append(", minNumerals=").append(String.valueOf(this.minNumerals));
        sb.append(", minAlphaNumerals=").append(String.valueOf(this.minAlphaNumerals));
        sb.append(", minSpecialChars=").append(String.valueOf(this.minSpecialChars));
        sb.append(", maxSpecialChars=").append(String.valueOf(this.maxSpecialChars));
        sb.append(", minLowerCase=").append(String.valueOf(this.minLowerCase));
        sb.append(", minUpperCase=").append(String.valueOf(this.minUpperCase));
        sb.append(", minUniqueChars=").append(String.valueOf(this.minUniqueChars));
        sb.append(", maxRepeatedChars=").append(String.valueOf(this.maxRepeatedChars));
        sb.append(", startsWithAlphabet=").append(String.valueOf(this.startsWithAlphabet));
        sb.append(", firstNameDisallowed=").append(String.valueOf(this.firstNameDisallowed));
        sb.append(", lastNameDisallowed=").append(String.valueOf(this.lastNameDisallowed));
        sb.append(", userNameDisallowed=").append(String.valueOf(this.userNameDisallowed));
        sb.append(", disallowedUserAttributeValues=")
                .append(String.valueOf(this.disallowedUserAttributeValues));
        sb.append(", minPasswordAge=").append(String.valueOf(this.minPasswordAge));
        sb.append(", passwordExpiresAfter=").append(String.valueOf(this.passwordExpiresAfter));
        sb.append(", passwordExpireWarning=").append(String.valueOf(this.passwordExpireWarning));
        sb.append(", requiredChars=").append(String.valueOf(this.requiredChars));
        sb.append(", disallowedChars=").append(String.valueOf(this.disallowedChars));
        sb.append(", allowedChars=").append(String.valueOf(this.allowedChars));
        sb.append(", disallowedSubstrings=").append(String.valueOf(this.disallowedSubstrings));
        sb.append(", dictionaryWordDisallowed=")
                .append(String.valueOf(this.dictionaryWordDisallowed));
        sb.append(", dictionaryLocation=").append(String.valueOf(this.dictionaryLocation));
        sb.append(", dictionaryDelimiter=").append(String.valueOf(this.dictionaryDelimiter));
        sb.append(", maxIncorrectAttempts=").append(String.valueOf(this.maxIncorrectAttempts));
        sb.append(", lockoutDuration=").append(String.valueOf(this.lockoutDuration));
        sb.append(", numPasswordsInHistory=").append(String.valueOf(this.numPasswordsInHistory));
        sb.append(", passwordStrength=").append(String.valueOf(this.passwordStrength));
        sb.append(", forcePasswordReset=").append(String.valueOf(this.forcePasswordReset));
        sb.append(", distinctCharacters=").append(String.valueOf(this.distinctCharacters));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", configuredPasswordPolicyRules=")
                .append(String.valueOf(this.configuredPasswordPolicyRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordPolicy)) {
            return false;
        }

        PasswordPolicy other = (PasswordPolicy) o;
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
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.maxLength, other.maxLength)
                && java.util.Objects.equals(this.minLength, other.minLength)
                && java.util.Objects.equals(this.minAlphas, other.minAlphas)
                && java.util.Objects.equals(this.minNumerals, other.minNumerals)
                && java.util.Objects.equals(this.minAlphaNumerals, other.minAlphaNumerals)
                && java.util.Objects.equals(this.minSpecialChars, other.minSpecialChars)
                && java.util.Objects.equals(this.maxSpecialChars, other.maxSpecialChars)
                && java.util.Objects.equals(this.minLowerCase, other.minLowerCase)
                && java.util.Objects.equals(this.minUpperCase, other.minUpperCase)
                && java.util.Objects.equals(this.minUniqueChars, other.minUniqueChars)
                && java.util.Objects.equals(this.maxRepeatedChars, other.maxRepeatedChars)
                && java.util.Objects.equals(this.startsWithAlphabet, other.startsWithAlphabet)
                && java.util.Objects.equals(this.firstNameDisallowed, other.firstNameDisallowed)
                && java.util.Objects.equals(this.lastNameDisallowed, other.lastNameDisallowed)
                && java.util.Objects.equals(this.userNameDisallowed, other.userNameDisallowed)
                && java.util.Objects.equals(
                        this.disallowedUserAttributeValues, other.disallowedUserAttributeValues)
                && java.util.Objects.equals(this.minPasswordAge, other.minPasswordAge)
                && java.util.Objects.equals(this.passwordExpiresAfter, other.passwordExpiresAfter)
                && java.util.Objects.equals(this.passwordExpireWarning, other.passwordExpireWarning)
                && java.util.Objects.equals(this.requiredChars, other.requiredChars)
                && java.util.Objects.equals(this.disallowedChars, other.disallowedChars)
                && java.util.Objects.equals(this.allowedChars, other.allowedChars)
                && java.util.Objects.equals(this.disallowedSubstrings, other.disallowedSubstrings)
                && java.util.Objects.equals(
                        this.dictionaryWordDisallowed, other.dictionaryWordDisallowed)
                && java.util.Objects.equals(this.dictionaryLocation, other.dictionaryLocation)
                && java.util.Objects.equals(this.dictionaryDelimiter, other.dictionaryDelimiter)
                && java.util.Objects.equals(this.maxIncorrectAttempts, other.maxIncorrectAttempts)
                && java.util.Objects.equals(this.lockoutDuration, other.lockoutDuration)
                && java.util.Objects.equals(this.numPasswordsInHistory, other.numPasswordsInHistory)
                && java.util.Objects.equals(this.passwordStrength, other.passwordStrength)
                && java.util.Objects.equals(this.forcePasswordReset, other.forcePasswordReset)
                && java.util.Objects.equals(this.distinctCharacters, other.distinctCharacters)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.configuredPasswordPolicyRules, other.configuredPasswordPolicyRules)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.maxLength == null ? 43 : this.maxLength.hashCode());
        result = (result * PRIME) + (this.minLength == null ? 43 : this.minLength.hashCode());
        result = (result * PRIME) + (this.minAlphas == null ? 43 : this.minAlphas.hashCode());
        result = (result * PRIME) + (this.minNumerals == null ? 43 : this.minNumerals.hashCode());
        result =
                (result * PRIME)
                        + (this.minAlphaNumerals == null ? 43 : this.minAlphaNumerals.hashCode());
        result =
                (result * PRIME)
                        + (this.minSpecialChars == null ? 43 : this.minSpecialChars.hashCode());
        result =
                (result * PRIME)
                        + (this.maxSpecialChars == null ? 43 : this.maxSpecialChars.hashCode());
        result = (result * PRIME) + (this.minLowerCase == null ? 43 : this.minLowerCase.hashCode());
        result = (result * PRIME) + (this.minUpperCase == null ? 43 : this.minUpperCase.hashCode());
        result =
                (result * PRIME)
                        + (this.minUniqueChars == null ? 43 : this.minUniqueChars.hashCode());
        result =
                (result * PRIME)
                        + (this.maxRepeatedChars == null ? 43 : this.maxRepeatedChars.hashCode());
        result =
                (result * PRIME)
                        + (this.startsWithAlphabet == null
                                ? 43
                                : this.startsWithAlphabet.hashCode());
        result =
                (result * PRIME)
                        + (this.firstNameDisallowed == null
                                ? 43
                                : this.firstNameDisallowed.hashCode());
        result =
                (result * PRIME)
                        + (this.lastNameDisallowed == null
                                ? 43
                                : this.lastNameDisallowed.hashCode());
        result =
                (result * PRIME)
                        + (this.userNameDisallowed == null
                                ? 43
                                : this.userNameDisallowed.hashCode());
        result =
                (result * PRIME)
                        + (this.disallowedUserAttributeValues == null
                                ? 43
                                : this.disallowedUserAttributeValues.hashCode());
        result =
                (result * PRIME)
                        + (this.minPasswordAge == null ? 43 : this.minPasswordAge.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordExpiresAfter == null
                                ? 43
                                : this.passwordExpiresAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordExpireWarning == null
                                ? 43
                                : this.passwordExpireWarning.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredChars == null ? 43 : this.requiredChars.hashCode());
        result =
                (result * PRIME)
                        + (this.disallowedChars == null ? 43 : this.disallowedChars.hashCode());
        result = (result * PRIME) + (this.allowedChars == null ? 43 : this.allowedChars.hashCode());
        result =
                (result * PRIME)
                        + (this.disallowedSubstrings == null
                                ? 43
                                : this.disallowedSubstrings.hashCode());
        result =
                (result * PRIME)
                        + (this.dictionaryWordDisallowed == null
                                ? 43
                                : this.dictionaryWordDisallowed.hashCode());
        result =
                (result * PRIME)
                        + (this.dictionaryLocation == null
                                ? 43
                                : this.dictionaryLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.dictionaryDelimiter == null
                                ? 43
                                : this.dictionaryDelimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.maxIncorrectAttempts == null
                                ? 43
                                : this.maxIncorrectAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.lockoutDuration == null ? 43 : this.lockoutDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.numPasswordsInHistory == null
                                ? 43
                                : this.numPasswordsInHistory.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordStrength == null ? 43 : this.passwordStrength.hashCode());
        result =
                (result * PRIME)
                        + (this.forcePasswordReset == null
                                ? 43
                                : this.forcePasswordReset.hashCode());
        result =
                (result * PRIME)
                        + (this.distinctCharacters == null
                                ? 43
                                : this.distinctCharacters.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result =
                (result * PRIME)
                        + (this.configuredPasswordPolicyRules == null
                                ? 43
                                : this.configuredPasswordPolicyRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
