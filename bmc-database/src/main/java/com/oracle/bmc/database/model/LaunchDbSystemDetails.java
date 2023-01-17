/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Used for creating a new DB system. Does not use backups or an existing database for the creation
 * of the initial database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LaunchDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbHome")
        private CreateDbHomeDetails dbHome;

        public Builder dbHome(CreateDbHomeDetails dbHome) {
            this.dbHome = dbHome;
            this.__explicitlySet__.add("dbHome");
            return this;
        }
        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
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
         * The type of redundancy configured for the DB system. Normal is 2-way redundancy,
         * recommended for test and development systems. High is 3-way redundancy, recommended for
         * production systems.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
        private DiskRedundancy diskRedundancy;

        /**
         * The type of redundancy configured for the DB system. Normal is 2-way redundancy,
         * recommended for test and development systems. High is 3-way redundancy, recommended for
         * production systems.
         *
         * @param diskRedundancy the value to set
         * @return this builder
         */
        public Builder diskRedundancy(DiskRedundancy diskRedundancy) {
            this.diskRedundancy = diskRedundancy;
            this.__explicitlySet__.add("diskRedundancy");
            return this;
        }
        /**
         * The Oracle license model that applies to all the databases on the DB system. The default
         * is LICENSE_INCLUDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to all the databases on the DB system. The default
         * is LICENSE_INCLUDED.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
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
            LaunchDbSystemDetails model =
                    new LaunchDbSystemDetails(
                            this.compartmentId,
                            this.faultDomains,
                            this.displayName,
                            this.availabilityDomain,
                            this.subnetId,
                            this.backupSubnetId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.shape,
                            this.timeZone,
                            this.dbSystemOptions,
                            this.storageVolumePerformanceMode,
                            this.sparseDiskgroup,
                            this.sshPublicKeys,
                            this.hostname,
                            this.domain,
                            this.cpuCoreCount,
                            this.clusterName,
                            this.dataStoragePercentage,
                            this.initialDataStorageSizeInGB,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.nodeCount,
                            this.freeformTags,
                            this.definedTags,
                            this.privateIp,
                            this.dataCollectionOptions,
                            this.dbHome,
                            this.databaseEdition,
                            this.diskRedundancy,
                            this.licenseModel,
                            this.maintenanceWindowDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("faultDomains")) {
                this.faultDomains(model.getFaultDomains());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("backupSubnetId")) {
                this.backupSubnetId(model.getBackupSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("dbSystemOptions")) {
                this.dbSystemOptions(model.getDbSystemOptions());
            }
            if (model.wasPropertyExplicitlySet("storageVolumePerformanceMode")) {
                this.storageVolumePerformanceMode(model.getStorageVolumePerformanceMode());
            }
            if (model.wasPropertyExplicitlySet("sparseDiskgroup")) {
                this.sparseDiskgroup(model.getSparseDiskgroup());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("dataStoragePercentage")) {
                this.dataStoragePercentage(model.getDataStoragePercentage());
            }
            if (model.wasPropertyExplicitlySet("initialDataStorageSizeInGB")) {
                this.initialDataStorageSizeInGB(model.getInitialDataStorageSizeInGB());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("dbHome")) {
                this.dbHome(model.getDbHome());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("diskRedundancy")) {
                this.diskRedundancy(model.getDiskRedundancy());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
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
            DataCollectionOptions dataCollectionOptions,
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
                privateIp,
                dataCollectionOptions);
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
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The type of redundancy configured for the DB system. Normal is 2-way redundancy, recommended
     * for test and development systems. High is 3-way redundancy, recommended for production
     * systems.
     */
    public enum DiskRedundancy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The type of redundancy configured for the DB system. Normal is 2-way redundancy, recommended
     * for test and development systems. High is 3-way redundancy, recommended for production
     * systems.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    private final DiskRedundancy diskRedundancy;

    /**
     * The type of redundancy configured for the DB system. Normal is 2-way redundancy, recommended
     * for test and development systems. High is 3-way redundancy, recommended for production
     * systems.
     *
     * @return the value
     */
    public DiskRedundancy getDiskRedundancy() {
        return diskRedundancy;
    }

    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is
     * LICENSE_INCLUDED.
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
     * The Oracle license model that applies to all the databases on the DB system. The default is
     * LICENSE_INCLUDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is
     * LICENSE_INCLUDED.
     *
     * @return the value
     */
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
        sb.append("LaunchDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbHome=").append(String.valueOf(this.dbHome));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", diskRedundancy=").append(String.valueOf(this.diskRedundancy));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
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
                && super.equals(other);
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
        return result;
    }
}
