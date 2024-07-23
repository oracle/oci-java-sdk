/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update a sensitive data model. Note that updating any attribute of a sensitive data
 * model does not perform data discovery. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSensitiveDataModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSensitiveDataModelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "targetId",
        "appSuiteName",
        "description",
        "schemasForDiscovery",
        "tablesForDiscovery",
        "sensitiveTypeIdsForDiscovery",
        "isSampleDataCollectionEnabled",
        "isAppDefinedRelationDiscoveryEnabled",
        "freeformTags",
        "definedTags"
    })
    public UpdateSensitiveDataModelDetails(
            String displayName,
            String targetId,
            String appSuiteName,
            String description,
            java.util.List<String> schemasForDiscovery,
            java.util.List<TablesForDiscovery> tablesForDiscovery,
            java.util.List<String> sensitiveTypeIdsForDiscovery,
            Boolean isSampleDataCollectionEnabled,
            Boolean isAppDefinedRelationDiscoveryEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.targetId = targetId;
        this.appSuiteName = appSuiteName;
        this.description = description;
        this.schemasForDiscovery = schemasForDiscovery;
        this.tablesForDiscovery = tablesForDiscovery;
        this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the sensitive data model. The name does not have to be unique, and
         * it's changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the sensitive data model. The name does not have to be unique, and
         * it's changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the reference target database to be associated with the sensitive data model.
         * All operations such as performing data discovery and adding columns manually are done in
         * the context of the associated target database. Note that updating the targetId attribute
         * does not perform data discovery automatically.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the reference target database to be associated with the sensitive data model.
         * All operations such as performing data discovery and adding columns manually are done in
         * the context of the associated target database. Note that updating the targetId attribute
         * does not perform data discovery automatically.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The application suite name identifying a collection of applications. It's useful only if
         * maintaining a sensitive data model for a suite of applications.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
        private String appSuiteName;

        /**
         * The application suite name identifying a collection of applications. It's useful only if
         * maintaining a sensitive data model for a suite of applications.
         *
         * @param appSuiteName the value to set
         * @return this builder
         */
        public Builder appSuiteName(String appSuiteName) {
            this.appSuiteName = appSuiteName;
            this.__explicitlySet__.add("appSuiteName");
            return this;
        }
        /** The description of the sensitive data model. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the sensitive data model.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The schemas to be used for future data discovery jobs. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        /**
         * The schemas to be used for future data discovery jobs.
         *
         * @param schemasForDiscovery the value to set
         * @return this builder
         */
        public Builder schemasForDiscovery(java.util.List<String> schemasForDiscovery) {
            this.schemasForDiscovery = schemasForDiscovery;
            this.__explicitlySet__.add("schemasForDiscovery");
            return this;
        }
        /**
         * The data discovery jobs will scan the tables specified here, including both schemas and
         * tables. For instance, the input could be in the format: [{schemaName: "HR", tableName:
         * ["T1", "T2"]}, {schemaName: "OE", tableName : ["T3", "T4"]}].
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
        private java.util.List<TablesForDiscovery> tablesForDiscovery;

        /**
         * The data discovery jobs will scan the tables specified here, including both schemas and
         * tables. For instance, the input could be in the format: [{schemaName: "HR", tableName:
         * ["T1", "T2"]}, {schemaName: "OE", tableName : ["T3", "T4"]}].
         *
         * @param tablesForDiscovery the value to set
         * @return this builder
         */
        public Builder tablesForDiscovery(java.util.List<TablesForDiscovery> tablesForDiscovery) {
            this.tablesForDiscovery = tablesForDiscovery;
            this.__explicitlySet__.add("tablesForDiscovery");
            return this;
        }
        /**
         * The OCIDs of the sensitive types to be used for future data discovery jobs. If OCID of a
         * sensitive category is provided, all its child sensitive types are used for data
         * discovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        /**
         * The OCIDs of the sensitive types to be used for future data discovery jobs. If OCID of a
         * sensitive category is provided, all its child sensitive types are used for data
         * discovery.
         *
         * @param sensitiveTypeIdsForDiscovery the value to set
         * @return this builder
         */
        public Builder sensitiveTypeIdsForDiscovery(
                java.util.List<String> sensitiveTypeIdsForDiscovery) {
            this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeIdsForDiscovery");
            return this;
        }
        /**
         * Indicates if data discovery jobs should collect and store sample data values for the
         * discovered columns. Sample data helps review the discovered columns and ensure that they
         * actually contain sensitive data. As it collects original data from the target database,
         * it's disabled by default and should be used only if it's acceptable to store sample data
         * in Data Safe's repository in Oracle Cloud. Note that sample data values are not collected
         * for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        /**
         * Indicates if data discovery jobs should collect and store sample data values for the
         * discovered columns. Sample data helps review the discovered columns and ensure that they
         * actually contain sensitive data. As it collects original data from the target database,
         * it's disabled by default and should be used only if it's acceptable to store sample data
         * in Data Safe's repository in Oracle Cloud. Note that sample data values are not collected
         * for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         *
         * @param isSampleDataCollectionEnabled the value to set
         * @return this builder
         */
        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
            this.__explicitlySet__.add("isSampleDataCollectionEnabled");
            return this;
        }
        /**
         * Indicates if data discovery jobs should identify potential application-level
         * (non-dictionary) referential relationships between columns. Note that data discovery
         * automatically identifies and adds database-level (dictionary-defined) relationships. This
         * option helps identify application-level relationships that are not defined in the
         * database dictionary, which in turn, helps identify additional sensitive columns and
         * preserve referential integrity during data masking. It's disabled by default and should
         * be used only if there is a need to identify application-level relationships.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        /**
         * Indicates if data discovery jobs should identify potential application-level
         * (non-dictionary) referential relationships between columns. Note that data discovery
         * automatically identifies and adds database-level (dictionary-defined) relationships. This
         * option helps identify application-level relationships that are not defined in the
         * database dictionary, which in turn, helps identify additional sensitive columns and
         * preserve referential integrity during data masking. It's disabled by default and should
         * be used only if there is a need to identify application-level relationships.
         *
         * @param isAppDefinedRelationDiscoveryEnabled the value to set
         * @return this builder
         */
        public Builder isAppDefinedRelationDiscoveryEnabled(
                Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
            this.__explicitlySet__.add("isAppDefinedRelationDiscoveryEnabled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSensitiveDataModelDetails build() {
            UpdateSensitiveDataModelDetails model =
                    new UpdateSensitiveDataModelDetails(
                            this.displayName,
                            this.targetId,
                            this.appSuiteName,
                            this.description,
                            this.schemasForDiscovery,
                            this.tablesForDiscovery,
                            this.sensitiveTypeIdsForDiscovery,
                            this.isSampleDataCollectionEnabled,
                            this.isAppDefinedRelationDiscoveryEnabled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSensitiveDataModelDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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
            if (model.wasPropertyExplicitlySet("isSampleDataCollectionEnabled")) {
                this.isSampleDataCollectionEnabled(model.getIsSampleDataCollectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAppDefinedRelationDiscoveryEnabled")) {
                this.isAppDefinedRelationDiscoveryEnabled(
                        model.getIsAppDefinedRelationDiscoveryEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The display name of the sensitive data model. The name does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the sensitive data model. The name does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the reference target database to be associated with the sensitive data model. All
     * operations such as performing data discovery and adding columns manually are done in the
     * context of the associated target database. Note that updating the targetId attribute does not
     * perform data discovery automatically.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the reference target database to be associated with the sensitive data model. All
     * operations such as performing data discovery and adding columns manually are done in the
     * context of the associated target database. Note that updating the targetId attribute does not
     * perform data discovery automatically.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The application suite name identifying a collection of applications. It's useful only if
     * maintaining a sensitive data model for a suite of applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appSuiteName")
    private final String appSuiteName;

    /**
     * The application suite name identifying a collection of applications. It's useful only if
     * maintaining a sensitive data model for a suite of applications.
     *
     * @return the value
     */
    public String getAppSuiteName() {
        return appSuiteName;
    }

    /** The description of the sensitive data model. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the sensitive data model.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The schemas to be used for future data discovery jobs. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    private final java.util.List<String> schemasForDiscovery;

    /**
     * The schemas to be used for future data discovery jobs.
     *
     * @return the value
     */
    public java.util.List<String> getSchemasForDiscovery() {
        return schemasForDiscovery;
    }

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and
     * tables. For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1",
     * "T2"]}, {schemaName: "OE", tableName : ["T3", "T4"]}].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tablesForDiscovery")
    private final java.util.List<TablesForDiscovery> tablesForDiscovery;

    /**
     * The data discovery jobs will scan the tables specified here, including both schemas and
     * tables. For instance, the input could be in the format: [{schemaName: "HR", tableName: ["T1",
     * "T2"]}, {schemaName: "OE", tableName : ["T3", "T4"]}].
     *
     * @return the value
     */
    public java.util.List<TablesForDiscovery> getTablesForDiscovery() {
        return tablesForDiscovery;
    }

    /**
     * The OCIDs of the sensitive types to be used for future data discovery jobs. If OCID of a
     * sensitive category is provided, all its child sensitive types are used for data discovery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * The OCIDs of the sensitive types to be used for future data discovery jobs. If OCID of a
     * sensitive category is provided, all its child sensitive types are used for data discovery.
     *
     * @return the value
     */
    public java.util.List<String> getSensitiveTypeIdsForDiscovery() {
        return sensitiveTypeIdsForDiscovery;
    }

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the
     * discovered columns. Sample data helps review the discovered columns and ensure that they
     * actually contain sensitive data. As it collects original data from the target database, it's
     * disabled by default and should be used only if it's acceptable to store sample data in Data
     * Safe's repository in Oracle Cloud. Note that sample data values are not collected for columns
     * with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    private final Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if data discovery jobs should collect and store sample data values for the
     * discovered columns. Sample data helps review the discovered columns and ensure that they
     * actually contain sensitive data. As it collects original data from the target database, it's
     * disabled by default and should be used only if it's acceptable to store sample data in Data
     * Safe's repository in Oracle Cloud. Note that sample data values are not collected for columns
     * with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     * @return the value
     */
    public Boolean getIsSampleDataCollectionEnabled() {
        return isSampleDataCollectionEnabled;
    }

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary)
     * referential relationships between columns. Note that data discovery automatically identifies
     * and adds database-level (dictionary-defined) relationships. This option helps identify
     * application-level relationships that are not defined in the database dictionary, which in
     * turn, helps identify additional sensitive columns and preserve referential integrity during
     * data masking. It's disabled by default and should be used only if there is a need to identify
     * application-level relationships.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    private final Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if data discovery jobs should identify potential application-level (non-dictionary)
     * referential relationships between columns. Note that data discovery automatically identifies
     * and adds database-level (dictionary-defined) relationships. This option helps identify
     * application-level relationships that are not defined in the database dictionary, which in
     * turn, helps identify additional sensitive columns and preserve referential integrity during
     * data masking. It's disabled by default and should be used only if there is a need to identify
     * application-level relationships.
     *
     * @return the value
     */
    public Boolean getIsAppDefinedRelationDiscoveryEnabled() {
        return isAppDefinedRelationDiscoveryEnabled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateSensitiveDataModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", appSuiteName=").append(String.valueOf(this.appSuiteName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schemasForDiscovery=").append(String.valueOf(this.schemasForDiscovery));
        sb.append(", tablesForDiscovery=").append(String.valueOf(this.tablesForDiscovery));
        sb.append(", sensitiveTypeIdsForDiscovery=")
                .append(String.valueOf(this.sensitiveTypeIdsForDiscovery));
        sb.append(", isSampleDataCollectionEnabled=")
                .append(String.valueOf(this.isSampleDataCollectionEnabled));
        sb.append(", isAppDefinedRelationDiscoveryEnabled=")
                .append(String.valueOf(this.isAppDefinedRelationDiscoveryEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSensitiveDataModelDetails)) {
            return false;
        }

        UpdateSensitiveDataModelDetails other = (UpdateSensitiveDataModelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.appSuiteName, other.appSuiteName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.schemasForDiscovery, other.schemasForDiscovery)
                && java.util.Objects.equals(this.tablesForDiscovery, other.tablesForDiscovery)
                && java.util.Objects.equals(
                        this.sensitiveTypeIdsForDiscovery, other.sensitiveTypeIdsForDiscovery)
                && java.util.Objects.equals(
                        this.isSampleDataCollectionEnabled, other.isSampleDataCollectionEnabled)
                && java.util.Objects.equals(
                        this.isAppDefinedRelationDiscoveryEnabled,
                        other.isAppDefinedRelationDiscoveryEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
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
                        + (this.isSampleDataCollectionEnabled == null
                                ? 43
                                : this.isSampleDataCollectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAppDefinedRelationDiscoveryEnabled == null
                                ? 43
                                : this.isAppDefinedRelationDiscoveryEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
