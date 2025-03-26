/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A data discovery job. It helps track job's metadata as well as result statistics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiscoveryJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DiscoveryJob extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "discoveryType",
        "displayName",
        "compartmentId",
        "timeStarted",
        "timeFinished",
        "lifecycleState",
        "sensitiveDataModelId",
        "targetId",
        "schemasForDiscovery",
        "tablesForDiscovery",
        "sensitiveTypeIdsForDiscovery",
        "sensitiveTypeGroupIdsForDiscovery",
        "isSampleDataCollectionEnabled",
        "isAppDefinedRelationDiscoveryEnabled",
        "isIncludeAllSchemas",
        "isIncludeAllSensitiveTypes",
        "totalSchemasScanned",
        "totalObjectsScanned",
        "totalColumnsScanned",
        "totalNewSensitiveColumns",
        "totalModifiedSensitiveColumns",
        "totalDeletedSensitiveColumns",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DiscoveryJob(
            String id,
            DiscoveryType discoveryType,
            String displayName,
            String compartmentId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            DiscoveryLifecycleState lifecycleState,
            String sensitiveDataModelId,
            String targetId,
            java.util.List<String> schemasForDiscovery,
            java.util.List<TablesForDiscovery> tablesForDiscovery,
            java.util.List<String> sensitiveTypeIdsForDiscovery,
            java.util.List<String> sensitiveTypeGroupIdsForDiscovery,
            Boolean isSampleDataCollectionEnabled,
            Boolean isAppDefinedRelationDiscoveryEnabled,
            Boolean isIncludeAllSchemas,
            Boolean isIncludeAllSensitiveTypes,
            Long totalSchemasScanned,
            Long totalObjectsScanned,
            Long totalColumnsScanned,
            Long totalNewSensitiveColumns,
            Long totalModifiedSensitiveColumns,
            Long totalDeletedSensitiveColumns,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.discoveryType = discoveryType;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.sensitiveDataModelId = sensitiveDataModelId;
        this.targetId = targetId;
        this.schemasForDiscovery = schemasForDiscovery;
        this.tablesForDiscovery = tablesForDiscovery;
        this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
        this.sensitiveTypeGroupIdsForDiscovery = sensitiveTypeGroupIdsForDiscovery;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.isIncludeAllSchemas = isIncludeAllSchemas;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.totalSchemasScanned = totalSchemasScanned;
        this.totalObjectsScanned = totalObjectsScanned;
        this.totalColumnsScanned = totalColumnsScanned;
        this.totalNewSensitiveColumns = totalNewSensitiveColumns;
        this.totalModifiedSensitiveColumns = totalModifiedSensitiveColumns;
        this.totalDeletedSensitiveColumns = totalDeletedSensitiveColumns;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the discovery job.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
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
        private DiscoveryType discoveryType;

        /**
         * The type of the discovery job. It defines the job's scope.
         * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
         * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
         * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
         * ALL covers all the above three scenarios and reports new, deleted and modified columns.
         *
         * @param discoveryType the value to set
         * @return this builder
         **/
        public Builder discoveryType(DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }
        /**
         * The display name of the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the discovery job.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the compartment that contains the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the discovery job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time the discovery job started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the discovery job started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the discovery job finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)..
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the discovery job finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)..
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The current state of the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DiscoveryLifecycleState lifecycleState;

        /**
         * The current state of the discovery job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(DiscoveryLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the sensitive data model associated with the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        /**
         * The OCID of the sensitive data model associated with the discovery job.
         * @param sensitiveDataModelId the value to set
         * @return this builder
         **/
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }
        /**
         * The OCID of the target database associated with the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database associated with the discovery job.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The schemas used for data discovery.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        /**
         * The schemas used for data discovery.
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
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
        private java.util.List<TablesForDiscovery> tablesForDiscovery;

        /**
         * The data discovery jobs will scan the tables specified here, including both schemas and tables.
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
         * The OCIDs of the sensitive types used for data discovery.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        /**
         * The OCIDs of the sensitive types used for data discovery.
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
         * Indicates if the discovery job should collect and store sample data values for the discovered columns.
         * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
         * As it collects original data from the target database, it's disabled by default and should be used only
         * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data
         * values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        /**
         * Indicates if the discovery job should collect and store sample data values for the discovered columns.
         * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
         * As it collects original data from the target database, it's disabled by default and should be used only
         * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data
         * values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
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
         * Indicates if the discovery job should identify potential application-level (non-dictionary) referential
         * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
         * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
         * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
         * It's disabled by default and should be used only if there is a need to identify application-level relationships.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        /**
         * Indicates if the discovery job should identify potential application-level (non-dictionary) referential
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
         * Indicates if all the schemas in the associated target database are used for data discovery.
         * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        /**
         * Indicates if all the schemas in the associated target database are used for data discovery.
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
         * Indicates if all the existing sensitive types are used for data discovery. If it's set to true, the
         * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        /**
         * Indicates if all the existing sensitive types are used for data discovery. If it's set to true, the
         * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used.
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
         * The total number of schemas scanned by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSchemasScanned")
        private Long totalSchemasScanned;

        /**
         * The total number of schemas scanned by the discovery job.
         * @param totalSchemasScanned the value to set
         * @return this builder
         **/
        public Builder totalSchemasScanned(Long totalSchemasScanned) {
            this.totalSchemasScanned = totalSchemasScanned;
            this.__explicitlySet__.add("totalSchemasScanned");
            return this;
        }
        /**
         * The total number of objects (tables and editioning views) scanned by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
        private Long totalObjectsScanned;

        /**
         * The total number of objects (tables and editioning views) scanned by the discovery job.
         * @param totalObjectsScanned the value to set
         * @return this builder
         **/
        public Builder totalObjectsScanned(Long totalObjectsScanned) {
            this.totalObjectsScanned = totalObjectsScanned;
            this.__explicitlySet__.add("totalObjectsScanned");
            return this;
        }
        /**
         * The total number of columns scanned by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalColumnsScanned")
        private Long totalColumnsScanned;

        /**
         * The total number of columns scanned by the discovery job.
         * @param totalColumnsScanned the value to set
         * @return this builder
         **/
        public Builder totalColumnsScanned(Long totalColumnsScanned) {
            this.totalColumnsScanned = totalColumnsScanned;
            this.__explicitlySet__.add("totalColumnsScanned");
            return this;
        }
        /**
         * The total number of new sensitive columns identified by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalNewSensitiveColumns")
        private Long totalNewSensitiveColumns;

        /**
         * The total number of new sensitive columns identified by the discovery job.
         * @param totalNewSensitiveColumns the value to set
         * @return this builder
         **/
        public Builder totalNewSensitiveColumns(Long totalNewSensitiveColumns) {
            this.totalNewSensitiveColumns = totalNewSensitiveColumns;
            this.__explicitlySet__.add("totalNewSensitiveColumns");
            return this;
        }
        /**
         * The total number of modified sensitive columns identified by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalModifiedSensitiveColumns")
        private Long totalModifiedSensitiveColumns;

        /**
         * The total number of modified sensitive columns identified by the discovery job.
         * @param totalModifiedSensitiveColumns the value to set
         * @return this builder
         **/
        public Builder totalModifiedSensitiveColumns(Long totalModifiedSensitiveColumns) {
            this.totalModifiedSensitiveColumns = totalModifiedSensitiveColumns;
            this.__explicitlySet__.add("totalModifiedSensitiveColumns");
            return this;
        }
        /**
         * The total number of deleted sensitive columns identified by the discovery job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalDeletedSensitiveColumns")
        private Long totalDeletedSensitiveColumns;

        /**
         * The total number of deleted sensitive columns identified by the discovery job.
         * @param totalDeletedSensitiveColumns the value to set
         * @return this builder
         **/
        public Builder totalDeletedSensitiveColumns(Long totalDeletedSensitiveColumns) {
            this.totalDeletedSensitiveColumns = totalDeletedSensitiveColumns;
            this.__explicitlySet__.add("totalDeletedSensitiveColumns");
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

        public DiscoveryJob build() {
            DiscoveryJob model =
                    new DiscoveryJob(
                            this.id,
                            this.discoveryType,
                            this.displayName,
                            this.compartmentId,
                            this.timeStarted,
                            this.timeFinished,
                            this.lifecycleState,
                            this.sensitiveDataModelId,
                            this.targetId,
                            this.schemasForDiscovery,
                            this.tablesForDiscovery,
                            this.sensitiveTypeIdsForDiscovery,
                            this.sensitiveTypeGroupIdsForDiscovery,
                            this.isSampleDataCollectionEnabled,
                            this.isAppDefinedRelationDiscoveryEnabled,
                            this.isIncludeAllSchemas,
                            this.isIncludeAllSensitiveTypes,
                            this.totalSchemasScanned,
                            this.totalObjectsScanned,
                            this.totalColumnsScanned,
                            this.totalNewSensitiveColumns,
                            this.totalModifiedSensitiveColumns,
                            this.totalDeletedSensitiveColumns,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryJob model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("discoveryType")) {
                this.discoveryType(model.getDiscoveryType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("sensitiveDataModelId")) {
                this.sensitiveDataModelId(model.getSensitiveDataModelId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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
            if (model.wasPropertyExplicitlySet("totalSchemasScanned")) {
                this.totalSchemasScanned(model.getTotalSchemasScanned());
            }
            if (model.wasPropertyExplicitlySet("totalObjectsScanned")) {
                this.totalObjectsScanned(model.getTotalObjectsScanned());
            }
            if (model.wasPropertyExplicitlySet("totalColumnsScanned")) {
                this.totalColumnsScanned(model.getTotalColumnsScanned());
            }
            if (model.wasPropertyExplicitlySet("totalNewSensitiveColumns")) {
                this.totalNewSensitiveColumns(model.getTotalNewSensitiveColumns());
            }
            if (model.wasPropertyExplicitlySet("totalModifiedSensitiveColumns")) {
                this.totalModifiedSensitiveColumns(model.getTotalModifiedSensitiveColumns());
            }
            if (model.wasPropertyExplicitlySet("totalDeletedSensitiveColumns")) {
                this.totalDeletedSensitiveColumns(model.getTotalDeletedSensitiveColumns());
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
     * The OCID of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the discovery job.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     **/
    public enum DiscoveryType {
        All("ALL"),
        New("NEW"),
        Modified("MODIFIED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DiscoveryType.class);

        private final String value;
        private static java.util.Map<String, DiscoveryType> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveryType v : DiscoveryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DiscoveryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiscoveryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    private final DiscoveryType discoveryType;

    /**
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     * @return the value
     **/
    public DiscoveryType getDiscoveryType() {
        return discoveryType;
    }

    /**
     * The display name of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the discovery job.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the compartment that contains the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the discovery job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the discovery job started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the discovery job started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the discovery job finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)..
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the discovery job finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)..
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The current state of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DiscoveryLifecycleState lifecycleState;

    /**
     * The current state of the discovery job.
     * @return the value
     **/
    public DiscoveryLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the sensitive data model associated with the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    private final String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model associated with the discovery job.
     * @return the value
     **/
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }

    /**
     * The OCID of the target database associated with the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database associated with the discovery job.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The schemas used for data discovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    private final java.util.List<String> schemasForDiscovery;

    /**
     * The schemas used for data discovery.
     * @return the value
     **/
    public java.util.List<String> getSchemasForDiscovery() {
        return schemasForDiscovery;
    }

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and tables.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
    private final java.util.List<TablesForDiscovery> tablesForDiscovery;

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and tables.
     *
     * @return the value
     **/
    public java.util.List<TablesForDiscovery> getTablesForDiscovery() {
        return tablesForDiscovery;
    }

    /**
     * The OCIDs of the sensitive types used for data discovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * The OCIDs of the sensitive types used for data discovery.
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
     * Indicates if the discovery job should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only
     * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data
     * values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    private final Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if the discovery job should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only
     * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data
     * values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     * @return the value
     **/
    public Boolean getIsSampleDataCollectionEnabled() {
        return isSampleDataCollectionEnabled;
    }

    /**
     * Indicates if the discovery job should identify potential application-level (non-dictionary) referential
     * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
     * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
     * It's disabled by default and should be used only if there is a need to identify application-level relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    private final Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if the discovery job should identify potential application-level (non-dictionary) referential
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
     * Indicates if all the schemas in the associated target database are used for data discovery.
     * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    private final Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the schemas in the associated target database are used for data discovery.
     * If it is set to true, sensitive data is discovered in all schemas (except for schemas maintained by Oracle).
     *
     * @return the value
     **/
    public Boolean getIsIncludeAllSchemas() {
        return isIncludeAllSchemas;
    }

    /**
     * Indicates if all the existing sensitive types are used for data discovery. If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    private final Boolean isIncludeAllSensitiveTypes;

    /**
     * Indicates if all the existing sensitive types are used for data discovery. If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used.
     *
     * @return the value
     **/
    public Boolean getIsIncludeAllSensitiveTypes() {
        return isIncludeAllSensitiveTypes;
    }

    /**
     * The total number of schemas scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSchemasScanned")
    private final Long totalSchemasScanned;

    /**
     * The total number of schemas scanned by the discovery job.
     * @return the value
     **/
    public Long getTotalSchemasScanned() {
        return totalSchemasScanned;
    }

    /**
     * The total number of objects (tables and editioning views) scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
    private final Long totalObjectsScanned;

    /**
     * The total number of objects (tables and editioning views) scanned by the discovery job.
     * @return the value
     **/
    public Long getTotalObjectsScanned() {
        return totalObjectsScanned;
    }

    /**
     * The total number of columns scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalColumnsScanned")
    private final Long totalColumnsScanned;

    /**
     * The total number of columns scanned by the discovery job.
     * @return the value
     **/
    public Long getTotalColumnsScanned() {
        return totalColumnsScanned;
    }

    /**
     * The total number of new sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalNewSensitiveColumns")
    private final Long totalNewSensitiveColumns;

    /**
     * The total number of new sensitive columns identified by the discovery job.
     * @return the value
     **/
    public Long getTotalNewSensitiveColumns() {
        return totalNewSensitiveColumns;
    }

    /**
     * The total number of modified sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalModifiedSensitiveColumns")
    private final Long totalModifiedSensitiveColumns;

    /**
     * The total number of modified sensitive columns identified by the discovery job.
     * @return the value
     **/
    public Long getTotalModifiedSensitiveColumns() {
        return totalModifiedSensitiveColumns;
    }

    /**
     * The total number of deleted sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDeletedSensitiveColumns")
    private final Long totalDeletedSensitiveColumns;

    /**
     * The total number of deleted sensitive columns identified by the discovery job.
     * @return the value
     **/
    public Long getTotalDeletedSensitiveColumns() {
        return totalDeletedSensitiveColumns;
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
        sb.append("DiscoveryJob(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", discoveryType=").append(String.valueOf(this.discoveryType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
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
        sb.append(", totalSchemasScanned=").append(String.valueOf(this.totalSchemasScanned));
        sb.append(", totalObjectsScanned=").append(String.valueOf(this.totalObjectsScanned));
        sb.append(", totalColumnsScanned=").append(String.valueOf(this.totalColumnsScanned));
        sb.append(", totalNewSensitiveColumns=")
                .append(String.valueOf(this.totalNewSensitiveColumns));
        sb.append(", totalModifiedSensitiveColumns=")
                .append(String.valueOf(this.totalModifiedSensitiveColumns));
        sb.append(", totalDeletedSensitiveColumns=")
                .append(String.valueOf(this.totalDeletedSensitiveColumns));
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
        if (!(o instanceof DiscoveryJob)) {
            return false;
        }

        DiscoveryJob other = (DiscoveryJob) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.discoveryType, other.discoveryType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.targetId, other.targetId)
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
                && java.util.Objects.equals(this.totalSchemasScanned, other.totalSchemasScanned)
                && java.util.Objects.equals(this.totalObjectsScanned, other.totalObjectsScanned)
                && java.util.Objects.equals(this.totalColumnsScanned, other.totalColumnsScanned)
                && java.util.Objects.equals(
                        this.totalNewSensitiveColumns, other.totalNewSensitiveColumns)
                && java.util.Objects.equals(
                        this.totalModifiedSensitiveColumns, other.totalModifiedSensitiveColumns)
                && java.util.Objects.equals(
                        this.totalDeletedSensitiveColumns, other.totalDeletedSensitiveColumns)
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
        result =
                (result * PRIME)
                        + (this.discoveryType == null ? 43 : this.discoveryType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.totalSchemasScanned == null
                                ? 43
                                : this.totalSchemasScanned.hashCode());
        result =
                (result * PRIME)
                        + (this.totalObjectsScanned == null
                                ? 43
                                : this.totalObjectsScanned.hashCode());
        result =
                (result * PRIME)
                        + (this.totalColumnsScanned == null
                                ? 43
                                : this.totalColumnsScanned.hashCode());
        result =
                (result * PRIME)
                        + (this.totalNewSensitiveColumns == null
                                ? 43
                                : this.totalNewSensitiveColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.totalModifiedSensitiveColumns == null
                                ? 43
                                : this.totalModifiedSensitiveColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.totalDeletedSensitiveColumns == null
                                ? 43
                                : this.totalDeletedSensitiveColumns.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
