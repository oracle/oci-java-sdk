/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * an external Oracle pluggable database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalPluggableDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalPluggableDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceId",
        "externalContainerDatabaseId",
        "operationsInsightsConfig",
        "compartmentId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "displayName",
        "id",
        "lifecycleDetails",
        "lifecycleState",
        "timeCreated",
        "dbUniqueName",
        "dbId",
        "databaseVersion",
        "databaseEdition",
        "timeZone",
        "characterSet",
        "ncharacterSet",
        "dbPacks",
        "databaseConfiguration",
        "databaseManagementConfig",
        "stackMonitoringConfig"
    })
    public ExternalPluggableDatabase(
            String sourceId,
            String externalContainerDatabaseId,
            OperationsInsightsConfig operationsInsightsConfig,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String displayName,
            String id,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String dbUniqueName,
            String dbId,
            String databaseVersion,
            DatabaseEdition databaseEdition,
            String timeZone,
            String characterSet,
            String ncharacterSet,
            String dbPacks,
            DatabaseConfiguration databaseConfiguration,
            DatabaseManagementConfig databaseManagementConfig,
            StackMonitoringConfig stackMonitoringConfig) {
        super();
        this.sourceId = sourceId;
        this.externalContainerDatabaseId = externalContainerDatabaseId;
        this.operationsInsightsConfig = operationsInsightsConfig;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.displayName = displayName;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.dbUniqueName = dbUniqueName;
        this.dbId = dbId;
        this.databaseVersion = databaseVersion;
        this.databaseEdition = databaseEdition;
        this.timeZone = timeZone;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.dbPacks = dbPacks;
        this.databaseConfiguration = databaseConfiguration;
        this.databaseManagementConfig = databaseManagementConfig;
        this.stackMonitoringConfig = stackMonitoringConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * the non-container database that was converted to a pluggable database to create this
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * the non-container database that was converted to a pluggable database to create this
         * resource.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
         * createExternalContainerDatabaseDetails} that contains the specified {@link
         * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
         * createExternalPluggableDatabaseDetails} resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
        private String externalContainerDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
         * createExternalContainerDatabaseDetails} that contains the specified {@link
         * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
         * createExternalPluggableDatabaseDetails} resource.
         *
         * @param externalContainerDatabaseId the value to set
         * @return this builder
         */
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = externalContainerDatabaseId;
            this.__explicitlySet__.add("externalContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConfig")
        private OperationsInsightsConfig operationsInsightsConfig;

        public Builder operationsInsightsConfig(OperationsInsightsConfig operationsInsightsConfig) {
            this.operationsInsightsConfig = operationsInsightsConfig;
            this.__explicitlySet__.add("operationsInsightsConfig");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The user-friendly name for the external database. The name does not have to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the external database. The name does not have to be unique.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure external database resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure external database resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current state of the Oracle Cloud Infrastructure external database resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Oracle Cloud Infrastructure external database resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time the database was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the database was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The {@code DB_UNIQUE_NAME} of the external database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The {@code DB_UNIQUE_NAME} of the external database.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /**
         * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle
         * Cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle
         * Cloud.
         *
         * @param dbId the value to set
         * @return this builder
         */
        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
            return this;
        }
        /** The Oracle Database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The Oracle Database version.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         *
         * @param databaseEdition the value to set
         * @return this builder
         */
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /**
         * The time zone of the external database. It is a time zone offset (a character type in the
         * format '[+|-]TZH:TZM') or a time zone region name, depending on how the time zone value
         * was specified when the database was created / last altered.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone of the external database. It is a time zone offset (a character type in the
         * format '[+|-]TZH:TZM') or a time zone region name, depending on how the time zone value
         * was specified when the database was created / last altered.
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /** The character set of the external database. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set of the external database.
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /** The national character of the external database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character of the external database.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /** The database packs licensed for the external Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPacks")
        private String dbPacks;

        /**
         * The database packs licensed for the external Oracle Database.
         *
         * @param dbPacks the value to set
         * @return this builder
         */
        public Builder dbPacks(String dbPacks) {
            this.dbPacks = dbPacks;
            this.__explicitlySet__.add("dbPacks");
            return this;
        }
        /** The Oracle Database configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseConfiguration")
        private DatabaseConfiguration databaseConfiguration;

        /**
         * The Oracle Database configuration
         *
         * @param databaseConfiguration the value to set
         * @return this builder
         */
        public Builder databaseConfiguration(DatabaseConfiguration databaseConfiguration) {
            this.databaseConfiguration = databaseConfiguration;
            this.__explicitlySet__.add("databaseConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private DatabaseManagementConfig databaseManagementConfig;

        public Builder databaseManagementConfig(DatabaseManagementConfig databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConfig")
        private StackMonitoringConfig stackMonitoringConfig;

        public Builder stackMonitoringConfig(StackMonitoringConfig stackMonitoringConfig) {
            this.stackMonitoringConfig = stackMonitoringConfig;
            this.__explicitlySet__.add("stackMonitoringConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalPluggableDatabase build() {
            ExternalPluggableDatabase model =
                    new ExternalPluggableDatabase(
                            this.sourceId,
                            this.externalContainerDatabaseId,
                            this.operationsInsightsConfig,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.displayName,
                            this.id,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.timeCreated,
                            this.dbUniqueName,
                            this.dbId,
                            this.databaseVersion,
                            this.databaseEdition,
                            this.timeZone,
                            this.characterSet,
                            this.ncharacterSet,
                            this.dbPacks,
                            this.databaseConfiguration,
                            this.databaseManagementConfig,
                            this.stackMonitoringConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalPluggableDatabase model) {
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("externalContainerDatabaseId")) {
                this.externalContainerDatabaseId(model.getExternalContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("operationsInsightsConfig")) {
                this.operationsInsightsConfig(model.getOperationsInsightsConfig());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("dbPacks")) {
                this.dbPacks(model.getDbPacks());
            }
            if (model.wasPropertyExplicitlySet("databaseConfiguration")) {
                this.databaseConfiguration(model.getDatabaseConfiguration());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementConfig")) {
                this.databaseManagementConfig(model.getDatabaseManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("stackMonitoringConfig")) {
                this.stackMonitoringConfig(model.getStackMonitoringConfig());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the the
     * non-container database that was converted to a pluggable database to create this resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the the
     * non-container database that was converted to a pluggable database to create this resource.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} that contains the specified {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
    private final String externalContainerDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest)
     * createExternalContainerDatabaseDetails} that contains the specified {@link
     * #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest)
     * createExternalPluggableDatabaseDetails} resource.
     *
     * @return the value
     */
    public String getExternalContainerDatabaseId() {
        return externalContainerDatabaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConfig")
    private final OperationsInsightsConfig operationsInsightsConfig;

    public OperationsInsightsConfig getOperationsInsightsConfig() {
        return operationsInsightsConfig;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The user-friendly name for the external database. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the external database. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure external database resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure external database resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current state of the Oracle Cloud Infrastructure external database resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        NotConnected("NOT_CONNECTED"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Oracle Cloud Infrastructure external database resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Oracle Cloud Infrastructure external database resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the database was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the database was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The {@code DB_UNIQUE_NAME} of the external database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The {@code DB_UNIQUE_NAME} of the external database.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
    }

    /** The Oracle Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The Oracle Database version.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionDeveloper("ENTERPRISE_EDITION_DEVELOPER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseEdition.class);

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseEdition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The time zone of the external database. It is a time zone offset (a character type in the
     * format '[+|-]TZH:TZM') or a time zone region name, depending on how the time zone value was
     * specified when the database was created / last altered.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone of the external database. It is a time zone offset (a character type in the
     * format '[+|-]TZH:TZM') or a time zone region name, depending on how the time zone value was
     * specified when the database was created / last altered.
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /** The character set of the external database. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set of the external database.
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /** The national character of the external database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character of the external database.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /** The database packs licensed for the external Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPacks")
    private final String dbPacks;

    /**
     * The database packs licensed for the external Oracle Database.
     *
     * @return the value
     */
    public String getDbPacks() {
        return dbPacks;
    }

    /** The Oracle Database configuration */
    public enum DatabaseConfiguration implements com.oracle.bmc.http.internal.BmcEnum {
        Rac("RAC"),
        SingleInstance("SINGLE_INSTANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseConfiguration.class);

        private final String value;
        private static java.util.Map<String, DatabaseConfiguration> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseConfiguration v : DatabaseConfiguration.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseConfiguration(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseConfiguration create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseConfiguration', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The Oracle Database configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseConfiguration")
    private final DatabaseConfiguration databaseConfiguration;

    /**
     * The Oracle Database configuration
     *
     * @return the value
     */
    public DatabaseConfiguration getDatabaseConfiguration() {
        return databaseConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    private final DatabaseManagementConfig databaseManagementConfig;

    public DatabaseManagementConfig getDatabaseManagementConfig() {
        return databaseManagementConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConfig")
    private final StackMonitoringConfig stackMonitoringConfig;

    public StackMonitoringConfig getStackMonitoringConfig() {
        return stackMonitoringConfig;
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
        sb.append("ExternalPluggableDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", externalContainerDatabaseId=")
                .append(String.valueOf(this.externalContainerDatabaseId));
        sb.append(", operationsInsightsConfig=")
                .append(String.valueOf(this.operationsInsightsConfig));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbId=").append(String.valueOf(this.dbId));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", dbPacks=").append(String.valueOf(this.dbPacks));
        sb.append(", databaseConfiguration=").append(String.valueOf(this.databaseConfiguration));
        sb.append(", databaseManagementConfig=")
                .append(String.valueOf(this.databaseManagementConfig));
        sb.append(", stackMonitoringConfig=").append(String.valueOf(this.stackMonitoringConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalPluggableDatabase)) {
            return false;
        }

        ExternalPluggableDatabase other = (ExternalPluggableDatabase) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(
                        this.externalContainerDatabaseId, other.externalContainerDatabaseId)
                && java.util.Objects.equals(
                        this.operationsInsightsConfig, other.operationsInsightsConfig)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.dbPacks, other.dbPacks)
                && java.util.Objects.equals(this.databaseConfiguration, other.databaseConfiguration)
                && java.util.Objects.equals(
                        this.databaseManagementConfig, other.databaseManagementConfig)
                && java.util.Objects.equals(this.stackMonitoringConfig, other.stackMonitoringConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalContainerDatabaseId == null
                                ? 43
                                : this.externalContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsConfig == null
                                ? 43
                                : this.operationsInsightsConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.dbPacks == null ? 43 : this.dbPacks.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseConfiguration == null
                                ? 43
                                : this.databaseConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConfig == null
                                ? 43
                                : this.databaseManagementConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.stackMonitoringConfig == null
                                ? 43
                                : this.stackMonitoringConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
