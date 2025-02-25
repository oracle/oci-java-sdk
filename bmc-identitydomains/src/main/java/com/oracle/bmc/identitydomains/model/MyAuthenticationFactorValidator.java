/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Validate any given Authentication Factor
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
    builder = MyAuthenticationFactorValidator.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyAuthenticationFactorValidator
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
        "authFactor",
        "scenario",
        "requestId",
        "otpCode",
        "deviceId",
        "status",
        "userId",
        "userName",
        "displayName",
        "message",
        "type",
        "updateUserPreference",
        "preferenceType",
        "securityQuestions",
        "name",
        "platform",
        "location",
        "trustedTokenId",
        "kmsiTokenId",
        "policyEnabledSecondFactors",
        "createTrustedAgent",
        "createKmsiToken",
        "isAccRecEnabled",
        "policyTrustedFrequencyMins",
        "thirdPartyFactor",
        "additionalAttributes"
    })
    public MyAuthenticationFactorValidator(
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
            AuthFactor authFactor,
            Scenario scenario,
            String requestId,
            String otpCode,
            String deviceId,
            Status status,
            String userId,
            String userName,
            String displayName,
            String message,
            Type type,
            Boolean updateUserPreference,
            PreferenceType preferenceType,
            java.util.List<MyAuthenticationFactorValidatorSecurityQuestions> securityQuestions,
            String name,
            String platform,
            String location,
            String trustedTokenId,
            String kmsiTokenId,
            java.util.List<String> policyEnabledSecondFactors,
            Boolean createTrustedAgent,
            Boolean createKmsiToken,
            Boolean isAccRecEnabled,
            Integer policyTrustedFrequencyMins,
            MyAuthenticationFactorValidatorThirdPartyFactor thirdPartyFactor,
            java.util.List<MyAuthenticationFactorValidatorAdditionalAttributes>
                    additionalAttributes) {
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
        this.authFactor = authFactor;
        this.scenario = scenario;
        this.requestId = requestId;
        this.otpCode = otpCode;
        this.deviceId = deviceId;
        this.status = status;
        this.userId = userId;
        this.userName = userName;
        this.displayName = displayName;
        this.message = message;
        this.type = type;
        this.updateUserPreference = updateUserPreference;
        this.preferenceType = preferenceType;
        this.securityQuestions = securityQuestions;
        this.name = name;
        this.platform = platform;
        this.location = location;
        this.trustedTokenId = trustedTokenId;
        this.kmsiTokenId = kmsiTokenId;
        this.policyEnabledSecondFactors = policyEnabledSecondFactors;
        this.createTrustedAgent = createTrustedAgent;
        this.createKmsiToken = createKmsiToken;
        this.isAccRecEnabled = isAccRecEnabled;
        this.policyTrustedFrequencyMins = policyTrustedFrequencyMins;
        this.thirdPartyFactor = thirdPartyFactor;
        this.additionalAttributes = additionalAttributes;
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
         * Authentication Factor which is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authFactor")
        private AuthFactor authFactor;

        /**
         * Authentication Factor which is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param authFactor the value to set
         * @return this builder
         **/
        public Builder authFactor(AuthFactor authFactor) {
            this.authFactor = authFactor;
            this.__explicitlySet__.add("authFactor");
            return this;
        }
        /**
         * Specifies whether the service is being used to enroll or validate a factor
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scenario")
        private Scenario scenario;

        /**
         * Specifies whether the service is being used to enroll or validate a factor
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: true
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param scenario the value to set
         * @return this builder
         **/
        public Builder scenario(Scenario scenario) {
            this.scenario = scenario;
            this.__explicitlySet__.add("scenario");
            return this;
        }
        /**
         * Request ID which is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestId")
        private String requestId;

        /**
         * Request ID which is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param requestId the value to set
         * @return this builder
         **/
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            this.__explicitlySet__.add("requestId");
            return this;
        }
        /**
         * The One Time Passcode which needs to be validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: never
         *  - uniqueness: none
         *  - idcsSensitive: encrypt
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("otpCode")
        private String otpCode;

        /**
         * The One Time Passcode which needs to be validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: never
         *  - uniqueness: none
         *  - idcsSensitive: encrypt
         *  - idcsSearchable: false
         * @param otpCode the value to set
         * @return this builder
         **/
        public Builder otpCode(String otpCode) {
            this.otpCode = otpCode;
            this.__explicitlySet__.add("otpCode");
            return this;
        }
        /**
         * Device id whose factor is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deviceId")
        private String deviceId;

        /**
         * Device id whose factor is being validated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param deviceId the value to set
         * @return this builder
         **/
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            this.__explicitlySet__.add("deviceId");
            return this;
        }
        /**
         * Validation status returned in the response
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readOnly
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Validation status returned in the response
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readOnly
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * User guid for whom the validation has initiated. Optional.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * User guid for whom the validation has initiated. Optional.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * User name for whom the validation has initiated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         *  - idcsPii: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * User name for whom the validation has initiated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         *  - idcsPii: true
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * Display name of the verified device
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the verified device
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Validator message which is passed by the client. When it is a PUSH notification, it can be a rejection message.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Validator message which is passed by the client. When it is a PUSH notification, it can be a rejection message.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: readWrite
         *  - returned: default
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * type indicating whether the flow is OIDC, SAML etc.,
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: default
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * type indicating whether the flow is OIDC, SAML etc.,
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: default
         *  - uniqueness: none
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Indicates whether to update user preferred mfa factor or not
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateUserPreference")
        private Boolean updateUserPreference;

        /**
         * Indicates whether to update user preferred mfa factor or not
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param updateUserPreference the value to set
         * @return this builder
         **/
        public Builder updateUserPreference(Boolean updateUserPreference) {
            this.updateUserPreference = updateUserPreference;
            this.__explicitlySet__.add("updateUserPreference");
            return this;
        }
        /**
         * Indicates whether to user passwordless factor to be updated or mfa factor to be updated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
        private PreferenceType preferenceType;

        /**
         * Indicates whether to user passwordless factor to be updated or mfa factor to be updated
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param preferenceType the value to set
         * @return this builder
         **/
        public Builder preferenceType(PreferenceType preferenceType) {
            this.preferenceType = preferenceType;
            this.__explicitlySet__.add("preferenceType");
            return this;
        }
        /**
         * List of security questions the user has submitted to get authenticated.
         * <p>
         **SCIM++ Properties:**
         *  - type: complex
         *  - multiValued: true
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         *  - idcsSearchable: false
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityQuestions")
        private java.util.List<MyAuthenticationFactorValidatorSecurityQuestions> securityQuestions;

        /**
         * List of security questions the user has submitted to get authenticated.
         * <p>
         **SCIM++ Properties:**
         *  - type: complex
         *  - multiValued: true
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         *  - idcsSearchable: false
         * @param securityQuestions the value to set
         * @return this builder
         **/
        public Builder securityQuestions(
                java.util.List<MyAuthenticationFactorValidatorSecurityQuestions>
                        securityQuestions) {
            this.securityQuestions = securityQuestions;
            this.__explicitlySet__.add("securityQuestions");
            return this;
        }
        /**
         * Name of the client to be trusted
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the client to be trusted
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Platform of the client to be trusted
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * Platform of the client to be trusted
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param platform the value to set
         * @return this builder
         **/
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /**
         * Location of the trusted client.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * Location of the trusted client.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param location the value to set
         * @return this builder
         **/
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /**
         * Trusted token resource identifier.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustedTokenId")
        private String trustedTokenId;

        /**
         * Trusted token resource identifier.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param trustedTokenId the value to set
         * @return this builder
         **/
        public Builder trustedTokenId(String trustedTokenId) {
            this.trustedTokenId = trustedTokenId;
            this.__explicitlySet__.add("trustedTokenId");
            return this;
        }
        /**
         * KMSI token resource identifier.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsiTokenId")
        private String kmsiTokenId;

        /**
         * KMSI token resource identifier.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param kmsiTokenId the value to set
         * @return this builder
         **/
        public Builder kmsiTokenId(String kmsiTokenId) {
            this.kmsiTokenId = kmsiTokenId;
            this.__explicitlySet__.add("kmsiTokenId");
            return this;
        }
        /**
         * Sign-On Policy dictated allowed second factors.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyEnabledSecondFactors")
        private java.util.List<String> policyEnabledSecondFactors;

        /**
         * Sign-On Policy dictated allowed second factors.
         * <p>
         **SCIM++ Properties:**
         *  - type: string
         *  - multiValued: true
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param policyEnabledSecondFactors the value to set
         * @return this builder
         **/
        public Builder policyEnabledSecondFactors(
                java.util.List<String> policyEnabledSecondFactors) {
            this.policyEnabledSecondFactors = policyEnabledSecondFactors;
            this.__explicitlySet__.add("policyEnabledSecondFactors");
            return this;
        }
        /**
         * Indicates to create trust token.
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createTrustedAgent")
        private Boolean createTrustedAgent;

        /**
         * Indicates to create trust token.
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param createTrustedAgent the value to set
         * @return this builder
         **/
        public Builder createTrustedAgent(Boolean createTrustedAgent) {
            this.createTrustedAgent = createTrustedAgent;
            this.__explicitlySet__.add("createTrustedAgent");
            return this;
        }
        /**
         * Indicates to create kmsi token.
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createKmsiToken")
        private Boolean createKmsiToken;

        /**
         * Indicates to create kmsi token.
         * <p>
         **SCIM++ Properties:**
         *  - type: boolean
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param createKmsiToken the value to set
         * @return this builder
         **/
        public Builder createKmsiToken(Boolean createKmsiToken) {
            this.createKmsiToken = createKmsiToken;
            this.__explicitlySet__.add("createKmsiToken");
            return this;
        }
        /**
         * Flag indicates whether the factor is enrolled in account recovery. If the value is not provided or false, then it will be treated as MFA factor validation.
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
        @com.fasterxml.jackson.annotation.JsonProperty("isAccRecEnabled")
        private Boolean isAccRecEnabled;

        /**
         * Flag indicates whether the factor is enrolled in account recovery. If the value is not provided or false, then it will be treated as MFA factor validation.
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
         * @param isAccRecEnabled the value to set
         * @return this builder
         **/
        public Builder isAccRecEnabled(Boolean isAccRecEnabled) {
            this.isAccRecEnabled = isAccRecEnabled;
            this.__explicitlySet__.add("isAccRecEnabled");
            return this;
        }
        /**
         * Sign-On Policy dictated validity duration for trusted client in Minutes.
         * <p>
         **SCIM++ Properties:**
         *  - type: integer
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyTrustedFrequencyMins")
        private Integer policyTrustedFrequencyMins;

        /**
         * Sign-On Policy dictated validity duration for trusted client in Minutes.
         * <p>
         **SCIM++ Properties:**
         *  - type: integer
         *  - multiValued: false
         *  - required: false
         *  - mutability: writeOnly
         *  - returned: never
         *  - uniqueness: none
         * @param policyTrustedFrequencyMins the value to set
         * @return this builder
         **/
        public Builder policyTrustedFrequencyMins(Integer policyTrustedFrequencyMins) {
            this.policyTrustedFrequencyMins = policyTrustedFrequencyMins;
            this.__explicitlySet__.add("policyTrustedFrequencyMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactor")
        private MyAuthenticationFactorValidatorThirdPartyFactor thirdPartyFactor;

        public Builder thirdPartyFactor(
                MyAuthenticationFactorValidatorThirdPartyFactor thirdPartyFactor) {
            this.thirdPartyFactor = thirdPartyFactor;
            this.__explicitlySet__.add("thirdPartyFactor");
            return this;
        }
        /**
         * Additional attributes which will be sent as part of a push notification
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
        private java.util.List<MyAuthenticationFactorValidatorAdditionalAttributes>
                additionalAttributes;

        /**
         * Additional attributes which will be sent as part of a push notification
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         *  - uniqueness: none
         * @param additionalAttributes the value to set
         * @return this builder
         **/
        public Builder additionalAttributes(
                java.util.List<MyAuthenticationFactorValidatorAdditionalAttributes>
                        additionalAttributes) {
            this.additionalAttributes = additionalAttributes;
            this.__explicitlySet__.add("additionalAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyAuthenticationFactorValidator build() {
            MyAuthenticationFactorValidator model =
                    new MyAuthenticationFactorValidator(
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
                            this.authFactor,
                            this.scenario,
                            this.requestId,
                            this.otpCode,
                            this.deviceId,
                            this.status,
                            this.userId,
                            this.userName,
                            this.displayName,
                            this.message,
                            this.type,
                            this.updateUserPreference,
                            this.preferenceType,
                            this.securityQuestions,
                            this.name,
                            this.platform,
                            this.location,
                            this.trustedTokenId,
                            this.kmsiTokenId,
                            this.policyEnabledSecondFactors,
                            this.createTrustedAgent,
                            this.createKmsiToken,
                            this.isAccRecEnabled,
                            this.policyTrustedFrequencyMins,
                            this.thirdPartyFactor,
                            this.additionalAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyAuthenticationFactorValidator model) {
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
            if (model.wasPropertyExplicitlySet("authFactor")) {
                this.authFactor(model.getAuthFactor());
            }
            if (model.wasPropertyExplicitlySet("scenario")) {
                this.scenario(model.getScenario());
            }
            if (model.wasPropertyExplicitlySet("requestId")) {
                this.requestId(model.getRequestId());
            }
            if (model.wasPropertyExplicitlySet("otpCode")) {
                this.otpCode(model.getOtpCode());
            }
            if (model.wasPropertyExplicitlySet("deviceId")) {
                this.deviceId(model.getDeviceId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("updateUserPreference")) {
                this.updateUserPreference(model.getUpdateUserPreference());
            }
            if (model.wasPropertyExplicitlySet("preferenceType")) {
                this.preferenceType(model.getPreferenceType());
            }
            if (model.wasPropertyExplicitlySet("securityQuestions")) {
                this.securityQuestions(model.getSecurityQuestions());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("trustedTokenId")) {
                this.trustedTokenId(model.getTrustedTokenId());
            }
            if (model.wasPropertyExplicitlySet("kmsiTokenId")) {
                this.kmsiTokenId(model.getKmsiTokenId());
            }
            if (model.wasPropertyExplicitlySet("policyEnabledSecondFactors")) {
                this.policyEnabledSecondFactors(model.getPolicyEnabledSecondFactors());
            }
            if (model.wasPropertyExplicitlySet("createTrustedAgent")) {
                this.createTrustedAgent(model.getCreateTrustedAgent());
            }
            if (model.wasPropertyExplicitlySet("createKmsiToken")) {
                this.createKmsiToken(model.getCreateKmsiToken());
            }
            if (model.wasPropertyExplicitlySet("isAccRecEnabled")) {
                this.isAccRecEnabled(model.getIsAccRecEnabled());
            }
            if (model.wasPropertyExplicitlySet("policyTrustedFrequencyMins")) {
                this.policyTrustedFrequencyMins(model.getPolicyTrustedFrequencyMins());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyFactor")) {
                this.thirdPartyFactor(model.getThirdPartyFactor());
            }
            if (model.wasPropertyExplicitlySet("additionalAttributes")) {
                this.additionalAttributes(model.getAdditionalAttributes());
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
     * Authentication Factor which is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    public enum AuthFactor {
        UsernamePassword("USERNAME_PASSWORD"),
        Push("PUSH"),
        Totp("TOTP"),
        Email("EMAIL"),
        Sms("SMS"),
        Voice("VOICE"),
        Bypasscode("BYPASSCODE"),
        SecurityQuestions("SECURITY_QUESTIONS"),
        TrustToken("TRUST_TOKEN"),
        PhoneCall("PHONE_CALL"),
        Thirdparty("THIRDPARTY"),
        FidoAuthenticator("FIDO_AUTHENTICATOR"),
        YubicoOtp("YUBICO_OTP"),
        KmsiToken("KMSI_TOKEN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthFactor.class);

        private final String value;
        private static java.util.Map<String, AuthFactor> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthFactor v : AuthFactor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthFactor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthFactor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthFactor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Authentication Factor which is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authFactor")
    private final AuthFactor authFactor;

    /**
     * Authentication Factor which is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public AuthFactor getAuthFactor() {
        return authFactor;
    }

    /**
     * Specifies whether the service is being used to enroll or validate a factor
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    public enum Scenario {
        Enrollment("ENROLLMENT"),
        Authentication("AUTHENTICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Scenario.class);

        private final String value;
        private static java.util.Map<String, Scenario> map;

        static {
            map = new java.util.HashMap<>();
            for (Scenario v : Scenario.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Scenario(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scenario create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Scenario', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies whether the service is being used to enroll or validate a factor
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scenario")
    private final Scenario scenario;

    /**
     * Specifies whether the service is being used to enroll or validate a factor
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: true
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public Scenario getScenario() {
        return scenario;
    }

    /**
     * Request ID which is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    private final String requestId;

    /**
     * Request ID which is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getRequestId() {
        return requestId;
    }

    /**
     * The One Time Passcode which needs to be validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: never
     *  - uniqueness: none
     *  - idcsSensitive: encrypt
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otpCode")
    private final String otpCode;

    /**
     * The One Time Passcode which needs to be validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: never
     *  - uniqueness: none
     *  - idcsSensitive: encrypt
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getOtpCode() {
        return otpCode;
    }

    /**
     * Device id whose factor is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deviceId")
    private final String deviceId;

    /**
     * Device id whose factor is being validated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Validation status returned in the response
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readOnly
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    public enum Status {
        Success("SUCCESS"),
        Failure("FAILURE"),

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
     * Validation status returned in the response
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readOnly
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Validation status returned in the response
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readOnly
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * User guid for whom the validation has initiated. Optional.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * User guid for whom the validation has initiated. Optional.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * User name for whom the validation has initiated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     *  - idcsPii: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * User name for whom the validation has initiated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     *  - idcsPii: true
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * Display name of the verified device
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the verified device
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Validator message which is passed by the client. When it is a PUSH notification, it can be a rejection message.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Validator message which is passed by the client. When it is a PUSH notification, it can be a rejection message.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: readWrite
     *  - returned: default
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * type indicating whether the flow is OIDC, SAML etc.,
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: default
     *  - uniqueness: none
     **/
    public enum Type {
        Saml("SAML"),
        Oidc("OIDC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * type indicating whether the flow is OIDC, SAML etc.,
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: default
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * type indicating whether the flow is OIDC, SAML etc.,
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: default
     *  - uniqueness: none
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Indicates whether to update user preferred mfa factor or not
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateUserPreference")
    private final Boolean updateUserPreference;

    /**
     * Indicates whether to update user preferred mfa factor or not
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getUpdateUserPreference() {
        return updateUserPreference;
    }

    /**
     * Indicates whether to user passwordless factor to be updated or mfa factor to be updated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    public enum PreferenceType {
        Passwordless("PASSWORDLESS"),
        Mfa("MFA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferenceType.class);

        private final String value;
        private static java.util.Map<String, PreferenceType> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferenceType v : PreferenceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferenceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferenceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferenceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether to user passwordless factor to be updated or mfa factor to be updated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferenceType")
    private final PreferenceType preferenceType;

    /**
     * Indicates whether to user passwordless factor to be updated or mfa factor to be updated
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public PreferenceType getPreferenceType() {
        return preferenceType;
    }

    /**
     * List of security questions the user has submitted to get authenticated.
     * <p>
     **SCIM++ Properties:**
     *  - type: complex
     *  - multiValued: true
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     *  - idcsSearchable: false
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityQuestions")
    private final java.util.List<MyAuthenticationFactorValidatorSecurityQuestions>
            securityQuestions;

    /**
     * List of security questions the user has submitted to get authenticated.
     * <p>
     **SCIM++ Properties:**
     *  - type: complex
     *  - multiValued: true
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     *  - idcsSearchable: false
     * @return the value
     **/
    public java.util.List<MyAuthenticationFactorValidatorSecurityQuestions> getSecurityQuestions() {
        return securityQuestions;
    }

    /**
     * Name of the client to be trusted
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the client to be trusted
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Platform of the client to be trusted
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * Platform of the client to be trusted
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public String getPlatform() {
        return platform;
    }

    /**
     * Location of the trusted client.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * Location of the trusted client.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public String getLocation() {
        return location;
    }

    /**
     * Trusted token resource identifier.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustedTokenId")
    private final String trustedTokenId;

    /**
     * Trusted token resource identifier.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public String getTrustedTokenId() {
        return trustedTokenId;
    }

    /**
     * KMSI token resource identifier.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsiTokenId")
    private final String kmsiTokenId;

    /**
     * KMSI token resource identifier.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public String getKmsiTokenId() {
        return kmsiTokenId;
    }

    /**
     * Sign-On Policy dictated allowed second factors.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyEnabledSecondFactors")
    private final java.util.List<String> policyEnabledSecondFactors;

    /**
     * Sign-On Policy dictated allowed second factors.
     * <p>
     **SCIM++ Properties:**
     *  - type: string
     *  - multiValued: true
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getPolicyEnabledSecondFactors() {
        return policyEnabledSecondFactors;
    }

    /**
     * Indicates to create trust token.
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createTrustedAgent")
    private final Boolean createTrustedAgent;

    /**
     * Indicates to create trust token.
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCreateTrustedAgent() {
        return createTrustedAgent;
    }

    /**
     * Indicates to create kmsi token.
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createKmsiToken")
    private final Boolean createKmsiToken;

    /**
     * Indicates to create kmsi token.
     * <p>
     **SCIM++ Properties:**
     *  - type: boolean
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCreateKmsiToken() {
        return createKmsiToken;
    }

    /**
     * Flag indicates whether the factor is enrolled in account recovery. If the value is not provided or false, then it will be treated as MFA factor validation.
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
    @com.fasterxml.jackson.annotation.JsonProperty("isAccRecEnabled")
    private final Boolean isAccRecEnabled;

    /**
     * Flag indicates whether the factor is enrolled in account recovery. If the value is not provided or false, then it will be treated as MFA factor validation.
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
    public Boolean getIsAccRecEnabled() {
        return isAccRecEnabled;
    }

    /**
     * Sign-On Policy dictated validity duration for trusted client in Minutes.
     * <p>
     **SCIM++ Properties:**
     *  - type: integer
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyTrustedFrequencyMins")
    private final Integer policyTrustedFrequencyMins;

    /**
     * Sign-On Policy dictated validity duration for trusted client in Minutes.
     * <p>
     **SCIM++ Properties:**
     *  - type: integer
     *  - multiValued: false
     *  - required: false
     *  - mutability: writeOnly
     *  - returned: never
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getPolicyTrustedFrequencyMins() {
        return policyTrustedFrequencyMins;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactor")
    private final MyAuthenticationFactorValidatorThirdPartyFactor thirdPartyFactor;

    public MyAuthenticationFactorValidatorThirdPartyFactor getThirdPartyFactor() {
        return thirdPartyFactor;
    }

    /**
     * Additional attributes which will be sent as part of a push notification
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalAttributes")
    private final java.util.List<MyAuthenticationFactorValidatorAdditionalAttributes>
            additionalAttributes;

    /**
     * Additional attributes which will be sent as part of a push notification
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<MyAuthenticationFactorValidatorAdditionalAttributes>
            getAdditionalAttributes() {
        return additionalAttributes;
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
        sb.append("MyAuthenticationFactorValidator(");
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
        sb.append(", authFactor=").append(String.valueOf(this.authFactor));
        sb.append(", scenario=").append(String.valueOf(this.scenario));
        sb.append(", requestId=").append(String.valueOf(this.requestId));
        sb.append(", otpCode=").append(String.valueOf(this.otpCode));
        sb.append(", deviceId=").append(String.valueOf(this.deviceId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", updateUserPreference=").append(String.valueOf(this.updateUserPreference));
        sb.append(", preferenceType=").append(String.valueOf(this.preferenceType));
        sb.append(", securityQuestions=").append(String.valueOf(this.securityQuestions));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", trustedTokenId=").append(String.valueOf(this.trustedTokenId));
        sb.append(", kmsiTokenId=").append(String.valueOf(this.kmsiTokenId));
        sb.append(", policyEnabledSecondFactors=")
                .append(String.valueOf(this.policyEnabledSecondFactors));
        sb.append(", createTrustedAgent=").append(String.valueOf(this.createTrustedAgent));
        sb.append(", createKmsiToken=").append(String.valueOf(this.createKmsiToken));
        sb.append(", isAccRecEnabled=").append(String.valueOf(this.isAccRecEnabled));
        sb.append(", policyTrustedFrequencyMins=")
                .append(String.valueOf(this.policyTrustedFrequencyMins));
        sb.append(", thirdPartyFactor=").append(String.valueOf(this.thirdPartyFactor));
        sb.append(", additionalAttributes=").append(String.valueOf(this.additionalAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyAuthenticationFactorValidator)) {
            return false;
        }

        MyAuthenticationFactorValidator other = (MyAuthenticationFactorValidator) o;
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
                && java.util.Objects.equals(this.authFactor, other.authFactor)
                && java.util.Objects.equals(this.scenario, other.scenario)
                && java.util.Objects.equals(this.requestId, other.requestId)
                && java.util.Objects.equals(this.otpCode, other.otpCode)
                && java.util.Objects.equals(this.deviceId, other.deviceId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.updateUserPreference, other.updateUserPreference)
                && java.util.Objects.equals(this.preferenceType, other.preferenceType)
                && java.util.Objects.equals(this.securityQuestions, other.securityQuestions)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.trustedTokenId, other.trustedTokenId)
                && java.util.Objects.equals(this.kmsiTokenId, other.kmsiTokenId)
                && java.util.Objects.equals(
                        this.policyEnabledSecondFactors, other.policyEnabledSecondFactors)
                && java.util.Objects.equals(this.createTrustedAgent, other.createTrustedAgent)
                && java.util.Objects.equals(this.createKmsiToken, other.createKmsiToken)
                && java.util.Objects.equals(this.isAccRecEnabled, other.isAccRecEnabled)
                && java.util.Objects.equals(
                        this.policyTrustedFrequencyMins, other.policyTrustedFrequencyMins)
                && java.util.Objects.equals(this.thirdPartyFactor, other.thirdPartyFactor)
                && java.util.Objects.equals(this.additionalAttributes, other.additionalAttributes)
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
        result = (result * PRIME) + (this.authFactor == null ? 43 : this.authFactor.hashCode());
        result = (result * PRIME) + (this.scenario == null ? 43 : this.scenario.hashCode());
        result = (result * PRIME) + (this.requestId == null ? 43 : this.requestId.hashCode());
        result = (result * PRIME) + (this.otpCode == null ? 43 : this.otpCode.hashCode());
        result = (result * PRIME) + (this.deviceId == null ? 43 : this.deviceId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.updateUserPreference == null
                                ? 43
                                : this.updateUserPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.preferenceType == null ? 43 : this.preferenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.securityQuestions == null ? 43 : this.securityQuestions.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.trustedTokenId == null ? 43 : this.trustedTokenId.hashCode());
        result = (result * PRIME) + (this.kmsiTokenId == null ? 43 : this.kmsiTokenId.hashCode());
        result =
                (result * PRIME)
                        + (this.policyEnabledSecondFactors == null
                                ? 43
                                : this.policyEnabledSecondFactors.hashCode());
        result =
                (result * PRIME)
                        + (this.createTrustedAgent == null
                                ? 43
                                : this.createTrustedAgent.hashCode());
        result =
                (result * PRIME)
                        + (this.createKmsiToken == null ? 43 : this.createKmsiToken.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccRecEnabled == null ? 43 : this.isAccRecEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.policyTrustedFrequencyMins == null
                                ? 43
                                : this.policyTrustedFrequencyMins.hashCode());
        result =
                (result * PRIME)
                        + (this.thirdPartyFactor == null ? 43 : this.thirdPartyFactor.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalAttributes == null
                                ? 43
                                : this.additionalAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
