/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle Autonomous Database. <br>
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
        builder = AutonomousDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "subscriptionId",
        "lifecycleState",
        "lifecycleDetails",
        "kmsKeyId",
        "vaultId",
        "kmsKeyLifecycleDetails",
        "encryptionKey",
        "kmsKeyVersionId",
        "dbName",
        "characterSet",
        "ncharacterSet",
        "inMemoryPercentage",
        "inMemoryAreaInGBs",
        "nextLongTermBackupTimeStamp",
        "longTermBackupSchedule",
        "isFreeTier",
        "systemTags",
        "timeReclamationOfFreeAutonomousDatabase",
        "timeDeletionOfFreeAutonomousDatabase",
        "backupConfig",
        "keyHistoryEntry",
        "encryptionKeyHistoryEntry",
        "cpuCoreCount",
        "localAdgAutoFailoverMaxDataLossLimit",
        "computeModel",
        "computeCount",
        "backupRetentionPeriodInDays",
        "totalBackupStorageSizeInGBs",
        "ocpuCount",
        "provisionableCpus",
        "dataStorageSizeInTBs",
        "memoryPerOracleComputeUnitInGBs",
        "dataStorageSizeInGBs",
        "usedDataStorageSizeInGBs",
        "infrastructureType",
        "isDedicated",
        "autonomousContainerDatabaseId",
        "isBackupRetentionLocked",
        "timeUndeleted",
        "timeCreated",
        "displayName",
        "serviceConsoleUrl",
        "connectionStrings",
        "connectionUrls",
        "publicConnectionUrls",
        "licenseModel",
        "byolComputeCountLimit",
        "usedDataStorageSizeInTBs",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "subnetId",
        "nsgIds",
        "privateEndpoint",
        "publicEndpoint",
        "privateEndpointLabel",
        "privateEndpointIp",
        "dbVersion",
        "isPreview",
        "dbWorkload",
        "isDevTier",
        "isAccessControlEnabled",
        "whitelistedIps",
        "arePrimaryWhitelistedIpsUsed",
        "standbyWhitelistedIps",
        "apexDetails",
        "isAutoScalingEnabled",
        "dataSafeStatus",
        "operationsInsightsStatus",
        "databaseManagementStatus",
        "timeMaintenanceBegin",
        "timeMaintenanceEnd",
        "maintenanceTargetComponent",
        "isRefreshableClone",
        "timeOfLastRefresh",
        "timeOfLastRefreshPoint",
        "timeOfNextRefresh",
        "openMode",
        "refreshableStatus",
        "refreshableMode",
        "sourceId",
        "permissionLevel",
        "timeOfLastSwitchover",
        "timeOfLastFailover",
        "isDataGuardEnabled",
        "failedDataRecoveryInSeconds",
        "standbyDb",
        "isLocalDataGuardEnabled",
        "isRemoteDataGuardEnabled",
        "localStandbyDb",
        "role",
        "availableUpgradeVersions",
        "keyStoreId",
        "keyStoreWalletName",
        "autoRefreshFrequencyInSeconds",
        "autoRefreshPointLagInSeconds",
        "timeOfAutoRefreshStart",
        "supportedRegionsToCloneTo",
        "customerContacts",
        "timeLocalDataGuardEnabled",
        "dataguardRegionType",
        "timeDataGuardRoleChanged",
        "peerDbIds",
        "isMtlsConnectionRequired",
        "timeOfJoiningResourcePool",
        "resourcePoolLeaderId",
        "resourcePoolSummary",
        "isReconnectCloneEnabled",
        "timeUntilReconnectCloneEnabled",
        "autonomousMaintenanceScheduleType",
        "scheduledOperations",
        "isAutoScalingForStorageEnabled",
        "allocatedStorageSizeInTBs",
        "actualUsedDataStorageSizeInTBs",
        "databaseEdition",
        "dbToolsDetails",
        "localDisasterRecoveryType",
        "disasterRecoveryRegionType",
        "timeDisasterRecoveryRoleChanged",
        "remoteDisasterRecoveryConfiguration",
        "netServicesArchitecture",
        "availabilityDomain",
        "clusterPlacementGroupId",
        "cloneTableSpaceList"
    })
    public AutonomousDatabase(
            String id,
            String compartmentId,
            String subscriptionId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String kmsKeyId,
            String vaultId,
            String kmsKeyLifecycleDetails,
            AutonomousDatabaseEncryptionKeyDetails encryptionKey,
            String kmsKeyVersionId,
            String dbName,
            String characterSet,
            String ncharacterSet,
            Integer inMemoryPercentage,
            Integer inMemoryAreaInGBs,
            java.util.Date nextLongTermBackupTimeStamp,
            LongTermBackUpScheduleDetails longTermBackupSchedule,
            Boolean isFreeTier,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeReclamationOfFreeAutonomousDatabase,
            java.util.Date timeDeletionOfFreeAutonomousDatabase,
            AutonomousDatabaseBackupConfig backupConfig,
            java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry,
            java.util.List<AutonomousDatabaseEncryptionKeyHistoryEntry> encryptionKeyHistoryEntry,
            Integer cpuCoreCount,
            Integer localAdgAutoFailoverMaxDataLossLimit,
            ComputeModel computeModel,
            Float computeCount,
            Integer backupRetentionPeriodInDays,
            Double totalBackupStorageSizeInGBs,
            Float ocpuCount,
            java.util.List<Float> provisionableCpus,
            Integer dataStorageSizeInTBs,
            Integer memoryPerOracleComputeUnitInGBs,
            Integer dataStorageSizeInGBs,
            Integer usedDataStorageSizeInGBs,
            InfrastructureType infrastructureType,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
            Boolean isBackupRetentionLocked,
            java.util.Date timeUndeleted,
            java.util.Date timeCreated,
            String displayName,
            String serviceConsoleUrl,
            AutonomousDatabaseConnectionStrings connectionStrings,
            AutonomousDatabaseConnectionUrls connectionUrls,
            AutonomousDatabaseConnectionUrls publicConnectionUrls,
            LicenseModel licenseModel,
            Float byolComputeCountLimit,
            Integer usedDataStorageSizeInTBs,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateEndpoint,
            String publicEndpoint,
            String privateEndpointLabel,
            String privateEndpointIp,
            String dbVersion,
            Boolean isPreview,
            DbWorkload dbWorkload,
            Boolean isDevTier,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            AutonomousDatabaseApex apexDetails,
            Boolean isAutoScalingEnabled,
            DataSafeStatus dataSafeStatus,
            OperationsInsightsStatus operationsInsightsStatus,
            DatabaseManagementStatus databaseManagementStatus,
            java.util.Date timeMaintenanceBegin,
            java.util.Date timeMaintenanceEnd,
            String maintenanceTargetComponent,
            Boolean isRefreshableClone,
            java.util.Date timeOfLastRefresh,
            java.util.Date timeOfLastRefreshPoint,
            java.util.Date timeOfNextRefresh,
            OpenMode openMode,
            RefreshableStatus refreshableStatus,
            RefreshableMode refreshableMode,
            String sourceId,
            PermissionLevel permissionLevel,
            java.util.Date timeOfLastSwitchover,
            java.util.Date timeOfLastFailover,
            Boolean isDataGuardEnabled,
            Integer failedDataRecoveryInSeconds,
            AutonomousDatabaseStandbySummary standbyDb,
            Boolean isLocalDataGuardEnabled,
            Boolean isRemoteDataGuardEnabled,
            AutonomousDatabaseStandbySummary localStandbyDb,
            Role role,
            java.util.List<String> availableUpgradeVersions,
            String keyStoreId,
            String keyStoreWalletName,
            Integer autoRefreshFrequencyInSeconds,
            Integer autoRefreshPointLagInSeconds,
            java.util.Date timeOfAutoRefreshStart,
            java.util.List<String> supportedRegionsToCloneTo,
            java.util.List<CustomerContact> customerContacts,
            java.util.Date timeLocalDataGuardEnabled,
            DataguardRegionType dataguardRegionType,
            java.util.Date timeDataGuardRoleChanged,
            java.util.List<String> peerDbIds,
            Boolean isMtlsConnectionRequired,
            java.util.Date timeOfJoiningResourcePool,
            String resourcePoolLeaderId,
            ResourcePoolSummary resourcePoolSummary,
            Boolean isReconnectCloneEnabled,
            java.util.Date timeUntilReconnectCloneEnabled,
            AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            Double allocatedStorageSizeInTBs,
            Double actualUsedDataStorageSizeInTBs,
            DatabaseEdition databaseEdition,
            java.util.List<DatabaseTool> dbToolsDetails,
            DisasterRecoveryConfiguration.DisasterRecoveryType localDisasterRecoveryType,
            DisasterRecoveryRegionType disasterRecoveryRegionType,
            java.util.Date timeDisasterRecoveryRoleChanged,
            DisasterRecoveryConfiguration remoteDisasterRecoveryConfiguration,
            NetServicesArchitecture netServicesArchitecture,
            String availabilityDomain,
            String clusterPlacementGroupId,
            java.util.List<Integer> cloneTableSpaceList) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.subscriptionId = subscriptionId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.kmsKeyId = kmsKeyId;
        this.vaultId = vaultId;
        this.kmsKeyLifecycleDetails = kmsKeyLifecycleDetails;
        this.encryptionKey = encryptionKey;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.dbName = dbName;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.inMemoryPercentage = inMemoryPercentage;
        this.inMemoryAreaInGBs = inMemoryAreaInGBs;
        this.nextLongTermBackupTimeStamp = nextLongTermBackupTimeStamp;
        this.longTermBackupSchedule = longTermBackupSchedule;
        this.isFreeTier = isFreeTier;
        this.systemTags = systemTags;
        this.timeReclamationOfFreeAutonomousDatabase = timeReclamationOfFreeAutonomousDatabase;
        this.timeDeletionOfFreeAutonomousDatabase = timeDeletionOfFreeAutonomousDatabase;
        this.backupConfig = backupConfig;
        this.keyHistoryEntry = keyHistoryEntry;
        this.encryptionKeyHistoryEntry = encryptionKeyHistoryEntry;
        this.cpuCoreCount = cpuCoreCount;
        this.localAdgAutoFailoverMaxDataLossLimit = localAdgAutoFailoverMaxDataLossLimit;
        this.computeModel = computeModel;
        this.computeCount = computeCount;
        this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
        this.totalBackupStorageSizeInGBs = totalBackupStorageSizeInGBs;
        this.ocpuCount = ocpuCount;
        this.provisionableCpus = provisionableCpus;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.usedDataStorageSizeInGBs = usedDataStorageSizeInGBs;
        this.infrastructureType = infrastructureType;
        this.isDedicated = isDedicated;
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.isBackupRetentionLocked = isBackupRetentionLocked;
        this.timeUndeleted = timeUndeleted;
        this.timeCreated = timeCreated;
        this.displayName = displayName;
        this.serviceConsoleUrl = serviceConsoleUrl;
        this.connectionStrings = connectionStrings;
        this.connectionUrls = connectionUrls;
        this.publicConnectionUrls = publicConnectionUrls;
        this.licenseModel = licenseModel;
        this.byolComputeCountLimit = byolComputeCountLimit;
        this.usedDataStorageSizeInTBs = usedDataStorageSizeInTBs;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.privateEndpoint = privateEndpoint;
        this.publicEndpoint = publicEndpoint;
        this.privateEndpointLabel = privateEndpointLabel;
        this.privateEndpointIp = privateEndpointIp;
        this.dbVersion = dbVersion;
        this.isPreview = isPreview;
        this.dbWorkload = dbWorkload;
        this.isDevTier = isDevTier;
        this.isAccessControlEnabled = isAccessControlEnabled;
        this.whitelistedIps = whitelistedIps;
        this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
        this.standbyWhitelistedIps = standbyWhitelistedIps;
        this.apexDetails = apexDetails;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.dataSafeStatus = dataSafeStatus;
        this.operationsInsightsStatus = operationsInsightsStatus;
        this.databaseManagementStatus = databaseManagementStatus;
        this.timeMaintenanceBegin = timeMaintenanceBegin;
        this.timeMaintenanceEnd = timeMaintenanceEnd;
        this.maintenanceTargetComponent = maintenanceTargetComponent;
        this.isRefreshableClone = isRefreshableClone;
        this.timeOfLastRefresh = timeOfLastRefresh;
        this.timeOfLastRefreshPoint = timeOfLastRefreshPoint;
        this.timeOfNextRefresh = timeOfNextRefresh;
        this.openMode = openMode;
        this.refreshableStatus = refreshableStatus;
        this.refreshableMode = refreshableMode;
        this.sourceId = sourceId;
        this.permissionLevel = permissionLevel;
        this.timeOfLastSwitchover = timeOfLastSwitchover;
        this.timeOfLastFailover = timeOfLastFailover;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.failedDataRecoveryInSeconds = failedDataRecoveryInSeconds;
        this.standbyDb = standbyDb;
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        this.isRemoteDataGuardEnabled = isRemoteDataGuardEnabled;
        this.localStandbyDb = localStandbyDb;
        this.role = role;
        this.availableUpgradeVersions = availableUpgradeVersions;
        this.keyStoreId = keyStoreId;
        this.keyStoreWalletName = keyStoreWalletName;
        this.autoRefreshFrequencyInSeconds = autoRefreshFrequencyInSeconds;
        this.autoRefreshPointLagInSeconds = autoRefreshPointLagInSeconds;
        this.timeOfAutoRefreshStart = timeOfAutoRefreshStart;
        this.supportedRegionsToCloneTo = supportedRegionsToCloneTo;
        this.customerContacts = customerContacts;
        this.timeLocalDataGuardEnabled = timeLocalDataGuardEnabled;
        this.dataguardRegionType = dataguardRegionType;
        this.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
        this.peerDbIds = peerDbIds;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.timeOfJoiningResourcePool = timeOfJoiningResourcePool;
        this.resourcePoolLeaderId = resourcePoolLeaderId;
        this.resourcePoolSummary = resourcePoolSummary;
        this.isReconnectCloneEnabled = isReconnectCloneEnabled;
        this.timeUntilReconnectCloneEnabled = timeUntilReconnectCloneEnabled;
        this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
        this.scheduledOperations = scheduledOperations;
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        this.allocatedStorageSizeInTBs = allocatedStorageSizeInTBs;
        this.actualUsedDataStorageSizeInTBs = actualUsedDataStorageSizeInTBs;
        this.databaseEdition = databaseEdition;
        this.dbToolsDetails = dbToolsDetails;
        this.localDisasterRecoveryType = localDisasterRecoveryType;
        this.disasterRecoveryRegionType = disasterRecoveryRegionType;
        this.timeDisasterRecoveryRoleChanged = timeDisasterRecoveryRoleChanged;
        this.remoteDisasterRecoveryConfiguration = remoteDisasterRecoveryConfiguration;
        this.netServicesArchitecture = netServicesArchitecture;
        this.availabilityDomain = availabilityDomain;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.cloneTableSpaceList = cloneTableSpaceList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database.
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** The current state of the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous Database.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /** KMS key lifecycle details. */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyLifecycleDetails")
        private String kmsKeyLifecycleDetails;

        /**
         * KMS key lifecycle details.
         *
         * @param kmsKeyLifecycleDetails the value to set
         * @return this builder
         */
        public Builder kmsKeyLifecycleDetails(String kmsKeyLifecycleDetails) {
            this.kmsKeyLifecycleDetails = kmsKeyLifecycleDetails;
            this.__explicitlySet__.add("kmsKeyLifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
        private AutonomousDatabaseEncryptionKeyDetails encryptionKey;

        public Builder encryptionKey(AutonomousDatabaseEncryptionKeyDetails encryptionKey) {
            this.encryptionKey = encryptionKey;
            this.__explicitlySet__.add("encryptionKey");
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
         * The character set for the autonomous database. The default is AL32UTF8. Allowed values
         * are:
         *
         * <p>AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
         * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
         * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
         * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
         * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
         * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851,
         * EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8,
         * IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE,
         * JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921,
         * LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10,
         * NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII,
         * TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258,
         * VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S,
         * WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8,
         * ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950,
         * ZHT32EUC, ZHT32SOPS, ZHT32TRIS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the autonomous database. The default is AL32UTF8. Allowed values
         * are:
         *
         * <p>AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
         * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
         * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
         * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
         * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
         * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851,
         * EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8,
         * IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE,
         * JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921,
         * LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10,
         * NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII,
         * TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258,
         * VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S,
         * WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8,
         * ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950,
         * ZHT32EUC, ZHT32SOPS, ZHT32TRIS
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /**
         * The national character set for the autonomous database. The default is AL16UTF16. Allowed
         * values are: AL16UTF16 or UTF8.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the autonomous database. The default is AL16UTF16. Allowed
         * values are: AL16UTF16 or UTF8.
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
         * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous
         * Database. This property is applicable only to Autonomous Databases on the Exadata
         * Cloud@Customer platform.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inMemoryPercentage")
        private Integer inMemoryPercentage;

        /**
         * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous
         * Database. This property is applicable only to Autonomous Databases on the Exadata
         * Cloud@Customer platform.
         *
         * @param inMemoryPercentage the value to set
         * @return this builder
         */
        public Builder inMemoryPercentage(Integer inMemoryPercentage) {
            this.inMemoryPercentage = inMemoryPercentage;
            this.__explicitlySet__.add("inMemoryPercentage");
            return this;
        }
        /** The area assigned to In-Memory tables in Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("inMemoryAreaInGBs")
        private Integer inMemoryAreaInGBs;

        /**
         * The area assigned to In-Memory tables in Autonomous Database.
         *
         * @param inMemoryAreaInGBs the value to set
         * @return this builder
         */
        public Builder inMemoryAreaInGBs(Integer inMemoryAreaInGBs) {
            this.inMemoryAreaInGBs = inMemoryAreaInGBs;
            this.__explicitlySet__.add("inMemoryAreaInGBs");
            return this;
        }
        /** The date and time when the next long-term backup would be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextLongTermBackupTimeStamp")
        private java.util.Date nextLongTermBackupTimeStamp;

        /**
         * The date and time when the next long-term backup would be created.
         *
         * @param nextLongTermBackupTimeStamp the value to set
         * @return this builder
         */
        public Builder nextLongTermBackupTimeStamp(java.util.Date nextLongTermBackupTimeStamp) {
            this.nextLongTermBackupTimeStamp = nextLongTermBackupTimeStamp;
            this.__explicitlySet__.add("nextLongTermBackupTimeStamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longTermBackupSchedule")
        private LongTermBackUpScheduleDetails longTermBackupSchedule;

        public Builder longTermBackupSchedule(
                LongTermBackUpScheduleDetails longTermBackupSchedule) {
            this.longTermBackupSchedule = longTermBackupSchedule;
            this.__explicitlySet__.add("longTermBackupSchedule");
            return this;
        }
        /**
         * Indicates if this is an Always Free resource. The default value is false. Note that
         * Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free
         * databases, memory and CPU cannot be scaled.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds,
         * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isLocalDataGuardEnabled
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        /**
         * Indicates if this is an Always Free resource. The default value is false. Note that
         * Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free
         * databases, memory and CPU cannot be scaled.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds,
         * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isLocalDataGuardEnabled
         *
         * @param isFreeTier the value to set
         * @return this builder
         */
        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
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
         * The date and time the Always Free database will be stopped because of inactivity. If this
         * time is reached without any database activity, the database will automatically be put
         * into the STOPPED state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReclamationOfFreeAutonomousDatabase")
        private java.util.Date timeReclamationOfFreeAutonomousDatabase;

        /**
         * The date and time the Always Free database will be stopped because of inactivity. If this
         * time is reached without any database activity, the database will automatically be put
         * into the STOPPED state.
         *
         * @param timeReclamationOfFreeAutonomousDatabase the value to set
         * @return this builder
         */
        public Builder timeReclamationOfFreeAutonomousDatabase(
                java.util.Date timeReclamationOfFreeAutonomousDatabase) {
            this.timeReclamationOfFreeAutonomousDatabase = timeReclamationOfFreeAutonomousDatabase;
            this.__explicitlySet__.add("timeReclamationOfFreeAutonomousDatabase");
            return this;
        }
        /**
         * The date and time the Always Free database will be automatically deleted because of
         * inactivity. If the database is in the STOPPED state and without activity until this time,
         * it will be deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionOfFreeAutonomousDatabase")
        private java.util.Date timeDeletionOfFreeAutonomousDatabase;

        /**
         * The date and time the Always Free database will be automatically deleted because of
         * inactivity. If the database is in the STOPPED state and without activity until this time,
         * it will be deleted.
         *
         * @param timeDeletionOfFreeAutonomousDatabase the value to set
         * @return this builder
         */
        public Builder timeDeletionOfFreeAutonomousDatabase(
                java.util.Date timeDeletionOfFreeAutonomousDatabase) {
            this.timeDeletionOfFreeAutonomousDatabase = timeDeletionOfFreeAutonomousDatabase;
            this.__explicitlySet__.add("timeDeletionOfFreeAutonomousDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
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
        /** Key History Entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyHistoryEntry")
        private java.util.List<AutonomousDatabaseEncryptionKeyHistoryEntry>
                encryptionKeyHistoryEntry;

        /**
         * Key History Entry.
         *
         * @param encryptionKeyHistoryEntry the value to set
         * @return this builder
         */
        public Builder encryptionKeyHistoryEntry(
                java.util.List<AutonomousDatabaseEncryptionKeyHistoryEntry>
                        encryptionKeyHistoryEntry) {
            this.encryptionKeyHistoryEntry = encryptionKeyHistoryEntry;
            this.__explicitlySet__.add("encryptionKeyHistoryEntry");
            return this;
        }
        /**
         * The number of CPU cores to be made available to the database. When the ECPU is selected,
         * the value for cpuCoreCount is 0. For Autonomous Database on Dedicated Exadata
         * infrastructure, the maximum number of cores is determined by the infrastructure shape.
         * See [Characteristics of Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores to be made available to the database. When the ECPU is selected,
         * the value for cpuCoreCount is 0. For Autonomous Database on Dedicated Exadata
         * infrastructure, the maximum number of cores is determined by the infrastructure shape.
         * See [Characteristics of Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * Parameter that allows users to select an acceptable maximum data loss limit in seconds,
         * up to which Automatic Failover will be triggered when necessary for a Local Autonomous
         * Data Guard
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localAdgAutoFailoverMaxDataLossLimit")
        private Integer localAdgAutoFailoverMaxDataLossLimit;

        /**
         * Parameter that allows users to select an acceptable maximum data loss limit in seconds,
         * up to which Automatic Failover will be triggered when necessary for a Local Autonomous
         * Data Guard
         *
         * @param localAdgAutoFailoverMaxDataLossLimit the value to set
         * @return this builder
         */
        public Builder localAdgAutoFailoverMaxDataLossLimit(
                Integer localAdgAutoFailoverMaxDataLossLimit) {
            this.localAdgAutoFailoverMaxDataLossLimit = localAdgAutoFailoverMaxDataLossLimit;
            this.__explicitlySet__.add("localAdgAutoFailoverMaxDataLossLimit");
            return this;
        }
        /**
         * The compute model of the Autonomous Database. This is required if using the {@code
         * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify
         * {@code computeModel} to a non-null value. ECPU compute model is the recommended model and
         * OCPU compute model is legacy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Autonomous Database. This is required if using the {@code
         * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify
         * {@code computeModel} to a non-null value. ECPU compute model is the recommended model and
         * OCPU compute model is legacy.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /**
         * The compute amount (CPUs) available to the database. Minimum and maximum values depend on
         * the compute model and whether the database is an Autonomous Database Serverless instance
         * or an Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model
         * requires a minimum value of one, for databases in the elastic resource pool and minimum
         * value of two, otherwise. Required when using the {@code computeModel} parameter. When
         * using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a
         * non-null value. Providing {@code computeModel} and {@code computeCount} is the preferred
         * method for both OCPU and ECPU.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute amount (CPUs) available to the database. Minimum and maximum values depend on
         * the compute model and whether the database is an Autonomous Database Serverless instance
         * or an Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model
         * requires a minimum value of one, for databases in the elastic resource pool and minimum
         * value of two, otherwise. Required when using the {@code computeModel} parameter. When
         * using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a
         * non-null value. Providing {@code computeModel} and {@code computeCount} is the preferred
         * method for both OCPU and ECPU.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** Retention period, in days, for long-term backups */
        @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
        private Integer backupRetentionPeriodInDays;

        /**
         * Retention period, in days, for long-term backups
         *
         * @param backupRetentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder backupRetentionPeriodInDays(Integer backupRetentionPeriodInDays) {
            this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
            this.__explicitlySet__.add("backupRetentionPeriodInDays");
            return this;
        }
        /** The backup storage to the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalBackupStorageSizeInGBs")
        private Double totalBackupStorageSizeInGBs;

        /**
         * The backup storage to the database.
         *
         * @param totalBackupStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder totalBackupStorageSizeInGBs(Double totalBackupStorageSizeInGBs) {
            this.totalBackupStorageSizeInGBs = totalBackupStorageSizeInGBs;
            this.__explicitlySet__.add("totalBackupStorageSizeInGBs");
            return this;
        }
        /**
         * The number of OCPU cores to be made available to the database.
         *
         * <p>The following points apply: - For Autonomous Databases on Dedicated Exadata
         * Infrastructure, to provision less than 1 core, enter a fractional value in an increment
         * of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that
         * fractional OCPU values are not supported for Autonomous Database Serverless instances.) -
         * To provision cores, enter an integer between 1 and the maximum number of cores available
         * for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not
         * 2.5 cores. This applies to Autonomous Databases on both serverless and dedicated Exadata
         * infrastructure. - For Autonomous Database Serverless instances, this parameter is not
         * used.
         *
         * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, the maximum number of
         * cores is determined by the infrastructure shape. See [Characteristics of Infrastructure
         * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to be made available to the database.
         *
         * <p>The following points apply: - For Autonomous Databases on Dedicated Exadata
         * Infrastructure, to provision less than 1 core, enter a fractional value in an increment
         * of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that
         * fractional OCPU values are not supported for Autonomous Database Serverless instances.) -
         * To provision cores, enter an integer between 1 and the maximum number of cores available
         * for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not
         * 2.5 cores. This applies to Autonomous Databases on both serverless and dedicated Exadata
         * infrastructure. - For Autonomous Database Serverless instances, this parameter is not
         * used.
         *
         * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, the maximum number of
         * cores is determined by the infrastructure shape. See [Characteristics of Infrastructure
         * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** An array of CPU values that an Autonomous Database can be scaled to. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
        private java.util.List<Float> provisionableCpus;

        /**
         * An array of CPU values that an Autonomous Database can be scaled to.
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
         * The quantity of data in the database, in terabytes.
         *
         * <p>The following points apply to Autonomous Databases on Serverless Infrastructure: -
         * This is an integer field whose value remains null when the data size is in GBs and cannot
         * be converted to TBs (by dividing the GB value by 1024) without rounding error. - To get
         * the exact value of data storage size without rounding error, please see {@code
         * dataStorageSizeInGBs} of Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        /**
         * The quantity of data in the database, in terabytes.
         *
         * <p>The following points apply to Autonomous Databases on Serverless Infrastructure: -
         * This is an integer field whose value remains null when the data size is in GBs and cannot
         * be converted to TBs (by dividing the GB value by 1024) without rounding error. - To get
         * the exact value of data storage size without rounding error, please see {@code
         * dataStorageSizeInGBs} of Autonomous Database.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The amount of memory (in GBs) enabled per ECPU or OCPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) enabled per ECPU or OCPU.
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
         * The quantity of data in the database, in gigabytes.
         *
         * <p>For Autonomous Transaction Processing databases using ECPUs on Serverless
         * Infrastructure, this value is always populated. In all the other cases, this value will
         * be null and {@code dataStorageSizeInTBs} will be populated instead.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * The quantity of data in the database, in gigabytes.
         *
         * <p>For Autonomous Transaction Processing databases using ECPUs on Serverless
         * Infrastructure, this value is always populated. In all the other cases, this value will
         * be null and {@code dataStorageSizeInTBs} will be populated instead.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /** The storage space consumed by Autonomous Database in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInGBs")
        private Integer usedDataStorageSizeInGBs;

        /**
         * The storage space consumed by Autonomous Database in GBs.
         *
         * @param usedDataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder usedDataStorageSizeInGBs(Integer usedDataStorageSizeInGBs) {
            this.usedDataStorageSizeInGBs = usedDataStorageSizeInGBs;
            this.__explicitlySet__.add("usedDataStorageSizeInGBs");
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
         * True if the database uses [dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        /**
         * True if the database uses [dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
         *
         * @param isDedicated the value to set
         * @return this builder
         */
        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }
        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Used only
         * by Autonomous Database on Dedicated Exadata Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
        private String autonomousContainerDatabaseId;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Used only
         * by Autonomous Database on Dedicated Exadata Infrastructure.
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            this.__explicitlySet__.add("autonomousContainerDatabaseId");
            return this;
        }
        /** Indicates if the Autonomous Database is backup retention locked. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBackupRetentionLocked")
        private Boolean isBackupRetentionLocked;

        /**
         * Indicates if the Autonomous Database is backup retention locked.
         *
         * @param isBackupRetentionLocked the value to set
         * @return this builder
         */
        public Builder isBackupRetentionLocked(Boolean isBackupRetentionLocked) {
            this.isBackupRetentionLocked = isBackupRetentionLocked;
            this.__explicitlySet__.add("isBackupRetentionLocked");
            return this;
        }
        /** The date and time the Autonomous Database was most recently undeleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUndeleted")
        private java.util.Date timeUndeleted;

        /**
         * The date and time the Autonomous Database was most recently undeleted.
         *
         * @param timeUndeleted the value to set
         * @return this builder
         */
        public Builder timeUndeleted(java.util.Date timeUndeleted) {
            this.timeUndeleted = timeUndeleted;
            this.__explicitlySet__.add("timeUndeleted");
            return this;
        }
        /** The date and time the Autonomous Database was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Autonomous Database was created.
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
         * The user-friendly name for the Autonomous Database. The name does not have to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Database. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The URL of the Service Console for the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
        private String serviceConsoleUrl;

        /**
         * The URL of the Service Console for the Autonomous Database.
         *
         * @param serviceConsoleUrl the value to set
         * @return this builder
         */
        public Builder serviceConsoleUrl(String serviceConsoleUrl) {
            this.serviceConsoleUrl = serviceConsoleUrl;
            this.__explicitlySet__.add("serviceConsoleUrl");
            return this;
        }
        /**
         * The connection string used to connect to the Autonomous Database. The username for the
         * Service Console is ADMIN. Use the password you entered when creating the Autonomous
         * Database for the password value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private AutonomousDatabaseConnectionStrings connectionStrings;

        /**
         * The connection string used to connect to the Autonomous Database. The username for the
         * Service Console is ADMIN. Use the password you entered when creating the Autonomous
         * Database for the password value.
         *
         * @param connectionStrings the value to set
         * @return this builder
         */
        public Builder connectionStrings(AutonomousDatabaseConnectionStrings connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionUrls")
        private AutonomousDatabaseConnectionUrls connectionUrls;

        public Builder connectionUrls(AutonomousDatabaseConnectionUrls connectionUrls) {
            this.connectionUrls = connectionUrls;
            this.__explicitlySet__.add("connectionUrls");
            return this;
        }
        /**
         * The Public URLs of Private Endpoint database for accessing Oracle Application Express
         * (APEX) and SQL Developer Web with a browser from a Compute instance within your VCN or
         * that has a direct connection to your VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicConnectionUrls")
        private AutonomousDatabaseConnectionUrls publicConnectionUrls;

        /**
         * The Public URLs of Private Endpoint database for accessing Oracle Application Express
         * (APEX) and SQL Developer Web with a browser from a Compute instance within your VCN or
         * that has a direct connection to your VCN.
         *
         * @param publicConnectionUrls the value to set
         * @return this builder
         */
        public Builder publicConnectionUrls(AutonomousDatabaseConnectionUrls publicConnectionUrls) {
            this.publicConnectionUrls = publicConnectionUrls;
            this.__explicitlySet__.add("publicConnectionUrls");
            return this;
        }
        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
         * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
         * equivalent, highly automated Oracle services in the cloud. License Included allows you to
         * subscribe to new Oracle Database software licenses and the Oracle Database service. Note
         * that when provisioning an [Autonomous Database on dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null. It is already set at the Autonomous Exadata Infrastructure
         * level. When provisioning an [Autonomous Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a
         * value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}.
         * Bring your own license (BYOL) also allows you to select the DB edition using the optional
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
         * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
         * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
         * equivalent, highly automated Oracle services in the cloud. License Included allows you to
         * subscribe to new Oracle Database software licenses and the Oracle Database service. Note
         * that when provisioning an [Autonomous Database on dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null. It is already set at the Autonomous Exadata Infrastructure
         * level. When provisioning an [Autonomous Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a
         * value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}.
         * Bring your own license (BYOL) also allows you to select the DB edition using the optional
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
         * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The maximum number of CPUs allowed with a Bring Your Own License (BYOL), including those
         * used for auto-scaling, disaster recovery, tools, etc. Any CPU usage above this limit is
         * considered as License Included and billed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("byolComputeCountLimit")
        private Float byolComputeCountLimit;

        /**
         * The maximum number of CPUs allowed with a Bring Your Own License (BYOL), including those
         * used for auto-scaling, disaster recovery, tools, etc. Any CPU usage above this limit is
         * considered as License Included and billed.
         *
         * @param byolComputeCountLimit the value to set
         * @return this builder
         */
        public Builder byolComputeCountLimit(Float byolComputeCountLimit) {
            this.byolComputeCountLimit = byolComputeCountLimit;
            this.__explicitlySet__.add("byolComputeCountLimit");
            return this;
        }
        /**
         * The amount of storage that has been used for Autonomous Databases in dedicated
         * infrastructure, in terabytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInTBs")
        private Integer usedDataStorageSizeInTBs;

        /**
         * The amount of storage that has been used for Autonomous Databases in dedicated
         * infrastructure, in terabytes.
         *
         * @param usedDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder usedDataStorageSizeInTBs(Integer usedDataStorageSizeInTBs) {
            this.usedDataStorageSizeInTBs = usedDataStorageSizeInTBs;
            this.__explicitlySet__.add("usedDataStorageSizeInTBs");
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
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the resource is associated with.
         *
         * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual
         * machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28. - For
         * Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with
         * 192.168.128.0/20. - For Autonomous Database, setting this will disable public secure
         * access to the database.
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and the backup subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet the resource is associated with.
         *
         * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual
         * machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28. - For
         * Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with
         * 192.168.128.0/20. - For Autonomous Database, setting this will disable public secure
         * access to the database.
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and the backup subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds
         * restrictions:** - A network security group (NSG) is optional for Autonomous Databases
         * with private access. The nsgIds list can be empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). **NsgIds
         * restrictions:** - A network security group (NSG) is optional for Autonomous Databases
         * with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The private endpoint for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private String privateEndpoint;

        /**
         * The private endpoint for the resource.
         *
         * @param privateEndpoint the value to set
         * @return this builder
         */
        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }
        /** The public endpoint for the private endpoint enabled resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
        private String publicEndpoint;

        /**
         * The public endpoint for the private endpoint enabled resource.
         *
         * @param publicEndpoint the value to set
         * @return this builder
         */
        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            this.__explicitlySet__.add("publicEndpoint");
            return this;
        }
        /**
         * The resource's private endpoint label. - Setting the endpoint label to a non-empty string
         * creates a private endpoint database. - Resetting the endpoint label to an empty string,
         * after the creation of the private endpoint database, changes the private endpoint
         * database to a public endpoint database. - Setting the endpoint label to a non-empty
         * string value, updates to a new private endpoint database, when the database is disabled
         * and re-enabled.
         *
         * <p>This setting cannot be updated in parallel with any of the following: licenseModel,
         * dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
        private String privateEndpointLabel;

        /**
         * The resource's private endpoint label. - Setting the endpoint label to a non-empty string
         * creates a private endpoint database. - Resetting the endpoint label to an empty string,
         * after the creation of the private endpoint database, changes the private endpoint
         * database to a public endpoint database. - Setting the endpoint label to a non-empty
         * string value, updates to a new private endpoint database, when the database is disabled
         * and re-enabled.
         *
         * <p>This setting cannot be updated in parallel with any of the following: licenseModel,
         * dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, or isFreeTier.
         *
         * @param privateEndpointLabel the value to set
         * @return this builder
         */
        public Builder privateEndpointLabel(String privateEndpointLabel) {
            this.privateEndpointLabel = privateEndpointLabel;
            this.__explicitlySet__.add("privateEndpointLabel");
            return this;
        }
        /** The private endpoint Ip address for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The private endpoint Ip address for the resource.
         *
         * @param privateEndpointIp the value to set
         * @return this builder
         */
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /** A valid Oracle Database version for Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version for Autonomous Database.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** Indicates if the Autonomous Database version is a preview version. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPreview")
        private Boolean isPreview;

        /**
         * Indicates if the Autonomous Database version is a preview version.
         *
         * @param isPreview the value to set
         * @return this builder
         */
        public Builder isPreview(Boolean isPreview) {
            this.isPreview = isPreview;
            this.__explicitlySet__.add("isPreview");
            return this;
        }
        /**
         * The Autonomous Database workload type. The following values are valid:
         *
         * <p>- OLTP - indicates an Autonomous Transaction Processing database - DW - indicates an
         * Autonomous Data Warehouse database - AJD - indicates an Autonomous JSON Database - APEX -
         * indicates an Autonomous Database with the Oracle APEX Application Development workload
         * type.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * The Autonomous Database workload type. The following values are valid:
         *
         * <p>- OLTP - indicates an Autonomous Transaction Processing database - DW - indicates an
         * Autonomous Data Warehouse database - AJD - indicates an Autonomous JSON Database - APEX -
         * indicates an Autonomous Database with the Oracle APEX Application Development workload
         * type.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param dbWorkload the value to set
         * @return this builder
         */
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /**
         * Autonomous Database for Developers are fixed-shape Autonomous Databases that developers
         * can use to build and test new applications. On Serverless, these are low-cost and billed
         * per instance, on Dedicated and Cloud@Customer there is no additional cost to create
         * Developer databases. Developer databases come with limited resources and is not intended
         * for large-scale testing and production deployments. When you need more compute or storage
         * resources, you may upgrade to a full paid production database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDevTier")
        private Boolean isDevTier;

        /**
         * Autonomous Database for Developers are fixed-shape Autonomous Databases that developers
         * can use to build and test new applications. On Serverless, these are low-cost and billed
         * per instance, on Dedicated and Cloud@Customer there is no additional cost to create
         * Developer databases. Developer databases come with limited resources and is not intended
         * for large-scale testing and production deployments. When you need more compute or storage
         * resources, you may upgrade to a full paid production database.
         *
         * @param isDevTier the value to set
         * @return this builder
         */
        public Builder isDevTier(Boolean isDevTier) {
            this.isDevTier = isDevTier;
            this.__explicitlySet__.add("isDevTier");
            return this;
        }
        /**
         * Indicates if the database-level access control is enabled. If disabled, database access
         * is defined by the network security rules. If enabled, database access is restricted to
         * the IP addresses defined by the rules specified with the {@code whitelistedIps} property.
         * While specifying {@code whitelistedIps} rules is optional, if database-level access
         * control is enabled and no rules are specified, the database will become inaccessible. The
         * rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit
         * option in console. When creating a database clone, the desired access control setting
         * should be specified. By default, database-level access control will be disabled for the
         * clone.
         *
         * <p>This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer
         * platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
        private Boolean isAccessControlEnabled;

        /**
         * Indicates if the database-level access control is enabled. If disabled, database access
         * is defined by the network security rules. If enabled, database access is restricted to
         * the IP addresses defined by the rules specified with the {@code whitelistedIps} property.
         * While specifying {@code whitelistedIps} rules is optional, if database-level access
         * control is enabled and no rules are specified, the database will become inaccessible. The
         * rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit
         * option in console. When creating a database clone, the desired access control setting
         * should be specified. By default, database-level access control will be disabled for the
         * clone.
         *
         * <p>This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer
         * platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
         *
         * @param isAccessControlEnabled the value to set
         * @return this builder
         */
        public Builder isAccessControlEnabled(Boolean isAccessControlEnabled) {
            this.isAccessControlEnabled = isAccessControlEnabled;
            this.__explicitlySet__.add("isAccessControlEnabled");
            return this;
        }
        /**
         * The client IP access control list (ACL). This feature is available for [Autonomous
         * Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata
         * Cloud@Customer. Only clients connecting from an IP address included in the ACL may access
         * the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then
         * Autonomous Database uses this primary's IP access control list (ACL) for the disaster
         * recovery peer called {@code standbywhitelistedips}.
         *
         * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
         * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
         * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if
         * it\u2019s other configurations that need multiple pieces of information then its each
         * piece is connected with semicolon (;) as a delimiter. Example: {@code
         * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
         * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         *
         * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array
         * with a single empty string entry.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        /**
         * The client IP access control list (ACL). This feature is available for [Autonomous
         * Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata
         * Cloud@Customer. Only clients connecting from an IP address included in the ACL may access
         * the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then
         * Autonomous Database uses this primary's IP access control list (ACL) for the disaster
         * recovery peer called {@code standbywhitelistedips}.
         *
         * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
         * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
         * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if
         * it\u2019s other configurations that need multiple pieces of information then its each
         * piece is connected with semicolon (;) as a delimiter. Example: {@code
         * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
         * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         *
         * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array
         * with a single empty string entry.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param whitelistedIps the value to set
         * @return this builder
         */
        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }
        /**
         * This field will be null if the Autonomous Database is not Data Guard enabled or Access
         * Control is disabled. It's value would be {@code TRUE} if Autonomous Database is Data
         * Guard enabled and Access Control is enabled and if the Autonomous Database uses primary
         * IP access control list (ACL) for standby. It's value would be {@code FALSE} if Autonomous
         * Database is Data Guard enabled and Access Control is enabled and if the Autonomous
         * Database uses different IP access control list (ACL) for standby compared to primary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
        private Boolean arePrimaryWhitelistedIpsUsed;

        /**
         * This field will be null if the Autonomous Database is not Data Guard enabled or Access
         * Control is disabled. It's value would be {@code TRUE} if Autonomous Database is Data
         * Guard enabled and Access Control is enabled and if the Autonomous Database uses primary
         * IP access control list (ACL) for standby. It's value would be {@code FALSE} if Autonomous
         * Database is Data Guard enabled and Access Control is enabled and if the Autonomous
         * Database uses different IP access control list (ACL) for standby compared to primary.
         *
         * @param arePrimaryWhitelistedIpsUsed the value to set
         * @return this builder
         */
        public Builder arePrimaryWhitelistedIpsUsed(Boolean arePrimaryWhitelistedIpsUsed) {
            this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
            this.__explicitlySet__.add("arePrimaryWhitelistedIpsUsed");
            return this;
        }
        /**
         * The client IP access control list (ACL). This feature is available for [Autonomous
         * Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata
         * Cloud@Customer. Only clients connecting from an IP address included in the ACL may access
         * the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then
         * Autonomous Database uses this primary's IP access control list (ACL) for the disaster
         * recovery peer called {@code standbywhitelistedips}.
         *
         * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
         * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
         * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if
         * it\u2019s other configurations that need multiple pieces of information then its each
         * piece is connected with semicolon (;) as a delimiter. Example: {@code
         * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
         * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         *
         * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array
         * with a single empty string entry.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
        private java.util.List<String> standbyWhitelistedIps;

        /**
         * The client IP access control list (ACL). This feature is available for [Autonomous
         * Database Serverless]
         * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata
         * Cloud@Customer. Only clients connecting from an IP address included in the ACL may access
         * the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then
         * Autonomous Database uses this primary's IP access control list (ACL) for the disaster
         * recovery peer called {@code standbywhitelistedips}.
         *
         * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
         * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
         * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if
         * it\u2019s other configurations that need multiple pieces of information then its each
         * piece is connected with semicolon (;) as a delimiter. Example: {@code
         * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
         * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         *
         * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array
         * with a single empty string entry.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param standbyWhitelistedIps the value to set
         * @return this builder
         */
        public Builder standbyWhitelistedIps(java.util.List<String> standbyWhitelistedIps) {
            this.standbyWhitelistedIps = standbyWhitelistedIps;
            this.__explicitlySet__.add("standbyWhitelistedIps");
            return this;
        }
        /** Information about Oracle APEX Application Development. */
        @com.fasterxml.jackson.annotation.JsonProperty("apexDetails")
        private AutonomousDatabaseApex apexDetails;

        /**
         * Information about Oracle APEX Application Development.
         *
         * @param apexDetails the value to set
         * @return this builder
         */
        public Builder apexDetails(AutonomousDatabaseApex apexDetails) {
            this.apexDetails = apexDetails;
            this.__explicitlySet__.add("apexDetails");
            return this;
        }
        /**
         * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The
         * default value is {@code TRUE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The
         * default value is {@code TRUE}.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /** Status of the Data Safe registration for this Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataSafeStatus")
        private DataSafeStatus dataSafeStatus;

        /**
         * Status of the Data Safe registration for this Autonomous Database.
         *
         * @param dataSafeStatus the value to set
         * @return this builder
         */
        public Builder dataSafeStatus(DataSafeStatus dataSafeStatus) {
            this.dataSafeStatus = dataSafeStatus;
            this.__explicitlySet__.add("dataSafeStatus");
            return this;
        }
        /** Status of Operations Insights for this Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
        private OperationsInsightsStatus operationsInsightsStatus;

        /**
         * Status of Operations Insights for this Autonomous Database.
         *
         * @param operationsInsightsStatus the value to set
         * @return this builder
         */
        public Builder operationsInsightsStatus(OperationsInsightsStatus operationsInsightsStatus) {
            this.operationsInsightsStatus = operationsInsightsStatus;
            this.__explicitlySet__.add("operationsInsightsStatus");
            return this;
        }
        /** Status of Database Management for this Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
        private DatabaseManagementStatus databaseManagementStatus;

        /**
         * Status of Database Management for this Autonomous Database.
         *
         * @param databaseManagementStatus the value to set
         * @return this builder
         */
        public Builder databaseManagementStatus(DatabaseManagementStatus databaseManagementStatus) {
            this.databaseManagementStatus = databaseManagementStatus;
            this.__explicitlySet__.add("databaseManagementStatus");
            return this;
        }
        /** The date and time when maintenance will begin. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceBegin")
        private java.util.Date timeMaintenanceBegin;

        /**
         * The date and time when maintenance will begin.
         *
         * @param timeMaintenanceBegin the value to set
         * @return this builder
         */
        public Builder timeMaintenanceBegin(java.util.Date timeMaintenanceBegin) {
            this.timeMaintenanceBegin = timeMaintenanceBegin;
            this.__explicitlySet__.add("timeMaintenanceBegin");
            return this;
        }
        /** The date and time when maintenance will end. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceEnd")
        private java.util.Date timeMaintenanceEnd;

        /**
         * The date and time when maintenance will end.
         *
         * @param timeMaintenanceEnd the value to set
         * @return this builder
         */
        public Builder timeMaintenanceEnd(java.util.Date timeMaintenanceEnd) {
            this.timeMaintenanceEnd = timeMaintenanceEnd;
            this.__explicitlySet__.add("timeMaintenanceEnd");
            return this;
        }
        /** The component chosen for maintenance. */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceTargetComponent")
        private String maintenanceTargetComponent;

        /**
         * The component chosen for maintenance.
         *
         * @param maintenanceTargetComponent the value to set
         * @return this builder
         */
        public Builder maintenanceTargetComponent(String maintenanceTargetComponent) {
            this.maintenanceTargetComponent = maintenanceTargetComponent;
            this.__explicitlySet__.add("maintenanceTargetComponent");
            return this;
        }
        /**
         * Indicates if the Autonomous Database is a refreshable clone.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, openMode, permissionLevel,
         * dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations,
         * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
        private Boolean isRefreshableClone;

        /**
         * Indicates if the Autonomous Database is a refreshable clone.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, openMode, permissionLevel,
         * dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations,
         * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param isRefreshableClone the value to set
         * @return this builder
         */
        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            this.__explicitlySet__.add("isRefreshableClone");
            return this;
        }
        /** The date and time when last refresh happened. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefresh")
        private java.util.Date timeOfLastRefresh;

        /**
         * The date and time when last refresh happened.
         *
         * @param timeOfLastRefresh the value to set
         * @return this builder
         */
        public Builder timeOfLastRefresh(java.util.Date timeOfLastRefresh) {
            this.timeOfLastRefresh = timeOfLastRefresh;
            this.__explicitlySet__.add("timeOfLastRefresh");
            return this;
        }
        /**
         * The refresh point timestamp (UTC). The refresh point is the time to which the database
         * was most recently refreshed. Data created after the refresh point is not included in the
         * refresh.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefreshPoint")
        private java.util.Date timeOfLastRefreshPoint;

        /**
         * The refresh point timestamp (UTC). The refresh point is the time to which the database
         * was most recently refreshed. Data created after the refresh point is not included in the
         * refresh.
         *
         * @param timeOfLastRefreshPoint the value to set
         * @return this builder
         */
        public Builder timeOfLastRefreshPoint(java.util.Date timeOfLastRefreshPoint) {
            this.timeOfLastRefreshPoint = timeOfLastRefreshPoint;
            this.__explicitlySet__.add("timeOfLastRefreshPoint");
            return this;
        }
        /** The date and time of next refresh. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRefresh")
        private java.util.Date timeOfNextRefresh;

        /**
         * The date and time of next refresh.
         *
         * @param timeOfNextRefresh the value to set
         * @return this builder
         */
        public Builder timeOfNextRefresh(java.util.Date timeOfNextRefresh) {
            this.timeOfNextRefresh = timeOfNextRefresh;
            this.__explicitlySet__.add("timeOfNextRefresh");
            return this;
        }
        /**
         * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY}
         * or {@code READ_WRITE} mode.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        /**
         * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY}
         * or {@code READ_WRITE} mode.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
         *
         * @param openMode the value to set
         * @return this builder
         */
        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }
        /**
         * The refresh status of the clone. REFRESHING indicates that the clone is currently being
         * refreshed with data from the source Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshableStatus")
        private RefreshableStatus refreshableStatus;

        /**
         * The refresh status of the clone. REFRESHING indicates that the clone is currently being
         * refreshed with data from the source Autonomous Database.
         *
         * @param refreshableStatus the value to set
         * @return this builder
         */
        public Builder refreshableStatus(RefreshableStatus refreshableStatus) {
            this.refreshableStatus = refreshableStatus;
            this.__explicitlySet__.add("refreshableStatus");
            return this;
        }
        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
         * refreshed with data from the source Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
        private RefreshableMode refreshableMode;

        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
         * refreshed with data from the source Autonomous Database.
         *
         * @param refreshableMode the value to set
         * @return this builder
         */
        public Builder refreshableMode(RefreshableMode refreshableMode) {
            this.refreshableMode = refreshableMode;
            this.__explicitlySet__.add("refreshableMode");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source Autonomous Database that was cloned to create the current Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source Autonomous Database that was cloned to create the current Autonomous Database.
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
         * The Autonomous Database permission level. Restricted mode allows access only by admin
         * users.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
        private PermissionLevel permissionLevel;

        /**
         * The Autonomous Database permission level. Restricted mode allows access only by admin
         * users.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         *
         * @param permissionLevel the value to set
         * @return this builder
         */
        public Builder permissionLevel(PermissionLevel permissionLevel) {
            this.permissionLevel = permissionLevel;
            this.__explicitlySet__.add("permissionLevel");
            return this;
        }
        /** The timestamp of the last switchover operation for the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSwitchover")
        private java.util.Date timeOfLastSwitchover;

        /**
         * The timestamp of the last switchover operation for the Autonomous Database.
         *
         * @param timeOfLastSwitchover the value to set
         * @return this builder
         */
        public Builder timeOfLastSwitchover(java.util.Date timeOfLastSwitchover) {
            this.timeOfLastSwitchover = timeOfLastSwitchover;
            this.__explicitlySet__.add("timeOfLastSwitchover");
            return this;
        }
        /** The timestamp of the last failover operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastFailover")
        private java.util.Date timeOfLastFailover;

        /**
         * The timestamp of the last failover operation.
         *
         * @param timeOfLastFailover the value to set
         * @return this builder
         */
        public Builder timeOfLastFailover(java.util.Date timeOfLastFailover) {
            this.timeOfLastFailover = timeOfLastFailover;
            this.__explicitlySet__.add("timeOfLastFailover");
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
        /** Indicates the number of seconds of data loss for a Data Guard failover. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedDataRecoveryInSeconds")
        private Integer failedDataRecoveryInSeconds;

        /**
         * Indicates the number of seconds of data loss for a Data Guard failover.
         *
         * @param failedDataRecoveryInSeconds the value to set
         * @return this builder
         */
        public Builder failedDataRecoveryInSeconds(Integer failedDataRecoveryInSeconds) {
            this.failedDataRecoveryInSeconds = failedDataRecoveryInSeconds;
            this.__explicitlySet__.add("failedDataRecoveryInSeconds");
            return this;
        }
        /** **Deprecated** Autonomous Data Guard standby database details. */
        @com.fasterxml.jackson.annotation.JsonProperty("standbyDb")
        private AutonomousDatabaseStandbySummary standbyDb;

        /**
         * **Deprecated** Autonomous Data Guard standby database details.
         *
         * @param standbyDb the value to set
         * @return this builder
         */
        public Builder standbyDb(AutonomousDatabaseStandbySummary standbyDb) {
            this.standbyDb = standbyDb;
            this.__explicitlySet__.add("standbyDb");
            return this;
        }
        /**
         * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not
         * applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases
         * using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
        private Boolean isLocalDataGuardEnabled;

        /**
         * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not
         * applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases
         * using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         *
         * @param isLocalDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isLocalDataGuardEnabled(Boolean isLocalDataGuardEnabled) {
            this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
            this.__explicitlySet__.add("isLocalDataGuardEnabled");
            return this;
        }
        /**
         * Indicates whether the Autonomous Database has Cross Region Data Guard enabled. Not
         * applicable to Autonomous Databases using dedicated Exadata infrastructure or Exadata
         * Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRemoteDataGuardEnabled")
        private Boolean isRemoteDataGuardEnabled;

        /**
         * Indicates whether the Autonomous Database has Cross Region Data Guard enabled. Not
         * applicable to Autonomous Databases using dedicated Exadata infrastructure or Exadata
         * Cloud@Customer infrastructure.
         *
         * @param isRemoteDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isRemoteDataGuardEnabled(Boolean isRemoteDataGuardEnabled) {
            this.isRemoteDataGuardEnabled = isRemoteDataGuardEnabled;
            this.__explicitlySet__.add("isRemoteDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localStandbyDb")
        private AutonomousDatabaseStandbySummary localStandbyDb;

        public Builder localStandbyDb(AutonomousDatabaseStandbySummary localStandbyDb) {
            this.localStandbyDb = localStandbyDb;
            this.__explicitlySet__.add("localStandbyDb");
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
        /**
         * List of Oracle Database versions available for a database upgrade. If there are no
         * version upgrades available, this list is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
        private java.util.List<String> availableUpgradeVersions;

        /**
         * List of Oracle Database versions available for a database upgrade. If there are no
         * version upgrades available, this list is empty.
         *
         * @param availableUpgradeVersions the value to set
         * @return this builder
         */
        public Builder availableUpgradeVersions(java.util.List<String> availableUpgradeVersions) {
            this.availableUpgradeVersions = availableUpgradeVersions;
            this.__explicitlySet__.add("availableUpgradeVersions");
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
        /**
         * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum
         * is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is
         * controlled by the {@code timeOfAutoRefreshStart} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshFrequencyInSeconds")
        private Integer autoRefreshFrequencyInSeconds;

        /**
         * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum
         * is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is
         * controlled by the {@code timeOfAutoRefreshStart} parameter.
         *
         * @param autoRefreshFrequencyInSeconds the value to set
         * @return this builder
         */
        public Builder autoRefreshFrequencyInSeconds(Integer autoRefreshFrequencyInSeconds) {
            this.autoRefreshFrequencyInSeconds = autoRefreshFrequencyInSeconds;
            this.__explicitlySet__.add("autoRefreshFrequencyInSeconds");
            return this;
        }
        /**
         * The time, in seconds, the data of the refreshable clone lags the primary database at the
         * point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available
         * timestamp). The maximum is 7 days. The lag time increases after refreshing until the next
         * data refresh happens.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshPointLagInSeconds")
        private Integer autoRefreshPointLagInSeconds;

        /**
         * The time, in seconds, the data of the refreshable clone lags the primary database at the
         * point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available
         * timestamp). The maximum is 7 days. The lag time increases after refreshing until the next
         * data refresh happens.
         *
         * @param autoRefreshPointLagInSeconds the value to set
         * @return this builder
         */
        public Builder autoRefreshPointLagInSeconds(Integer autoRefreshPointLagInSeconds) {
            this.autoRefreshPointLagInSeconds = autoRefreshPointLagInSeconds;
            this.__explicitlySet__.add("autoRefreshPointLagInSeconds");
            return this;
        }
        /**
         * The the date and time that auto-refreshing will begin for an Autonomous Database
         * refreshable clone. This value controls only the start time for the first refresh
         * operation. Subsequent (ongoing) refresh operations have start times controlled by the
         * value of the {@code autoRefreshFrequencyInSeconds} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAutoRefreshStart")
        private java.util.Date timeOfAutoRefreshStart;

        /**
         * The the date and time that auto-refreshing will begin for an Autonomous Database
         * refreshable clone. This value controls only the start time for the first refresh
         * operation. Subsequent (ongoing) refresh operations have start times controlled by the
         * value of the {@code autoRefreshFrequencyInSeconds} parameter.
         *
         * @param timeOfAutoRefreshStart the value to set
         * @return this builder
         */
        public Builder timeOfAutoRefreshStart(java.util.Date timeOfAutoRefreshStart) {
            this.timeOfAutoRefreshStart = timeOfAutoRefreshStart;
            this.__explicitlySet__.add("timeOfAutoRefreshStart");
            return this;
        }
        /**
         * The list of regions that support the creation of an Autonomous Database clone or an
         * Autonomous Data Guard standby database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedRegionsToCloneTo")
        private java.util.List<String> supportedRegionsToCloneTo;

        /**
         * The list of regions that support the creation of an Autonomous Database clone or an
         * Autonomous Data Guard standby database.
         *
         * @param supportedRegionsToCloneTo the value to set
         * @return this builder
         */
        public Builder supportedRegionsToCloneTo(java.util.List<String> supportedRegionsToCloneTo) {
            this.supportedRegionsToCloneTo = supportedRegionsToCloneTo;
            this.__explicitlySet__.add("supportedRegionsToCloneTo");
            return this;
        }
        /** Customer Contacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer Contacts.
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
         * The date and time that Autonomous Data Guard was enabled for an Autonomous Database where
         * the standby was provisioned in the same region as the primary database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLocalDataGuardEnabled")
        private java.util.Date timeLocalDataGuardEnabled;

        /**
         * The date and time that Autonomous Data Guard was enabled for an Autonomous Database where
         * the standby was provisioned in the same region as the primary database.
         *
         * @param timeLocalDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder timeLocalDataGuardEnabled(java.util.Date timeLocalDataGuardEnabled) {
            this.timeLocalDataGuardEnabled = timeLocalDataGuardEnabled;
            this.__explicitlySet__.add("timeLocalDataGuardEnabled");
            return this;
        }
        /**
         * **Deprecated.** The Autonomous Data Guard region type of the Autonomous Database. For
         * Autonomous Database Serverless, Autonomous Data Guard associations have designated
         * primary and standby regions, and these region types do not change when the database
         * changes roles. The standby regions in Autonomous Data Guard associations can be the same
         * region designated as the primary region, or they can be remote regions. Certain database
         * administrative operations may be available only in the primary region of the Autonomous
         * Data Guard association, and cannot be performed when the database using the primary role
         * is operating in a remote Autonomous Data Guard standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataguardRegionType")
        private DataguardRegionType dataguardRegionType;

        /**
         * **Deprecated.** The Autonomous Data Guard region type of the Autonomous Database. For
         * Autonomous Database Serverless, Autonomous Data Guard associations have designated
         * primary and standby regions, and these region types do not change when the database
         * changes roles. The standby regions in Autonomous Data Guard associations can be the same
         * region designated as the primary region, or they can be remote regions. Certain database
         * administrative operations may be available only in the primary region of the Autonomous
         * Data Guard association, and cannot be performed when the database using the primary role
         * is operating in a remote Autonomous Data Guard standby region.
         *
         * @param dataguardRegionType the value to set
         * @return this builder
         */
        public Builder dataguardRegionType(DataguardRegionType dataguardRegionType) {
            this.dataguardRegionType = dataguardRegionType;
            this.__explicitlySet__.add("dataguardRegionType");
            return this;
        }
        /**
         * The date and time the Autonomous Data Guard role was switched for the Autonomous
         * Database. For databases that have standbys in both the primary Data Guard region and a
         * remote Data Guard standby region, this is the latest timestamp of either the database
         * using the "primary" role in the primary Data Guard region, or database located in the
         * remote Data Guard standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
        private java.util.Date timeDataGuardRoleChanged;

        /**
         * The date and time the Autonomous Data Guard role was switched for the Autonomous
         * Database. For databases that have standbys in both the primary Data Guard region and a
         * remote Data Guard standby region, this is the latest timestamp of either the database
         * using the "primary" role in the primary Data Guard region, or database located in the
         * remote Data Guard standby region.
         *
         * @param timeDataGuardRoleChanged the value to set
         * @return this builder
         */
        public Builder timeDataGuardRoleChanged(java.util.Date timeDataGuardRoleChanged) {
            this.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
            this.__explicitlySet__.add("timeDataGuardRoleChanged");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of standby
         * databases located in Autonomous Data Guard remote regions that are associated with the
         * source database. Note that for Autonomous Database Serverless instances, standby
         * databases located in the same region as the source primary database do not have OCIDs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbIds")
        private java.util.List<String> peerDbIds;

        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of standby
         * databases located in Autonomous Data Guard remote regions that are associated with the
         * source database. Note that for Autonomous Database Serverless instances, standby
         * databases located in the same region as the source primary database do not have OCIDs.
         *
         * @param peerDbIds the value to set
         * @return this builder
         */
        public Builder peerDbIds(java.util.List<String> peerDbIds) {
            this.peerDbIds = peerDbIds;
            this.__explicitlySet__.add("peerDbIds");
            return this;
        }
        /**
         * Specifies if the Autonomous Database requires mTLS connections.
         *
         * <p>This may not be updated in parallel with any of the following: licenseModel,
         * databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps,
         * openMode, permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts,
         * dbVersion, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * <p>Service Change: The default value of the isMTLSConnectionRequired attribute will
         * change from true to false on July 1, 2023 in the following APIs: -
         * CreateAutonomousDatabase - GetAutonomousDatabase - UpdateAutonomousDatabase Details:
         * Prior to the July 1, 2023 change, the isMTLSConnectionRequired attribute default value
         * was true. This applies to Autonomous Database Serverless. Does this impact me? If you use
         * or maintain custom scripts or Terraform scripts referencing the CreateAutonomousDatabase,
         * GetAutonomousDatabase, or UpdateAutonomousDatabase APIs, you want to check, and possibly
         * modify, the scripts for the changed default value of the attribute. Should you choose not
         * to leave your scripts unchanged, the API calls containing this attribute will continue to
         * work, but the default value will switch from true to false. How do I make this change?
         * Using either OCI SDKs or command line tools, update your custom scripts to explicitly set
         * the isMTLSConnectionRequired attribute to true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        /**
         * Specifies if the Autonomous Database requires mTLS connections.
         *
         * <p>This may not be updated in parallel with any of the following: licenseModel,
         * databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps,
         * openMode, permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts,
         * dbVersion, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * <p>Service Change: The default value of the isMTLSConnectionRequired attribute will
         * change from true to false on July 1, 2023 in the following APIs: -
         * CreateAutonomousDatabase - GetAutonomousDatabase - UpdateAutonomousDatabase Details:
         * Prior to the July 1, 2023 change, the isMTLSConnectionRequired attribute default value
         * was true. This applies to Autonomous Database Serverless. Does this impact me? If you use
         * or maintain custom scripts or Terraform scripts referencing the CreateAutonomousDatabase,
         * GetAutonomousDatabase, or UpdateAutonomousDatabase APIs, you want to check, and possibly
         * modify, the scripts for the changed default value of the attribute. Should you choose not
         * to leave your scripts unchanged, the API calls containing this attribute will continue to
         * work, but the default value will switch from true to false. How do I make this change?
         * Using either OCI SDKs or command line tools, update your custom scripts to explicitly set
         * the isMTLSConnectionRequired attribute to true.
         *
         * @param isMtlsConnectionRequired the value to set
         * @return this builder
         */
        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }
        /** The time the member joined the resource pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfJoiningResourcePool")
        private java.util.Date timeOfJoiningResourcePool;

        /**
         * The time the member joined the resource pool.
         *
         * @param timeOfJoiningResourcePool the value to set
         * @return this builder
         */
        public Builder timeOfJoiningResourcePool(java.util.Date timeOfJoiningResourcePool) {
            this.timeOfJoiningResourcePool = timeOfJoiningResourcePool;
            this.__explicitlySet__.add("timeOfJoiningResourcePool");
            return this;
        }
        /**
         * The unique identifier for leader autonomous database OCID
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
        private String resourcePoolLeaderId;

        /**
         * The unique identifier for leader autonomous database OCID
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param resourcePoolLeaderId the value to set
         * @return this builder
         */
        public Builder resourcePoolLeaderId(String resourcePoolLeaderId) {
            this.resourcePoolLeaderId = resourcePoolLeaderId;
            this.__explicitlySet__.add("resourcePoolLeaderId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolSummary")
        private ResourcePoolSummary resourcePoolSummary;

        public Builder resourcePoolSummary(ResourcePoolSummary resourcePoolSummary) {
            this.resourcePoolSummary = resourcePoolSummary;
            this.__explicitlySet__.add("resourcePoolSummary");
            return this;
        }
        /** Indicates if the refreshable clone can be reconnected to its source database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isReconnectCloneEnabled")
        private Boolean isReconnectCloneEnabled;

        /**
         * Indicates if the refreshable clone can be reconnected to its source database.
         *
         * @param isReconnectCloneEnabled the value to set
         * @return this builder
         */
        public Builder isReconnectCloneEnabled(Boolean isReconnectCloneEnabled) {
            this.isReconnectCloneEnabled = isReconnectCloneEnabled;
            this.__explicitlySet__.add("isReconnectCloneEnabled");
            return this;
        }
        /**
         * The time and date as an RFC3339 formatted string, e.g., 2022-01-01T12:00:00.000Z, to set
         * the limit for a refreshable clone to be reconnected to its source database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUntilReconnectCloneEnabled")
        private java.util.Date timeUntilReconnectCloneEnabled;

        /**
         * The time and date as an RFC3339 formatted string, e.g., 2022-01-01T12:00:00.000Z, to set
         * the limit for a refreshable clone to be reconnected to its source database.
         *
         * @param timeUntilReconnectCloneEnabled the value to set
         * @return this builder
         */
        public Builder timeUntilReconnectCloneEnabled(
                java.util.Date timeUntilReconnectCloneEnabled) {
            this.timeUntilReconnectCloneEnabled = timeUntilReconnectCloneEnabled;
            this.__explicitlySet__.add("timeUntilReconnectCloneEnabled");
            return this;
        }
        /**
         * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance
         * schedule follows a schedule applying patches prior to the REGULAR schedule. A REGULAR
         * maintenance schedule follows the normal cycle
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
        private AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

        /**
         * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance
         * schedule follows a schedule applying patches prior to the REGULAR schedule. A REGULAR
         * maintenance schedule follows the normal cycle
         *
         * @param autonomousMaintenanceScheduleType the value to set
         * @return this builder
         */
        public Builder autonomousMaintenanceScheduleType(
                AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType) {
            this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
            this.__explicitlySet__.add("autonomousMaintenanceScheduleType");
            return this;
        }
        /**
         * The list of scheduled operations. Consists of values such as dayOfWeek,
         * scheduledStartTime, scheduledStopTime.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion,
         * isRefreshable, dbName, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
        private java.util.List<ScheduledOperationDetails> scheduledOperations;

        /**
         * The list of scheduled operations. Consists of values such as dayOfWeek,
         * scheduledStartTime, scheduledStopTime.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion,
         * isRefreshable, dbName, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param scheduledOperations the value to set
         * @return this builder
         */
        public Builder scheduledOperations(
                java.util.List<ScheduledOperationDetails> scheduledOperations) {
            this.scheduledOperations = scheduledOperations;
            this.__explicitlySet__.add("scheduledOperations");
            return this;
        }
        /**
         * Indicates if auto scaling is enabled for the Autonomous Database storage. The default
         * value is {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
        private Boolean isAutoScalingForStorageEnabled;

        /**
         * Indicates if auto scaling is enabled for the Autonomous Database storage. The default
         * value is {@code FALSE}.
         *
         * @param isAutoScalingForStorageEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingForStorageEnabled(Boolean isAutoScalingForStorageEnabled) {
            this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
            this.__explicitlySet__.add("isAutoScalingForStorageEnabled");
            return this;
        }
        /**
         * The amount of storage currently allocated for the database tables and billed for, rounded
         * up. When auto-scaling is not enabled, this value is equal to the {@code
         * dataStorageSizeInTBs} value. You can compare this value to the {@code
         * actualUsedDataStorageSizeInTBs} value to determine if a manual shrink operation is
         * appropriate for your allocated storage.
         *
         * <p>*Note:** Auto-scaling does not automatically decrease allocated storage when data is
         * deleted from the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInTBs")
        private Double allocatedStorageSizeInTBs;

        /**
         * The amount of storage currently allocated for the database tables and billed for, rounded
         * up. When auto-scaling is not enabled, this value is equal to the {@code
         * dataStorageSizeInTBs} value. You can compare this value to the {@code
         * actualUsedDataStorageSizeInTBs} value to determine if a manual shrink operation is
         * appropriate for your allocated storage.
         *
         * <p>*Note:** Auto-scaling does not automatically decrease allocated storage when data is
         * deleted from the database.
         *
         * @param allocatedStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder allocatedStorageSizeInTBs(Double allocatedStorageSizeInTBs) {
            this.allocatedStorageSizeInTBs = allocatedStorageSizeInTBs;
            this.__explicitlySet__.add("allocatedStorageSizeInTBs");
            return this;
        }
        /** The current amount of storage in use for user and system data, in terabytes (TB). */
        @com.fasterxml.jackson.annotation.JsonProperty("actualUsedDataStorageSizeInTBs")
        private Double actualUsedDataStorageSizeInTBs;

        /**
         * The current amount of storage in use for user and system data, in terabytes (TB).
         *
         * @param actualUsedDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder actualUsedDataStorageSizeInTBs(Double actualUsedDataStorageSizeInTBs) {
            this.actualUsedDataStorageSizeInTBs = actualUsedDataStorageSizeInTBs;
            this.__explicitlySet__.add("actualUsedDataStorageSizeInTBs");
            return this;
        }
        /** The Oracle Database Edition that applies to the Autonomous databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to the Autonomous databases.
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
         * The list of database tools details.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion,
         * isRefreshable, dbName, scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
        private java.util.List<DatabaseTool> dbToolsDetails;

        /**
         * The list of database tools details.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired,
         * openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion,
         * isRefreshable, dbName, scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param dbToolsDetails the value to set
         * @return this builder
         */
        public Builder dbToolsDetails(java.util.List<DatabaseTool> dbToolsDetails) {
            this.dbToolsDetails = dbToolsDetails;
            this.__explicitlySet__.add("dbToolsDetails");
            return this;
        }
        /**
         * Indicates the local disaster recovery (DR) type of the Autonomous Database Serverless
         * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
         * recovery time objective (RTO) during failover or switchover. Backup-based DR type
         * provides lower cost DR with a slower RTO during failover or switchover.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localDisasterRecoveryType")
        private DisasterRecoveryConfiguration.DisasterRecoveryType localDisasterRecoveryType;

        /**
         * Indicates the local disaster recovery (DR) type of the Autonomous Database Serverless
         * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
         * recovery time objective (RTO) during failover or switchover. Backup-based DR type
         * provides lower cost DR with a slower RTO during failover or switchover.
         *
         * @param localDisasterRecoveryType the value to set
         * @return this builder
         */
        public Builder localDisasterRecoveryType(
                DisasterRecoveryConfiguration.DisasterRecoveryType localDisasterRecoveryType) {
            this.localDisasterRecoveryType = localDisasterRecoveryType;
            this.__explicitlySet__.add("localDisasterRecoveryType");
            return this;
        }
        /**
         * **Deprecated.** The disaster recovery (DR) region type of the Autonomous Database. For
         * Autonomous Database Serverless instances, DR associations have designated primary and
         * standby regions. These region types do not change when the database changes roles. The
         * standby region in DR associations can be the same region as the primary region, or they
         * can be in a remote regions. Some database administration operations may be available only
         * in the primary region of the DR association, and cannot be performed when the database
         * using the primary role is operating in a remote region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryRegionType")
        private DisasterRecoveryRegionType disasterRecoveryRegionType;

        /**
         * **Deprecated.** The disaster recovery (DR) region type of the Autonomous Database. For
         * Autonomous Database Serverless instances, DR associations have designated primary and
         * standby regions. These region types do not change when the database changes roles. The
         * standby region in DR associations can be the same region as the primary region, or they
         * can be in a remote regions. Some database administration operations may be available only
         * in the primary region of the DR association, and cannot be performed when the database
         * using the primary role is operating in a remote region.
         *
         * @param disasterRecoveryRegionType the value to set
         * @return this builder
         */
        public Builder disasterRecoveryRegionType(
                DisasterRecoveryRegionType disasterRecoveryRegionType) {
            this.disasterRecoveryRegionType = disasterRecoveryRegionType;
            this.__explicitlySet__.add("disasterRecoveryRegionType");
            return this;
        }
        /**
         * The date and time the Disaster Recovery role was switched for the standby Autonomous
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDisasterRecoveryRoleChanged")
        private java.util.Date timeDisasterRecoveryRoleChanged;

        /**
         * The date and time the Disaster Recovery role was switched for the standby Autonomous
         * Database.
         *
         * @param timeDisasterRecoveryRoleChanged the value to set
         * @return this builder
         */
        public Builder timeDisasterRecoveryRoleChanged(
                java.util.Date timeDisasterRecoveryRoleChanged) {
            this.timeDisasterRecoveryRoleChanged = timeDisasterRecoveryRoleChanged;
            this.__explicitlySet__.add("timeDisasterRecoveryRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remoteDisasterRecoveryConfiguration")
        private DisasterRecoveryConfiguration remoteDisasterRecoveryConfiguration;

        public Builder remoteDisasterRecoveryConfiguration(
                DisasterRecoveryConfiguration remoteDisasterRecoveryConfiguration) {
            this.remoteDisasterRecoveryConfiguration = remoteDisasterRecoveryConfiguration;
            this.__explicitlySet__.add("remoteDisasterRecoveryConfiguration");
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
        /** The availability domain where the Autonomous Database Serverless instance is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain where the Autonomous Database Serverless instance is located.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Autonomous Serverless Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Autonomous Serverless Database.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * A list of the source Autonomous Database's table space number(s) used to create this
         * partial clone from the backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloneTableSpaceList")
        private java.util.List<Integer> cloneTableSpaceList;

        /**
         * A list of the source Autonomous Database's table space number(s) used to create this
         * partial clone from the backup.
         *
         * @param cloneTableSpaceList the value to set
         * @return this builder
         */
        public Builder cloneTableSpaceList(java.util.List<Integer> cloneTableSpaceList) {
            this.cloneTableSpaceList = cloneTableSpaceList;
            this.__explicitlySet__.add("cloneTableSpaceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabase build() {
            AutonomousDatabase model =
                    new AutonomousDatabase(
                            this.id,
                            this.compartmentId,
                            this.subscriptionId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.kmsKeyId,
                            this.vaultId,
                            this.kmsKeyLifecycleDetails,
                            this.encryptionKey,
                            this.kmsKeyVersionId,
                            this.dbName,
                            this.characterSet,
                            this.ncharacterSet,
                            this.inMemoryPercentage,
                            this.inMemoryAreaInGBs,
                            this.nextLongTermBackupTimeStamp,
                            this.longTermBackupSchedule,
                            this.isFreeTier,
                            this.systemTags,
                            this.timeReclamationOfFreeAutonomousDatabase,
                            this.timeDeletionOfFreeAutonomousDatabase,
                            this.backupConfig,
                            this.keyHistoryEntry,
                            this.encryptionKeyHistoryEntry,
                            this.cpuCoreCount,
                            this.localAdgAutoFailoverMaxDataLossLimit,
                            this.computeModel,
                            this.computeCount,
                            this.backupRetentionPeriodInDays,
                            this.totalBackupStorageSizeInGBs,
                            this.ocpuCount,
                            this.provisionableCpus,
                            this.dataStorageSizeInTBs,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.dataStorageSizeInGBs,
                            this.usedDataStorageSizeInGBs,
                            this.infrastructureType,
                            this.isDedicated,
                            this.autonomousContainerDatabaseId,
                            this.isBackupRetentionLocked,
                            this.timeUndeleted,
                            this.timeCreated,
                            this.displayName,
                            this.serviceConsoleUrl,
                            this.connectionStrings,
                            this.connectionUrls,
                            this.publicConnectionUrls,
                            this.licenseModel,
                            this.byolComputeCountLimit,
                            this.usedDataStorageSizeInTBs,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.subnetId,
                            this.nsgIds,
                            this.privateEndpoint,
                            this.publicEndpoint,
                            this.privateEndpointLabel,
                            this.privateEndpointIp,
                            this.dbVersion,
                            this.isPreview,
                            this.dbWorkload,
                            this.isDevTier,
                            this.isAccessControlEnabled,
                            this.whitelistedIps,
                            this.arePrimaryWhitelistedIpsUsed,
                            this.standbyWhitelistedIps,
                            this.apexDetails,
                            this.isAutoScalingEnabled,
                            this.dataSafeStatus,
                            this.operationsInsightsStatus,
                            this.databaseManagementStatus,
                            this.timeMaintenanceBegin,
                            this.timeMaintenanceEnd,
                            this.maintenanceTargetComponent,
                            this.isRefreshableClone,
                            this.timeOfLastRefresh,
                            this.timeOfLastRefreshPoint,
                            this.timeOfNextRefresh,
                            this.openMode,
                            this.refreshableStatus,
                            this.refreshableMode,
                            this.sourceId,
                            this.permissionLevel,
                            this.timeOfLastSwitchover,
                            this.timeOfLastFailover,
                            this.isDataGuardEnabled,
                            this.failedDataRecoveryInSeconds,
                            this.standbyDb,
                            this.isLocalDataGuardEnabled,
                            this.isRemoteDataGuardEnabled,
                            this.localStandbyDb,
                            this.role,
                            this.availableUpgradeVersions,
                            this.keyStoreId,
                            this.keyStoreWalletName,
                            this.autoRefreshFrequencyInSeconds,
                            this.autoRefreshPointLagInSeconds,
                            this.timeOfAutoRefreshStart,
                            this.supportedRegionsToCloneTo,
                            this.customerContacts,
                            this.timeLocalDataGuardEnabled,
                            this.dataguardRegionType,
                            this.timeDataGuardRoleChanged,
                            this.peerDbIds,
                            this.isMtlsConnectionRequired,
                            this.timeOfJoiningResourcePool,
                            this.resourcePoolLeaderId,
                            this.resourcePoolSummary,
                            this.isReconnectCloneEnabled,
                            this.timeUntilReconnectCloneEnabled,
                            this.autonomousMaintenanceScheduleType,
                            this.scheduledOperations,
                            this.isAutoScalingForStorageEnabled,
                            this.allocatedStorageSizeInTBs,
                            this.actualUsedDataStorageSizeInTBs,
                            this.databaseEdition,
                            this.dbToolsDetails,
                            this.localDisasterRecoveryType,
                            this.disasterRecoveryRegionType,
                            this.timeDisasterRecoveryRoleChanged,
                            this.remoteDisasterRecoveryConfiguration,
                            this.netServicesArchitecture,
                            this.availabilityDomain,
                            this.clusterPlacementGroupId,
                            this.cloneTableSpaceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyLifecycleDetails")) {
                this.kmsKeyLifecycleDetails(model.getKmsKeyLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("encryptionKey")) {
                this.encryptionKey(model.getEncryptionKey());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("inMemoryPercentage")) {
                this.inMemoryPercentage(model.getInMemoryPercentage());
            }
            if (model.wasPropertyExplicitlySet("inMemoryAreaInGBs")) {
                this.inMemoryAreaInGBs(model.getInMemoryAreaInGBs());
            }
            if (model.wasPropertyExplicitlySet("nextLongTermBackupTimeStamp")) {
                this.nextLongTermBackupTimeStamp(model.getNextLongTermBackupTimeStamp());
            }
            if (model.wasPropertyExplicitlySet("longTermBackupSchedule")) {
                this.longTermBackupSchedule(model.getLongTermBackupSchedule());
            }
            if (model.wasPropertyExplicitlySet("isFreeTier")) {
                this.isFreeTier(model.getIsFreeTier());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeReclamationOfFreeAutonomousDatabase")) {
                this.timeReclamationOfFreeAutonomousDatabase(
                        model.getTimeReclamationOfFreeAutonomousDatabase());
            }
            if (model.wasPropertyExplicitlySet("timeDeletionOfFreeAutonomousDatabase")) {
                this.timeDeletionOfFreeAutonomousDatabase(
                        model.getTimeDeletionOfFreeAutonomousDatabase());
            }
            if (model.wasPropertyExplicitlySet("backupConfig")) {
                this.backupConfig(model.getBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("keyHistoryEntry")) {
                this.keyHistoryEntry(model.getKeyHistoryEntry());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyHistoryEntry")) {
                this.encryptionKeyHistoryEntry(model.getEncryptionKeyHistoryEntry());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("localAdgAutoFailoverMaxDataLossLimit")) {
                this.localAdgAutoFailoverMaxDataLossLimit(
                        model.getLocalAdgAutoFailoverMaxDataLossLimit());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("backupRetentionPeriodInDays")) {
                this.backupRetentionPeriodInDays(model.getBackupRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("totalBackupStorageSizeInGBs")) {
                this.totalBackupStorageSizeInGBs(model.getTotalBackupStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("provisionableCpus")) {
                this.provisionableCpus(model.getProvisionableCpus());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("usedDataStorageSizeInGBs")) {
                this.usedDataStorageSizeInGBs(model.getUsedDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("infrastructureType")) {
                this.infrastructureType(model.getInfrastructureType());
            }
            if (model.wasPropertyExplicitlySet("isDedicated")) {
                this.isDedicated(model.getIsDedicated());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseId")) {
                this.autonomousContainerDatabaseId(model.getAutonomousContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("isBackupRetentionLocked")) {
                this.isBackupRetentionLocked(model.getIsBackupRetentionLocked());
            }
            if (model.wasPropertyExplicitlySet("timeUndeleted")) {
                this.timeUndeleted(model.getTimeUndeleted());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("serviceConsoleUrl")) {
                this.serviceConsoleUrl(model.getServiceConsoleUrl());
            }
            if (model.wasPropertyExplicitlySet("connectionStrings")) {
                this.connectionStrings(model.getConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("connectionUrls")) {
                this.connectionUrls(model.getConnectionUrls());
            }
            if (model.wasPropertyExplicitlySet("publicConnectionUrls")) {
                this.publicConnectionUrls(model.getPublicConnectionUrls());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("byolComputeCountLimit")) {
                this.byolComputeCountLimit(model.getByolComputeCountLimit());
            }
            if (model.wasPropertyExplicitlySet("usedDataStorageSizeInTBs")) {
                this.usedDataStorageSizeInTBs(model.getUsedDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateEndpoint")) {
                this.privateEndpoint(model.getPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("publicEndpoint")) {
                this.publicEndpoint(model.getPublicEndpoint());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointLabel")) {
                this.privateEndpointLabel(model.getPrivateEndpointLabel());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("isPreview")) {
                this.isPreview(model.getIsPreview());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("isDevTier")) {
                this.isDevTier(model.getIsDevTier());
            }
            if (model.wasPropertyExplicitlySet("isAccessControlEnabled")) {
                this.isAccessControlEnabled(model.getIsAccessControlEnabled());
            }
            if (model.wasPropertyExplicitlySet("whitelistedIps")) {
                this.whitelistedIps(model.getWhitelistedIps());
            }
            if (model.wasPropertyExplicitlySet("arePrimaryWhitelistedIpsUsed")) {
                this.arePrimaryWhitelistedIpsUsed(model.getArePrimaryWhitelistedIpsUsed());
            }
            if (model.wasPropertyExplicitlySet("standbyWhitelistedIps")) {
                this.standbyWhitelistedIps(model.getStandbyWhitelistedIps());
            }
            if (model.wasPropertyExplicitlySet("apexDetails")) {
                this.apexDetails(model.getApexDetails());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("dataSafeStatus")) {
                this.dataSafeStatus(model.getDataSafeStatus());
            }
            if (model.wasPropertyExplicitlySet("operationsInsightsStatus")) {
                this.operationsInsightsStatus(model.getOperationsInsightsStatus());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementStatus")) {
                this.databaseManagementStatus(model.getDatabaseManagementStatus());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceBegin")) {
                this.timeMaintenanceBegin(model.getTimeMaintenanceBegin());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceEnd")) {
                this.timeMaintenanceEnd(model.getTimeMaintenanceEnd());
            }
            if (model.wasPropertyExplicitlySet("maintenanceTargetComponent")) {
                this.maintenanceTargetComponent(model.getMaintenanceTargetComponent());
            }
            if (model.wasPropertyExplicitlySet("isRefreshableClone")) {
                this.isRefreshableClone(model.getIsRefreshableClone());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastRefresh")) {
                this.timeOfLastRefresh(model.getTimeOfLastRefresh());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastRefreshPoint")) {
                this.timeOfLastRefreshPoint(model.getTimeOfLastRefreshPoint());
            }
            if (model.wasPropertyExplicitlySet("timeOfNextRefresh")) {
                this.timeOfNextRefresh(model.getTimeOfNextRefresh());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            if (model.wasPropertyExplicitlySet("refreshableStatus")) {
                this.refreshableStatus(model.getRefreshableStatus());
            }
            if (model.wasPropertyExplicitlySet("refreshableMode")) {
                this.refreshableMode(model.getRefreshableMode());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("permissionLevel")) {
                this.permissionLevel(model.getPermissionLevel());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastSwitchover")) {
                this.timeOfLastSwitchover(model.getTimeOfLastSwitchover());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastFailover")) {
                this.timeOfLastFailover(model.getTimeOfLastFailover());
            }
            if (model.wasPropertyExplicitlySet("isDataGuardEnabled")) {
                this.isDataGuardEnabled(model.getIsDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("failedDataRecoveryInSeconds")) {
                this.failedDataRecoveryInSeconds(model.getFailedDataRecoveryInSeconds());
            }
            if (model.wasPropertyExplicitlySet("standbyDb")) {
                this.standbyDb(model.getStandbyDb());
            }
            if (model.wasPropertyExplicitlySet("isLocalDataGuardEnabled")) {
                this.isLocalDataGuardEnabled(model.getIsLocalDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRemoteDataGuardEnabled")) {
                this.isRemoteDataGuardEnabled(model.getIsRemoteDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("localStandbyDb")) {
                this.localStandbyDb(model.getLocalStandbyDb());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("availableUpgradeVersions")) {
                this.availableUpgradeVersions(model.getAvailableUpgradeVersions());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreWalletName")) {
                this.keyStoreWalletName(model.getKeyStoreWalletName());
            }
            if (model.wasPropertyExplicitlySet("autoRefreshFrequencyInSeconds")) {
                this.autoRefreshFrequencyInSeconds(model.getAutoRefreshFrequencyInSeconds());
            }
            if (model.wasPropertyExplicitlySet("autoRefreshPointLagInSeconds")) {
                this.autoRefreshPointLagInSeconds(model.getAutoRefreshPointLagInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeOfAutoRefreshStart")) {
                this.timeOfAutoRefreshStart(model.getTimeOfAutoRefreshStart());
            }
            if (model.wasPropertyExplicitlySet("supportedRegionsToCloneTo")) {
                this.supportedRegionsToCloneTo(model.getSupportedRegionsToCloneTo());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("timeLocalDataGuardEnabled")) {
                this.timeLocalDataGuardEnabled(model.getTimeLocalDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("dataguardRegionType")) {
                this.dataguardRegionType(model.getDataguardRegionType());
            }
            if (model.wasPropertyExplicitlySet("timeDataGuardRoleChanged")) {
                this.timeDataGuardRoleChanged(model.getTimeDataGuardRoleChanged());
            }
            if (model.wasPropertyExplicitlySet("peerDbIds")) {
                this.peerDbIds(model.getPeerDbIds());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
            }
            if (model.wasPropertyExplicitlySet("timeOfJoiningResourcePool")) {
                this.timeOfJoiningResourcePool(model.getTimeOfJoiningResourcePool());
            }
            if (model.wasPropertyExplicitlySet("resourcePoolLeaderId")) {
                this.resourcePoolLeaderId(model.getResourcePoolLeaderId());
            }
            if (model.wasPropertyExplicitlySet("resourcePoolSummary")) {
                this.resourcePoolSummary(model.getResourcePoolSummary());
            }
            if (model.wasPropertyExplicitlySet("isReconnectCloneEnabled")) {
                this.isReconnectCloneEnabled(model.getIsReconnectCloneEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeUntilReconnectCloneEnabled")) {
                this.timeUntilReconnectCloneEnabled(model.getTimeUntilReconnectCloneEnabled());
            }
            if (model.wasPropertyExplicitlySet("autonomousMaintenanceScheduleType")) {
                this.autonomousMaintenanceScheduleType(
                        model.getAutonomousMaintenanceScheduleType());
            }
            if (model.wasPropertyExplicitlySet("scheduledOperations")) {
                this.scheduledOperations(model.getScheduledOperations());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingForStorageEnabled")) {
                this.isAutoScalingForStorageEnabled(model.getIsAutoScalingForStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("allocatedStorageSizeInTBs")) {
                this.allocatedStorageSizeInTBs(model.getAllocatedStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("actualUsedDataStorageSizeInTBs")) {
                this.actualUsedDataStorageSizeInTBs(model.getActualUsedDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("dbToolsDetails")) {
                this.dbToolsDetails(model.getDbToolsDetails());
            }
            if (model.wasPropertyExplicitlySet("localDisasterRecoveryType")) {
                this.localDisasterRecoveryType(model.getLocalDisasterRecoveryType());
            }
            if (model.wasPropertyExplicitlySet("disasterRecoveryRegionType")) {
                this.disasterRecoveryRegionType(model.getDisasterRecoveryRegionType());
            }
            if (model.wasPropertyExplicitlySet("timeDisasterRecoveryRoleChanged")) {
                this.timeDisasterRecoveryRoleChanged(model.getTimeDisasterRecoveryRoleChanged());
            }
            if (model.wasPropertyExplicitlySet("remoteDisasterRecoveryConfiguration")) {
                this.remoteDisasterRecoveryConfiguration(
                        model.getRemoteDisasterRecoveryConfiguration());
            }
            if (model.wasPropertyExplicitlySet("netServicesArchitecture")) {
                this.netServicesArchitecture(model.getNetServicesArchitecture());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("cloneTableSpaceList")) {
                this.cloneTableSpaceList(model.getCloneTableSpaceList());
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
     * Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database.
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** The current state of the Autonomous Database. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Unavailable("UNAVAILABLE"),
        RestoreInProgress("RESTORE_IN_PROGRESS"),
        RestoreFailed("RESTORE_FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        ScaleInProgress("SCALE_IN_PROGRESS"),
        AvailableNeedsAttention("AVAILABLE_NEEDS_ATTENTION"),
        Updating("UPDATING"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Restarting("RESTARTING"),
        Recreating("RECREATING"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Upgrading("UPGRADING"),
        Inaccessible("INACCESSIBLE"),
        Standby("STANDBY"),

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
    /** The current state of the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous Database.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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

    /** KMS key lifecycle details. */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyLifecycleDetails")
    private final String kmsKeyLifecycleDetails;

    /**
     * KMS key lifecycle details.
     *
     * @return the value
     */
    public String getKmsKeyLifecycleDetails() {
        return kmsKeyLifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
    private final AutonomousDatabaseEncryptionKeyDetails encryptionKey;

    public AutonomousDatabaseEncryptionKeyDetails getEncryptionKey() {
        return encryptionKey;
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
     * The character set for the autonomous database. The default is AL32UTF8. Allowed values are:
     *
     * <p>AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
     * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
     * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
     * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
     * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
     * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869,
     * ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS,
     * IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS,
     * KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772,
     * LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA,
     * RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS,
     * TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG,
     * WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970,
     * WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5,
     * ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the autonomous database. The default is AL32UTF8. Allowed values are:
     *
     * <p>AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6,
     * AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707,
     * AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775,
     * BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U,
     * CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250,
     * EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869,
     * ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS,
     * IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS,
     * KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772,
     * LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA,
     * RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS,
     * TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG,
     * WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970,
     * WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5,
     * ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The national character set for the autonomous database. The default is AL16UTF16. Allowed
     * values are: AL16UTF16 or UTF8.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the autonomous database. The default is AL16UTF16. Allowed
     * values are: AL16UTF16 or UTF8.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous
     * Database. This property is applicable only to Autonomous Databases on the Exadata
     * Cloud@Customer platform.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inMemoryPercentage")
    private final Integer inMemoryPercentage;

    /**
     * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous
     * Database. This property is applicable only to Autonomous Databases on the Exadata
     * Cloud@Customer platform.
     *
     * @return the value
     */
    public Integer getInMemoryPercentage() {
        return inMemoryPercentage;
    }

    /** The area assigned to In-Memory tables in Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("inMemoryAreaInGBs")
    private final Integer inMemoryAreaInGBs;

    /**
     * The area assigned to In-Memory tables in Autonomous Database.
     *
     * @return the value
     */
    public Integer getInMemoryAreaInGBs() {
        return inMemoryAreaInGBs;
    }

    /** The date and time when the next long-term backup would be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextLongTermBackupTimeStamp")
    private final java.util.Date nextLongTermBackupTimeStamp;

    /**
     * The date and time when the next long-term backup would be created.
     *
     * @return the value
     */
    public java.util.Date getNextLongTermBackupTimeStamp() {
        return nextLongTermBackupTimeStamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("longTermBackupSchedule")
    private final LongTermBackUpScheduleDetails longTermBackupSchedule;

    public LongTermBackUpScheduleDetails getLongTermBackupSchedule() {
        return longTermBackupSchedule;
    }

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always
     * Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory
     * and CPU cannot be scaled.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isLocalDataGuardEnabled
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    private final Boolean isFreeTier;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always
     * Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory
     * and CPU cannot be scaled.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isLocalDataGuardEnabled
     *
     * @return the value
     */
    public Boolean getIsFreeTier() {
        return isFreeTier;
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

    /**
     * The date and time the Always Free database will be stopped because of inactivity. If this
     * time is reached without any database activity, the database will automatically be put into
     * the STOPPED state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReclamationOfFreeAutonomousDatabase")
    private final java.util.Date timeReclamationOfFreeAutonomousDatabase;

    /**
     * The date and time the Always Free database will be stopped because of inactivity. If this
     * time is reached without any database activity, the database will automatically be put into
     * the STOPPED state.
     *
     * @return the value
     */
    public java.util.Date getTimeReclamationOfFreeAutonomousDatabase() {
        return timeReclamationOfFreeAutonomousDatabase;
    }

    /**
     * The date and time the Always Free database will be automatically deleted because of
     * inactivity. If the database is in the STOPPED state and without activity until this time, it
     * will be deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionOfFreeAutonomousDatabase")
    private final java.util.Date timeDeletionOfFreeAutonomousDatabase;

    /**
     * The date and time the Always Free database will be automatically deleted because of
     * inactivity. If the database is in the STOPPED state and without activity until this time, it
     * will be deleted.
     *
     * @return the value
     */
    public java.util.Date getTimeDeletionOfFreeAutonomousDatabase() {
        return timeDeletionOfFreeAutonomousDatabase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    private final AutonomousDatabaseBackupConfig backupConfig;

    public AutonomousDatabaseBackupConfig getBackupConfig() {
        return backupConfig;
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

    /** Key History Entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyHistoryEntry")
    private final java.util.List<AutonomousDatabaseEncryptionKeyHistoryEntry>
            encryptionKeyHistoryEntry;

    /**
     * Key History Entry.
     *
     * @return the value
     */
    public java.util.List<AutonomousDatabaseEncryptionKeyHistoryEntry>
            getEncryptionKeyHistoryEntry() {
        return encryptionKeyHistoryEntry;
    }

    /**
     * The number of CPU cores to be made available to the database. When the ECPU is selected, the
     * value for cpuCoreCount is 0. For Autonomous Database on Dedicated Exadata infrastructure, the
     * maximum number of cores is determined by the infrastructure shape. See [Characteristics of
     * Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores to be made available to the database. When the ECPU is selected, the
     * value for cpuCoreCount is 0. For Autonomous Database on Dedicated Exadata infrastructure, the
     * maximum number of cores is determined by the infrastructure shape. See [Characteristics of
     * Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * Parameter that allows users to select an acceptable maximum data loss limit in seconds, up to
     * which Automatic Failover will be triggered when necessary for a Local Autonomous Data Guard
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localAdgAutoFailoverMaxDataLossLimit")
    private final Integer localAdgAutoFailoverMaxDataLossLimit;

    /**
     * Parameter that allows users to select an acceptable maximum data loss limit in seconds, up to
     * which Automatic Failover will be triggered when necessary for a Local Autonomous Data Guard
     *
     * @return the value
     */
    public Integer getLocalAdgAutoFailoverMaxDataLossLimit() {
        return localAdgAutoFailoverMaxDataLossLimit;
    }

    /**
     * The compute model of the Autonomous Database. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU
     * compute model is legacy.
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
     * The compute model of the Autonomous Database. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU
     * compute model is legacy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Autonomous Database. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU
     * compute model is legacy.
     *
     * @return the value
     */
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /**
     * The compute amount (CPUs) available to the database. Minimum and maximum values depend on the
     * compute model and whether the database is an Autonomous Database Serverless instance or an
     * Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model requires a
     * minimum value of one, for databases in the elastic resource pool and minimum value of two,
     * otherwise. Required when using the {@code computeModel} parameter. When using {@code
     * cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.
     * Providing {@code computeModel} and {@code computeCount} is the preferred method for both OCPU
     * and ECPU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute amount (CPUs) available to the database. Minimum and maximum values depend on the
     * compute model and whether the database is an Autonomous Database Serverless instance or an
     * Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model requires a
     * minimum value of one, for databases in the elastic resource pool and minimum value of two,
     * otherwise. Required when using the {@code computeModel} parameter. When using {@code
     * cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.
     * Providing {@code computeModel} and {@code computeCount} is the preferred method for both OCPU
     * and ECPU.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /** Retention period, in days, for long-term backups */
    @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
    private final Integer backupRetentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     *
     * @return the value
     */
    public Integer getBackupRetentionPeriodInDays() {
        return backupRetentionPeriodInDays;
    }

    /** The backup storage to the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalBackupStorageSizeInGBs")
    private final Double totalBackupStorageSizeInGBs;

    /**
     * The backup storage to the database.
     *
     * @return the value
     */
    public Double getTotalBackupStorageSizeInGBs() {
        return totalBackupStorageSizeInGBs;
    }

    /**
     * The number of OCPU cores to be made available to the database.
     *
     * <p>The following points apply: - For Autonomous Databases on Dedicated Exadata
     * Infrastructure, to provision less than 1 core, enter a fractional value in an increment of
     * 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that
     * fractional OCPU values are not supported for Autonomous Database Serverless instances.) - To
     * provision cores, enter an integer between 1 and the maximum number of cores available for the
     * infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores.
     * This applies to Autonomous Databases on both serverless and dedicated Exadata infrastructure.
     * - For Autonomous Database Serverless instances, this parameter is not used.
     *
     * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, the maximum number of cores
     * is determined by the infrastructure shape. See [Characteristics of Infrastructure
     * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to be made available to the database.
     *
     * <p>The following points apply: - For Autonomous Databases on Dedicated Exadata
     * Infrastructure, to provision less than 1 core, enter a fractional value in an increment of
     * 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that
     * fractional OCPU values are not supported for Autonomous Database Serverless instances.) - To
     * provision cores, enter an integer between 1 and the maximum number of cores available for the
     * infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores.
     * This applies to Autonomous Databases on both serverless and dedicated Exadata infrastructure.
     * - For Autonomous Database Serverless instances, this parameter is not used.
     *
     * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, the maximum number of cores
     * is determined by the infrastructure shape. See [Characteristics of Infrastructure
     * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     * @return the value
     */
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /** An array of CPU values that an Autonomous Database can be scaled to. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableCpus")
    private final java.util.List<Float> provisionableCpus;

    /**
     * An array of CPU values that an Autonomous Database can be scaled to.
     *
     * @return the value
     */
    public java.util.List<Float> getProvisionableCpus() {
        return provisionableCpus;
    }

    /**
     * The quantity of data in the database, in terabytes.
     *
     * <p>The following points apply to Autonomous Databases on Serverless Infrastructure: - This is
     * an integer field whose value remains null when the data size is in GBs and cannot be
     * converted to TBs (by dividing the GB value by 1024) without rounding error. - To get the
     * exact value of data storage size without rounding error, please see {@code
     * dataStorageSizeInGBs} of Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The quantity of data in the database, in terabytes.
     *
     * <p>The following points apply to Autonomous Databases on Serverless Infrastructure: - This is
     * an integer field whose value remains null when the data size is in GBs and cannot be
     * converted to TBs (by dividing the GB value by 1024) without rounding error. - To get the
     * exact value of data storage size without rounding error, please see {@code
     * dataStorageSizeInGBs} of Autonomous Database.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The amount of memory (in GBs) enabled per ECPU or OCPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) enabled per ECPU or OCPU.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
    }

    /**
     * The quantity of data in the database, in gigabytes.
     *
     * <p>For Autonomous Transaction Processing databases using ECPUs on Serverless Infrastructure,
     * this value is always populated. In all the other cases, this value will be null and {@code
     * dataStorageSizeInTBs} will be populated instead.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The quantity of data in the database, in gigabytes.
     *
     * <p>For Autonomous Transaction Processing databases using ECPUs on Serverless Infrastructure,
     * this value is always populated. In all the other cases, this value will be null and {@code
     * dataStorageSizeInTBs} will be populated instead.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /** The storage space consumed by Autonomous Database in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInGBs")
    private final Integer usedDataStorageSizeInGBs;

    /**
     * The storage space consumed by Autonomous Database in GBs.
     *
     * @return the value
     */
    public Integer getUsedDataStorageSizeInGBs() {
        return usedDataStorageSizeInGBs;
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
     * True if the database uses [dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    private final Boolean isDedicated;

    /**
     * True if the database uses [dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     * @return the value
     */
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Used only by
     * Autonomous Database on Dedicated Exadata Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    private final String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Used only by
     * Autonomous Database on Dedicated Exadata Infrastructure.
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }

    /** Indicates if the Autonomous Database is backup retention locked. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBackupRetentionLocked")
    private final Boolean isBackupRetentionLocked;

    /**
     * Indicates if the Autonomous Database is backup retention locked.
     *
     * @return the value
     */
    public Boolean getIsBackupRetentionLocked() {
        return isBackupRetentionLocked;
    }

    /** The date and time the Autonomous Database was most recently undeleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUndeleted")
    private final java.util.Date timeUndeleted;

    /**
     * The date and time the Autonomous Database was most recently undeleted.
     *
     * @return the value
     */
    public java.util.Date getTimeUndeleted() {
        return timeUndeleted;
    }

    /** The date and time the Autonomous Database was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Autonomous Database was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The user-friendly name for the Autonomous Database. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The URL of the Service Console for the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
    private final String serviceConsoleUrl;

    /**
     * The URL of the Service Console for the Autonomous Database.
     *
     * @return the value
     */
    public String getServiceConsoleUrl() {
        return serviceConsoleUrl;
    }

    /**
     * The connection string used to connect to the Autonomous Database. The username for the
     * Service Console is ADMIN. Use the password you entered when creating the Autonomous Database
     * for the password value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    private final AutonomousDatabaseConnectionStrings connectionStrings;

    /**
     * The connection string used to connect to the Autonomous Database. The username for the
     * Service Console is ADMIN. Use the password you entered when creating the Autonomous Database
     * for the password value.
     *
     * @return the value
     */
    public AutonomousDatabaseConnectionStrings getConnectionStrings() {
        return connectionStrings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrls")
    private final AutonomousDatabaseConnectionUrls connectionUrls;

    public AutonomousDatabaseConnectionUrls getConnectionUrls() {
        return connectionUrls;
    }

    /**
     * The Public URLs of Private Endpoint database for accessing Oracle Application Express (APEX)
     * and SQL Developer Web with a browser from a Compute instance within your VCN or that has a
     * direct connection to your VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicConnectionUrls")
    private final AutonomousDatabaseConnectionUrls publicConnectionUrls;

    /**
     * The Public URLs of Private Endpoint database for accessing Oracle Application Express (APEX)
     * and SQL Developer Web with a browser from a Compute instance within your VCN or that has a
     * direct connection to your VCN.
     *
     * @return the value
     */
    public AutonomousDatabaseConnectionUrls getPublicConnectionUrls() {
        return publicConnectionUrls;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle Database software licenses and the Oracle Database service. Note that
     * when provisioning an [Autonomous Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle Database software licenses and the Oracle Database service. Note that
     * when provisioning an [Autonomous Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle services in the cloud. License Included allows you to
     * subscribe to new Oracle Database software licenses and the Oracle Database service. Note that
     * when provisioning an [Autonomous Database on dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null. It is already set at the Autonomous Exadata Infrastructure level.
     * When provisioning an [Autonomous Database Serverless]
     * (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value
     * is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your
     * own license (BYOL) also allows you to select the DB edition using the optional parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The maximum number of CPUs allowed with a Bring Your Own License (BYOL), including those used
     * for auto-scaling, disaster recovery, tools, etc. Any CPU usage above this limit is considered
     * as License Included and billed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("byolComputeCountLimit")
    private final Float byolComputeCountLimit;

    /**
     * The maximum number of CPUs allowed with a Bring Your Own License (BYOL), including those used
     * for auto-scaling, disaster recovery, tools, etc. Any CPU usage above this limit is considered
     * as License Included and billed.
     *
     * @return the value
     */
    public Float getByolComputeCountLimit() {
        return byolComputeCountLimit;
    }

    /**
     * The amount of storage that has been used for Autonomous Databases in dedicated
     * infrastructure, in terabytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInTBs")
    private final Integer usedDataStorageSizeInTBs;

    /**
     * The amount of storage that has been used for Autonomous Databases in dedicated
     * infrastructure, in terabytes.
     *
     * @return the value
     */
    public Integer getUsedDataStorageSizeInTBs() {
        return usedDataStorageSizeInTBs;
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
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the resource is associated with.
     *
     * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual machine DB
     * systems, do not use a subnet that overlaps with 192.168.16.16/28. - For Exadata and virtual
     * machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20. - For
     * Autonomous Database, setting this will disable public secure access to the database.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and the backup subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet the resource is associated with.
     *
     * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual machine DB
     * systems, do not use a subnet that overlaps with 192.168.16.16/28. - For Exadata and virtual
     * machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20. - For
     * Autonomous Database, setting this will disable public secure access to the database.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and the backup subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
     * Databases with private access. The nsgIds list can be empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
     * Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /** The private endpoint for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final String privateEndpoint;

    /**
     * The private endpoint for the resource.
     *
     * @return the value
     */
    public String getPrivateEndpoint() {
        return privateEndpoint;
    }

    /** The public endpoint for the private endpoint enabled resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicEndpoint")
    private final String publicEndpoint;

    /**
     * The public endpoint for the private endpoint enabled resource.
     *
     * @return the value
     */
    public String getPublicEndpoint() {
        return publicEndpoint;
    }

    /**
     * The resource's private endpoint label. - Setting the endpoint label to a non-empty string
     * creates a private endpoint database. - Resetting the endpoint label to an empty string, after
     * the creation of the private endpoint database, changes the private endpoint database to a
     * public endpoint database. - Setting the endpoint label to a non-empty string value, updates
     * to a new private endpoint database, when the database is disabled and re-enabled.
     *
     * <p>This setting cannot be updated in parallel with any of the following: licenseModel,
     * dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    private final String privateEndpointLabel;

    /**
     * The resource's private endpoint label. - Setting the endpoint label to a non-empty string
     * creates a private endpoint database. - Resetting the endpoint label to an empty string, after
     * the creation of the private endpoint database, changes the private endpoint database to a
     * public endpoint database. - Setting the endpoint label to a non-empty string value, updates
     * to a new private endpoint database, when the database is disabled and re-enabled.
     *
     * <p>This setting cannot be updated in parallel with any of the following: licenseModel,
     * dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public String getPrivateEndpointLabel() {
        return privateEndpointLabel;
    }

    /** The private endpoint Ip address for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The private endpoint Ip address for the resource.
     *
     * @return the value
     */
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /** A valid Oracle Database version for Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version for Autonomous Database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** Indicates if the Autonomous Database version is a preview version. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPreview")
    private final Boolean isPreview;

    /**
     * Indicates if the Autonomous Database version is a preview version.
     *
     * @return the value
     */
    public Boolean getIsPreview() {
        return isPreview;
    }

    /**
     * The Autonomous Database workload type. The following values are valid:
     *
     * <p>- OLTP - indicates an Autonomous Transaction Processing database - DW - indicates an
     * Autonomous Data Warehouse database - AJD - indicates an Autonomous JSON Database - APEX -
     * indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    public enum DbWorkload implements com.oracle.bmc.http.internal.BmcEnum {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DbWorkload.class);

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbWorkload(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkload create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbWorkload', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Autonomous Database workload type. The following values are valid:
     *
     * <p>- OLTP - indicates an Autonomous Transaction Processing database - DW - indicates an
     * Autonomous Data Warehouse database - AJD - indicates an Autonomous JSON Database - APEX -
     * indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * The Autonomous Database workload type. The following values are valid:
     *
     * <p>- OLTP - indicates an Autonomous Transaction Processing database - DW - indicates an
     * Autonomous Data Warehouse database - AJD - indicates an Autonomous JSON Database - APEX -
     * indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * Autonomous Database for Developers are fixed-shape Autonomous Databases that developers can
     * use to build and test new applications. On Serverless, these are low-cost and billed per
     * instance, on Dedicated and Cloud@Customer there is no additional cost to create Developer
     * databases. Developer databases come with limited resources and is not intended for
     * large-scale testing and production deployments. When you need more compute or storage
     * resources, you may upgrade to a full paid production database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDevTier")
    private final Boolean isDevTier;

    /**
     * Autonomous Database for Developers are fixed-shape Autonomous Databases that developers can
     * use to build and test new applications. On Serverless, these are low-cost and billed per
     * instance, on Dedicated and Cloud@Customer there is no additional cost to create Developer
     * databases. Developer databases come with limited resources and is not intended for
     * large-scale testing and production deployments. When you need more compute or storage
     * resources, you may upgrade to a full paid production database.
     *
     * @return the value
     */
    public Boolean getIsDevTier() {
        return isDevTier;
    }

    /**
     * Indicates if the database-level access control is enabled. If disabled, database access is
     * defined by the network security rules. If enabled, database access is restricted to the IP
     * addresses defined by the rules specified with the {@code whitelistedIps} property. While
     * specifying {@code whitelistedIps} rules is optional, if database-level access control is
     * enabled and no rules are specified, the database will become inaccessible. The rules can be
     * added later using the {@code UpdateAutonomousDatabase} API operation or edit option in
     * console. When creating a database clone, the desired access control setting should be
     * specified. By default, database-level access control will be disabled for the clone.
     *
     * <p>This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer
     * platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
    private final Boolean isAccessControlEnabled;

    /**
     * Indicates if the database-level access control is enabled. If disabled, database access is
     * defined by the network security rules. If enabled, database access is restricted to the IP
     * addresses defined by the rules specified with the {@code whitelistedIps} property. While
     * specifying {@code whitelistedIps} rules is optional, if database-level access control is
     * enabled and no rules are specified, the database will become inaccessible. The rules can be
     * added later using the {@code UpdateAutonomousDatabase} API operation or edit option in
     * console. When creating a database clone, the desired access control setting should be
     * specified. By default, database-level access control will be disabled for the clone.
     *
     * <p>This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer
     * platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
     *
     * @return the value
     */
    public Boolean getIsAccessControlEnabled() {
        return isAccessControlEnabled;
    }

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database
     * Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on
     * Exadata Cloud@Customer. Only clients connecting from an IP address included in the ACL may
     * access the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE'
     * then Autonomous Database uses this primary's IP access control list (ACL) for the disaster
     * recovery peer called {@code standbywhitelistedips}.
     *
     * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
     * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID). Multiple
     * IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other
     * configurations that need multiple pieces of information then its each piece is connected with
     * semicolon (;) as a delimiter. Example: {@code
     * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
     * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     *
     * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array with a
     * single empty string entry.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    private final java.util.List<String> whitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database
     * Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on
     * Exadata Cloud@Customer. Only clients connecting from an IP address included in the ACL may
     * access the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE'
     * then Autonomous Database uses this primary's IP access control list (ACL) for the disaster
     * recovery peer called {@code standbywhitelistedips}.
     *
     * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
     * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID). Multiple
     * IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other
     * configurations that need multiple pieces of information then its each piece is connected with
     * semicolon (;) as a delimiter. Example: {@code
     * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
     * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     *
     * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array with a
     * single empty string entry.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public java.util.List<String> getWhitelistedIps() {
        return whitelistedIps;
    }

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access
     * Control is disabled. It's value would be {@code TRUE} if Autonomous Database is Data Guard
     * enabled and Access Control is enabled and if the Autonomous Database uses primary IP access
     * control list (ACL) for standby. It's value would be {@code FALSE} if Autonomous Database is
     * Data Guard enabled and Access Control is enabled and if the Autonomous Database uses
     * different IP access control list (ACL) for standby compared to primary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    private final Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access
     * Control is disabled. It's value would be {@code TRUE} if Autonomous Database is Data Guard
     * enabled and Access Control is enabled and if the Autonomous Database uses primary IP access
     * control list (ACL) for standby. It's value would be {@code FALSE} if Autonomous Database is
     * Data Guard enabled and Access Control is enabled and if the Autonomous Database uses
     * different IP access control list (ACL) for standby compared to primary.
     *
     * @return the value
     */
    public Boolean getArePrimaryWhitelistedIpsUsed() {
        return arePrimaryWhitelistedIpsUsed;
    }

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database
     * Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on
     * Exadata Cloud@Customer. Only clients connecting from an IP address included in the ACL may
     * access the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE'
     * then Autonomous Database uses this primary's IP access control list (ACL) for the disaster
     * recovery peer called {@code standbywhitelistedips}.
     *
     * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
     * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID). Multiple
     * IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other
     * configurations that need multiple pieces of information then its each piece is connected with
     * semicolon (;) as a delimiter. Example: {@code
     * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
     * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     *
     * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array with a
     * single empty string entry.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    private final java.util.List<String> standbyWhitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database
     * Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on
     * Exadata Cloud@Customer. Only clients connecting from an IP address included in the ACL may
     * access the Autonomous Database instance. If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE'
     * then Autonomous Database uses this primary's IP access control list (ACL) for the disaster
     * recovery peer called {@code standbywhitelistedips}.
     *
     * <p>For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain
     * routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID). Multiple
     * IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other
     * configurations that need multiple pieces of information then its each piece is connected with
     * semicolon (;) as a delimiter. Example: {@code
     * ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations. Example:
     * {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     *
     * <p>For an update operation, if you want to delete all the IPs in the ACL, use an array with a
     * single empty string entry.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public java.util.List<String> getStandbyWhitelistedIps() {
        return standbyWhitelistedIps;
    }

    /** Information about Oracle APEX Application Development. */
    @com.fasterxml.jackson.annotation.JsonProperty("apexDetails")
    private final AutonomousDatabaseApex apexDetails;

    /**
     * Information about Oracle APEX Application Development.
     *
     * @return the value
     */
    public AutonomousDatabaseApex getApexDetails() {
        return apexDetails;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default
     * value is {@code TRUE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default
     * value is {@code TRUE}.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /** Status of the Data Safe registration for this Autonomous Database. */
    public enum DataSafeStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Registering("REGISTERING"),
        Registered("REGISTERED"),
        Deregistering("DEREGISTERING"),
        NotRegistered("NOT_REGISTERED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataSafeStatus.class);

        private final String value;
        private static java.util.Map<String, DataSafeStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DataSafeStatus v : DataSafeStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataSafeStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataSafeStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataSafeStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of the Data Safe registration for this Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSafeStatus")
    private final DataSafeStatus dataSafeStatus;

    /**
     * Status of the Data Safe registration for this Autonomous Database.
     *
     * @return the value
     */
    public DataSafeStatus getDataSafeStatus() {
        return dataSafeStatus;
    }

    /** Status of Operations Insights for this Autonomous Database. */
    public enum OperationsInsightsStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationsInsightsStatus.class);

        private final String value;
        private static java.util.Map<String, OperationsInsightsStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationsInsightsStatus v : OperationsInsightsStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationsInsightsStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationsInsightsStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationsInsightsStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of Operations Insights for this Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
    private final OperationsInsightsStatus operationsInsightsStatus;

    /**
     * Status of Operations Insights for this Autonomous Database.
     *
     * @return the value
     */
    public OperationsInsightsStatus getOperationsInsightsStatus() {
        return operationsInsightsStatus;
    }

    /** Status of Database Management for this Autonomous Database. */
    public enum DatabaseManagementStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseManagementStatus.class);

        private final String value;
        private static java.util.Map<String, DatabaseManagementStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseManagementStatus v : DatabaseManagementStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseManagementStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseManagementStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseManagementStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of Database Management for this Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
    private final DatabaseManagementStatus databaseManagementStatus;

    /**
     * Status of Database Management for this Autonomous Database.
     *
     * @return the value
     */
    public DatabaseManagementStatus getDatabaseManagementStatus() {
        return databaseManagementStatus;
    }

    /** The date and time when maintenance will begin. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceBegin")
    private final java.util.Date timeMaintenanceBegin;

    /**
     * The date and time when maintenance will begin.
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceBegin() {
        return timeMaintenanceBegin;
    }

    /** The date and time when maintenance will end. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceEnd")
    private final java.util.Date timeMaintenanceEnd;

    /**
     * The date and time when maintenance will end.
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceEnd() {
        return timeMaintenanceEnd;
    }

    /** The component chosen for maintenance. */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceTargetComponent")
    private final String maintenanceTargetComponent;

    /**
     * The component chosen for maintenance.
     *
     * @return the value
     */
    public String getMaintenanceTargetComponent() {
        return maintenanceTargetComponent;
    }

    /**
     * Indicates if the Autonomous Database is a refreshable clone.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, openMode, permissionLevel, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails,
     * isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
    private final Boolean isRefreshableClone;

    /**
     * Indicates if the Autonomous Database is a refreshable clone.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, openMode, permissionLevel, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails,
     * isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public Boolean getIsRefreshableClone() {
        return isRefreshableClone;
    }

    /** The date and time when last refresh happened. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefresh")
    private final java.util.Date timeOfLastRefresh;

    /**
     * The date and time when last refresh happened.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastRefresh() {
        return timeOfLastRefresh;
    }

    /**
     * The refresh point timestamp (UTC). The refresh point is the time to which the database was
     * most recently refreshed. Data created after the refresh point is not included in the refresh.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefreshPoint")
    private final java.util.Date timeOfLastRefreshPoint;

    /**
     * The refresh point timestamp (UTC). The refresh point is the time to which the database was
     * most recently refreshed. Data created after the refresh point is not included in the refresh.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastRefreshPoint() {
        return timeOfLastRefreshPoint;
    }

    /** The date and time of next refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRefresh")
    private final java.util.Date timeOfNextRefresh;

    /**
     * The date and time of next refresh.
     *
     * @return the value
     */
    public java.util.Date getTimeOfNextRefresh() {
        return timeOfNextRefresh;
    }

    /**
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or
     * {@code READ_WRITE} mode.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    public enum OpenMode implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OpenMode.class);

        private final String value;
        private static java.util.Map<String, OpenMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OpenMode v : OpenMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OpenMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpenMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OpenMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or
     * {@code READ_WRITE} mode.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final OpenMode openMode;

    /**
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or
     * {@code READ_WRITE} mode.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public OpenMode getOpenMode() {
        return openMode;
    }

    /**
     * The refresh status of the clone. REFRESHING indicates that the clone is currently being
     * refreshed with data from the source Autonomous Database.
     */
    public enum RefreshableStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Refreshing("REFRESHING"),
        NotRefreshing("NOT_REFRESHING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RefreshableStatus.class);

        private final String value;
        private static java.util.Map<String, RefreshableStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (RefreshableStatus v : RefreshableStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RefreshableStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RefreshableStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RefreshableStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The refresh status of the clone. REFRESHING indicates that the clone is currently being
     * refreshed with data from the source Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableStatus")
    private final RefreshableStatus refreshableStatus;

    /**
     * The refresh status of the clone. REFRESHING indicates that the clone is currently being
     * refreshed with data from the source Autonomous Database.
     *
     * @return the value
     */
    public RefreshableStatus getRefreshableStatus() {
        return refreshableStatus;
    }

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
     * refreshed with data from the source Autonomous Database.
     */
    public enum RefreshableMode implements com.oracle.bmc.http.internal.BmcEnum {
        Automatic("AUTOMATIC"),
        Manual("MANUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RefreshableMode.class);

        private final String value;
        private static java.util.Map<String, RefreshableMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RefreshableMode v : RefreshableMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RefreshableMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RefreshableMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RefreshableMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
     * refreshed with data from the source Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
    private final RefreshableMode refreshableMode;

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
     * refreshed with data from the source Autonomous Database.
     *
     * @return the value
     */
    public RefreshableMode getRefreshableMode() {
        return refreshableMode;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source Autonomous Database that was cloned to create the current Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source Autonomous Database that was cloned to create the current Autonomous Database.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The Autonomous Database permission level. Restricted mode allows access only by admin users.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    public enum PermissionLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Unrestricted("UNRESTRICTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PermissionLevel.class);

        private final String value;
        private static java.util.Map<String, PermissionLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (PermissionLevel v : PermissionLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PermissionLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PermissionLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PermissionLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Autonomous Database permission level. Restricted mode allows access only by admin users.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
    private final PermissionLevel permissionLevel;

    /**
     * The Autonomous Database permission level. Restricted mode allows access only by admin users.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

    /** The timestamp of the last switchover operation for the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSwitchover")
    private final java.util.Date timeOfLastSwitchover;

    /**
     * The timestamp of the last switchover operation for the Autonomous Database.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastSwitchover() {
        return timeOfLastSwitchover;
    }

    /** The timestamp of the last failover operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastFailover")
    private final java.util.Date timeOfLastFailover;

    /**
     * The timestamp of the last failover operation.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastFailover() {
        return timeOfLastFailover;
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

    /** Indicates the number of seconds of data loss for a Data Guard failover. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedDataRecoveryInSeconds")
    private final Integer failedDataRecoveryInSeconds;

    /**
     * Indicates the number of seconds of data loss for a Data Guard failover.
     *
     * @return the value
     */
    public Integer getFailedDataRecoveryInSeconds() {
        return failedDataRecoveryInSeconds;
    }

    /** **Deprecated** Autonomous Data Guard standby database details. */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyDb")
    private final AutonomousDatabaseStandbySummary standbyDb;

    /**
     * **Deprecated** Autonomous Data Guard standby database details.
     *
     * @return the value
     */
    public AutonomousDatabaseStandbySummary getStandbyDb() {
        return standbyDb;
    }

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not
     * applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases
     * using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
    private final Boolean isLocalDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not
     * applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases
     * using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public Boolean getIsLocalDataGuardEnabled() {
        return isLocalDataGuardEnabled;
    }

    /**
     * Indicates whether the Autonomous Database has Cross Region Data Guard enabled. Not applicable
     * to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
     * infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRemoteDataGuardEnabled")
    private final Boolean isRemoteDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has Cross Region Data Guard enabled. Not applicable
     * to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
     * infrastructure.
     *
     * @return the value
     */
    public Boolean getIsRemoteDataGuardEnabled() {
        return isRemoteDataGuardEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("localStandbyDb")
    private final AutonomousDatabaseStandbySummary localStandbyDb;

    public AutonomousDatabaseStandbySummary getLocalStandbyDb() {
        return localStandbyDb;
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

    /**
     * List of Oracle Database versions available for a database upgrade. If there are no version
     * upgrades available, this list is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
    private final java.util.List<String> availableUpgradeVersions;

    /**
     * List of Oracle Database versions available for a database upgrade. If there are no version
     * upgrades available, this list is empty.
     *
     * @return the value
     */
    public java.util.List<String> getAvailableUpgradeVersions() {
        return availableUpgradeVersions;
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

    /**
     * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is
     * 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled
     * by the {@code timeOfAutoRefreshStart} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshFrequencyInSeconds")
    private final Integer autoRefreshFrequencyInSeconds;

    /**
     * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is
     * 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled
     * by the {@code timeOfAutoRefreshStart} parameter.
     *
     * @return the value
     */
    public Integer getAutoRefreshFrequencyInSeconds() {
        return autoRefreshFrequencyInSeconds;
    }

    /**
     * The time, in seconds, the data of the refreshable clone lags the primary database at the
     * point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available
     * timestamp). The maximum is 7 days. The lag time increases after refreshing until the next
     * data refresh happens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshPointLagInSeconds")
    private final Integer autoRefreshPointLagInSeconds;

    /**
     * The time, in seconds, the data of the refreshable clone lags the primary database at the
     * point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available
     * timestamp). The maximum is 7 days. The lag time increases after refreshing until the next
     * data refresh happens.
     *
     * @return the value
     */
    public Integer getAutoRefreshPointLagInSeconds() {
        return autoRefreshPointLagInSeconds;
    }

    /**
     * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable
     * clone. This value controls only the start time for the first refresh operation. Subsequent
     * (ongoing) refresh operations have start times controlled by the value of the {@code
     * autoRefreshFrequencyInSeconds} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAutoRefreshStart")
    private final java.util.Date timeOfAutoRefreshStart;

    /**
     * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable
     * clone. This value controls only the start time for the first refresh operation. Subsequent
     * (ongoing) refresh operations have start times controlled by the value of the {@code
     * autoRefreshFrequencyInSeconds} parameter.
     *
     * @return the value
     */
    public java.util.Date getTimeOfAutoRefreshStart() {
        return timeOfAutoRefreshStart;
    }

    /**
     * The list of regions that support the creation of an Autonomous Database clone or an
     * Autonomous Data Guard standby database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedRegionsToCloneTo")
    private final java.util.List<String> supportedRegionsToCloneTo;

    /**
     * The list of regions that support the creation of an Autonomous Database clone or an
     * Autonomous Data Guard standby database.
     *
     * @return the value
     */
    public java.util.List<String> getSupportedRegionsToCloneTo() {
        return supportedRegionsToCloneTo;
    }

    /** Customer Contacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * The date and time that Autonomous Data Guard was enabled for an Autonomous Database where the
     * standby was provisioned in the same region as the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLocalDataGuardEnabled")
    private final java.util.Date timeLocalDataGuardEnabled;

    /**
     * The date and time that Autonomous Data Guard was enabled for an Autonomous Database where the
     * standby was provisioned in the same region as the primary database.
     *
     * @return the value
     */
    public java.util.Date getTimeLocalDataGuardEnabled() {
        return timeLocalDataGuardEnabled;
    }

    /**
     * **Deprecated.** The Autonomous Data Guard region type of the Autonomous Database. For
     * Autonomous Database Serverless, Autonomous Data Guard associations have designated primary
     * and standby regions, and these region types do not change when the database changes roles.
     * The standby regions in Autonomous Data Guard associations can be the same region designated
     * as the primary region, or they can be remote regions. Certain database administrative
     * operations may be available only in the primary region of the Autonomous Data Guard
     * association, and cannot be performed when the database using the primary role is operating in
     * a remote Autonomous Data Guard standby region.
     */
    public enum DataguardRegionType implements com.oracle.bmc.http.internal.BmcEnum {
        PrimaryDgRegion("PRIMARY_DG_REGION"),
        RemoteStandbyDgRegion("REMOTE_STANDBY_DG_REGION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataguardRegionType.class);

        private final String value;
        private static java.util.Map<String, DataguardRegionType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataguardRegionType v : DataguardRegionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataguardRegionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataguardRegionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataguardRegionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * **Deprecated.** The Autonomous Data Guard region type of the Autonomous Database. For
     * Autonomous Database Serverless, Autonomous Data Guard associations have designated primary
     * and standby regions, and these region types do not change when the database changes roles.
     * The standby regions in Autonomous Data Guard associations can be the same region designated
     * as the primary region, or they can be remote regions. Certain database administrative
     * operations may be available only in the primary region of the Autonomous Data Guard
     * association, and cannot be performed when the database using the primary role is operating in
     * a remote Autonomous Data Guard standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataguardRegionType")
    private final DataguardRegionType dataguardRegionType;

    /**
     * **Deprecated.** The Autonomous Data Guard region type of the Autonomous Database. For
     * Autonomous Database Serverless, Autonomous Data Guard associations have designated primary
     * and standby regions, and these region types do not change when the database changes roles.
     * The standby regions in Autonomous Data Guard associations can be the same region designated
     * as the primary region, or they can be remote regions. Certain database administrative
     * operations may be available only in the primary region of the Autonomous Data Guard
     * association, and cannot be performed when the database using the primary role is operating in
     * a remote Autonomous Data Guard standby region.
     *
     * @return the value
     */
    public DataguardRegionType getDataguardRegionType() {
        return dataguardRegionType;
    }

    /**
     * The date and time the Autonomous Data Guard role was switched for the Autonomous Database.
     * For databases that have standbys in both the primary Data Guard region and a remote Data
     * Guard standby region, this is the latest timestamp of either the database using the "primary"
     * role in the primary Data Guard region, or database located in the remote Data Guard standby
     * region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
    private final java.util.Date timeDataGuardRoleChanged;

    /**
     * The date and time the Autonomous Data Guard role was switched for the Autonomous Database.
     * For databases that have standbys in both the primary Data Guard region and a remote Data
     * Guard standby region, this is the latest timestamp of either the database using the "primary"
     * role in the primary Data Guard region, or database located in the remote Data Guard standby
     * region.
     *
     * @return the value
     */
    public java.util.Date getTimeDataGuardRoleChanged() {
        return timeDataGuardRoleChanged;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * standby databases located in Autonomous Data Guard remote regions that are associated with
     * the source database. Note that for Autonomous Database Serverless instances, standby
     * databases located in the same region as the source primary database do not have OCIDs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbIds")
    private final java.util.List<String> peerDbIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * standby databases located in Autonomous Data Guard remote regions that are associated with
     * the source database. Note that for Autonomous Database Serverless instances, standby
     * databases located in the same region as the source primary database do not have OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getPeerDbIds() {
        return peerDbIds;
    }

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     *
     * <p>This may not be updated in parallel with any of the following: licenseModel,
     * databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps, openMode,
     * permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts, dbVersion,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * <p>Service Change: The default value of the isMTLSConnectionRequired attribute will change
     * from true to false on July 1, 2023 in the following APIs: - CreateAutonomousDatabase -
     * GetAutonomousDatabase - UpdateAutonomousDatabase Details: Prior to the July 1, 2023 change,
     * the isMTLSConnectionRequired attribute default value was true. This applies to Autonomous
     * Database Serverless. Does this impact me? If you use or maintain custom scripts or Terraform
     * scripts referencing the CreateAutonomousDatabase, GetAutonomousDatabase, or
     * UpdateAutonomousDatabase APIs, you want to check, and possibly modify, the scripts for the
     * changed default value of the attribute. Should you choose not to leave your scripts
     * unchanged, the API calls containing this attribute will continue to work, but the default
     * value will switch from true to false. How do I make this change? Using either OCI SDKs or
     * command line tools, update your custom scripts to explicitly set the isMTLSConnectionRequired
     * attribute to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     *
     * <p>This may not be updated in parallel with any of the following: licenseModel,
     * databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps, openMode,
     * permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts, dbVersion,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * <p>Service Change: The default value of the isMTLSConnectionRequired attribute will change
     * from true to false on July 1, 2023 in the following APIs: - CreateAutonomousDatabase -
     * GetAutonomousDatabase - UpdateAutonomousDatabase Details: Prior to the July 1, 2023 change,
     * the isMTLSConnectionRequired attribute default value was true. This applies to Autonomous
     * Database Serverless. Does this impact me? If you use or maintain custom scripts or Terraform
     * scripts referencing the CreateAutonomousDatabase, GetAutonomousDatabase, or
     * UpdateAutonomousDatabase APIs, you want to check, and possibly modify, the scripts for the
     * changed default value of the attribute. Should you choose not to leave your scripts
     * unchanged, the API calls containing this attribute will continue to work, but the default
     * value will switch from true to false. How do I make this change? Using either OCI SDKs or
     * command line tools, update your custom scripts to explicitly set the isMTLSConnectionRequired
     * attribute to true.
     *
     * @return the value
     */
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    /** The time the member joined the resource pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfJoiningResourcePool")
    private final java.util.Date timeOfJoiningResourcePool;

    /**
     * The time the member joined the resource pool.
     *
     * @return the value
     */
    public java.util.Date getTimeOfJoiningResourcePool() {
        return timeOfJoiningResourcePool;
    }

    /**
     * The unique identifier for leader autonomous database OCID
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
    private final String resourcePoolLeaderId;

    /**
     * The unique identifier for leader autonomous database OCID
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getResourcePoolLeaderId() {
        return resourcePoolLeaderId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolSummary")
    private final ResourcePoolSummary resourcePoolSummary;

    public ResourcePoolSummary getResourcePoolSummary() {
        return resourcePoolSummary;
    }

    /** Indicates if the refreshable clone can be reconnected to its source database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReconnectCloneEnabled")
    private final Boolean isReconnectCloneEnabled;

    /**
     * Indicates if the refreshable clone can be reconnected to its source database.
     *
     * @return the value
     */
    public Boolean getIsReconnectCloneEnabled() {
        return isReconnectCloneEnabled;
    }

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2022-01-01T12:00:00.000Z, to set the
     * limit for a refreshable clone to be reconnected to its source database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUntilReconnectCloneEnabled")
    private final java.util.Date timeUntilReconnectCloneEnabled;

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2022-01-01T12:00:00.000Z, to set the
     * limit for a refreshable clone to be reconnected to its source database.
     *
     * @return the value
     */
    public java.util.Date getTimeUntilReconnectCloneEnabled() {
        return timeUntilReconnectCloneEnabled;
    }

    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance
     * schedule follows a schedule applying patches prior to the REGULAR schedule. A REGULAR
     * maintenance schedule follows the normal cycle
     */
    public enum AutonomousMaintenanceScheduleType implements com.oracle.bmc.http.internal.BmcEnum {
        Early("EARLY"),
        Regular("REGULAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutonomousMaintenanceScheduleType.class);

        private final String value;
        private static java.util.Map<String, AutonomousMaintenanceScheduleType> map;

        static {
            map = new java.util.HashMap<>();
            for (AutonomousMaintenanceScheduleType v : AutonomousMaintenanceScheduleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutonomousMaintenanceScheduleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutonomousMaintenanceScheduleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutonomousMaintenanceScheduleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance
     * schedule follows a schedule applying patches prior to the REGULAR schedule. A REGULAR
     * maintenance schedule follows the normal cycle
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
    private final AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance
     * schedule follows a schedule applying patches prior to the REGULAR schedule. A REGULAR
     * maintenance schedule follows the normal cycle
     *
     * @return the value
     */
    public AutonomousMaintenanceScheduleType getAutonomousMaintenanceScheduleType() {
        return autonomousMaintenanceScheduleType;
    }

    /**
     * The list of scheduled operations. Consists of values such as dayOfWeek, scheduledStartTime,
     * scheduledStopTime.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
    private final java.util.List<ScheduledOperationDetails> scheduledOperations;

    /**
     * The list of scheduled operations. Consists of values such as dayOfWeek, scheduledStartTime,
     * scheduledStopTime.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public java.util.List<ScheduledOperationDetails> getScheduledOperations() {
        return scheduledOperations;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value
     * is {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
    private final Boolean isAutoScalingForStorageEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value
     * is {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingForStorageEnabled() {
        return isAutoScalingForStorageEnabled;
    }

    /**
     * The amount of storage currently allocated for the database tables and billed for, rounded up.
     * When auto-scaling is not enabled, this value is equal to the {@code dataStorageSizeInTBs}
     * value. You can compare this value to the {@code actualUsedDataStorageSizeInTBs} value to
     * determine if a manual shrink operation is appropriate for your allocated storage.
     *
     * <p>*Note:** Auto-scaling does not automatically decrease allocated storage when data is
     * deleted from the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInTBs")
    private final Double allocatedStorageSizeInTBs;

    /**
     * The amount of storage currently allocated for the database tables and billed for, rounded up.
     * When auto-scaling is not enabled, this value is equal to the {@code dataStorageSizeInTBs}
     * value. You can compare this value to the {@code actualUsedDataStorageSizeInTBs} value to
     * determine if a manual shrink operation is appropriate for your allocated storage.
     *
     * <p>*Note:** Auto-scaling does not automatically decrease allocated storage when data is
     * deleted from the database.
     *
     * @return the value
     */
    public Double getAllocatedStorageSizeInTBs() {
        return allocatedStorageSizeInTBs;
    }

    /** The current amount of storage in use for user and system data, in terabytes (TB). */
    @com.fasterxml.jackson.annotation.JsonProperty("actualUsedDataStorageSizeInTBs")
    private final Double actualUsedDataStorageSizeInTBs;

    /**
     * The current amount of storage in use for user and system data, in terabytes (TB).
     *
     * @return the value
     */
    public Double getActualUsedDataStorageSizeInTBs() {
        return actualUsedDataStorageSizeInTBs;
    }

    /** The Oracle Database Edition that applies to the Autonomous databases. */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),

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
    /** The Oracle Database Edition that applies to the Autonomous databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to the Autonomous databases.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The list of database tools details.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
    private final java.util.List<DatabaseTool> dbToolsDetails;

    /**
     * The list of database tools details.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode,
     * permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public java.util.List<DatabaseTool> getDbToolsDetails() {
        return dbToolsDetails;
    }

    /**
     * Indicates the local disaster recovery (DR) type of the Autonomous Database Serverless
     * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
     * recovery time objective (RTO) during failover or switchover. Backup-based DR type provides
     * lower cost DR with a slower RTO during failover or switchover.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localDisasterRecoveryType")
    private final DisasterRecoveryConfiguration.DisasterRecoveryType localDisasterRecoveryType;

    /**
     * Indicates the local disaster recovery (DR) type of the Autonomous Database Serverless
     * instance. Autonomous Data Guard (ADG) DR type provides business critical DR with a faster
     * recovery time objective (RTO) during failover or switchover. Backup-based DR type provides
     * lower cost DR with a slower RTO during failover or switchover.
     *
     * @return the value
     */
    public DisasterRecoveryConfiguration.DisasterRecoveryType getLocalDisasterRecoveryType() {
        return localDisasterRecoveryType;
    }

    /**
     * **Deprecated.** The disaster recovery (DR) region type of the Autonomous Database. For
     * Autonomous Database Serverless instances, DR associations have designated primary and standby
     * regions. These region types do not change when the database changes roles. The standby region
     * in DR associations can be the same region as the primary region, or they can be in a remote
     * regions. Some database administration operations may be available only in the primary region
     * of the DR association, and cannot be performed when the database using the primary role is
     * operating in a remote region.
     */
    public enum DisasterRecoveryRegionType implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Remote("REMOTE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DisasterRecoveryRegionType.class);

        private final String value;
        private static java.util.Map<String, DisasterRecoveryRegionType> map;

        static {
            map = new java.util.HashMap<>();
            for (DisasterRecoveryRegionType v : DisasterRecoveryRegionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DisasterRecoveryRegionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DisasterRecoveryRegionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DisasterRecoveryRegionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * **Deprecated.** The disaster recovery (DR) region type of the Autonomous Database. For
     * Autonomous Database Serverless instances, DR associations have designated primary and standby
     * regions. These region types do not change when the database changes roles. The standby region
     * in DR associations can be the same region as the primary region, or they can be in a remote
     * regions. Some database administration operations may be available only in the primary region
     * of the DR association, and cannot be performed when the database using the primary role is
     * operating in a remote region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryRegionType")
    private final DisasterRecoveryRegionType disasterRecoveryRegionType;

    /**
     * **Deprecated.** The disaster recovery (DR) region type of the Autonomous Database. For
     * Autonomous Database Serverless instances, DR associations have designated primary and standby
     * regions. These region types do not change when the database changes roles. The standby region
     * in DR associations can be the same region as the primary region, or they can be in a remote
     * regions. Some database administration operations may be available only in the primary region
     * of the DR association, and cannot be performed when the database using the primary role is
     * operating in a remote region.
     *
     * @return the value
     */
    public DisasterRecoveryRegionType getDisasterRecoveryRegionType() {
        return disasterRecoveryRegionType;
    }

    /**
     * The date and time the Disaster Recovery role was switched for the standby Autonomous
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDisasterRecoveryRoleChanged")
    private final java.util.Date timeDisasterRecoveryRoleChanged;

    /**
     * The date and time the Disaster Recovery role was switched for the standby Autonomous
     * Database.
     *
     * @return the value
     */
    public java.util.Date getTimeDisasterRecoveryRoleChanged() {
        return timeDisasterRecoveryRoleChanged;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("remoteDisasterRecoveryConfiguration")
    private final DisasterRecoveryConfiguration remoteDisasterRecoveryConfiguration;

    public DisasterRecoveryConfiguration getRemoteDisasterRecoveryConfiguration() {
        return remoteDisasterRecoveryConfiguration;
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

    /** The availability domain where the Autonomous Database Serverless instance is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the Autonomous Database Serverless instance is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Autonomous Serverless Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Autonomous Serverless Database.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * A list of the source Autonomous Database's table space number(s) used to create this partial
     * clone from the backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloneTableSpaceList")
    private final java.util.List<Integer> cloneTableSpaceList;

    /**
     * A list of the source Autonomous Database's table space number(s) used to create this partial
     * clone from the backup.
     *
     * @return the value
     */
    public java.util.List<Integer> getCloneTableSpaceList() {
        return cloneTableSpaceList;
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
        sb.append("AutonomousDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyLifecycleDetails=").append(String.valueOf(this.kmsKeyLifecycleDetails));
        sb.append(", encryptionKey=").append(String.valueOf(this.encryptionKey));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", inMemoryPercentage=").append(String.valueOf(this.inMemoryPercentage));
        sb.append(", inMemoryAreaInGBs=").append(String.valueOf(this.inMemoryAreaInGBs));
        sb.append(", nextLongTermBackupTimeStamp=")
                .append(String.valueOf(this.nextLongTermBackupTimeStamp));
        sb.append(", longTermBackupSchedule=").append(String.valueOf(this.longTermBackupSchedule));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeReclamationOfFreeAutonomousDatabase=")
                .append(String.valueOf(this.timeReclamationOfFreeAutonomousDatabase));
        sb.append(", timeDeletionOfFreeAutonomousDatabase=")
                .append(String.valueOf(this.timeDeletionOfFreeAutonomousDatabase));
        sb.append(", backupConfig=").append(String.valueOf(this.backupConfig));
        sb.append(", keyHistoryEntry=").append(String.valueOf(this.keyHistoryEntry));
        sb.append(", encryptionKeyHistoryEntry=")
                .append(String.valueOf(this.encryptionKeyHistoryEntry));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", localAdgAutoFailoverMaxDataLossLimit=")
                .append(String.valueOf(this.localAdgAutoFailoverMaxDataLossLimit));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", backupRetentionPeriodInDays=")
                .append(String.valueOf(this.backupRetentionPeriodInDays));
        sb.append(", totalBackupStorageSizeInGBs=")
                .append(String.valueOf(this.totalBackupStorageSizeInGBs));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", provisionableCpus=").append(String.valueOf(this.provisionableCpus));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", usedDataStorageSizeInGBs=")
                .append(String.valueOf(this.usedDataStorageSizeInGBs));
        sb.append(", infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(", isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(", autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(", isBackupRetentionLocked=")
                .append(String.valueOf(this.isBackupRetentionLocked));
        sb.append(", timeUndeleted=").append(String.valueOf(this.timeUndeleted));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", serviceConsoleUrl=").append(String.valueOf(this.serviceConsoleUrl));
        sb.append(", connectionStrings=").append(String.valueOf(this.connectionStrings));
        sb.append(", connectionUrls=").append(String.valueOf(this.connectionUrls));
        sb.append(", publicConnectionUrls=").append(String.valueOf(this.publicConnectionUrls));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", byolComputeCountLimit=").append(String.valueOf(this.byolComputeCountLimit));
        sb.append(", usedDataStorageSizeInTBs=")
                .append(String.valueOf(this.usedDataStorageSizeInTBs));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", publicEndpoint=").append(String.valueOf(this.publicEndpoint));
        sb.append(", privateEndpointLabel=").append(String.valueOf(this.privateEndpointLabel));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", isPreview=").append(String.valueOf(this.isPreview));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", isDevTier=").append(String.valueOf(this.isDevTier));
        sb.append(", isAccessControlEnabled=").append(String.valueOf(this.isAccessControlEnabled));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", arePrimaryWhitelistedIpsUsed=")
                .append(String.valueOf(this.arePrimaryWhitelistedIpsUsed));
        sb.append(", standbyWhitelistedIps=").append(String.valueOf(this.standbyWhitelistedIps));
        sb.append(", apexDetails=").append(String.valueOf(this.apexDetails));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", dataSafeStatus=").append(String.valueOf(this.dataSafeStatus));
        sb.append(", operationsInsightsStatus=")
                .append(String.valueOf(this.operationsInsightsStatus));
        sb.append(", databaseManagementStatus=")
                .append(String.valueOf(this.databaseManagementStatus));
        sb.append(", timeMaintenanceBegin=").append(String.valueOf(this.timeMaintenanceBegin));
        sb.append(", timeMaintenanceEnd=").append(String.valueOf(this.timeMaintenanceEnd));
        sb.append(", maintenanceTargetComponent=")
                .append(String.valueOf(this.maintenanceTargetComponent));
        sb.append(", isRefreshableClone=").append(String.valueOf(this.isRefreshableClone));
        sb.append(", timeOfLastRefresh=").append(String.valueOf(this.timeOfLastRefresh));
        sb.append(", timeOfLastRefreshPoint=").append(String.valueOf(this.timeOfLastRefreshPoint));
        sb.append(", timeOfNextRefresh=").append(String.valueOf(this.timeOfNextRefresh));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", refreshableStatus=").append(String.valueOf(this.refreshableStatus));
        sb.append(", refreshableMode=").append(String.valueOf(this.refreshableMode));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", permissionLevel=").append(String.valueOf(this.permissionLevel));
        sb.append(", timeOfLastSwitchover=").append(String.valueOf(this.timeOfLastSwitchover));
        sb.append(", timeOfLastFailover=").append(String.valueOf(this.timeOfLastFailover));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", failedDataRecoveryInSeconds=")
                .append(String.valueOf(this.failedDataRecoveryInSeconds));
        sb.append(", standbyDb=").append(String.valueOf(this.standbyDb));
        sb.append(", isLocalDataGuardEnabled=")
                .append(String.valueOf(this.isLocalDataGuardEnabled));
        sb.append(", isRemoteDataGuardEnabled=")
                .append(String.valueOf(this.isRemoteDataGuardEnabled));
        sb.append(", localStandbyDb=").append(String.valueOf(this.localStandbyDb));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", availableUpgradeVersions=")
                .append(String.valueOf(this.availableUpgradeVersions));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", keyStoreWalletName=").append(String.valueOf(this.keyStoreWalletName));
        sb.append(", autoRefreshFrequencyInSeconds=")
                .append(String.valueOf(this.autoRefreshFrequencyInSeconds));
        sb.append(", autoRefreshPointLagInSeconds=")
                .append(String.valueOf(this.autoRefreshPointLagInSeconds));
        sb.append(", timeOfAutoRefreshStart=").append(String.valueOf(this.timeOfAutoRefreshStart));
        sb.append(", supportedRegionsToCloneTo=")
                .append(String.valueOf(this.supportedRegionsToCloneTo));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", timeLocalDataGuardEnabled=")
                .append(String.valueOf(this.timeLocalDataGuardEnabled));
        sb.append(", dataguardRegionType=").append(String.valueOf(this.dataguardRegionType));
        sb.append(", timeDataGuardRoleChanged=")
                .append(String.valueOf(this.timeDataGuardRoleChanged));
        sb.append(", peerDbIds=").append(String.valueOf(this.peerDbIds));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", timeOfJoiningResourcePool=")
                .append(String.valueOf(this.timeOfJoiningResourcePool));
        sb.append(", resourcePoolLeaderId=").append(String.valueOf(this.resourcePoolLeaderId));
        sb.append(", resourcePoolSummary=").append(String.valueOf(this.resourcePoolSummary));
        sb.append(", isReconnectCloneEnabled=")
                .append(String.valueOf(this.isReconnectCloneEnabled));
        sb.append(", timeUntilReconnectCloneEnabled=")
                .append(String.valueOf(this.timeUntilReconnectCloneEnabled));
        sb.append(", autonomousMaintenanceScheduleType=")
                .append(String.valueOf(this.autonomousMaintenanceScheduleType));
        sb.append(", scheduledOperations=").append(String.valueOf(this.scheduledOperations));
        sb.append(", isAutoScalingForStorageEnabled=")
                .append(String.valueOf(this.isAutoScalingForStorageEnabled));
        sb.append(", allocatedStorageSizeInTBs=")
                .append(String.valueOf(this.allocatedStorageSizeInTBs));
        sb.append(", actualUsedDataStorageSizeInTBs=")
                .append(String.valueOf(this.actualUsedDataStorageSizeInTBs));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", dbToolsDetails=").append(String.valueOf(this.dbToolsDetails));
        sb.append(", localDisasterRecoveryType=")
                .append(String.valueOf(this.localDisasterRecoveryType));
        sb.append(", disasterRecoveryRegionType=")
                .append(String.valueOf(this.disasterRecoveryRegionType));
        sb.append(", timeDisasterRecoveryRoleChanged=")
                .append(String.valueOf(this.timeDisasterRecoveryRoleChanged));
        sb.append(", remoteDisasterRecoveryConfiguration=")
                .append(String.valueOf(this.remoteDisasterRecoveryConfiguration));
        sb.append(", netServicesArchitecture=")
                .append(String.valueOf(this.netServicesArchitecture));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", cloneTableSpaceList=").append(String.valueOf(this.cloneTableSpaceList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabase)) {
            return false;
        }

        AutonomousDatabase other = (AutonomousDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.kmsKeyLifecycleDetails, other.kmsKeyLifecycleDetails)
                && java.util.Objects.equals(this.encryptionKey, other.encryptionKey)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.inMemoryPercentage, other.inMemoryPercentage)
                && java.util.Objects.equals(this.inMemoryAreaInGBs, other.inMemoryAreaInGBs)
                && java.util.Objects.equals(
                        this.nextLongTermBackupTimeStamp, other.nextLongTermBackupTimeStamp)
                && java.util.Objects.equals(
                        this.longTermBackupSchedule, other.longTermBackupSchedule)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.timeReclamationOfFreeAutonomousDatabase,
                        other.timeReclamationOfFreeAutonomousDatabase)
                && java.util.Objects.equals(
                        this.timeDeletionOfFreeAutonomousDatabase,
                        other.timeDeletionOfFreeAutonomousDatabase)
                && java.util.Objects.equals(this.backupConfig, other.backupConfig)
                && java.util.Objects.equals(this.keyHistoryEntry, other.keyHistoryEntry)
                && java.util.Objects.equals(
                        this.encryptionKeyHistoryEntry, other.encryptionKeyHistoryEntry)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(
                        this.localAdgAutoFailoverMaxDataLossLimit,
                        other.localAdgAutoFailoverMaxDataLossLimit)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(
                        this.backupRetentionPeriodInDays, other.backupRetentionPeriodInDays)
                && java.util.Objects.equals(
                        this.totalBackupStorageSizeInGBs, other.totalBackupStorageSizeInGBs)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.provisionableCpus, other.provisionableCpus)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.usedDataStorageSizeInGBs, other.usedDataStorageSizeInGBs)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.isBackupRetentionLocked, other.isBackupRetentionLocked)
                && java.util.Objects.equals(this.timeUndeleted, other.timeUndeleted)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.serviceConsoleUrl, other.serviceConsoleUrl)
                && java.util.Objects.equals(this.connectionStrings, other.connectionStrings)
                && java.util.Objects.equals(this.connectionUrls, other.connectionUrls)
                && java.util.Objects.equals(this.publicConnectionUrls, other.publicConnectionUrls)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.byolComputeCountLimit, other.byolComputeCountLimit)
                && java.util.Objects.equals(
                        this.usedDataStorageSizeInTBs, other.usedDataStorageSizeInTBs)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.publicEndpoint, other.publicEndpoint)
                && java.util.Objects.equals(this.privateEndpointLabel, other.privateEndpointLabel)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.isPreview, other.isPreview)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.isDevTier, other.isDevTier)
                && java.util.Objects.equals(
                        this.isAccessControlEnabled, other.isAccessControlEnabled)
                && java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(
                        this.arePrimaryWhitelistedIpsUsed, other.arePrimaryWhitelistedIpsUsed)
                && java.util.Objects.equals(this.standbyWhitelistedIps, other.standbyWhitelistedIps)
                && java.util.Objects.equals(this.apexDetails, other.apexDetails)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.dataSafeStatus, other.dataSafeStatus)
                && java.util.Objects.equals(
                        this.operationsInsightsStatus, other.operationsInsightsStatus)
                && java.util.Objects.equals(
                        this.databaseManagementStatus, other.databaseManagementStatus)
                && java.util.Objects.equals(this.timeMaintenanceBegin, other.timeMaintenanceBegin)
                && java.util.Objects.equals(this.timeMaintenanceEnd, other.timeMaintenanceEnd)
                && java.util.Objects.equals(
                        this.maintenanceTargetComponent, other.maintenanceTargetComponent)
                && java.util.Objects.equals(this.isRefreshableClone, other.isRefreshableClone)
                && java.util.Objects.equals(this.timeOfLastRefresh, other.timeOfLastRefresh)
                && java.util.Objects.equals(
                        this.timeOfLastRefreshPoint, other.timeOfLastRefreshPoint)
                && java.util.Objects.equals(this.timeOfNextRefresh, other.timeOfNextRefresh)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.refreshableStatus, other.refreshableStatus)
                && java.util.Objects.equals(this.refreshableMode, other.refreshableMode)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.permissionLevel, other.permissionLevel)
                && java.util.Objects.equals(this.timeOfLastSwitchover, other.timeOfLastSwitchover)
                && java.util.Objects.equals(this.timeOfLastFailover, other.timeOfLastFailover)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(
                        this.failedDataRecoveryInSeconds, other.failedDataRecoveryInSeconds)
                && java.util.Objects.equals(this.standbyDb, other.standbyDb)
                && java.util.Objects.equals(
                        this.isLocalDataGuardEnabled, other.isLocalDataGuardEnabled)
                && java.util.Objects.equals(
                        this.isRemoteDataGuardEnabled, other.isRemoteDataGuardEnabled)
                && java.util.Objects.equals(this.localStandbyDb, other.localStandbyDb)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(
                        this.availableUpgradeVersions, other.availableUpgradeVersions)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.keyStoreWalletName, other.keyStoreWalletName)
                && java.util.Objects.equals(
                        this.autoRefreshFrequencyInSeconds, other.autoRefreshFrequencyInSeconds)
                && java.util.Objects.equals(
                        this.autoRefreshPointLagInSeconds, other.autoRefreshPointLagInSeconds)
                && java.util.Objects.equals(
                        this.timeOfAutoRefreshStart, other.timeOfAutoRefreshStart)
                && java.util.Objects.equals(
                        this.supportedRegionsToCloneTo, other.supportedRegionsToCloneTo)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(
                        this.timeLocalDataGuardEnabled, other.timeLocalDataGuardEnabled)
                && java.util.Objects.equals(this.dataguardRegionType, other.dataguardRegionType)
                && java.util.Objects.equals(
                        this.timeDataGuardRoleChanged, other.timeDataGuardRoleChanged)
                && java.util.Objects.equals(this.peerDbIds, other.peerDbIds)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(
                        this.timeOfJoiningResourcePool, other.timeOfJoiningResourcePool)
                && java.util.Objects.equals(this.resourcePoolLeaderId, other.resourcePoolLeaderId)
                && java.util.Objects.equals(this.resourcePoolSummary, other.resourcePoolSummary)
                && java.util.Objects.equals(
                        this.isReconnectCloneEnabled, other.isReconnectCloneEnabled)
                && java.util.Objects.equals(
                        this.timeUntilReconnectCloneEnabled, other.timeUntilReconnectCloneEnabled)
                && java.util.Objects.equals(
                        this.autonomousMaintenanceScheduleType,
                        other.autonomousMaintenanceScheduleType)
                && java.util.Objects.equals(this.scheduledOperations, other.scheduledOperations)
                && java.util.Objects.equals(
                        this.isAutoScalingForStorageEnabled, other.isAutoScalingForStorageEnabled)
                && java.util.Objects.equals(
                        this.allocatedStorageSizeInTBs, other.allocatedStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.actualUsedDataStorageSizeInTBs, other.actualUsedDataStorageSizeInTBs)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.dbToolsDetails, other.dbToolsDetails)
                && java.util.Objects.equals(
                        this.localDisasterRecoveryType, other.localDisasterRecoveryType)
                && java.util.Objects.equals(
                        this.disasterRecoveryRegionType, other.disasterRecoveryRegionType)
                && java.util.Objects.equals(
                        this.timeDisasterRecoveryRoleChanged, other.timeDisasterRecoveryRoleChanged)
                && java.util.Objects.equals(
                        this.remoteDisasterRecoveryConfiguration,
                        other.remoteDisasterRecoveryConfiguration)
                && java.util.Objects.equals(
                        this.netServicesArchitecture, other.netServicesArchitecture)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.cloneTableSpaceList, other.cloneTableSpaceList)
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
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyLifecycleDetails == null
                                ? 43
                                : this.kmsKeyLifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKey == null ? 43 : this.encryptionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.inMemoryPercentage == null
                                ? 43
                                : this.inMemoryPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.inMemoryAreaInGBs == null ? 43 : this.inMemoryAreaInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.nextLongTermBackupTimeStamp == null
                                ? 43
                                : this.nextLongTermBackupTimeStamp.hashCode());
        result =
                (result * PRIME)
                        + (this.longTermBackupSchedule == null
                                ? 43
                                : this.longTermBackupSchedule.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReclamationOfFreeAutonomousDatabase == null
                                ? 43
                                : this.timeReclamationOfFreeAutonomousDatabase.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeletionOfFreeAutonomousDatabase == null
                                ? 43
                                : this.timeDeletionOfFreeAutonomousDatabase.hashCode());
        result = (result * PRIME) + (this.backupConfig == null ? 43 : this.backupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.keyHistoryEntry == null ? 43 : this.keyHistoryEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKeyHistoryEntry == null
                                ? 43
                                : this.encryptionKeyHistoryEntry.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.localAdgAutoFailoverMaxDataLossLimit == null
                                ? 43
                                : this.localAdgAutoFailoverMaxDataLossLimit.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.backupRetentionPeriodInDays == null
                                ? 43
                                : this.backupRetentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.totalBackupStorageSizeInGBs == null
                                ? 43
                                : this.totalBackupStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionableCpus == null ? 43 : this.provisionableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.usedDataStorageSizeInGBs == null
                                ? 43
                                : this.usedDataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.isBackupRetentionLocked == null
                                ? 43
                                : this.isBackupRetentionLocked.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUndeleted == null ? 43 : this.timeUndeleted.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceConsoleUrl == null ? 43 : this.serviceConsoleUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionStrings == null ? 43 : this.connectionStrings.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUrls == null ? 43 : this.connectionUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.publicConnectionUrls == null
                                ? 43
                                : this.publicConnectionUrls.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.byolComputeCountLimit == null
                                ? 43
                                : this.byolComputeCountLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.usedDataStorageSizeInTBs == null
                                ? 43
                                : this.usedDataStorageSizeInTBs.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.publicEndpoint == null ? 43 : this.publicEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointLabel == null
                                ? 43
                                : this.privateEndpointLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.isPreview == null ? 43 : this.isPreview.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.isDevTier == null ? 43 : this.isDevTier.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessControlEnabled == null
                                ? 43
                                : this.isAccessControlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.whitelistedIps == null ? 43 : this.whitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.arePrimaryWhitelistedIpsUsed == null
                                ? 43
                                : this.arePrimaryWhitelistedIpsUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyWhitelistedIps == null
                                ? 43
                                : this.standbyWhitelistedIps.hashCode());
        result = (result * PRIME) + (this.apexDetails == null ? 43 : this.apexDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.dataSafeStatus == null ? 43 : this.dataSafeStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsStatus == null
                                ? 43
                                : this.operationsInsightsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementStatus == null
                                ? 43
                                : this.databaseManagementStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceBegin == null
                                ? 43
                                : this.timeMaintenanceBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceEnd == null
                                ? 43
                                : this.timeMaintenanceEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceTargetComponent == null
                                ? 43
                                : this.maintenanceTargetComponent.hashCode());
        result =
                (result * PRIME)
                        + (this.isRefreshableClone == null
                                ? 43
                                : this.isRefreshableClone.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastRefresh == null ? 43 : this.timeOfLastRefresh.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastRefreshPoint == null
                                ? 43
                                : this.timeOfLastRefreshPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfNextRefresh == null ? 43 : this.timeOfNextRefresh.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableStatus == null ? 43 : this.refreshableStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableMode == null ? 43 : this.refreshableMode.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.permissionLevel == null ? 43 : this.permissionLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastSwitchover == null
                                ? 43
                                : this.timeOfLastSwitchover.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastFailover == null
                                ? 43
                                : this.timeOfLastFailover.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.failedDataRecoveryInSeconds == null
                                ? 43
                                : this.failedDataRecoveryInSeconds.hashCode());
        result = (result * PRIME) + (this.standbyDb == null ? 43 : this.standbyDb.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalDataGuardEnabled == null
                                ? 43
                                : this.isLocalDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRemoteDataGuardEnabled == null
                                ? 43
                                : this.isRemoteDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.localStandbyDb == null ? 43 : this.localStandbyDb.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.availableUpgradeVersions == null
                                ? 43
                                : this.availableUpgradeVersions.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyStoreWalletName == null
                                ? 43
                                : this.keyStoreWalletName.hashCode());
        result =
                (result * PRIME)
                        + (this.autoRefreshFrequencyInSeconds == null
                                ? 43
                                : this.autoRefreshFrequencyInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.autoRefreshPointLagInSeconds == null
                                ? 43
                                : this.autoRefreshPointLagInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfAutoRefreshStart == null
                                ? 43
                                : this.timeOfAutoRefreshStart.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedRegionsToCloneTo == null
                                ? 43
                                : this.supportedRegionsToCloneTo.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLocalDataGuardEnabled == null
                                ? 43
                                : this.timeLocalDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.dataguardRegionType == null
                                ? 43
                                : this.dataguardRegionType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataGuardRoleChanged == null
                                ? 43
                                : this.timeDataGuardRoleChanged.hashCode());
        result = (result * PRIME) + (this.peerDbIds == null ? 43 : this.peerDbIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfJoiningResourcePool == null
                                ? 43
                                : this.timeOfJoiningResourcePool.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePoolLeaderId == null
                                ? 43
                                : this.resourcePoolLeaderId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePoolSummary == null
                                ? 43
                                : this.resourcePoolSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.isReconnectCloneEnabled == null
                                ? 43
                                : this.isReconnectCloneEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUntilReconnectCloneEnabled == null
                                ? 43
                                : this.timeUntilReconnectCloneEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousMaintenanceScheduleType == null
                                ? 43
                                : this.autonomousMaintenanceScheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledOperations == null
                                ? 43
                                : this.scheduledOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingForStorageEnabled == null
                                ? 43
                                : this.isAutoScalingForStorageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedStorageSizeInTBs == null
                                ? 43
                                : this.allocatedStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.actualUsedDataStorageSizeInTBs == null
                                ? 43
                                : this.actualUsedDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.dbToolsDetails == null ? 43 : this.dbToolsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.localDisasterRecoveryType == null
                                ? 43
                                : this.localDisasterRecoveryType.hashCode());
        result =
                (result * PRIME)
                        + (this.disasterRecoveryRegionType == null
                                ? 43
                                : this.disasterRecoveryRegionType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDisasterRecoveryRoleChanged == null
                                ? 43
                                : this.timeDisasterRecoveryRoleChanged.hashCode());
        result =
                (result * PRIME)
                        + (this.remoteDisasterRecoveryConfiguration == null
                                ? 43
                                : this.remoteDisasterRecoveryConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.netServicesArchitecture == null
                                ? 43
                                : this.netServicesArchitecture.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloneTableSpaceList == null
                                ? 43
                                : this.cloneTableSpaceList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
