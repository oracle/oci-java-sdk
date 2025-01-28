/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database HA and backup details. <br>
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
        builder = DatabaseHaBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseHaBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "flashBackOn",
        "flashBackTime",
        "recoveryWindowGoalInDays",
        "lastFullBackupSummary",
        "backupHistory",
        "metrics",
        "dbId",
        "compartmentId",
        "databaseType",
        "databaseSubType",
        "deploymentType",
        "databaseVersion",
        "workloadType",
        "databaseName",
        "databaseId",
        "dbUniqueName",
        "dbRole"
    })
    public DatabaseHaBackupDetails(
            String flashBackOn,
            java.util.Date flashBackTime,
            Integer recoveryWindowGoalInDays,
            DatabaseBackupSummary lastFullBackupSummary,
            java.util.List<DatabaseBackupSummary> backupHistory,
            java.util.List<HaMetricDefinition> metrics,
            String dbId,
            String compartmentId,
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            DeploymentType deploymentType,
            String databaseVersion,
            WorkloadType workloadType,
            String databaseName,
            String databaseId,
            String dbUniqueName,
            DbRole dbRole) {
        super();
        this.flashBackOn = flashBackOn;
        this.flashBackTime = flashBackTime;
        this.recoveryWindowGoalInDays = recoveryWindowGoalInDays;
        this.lastFullBackupSummary = lastFullBackupSummary;
        this.backupHistory = backupHistory;
        this.metrics = metrics;
        this.dbId = dbId;
        this.compartmentId = compartmentId;
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.deploymentType = deploymentType;
        this.databaseVersion = databaseVersion;
        this.workloadType = workloadType;
        this.databaseName = databaseName;
        this.databaseId = databaseId;
        this.dbUniqueName = dbUniqueName;
        this.dbRole = dbRole;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether flashback is enabled for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("flashBackOn")
        private String flashBackOn;

        /**
         * Indicates whether flashback is enabled for the database.
         *
         * @param flashBackOn the value to set
         * @return this builder
         */
        public Builder flashBackOn(String flashBackOn) {
            this.flashBackOn = flashBackOn;
            this.__explicitlySet__.add("flashBackOn");
            return this;
        }
        /**
         * The oldest flashback date and time in UTC in ISO-8601 format, which is
         * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("flashBackTime")
        private java.util.Date flashBackTime;

        /**
         * The oldest flashback date and time in UTC in ISO-8601 format, which is
         * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param flashBackTime the value to set
         * @return this builder
         */
        public Builder flashBackTime(java.util.Date flashBackTime) {
            this.flashBackTime = flashBackTime;
            this.__explicitlySet__.add("flashBackTime");
            return this;
        }
        /** The configured number of days intended to recover a protected database from a backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowGoalInDays")
        private Integer recoveryWindowGoalInDays;

        /**
         * The configured number of days intended to recover a protected database from a backup.
         *
         * @param recoveryWindowGoalInDays the value to set
         * @return this builder
         */
        public Builder recoveryWindowGoalInDays(Integer recoveryWindowGoalInDays) {
            this.recoveryWindowGoalInDays = recoveryWindowGoalInDays;
            this.__explicitlySet__.add("recoveryWindowGoalInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastFullBackupSummary")
        private DatabaseBackupSummary lastFullBackupSummary;

        public Builder lastFullBackupSummary(DatabaseBackupSummary lastFullBackupSummary) {
            this.lastFullBackupSummary = lastFullBackupSummary;
            this.__explicitlySet__.add("lastFullBackupSummary");
            return this;
        }
        /** A list of database backups. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupHistory")
        private java.util.List<DatabaseBackupSummary> backupHistory;

        /**
         * A list of database backups.
         *
         * @param backupHistory the value to set
         * @return this builder
         */
        public Builder backupHistory(java.util.List<DatabaseBackupSummary> backupHistory) {
            this.backupHistory = backupHistory;
            this.__explicitlySet__.add("backupHistory");
            return this;
        }
        /** A list of database backup metrics such as BackupSize and BackupDuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<HaMetricDefinition> metrics;

        /**
         * A list of database backup metrics such as BackupSize and BackupDuration.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<HaMetricDefinition> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param dbId the value to set
         * @return this builder
         */
        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the Managed Database resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where the Managed Database resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
         * The subtype of the Oracle Database. Indicates whether the database is a Container
         * Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous
         * Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container
         * Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous
         * Container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         */
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /** The infrastructure used to deploy the Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The infrastructure used to deploy the Oracle Database.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
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
        /** The workload type of the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private WorkloadType workloadType;

        /**
         * The workload type of the Autonomous Database.
         *
         * @param workloadType the value to set
         * @return this builder
         */
        public Builder workloadType(WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /** The display name of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The display name of the Managed Database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is
         * captured here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is
         * captured here.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The database unique name of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The database unique name of the Managed Database.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /** The database role of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
        private DbRole dbRole;

        /**
         * The database role of the Managed Database.
         *
         * @param dbRole the value to set
         * @return this builder
         */
        public Builder dbRole(DbRole dbRole) {
            this.dbRole = dbRole;
            this.__explicitlySet__.add("dbRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseHaBackupDetails build() {
            DatabaseHaBackupDetails model =
                    new DatabaseHaBackupDetails(
                            this.flashBackOn,
                            this.flashBackTime,
                            this.recoveryWindowGoalInDays,
                            this.lastFullBackupSummary,
                            this.backupHistory,
                            this.metrics,
                            this.dbId,
                            this.compartmentId,
                            this.databaseType,
                            this.databaseSubType,
                            this.deploymentType,
                            this.databaseVersion,
                            this.workloadType,
                            this.databaseName,
                            this.databaseId,
                            this.dbUniqueName,
                            this.dbRole);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseHaBackupDetails model) {
            if (model.wasPropertyExplicitlySet("flashBackOn")) {
                this.flashBackOn(model.getFlashBackOn());
            }
            if (model.wasPropertyExplicitlySet("flashBackTime")) {
                this.flashBackTime(model.getFlashBackTime());
            }
            if (model.wasPropertyExplicitlySet("recoveryWindowGoalInDays")) {
                this.recoveryWindowGoalInDays(model.getRecoveryWindowGoalInDays());
            }
            if (model.wasPropertyExplicitlySet("lastFullBackupSummary")) {
                this.lastFullBackupSummary(model.getLastFullBackupSummary());
            }
            if (model.wasPropertyExplicitlySet("backupHistory")) {
                this.backupHistory(model.getBackupHistory());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseSubType")) {
                this.databaseSubType(model.getDatabaseSubType());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbRole")) {
                this.dbRole(model.getDbRole());
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

    /** Indicates whether flashback is enabled for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("flashBackOn")
    private final String flashBackOn;

    /**
     * Indicates whether flashback is enabled for the database.
     *
     * @return the value
     */
    public String getFlashBackOn() {
        return flashBackOn;
    }

    /**
     * The oldest flashback date and time in UTC in ISO-8601 format, which is
     * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flashBackTime")
    private final java.util.Date flashBackTime;

    /**
     * The oldest flashback date and time in UTC in ISO-8601 format, which is
     * "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     * @return the value
     */
    public java.util.Date getFlashBackTime() {
        return flashBackTime;
    }

    /** The configured number of days intended to recover a protected database from a backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowGoalInDays")
    private final Integer recoveryWindowGoalInDays;

    /**
     * The configured number of days intended to recover a protected database from a backup.
     *
     * @return the value
     */
    public Integer getRecoveryWindowGoalInDays() {
        return recoveryWindowGoalInDays;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastFullBackupSummary")
    private final DatabaseBackupSummary lastFullBackupSummary;

    public DatabaseBackupSummary getLastFullBackupSummary() {
        return lastFullBackupSummary;
    }

    /** A list of database backups. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupHistory")
    private final java.util.List<DatabaseBackupSummary> backupHistory;

    /**
     * A list of database backups.
     *
     * @return the value
     */
    public java.util.List<DatabaseBackupSummary> getBackupHistory() {
        return backupHistory;
    }

    /** A list of database backup metrics such as BackupSize and BackupDuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<HaMetricDefinition> metrics;

    /**
     * A list of database backup metrics such as BackupSize and BackupDuration.
     *
     * @return the value
     */
    public java.util.List<HaMetricDefinition> getMetrics() {
        return metrics;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the Managed Database resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where the Managed Database resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container
     * Database.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /** The infrastructure used to deploy the Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The infrastructure used to deploy the Oracle Database.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
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

    /** The workload type of the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final WorkloadType workloadType;

    /**
     * The workload type of the Autonomous Database.
     *
     * @return the value
     */
    public WorkloadType getWorkloadType() {
        return workloadType;
    }

    /** The display name of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The display name of the Managed Database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is
     * captured here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is
     * captured here.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The database unique name of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The database unique name of the Managed Database.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /** The database role of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
    private final DbRole dbRole;

    /**
     * The database role of the Managed Database.
     *
     * @return the value
     */
    public DbRole getDbRole() {
        return dbRole;
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
        sb.append("DatabaseHaBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("flashBackOn=").append(String.valueOf(this.flashBackOn));
        sb.append(", flashBackTime=").append(String.valueOf(this.flashBackTime));
        sb.append(", recoveryWindowGoalInDays=")
                .append(String.valueOf(this.recoveryWindowGoalInDays));
        sb.append(", lastFullBackupSummary=").append(String.valueOf(this.lastFullBackupSummary));
        sb.append(", backupHistory=").append(String.valueOf(this.backupHistory));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", dbId=").append(String.valueOf(this.dbId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbRole=").append(String.valueOf(this.dbRole));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseHaBackupDetails)) {
            return false;
        }

        DatabaseHaBackupDetails other = (DatabaseHaBackupDetails) o;
        return java.util.Objects.equals(this.flashBackOn, other.flashBackOn)
                && java.util.Objects.equals(this.flashBackTime, other.flashBackTime)
                && java.util.Objects.equals(
                        this.recoveryWindowGoalInDays, other.recoveryWindowGoalInDays)
                && java.util.Objects.equals(this.lastFullBackupSummary, other.lastFullBackupSummary)
                && java.util.Objects.equals(this.backupHistory, other.backupHistory)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbRole, other.dbRole)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.flashBackOn == null ? 43 : this.flashBackOn.hashCode());
        result =
                (result * PRIME)
                        + (this.flashBackTime == null ? 43 : this.flashBackTime.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryWindowGoalInDays == null
                                ? 43
                                : this.recoveryWindowGoalInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.lastFullBackupSummary == null
                                ? 43
                                : this.lastFullBackupSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.backupHistory == null ? 43 : this.backupHistory.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbRole == null ? 43 : this.dbRole.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
