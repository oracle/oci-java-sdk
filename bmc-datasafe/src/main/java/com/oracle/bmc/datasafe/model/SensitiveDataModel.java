/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A sensitive data model is a collection of sensitive columns and their referential relationships. It helps
 * understand the sensitive data landscape, track changes, and efficiently enable security controls such as data
 * masking. It can be managed either manually or by performing sensitive data discovery on a reference target
 * database. [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-data-models1.html#GUID-849CA7D2-1809-40DD-B6D7-44E46EFF7EB5).
 *
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
    builder = SensitiveDataModel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SensitiveDataModel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DiscoveryLifecycleState lifecycleState;

        public Builder lifecycleState(DiscoveryLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
        private String appSuiteName;

        public Builder appSuiteName(String appSuiteName) {
            this.appSuiteName = appSuiteName;
            this.__explicitlySet__.add("appSuiteName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveDataModel build() {
            SensitiveDataModel __instance__ =
                    new SensitiveDataModel(
                            id,
                            displayName,
                            compartmentId,
                            targetId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            appSuiteName,
                            description,
                            schemasForDiscovery,
                            sensitiveTypeIdsForDiscovery,
                            isSampleDataCollectionEnabled,
                            isAppDefinedRelationDiscoveryEnabled,
                            isIncludeAllSchemas,
                            isIncludeAllSensitiveTypes,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveDataModel o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .targetId(o.getTargetId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .appSuiteName(o.getAppSuiteName())
                            .description(o.getDescription())
                            .schemasForDiscovery(o.getSchemasForDiscovery())
                            .sensitiveTypeIdsForDiscovery(o.getSensitiveTypeIdsForDiscovery())
                            .isSampleDataCollectionEnabled(o.getIsSampleDataCollectionEnabled())
                            .isAppDefinedRelationDiscoveryEnabled(
                                    o.getIsAppDefinedRelationDiscoveryEnabled())
                            .isIncludeAllSchemas(o.getIsIncludeAllSchemas())
                            .isIncludeAllSensitiveTypes(o.getIsIncludeAllSensitiveTypes())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The display name of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the compartment that contains the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the reference target database associated with the sensitive data model. All operations such as
     * performing data discovery and adding columns manually are done in the context of the associated target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    DiscoveryLifecycleState lifecycleState;

    /**
     * The application suite name identifying a collection of applications. The default value is GENERIC. It's useful
     * only if maintaining a sensitive data model for a suite of applications.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
    String appSuiteName;

    /**
     * The description of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The schemas to be scanned by data discovery jobs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    java.util.List<String> schemasForDiscovery;

    /**
     * The OCIDs of the sensitive types to be used by data discovery jobs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only if
     * it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
     * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential
     * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
     * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
     * It's disabled by default and should be used only if there is a need to identify application-level relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
     * If it's set to true, the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the existing sensitive types should be used by data discovery jobs.If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
