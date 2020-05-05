/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
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

        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
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

        @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
        private java.util.List<String> availableUpgradeVersions;

        public Builder availableUpgradeVersions(java.util.List<String> availableUpgradeVersions) {
            this.availableUpgradeVersions = availableUpgradeVersions;
            this.__explicitlySet__.add("availableUpgradeVersions");
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
                            dbName,
                            isFreeTier,
                            systemTags,
                            timeReclamationOfFreeAutonomousDatabase,
                            timeDeletionOfFreeAutonomousDatabase,
                            cpuCoreCount,
                            dataStorageSizeInTBs,
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
                            dbVersion,
                            isPreview,
                            dbWorkload,
                            whitelistedIps,
                            isAutoScalingEnabled,
                            dataSafeStatus,
                            timeMaintenanceBegin,
                            timeMaintenanceEnd,
                            availableUpgradeVersions);
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
                            .dbName(o.getDbName())
                            .isFreeTier(o.getIsFreeTier())
                            .systemTags(o.getSystemTags())
                            .timeReclamationOfFreeAutonomousDatabase(
                                    o.getTimeReclamationOfFreeAutonomousDatabase())
                            .timeDeletionOfFreeAutonomousDatabase(
                                    o.getTimeDeletionOfFreeAutonomousDatabase())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
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
                            .dbVersion(o.getDbVersion())
                            .isPreview(o.getIsPreview())
                            .dbWorkload(o.getDbWorkload())
                            .whitelistedIps(o.getWhitelistedIps())
                            .isAutoScalingEnabled(o.getIsAutoScalingEnabled())
                            .dataSafeStatus(o.getDataSafeStatus())
                            .timeMaintenanceBegin(o.getTimeMaintenanceBegin())
                            .timeMaintenanceEnd(o.getTimeMaintenanceEnd())
                            .availableUpgradeVersions(o.getAvailableUpgradeVersions());

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
        Upgrading("UPGRADING"),

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

    /**
     * The number of OCPU cores to be made available to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The quantity of data in the database, in terabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    Integer dataStorageSizeInTBs;

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
     * The Oracle license model that applies to the Oracle Autonomous Database. Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of `BRING_YOUR_OWN_LICENSE`.
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
     * The Oracle license model that applies to the Oracle Autonomous Database. Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of `BRING_YOUR_OWN_LICENSE`.
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
     * Example: `{\"Department\": \"Finance\"}`
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
     * - For Exadata and virtual machine 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.128.0/20.
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
     * The private endpoint label for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    String privateEndpointLabel;

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
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),

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
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    DbWorkload dbWorkload;

    /**
     * The client IP access control list (ACL). This feature is available for databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) only.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance. This is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * <p>
     * To add the whitelist VCN specific subnet or IP, use a semicoln ';' as a deliminator to add the VCN specific subnets or IPs.
     * Example: `[\"1.1.1.1\",\"1.1.1.0/24\",\"ocid1.vcn.oc1.sea.aaaaaaaard2hfx2nn3e5xeo6j6o62jga44xjizkw\",\"ocid1.vcn.oc1.sea.aaaaaaaard2hfx2nn3e5xeo6j6o62jga44xjizkw;1.1.1.1\",\"ocid1.vcn.oc1.sea.aaaaaaaard2hfx2nn3e5xeo6j6o62jga44xjizkw;1.1.0.0/16\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    java.util.List<String> whitelistedIps;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. Note that auto scaling is available for databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) only.
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
     * List of Oracle Database versions available for a database upgrade. If there are no version upgrades available, this list is empty.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableUpgradeVersions")
    java.util.List<String> availableUpgradeVersions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
