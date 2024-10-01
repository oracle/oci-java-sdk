/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the cloud VM cluster. Applies to Exadata Cloud Service instances only. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CloudVmCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudVmCluster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "iormConfigCache",
        "id",
        "compartmentId",
        "subscriptionId",
        "availabilityDomain",
        "subnetId",
        "backupSubnetId",
        "nsgIds",
        "backupNetworkNsgIds",
        "lastUpdateHistoryEntryId",
        "shape",
        "listenerPort",
        "lifecycleState",
        "nodeCount",
        "storageSizeInGBs",
        "displayName",
        "timeCreated",
        "lifecycleDetails",
        "timeZone",
        "hostname",
        "domain",
        "cpuCoreCount",
        "ocpuCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dataStorageSizeInTBs",
        "dbServers",
        "clusterName",
        "dataStoragePercentage",
        "isLocalBackupEnabled",
        "cloudExadataInfrastructureId",
        "isSparseDiskgroupEnabled",
        "giVersion",
        "systemVersion",
        "sshPublicKeys",
        "licenseModel",
        "diskRedundancy",
        "scanIpIds",
        "vipIds",
        "scanDnsRecordId",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "systemTags",
        "scanDnsName",
        "zoneId",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "dataCollectionOptions",
        "giSoftwareImageId",
        "fileSystemConfigurationDetails"
    })
    public CloudVmCluster(
            ExadataIormConfig iormConfigCache,
            String id,
            String compartmentId,
            String subscriptionId,
            String availabilityDomain,
            String subnetId,
            String backupSubnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String lastUpdateHistoryEntryId,
            String shape,
            Long listenerPort,
            LifecycleState lifecycleState,
            Integer nodeCount,
            Integer storageSizeInGBs,
            String displayName,
            java.util.Date timeCreated,
            String lifecycleDetails,
            String timeZone,
            String hostname,
            String domain,
            Integer cpuCoreCount,
            Float ocpuCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Double dataStorageSizeInTBs,
            java.util.List<String> dbServers,
            String clusterName,
            Integer dataStoragePercentage,
            Boolean isLocalBackupEnabled,
            String cloudExadataInfrastructureId,
            Boolean isSparseDiskgroupEnabled,
            String giVersion,
            String systemVersion,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            DiskRedundancy diskRedundancy,
            java.util.List<String> scanIpIds,
            java.util.List<String> vipIds,
            String scanDnsRecordId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String scanDnsName,
            String zoneId,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            DataCollectionOptions dataCollectionOptions,
            String giSoftwareImageId,
            java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails) {
        super();
        this.iormConfigCache = iormConfigCache;
        this.id = id;
        this.compartmentId = compartmentId;
        this.subscriptionId = subscriptionId;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
        this.shape = shape;
        this.listenerPort = listenerPort;
        this.lifecycleState = lifecycleState;
        this.nodeCount = nodeCount;
        this.storageSizeInGBs = storageSizeInGBs;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.timeZone = timeZone;
        this.hostname = hostname;
        this.domain = domain;
        this.cpuCoreCount = cpuCoreCount;
        this.ocpuCount = ocpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dbServers = dbServers;
        this.clusterName = clusterName;
        this.dataStoragePercentage = dataStoragePercentage;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
        this.giVersion = giVersion;
        this.systemVersion = systemVersion;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.diskRedundancy = diskRedundancy;
        this.scanIpIds = scanIpIds;
        this.vipIds = vipIds;
        this.scanDnsRecordId = scanDnsRecordId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.systemTags = systemTags;
        this.scanDnsName = scanDnsName;
        this.zoneId = zoneId;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.dataCollectionOptions = dataCollectionOptions;
        this.giSoftwareImageId = giSoftwareImageId;
        this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("iormConfigCache")
        private ExadataIormConfig iormConfigCache;

        public Builder iormConfigCache(ExadataIormConfig iormConfigCache) {
            this.iormConfigCache = iormConfigCache;
            this.__explicitlySet__.add("iormConfigCache");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud VM cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The name of the availability domain that the cloud Exadata infrastructure resource is
         * located in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the cloud Exadata infrastructure resource is
         * located in.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the cloud VM cluster.
         *
         * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC systems, do not
         * use a subnet that overlaps with 192.168.128.0/20.
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and backup subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the cloud VM cluster.
         *
         * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC systems, do not
         * use a subnet that overlaps with 192.168.128.0/20.
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and backup subnet.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup network subnet associated with the cloud VM cluster.
         *
         * <p>*Subnet Restriction:** See the subnet restrictions information for **subnetId**.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup network subnet associated with the cloud VM cluster.
         *
         * <p>*Subnet Restriction:** See the subnet restrictions information for **subnetId**.
         *
         * @param backupSubnetId the value to set
         * @return this builder
         */
        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
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
         * A list of the
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all
         * NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * Applicable only to Exadata systems.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network security groups (NSGs) that the backup network of this DB system belongs to.
         * Setting this to an empty array after the list is created removes the resource from all
         * NSGs. For more information about NSGs, see [Security
         * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * Applicable only to Exadata systems.
         *
         * @param backupNetworkNsgIds the value to set
         * @return this builder
         */
        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance update history entry. This value is updated when a maintenance update
         * starts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateHistoryEntryId")
        private String lastUpdateHistoryEntryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance update history entry. This value is updated when a maintenance update
         * starts.
         *
         * @param lastUpdateHistoryEntryId the value to set
         * @return this builder
         */
        public Builder lastUpdateHistoryEntryId(String lastUpdateHistoryEntryId) {
            this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
            this.__explicitlySet__.add("lastUpdateHistoryEntryId");
            return this;
        }
        /** The model name of the Exadata hardware running the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The model name of the Exadata hardware running the cloud VM cluster.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The port number configured for the listener on the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Long listenerPort;

        /**
         * The port number configured for the listener on the cloud VM cluster.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /** The current state of the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the cloud VM cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The number of nodes in the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the cloud VM cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The storage allocation for the disk group, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGBs")
        private Integer storageSizeInGBs;

        /**
         * The storage allocation for the disk group, in gigabytes (GB).
         *
         * @param storageSizeInGBs the value to set
         * @return this builder
         */
        public Builder storageSizeInGBs(Integer storageSizeInGBs) {
            this.storageSizeInGBs = storageSizeInGBs;
            this.__explicitlySet__.add("storageSizeInGBs");
            return this;
        }
        /** The user-friendly name for the cloud VM cluster. The name does not need to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The date and time that the cloud VM cluster was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the cloud VM cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time
         * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time
         * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /** The hostname for the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the cloud VM cluster.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The domain name for the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The domain name for the cloud VM cluster.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /** The number of CPU cores enabled on the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores enabled on the cloud VM cluster.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is
         * allowed for the fractional part.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is
         * allowed for the fractional part.
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** The memory to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory to be allocated in GBs.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** The local node storage to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage to be allocated in GBs.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /** The data disk group size to be allocated in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * The data disk group size to be allocated in TBs.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The list of DB servers. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of DB servers.
         *
         * @param dbServers the value to set
         * @return this builder
         */
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }
        /**
         * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic
         * character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster
         * name can be no longer than 11 characters and is not case sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic
         * character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster
         * name can be no longer than 11 characters and is not case sensitive.
         *
         * @param clusterName the value to set
         * @return this builder
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * The percentage assigned to DATA storage (user data and database files). The remaining
         * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
         * manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent
         * assigned to DATA storage. See [Storage
         * Configuration](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm#Exadata)
         * in the Exadata documentation for details on the impact of the configuration settings on
         * storage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
        private Integer dataStoragePercentage;

        /**
         * The percentage assigned to DATA storage (user data and database files). The remaining
         * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
         * manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent
         * assigned to DATA storage. See [Storage
         * Configuration](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm#Exadata)
         * in the Exadata documentation for details on the impact of the configuration settings on
         * storage.
         *
         * @param dataStoragePercentage the value to set
         * @return this builder
         */
        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = dataStoragePercentage;
            this.__explicitlySet__.add("dataStoragePercentage");
            return this;
        }
        /**
         * If true, database backup on local Exadata storage is configured for the cloud VM cluster.
         * If false, database backup on local Exadata storage is not available in the cloud VM
         * cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        /**
         * If true, database backup on local Exadata storage is configured for the cloud VM cluster.
         * If false, database backup on local Exadata storage is not available in the cloud VM
         * cluster.
         *
         * @param isLocalBackupEnabled the value to set
         * @return this builder
         */
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = isLocalBackupEnabled;
            this.__explicitlySet__.add("isLocalBackupEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud Exadata infrastructure.
         *
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
            return this;
        }
        /**
         * If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk
         * group is not created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
        private Boolean isSparseDiskgroupEnabled;

        /**
         * If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk
         * group is not created.
         *
         * @param isSparseDiskgroupEnabled the value to set
         * @return this builder
         */
        public Builder isSparseDiskgroupEnabled(Boolean isSparseDiskgroupEnabled) {
            this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
            this.__explicitlySet__.add("isSparseDiskgroupEnabled");
            return this;
        }
        /** A valid Oracle Grid Infrastructure (GI) software version. */
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         *
         * @param giVersion the value to set
         * @return this builder
         */
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }
        /** Operating system version of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         *
         * @param systemVersion the value to set
         * @return this builder
         */
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the cloud VM
         * cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the cloud VM
         * cluster.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The Oracle license model that applies to the cloud VM cluster. The default is
         * LICENSE_INCLUDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the cloud VM cluster. The default is
         * LICENSE_INCLUDED.
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
         * The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy.
         * HIGH is 3-way redundancy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
        private DiskRedundancy diskRedundancy;

        /**
         * The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy.
         * HIGH is 3-way redundancy.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN
         * IP addresses are typically used for load balancing and are not assigned to any interface.
         * Oracle Clusterware directs the requests to the appropriate nodes in the cluster.
         *
         * <p>*Note:** For a single-node DB system, this list is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
        private java.util.List<String> scanIpIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN
         * IP addresses are typically used for load balancing and are not assigned to any interface.
         * Oracle Clusterware directs the requests to the appropriate nodes in the cluster.
         *
         * <p>*Note:** For a single-node DB system, this list is empty.
         *
         * @param scanIpIds the value to set
         * @return this builder
         */
        public Builder scanIpIds(java.util.List<String> scanIpIds) {
            this.scanIpIds = scanIpIds;
            this.__explicitlySet__.add("scanIpIds");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready
         * Services (CRS) creates and maintains one VIP address for each node in the Exadata Cloud
         * Service instance to enable failover. If one node fails, the VIP is reassigned to another
         * active node in the cluster.
         *
         * <p>*Note:** For a single-node DB system, this list is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
        private java.util.List<String> vipIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready
         * Services (CRS) creates and maintains one VIP address for each node in the Exadata Cloud
         * Service instance to enable failover. If one node fails, the VIP is reassigned to another
         * active node in the cluster.
         *
         * <p>*Note:** For a single-node DB system, this list is empty.
         *
         * @param vipIds the value to set
         * @return this builder
         */
        public Builder vipIds(java.util.List<String> vipIds) {
            this.vipIds = vipIds;
            this.__explicitlySet__.add("vipIds");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
        private String scanDnsRecordId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DNS record for the SCAN IP addresses that are associated with the cloud VM cluster.
         *
         * @param scanDnsRecordId the value to set
         * @return this builder
         */
        public Builder scanDnsRecordId(String scanDnsRecordId) {
            this.scanDnsRecordId = scanDnsRecordId;
            this.__explicitlySet__.add("scanDnsRecordId");
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud
         * VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
        private String scanDnsName;

        /**
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud
         * VM cluster.
         *
         * @param scanDnsName the value to set
         * @return this builder
         */
        public Builder scanDnsName(String scanDnsName) {
            this.scanDnsName = scanDnsName;
            this.__explicitlySet__.add("scanDnsName");
            return this;
        }
        /** The OCID of the zone the cloud VM cluster is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        /**
         * The OCID of the zone the cloud VM cluster is associated with.
         *
         * @param zoneId the value to set
         * @return this builder
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }
        /** The TCP Single Client Access Name (SCAN) port. The default port is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
         *
         * @param scanListenerPortTcp the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /** The TCPS Single Client Access Name (SCAN) port. The default port is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
         *
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * grid infrastructure software image. This is a database software image of the type {@code
         * GRID_IMAGE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("giSoftwareImageId")
        private String giSoftwareImageId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a
         * grid infrastructure software image. This is a database software image of the type {@code
         * GRID_IMAGE}.
         *
         * @param giSoftwareImageId the value to set
         * @return this builder
         */
        public Builder giSoftwareImageId(String giSoftwareImageId) {
            this.giSoftwareImageId = giSoftwareImageId;
            this.__explicitlySet__.add("giSoftwareImageId");
            return this;
        }
        /** Details of the file system configuration of the VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
        private java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

        /**
         * Details of the file system configuration of the VM cluster.
         *
         * @param fileSystemConfigurationDetails the value to set
         * @return this builder
         */
        public Builder fileSystemConfigurationDetails(
                java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails) {
            this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
            this.__explicitlySet__.add("fileSystemConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudVmCluster build() {
            CloudVmCluster model =
                    new CloudVmCluster(
                            this.iormConfigCache,
                            this.id,
                            this.compartmentId,
                            this.subscriptionId,
                            this.availabilityDomain,
                            this.subnetId,
                            this.backupSubnetId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.lastUpdateHistoryEntryId,
                            this.shape,
                            this.listenerPort,
                            this.lifecycleState,
                            this.nodeCount,
                            this.storageSizeInGBs,
                            this.displayName,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.timeZone,
                            this.hostname,
                            this.domain,
                            this.cpuCoreCount,
                            this.ocpuCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.dataStorageSizeInTBs,
                            this.dbServers,
                            this.clusterName,
                            this.dataStoragePercentage,
                            this.isLocalBackupEnabled,
                            this.cloudExadataInfrastructureId,
                            this.isSparseDiskgroupEnabled,
                            this.giVersion,
                            this.systemVersion,
                            this.sshPublicKeys,
                            this.licenseModel,
                            this.diskRedundancy,
                            this.scanIpIds,
                            this.vipIds,
                            this.scanDnsRecordId,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.systemTags,
                            this.scanDnsName,
                            this.zoneId,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.dataCollectionOptions,
                            this.giSoftwareImageId,
                            this.fileSystemConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudVmCluster model) {
            if (model.wasPropertyExplicitlySet("iormConfigCache")) {
                this.iormConfigCache(model.getIormConfigCache());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
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
            if (model.wasPropertyExplicitlySet("lastUpdateHistoryEntryId")) {
                this.lastUpdateHistoryEntryId(model.getLastUpdateHistoryEntryId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("listenerPort")) {
                this.listenerPort(model.getListenerPort());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInGBs")) {
                this.storageSizeInGBs(model.getStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
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
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("dataStoragePercentage")) {
                this.dataStoragePercentage(model.getDataStoragePercentage());
            }
            if (model.wasPropertyExplicitlySet("isLocalBackupEnabled")) {
                this.isLocalBackupEnabled(model.getIsLocalBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("isSparseDiskgroupEnabled")) {
                this.isSparseDiskgroupEnabled(model.getIsSparseDiskgroupEnabled());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("systemVersion")) {
                this.systemVersion(model.getSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("diskRedundancy")) {
                this.diskRedundancy(model.getDiskRedundancy());
            }
            if (model.wasPropertyExplicitlySet("scanIpIds")) {
                this.scanIpIds(model.getScanIpIds());
            }
            if (model.wasPropertyExplicitlySet("vipIds")) {
                this.vipIds(model.getVipIds());
            }
            if (model.wasPropertyExplicitlySet("scanDnsRecordId")) {
                this.scanDnsRecordId(model.getScanDnsRecordId());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("scanDnsName")) {
                this.scanDnsName(model.getScanDnsName());
            }
            if (model.wasPropertyExplicitlySet("zoneId")) {
                this.zoneId(model.getZoneId());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcp")) {
                this.scanListenerPortTcp(model.getScanListenerPortTcp());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTcpSsl")) {
                this.scanListenerPortTcpSsl(model.getScanListenerPortTcpSsl());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("giSoftwareImageId")) {
                this.giSoftwareImageId(model.getGiSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemConfigurationDetails")) {
                this.fileSystemConfigurationDetails(model.getFileSystemConfigurationDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("iormConfigCache")
    private final ExadataIormConfig iormConfigCache;

    public ExadataIormConfig getIormConfigCache() {
        return iormConfigCache;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud VM cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located
     * in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the cloud Exadata infrastructure resource is located
     * in.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the cloud VM cluster.
     *
     * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC systems, do not use a
     * subnet that overlaps with 192.168.128.0/20.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and backup subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the cloud VM cluster.
     *
     * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC systems, do not use a
     * subnet that overlaps with 192.168.128.0/20.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and backup subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the cloud VM cluster.
     *
     * <p>*Subnet Restriction:** See the subnet restrictions information for **subnetId**.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the cloud VM cluster.
     *
     * <p>*Subnet Restriction:** See the subnet restrictions information for **subnetId**.
     *
     * @return the value
     */
    public String getBackupSubnetId() {
        return backupSubnetId;
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
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security
     * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable
     * only to Exadata systems.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the network security groups (NSGs) that the backup network of this DB system belongs to.
     * Setting this to an empty array after the list is created removes the resource from all NSGs.
     * For more information about NSGs, see [Security
     * Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm). Applicable
     * only to Exadata systems.
     *
     * @return the value
     */
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance update history entry. This value is updated when a maintenance update
     * starts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateHistoryEntryId")
    private final String lastUpdateHistoryEntryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance update history entry. This value is updated when a maintenance update
     * starts.
     *
     * @return the value
     */
    public String getLastUpdateHistoryEntryId() {
        return lastUpdateHistoryEntryId;
    }

    /** The model name of the Exadata hardware running the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The model name of the Exadata hardware running the cloud VM cluster.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The port number configured for the listener on the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Long listenerPort;

    /**
     * The port number configured for the listener on the cloud VM cluster.
     *
     * @return the value
     */
    public Long getListenerPort() {
        return listenerPort;
    }

    /** The current state of the cloud VM cluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    /** The current state of the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the cloud VM cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The number of nodes in the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the cloud VM cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The storage allocation for the disk group, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInGBs")
    private final Integer storageSizeInGBs;

    /**
     * The storage allocation for the disk group, in gigabytes (GB).
     *
     * @return the value
     */
    public Integer getStorageSizeInGBs() {
        return storageSizeInGBs;
    }

    /** The user-friendly name for the cloud VM cluster. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The date and time that the cloud VM cluster was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the cloud VM cluster was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone of the cloud VM cluster. For details, see [Exadata Infrastructure Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /** The hostname for the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the cloud VM cluster.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The domain name for the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The domain name for the cloud VM cluster.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /** The number of CPU cores enabled on the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores enabled on the cloud VM cluster.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is allowed
     * for the fractional part.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to enable on the cloud VM cluster. Only 1 decimal place is allowed
     * for the fractional part.
     *
     * @return the value
     */
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /** The memory to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory to be allocated in GBs.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** The local node storage to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage to be allocated in GBs.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /** The data disk group size to be allocated in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * The data disk group size to be allocated in TBs.
     *
     * @return the value
     */
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The list of DB servers. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of DB servers.
     *
     * @return the value
     */
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /**
     * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic
     * character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name
     * can be no longer than 11 characters and is not case sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic
     * character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name
     * can be no longer than 11 characters and is not case sensitive.
     *
     * @return the value
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * The percentage assigned to DATA storage (user data and database files). The remaining
     * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
     * manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned
     * to DATA storage. See [Storage
     * Configuration](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm#Exadata)
     * in the Exadata documentation for details on the impact of the configuration settings on
     * storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    private final Integer dataStoragePercentage;

    /**
     * The percentage assigned to DATA storage (user data and database files). The remaining
     * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
     * manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned
     * to DATA storage. See [Storage
     * Configuration](https://docs.cloud.oracle.com/Content/Database/Concepts/exaoverview.htm#Exadata)
     * in the Exadata documentation for details on the impact of the configuration settings on
     * storage.
     *
     * @return the value
     */
    public Integer getDataStoragePercentage() {
        return dataStoragePercentage;
    }

    /**
     * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If
     * false, database backup on local Exadata storage is not available in the cloud VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    private final Boolean isLocalBackupEnabled;

    /**
     * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If
     * false, database backup on local Exadata storage is not available in the cloud VM cluster.
     *
     * @return the value
     */
    public Boolean getIsLocalBackupEnabled() {
        return isLocalBackupEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud Exadata infrastructure.
     *
     * @return the value
     */
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }

    /**
     * If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk
     * group is not created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
    private final Boolean isSparseDiskgroupEnabled;

    /**
     * If true, sparse disk group is configured for the cloud VM cluster. If false, sparse disk
     * group is not created.
     *
     * @return the value
     */
    public Boolean getIsSparseDiskgroupEnabled() {
        return isSparseDiskgroupEnabled;
    }

    /** A valid Oracle Grid Infrastructure (GI) software version. */
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     *
     * @return the value
     */
    public String getGiVersion() {
        return giVersion;
    }

    /** Operating system version of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     *
     * @return the value
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the cloud VM cluster. The default is
     * LICENSE_INCLUDED.
     */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

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
     * The Oracle license model that applies to the cloud VM cluster. The default is
     * LICENSE_INCLUDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the cloud VM cluster. The default is
     * LICENSE_INCLUDED.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy. HIGH
     * is 3-way redundancy.
     */
    public enum DiskRedundancy implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DiskRedundancy.class);

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
     * The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy. HIGH
     * is 3-way redundancy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diskRedundancy")
    private final DiskRedundancy diskRedundancy;

    /**
     * The type of redundancy configured for the cloud Vm cluster. NORMAL is 2-way redundancy. HIGH
     * is 3-way redundancy.
     *
     * @return the value
     */
    public DiskRedundancy getDiskRedundancy() {
        return diskRedundancy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN IP
     * addresses are typically used for load balancing and are not assigned to any interface. Oracle
     * Clusterware directs the requests to the appropriate nodes in the cluster.
     *
     * <p>*Note:** For a single-node DB system, this list is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
    private final java.util.List<String> scanIpIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Single Client Access Name (SCAN) IP addresses associated with the cloud VM cluster. SCAN IP
     * addresses are typically used for load balancing and are not assigned to any interface. Oracle
     * Clusterware directs the requests to the appropriate nodes in the cluster.
     *
     * <p>*Note:** For a single-node DB system, this list is empty.
     *
     * @return the value
     */
    public java.util.List<String> getScanIpIds() {
        return scanIpIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready Services
     * (CRS) creates and maintains one VIP address for each node in the Exadata Cloud Service
     * instance to enable failover. If one node fails, the VIP is reassigned to another active node
     * in the cluster.
     *
     * <p>*Note:** For a single-node DB system, this list is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
    private final java.util.List<String> vipIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * virtual IP (VIP) addresses associated with the cloud VM cluster. The Cluster Ready Services
     * (CRS) creates and maintains one VIP address for each node in the Exadata Cloud Service
     * instance to enable failover. If one node fails, the VIP is reassigned to another active node
     * in the cluster.
     *
     * <p>*Note:** For a single-node DB system, this list is empty.
     *
     * @return the value
     */
    public java.util.List<String> getVipIds() {
        return vipIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DNS
     * record for the SCAN IP addresses that are associated with the cloud VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
    private final String scanDnsRecordId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DNS
     * record for the SCAN IP addresses that are associated with the cloud VM cluster.
     *
     * @return the value
     */
    public String getScanDnsRecordId() {
        return scanDnsRecordId;
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
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud VM
     * cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
    private final String scanDnsName;

    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the cloud VM
     * cluster.
     *
     * @return the value
     */
    public String getScanDnsName() {
        return scanDnsName;
    }

    /** The OCID of the zone the cloud VM cluster is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    /**
     * The OCID of the zone the cloud VM cluster is associated with.
     *
     * @return the value
     */
    public String getZoneId() {
        return zoneId;
    }

    /** The TCP Single Client Access Name (SCAN) port. The default port is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /** The TCPS Single Client Access Name (SCAN) port. The default port is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a grid
     * infrastructure software image. This is a database software image of the type {@code
     * GRID_IMAGE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("giSoftwareImageId")
    private final String giSoftwareImageId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a grid
     * infrastructure software image. This is a database software image of the type {@code
     * GRID_IMAGE}.
     *
     * @return the value
     */
    public String getGiSoftwareImageId() {
        return giSoftwareImageId;
    }

    /** Details of the file system configuration of the VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
    private final java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

    /**
     * Details of the file system configuration of the VM cluster.
     *
     * @return the value
     */
    public java.util.List<FileSystemConfigurationDetail> getFileSystemConfigurationDetails() {
        return fileSystemConfigurationDetails;
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
        sb.append("CloudVmCluster(");
        sb.append("super=").append(super.toString());
        sb.append("iormConfigCache=").append(String.valueOf(this.iormConfigCache));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", lastUpdateHistoryEntryId=")
                .append(String.valueOf(this.lastUpdateHistoryEntryId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", storageSizeInGBs=").append(String.valueOf(this.storageSizeInGBs));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", dataStoragePercentage=").append(String.valueOf(this.dataStoragePercentage));
        sb.append(", isLocalBackupEnabled=").append(String.valueOf(this.isLocalBackupEnabled));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", isSparseDiskgroupEnabled=")
                .append(String.valueOf(this.isSparseDiskgroupEnabled));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", diskRedundancy=").append(String.valueOf(this.diskRedundancy));
        sb.append(", scanIpIds=").append(String.valueOf(this.scanIpIds));
        sb.append(", vipIds=").append(String.valueOf(this.vipIds));
        sb.append(", scanDnsRecordId=").append(String.valueOf(this.scanDnsRecordId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", scanDnsName=").append(String.valueOf(this.scanDnsName));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", giSoftwareImageId=").append(String.valueOf(this.giSoftwareImageId));
        sb.append(", fileSystemConfigurationDetails=")
                .append(String.valueOf(this.fileSystemConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudVmCluster)) {
            return false;
        }

        CloudVmCluster other = (CloudVmCluster) o;
        return java.util.Objects.equals(this.iormConfigCache, other.iormConfigCache)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(
                        this.lastUpdateHistoryEntryId, other.lastUpdateHistoryEntryId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.storageSizeInGBs, other.storageSizeInGBs)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.dataStoragePercentage, other.dataStoragePercentage)
                && java.util.Objects.equals(this.isLocalBackupEnabled, other.isLocalBackupEnabled)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.isSparseDiskgroupEnabled, other.isSparseDiskgroupEnabled)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.diskRedundancy, other.diskRedundancy)
                && java.util.Objects.equals(this.scanIpIds, other.scanIpIds)
                && java.util.Objects.equals(this.vipIds, other.vipIds)
                && java.util.Objects.equals(this.scanDnsRecordId, other.scanDnsRecordId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.scanDnsName, other.scanDnsName)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.giSoftwareImageId, other.giSoftwareImageId)
                && java.util.Objects.equals(
                        this.fileSystemConfigurationDetails, other.fileSystemConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.iormConfigCache == null ? 43 : this.iormConfigCache.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSubnetId == null ? 43 : this.backupSubnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdateHistoryEntryId == null
                                ? 43
                                : this.lastUpdateHistoryEntryId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInGBs == null ? 43 : this.storageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStoragePercentage == null
                                ? 43
                                : this.dataStoragePercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalBackupEnabled == null
                                ? 43
                                : this.isLocalBackupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.isSparseDiskgroupEnabled == null
                                ? 43
                                : this.isSparseDiskgroupEnabled.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.diskRedundancy == null ? 43 : this.diskRedundancy.hashCode());
        result = (result * PRIME) + (this.scanIpIds == null ? 43 : this.scanIpIds.hashCode());
        result = (result * PRIME) + (this.vipIds == null ? 43 : this.vipIds.hashCode());
        result =
                (result * PRIME)
                        + (this.scanDnsRecordId == null ? 43 : this.scanDnsRecordId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.scanDnsName == null ? 43 : this.scanDnsName.hashCode());
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcp == null
                                ? 43
                                : this.scanListenerPortTcp.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTcpSsl == null
                                ? 43
                                : this.scanListenerPortTcpSsl.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.giSoftwareImageId == null ? 43 : this.giSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemConfigurationDetails == null
                                ? 43
                                : this.fileSystemConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
