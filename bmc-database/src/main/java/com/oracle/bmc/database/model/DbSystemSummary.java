/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The Database Service supports several types of DB Systems, ranging in size, price, and performance. For details about each type of system, see:
 * <p>
 * - [Exadata DB Systems](https://docs.us-phoenix-1.oraclecloud.com/Content/Database/Concepts/exaoverview.htm)
 * - [Bare Metal or VM DB Systems](https://docs.us-phoenix-1.oraclecloud.com/Content/Database/Concepts/overview.htm)
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * For information about access control and compartments, see
 * [Overview of the Identity Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
 * <p>
 * For information about Availability Domains, see
 * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
 * <p>
 * To get a list of Availability Domains, use the `ListAvailabilityDomains` operation
 * in the Identity Service API.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbSystemSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
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

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
        private String lastPatchHistoryEntryId;

        public Builder lastPatchHistoryEntryId(String lastPatchHistoryEntryId) {
            this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
            this.__explicitlySet__.add("lastPatchHistoryEntryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGB")
        private Integer recoStorageSizeInGB;

        public Builder recoStorageSizeInGB(Integer recoStorageSizeInGB) {
            this.recoStorageSizeInGB = recoStorageSizeInGB;
            this.__explicitlySet__.add("recoStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
        private String scanDnsRecordId;

        public Builder scanDnsRecordId(String scanDnsRecordId) {
            this.scanDnsRecordId = scanDnsRecordId;
            this.__explicitlySet__.add("scanDnsRecordId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
        private java.util.List<String> scanIpIds;

        public Builder scanIpIds(java.util.List<String> scanIpIds) {
            this.scanIpIds = scanIpIds;
            this.__explicitlySet__.add("scanIpIds");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
        private java.util.List<String> vipIds;

        public Builder vipIds(java.util.List<String> vipIds) {
            this.vipIds = vipIds;
            this.__explicitlySet__.add("vipIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemSummary build() {
            DbSystemSummary __instance__ =
                    new DbSystemSummary(
                            availabilityDomain,
                            backupSubnetId,
                            clusterName,
                            compartmentId,
                            cpuCoreCount,
                            dataStoragePercentage,
                            dataStorageSizeInGBs,
                            databaseEdition,
                            diskRedundancy,
                            displayName,
                            domain,
                            hostname,
                            id,
                            lastPatchHistoryEntryId,
                            licenseModel,
                            lifecycleDetails,
                            lifecycleState,
                            listenerPort,
                            nodeCount,
                            recoStorageSizeInGB,
                            scanDnsRecordId,
                            scanIpIds,
                            shape,
                            sshPublicKeys,
                            subnetId,
                            timeCreated,
                            version,
                            vipIds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemSummary o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .backupSubnetId(o.getBackupSubnetId())
                    .clusterName(o.getClusterName())
                    .compartmentId(o.getCompartmentId())
                    .cpuCoreCount(o.getCpuCoreCount())
                    .dataStoragePercentage(o.getDataStoragePercentage())
                    .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                    .databaseEdition(o.getDatabaseEdition())
                    .diskRedundancy(o.getDiskRedundancy())
                    .displayName(o.getDisplayName())
                    .domain(o.getDomain())
                    .hostname(o.getHostname())
                    .id(o.getId())
                    .lastPatchHistoryEntryId(o.getLastPatchHistoryEntryId())
                    .licenseModel(o.getLicenseModel())
                    .lifecycleDetails(o.getLifecycleDetails())
                    .lifecycleState(o.getLifecycleState())
                    .listenerPort(o.getListenerPort())
                    .nodeCount(o.getNodeCount())
                    .recoStorageSizeInGB(o.getRecoStorageSizeInGB())
                    .scanDnsRecordId(o.getScanDnsRecordId())
                    .scanIpIds(o.getScanIpIds())
                    .shape(o.getShape())
                    .sshPublicKeys(o.getSshPublicKeys())
                    .subnetId(o.getSubnetId())
                    .timeCreated(o.getTimeCreated())
                    .version(o.getVersion())
                    .vipIds(o.getVipIds());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the Availability Domain that the DB System is located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the backup network subnet the DB System is associated with. Applicable only to Exadata.
     * <p>
     **Subnet Restriction:** See above subnetId's 'Subnet Restriction'.
     * to malfunction.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    String backupSubnetId;

    /**
     * Cluster name for Exadata and 2-node RAC DB Systems. The cluster name must begin with an an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    String clusterName;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The number of CPU cores enabled on the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 40 and 80.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    Integer dataStoragePercentage;

    /**
     * Data storage size, in GBs, that is currently available to the DB system. This is applicable only for VM-based DBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;
    /**
     * The Oracle Database Edition that applies to all the databases on the DB System.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The Oracle Database Edition that applies to all the databases on the DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    DatabaseEdition databaseEdition;
    /**
     * The type of redundancy configured for the DB System.
     * Normal is 2-way redundancy.
     * High is 3-way redundancy.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DiskRedundancy {
        High("HIGH"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DiskRedundancy> map;

        static {
            map = new java.util.HashMap<>();
            for (DiskRedundancy v : DiskRedundancy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiskRedundancy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of redundancy configured for the DB System.
     * Normal is 2-way redundancy.
     * High is 3-way redundancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    DiskRedundancy diskRedundancy;

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The domain name for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * The host name for the DB Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The OCID of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the last patch history. This is updated as soon as a patch operation is started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
    String lastPatchHistoryEntryId;
    /**
     * The Oracle license model that applies to all the databases on the DB System. The default is LICENSE_INCLUDED.
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
     * The Oracle license model that applies to all the databases on the DB System. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    LicenseModel licenseModel;

    /**
     * Additional information about the current lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;
    /**
     * The current state of the DB System.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

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
     * The current state of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The port number configured for the listener on the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    Integer listenerPort;

    /**
     * Number of nodes in this DB system. For RAC DBs, this will be greater than 1.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    Integer nodeCount;

    /**
     * RECO/REDO storage size, in GBs, that is currently allocated to the DB system. This is applicable only for VM-based DBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGB")
    Integer recoStorageSizeInGB;

    /**
     * The OCID of the DNS record for the SCAN IP addresses that are associated with the DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
    String scanDnsRecordId;

    /**
     * The OCID of the Single Client Access Name (SCAN) IP addresses associated with the DB System.
     * SCAN IP addresses are typically used for load balancing and are not assigned to any interface.
     * Clusterware directs the requests to the appropriate nodes in the cluster.
     * <p>
     * - For a single-node DB System, this list is empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
    java.util.List<String> scanIpIds;

    /**
     * The shape of the DB System. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The public key portion of one or more key pairs used for SSH access to the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    java.util.List<String> sshPublicKeys;

    /**
     * The OCID of the subnet the DB System is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For single node and 2-node (RAC) DB Systems, do not use a subnet that overlaps with 192.168.16.16/28
     * - For Exadata and VM-based RAC DB Systems, do not use a subnet that overlaps with 192.168.128.0/20
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The date and time the DB System was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The version of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * The OCID of the virtual IP (VIP) addresses associated with the DB System.
     * The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the DB System to
     * enable failover. If one node fails, the VIP is reassigned to another active node in the cluster.
     * <p>
     * - For a single-node DB System, this list is empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
    java.util.List<String> vipIds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
