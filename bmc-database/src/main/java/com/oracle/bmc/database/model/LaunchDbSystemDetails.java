/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Used for creating a new DB system. Does not use backups or an existing database for the creation of the initial database.
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
    builder = LaunchDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LaunchDbSystemDetails extends LaunchDbSystemBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
        private java.util.List<String> faultDomains;

        public Builder faultDomains(java.util.List<String> faultDomains) {
            this.faultDomains = faultDomains;
            this.__explicitlySet__.add("faultDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemOptions")
        private DbSystemOptions dbSystemOptions;

        public Builder dbSystemOptions(DbSystemOptions dbSystemOptions) {
            this.dbSystemOptions = dbSystemOptions;
            this.__explicitlySet__.add("dbSystemOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
        private StorageVolumePerformanceMode storageVolumePerformanceMode;

        public Builder storageVolumePerformanceMode(
                StorageVolumePerformanceMode storageVolumePerformanceMode) {
            this.storageVolumePerformanceMode = storageVolumePerformanceMode;
            this.__explicitlySet__.add("storageVolumePerformanceMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sparseDiskgroup")
        private Boolean sparseDiskgroup;

        public Builder sparseDiskgroup(Boolean sparseDiskgroup) {
            this.sparseDiskgroup = sparseDiskgroup;
            this.__explicitlySet__.add("sparseDiskgroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
        private Integer dataStoragePercentage;

        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = dataStoragePercentage;
            this.__explicitlySet__.add("dataStoragePercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialDataStorageSizeInGB")
        private Integer initialDataStorageSizeInGB;

        public Builder initialDataStorageSizeInGB(Integer initialDataStorageSizeInGB) {
            this.initialDataStorageSizeInGB = initialDataStorageSizeInGB;
            this.__explicitlySet__.add("initialDataStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbHome")
        private CreateDbHomeDetails dbHome;

        public Builder dbHome(CreateDbHomeDetails dbHome) {
            this.dbHome = dbHome;
            this.__explicitlySet__.add("dbHome");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
        private DiskRedundancy diskRedundancy;

        public Builder diskRedundancy(DiskRedundancy diskRedundancy) {
            this.diskRedundancy = diskRedundancy;
            this.__explicitlySet__.add("diskRedundancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchDbSystemDetails build() {
            LaunchDbSystemDetails __instance__ =
                    new LaunchDbSystemDetails(
                            compartmentId,
                            faultDomains,
                            displayName,
                            availabilityDomain,
                            subnetId,
                            backupSubnetId,
                            nsgIds,
                            backupNetworkNsgIds,
                            shape,
                            timeZone,
                            dbSystemOptions,
                            storageVolumePerformanceMode,
                            sparseDiskgroup,
                            sshPublicKeys,
                            hostname,
                            domain,
                            cpuCoreCount,
                            clusterName,
                            dataStoragePercentage,
                            initialDataStorageSizeInGB,
                            kmsKeyId,
                            kmsKeyVersionId,
                            nodeCount,
                            freeformTags,
                            definedTags,
                            privateIp,
                            dbHome,
                            databaseEdition,
                            diskRedundancy,
                            licenseModel,
                            maintenanceWindowDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchDbSystemDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .faultDomains(o.getFaultDomains())
                            .displayName(o.getDisplayName())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .subnetId(o.getSubnetId())
                            .backupSubnetId(o.getBackupSubnetId())
                            .nsgIds(o.getNsgIds())
                            .backupNetworkNsgIds(o.getBackupNetworkNsgIds())
                            .shape(o.getShape())
                            .timeZone(o.getTimeZone())
                            .dbSystemOptions(o.getDbSystemOptions())
                            .storageVolumePerformanceMode(o.getStorageVolumePerformanceMode())
                            .sparseDiskgroup(o.getSparseDiskgroup())
                            .sshPublicKeys(o.getSshPublicKeys())
                            .hostname(o.getHostname())
                            .domain(o.getDomain())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .clusterName(o.getClusterName())
                            .dataStoragePercentage(o.getDataStoragePercentage())
                            .initialDataStorageSizeInGB(o.getInitialDataStorageSizeInGB())
                            .kmsKeyId(o.getKmsKeyId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .nodeCount(o.getNodeCount())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .privateIp(o.getPrivateIp())
                            .dbHome(o.getDbHome())
                            .databaseEdition(o.getDatabaseEdition())
                            .diskRedundancy(o.getDiskRedundancy())
                            .licenseModel(o.getLicenseModel())
                            .maintenanceWindowDetails(o.getMaintenanceWindowDetails());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public LaunchDbSystemDetails(
            String compartmentId,
            java.util.List<String> faultDomains,
            String displayName,
            String availabilityDomain,
            String subnetId,
            String backupSubnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String shape,
            String timeZone,
            DbSystemOptions dbSystemOptions,
            StorageVolumePerformanceMode storageVolumePerformanceMode,
            Boolean sparseDiskgroup,
            java.util.List<String> sshPublicKeys,
            String hostname,
            String domain,
            Integer cpuCoreCount,
            String clusterName,
            Integer dataStoragePercentage,
            Integer initialDataStorageSizeInGB,
            String kmsKeyId,
            String kmsKeyVersionId,
            Integer nodeCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String privateIp,
            CreateDbHomeDetails dbHome,
            DatabaseEdition databaseEdition,
            DiskRedundancy diskRedundancy,
            LicenseModel licenseModel,
            MaintenanceWindow maintenanceWindowDetails) {
        super(
                compartmentId,
                faultDomains,
                displayName,
                availabilityDomain,
                subnetId,
                backupSubnetId,
                nsgIds,
                backupNetworkNsgIds,
                shape,
                timeZone,
                dbSystemOptions,
                storageVolumePerformanceMode,
                sparseDiskgroup,
                sshPublicKeys,
                hostname,
                domain,
                cpuCoreCount,
                clusterName,
                dataStoragePercentage,
                initialDataStorageSizeInGB,
                kmsKeyId,
                kmsKeyVersionId,
                nodeCount,
                freeformTags,
                definedTags,
                privateIp);
        this.dbHome = dbHome;
        this.databaseEdition = databaseEdition;
        this.diskRedundancy = diskRedundancy;
        this.licenseModel = licenseModel;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbHome")
    private final CreateDbHomeDetails dbHome;

    public CreateDbHomeDetails getDbHome() {
        return dbHome;
    }

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     **/
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DatabaseEdition: " + key);
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The type of redundancy configured for the DB system.
     * Normal is 2-way redundancy, recommended for test and development systems.
     * High is 3-way redundancy, recommended for production systems.
     *
     **/
    public enum DiskRedundancy {
        High("HIGH"),
        Normal("NORMAL"),
        ;

        private final String value;
        private static java.util.Map<String, DiskRedundancy> map;

        static {
            map = new java.util.HashMap<>();
            for (DiskRedundancy v : DiskRedundancy.values()) {
                map.put(v.getValue(), v);
            }
        }

        DiskRedundancy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiskRedundancy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DiskRedundancy: " + key);
        }
    };
    /**
     * The type of redundancy configured for the DB system.
     * Normal is 2-way redundancy, recommended for test and development systems.
     * High is 3-way redundancy, recommended for production systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    private final DiskRedundancy diskRedundancy;

    public DiskRedundancy getDiskRedundancy() {
        return diskRedundancy;
    }

    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is LICENSE_INCLUDED.
     *
     **/
    public enum LicenseModel {
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
     * The Oracle license model that applies to all the databases on the DB system. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LaunchDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", dbHome=").append(String.valueOf(this.dbHome));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", diskRedundancy=").append(String.valueOf(this.diskRedundancy));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchDbSystemDetails)) {
            return false;
        }

        LaunchDbSystemDetails other = (LaunchDbSystemDetails) o;
        return java.util.Objects.equals(this.dbHome, other.dbHome)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.diskRedundancy, other.diskRedundancy)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbHome == null ? 43 : this.dbHome.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.diskRedundancy == null ? 43 : this.diskRedundancy.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
