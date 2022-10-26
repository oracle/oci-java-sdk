/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to create a new data discovery job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDiscoveryJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDiscoveryJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "discoveryType",
        "sensitiveDataModelId",
        "compartmentId",
        "displayName",
        "schemasForDiscovery",
        "sensitiveTypeIdsForDiscovery",
        "isSampleDataCollectionEnabled",
        "isAppDefinedRelationDiscoveryEnabled",
        "isIncludeAllSchemas",
        "isIncludeAllSensitiveTypes",
        "freeformTags",
        "definedTags"
    })
    public CreateDiscoveryJobDetails(
            DiscoveryJob.DiscoveryType discoveryType,
            String sensitiveDataModelId,
            String compartmentId,
            String displayName,
            java.util.List<String> schemasForDiscovery,
            java.util.List<String> sensitiveTypeIdsForDiscovery,
            Boolean isSampleDataCollectionEnabled,
            Boolean isAppDefinedRelationDiscoveryEnabled,
            Boolean isIncludeAllSchemas,
            Boolean isIncludeAllSensitiveTypes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.discoveryType = discoveryType;
        this.sensitiveDataModelId = sensitiveDataModelId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.schemasForDiscovery = schemasForDiscovery;
        this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
        this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
        this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
        this.isIncludeAllSchemas = isIncludeAllSchemas;
        this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the discovery job. It defines the job's scope. NEW identifies new sensitive
         * columns in the target database that are not in the sensitive data model. DELETED
         * identifies columns that are present in the sensitive data model but have been deleted
         * from the target database. MODIFIED identifies columns that are present in the target
         * database as well as the sensitive data model but some of their attributes have been
         * modified. ALL covers all the above three scenarios and reports new, deleted and modified
         * columns.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
        private DiscoveryJob.DiscoveryType discoveryType;

        /**
         * The type of the discovery job. It defines the job's scope. NEW identifies new sensitive
         * columns in the target database that are not in the sensitive data model. DELETED
         * identifies columns that are present in the sensitive data model but have been deleted
         * from the target database. MODIFIED identifies columns that are present in the target
         * database as well as the sensitive data model but some of their attributes have been
         * modified. ALL covers all the above three scenarios and reports new, deleted and modified
         * columns.
         *
         * @param discoveryType the value to set
         * @return this builder
         */
        public Builder discoveryType(DiscoveryJob.DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }
        /** The OCID of the sensitive data model. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        /**
         * The OCID of the sensitive data model.
         *
         * @param sensitiveDataModelId the value to set
         * @return this builder
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }
        /** The OCID of the compartment where the discovery job resource should be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the discovery job resource should be created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name for the discovery job. Does not have to be unique, and it is
         * changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the discovery job. Does not have to be unique, and it is
         * changeable. Avoid entering confidential information.
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
         * The schemas to be scanned by the discovery job. If not provided, the schemasForDiscovery
         * attribute of the sensitive data model is used to get the list of schemas.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        /**
         * The schemas to be scanned by the discovery job. If not provided, the schemasForDiscovery
         * attribute of the sensitive data model is used to get the list of schemas.
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
         * The OCIDs of the sensitive types to be used by the discovery job. If not provided, the
         * sensitiveTypeIdsForDiscovery attribute of the sensitive data model is used to get the
         * list of sensitive types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        /**
         * The OCIDs of the sensitive types to be used by the discovery job. If not provided, the
         * sensitiveTypeIdsForDiscovery attribute of the sensitive data model is used to get the
         * list of sensitive types.
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
         * Indicates if the discovery job should collect and store sample data values for the
         * discovered columns. Sample data helps review the discovered columns and ensure that they
         * actually contain sensitive data. As it collects original data from the target database,
         * it's disabled by default and should be used only if it's acceptable to store sample data
         * in Data Safe's repository in Oracle Cloud. Note that sample data values are not collected
         * for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        /**
         * Indicates if the discovery job should collect and store sample data values for the
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
         * Indicates if the discovery job should identify potential application-level
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
         * Indicates if the discovery job should identify potential application-level
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
         * Indicates if all the schemas should be scanned by the discovery job. If it's set to true,
         * the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
         * If both attributes are not provided, the configuration from the sensitive data model is
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        /**
         * Indicates if all the schemas should be scanned by the discovery job. If it's set to true,
         * the schemasForDiscovery attribute is ignored and all schemas are used for data discovery.
         * If both attributes are not provided, the configuration from the sensitive data model is
         * used.
         *
         * @param isIncludeAllSchemas the value to set
         * @return this builder
         */
        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = isIncludeAllSchemas;
            this.__explicitlySet__.add("isIncludeAllSchemas");
            return this;
        }
        /**
         * Indicates if all the existing sensitive types should be used by the discovery job. If
         * it's set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive
         * types are used for data discovery. If both attributes are not provided, the configuration
         * from the sensitive data model is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        /**
         * Indicates if all the existing sensitive types should be used by the discovery job. If
         * it's set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive
         * types are used for data discovery. If both attributes are not provided, the configuration
         * from the sensitive data model is used.
         *
         * @param isIncludeAllSensitiveTypes the value to set
         * @return this builder
         */
        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
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

        public CreateDiscoveryJobDetails build() {
            CreateDiscoveryJobDetails model =
                    new CreateDiscoveryJobDetails(
                            this.discoveryType,
                            this.sensitiveDataModelId,
                            this.compartmentId,
                            this.displayName,
                            this.schemasForDiscovery,
                            this.sensitiveTypeIdsForDiscovery,
                            this.isSampleDataCollectionEnabled,
                            this.isAppDefinedRelationDiscoveryEnabled,
                            this.isIncludeAllSchemas,
                            this.isIncludeAllSensitiveTypes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDiscoveryJobDetails model) {
            if (model.wasPropertyExplicitlySet("discoveryType")) {
                this.discoveryType(model.getDiscoveryType());
            }
            if (model.wasPropertyExplicitlySet("sensitiveDataModelId")) {
                this.sensitiveDataModelId(model.getSensitiveDataModelId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("schemasForDiscovery")) {
                this.schemasForDiscovery(model.getSchemasForDiscovery());
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
     * The type of the discovery job. It defines the job's scope. NEW identifies new sensitive
     * columns in the target database that are not in the sensitive data model. DELETED identifies
     * columns that are present in the sensitive data model but have been deleted from the target
     * database. MODIFIED identifies columns that are present in the target database as well as the
     * sensitive data model but some of their attributes have been modified. ALL covers all the
     * above three scenarios and reports new, deleted and modified columns.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    private final DiscoveryJob.DiscoveryType discoveryType;

    /**
     * The type of the discovery job. It defines the job's scope. NEW identifies new sensitive
     * columns in the target database that are not in the sensitive data model. DELETED identifies
     * columns that are present in the sensitive data model but have been deleted from the target
     * database. MODIFIED identifies columns that are present in the target database as well as the
     * sensitive data model but some of their attributes have been modified. ALL covers all the
     * above three scenarios and reports new, deleted and modified columns.
     *
     * @return the value
     */
    public DiscoveryJob.DiscoveryType getDiscoveryType() {
        return discoveryType;
    }

    /** The OCID of the sensitive data model. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    private final String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model.
     *
     * @return the value
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }

    /** The OCID of the compartment where the discovery job resource should be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the discovery job resource should be created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the discovery job. Does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the discovery job. Does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The schemas to be scanned by the discovery job. If not provided, the schemasForDiscovery
     * attribute of the sensitive data model is used to get the list of schemas.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    private final java.util.List<String> schemasForDiscovery;

    /**
     * The schemas to be scanned by the discovery job. If not provided, the schemasForDiscovery
     * attribute of the sensitive data model is used to get the list of schemas.
     *
     * @return the value
     */
    public java.util.List<String> getSchemasForDiscovery() {
        return schemasForDiscovery;
    }

    /**
     * The OCIDs of the sensitive types to be used by the discovery job. If not provided, the
     * sensitiveTypeIdsForDiscovery attribute of the sensitive data model is used to get the list of
     * sensitive types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    private final java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * The OCIDs of the sensitive types to be used by the discovery job. If not provided, the
     * sensitiveTypeIdsForDiscovery attribute of the sensitive data model is used to get the list of
     * sensitive types.
     *
     * @return the value
     */
    public java.util.List<String> getSensitiveTypeIdsForDiscovery() {
        return sensitiveTypeIdsForDiscovery;
    }

    /**
     * Indicates if the discovery job should collect and store sample data values for the discovered
     * columns. Sample data helps review the discovered columns and ensure that they actually
     * contain sensitive data. As it collects original data from the target database, it's disabled
     * by default and should be used only if it's acceptable to store sample data in Data Safe's
     * repository in Oracle Cloud. Note that sample data values are not collected for columns with
     * the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    private final Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if the discovery job should collect and store sample data values for the discovered
     * columns. Sample data helps review the discovered columns and ensure that they actually
     * contain sensitive data. As it collects original data from the target database, it's disabled
     * by default and should be used only if it's acceptable to store sample data in Data Safe's
     * repository in Oracle Cloud. Note that sample data values are not collected for columns with
     * the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     * @return the value
     */
    public Boolean getIsSampleDataCollectionEnabled() {
        return isSampleDataCollectionEnabled;
    }

    /**
     * Indicates if the discovery job should identify potential application-level (non-dictionary)
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
     * Indicates if the discovery job should identify potential application-level (non-dictionary)
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
     * Indicates if all the schemas should be scanned by the discovery job. If it's set to true, the
     * schemasForDiscovery attribute is ignored and all schemas are used for data discovery. If both
     * attributes are not provided, the configuration from the sensitive data model is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    private final Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the schemas should be scanned by the discovery job. If it's set to true, the
     * schemasForDiscovery attribute is ignored and all schemas are used for data discovery. If both
     * attributes are not provided, the configuration from the sensitive data model is used.
     *
     * @return the value
     */
    public Boolean getIsIncludeAllSchemas() {
        return isIncludeAllSchemas;
    }

    /**
     * Indicates if all the existing sensitive types should be used by the discovery job. If it's
     * set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types
     * are used for data discovery. If both attributes are not provided, the configuration from the
     * sensitive data model is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    private final Boolean isIncludeAllSensitiveTypes;

    /**
     * Indicates if all the existing sensitive types should be used by the discovery job. If it's
     * set to true, the sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types
     * are used for data discovery. If both attributes are not provided, the configuration from the
     * sensitive data model is used.
     *
     * @return the value
     */
    public Boolean getIsIncludeAllSensitiveTypes() {
        return isIncludeAllSensitiveTypes;
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
        sb.append("CreateDiscoveryJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("discoveryType=").append(String.valueOf(this.discoveryType));
        sb.append(", sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schemasForDiscovery=").append(String.valueOf(this.schemasForDiscovery));
        sb.append(", sensitiveTypeIdsForDiscovery=")
                .append(String.valueOf(this.sensitiveTypeIdsForDiscovery));
        sb.append(", isSampleDataCollectionEnabled=")
                .append(String.valueOf(this.isSampleDataCollectionEnabled));
        sb.append(", isAppDefinedRelationDiscoveryEnabled=")
                .append(String.valueOf(this.isAppDefinedRelationDiscoveryEnabled));
        sb.append(", isIncludeAllSchemas=").append(String.valueOf(this.isIncludeAllSchemas));
        sb.append(", isIncludeAllSensitiveTypes=")
                .append(String.valueOf(this.isIncludeAllSensitiveTypes));
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
        if (!(o instanceof CreateDiscoveryJobDetails)) {
            return false;
        }

        CreateDiscoveryJobDetails other = (CreateDiscoveryJobDetails) o;
        return java.util.Objects.equals(this.discoveryType, other.discoveryType)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schemasForDiscovery, other.schemasForDiscovery)
                && java.util.Objects.equals(
                        this.sensitiveTypeIdsForDiscovery, other.sensitiveTypeIdsForDiscovery)
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.discoveryType == null ? 43 : this.discoveryType.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.schemasForDiscovery == null
                                ? 43
                                : this.schemasForDiscovery.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
