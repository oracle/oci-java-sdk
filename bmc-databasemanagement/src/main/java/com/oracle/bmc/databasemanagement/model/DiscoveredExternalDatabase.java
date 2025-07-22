/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external Oracle Database discovered in an external DB system discovery run.
 * <br>
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
        builder = DiscoveredExternalDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiscoveredExternalDatabase extends DiscoveredExternalDbSystemComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("componentId")
        private String componentId;

        public Builder componentId(String componentId) {
            this.componentId = componentId;
            this.__explicitlySet__.add("componentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSelectedForMonitoring")
        private Boolean isSelectedForMonitoring;

        public Builder isSelectedForMonitoring(Boolean isSelectedForMonitoring) {
            this.isSelectedForMonitoring = isSelectedForMonitoring;
            this.__explicitlySet__.add("isSelectedForMonitoring");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedComponents")
        private java.util.List<AssociatedComponent> associatedComponents;

        public Builder associatedComponents(
                java.util.List<AssociatedComponent> associatedComponents) {
            this.associatedComponents = associatedComponents;
            this.__explicitlySet__.add("associatedComponents");
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
         * The type of Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, or a Non-container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbType")
        private DatabaseSubType dbType;

        /**
         * The type of Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, or a Non-container Database.
         *
         * @param dbType the value to set
         * @return this builder
         */
        public Builder dbType(DatabaseSubType dbType) {
            this.dbType = dbType;
            this.__explicitlySet__.add("dbType");
            return this;
        }
        /** Indicates whether the Oracle Database is part of a cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Indicates whether the Oracle Database is part of a cluster.
         *
         * @param isCluster the value to set
         * @return this builder
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /** The Oracle Database edition. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbEdition")
        private String dbEdition;

        /**
         * The Oracle Database edition.
         *
         * @param dbEdition the value to set
         * @return this builder
         */
        public Builder dbEdition(String dbEdition) {
            this.dbEdition = dbEdition;
            this.__explicitlySet__.add("dbEdition");
            return this;
        }
        /** The Oracle Database ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * The Oracle Database ID.
         *
         * @param dbId the value to set
         * @return this builder
         */
        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
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
        /** The role of the Oracle Database in Oracle Data Guard configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
        private DbRole dbRole;

        /**
         * The role of the Oracle Database in Oracle Data Guard configuration.
         *
         * @param dbRole the value to set
         * @return this builder
         */
        public Builder dbRole(DbRole dbRole) {
            this.dbRole = dbRole;
            this.__explicitlySet__.add("dbRole");
            return this;
        }
        /** The Oracle Database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The Oracle Database version.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** The list of Pluggable Databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
        private java.util.List<DiscoveredExternalPluggableDatabase> pluggableDatabases;

        /**
         * The list of Pluggable Databases.
         *
         * @param pluggableDatabases the value to set
         * @return this builder
         */
        public Builder pluggableDatabases(
                java.util.List<DiscoveredExternalPluggableDatabase> pluggableDatabases) {
            this.pluggableDatabases = pluggableDatabases;
            this.__explicitlySet__.add("pluggableDatabases");
            return this;
        }
        /** The list of database instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbInstances")
        private java.util.List<DiscoveredExternalDbInstance> dbInstances;

        /**
         * The list of database instances.
         *
         * @param dbInstances the value to set
         * @return this builder
         */
        public Builder dbInstances(java.util.List<DiscoveredExternalDbInstance> dbInstances) {
            this.dbInstances = dbInstances;
            this.__explicitlySet__.add("dbInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connector")
        private ExternalDbSystemDiscoveryConnector connector;

        public Builder connector(ExternalDbSystemDiscoveryConnector connector) {
            this.connector = connector;
            this.__explicitlySet__.add("connector");
            return this;
        }
        /**
         * Indicates whether Diagnostics & Management should be enabled for all the current
         * pluggable databases in the container database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canEnableAllCurrentPdbs")
        private Boolean canEnableAllCurrentPdbs;

        /**
         * Indicates whether Diagnostics & Management should be enabled for all the current
         * pluggable databases in the container database.
         *
         * @param canEnableAllCurrentPdbs the value to set
         * @return this builder
         */
        public Builder canEnableAllCurrentPdbs(Boolean canEnableAllCurrentPdbs) {
            this.canEnableAllCurrentPdbs = canEnableAllCurrentPdbs;
            this.__explicitlySet__.add("canEnableAllCurrentPdbs");
            return this;
        }
        /**
         * Indicates whether Diagnostics & Management should be enabled automatically for all the
         * pluggable databases in the container database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoEnablePluggableDatabase")
        private Boolean isAutoEnablePluggableDatabase;

        /**
         * Indicates whether Diagnostics & Management should be enabled automatically for all the
         * pluggable databases in the container database.
         *
         * @param isAutoEnablePluggableDatabase the value to set
         * @return this builder
         */
        public Builder isAutoEnablePluggableDatabase(Boolean isAutoEnablePluggableDatabase) {
            this.isAutoEnablePluggableDatabase = isAutoEnablePluggableDatabase;
            this.__explicitlySet__.add("isAutoEnablePluggableDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveredExternalDatabase build() {
            DiscoveredExternalDatabase model =
                    new DiscoveredExternalDatabase(
                            this.componentId,
                            this.displayName,
                            this.componentName,
                            this.resourceId,
                            this.isSelectedForMonitoring,
                            this.status,
                            this.associatedComponents,
                            this.compartmentId,
                            this.dbUniqueName,
                            this.dbType,
                            this.isCluster,
                            this.dbEdition,
                            this.dbId,
                            this.dbPacks,
                            this.dbRole,
                            this.dbVersion,
                            this.pluggableDatabases,
                            this.dbInstances,
                            this.connector,
                            this.canEnableAllCurrentPdbs,
                            this.isAutoEnablePluggableDatabase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveredExternalDatabase model) {
            if (model.wasPropertyExplicitlySet("componentId")) {
                this.componentId(model.getComponentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("isSelectedForMonitoring")) {
                this.isSelectedForMonitoring(model.getIsSelectedForMonitoring());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("associatedComponents")) {
                this.associatedComponents(model.getAssociatedComponents());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbType")) {
                this.dbType(model.getDbType());
            }
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("dbEdition")) {
                this.dbEdition(model.getDbEdition());
            }
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("dbPacks")) {
                this.dbPacks(model.getDbPacks());
            }
            if (model.wasPropertyExplicitlySet("dbRole")) {
                this.dbRole(model.getDbRole());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("pluggableDatabases")) {
                this.pluggableDatabases(model.getPluggableDatabases());
            }
            if (model.wasPropertyExplicitlySet("dbInstances")) {
                this.dbInstances(model.getDbInstances());
            }
            if (model.wasPropertyExplicitlySet("connector")) {
                this.connector(model.getConnector());
            }
            if (model.wasPropertyExplicitlySet("canEnableAllCurrentPdbs")) {
                this.canEnableAllCurrentPdbs(model.getCanEnableAllCurrentPdbs());
            }
            if (model.wasPropertyExplicitlySet("isAutoEnablePluggableDatabase")) {
                this.isAutoEnablePluggableDatabase(model.getIsAutoEnablePluggableDatabase());
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

    @Deprecated
    public DiscoveredExternalDatabase(
            String componentId,
            String displayName,
            String componentName,
            String resourceId,
            Boolean isSelectedForMonitoring,
            Status status,
            java.util.List<AssociatedComponent> associatedComponents,
            String compartmentId,
            String dbUniqueName,
            DatabaseSubType dbType,
            Boolean isCluster,
            String dbEdition,
            String dbId,
            String dbPacks,
            DbRole dbRole,
            String dbVersion,
            java.util.List<DiscoveredExternalPluggableDatabase> pluggableDatabases,
            java.util.List<DiscoveredExternalDbInstance> dbInstances,
            ExternalDbSystemDiscoveryConnector connector,
            Boolean canEnableAllCurrentPdbs,
            Boolean isAutoEnablePluggableDatabase) {
        super(
                componentId,
                displayName,
                componentName,
                resourceId,
                isSelectedForMonitoring,
                status,
                associatedComponents);
        this.compartmentId = compartmentId;
        this.dbUniqueName = dbUniqueName;
        this.dbType = dbType;
        this.isCluster = isCluster;
        this.dbEdition = dbEdition;
        this.dbId = dbId;
        this.dbPacks = dbPacks;
        this.dbRole = dbRole;
        this.dbVersion = dbVersion;
        this.pluggableDatabases = pluggableDatabases;
        this.dbInstances = dbInstances;
        this.connector = connector;
        this.canEnableAllCurrentPdbs = canEnableAllCurrentPdbs;
        this.isAutoEnablePluggableDatabase = isAutoEnablePluggableDatabase;
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
     * The type of Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, or a Non-container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbType")
    private final DatabaseSubType dbType;

    /**
     * The type of Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, or a Non-container Database.
     *
     * @return the value
     */
    public DatabaseSubType getDbType() {
        return dbType;
    }

    /** Indicates whether the Oracle Database is part of a cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Indicates whether the Oracle Database is part of a cluster.
     *
     * @return the value
     */
    public Boolean getIsCluster() {
        return isCluster;
    }

    /** The Oracle Database edition. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbEdition")
    private final String dbEdition;

    /**
     * The Oracle Database edition.
     *
     * @return the value
     */
    public String getDbEdition() {
        return dbEdition;
    }

    /** The Oracle Database ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * The Oracle Database ID.
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
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

    /** The role of the Oracle Database in Oracle Data Guard configuration. */
    public enum DbRole implements com.oracle.bmc.http.internal.BmcEnum {
        LogicalStandby("LOGICAL_STANDBY"),
        PhysicalStandby("PHYSICAL_STANDBY"),
        SnapshotStandby("SNAPSHOT_STANDBY"),
        Primary("PRIMARY"),
        FarSync("FAR_SYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DbRole.class);

        private final String value;
        private static java.util.Map<String, DbRole> map;

        static {
            map = new java.util.HashMap<>();
            for (DbRole v : DbRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The role of the Oracle Database in Oracle Data Guard configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
    private final DbRole dbRole;

    /**
     * The role of the Oracle Database in Oracle Data Guard configuration.
     *
     * @return the value
     */
    public DbRole getDbRole() {
        return dbRole;
    }

    /** The Oracle Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The Oracle Database version.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** The list of Pluggable Databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
    private final java.util.List<DiscoveredExternalPluggableDatabase> pluggableDatabases;

    /**
     * The list of Pluggable Databases.
     *
     * @return the value
     */
    public java.util.List<DiscoveredExternalPluggableDatabase> getPluggableDatabases() {
        return pluggableDatabases;
    }

    /** The list of database instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbInstances")
    private final java.util.List<DiscoveredExternalDbInstance> dbInstances;

    /**
     * The list of database instances.
     *
     * @return the value
     */
    public java.util.List<DiscoveredExternalDbInstance> getDbInstances() {
        return dbInstances;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connector")
    private final ExternalDbSystemDiscoveryConnector connector;

    public ExternalDbSystemDiscoveryConnector getConnector() {
        return connector;
    }

    /**
     * Indicates whether Diagnostics & Management should be enabled for all the current pluggable
     * databases in the container database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canEnableAllCurrentPdbs")
    private final Boolean canEnableAllCurrentPdbs;

    /**
     * Indicates whether Diagnostics & Management should be enabled for all the current pluggable
     * databases in the container database.
     *
     * @return the value
     */
    public Boolean getCanEnableAllCurrentPdbs() {
        return canEnableAllCurrentPdbs;
    }

    /**
     * Indicates whether Diagnostics & Management should be enabled automatically for all the
     * pluggable databases in the container database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoEnablePluggableDatabase")
    private final Boolean isAutoEnablePluggableDatabase;

    /**
     * Indicates whether Diagnostics & Management should be enabled automatically for all the
     * pluggable databases in the container database.
     *
     * @return the value
     */
    public Boolean getIsAutoEnablePluggableDatabase() {
        return isAutoEnablePluggableDatabase;
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
        sb.append("DiscoveredExternalDatabase(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbType=").append(String.valueOf(this.dbType));
        sb.append(", isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", dbEdition=").append(String.valueOf(this.dbEdition));
        sb.append(", dbId=").append(String.valueOf(this.dbId));
        sb.append(", dbPacks=").append(String.valueOf(this.dbPacks));
        sb.append(", dbRole=").append(String.valueOf(this.dbRole));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", pluggableDatabases=").append(String.valueOf(this.pluggableDatabases));
        sb.append(", dbInstances=").append(String.valueOf(this.dbInstances));
        sb.append(", connector=").append(String.valueOf(this.connector));
        sb.append(", canEnableAllCurrentPdbs=")
                .append(String.valueOf(this.canEnableAllCurrentPdbs));
        sb.append(", isAutoEnablePluggableDatabase=")
                .append(String.valueOf(this.isAutoEnablePluggableDatabase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveredExternalDatabase)) {
            return false;
        }

        DiscoveredExternalDatabase other = (DiscoveredExternalDatabase) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbType, other.dbType)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.dbEdition, other.dbEdition)
                && java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.dbPacks, other.dbPacks)
                && java.util.Objects.equals(this.dbRole, other.dbRole)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.pluggableDatabases, other.pluggableDatabases)
                && java.util.Objects.equals(this.dbInstances, other.dbInstances)
                && java.util.Objects.equals(this.connector, other.connector)
                && java.util.Objects.equals(
                        this.canEnableAllCurrentPdbs, other.canEnableAllCurrentPdbs)
                && java.util.Objects.equals(
                        this.isAutoEnablePluggableDatabase, other.isAutoEnablePluggableDatabase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbType == null ? 43 : this.dbType.hashCode());
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result = (result * PRIME) + (this.dbEdition == null ? 43 : this.dbEdition.hashCode());
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result = (result * PRIME) + (this.dbPacks == null ? 43 : this.dbPacks.hashCode());
        result = (result * PRIME) + (this.dbRole == null ? 43 : this.dbRole.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.pluggableDatabases == null
                                ? 43
                                : this.pluggableDatabases.hashCode());
        result = (result * PRIME) + (this.dbInstances == null ? 43 : this.dbInstances.hashCode());
        result = (result * PRIME) + (this.connector == null ? 43 : this.connector.hashCode());
        result =
                (result * PRIME)
                        + (this.canEnableAllCurrentPdbs == null
                                ? 43
                                : this.canEnableAllCurrentPdbs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoEnablePluggableDatabase == null
                                ? 43
                                : this.isAutoEnablePluggableDatabase.hashCode());
        return result;
    }
}
