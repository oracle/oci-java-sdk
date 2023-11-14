/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A list specifying the contained attributes <br>
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
        builder = SchemaSubAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SchemaSubAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "idcsRequiresImmediateReadAfterWriteForAccessFlows",
        "idcsRequiresWriteForAccessFlows",
        "idcsDisplayNameMessageId",
        "idcsRtsaHideAttribute",
        "idcsInternal",
        "type",
        "multiValued",
        "description",
        "required",
        "idcsReturnEmptyWhenNull",
        "canonicalValues",
        "idcsDefaultValue",
        "caseExact",
        "mutability",
        "returned",
        "idcsCsvAttributeName",
        "uniqueness",
        "referenceTypes",
        "idcsDeprecatedSinceVersion",
        "idcsAddedSinceVersion",
        "idcsDeprecatedSinceReleaseNumber",
        "idcsAddedSinceReleaseNumber",
        "idcsMinLength",
        "idcsMaxLength",
        "idcsMinValue",
        "idcsMaxValue",
        "idcsOnlyOneValueCanBeTrue",
        "idcsMaxValuesReturned",
        "idcsOneValueMustBeTrue",
        "idcsRefResourceAttributes",
        "idcsIndirectRefResourceAttributes",
        "idcsValuePersisted",
        "idcsSensitive",
        "idcsTrimStringValue",
        "idcsSearchable",
        "idcsGenerated",
        "idcsAuditable",
        "idcsTargetAttributeName",
        "idcsTargetNormAttributeName",
        "idcsTargetAttributeNameToMigrateFrom",
        "idcsTargetUniqueConstraintName",
        "idcsToTargetMapper",
        "idcsFromTargetMapper",
        "idcsDisplayName",
        "idcsCanonicalValueSourceResourceType",
        "idcsCanonicalValueSourceFilter",
        "idcsCanonicalValueSourceResourceTypeID",
        "idcsCanonicalValueSourceDisplayAttrName",
        "idcsCanonicalValueSourceKeyAttrName",
        "idcsValidateReference",
        "idcsScimCompliant",
        "idcsAttributeMappable",
        "idcsAttributeCacheable",
        "idcsuiOrder",
        "idcsuiRegexp",
        "idcsuiVisible",
        "idcsuiWidget",
        "idcsValuePersistedInOtherAttribute",
        "idcsPii",
        "idcsSanitize",
        "idcsExcludeFromUpgradePatch"
    })
    public SchemaSubAttributes(
            String name,
            Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows,
            Boolean idcsRequiresWriteForAccessFlows,
            String idcsDisplayNameMessageId,
            Boolean idcsRtsaHideAttribute,
            Boolean idcsInternal,
            Type type,
            Boolean multiValued,
            String description,
            Boolean required,
            Boolean idcsReturnEmptyWhenNull,
            java.util.List<String> canonicalValues,
            String idcsDefaultValue,
            Boolean caseExact,
            Mutability mutability,
            Returned returned,
            String idcsCsvAttributeName,
            Uniqueness uniqueness,
            java.util.List<String> referenceTypes,
            Integer idcsDeprecatedSinceVersion,
            Integer idcsAddedSinceVersion,
            String idcsDeprecatedSinceReleaseNumber,
            String idcsAddedSinceReleaseNumber,
            Integer idcsMinLength,
            Integer idcsMaxLength,
            Integer idcsMinValue,
            Integer idcsMaxValue,
            Boolean idcsOnlyOneValueCanBeTrue,
            Integer idcsMaxValuesReturned,
            Boolean idcsOneValueMustBeTrue,
            java.util.List<String> idcsRefResourceAttributes,
            java.util.List<String> idcsIndirectRefResourceAttributes,
            Boolean idcsValuePersisted,
            IdcsSensitive idcsSensitive,
            Boolean idcsTrimStringValue,
            Boolean idcsSearchable,
            Boolean idcsGenerated,
            Boolean idcsAuditable,
            String idcsTargetAttributeName,
            String idcsTargetNormAttributeName,
            String idcsTargetAttributeNameToMigrateFrom,
            String idcsTargetUniqueConstraintName,
            String idcsToTargetMapper,
            String idcsFromTargetMapper,
            String idcsDisplayName,
            String idcsCanonicalValueSourceResourceType,
            String idcsCanonicalValueSourceFilter,
            String idcsCanonicalValueSourceResourceTypeID,
            String idcsCanonicalValueSourceDisplayAttrName,
            String idcsCanonicalValueSourceKeyAttrName,
            Boolean idcsValidateReference,
            Boolean idcsScimCompliant,
            Boolean idcsAttributeMappable,
            Boolean idcsAttributeCacheable,
            Integer idcsuiOrder,
            String idcsuiRegexp,
            Boolean idcsuiVisible,
            IdcsuiWidget idcsuiWidget,
            Boolean idcsValuePersistedInOtherAttribute,
            Boolean idcsPii,
            Boolean idcsSanitize,
            Boolean idcsExcludeFromUpgradePatch) {
        super();
        this.name = name;
        this.idcsRequiresImmediateReadAfterWriteForAccessFlows =
                idcsRequiresImmediateReadAfterWriteForAccessFlows;
        this.idcsRequiresWriteForAccessFlows = idcsRequiresWriteForAccessFlows;
        this.idcsDisplayNameMessageId = idcsDisplayNameMessageId;
        this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
        this.idcsInternal = idcsInternal;
        this.type = type;
        this.multiValued = multiValued;
        this.description = description;
        this.required = required;
        this.idcsReturnEmptyWhenNull = idcsReturnEmptyWhenNull;
        this.canonicalValues = canonicalValues;
        this.idcsDefaultValue = idcsDefaultValue;
        this.caseExact = caseExact;
        this.mutability = mutability;
        this.returned = returned;
        this.idcsCsvAttributeName = idcsCsvAttributeName;
        this.uniqueness = uniqueness;
        this.referenceTypes = referenceTypes;
        this.idcsDeprecatedSinceVersion = idcsDeprecatedSinceVersion;
        this.idcsAddedSinceVersion = idcsAddedSinceVersion;
        this.idcsDeprecatedSinceReleaseNumber = idcsDeprecatedSinceReleaseNumber;
        this.idcsAddedSinceReleaseNumber = idcsAddedSinceReleaseNumber;
        this.idcsMinLength = idcsMinLength;
        this.idcsMaxLength = idcsMaxLength;
        this.idcsMinValue = idcsMinValue;
        this.idcsMaxValue = idcsMaxValue;
        this.idcsOnlyOneValueCanBeTrue = idcsOnlyOneValueCanBeTrue;
        this.idcsMaxValuesReturned = idcsMaxValuesReturned;
        this.idcsOneValueMustBeTrue = idcsOneValueMustBeTrue;
        this.idcsRefResourceAttributes = idcsRefResourceAttributes;
        this.idcsIndirectRefResourceAttributes = idcsIndirectRefResourceAttributes;
        this.idcsValuePersisted = idcsValuePersisted;
        this.idcsSensitive = idcsSensitive;
        this.idcsTrimStringValue = idcsTrimStringValue;
        this.idcsSearchable = idcsSearchable;
        this.idcsGenerated = idcsGenerated;
        this.idcsAuditable = idcsAuditable;
        this.idcsTargetAttributeName = idcsTargetAttributeName;
        this.idcsTargetNormAttributeName = idcsTargetNormAttributeName;
        this.idcsTargetAttributeNameToMigrateFrom = idcsTargetAttributeNameToMigrateFrom;
        this.idcsTargetUniqueConstraintName = idcsTargetUniqueConstraintName;
        this.idcsToTargetMapper = idcsToTargetMapper;
        this.idcsFromTargetMapper = idcsFromTargetMapper;
        this.idcsDisplayName = idcsDisplayName;
        this.idcsCanonicalValueSourceResourceType = idcsCanonicalValueSourceResourceType;
        this.idcsCanonicalValueSourceFilter = idcsCanonicalValueSourceFilter;
        this.idcsCanonicalValueSourceResourceTypeID = idcsCanonicalValueSourceResourceTypeID;
        this.idcsCanonicalValueSourceDisplayAttrName = idcsCanonicalValueSourceDisplayAttrName;
        this.idcsCanonicalValueSourceKeyAttrName = idcsCanonicalValueSourceKeyAttrName;
        this.idcsValidateReference = idcsValidateReference;
        this.idcsScimCompliant = idcsScimCompliant;
        this.idcsAttributeMappable = idcsAttributeMappable;
        this.idcsAttributeCacheable = idcsAttributeCacheable;
        this.idcsuiOrder = idcsuiOrder;
        this.idcsuiRegexp = idcsuiRegexp;
        this.idcsuiVisible = idcsuiVisible;
        this.idcsuiWidget = idcsuiWidget;
        this.idcsValuePersistedInOtherAttribute = idcsValuePersistedInOtherAttribute;
        this.idcsPii = idcsPii;
        this.idcsSanitize = idcsSanitize;
        this.idcsExcludeFromUpgradePatch = idcsExcludeFromUpgradePatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Attribute's name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Attribute's name
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * If true, indicates that the attribute value must be written to the home region and
         * requires immediate read-after-write consistency for access flows initiated from a replica
         * region.
         *
         * <p>*Added In:** 2209220956
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: never - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "idcsRequiresImmediateReadAfterWriteForAccessFlows")
        private Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows;

        /**
         * If true, indicates that the attribute value must be written to the home region and
         * requires immediate read-after-write consistency for access flows initiated from a replica
         * region.
         *
         * <p>*Added In:** 2209220956
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: never - type: boolean
         *
         * @param idcsRequiresImmediateReadAfterWriteForAccessFlows the value to set
         * @return this builder
         */
        public Builder idcsRequiresImmediateReadAfterWriteForAccessFlows(
                Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows) {
            this.idcsRequiresImmediateReadAfterWriteForAccessFlows =
                    idcsRequiresImmediateReadAfterWriteForAccessFlows;
            this.__explicitlySet__.add("idcsRequiresImmediateReadAfterWriteForAccessFlows");
            return this;
        }
        /**
         * If true, indicates that the attribute value must be written to the home region for access
         * flows initiated from a replica region.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRequiresWriteForAccessFlows")
        private Boolean idcsRequiresWriteForAccessFlows;

        /**
         * If true, indicates that the attribute value must be written to the home region for access
         * flows initiated from a replica region.
         *
         * <p>*Added In:** 2205120021
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean - uniqueness: none
         *
         * @param idcsRequiresWriteForAccessFlows the value to set
         * @return this builder
         */
        public Builder idcsRequiresWriteForAccessFlows(Boolean idcsRequiresWriteForAccessFlows) {
            this.idcsRequiresWriteForAccessFlows = idcsRequiresWriteForAccessFlows;
            this.__explicitlySet__.add("idcsRequiresWriteForAccessFlows");
            return this;
        }
        /**
         * Localized schema attribute display name for use by UI client for displaying attribute
         * labels
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
        private String idcsDisplayNameMessageId;

        /**
         * Localized schema attribute display name for use by UI client for displaying attribute
         * labels
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Specifies if the attributes in this schema can be displayed externally
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
        private Boolean idcsRtsaHideAttribute;

        /**
         * Specifies if the attributes in this schema can be displayed externally
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param idcsRtsaHideAttribute the value to set
         * @return this builder
         */
        public Builder idcsRtsaHideAttribute(Boolean idcsRtsaHideAttribute) {
            this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
            this.__explicitlySet__.add("idcsRtsaHideAttribute");
            return this;
        }
        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are
         * not exposed via REST. This attribute overrides mutability for create/update if the
         * request is internal and the attribute internal flag is set to True. This attribute
         * overrides the return attribute while building SCIM response attributes when both the
         * request is internal and the schema attribute is internal.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
        private Boolean idcsInternal;

        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are
         * not exposed via REST. This attribute overrides mutability for create/update if the
         * request is internal and the attribute internal flag is set to True. This attribute
         * overrides the return attribute while building SCIM response attributes when both the
         * request is internal and the schema attribute is internal.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * Attribute's data type--for example, String
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Attribute's data type--for example, String
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
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
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
        private Boolean multiValued;

        /**
         * Indicates the attribute's plurality
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * Attribute's human-readable description
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Attribute's human-readable description
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Specifies if the attribute is required
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * Specifies if the attribute is required
         *
         * <p>*Added In:** 2305190132
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsReturnEmptyWhenNull")
        private Boolean idcsReturnEmptyWhenNull;

        /**
         * Specifies if the attribute is required
         *
         * <p>*Added In:** 2305190132
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         *
         * @param idcsReturnEmptyWhenNull the value to set
         * @return this builder
         */
        public Builder idcsReturnEmptyWhenNull(Boolean idcsReturnEmptyWhenNull) {
            this.idcsReturnEmptyWhenNull = idcsReturnEmptyWhenNull;
            this.__explicitlySet__.add("idcsReturnEmptyWhenNull");
            return this;
        }
        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical
         * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
        private java.util.List<String> canonicalValues;

        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical
         * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Specifies the default value for an attribute. The value must be one from canonicalValues
         * if defined.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDefaultValue")
        private String idcsDefaultValue;

        /**
         * Specifies the default value for an attribute. The value must be one from canonicalValues
         * if defined.
         *
         * <p>*Added In:** 18.1.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param idcsDefaultValue the value to set
         * @return this builder
         */
        public Builder idcsDefaultValue(String idcsDefaultValue) {
            this.idcsDefaultValue = idcsDefaultValue;
            this.__explicitlySet__.add("idcsDefaultValue");
            return this;
        }
        /**
         * Specifies if the String attribute is case-sensitive
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
        private Boolean caseExact;

        /**
         * Specifies if the String attribute is case-sensitive
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mutability")
        private Mutability mutability;

        /**
         * Specifies if the attribute is mutable
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * A single keyword that indicates when an attribute and associated values are returned in
         * response to a GET request or in response to a PUT, POST, or PATCH request
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("returned")
        private Returned returned;

        /**
         * A single keyword that indicates when an attribute and associated values are returned in
         * response to a GET request or in response to a PUT, POST, or PATCH request
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * The attribute that defines the CSV header name for import/export
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeName")
        private String idcsCsvAttributeName;

        /**
         * The attribute that defines the CSV header name for import/export
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param idcsCsvAttributeName the value to set
         * @return this builder
         */
        public Builder idcsCsvAttributeName(String idcsCsvAttributeName) {
            this.idcsCsvAttributeName = idcsCsvAttributeName;
            this.__explicitlySet__.add("idcsCsvAttributeName");
            return this;
        }
        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of
         * attribute values. A server MAY reject an invalid value based on uniqueness by returning
         * an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client
         * side to a greater degree than the Service Provider enforces. For example, a client could
         * make a value unique while the server has a uniqueness of \\"none\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
        private Uniqueness uniqueness;

        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of
         * attribute values. A server MAY reject an invalid value based on uniqueness by returning
         * an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client
         * side to a greater degree than the Service Provider enforces. For example, a client could
         * make a value unique while the server has a uniqueness of \\"none\\".
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * The names of the Resource types that may be referenced--for example, User. This is only
         * applicable for attributes that are of the \\"reference\\" data type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
        private java.util.List<String> referenceTypes;

        /**
         * The names of the Resource types that may be referenced--for example, User. This is only
         * applicable for attributes that are of the \\"reference\\" data type.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
        private Integer idcsDeprecatedSinceVersion;

        /**
         * Indicates that the schema has been deprecated since version
         *
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
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
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
        private Integer idcsAddedSinceVersion;

        /**
         * Indicates that the schema has been added since version
         *
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
        private String idcsDeprecatedSinceReleaseNumber;

        /**
         * Indicates that the schema has been deprecated since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
        private String idcsAddedSinceReleaseNumber;

        /**
         * Indicates that the schema has been added since this release number
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
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
         * Specifies the minimum length of this attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
        private Integer idcsMinLength;

        /**
         * Specifies the minimum length of this attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
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
         * Specifies the maximum length of this attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
        private Integer idcsMaxLength;

        /**
         * Specifies the maximum length of this attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
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
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
        private Integer idcsMinValue;

        /**
         * Specifies the minimum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: integer
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
        private Integer idcsMaxValue;

        /**
         * Specifies the maximum value of the integer attribute
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: integer
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
         * If true, specifies that the sub attribute value can be set to true on one and only one
         * instance of the CMVA.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOnlyOneValueCanBeTrue")
        private Boolean idcsOnlyOneValueCanBeTrue;

        /**
         * If true, specifies that the sub attribute value can be set to true on one and only one
         * instance of the CMVA.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param idcsOnlyOneValueCanBeTrue the value to set
         * @return this builder
         */
        public Builder idcsOnlyOneValueCanBeTrue(Boolean idcsOnlyOneValueCanBeTrue) {
            this.idcsOnlyOneValueCanBeTrue = idcsOnlyOneValueCanBeTrue;
            this.__explicitlySet__.add("idcsOnlyOneValueCanBeTrue");
            return this;
        }
        /**
         * **SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: integer - uniqueness: none Specify a limit on
         * the number of attribute-values that any caller will receive when requesting a CMVA
         * attribute. If the no of CMVA instances exceeds the limit then Oracle Identity Cloud
         * Service will throw exception. Users can choose to refine the filter on CMVA attribute.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValuesReturned")
        private Integer idcsMaxValuesReturned;

        /**
         * **SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: integer - uniqueness: none Specify a limit on
         * the number of attribute-values that any caller will receive when requesting a CMVA
         * attribute. If the no of CMVA instances exceeds the limit then Oracle Identity Cloud
         * Service will throw exception. Users can choose to refine the filter on CMVA attribute.
         *
         * @param idcsMaxValuesReturned the value to set
         * @return this builder
         */
        public Builder idcsMaxValuesReturned(Integer idcsMaxValuesReturned) {
            this.idcsMaxValuesReturned = idcsMaxValuesReturned;
            this.__explicitlySet__.add("idcsMaxValuesReturned");
            return this;
        }
        /**
         * If true, ARM will ensure atleast one of the instances of CMVA has the attribute value set
         * to true.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOneValueMustBeTrue")
        private Boolean idcsOneValueMustBeTrue;

        /**
         * If true, ARM will ensure atleast one of the instances of CMVA has the attribute value set
         * to true.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param idcsOneValueMustBeTrue the value to set
         * @return this builder
         */
        public Builder idcsOneValueMustBeTrue(Boolean idcsOneValueMustBeTrue) {
            this.idcsOneValueMustBeTrue = idcsOneValueMustBeTrue;
            this.__explicitlySet__.add("idcsOneValueMustBeTrue");
            return this;
        }
        /**
         * Specifies the directly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
        private java.util.List<String> idcsRefResourceAttributes;

        /**
         * Specifies the directly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: string
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
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
        private java.util.List<String> idcsIndirectRefResourceAttributes;

        /**
         * Specifies the indirectly referenced Resources
         *
         * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
         * returned: default - type: string
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
         * Specifies whether the sub-attribute of the Resource attribute is persisted
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
        private Boolean idcsValuePersisted;

        /**
         * Specifies whether the sub-attribute of the Resource attribute is persisted
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * Specifiees if the attribute should be encrypted or hashed
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
        private IdcsSensitive idcsSensitive;

        /**
         * Specifiees if the attribute should be encrypted or hashed
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Trims any leading and trailing blanks from String values. Default is True.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
        private Boolean idcsTrimStringValue;

        /**
         * Trims any leading and trailing blanks from String values. Default is True.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
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
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
        private Boolean idcsSearchable;

        /**
         * Specifies whether this attribute can be included in a search filter
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
        private Boolean idcsGenerated;

        /**
         * Specifies whether this attribute value was generated
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * Specifies whether changes to this attribute value will be audited
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
        private Boolean idcsAuditable;

        /**
         * Specifies whether changes to this attribute value will be audited
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
        private String idcsTargetAttributeName;

        /**
         * Target attribute name that this attribute gets mapped to for persistence
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Target normalized attribute name that this normalized value of attribute gets mapped to
         * for persistence. Only set for caseExact=false & searchable attributes. Do not use by
         * default.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
        private String idcsTargetAttributeNameToMigrateFrom;

        /**
         * Old Target attribute name from child table for CSVA attribute prior to migration. This
         * maintains this attribute used to get mapped to for persistence
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Target index name created for this attribute for performance
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
        private String idcsTargetUniqueConstraintName;

        /**
         * Target index name created for this attribute for performance
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
        private String idcsToTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
        private String idcsFromTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
         * semantics
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
        private String idcsDisplayName;

        /**
         * Specifies the user-friendly displayable attribute name or catalog key used for
         * localization
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
        private String idcsCanonicalValueSourceResourceType;

        /**
         * Specifies the Resource type to read from for dynamic canonical values
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
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
         * Specifies the Resource type ID to read from for dynamic canonical values
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceTypeID")
        private String idcsCanonicalValueSourceResourceTypeID;

        /**
         * Specifies the Resource type ID to read from for dynamic canonical values
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param idcsCanonicalValueSourceResourceTypeID the value to set
         * @return this builder
         */
        public Builder idcsCanonicalValueSourceResourceTypeID(
                String idcsCanonicalValueSourceResourceTypeID) {
            this.idcsCanonicalValueSourceResourceTypeID = idcsCanonicalValueSourceResourceTypeID;
            this.__explicitlySet__.add("idcsCanonicalValueSourceResourceTypeID");
            return this;
        }
        /**
         * Display name for the canonical value attribute name.
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceDisplayAttrName")
        private String idcsCanonicalValueSourceDisplayAttrName;

        /**
         * Display name for the canonical value attribute name.
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param idcsCanonicalValueSourceDisplayAttrName the value to set
         * @return this builder
         */
        public Builder idcsCanonicalValueSourceDisplayAttrName(
                String idcsCanonicalValueSourceDisplayAttrName) {
            this.idcsCanonicalValueSourceDisplayAttrName = idcsCanonicalValueSourceDisplayAttrName;
            this.__explicitlySet__.add("idcsCanonicalValueSourceDisplayAttrName");
            return this;
        }
        /**
         * Source key attribute for the canonical value.
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceKeyAttrName")
        private String idcsCanonicalValueSourceKeyAttrName;

        /**
         * Source key attribute for the canonical value.
         *
         * <p>*Added In:** 17.4.4
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: string - uniqueness: none
         *
         * @param idcsCanonicalValueSourceKeyAttrName the value to set
         * @return this builder
         */
        public Builder idcsCanonicalValueSourceKeyAttrName(
                String idcsCanonicalValueSourceKeyAttrName) {
            this.idcsCanonicalValueSourceKeyAttrName = idcsCanonicalValueSourceKeyAttrName;
            this.__explicitlySet__.add("idcsCanonicalValueSourceKeyAttrName");
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
         * Indicates if the attribute is scim compliant, default is true
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
        private Boolean idcsScimCompliant;

        /**
         * Indicates if the attribute is scim compliant, default is true
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
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
         * then this flag is ignored.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
        private Boolean idcsAttributeMappable;

        /**
         * Specifies if the attribute can be used for mapping with external identity sources such as
         * AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined,
         * then this flag is ignored.
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
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
         * Specifies whether the attribute is cacheable. True by default for all attributes. If
         * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
         * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
         * Provider.
         *
         * <p>*Added In:** 17.3.4
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
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
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         *
         * @param idcsAttributeCacheable the value to set
         * @return this builder
         */
        public Builder idcsAttributeCacheable(Boolean idcsAttributeCacheable) {
            this.idcsAttributeCacheable = idcsAttributeCacheable;
            this.__explicitlySet__.add("idcsAttributeCacheable");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on
         * the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiOrder")
        private Integer idcsuiOrder;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on
         * the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: integer
         *
         * @param idcsuiOrder the value to set
         * @return this builder
         */
        public Builder idcsuiOrder(Integer idcsuiOrder) {
            this.idcsuiOrder = idcsuiOrder;
            this.__explicitlySet__.add("idcsuiOrder");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using
         * regular expressions.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiRegexp")
        private String idcsuiRegexp;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using
         * regular expressions.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         *
         * @param idcsuiRegexp the value to set
         * @return this builder
         */
        public Builder idcsuiRegexp(String idcsuiRegexp) {
            this.idcsuiRegexp = idcsuiRegexp;
            this.__explicitlySet__.add("idcsuiRegexp");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be
         * displayed on the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiVisible")
        private Boolean idcsuiVisible;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be
         * displayed on the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         *
         * @param idcsuiVisible the value to set
         * @return this builder
         */
        public Builder idcsuiVisible(Boolean idcsuiVisible) {
            this.idcsuiVisible = idcsuiVisible;
            this.__explicitlySet__.add("idcsuiVisible");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute
         * on the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiWidget")
        private IdcsuiWidget idcsuiWidget;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute
         * on the Account Form.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: string
         *
         * @param idcsuiWidget the value to set
         * @return this builder
         */
        public Builder idcsuiWidget(IdcsuiWidget idcsuiWidget) {
            this.idcsuiWidget = idcsuiWidget;
            this.__explicitlySet__.add("idcsuiWidget");
            return this;
        }
        /**
         * If true, ARM should not validate the value of the attribute since it will be
         * converted/migrated to another attribute internally by the manager which will build valid
         * post, put, or patch payload, depending on the client requested operation
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersistedInOtherAttribute")
        private Boolean idcsValuePersistedInOtherAttribute;

        /**
         * If true, ARM should not validate the value of the attribute since it will be
         * converted/migrated to another attribute internally by the manager which will build valid
         * post, put, or patch payload, depending on the client requested operation
         *
         * <p>*Added In:** 18.2.2
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: default - type: boolean
         *
         * @param idcsValuePersistedInOtherAttribute the value to set
         * @return this builder
         */
        public Builder idcsValuePersistedInOtherAttribute(
                Boolean idcsValuePersistedInOtherAttribute) {
            this.idcsValuePersistedInOtherAttribute = idcsValuePersistedInOtherAttribute;
            this.__explicitlySet__.add("idcsValuePersistedInOtherAttribute");
            return this;
        }
        /**
         * Specifies whether the attribute is PII (personal information). False by default for all
         * attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's
         * written to the Oracle Identity Cloud Service system logs.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPii")
        private Boolean idcsPii;

        /**
         * Specifies whether the attribute is PII (personal information). False by default for all
         * attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's
         * written to the Oracle Identity Cloud Service system logs.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
         * returned: default - type: boolean
         *
         * @param idcsPii the value to set
         * @return this builder
         */
        public Builder idcsPii(Boolean idcsPii) {
            this.idcsPii = idcsPii;
            this.__explicitlySet__.add("idcsPii");
            return this;
        }
        /**
         * Specifies if the value of the attribute should be sanitized using OWASP library for HTML
         * content
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSanitize")
        private Boolean idcsSanitize;

        /**
         * Specifies if the value of the attribute should be sanitized using OWASP library for HTML
         * content
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param idcsSanitize the value to set
         * @return this builder
         */
        public Builder idcsSanitize(Boolean idcsSanitize) {
            this.idcsSanitize = idcsSanitize;
            this.__explicitlySet__.add("idcsSanitize");
            return this;
        }
        /**
         * Specifies whether the attribute should be excluded from the BulkApi patch generated by
         * gradle task for upgrading OOTB resources.
         *
         * <p>*Added In:** 2104150946
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: never - type: boolean
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsExcludeFromUpgradePatch")
        private Boolean idcsExcludeFromUpgradePatch;

        /**
         * Specifies whether the attribute should be excluded from the BulkApi patch generated by
         * gradle task for upgrading OOTB resources.
         *
         * <p>*Added In:** 2104150946
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * returned: never - type: boolean
         *
         * @param idcsExcludeFromUpgradePatch the value to set
         * @return this builder
         */
        public Builder idcsExcludeFromUpgradePatch(Boolean idcsExcludeFromUpgradePatch) {
            this.idcsExcludeFromUpgradePatch = idcsExcludeFromUpgradePatch;
            this.__explicitlySet__.add("idcsExcludeFromUpgradePatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaSubAttributes build() {
            SchemaSubAttributes model =
                    new SchemaSubAttributes(
                            this.name,
                            this.idcsRequiresImmediateReadAfterWriteForAccessFlows,
                            this.idcsRequiresWriteForAccessFlows,
                            this.idcsDisplayNameMessageId,
                            this.idcsRtsaHideAttribute,
                            this.idcsInternal,
                            this.type,
                            this.multiValued,
                            this.description,
                            this.required,
                            this.idcsReturnEmptyWhenNull,
                            this.canonicalValues,
                            this.idcsDefaultValue,
                            this.caseExact,
                            this.mutability,
                            this.returned,
                            this.idcsCsvAttributeName,
                            this.uniqueness,
                            this.referenceTypes,
                            this.idcsDeprecatedSinceVersion,
                            this.idcsAddedSinceVersion,
                            this.idcsDeprecatedSinceReleaseNumber,
                            this.idcsAddedSinceReleaseNumber,
                            this.idcsMinLength,
                            this.idcsMaxLength,
                            this.idcsMinValue,
                            this.idcsMaxValue,
                            this.idcsOnlyOneValueCanBeTrue,
                            this.idcsMaxValuesReturned,
                            this.idcsOneValueMustBeTrue,
                            this.idcsRefResourceAttributes,
                            this.idcsIndirectRefResourceAttributes,
                            this.idcsValuePersisted,
                            this.idcsSensitive,
                            this.idcsTrimStringValue,
                            this.idcsSearchable,
                            this.idcsGenerated,
                            this.idcsAuditable,
                            this.idcsTargetAttributeName,
                            this.idcsTargetNormAttributeName,
                            this.idcsTargetAttributeNameToMigrateFrom,
                            this.idcsTargetUniqueConstraintName,
                            this.idcsToTargetMapper,
                            this.idcsFromTargetMapper,
                            this.idcsDisplayName,
                            this.idcsCanonicalValueSourceResourceType,
                            this.idcsCanonicalValueSourceFilter,
                            this.idcsCanonicalValueSourceResourceTypeID,
                            this.idcsCanonicalValueSourceDisplayAttrName,
                            this.idcsCanonicalValueSourceKeyAttrName,
                            this.idcsValidateReference,
                            this.idcsScimCompliant,
                            this.idcsAttributeMappable,
                            this.idcsAttributeCacheable,
                            this.idcsuiOrder,
                            this.idcsuiRegexp,
                            this.idcsuiVisible,
                            this.idcsuiWidget,
                            this.idcsValuePersistedInOtherAttribute,
                            this.idcsPii,
                            this.idcsSanitize,
                            this.idcsExcludeFromUpgradePatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaSubAttributes model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet(
                    "idcsRequiresImmediateReadAfterWriteForAccessFlows")) {
                this.idcsRequiresImmediateReadAfterWriteForAccessFlows(
                        model.getIdcsRequiresImmediateReadAfterWriteForAccessFlows());
            }
            if (model.wasPropertyExplicitlySet("idcsRequiresWriteForAccessFlows")) {
                this.idcsRequiresWriteForAccessFlows(model.getIdcsRequiresWriteForAccessFlows());
            }
            if (model.wasPropertyExplicitlySet("idcsDisplayNameMessageId")) {
                this.idcsDisplayNameMessageId(model.getIdcsDisplayNameMessageId());
            }
            if (model.wasPropertyExplicitlySet("idcsRtsaHideAttribute")) {
                this.idcsRtsaHideAttribute(model.getIdcsRtsaHideAttribute());
            }
            if (model.wasPropertyExplicitlySet("idcsInternal")) {
                this.idcsInternal(model.getIdcsInternal());
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
            if (model.wasPropertyExplicitlySet("idcsReturnEmptyWhenNull")) {
                this.idcsReturnEmptyWhenNull(model.getIdcsReturnEmptyWhenNull());
            }
            if (model.wasPropertyExplicitlySet("canonicalValues")) {
                this.canonicalValues(model.getCanonicalValues());
            }
            if (model.wasPropertyExplicitlySet("idcsDefaultValue")) {
                this.idcsDefaultValue(model.getIdcsDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("caseExact")) {
                this.caseExact(model.getCaseExact());
            }
            if (model.wasPropertyExplicitlySet("mutability")) {
                this.mutability(model.getMutability());
            }
            if (model.wasPropertyExplicitlySet("returned")) {
                this.returned(model.getReturned());
            }
            if (model.wasPropertyExplicitlySet("idcsCsvAttributeName")) {
                this.idcsCsvAttributeName(model.getIdcsCsvAttributeName());
            }
            if (model.wasPropertyExplicitlySet("uniqueness")) {
                this.uniqueness(model.getUniqueness());
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
            if (model.wasPropertyExplicitlySet("idcsOnlyOneValueCanBeTrue")) {
                this.idcsOnlyOneValueCanBeTrue(model.getIdcsOnlyOneValueCanBeTrue());
            }
            if (model.wasPropertyExplicitlySet("idcsMaxValuesReturned")) {
                this.idcsMaxValuesReturned(model.getIdcsMaxValuesReturned());
            }
            if (model.wasPropertyExplicitlySet("idcsOneValueMustBeTrue")) {
                this.idcsOneValueMustBeTrue(model.getIdcsOneValueMustBeTrue());
            }
            if (model.wasPropertyExplicitlySet("idcsRefResourceAttributes")) {
                this.idcsRefResourceAttributes(model.getIdcsRefResourceAttributes());
            }
            if (model.wasPropertyExplicitlySet("idcsIndirectRefResourceAttributes")) {
                this.idcsIndirectRefResourceAttributes(
                        model.getIdcsIndirectRefResourceAttributes());
            }
            if (model.wasPropertyExplicitlySet("idcsValuePersisted")) {
                this.idcsValuePersisted(model.getIdcsValuePersisted());
            }
            if (model.wasPropertyExplicitlySet("idcsSensitive")) {
                this.idcsSensitive(model.getIdcsSensitive());
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
            if (model.wasPropertyExplicitlySet("idcsTargetNormAttributeName")) {
                this.idcsTargetNormAttributeName(model.getIdcsTargetNormAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetAttributeNameToMigrateFrom")) {
                this.idcsTargetAttributeNameToMigrateFrom(
                        model.getIdcsTargetAttributeNameToMigrateFrom());
            }
            if (model.wasPropertyExplicitlySet("idcsTargetUniqueConstraintName")) {
                this.idcsTargetUniqueConstraintName(model.getIdcsTargetUniqueConstraintName());
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
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueSourceResourceTypeID")) {
                this.idcsCanonicalValueSourceResourceTypeID(
                        model.getIdcsCanonicalValueSourceResourceTypeID());
            }
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueSourceDisplayAttrName")) {
                this.idcsCanonicalValueSourceDisplayAttrName(
                        model.getIdcsCanonicalValueSourceDisplayAttrName());
            }
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueSourceKeyAttrName")) {
                this.idcsCanonicalValueSourceKeyAttrName(
                        model.getIdcsCanonicalValueSourceKeyAttrName());
            }
            if (model.wasPropertyExplicitlySet("idcsValidateReference")) {
                this.idcsValidateReference(model.getIdcsValidateReference());
            }
            if (model.wasPropertyExplicitlySet("idcsScimCompliant")) {
                this.idcsScimCompliant(model.getIdcsScimCompliant());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeMappable")) {
                this.idcsAttributeMappable(model.getIdcsAttributeMappable());
            }
            if (model.wasPropertyExplicitlySet("idcsAttributeCacheable")) {
                this.idcsAttributeCacheable(model.getIdcsAttributeCacheable());
            }
            if (model.wasPropertyExplicitlySet("idcsuiOrder")) {
                this.idcsuiOrder(model.getIdcsuiOrder());
            }
            if (model.wasPropertyExplicitlySet("idcsuiRegexp")) {
                this.idcsuiRegexp(model.getIdcsuiRegexp());
            }
            if (model.wasPropertyExplicitlySet("idcsuiVisible")) {
                this.idcsuiVisible(model.getIdcsuiVisible());
            }
            if (model.wasPropertyExplicitlySet("idcsuiWidget")) {
                this.idcsuiWidget(model.getIdcsuiWidget());
            }
            if (model.wasPropertyExplicitlySet("idcsValuePersistedInOtherAttribute")) {
                this.idcsValuePersistedInOtherAttribute(
                        model.getIdcsValuePersistedInOtherAttribute());
            }
            if (model.wasPropertyExplicitlySet("idcsPii")) {
                this.idcsPii(model.getIdcsPii());
            }
            if (model.wasPropertyExplicitlySet("idcsSanitize")) {
                this.idcsSanitize(model.getIdcsSanitize());
            }
            if (model.wasPropertyExplicitlySet("idcsExcludeFromUpgradePatch")) {
                this.idcsExcludeFromUpgradePatch(model.getIdcsExcludeFromUpgradePatch());
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
     * Attribute's name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Attribute's name
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * If true, indicates that the attribute value must be written to the home region and requires
     * immediate read-after-write consistency for access flows initiated from a replica region.
     *
     * <p>*Added In:** 2209220956
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: never - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty(
            "idcsRequiresImmediateReadAfterWriteForAccessFlows")
    private final Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows;

    /**
     * If true, indicates that the attribute value must be written to the home region and requires
     * immediate read-after-write consistency for access flows initiated from a replica region.
     *
     * <p>*Added In:** 2209220956
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: never - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsRequiresImmediateReadAfterWriteForAccessFlows() {
        return idcsRequiresImmediateReadAfterWriteForAccessFlows;
    }

    /**
     * If true, indicates that the attribute value must be written to the home region for access
     * flows initiated from a replica region.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRequiresWriteForAccessFlows")
    private final Boolean idcsRequiresWriteForAccessFlows;

    /**
     * If true, indicates that the attribute value must be written to the home region for access
     * flows initiated from a replica region.
     *
     * <p>*Added In:** 2205120021
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsRequiresWriteForAccessFlows() {
        return idcsRequiresWriteForAccessFlows;
    }

    /**
     * Localized schema attribute display name for use by UI client for displaying attribute labels
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
    private final String idcsDisplayNameMessageId;

    /**
     * Localized schema attribute display name for use by UI client for displaying attribute labels
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsDisplayNameMessageId() {
        return idcsDisplayNameMessageId;
    }

    /**
     * Specifies if the attributes in this schema can be displayed externally
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
    private final Boolean idcsRtsaHideAttribute;

    /**
     * Specifies if the attributes in this schema can be displayed externally
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsRtsaHideAttribute() {
        return idcsRtsaHideAttribute;
    }

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not
     * exposed via REST. This attribute overrides mutability for create/update if the request is
     * internal and the attribute internal flag is set to True. This attribute overrides the return
     * attribute while building SCIM response attributes when both the request is internal and the
     * schema attribute is internal.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
    private final Boolean idcsInternal;

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not
     * exposed via REST. This attribute overrides mutability for create/update if the request is
     * internal and the attribute internal flag is set to True. This attribute overrides the return
     * attribute while building SCIM response attributes when both the request is internal and the
     * schema attribute is internal.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsInternal() {
        return idcsInternal;
    }

    /**
     * Attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * Attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Attribute's data type--for example, String
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
    private final Boolean multiValued;

    /**
     * Indicates the attribute's plurality
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getMultiValued() {
        return multiValued;
    }

    /**
     * Attribute's human-readable description
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Attribute's human-readable description
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Specifies if the attribute is required
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getRequired() {
        return required;
    }

    /**
     * Specifies if the attribute is required
     *
     * <p>*Added In:** 2305190132
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsReturnEmptyWhenNull")
    private final Boolean idcsReturnEmptyWhenNull;

    /**
     * Specifies if the attribute is required
     *
     * <p>*Added In:** 2305190132
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsReturnEmptyWhenNull() {
        return idcsReturnEmptyWhenNull;
    }

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical
     * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
    private final java.util.List<String> canonicalValues;

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical
     * types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getCanonicalValues() {
        return canonicalValues;
    }

    /**
     * Specifies the default value for an attribute. The value must be one from canonicalValues if
     * defined.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDefaultValue")
    private final String idcsDefaultValue;

    /**
     * Specifies the default value for an attribute. The value must be one from canonicalValues if
     * defined.
     *
     * <p>*Added In:** 18.1.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsDefaultValue() {
        return idcsDefaultValue;
    }

    /**
     * Specifies if the String attribute is case-sensitive
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
    private final Boolean caseExact;

    /**
     * Specifies if the String attribute is case-sensitive
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
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
     * required: false - returned: default - type: string - uniqueness: none
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mutability")
    private final Mutability mutability;

    /**
     * Specifies if the attribute is mutable
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Mutability getMutability() {
        return mutability;
    }

    /**
     * A single keyword that indicates when an attribute and associated values are returned in
     * response to a GET request or in response to a PUT, POST, or PATCH request
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("returned")
    private final Returned returned;

    /**
     * A single keyword that indicates when an attribute and associated values are returned in
     * response to a GET request or in response to a PUT, POST, or PATCH request
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Returned getReturned() {
        return returned;
    }

    /**
     * The attribute that defines the CSV header name for import/export
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeName")
    private final String idcsCsvAttributeName;

    /**
     * The attribute that defines the CSV header name for import/export
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCsvAttributeName() {
        return idcsCsvAttributeName;
    }

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of
     * attribute values. A server MAY reject an invalid value based on uniqueness by returning an
     * HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side
     * to a greater degree than the Service Provider enforces. For example, a client could make a
     * value unique while the server has a uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * value unique while the server has a uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
    private final Uniqueness uniqueness;

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of
     * attribute values. A server MAY reject an invalid value based on uniqueness by returning an
     * HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side
     * to a greater degree than the Service Provider enforces. For example, a client could make a
     * value unique while the server has a uniqueness of \\"none\\".
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Uniqueness getUniqueness() {
        return uniqueness;
    }

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only
     * applicable for attributes that are of the \\"reference\\" data type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
    private final java.util.List<String> referenceTypes;

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only
     * applicable for attributes that are of the \\"reference\\" data type.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: true - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getReferenceTypes() {
        return referenceTypes;
    }

    /**
     * Indicates that the schema has been deprecated since version
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
    private final Integer idcsDeprecatedSinceVersion;

    /**
     * Indicates that the schema has been deprecated since version
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsDeprecatedSinceVersion() {
        return idcsDeprecatedSinceVersion;
    }

    /**
     * Indicates that the schema has been added since version
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
    private final Integer idcsAddedSinceVersion;

    /**
     * Indicates that the schema has been added since version
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
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
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
    private final String idcsDeprecatedSinceReleaseNumber;

    /**
     * Indicates that the schema has been deprecated since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
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
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
    private final String idcsAddedSinceReleaseNumber;

    /**
     * Indicates that the schema has been added since this release number
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsAddedSinceReleaseNumber() {
        return idcsAddedSinceReleaseNumber;
    }

    /**
     * Specifies the minimum length of this attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
    private final Integer idcsMinLength;

    /**
     * Specifies the minimum length of this attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMinLength() {
        return idcsMinLength;
    }

    /**
     * Specifies the maximum length of this attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
    private final Integer idcsMaxLength;

    /**
     * Specifies the maximum length of this attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
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
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
    private final Integer idcsMinValue;

    /**
     * Specifies the minimum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMinValue() {
        return idcsMinValue;
    }

    /**
     * Specifies the maximum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
    private final Integer idcsMaxValue;

    /**
     * Specifies the maximum value of the integer attribute
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsMaxValue() {
        return idcsMaxValue;
    }

    /**
     * If true, specifies that the sub attribute value can be set to true on one and only one
     * instance of the CMVA.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOnlyOneValueCanBeTrue")
    private final Boolean idcsOnlyOneValueCanBeTrue;

    /**
     * If true, specifies that the sub attribute value can be set to true on one and only one
     * instance of the CMVA.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsOnlyOneValueCanBeTrue() {
        return idcsOnlyOneValueCanBeTrue;
    }

    /**
     * **SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: integer - uniqueness: none Specify a limit on the
     * number of attribute-values that any caller will receive when requesting a CMVA attribute. If
     * the no of CMVA instances exceeds the limit then Oracle Identity Cloud Service will throw
     * exception. Users can choose to refine the filter on CMVA attribute.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValuesReturned")
    private final Integer idcsMaxValuesReturned;

    /**
     * **SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: integer - uniqueness: none Specify a limit on the
     * number of attribute-values that any caller will receive when requesting a CMVA attribute. If
     * the no of CMVA instances exceeds the limit then Oracle Identity Cloud Service will throw
     * exception. Users can choose to refine the filter on CMVA attribute.
     *
     * @return the value
     */
    public Integer getIdcsMaxValuesReturned() {
        return idcsMaxValuesReturned;
    }

    /**
     * If true, ARM will ensure atleast one of the instances of CMVA has the attribute value set to
     * true.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOneValueMustBeTrue")
    private final Boolean idcsOneValueMustBeTrue;

    /**
     * If true, ARM will ensure atleast one of the instances of CMVA has the attribute value set to
     * true.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsOneValueMustBeTrue() {
        return idcsOneValueMustBeTrue;
    }

    /**
     * Specifies the directly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
    private final java.util.List<String> idcsRefResourceAttributes;

    /**
     * Specifies the directly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: string
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
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
    private final java.util.List<String> idcsIndirectRefResourceAttributes;

    /**
     * Specifies the indirectly referenced Resources
     *
     * <p>*SCIM++ Properties:** - multiValued: true - mutability: readWrite - required: false -
     * returned: default - type: string
     *
     * @return the value
     */
    public java.util.List<String> getIdcsIndirectRefResourceAttributes() {
        return idcsIndirectRefResourceAttributes;
    }

    /**
     * Specifies whether the sub-attribute of the Resource attribute is persisted
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
    private final Boolean idcsValuePersisted;

    /**
     * Specifies whether the sub-attribute of the Resource attribute is persisted
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsValuePersisted() {
        return idcsValuePersisted;
    }

    /**
     * Specifiees if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * Specifiees if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
    private final IdcsSensitive idcsSensitive;

    /**
     * Specifiees if the attribute should be encrypted or hashed
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public IdcsSensitive getIdcsSensitive() {
        return idcsSensitive;
    }

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
    private final Boolean idcsTrimStringValue;

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
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
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
    private final Boolean idcsSearchable;

    /**
     * Specifies whether this attribute can be included in a search filter
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
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
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
    private final Boolean idcsGenerated;

    /**
     * Specifies whether this attribute value was generated
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsGenerated() {
        return idcsGenerated;
    }

    /**
     * Specifies whether changes to this attribute value will be audited
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
    private final Boolean idcsAuditable;

    /**
     * Specifies whether changes to this attribute value will be audited
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
    private final String idcsTargetAttributeName;

    /**
     * Target attribute name that this attribute gets mapped to for persistence
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetAttributeName() {
        return idcsTargetAttributeName;
    }

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for
     * persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetNormAttributeName")
    private final String idcsTargetNormAttributeName;

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for
     * persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
    private final String idcsTargetAttributeNameToMigrateFrom;

    /**
     * Old Target attribute name from child table for CSVA attribute prior to migration. This
     * maintains this attribute used to get mapped to for persistence
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetAttributeNameToMigrateFrom() {
        return idcsTargetAttributeNameToMigrateFrom;
    }

    /**
     * Target index name created for this attribute for performance
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
    private final String idcsTargetUniqueConstraintName;

    /**
     * Target index name created for this attribute for performance
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readOnly -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsTargetUniqueConstraintName() {
        return idcsTargetUniqueConstraintName;
    }

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
    private final String idcsToTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
    private final String idcsFromTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value from DataProvider-specific
     * semantics
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
    private final String idcsDisplayName;

    /**
     * Specifies the user-friendly displayable attribute name or catalog key used for localization
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
    private final String idcsCanonicalValueSourceResourceType;

    /**
     * Specifies the Resource type to read from for dynamic canonical values
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
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
     * Specifies the Resource type ID to read from for dynamic canonical values
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceTypeID")
    private final String idcsCanonicalValueSourceResourceTypeID;

    /**
     * Specifies the Resource type ID to read from for dynamic canonical values
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCanonicalValueSourceResourceTypeID() {
        return idcsCanonicalValueSourceResourceTypeID;
    }

    /**
     * Display name for the canonical value attribute name.
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceDisplayAttrName")
    private final String idcsCanonicalValueSourceDisplayAttrName;

    /**
     * Display name for the canonical value attribute name.
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCanonicalValueSourceDisplayAttrName() {
        return idcsCanonicalValueSourceDisplayAttrName;
    }

    /**
     * Source key attribute for the canonical value.
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceKeyAttrName")
    private final String idcsCanonicalValueSourceKeyAttrName;

    /**
     * Source key attribute for the canonical value.
     *
     * <p>*Added In:** 17.4.4
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIdcsCanonicalValueSourceKeyAttrName() {
        return idcsCanonicalValueSourceKeyAttrName;
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
     * Indicates if the attribute is scim compliant, default is true
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
    private final Boolean idcsScimCompliant;

    /**
     * Indicates if the attribute is scim compliant, default is true
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsScimCompliant() {
        return idcsScimCompliant;
    }

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD
     * or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then
     * this flag is ignored.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
    private final Boolean idcsAttributeMappable;

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD
     * or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then
     * this flag is ignored.
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsAttributeMappable() {
        return idcsAttributeMappable;
    }

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If
     * attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while
     * executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data
     * Provider.
     *
     * <p>*Added In:** 17.3.4
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
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
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsAttributeCacheable() {
        return idcsAttributeCacheable;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the
     * Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiOrder")
    private final Integer idcsuiOrder;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the
     * Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: integer
     *
     * @return the value
     */
    public Integer getIdcsuiOrder() {
        return idcsuiOrder;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using
     * regular expressions.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiRegexp")
    private final String idcsuiRegexp;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using
     * regular expressions.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     *
     * @return the value
     */
    public String getIdcsuiRegexp() {
        return idcsuiRegexp;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be
     * displayed on the Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiVisible")
    private final Boolean idcsuiVisible;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be
     * displayed on the Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsuiVisible() {
        return idcsuiVisible;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on
     * the Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    public enum IdcsuiWidget implements com.oracle.bmc.http.internal.BmcEnum {
        Inputtext("inputtext"),
        Checkbox("checkbox"),
        Textarea("textarea"),
        Combobox("combobox"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdcsuiWidget.class);

        private final String value;
        private static java.util.Map<String, IdcsuiWidget> map;

        static {
            map = new java.util.HashMap<>();
            for (IdcsuiWidget v : IdcsuiWidget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdcsuiWidget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdcsuiWidget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdcsuiWidget', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on
     * the Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiWidget")
    private final IdcsuiWidget idcsuiWidget;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on
     * the Account Form.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: string
     *
     * @return the value
     */
    public IdcsuiWidget getIdcsuiWidget() {
        return idcsuiWidget;
    }

    /**
     * If true, ARM should not validate the value of the attribute since it will be
     * converted/migrated to another attribute internally by the manager which will build valid
     * post, put, or patch payload, depending on the client requested operation
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersistedInOtherAttribute")
    private final Boolean idcsValuePersistedInOtherAttribute;

    /**
     * If true, ARM should not validate the value of the attribute since it will be
     * converted/migrated to another attribute internally by the manager which will build valid
     * post, put, or patch payload, depending on the client requested operation
     *
     * <p>*Added In:** 18.2.2
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsValuePersistedInOtherAttribute() {
        return idcsValuePersistedInOtherAttribute;
    }

    /**
     * Specifies whether the attribute is PII (personal information). False by default for all
     * attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's
     * written to the Oracle Identity Cloud Service system logs.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPii")
    private final Boolean idcsPii;

    /**
     * Specifies whether the attribute is PII (personal information). False by default for all
     * attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's
     * written to the Oracle Identity Cloud Service system logs.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readOnly - required: false -
     * returned: default - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsPii() {
        return idcsPii;
    }

    /**
     * Specifies if the value of the attribute should be sanitized using OWASP library for HTML
     * content
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSanitize")
    private final Boolean idcsSanitize;

    /**
     * Specifies if the value of the attribute should be sanitized using OWASP library for HTML
     * content
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIdcsSanitize() {
        return idcsSanitize;
    }

    /**
     * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle
     * task for upgrading OOTB resources.
     *
     * <p>*Added In:** 2104150946
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: never - type: boolean
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsExcludeFromUpgradePatch")
    private final Boolean idcsExcludeFromUpgradePatch;

    /**
     * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle
     * task for upgrading OOTB resources.
     *
     * <p>*Added In:** 2104150946
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * returned: never - type: boolean
     *
     * @return the value
     */
    public Boolean getIdcsExcludeFromUpgradePatch() {
        return idcsExcludeFromUpgradePatch;
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
        sb.append("SchemaSubAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", idcsRequiresImmediateReadAfterWriteForAccessFlows=")
                .append(String.valueOf(this.idcsRequiresImmediateReadAfterWriteForAccessFlows));
        sb.append(", idcsRequiresWriteForAccessFlows=")
                .append(String.valueOf(this.idcsRequiresWriteForAccessFlows));
        sb.append(", idcsDisplayNameMessageId=")
                .append(String.valueOf(this.idcsDisplayNameMessageId));
        sb.append(", idcsRtsaHideAttribute=").append(String.valueOf(this.idcsRtsaHideAttribute));
        sb.append(", idcsInternal=").append(String.valueOf(this.idcsInternal));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", multiValued=").append(String.valueOf(this.multiValued));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", idcsReturnEmptyWhenNull=")
                .append(String.valueOf(this.idcsReturnEmptyWhenNull));
        sb.append(", canonicalValues=").append(String.valueOf(this.canonicalValues));
        sb.append(", idcsDefaultValue=").append(String.valueOf(this.idcsDefaultValue));
        sb.append(", caseExact=").append(String.valueOf(this.caseExact));
        sb.append(", mutability=").append(String.valueOf(this.mutability));
        sb.append(", returned=").append(String.valueOf(this.returned));
        sb.append(", idcsCsvAttributeName=").append(String.valueOf(this.idcsCsvAttributeName));
        sb.append(", uniqueness=").append(String.valueOf(this.uniqueness));
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
        sb.append(", idcsOnlyOneValueCanBeTrue=")
                .append(String.valueOf(this.idcsOnlyOneValueCanBeTrue));
        sb.append(", idcsMaxValuesReturned=").append(String.valueOf(this.idcsMaxValuesReturned));
        sb.append(", idcsOneValueMustBeTrue=").append(String.valueOf(this.idcsOneValueMustBeTrue));
        sb.append(", idcsRefResourceAttributes=")
                .append(String.valueOf(this.idcsRefResourceAttributes));
        sb.append(", idcsIndirectRefResourceAttributes=")
                .append(String.valueOf(this.idcsIndirectRefResourceAttributes));
        sb.append(", idcsValuePersisted=").append(String.valueOf(this.idcsValuePersisted));
        sb.append(", idcsSensitive=").append(String.valueOf(this.idcsSensitive));
        sb.append(", idcsTrimStringValue=").append(String.valueOf(this.idcsTrimStringValue));
        sb.append(", idcsSearchable=").append(String.valueOf(this.idcsSearchable));
        sb.append(", idcsGenerated=").append(String.valueOf(this.idcsGenerated));
        sb.append(", idcsAuditable=").append(String.valueOf(this.idcsAuditable));
        sb.append(", idcsTargetAttributeName=")
                .append(String.valueOf(this.idcsTargetAttributeName));
        sb.append(", idcsTargetNormAttributeName=")
                .append(String.valueOf(this.idcsTargetNormAttributeName));
        sb.append(", idcsTargetAttributeNameToMigrateFrom=")
                .append(String.valueOf(this.idcsTargetAttributeNameToMigrateFrom));
        sb.append(", idcsTargetUniqueConstraintName=")
                .append(String.valueOf(this.idcsTargetUniqueConstraintName));
        sb.append(", idcsToTargetMapper=").append(String.valueOf(this.idcsToTargetMapper));
        sb.append(", idcsFromTargetMapper=").append(String.valueOf(this.idcsFromTargetMapper));
        sb.append(", idcsDisplayName=").append(String.valueOf(this.idcsDisplayName));
        sb.append(", idcsCanonicalValueSourceResourceType=")
                .append(String.valueOf(this.idcsCanonicalValueSourceResourceType));
        sb.append(", idcsCanonicalValueSourceFilter=")
                .append(String.valueOf(this.idcsCanonicalValueSourceFilter));
        sb.append(", idcsCanonicalValueSourceResourceTypeID=")
                .append(String.valueOf(this.idcsCanonicalValueSourceResourceTypeID));
        sb.append(", idcsCanonicalValueSourceDisplayAttrName=")
                .append(String.valueOf(this.idcsCanonicalValueSourceDisplayAttrName));
        sb.append(", idcsCanonicalValueSourceKeyAttrName=")
                .append(String.valueOf(this.idcsCanonicalValueSourceKeyAttrName));
        sb.append(", idcsValidateReference=").append(String.valueOf(this.idcsValidateReference));
        sb.append(", idcsScimCompliant=").append(String.valueOf(this.idcsScimCompliant));
        sb.append(", idcsAttributeMappable=").append(String.valueOf(this.idcsAttributeMappable));
        sb.append(", idcsAttributeCacheable=").append(String.valueOf(this.idcsAttributeCacheable));
        sb.append(", idcsuiOrder=").append(String.valueOf(this.idcsuiOrder));
        sb.append(", idcsuiRegexp=").append(String.valueOf(this.idcsuiRegexp));
        sb.append(", idcsuiVisible=").append(String.valueOf(this.idcsuiVisible));
        sb.append(", idcsuiWidget=").append(String.valueOf(this.idcsuiWidget));
        sb.append(", idcsValuePersistedInOtherAttribute=")
                .append(String.valueOf(this.idcsValuePersistedInOtherAttribute));
        sb.append(", idcsPii=").append(String.valueOf(this.idcsPii));
        sb.append(", idcsSanitize=").append(String.valueOf(this.idcsSanitize));
        sb.append(", idcsExcludeFromUpgradePatch=")
                .append(String.valueOf(this.idcsExcludeFromUpgradePatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaSubAttributes)) {
            return false;
        }

        SchemaSubAttributes other = (SchemaSubAttributes) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.idcsRequiresImmediateReadAfterWriteForAccessFlows,
                        other.idcsRequiresImmediateReadAfterWriteForAccessFlows)
                && java.util.Objects.equals(
                        this.idcsRequiresWriteForAccessFlows, other.idcsRequiresWriteForAccessFlows)
                && java.util.Objects.equals(
                        this.idcsDisplayNameMessageId, other.idcsDisplayNameMessageId)
                && java.util.Objects.equals(this.idcsRtsaHideAttribute, other.idcsRtsaHideAttribute)
                && java.util.Objects.equals(this.idcsInternal, other.idcsInternal)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.multiValued, other.multiValued)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(
                        this.idcsReturnEmptyWhenNull, other.idcsReturnEmptyWhenNull)
                && java.util.Objects.equals(this.canonicalValues, other.canonicalValues)
                && java.util.Objects.equals(this.idcsDefaultValue, other.idcsDefaultValue)
                && java.util.Objects.equals(this.caseExact, other.caseExact)
                && java.util.Objects.equals(this.mutability, other.mutability)
                && java.util.Objects.equals(this.returned, other.returned)
                && java.util.Objects.equals(this.idcsCsvAttributeName, other.idcsCsvAttributeName)
                && java.util.Objects.equals(this.uniqueness, other.uniqueness)
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
                && java.util.Objects.equals(
                        this.idcsOnlyOneValueCanBeTrue, other.idcsOnlyOneValueCanBeTrue)
                && java.util.Objects.equals(this.idcsMaxValuesReturned, other.idcsMaxValuesReturned)
                && java.util.Objects.equals(
                        this.idcsOneValueMustBeTrue, other.idcsOneValueMustBeTrue)
                && java.util.Objects.equals(
                        this.idcsRefResourceAttributes, other.idcsRefResourceAttributes)
                && java.util.Objects.equals(
                        this.idcsIndirectRefResourceAttributes,
                        other.idcsIndirectRefResourceAttributes)
                && java.util.Objects.equals(this.idcsValuePersisted, other.idcsValuePersisted)
                && java.util.Objects.equals(this.idcsSensitive, other.idcsSensitive)
                && java.util.Objects.equals(this.idcsTrimStringValue, other.idcsTrimStringValue)
                && java.util.Objects.equals(this.idcsSearchable, other.idcsSearchable)
                && java.util.Objects.equals(this.idcsGenerated, other.idcsGenerated)
                && java.util.Objects.equals(this.idcsAuditable, other.idcsAuditable)
                && java.util.Objects.equals(
                        this.idcsTargetAttributeName, other.idcsTargetAttributeName)
                && java.util.Objects.equals(
                        this.idcsTargetNormAttributeName, other.idcsTargetNormAttributeName)
                && java.util.Objects.equals(
                        this.idcsTargetAttributeNameToMigrateFrom,
                        other.idcsTargetAttributeNameToMigrateFrom)
                && java.util.Objects.equals(
                        this.idcsTargetUniqueConstraintName, other.idcsTargetUniqueConstraintName)
                && java.util.Objects.equals(this.idcsToTargetMapper, other.idcsToTargetMapper)
                && java.util.Objects.equals(this.idcsFromTargetMapper, other.idcsFromTargetMapper)
                && java.util.Objects.equals(this.idcsDisplayName, other.idcsDisplayName)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceResourceType,
                        other.idcsCanonicalValueSourceResourceType)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceFilter, other.idcsCanonicalValueSourceFilter)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceResourceTypeID,
                        other.idcsCanonicalValueSourceResourceTypeID)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceDisplayAttrName,
                        other.idcsCanonicalValueSourceDisplayAttrName)
                && java.util.Objects.equals(
                        this.idcsCanonicalValueSourceKeyAttrName,
                        other.idcsCanonicalValueSourceKeyAttrName)
                && java.util.Objects.equals(this.idcsValidateReference, other.idcsValidateReference)
                && java.util.Objects.equals(this.idcsScimCompliant, other.idcsScimCompliant)
                && java.util.Objects.equals(this.idcsAttributeMappable, other.idcsAttributeMappable)
                && java.util.Objects.equals(
                        this.idcsAttributeCacheable, other.idcsAttributeCacheable)
                && java.util.Objects.equals(this.idcsuiOrder, other.idcsuiOrder)
                && java.util.Objects.equals(this.idcsuiRegexp, other.idcsuiRegexp)
                && java.util.Objects.equals(this.idcsuiVisible, other.idcsuiVisible)
                && java.util.Objects.equals(this.idcsuiWidget, other.idcsuiWidget)
                && java.util.Objects.equals(
                        this.idcsValuePersistedInOtherAttribute,
                        other.idcsValuePersistedInOtherAttribute)
                && java.util.Objects.equals(this.idcsPii, other.idcsPii)
                && java.util.Objects.equals(this.idcsSanitize, other.idcsSanitize)
                && java.util.Objects.equals(
                        this.idcsExcludeFromUpgradePatch, other.idcsExcludeFromUpgradePatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRequiresImmediateReadAfterWriteForAccessFlows == null
                                ? 43
                                : this.idcsRequiresImmediateReadAfterWriteForAccessFlows
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRequiresWriteForAccessFlows == null
                                ? 43
                                : this.idcsRequiresWriteForAccessFlows.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDisplayNameMessageId == null
                                ? 43
                                : this.idcsDisplayNameMessageId.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRtsaHideAttribute == null
                                ? 43
                                : this.idcsRtsaHideAttribute.hashCode());
        result = (result * PRIME) + (this.idcsInternal == null ? 43 : this.idcsInternal.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.multiValued == null ? 43 : this.multiValued.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsReturnEmptyWhenNull == null
                                ? 43
                                : this.idcsReturnEmptyWhenNull.hashCode());
        result =
                (result * PRIME)
                        + (this.canonicalValues == null ? 43 : this.canonicalValues.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDefaultValue == null ? 43 : this.idcsDefaultValue.hashCode());
        result = (result * PRIME) + (this.caseExact == null ? 43 : this.caseExact.hashCode());
        result = (result * PRIME) + (this.mutability == null ? 43 : this.mutability.hashCode());
        result = (result * PRIME) + (this.returned == null ? 43 : this.returned.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCsvAttributeName == null
                                ? 43
                                : this.idcsCsvAttributeName.hashCode());
        result = (result * PRIME) + (this.uniqueness == null ? 43 : this.uniqueness.hashCode());
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
                        + (this.idcsOnlyOneValueCanBeTrue == null
                                ? 43
                                : this.idcsOnlyOneValueCanBeTrue.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsMaxValuesReturned == null
                                ? 43
                                : this.idcsMaxValuesReturned.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsOneValueMustBeTrue == null
                                ? 43
                                : this.idcsOneValueMustBeTrue.hashCode());
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
                        + (this.idcsValuePersisted == null
                                ? 43
                                : this.idcsValuePersisted.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsSensitive == null ? 43 : this.idcsSensitive.hashCode());
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
                        + (this.idcsTargetUniqueConstraintName == null
                                ? 43
                                : this.idcsTargetUniqueConstraintName.hashCode());
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
                        + (this.idcsCanonicalValueSourceResourceTypeID == null
                                ? 43
                                : this.idcsCanonicalValueSourceResourceTypeID.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCanonicalValueSourceDisplayAttrName == null
                                ? 43
                                : this.idcsCanonicalValueSourceDisplayAttrName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCanonicalValueSourceKeyAttrName == null
                                ? 43
                                : this.idcsCanonicalValueSourceKeyAttrName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsValidateReference == null
                                ? 43
                                : this.idcsValidateReference.hashCode());
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
                        + (this.idcsAttributeCacheable == null
                                ? 43
                                : this.idcsAttributeCacheable.hashCode());
        result = (result * PRIME) + (this.idcsuiOrder == null ? 43 : this.idcsuiOrder.hashCode());
        result = (result * PRIME) + (this.idcsuiRegexp == null ? 43 : this.idcsuiRegexp.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsuiVisible == null ? 43 : this.idcsuiVisible.hashCode());
        result = (result * PRIME) + (this.idcsuiWidget == null ? 43 : this.idcsuiWidget.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsValuePersistedInOtherAttribute == null
                                ? 43
                                : this.idcsValuePersistedInOtherAttribute.hashCode());
        result = (result * PRIME) + (this.idcsPii == null ? 43 : this.idcsPii.hashCode());
        result = (result * PRIME) + (this.idcsSanitize == null ? 43 : this.idcsSanitize.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsExcludeFromUpgradePatch == null
                                ? 43
                                : this.idcsExcludeFromUpgradePatch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
