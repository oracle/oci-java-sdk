/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A complex type that specifies the set of Resource attributes
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SchemaAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SchemaAttributes extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "idcsDisplayNameMessageId",
        "idcsRtsaHideAttribute",
        "localizedDisplayName",
        "type",
        "multiValued",
        "description",
        "required",
        "idcsReturnEmptyWhenNull",
        "canonicalValues",
        "idcsDefaultValue",
        "localizedCanonicalValues",
        "caseExact",
        "mutability",
        "returned",
        "uniqueness",
        "idcsCsvAttributeName",
        "idcsComplexAttributeNameMappings",
        "idcsICFBundleAttributeName",
        "idcsICFRequired",
        "idcsICFAttributeType",
        "idcsCsvAttributeNameMappings",
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
        "idcsMapsToSameTargetAttributeNameAs",
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
        "idcsCanonicalValueType",
        "idcsValidateReference",
        "idcsCompositeKey",
        "idcsFetchComplexAttributeValues",
        "idcsScimCompliant",
        "idcsAttributeMappable",
        "idcsValuePersistedInOtherAttribute",
        "idcsPii",
        "idcsExcludeFromUpgradePatch",
        "subAttributes",
        "idcsRefResourceAttribute",
        "idcsAttributeCacheable",
        "idcsuiOrder",
        "idcsuiRegexp",
        "idcsuiVisible",
        "idcsuiWidget",
        "idcsFeatures",
        "idcsOptionalPiiCanonicalValues",
        "idcsSanitize",
        "idcsOverrideCommonAttribute",
        "idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete",
        "idcsAllowUpdatesInReadOnlyMode",
        "idcsPaginateResponse",
        "idcsRequiresWriteForAccessFlows",
        "idcsRequiresImmediateReadAfterWriteForAccessFlows"
    })
    public SchemaAttributes(
            String name,
            String idcsDisplayNameMessageId,
            Boolean idcsRtsaHideAttribute,
            SchemaLocalizedDisplayName localizedDisplayName,
            Type type,
            Boolean multiValued,
            String description,
            Boolean required,
            Boolean idcsReturnEmptyWhenNull,
            java.util.List<String> canonicalValues,
            String idcsDefaultValue,
            java.util.List<SchemaLocalizedCanonicalValues> localizedCanonicalValues,
            Boolean caseExact,
            Mutability mutability,
            Returned returned,
            Uniqueness uniqueness,
            String idcsCsvAttributeName,
            java.util.List<SchemaIdcsComplexAttributeNameMappings> idcsComplexAttributeNameMappings,
            String idcsICFBundleAttributeName,
            Boolean idcsICFRequired,
            IdcsICFAttributeType idcsICFAttributeType,
            java.util.List<SchemaIdcsCsvAttributeNameMappings> idcsCsvAttributeNameMappings,
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
            String idcsMapsToSameTargetAttributeNameAs,
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
            IdcsCanonicalValueType idcsCanonicalValueType,
            Boolean idcsValidateReference,
            java.util.List<String> idcsCompositeKey,
            Boolean idcsFetchComplexAttributeValues,
            Boolean idcsScimCompliant,
            Boolean idcsAttributeMappable,
            Boolean idcsValuePersistedInOtherAttribute,
            Boolean idcsPii,
            Boolean idcsExcludeFromUpgradePatch,
            java.util.List<SchemaSubAttributes> subAttributes,
            String idcsRefResourceAttribute,
            Boolean idcsAttributeCacheable,
            Integer idcsuiOrder,
            String idcsuiRegexp,
            Boolean idcsuiVisible,
            IdcsuiWidget idcsuiWidget,
            java.util.List<IdcsFeatures> idcsFeatures,
            java.util.List<String> idcsOptionalPiiCanonicalValues,
            Boolean idcsSanitize,
            Boolean idcsOverrideCommonAttribute,
            Boolean idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete,
            Boolean idcsAllowUpdatesInReadOnlyMode,
            Boolean idcsPaginateResponse,
            Boolean idcsRequiresWriteForAccessFlows,
            Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows) {
        super();
        this.name = name;
        this.idcsDisplayNameMessageId = idcsDisplayNameMessageId;
        this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
        this.localizedDisplayName = localizedDisplayName;
        this.type = type;
        this.multiValued = multiValued;
        this.description = description;
        this.required = required;
        this.idcsReturnEmptyWhenNull = idcsReturnEmptyWhenNull;
        this.canonicalValues = canonicalValues;
        this.idcsDefaultValue = idcsDefaultValue;
        this.localizedCanonicalValues = localizedCanonicalValues;
        this.caseExact = caseExact;
        this.mutability = mutability;
        this.returned = returned;
        this.uniqueness = uniqueness;
        this.idcsCsvAttributeName = idcsCsvAttributeName;
        this.idcsComplexAttributeNameMappings = idcsComplexAttributeNameMappings;
        this.idcsICFBundleAttributeName = idcsICFBundleAttributeName;
        this.idcsICFRequired = idcsICFRequired;
        this.idcsICFAttributeType = idcsICFAttributeType;
        this.idcsCsvAttributeNameMappings = idcsCsvAttributeNameMappings;
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
        this.idcsMapsToSameTargetAttributeNameAs = idcsMapsToSameTargetAttributeNameAs;
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
        this.idcsCanonicalValueType = idcsCanonicalValueType;
        this.idcsValidateReference = idcsValidateReference;
        this.idcsCompositeKey = idcsCompositeKey;
        this.idcsFetchComplexAttributeValues = idcsFetchComplexAttributeValues;
        this.idcsScimCompliant = idcsScimCompliant;
        this.idcsAttributeMappable = idcsAttributeMappable;
        this.idcsValuePersistedInOtherAttribute = idcsValuePersistedInOtherAttribute;
        this.idcsPii = idcsPii;
        this.idcsExcludeFromUpgradePatch = idcsExcludeFromUpgradePatch;
        this.subAttributes = subAttributes;
        this.idcsRefResourceAttribute = idcsRefResourceAttribute;
        this.idcsAttributeCacheable = idcsAttributeCacheable;
        this.idcsuiOrder = idcsuiOrder;
        this.idcsuiRegexp = idcsuiRegexp;
        this.idcsuiVisible = idcsuiVisible;
        this.idcsuiWidget = idcsuiWidget;
        this.idcsFeatures = idcsFeatures;
        this.idcsOptionalPiiCanonicalValues = idcsOptionalPiiCanonicalValues;
        this.idcsSanitize = idcsSanitize;
        this.idcsOverrideCommonAttribute = idcsOverrideCommonAttribute;
        this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete =
                idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete;
        this.idcsAllowUpdatesInReadOnlyMode = idcsAllowUpdatesInReadOnlyMode;
        this.idcsPaginateResponse = idcsPaginateResponse;
        this.idcsRequiresWriteForAccessFlows = idcsRequiresWriteForAccessFlows;
        this.idcsRequiresImmediateReadAfterWriteForAccessFlows =
                idcsRequiresImmediateReadAfterWriteForAccessFlows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Attribute's name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Attribute's name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
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
         * Localized schema attribute display name for use by UI client  for displaying attribute labels
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
        private String idcsDisplayNameMessageId;

        /**
         * Localized schema attribute display name for use by UI client  for displaying attribute labels
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsDisplayNameMessageId the value to set
         * @return this builder
         **/
        public Builder idcsDisplayNameMessageId(String idcsDisplayNameMessageId) {
            this.idcsDisplayNameMessageId = idcsDisplayNameMessageId;
            this.__explicitlySet__.add("idcsDisplayNameMessageId");
            return this;
        }
        /**
         * Specifies if the attributes in this schema should be hidden externally
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
        private Boolean idcsRtsaHideAttribute;

        /**
         * Specifies if the attributes in this schema should be hidden externally
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsRtsaHideAttribute the value to set
         * @return this builder
         **/
        public Builder idcsRtsaHideAttribute(Boolean idcsRtsaHideAttribute) {
            this.idcsRtsaHideAttribute = idcsRtsaHideAttribute;
            this.__explicitlySet__.add("idcsRtsaHideAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localizedDisplayName")
        private SchemaLocalizedDisplayName localizedDisplayName;

        public Builder localizedDisplayName(SchemaLocalizedDisplayName localizedDisplayName) {
            this.localizedDisplayName = localizedDisplayName;
            this.__explicitlySet__.add("localizedDisplayName");
            return this;
        }
        /**
         * The attribute's data type--for example, String
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The attribute's data type--for example, String
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
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
         * Indicates the attribute's plurality
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
        private Boolean multiValued;

        /**
         * Indicates the attribute's plurality
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param multiValued the value to set
         * @return this builder
         **/
        public Builder multiValued(Boolean multiValued) {
            this.multiValued = multiValued;
            this.__explicitlySet__.add("multiValued");
            return this;
        }
        /**
         * The attribute's human-readable description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The attribute's human-readable description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies if the attribute is required
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Specifies if the attribute is required
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param required the value to set
         * @return this builder
         **/
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * Specifies if the attribute is required
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsReturnEmptyWhenNull")
        private Boolean idcsReturnEmptyWhenNull;

        /**
         * Specifies if the attribute is required
         * <p>
         **Added In:** 2305190132
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsReturnEmptyWhenNull the value to set
         * @return this builder
         **/
        public Builder idcsReturnEmptyWhenNull(Boolean idcsReturnEmptyWhenNull) {
            this.idcsReturnEmptyWhenNull = idcsReturnEmptyWhenNull;
            this.__explicitlySet__.add("idcsReturnEmptyWhenNull");
            return this;
        }
        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
        private java.util.List<String> canonicalValues;

        /**
         * A collection of canonical values. Applicable Service Providers MUST specify the canonical types specified in the core schema specification--for example, \\"work\\", \\"home\\".
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param canonicalValues the value to set
         * @return this builder
         **/
        public Builder canonicalValues(java.util.List<String> canonicalValues) {
            this.canonicalValues = canonicalValues;
            this.__explicitlySet__.add("canonicalValues");
            return this;
        }
        /**
         * Specifies the default value for an attribute. The value must be one from canonicalValues if defined.
         * <p>
         **Added In:** 18.1.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDefaultValue")
        private String idcsDefaultValue;

        /**
         * Specifies the default value for an attribute. The value must be one from canonicalValues if defined.
         * <p>
         **Added In:** 18.1.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsDefaultValue the value to set
         * @return this builder
         **/
        public Builder idcsDefaultValue(String idcsDefaultValue) {
            this.idcsDefaultValue = idcsDefaultValue;
            this.__explicitlySet__.add("idcsDefaultValue");
            return this;
        }
        /**
         * A collection of Localized canonical values.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("localizedCanonicalValues")
        private java.util.List<SchemaLocalizedCanonicalValues> localizedCanonicalValues;

        /**
         * A collection of Localized canonical values.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param localizedCanonicalValues the value to set
         * @return this builder
         **/
        public Builder localizedCanonicalValues(
                java.util.List<SchemaLocalizedCanonicalValues> localizedCanonicalValues) {
            this.localizedCanonicalValues = localizedCanonicalValues;
            this.__explicitlySet__.add("localizedCanonicalValues");
            return this;
        }
        /**
         * Specifies if the String attribute is case-sensitive
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
        private Boolean caseExact;

        /**
         * Specifies if the String attribute is case-sensitive
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param caseExact the value to set
         * @return this builder
         **/
        public Builder caseExact(Boolean caseExact) {
            this.caseExact = caseExact;
            this.__explicitlySet__.add("caseExact");
            return this;
        }
        /**
         * Specifies if the attribute is mutable
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mutability")
        private Mutability mutability;

        /**
         * Specifies if the attribute is mutable
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param mutability the value to set
         * @return this builder
         **/
        public Builder mutability(Mutability mutability) {
            this.mutability = mutability;
            this.__explicitlySet__.add("mutability");
            return this;
        }
        /**
         * A single keyword that indicates when an attribute and associated values are returned in response to a GET request or in response to a PUT, POST, or PATCH request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("returned")
        private Returned returned;

        /**
         * A single keyword that indicates when an attribute and associated values are returned in response to a GET request or in response to a PUT, POST, or PATCH request
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param returned the value to set
         * @return this builder
         **/
        public Builder returned(Returned returned) {
            this.returned = returned;
            this.__explicitlySet__.add("returned");
            return this;
        }
        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of attribute values. A server MAY reject an invalid value based on uniqueness by returning an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side to a greater degree than the Service Provider enforces. For example, a client could make a value unique while the server has the uniqueness of \\"none\\".
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
        private Uniqueness uniqueness;

        /**
         * A single keyword value that specifies how the Service Provider enforces uniqueness of attribute values. A server MAY reject an invalid value based on uniqueness by returning an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side to a greater degree than the Service Provider enforces. For example, a client could make a value unique while the server has the uniqueness of \\"none\\".
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param uniqueness the value to set
         * @return this builder
         **/
        public Builder uniqueness(Uniqueness uniqueness) {
            this.uniqueness = uniqueness;
            this.__explicitlySet__.add("uniqueness");
            return this;
        }
        /**
         * The attribute defining the CSV header name for import/export
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeName")
        private String idcsCsvAttributeName;

        /**
         * The attribute defining the CSV header name for import/export
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCsvAttributeName the value to set
         * @return this builder
         **/
        public Builder idcsCsvAttributeName(String idcsCsvAttributeName) {
            this.idcsCsvAttributeName = idcsCsvAttributeName;
            this.__explicitlySet__.add("idcsCsvAttributeName");
            return this;
        }
        /**
         * Specifies the mapping between external identity source attributes and Oracle Identity Cloud Service complex attributes (e.g. email => emails[work].value)
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsComplexAttributeNameMappings")
        private java.util.List<SchemaIdcsComplexAttributeNameMappings>
                idcsComplexAttributeNameMappings;

        /**
         * Specifies the mapping between external identity source attributes and Oracle Identity Cloud Service complex attributes (e.g. email => emails[work].value)
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param idcsComplexAttributeNameMappings the value to set
         * @return this builder
         **/
        public Builder idcsComplexAttributeNameMappings(
                java.util.List<SchemaIdcsComplexAttributeNameMappings>
                        idcsComplexAttributeNameMappings) {
            this.idcsComplexAttributeNameMappings = idcsComplexAttributeNameMappings;
            this.__explicitlySet__.add("idcsComplexAttributeNameMappings");
            return this;
        }
        /**
         * Maps to ICF target attribute name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFBundleAttributeName")
        private String idcsICFBundleAttributeName;

        /**
         * Maps to ICF target attribute name
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsICFBundleAttributeName the value to set
         * @return this builder
         **/
        public Builder idcsICFBundleAttributeName(String idcsICFBundleAttributeName) {
            this.idcsICFBundleAttributeName = idcsICFBundleAttributeName;
            this.__explicitlySet__.add("idcsICFBundleAttributeName");
            return this;
        }
        /**
         * Metadata to identify the ICF required attribute
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFRequired")
        private Boolean idcsICFRequired;

        /**
         * Metadata to identify the ICF required attribute
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsICFRequired the value to set
         * @return this builder
         **/
        public Builder idcsICFRequired(Boolean idcsICFRequired) {
            this.idcsICFRequired = idcsICFRequired;
            this.__explicitlySet__.add("idcsICFRequired");
            return this;
        }
        /**
         * Maps to ICF data type
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsICFAttributeType")
        private IdcsICFAttributeType idcsICFAttributeType;

        /**
         * Maps to ICF data type
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsICFAttributeType the value to set
         * @return this builder
         **/
        public Builder idcsICFAttributeType(IdcsICFAttributeType idcsICFAttributeType) {
            this.idcsICFAttributeType = idcsICFAttributeType;
            this.__explicitlySet__.add("idcsICFAttributeType");
            return this;
        }
        /**
         * Csv meta data for those resource type attributes which can be imported / exported from / to csv.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeNameMappings")
        private java.util.List<SchemaIdcsCsvAttributeNameMappings> idcsCsvAttributeNameMappings;

        /**
         * Csv meta data for those resource type attributes which can be imported / exported from / to csv.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param idcsCsvAttributeNameMappings the value to set
         * @return this builder
         **/
        public Builder idcsCsvAttributeNameMappings(
                java.util.List<SchemaIdcsCsvAttributeNameMappings> idcsCsvAttributeNameMappings) {
            this.idcsCsvAttributeNameMappings = idcsCsvAttributeNameMappings;
            this.__explicitlySet__.add("idcsCsvAttributeNameMappings");
            return this;
        }
        /**
         * The names of the Resource types that may be referenced--for example, User. This is only applicable for attributes that are of the \\"reference\\" data type.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
        private java.util.List<String> referenceTypes;

        /**
         * The names of the Resource types that may be referenced--for example, User. This is only applicable for attributes that are of the \\"reference\\" data type.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param referenceTypes the value to set
         * @return this builder
         **/
        public Builder referenceTypes(java.util.List<String> referenceTypes) {
            this.referenceTypes = referenceTypes;
            this.__explicitlySet__.add("referenceTypes");
            return this;
        }
        /**
         * Indicates that the schema has been deprecated since version
         * <p>
         **Deprecated Since: 19.3.3**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
        private Integer idcsDeprecatedSinceVersion;

        /**
         * Indicates that the schema has been deprecated since version
         * <p>
         **Deprecated Since: 19.3.3**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsDeprecatedSinceVersion the value to set
         * @return this builder
         **/
        public Builder idcsDeprecatedSinceVersion(Integer idcsDeprecatedSinceVersion) {
            this.idcsDeprecatedSinceVersion = idcsDeprecatedSinceVersion;
            this.__explicitlySet__.add("idcsDeprecatedSinceVersion");
            return this;
        }
        /**
         * Indicates that the schema has been added since version
         * <p>
         **Deprecated Since: 19.3.3**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
        private Integer idcsAddedSinceVersion;

        /**
         * Indicates that the schema has been added since version
         * <p>
         **Deprecated Since: 19.3.3**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsAddedSinceVersion the value to set
         * @return this builder
         **/
        public Builder idcsAddedSinceVersion(Integer idcsAddedSinceVersion) {
            this.idcsAddedSinceVersion = idcsAddedSinceVersion;
            this.__explicitlySet__.add("idcsAddedSinceVersion");
            return this;
        }
        /**
         * Indicates that the schema has been deprecated since this release number
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
        private String idcsDeprecatedSinceReleaseNumber;

        /**
         * Indicates that the schema has been deprecated since this release number
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsDeprecatedSinceReleaseNumber the value to set
         * @return this builder
         **/
        public Builder idcsDeprecatedSinceReleaseNumber(String idcsDeprecatedSinceReleaseNumber) {
            this.idcsDeprecatedSinceReleaseNumber = idcsDeprecatedSinceReleaseNumber;
            this.__explicitlySet__.add("idcsDeprecatedSinceReleaseNumber");
            return this;
        }
        /**
         * Indicates that the schema has been added since this release number
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
        private String idcsAddedSinceReleaseNumber;

        /**
         * Indicates that the schema has been added since this release number
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsAddedSinceReleaseNumber the value to set
         * @return this builder
         **/
        public Builder idcsAddedSinceReleaseNumber(String idcsAddedSinceReleaseNumber) {
            this.idcsAddedSinceReleaseNumber = idcsAddedSinceReleaseNumber;
            this.__explicitlySet__.add("idcsAddedSinceReleaseNumber");
            return this;
        }
        /**
         * Specifies the minimum length of the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
        private Integer idcsMinLength;

        /**
         * Specifies the minimum length of the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsMinLength the value to set
         * @return this builder
         **/
        public Builder idcsMinLength(Integer idcsMinLength) {
            this.idcsMinLength = idcsMinLength;
            this.__explicitlySet__.add("idcsMinLength");
            return this;
        }
        /**
         * Specifies the maximum length of the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
        private Integer idcsMaxLength;

        /**
         * Specifies the maximum length of the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsMaxLength the value to set
         * @return this builder
         **/
        public Builder idcsMaxLength(Integer idcsMaxLength) {
            this.idcsMaxLength = idcsMaxLength;
            this.__explicitlySet__.add("idcsMaxLength");
            return this;
        }
        /**
         * Specifies the minimum value of the integer attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
        private Integer idcsMinValue;

        /**
         * Specifies the minimum value of the integer attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsMinValue the value to set
         * @return this builder
         **/
        public Builder idcsMinValue(Integer idcsMinValue) {
            this.idcsMinValue = idcsMinValue;
            this.__explicitlySet__.add("idcsMinValue");
            return this;
        }
        /**
         * Specifies the maximum value of the integer attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
        private Integer idcsMaxValue;

        /**
         * Specifies the maximum value of the integer attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsMaxValue the value to set
         * @return this builder
         **/
        public Builder idcsMaxValue(Integer idcsMaxValue) {
            this.idcsMaxValue = idcsMaxValue;
            this.__explicitlySet__.add("idcsMaxValue");
            return this;
        }
        /**
         * If true, specifies that the attribute can have multiple language values set for the attribute on which this is set.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMultiLanguage")
        private Boolean idcsMultiLanguage;

        /**
         * If true, specifies that the attribute can have multiple language values set for the attribute on which this is set.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsMultiLanguage the value to set
         * @return this builder
         **/
        public Builder idcsMultiLanguage(Boolean idcsMultiLanguage) {
            this.idcsMultiLanguage = idcsMultiLanguage;
            this.__explicitlySet__.add("idcsMultiLanguage");
            return this;
        }
        /**
         * Specifies the directly referenced Resources
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
        private java.util.List<String> idcsRefResourceAttributes;

        /**
         * Specifies the directly referenced Resources
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsRefResourceAttributes the value to set
         * @return this builder
         **/
        public Builder idcsRefResourceAttributes(java.util.List<String> idcsRefResourceAttributes) {
            this.idcsRefResourceAttributes = idcsRefResourceAttributes;
            this.__explicitlySet__.add("idcsRefResourceAttributes");
            return this;
        }
        /**
         * Specifies the indirectly referenced Resources
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
        private java.util.List<String> idcsIndirectRefResourceAttributes;

        /**
         * Specifies the indirectly referenced Resources
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsIndirectRefResourceAttributes the value to set
         * @return this builder
         **/
        public Builder idcsIndirectRefResourceAttributes(
                java.util.List<String> idcsIndirectRefResourceAttributes) {
            this.idcsIndirectRefResourceAttributes = idcsIndirectRefResourceAttributes;
            this.__explicitlySet__.add("idcsIndirectRefResourceAttributes");
            return this;
        }
        /**
         * Sequence tracking ID name for the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAutoIncrementSeqName")
        private String idcsAutoIncrementSeqName;

        /**
         * Sequence tracking ID name for the attribute
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsAutoIncrementSeqName the value to set
         * @return this builder
         **/
        public Builder idcsAutoIncrementSeqName(String idcsAutoIncrementSeqName) {
            this.idcsAutoIncrementSeqName = idcsAutoIncrementSeqName;
            this.__explicitlySet__.add("idcsAutoIncrementSeqName");
            return this;
        }
        /**
         * Specifies whether the value of the Resource attribute is persisted
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
        private Boolean idcsValuePersisted;

        /**
         * Specifies whether the value of the Resource attribute is persisted
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsValuePersisted the value to set
         * @return this builder
         **/
        public Builder idcsValuePersisted(Boolean idcsValuePersisted) {
            this.idcsValuePersisted = idcsValuePersisted;
            this.__explicitlySet__.add("idcsValuePersisted");
            return this;
        }
        /**
         * Flag to specify if the attribute should be encrypted or hashed
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
        private IdcsSensitive idcsSensitive;

        /**
         * Flag to specify if the attribute should be encrypted or hashed
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsSensitive the value to set
         * @return this builder
         **/
        public Builder idcsSensitive(IdcsSensitive idcsSensitive) {
            this.idcsSensitive = idcsSensitive;
            this.__explicitlySet__.add("idcsSensitive");
            return this;
        }
        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are not exposed via REST. This attribute overrides mutability for create/update if the request is internal and the attribute internalflag is set to True. This attribute overrides the return attribute while building SCIM response attributes when both the request is internal and the schema attribute is internal.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
        private Boolean idcsInternal;

        /**
         * Specifies whether the schema attribute is for internal use only. Internal attributes are not exposed via REST. This attribute overrides mutability for create/update if the request is internal and the attribute internalflag is set to True. This attribute overrides the return attribute while building SCIM response attributes when both the request is internal and the schema attribute is internal.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsInternal the value to set
         * @return this builder
         **/
        public Builder idcsInternal(Boolean idcsInternal) {
            this.idcsInternal = idcsInternal;
            this.__explicitlySet__.add("idcsInternal");
            return this;
        }
        /**
         * Trims any leading and trailing blanks from String values. Default is True.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
        private Boolean idcsTrimStringValue;

        /**
         * Trims any leading and trailing blanks from String values. Default is True.
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsTrimStringValue the value to set
         * @return this builder
         **/
        public Builder idcsTrimStringValue(Boolean idcsTrimStringValue) {
            this.idcsTrimStringValue = idcsTrimStringValue;
            this.__explicitlySet__.add("idcsTrimStringValue");
            return this;
        }
        /**
         * Specifies whether this attribute can be included in a search filter
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
        private Boolean idcsSearchable;

        /**
         * Specifies whether this attribute can be included in a search filter
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsSearchable the value to set
         * @return this builder
         **/
        public Builder idcsSearchable(Boolean idcsSearchable) {
            this.idcsSearchable = idcsSearchable;
            this.__explicitlySet__.add("idcsSearchable");
            return this;
        }
        /**
         * Specifies whether this attribute value was generated
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
        private Boolean idcsGenerated;

        /**
         * Specifies whether this attribute value was generated
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsGenerated the value to set
         * @return this builder
         **/
        public Builder idcsGenerated(Boolean idcsGenerated) {
            this.idcsGenerated = idcsGenerated;
            this.__explicitlySet__.add("idcsGenerated");
            return this;
        }
        /**
         * Specifies whether changes to this attribute value are audited
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
        private Boolean idcsAuditable;

        /**
         * Specifies whether changes to this attribute value are audited
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsAuditable the value to set
         * @return this builder
         **/
        public Builder idcsAuditable(Boolean idcsAuditable) {
            this.idcsAuditable = idcsAuditable;
            this.__explicitlySet__.add("idcsAuditable");
            return this;
        }
        /**
         * Target attribute name that this attribute gets mapped to for persistence
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
        private String idcsTargetAttributeName;

        /**
         * Target attribute name that this attribute gets mapped to for persistence
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsTargetAttributeName the value to set
         * @return this builder
         **/
        public Builder idcsTargetAttributeName(String idcsTargetAttributeName) {
            this.idcsTargetAttributeName = idcsTargetAttributeName;
            this.__explicitlySet__.add("idcsTargetAttributeName");
            return this;
        }
        /**
         * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
         * <p>
         **Added In:** 2209122038
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsMapsToSameTargetAttributeNameAs")
        private String idcsMapsToSameTargetAttributeNameAs;

        /**
         * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
         * <p>
         **Added In:** 2209122038
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param idcsMapsToSameTargetAttributeNameAs the value to set
         * @return this builder
         **/
        public Builder idcsMapsToSameTargetAttributeNameAs(
                String idcsMapsToSameTargetAttributeNameAs) {
            this.idcsMapsToSameTargetAttributeNameAs = idcsMapsToSameTargetAttributeNameAs;
            this.__explicitlySet__.add("idcsMapsToSameTargetAttributeNameAs");
            return this;
        }
        /**
         * Target normalized attribute name that this normalized value of attribute gets mapped to for persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetNormAttributeName")
        private String idcsTargetNormAttributeName;

        /**
         * Target normalized attribute name that this normalized value of attribute gets mapped to for persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsTargetNormAttributeName the value to set
         * @return this builder
         **/
        public Builder idcsTargetNormAttributeName(String idcsTargetNormAttributeName) {
            this.idcsTargetNormAttributeName = idcsTargetNormAttributeName;
            this.__explicitlySet__.add("idcsTargetNormAttributeName");
            return this;
        }
        /**
         * Old Target attribute name from child table for CSVA attribute prior to migration. This maintains this attribute used to get mapped to for persistence
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
        private String idcsTargetAttributeNameToMigrateFrom;

        /**
         * Old Target attribute name from child table for CSVA attribute prior to migration. This maintains this attribute used to get mapped to for persistence
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsTargetAttributeNameToMigrateFrom the value to set
         * @return this builder
         **/
        public Builder idcsTargetAttributeNameToMigrateFrom(
                String idcsTargetAttributeNameToMigrateFrom) {
            this.idcsTargetAttributeNameToMigrateFrom = idcsTargetAttributeNameToMigrateFrom;
            this.__explicitlySet__.add("idcsTargetAttributeNameToMigrateFrom");
            return this;
        }
        /**
         * Target index name created for this attribute for performance
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
        private String idcsTargetUniqueConstraintName;

        /**
         * Target index name created for this attribute for performance
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsTargetUniqueConstraintName the value to set
         * @return this builder
         **/
        public Builder idcsTargetUniqueConstraintName(String idcsTargetUniqueConstraintName) {
            this.idcsTargetUniqueConstraintName = idcsTargetUniqueConstraintName;
            this.__explicitlySet__.add("idcsTargetUniqueConstraintName");
            return this;
        }
        /**
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific semantics
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
        private String idcsToTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value to DataProvider-specific semantics
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsToTargetMapper the value to set
         * @return this builder
         **/
        public Builder idcsToTargetMapper(String idcsToTargetMapper) {
            this.idcsToTargetMapper = idcsToTargetMapper;
            this.__explicitlySet__.add("idcsToTargetMapper");
            return this;
        }
        /**
         * Specifies the mapper to use when mapping this attribute value from DataProvider-specific semantics
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
        private String idcsFromTargetMapper;

        /**
         * Specifies the mapper to use when mapping this attribute value from DataProvider-specific semantics
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsFromTargetMapper the value to set
         * @return this builder
         **/
        public Builder idcsFromTargetMapper(String idcsFromTargetMapper) {
            this.idcsFromTargetMapper = idcsFromTargetMapper;
            this.__explicitlySet__.add("idcsFromTargetMapper");
            return this;
        }
        /**
         * Specifies the user-friendly displayable attribute name or catalog key used for localization
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
        private String idcsDisplayName;

        /**
         * Specifies the user-friendly displayable attribute name or catalog key used for localization
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsDisplayName the value to set
         * @return this builder
         **/
        public Builder idcsDisplayName(String idcsDisplayName) {
            this.idcsDisplayName = idcsDisplayName;
            this.__explicitlySet__.add("idcsDisplayName");
            return this;
        }
        /**
         * Specifies the Resource type to read from for dynamic canonical values
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
        private String idcsCanonicalValueSourceResourceType;

        /**
         * Specifies the Resource type to read from for dynamic canonical values
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueSourceResourceType the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueSourceResourceType(
                String idcsCanonicalValueSourceResourceType) {
            this.idcsCanonicalValueSourceResourceType = idcsCanonicalValueSourceResourceType;
            this.__explicitlySet__.add("idcsCanonicalValueSourceResourceType");
            return this;
        }
        /**
         * Filter to use when getting canonical values for this schema attribute
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceFilter")
        private String idcsCanonicalValueSourceFilter;

        /**
         * Filter to use when getting canonical values for this schema attribute
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueSourceFilter the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueSourceFilter(String idcsCanonicalValueSourceFilter) {
            this.idcsCanonicalValueSourceFilter = idcsCanonicalValueSourceFilter;
            this.__explicitlySet__.add("idcsCanonicalValueSourceFilter");
            return this;
        }
        /**
         * Specifies the Resource type ID to read from for dynamic canonical values
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceTypeID")
        private String idcsCanonicalValueSourceResourceTypeID;

        /**
         * Specifies the Resource type ID to read from for dynamic canonical values
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueSourceResourceTypeID the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueSourceResourceTypeID(
                String idcsCanonicalValueSourceResourceTypeID) {
            this.idcsCanonicalValueSourceResourceTypeID = idcsCanonicalValueSourceResourceTypeID;
            this.__explicitlySet__.add("idcsCanonicalValueSourceResourceTypeID");
            return this;
        }
        /**
         * Display name for the canonical value attribute name.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceDisplayAttrName")
        private String idcsCanonicalValueSourceDisplayAttrName;

        /**
         * Display name for the canonical value attribute name.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueSourceDisplayAttrName the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueSourceDisplayAttrName(
                String idcsCanonicalValueSourceDisplayAttrName) {
            this.idcsCanonicalValueSourceDisplayAttrName = idcsCanonicalValueSourceDisplayAttrName;
            this.__explicitlySet__.add("idcsCanonicalValueSourceDisplayAttrName");
            return this;
        }
        /**
         * Source key attribute for the canonical value.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceKeyAttrName")
        private String idcsCanonicalValueSourceKeyAttrName;

        /**
         * Source key attribute for the canonical value.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueSourceKeyAttrName the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueSourceKeyAttrName(
                String idcsCanonicalValueSourceKeyAttrName) {
            this.idcsCanonicalValueSourceKeyAttrName = idcsCanonicalValueSourceKeyAttrName;
            this.__explicitlySet__.add("idcsCanonicalValueSourceKeyAttrName");
            return this;
        }
        /**
         * Type of the canonical value.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueType")
        private IdcsCanonicalValueType idcsCanonicalValueType;

        /**
         * Type of the canonical value.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCanonicalValueType the value to set
         * @return this builder
         **/
        public Builder idcsCanonicalValueType(IdcsCanonicalValueType idcsCanonicalValueType) {
            this.idcsCanonicalValueType = idcsCanonicalValueType;
            this.__explicitlySet__.add("idcsCanonicalValueType");
            return this;
        }
        /**
         * Validate payload reference value during create, replace, and update. Default is True.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValidateReference")
        private Boolean idcsValidateReference;

        /**
         * Validate payload reference value during create, replace, and update. Default is True.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsValidateReference the value to set
         * @return this builder
         **/
        public Builder idcsValidateReference(Boolean idcsValidateReference) {
            this.idcsValidateReference = idcsValidateReference;
            this.__explicitlySet__.add("idcsValidateReference");
            return this;
        }
        /**
         * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an instance of a CMVA
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsCompositeKey")
        private java.util.List<String> idcsCompositeKey;

        /**
         * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an instance of a CMVA
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsCompositeKey the value to set
         * @return this builder
         **/
        public Builder idcsCompositeKey(java.util.List<String> idcsCompositeKey) {
            this.idcsCompositeKey = idcsCompositeKey;
            this.__explicitlySet__.add("idcsCompositeKey");
            return this;
        }
        /**
         * **SCIM++ Properties:**
         * - caseExact: false
         * - multiValued: false
         * - mutability: readOnly
         * - required: false
         * - returned: default
         * - type: boolean
         * - uniqueness: none
         * Whether the CMVA attribute will be fetched or not for current resource in AbstractResourceManager update operation before calling data provider update. Default is true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFetchComplexAttributeValues")
        private Boolean idcsFetchComplexAttributeValues;

        /**
         * **SCIM++ Properties:**
         * - caseExact: false
         * - multiValued: false
         * - mutability: readOnly
         * - required: false
         * - returned: default
         * - type: boolean
         * - uniqueness: none
         * Whether the CMVA attribute will be fetched or not for current resource in AbstractResourceManager update operation before calling data provider update. Default is true.
         * @param idcsFetchComplexAttributeValues the value to set
         * @return this builder
         **/
        public Builder idcsFetchComplexAttributeValues(Boolean idcsFetchComplexAttributeValues) {
            this.idcsFetchComplexAttributeValues = idcsFetchComplexAttributeValues;
            this.__explicitlySet__.add("idcsFetchComplexAttributeValues");
            return this;
        }
        /**
         * Indicates if the attribute is scim compliant, default is true
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
        private Boolean idcsScimCompliant;

        /**
         * Indicates if the attribute is scim compliant, default is true
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsScimCompliant the value to set
         * @return this builder
         **/
        public Builder idcsScimCompliant(Boolean idcsScimCompliant) {
            this.idcsScimCompliant = idcsScimCompliant;
            this.__explicitlySet__.add("idcsScimCompliant");
            return this;
        }
        /**
         * Specifies if the attribute can be used for mapping with external identity sources such as AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then this flag is ignored
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
        private Boolean idcsAttributeMappable;

        /**
         * Specifies if the attribute can be used for mapping with external identity sources such as AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then this flag is ignored
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsAttributeMappable the value to set
         * @return this builder
         **/
        public Builder idcsAttributeMappable(Boolean idcsAttributeMappable) {
            this.idcsAttributeMappable = idcsAttributeMappable;
            this.__explicitlySet__.add("idcsAttributeMappable");
            return this;
        }
        /**
         * If true, ARM should not validate the value of the attribute since it will be converted/migrated to another attribute internally by the manager which will build valid post, put, or patch payload, depending on the client requested operation
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersistedInOtherAttribute")
        private Boolean idcsValuePersistedInOtherAttribute;

        /**
         * If true, ARM should not validate the value of the attribute since it will be converted/migrated to another attribute internally by the manager which will build valid post, put, or patch payload, depending on the client requested operation
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsValuePersistedInOtherAttribute the value to set
         * @return this builder
         **/
        public Builder idcsValuePersistedInOtherAttribute(
                Boolean idcsValuePersistedInOtherAttribute) {
            this.idcsValuePersistedInOtherAttribute = idcsValuePersistedInOtherAttribute;
            this.__explicitlySet__.add("idcsValuePersistedInOtherAttribute");
            return this;
        }
        /**
         * Specifies whether the attribute is PII (personal information). False by default for all attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's written to the Oracle Identity Cloud Service system logs.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPii")
        private Boolean idcsPii;

        /**
         * Specifies whether the attribute is PII (personal information). False by default for all attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's written to the Oracle Identity Cloud Service system logs.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsPii the value to set
         * @return this builder
         **/
        public Builder idcsPii(Boolean idcsPii) {
            this.idcsPii = idcsPii;
            this.__explicitlySet__.add("idcsPii");
            return this;
        }
        /**
         * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle task for upgrading OOTB resources.
         * <p>
         **Added In:** 2104150946
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: never
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsExcludeFromUpgradePatch")
        private Boolean idcsExcludeFromUpgradePatch;

        /**
         * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle task for upgrading OOTB resources.
         * <p>
         **Added In:** 2104150946
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: never
         *  - type: boolean
         * @param idcsExcludeFromUpgradePatch the value to set
         * @return this builder
         **/
        public Builder idcsExcludeFromUpgradePatch(Boolean idcsExcludeFromUpgradePatch) {
            this.idcsExcludeFromUpgradePatch = idcsExcludeFromUpgradePatch;
            this.__explicitlySet__.add("idcsExcludeFromUpgradePatch");
            return this;
        }
        /**
         * A list specifying the contained attributes
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subAttributes")
        private java.util.List<SchemaSubAttributes> subAttributes;

        /**
         * A list specifying the contained attributes
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param subAttributes the value to set
         * @return this builder
         **/
        public Builder subAttributes(java.util.List<SchemaSubAttributes> subAttributes) {
            this.subAttributes = subAttributes;
            this.__explicitlySet__.add("subAttributes");
            return this;
        }
        /**
         * Specifies the referenced Resource attribute
         * <p>
         **Deprecated Since: 17.3.4**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttribute")
        private String idcsRefResourceAttribute;

        /**
         * Specifies the referenced Resource attribute
         * <p>
         **Deprecated Since: 17.3.4**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsRefResourceAttribute the value to set
         * @return this builder
         **/
        public Builder idcsRefResourceAttribute(String idcsRefResourceAttribute) {
            this.idcsRefResourceAttribute = idcsRefResourceAttribute;
            this.__explicitlySet__.add("idcsRefResourceAttribute");
            return this;
        }
        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
        private Boolean idcsAttributeCacheable;

        /**
         * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
         * <p>
         **Added In:** 17.3.4
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsAttributeCacheable the value to set
         * @return this builder
         **/
        public Builder idcsAttributeCacheable(Boolean idcsAttributeCacheable) {
            this.idcsAttributeCacheable = idcsAttributeCacheable;
            this.__explicitlySet__.add("idcsAttributeCacheable");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiOrder")
        private Integer idcsuiOrder;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         * @param idcsuiOrder the value to set
         * @return this builder
         **/
        public Builder idcsuiOrder(Integer idcsuiOrder) {
            this.idcsuiOrder = idcsuiOrder;
            this.__explicitlySet__.add("idcsuiOrder");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using regular expressions.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiRegexp")
        private String idcsuiRegexp;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using regular expressions.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsuiRegexp the value to set
         * @return this builder
         **/
        public Builder idcsuiRegexp(String idcsuiRegexp) {
            this.idcsuiRegexp = idcsuiRegexp;
            this.__explicitlySet__.add("idcsuiRegexp");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be displayed on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiVisible")
        private Boolean idcsuiVisible;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be displayed on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsuiVisible the value to set
         * @return this builder
         **/
        public Builder idcsuiVisible(Boolean idcsuiVisible) {
            this.idcsuiVisible = idcsuiVisible;
            this.__explicitlySet__.add("idcsuiVisible");
            return this;
        }
        /**
         * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsuiWidget")
        private IdcsuiWidget idcsuiWidget;

        /**
         * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on the Account Form.
         * <p>
         **Added In:** 17.4.2
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsuiWidget the value to set
         * @return this builder
         **/
        public Builder idcsuiWidget(IdcsuiWidget idcsuiWidget) {
            this.idcsuiWidget = idcsuiWidget;
            this.__explicitlySet__.add("idcsuiWidget");
            return this;
        }
        /**
         * The list of features that require this attribute
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsFeatures")
        private java.util.List<IdcsFeatures> idcsFeatures;

        /**
         * The list of features that require this attribute
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         * @param idcsFeatures the value to set
         * @return this builder
         **/
        public Builder idcsFeatures(java.util.List<IdcsFeatures> idcsFeatures) {
            this.idcsFeatures = idcsFeatures;
            this.__explicitlySet__.add("idcsFeatures");
            return this;
        }
        /**
         * A subset of \\"canonicalValues\\" that are not supported when the \\"optionalPii\\" feature is disabled in GlobalConfig.
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOptionalPiiCanonicalValues")
        private java.util.List<String> idcsOptionalPiiCanonicalValues;

        /**
         * A subset of \\"canonicalValues\\" that are not supported when the \\"optionalPii\\" feature is disabled in GlobalConfig.
         * <p>
         **Deprecated Since: 19.1.6**
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param idcsOptionalPiiCanonicalValues the value to set
         * @return this builder
         **/
        public Builder idcsOptionalPiiCanonicalValues(
                java.util.List<String> idcsOptionalPiiCanonicalValues) {
            this.idcsOptionalPiiCanonicalValues = idcsOptionalPiiCanonicalValues;
            this.__explicitlySet__.add("idcsOptionalPiiCanonicalValues");
            return this;
        }
        /**
         * Specifies if the value of the attribute should be sanitized using OWASP library for HTML content
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsSanitize")
        private Boolean idcsSanitize;

        /**
         * Specifies if the value of the attribute should be sanitized using OWASP library for HTML content
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsSanitize the value to set
         * @return this builder
         **/
        public Builder idcsSanitize(Boolean idcsSanitize) {
            this.idcsSanitize = idcsSanitize;
            this.__explicitlySet__.add("idcsSanitize");
            return this;
        }
        /**
         * Specifies whether the attribute from resource schema should override from common schema with the same name.
         * <p>
         **Added In:** 2102181953
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOverrideCommonAttribute")
        private Boolean idcsOverrideCommonAttribute;

        /**
         * Specifies whether the attribute from resource schema should override from common schema with the same name.
         * <p>
         **Added In:** 2102181953
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: boolean
         * @param idcsOverrideCommonAttribute the value to set
         * @return this builder
         **/
        public Builder idcsOverrideCommonAttribute(Boolean idcsOverrideCommonAttribute) {
            this.idcsOverrideCommonAttribute = idcsOverrideCommonAttribute;
            this.__explicitlySet__.add("idcsOverrideCommonAttribute");
            return this;
        }
        /**
         * Specifies whether the readOnly and immutable reference attributes should be ignored when forceDelete=true.
         * <p>
         **Added In:** 2104220644
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete")
        private Boolean idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete;

        /**
         * Specifies whether the readOnly and immutable reference attributes should be ignored when forceDelete=true.
         * <p>
         **Added In:** 2104220644
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete the value to set
         * @return this builder
         **/
        public Builder idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete(
                Boolean idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete) {
            this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete =
                    idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete;
            this.__explicitlySet__.add("idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete");
            return this;
        }
        /**
         * Set this attribute to True if the resource is eligibal for update while system is in readonly mode.
         * <p>
         **Added In:** 2106170416
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAllowUpdatesInReadOnlyMode")
        private Boolean idcsAllowUpdatesInReadOnlyMode;

        /**
         * Set this attribute to True if the resource is eligibal for update while system is in readonly mode.
         * <p>
         **Added In:** 2106170416
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsAllowUpdatesInReadOnlyMode the value to set
         * @return this builder
         **/
        public Builder idcsAllowUpdatesInReadOnlyMode(Boolean idcsAllowUpdatesInReadOnlyMode) {
            this.idcsAllowUpdatesInReadOnlyMode = idcsAllowUpdatesInReadOnlyMode;
            this.__explicitlySet__.add("idcsAllowUpdatesInReadOnlyMode");
            return this;
        }
        /**
         * Set this attribute to True if the pagination is required on an attribute.
         * <p>
         **Added In:** 2202230830
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsPaginateResponse")
        private Boolean idcsPaginateResponse;

        /**
         * Set this attribute to True if the pagination is required on an attribute.
         * <p>
         **Added In:** 2202230830
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsPaginateResponse the value to set
         * @return this builder
         **/
        public Builder idcsPaginateResponse(Boolean idcsPaginateResponse) {
            this.idcsPaginateResponse = idcsPaginateResponse;
            this.__explicitlySet__.add("idcsPaginateResponse");
            return this;
        }
        /**
         * If true, indicates that the attribute value must be written to the home region for access flows initiated from a replica region.
         * <p>
         **Added In:** 2209220956
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsRequiresWriteForAccessFlows")
        private Boolean idcsRequiresWriteForAccessFlows;

        /**
         * If true, indicates that the attribute value must be written to the home region for access flows initiated from a replica region.
         * <p>
         **Added In:** 2209220956
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param idcsRequiresWriteForAccessFlows the value to set
         * @return this builder
         **/
        public Builder idcsRequiresWriteForAccessFlows(Boolean idcsRequiresWriteForAccessFlows) {
            this.idcsRequiresWriteForAccessFlows = idcsRequiresWriteForAccessFlows;
            this.__explicitlySet__.add("idcsRequiresWriteForAccessFlows");
            return this;
        }
        /**
         * If true, indicates that the attribute value must be written to the home region and requires immediate read-after-write consistency for access flows initiated from a replica region.
         * <p>
         **Added In:** 2209220956
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: never
         *  - type: boolean
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "idcsRequiresImmediateReadAfterWriteForAccessFlows")
        private Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows;

        /**
         * If true, indicates that the attribute value must be written to the home region and requires immediate read-after-write consistency for access flows initiated from a replica region.
         * <p>
         **Added In:** 2209220956
         * <p>
         **SCIM++ Properties:**
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: never
         *  - type: boolean
         * @param idcsRequiresImmediateReadAfterWriteForAccessFlows the value to set
         * @return this builder
         **/
        public Builder idcsRequiresImmediateReadAfterWriteForAccessFlows(
                Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows) {
            this.idcsRequiresImmediateReadAfterWriteForAccessFlows =
                    idcsRequiresImmediateReadAfterWriteForAccessFlows;
            this.__explicitlySet__.add("idcsRequiresImmediateReadAfterWriteForAccessFlows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaAttributes build() {
            SchemaAttributes model =
                    new SchemaAttributes(
                            this.name,
                            this.idcsDisplayNameMessageId,
                            this.idcsRtsaHideAttribute,
                            this.localizedDisplayName,
                            this.type,
                            this.multiValued,
                            this.description,
                            this.required,
                            this.idcsReturnEmptyWhenNull,
                            this.canonicalValues,
                            this.idcsDefaultValue,
                            this.localizedCanonicalValues,
                            this.caseExact,
                            this.mutability,
                            this.returned,
                            this.uniqueness,
                            this.idcsCsvAttributeName,
                            this.idcsComplexAttributeNameMappings,
                            this.idcsICFBundleAttributeName,
                            this.idcsICFRequired,
                            this.idcsICFAttributeType,
                            this.idcsCsvAttributeNameMappings,
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
                            this.idcsMapsToSameTargetAttributeNameAs,
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
                            this.idcsCanonicalValueType,
                            this.idcsValidateReference,
                            this.idcsCompositeKey,
                            this.idcsFetchComplexAttributeValues,
                            this.idcsScimCompliant,
                            this.idcsAttributeMappable,
                            this.idcsValuePersistedInOtherAttribute,
                            this.idcsPii,
                            this.idcsExcludeFromUpgradePatch,
                            this.subAttributes,
                            this.idcsRefResourceAttribute,
                            this.idcsAttributeCacheable,
                            this.idcsuiOrder,
                            this.idcsuiRegexp,
                            this.idcsuiVisible,
                            this.idcsuiWidget,
                            this.idcsFeatures,
                            this.idcsOptionalPiiCanonicalValues,
                            this.idcsSanitize,
                            this.idcsOverrideCommonAttribute,
                            this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete,
                            this.idcsAllowUpdatesInReadOnlyMode,
                            this.idcsPaginateResponse,
                            this.idcsRequiresWriteForAccessFlows,
                            this.idcsRequiresImmediateReadAfterWriteForAccessFlows);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaAttributes model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("idcsDisplayNameMessageId")) {
                this.idcsDisplayNameMessageId(model.getIdcsDisplayNameMessageId());
            }
            if (model.wasPropertyExplicitlySet("idcsRtsaHideAttribute")) {
                this.idcsRtsaHideAttribute(model.getIdcsRtsaHideAttribute());
            }
            if (model.wasPropertyExplicitlySet("localizedDisplayName")) {
                this.localizedDisplayName(model.getLocalizedDisplayName());
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
            if (model.wasPropertyExplicitlySet("localizedCanonicalValues")) {
                this.localizedCanonicalValues(model.getLocalizedCanonicalValues());
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
            if (model.wasPropertyExplicitlySet("uniqueness")) {
                this.uniqueness(model.getUniqueness());
            }
            if (model.wasPropertyExplicitlySet("idcsCsvAttributeName")) {
                this.idcsCsvAttributeName(model.getIdcsCsvAttributeName());
            }
            if (model.wasPropertyExplicitlySet("idcsComplexAttributeNameMappings")) {
                this.idcsComplexAttributeNameMappings(model.getIdcsComplexAttributeNameMappings());
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
            if (model.wasPropertyExplicitlySet("idcsCsvAttributeNameMappings")) {
                this.idcsCsvAttributeNameMappings(model.getIdcsCsvAttributeNameMappings());
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
            if (model.wasPropertyExplicitlySet("idcsMapsToSameTargetAttributeNameAs")) {
                this.idcsMapsToSameTargetAttributeNameAs(
                        model.getIdcsMapsToSameTargetAttributeNameAs());
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
            if (model.wasPropertyExplicitlySet("idcsCanonicalValueType")) {
                this.idcsCanonicalValueType(model.getIdcsCanonicalValueType());
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
            if (model.wasPropertyExplicitlySet("idcsValuePersistedInOtherAttribute")) {
                this.idcsValuePersistedInOtherAttribute(
                        model.getIdcsValuePersistedInOtherAttribute());
            }
            if (model.wasPropertyExplicitlySet("idcsPii")) {
                this.idcsPii(model.getIdcsPii());
            }
            if (model.wasPropertyExplicitlySet("idcsExcludeFromUpgradePatch")) {
                this.idcsExcludeFromUpgradePatch(model.getIdcsExcludeFromUpgradePatch());
            }
            if (model.wasPropertyExplicitlySet("subAttributes")) {
                this.subAttributes(model.getSubAttributes());
            }
            if (model.wasPropertyExplicitlySet("idcsRefResourceAttribute")) {
                this.idcsRefResourceAttribute(model.getIdcsRefResourceAttribute());
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
            if (model.wasPropertyExplicitlySet("idcsFeatures")) {
                this.idcsFeatures(model.getIdcsFeatures());
            }
            if (model.wasPropertyExplicitlySet("idcsOptionalPiiCanonicalValues")) {
                this.idcsOptionalPiiCanonicalValues(model.getIdcsOptionalPiiCanonicalValues());
            }
            if (model.wasPropertyExplicitlySet("idcsSanitize")) {
                this.idcsSanitize(model.getIdcsSanitize());
            }
            if (model.wasPropertyExplicitlySet("idcsOverrideCommonAttribute")) {
                this.idcsOverrideCommonAttribute(model.getIdcsOverrideCommonAttribute());
            }
            if (model.wasPropertyExplicitlySet(
                    "idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete")) {
                this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete(
                        model.getIdcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete());
            }
            if (model.wasPropertyExplicitlySet("idcsAllowUpdatesInReadOnlyMode")) {
                this.idcsAllowUpdatesInReadOnlyMode(model.getIdcsAllowUpdatesInReadOnlyMode());
            }
            if (model.wasPropertyExplicitlySet("idcsPaginateResponse")) {
                this.idcsPaginateResponse(model.getIdcsPaginateResponse());
            }
            if (model.wasPropertyExplicitlySet("idcsRequiresWriteForAccessFlows")) {
                this.idcsRequiresWriteForAccessFlows(model.getIdcsRequiresWriteForAccessFlows());
            }
            if (model.wasPropertyExplicitlySet(
                    "idcsRequiresImmediateReadAfterWriteForAccessFlows")) {
                this.idcsRequiresImmediateReadAfterWriteForAccessFlows(
                        model.getIdcsRequiresImmediateReadAfterWriteForAccessFlows());
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
     * Attribute's name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Attribute's name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Localized schema attribute display name for use by UI client  for displaying attribute labels
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayNameMessageId")
    private final String idcsDisplayNameMessageId;

    /**
     * Localized schema attribute display name for use by UI client  for displaying attribute labels
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsDisplayNameMessageId() {
        return idcsDisplayNameMessageId;
    }

    /**
     * Specifies if the attributes in this schema should be hidden externally
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRtsaHideAttribute")
    private final Boolean idcsRtsaHideAttribute;

    /**
     * Specifies if the attributes in this schema should be hidden externally
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsRtsaHideAttribute() {
        return idcsRtsaHideAttribute;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("localizedDisplayName")
    private final SchemaLocalizedDisplayName localizedDisplayName;

    public SchemaLocalizedDisplayName getLocalizedDisplayName() {
        return localizedDisplayName;
    }

    /**
     * The attribute's data type--for example, String
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Type {
        String("string"),
        Complex("complex"),
        Boolean("boolean"),
        Decimal("decimal"),
        Integer("integer"),
        DateTime("dateTime"),
        Reference("reference"),
        Binary("binary"),

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
     * The attribute's data type--for example, String
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The attribute's data type--for example, String
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Indicates the attribute's plurality
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiValued")
    private final Boolean multiValued;

    /**
     * Indicates the attribute's plurality
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getMultiValued() {
        return multiValued;
    }

    /**
     * The attribute's human-readable description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The attribute's human-readable description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Specifies if the attribute is required
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Specifies if the attribute is required
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getRequired() {
        return required;
    }

    /**
     * Specifies if the attribute is required
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsReturnEmptyWhenNull")
    private final Boolean idcsReturnEmptyWhenNull;

    /**
     * Specifies if the attribute is required
     * <p>
     **Added In:** 2305190132
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsReturnEmptyWhenNull() {
        return idcsReturnEmptyWhenNull;
    }

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canonicalValues")
    private final java.util.List<String> canonicalValues;

    /**
     * A collection of canonical values. Applicable Service Providers MUST specify the canonical types specified in the core schema specification--for example, \\"work\\", \\"home\\".
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getCanonicalValues() {
        return canonicalValues;
    }

    /**
     * Specifies the default value for an attribute. The value must be one from canonicalValues if defined.
     * <p>
     **Added In:** 18.1.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDefaultValue")
    private final String idcsDefaultValue;

    /**
     * Specifies the default value for an attribute. The value must be one from canonicalValues if defined.
     * <p>
     **Added In:** 18.1.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsDefaultValue() {
        return idcsDefaultValue;
    }

    /**
     * A collection of Localized canonical values.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localizedCanonicalValues")
    private final java.util.List<SchemaLocalizedCanonicalValues> localizedCanonicalValues;

    /**
     * A collection of Localized canonical values.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SchemaLocalizedCanonicalValues> getLocalizedCanonicalValues() {
        return localizedCanonicalValues;
    }

    /**
     * Specifies if the String attribute is case-sensitive
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caseExact")
    private final Boolean caseExact;

    /**
     * Specifies if the String attribute is case-sensitive
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getCaseExact() {
        return caseExact;
    }

    /**
     * Specifies if the attribute is mutable
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Mutability {
        ReadOnly("readOnly"),
        ReadWrite("readWrite"),
        Immutable("immutable"),
        WriteOnly("writeOnly"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mutability")
    private final Mutability mutability;

    /**
     * Specifies if the attribute is mutable
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Mutability getMutability() {
        return mutability;
    }

    /**
     * A single keyword that indicates when an attribute and associated values are returned in response to a GET request or in response to a PUT, POST, or PATCH request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Returned {
        Always("always"),
        Never("never"),
        Default("default"),
        Request("request"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * A single keyword that indicates when an attribute and associated values are returned in response to a GET request or in response to a PUT, POST, or PATCH request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returned")
    private final Returned returned;

    /**
     * A single keyword that indicates when an attribute and associated values are returned in response to a GET request or in response to a PUT, POST, or PATCH request
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Returned getReturned() {
        return returned;
    }

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of attribute values. A server MAY reject an invalid value based on uniqueness by returning an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side to a greater degree than the Service Provider enforces. For example, a client could make a value unique while the server has the uniqueness of \\"none\\".
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Uniqueness {
        None("none"),
        Server("server"),
        Global("global"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * A single keyword value that specifies how the Service Provider enforces uniqueness of attribute values. A server MAY reject an invalid value based on uniqueness by returning an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side to a greater degree than the Service Provider enforces. For example, a client could make a value unique while the server has the uniqueness of \\"none\\".
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueness")
    private final Uniqueness uniqueness;

    /**
     * A single keyword value that specifies how the Service Provider enforces uniqueness of attribute values. A server MAY reject an invalid value based on uniqueness by returning an HTTP response code of 400 (Bad Request). A client MAY enforce uniqueness on the client side to a greater degree than the Service Provider enforces. For example, a client could make a value unique while the server has the uniqueness of \\"none\\".
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Uniqueness getUniqueness() {
        return uniqueness;
    }

    /**
     * The attribute defining the CSV header name for import/export
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeName")
    private final String idcsCsvAttributeName;

    /**
     * The attribute defining the CSV header name for import/export
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCsvAttributeName() {
        return idcsCsvAttributeName;
    }

    /**
     * Specifies the mapping between external identity source attributes and Oracle Identity Cloud Service complex attributes (e.g. email => emails[work].value)
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsComplexAttributeNameMappings")
    private final java.util.List<SchemaIdcsComplexAttributeNameMappings>
            idcsComplexAttributeNameMappings;

    /**
     * Specifies the mapping between external identity source attributes and Oracle Identity Cloud Service complex attributes (e.g. email => emails[work].value)
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SchemaIdcsComplexAttributeNameMappings>
            getIdcsComplexAttributeNameMappings() {
        return idcsComplexAttributeNameMappings;
    }

    /**
     * Maps to ICF target attribute name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFBundleAttributeName")
    private final String idcsICFBundleAttributeName;

    /**
     * Maps to ICF target attribute name
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsICFBundleAttributeName() {
        return idcsICFBundleAttributeName;
    }

    /**
     * Metadata to identify the ICF required attribute
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFRequired")
    private final Boolean idcsICFRequired;

    /**
     * Metadata to identify the ICF required attribute
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsICFRequired() {
        return idcsICFRequired;
    }

    /**
     * Maps to ICF data type
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum IdcsICFAttributeType {
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
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsICFAttributeType")
    private final IdcsICFAttributeType idcsICFAttributeType;

    /**
     * Maps to ICF data type
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public IdcsICFAttributeType getIdcsICFAttributeType() {
        return idcsICFAttributeType;
    }

    /**
     * Csv meta data for those resource type attributes which can be imported / exported from / to csv.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCsvAttributeNameMappings")
    private final java.util.List<SchemaIdcsCsvAttributeNameMappings> idcsCsvAttributeNameMappings;

    /**
     * Csv meta data for those resource type attributes which can be imported / exported from / to csv.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SchemaIdcsCsvAttributeNameMappings> getIdcsCsvAttributeNameMappings() {
        return idcsCsvAttributeNameMappings;
    }

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only applicable for attributes that are of the \\"reference\\" data type.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referenceTypes")
    private final java.util.List<String> referenceTypes;

    /**
     * The names of the Resource types that may be referenced--for example, User. This is only applicable for attributes that are of the \\"reference\\" data type.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getReferenceTypes() {
        return referenceTypes;
    }

    /**
     * Indicates that the schema has been deprecated since version
     * <p>
     **Deprecated Since: 19.3.3**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceVersion")
    private final Integer idcsDeprecatedSinceVersion;

    /**
     * Indicates that the schema has been deprecated since version
     * <p>
     **Deprecated Since: 19.3.3**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsDeprecatedSinceVersion() {
        return idcsDeprecatedSinceVersion;
    }

    /**
     * Indicates that the schema has been added since version
     * <p>
     **Deprecated Since: 19.3.3**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceVersion")
    private final Integer idcsAddedSinceVersion;

    /**
     * Indicates that the schema has been added since version
     * <p>
     **Deprecated Since: 19.3.3**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsAddedSinceVersion() {
        return idcsAddedSinceVersion;
    }

    /**
     * Indicates that the schema has been deprecated since this release number
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDeprecatedSinceReleaseNumber")
    private final String idcsDeprecatedSinceReleaseNumber;

    /**
     * Indicates that the schema has been deprecated since this release number
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getIdcsDeprecatedSinceReleaseNumber() {
        return idcsDeprecatedSinceReleaseNumber;
    }

    /**
     * Indicates that the schema has been added since this release number
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAddedSinceReleaseNumber")
    private final String idcsAddedSinceReleaseNumber;

    /**
     * Indicates that the schema has been added since this release number
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getIdcsAddedSinceReleaseNumber() {
        return idcsAddedSinceReleaseNumber;
    }

    /**
     * Specifies the minimum length of the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinLength")
    private final Integer idcsMinLength;

    /**
     * Specifies the minimum length of the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsMinLength() {
        return idcsMinLength;
    }

    /**
     * Specifies the maximum length of the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxLength")
    private final Integer idcsMaxLength;

    /**
     * Specifies the maximum length of the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsMaxLength() {
        return idcsMaxLength;
    }

    /**
     * Specifies the minimum value of the integer attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMinValue")
    private final Integer idcsMinValue;

    /**
     * Specifies the minimum value of the integer attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsMinValue() {
        return idcsMinValue;
    }

    /**
     * Specifies the maximum value of the integer attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMaxValue")
    private final Integer idcsMaxValue;

    /**
     * Specifies the maximum value of the integer attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsMaxValue() {
        return idcsMaxValue;
    }

    /**
     * If true, specifies that the attribute can have multiple language values set for the attribute on which this is set.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMultiLanguage")
    private final Boolean idcsMultiLanguage;

    /**
     * If true, specifies that the attribute can have multiple language values set for the attribute on which this is set.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsMultiLanguage() {
        return idcsMultiLanguage;
    }

    /**
     * Specifies the directly referenced Resources
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttributes")
    private final java.util.List<String> idcsRefResourceAttributes;

    /**
     * Specifies the directly referenced Resources
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public java.util.List<String> getIdcsRefResourceAttributes() {
        return idcsRefResourceAttributes;
    }

    /**
     * Specifies the indirectly referenced Resources
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsIndirectRefResourceAttributes")
    private final java.util.List<String> idcsIndirectRefResourceAttributes;

    /**
     * Specifies the indirectly referenced Resources
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public java.util.List<String> getIdcsIndirectRefResourceAttributes() {
        return idcsIndirectRefResourceAttributes;
    }

    /**
     * Sequence tracking ID name for the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAutoIncrementSeqName")
    private final String idcsAutoIncrementSeqName;

    /**
     * Sequence tracking ID name for the attribute
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getIdcsAutoIncrementSeqName() {
        return idcsAutoIncrementSeqName;
    }

    /**
     * Specifies whether the value of the Resource attribute is persisted
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersisted")
    private final Boolean idcsValuePersisted;

    /**
     * Specifies whether the value of the Resource attribute is persisted
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsValuePersisted() {
        return idcsValuePersisted;
    }

    /**
     * Flag to specify if the attribute should be encrypted or hashed
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum IdcsSensitive {
        Encrypt("encrypt"),
        Hash("hash"),
        HashSc("hash_sc"),
        Checksum("checksum"),
        None("none"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSensitive")
    private final IdcsSensitive idcsSensitive;

    /**
     * Flag to specify if the attribute should be encrypted or hashed
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public IdcsSensitive getIdcsSensitive() {
        return idcsSensitive;
    }

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not exposed via REST. This attribute overrides mutability for create/update if the request is internal and the attribute internalflag is set to True. This attribute overrides the return attribute while building SCIM response attributes when both the request is internal and the schema attribute is internal.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsInternal")
    private final Boolean idcsInternal;

    /**
     * Specifies whether the schema attribute is for internal use only. Internal attributes are not exposed via REST. This attribute overrides mutability for create/update if the request is internal and the attribute internalflag is set to True. This attribute overrides the return attribute while building SCIM response attributes when both the request is internal and the schema attribute is internal.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsInternal() {
        return idcsInternal;
    }

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTrimStringValue")
    private final Boolean idcsTrimStringValue;

    /**
     * Trims any leading and trailing blanks from String values. Default is True.
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsTrimStringValue() {
        return idcsTrimStringValue;
    }

    /**
     * Specifies whether this attribute can be included in a search filter
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSearchable")
    private final Boolean idcsSearchable;

    /**
     * Specifies whether this attribute can be included in a search filter
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsSearchable() {
        return idcsSearchable;
    }

    /**
     * Specifies whether this attribute value was generated
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsGenerated")
    private final Boolean idcsGenerated;

    /**
     * Specifies whether this attribute value was generated
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsGenerated() {
        return idcsGenerated;
    }

    /**
     * Specifies whether changes to this attribute value are audited
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAuditable")
    private final Boolean idcsAuditable;

    /**
     * Specifies whether changes to this attribute value are audited
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsAuditable() {
        return idcsAuditable;
    }

    /**
     * Target attribute name that this attribute gets mapped to for persistence
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeName")
    private final String idcsTargetAttributeName;

    /**
     * Target attribute name that this attribute gets mapped to for persistence
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsTargetAttributeName() {
        return idcsTargetAttributeName;
    }

    /**
     * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
     * <p>
     **Added In:** 2209122038
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsMapsToSameTargetAttributeNameAs")
    private final String idcsMapsToSameTargetAttributeNameAs;

    /**
     * Contains the canonical name of the other attribute sharing the same idcsTargetAttributeName
     * <p>
     **Added In:** 2209122038
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsMapsToSameTargetAttributeNameAs() {
        return idcsMapsToSameTargetAttributeNameAs;
    }

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetNormAttributeName")
    private final String idcsTargetNormAttributeName;

    /**
     * Target normalized attribute name that this normalized value of attribute gets mapped to for persistence. Only set for caseExact=false & searchable attributes. Do not use by default.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsTargetNormAttributeName() {
        return idcsTargetNormAttributeName;
    }

    /**
     * Old Target attribute name from child table for CSVA attribute prior to migration. This maintains this attribute used to get mapped to for persistence
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetAttributeNameToMigrateFrom")
    private final String idcsTargetAttributeNameToMigrateFrom;

    /**
     * Old Target attribute name from child table for CSVA attribute prior to migration. This maintains this attribute used to get mapped to for persistence
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsTargetAttributeNameToMigrateFrom() {
        return idcsTargetAttributeNameToMigrateFrom;
    }

    /**
     * Target index name created for this attribute for performance
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTargetUniqueConstraintName")
    private final String idcsTargetUniqueConstraintName;

    /**
     * Target index name created for this attribute for performance
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsTargetUniqueConstraintName() {
        return idcsTargetUniqueConstraintName;
    }

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific semantics
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsToTargetMapper")
    private final String idcsToTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value to DataProvider-specific semantics
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsToTargetMapper() {
        return idcsToTargetMapper;
    }

    /**
     * Specifies the mapper to use when mapping this attribute value from DataProvider-specific semantics
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFromTargetMapper")
    private final String idcsFromTargetMapper;

    /**
     * Specifies the mapper to use when mapping this attribute value from DataProvider-specific semantics
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsFromTargetMapper() {
        return idcsFromTargetMapper;
    }

    /**
     * Specifies the user-friendly displayable attribute name or catalog key used for localization
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDisplayName")
    private final String idcsDisplayName;

    /**
     * Specifies the user-friendly displayable attribute name or catalog key used for localization
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsDisplayName() {
        return idcsDisplayName;
    }

    /**
     * Specifies the Resource type to read from for dynamic canonical values
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceType")
    private final String idcsCanonicalValueSourceResourceType;

    /**
     * Specifies the Resource type to read from for dynamic canonical values
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCanonicalValueSourceResourceType() {
        return idcsCanonicalValueSourceResourceType;
    }

    /**
     * Filter to use when getting canonical values for this schema attribute
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceFilter")
    private final String idcsCanonicalValueSourceFilter;

    /**
     * Filter to use when getting canonical values for this schema attribute
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCanonicalValueSourceFilter() {
        return idcsCanonicalValueSourceFilter;
    }

    /**
     * Specifies the Resource type ID to read from for dynamic canonical values
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceResourceTypeID")
    private final String idcsCanonicalValueSourceResourceTypeID;

    /**
     * Specifies the Resource type ID to read from for dynamic canonical values
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCanonicalValueSourceResourceTypeID() {
        return idcsCanonicalValueSourceResourceTypeID;
    }

    /**
     * Display name for the canonical value attribute name.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceDisplayAttrName")
    private final String idcsCanonicalValueSourceDisplayAttrName;

    /**
     * Display name for the canonical value attribute name.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCanonicalValueSourceDisplayAttrName() {
        return idcsCanonicalValueSourceDisplayAttrName;
    }

    /**
     * Source key attribute for the canonical value.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueSourceKeyAttrName")
    private final String idcsCanonicalValueSourceKeyAttrName;

    /**
     * Source key attribute for the canonical value.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getIdcsCanonicalValueSourceKeyAttrName() {
        return idcsCanonicalValueSourceKeyAttrName;
    }

    /**
     * Type of the canonical value.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum IdcsCanonicalValueType {
        Dynamic("dynamic"),
        Static("static"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdcsCanonicalValueType.class);

        private final String value;
        private static java.util.Map<String, IdcsCanonicalValueType> map;

        static {
            map = new java.util.HashMap<>();
            for (IdcsCanonicalValueType v : IdcsCanonicalValueType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdcsCanonicalValueType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdcsCanonicalValueType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdcsCanonicalValueType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the canonical value.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCanonicalValueType")
    private final IdcsCanonicalValueType idcsCanonicalValueType;

    /**
     * Type of the canonical value.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public IdcsCanonicalValueType getIdcsCanonicalValueType() {
        return idcsCanonicalValueType;
    }

    /**
     * Validate payload reference value during create, replace, and update. Default is True.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValidateReference")
    private final Boolean idcsValidateReference;

    /**
     * Validate payload reference value during create, replace, and update. Default is True.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsValidateReference() {
        return idcsValidateReference;
    }

    /**
     * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an instance of a CMVA
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsCompositeKey")
    private final java.util.List<String> idcsCompositeKey;

    /**
     * The set of one or more sub attributes' names of a CMVA, whose values uniquely identify an instance of a CMVA
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getIdcsCompositeKey() {
        return idcsCompositeKey;
    }

    /**
     * **SCIM++ Properties:**
     * - caseExact: false
     * - multiValued: false
     * - mutability: readOnly
     * - required: false
     * - returned: default
     * - type: boolean
     * - uniqueness: none
     * Whether the CMVA attribute will be fetched or not for current resource in AbstractResourceManager update operation before calling data provider update. Default is true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFetchComplexAttributeValues")
    private final Boolean idcsFetchComplexAttributeValues;

    /**
     * **SCIM++ Properties:**
     * - caseExact: false
     * - multiValued: false
     * - mutability: readOnly
     * - required: false
     * - returned: default
     * - type: boolean
     * - uniqueness: none
     * Whether the CMVA attribute will be fetched or not for current resource in AbstractResourceManager update operation before calling data provider update. Default is true.
     * @return the value
     **/
    public Boolean getIdcsFetchComplexAttributeValues() {
        return idcsFetchComplexAttributeValues;
    }

    /**
     * Indicates if the attribute is scim compliant, default is true
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsScimCompliant")
    private final Boolean idcsScimCompliant;

    /**
     * Indicates if the attribute is scim compliant, default is true
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsScimCompliant() {
        return idcsScimCompliant;
    }

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then this flag is ignored
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeMappable")
    private final Boolean idcsAttributeMappable;

    /**
     * Specifies if the attribute can be used for mapping with external identity sources such as AD or LDAP. If isSchemaMappable: false for the schema in which this attribute is defined, then this flag is ignored
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsAttributeMappable() {
        return idcsAttributeMappable;
    }

    /**
     * If true, ARM should not validate the value of the attribute since it will be converted/migrated to another attribute internally by the manager which will build valid post, put, or patch payload, depending on the client requested operation
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsValuePersistedInOtherAttribute")
    private final Boolean idcsValuePersistedInOtherAttribute;

    /**
     * If true, ARM should not validate the value of the attribute since it will be converted/migrated to another attribute internally by the manager which will build valid post, put, or patch payload, depending on the client requested operation
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsValuePersistedInOtherAttribute() {
        return idcsValuePersistedInOtherAttribute;
    }

    /**
     * Specifies whether the attribute is PII (personal information). False by default for all attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's written to the Oracle Identity Cloud Service system logs.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPii")
    private final Boolean idcsPii;

    /**
     * Specifies whether the attribute is PII (personal information). False by default for all attributes. If attribute with idcsPii = true, it's value must be obfuscated before it's written to the Oracle Identity Cloud Service system logs.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsPii() {
        return idcsPii;
    }

    /**
     * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle task for upgrading OOTB resources.
     * <p>
     **Added In:** 2104150946
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: never
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsExcludeFromUpgradePatch")
    private final Boolean idcsExcludeFromUpgradePatch;

    /**
     * Specifies whether the attribute should be excluded from the BulkApi patch generated by gradle task for upgrading OOTB resources.
     * <p>
     **Added In:** 2104150946
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: never
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsExcludeFromUpgradePatch() {
        return idcsExcludeFromUpgradePatch;
    }

    /**
     * A list specifying the contained attributes
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subAttributes")
    private final java.util.List<SchemaSubAttributes> subAttributes;

    /**
     * A list specifying the contained attributes
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<SchemaSubAttributes> getSubAttributes() {
        return subAttributes;
    }

    /**
     * Specifies the referenced Resource attribute
     * <p>
     **Deprecated Since: 17.3.4**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRefResourceAttribute")
    private final String idcsRefResourceAttribute;

    /**
     * Specifies the referenced Resource attribute
     * <p>
     **Deprecated Since: 17.3.4**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getIdcsRefResourceAttribute() {
        return idcsRefResourceAttribute;
    }

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAttributeCacheable")
    private final Boolean idcsAttributeCacheable;

    /**
     * Specifies whether the attribute is cacheable. True by default for all attributes. If attribute with idcsAttributeCachable = false, is present \\"attributesToGet\\" while executing GET/SEARCH on cacheable resource, Cache is missed and data is fetched from Data Provider.
     * <p>
     **Added In:** 17.3.4
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsAttributeCacheable() {
        return idcsAttributeCacheable;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiOrder")
    private final Integer idcsuiOrder;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to sequence the attributes displayed on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     * @return the value
     **/
    public Integer getIdcsuiOrder() {
        return idcsuiOrder;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using regular expressions.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiRegexp")
    private final String idcsuiRegexp;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to validate the attribute values using regular expressions.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public String getIdcsuiRegexp() {
        return idcsuiRegexp;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be displayed on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiVisible")
    private final Boolean idcsuiVisible;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to decide whether the attribute must be displayed on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsuiVisible() {
        return idcsuiVisible;
    }

    /**
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    public enum IdcsuiWidget {
        Inputtext("inputtext"),
        Checkbox("checkbox"),
        Textarea("textarea"),
        Combobox("combobox"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsuiWidget")
    private final IdcsuiWidget idcsuiWidget;

    /**
     * Metadata used by Oracle Identity Cloud Service UI to render a widget for this attribute on the Account Form.
     * <p>
     **Added In:** 17.4.2
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public IdcsuiWidget getIdcsuiWidget() {
        return idcsuiWidget;
    }

    /**
     **/
    public enum IdcsFeatures {
        OptionalPii("optionalPii"),
        Mfa("mfa"),
        Social("social"),
        SchemaCustomization("schemaCustomization"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IdcsFeatures.class);

        private final String value;
        private static java.util.Map<String, IdcsFeatures> map;

        static {
            map = new java.util.HashMap<>();
            for (IdcsFeatures v : IdcsFeatures.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IdcsFeatures(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IdcsFeatures create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IdcsFeatures', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of features that require this attribute
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsFeatures")
    private final java.util.List<IdcsFeatures> idcsFeatures;

    /**
     * The list of features that require this attribute
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     * @return the value
     **/
    public java.util.List<IdcsFeatures> getIdcsFeatures() {
        return idcsFeatures;
    }

    /**
     * A subset of \\"canonicalValues\\" that are not supported when the \\"optionalPii\\" feature is disabled in GlobalConfig.
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOptionalPiiCanonicalValues")
    private final java.util.List<String> idcsOptionalPiiCanonicalValues;

    /**
     * A subset of \\"canonicalValues\\" that are not supported when the \\"optionalPii\\" feature is disabled in GlobalConfig.
     * <p>
     **Deprecated Since: 19.1.6**
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getIdcsOptionalPiiCanonicalValues() {
        return idcsOptionalPiiCanonicalValues;
    }

    /**
     * Specifies if the value of the attribute should be sanitized using OWASP library for HTML content
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsSanitize")
    private final Boolean idcsSanitize;

    /**
     * Specifies if the value of the attribute should be sanitized using OWASP library for HTML content
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsSanitize() {
        return idcsSanitize;
    }

    /**
     * Specifies whether the attribute from resource schema should override from common schema with the same name.
     * <p>
     **Added In:** 2102181953
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOverrideCommonAttribute")
    private final Boolean idcsOverrideCommonAttribute;

    /**
     * Specifies whether the attribute from resource schema should override from common schema with the same name.
     * <p>
     **Added In:** 2102181953
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsOverrideCommonAttribute() {
        return idcsOverrideCommonAttribute;
    }

    /**
     * Specifies whether the readOnly and immutable reference attributes should be ignored when forceDelete=true.
     * <p>
     **Added In:** 2104220644
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete")
    private final Boolean idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete;

    /**
     * Specifies whether the readOnly and immutable reference attributes should be ignored when forceDelete=true.
     * <p>
     **Added In:** 2104220644
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete() {
        return idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete;
    }

    /**
     * Set this attribute to True if the resource is eligibal for update while system is in readonly mode.
     * <p>
     **Added In:** 2106170416
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAllowUpdatesInReadOnlyMode")
    private final Boolean idcsAllowUpdatesInReadOnlyMode;

    /**
     * Set this attribute to True if the resource is eligibal for update while system is in readonly mode.
     * <p>
     **Added In:** 2106170416
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsAllowUpdatesInReadOnlyMode() {
        return idcsAllowUpdatesInReadOnlyMode;
    }

    /**
     * Set this attribute to True if the pagination is required on an attribute.
     * <p>
     **Added In:** 2202230830
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsPaginateResponse")
    private final Boolean idcsPaginateResponse;

    /**
     * Set this attribute to True if the pagination is required on an attribute.
     * <p>
     **Added In:** 2202230830
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsPaginateResponse() {
        return idcsPaginateResponse;
    }

    /**
     * If true, indicates that the attribute value must be written to the home region for access flows initiated from a replica region.
     * <p>
     **Added In:** 2209220956
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsRequiresWriteForAccessFlows")
    private final Boolean idcsRequiresWriteForAccessFlows;

    /**
     * If true, indicates that the attribute value must be written to the home region for access flows initiated from a replica region.
     * <p>
     **Added In:** 2209220956
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIdcsRequiresWriteForAccessFlows() {
        return idcsRequiresWriteForAccessFlows;
    }

    /**
     * If true, indicates that the attribute value must be written to the home region and requires immediate read-after-write consistency for access flows initiated from a replica region.
     * <p>
     **Added In:** 2209220956
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: never
     *  - type: boolean
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "idcsRequiresImmediateReadAfterWriteForAccessFlows")
    private final Boolean idcsRequiresImmediateReadAfterWriteForAccessFlows;

    /**
     * If true, indicates that the attribute value must be written to the home region and requires immediate read-after-write consistency for access flows initiated from a replica region.
     * <p>
     **Added In:** 2209220956
     * <p>
     **SCIM++ Properties:**
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: never
     *  - type: boolean
     * @return the value
     **/
    public Boolean getIdcsRequiresImmediateReadAfterWriteForAccessFlows() {
        return idcsRequiresImmediateReadAfterWriteForAccessFlows;
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
        sb.append("SchemaAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", idcsDisplayNameMessageId=")
                .append(String.valueOf(this.idcsDisplayNameMessageId));
        sb.append(", idcsRtsaHideAttribute=").append(String.valueOf(this.idcsRtsaHideAttribute));
        sb.append(", localizedDisplayName=").append(String.valueOf(this.localizedDisplayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", multiValued=").append(String.valueOf(this.multiValued));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", idcsReturnEmptyWhenNull=")
                .append(String.valueOf(this.idcsReturnEmptyWhenNull));
        sb.append(", canonicalValues=").append(String.valueOf(this.canonicalValues));
        sb.append(", idcsDefaultValue=").append(String.valueOf(this.idcsDefaultValue));
        sb.append(", localizedCanonicalValues=")
                .append(String.valueOf(this.localizedCanonicalValues));
        sb.append(", caseExact=").append(String.valueOf(this.caseExact));
        sb.append(", mutability=").append(String.valueOf(this.mutability));
        sb.append(", returned=").append(String.valueOf(this.returned));
        sb.append(", uniqueness=").append(String.valueOf(this.uniqueness));
        sb.append(", idcsCsvAttributeName=").append(String.valueOf(this.idcsCsvAttributeName));
        sb.append(", idcsComplexAttributeNameMappings=")
                .append(String.valueOf(this.idcsComplexAttributeNameMappings));
        sb.append(", idcsICFBundleAttributeName=")
                .append(String.valueOf(this.idcsICFBundleAttributeName));
        sb.append(", idcsICFRequired=").append(String.valueOf(this.idcsICFRequired));
        sb.append(", idcsICFAttributeType=").append(String.valueOf(this.idcsICFAttributeType));
        sb.append(", idcsCsvAttributeNameMappings=")
                .append(String.valueOf(this.idcsCsvAttributeNameMappings));
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
        sb.append(", idcsMapsToSameTargetAttributeNameAs=")
                .append(String.valueOf(this.idcsMapsToSameTargetAttributeNameAs));
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
        sb.append(", idcsCanonicalValueType=").append(String.valueOf(this.idcsCanonicalValueType));
        sb.append(", idcsValidateReference=").append(String.valueOf(this.idcsValidateReference));
        sb.append(", idcsCompositeKey=").append(String.valueOf(this.idcsCompositeKey));
        sb.append(", idcsFetchComplexAttributeValues=")
                .append(String.valueOf(this.idcsFetchComplexAttributeValues));
        sb.append(", idcsScimCompliant=").append(String.valueOf(this.idcsScimCompliant));
        sb.append(", idcsAttributeMappable=").append(String.valueOf(this.idcsAttributeMappable));
        sb.append(", idcsValuePersistedInOtherAttribute=")
                .append(String.valueOf(this.idcsValuePersistedInOtherAttribute));
        sb.append(", idcsPii=").append(String.valueOf(this.idcsPii));
        sb.append(", idcsExcludeFromUpgradePatch=")
                .append(String.valueOf(this.idcsExcludeFromUpgradePatch));
        sb.append(", subAttributes=").append(String.valueOf(this.subAttributes));
        sb.append(", idcsRefResourceAttribute=")
                .append(String.valueOf(this.idcsRefResourceAttribute));
        sb.append(", idcsAttributeCacheable=").append(String.valueOf(this.idcsAttributeCacheable));
        sb.append(", idcsuiOrder=").append(String.valueOf(this.idcsuiOrder));
        sb.append(", idcsuiRegexp=").append(String.valueOf(this.idcsuiRegexp));
        sb.append(", idcsuiVisible=").append(String.valueOf(this.idcsuiVisible));
        sb.append(", idcsuiWidget=").append(String.valueOf(this.idcsuiWidget));
        sb.append(", idcsFeatures=").append(String.valueOf(this.idcsFeatures));
        sb.append(", idcsOptionalPiiCanonicalValues=")
                .append(String.valueOf(this.idcsOptionalPiiCanonicalValues));
        sb.append(", idcsSanitize=").append(String.valueOf(this.idcsSanitize));
        sb.append(", idcsOverrideCommonAttribute=")
                .append(String.valueOf(this.idcsOverrideCommonAttribute));
        sb.append(", idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete=")
                .append(
                        String.valueOf(
                                this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete));
        sb.append(", idcsAllowUpdatesInReadOnlyMode=")
                .append(String.valueOf(this.idcsAllowUpdatesInReadOnlyMode));
        sb.append(", idcsPaginateResponse=").append(String.valueOf(this.idcsPaginateResponse));
        sb.append(", idcsRequiresWriteForAccessFlows=")
                .append(String.valueOf(this.idcsRequiresWriteForAccessFlows));
        sb.append(", idcsRequiresImmediateReadAfterWriteForAccessFlows=")
                .append(String.valueOf(this.idcsRequiresImmediateReadAfterWriteForAccessFlows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaAttributes)) {
            return false;
        }

        SchemaAttributes other = (SchemaAttributes) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.idcsDisplayNameMessageId, other.idcsDisplayNameMessageId)
                && java.util.Objects.equals(this.idcsRtsaHideAttribute, other.idcsRtsaHideAttribute)
                && java.util.Objects.equals(this.localizedDisplayName, other.localizedDisplayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.multiValued, other.multiValued)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(
                        this.idcsReturnEmptyWhenNull, other.idcsReturnEmptyWhenNull)
                && java.util.Objects.equals(this.canonicalValues, other.canonicalValues)
                && java.util.Objects.equals(this.idcsDefaultValue, other.idcsDefaultValue)
                && java.util.Objects.equals(
                        this.localizedCanonicalValues, other.localizedCanonicalValues)
                && java.util.Objects.equals(this.caseExact, other.caseExact)
                && java.util.Objects.equals(this.mutability, other.mutability)
                && java.util.Objects.equals(this.returned, other.returned)
                && java.util.Objects.equals(this.uniqueness, other.uniqueness)
                && java.util.Objects.equals(this.idcsCsvAttributeName, other.idcsCsvAttributeName)
                && java.util.Objects.equals(
                        this.idcsComplexAttributeNameMappings,
                        other.idcsComplexAttributeNameMappings)
                && java.util.Objects.equals(
                        this.idcsICFBundleAttributeName, other.idcsICFBundleAttributeName)
                && java.util.Objects.equals(this.idcsICFRequired, other.idcsICFRequired)
                && java.util.Objects.equals(this.idcsICFAttributeType, other.idcsICFAttributeType)
                && java.util.Objects.equals(
                        this.idcsCsvAttributeNameMappings, other.idcsCsvAttributeNameMappings)
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
                        this.idcsMapsToSameTargetAttributeNameAs,
                        other.idcsMapsToSameTargetAttributeNameAs)
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
                && java.util.Objects.equals(
                        this.idcsCanonicalValueType, other.idcsCanonicalValueType)
                && java.util.Objects.equals(this.idcsValidateReference, other.idcsValidateReference)
                && java.util.Objects.equals(this.idcsCompositeKey, other.idcsCompositeKey)
                && java.util.Objects.equals(
                        this.idcsFetchComplexAttributeValues, other.idcsFetchComplexAttributeValues)
                && java.util.Objects.equals(this.idcsScimCompliant, other.idcsScimCompliant)
                && java.util.Objects.equals(this.idcsAttributeMappable, other.idcsAttributeMappable)
                && java.util.Objects.equals(
                        this.idcsValuePersistedInOtherAttribute,
                        other.idcsValuePersistedInOtherAttribute)
                && java.util.Objects.equals(this.idcsPii, other.idcsPii)
                && java.util.Objects.equals(
                        this.idcsExcludeFromUpgradePatch, other.idcsExcludeFromUpgradePatch)
                && java.util.Objects.equals(this.subAttributes, other.subAttributes)
                && java.util.Objects.equals(
                        this.idcsRefResourceAttribute, other.idcsRefResourceAttribute)
                && java.util.Objects.equals(
                        this.idcsAttributeCacheable, other.idcsAttributeCacheable)
                && java.util.Objects.equals(this.idcsuiOrder, other.idcsuiOrder)
                && java.util.Objects.equals(this.idcsuiRegexp, other.idcsuiRegexp)
                && java.util.Objects.equals(this.idcsuiVisible, other.idcsuiVisible)
                && java.util.Objects.equals(this.idcsuiWidget, other.idcsuiWidget)
                && java.util.Objects.equals(this.idcsFeatures, other.idcsFeatures)
                && java.util.Objects.equals(
                        this.idcsOptionalPiiCanonicalValues, other.idcsOptionalPiiCanonicalValues)
                && java.util.Objects.equals(this.idcsSanitize, other.idcsSanitize)
                && java.util.Objects.equals(
                        this.idcsOverrideCommonAttribute, other.idcsOverrideCommonAttribute)
                && java.util.Objects.equals(
                        this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete,
                        other.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete)
                && java.util.Objects.equals(
                        this.idcsAllowUpdatesInReadOnlyMode, other.idcsAllowUpdatesInReadOnlyMode)
                && java.util.Objects.equals(this.idcsPaginateResponse, other.idcsPaginateResponse)
                && java.util.Objects.equals(
                        this.idcsRequiresWriteForAccessFlows, other.idcsRequiresWriteForAccessFlows)
                && java.util.Objects.equals(
                        this.idcsRequiresImmediateReadAfterWriteForAccessFlows,
                        other.idcsRequiresImmediateReadAfterWriteForAccessFlows)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
        result =
                (result * PRIME)
                        + (this.localizedDisplayName == null
                                ? 43
                                : this.localizedDisplayName.hashCode());
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
        result =
                (result * PRIME)
                        + (this.localizedCanonicalValues == null
                                ? 43
                                : this.localizedCanonicalValues.hashCode());
        result = (result * PRIME) + (this.caseExact == null ? 43 : this.caseExact.hashCode());
        result = (result * PRIME) + (this.mutability == null ? 43 : this.mutability.hashCode());
        result = (result * PRIME) + (this.returned == null ? 43 : this.returned.hashCode());
        result = (result * PRIME) + (this.uniqueness == null ? 43 : this.uniqueness.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsCsvAttributeName == null
                                ? 43
                                : this.idcsCsvAttributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsComplexAttributeNameMappings == null
                                ? 43
                                : this.idcsComplexAttributeNameMappings.hashCode());
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
                        + (this.idcsCsvAttributeNameMappings == null
                                ? 43
                                : this.idcsCsvAttributeNameMappings.hashCode());
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
                        + (this.idcsMapsToSameTargetAttributeNameAs == null
                                ? 43
                                : this.idcsMapsToSameTargetAttributeNameAs.hashCode());
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
                        + (this.idcsCanonicalValueType == null
                                ? 43
                                : this.idcsCanonicalValueType.hashCode());
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
                        + (this.idcsValuePersistedInOtherAttribute == null
                                ? 43
                                : this.idcsValuePersistedInOtherAttribute.hashCode());
        result = (result * PRIME) + (this.idcsPii == null ? 43 : this.idcsPii.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsExcludeFromUpgradePatch == null
                                ? 43
                                : this.idcsExcludeFromUpgradePatch.hashCode());
        result =
                (result * PRIME)
                        + (this.subAttributes == null ? 43 : this.subAttributes.hashCode());
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
        result = (result * PRIME) + (this.idcsuiOrder == null ? 43 : this.idcsuiOrder.hashCode());
        result = (result * PRIME) + (this.idcsuiRegexp == null ? 43 : this.idcsuiRegexp.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsuiVisible == null ? 43 : this.idcsuiVisible.hashCode());
        result = (result * PRIME) + (this.idcsuiWidget == null ? 43 : this.idcsuiWidget.hashCode());
        result = (result * PRIME) + (this.idcsFeatures == null ? 43 : this.idcsFeatures.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsOptionalPiiCanonicalValues == null
                                ? 43
                                : this.idcsOptionalPiiCanonicalValues.hashCode());
        result = (result * PRIME) + (this.idcsSanitize == null ? 43 : this.idcsSanitize.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsOverrideCommonAttribute == null
                                ? 43
                                : this.idcsOverrideCommonAttribute.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete == null
                                ? 43
                                : this.idcsIgnoreReadOnlyAndImmutableRefAttrsDuringForceDelete
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAllowUpdatesInReadOnlyMode == null
                                ? 43
                                : this.idcsAllowUpdatesInReadOnlyMode.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsPaginateResponse == null
                                ? 43
                                : this.idcsPaginateResponse.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRequiresWriteForAccessFlows == null
                                ? 43
                                : this.idcsRequiresWriteForAccessFlows.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsRequiresImmediateReadAfterWriteForAccessFlows == null
                                ? 43
                                : this.idcsRequiresImmediateReadAfterWriteForAccessFlows
                                        .hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
