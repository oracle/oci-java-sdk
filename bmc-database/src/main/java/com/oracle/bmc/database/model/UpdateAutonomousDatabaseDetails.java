/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update an Oracle Autonomous Database.
 *
 * <p>*Notes** - To specify OCPU core count, you must use either {@code ocpuCount} or {@code
 * cpuCoreCount}. You cannot use both parameters at the same time. For Autonomous Database
 * Serverless instances, {@code ocpuCount} is not used. - To specify a storage allocation, you must
 * use either {@code dataStorageSizeInGBs} or {@code dataStorageSizeInTBs}. - See the individual
 * parameter discriptions for more information on the OCPU and storage value parameters.
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply
 * string values using the API. <br>
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
        builder = UpdateAutonomousDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAutonomousDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupRetentionPeriodInDays",
        "computeModel",
        "inMemoryPercentage",
        "localAdgAutoFailoverMaxDataLossLimit",
        "cpuCoreCount",
        "longTermBackupSchedule",
        "isDevTier",
        "computeCount",
        "ocpuCount",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "displayName",
        "isFreeTier",
        "adminPassword",
        "dbName",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "dbWorkload",
        "licenseModel",
        "byolComputeCountLimit",
        "isAccessControlEnabled",
        "whitelistedIps",
        "arePrimaryWhitelistedIpsUsed",
        "standbyWhitelistedIps",
        "isAutoScalingEnabled",
        "isRefreshableClone",
        "refreshableMode",
        "isLocalDataGuardEnabled",
        "isDataGuardEnabled",
        "peerDbId",
        "dbVersion",
        "openMode",
        "permissionLevel",
        "subnetId",
        "privateEndpointLabel",
        "privateEndpointIp",
        "nsgIds",
        "autoRefreshFrequencyInSeconds",
        "autoRefreshPointLagInSeconds",
        "timeOfAutoRefreshStart",
        "customerContacts",
        "isMtlsConnectionRequired",
        "resourcePoolLeaderId",
        "resourcePoolSummary",
        "scheduledOperations",
        "isAutoScalingForStorageEnabled",
        "databaseEdition",
        "dbToolsDetails",
        "secretId",
        "secretVersionNumber",
        "encryptionKey"
    })
    public UpdateAutonomousDatabaseDetails(
            Integer backupRetentionPeriodInDays,
            ComputeModel computeModel,
            Integer inMemoryPercentage,
            Integer localAdgAutoFailoverMaxDataLossLimit,
            Integer cpuCoreCount,
            LongTermBackUpScheduleDetails longTermBackupSchedule,
            Boolean isDevTier,
            Float computeCount,
            Float ocpuCount,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            String displayName,
            Boolean isFreeTier,
            String adminPassword,
            String dbName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            DbWorkload dbWorkload,
            LicenseModel licenseModel,
            Float byolComputeCountLimit,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            Boolean isAutoScalingEnabled,
            Boolean isRefreshableClone,
            RefreshableMode refreshableMode,
            Boolean isLocalDataGuardEnabled,
            Boolean isDataGuardEnabled,
            String peerDbId,
            String dbVersion,
            OpenMode openMode,
            PermissionLevel permissionLevel,
            String subnetId,
            String privateEndpointLabel,
            String privateEndpointIp,
            java.util.List<String> nsgIds,
            Integer autoRefreshFrequencyInSeconds,
            Integer autoRefreshPointLagInSeconds,
            java.util.Date timeOfAutoRefreshStart,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            String resourcePoolLeaderId,
            ResourcePoolSummary resourcePoolSummary,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition,
            java.util.List<DatabaseTool> dbToolsDetails,
            String secretId,
            Integer secretVersionNumber,
            AutonomousDatabaseEncryptionKeyDetails encryptionKey) {
        super();
        this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
        this.computeModel = computeModel;
        this.inMemoryPercentage = inMemoryPercentage;
        this.localAdgAutoFailoverMaxDataLossLimit = localAdgAutoFailoverMaxDataLossLimit;
        this.cpuCoreCount = cpuCoreCount;
        this.longTermBackupSchedule = longTermBackupSchedule;
        this.isDevTier = isDevTier;
        this.computeCount = computeCount;
        this.ocpuCount = ocpuCount;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.displayName = displayName;
        this.isFreeTier = isFreeTier;
        this.adminPassword = adminPassword;
        this.dbName = dbName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.dbWorkload = dbWorkload;
        this.licenseModel = licenseModel;
        this.byolComputeCountLimit = byolComputeCountLimit;
        this.isAccessControlEnabled = isAccessControlEnabled;
        this.whitelistedIps = whitelistedIps;
        this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
        this.standbyWhitelistedIps = standbyWhitelistedIps;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.isRefreshableClone = isRefreshableClone;
        this.refreshableMode = refreshableMode;
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.peerDbId = peerDbId;
        this.dbVersion = dbVersion;
        this.openMode = openMode;
        this.permissionLevel = permissionLevel;
        this.subnetId = subnetId;
        this.privateEndpointLabel = privateEndpointLabel;
        this.privateEndpointIp = privateEndpointIp;
        this.nsgIds = nsgIds;
        this.autoRefreshFrequencyInSeconds = autoRefreshFrequencyInSeconds;
        this.autoRefreshPointLagInSeconds = autoRefreshPointLagInSeconds;
        this.timeOfAutoRefreshStart = timeOfAutoRefreshStart;
        this.customerContacts = customerContacts;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.resourcePoolLeaderId = resourcePoolLeaderId;
        this.resourcePoolSummary = resourcePoolSummary;
        this.scheduledOperations = scheduledOperations;
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        this.databaseEdition = databaseEdition;
        this.dbToolsDetails = dbToolsDetails;
        this.secretId = secretId;
        this.secretVersionNumber = secretVersionNumber;
        this.encryptionKey = encryptionKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The number of CPUs to be made available to the Autonomous Database.<br>
         * For Autonomous Databases on Dedicated Exadata Infrastructure: - The CPU type (OCPUs or
         * ECPUs) is determined by the parent Autonomous Exadata VM Cluster's compute model. - It is
         * suggested to use 'computeCount' parameter if you want to use fractional value to
         * provision less than 1 core.
         *
         * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} or {@code
         * computeCount} parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPUs to be made available to the Autonomous Database.<br>
         * For Autonomous Databases on Dedicated Exadata Infrastructure: - The CPU type (OCPUs or
         * ECPUs) is determined by the parent Autonomous Exadata VM Cluster's compute model. - It is
         * suggested to use 'computeCount' parameter if you want to use fractional value to
         * provision less than 1 core.
         *
         * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} or {@code
         * computeCount} parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
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
         * The compute amount (CPUs) available to the database. Minimum and maximum values depend on
         * the compute model and whether the database is an Autonomous Database Serverless instance
         * or an Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model
         * requires a minimum value of one, for databases in the elastic resource pool and minimum
         * value of two, otherwise. Required when using the {@code computeModel} parameter. When
         * using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a
         * non-null value. Providing {@code computeModel} and {@code computeCount} is the preferred
         * method for both OCPU and ECPU.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
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
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The number of OCPU cores to be made available to the Autonomous Database.
         *
         * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, you can specify a
         * fractional value for this parameter. Fractional values are not supported for Autonomous
         * Database Serverless instances. For Autonomous Database Serverless instances, this
         * parameter is not used.
         *
         * <p>To provision less than 1 core, enter a fractional value in an increment of 0.1. To
         * provision 1 or more cores, you must enter an integer between 1 and the maximum number of
         * cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4
         * cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5
         * cores. The maximum number of cores is determined by the infrastructure shape. See
         * [Characteristics of Infrastructure
         * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to be made available to the Autonomous Database.
         *
         * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, you can specify a
         * fractional value for this parameter. Fractional values are not supported for Autonomous
         * Database Serverless instances. For Autonomous Database Serverless instances, this
         * parameter is not used.
         *
         * <p>To provision less than 1 core, enter a fractional value in an increment of 0.1. To
         * provision 1 or more cores, you must enter an integer between 1 and the maximum number of
         * cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4
         * cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5
         * cores. The maximum number of cores is determined by the infrastructure shape. See
         * [Characteristics of Infrastructure
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
        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum
         * storage value is determined by the infrastructure shape. See [Characteristics of
         * Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details. A full Exadata service is allocated when the Autonomous Database size
         * is set to the upper limit (384 TB).
         *
         * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs}
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        /**
         * The size, in terabytes, of the data volume that will be created and attached to the
         * database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum
         * storage value is determined by the infrastructure shape. See [Characteristics of
         * Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details. A full Exadata service is allocated when the Autonomous Database size
         * is set to the upper limit (384 TB).
         *
         * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs}
         * parameter.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel,
         * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
         * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * Applies to dedicated Exadata infrastructure only.
         *
         * <p>The size, in gigabytes, of the data volume that will be created and attached to the
         * database. The maximum storage value depends on the system shape. See [Characteristics of
         * Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs}
         * parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Applies to dedicated Exadata infrastructure only.
         *
         * <p>The size, in gigabytes, of the data volume that will be created and attached to the
         * database. The maximum storage value depends on the system shape. See [Characteristics of
         * Infrastructure
         * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
         * for shape details.
         *
         * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs}
         * parameter.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Database. The name does not have to be unique.
         * The display name can only be updated for Autonomous Databases using dedicated Exadata
         * Infrastructure. This parameter may not be updated in parallel with dbVersion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Database. The name does not have to be unique.
         * The display name can only be updated for Autonomous Databases using dedicated Exadata
         * Infrastructure. This parameter may not be updated in parallel with dbVersion.
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
         * The password must be between 12 and 30 characters long, and must contain at least 1
         * uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote
         * symbol (") or the username "admin", regardless of casing. It must be different from the
         * last four passwords and it must not be a password used within the last 24 hours.
         *
         * <p>This cannot be used in conjunction with with OCI vault secrets (secretId).
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * whitelistedIps, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds,
         * dbVersion, isRefreshable, dbName, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password must be between 12 and 30 characters long, and must contain at least 1
         * uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote
         * symbol (") or the username "admin", regardless of casing. It must be different from the
         * last four passwords and it must not be a password used within the last 24 hours.
         *
         * <p>This cannot be used in conjunction with with OCI vault secrets (secretId).
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * whitelistedIps, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds,
         * dbVersion, isRefreshable, dbName, or isFreeTier.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /**
         * New name for this Autonomous Database. For Autonomous Databases on Dedicated Exadata
         * Infrastructure, the name must begin with an alphabetic character, and can contain a
         * maximum of eight alphanumeric characters. Special characters are not permitted. For
         * Autonomous Database Serverless instances, the name must begin with an alphabetic
         * character, and can contain a maximum of 30 alphanumeric characters. Special characters
         * are not permitted. The database name must be unique in the tenancy.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
         * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * New name for this Autonomous Database. For Autonomous Databases on Dedicated Exadata
         * Infrastructure, the name must begin with an alphabetic character, and can contain a
         * maximum of eight alphanumeric characters. Special characters are not permitted. For
         * Autonomous Database Serverless instances, the name must begin with an alphabetic
         * character, and can contain a maximum of 30 alphanumeric characters. Special characters
         * are not permitted. The database name must be unique in the tenancy.
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
         * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
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
         * Control is disabled. {@code TRUE} if the Autonomous Database has Data Guard and Access
         * Control enabled, and the Autonomous Database uses the primary's IP access control list
         * (ACL) for standby. {@code FALSE} if the Autonomous Database has Data Guard and Access
         * Control enabled, and the Autonomous Database uses a different IP access control list
         * (ACL) for standby compared to primary.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
        private Boolean arePrimaryWhitelistedIpsUsed;

        /**
         * This field will be null if the Autonomous Database is not Data Guard enabled or Access
         * Control is disabled. {@code TRUE} if the Autonomous Database has Data Guard and Access
         * Control enabled, and the Autonomous Database uses the primary's IP access control list
         * (ACL) for standby. {@code FALSE} if the Autonomous Database has Data Guard and Access
         * Control enabled, and the Autonomous Database uses a different IP access control list
         * (ACL) for standby compared to primary.
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
        /**
         * Indicates whether auto scaling is enabled for the Autonomous Database CPU core count.
         * Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto
         * scaling. The default value is {@code TRUE}. Auto scaling is only available for
         * [Autonomous Database Serverless
         * instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates whether auto scaling is enabled for the Autonomous Database CPU core count.
         * Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto
         * scaling. The default value is {@code TRUE}. Auto scaling is only available for
         * [Autonomous Database Serverless
         * instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
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
         * Indicates whether the Autonomous Database has a local (in-region) standby database. Not
         * applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
         * infrastructure.
         *
         * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to
         * {@code FALSE}. For more information on using Autonomous Data Guard on an Autonomous
         * Database Serverless instance (local and cross-region) , see [About Standby
         * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         *
         * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
         * instance, see [Enable Autonomous Data
         * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
         *
         * <p>This cannot be updated in parallel with any of the following: isMTLSRequired,
         * dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
        private Boolean isLocalDataGuardEnabled;

        /**
         * Indicates whether the Autonomous Database has a local (in-region) standby database. Not
         * applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
         * infrastructure.
         *
         * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to
         * {@code FALSE}. For more information on using Autonomous Data Guard on an Autonomous
         * Database Serverless instance (local and cross-region) , see [About Standby
         * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         *
         * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
         * instance, see [Enable Autonomous Data
         * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
         *
         * <p>This cannot be updated in parallel with any of the following: isMTLSRequired,
         * dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or
         * isFreeTier.
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
         * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region)
         * standby database. Not applicable when creating a cross-region Autonomous Data Guard
         * associations, or to Autonomous Databases using dedicated Exadata infrastructure or
         * Exadata Cloud@Customer infrastructure.
         *
         * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to
         * {@code FALSE}. For more information on using Autonomous Data Guard on an Autonomous
         * Database Serverless instance (local and cross-region) , see [About Standby
         * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         *
         * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
         * instance, see [Enable Autonomous Data
         * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
         *
         * <p>To delete a cross-region standby database, provide the {@code peerDbId} for the
         * standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        /**
         * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region)
         * standby database. Not applicable when creating a cross-region Autonomous Data Guard
         * associations, or to Autonomous Databases using dedicated Exadata infrastructure or
         * Exadata Cloud@Customer infrastructure.
         *
         * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to
         * {@code FALSE}. For more information on using Autonomous Data Guard on an Autonomous
         * Database Serverless instance (local and cross-region) , see [About Standby
         * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         *
         * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
         * instance, see [Enable Autonomous Data
         * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
         *
         * <p>To delete a cross-region standby database, provide the {@code peerDbId} for the
         * standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
         *
         * @param isDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }
        /**
         * The database OCID(/Content/General/Concepts/identifiers.htm) of the Disaster Recovery
         * peer (source Primary) database, which is located in a different (remote) region from the
         * current peer database.
         *
         * <p>To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled}
         * parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbId")
        private String peerDbId;

        /**
         * The database OCID(/Content/General/Concepts/identifiers.htm) of the Disaster Recovery
         * peer (source Primary) database, which is located in a different (remote) region from the
         * current peer database.
         *
         * <p>To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled}
         * parameter.
         *
         * @param peerDbId the value to set
         * @return this builder
         */
        public Builder peerDbId(String peerDbId) {
            this.peerDbId = peerDbId;
            this.__explicitlySet__.add("peerDbId");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
         * Databases with private access. The nsgIds list can be empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the
         * network security groups (NSGs) to which this resource belongs. Setting this to an empty
         * list removes all resources from all NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
         * Databases with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
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
         * Customer Contacts. Setting this to an empty list removes all customer contacts of an
         * Oracle
         *
         * <p>This cannot be updated in parallel with any of the following:
         * isMTLSConnectionRequired, scheduledOperations, or dbToolsDetails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer Contacts. Setting this to an empty list removes all customer contacts of an
         * Oracle
         *
         * <p>This cannot be updated in parallel with any of the following:
         * isMTLSConnectionRequired, scheduledOperations, or dbToolsDetails.
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
        /**
         * The unique identifier for leader autonomous database OCID
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
        private String resourcePoolLeaderId;

        /**
         * The unique identifier for leader autonomous database OCID
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
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
         * The Oracle Database Edition that applies to the Autonomous databases. This parameter
         * accepts options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to the Autonomous databases. This parameter
         * accepts options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired,
         * dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations,
         * dbToolsDetails, or isFreeTier.
         *
         * @param databaseEdition the value to set
         * @return this builder
         */
        public Builder databaseEdition(AutonomousDatabaseSummary.DatabaseEdition databaseEdition) {
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
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID. This cannot be used
         * in conjunction with adminPassword.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID. This cannot be used
         * in conjunction with adminPassword.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The version of the vault secret. If no version is specified, the latest version will be
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
        private Integer secretVersionNumber;

        /**
         * The version of the vault secret. If no version is specified, the latest version will be
         * used.
         *
         * @param secretVersionNumber the value to set
         * @return this builder
         */
        public Builder secretVersionNumber(Integer secretVersionNumber) {
            this.secretVersionNumber = secretVersionNumber;
            this.__explicitlySet__.add("secretVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
        private AutonomousDatabaseEncryptionKeyDetails encryptionKey;

        public Builder encryptionKey(AutonomousDatabaseEncryptionKeyDetails encryptionKey) {
            this.encryptionKey = encryptionKey;
            this.__explicitlySet__.add("encryptionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousDatabaseDetails build() {
            UpdateAutonomousDatabaseDetails model =
                    new UpdateAutonomousDatabaseDetails(
                            this.backupRetentionPeriodInDays,
                            this.computeModel,
                            this.inMemoryPercentage,
                            this.localAdgAutoFailoverMaxDataLossLimit,
                            this.cpuCoreCount,
                            this.longTermBackupSchedule,
                            this.isDevTier,
                            this.computeCount,
                            this.ocpuCount,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.displayName,
                            this.isFreeTier,
                            this.adminPassword,
                            this.dbName,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.dbWorkload,
                            this.licenseModel,
                            this.byolComputeCountLimit,
                            this.isAccessControlEnabled,
                            this.whitelistedIps,
                            this.arePrimaryWhitelistedIpsUsed,
                            this.standbyWhitelistedIps,
                            this.isAutoScalingEnabled,
                            this.isRefreshableClone,
                            this.refreshableMode,
                            this.isLocalDataGuardEnabled,
                            this.isDataGuardEnabled,
                            this.peerDbId,
                            this.dbVersion,
                            this.openMode,
                            this.permissionLevel,
                            this.subnetId,
                            this.privateEndpointLabel,
                            this.privateEndpointIp,
                            this.nsgIds,
                            this.autoRefreshFrequencyInSeconds,
                            this.autoRefreshPointLagInSeconds,
                            this.timeOfAutoRefreshStart,
                            this.customerContacts,
                            this.isMtlsConnectionRequired,
                            this.resourcePoolLeaderId,
                            this.resourcePoolSummary,
                            this.scheduledOperations,
                            this.isAutoScalingForStorageEnabled,
                            this.databaseEdition,
                            this.dbToolsDetails,
                            this.secretId,
                            this.secretVersionNumber,
                            this.encryptionKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("backupRetentionPeriodInDays")) {
                this.backupRetentionPeriodInDays(model.getBackupRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("inMemoryPercentage")) {
                this.inMemoryPercentage(model.getInMemoryPercentage());
            }
            if (model.wasPropertyExplicitlySet("localAdgAutoFailoverMaxDataLossLimit")) {
                this.localAdgAutoFailoverMaxDataLossLimit(
                        model.getLocalAdgAutoFailoverMaxDataLossLimit());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("longTermBackupSchedule")) {
                this.longTermBackupSchedule(model.getLongTermBackupSchedule());
            }
            if (model.wasPropertyExplicitlySet("isDevTier")) {
                this.isDevTier(model.getIsDevTier());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isFreeTier")) {
                this.isFreeTier(model.getIsFreeTier());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
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
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("byolComputeCountLimit")) {
                this.byolComputeCountLimit(model.getByolComputeCountLimit());
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
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRefreshableClone")) {
                this.isRefreshableClone(model.getIsRefreshableClone());
            }
            if (model.wasPropertyExplicitlySet("refreshableMode")) {
                this.refreshableMode(model.getRefreshableMode());
            }
            if (model.wasPropertyExplicitlySet("isLocalDataGuardEnabled")) {
                this.isLocalDataGuardEnabled(model.getIsLocalDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDataGuardEnabled")) {
                this.isDataGuardEnabled(model.getIsDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerDbId")) {
                this.peerDbId(model.getPeerDbId());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            if (model.wasPropertyExplicitlySet("permissionLevel")) {
                this.permissionLevel(model.getPermissionLevel());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointLabel")) {
                this.privateEndpointLabel(model.getPrivateEndpointLabel());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
            }
            if (model.wasPropertyExplicitlySet("resourcePoolLeaderId")) {
                this.resourcePoolLeaderId(model.getResourcePoolLeaderId());
            }
            if (model.wasPropertyExplicitlySet("resourcePoolSummary")) {
                this.resourcePoolSummary(model.getResourcePoolSummary());
            }
            if (model.wasPropertyExplicitlySet("scheduledOperations")) {
                this.scheduledOperations(model.getScheduledOperations());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingForStorageEnabled")) {
                this.isAutoScalingForStorageEnabled(model.getIsAutoScalingForStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("dbToolsDetails")) {
                this.dbToolsDetails(model.getDbToolsDetails());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersionNumber")) {
                this.secretVersionNumber(model.getSecretVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("encryptionKey")) {
                this.encryptionKey(model.getEncryptionKey());
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

    /**
     * The compute model of the Autonomous Database. This is required if using the {@code
     * computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code
     * computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU
     * compute model is legacy.
     */
    public enum ComputeModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ecpu("ECPU"),
        Ocpu("OCPU"),
        ;

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ComputeModel: " + key);
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
     * The number of CPUs to be made available to the Autonomous Database.<br>
     * For Autonomous Databases on Dedicated Exadata Infrastructure: - The CPU type (OCPUs or ECPUs)
     * is determined by the parent Autonomous Exadata VM Cluster's compute model. - It is suggested
     * to use 'computeCount' parameter if you want to use fractional value to provision less than 1
     * core.
     *
     * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount}
     * parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPUs to be made available to the Autonomous Database.<br>
     * For Autonomous Databases on Dedicated Exadata Infrastructure: - The CPU type (OCPUs or ECPUs)
     * is determined by the parent Autonomous Exadata VM Cluster's compute model. - It is suggested
     * to use 'computeCount' parameter if you want to use fractional value to provision less than 1
     * core.
     *
     * <p>*Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount}
     * parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("longTermBackupSchedule")
    private final LongTermBackUpScheduleDetails longTermBackupSchedule;

    public LongTermBackUpScheduleDetails getLongTermBackupSchedule() {
        return longTermBackupSchedule;
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
     * The compute amount (CPUs) available to the database. Minimum and maximum values depend on the
     * compute model and whether the database is an Autonomous Database Serverless instance or an
     * Autonomous Database on Dedicated Exadata Infrastructure. The 'ECPU' compute model requires a
     * minimum value of one, for databases in the elastic resource pool and minimum value of two,
     * otherwise. Required when using the {@code computeModel} parameter. When using {@code
     * cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.
     * Providing {@code computeModel} and {@code computeCount} is the preferred method for both OCPU
     * and ECPU.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
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
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /**
     * The number of OCPU cores to be made available to the Autonomous Database.
     *
     * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, you can specify a fractional
     * value for this parameter. Fractional values are not supported for Autonomous Database
     * Serverless instances. For Autonomous Database Serverless instances, this parameter is not
     * used.
     *
     * <p>To provision less than 1 core, enter a fractional value in an increment of 0.1. To
     * provision 1 or more cores, you must enter an integer between 1 and the maximum number of
     * cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores,
     * but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The
     * maximum number of cores is determined by the infrastructure shape. See [Characteristics of
     * Infrastructure
     * Shapes](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbde/index.html)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to be made available to the Autonomous Database.
     *
     * <p>For Autonomous Databases on Dedicated Exadata Infrastructure, you can specify a fractional
     * value for this parameter. Fractional values are not supported for Autonomous Database
     * Serverless instances. For Autonomous Database Serverless instances, this parameter is not
     * used.
     *
     * <p>To provision less than 1 core, enter a fractional value in an increment of 0.1. To
     * provision 1 or more cores, you must enter an integer between 1 and the maximum number of
     * cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores,
     * but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The
     * maximum number of cores is determined by the infrastructure shape. See [Characteristics of
     * Infrastructure
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

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     * For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is
     * determined by the infrastructure shape. See [Characteristics of Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details. A full Exadata service is allocated when the Autonomous Database size is
     * set to the upper limit (384 TB).
     *
     * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database.
     * For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is
     * determined by the infrastructure shape. See [Characteristics of Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details. A full Exadata service is allocated when the Autonomous Database size is
     * set to the upper limit (384 TB).
     *
     * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel,
     * databaseEdition, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel,
     * privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations,
     * dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * Applies to dedicated Exadata infrastructure only.
     *
     * <p>The size, in gigabytes, of the data volume that will be created and attached to the
     * database. The maximum storage value depends on the system shape. See [Characteristics of
     * Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Applies to dedicated Exadata infrastructure only.
     *
     * <p>The size, in gigabytes, of the data volume that will be created and attached to the
     * database. The maximum storage value depends on the system shape. See [Characteristics of
     * Infrastructure
     * Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1)
     * for shape details.
     *
     * <p>*Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique. The
     * display name can only be updated for Autonomous Databases using dedicated Exadata
     * Infrastructure. This parameter may not be updated in parallel with dbVersion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique. The
     * display name can only be updated for Autonomous Databases using dedicated Exadata
     * Infrastructure. This parameter may not be updated in parallel with dbVersion.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
     * The password must be between 12 and 30 characters long, and must contain at least 1
     * uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol
     * (") or the username "admin", regardless of casing. It must be different from the last four
     * passwords and it must not be a password used within the last 24 hours.
     *
     * <p>This cannot be used in conjunction with with OCI vault secrets (secretId).
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * whitelistedIps, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds,
     * dbVersion, isRefreshable, dbName, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password must be between 12 and 30 characters long, and must contain at least 1
     * uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol
     * (") or the username "admin", regardless of casing. It must be different from the last four
     * passwords and it must not be a password used within the last 24 hours.
     *
     * <p>This cannot be used in conjunction with with OCI vault secrets (secretId).
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * whitelistedIps, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds,
     * dbVersion, isRefreshable, dbName, or isFreeTier.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * New name for this Autonomous Database. For Autonomous Databases on Dedicated Exadata
     * Infrastructure, the name must begin with an alphabetic character, and can contain a maximum
     * of eight alphanumeric characters. Special characters are not permitted. For Autonomous
     * Database Serverless instances, the name must begin with an alphabetic character, and can
     * contain a maximum of 30 alphanumeric characters. Special characters are not permitted. The
     * database name must be unique in the tenancy.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
     * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * New name for this Autonomous Database. For Autonomous Databases on Dedicated Exadata
     * Infrastructure, the name must begin with an alphabetic character, and can contain a maximum
     * of eight alphanumeric characters. Special characters are not permitted. For Autonomous
     * Database Serverless instances, the name must begin with an alphabetic character, and can
     * contain a maximum of 30 alphanumeric characters. Special characters are not permitted. The
     * database name must be unique in the tenancy.
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel,
     * nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        ;

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DbWorkload: " + key);
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
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
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
     * Control is disabled. {@code TRUE} if the Autonomous Database has Data Guard and Access
     * Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL)
     * for standby. {@code FALSE} if the Autonomous Database has Data Guard and Access Control
     * enabled, and the Autonomous Database uses a different IP access control list (ACL) for
     * standby compared to primary.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    private final Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access
     * Control is disabled. {@code TRUE} if the Autonomous Database has Data Guard and Access
     * Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL)
     * for standby. {@code FALSE} if the Autonomous Database has Data Guard and Access Control
     * enabled, and the Autonomous Database uses a different IP access control list (ACL) for
     * standby compared to primary.
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

    /**
     * Indicates whether auto scaling is enabled for the Autonomous Database CPU core count. Setting
     * to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The
     * default value is {@code TRUE}. Auto scaling is only available for [Autonomous Database
     * Serverless instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates whether auto scaling is enabled for the Autonomous Database CPU core count. Setting
     * to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The
     * default value is {@code TRUE}. Auto scaling is only available for [Autonomous Database
     * Serverless instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
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

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being
     * refreshed with data from the source Autonomous Database.
     */
    public enum RefreshableMode implements com.oracle.bmc.http.internal.BmcEnum {
        Automatic("AUTOMATIC"),
        Manual("MANUAL"),
        ;

        private final String value;
        private static java.util.Map<String, RefreshableMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RefreshableMode v : RefreshableMode.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid RefreshableMode: " + key);
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
     * Indicates whether the Autonomous Database has a local (in-region) standby database. Not
     * applicable when creating a cross-region Autonomous Data Guard associations, or to Autonomous
     * Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code
     * FALSE}. For more information on using Autonomous Data Guard on an Autonomous Database
     * Serverless instance (local and cross-region) , see [About Standby
     * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     *
     * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
     * instance, see [Enable Autonomous Data
     * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
     *
     * <p>This cannot be updated in parallel with any of the following: isMTLSRequired, dbWorkload,
     * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
    private final Boolean isLocalDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has a local (in-region) standby database. Not
     * applicable when creating a cross-region Autonomous Data Guard associations, or to Autonomous
     * Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code
     * FALSE}. For more information on using Autonomous Data Guard on an Autonomous Database
     * Serverless instance (local and cross-region) , see [About Standby
     * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     *
     * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
     * instance, see [Enable Autonomous Data
     * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
     *
     * <p>This cannot be updated in parallel with any of the following: isMTLSRequired, dbWorkload,
     * dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     */
    public Boolean getIsLocalDataGuardEnabled() {
        return isLocalDataGuardEnabled;
    }

    /**
     * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby
     * database. Not applicable when creating a cross-region Autonomous Data Guard associations, or
     * to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
     * infrastructure.
     *
     * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code
     * FALSE}. For more information on using Autonomous Data Guard on an Autonomous Database
     * Serverless instance (local and cross-region) , see [About Standby
     * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     *
     * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
     * instance, see [Enable Autonomous Data
     * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
     *
     * <p>To delete a cross-region standby database, provide the {@code peerDbId} for the standby
     * database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    private final Boolean isDataGuardEnabled;

    /**
     * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby
     * database. Not applicable when creating a cross-region Autonomous Data Guard associations, or
     * to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer
     * infrastructure.
     *
     * <p>To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code
     * FALSE}. For more information on using Autonomous Data Guard on an Autonomous Database
     * Serverless instance (local and cross-region) , see [About Standby
     * Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     *
     * <p>To enable cross-region Autonomous Data Guard on an Autonomous Database Serverless
     * instance, see [Enable Autonomous Data
     * Guard](https://docs-uat.us.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-update-type.html#GUID-967ED737-4A05-4D6E-A7CA-C3F21ACF9BF0).
     *
     * <p>To delete a cross-region standby database, provide the {@code peerDbId} for the standby
     * database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }

    /**
     * The database OCID(/Content/General/Concepts/identifiers.htm) of the Disaster Recovery peer
     * (source Primary) database, which is located in a different (remote) region from the current
     * peer database.
     *
     * <p>To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled}
     * parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbId")
    private final String peerDbId;

    /**
     * The database OCID(/Content/General/Concepts/identifiers.htm) of the Disaster Recovery peer
     * (source Primary) database, which is located in a different (remote) region from the current
     * peer database.
     *
     * <p>To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled}
     * parameter.
     *
     * @return the value
     */
    public String getPeerDbId() {
        return peerDbId;
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
        ;

        private final String value;
        private static java.util.Map<String, OpenMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OpenMode v : OpenMode.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid OpenMode: " + key);
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
     * The Autonomous Database permission level. Restricted mode allows access only by admin users.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, nsgIds, dbVersion,
     * isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     */
    public enum PermissionLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Unrestricted("UNRESTRICTED"),
        ;

        private final String value;
        private static java.util.Map<String, PermissionLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (PermissionLevel v : PermissionLevel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PermissionLevel: " + key);
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
     * Databases with private access. The nsgIds list can be empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * for the network security groups (NSGs) to which this resource belongs. Setting this to an
     * empty list removes all resources from all NSGs. For more information about NSGs, see
     * [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:** - A network security group (NSG) is optional for Autonomous
     * Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
     * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle
     *
     * <p>This cannot be updated in parallel with any of the following: isMTLSConnectionRequired,
     * scheduledOperations, or dbToolsDetails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle
     *
     * <p>This cannot be updated in parallel with any of the following: isMTLSConnectionRequired,
     * scheduledOperations, or dbToolsDetails.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
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

    /**
     * The unique identifier for leader autonomous database OCID
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
    private final String resourcePoolLeaderId;

    /**
     * The unique identifier for leader autonomous database OCID
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
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
     * The Oracle Database Edition that applies to the Autonomous databases. This parameter accepts
     * options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to the Autonomous databases. This parameter accepts
     * options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     *
     * @return the value
     */
    public AutonomousDatabaseSummary.DatabaseEdition getDatabaseEdition() {
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
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID. This cannot be used in
     * conjunction with adminPassword.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID. This cannot be used in
     * conjunction with adminPassword.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
    private final Integer secretVersionNumber;

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     *
     * @return the value
     */
    public Integer getSecretVersionNumber() {
        return secretVersionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
    private final AutonomousDatabaseEncryptionKeyDetails encryptionKey;

    public AutonomousDatabaseEncryptionKeyDetails getEncryptionKey() {
        return encryptionKey;
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
        sb.append("UpdateAutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("backupRetentionPeriodInDays=")
                .append(String.valueOf(this.backupRetentionPeriodInDays));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", inMemoryPercentage=").append(String.valueOf(this.inMemoryPercentage));
        sb.append(", localAdgAutoFailoverMaxDataLossLimit=")
                .append(String.valueOf(this.localAdgAutoFailoverMaxDataLossLimit));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", longTermBackupSchedule=").append(String.valueOf(this.longTermBackupSchedule));
        sb.append(", isDevTier=").append(String.valueOf(this.isDevTier));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", byolComputeCountLimit=").append(String.valueOf(this.byolComputeCountLimit));
        sb.append(", isAccessControlEnabled=").append(String.valueOf(this.isAccessControlEnabled));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", arePrimaryWhitelistedIpsUsed=")
                .append(String.valueOf(this.arePrimaryWhitelistedIpsUsed));
        sb.append(", standbyWhitelistedIps=").append(String.valueOf(this.standbyWhitelistedIps));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", isRefreshableClone=").append(String.valueOf(this.isRefreshableClone));
        sb.append(", refreshableMode=").append(String.valueOf(this.refreshableMode));
        sb.append(", isLocalDataGuardEnabled=")
                .append(String.valueOf(this.isLocalDataGuardEnabled));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", peerDbId=").append(String.valueOf(this.peerDbId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", permissionLevel=").append(String.valueOf(this.permissionLevel));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointLabel=").append(String.valueOf(this.privateEndpointLabel));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", autoRefreshFrequencyInSeconds=")
                .append(String.valueOf(this.autoRefreshFrequencyInSeconds));
        sb.append(", autoRefreshPointLagInSeconds=")
                .append(String.valueOf(this.autoRefreshPointLagInSeconds));
        sb.append(", timeOfAutoRefreshStart=").append(String.valueOf(this.timeOfAutoRefreshStart));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", resourcePoolLeaderId=").append(String.valueOf(this.resourcePoolLeaderId));
        sb.append(", resourcePoolSummary=").append(String.valueOf(this.resourcePoolSummary));
        sb.append(", scheduledOperations=").append(String.valueOf(this.scheduledOperations));
        sb.append(", isAutoScalingForStorageEnabled=")
                .append(String.valueOf(this.isAutoScalingForStorageEnabled));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", dbToolsDetails=").append(String.valueOf(this.dbToolsDetails));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", secretVersionNumber=").append(String.valueOf(this.secretVersionNumber));
        sb.append(", encryptionKey=").append(String.valueOf(this.encryptionKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseDetails)) {
            return false;
        }

        UpdateAutonomousDatabaseDetails other = (UpdateAutonomousDatabaseDetails) o;
        return java.util.Objects.equals(
                        this.backupRetentionPeriodInDays, other.backupRetentionPeriodInDays)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.inMemoryPercentage, other.inMemoryPercentage)
                && java.util.Objects.equals(
                        this.localAdgAutoFailoverMaxDataLossLimit,
                        other.localAdgAutoFailoverMaxDataLossLimit)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(
                        this.longTermBackupSchedule, other.longTermBackupSchedule)
                && java.util.Objects.equals(this.isDevTier, other.isDevTier)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.byolComputeCountLimit, other.byolComputeCountLimit)
                && java.util.Objects.equals(
                        this.isAccessControlEnabled, other.isAccessControlEnabled)
                && java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(
                        this.arePrimaryWhitelistedIpsUsed, other.arePrimaryWhitelistedIpsUsed)
                && java.util.Objects.equals(this.standbyWhitelistedIps, other.standbyWhitelistedIps)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.isRefreshableClone, other.isRefreshableClone)
                && java.util.Objects.equals(this.refreshableMode, other.refreshableMode)
                && java.util.Objects.equals(
                        this.isLocalDataGuardEnabled, other.isLocalDataGuardEnabled)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(this.peerDbId, other.peerDbId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.permissionLevel, other.permissionLevel)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointLabel, other.privateEndpointLabel)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(
                        this.autoRefreshFrequencyInSeconds, other.autoRefreshFrequencyInSeconds)
                && java.util.Objects.equals(
                        this.autoRefreshPointLagInSeconds, other.autoRefreshPointLagInSeconds)
                && java.util.Objects.equals(
                        this.timeOfAutoRefreshStart, other.timeOfAutoRefreshStart)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(this.resourcePoolLeaderId, other.resourcePoolLeaderId)
                && java.util.Objects.equals(this.resourcePoolSummary, other.resourcePoolSummary)
                && java.util.Objects.equals(this.scheduledOperations, other.scheduledOperations)
                && java.util.Objects.equals(
                        this.isAutoScalingForStorageEnabled, other.isAutoScalingForStorageEnabled)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.dbToolsDetails, other.dbToolsDetails)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.secretVersionNumber, other.secretVersionNumber)
                && java.util.Objects.equals(this.encryptionKey, other.encryptionKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupRetentionPeriodInDays == null
                                ? 43
                                : this.backupRetentionPeriodInDays.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.inMemoryPercentage == null
                                ? 43
                                : this.inMemoryPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.localAdgAutoFailoverMaxDataLossLimit == null
                                ? 43
                                : this.localAdgAutoFailoverMaxDataLossLimit.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.longTermBackupSchedule == null
                                ? 43
                                : this.longTermBackupSchedule.hashCode());
        result = (result * PRIME) + (this.isDevTier == null ? 43 : this.isDevTier.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.byolComputeCountLimit == null
                                ? 43
                                : this.byolComputeCountLimit.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRefreshableClone == null
                                ? 43
                                : this.isRefreshableClone.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableMode == null ? 43 : this.refreshableMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalDataGuardEnabled == null
                                ? 43
                                : this.isLocalDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.peerDbId == null ? 43 : this.peerDbId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result =
                (result * PRIME)
                        + (this.permissionLevel == null ? 43 : this.permissionLevel.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointLabel == null
                                ? 43
                                : this.privateEndpointLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
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
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
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
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.dbToolsDetails == null ? 43 : this.dbToolsDetails.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersionNumber == null
                                ? 43
                                : this.secretVersionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionKey == null ? 43 : this.encryptionKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
