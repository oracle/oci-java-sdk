/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchDbSystemDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LaunchDbSystemDetails extends LaunchDbSystemBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
        private Integer dataStoragePercentage;

        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = dataStoragePercentage;
            this.__explicitlySet__.add("dataStoragePercentage");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialDataStorageSizeInGB")
        private Integer initialDataStorageSizeInGB;

        public Builder initialDataStorageSizeInGB(Integer initialDataStorageSizeInGB) {
            this.initialDataStorageSizeInGB = initialDataStorageSizeInGB;
            this.__explicitlySet__.add("initialDataStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbHome")
        private CreateDbHomeDetails dbHome;

        public Builder dbHome(CreateDbHomeDetails dbHome) {
            this.dbHome = dbHome;
            this.__explicitlySet__.add("dbHome");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchDbSystemDetails build() {
            LaunchDbSystemDetails __instance__ =
                    new LaunchDbSystemDetails(
                            availabilityDomain,
                            backupSubnetId,
                            clusterName,
                            compartmentId,
                            cpuCoreCount,
                            dataStoragePercentage,
                            definedTags,
                            displayName,
                            domain,
                            freeformTags,
                            hostname,
                            initialDataStorageSizeInGB,
                            nodeCount,
                            shape,
                            sshPublicKeys,
                            subnetId,
                            databaseEdition,
                            dbHome,
                            diskRedundancy,
                            licenseModel);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchDbSystemDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .backupSubnetId(o.getBackupSubnetId())
                            .clusterName(o.getClusterName())
                            .compartmentId(o.getCompartmentId())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .dataStoragePercentage(o.getDataStoragePercentage())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .domain(o.getDomain())
                            .freeformTags(o.getFreeformTags())
                            .hostname(o.getHostname())
                            .initialDataStorageSizeInGB(o.getInitialDataStorageSizeInGB())
                            .nodeCount(o.getNodeCount())
                            .shape(o.getShape())
                            .sshPublicKeys(o.getSshPublicKeys())
                            .subnetId(o.getSubnetId())
                            .databaseEdition(o.getDatabaseEdition())
                            .dbHome(o.getDbHome())
                            .diskRedundancy(o.getDiskRedundancy())
                            .licenseModel(o.getLicenseModel());

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

    @Deprecated
    public LaunchDbSystemDetails(
            String availabilityDomain,
            String backupSubnetId,
            String clusterName,
            String compartmentId,
            Integer cpuCoreCount,
            Integer dataStoragePercentage,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String domain,
            java.util.Map<String, String> freeformTags,
            String hostname,
            Integer initialDataStorageSizeInGB,
            Integer nodeCount,
            String shape,
            java.util.List<String> sshPublicKeys,
            String subnetId,
            DatabaseEdition databaseEdition,
            CreateDbHomeDetails dbHome,
            DiskRedundancy diskRedundancy,
            LicenseModel licenseModel) {
        super(
                availabilityDomain,
                backupSubnetId,
                clusterName,
                compartmentId,
                cpuCoreCount,
                dataStoragePercentage,
                definedTags,
                displayName,
                domain,
                freeformTags,
                hostname,
                initialDataStorageSizeInGB,
                nodeCount,
                shape,
                sshPublicKeys,
                subnetId);
        this.databaseEdition = databaseEdition;
        this.dbHome = dbHome;
        this.diskRedundancy = diskRedundancy;
        this.licenseModel = licenseModel;
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
            throw new RuntimeException("Invalid DatabaseEdition: " + key);
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    DatabaseEdition databaseEdition;

    @com.fasterxml.jackson.annotation.JsonProperty("dbHome")
    CreateDbHomeDetails dbHome;
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
            throw new RuntimeException("Invalid DiskRedundancy: " + key);
        }
    };
    /**
     * The type of redundancy configured for the DB system.
     * Normal is 2-way redundancy, recommended for test and development systems.
     * High is 3-way redundancy, recommended for production systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    DiskRedundancy diskRedundancy;
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
            throw new RuntimeException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to all the databases on the DB system. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    LicenseModel licenseModel;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
