/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Autonomous Data Guard association for an existing Autonomous Database where the standby is in a different (remote) region from the source primary database.
 * *IMPORTANT*
 * Note the following for creating standby databases in cross-region Autonomous Data Guard associations:
 *   - To create your standby database in a region different from the region of the primary, use the API endpoint of the region in which the standby will be located. For example, if the primary database is in the IAD region, and you want to create the standby in the PHX region, make the API call using the PHX endpoint (https://database.us-phoenix-1.oraclecloud.com). See [API Endpoints](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#REST_APIs) for the list of Database Service API endpoints.
 *   - In the request to create the standby database, the {@code sourceId} value should be the OCID of the primary database.
 * The following parameters are required for the cross-region standby database and must contain the same values as the source Autonomous Database:
 *   - dbName
 *   - cpuCoreCount
 *   - dataStorageSizeInTB
 *   - dbVersion
 * The following parameters are optional for the cross-region standby database. If included in the request, these parameters contain the same values as the source Autonomous Database:
 *   - customerContacts
 *   - scheduledOperations
 *   - isAutoScalingForStorageEnabled
 *   - definedTags
 *   - freeformTags
 *   - licenseModel
 *   - whitelistedIps
 *   - isMtlsConnectionRequired
 * Example I - Creating a cross-region standby with required parameters only, with OCPU:
 *     {@code {
 *       "compartmentId": "ocid.compartment.oc1..<var>&lt;unique_ID&gt;</var>",
 *       "cpuCoreCount": 1,
 *       "dbName": "adatabasedb1",
 *       "sourceId": "ocid1.autonomousdatabase.oc1.phx..<var>&lt;unique_ID&gt;</var>",
 *       "dataStorageSizeInTBs": 1,
 *       "source": "CROSS_REGION_DATAGUARD",
 *       "adminPassword" : "<var>&lt;password&gt;</var>",
 *     }}
 * Example II - Creating a cross-region standby that specifies optional parameters in addition to the required parameters, with ECPU:
 *     {@code {
 *       "compartmentId": "ocid.compartment.oc1..<var>&lt;unique_ID&gt;</var>",
 *       "computeModel": "ECPU",
 *       "computeCount": 2,
 *       "dbName": "adatabasedb1",
 *       "sourceId": "ocid1.autonomousdatabase.oc1.phx..<var>&lt;unique_ID&gt;</var>",
 *       "dataStorageSizeInTBs": 1,
 *       "source": "CROSS_REGION_DATAGUARD",
 *       "adminPassword" : "<var>&lt;password&gt;</var>",
 *       "dbVersion": "19c",
 *       "licenseModel": "LICENSE_INCLUDED",
 *       "isAutoScalingForStorageEnabled": "true"
 *     }}
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
    builder = CreateCrossRegionAutonomousDatabaseDataGuardDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCrossRegionAutonomousDatabaseDataGuardDetails
        extends CreateAutonomousDatabaseBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
        private Integer maxCpuCoreCount;

        public Builder maxCpuCoreCount(Integer maxCpuCoreCount) {
            this.maxCpuCoreCount = maxCpuCoreCount;
            this.__explicitlySet__.add("maxCpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

        public Builder databaseEdition(AutonomousDatabaseSummary.DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that will be used to create a new standby database for the Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that will be used to create a new standby database for the Data Guard association.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCrossRegionAutonomousDatabaseDataGuardDetails build() {
            CreateCrossRegionAutonomousDatabaseDataGuardDetails model =
                    new CreateCrossRegionAutonomousDatabaseDataGuardDetails(
                            this.compartmentId,
                            this.characterSet,
                            this.ncharacterSet,
                            this.dbName,
                            this.cpuCoreCount,
                            this.ocpuCount,
                            this.dbWorkload,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.isFreeTier,
                            this.kmsKeyId,
                            this.vaultId,
                            this.adminPassword,
                            this.displayName,
                            this.licenseModel,
                            this.isPreviewVersionWithServiceTermsAccepted,
                            this.isAutoScalingEnabled,
                            this.isDedicated,
                            this.autonomousContainerDatabaseId,
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
                            this.dbVersion,
                            this.customerContacts,
                            this.isMtlsConnectionRequired,
                            this.autonomousMaintenanceScheduleType,
                            this.scheduledOperations,
                            this.isAutoScalingForStorageEnabled,
                            this.maxCpuCoreCount,
                            this.databaseEdition,
                            this.sourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCrossRegionAutonomousDatabaseDataGuardDetails model) {
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
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("isPreviewVersionWithServiceTermsAccepted")) {
                this.isPreviewVersionWithServiceTermsAccepted(
                        model.getIsPreviewVersionWithServiceTermsAccepted());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDedicated")) {
                this.isDedicated(model.getIsDedicated());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseId")) {
                this.autonomousContainerDatabaseId(model.getAutonomousContainerDatabaseId());
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
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
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
            if (model.wasPropertyExplicitlySet("maxCpuCoreCount")) {
                this.maxCpuCoreCount(model.getMaxCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
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
    public CreateCrossRegionAutonomousDatabaseDataGuardDetails(
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbName,
            Integer cpuCoreCount,
            Float ocpuCount,
            DbWorkload dbWorkload,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            Boolean isFreeTier,
            String kmsKeyId,
            String vaultId,
            String adminPassword,
            String displayName,
            LicenseModel licenseModel,
            Boolean isPreviewVersionWithServiceTermsAccepted,
            Boolean isAutoScalingEnabled,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
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
            String dbVersion,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            Integer maxCpuCoreCount,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition,
            String sourceId) {
        super(
                compartmentId,
                characterSet,
                ncharacterSet,
                dbName,
                cpuCoreCount,
                ocpuCount,
                dbWorkload,
                dataStorageSizeInTBs,
                dataStorageSizeInGBs,
                isFreeTier,
                kmsKeyId,
                vaultId,
                adminPassword,
                displayName,
                licenseModel,
                isPreviewVersionWithServiceTermsAccepted,
                isAutoScalingEnabled,
                isDedicated,
                autonomousContainerDatabaseId,
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
                dbVersion,
                customerContacts,
                isMtlsConnectionRequired,
                autonomousMaintenanceScheduleType,
                scheduledOperations,
                isAutoScalingForStorageEnabled,
                maxCpuCoreCount,
                databaseEdition);
        this.sourceId = sourceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that will be used to create a new standby database for the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source Autonomous Database that will be used to create a new standby database for the Data Guard association.
     * @return the value
     **/
    public String getSourceId() {
        return sourceId;
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
        sb.append("CreateCrossRegionAutonomousDatabaseDataGuardDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCrossRegionAutonomousDatabaseDataGuardDetails)) {
            return false;
        }

        CreateCrossRegionAutonomousDatabaseDataGuardDetails other =
                (CreateCrossRegionAutonomousDatabaseDataGuardDetails) o;
        return java.util.Objects.equals(this.sourceId, other.sourceId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        return result;
    }
}
