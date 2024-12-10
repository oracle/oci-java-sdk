/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Oracle Autonomous Database refreshable clone.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateRefreshableAutonomousDatabaseCloneDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateRefreshableAutonomousDatabaseCloneDetails
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that you will clone to create a new Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that you will clone to create a new Autonomous Database.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
        private RefreshableMode refreshableMode;

        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
         * @param refreshableMode the value to set
         * @return this builder
         **/
        public Builder refreshableMode(RefreshableMode refreshableMode) {
            this.refreshableMode = refreshableMode;
            this.__explicitlySet__.add("refreshableMode");
            return this;
        }
        /**
         * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled by the {@code timeOfAutoRefreshStart} parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshFrequencyInSeconds")
        private Integer autoRefreshFrequencyInSeconds;

        /**
         * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled by the {@code timeOfAutoRefreshStart} parameter.
         * @param autoRefreshFrequencyInSeconds the value to set
         * @return this builder
         **/
        public Builder autoRefreshFrequencyInSeconds(Integer autoRefreshFrequencyInSeconds) {
            this.autoRefreshFrequencyInSeconds = autoRefreshFrequencyInSeconds;
            this.__explicitlySet__.add("autoRefreshFrequencyInSeconds");
            return this;
        }
        /**
         * The time, in seconds, the data of the refreshable clone lags the primary database at the point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available timestamp). The maximum is 7 days. The lag time increases after refreshing until the next data refresh happens.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshPointLagInSeconds")
        private Integer autoRefreshPointLagInSeconds;

        /**
         * The time, in seconds, the data of the refreshable clone lags the primary database at the point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available timestamp). The maximum is 7 days. The lag time increases after refreshing until the next data refresh happens.
         * @param autoRefreshPointLagInSeconds the value to set
         * @return this builder
         **/
        public Builder autoRefreshPointLagInSeconds(Integer autoRefreshPointLagInSeconds) {
            this.autoRefreshPointLagInSeconds = autoRefreshPointLagInSeconds;
            this.__explicitlySet__.add("autoRefreshPointLagInSeconds");
            return this;
        }
        /**
         * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable clone. This value controls only the start time for the first refresh operation. Subsequent (ongoing) refresh operations have start times controlled by the value of the {@code autoRefreshFrequencyInSeconds} parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAutoRefreshStart")
        private java.util.Date timeOfAutoRefreshStart;

        /**
         * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable clone. This value controls only the start time for the first refresh operation. Subsequent (ongoing) refresh operations have start times controlled by the value of the {@code autoRefreshFrequencyInSeconds} parameter.
         * @param timeOfAutoRefreshStart the value to set
         * @return this builder
         **/
        public Builder timeOfAutoRefreshStart(java.util.Date timeOfAutoRefreshStart) {
            this.timeOfAutoRefreshStart = timeOfAutoRefreshStart;
            this.__explicitlySet__.add("timeOfAutoRefreshStart");
            return this;
        }
        /**
         * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or {@code READ_WRITE} mode.
         * <p>
         * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        /**
         * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or {@code READ_WRITE} mode.
         * <p>
         * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
         *
         * @param openMode the value to set
         * @return this builder
         **/
        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRefreshableAutonomousDatabaseCloneDetails build() {
            CreateRefreshableAutonomousDatabaseCloneDetails model =
                    new CreateRefreshableAutonomousDatabaseCloneDetails(
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
                            this.secretId,
                            this.secretVersionNumber,
                            this.sourceId,
                            this.refreshableMode,
                            this.autoRefreshFrequencyInSeconds,
                            this.autoRefreshPointLagInSeconds,
                            this.timeOfAutoRefreshStart,
                            this.openMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRefreshableAutonomousDatabaseCloneDetails model) {
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
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersionNumber")) {
                this.secretVersionNumber(model.getSecretVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("refreshableMode")) {
                this.refreshableMode(model.getRefreshableMode());
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
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateRefreshableAutonomousDatabaseCloneDetails(
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
            String secretId,
            Integer secretVersionNumber,
            String sourceId,
            RefreshableMode refreshableMode,
            Integer autoRefreshFrequencyInSeconds,
            Integer autoRefreshPointLagInSeconds,
            java.util.Date timeOfAutoRefreshStart,
            OpenMode openMode) {
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
                secretId,
                secretVersionNumber);
        this.sourceId = sourceId;
        this.refreshableMode = refreshableMode;
        this.autoRefreshFrequencyInSeconds = autoRefreshFrequencyInSeconds;
        this.autoRefreshPointLagInSeconds = autoRefreshPointLagInSeconds;
        this.timeOfAutoRefreshStart = timeOfAutoRefreshStart;
        this.openMode = openMode;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that you will clone to create a new Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that you will clone to create a new Autonomous Database.
     * @return the value
     **/
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    public enum RefreshableMode {
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
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
    private final RefreshableMode refreshableMode;

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     * @return the value
     **/
    public RefreshableMode getRefreshableMode() {
        return refreshableMode;
    }

    /**
     * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled by the {@code timeOfAutoRefreshStart} parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshFrequencyInSeconds")
    private final Integer autoRefreshFrequencyInSeconds;

    /**
     * The frequency a refreshable clone is refreshed after auto-refresh is enabled. The minimum is 1 hour. The maximum is 7 days. The date and time that auto-refresh is enabled is controlled by the {@code timeOfAutoRefreshStart} parameter.
     * @return the value
     **/
    public Integer getAutoRefreshFrequencyInSeconds() {
        return autoRefreshFrequencyInSeconds;
    }

    /**
     * The time, in seconds, the data of the refreshable clone lags the primary database at the point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available timestamp). The maximum is 7 days. The lag time increases after refreshing until the next data refresh happens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoRefreshPointLagInSeconds")
    private final Integer autoRefreshPointLagInSeconds;

    /**
     * The time, in seconds, the data of the refreshable clone lags the primary database at the point of refresh. The minimum is 0 minutes (0 mins means refresh to the latest available timestamp). The maximum is 7 days. The lag time increases after refreshing until the next data refresh happens.
     * @return the value
     **/
    public Integer getAutoRefreshPointLagInSeconds() {
        return autoRefreshPointLagInSeconds;
    }

    /**
     * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable clone. This value controls only the start time for the first refresh operation. Subsequent (ongoing) refresh operations have start times controlled by the value of the {@code autoRefreshFrequencyInSeconds} parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAutoRefreshStart")
    private final java.util.Date timeOfAutoRefreshStart;

    /**
     * The the date and time that auto-refreshing will begin for an Autonomous Database refreshable clone. This value controls only the start time for the first refresh operation. Subsequent (ongoing) refresh operations have start times controlled by the value of the {@code autoRefreshFrequencyInSeconds} parameter.
     * @return the value
     **/
    public java.util.Date getTimeOfAutoRefreshStart() {
        return timeOfAutoRefreshStart;
    }

    /**
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or {@code READ_WRITE} mode.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     **/
    public enum OpenMode {
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
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or {@code READ_WRITE} mode.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final OpenMode openMode;

    /**
     * Indicates the Autonomous Database mode. The database can be opened in {@code READ_ONLY} or {@code READ_WRITE} mode.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     **/
    public OpenMode getOpenMode() {
        return openMode;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateRefreshableAutonomousDatabaseCloneDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", refreshableMode=").append(String.valueOf(this.refreshableMode));
        sb.append(", autoRefreshFrequencyInSeconds=")
                .append(String.valueOf(this.autoRefreshFrequencyInSeconds));
        sb.append(", autoRefreshPointLagInSeconds=")
                .append(String.valueOf(this.autoRefreshPointLagInSeconds));
        sb.append(", timeOfAutoRefreshStart=").append(String.valueOf(this.timeOfAutoRefreshStart));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRefreshableAutonomousDatabaseCloneDetails)) {
            return false;
        }

        CreateRefreshableAutonomousDatabaseCloneDetails other =
                (CreateRefreshableAutonomousDatabaseCloneDetails) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.refreshableMode, other.refreshableMode)
                && java.util.Objects.equals(
                        this.autoRefreshFrequencyInSeconds, other.autoRefreshFrequencyInSeconds)
                && java.util.Objects.equals(
                        this.autoRefreshPointLagInSeconds, other.autoRefreshPointLagInSeconds)
                && java.util.Objects.equals(
                        this.timeOfAutoRefreshStart, other.timeOfAutoRefreshStart)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableMode == null ? 43 : this.refreshableMode.hashCode());
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
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        return result;
    }
}
