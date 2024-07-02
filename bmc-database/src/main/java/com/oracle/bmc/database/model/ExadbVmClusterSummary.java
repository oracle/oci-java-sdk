/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Exadata VM cluster on Exascale Infrastructure. Applies to Exadata Database Service
 * on Exascale Infrastructure only. <br>
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
        builder = ExadbVmClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadbVmClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "availabilityDomain",
        "subnetId",
        "backupSubnetId",
        "nsgIds",
        "backupNetworkNsgIds",
        "lastUpdateHistoryEntryId",
        "listenerPort",
        "lifecycleState",
        "nodeCount",
        "shape",
        "displayName",
        "timeCreated",
        "lifecycleDetails",
        "timeZone",
        "hostname",
        "domain",
        "clusterName",
        "giVersion",
        "gridImageId",
        "gridImageType",
        "systemVersion",
        "sshPublicKeys",
        "licenseModel",
        "scanIpIds",
        "vipIds",
        "scanDnsRecordId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "scanDnsName",
        "zoneId",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "privateZoneId",
        "dataCollectionOptions",
        "totalECpuCount",
        "enabledECpuCount",
        "vmFileSystemStorage",
        "snapshotFileSystemStorage",
        "totalFileSystemStorage",
        "exascaleDbStorageVaultId",
        "memorySizeInGBs"
    })
    public ExadbVmClusterSummary(
            String id,
            String compartmentId,
            String availabilityDomain,
            String subnetId,
            String backupSubnetId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String lastUpdateHistoryEntryId,
            Long listenerPort,
            LifecycleState lifecycleState,
            Integer nodeCount,
            String shape,
            String displayName,
            java.util.Date timeCreated,
            String lifecycleDetails,
            String timeZone,
            String hostname,
            String domain,
            String clusterName,
            String giVersion,
            String gridImageId,
            GridImageType gridImageType,
            String systemVersion,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            java.util.List<String> scanIpIds,
            java.util.List<String> vipIds,
            String scanDnsRecordId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String scanDnsName,
            String zoneId,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            String privateZoneId,
            DataCollectionOptions dataCollectionOptions,
            Integer totalECpuCount,
            Integer enabledECpuCount,
            ExadbVmClusterStorageDetails vmFileSystemStorage,
            ExadbVmClusterStorageDetails snapshotFileSystemStorage,
            ExadbVmClusterStorageDetails totalFileSystemStorage,
            String exascaleDbStorageVaultId,
            Integer memorySizeInGBs) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
        this.listenerPort = listenerPort;
        this.lifecycleState = lifecycleState;
        this.nodeCount = nodeCount;
        this.shape = shape;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.timeZone = timeZone;
        this.hostname = hostname;
        this.domain = domain;
        this.clusterName = clusterName;
        this.giVersion = giVersion;
        this.gridImageId = gridImageId;
        this.gridImageType = gridImageType;
        this.systemVersion = systemVersion;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.scanIpIds = scanIpIds;
        this.vipIds = vipIds;
        this.scanDnsRecordId = scanDnsRecordId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.scanDnsName = scanDnsName;
        this.zoneId = zoneId;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.privateZoneId = privateZoneId;
        this.dataCollectionOptions = dataCollectionOptions;
        this.totalECpuCount = totalECpuCount;
        this.enabledECpuCount = enabledECpuCount;
        this.vmFileSystemStorage = vmFileSystemStorage;
        this.snapshotFileSystemStorage = snapshotFileSystemStorage;
        this.totalFileSystemStorage = totalFileSystemStorage;
        this.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
        this.memorySizeInGBs = memorySizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata VM cluster on Exascale Infrastructure.
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
         * The name of the availability domain in which the Exadata VM cluster on Exascale
         * Infrastructure is located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which the Exadata VM cluster on Exascale
         * Infrastructure is located.
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
         * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
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
         * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
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
        /**
         * The port number configured for the listener on the Exadata VM cluster on Exascale
         * Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Long listenerPort;

        /**
         * The port number configured for the listener on the Exadata VM cluster on Exascale
         * Infrastructure.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /** The current state of the Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The number of nodes in the Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the Exadata VM cluster on Exascale Infrastructure.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The shape of the Exadata VM cluster on Exascale Infrastructure resource */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Exadata VM cluster on Exascale Infrastructure resource
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name
         * does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name
         * does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The date and time that the Exadata VM cluster on Exascale Infrastructure was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Exadata VM cluster on Exascale Infrastructure was created.
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
         * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details,
         * see [Time
         * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details,
         * see [Time
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
        /**
         * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must
         * begin with an alphabetic character, and can contain alphanumeric characters and hyphens
         * (-). For Exadata systems, the maximum length of the hostname is 12 characters.
         *
         * <p>The maximum length of the combined hostname and domain is 63 characters.
         *
         * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
         * Exadata VM cluster on Exascale Infrastructure will fail to provision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must
         * begin with an alphabetic character, and can contain alphanumeric characters and hyphens
         * (-). For Exadata systems, the maximum length of the hostname is 12 characters.
         *
         * <p>The maximum length of the combined hostname and domain is 63 characters.
         *
         * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
         * Exadata VM cluster on Exascale Infrastructure will fail to provision.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
         * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
         * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
         * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on
         * Exascale Infrastructure only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
         * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
         * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
         * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on
         * Exascale Infrastructure only.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
         * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
         * permitted. The cluster name can be no longer than 11 characters and is not case
         * sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
         * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
         * permitted. The cluster name can be no longer than 11 characters and is not case
         * sensitive.
         *
         * @param clusterName the value to set
         * @return this builder
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
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
        /** Grid Setup will be done using this grid image id */
        @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
        private String gridImageId;

        /**
         * Grid Setup will be done using this grid image id
         *
         * @param gridImageId the value to set
         * @return this builder
         */
        public Builder gridImageId(String gridImageId) {
            this.gridImageId = gridImageId;
            this.__explicitlySet__.add("gridImageId");
            return this;
        }
        /** The type of Grid Image */
        @com.fasterxml.jackson.annotation.JsonProperty("gridImageType")
        private GridImageType gridImageType;

        /**
         * The type of Grid Image
         *
         * @param gridImageType the value to set
         * @return this builder
         */
        public Builder gridImageType(GridImageType gridImageType) {
            this.gridImageType = gridImageType;
            this.__explicitlySet__.add("gridImageType");
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
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM
         * cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the Exadata VM
         * cluster on Exascale Infrastructure.
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
         * The Oracle license model that applies to the Exadata VM cluster on Exascale
         * Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Exadata VM cluster on Exascale
         * Infrastructure. The default is BRING_YOUR_OWN_LICENSE.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Single Client Access Name (SCAN) IP addresses associated with the Exadata VM cluster on
         * Exascale Infrastructure. SCAN IP addresses are typically used for load balancing and are
         * not assigned to any interface. Oracle Clusterware directs the requests to the appropriate
         * nodes in the cluster.
         *
         * <p>*Note:** For a single-node DB system, this list is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
        private java.util.List<String> scanIpIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Single Client Access Name (SCAN) IP addresses associated with the Exadata VM cluster on
         * Exascale Infrastructure. SCAN IP addresses are typically used for load balancing and are
         * not assigned to any interface. Oracle Clusterware directs the requests to the appropriate
         * nodes in the cluster.
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
         * virtual IP (VIP) addresses associated with the Exadata VM cluster on Exascale
         * Infrastructure. The Cluster Ready Services (CRS) creates and maintains one VIP address
         * for each node in the Exadata Cloud Service instance to enable failover. If one node
         * fails, then the VIP is reassigned to another active node in the cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
        private java.util.List<String> vipIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * virtual IP (VIP) addresses associated with the Exadata VM cluster on Exascale
         * Infrastructure. The Cluster Ready Services (CRS) creates and maintains one VIP address
         * for each node in the Exadata Cloud Service instance to enable failover. If one node
         * fails, then the VIP is reassigned to another active node in the cluster.
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
         * DNS record for the SCAN IP addresses that are associated with the Exadata VM cluster on
         * Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
        private String scanDnsRecordId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DNS record for the SCAN IP addresses that are associated with the Exadata VM cluster on
         * Exascale Infrastructure.
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
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Exadata
         * VM cluster on Exascale Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
        private String scanDnsName;

        /**
         * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Exadata
         * VM cluster on Exascale Infrastructure.
         *
         * @param scanDnsName the value to set
         * @return this builder
         */
        public Builder scanDnsName(String scanDnsName) {
            this.scanDnsName = scanDnsName;
            this.__explicitlySet__.add("scanDnsName");
            return this;
        }
        /**
         * The OCID of the zone with which the Exadata VM cluster on Exascale Infrastructure is
         * associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        /**
         * The OCID of the zone with which the Exadata VM cluster on Exascale Infrastructure is
         * associated.
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
        /**
         * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The
         * default port is 2484.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The
         * default port is 2484.
         *
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         */
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }
        /** The private zone ID in which you want DNS records to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
        private String privateZoneId;

        /**
         * The private zone ID in which you want DNS records to be created.
         *
         * @param privateZoneId the value to set
         * @return this builder
         */
        public Builder privateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            this.__explicitlySet__.add("privateZoneId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /** The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
        private Integer totalECpuCount;

        /**
         * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param totalECpuCount the value to set
         * @return this builder
         */
        public Builder totalECpuCount(Integer totalECpuCount) {
            this.totalECpuCount = totalECpuCount;
            this.__explicitlySet__.add("totalECpuCount");
            return this;
        }
        /** The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
        private Integer enabledECpuCount;

        /**
         * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
         *
         * @param enabledECpuCount the value to set
         * @return this builder
         */
        public Builder enabledECpuCount(Integer enabledECpuCount) {
            this.enabledECpuCount = enabledECpuCount;
            this.__explicitlySet__.add("enabledECpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
        private ExadbVmClusterStorageDetails vmFileSystemStorage;

        public Builder vmFileSystemStorage(ExadbVmClusterStorageDetails vmFileSystemStorage) {
            this.vmFileSystemStorage = vmFileSystemStorage;
            this.__explicitlySet__.add("vmFileSystemStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("snapshotFileSystemStorage")
        private ExadbVmClusterStorageDetails snapshotFileSystemStorage;

        public Builder snapshotFileSystemStorage(
                ExadbVmClusterStorageDetails snapshotFileSystemStorage) {
            this.snapshotFileSystemStorage = snapshotFileSystemStorage;
            this.__explicitlySet__.add("snapshotFileSystemStorage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalFileSystemStorage")
        private ExadbVmClusterStorageDetails totalFileSystemStorage;

        public Builder totalFileSystemStorage(ExadbVmClusterStorageDetails totalFileSystemStorage) {
            this.totalFileSystemStorage = totalFileSystemStorage;
            this.__explicitlySet__.add("totalFileSystemStorage");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exascaleDbStorageVaultId")
        private String exascaleDbStorageVaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         *
         * @param exascaleDbStorageVaultId the value to set
         * @return this builder
         */
        public Builder exascaleDbStorageVaultId(String exascaleDbStorageVaultId) {
            this.exascaleDbStorageVaultId = exascaleDbStorageVaultId;
            this.__explicitlySet__.add("exascaleDbStorageVaultId");
            return this;
        }
        /**
         * The memory that you want to be allocated in GBs. Memory is calculated based on 11 GB per
         * VM core reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory that you want to be allocated in GBs. Memory is calculated based on 11 GB per
         * VM core reserved.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadbVmClusterSummary build() {
            ExadbVmClusterSummary model =
                    new ExadbVmClusterSummary(
                            this.id,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.subnetId,
                            this.backupSubnetId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.lastUpdateHistoryEntryId,
                            this.listenerPort,
                            this.lifecycleState,
                            this.nodeCount,
                            this.shape,
                            this.displayName,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.timeZone,
                            this.hostname,
                            this.domain,
                            this.clusterName,
                            this.giVersion,
                            this.gridImageId,
                            this.gridImageType,
                            this.systemVersion,
                            this.sshPublicKeys,
                            this.licenseModel,
                            this.scanIpIds,
                            this.vipIds,
                            this.scanDnsRecordId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.scanDnsName,
                            this.zoneId,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.privateZoneId,
                            this.dataCollectionOptions,
                            this.totalECpuCount,
                            this.enabledECpuCount,
                            this.vmFileSystemStorage,
                            this.snapshotFileSystemStorage,
                            this.totalFileSystemStorage,
                            this.exascaleDbStorageVaultId,
                            this.memorySizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadbVmClusterSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("listenerPort")) {
                this.listenerPort(model.getListenerPort());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
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
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("gridImageId")) {
                this.gridImageId(model.getGridImageId());
            }
            if (model.wasPropertyExplicitlySet("gridImageType")) {
                this.gridImageType(model.getGridImageType());
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
            if (model.wasPropertyExplicitlySet("privateZoneId")) {
                this.privateZoneId(model.getPrivateZoneId());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("totalECpuCount")) {
                this.totalECpuCount(model.getTotalECpuCount());
            }
            if (model.wasPropertyExplicitlySet("enabledECpuCount")) {
                this.enabledECpuCount(model.getEnabledECpuCount());
            }
            if (model.wasPropertyExplicitlySet("vmFileSystemStorage")) {
                this.vmFileSystemStorage(model.getVmFileSystemStorage());
            }
            if (model.wasPropertyExplicitlySet("snapshotFileSystemStorage")) {
                this.snapshotFileSystemStorage(model.getSnapshotFileSystemStorage());
            }
            if (model.wasPropertyExplicitlySet("totalFileSystemStorage")) {
                this.totalFileSystemStorage(model.getTotalFileSystemStorage());
            }
            if (model.wasPropertyExplicitlySet("exascaleDbStorageVaultId")) {
                this.exascaleDbStorageVaultId(model.getExascaleDbStorageVaultId());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata VM cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata VM cluster on Exascale Infrastructure.
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
     * The name of the availability domain in which the Exadata VM cluster on Exascale
     * Infrastructure is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which the Exadata VM cluster on Exascale
     * Infrastructure is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet associated with the Exadata VM cluster on Exascale Infrastructure.
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

    /**
     * The port number configured for the listener on the Exadata VM cluster on Exascale
     * Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Long listenerPort;

    /**
     * The port number configured for the listener on the Exadata VM cluster on Exascale
     * Infrastructure.
     *
     * @return the value
     */
    public Long getListenerPort() {
        return listenerPort;
    }

    /** The current state of the Exadata VM cluster on Exascale Infrastructure. */
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
    /** The current state of the Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The number of nodes in the Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The shape of the Exadata VM cluster on Exascale Infrastructure resource */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Exadata VM cluster on Exascale Infrastructure resource
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does
     * not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata VM cluster on Exascale Infrastructure. The name does
     * not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The date and time that the Exadata VM cluster on Exascale Infrastructure was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Exadata VM cluster on Exascale Infrastructure was created.
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
     * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details, see
     * [Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Exadata VM cluster on Exascale Infrastructure. For details, see
     * [Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must begin
     * with an alphabetic character, and can contain alphanumeric characters and hyphens (-). For
     * Exadata systems, the maximum length of the hostname is 12 characters.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
     * Exadata VM cluster on Exascale Infrastructure will fail to provision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the Exadata VM cluster on Exascale Infrastructure. The hostname must begin
     * with an alphabetic character, and can contain alphanumeric characters and hyphens (-). For
     * Exadata systems, the maximum length of the hostname is 12 characters.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, then the
     * Exadata VM cluster on Exascale Infrastructure will fail to provision.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
     * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
     * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
     * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale
     * Infrastructure only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the Exadata VM cluster on Exascale Infrastructure. If the
     * Oracle-provided internet and VCN resolver is enabled for the specified subnet, then the
     * domain name for the subnet is used (do not provide one). Otherwise, provide a valid DNS
     * domain name. Hyphens (-) are not permitted. Applies to Exadata Database Service on Exascale
     * Infrastructure only.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for Exadata VM cluster on Exascale Infrastructure. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     * @return the value
     */
    public String getClusterName() {
        return clusterName;
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

    /** Grid Setup will be done using this grid image id */
    @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
    private final String gridImageId;

    /**
     * Grid Setup will be done using this grid image id
     *
     * @return the value
     */
    public String getGridImageId() {
        return gridImageId;
    }

    /** The type of Grid Image */
    public enum GridImageType implements com.oracle.bmc.http.internal.BmcEnum {
        ReleaseUpdate("RELEASE_UPDATE"),
        CustomImage("CUSTOM_IMAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GridImageType.class);

        private final String value;
        private static java.util.Map<String, GridImageType> map;

        static {
            map = new java.util.HashMap<>();
            for (GridImageType v : GridImageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GridImageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GridImageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GridImageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of Grid Image */
    @com.fasterxml.jackson.annotation.JsonProperty("gridImageType")
    private final GridImageType gridImageType;

    /**
     * The type of Grid Image
     *
     * @return the value
     */
    public GridImageType getGridImageType() {
        return gridImageType;
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
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster
     * on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the Exadata VM cluster
     * on Exascale Infrastructure.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Exadata VM cluster on Exascale Infrastructure.
     * The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Single Client Access Name (SCAN) IP addresses associated with the Exadata VM cluster on
     * Exascale Infrastructure. SCAN IP addresses are typically used for load balancing and are not
     * assigned to any interface. Oracle Clusterware directs the requests to the appropriate nodes
     * in the cluster.
     *
     * <p>*Note:** For a single-node DB system, this list is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanIpIds")
    private final java.util.List<String> scanIpIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Single Client Access Name (SCAN) IP addresses associated with the Exadata VM cluster on
     * Exascale Infrastructure. SCAN IP addresses are typically used for load balancing and are not
     * assigned to any interface. Oracle Clusterware directs the requests to the appropriate nodes
     * in the cluster.
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
     * virtual IP (VIP) addresses associated with the Exadata VM cluster on Exascale Infrastructure.
     * The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the
     * Exadata Cloud Service instance to enable failover. If one node fails, then the VIP is
     * reassigned to another active node in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vipIds")
    private final java.util.List<String> vipIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * virtual IP (VIP) addresses associated with the Exadata VM cluster on Exascale Infrastructure.
     * The Cluster Ready Services (CRS) creates and maintains one VIP address for each node in the
     * Exadata Cloud Service instance to enable failover. If one node fails, then the VIP is
     * reassigned to another active node in the cluster.
     *
     * @return the value
     */
    public java.util.List<String> getVipIds() {
        return vipIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DNS
     * record for the SCAN IP addresses that are associated with the Exadata VM cluster on Exascale
     * Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsRecordId")
    private final String scanDnsRecordId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DNS
     * record for the SCAN IP addresses that are associated with the Exadata VM cluster on Exascale
     * Infrastructure.
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
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Exadata VM
     * cluster on Exascale Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanDnsName")
    private final String scanDnsName;

    /**
     * The FQDN of the DNS record for the SCAN IP addresses that are associated with the Exadata VM
     * cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public String getScanDnsName() {
        return scanDnsName;
    }

    /**
     * The OCID of the zone with which the Exadata VM cluster on Exascale Infrastructure is
     * associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    /**
     * The OCID of the zone with which the Exadata VM cluster on Exascale Infrastructure is
     * associated.
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

    /**
     * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The default
     * port is 2484.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The Secured Communication (TCPS) protocol Single Client Access Name (SCAN) port. The default
     * port is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    /** The private zone ID in which you want DNS records to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
    private final String privateZoneId;

    /**
     * The private zone ID in which you want DNS records to be created.
     *
     * @return the value
     */
    public String getPrivateZoneId() {
        return privateZoneId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /** The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalECpuCount")
    private final Integer totalECpuCount;

    /**
     * The number of Total ECPUs for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getTotalECpuCount() {
        return totalECpuCount;
    }

    /** The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("enabledECpuCount")
    private final Integer enabledECpuCount;

    /**
     * The number of ECPUs to enable for an Exadata VM cluster on Exascale Infrastructure.
     *
     * @return the value
     */
    public Integer getEnabledECpuCount() {
        return enabledECpuCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmFileSystemStorage")
    private final ExadbVmClusterStorageDetails vmFileSystemStorage;

    public ExadbVmClusterStorageDetails getVmFileSystemStorage() {
        return vmFileSystemStorage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("snapshotFileSystemStorage")
    private final ExadbVmClusterStorageDetails snapshotFileSystemStorage;

    public ExadbVmClusterStorageDetails getSnapshotFileSystemStorage() {
        return snapshotFileSystemStorage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("totalFileSystemStorage")
    private final ExadbVmClusterStorageDetails totalFileSystemStorage;

    public ExadbVmClusterStorageDetails getTotalFileSystemStorage() {
        return totalFileSystemStorage;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exascaleDbStorageVaultId")
    private final String exascaleDbStorageVaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     *
     * @return the value
     */
    public String getExascaleDbStorageVaultId() {
        return exascaleDbStorageVaultId;
    }

    /**
     * The memory that you want to be allocated in GBs. Memory is calculated based on 11 GB per VM
     * core reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory that you want to be allocated in GBs. Memory is calculated based on 11 GB per VM
     * core reserved.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
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
        sb.append("ExadbVmClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", lastUpdateHistoryEntryId=")
                .append(String.valueOf(this.lastUpdateHistoryEntryId));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", gridImageId=").append(String.valueOf(this.gridImageId));
        sb.append(", gridImageType=").append(String.valueOf(this.gridImageType));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", scanIpIds=").append(String.valueOf(this.scanIpIds));
        sb.append(", vipIds=").append(String.valueOf(this.vipIds));
        sb.append(", scanDnsRecordId=").append(String.valueOf(this.scanDnsRecordId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", scanDnsName=").append(String.valueOf(this.scanDnsName));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", privateZoneId=").append(String.valueOf(this.privateZoneId));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", totalECpuCount=").append(String.valueOf(this.totalECpuCount));
        sb.append(", enabledECpuCount=").append(String.valueOf(this.enabledECpuCount));
        sb.append(", vmFileSystemStorage=").append(String.valueOf(this.vmFileSystemStorage));
        sb.append(", snapshotFileSystemStorage=")
                .append(String.valueOf(this.snapshotFileSystemStorage));
        sb.append(", totalFileSystemStorage=").append(String.valueOf(this.totalFileSystemStorage));
        sb.append(", exascaleDbStorageVaultId=")
                .append(String.valueOf(this.exascaleDbStorageVaultId));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadbVmClusterSummary)) {
            return false;
        }

        ExadbVmClusterSummary other = (ExadbVmClusterSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(
                        this.lastUpdateHistoryEntryId, other.lastUpdateHistoryEntryId)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.gridImageId, other.gridImageId)
                && java.util.Objects.equals(this.gridImageType, other.gridImageType)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.scanIpIds, other.scanIpIds)
                && java.util.Objects.equals(this.vipIds, other.vipIds)
                && java.util.Objects.equals(this.scanDnsRecordId, other.scanDnsRecordId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.scanDnsName, other.scanDnsName)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.privateZoneId, other.privateZoneId)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.totalECpuCount, other.totalECpuCount)
                && java.util.Objects.equals(this.enabledECpuCount, other.enabledECpuCount)
                && java.util.Objects.equals(this.vmFileSystemStorage, other.vmFileSystemStorage)
                && java.util.Objects.equals(
                        this.snapshotFileSystemStorage, other.snapshotFileSystemStorage)
                && java.util.Objects.equals(
                        this.totalFileSystemStorage, other.totalFileSystemStorage)
                && java.util.Objects.equals(
                        this.exascaleDbStorageVaultId, other.exascaleDbStorageVaultId)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result = (result * PRIME) + (this.gridImageId == null ? 43 : this.gridImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.gridImageType == null ? 43 : this.gridImageType.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.scanIpIds == null ? 43 : this.scanIpIds.hashCode());
        result = (result * PRIME) + (this.vipIds == null ? 43 : this.vipIds.hashCode());
        result =
                (result * PRIME)
                        + (this.scanDnsRecordId == null ? 43 : this.scanDnsRecordId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
                        + (this.privateZoneId == null ? 43 : this.privateZoneId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.totalECpuCount == null ? 43 : this.totalECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledECpuCount == null ? 43 : this.enabledECpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFileSystemStorage == null
                                ? 43
                                : this.vmFileSystemStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotFileSystemStorage == null
                                ? 43
                                : this.snapshotFileSystemStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.totalFileSystemStorage == null
                                ? 43
                                : this.totalFileSystemStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.exascaleDbStorageVaultId == null
                                ? 43
                                : this.exascaleDbStorageVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
