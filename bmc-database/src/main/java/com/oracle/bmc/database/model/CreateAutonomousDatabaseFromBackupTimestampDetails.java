/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create a point-in-time clone of an Oracle Autonomous Database by specifying a
 * timestamp. Point-in-time clones use backups as the source of the data for the clone. <br>
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
        builder = CreateAutonomousDatabaseFromBackupTimestampDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousDatabaseFromBackupTimestampDetails
        extends CreateAutonomousDatabaseBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
        private Integer backupRetentionPeriodInDays;

        public Builder backupRetentionPeriodInDays(Integer backupRetentionPeriodInDays) {
            this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
            this.__explicitlySet__.add("backupRetentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
        private AutonomousDatabaseEncryptionKeyDetails encryptionKey;

        public Builder encryptionKey(AutonomousDatabaseEncryptionKeyDetails encryptionKey) {
            this.encryptionKey = encryptionKey;
            this.__explicitlySet__.add("encryptionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("byolComputeCountLimit")
        private Float byolComputeCountLimit;

        public Builder byolComputeCountLimit(Float byolComputeCountLimit) {
            this.byolComputeCountLimit = byolComputeCountLimit;
            this.__explicitlySet__.add("byolComputeCountLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPreviewVersionWithServiceTermsAccepted")
        private Boolean isPreviewVersionWithServiceTermsAccepted;

        public Builder isPreviewVersionWithServiceTermsAccepted(
                Boolean isPreviewVersionWithServiceTermsAccepted) {
            this.isPreviewVersionWithServiceTermsAccepted =
                    isPreviewVersionWithServiceTermsAccepted;
            this.__explicitlySet__.add("isPreviewVersionWithServiceTermsAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDevTier")
        private Boolean isDevTier;

        public Builder isDevTier(Boolean isDevTier) {
            this.isDevTier = isDevTier;
            this.__explicitlySet__.add("isDevTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
        private String autonomousContainerDatabaseId;

        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            this.__explicitlySet__.add("autonomousContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inMemoryPercentage")
        private Integer inMemoryPercentage;

        public Builder inMemoryPercentage(Integer inMemoryPercentage) {
            this.inMemoryPercentage = inMemoryPercentage;
            this.__explicitlySet__.add("inMemoryPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
        private Boolean isAccessControlEnabled;

        public Builder isAccessControlEnabled(Boolean isAccessControlEnabled) {
            this.isAccessControlEnabled = isAccessControlEnabled;
            this.__explicitlySet__.add("isAccessControlEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
        private Boolean arePrimaryWhitelistedIpsUsed;

        public Builder arePrimaryWhitelistedIpsUsed(Boolean arePrimaryWhitelistedIpsUsed) {
            this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
            this.__explicitlySet__.add("arePrimaryWhitelistedIpsUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
        private java.util.List<String> standbyWhitelistedIps;

        public Builder standbyWhitelistedIps(java.util.List<String> standbyWhitelistedIps) {
            this.standbyWhitelistedIps = standbyWhitelistedIps;
            this.__explicitlySet__.add("standbyWhitelistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
        private Boolean isLocalDataGuardEnabled;

        public Builder isLocalDataGuardEnabled(Boolean isLocalDataGuardEnabled) {
            this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
            this.__explicitlySet__.add("isLocalDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
        private String privateEndpointLabel;

        public Builder privateEndpointLabel(String privateEndpointLabel) {
            this.privateEndpointLabel = privateEndpointLabel;
            this.__explicitlySet__.add("privateEndpointLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
        private String resourcePoolLeaderId;

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

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
        private AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

        public Builder autonomousMaintenanceScheduleType(
                AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType) {
            this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
            this.__explicitlySet__.add("autonomousMaintenanceScheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
        private java.util.List<ScheduledOperationDetails> scheduledOperations;

        public Builder scheduledOperations(
                java.util.List<ScheduledOperationDetails> scheduledOperations) {
            this.scheduledOperations = scheduledOperations;
            this.__explicitlySet__.add("scheduledOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
        private Boolean isAutoScalingForStorageEnabled;

        public Builder isAutoScalingForStorageEnabled(Boolean isAutoScalingForStorageEnabled) {
            this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
            this.__explicitlySet__.add("isAutoScalingForStorageEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

        public Builder databaseEdition(AutonomousDatabaseSummary.DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
        private java.util.List<DatabaseTool> dbToolsDetails;

        public Builder dbToolsDetails(java.util.List<DatabaseTool> dbToolsDetails) {
            this.dbToolsDetails = dbToolsDetails;
            this.__explicitlySet__.add("dbToolsDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBackupRetentionLocked")
        private Boolean isBackupRetentionLocked;

        public Builder isBackupRetentionLocked(Boolean isBackupRetentionLocked) {
            this.isBackupRetentionLocked = isBackupRetentionLocked;
            this.__explicitlySet__.add("isBackupRetentionLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
        private Integer secretVersionNumber;

        public Builder secretVersionNumber(Integer secretVersionNumber) {
            this.secretVersionNumber = secretVersionNumber;
            this.__explicitlySet__.add("secretVersionNumber");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source Autonomous Database that you will clone to create a new Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
        private String autonomousDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * source Autonomous Database that you will clone to create a new Autonomous Database.
         *
         * @param autonomousDatabaseId the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            this.__explicitlySet__.add("autonomousDatabaseId");
            return this;
        }
        /**
         * The timestamp specified for the point-in-time clone of the source Autonomous Database.
         * The timestamp must be in the past.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The timestamp specified for the point-in-time clone of the source Autonomous Database.
         * The timestamp must be in the past.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** The Autonomous Database clone type. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloneType")
        private CloneType cloneType;

        /**
         * The Autonomous Database clone type.
         *
         * @param cloneType the value to set
         * @return this builder
         */
        public Builder cloneType(CloneType cloneType) {
            this.cloneType = cloneType;
            this.__explicitlySet__.add("cloneType");
            return this;
        }
        /** Clone from latest available backup timestamp. */
        @com.fasterxml.jackson.annotation.JsonProperty("useLatestAvailableBackupTimeStamp")
        private Boolean useLatestAvailableBackupTimeStamp;

        /**
         * Clone from latest available backup timestamp.
         *
         * @param useLatestAvailableBackupTimeStamp the value to set
         * @return this builder
         */
        public Builder useLatestAvailableBackupTimeStamp(
                Boolean useLatestAvailableBackupTimeStamp) {
            this.useLatestAvailableBackupTimeStamp = useLatestAvailableBackupTimeStamp;
            this.__explicitlySet__.add("useLatestAvailableBackupTimeStamp");
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

        public CreateAutonomousDatabaseFromBackupTimestampDetails build() {
            CreateAutonomousDatabaseFromBackupTimestampDetails model =
                    new CreateAutonomousDatabaseFromBackupTimestampDetails(
                            this.subscriptionId,
                            this.compartmentId,
                            this.characterSet,
                            this.ncharacterSet,
                            this.dbName,
                            this.cpuCoreCount,
                            this.backupRetentionPeriodInDays,
                            this.computeModel,
                            this.computeCount,
                            this.ocpuCount,
                            this.dbWorkload,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.isFreeTier,
                            this.kmsKeyId,
                            this.vaultId,
                            this.encryptionKey,
                            this.adminPassword,
                            this.displayName,
                            this.licenseModel,
                            this.byolComputeCountLimit,
                            this.isPreviewVersionWithServiceTermsAccepted,
                            this.isAutoScalingEnabled,
                            this.isDevTier,
                            this.isDedicated,
                            this.autonomousContainerDatabaseId,
                            this.inMemoryPercentage,
                            this.isAccessControlEnabled,
                            this.whitelistedIps,
                            this.arePrimaryWhitelistedIpsUsed,
                            this.standbyWhitelistedIps,
                            this.isDataGuardEnabled,
                            this.isLocalDataGuardEnabled,
                            this.subnetId,
                            this.nsgIds,
                            this.privateEndpointLabel,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.privateEndpointIp,
                            this.dbVersion,
                            this.customerContacts,
                            this.isMtlsConnectionRequired,
                            this.resourcePoolLeaderId,
                            this.resourcePoolSummary,
                            this.autonomousMaintenanceScheduleType,
                            this.scheduledOperations,
                            this.isAutoScalingForStorageEnabled,
                            this.databaseEdition,
                            this.dbToolsDetails,
                            this.isBackupRetentionLocked,
                            this.secretId,
                            this.secretVersionNumber,
                            this.autonomousDatabaseId,
                            this.timestamp,
                            this.cloneType,
                            this.useLatestAvailableBackupTimeStamp,
                            this.cloneTableSpaceList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousDatabaseFromBackupTimestampDetails model) {
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
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
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("backupRetentionPeriodInDays")) {
                this.backupRetentionPeriodInDays(model.getBackupRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("isFreeTier")) {
                this.isFreeTier(model.getIsFreeTier());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("encryptionKey")) {
                this.encryptionKey(model.getEncryptionKey());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("byolComputeCountLimit")) {
                this.byolComputeCountLimit(model.getByolComputeCountLimit());
            }
            if (model.wasPropertyExplicitlySet("isPreviewVersionWithServiceTermsAccepted")) {
                this.isPreviewVersionWithServiceTermsAccepted(
                        model.getIsPreviewVersionWithServiceTermsAccepted());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDevTier")) {
                this.isDevTier(model.getIsDevTier());
            }
            if (model.wasPropertyExplicitlySet("isDedicated")) {
                this.isDedicated(model.getIsDedicated());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseId")) {
                this.autonomousContainerDatabaseId(model.getAutonomousContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("inMemoryPercentage")) {
                this.inMemoryPercentage(model.getInMemoryPercentage());
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
            if (model.wasPropertyExplicitlySet("isDataGuardEnabled")) {
                this.isDataGuardEnabled(model.getIsDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLocalDataGuardEnabled")) {
                this.isLocalDataGuardEnabled(model.getIsLocalDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointLabel")) {
                this.privateEndpointLabel(model.getPrivateEndpointLabel());
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
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
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
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("dbToolsDetails")) {
                this.dbToolsDetails(model.getDbToolsDetails());
            }
            if (model.wasPropertyExplicitlySet("isBackupRetentionLocked")) {
                this.isBackupRetentionLocked(model.getIsBackupRetentionLocked());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersionNumber")) {
                this.secretVersionNumber(model.getSecretVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseId")) {
                this.autonomousDatabaseId(model.getAutonomousDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("cloneType")) {
                this.cloneType(model.getCloneType());
            }
            if (model.wasPropertyExplicitlySet("useLatestAvailableBackupTimeStamp")) {
                this.useLatestAvailableBackupTimeStamp(
                        model.getUseLatestAvailableBackupTimeStamp());
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

    @Deprecated
    public CreateAutonomousDatabaseFromBackupTimestampDetails(
            String subscriptionId,
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbName,
            Integer cpuCoreCount,
            Integer backupRetentionPeriodInDays,
            ComputeModel computeModel,
            Float computeCount,
            Float ocpuCount,
            DbWorkload dbWorkload,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            Boolean isFreeTier,
            String kmsKeyId,
            String vaultId,
            AutonomousDatabaseEncryptionKeyDetails encryptionKey,
            String adminPassword,
            String displayName,
            LicenseModel licenseModel,
            Float byolComputeCountLimit,
            Boolean isPreviewVersionWithServiceTermsAccepted,
            Boolean isAutoScalingEnabled,
            Boolean isDevTier,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
            Integer inMemoryPercentage,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            Boolean isDataGuardEnabled,
            Boolean isLocalDataGuardEnabled,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateEndpointLabel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String privateEndpointIp,
            String dbVersion,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            String resourcePoolLeaderId,
            ResourcePoolSummary resourcePoolSummary,
            AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition,
            java.util.List<DatabaseTool> dbToolsDetails,
            Boolean isBackupRetentionLocked,
            String secretId,
            Integer secretVersionNumber,
            String autonomousDatabaseId,
            java.util.Date timestamp,
            CloneType cloneType,
            Boolean useLatestAvailableBackupTimeStamp,
            java.util.List<Integer> cloneTableSpaceList) {
        super(
                subscriptionId,
                compartmentId,
                characterSet,
                ncharacterSet,
                dbName,
                cpuCoreCount,
                backupRetentionPeriodInDays,
                computeModel,
                computeCount,
                ocpuCount,
                dbWorkload,
                dataStorageSizeInTBs,
                dataStorageSizeInGBs,
                isFreeTier,
                kmsKeyId,
                vaultId,
                encryptionKey,
                adminPassword,
                displayName,
                licenseModel,
                byolComputeCountLimit,
                isPreviewVersionWithServiceTermsAccepted,
                isAutoScalingEnabled,
                isDevTier,
                isDedicated,
                autonomousContainerDatabaseId,
                inMemoryPercentage,
                isAccessControlEnabled,
                whitelistedIps,
                arePrimaryWhitelistedIpsUsed,
                standbyWhitelistedIps,
                isDataGuardEnabled,
                isLocalDataGuardEnabled,
                subnetId,
                nsgIds,
                privateEndpointLabel,
                freeformTags,
                definedTags,
                securityAttributes,
                privateEndpointIp,
                dbVersion,
                customerContacts,
                isMtlsConnectionRequired,
                resourcePoolLeaderId,
                resourcePoolSummary,
                autonomousMaintenanceScheduleType,
                scheduledOperations,
                isAutoScalingForStorageEnabled,
                databaseEdition,
                dbToolsDetails,
                isBackupRetentionLocked,
                secretId,
                secretVersionNumber);
        this.autonomousDatabaseId = autonomousDatabaseId;
        this.timestamp = timestamp;
        this.cloneType = cloneType;
        this.useLatestAvailableBackupTimeStamp = useLatestAvailableBackupTimeStamp;
        this.cloneTableSpaceList = cloneTableSpaceList;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source Autonomous Database that you will clone to create a new Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
    private final String autonomousDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * source Autonomous Database that you will clone to create a new Autonomous Database.
     *
     * @return the value
     */
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }

    /**
     * The timestamp specified for the point-in-time clone of the source Autonomous Database. The
     * timestamp must be in the past.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The timestamp specified for the point-in-time clone of the source Autonomous Database. The
     * timestamp must be in the past.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** The Autonomous Database clone type. */
    public enum CloneType implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Metadata("METADATA"),
        Partial("PARTIAL"),
        ;

        private final String value;
        private static java.util.Map<String, CloneType> map;

        static {
            map = new java.util.HashMap<>();
            for (CloneType v : CloneType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CloneType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloneType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CloneType: " + key);
        }
    };
    /** The Autonomous Database clone type. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloneType")
    private final CloneType cloneType;

    /**
     * The Autonomous Database clone type.
     *
     * @return the value
     */
    public CloneType getCloneType() {
        return cloneType;
    }

    /** Clone from latest available backup timestamp. */
    @com.fasterxml.jackson.annotation.JsonProperty("useLatestAvailableBackupTimeStamp")
    private final Boolean useLatestAvailableBackupTimeStamp;

    /**
     * Clone from latest available backup timestamp.
     *
     * @return the value
     */
    public Boolean getUseLatestAvailableBackupTimeStamp() {
        return useLatestAvailableBackupTimeStamp;
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
        sb.append("CreateAutonomousDatabaseFromBackupTimestampDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", cloneType=").append(String.valueOf(this.cloneType));
        sb.append(", useLatestAvailableBackupTimeStamp=")
                .append(String.valueOf(this.useLatestAvailableBackupTimeStamp));
        sb.append(", cloneTableSpaceList=").append(String.valueOf(this.cloneTableSpaceList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseFromBackupTimestampDetails)) {
            return false;
        }

        CreateAutonomousDatabaseFromBackupTimestampDetails other =
                (CreateAutonomousDatabaseFromBackupTimestampDetails) o;
        return java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.cloneType, other.cloneType)
                && java.util.Objects.equals(
                        this.useLatestAvailableBackupTimeStamp,
                        other.useLatestAvailableBackupTimeStamp)
                && java.util.Objects.equals(this.cloneTableSpaceList, other.cloneTableSpaceList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.cloneType == null ? 43 : this.cloneType.hashCode());
        result =
                (result * PRIME)
                        + (this.useLatestAvailableBackupTimeStamp == null
                                ? 43
                                : this.useLatestAvailableBackupTimeStamp.hashCode());
        result =
                (result * PRIME)
                        + (this.cloneTableSpaceList == null
                                ? 43
                                : this.cloneTableSpaceList.hashCode());
        return result;
    }
}
