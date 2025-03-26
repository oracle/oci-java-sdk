/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SensitiveDataModel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SensitiveDataModel extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "targetId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "appSuiteName",
        "description",
        "schemasForDiscovery",
        "tablesForDiscovery",
        "sensitiveTypeIdsForDiscovery",
        "sensitiveTypeGroupIdsForDiscovery",
        "isSampleDataCollectionEnabled",
        "isAppDefinedRelationDiscoveryEnabled",
        "isIncludeAllSchemas",
        "isIncludeAllSensitiveTypes",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public SensitiveDataModel(
            String id,
            String displayName,
            String compartmentId,
            String targetId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DiscoveryLifecycleState lifecycleState,
            String appSuiteName,
            String description,
            java.util.List<String> schemasForDiscovery,
            java.util.List<TablesForDiscovery> tablesForDiscovery,
            java.util.List<String> sensitiveTypeIdsForDiscovery,
            java.util.List<String> sensitiveTypeGroupIdsForDiscovery,
            Boolean isSampleDataCollectionEnabled,
            Boolean isAppDefinedRelationDiscoveryEnabled,
            Boolean isIncludeAllSchemas,
            Boolean isIncludeAllSensitiveTypes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.appSuiteName = appSuiteName;
        this.description = description;
        this.schemasForDiscovery = schemasForDiscovery;
        this.tablesForDiscovery = tablesForDiscovery;
        this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
        this.sensitiveTypeGroupIdsForDiscovery = sensitiveTypeGroupIdsForDiscovery;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.isIncludeAllSchemas = isIncludeAllSchemas;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the sensitive data model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the sensitive data model.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The display name of the sensitive data model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the sensitive data model.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment that contains the sensitive data model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the sensitive data model.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the reference target database associated with the sensitive data model. All operations such as
         * performing data discovery and adding columns manually are done in the context of the associated target database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the reference target database associated with the sensitive data model. All operations such as
         * performing data discovery and adding columns manually are done in the context of the associated target database.
         *
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the sensitive data model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DiscoveryLifecycleState lifecycleState;

        /**
         * The current state of the sensitive data model.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(DiscoveryLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The application suite name identifying a collection of applications. The default value is GENERIC. It's useful
         * only if maintaining a sensitive data model for a suite of applications.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
        private String appSuiteName;

        /**
         * The application suite name identifying a collection of applications. The default value is GENERIC. It's useful
         * only if maintaining a sensitive data model for a suite of applications.
         *
         * @param appSuiteName the value to set
         * @return this builder
         **/
        public Builder appSuiteName(String appSuiteName) {
            this.appSuiteName = appSuiteName;
            this.__explicitlySet__.add("appSuiteName");
            return this;
        }
        /**
         * The description of the sensitive data model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the sensitive data model.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The schemas to be scanned by data discovery jobs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        /**
         * The schemas to be scanned by data discovery jobs.
         * @param schemasForDiscovery the value to set
         * @return this builder
         **/
        public Builder schemasForDiscovery(java.util.List<String> schemasForDiscovery) {
            this.schemasForDiscovery = schemasForDiscovery;
            this.__explicitlySet__.add("schemasForDiscovery");
            return this;
        }
        /**
         * The data discovery jobs will scan the tables specified here, including both schemas and tables.
         * For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1", "T2"]}, {schemaName:
         * "OE", tableName : ["T3", "T4"]}].
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
        private java.util.List<TablesForDiscovery> tablesForDiscovery;

        /**
         * The data discovery jobs will scan the tables specified here, including both schemas and tables.
         * For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1", "T2"]}, {schemaName:
         * "OE", tableName : ["T3", "T4"]}].
         *
         * @param tablesForDiscovery the value to set
         * @return this builder
         **/
        public Builder tablesForDiscovery(java.util.List<TablesForDiscovery> tablesForDiscovery) {
            this.tablesForDiscovery = tablesForDiscovery;
            this.__explicitlySet__.add("tablesForDiscovery");
            return this;
        }
        /**
         * The OCIDs of the sensitive types to be used by data discovery jobs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        /**
         * The OCIDs of the sensitive types to be used by data discovery jobs.
         * @param sensitiveTypeIdsForDiscovery the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeIdsForDiscovery(
                java.util.List<String> sensitiveTypeIdsForDiscovery) {
            this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeIdsForDiscovery");
            return this;
        }
        /**
         * The OCIDs of the sensitive type groups to be used by data discovery jobs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeGroupIdsForDiscovery")
        private java.util.List<String> sensitiveTypeGroupIdsForDiscovery;

        /**
         * The OCIDs of the sensitive type groups to be used by data discovery jobs.
         *
         * @param sensitiveTypeGroupIdsForDiscovery the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeGroupIdsForDiscovery(
                java.util.List<String> sensitiveTypeGroupIdsForDiscovery) {
            this.sensitiveTypeGroupIdsForDiscovery = sensitiveTypeGroupIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeGroupIdsForDiscovery");
            return this;
        }
        /**
         * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
         * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
         * As it collects original data from the target database, it's disabled by default and should be used only if
         * it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
         * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        /**
         * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
         * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
         * As it collects original data from the target database, it's disabled by default and should be used only if
         * it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
         * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         *
         * @param isSampleDataCollectionEnabled the value to set
         * @return this builder
         **/
        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
            this.__explicitlySet__.add("isSampleDataCollectionEnabled");
            return this;
        }
        /**
         * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential
         * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
         * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
         * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
         * It's disabled by default and should be used only if there is a need to identify application-level relationships.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        /**
         * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential
         * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
         * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
         * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
         * It's disabled by default and should be used only if there is a need to identify application-level relationships.
         *
         * @param isAppDefinedRelationDiscoveryEnabled the value to set
         * @return this builder
         **/
        public Builder isAppDefinedRelationDiscoveryEnabled(
                Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
            this.__explicitlySet__.add("isAppDefinedRelationDiscoveryEnabled");
            return this;
        }
        /**
         * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
         * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        /**
         * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
         * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
         *
         * @param isIncludeAllSchemas the value to set
         * @return this builder
         **/
        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = isIncludeAllSchemas;
            this.__explicitlySet__.add("isIncludeAllSchemas");
            return this;
        }
        /**
         * Indicates if all the existing sensitive types should be used by data discovery jobs.If it's set to true, the
         * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        /**
         * Indicates if all the existing sensitive types should be used by data discovery jobs.If it's set to true, the
         * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
         *
         * @param isIncludeAllSensitiveTypes the value to set
         * @return this builder
         **/
        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveDataModel build() {
            SensitiveDataModel model =
                    new SensitiveDataModel(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.targetId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.appSuiteName,
                            this.description,
                            this.schemasForDiscovery,
                            this.tablesForDiscovery,
                            this.sensitiveTypeIdsForDiscovery,
                            this.sensitiveTypeGroupIdsForDiscovery,
                            this.isSampleDataCollectionEnabled,
                            this.isAppDefinedRelationDiscoveryEnabled,
                            this.isIncludeAllSchemas,
                            this.isIncludeAllSensitiveTypes,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveDataModel model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("appSuiteName")) {
                this.appSuiteName(model.getAppSuiteName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("schemasForDiscovery")) {
                this.schemasForDiscovery(model.getSchemasForDiscovery());
            }
            if (model.wasPropertyExplicitlySet("tablesForDiscovery")) {
                this.tablesForDiscovery(model.getTablesForDiscovery());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeIdsForDiscovery")) {
                this.sensitiveTypeIdsForDiscovery(model.getSensitiveTypeIdsForDiscovery());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeGroupIdsForDiscovery")) {
                this.sensitiveTypeGroupIdsForDiscovery(
                        model.getSensitiveTypeGroupIdsForDiscovery());
            }
            if (model.wasPropertyExplicitlySet("isSampleDataCollectionEnabled")) {
                this.isSampleDataCollectionEnabled(model.getIsSampleDataCollectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAppDefinedRelationDiscoveryEnabled")) {
                this.isAppDefinedRelationDiscoveryEnabled(
                        model.getIsAppDefinedRelationDiscoveryEnabled());
            }
            if (model.wasPropertyExplicitlySet("isIncludeAllSchemas")) {
                this.isIncludeAllSchemas(model.getIsIncludeAllSchemas());
            }
            if (model.wasPropertyExplicitlySet("isIncludeAllSensitiveTypes")) {
                this.isIncludeAllSensitiveTypes(model.getIsIncludeAllSensitiveTypes());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the sensitive data model.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The display name of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the sensitive data model.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment that contains the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the sensitive data model.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the reference target database associated with the sensitive data model. All operations such as
     * performing data discovery and adding columns manually are done in the context of the associated target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the reference target database associated with the sensitive data model. All operations such as
     * performing data discovery and adding columns manually are done in the context of the associated target database.
     *
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the sensitive data model was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the sensitive data model was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DiscoveryLifecycleState lifecycleState;

    /**
     * The current state of the sensitive data model.
     * @return the value
     **/
    public DiscoveryLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The application suite name identifying a collection of applications. The default value is GENERIC. It's useful
     * only if maintaining a sensitive data model for a suite of applications.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
    private final String appSuiteName;

    /**
     * The application suite name identifying a collection of applications. The default value is GENERIC. It's useful
     * only if maintaining a sensitive data model for a suite of applications.
     *
     * @return the value
     **/
    public String getAppSuiteName() {
        return appSuiteName;
    }

    /**
     * The description of the sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the sensitive data model.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The schemas to be scanned by data discovery jobs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    private final java.util.List<String> schemasForDiscovery;

    /**
     * The schemas to be scanned by data discovery jobs.
     * @return the value
     **/
    public java.util.List<String> getSchemasForDiscovery() {
        return schemasForDiscovery;
    }

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and tables.
     * For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1", "T2"]}, {schemaName:
     * "OE", tableName : ["T3", "T4"]}].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
    private final java.util.List<TablesForDiscovery> tablesForDiscovery;

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and tables.
     * For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1", "T2"]}, {schemaName:
     * "OE", tableName : ["T3", "T4"]}].
     *
     * @return the value
     **/
    public java.util.List<TablesForDiscovery> getTablesForDiscovery() {
        return tablesForDiscovery;
    }

    /**
     * The OCIDs of the sensitive types to be used by data discovery jobs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * The OCIDs of the sensitive types to be used by data discovery jobs.
     * @return the value
     **/
    public java.util.List<String> getSensitiveTypeIdsForDiscovery() {
        return sensitiveTypeIdsForDiscovery;
    }

    /**
     * The OCIDs of the sensitive type groups to be used by data discovery jobs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeGroupIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeGroupIdsForDiscovery;

    /**
     * The OCIDs of the sensitive type groups to be used by data discovery jobs.
     *
     * @return the value
     **/
    public java.util.List<String> getSensitiveTypeGroupIdsForDiscovery() {
        return sensitiveTypeGroupIdsForDiscovery;
    }

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only if
     * it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
     * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    private final Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only if
     * it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data values
     * are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     * @return the value
     **/
    public Boolean getIsSampleDataCollectionEnabled() {
        return isSampleDataCollectionEnabled;
    }

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential
     * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
     * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
     * It's disabled by default and should be used only if there is a need to identify application-level relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    private final Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary) referential
     * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
     * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
     * It's disabled by default and should be used only if there is a need to identify application-level relationships.
     *
     * @return the value
     **/
    public Boolean getIsAppDefinedRelationDiscoveryEnabled() {
        return isAppDefinedRelationDiscoveryEnabled;
    }

    /**
     * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
     * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    private final Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the schemas in the associated target database should be scanned by data discovery jobs.
     * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
     *
     * @return the value
     **/
    public Boolean getIsIncludeAllSchemas() {
        return isIncludeAllSchemas;
    }

    /**
     * Indicates if all the existing sensitive types should be used by data discovery jobs.If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    private final Boolean isIncludeAllSensitiveTypes;

    /**
     * Indicates if all the existing sensitive types should be used by data discovery jobs.If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used for data discovery.
     *
     * @return the value
     **/
    public Boolean getIsIncludeAllSensitiveTypes() {
        return isIncludeAllSensitiveTypes;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("SensitiveDataModel(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", appSuiteName=").append(String.valueOf(this.appSuiteName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schemasForDiscovery=").append(String.valueOf(this.schemasForDiscovery));
        sb.append(", tablesForDiscovery=").append(String.valueOf(this.tablesForDiscovery));
        sb.append(", sensitiveTypeIdsForDiscovery=")
                .append(String.valueOf(this.sensitiveTypeIdsForDiscovery));
        sb.append(", sensitiveTypeGroupIdsForDiscovery=")
                .append(String.valueOf(this.sensitiveTypeGroupIdsForDiscovery));
        sb.append(", isSampleDataCollectionEnabled=")
                .append(String.valueOf(this.isSampleDataCollectionEnabled));
        sb.append(", isAppDefinedRelationDiscoveryEnabled=")
                .append(String.valueOf(this.isAppDefinedRelationDiscoveryEnabled));
        sb.append(", isIncludeAllSchemas=").append(String.valueOf(this.isIncludeAllSchemas));
        sb.append(", isIncludeAllSensitiveTypes=")
                .append(String.valueOf(this.isIncludeAllSensitiveTypes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SensitiveDataModel)) {
            return false;
        }

        SensitiveDataModel other = (SensitiveDataModel) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.appSuiteName, other.appSuiteName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.schemasForDiscovery, other.schemasForDiscovery)
                && java.util.Objects.equals(this.tablesForDiscovery, other.tablesForDiscovery)
                && java.util.Objects.equals(
                        this.sensitiveTypeIdsForDiscovery, other.sensitiveTypeIdsForDiscovery)
                && java.util.Objects.equals(
                        this.sensitiveTypeGroupIdsForDiscovery,
                        other.sensitiveTypeGroupIdsForDiscovery)
                && java.util.Objects.equals(
                        this.isSampleDataCollectionEnabled, other.isSampleDataCollectionEnabled)
                && java.util.Objects.equals(
                        this.isAppDefinedRelationDiscoveryEnabled,
                        other.isAppDefinedRelationDiscoveryEnabled)
                && java.util.Objects.equals(this.isIncludeAllSchemas, other.isIncludeAllSchemas)
                && java.util.Objects.equals(
                        this.isIncludeAllSensitiveTypes, other.isIncludeAllSensitiveTypes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.appSuiteName == null ? 43 : this.appSuiteName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.schemasForDiscovery == null
                                ? 43
                                : this.schemasForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.tablesForDiscovery == null
                                ? 43
                                : this.tablesForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeIdsForDiscovery == null
                                ? 43
                                : this.sensitiveTypeIdsForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeGroupIdsForDiscovery == null
                                ? 43
                                : this.sensitiveTypeGroupIdsForDiscovery.hashCode());
        result =
                (result * PRIME)
                        + (this.isSampleDataCollectionEnabled == null
                                ? 43
                                : this.isSampleDataCollectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAppDefinedRelationDiscoveryEnabled == null
                                ? 43
                                : this.isAppDefinedRelationDiscoveryEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeAllSchemas == null
                                ? 43
                                : this.isIncludeAllSchemas.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeAllSensitiveTypes == null
                                ? 43
                                : this.isIncludeAllSensitiveTypes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
