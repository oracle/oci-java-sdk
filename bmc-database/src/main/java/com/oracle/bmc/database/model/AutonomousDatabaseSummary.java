/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle Autonomous Database.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousDatabaseSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyLifecycleDetails")
        private String kmsKeyLifecycleDetails;

        public Builder kmsKeyLifecycleDetails(String kmsKeyLifecycleDetails) {
            this.kmsKeyLifecycleDetails = kmsKeyLifecycleDetails;
            this.__explicitlySet__.add("kmsKeyLifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReclamationOfFreeAutonomousDatabase")
        private java.util.Date timeReclamationOfFreeAutonomousDatabase;

        public Builder timeReclamationOfFreeAutonomousDatabase(
                java.util.Date timeReclamationOfFreeAutonomousDatabase) {
            this.timeReclamationOfFreeAutonomousDatabase = timeReclamationOfFreeAutonomousDatabase;
            this.__explicitlySet__.add("timeReclamationOfFreeAutonomousDatabase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionOfFreeAutonomousDatabase")
        private java.util.Date timeDeletionOfFreeAutonomousDatabase;

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

        @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
        private java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;

        public Builder keyHistoryEntry(
                java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry) {
            this.keyHistoryEntry = keyHistoryEntry;
            this.__explicitlySet__.add("keyHistoryEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
        private String serviceConsoleUrl;

        public Builder serviceConsoleUrl(String serviceConsoleUrl) {
            this.serviceConsoleUrl = serviceConsoleUrl;
            this.__explicitlySet__.add("serviceConsoleUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private AutonomousDatabaseConnectionStrings connectionStrings;

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

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInTBs")
        private Integer usedDataStorageSizeInTBs;

        public Builder usedDataStorageSizeInTBs(Integer usedDataStorageSizeInTBs) {
            this.usedDataStorageSizeInTBs = usedDataStorageSizeInTBs;
            this.__explicitlySet__.add("usedDataStorageSizeInTBs");
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

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private String privateEndpoint;

        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
        private String privateEndpointLabel;

        public Builder privateEndpointLabel(String privateEndpointLabel) {
            this.privateEndpointLabel = privateEndpointLabel;
            this.__explicitlySet__.add("privateEndpointLabel");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isPreview")
        private Boolean isPreview;

        public Builder isPreview(Boolean isPreview) {
            this.isPreview = isPreview;
            this.__explicitlySet__.add("isPreview");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
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

        @com.fasterxml.jackson.annotation.JsonProperty("apexDetails")
        private AutonomousDatabaseApex apexDetails;

        public Builder apexDetails(AutonomousDatabaseApex apexDetails) {
            this.apexDetails = apexDetails;
            this.__explicitlySet__.add("apexDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataSafeStatus")
        private DataSafeStatus dataSafeStatus;

        public Builder dataSafeStatus(DataSafeStatus dataSafeStatus) {
            this.dataSafeStatus = dataSafeStatus;
            this.__explicitlySet__.add("dataSafeStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
        private OperationsInsightsStatus operationsInsightsStatus;

        public Builder operationsInsightsStatus(OperationsInsightsStatus operationsInsightsStatus) {
            this.operationsInsightsStatus = operationsInsightsStatus;
            this.__explicitlySet__.add("operationsInsightsStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
        private DatabaseManagementStatus databaseManagementStatus;

        public Builder databaseManagementStatus(DatabaseManagementStatus databaseManagementStatus) {
            this.databaseManagementStatus = databaseManagementStatus;
            this.__explicitlySet__.add("databaseManagementStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceBegin")
        private java.util.Date timeMaintenanceBegin;

        public Builder timeMaintenanceBegin(java.util.Date timeMaintenanceBegin) {
            this.timeMaintenanceBegin = timeMaintenanceBegin;
            this.__explicitlySet__.add("timeMaintenanceBegin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceEnd")
        private java.util.Date timeMaintenanceEnd;

        public Builder timeMaintenanceEnd(java.util.Date timeMaintenanceEnd) {
            this.timeMaintenanceEnd = timeMaintenanceEnd;
            this.__explicitlySet__.add("timeMaintenanceEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
        private Boolean isRefreshableClone;

        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            this.__explicitlySet__.add("isRefreshableClone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefresh")
        private java.util.Date timeOfLastRefresh;

        public Builder timeOfLastRefresh(java.util.Date timeOfLastRefresh) {
            this.timeOfLastRefresh = timeOfLastRefresh;
            this.__explicitlySet__.add("timeOfLastRefresh");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefreshPoint")
        private java.util.Date timeOfLastRefreshPoint;

        public Builder timeOfLastRefreshPoint(java.util.Date timeOfLastRefreshPoint) {
            this.timeOfLastRefreshPoint = timeOfLastRefreshPoint;
            this.__explicitlySet__.add("timeOfLastRefreshPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRefresh")
        private java.util.Date timeOfNextRefresh;

        public Builder timeOfNextRefresh(java.util.Date timeOfNextRefresh) {
            this.timeOfNextRefresh = timeOfNextRefresh;
            this.__explicitlySet__.add("timeOfNextRefresh");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshableStatus")
        private RefreshableStatus refreshableStatus;

        public Builder refreshableStatus(RefreshableStatus refreshableStatus) {
            this.refreshableStatus = refreshableStatus;
            this.__explicitlySet__.add("refreshableStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
        private RefreshableMode refreshableMode;

        public Builder refreshableMode(RefreshableMode refreshableMode) {
            this.refreshableMode = refreshableMode;
            this.__explicitlySet__.add("refreshableMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
        private PermissionLevel permissionLevel;

        public Builder permissionLevel(PermissionLevel permissionLevel) {
            this.permissionLevel = permissionLevel;
            this.__explicitlySet__.add("permissionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSwitchover")
        private java.util.Date timeOfLastSwitchover;

        public Builder timeOfLastSwitchover(java.util.Date timeOfLastSwitchover) {
            this.timeOfLastSwitchover = timeOfLastSwitchover;
            this.__explicitlySet__.add("timeOfLastSwitchover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastFailover")
        private java.util.Date timeOfLastFailover;

        public Builder timeOfLastFailover(java.util.Date timeOfLastFailover) {
            this.timeOfLastFailover = timeOfLastFailover;
            this.__explicitlySet__.add("timeOfLastFailover");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedDataRecoveryInSeconds")
        private Integer failedDataRecoveryInSeconds;

        public Builder failedDataRecoveryInSeconds(Integer failedDataRecoveryInSeconds) {
            this.failedDataRecoveryInSeconds = failedDataRecoveryInSeconds;
            this.__explicitlySet__.add("failedDataRecoveryInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standbyDb")
        private AutonomousDatabaseStandbySummary standbyDb;

        public Builder standbyDb(AutonomousDatabaseStandbySummary standbyDb) {
            this.standbyDb = standbyDb;
            this.__explicitlySet__.add("standbyDb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
        private java.util.List<String> availableUpgradeVersions;

        public Builder availableUpgradeVersions(java.util.List<String> availableUpgradeVersions) {
            this.availableUpgradeVersions = availableUpgradeVersions;
            this.__explicitlySet__.add("availableUpgradeVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
        private String keyStoreWalletName;

        public Builder keyStoreWalletName(String keyStoreWalletName) {
            this.keyStoreWalletName = keyStoreWalletName;
            this.__explicitlySet__.add("keyStoreWalletName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedRegionsToCloneTo")
        private java.util.List<String> supportedRegionsToCloneTo;

        public Builder supportedRegionsToCloneTo(java.util.List<String> supportedRegionsToCloneTo) {
            this.supportedRegionsToCloneTo = supportedRegionsToCloneTo;
            this.__explicitlySet__.add("supportedRegionsToCloneTo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLocalDataGuardEnabled")
        private java.util.Date timeLocalDataGuardEnabled;

        public Builder timeLocalDataGuardEnabled(java.util.Date timeLocalDataGuardEnabled) {
            this.timeLocalDataGuardEnabled = timeLocalDataGuardEnabled;
            this.__explicitlySet__.add("timeLocalDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataguardRegionType")
        private DataguardRegionType dataguardRegionType;

        public Builder dataguardRegionType(DataguardRegionType dataguardRegionType) {
            this.dataguardRegionType = dataguardRegionType;
            this.__explicitlySet__.add("dataguardRegionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
        private java.util.Date timeDataGuardRoleChanged;

        public Builder timeDataGuardRoleChanged(java.util.Date timeDataGuardRoleChanged) {
            this.timeDataGuardRoleChanged = timeDataGuardRoleChanged;
            this.__explicitlySet__.add("timeDataGuardRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbIds")
        private java.util.List<String> peerDbIds;

        public Builder peerDbIds(java.util.List<String> peerDbIds) {
            this.peerDbIds = peerDbIds;
            this.__explicitlySet__.add("peerDbIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReconnectCloneEnabled")
        private Boolean isReconnectCloneEnabled;

        public Builder isReconnectCloneEnabled(Boolean isReconnectCloneEnabled) {
            this.isReconnectCloneEnabled = isReconnectCloneEnabled;
            this.__explicitlySet__.add("isReconnectCloneEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUntilReconnectCloneEnabled")
        private java.util.Date timeUntilReconnectCloneEnabled;

        public Builder timeUntilReconnectCloneEnabled(
                java.util.Date timeUntilReconnectCloneEnabled) {
            this.timeUntilReconnectCloneEnabled = timeUntilReconnectCloneEnabled;
            this.__explicitlySet__.add("timeUntilReconnectCloneEnabled");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseSummary build() {
            AutonomousDatabaseSummary __instance__ =
                    new AutonomousDatabaseSummary(
                            id,
                            compartmentId,
                            lifecycleState,
                            lifecycleDetails,
                            kmsKeyId,
                            vaultId,
                            kmsKeyLifecycleDetails,
                            kmsKeyVersionId,
                            dbName,
                            isFreeTier,
                            systemTags,
                            timeReclamationOfFreeAutonomousDatabase,
                            timeDeletionOfFreeAutonomousDatabase,
                            backupConfig,
                            keyHistoryEntry,
                            cpuCoreCount,
                            ocpuCount,
                            dataStorageSizeInTBs,
                            dataStorageSizeInGBs,
                            infrastructureType,
                            isDedicated,
                            autonomousContainerDatabaseId,
                            timeCreated,
                            displayName,
                            serviceConsoleUrl,
                            connectionStrings,
                            connectionUrls,
                            licenseModel,
                            usedDataStorageSizeInTBs,
                            freeformTags,
                            definedTags,
                            subnetId,
                            nsgIds,
                            privateEndpoint,
                            privateEndpointLabel,
                            privateEndpointIp,
                            dbVersion,
                            isPreview,
                            dbWorkload,
                            isAccessControlEnabled,
                            whitelistedIps,
                            arePrimaryWhitelistedIpsUsed,
                            standbyWhitelistedIps,
                            apexDetails,
                            isAutoScalingEnabled,
                            dataSafeStatus,
                            operationsInsightsStatus,
                            databaseManagementStatus,
                            timeMaintenanceBegin,
                            timeMaintenanceEnd,
                            isRefreshableClone,
                            timeOfLastRefresh,
                            timeOfLastRefreshPoint,
                            timeOfNextRefresh,
                            openMode,
                            refreshableStatus,
                            refreshableMode,
                            sourceId,
                            permissionLevel,
                            timeOfLastSwitchover,
                            timeOfLastFailover,
                            isDataGuardEnabled,
                            failedDataRecoveryInSeconds,
                            standbyDb,
                            role,
                            availableUpgradeVersions,
                            keyStoreId,
                            keyStoreWalletName,
                            supportedRegionsToCloneTo,
                            customerContacts,
                            timeLocalDataGuardEnabled,
                            dataguardRegionType,
                            timeDataGuardRoleChanged,
                            peerDbIds,
                            isMtlsConnectionRequired,
                            isReconnectCloneEnabled,
                            timeUntilReconnectCloneEnabled,
                            autonomousMaintenanceScheduleType,
                            scheduledOperations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .kmsKeyId(o.getKmsKeyId())
                            .vaultId(o.getVaultId())
                            .kmsKeyLifecycleDetails(o.getKmsKeyLifecycleDetails())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .dbName(o.getDbName())
                            .isFreeTier(o.getIsFreeTier())
                            .systemTags(o.getSystemTags())
                            .timeReclamationOfFreeAutonomousDatabase(
                                    o.getTimeReclamationOfFreeAutonomousDatabase())
                            .timeDeletionOfFreeAutonomousDatabase(
                                    o.getTimeDeletionOfFreeAutonomousDatabase())
                            .backupConfig(o.getBackupConfig())
                            .keyHistoryEntry(o.getKeyHistoryEntry())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .ocpuCount(o.getOcpuCount())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .infrastructureType(o.getInfrastructureType())
                            .isDedicated(o.getIsDedicated())
                            .autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId())
                            .timeCreated(o.getTimeCreated())
                            .displayName(o.getDisplayName())
                            .serviceConsoleUrl(o.getServiceConsoleUrl())
                            .connectionStrings(o.getConnectionStrings())
                            .connectionUrls(o.getConnectionUrls())
                            .licenseModel(o.getLicenseModel())
                            .usedDataStorageSizeInTBs(o.getUsedDataStorageSizeInTBs())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .subnetId(o.getSubnetId())
                            .nsgIds(o.getNsgIds())
                            .privateEndpoint(o.getPrivateEndpoint())
                            .privateEndpointLabel(o.getPrivateEndpointLabel())
                            .privateEndpointIp(o.getPrivateEndpointIp())
                            .dbVersion(o.getDbVersion())
                            .isPreview(o.getIsPreview())
                            .dbWorkload(o.getDbWorkload())
                            .isAccessControlEnabled(o.getIsAccessControlEnabled())
                            .whitelistedIps(o.getWhitelistedIps())
                            .arePrimaryWhitelistedIpsUsed(o.getArePrimaryWhitelistedIpsUsed())
                            .standbyWhitelistedIps(o.getStandbyWhitelistedIps())
                            .apexDetails(o.getApexDetails())
                            .isAutoScalingEnabled(o.getIsAutoScalingEnabled())
                            .dataSafeStatus(o.getDataSafeStatus())
                            .operationsInsightsStatus(o.getOperationsInsightsStatus())
                            .databaseManagementStatus(o.getDatabaseManagementStatus())
                            .timeMaintenanceBegin(o.getTimeMaintenanceBegin())
                            .timeMaintenanceEnd(o.getTimeMaintenanceEnd())
                            .isRefreshableClone(o.getIsRefreshableClone())
                            .timeOfLastRefresh(o.getTimeOfLastRefresh())
                            .timeOfLastRefreshPoint(o.getTimeOfLastRefreshPoint())
                            .timeOfNextRefresh(o.getTimeOfNextRefresh())
                            .openMode(o.getOpenMode())
                            .refreshableStatus(o.getRefreshableStatus())
                            .refreshableMode(o.getRefreshableMode())
                            .sourceId(o.getSourceId())
                            .permissionLevel(o.getPermissionLevel())
                            .timeOfLastSwitchover(o.getTimeOfLastSwitchover())
                            .timeOfLastFailover(o.getTimeOfLastFailover())
                            .isDataGuardEnabled(o.getIsDataGuardEnabled())
                            .failedDataRecoveryInSeconds(o.getFailedDataRecoveryInSeconds())
                            .standbyDb(o.getStandbyDb())
                            .role(o.getRole())
                            .availableUpgradeVersions(o.getAvailableUpgradeVersions())
                            .keyStoreId(o.getKeyStoreId())
                            .keyStoreWalletName(o.getKeyStoreWalletName())
                            .supportedRegionsToCloneTo(o.getSupportedRegionsToCloneTo())
                            .customerContacts(o.getCustomerContacts())
                            .timeLocalDataGuardEnabled(o.getTimeLocalDataGuardEnabled())
                            .dataguardRegionType(o.getDataguardRegionType())
                            .timeDataGuardRoleChanged(o.getTimeDataGuardRoleChanged())
                            .peerDbIds(o.getPeerDbIds())
                            .isMtlsConnectionRequired(o.getIsMtlsConnectionRequired())
                            .isReconnectCloneEnabled(o.getIsReconnectCloneEnabled())
                            .timeUntilReconnectCloneEnabled(o.getTimeUntilReconnectCloneEnabled())
                            .autonomousMaintenanceScheduleType(
                                    o.getAutonomousMaintenanceScheduleType())
                            .scheduledOperations(o.getScheduledOperations());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
    /**
     * The current state of the Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
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

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    String vaultId;

    /**
     * KMS key lifecycle details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyLifecycleDetails")
    String kmsKeyLifecycleDetails;

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    String kmsKeyVersionId;

    /**
     * The database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    Boolean isFreeTier;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The date and time the Always Free database will be stopped because of inactivity. If this time is reached without any database activity, the database will automatically be put into the STOPPED state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReclamationOfFreeAutonomousDatabase")
    java.util.Date timeReclamationOfFreeAutonomousDatabase;

    /**
     * The date and time the Always Free database will be automatically deleted because of inactivity. If the database is in the STOPPED state and without activity until this time, it will be deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeletionOfFreeAutonomousDatabase")
    java.util.Date timeDeletionOfFreeAutonomousDatabase;

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    AutonomousDatabaseBackupConfig backupConfig;

    /**
     * Key History Entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
    java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;

    /**
     * The number of OCPU cores to be made available to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The number of OCPU cores to be made available to the database.
     * <p>
     * The following points apply:
     * - For Autonomous Databases on dedicated Exadata infrastructure, to provision less than 1 core, enter a fractional value in an increment of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that fractional OCPU values are not supported for Autonomous Databasese on shared Exadata infrastructure.)
     * - To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores. This applies to Autonomous Databases on both shared and dedicated Exadata infrastructure.
     * <p>
     * For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    Float ocpuCount;

    /**
     * The quantity of data in the database, in terabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    Integer dataStorageSizeInTBs;

    /**
     * The quantity of data in the database, in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;
    /**
     * The infrastructure type this resource belongs to.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InfrastructureType {
        Cloud("CLOUD"),
        CloudAtCustomer("CLOUD_AT_CUSTOMER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The infrastructure type this resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    InfrastructureType infrastructureType;

    /**
     * True if the database uses [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    Boolean isDedicated;

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    String autonomousContainerDatabaseId;

    /**
     * The date and time the Autonomous Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The URL of the Service Console for the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
    String serviceConsoleUrl;

    /**
     * The connection string used to connect to the Autonomous Database. The username for the Service Console is ADMIN. Use the password you entered when creating the Autonomous Database for the password value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    AutonomousDatabaseConnectionStrings connectionStrings;

    @com.fasterxml.jackson.annotation.JsonProperty("connectionUrls")
    AutonomousDatabaseConnectionUrls connectionUrls;
    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    LicenseModel licenseModel;

    /**
     * The amount of storage that has been used, in terabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedDataStorageSizeInTBs")
    Integer usedDataStorageSizeInTBs;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * - For Autonomous Database, setting this will disable public secure access to the database.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and the backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    /**
     * The private endpoint for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    String privateEndpoint;

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    String privateEndpointLabel;

    /**
     * The private endpoint Ip address for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    String privateEndpointIp;

    /**
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;

    /**
     * Indicates if the Autonomous Database version is a preview version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreview")
    Boolean isPreview;
    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    DbWorkload dbWorkload;

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
    Boolean isAccessControlEnabled;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    java.util.List<String> whitelistedIps;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be {@code TRUE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be {@code FALSE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    java.util.List<String> standbyWhitelistedIps;

    /**
     * Information about Oracle APEX Application Development.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apexDetails")
    AutonomousDatabaseApex apexDetails;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    Boolean isAutoScalingEnabled;
    /**
     * Status of the Data Safe registration for this Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DataSafeStatus {
        Registering("REGISTERING"),
        Registered("REGISTERED"),
        Deregistering("DEREGISTERING"),
        NotRegistered("NOT_REGISTERED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Status of the Data Safe registration for this Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataSafeStatus")
    DataSafeStatus dataSafeStatus;
    /**
     * Status of Operations Insights for this Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationsInsightsStatus {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Status of Operations Insights for this Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
    OperationsInsightsStatus operationsInsightsStatus;
    /**
     * Status of Database Management for this Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DatabaseManagementStatus {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Status of Database Management for this Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
    DatabaseManagementStatus databaseManagementStatus;

    /**
     * The date and time when maintenance will begin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceBegin")
    java.util.Date timeMaintenanceBegin;

    /**
     * The date and time when maintenance will end.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceEnd")
    java.util.Date timeMaintenanceEnd;

    /**
     * Indicates whether the Autonomous Database is a refreshable clone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
    Boolean isRefreshableClone;

    /**
     * The date and time when last refresh happened.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefresh")
    java.util.Date timeOfLastRefresh;

    /**
     * The refresh point timestamp (UTC). The refresh point is the time to which the database was most recently refreshed. Data created after the refresh point is not included in the refresh.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastRefreshPoint")
    java.util.Date timeOfLastRefreshPoint;

    /**
     * The date and time of next refresh.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfNextRefresh")
    java.util.Date timeOfNextRefresh;
    /**
     * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OpenMode {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    OpenMode openMode;
    /**
     * The refresh status of the clone. REFRESHING indicates that the clone is currently being refreshed with data from the source Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RefreshableStatus {
        Refreshing("REFRESHING"),
        NotRefreshing("NOT_REFRESHING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The refresh status of the clone. REFRESHING indicates that the clone is currently being refreshed with data from the source Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableStatus")
    RefreshableStatus refreshableStatus;
    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RefreshableMode {
        Automatic("AUTOMATIC"),
        Manual("MANUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
    RefreshableMode refreshableMode;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that was cloned to create the current Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;
    /**
     * The Autonomous Database permission level. Restricted mode allows access only to admin users.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PermissionLevel {
        Restricted("RESTRICTED"),
        Unrestricted("UNRESTRICTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The Autonomous Database permission level. Restricted mode allows access only to admin users.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
    PermissionLevel permissionLevel;

    /**
     * The timestamp of the last switchover operation for the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastSwitchover")
    java.util.Date timeOfLastSwitchover;

    /**
     * The timestamp of the last failover operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastFailover")
    java.util.Date timeOfLastFailover;

    /**
     * Indicates whether the Autonomous Database has Data Guard enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    Boolean isDataGuardEnabled;

    /**
     * Indicates the number of seconds of data loss for a Data Guard failover.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedDataRecoveryInSeconds")
    Integer failedDataRecoveryInSeconds;

    @com.fasterxml.jackson.annotation.JsonProperty("standbyDb")
    AutonomousDatabaseStandbySummary standbyDb;
    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Role {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if Autonomous Data Guard is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    Role role;

    /**
     * List of Oracle Database versions available for a database upgrade. If there are no version upgrades available, this list is empty.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
    java.util.List<String> availableUpgradeVersions;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    String keyStoreId;

    /**
     * The wallet name for Oracle Key Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
    String keyStoreWalletName;

    /**
     * The list of regions that support the creation of Autonomous Data Guard standby database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedRegionsToCloneTo")
    java.util.List<String> supportedRegionsToCloneTo;

    /**
     * Customer Contacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    java.util.List<CustomerContact> customerContacts;

    /**
     * The date and time that Autonomous Data Guard was enabled for an Autonomous Database where the standby was provisioned in the same region as the primary database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLocalDataGuardEnabled")
    java.util.Date timeLocalDataGuardEnabled;
    /**
     * The Autonomous Data Guard region type of the Autonomous Database. For Autonomous Databases on shared Exadata infrastructure, Data Guard associations have designated primary and standby regions, and these region types do not change when the database changes roles. The standby regions in Data Guard associations can be the same region designated as the primary region, or they can be remote regions. Certain database administrative operations may be available only in the primary region of the Data Guard association, and cannot be performed when the database using the "primary" role is operating in a remote Data Guard standby region.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DataguardRegionType {
        PrimaryDgRegion("PRIMARY_DG_REGION"),
        RemoteStandbyDgRegion("REMOTE_STANDBY_DG_REGION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The Autonomous Data Guard region type of the Autonomous Database. For Autonomous Databases on shared Exadata infrastructure, Data Guard associations have designated primary and standby regions, and these region types do not change when the database changes roles. The standby regions in Data Guard associations can be the same region designated as the primary region, or they can be remote regions. Certain database administrative operations may be available only in the primary region of the Data Guard association, and cannot be performed when the database using the "primary" role is operating in a remote Data Guard standby region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataguardRegionType")
    DataguardRegionType dataguardRegionType;

    /**
     * The date and time the Autonomous Data Guard role was switched for the Autonomous Database. For databases that have standbys in both the primary Data Guard region and a remote Data Guard standby region, this is the latest timestamp of either the database using the "primary" role in the primary Data Guard region, or database located in the remote Data Guard standby region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataGuardRoleChanged")
    java.util.Date timeDataGuardRoleChanged;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of standby databases located in Autonomous Data Guard remote regions that are associated with the source database. Note that for shared Exadata infrastructure, standby databases located in the same region as the source primary database do not have OCIDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbIds")
    java.util.List<String> peerDbIds;

    /**
     * Indicates whether the Autonomous Database requires mTLS connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    Boolean isMtlsConnectionRequired;

    /**
     * Indicates if the refreshable clone can be reconnected to its source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReconnectCloneEnabled")
    Boolean isReconnectCloneEnabled;

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2022-01-01T12:00:00.000Z, to set the limit for a refreshable clone to be reconnected to its source database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUntilReconnectCloneEnabled")
    java.util.Date timeUntilReconnectCloneEnabled;
    /**
     * The maintenance schedule type of the Autonomous Database on shared Exadata infrastructure. The EARLY maintenance schedule of this Autonomous Database
     * follows a schedule that applies patches prior to the REGULAR schedule.The REGULAR maintenance schedule of this Autonomous Database follows the normal cycle.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AutonomousMaintenanceScheduleType {
        Early("EARLY"),
        Regular("REGULAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The maintenance schedule type of the Autonomous Database on shared Exadata infrastructure. The EARLY maintenance schedule of this Autonomous Database
     * follows a schedule that applies patches prior to the REGULAR schedule.The REGULAR maintenance schedule of this Autonomous Database follows the normal cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
    AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

    /**
     * list of scheduled operations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
    java.util.List<ScheduledOperationDetails> scheduledOperations;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
