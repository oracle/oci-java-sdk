/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of an external database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalDatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalDatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "dbUniqueName",
        "databaseType",
        "databaseSubType",
        "externalContainerDatabaseId",
        "externalDbHomeId",
        "dbSystemInfo",
        "dbManagementConfig",
        "instanceDetails",
        "lifecycleState",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "dbmgmtFeatureConfigs",
        "databaseVersion",
        "databasePlatformName"
    })
    public ExternalDatabaseSummary(
            String id,
            String displayName,
            String compartmentId,
            String dbUniqueName,
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            String externalContainerDatabaseId,
            String externalDbHomeId,
            ExternalDbSystemBasicInfo dbSystemInfo,
            DatabaseManagementConfig dbManagementConfig,
            java.util.List<ExternalDatabaseInstance> instanceDetails,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs,
            String databaseVersion,
            String databasePlatformName) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.dbUniqueName = dbUniqueName;
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.externalContainerDatabaseId = externalContainerDatabaseId;
        this.externalDbHomeId = externalDbHomeId;
        this.dbSystemInfo = dbSystemInfo;
        this.dbManagementConfig = dbManagementConfig;
        this.instanceDetails = instanceDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.dbmgmtFeatureConfigs = dbmgmtFeatureConfigs;
        this.databaseVersion = databaseVersion;
        this.databasePlatformName = databasePlatformName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the database. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the database. The name does not have to be unique.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
        /** The type of Oracle Database installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of Oracle Database installation.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The subtype of Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, or Non-container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, or Non-container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         */
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * parent Container Database (CDB) if this is a Pluggable Database (PDB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
        private String externalContainerDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * parent Container Database (CDB) if this is a Pluggable Database (PDB).
         *
         * @param externalContainerDatabaseId the value to set
         * @return this builder
         */
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = externalContainerDatabaseId;
            this.__explicitlySet__.add("externalContainerDatabaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbHomeId")
        private String externalDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB home.
         *
         * @param externalDbHomeId the value to set
         * @return this builder
         */
        public Builder externalDbHomeId(String externalDbHomeId) {
            this.externalDbHomeId = externalDbHomeId;
            this.__explicitlySet__.add("externalDbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemInfo")
        private ExternalDbSystemBasicInfo dbSystemInfo;

        public Builder dbSystemInfo(ExternalDbSystemBasicInfo dbSystemInfo) {
            this.dbSystemInfo = dbSystemInfo;
            this.__explicitlySet__.add("dbSystemInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbManagementConfig")
        private DatabaseManagementConfig dbManagementConfig;

        public Builder dbManagementConfig(DatabaseManagementConfig dbManagementConfig) {
            this.dbManagementConfig = dbManagementConfig;
            this.__explicitlySet__.add("dbManagementConfig");
            return this;
        }
        /** The list of database instances if the database is a RAC database. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
        private java.util.List<ExternalDatabaseInstance> instanceDetails;

        /**
         * The list of database instances if the database is a RAC database.
         *
         * @param instanceDetails the value to set
         * @return this builder
         */
        public Builder instanceDetails(java.util.List<ExternalDatabaseInstance> instanceDetails) {
            this.instanceDetails = instanceDetails;
            this.__explicitlySet__.add("instanceDetails");
            return this;
        }
        /** The current lifecycle state of the external database resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the external database resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time the external DB system was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the external DB system was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** The list of feature configurations */
        @com.fasterxml.jackson.annotation.JsonProperty("dbmgmtFeatureConfigs")
        private java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs;

        /**
         * The list of feature configurations
         *
         * @param dbmgmtFeatureConfigs the value to set
         * @return this builder
         */
        public Builder dbmgmtFeatureConfigs(
                java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs) {
            this.dbmgmtFeatureConfigs = dbmgmtFeatureConfigs;
            this.__explicitlySet__.add("dbmgmtFeatureConfigs");
            return this;
        }
        /** The Oracle database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The Oracle database version.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** The operating system of database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databasePlatformName")
        private String databasePlatformName;

        /**
         * The operating system of database.
         *
         * @param databasePlatformName the value to set
         * @return this builder
         */
        public Builder databasePlatformName(String databasePlatformName) {
            this.databasePlatformName = databasePlatformName;
            this.__explicitlySet__.add("databasePlatformName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalDatabaseSummary build() {
            ExternalDatabaseSummary model =
                    new ExternalDatabaseSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.dbUniqueName,
                            this.databaseType,
                            this.databaseSubType,
                            this.externalContainerDatabaseId,
                            this.externalDbHomeId,
                            this.dbSystemInfo,
                            this.dbManagementConfig,
                            this.instanceDetails,
                            this.lifecycleState,
                            this.timeCreated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.dbmgmtFeatureConfigs,
                            this.databaseVersion,
                            this.databasePlatformName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseSubType")) {
                this.databaseSubType(model.getDatabaseSubType());
            }
            if (model.wasPropertyExplicitlySet("externalContainerDatabaseId")) {
                this.externalContainerDatabaseId(model.getExternalContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("externalDbHomeId")) {
                this.externalDbHomeId(model.getExternalDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemInfo")) {
                this.dbSystemInfo(model.getDbSystemInfo());
            }
            if (model.wasPropertyExplicitlySet("dbManagementConfig")) {
                this.dbManagementConfig(model.getDbManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("instanceDetails")) {
                this.instanceDetails(model.getInstanceDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
            if (model.wasPropertyExplicitlySet("dbmgmtFeatureConfigs")) {
                this.dbmgmtFeatureConfigs(model.getDbmgmtFeatureConfigs());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("databasePlatformName")) {
                this.databasePlatformName(model.getDatabasePlatformName());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the database. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the database. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** The type of Oracle Database installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of Oracle Database installation.
     *
     * @return the value
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The subtype of Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, or Non-container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, or Non-container Database.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * parent Container Database (CDB) if this is a Pluggable Database (PDB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
    private final String externalContainerDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * parent Container Database (CDB) if this is a Pluggable Database (PDB).
     *
     * @return the value
     */
    public String getExternalContainerDatabaseId() {
        return externalContainerDatabaseId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbHomeId")
    private final String externalDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB home.
     *
     * @return the value
     */
    public String getExternalDbHomeId() {
        return externalDbHomeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemInfo")
    private final ExternalDbSystemBasicInfo dbSystemInfo;

    public ExternalDbSystemBasicInfo getDbSystemInfo() {
        return dbSystemInfo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbManagementConfig")
    private final DatabaseManagementConfig dbManagementConfig;

    public DatabaseManagementConfig getDbManagementConfig() {
        return dbManagementConfig;
    }

    /** The list of database instances if the database is a RAC database. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
    private final java.util.List<ExternalDatabaseInstance> instanceDetails;

    /**
     * The list of database instances if the database is a RAC database.
     *
     * @return the value
     */
    public java.util.List<ExternalDatabaseInstance> getInstanceDetails() {
        return instanceDetails;
    }

    /** The current lifecycle state of the external database resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
    /** The current lifecycle state of the external database resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the external database resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the external DB system was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the external DB system was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The list of feature configurations */
    @com.fasterxml.jackson.annotation.JsonProperty("dbmgmtFeatureConfigs")
    private final java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs;

    /**
     * The list of feature configurations
     *
     * @return the value
     */
    public java.util.List<DatabaseFeatureConfiguration> getDbmgmtFeatureConfigs() {
        return dbmgmtFeatureConfigs;
    }

    /** The Oracle database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The Oracle database version.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** The operating system of database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databasePlatformName")
    private final String databasePlatformName;

    /**
     * The operating system of database.
     *
     * @return the value
     */
    public String getDatabasePlatformName() {
        return databasePlatformName;
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
        sb.append("ExternalDatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", externalContainerDatabaseId=")
                .append(String.valueOf(this.externalContainerDatabaseId));
        sb.append(", externalDbHomeId=").append(String.valueOf(this.externalDbHomeId));
        sb.append(", dbSystemInfo=").append(String.valueOf(this.dbSystemInfo));
        sb.append(", dbManagementConfig=").append(String.valueOf(this.dbManagementConfig));
        sb.append(", instanceDetails=").append(String.valueOf(this.instanceDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", dbmgmtFeatureConfigs=").append(String.valueOf(this.dbmgmtFeatureConfigs));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", databasePlatformName=").append(String.valueOf(this.databasePlatformName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDatabaseSummary)) {
            return false;
        }

        ExternalDatabaseSummary other = (ExternalDatabaseSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(
                        this.externalContainerDatabaseId, other.externalContainerDatabaseId)
                && java.util.Objects.equals(this.externalDbHomeId, other.externalDbHomeId)
                && java.util.Objects.equals(this.dbSystemInfo, other.dbSystemInfo)
                && java.util.Objects.equals(this.dbManagementConfig, other.dbManagementConfig)
                && java.util.Objects.equals(this.instanceDetails, other.instanceDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.dbmgmtFeatureConfigs, other.dbmgmtFeatureConfigs)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.databasePlatformName, other.databasePlatformName)
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
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.externalContainerDatabaseId == null
                                ? 43
                                : this.externalContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbHomeId == null ? 43 : this.externalDbHomeId.hashCode());
        result = (result * PRIME) + (this.dbSystemInfo == null ? 43 : this.dbSystemInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.dbManagementConfig == null
                                ? 43
                                : this.dbManagementConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDetails == null ? 43 : this.instanceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dbmgmtFeatureConfigs == null
                                ? 43
                                : this.dbmgmtFeatureConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.databasePlatformName == null
                                ? 43
                                : this.databasePlatformName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
