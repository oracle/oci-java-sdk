/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousContainerDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousContainerDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "customerContacts",
        "dbUniqueName",
        "dbName",
        "serviceLevelAgreementType",
        "autonomousExadataInfrastructureId",
        "autonomousVmClusterId",
        "infrastructureType",
        "cloudAutonomousVmClusterId",
        "kmsKeyId",
        "vaultId",
        "kmsKeyVersionId",
        "keyHistoryEntry",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeSnapshotStandbyRevert",
        "patchModel",
        "patchId",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "maintenanceWindow",
        "standbyMaintenanceBufferInDays",
        "versionPreference",
        "isDstFileUpdateEnabled",
        "dstFileVersion",
        "freeformTags",
        "definedTags",
        "role",
        "availabilityDomain",
        "dbVersion",
        "backupConfig",
        "backupDestinationPropertiesList",
        "associatedBackupConfigurationDetails",
        "recoveryApplianceDetails",
        "keyStoreId",
        "keyStoreWalletName",
        "memoryPerOracleComputeUnitInGBs",
        "availableCpus",
        "totalCpus",
        "reclaimableCpus",
        "provisionableCpus",
        "listOneOffPatches",
        "computeModel",
        "provisionedCpus",
        "reservedCpus",
        "largestProvisionableAutonomousDatabaseInCpus",
        "timeOfLastBackup",
        "dbSplitThreshold",
        "vmFailoverReservation",
        "distributionAffinity",
        "netServicesArchitecture",
        "isMultipleStandby",
        "isDataGuardEnabled",
        "dataguard",
        "dataguardGroupMembers"
    })
    public AutonomousContainerDatabase(
            String id,
            String compartmentId,
            String displayName,
            java.util.List<CustomerContact> customerContacts,
            String dbUniqueName,
            String dbName,
            ServiceLevelAgreementType serviceLevelAgreementType,
            String autonomousExadataInfrastructureId,
            String autonomousVmClusterId,
            InfrastructureType infrastructureType,
            String cloudAutonomousVmClusterId,
            String kmsKeyId,
            String vaultId,
            String kmsKeyVersionId,
            java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeSnapshotStandbyRevert,
            PatchModel patchModel,
            String patchId,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            MaintenanceWindow maintenanceWindow,
            Integer standbyMaintenanceBufferInDays,
            VersionPreference versionPreference,
            Boolean isDstFileUpdateEnabled,
            String dstFileVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Role role,
            String availabilityDomain,
            String dbVersion,
            AutonomousContainerDatabaseBackupConfig backupConfig,
            java.util.List<BackupDestinationProperties> backupDestinationPropertiesList,
            java.util.List<BackupDestinationConfigurationSummary>
                    associatedBackupConfigurationDetails,
            RecoveryApplianceDetails recoveryApplianceDetails,
            String keyStoreId,
            String keyStoreWalletName,
            Integer memoryPerOracleComputeUnitInGBs,
            Float availableCpus,
            Integer totalCpus,
            Float reclaimableCpus,
            java.util.List<Float> provisionableCpus,
            java.util.List<String> listOneOffPatches,
            ComputeModel computeModel,
            Float provisionedCpus,
            Float reservedCpus,
            Float largestProvisionableAutonomousDatabaseInCpus,
            java.util.Date timeOfLastBackup,
            Integer dbSplitThreshold,
            Integer vmFailoverReservation,
            DistributionAffinity distributionAffinity,
            NetServicesArchitecture netServicesArchitecture,
            Boolean isMultipleStandby,
            Boolean isDataGuardEnabled,
            AutonomousContainerDatabaseDataguard dataguard,
            java.util.List<AutonomousContainerDatabaseDataguard> dataguardGroupMembers) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.customerContacts = customerContacts;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.serviceLevelAgreementType = serviceLevelAgreementType;
        this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
        this.autonomousVmClusterId = autonomousVmClusterId;
        this.infrastructureType = infrastructureType;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.kmsKeyId = kmsKeyId;
        this.vaultId = vaultId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.keyHistoryEntry = keyHistoryEntry;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeSnapshotStandbyRevert = timeSnapshotStandbyRevert;
        this.patchModel = patchModel;
        this.patchId = patchId;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.maintenanceWindow = maintenanceWindow;
        this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
        this.versionPreference = versionPreference;
        this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
        this.dstFileVersion = dstFileVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.role = role;
        this.availabilityDomain = availabilityDomain;
        this.dbVersion = dbVersion;
        this.backupConfig = backupConfig;
        this.backupDestinationPropertiesList = backupDestinationPropertiesList;
        this.associatedBackupConfigurationDetails = associatedBackupConfigurationDetails;
        this.recoveryApplianceDetails = recoveryApplianceDetails;
        this.keyStoreId = keyStoreId;
        this.keyStoreWalletName = keyStoreWalletName;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.availableCpus = availableCpus;
        this.totalCpus = totalCpus;
        this.reclaimableCpus = reclaimableCpus;
        this.provisionableCpus = provisionableCpus;
        this.listOneOffPatches = listOneOffPatches;
        this.computeModel = computeModel;
        this.provisionedCpus = provisionedCpus;
        this.reservedCpus = reservedCpus;
        this.largestProvisionableAutonomousDatabaseInCpus =
                largestProvisionableAutonomousDatabaseInCpus;
        this.timeOfLastBackup = timeOfLastBackup;
        this.dbSplitThreshold = dbSplitThreshold;
        this.vmFailoverReservation = vmFailoverReservation;
        this.distributionAffinity = distributionAffinity;
        this.netServicesArchitecture = netServicesArchitecture;
        this.isMultipleStandby = isMultipleStandby;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.dataguard = dataguard;
        this.dataguardGroupMembers = dataguardGroupMembers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Autonomous Container Database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The user-provided name for the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-provided name for the Autonomous Container Database.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Customer Contacts. Setting this to an empty list removes all customer contacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer Contacts. Setting this to an empty list removes all customer contacts.
         *
         * @param customerContacts the value to set
         * @return this builder
         */
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }
        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.
         * Do not specify a value for this parameter. Specifying a value for this field will cause
         * Terraform operations to fail.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.
         * Do not specify a value for this parameter. Specifying a value for this field will cause
         * Terraform operations to fail.
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
         * The Database name for the Autonomous Container Database. The name must be unique within
         * the Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to
         * 7 alphanumeric characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The Database name for the Autonomous Container Database. The name must be unique within
         * the Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to
         * 7 alphanumeric characters.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /** The service level agreement type of the container database. The default is STANDARD. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
        private ServiceLevelAgreementType serviceLevelAgreementType;

        /**
         * The service level agreement type of the container database. The default is STANDARD.
         *
         * @param serviceLevelAgreementType the value to set
         * @return this builder
         */
        public Builder serviceLevelAgreementType(
                ServiceLevelAgreementType serviceLevelAgreementType) {
            this.serviceLevelAgreementType = serviceLevelAgreementType;
            this.__explicitlySet__.add("serviceLevelAgreementType");
            return this;
        }
        /**
         * **No longer used.** For Autonomous Database on dedicated Exadata infrastructure, the
         * container database is created within a specified {@code cloudAutonomousVmCluster}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
        private String autonomousExadataInfrastructureId;

        /**
         * **No longer used.** For Autonomous Database on dedicated Exadata infrastructure, the
         * container database is created within a specified {@code cloudAutonomousVmCluster}.
         *
         * @param autonomousExadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            this.__explicitlySet__.add("autonomousExadataInfrastructureId");
            return this;
        }
        /** The OCID of the Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        /**
         * The OCID of the Autonomous VM Cluster.
         *
         * @param autonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }
        /** The infrastructure type this resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        /**
         * The infrastructure type this resource belongs to.
         *
         * @param infrastructureType the value to set
         * @return this builder
         */
        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous Exadata VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous Exadata VM Cluster.
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
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
        /** Key History Entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
        private java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;

        /**
         * Key History Entry.
         *
         * @param keyHistoryEntry the value to set
         * @return this builder
         */
        public Builder keyHistoryEntry(
                java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry) {
            this.keyHistoryEntry = keyHistoryEntry;
            this.__explicitlySet__.add("keyHistoryEntry");
            return this;
        }
        /** The current state of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous Container Database.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** The date and time the Autonomous Container Database was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Autonomous Container Database was created.
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
         * The date and time the Autonomous Container Database will be reverted to Standby from
         * Snapshot Standby.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotStandbyRevert")
        private java.util.Date timeSnapshotStandbyRevert;

        /**
         * The date and time the Autonomous Container Database will be reverted to Standby from
         * Snapshot Standby.
         *
         * @param timeSnapshotStandbyRevert the value to set
         * @return this builder
         */
        public Builder timeSnapshotStandbyRevert(java.util.Date timeSnapshotStandbyRevert) {
            this.timeSnapshotStandbyRevert = timeSnapshotStandbyRevert;
            this.__explicitlySet__.add("timeSnapshotStandbyRevert");
            return this;
        }
        /** Database patch model preference. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

        /**
         * Database patch model preference.
         *
         * @param patchModel the value to set
         * @return this builder
         */
        public Builder patchModel(PatchModel patchModel) {
            this.patchModel = patchModel;
            this.__explicitlySet__.add("patchModel");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last patch applied on the system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last patch applied on the system.
         *
         * @param patchId the value to set
         * @return this builder
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         *
         * @param lastMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         *
         * @param nextMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before scheduled maintenance
         * of the primary database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous
         * Container Database. This value represents the number of days before scheduled maintenance
         * of the primary database.
         *
         * @param standbyMaintenanceBufferInDays the value to set
         * @return this builder
         */
        public Builder standbyMaintenanceBufferInDays(Integer standbyMaintenanceBufferInDays) {
            this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
            this.__explicitlySet__.add("standbyMaintenanceBufferInDays");
            return this;
        }
        /** The next maintenance version preference. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
        private VersionPreference versionPreference;

        /**
         * The next maintenance version preference.
         *
         * @param versionPreference the value to set
         * @return this builder
         */
        public Builder versionPreference(VersionPreference versionPreference) {
            this.versionPreference = versionPreference;
            this.__explicitlySet__.add("versionPreference");
            return this;
        }
        /**
         * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous
         * Container Database. If enabled along with Release Update, patching will be done in a
         * Non-Rolling manner.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
        private Boolean isDstFileUpdateEnabled;

        /**
         * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous
         * Container Database. If enabled along with Release Update, patching will be done in a
         * Non-Rolling manner.
         *
         * @param isDstFileUpdateEnabled the value to set
         * @return this builder
         */
        public Builder isDstFileUpdateEnabled(Boolean isDstFileUpdateEnabled) {
            this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
            this.__explicitlySet__.add("isDstFileUpdateEnabled");
            return this;
        }
        /** DST Time-Zone File version of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dstFileVersion")
        private String dstFileVersion;

        /**
         * DST Time-Zone File version of the Autonomous Container Database.
         *
         * @param dstFileVersion the value to set
         * @return this builder
         */
        public Builder dstFileVersion(String dstFileVersion) {
            this.dstFileVersion = dstFileVersion;
            this.__explicitlySet__.add("dstFileVersion");
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
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** The availability domain of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the Autonomous Container Database.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Oracle Database version of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Oracle Database version of the Autonomous Container Database.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousContainerDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousContainerDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }
        /**
         * This list describes the backup destination properties associated with the Autonomous
         * Container Database (ACD) 's preferred backup destination. The object at a given index is
         * associated with the destination present at the same index in the backup destination
         * details list of the ACD Backup Configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationPropertiesList")
        private java.util.List<BackupDestinationProperties> backupDestinationPropertiesList;

        /**
         * This list describes the backup destination properties associated with the Autonomous
         * Container Database (ACD) 's preferred backup destination. The object at a given index is
         * associated with the destination present at the same index in the backup destination
         * details list of the ACD Backup Configuration.
         *
         * @param backupDestinationPropertiesList the value to set
         * @return this builder
         */
        public Builder backupDestinationPropertiesList(
                java.util.List<BackupDestinationProperties> backupDestinationPropertiesList) {
            this.backupDestinationPropertiesList = backupDestinationPropertiesList;
            this.__explicitlySet__.add("backupDestinationPropertiesList");
            return this;
        }
        /**
         * A backup config object holds information about preferred backup destinations only. This
         * object holds information about the associated backup destinations, such as secondary
         * backup destinations created for local backups or remote replicated backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedBackupConfigurationDetails")
        private java.util.List<BackupDestinationConfigurationSummary>
                associatedBackupConfigurationDetails;

        /**
         * A backup config object holds information about preferred backup destinations only. This
         * object holds information about the associated backup destinations, such as secondary
         * backup destinations created for local backups or remote replicated backups.
         *
         * @param associatedBackupConfigurationDetails the value to set
         * @return this builder
         */
        public Builder associatedBackupConfigurationDetails(
                java.util.List<BackupDestinationConfigurationSummary>
                        associatedBackupConfigurationDetails) {
            this.associatedBackupConfigurationDetails = associatedBackupConfigurationDetails;
            this.__explicitlySet__.add("associatedBackupConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoveryApplianceDetails")
        private RecoveryApplianceDetails recoveryApplianceDetails;

        public Builder recoveryApplianceDetails(RecoveryApplianceDetails recoveryApplianceDetails) {
            this.recoveryApplianceDetails = recoveryApplianceDetails;
            this.__explicitlySet__.add("recoveryApplianceDetails");
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
        /** The amount of memory (in GBs) enabled per ECPU or OCPU in the Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) enabled per ECPU or OCPU in the Autonomous VM Cluster.
         *
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
            return this;
        }
        /**
         * Sum of CPUs available on the Autonomous VM Cluster + Sum of reclaimable CPUs available in
         * the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Float availableCpus;

        /**
         * Sum of CPUs available on the Autonomous VM Cluster + Sum of reclaimable CPUs available in
         * the Autonomous Container Database.
         *
         * @param availableCpus the value to set
         * @return this builder
         */
        public Builder availableCpus(Float availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
            return this;
        }
        /** The number of CPUs allocated to the Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
        private Integer totalCpus;

        /**
         * The number of CPUs allocated to the Autonomous VM cluster.
         *
         * @param totalCpus the value to set
         * @return this builder
         */
        public Builder totalCpus(Integer totalCpus) {
            this.totalCpus = totalCpus;
            this.__explicitlySet__.add("totalCpus");
            return this;
        }
        /**
         * CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
            return this;
        }
        /**
         * An array of CPU values that can be used to successfully provision a single Autonomous
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
        private java.util.List<Float> provisionableCpus;

        /**
         * An array of CPU values that can be used to successfully provision a single Autonomous
         * Database.
         *
         * @param provisionableCpus the value to set
         * @return this builder
         */
        public Builder provisionableCpus(java.util.List<Float> provisionableCpus) {
            this.provisionableCpus = provisionableCpus;
            this.__explicitlySet__.add("provisionableCpus");
            return this;
        }
        /**
         * List of One-Off patches that has been successfully applied to Autonomous Container
         * Database
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listOneOffPatches")
        private java.util.List<String> listOneOffPatches;

        /**
         * List of One-Off patches that has been successfully applied to Autonomous Container
         * Database
         *
         * @param listOneOffPatches the value to set
         * @return this builder
         */
        public Builder listOneOffPatches(java.util.List<String> listOneOffPatches) {
            this.listOneOffPatches = listOneOffPatches;
            this.__explicitlySet__.add("listOneOffPatches");
            return this;
        }
        /**
         * The compute model of the Autonomous Container Database. For Autonomous Database on
         * Dedicated Exadata Infrastructure, the CPU type (ECPUs or OCPUs) is determined by the
         * parent Autonomous Exadata VM Cluster's compute model. ECPU compute model is the
         * recommended model and OCPU compute model is legacy. See [Compute Models in Autonomous
         * Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Autonomous Container Database. For Autonomous Database on
         * Dedicated Exadata Infrastructure, the CPU type (ECPUs or OCPUs) is determined by the
         * parent Autonomous Exadata VM Cluster's compute model. ECPU compute model is the
         * recommended model and OCPU compute model is legacy. See [Compute Models in Autonomous
         * Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /** The number of CPUs provisioned in an Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
        private Float provisionedCpus;

        /**
         * The number of CPUs provisioned in an Autonomous Container Database.
         *
         * @param provisionedCpus the value to set
         * @return this builder
         */
        public Builder provisionedCpus(Float provisionedCpus) {
            this.provisionedCpus = provisionedCpus;
            this.__explicitlySet__.add("provisionedCpus");
            return this;
        }
        /** The number of CPUs reserved in an Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
        private Float reservedCpus;

        /**
         * The number of CPUs reserved in an Autonomous Container Database.
         *
         * @param reservedCpus the value to set
         * @return this builder
         */
        public Builder reservedCpus(Float reservedCpus) {
            this.reservedCpus = reservedCpus;
            this.__explicitlySet__.add("reservedCpus");
            return this;
        }
        /**
         * The largest Autonomous Database (CPU) that can be created in a new Autonomous Container
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "largestProvisionableAutonomousDatabaseInCpus")
        private Float largestProvisionableAutonomousDatabaseInCpus;

        /**
         * The largest Autonomous Database (CPU) that can be created in a new Autonomous Container
         * Database.
         *
         * @param largestProvisionableAutonomousDatabaseInCpus the value to set
         * @return this builder
         */
        public Builder largestProvisionableAutonomousDatabaseInCpus(
                Float largestProvisionableAutonomousDatabaseInCpus) {
            this.largestProvisionableAutonomousDatabaseInCpus =
                    largestProvisionableAutonomousDatabaseInCpus;
            this.__explicitlySet__.add("largestProvisionableAutonomousDatabaseInCpus");
            return this;
        }
        /**
         * The timestamp of last successful backup. Here NULL value represents either there are no
         * successful backups or backups are not configured for this Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastBackup")
        private java.util.Date timeOfLastBackup;

        /**
         * The timestamp of last successful backup. Here NULL value represents either there are no
         * successful backups or backups are not configured for this Autonomous Container Database.
         *
         * @param timeOfLastBackup the value to set
         * @return this builder
         */
        public Builder timeOfLastBackup(java.util.Date timeOfLastBackup) {
            this.timeOfLastBackup = timeOfLastBackup;
            this.__explicitlySet__.add("timeOfLastBackup");
            return this;
        }
        /**
         * The CPU value beyond which an Autonomous Database will be opened across multiple nodes.
         * The default value of this attribute is 16 for OCPUs and 64 for ECPUs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSplitThreshold")
        private Integer dbSplitThreshold;

        /**
         * The CPU value beyond which an Autonomous Database will be opened across multiple nodes.
         * The default value of this attribute is 16 for OCPUs and 64 for ECPUs.
         *
         * @param dbSplitThreshold the value to set
         * @return this builder
         */
        public Builder dbSplitThreshold(Integer dbSplitThreshold) {
            this.dbSplitThreshold = dbSplitThreshold;
            this.__explicitlySet__.add("dbSplitThreshold");
            return this;
        }
        /**
         * The percentage of CPUs reserved across nodes to support node failover. Allowed values are
         * 0%, 25%, and 50%, with 50% being the default option.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmFailoverReservation")
        private Integer vmFailoverReservation;

        /**
         * The percentage of CPUs reserved across nodes to support node failover. Allowed values are
         * 0%, 25%, and 50%, with 50% being the default option.
         *
         * @param vmFailoverReservation the value to set
         * @return this builder
         */
        public Builder vmFailoverReservation(Integer vmFailoverReservation) {
            this.vmFailoverReservation = vmFailoverReservation;
            this.__explicitlySet__.add("vmFailoverReservation");
            return this;
        }
        /**
         * Determines whether an Autonomous Database must be opened across the maximum number of
         * nodes or the least number of nodes. By default, Minimum nodes is selected.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("distributionAffinity")
        private DistributionAffinity distributionAffinity;

        /**
         * Determines whether an Autonomous Database must be opened across the maximum number of
         * nodes or the least number of nodes. By default, Minimum nodes is selected.
         *
         * @param distributionAffinity the value to set
         * @return this builder
         */
        public Builder distributionAffinity(DistributionAffinity distributionAffinity) {
            this.distributionAffinity = distributionAffinity;
            this.__explicitlySet__.add("distributionAffinity");
            return this;
        }
        /**
         * Enabling SHARED server architecture enables a database server to allow many client
         * processes to share very few server processes, thereby increasing the number of supported
         * users.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("netServicesArchitecture")
        private NetServicesArchitecture netServicesArchitecture;

        /**
         * Enabling SHARED server architecture enables a database server to allow many client
         * processes to share very few server processes, thereby increasing the number of supported
         * users.
         *
         * @param netServicesArchitecture the value to set
         * @return this builder
         */
        public Builder netServicesArchitecture(NetServicesArchitecture netServicesArchitecture) {
            this.netServicesArchitecture = netServicesArchitecture;
            this.__explicitlySet__.add("netServicesArchitecture");
            return this;
        }
        /** Whether it is multiple standby Autonomous Dataguard */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultipleStandby")
        private Boolean isMultipleStandby;

        /**
         * Whether it is multiple standby Autonomous Dataguard
         *
         * @param isMultipleStandby the value to set
         * @return this builder
         */
        public Builder isMultipleStandby(Boolean isMultipleStandby) {
            this.isMultipleStandby = isMultipleStandby;
            this.__explicitlySet__.add("isMultipleStandby");
            return this;
        }
        /**
         * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data
         * Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
         * infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        /**
         * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data
         * Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
         * infrastructure.
         *
         * @param isDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataguard")
        private AutonomousContainerDatabaseDataguard dataguard;

        public Builder dataguard(AutonomousContainerDatabaseDataguard dataguard) {
            this.dataguard = dataguard;
            this.__explicitlySet__.add("dataguard");
            return this;
        }
        /** Array of Dg associations. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataguardGroupMembers")
        private java.util.List<AutonomousContainerDatabaseDataguard> dataguardGroupMembers;

        /**
         * Array of Dg associations.
         *
         * @param dataguardGroupMembers the value to set
         * @return this builder
         */
        public Builder dataguardGroupMembers(
                java.util.List<AutonomousContainerDatabaseDataguard> dataguardGroupMembers) {
            this.dataguardGroupMembers = dataguardGroupMembers;
            this.__explicitlySet__.add("dataguardGroupMembers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabase build() {
            AutonomousContainerDatabase model =
                    new AutonomousContainerDatabase(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.customerContacts,
                            this.dbUniqueName,
                            this.dbName,
                            this.serviceLevelAgreementType,
                            this.autonomousExadataInfrastructureId,
                            this.autonomousVmClusterId,
                            this.infrastructureType,
                            this.cloudAutonomousVmClusterId,
                            this.kmsKeyId,
                            this.vaultId,
                            this.kmsKeyVersionId,
                            this.keyHistoryEntry,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeSnapshotStandbyRevert,
                            this.patchModel,
                            this.patchId,
                            this.lastMaintenanceRunId,
                            this.nextMaintenanceRunId,
                            this.maintenanceWindow,
                            this.standbyMaintenanceBufferInDays,
                            this.versionPreference,
                            this.isDstFileUpdateEnabled,
                            this.dstFileVersion,
                            this.freeformTags,
                            this.definedTags,
                            this.role,
                            this.availabilityDomain,
                            this.dbVersion,
                            this.backupConfig,
                            this.backupDestinationPropertiesList,
                            this.associatedBackupConfigurationDetails,
                            this.recoveryApplianceDetails,
                            this.keyStoreId,
                            this.keyStoreWalletName,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.availableCpus,
                            this.totalCpus,
                            this.reclaimableCpus,
                            this.provisionableCpus,
                            this.listOneOffPatches,
                            this.computeModel,
                            this.provisionedCpus,
                            this.reservedCpus,
                            this.largestProvisionableAutonomousDatabaseInCpus,
                            this.timeOfLastBackup,
                            this.dbSplitThreshold,
                            this.vmFailoverReservation,
                            this.distributionAffinity,
                            this.netServicesArchitecture,
                            this.isMultipleStandby,
                            this.isDataGuardEnabled,
                            this.dataguard,
                            this.dataguardGroupMembers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("serviceLevelAgreementType")) {
                this.serviceLevelAgreementType(model.getServiceLevelAgreementType());
            }
            if (model.wasPropertyExplicitlySet("autonomousExadataInfrastructureId")) {
                this.autonomousExadataInfrastructureId(
                        model.getAutonomousExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("autonomousVmClusterId")) {
                this.autonomousVmClusterId(model.getAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("infrastructureType")) {
                this.infrastructureType(model.getInfrastructureType());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("keyHistoryEntry")) {
                this.keyHistoryEntry(model.getKeyHistoryEntry());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeSnapshotStandbyRevert")) {
                this.timeSnapshotStandbyRevert(model.getTimeSnapshotStandbyRevert());
            }
            if (model.wasPropertyExplicitlySet("patchModel")) {
                this.patchModel(model.getPatchModel());
            }
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("lastMaintenanceRunId")) {
                this.lastMaintenanceRunId(model.getLastMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceRunId")) {
                this.nextMaintenanceRunId(model.getNextMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("standbyMaintenanceBufferInDays")) {
                this.standbyMaintenanceBufferInDays(model.getStandbyMaintenanceBufferInDays());
            }
            if (model.wasPropertyExplicitlySet("versionPreference")) {
                this.versionPreference(model.getVersionPreference());
            }
            if (model.wasPropertyExplicitlySet("isDstFileUpdateEnabled")) {
                this.isDstFileUpdateEnabled(model.getIsDstFileUpdateEnabled());
            }
            if (model.wasPropertyExplicitlySet("dstFileVersion")) {
                this.dstFileVersion(model.getDstFileVersion());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("backupConfig")) {
                this.backupConfig(model.getBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("backupDestinationPropertiesList")) {
                this.backupDestinationPropertiesList(model.getBackupDestinationPropertiesList());
            }
            if (model.wasPropertyExplicitlySet("associatedBackupConfigurationDetails")) {
                this.associatedBackupConfigurationDetails(
                        model.getAssociatedBackupConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("recoveryApplianceDetails")) {
                this.recoveryApplianceDetails(model.getRecoveryApplianceDetails());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreWalletName")) {
                this.keyStoreWalletName(model.getKeyStoreWalletName());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("totalCpus")) {
                this.totalCpus(model.getTotalCpus());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionableCpus")) {
                this.provisionableCpus(model.getProvisionableCpus());
            }
            if (model.wasPropertyExplicitlySet("listOneOffPatches")) {
                this.listOneOffPatches(model.getListOneOffPatches());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
            }
            if (model.wasPropertyExplicitlySet("reservedCpus")) {
                this.reservedCpus(model.getReservedCpus());
            }
            if (model.wasPropertyExplicitlySet("largestProvisionableAutonomousDatabaseInCpus")) {
                this.largestProvisionableAutonomousDatabaseInCpus(
                        model.getLargestProvisionableAutonomousDatabaseInCpus());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastBackup")) {
                this.timeOfLastBackup(model.getTimeOfLastBackup());
            }
            if (model.wasPropertyExplicitlySet("dbSplitThreshold")) {
                this.dbSplitThreshold(model.getDbSplitThreshold());
            }
            if (model.wasPropertyExplicitlySet("vmFailoverReservation")) {
                this.vmFailoverReservation(model.getVmFailoverReservation());
            }
            if (model.wasPropertyExplicitlySet("distributionAffinity")) {
                this.distributionAffinity(model.getDistributionAffinity());
            }
            if (model.wasPropertyExplicitlySet("netServicesArchitecture")) {
                this.netServicesArchitecture(model.getNetServicesArchitecture());
            }
            if (model.wasPropertyExplicitlySet("isMultipleStandby")) {
                this.isMultipleStandby(model.getIsMultipleStandby());
            }
            if (model.wasPropertyExplicitlySet("isDataGuardEnabled")) {
                this.isDataGuardEnabled(model.getIsDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("dataguard")) {
                this.dataguard(model.getDataguard());
            }
            if (model.wasPropertyExplicitlySet("dataguardGroupMembers")) {
                this.dataguardGroupMembers(model.getDataguardGroupMembers());
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

    /** The OCID of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Autonomous Container Database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-provided name for the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-provided name for the Autonomous Container Database.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Customer Contacts. Setting this to an empty list removes all customer contacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure. Do
     * not specify a value for this parameter. Specifying a value for this field will cause
     * Terraform operations to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure. Do
     * not specify a value for this parameter. Specifying a value for this field will cause
     * Terraform operations to fail.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The Database name for the Autonomous Container Database. The name must be unique within the
     * Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to 7
     * alphanumeric characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The Database name for the Autonomous Container Database. The name must be unique within the
     * Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to 7
     * alphanumeric characters.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /** The service level agreement type of the container database. The default is STANDARD. */
    public enum ServiceLevelAgreementType implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        MissionCritical("MISSION_CRITICAL"),
        AutonomousDataguard("AUTONOMOUS_DATAGUARD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServiceLevelAgreementType.class);

        private final String value;
        private static java.util.Map<String, ServiceLevelAgreementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceLevelAgreementType v : ServiceLevelAgreementType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServiceLevelAgreementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceLevelAgreementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceLevelAgreementType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The service level agreement type of the container database. The default is STANDARD. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
    private final ServiceLevelAgreementType serviceLevelAgreementType;

    /**
     * The service level agreement type of the container database. The default is STANDARD.
     *
     * @return the value
     */
    public ServiceLevelAgreementType getServiceLevelAgreementType() {
        return serviceLevelAgreementType;
    }

    /**
     * **No longer used.** For Autonomous Database on dedicated Exadata infrastructure, the
     * container database is created within a specified {@code cloudAutonomousVmCluster}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
    private final String autonomousExadataInfrastructureId;

    /**
     * **No longer used.** For Autonomous Database on dedicated Exadata infrastructure, the
     * container database is created within a specified {@code cloudAutonomousVmCluster}.
     *
     * @return the value
     */
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }

    /** The OCID of the Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    private final String autonomousVmClusterId;

    /**
     * The OCID of the Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
    }

    /** The infrastructure type this resource belongs to. */
    public enum InfrastructureType implements com.oracle.bmc.http.internal.BmcEnum {
        Cloud("CLOUD"),
        CloudAtCustomer("CLOUD_AT_CUSTOMER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InfrastructureType.class);

        private final String value;
        private static java.util.Map<String, InfrastructureType> map;

        static {
            map = new java.util.HashMap<>();
            for (InfrastructureType v : InfrastructureType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InfrastructureType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InfrastructureType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InfrastructureType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The infrastructure type this resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    private final InfrastructureType infrastructureType;

    /**
     * The infrastructure type this resource belongs to.
     *
     * @return the value
     */
    public InfrastructureType getInfrastructureType() {
        return infrastructureType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous Exadata VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous Exadata VM Cluster.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
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

    /** Key History Entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
    private final java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;

    /**
     * Key History Entry.
     *
     * @return the value
     */
    public java.util.List<AutonomousDatabaseKeyHistoryEntry> getKeyHistoryEntry() {
        return keyHistoryEntry;
    }

    /** The current state of the Autonomous Container Database. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Restoring("RESTORING"),
        RestoreFailed("RESTORE_FAILED"),
        Restarting("RESTARTING"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        EnablingAutonomousDataGuard("ENABLING_AUTONOMOUS_DATA_GUARD"),
        Unavailable("UNAVAILABLE"),

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
    /** The current state of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous Container Database.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /** The date and time the Autonomous Container Database was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Autonomous Container Database was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Autonomous Container Database will be reverted to Standby from Snapshot
     * Standby.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotStandbyRevert")
    private final java.util.Date timeSnapshotStandbyRevert;

    /**
     * The date and time the Autonomous Container Database will be reverted to Standby from Snapshot
     * Standby.
     *
     * @return the value
     */
    public java.util.Date getTimeSnapshotStandbyRevert() {
        return timeSnapshotStandbyRevert;
    }

    /** Database patch model preference. */
    public enum PatchModel implements com.oracle.bmc.http.internal.BmcEnum {
        ReleaseUpdates("RELEASE_UPDATES"),
        ReleaseUpdateRevisions("RELEASE_UPDATE_REVISIONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchModel.class);

        private final String value;
        private static java.util.Map<String, PatchModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchModel v : PatchModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Database patch model preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    private final PatchModel patchModel;

    /**
     * Database patch model preference.
     *
     * @return the value
     */
    public PatchModel getPatchModel() {
        return patchModel;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * patch applied on the system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * patch applied on the system.
     *
     * @return the value
     */
    public String getPatchId() {
        return patchId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * maintenance run.
     *
     * @return the value
     */
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * maintenance run.
     *
     * @return the value
     */
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    private final Integer standbyMaintenanceBufferInDays;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     *
     * @return the value
     */
    public Integer getStandbyMaintenanceBufferInDays() {
        return standbyMaintenanceBufferInDays;
    }

    /** The next maintenance version preference. */
    public enum VersionPreference implements com.oracle.bmc.http.internal.BmcEnum {
        NextReleaseUpdate("NEXT_RELEASE_UPDATE"),
        LatestReleaseUpdate("LATEST_RELEASE_UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VersionPreference.class);

        private final String value;
        private static java.util.Map<String, VersionPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (VersionPreference v : VersionPreference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VersionPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VersionPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VersionPreference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The next maintenance version preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
    private final VersionPreference versionPreference;

    /**
     * The next maintenance version preference.
     *
     * @return the value
     */
    public VersionPreference getVersionPreference() {
        return versionPreference;
    }

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
    private final Boolean isDstFileUpdateEnabled;

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     *
     * @return the value
     */
    public Boolean getIsDstFileUpdateEnabled() {
        return isDstFileUpdateEnabled;
    }

    /** DST Time-Zone File version of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dstFileVersion")
    private final String dstFileVersion;

    /**
     * DST Time-Zone File version of the Autonomous Container Database.
     *
     * @return the value
     */
    public String getDstFileVersion() {
        return dstFileVersion;
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
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),
        BackupCopy("BACKUP_COPY"),
        SnapshotStandby("SNAPSHOT_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /** The availability domain of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the Autonomous Container Database.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Oracle Database version of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Oracle Database version of the Autonomous Container Database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    private final AutonomousContainerDatabaseBackupConfig backupConfig;

    public AutonomousContainerDatabaseBackupConfig getBackupConfig() {
        return backupConfig;
    }

    /**
     * This list describes the backup destination properties associated with the Autonomous
     * Container Database (ACD) 's preferred backup destination. The object at a given index is
     * associated with the destination present at the same index in the backup destination details
     * list of the ACD Backup Configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationPropertiesList")
    private final java.util.List<BackupDestinationProperties> backupDestinationPropertiesList;

    /**
     * This list describes the backup destination properties associated with the Autonomous
     * Container Database (ACD) 's preferred backup destination. The object at a given index is
     * associated with the destination present at the same index in the backup destination details
     * list of the ACD Backup Configuration.
     *
     * @return the value
     */
    public java.util.List<BackupDestinationProperties> getBackupDestinationPropertiesList() {
        return backupDestinationPropertiesList;
    }

    /**
     * A backup config object holds information about preferred backup destinations only. This
     * object holds information about the associated backup destinations, such as secondary backup
     * destinations created for local backups or remote replicated backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedBackupConfigurationDetails")
    private final java.util.List<BackupDestinationConfigurationSummary>
            associatedBackupConfigurationDetails;

    /**
     * A backup config object holds information about preferred backup destinations only. This
     * object holds information about the associated backup destinations, such as secondary backup
     * destinations created for local backups or remote replicated backups.
     *
     * @return the value
     */
    public java.util.List<BackupDestinationConfigurationSummary>
            getAssociatedBackupConfigurationDetails() {
        return associatedBackupConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recoveryApplianceDetails")
    private final RecoveryApplianceDetails recoveryApplianceDetails;

    public RecoveryApplianceDetails getRecoveryApplianceDetails() {
        return recoveryApplianceDetails;
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

    /** The amount of memory (in GBs) enabled per ECPU or OCPU in the Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) enabled per ECPU or OCPU in the Autonomous VM Cluster.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
    }

    /**
     * Sum of CPUs available on the Autonomous VM Cluster + Sum of reclaimable CPUs available in the
     * Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Float availableCpus;

    /**
     * Sum of CPUs available on the Autonomous VM Cluster + Sum of reclaimable CPUs available in the
     * Autonomous Container Database.
     *
     * @return the value
     */
    public Float getAvailableCpus() {
        return availableCpus;
    }

    /** The number of CPUs allocated to the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
    private final Integer totalCpus;

    /**
     * The number of CPUs allocated to the Autonomous VM cluster.
     *
     * @return the value
     */
    public Integer getTotalCpus() {
        return totalCpus;
    }

    /**
     * CPUs that continue to be included in the count of CPUs available to the Autonomous Container
     * Database even after one of its Autonomous Database is terminated or scaled down. You can
     * release them to the available CPUs at its parent Autonomous VM Cluster level by restarting
     * the Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * CPUs that continue to be included in the count of CPUs available to the Autonomous Container
     * Database even after one of its Autonomous Database is terminated or scaled down. You can
     * release them to the available CPUs at its parent Autonomous VM Cluster level by restarting
     * the Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
    }

    /**
     * An array of CPU values that can be used to successfully provision a single Autonomous
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
    private final java.util.List<Float> provisionableCpus;

    /**
     * An array of CPU values that can be used to successfully provision a single Autonomous
     * Database.
     *
     * @return the value
     */
    public java.util.List<Float> getProvisionableCpus() {
        return provisionableCpus;
    }

    /**
     * List of One-Off patches that has been successfully applied to Autonomous Container Database
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listOneOffPatches")
    private final java.util.List<String> listOneOffPatches;

    /**
     * List of One-Off patches that has been successfully applied to Autonomous Container Database
     *
     * @return the value
     */
    public java.util.List<String> getListOneOffPatches() {
        return listOneOffPatches;
    }

    /**
     * The compute model of the Autonomous Container Database. For Autonomous Database on Dedicated
     * Exadata Infrastructure, the CPU type (ECPUs or OCPUs) is determined by the parent Autonomous
     * Exadata VM Cluster's compute model. ECPU compute model is the recommended model and OCPU
     * compute model is legacy. See [Compute Models in Autonomous Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    public enum ComputeModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ecpu("ECPU"),
        Ocpu("OCPU"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ComputeModel.class);

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ComputeModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ComputeModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The compute model of the Autonomous Container Database. For Autonomous Database on Dedicated
     * Exadata Infrastructure, the CPU type (ECPUs or OCPUs) is determined by the parent Autonomous
     * Exadata VM Cluster's compute model. ECPU compute model is the recommended model and OCPU
     * compute model is legacy. See [Compute Models in Autonomous Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Autonomous Container Database. For Autonomous Database on Dedicated
     * Exadata Infrastructure, the CPU type (ECPUs or OCPUs) is determined by the parent Autonomous
     * Exadata VM Cluster's compute model. ECPU compute model is the recommended model and OCPU
     * compute model is legacy. See [Compute Models in Autonomous Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     *
     * @return the value
     */
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /** The number of CPUs provisioned in an Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
    private final Float provisionedCpus;

    /**
     * The number of CPUs provisioned in an Autonomous Container Database.
     *
     * @return the value
     */
    public Float getProvisionedCpus() {
        return provisionedCpus;
    }

    /** The number of CPUs reserved in an Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
    private final Float reservedCpus;

    /**
     * The number of CPUs reserved in an Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReservedCpus() {
        return reservedCpus;
    }

    /**
     * The largest Autonomous Database (CPU) that can be created in a new Autonomous Container
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("largestProvisionableAutonomousDatabaseInCpus")
    private final Float largestProvisionableAutonomousDatabaseInCpus;

    /**
     * The largest Autonomous Database (CPU) that can be created in a new Autonomous Container
     * Database.
     *
     * @return the value
     */
    public Float getLargestProvisionableAutonomousDatabaseInCpus() {
        return largestProvisionableAutonomousDatabaseInCpus;
    }

    /**
     * The timestamp of last successful backup. Here NULL value represents either there are no
     * successful backups or backups are not configured for this Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastBackup")
    private final java.util.Date timeOfLastBackup;

    /**
     * The timestamp of last successful backup. Here NULL value represents either there are no
     * successful backups or backups are not configured for this Autonomous Container Database.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastBackup() {
        return timeOfLastBackup;
    }

    /**
     * The CPU value beyond which an Autonomous Database will be opened across multiple nodes. The
     * default value of this attribute is 16 for OCPUs and 64 for ECPUs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSplitThreshold")
    private final Integer dbSplitThreshold;

    /**
     * The CPU value beyond which an Autonomous Database will be opened across multiple nodes. The
     * default value of this attribute is 16 for OCPUs and 64 for ECPUs.
     *
     * @return the value
     */
    public Integer getDbSplitThreshold() {
        return dbSplitThreshold;
    }

    /**
     * The percentage of CPUs reserved across nodes to support node failover. Allowed values are 0%,
     * 25%, and 50%, with 50% being the default option.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmFailoverReservation")
    private final Integer vmFailoverReservation;

    /**
     * The percentage of CPUs reserved across nodes to support node failover. Allowed values are 0%,
     * 25%, and 50%, with 50% being the default option.
     *
     * @return the value
     */
    public Integer getVmFailoverReservation() {
        return vmFailoverReservation;
    }

    /**
     * Determines whether an Autonomous Database must be opened across the maximum number of nodes
     * or the least number of nodes. By default, Minimum nodes is selected.
     */
    public enum DistributionAffinity implements com.oracle.bmc.http.internal.BmcEnum {
        MinimumDistribution("MINIMUM_DISTRIBUTION"),
        MaximumDistribution("MAXIMUM_DISTRIBUTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DistributionAffinity.class);

        private final String value;
        private static java.util.Map<String, DistributionAffinity> map;

        static {
            map = new java.util.HashMap<>();
            for (DistributionAffinity v : DistributionAffinity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DistributionAffinity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DistributionAffinity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DistributionAffinity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Determines whether an Autonomous Database must be opened across the maximum number of nodes
     * or the least number of nodes. By default, Minimum nodes is selected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distributionAffinity")
    private final DistributionAffinity distributionAffinity;

    /**
     * Determines whether an Autonomous Database must be opened across the maximum number of nodes
     * or the least number of nodes. By default, Minimum nodes is selected.
     *
     * @return the value
     */
    public DistributionAffinity getDistributionAffinity() {
        return distributionAffinity;
    }

    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     */
    public enum NetServicesArchitecture implements com.oracle.bmc.http.internal.BmcEnum {
        Dedicated("DEDICATED"),
        Shared("SHARED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetServicesArchitecture.class);

        private final String value;
        private static java.util.Map<String, NetServicesArchitecture> map;

        static {
            map = new java.util.HashMap<>();
            for (NetServicesArchitecture v : NetServicesArchitecture.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetServicesArchitecture(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetServicesArchitecture create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetServicesArchitecture', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("netServicesArchitecture")
    private final NetServicesArchitecture netServicesArchitecture;

    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     *
     * @return the value
     */
    public NetServicesArchitecture getNetServicesArchitecture() {
        return netServicesArchitecture;
    }

    /** Whether it is multiple standby Autonomous Dataguard */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultipleStandby")
    private final Boolean isMultipleStandby;

    /**
     * Whether it is multiple standby Autonomous Dataguard
     *
     * @return the value
     */
    public Boolean getIsMultipleStandby() {
        return isMultipleStandby;
    }

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard
     * enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous
     * Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    private final Boolean isDataGuardEnabled;

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard
     * enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous
     * Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataguard")
    private final AutonomousContainerDatabaseDataguard dataguard;

    public AutonomousContainerDatabaseDataguard getDataguard() {
        return dataguard;
    }

    /** Array of Dg associations. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataguardGroupMembers")
    private final java.util.List<AutonomousContainerDatabaseDataguard> dataguardGroupMembers;

    /**
     * Array of Dg associations.
     *
     * @return the value
     */
    public java.util.List<AutonomousContainerDatabaseDataguard> getDataguardGroupMembers() {
        return dataguardGroupMembers;
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
        sb.append("AutonomousContainerDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", serviceLevelAgreementType=")
                .append(String.valueOf(this.serviceLevelAgreementType));
        sb.append(", autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(", autonomousVmClusterId=").append(String.valueOf(this.autonomousVmClusterId));
        sb.append(", infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", keyHistoryEntry=").append(String.valueOf(this.keyHistoryEntry));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeSnapshotStandbyRevert=")
                .append(String.valueOf(this.timeSnapshotStandbyRevert));
        sb.append(", patchModel=").append(String.valueOf(this.patchModel));
        sb.append(", patchId=").append(String.valueOf(this.patchId));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", standbyMaintenanceBufferInDays=")
                .append(String.valueOf(this.standbyMaintenanceBufferInDays));
        sb.append(", versionPreference=").append(String.valueOf(this.versionPreference));
        sb.append(", isDstFileUpdateEnabled=").append(String.valueOf(this.isDstFileUpdateEnabled));
        sb.append(", dstFileVersion=").append(String.valueOf(this.dstFileVersion));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", backupConfig=").append(String.valueOf(this.backupConfig));
        sb.append(", backupDestinationPropertiesList=")
                .append(String.valueOf(this.backupDestinationPropertiesList));
        sb.append(", associatedBackupConfigurationDetails=")
                .append(String.valueOf(this.associatedBackupConfigurationDetails));
        sb.append(", recoveryApplianceDetails=")
                .append(String.valueOf(this.recoveryApplianceDetails));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", keyStoreWalletName=").append(String.valueOf(this.keyStoreWalletName));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", totalCpus=").append(String.valueOf(this.totalCpus));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", provisionableCpus=").append(String.valueOf(this.provisionableCpus));
        sb.append(", listOneOffPatches=").append(String.valueOf(this.listOneOffPatches));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", largestProvisionableAutonomousDatabaseInCpus=")
                .append(String.valueOf(this.largestProvisionableAutonomousDatabaseInCpus));
        sb.append(", timeOfLastBackup=").append(String.valueOf(this.timeOfLastBackup));
        sb.append(", dbSplitThreshold=").append(String.valueOf(this.dbSplitThreshold));
        sb.append(", vmFailoverReservation=").append(String.valueOf(this.vmFailoverReservation));
        sb.append(", distributionAffinity=").append(String.valueOf(this.distributionAffinity));
        sb.append(", netServicesArchitecture=")
                .append(String.valueOf(this.netServicesArchitecture));
        sb.append(", isMultipleStandby=").append(String.valueOf(this.isMultipleStandby));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", dataguard=").append(String.valueOf(this.dataguard));
        sb.append(", dataguardGroupMembers=").append(String.valueOf(this.dataguardGroupMembers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousContainerDatabase)) {
            return false;
        }

        AutonomousContainerDatabase other = (AutonomousContainerDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(
                        this.serviceLevelAgreementType, other.serviceLevelAgreementType)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(this.autonomousVmClusterId, other.autonomousVmClusterId)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.keyHistoryEntry, other.keyHistoryEntry)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.timeSnapshotStandbyRevert, other.timeSnapshotStandbyRevert)
                && java.util.Objects.equals(this.patchModel, other.patchModel)
                && java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(
                        this.standbyMaintenanceBufferInDays, other.standbyMaintenanceBufferInDays)
                && java.util.Objects.equals(this.versionPreference, other.versionPreference)
                && java.util.Objects.equals(
                        this.isDstFileUpdateEnabled, other.isDstFileUpdateEnabled)
                && java.util.Objects.equals(this.dstFileVersion, other.dstFileVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.backupConfig, other.backupConfig)
                && java.util.Objects.equals(
                        this.backupDestinationPropertiesList, other.backupDestinationPropertiesList)
                && java.util.Objects.equals(
                        this.associatedBackupConfigurationDetails,
                        other.associatedBackupConfigurationDetails)
                && java.util.Objects.equals(
                        this.recoveryApplianceDetails, other.recoveryApplianceDetails)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.keyStoreWalletName, other.keyStoreWalletName)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(this.totalCpus, other.totalCpus)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(this.provisionableCpus, other.provisionableCpus)
                && java.util.Objects.equals(this.listOneOffPatches, other.listOneOffPatches)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
                && java.util.Objects.equals(this.reservedCpus, other.reservedCpus)
                && java.util.Objects.equals(
                        this.largestProvisionableAutonomousDatabaseInCpus,
                        other.largestProvisionableAutonomousDatabaseInCpus)
                && java.util.Objects.equals(this.timeOfLastBackup, other.timeOfLastBackup)
                && java.util.Objects.equals(this.dbSplitThreshold, other.dbSplitThreshold)
                && java.util.Objects.equals(this.vmFailoverReservation, other.vmFailoverReservation)
                && java.util.Objects.equals(this.distributionAffinity, other.distributionAffinity)
                && java.util.Objects.equals(
                        this.netServicesArchitecture, other.netServicesArchitecture)
                && java.util.Objects.equals(this.isMultipleStandby, other.isMultipleStandby)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(this.dataguard, other.dataguard)
                && java.util.Objects.equals(this.dataguardGroupMembers, other.dataguardGroupMembers)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLevelAgreementType == null
                                ? 43
                                : this.serviceLevelAgreementType.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousExadataInfrastructureId == null
                                ? 43
                                : this.autonomousExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterId == null
                                ? 43
                                : this.autonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyHistoryEntry == null ? 43 : this.keyHistoryEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotStandbyRevert == null
                                ? 43
                                : this.timeSnapshotStandbyRevert.hashCode());
        result = (result * PRIME) + (this.patchModel == null ? 43 : this.patchModel.hashCode());
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result =
                (result * PRIME)
                        + (this.lastMaintenanceRunId == null
                                ? 43
                                : this.lastMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceRunId == null
                                ? 43
                                : this.nextMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyMaintenanceBufferInDays == null
                                ? 43
                                : this.standbyMaintenanceBufferInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.versionPreference == null ? 43 : this.versionPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.isDstFileUpdateEnabled == null
                                ? 43
                                : this.isDstFileUpdateEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.dstFileVersion == null ? 43 : this.dstFileVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.backupConfig == null ? 43 : this.backupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationPropertiesList == null
                                ? 43
                                : this.backupDestinationPropertiesList.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedBackupConfigurationDetails == null
                                ? 43
                                : this.associatedBackupConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryApplianceDetails == null
                                ? 43
                                : this.recoveryApplianceDetails.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreWalletName == null
                                ? 43
                                : this.keyStoreWalletName.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result = (result * PRIME) + (this.totalCpus == null ? 43 : this.totalCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionableCpus == null ? 43 : this.provisionableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.listOneOffPatches == null ? 43 : this.listOneOffPatches.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
        result = (result * PRIME) + (this.reservedCpus == null ? 43 : this.reservedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.largestProvisionableAutonomousDatabaseInCpus == null
                                ? 43
                                : this.largestProvisionableAutonomousDatabaseInCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastBackup == null ? 43 : this.timeOfLastBackup.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSplitThreshold == null ? 43 : this.dbSplitThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFailoverReservation == null
                                ? 43
                                : this.vmFailoverReservation.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionAffinity == null
                                ? 43
                                : this.distributionAffinity.hashCode());
        result =
                (result * PRIME)
                        + (this.netServicesArchitecture == null
                                ? 43
                                : this.netServicesArchitecture.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultipleStandby == null ? 43 : this.isMultipleStandby.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.dataguard == null ? 43 : this.dataguard.hashCode());
        result =
                (result * PRIME)
                        + (this.dataguardGroupMembers == null
                                ? 43
                                : this.dataguardGroupMembers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
