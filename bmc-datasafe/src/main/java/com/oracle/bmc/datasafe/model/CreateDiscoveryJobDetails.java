/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new data discovery job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDiscoveryJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDiscoveryJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
        private DiscoveryJob.DiscoveryType discoveryType;

        public Builder discoveryType(DiscoveryJob.DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        public Builder schemasForDiscovery(java.util.List<String> schemasForDiscovery) {
            this.schemasForDiscovery = schemasForDiscovery;
            this.__explicitlySet__.add("schemasForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        public Builder sensitiveTypeIdsForDiscovery(
                java.util.List<String> sensitiveTypeIdsForDiscovery) {
            this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeIdsForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
            this.__explicitlySet__.add("isSampleDataCollectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        public Builder isAppDefinedRelationDiscoveryEnabled(
                Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
            this.__explicitlySet__.add("isAppDefinedRelationDiscoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = isIncludeAllSchemas;
            this.__explicitlySet__.add("isIncludeAllSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDiscoveryJobDetails build() {
            CreateDiscoveryJobDetails __instance__ =
                    new CreateDiscoveryJobDetails(
                            discoveryType,
                            sensitiveDataModelId,
                            compartmentId,
                            displayName,
                            schemasForDiscovery,
                            sensitiveTypeIdsForDiscovery,
                            isSampleDataCollectionEnabled,
                            isAppDefinedRelationDiscoveryEnabled,
                            isIncludeAllSchemas,
                            isIncludeAllSensitiveTypes,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDiscoveryJobDetails o) {
            Builder copiedBuilder =
                    discoveryType(o.getDiscoveryType())
                            .sensitiveDataModelId(o.getSensitiveDataModelId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .schemasForDiscovery(o.getSchemasForDiscovery())
                            .sensitiveTypeIdsForDiscovery(o.getSensitiveTypeIdsForDiscovery())
                            .isSampleDataCollectionEnabled(o.getIsSampleDataCollectionEnabled())
                            .isAppDefinedRelationDiscoveryEnabled(
                                    o.getIsAppDefinedRelationDiscoveryEnabled())
                            .isIncludeAllSchemas(o.getIsIncludeAllSchemas())
                            .isIncludeAllSensitiveTypes(o.getIsIncludeAllSensitiveTypes())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    DiscoveryJob.DiscoveryType discoveryType;

    /**
     * The OCID of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    String sensitiveDataModelId;

    /**
     * The OCID of the compartment where the discovery job resource should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name for the discovery job. Does not have to be unique, and it is changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The schemas to be scanned by the discovery job. If not provided, the schemasForDiscovery attribute of the sensitive
     * data model is used to get the list of schemas.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    java.util.List<String> schemasForDiscovery;

    /**
     * The OCIDs of the sensitive types to be used by the discovery job. If not provided, the sensitiveTypeIdsForDiscovery
     * attribute of the sensitive data model is used to get the list of sensitive types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * Indicates if the discovery job should collect and store sample data values for the discovered columns. Sample data
     * helps review the discovered columns and ensure that they actually contain sensitive data. As it collects original
     * data from the target database, it's disabled by default and should be used only if it's acceptable to store sample
     * data in Data Safe's repository in Oracle Cloud. Note that sample data values are not collected for columns with the
     * following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if the discovery job should identify potential application-level (non-dictionary) referential relationships
     * between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database
     * dictionary, which in turn, helps identify additional sensitive columns and preserve referential integrity during
     * data masking. It's disabled by default and should be used only if there is a need to identify application-level
     * relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if all the schemas should be scanned by the discovery job. If it's set to true, the schemasForDiscovery
     * attribute is ignored and all schemas are used for data discovery. If both attributes are not provided, the configuration
     * from the sensitive data model is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the existing sensitive types should be used by the discovery job. If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery. If both
     * attributes are not provided, the configuration from the sensitive data model is used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    Boolean isIncludeAllSensitiveTypes;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
