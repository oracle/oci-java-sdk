/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle Database on a bare metal or virtual machine DB system. For more information, see [Bare
 * Metal and Virtual Machine DB
 * Systems](https://docs.oracle.com/iaas/Content/Database/Concepts/overview.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "characterSet",
        "ncharacterSet",
        "dbHomeId",
        "dbSystemId",
        "vmClusterId",
        "dbName",
        "pdbName",
        "dbWorkload",
        "dbUniqueName",
        "lifecycleDetails",
        "lifecycleState",
        "timeCreated",
        "lastBackupTimestamp",
        "lastBackupDurationInSeconds",
        "lastFailedBackupTimestamp",
        "dbBackupConfig",
        "freeformTags",
        "definedTags",
        "systemTags",
        "connectionStrings",
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "sourceDatabasePointInTimeRecoveryTimestamp",
        "databaseSoftwareImageId",
        "isCdb",
        "databaseManagementConfig",
        "sidPrefix",
        "keyStoreId",
        "keyStoreWalletName",
        "dataGuardGroup",
        "encryptionKeyLocationDetails"
    })
    public DatabaseSummary(
            String id,
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbHomeId,
            String dbSystemId,
            String vmClusterId,
            String dbName,
            String pdbName,
            String dbWorkload,
            String dbUniqueName,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date lastBackupTimestamp,
            Integer lastBackupDurationInSeconds,
            java.util.Date lastFailedBackupTimestamp,
            DbBackupConfig dbBackupConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            DatabaseConnectionStrings connectionStrings,
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            java.util.Date sourceDatabasePointInTimeRecoveryTimestamp,
            String databaseSoftwareImageId,
            Boolean isCdb,
            CloudDatabaseManagementConfig databaseManagementConfig,
            String sidPrefix,
            String keyStoreId,
            String keyStoreWalletName,
            DataGuardGroup dataGuardGroup,
            EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.dbHomeId = dbHomeId;
        this.dbSystemId = dbSystemId;
        this.vmClusterId = vmClusterId;
        this.dbName = dbName;
        this.pdbName = pdbName;
        this.dbWorkload = dbWorkload;
        this.dbUniqueName = dbUniqueName;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.lastBackupTimestamp = lastBackupTimestamp;
        this.lastBackupDurationInSeconds = lastBackupDurationInSeconds;
        this.lastFailedBackupTimestamp = lastFailedBackupTimestamp;
        this.dbBackupConfig = dbBackupConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.connectionStrings = connectionStrings;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.sourceDatabasePointInTimeRecoveryTimestamp =
                sourceDatabasePointInTimeRecoveryTimestamp;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.isCdb = isCdb;
        this.databaseManagementConfig = databaseManagementConfig;
        this.sidPrefix = sidPrefix;
        this.keyStoreId = keyStoreId;
        this.keyStoreWalletName = keyStoreWalletName;
        this.dataGuardGroup = dataGuardGroup;
        this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        /** The character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database.
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /** The national character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Home.
         *
         * @param dbHomeId the value to set
         * @return this builder
         */
        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB system.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM cluster.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /** The database name. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The database name.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /**
         * The name of the pluggable database. The name must begin with an alphabetic character and
         * can contain a maximum of thirty alphanumeric characters. Special characters are not
         * permitted. Pluggable database should not be same as database name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        /**
         * The name of the pluggable database. The name must begin with an alphabetic character and
         * can contain a maximum of thirty alphanumeric characters. Special characters are not
         * permitted. Pluggable database should not be same as database name.
         *
         * @param pdbName the value to set
         * @return this builder
         */
        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }
        /**
         * **Deprecated.** The dbWorkload field has been deprecated for Exadata Database Service on
         * Dedicated Infrastructure, Exadata Database Service on Cloud@Customer, and Base Database
         * Service. Support for this attribute will end in November 2023. You may choose to update
         * your custom scripts to exclude the dbWorkload attribute. After November 2023 if you pass
         * a value to the dbWorkload attribute, it will be ignored.
         *
         * <p>The database workload type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private String dbWorkload;

        /**
         * **Deprecated.** The dbWorkload field has been deprecated for Exadata Database Service on
         * Dedicated Infrastructure, Exadata Database Service on Cloud@Customer, and Base Database
         * Service. Support for this attribute will end in November 2023. You may choose to update
         * your custom scripts to exclude the dbWorkload attribute. After November 2023 if you pass
         * a value to the dbWorkload attribute, it will be ignored.
         *
         * <p>The database workload type.
         *
         * @param dbWorkload the value to set
         * @return this builder
         */
        public Builder dbWorkload(String dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /**
         * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard
         * group (a primary database and its standby databases). The unique name cannot be changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard
         * group (a primary database and its standby databases). The unique name cannot be changed.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
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
        /** The current state of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the database.
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
        /** The date and time when the latest database backup was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
        private java.util.Date lastBackupTimestamp;

        /**
         * The date and time when the latest database backup was created.
         *
         * @param lastBackupTimestamp the value to set
         * @return this builder
         */
        public Builder lastBackupTimestamp(java.util.Date lastBackupTimestamp) {
            this.lastBackupTimestamp = lastBackupTimestamp;
            this.__explicitlySet__.add("lastBackupTimestamp");
            return this;
        }
        /** The duration when the latest database backup created. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastBackupDurationInSeconds")
        private Integer lastBackupDurationInSeconds;

        /**
         * The duration when the latest database backup created.
         *
         * @param lastBackupDurationInSeconds the value to set
         * @return this builder
         */
        public Builder lastBackupDurationInSeconds(Integer lastBackupDurationInSeconds) {
            this.lastBackupDurationInSeconds = lastBackupDurationInSeconds;
            this.__explicitlySet__.add("lastBackupDurationInSeconds");
            return this;
        }
        /** The date and time when the latest database backup failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastFailedBackupTimestamp")
        private java.util.Date lastFailedBackupTimestamp;

        /**
         * The date and time when the latest database backup failed.
         *
         * @param lastFailedBackupTimestamp the value to set
         * @return this builder
         */
        public Builder lastFailedBackupTimestamp(java.util.Date lastFailedBackupTimestamp) {
            this.lastFailedBackupTimestamp = lastFailedBackupTimestamp;
            this.__explicitlySet__.add("lastFailedBackupTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
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
        /** The Connection strings used to connect to the Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private DatabaseConnectionStrings connectionStrings;

        /**
         * The Connection strings used to connect to the Oracle Database.
         *
         * @param connectionStrings the value to set
         * @return this builder
         */
        public Builder connectionStrings(DatabaseConnectionStrings connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }
        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation. Autonomous
         * Database Serverless does not use key versions, hence is not applicable for Autonomous
         * Database Serverless instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions. If none is specified,
         * the current key version (latest) of the Key Id is used for the operation. Autonomous
         * Database Serverless does not use key versions, hence is not applicable for Autonomous
         * Database Serverless instances.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code secretId} are required for Customer Managed Keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code secretId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * Point in time recovery timeStamp of the source database at which cloned database system
         * is cloned from the source database system, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
        private java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

        /**
         * Point in time recovery timeStamp of the source database at which cloned database system
         * is cloned from the source database system, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)
         *
         * @param sourceDatabasePointInTimeRecoveryTimestamp the value to set
         * @return this builder
         */
        public Builder sourceDatabasePointInTimeRecoveryTimestamp(
                java.util.Date sourceDatabasePointInTimeRecoveryTimestamp) {
            this.sourceDatabasePointInTimeRecoveryTimestamp =
                    sourceDatabasePointInTimeRecoveryTimestamp;
            this.__explicitlySet__.add("sourceDatabasePointInTimeRecoveryTimestamp");
            return this;
        }
        /**
         * The database software image
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        /**
         * The database software image
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         *
         * @param databaseSoftwareImageId the value to set
         * @return this builder
         */
        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }
        /** True if the database is a container database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCdb")
        private Boolean isCdb;

        /**
         * True if the database is a container database.
         *
         * @param isCdb the value to set
         * @return this builder
         */
        public Builder isCdb(Boolean isCdb) {
            this.isCdb = isCdb;
            this.__explicitlySet__.add("isCdb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private CloudDatabaseManagementConfig databaseManagementConfig;

        public Builder databaseManagementConfig(
                CloudDatabaseManagementConfig databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }
        /** Specifies a prefix for the {@code Oracle SID} of the database to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
        private String sidPrefix;

        /**
         * Specifies a prefix for the {@code Oracle SID} of the database to be created.
         *
         * @param sidPrefix the value to set
         * @return this builder
         */
        public Builder sidPrefix(String sidPrefix) {
            this.sidPrefix = sidPrefix;
            this.__explicitlySet__.add("sidPrefix");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * key store of Oracle Vault.
         *
         * @param keyStoreId the value to set
         * @return this builder
         */
        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }
        /** The wallet name for Oracle Key Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
        private String keyStoreWalletName;

        /**
         * The wallet name for Oracle Key Vault.
         *
         * @param keyStoreWalletName the value to set
         * @return this builder
         */
        public Builder keyStoreWalletName(String keyStoreWalletName) {
            this.keyStoreWalletName = keyStoreWalletName;
            this.__explicitlySet__.add("keyStoreWalletName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataGuardGroup")
        private DataGuardGroup dataGuardGroup;

        public Builder dataGuardGroup(DataGuardGroup dataGuardGroup) {
            this.dataGuardGroup = dataGuardGroup;
            this.__explicitlySet__.add("dataGuardGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails encryptionKeyLocationDetails;

        public Builder encryptionKeyLocationDetails(
                EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
            this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
            this.__explicitlySet__.add("encryptionKeyLocationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSummary build() {
            DatabaseSummary model =
                    new DatabaseSummary(
                            this.id,
                            this.compartmentId,
                            this.characterSet,
                            this.ncharacterSet,
                            this.dbHomeId,
                            this.dbSystemId,
                            this.vmClusterId,
                            this.dbName,
                            this.pdbName,
                            this.dbWorkload,
                            this.dbUniqueName,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.timeCreated,
                            this.lastBackupTimestamp,
                            this.lastBackupDurationInSeconds,
                            this.lastFailedBackupTimestamp,
                            this.dbBackupConfig,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.connectionStrings,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.vaultId,
                            this.sourceDatabasePointInTimeRecoveryTimestamp,
                            this.databaseSoftwareImageId,
                            this.isCdb,
                            this.databaseManagementConfig,
                            this.sidPrefix,
                            this.keyStoreId,
                            this.keyStoreWalletName,
                            this.dataGuardGroup,
                            this.encryptionKeyLocationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("dbHomeId")) {
                this.dbHomeId(model.getDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("pdbName")) {
                this.pdbName(model.getPdbName());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
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
            if (model.wasPropertyExplicitlySet("lastBackupTimestamp")) {
                this.lastBackupTimestamp(model.getLastBackupTimestamp());
            }
            if (model.wasPropertyExplicitlySet("lastBackupDurationInSeconds")) {
                this.lastBackupDurationInSeconds(model.getLastBackupDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("lastFailedBackupTimestamp")) {
                this.lastFailedBackupTimestamp(model.getLastFailedBackupTimestamp());
            }
            if (model.wasPropertyExplicitlySet("dbBackupConfig")) {
                this.dbBackupConfig(model.getDbBackupConfig());
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
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabasePointInTimeRecoveryTimestamp")) {
                this.sourceDatabasePointInTimeRecoveryTimestamp(
                        model.getSourceDatabasePointInTimeRecoveryTimestamp());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("isCdb")) {
                this.isCdb(model.getIsCdb());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementConfig")) {
                this.databaseManagementConfig(model.getDatabaseManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("sidPrefix")) {
                this.sidPrefix(model.getSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreWalletName")) {
                this.keyStoreWalletName(model.getKeyStoreWalletName());
            }
            if (model.wasPropertyExplicitlySet("dataGuardGroup")) {
                this.dataGuardGroup(model.getDataGuardGroup());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyLocationDetails")) {
                this.encryptionKeyLocationDetails(model.getEncryptionKeyLocationDetails());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** The character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database.
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /** The national character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Home.
     *
     * @return the value
     */
    public String getDbHomeId() {
        return dbHomeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * system.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * cluster.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    /** The database name. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The database name.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * The name of the pluggable database. The name must begin with an alphabetic character and can
     * contain a maximum of thirty alphanumeric characters. Special characters are not permitted.
     * Pluggable database should not be same as database name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    private final String pdbName;

    /**
     * The name of the pluggable database. The name must begin with an alphabetic character and can
     * contain a maximum of thirty alphanumeric characters. Special characters are not permitted.
     * Pluggable database should not be same as database name.
     *
     * @return the value
     */
    public String getPdbName() {
        return pdbName;
    }

    /**
     * **Deprecated.** The dbWorkload field has been deprecated for Exadata Database Service on
     * Dedicated Infrastructure, Exadata Database Service on Cloud@Customer, and Base Database
     * Service. Support for this attribute will end in November 2023. You may choose to update your
     * custom scripts to exclude the dbWorkload attribute. After November 2023 if you pass a value
     * to the dbWorkload attribute, it will be ignored.
     *
     * <p>The database workload type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final String dbWorkload;

    /**
     * **Deprecated.** The dbWorkload field has been deprecated for Exadata Database Service on
     * Dedicated Infrastructure, Exadata Database Service on Cloud@Customer, and Base Database
     * Service. Support for this attribute will end in November 2023. You may choose to update your
     * custom scripts to exclude the dbWorkload attribute. After November 2023 if you pass a value
     * to the dbWorkload attribute, it will be ignored.
     *
     * <p>The database workload type.
     *
     * @return the value
     */
    public String getDbWorkload() {
        return dbWorkload;
    }

    /**
     * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard
     * group (a primary database and its standby databases). The unique name cannot be changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard
     * group (a primary database and its standby databases). The unique name cannot be changed.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
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

    /** The current state of the database. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Upgrading("UPGRADING"),
        Converting("CONVERTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        RestoreFailed("RESTORE_FAILED"),
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
    /** The current state of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the database.
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

    /** The date and time when the latest database backup was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
    private final java.util.Date lastBackupTimestamp;

    /**
     * The date and time when the latest database backup was created.
     *
     * @return the value
     */
    public java.util.Date getLastBackupTimestamp() {
        return lastBackupTimestamp;
    }

    /** The duration when the latest database backup created. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastBackupDurationInSeconds")
    private final Integer lastBackupDurationInSeconds;

    /**
     * The duration when the latest database backup created.
     *
     * @return the value
     */
    public Integer getLastBackupDurationInSeconds() {
        return lastBackupDurationInSeconds;
    }

    /** The date and time when the latest database backup failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastFailedBackupTimestamp")
    private final java.util.Date lastFailedBackupTimestamp;

    /**
     * The date and time when the latest database backup failed.
     *
     * @return the value
     */
    public java.util.Date getLastFailedBackupTimestamp() {
        return lastFailedBackupTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    private final DbBackupConfig dbBackupConfig;

    public DbBackupConfig getDbBackupConfig() {
        return dbBackupConfig;
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

    /** The Connection strings used to connect to the Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final DatabaseConnectionStrings connectionStrings;

    /**
     * The Connection strings used to connect to the Oracle Database.
     *
     * @return the value
     */
    public DatabaseConnectionStrings getConnectionStrings() {
        return connectionStrings;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless
     * does not use key versions, hence is not applicable for Autonomous Database Serverless
     * instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless
     * does not use key versions, hence is not applicable for Autonomous Database Serverless
     * instances.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Point in time recovery timeStamp of the source database at which cloned database system is
     * cloned from the source database system, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
    private final java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

    /**
     * Point in time recovery timeStamp of the source database at which cloned database system is
     * cloned from the source database system, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getSourceDatabasePointInTimeRecoveryTimestamp() {
        return sourceDatabasePointInTimeRecoveryTimestamp;
    }

    /**
     * The database software image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /** True if the database is a container database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCdb")
    private final Boolean isCdb;

    /**
     * True if the database is a container database.
     *
     * @return the value
     */
    public Boolean getIsCdb() {
        return isCdb;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    private final CloudDatabaseManagementConfig databaseManagementConfig;

    public CloudDatabaseManagementConfig getDatabaseManagementConfig() {
        return databaseManagementConfig;
    }

    /** Specifies a prefix for the {@code Oracle SID} of the database to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("sidPrefix")
    private final String sidPrefix;

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     * @return the value
     */
    public String getSidPrefix() {
        return sidPrefix;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     *
     * @return the value
     */
    public String getKeyStoreId() {
        return keyStoreId;
    }

    /** The wallet name for Oracle Key Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
    private final String keyStoreWalletName;

    /**
     * The wallet name for Oracle Key Vault.
     *
     * @return the value
     */
    public String getKeyStoreWalletName() {
        return keyStoreWalletName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataGuardGroup")
    private final DataGuardGroup dataGuardGroup;

    public DataGuardGroup getDataGuardGroup() {
        return dataGuardGroup;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
    private final EncryptionKeyLocationDetails encryptionKeyLocationDetails;

    public EncryptionKeyLocationDetails getEncryptionKeyLocationDetails() {
        return encryptionKeyLocationDetails;
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
        sb.append("DatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", pdbName=").append(String.valueOf(this.pdbName));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lastBackupTimestamp=").append(String.valueOf(this.lastBackupTimestamp));
        sb.append(", lastBackupDurationInSeconds=")
                .append(String.valueOf(this.lastBackupDurationInSeconds));
        sb.append(", lastFailedBackupTimestamp=")
                .append(String.valueOf(this.lastFailedBackupTimestamp));
        sb.append(", dbBackupConfig=").append(String.valueOf(this.dbBackupConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", sourceDatabasePointInTimeRecoveryTimestamp=")
                .append(String.valueOf(this.sourceDatabasePointInTimeRecoveryTimestamp));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", isCdb=").append(String.valueOf(this.isCdb));
        sb.append(", databaseManagementConfig=")
                .append(String.valueOf(this.databaseManagementConfig));
        sb.append(", sidPrefix=").append(String.valueOf(this.sidPrefix));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", keyStoreWalletName=").append(String.valueOf(this.keyStoreWalletName));
        sb.append(", dataGuardGroup=").append(String.valueOf(this.dataGuardGroup));
        sb.append(", encryptionKeyLocationDetails=")
                .append(String.valueOf(this.encryptionKeyLocationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseSummary)) {
            return false;
        }

        DatabaseSummary other = (DatabaseSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.pdbName, other.pdbName)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lastBackupTimestamp, other.lastBackupTimestamp)
                && java.util.Objects.equals(
                        this.lastBackupDurationInSeconds, other.lastBackupDurationInSeconds)
                && java.util.Objects.equals(
                        this.lastFailedBackupTimestamp, other.lastFailedBackupTimestamp)
                && java.util.Objects.equals(this.dbBackupConfig, other.dbBackupConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.sourceDatabasePointInTimeRecoveryTimestamp,
                        other.sourceDatabasePointInTimeRecoveryTimestamp)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.isCdb, other.isCdb)
                && java.util.Objects.equals(
                        this.databaseManagementConfig, other.databaseManagementConfig)
                && java.util.Objects.equals(this.sidPrefix, other.sidPrefix)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.keyStoreWalletName, other.keyStoreWalletName)
                && java.util.Objects.equals(this.dataGuardGroup, other.dataGuardGroup)
                && java.util.Objects.equals(
                        this.encryptionKeyLocationDetails, other.encryptionKeyLocationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.pdbName == null ? 43 : this.pdbName.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lastBackupTimestamp == null
                                ? 43
                                : this.lastBackupTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.lastBackupDurationInSeconds == null
                                ? 43
                                : this.lastBackupDurationInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.lastFailedBackupTimestamp == null
                                ? 43
                                : this.lastFailedBackupTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.dbBackupConfig == null ? 43 : this.dbBackupConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDatabasePointInTimeRecoveryTimestamp == null
                                ? 43
                                : this.sourceDatabasePointInTimeRecoveryTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result = (result * PRIME) + (this.isCdb == null ? 43 : this.isCdb.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConfig == null
                                ? 43
                                : this.databaseManagementConfig.hashCode());
        result = (result * PRIME) + (this.sidPrefix == null ? 43 : this.sidPrefix.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreWalletName == null
                                ? 43
                                : this.keyStoreWalletName.hashCode());
        result =
                (result * PRIME)
                        + (this.dataGuardGroup == null ? 43 : this.dataGuardGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKeyLocationDetails == null
                                ? 43
                                : this.encryptionKeyLocationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
