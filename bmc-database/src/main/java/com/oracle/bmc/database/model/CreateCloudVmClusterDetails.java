/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the create cloud VM cluster operation. Applies to Exadata Cloud Service instances only.
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
    builder = CreateCloudVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCloudVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "subscriptionId",
        "subnetId",
        "backupSubnetId",
        "cpuCoreCount",
        "ocpuCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dataStorageSizeInTBs",
        "dbServers",
        "clusterName",
        "dataStoragePercentage",
        "displayName",
        "cloudExadataInfrastructureId",
        "hostname",
        "domain",
        "sshPublicKeys",
        "licenseModel",
        "isSparseDiskgroupEnabled",
        "isLocalBackupEnabled",
        "timeZone",
        "scanListenerPortTcp",
        "scanListenerPortTcpSsl",
        "privateZoneId",
        "nsgIds",
        "backupNetworkNsgIds",
        "giVersion",
        "freeformTags",
        "definedTags",
        "securityAttributes",
        "dataCollectionOptions",
        "systemVersion",
        "fileSystemConfigurationDetails",
        "cloudAutomationUpdateDetails",
        "vmClusterType"
    })
    public CreateCloudVmClusterDetails(
            String compartmentId,
            String subscriptionId,
            String subnetId,
            String backupSubnetId,
            Integer cpuCoreCount,
            Float ocpuCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Double dataStorageSizeInTBs,
            java.util.List<String> dbServers,
            String clusterName,
            Integer dataStoragePercentage,
            String displayName,
            String cloudExadataInfrastructureId,
            String hostname,
            String domain,
            java.util.List<String> sshPublicKeys,
            LicenseModel licenseModel,
            Boolean isSparseDiskgroupEnabled,
            Boolean isLocalBackupEnabled,
            String timeZone,
            Integer scanListenerPortTcp,
            Integer scanListenerPortTcpSsl,
            String privateZoneId,
            java.util.List<String> nsgIds,
            java.util.List<String> backupNetworkNsgIds,
            String giVersion,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            DataCollectionOptions dataCollectionOptions,
            String systemVersion,
            java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails,
            CloudAutomationUpdateDetails cloudAutomationUpdateDetails,
            VmClusterType vmClusterType) {
        super();
        this.compartmentId = compartmentId;
        this.subscriptionId = subscriptionId;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.cpuCoreCount = cpuCoreCount;
        this.ocpuCount = ocpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dbServers = dbServers;
        this.clusterName = clusterName;
        this.dataStoragePercentage = dataStoragePercentage;
        this.displayName = displayName;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.hostname = hostname;
        this.domain = domain;
        this.sshPublicKeys = sshPublicKeys;
        this.licenseModel = licenseModel;
        this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.timeZone = timeZone;
        this.scanListenerPortTcp = scanListenerPortTcp;
        this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
        this.privateZoneId = privateZoneId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.giVersion = giVersion;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
        this.dataCollectionOptions = dataCollectionOptions;
        this.systemVersion = systemVersion;
        this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
        this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
        this.vmClusterType = vmClusterType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription with which resource needs to be associated with.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription with which resource needs to be associated with.
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
        private String backupSubnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
         *
         * @param backupSubnetId the value to set
         * @return this builder
         **/
        public Builder backupSubnetId(String backupSubnetId) {
            this.backupSubnetId = backupSubnetId;
            this.__explicitlySet__.add("backupSubnetId");
            return this;
        }
        /**
         * The number of CPU cores to enable for a cloud VM cluster. Valid values depend on the specified shape:
         * <p>
         * - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48.
         * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
         * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
         * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
         * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92.
         * - Exadata.Half2.184 - Specify a multiple of 4, from 0 to 184.
         * - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores to enable for a cloud VM cluster. Valid values depend on the specified shape:
         * <p>
         * - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48.
         * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
         * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
         * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
         * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92.
         * - Exadata.Half2.184 - Specify a multiple of 4, from 0 to 184.
         * - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The number of OCPU cores to enable for a cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to enable for a cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
         * @param ocpuCount the value to set
         * @return this builder
         **/
        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /**
         * The memory to be allocated in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory to be allocated in GBs.
         * @param memorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The local node storage to be allocated in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage to be allocated in GBs.
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /**
         * The data disk group size to be allocated in TBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * The data disk group size to be allocated in TBs.
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * The list of DB servers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of DB servers.
         * @param dbServers the value to set
         * @return this builder
         **/
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }
        /**
         * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
         *
         * @param clusterName the value to set
         * @return this builder
         **/
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * The percentage assigned to DATA storage (user data and database files).
         * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
        private Integer dataStoragePercentage;

        /**
         * The percentage assigned to DATA storage (user data and database files).
         * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
         *
         * @param dataStoragePercentage the value to set
         * @return this builder
         **/
        public Builder dataStoragePercentage(Integer dataStoragePercentage) {
            this.dataStoragePercentage = dataStoragePercentage;
            this.__explicitlySet__.add("dataStoragePercentage");
            return this;
        }
        /**
         * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
            return this;
        }
        /**
         * The hostname for the cloud VM cluster. The hostname must begin with an alphabetic character, and
         * can contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16 characters for bare metal and virtual machine DB systems, and 12 characters for Exadata systems.
         * <p>
         * The maximum length of the combined hostname and domain is 63 characters.
         * <p>
         **Note:** The hostname must be unique within the subnet. If it is not unique,
         * the cloud VM Cluster will fail to provision.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the cloud VM cluster. The hostname must begin with an alphabetic character, and
         * can contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16 characters for bare metal and virtual machine DB systems, and 12 characters for Exadata systems.
         * <p>
         * The maximum length of the combined hostname and domain is 63 characters.
         * <p>
         **Note:** The hostname must be unique within the subnet. If it is not unique,
         * the cloud VM Cluster will fail to provision.
         *
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * A domain name used for the cloud VM cluster. If the Oracle-provided internet and VCN
         * resolver is enabled for the specified subnet, the domain name for the subnet is used
         * (do not provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         * Applies to Exadata Cloud Service instances only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * A domain name used for the cloud VM cluster. If the Oracle-provided internet and VCN
         * resolver is enabled for the specified subnet, the domain name for the subnet is used
         * (do not provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
         * Applies to Exadata Cloud Service instances only.
         *
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
         * @param sshPublicKeys the value to set
         * @return this builder
         **/
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The Oracle license model that applies to the cloud VM cluster. The default is BRING_YOUR_OWN_LICENSE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the cloud VM cluster. The default is BRING_YOUR_OWN_LICENSE.
         *
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * If true, the sparse disk group is configured for the cloud VM cluster. If false, the sparse disk group is not created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
        private Boolean isSparseDiskgroupEnabled;

        /**
         * If true, the sparse disk group is configured for the cloud VM cluster. If false, the sparse disk group is not created.
         *
         * @param isSparseDiskgroupEnabled the value to set
         * @return this builder
         **/
        public Builder isSparseDiskgroupEnabled(Boolean isSparseDiskgroupEnabled) {
            this.isSparseDiskgroupEnabled = isSparseDiskgroupEnabled;
            this.__explicitlySet__.add("isSparseDiskgroupEnabled");
            return this;
        }
        /**
         * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        /**
         * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
         *
         * @param isLocalBackupEnabled the value to set
         * @return this builder
         **/
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = isLocalBackupEnabled;
            this.__explicitlySet__.add("isLocalBackupEnabled");
            return this;
        }
        /**
         * The time zone to use for the cloud VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the cloud VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
        private Integer scanListenerPortTcp;

        /**
         * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
         * @param scanListenerPortTcp the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTcp(Integer scanListenerPortTcp) {
            this.scanListenerPortTcp = scanListenerPortTcp;
            this.__explicitlySet__.add("scanListenerPortTcp");
            return this;
        }
        /**
         * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
        private Integer scanListenerPortTcpSsl;

        /**
         * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
         * @param scanListenerPortTcpSsl the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTcpSsl(Integer scanListenerPortTcpSsl) {
            this.scanListenerPortTcpSsl = scanListenerPortTcpSsl;
            this.__explicitlySet__.add("scanListenerPortTcpSsl");
            return this;
        }
        /**
         * The private zone id in which DNS records need to be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
        private String privateZoneId;

        /**
         * The private zone id in which DNS records need to be created.
         * @param privateZoneId the value to set
         * @return this builder
         **/
        public Builder privateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            this.__explicitlySet__.add("privateZoneId");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
        private java.util.List<String> backupNetworkNsgIds;

        /**
         * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
         *
         * @param backupNetworkNsgIds the value to set
         * @return this builder
         **/
        public Builder backupNetworkNsgIds(java.util.List<String> backupNetworkNsgIds) {
            this.backupNetworkNsgIds = backupNetworkNsgIds;
            this.__explicitlySet__.add("backupNetworkNsgIds");
            return this;
        }
        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         * @param giVersion the value to set
         * @return this builder
         **/
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         **/
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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
         * Operating system version of the image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         * @param systemVersion the value to set
         * @return this builder
         **/
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
            return this;
        }
        /**
         * Details of the file system configuration of the VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
        private java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

        /**
         * Details of the file system configuration of the VM cluster.
         * @param fileSystemConfigurationDetails the value to set
         * @return this builder
         **/
        public Builder fileSystemConfigurationDetails(
                java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails) {
            this.fileSystemConfigurationDetails = fileSystemConfigurationDetails;
            this.__explicitlySet__.add("fileSystemConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
        private CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

        public Builder cloudAutomationUpdateDetails(
                CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
            this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
            this.__explicitlySet__.add("cloudAutomationUpdateDetails");
            return this;
        }
        /**
         * The vmcluster type for the VM cluster/Cloud VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
        private VmClusterType vmClusterType;

        /**
         * The vmcluster type for the VM cluster/Cloud VM cluster.
         * @param vmClusterType the value to set
         * @return this builder
         **/
        public Builder vmClusterType(VmClusterType vmClusterType) {
            this.vmClusterType = vmClusterType;
            this.__explicitlySet__.add("vmClusterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCloudVmClusterDetails build() {
            CreateCloudVmClusterDetails model =
                    new CreateCloudVmClusterDetails(
                            this.compartmentId,
                            this.subscriptionId,
                            this.subnetId,
                            this.backupSubnetId,
                            this.cpuCoreCount,
                            this.ocpuCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.dataStorageSizeInTBs,
                            this.dbServers,
                            this.clusterName,
                            this.dataStoragePercentage,
                            this.displayName,
                            this.cloudExadataInfrastructureId,
                            this.hostname,
                            this.domain,
                            this.sshPublicKeys,
                            this.licenseModel,
                            this.isSparseDiskgroupEnabled,
                            this.isLocalBackupEnabled,
                            this.timeZone,
                            this.scanListenerPortTcp,
                            this.scanListenerPortTcpSsl,
                            this.privateZoneId,
                            this.nsgIds,
                            this.backupNetworkNsgIds,
                            this.giVersion,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes,
                            this.dataCollectionOptions,
                            this.systemVersion,
                            this.fileSystemConfigurationDetails,
                            this.cloudAutomationUpdateDetails,
                            this.vmClusterType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCloudVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("backupSubnetId")) {
                this.backupSubnetId(model.getBackupSubnetId());
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
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("isSparseDiskgroupEnabled")) {
                this.isSparseDiskgroupEnabled(model.getIsSparseDiskgroupEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLocalBackupEnabled")) {
                this.isLocalBackupEnabled(model.getIsLocalBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
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
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkNsgIds")) {
                this.backupNetworkNsgIds(model.getBackupNetworkNsgIds());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
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
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("systemVersion")) {
                this.systemVersion(model.getSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("fileSystemConfigurationDetails")) {
                this.fileSystemConfigurationDetails(model.getFileSystemConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("cloudAutomationUpdateDetails")) {
                this.cloudAutomationUpdateDetails(model.getCloudAutomationUpdateDetails());
            }
            if (model.wasPropertyExplicitlySet("vmClusterType")) {
                this.vmClusterType(model.getVmClusterType());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription with which resource needs to be associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription with which resource needs to be associated with.
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet associated with the cloud VM cluster.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the backup network subnet associated with the cloud VM cluster.
     *
     * @return the value
     **/
    public String getBackupSubnetId() {
        return backupSubnetId;
    }

    /**
     * The number of CPU cores to enable for a cloud VM cluster. Valid values depend on the specified shape:
     * <p>
     * - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48.
     * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
     * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
     * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92.
     * - Exadata.Half2.184 - Specify a multiple of 4, from 0 to 184.
     * - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores to enable for a cloud VM cluster. Valid values depend on the specified shape:
     * <p>
     * - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48.
     * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
     * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
     * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92.
     * - Exadata.Half2.184 - Specify a multiple of 4, from 0 to 184.
     * - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
     *
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The number of OCPU cores to enable for a cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to enable for a cloud VM cluster. Only 1 decimal place is allowed for the fractional part.
     * @return the value
     **/
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The memory to be allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory to be allocated in GBs.
     * @return the value
     **/
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The local node storage to be allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage to be allocated in GBs.
     * @return the value
     **/
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /**
     * The data disk group size to be allocated in TBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * The data disk group size to be allocated in TBs.
     * @return the value
     **/
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * The list of DB servers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of DB servers.
     * @return the value
     **/
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /**
     * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for cloud VM cluster. The cluster name must begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     * @return the value
     **/
    public String getClusterName() {
        return clusterName;
    }

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    private final Integer dataStoragePercentage;

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups). Accepted values are 35, 40, 60 and 80. The default is 80 percent assigned to DATA storage. See [Storage Configuration](https://docs.oracle.com/iaas/Content/Database/Concepts/exaoverview.htm#Exadata) in the Exadata documentation for details on the impact of the configuration settings on storage.
     *
     * @return the value
     **/
    public Integer getDataStoragePercentage() {
        return dataStoragePercentage;
    }

    /**
     * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud VM cluster. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure resource.
     * @return the value
     **/
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }

    /**
     * The hostname for the cloud VM cluster. The hostname must begin with an alphabetic character, and
     * can contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16 characters for bare metal and virtual machine DB systems, and 12 characters for Exadata systems.
     * <p>
     * The maximum length of the combined hostname and domain is 63 characters.
     * <p>
     **Note:** The hostname must be unique within the subnet. If it is not unique,
     * the cloud VM Cluster will fail to provision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the cloud VM cluster. The hostname must begin with an alphabetic character, and
     * can contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16 characters for bare metal and virtual machine DB systems, and 12 characters for Exadata systems.
     * <p>
     * The maximum length of the combined hostname and domain is 63 characters.
     * <p>
     **Note:** The hostname must be unique within the subnet. If it is not unique,
     * the cloud VM Cluster will fail to provision.
     *
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * A domain name used for the cloud VM cluster. If the Oracle-provided internet and VCN
     * resolver is enabled for the specified subnet, the domain name for the subnet is used
     * (do not provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * Applies to Exadata Cloud Service instances only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the cloud VM cluster. If the Oracle-provided internet and VCN
     * resolver is enabled for the specified subnet, the domain name for the subnet is used
     * (do not provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     * Applies to Exadata Cloud Service instances only.
     *
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the cloud VM cluster.
     * @return the value
     **/
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The Oracle license model that applies to the cloud VM cluster. The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the cloud VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the cloud VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * If true, the sparse disk group is configured for the cloud VM cluster. If false, the sparse disk group is not created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSparseDiskgroupEnabled")
    private final Boolean isSparseDiskgroupEnabled;

    /**
     * If true, the sparse disk group is configured for the cloud VM cluster. If false, the sparse disk group is not created.
     *
     * @return the value
     **/
    public Boolean getIsSparseDiskgroupEnabled() {
        return isSparseDiskgroupEnabled;
    }

    /**
     * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    private final Boolean isLocalBackupEnabled;

    /**
     * If true, database backup on local Exadata storage is configured for the cloud VM cluster. If false, database backup on local Exadata storage is not available in the cloud VM cluster.
     *
     * @return the value
     **/
    public Boolean getIsLocalBackupEnabled() {
        return isLocalBackupEnabled;
    }

    /**
     * The time zone to use for the cloud VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the cloud VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcp")
    private final Integer scanListenerPortTcp;

    /**
     * The TCP Single Client Access Name (SCAN) port. The default port is 1521.
     * @return the value
     **/
    public Integer getScanListenerPortTcp() {
        return scanListenerPortTcp;
    }

    /**
     * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTcpSsl")
    private final Integer scanListenerPortTcpSsl;

    /**
     * The TCPS Single Client Access Name (SCAN) port. The default port is 2484.
     * @return the value
     **/
    public Integer getScanListenerPortTcpSsl() {
        return scanListenerPortTcpSsl;
    }

    /**
     * The private zone id in which DNS records need to be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateZoneId")
    private final String privateZoneId;

    /**
     * The private zone id in which DNS records need to be created.
     * @return the value
     **/
    public String getPrivateZoneId() {
        return privateZoneId;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    private final java.util.List<String> backupNetworkNsgIds;

    /**
     * A list of the [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that the backup network of this DB system belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm). Applicable only to Exadata systems.
     *
     * @return the value
     **/
    public java.util.List<String> getBackupNetworkNsgIds() {
        return backupNetworkNsgIds;
    }

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     * @return the value
     **/
    public String getGiVersion() {
        return giVersion;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /**
     * Operating system version of the image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     * @return the value
     **/
    public String getSystemVersion() {
        return systemVersion;
    }

    /**
     * Details of the file system configuration of the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemConfigurationDetails")
    private final java.util.List<FileSystemConfigurationDetail> fileSystemConfigurationDetails;

    /**
     * Details of the file system configuration of the VM cluster.
     * @return the value
     **/
    public java.util.List<FileSystemConfigurationDetail> getFileSystemConfigurationDetails() {
        return fileSystemConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
    private final CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

    public CloudAutomationUpdateDetails getCloudAutomationUpdateDetails() {
        return cloudAutomationUpdateDetails;
    }

    /**
     * The vmcluster type for the VM cluster/Cloud VM cluster.
     **/
    public enum VmClusterType {
        Regular("REGULAR"),
        Developer("DEVELOPER"),
        ;

        private final String value;
        private static java.util.Map<String, VmClusterType> map;

        static {
            map = new java.util.HashMap<>();
            for (VmClusterType v : VmClusterType.values()) {
                map.put(v.getValue(), v);
            }
        }

        VmClusterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VmClusterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VmClusterType: " + key);
        }
    };
    /**
     * The vmcluster type for the VM cluster/Cloud VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
    private final VmClusterType vmClusterType;

    /**
     * The vmcluster type for the VM cluster/Cloud VM cluster.
     * @return the value
     **/
    public VmClusterType getVmClusterType() {
        return vmClusterType;
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
        sb.append("CreateCloudVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", dataStoragePercentage=").append(String.valueOf(this.dataStoragePercentage));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", isSparseDiskgroupEnabled=")
                .append(String.valueOf(this.isSparseDiskgroupEnabled));
        sb.append(", isLocalBackupEnabled=").append(String.valueOf(this.isLocalBackupEnabled));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", scanListenerPortTcp=").append(String.valueOf(this.scanListenerPortTcp));
        sb.append(", scanListenerPortTcpSsl=").append(String.valueOf(this.scanListenerPortTcpSsl));
        sb.append(", privateZoneId=").append(String.valueOf(this.privateZoneId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", fileSystemConfigurationDetails=")
                .append(String.valueOf(this.fileSystemConfigurationDetails));
        sb.append(", cloudAutomationUpdateDetails=")
                .append(String.valueOf(this.cloudAutomationUpdateDetails));
        sb.append(", vmClusterType=").append(String.valueOf(this.vmClusterType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCloudVmClusterDetails)) {
            return false;
        }

        CreateCloudVmClusterDetails other = (CreateCloudVmClusterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.dataStoragePercentage, other.dataStoragePercentage)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.isSparseDiskgroupEnabled, other.isSparseDiskgroupEnabled)
                && java.util.Objects.equals(this.isLocalBackupEnabled, other.isLocalBackupEnabled)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.scanListenerPortTcp, other.scanListenerPortTcp)
                && java.util.Objects.equals(
                        this.scanListenerPortTcpSsl, other.scanListenerPortTcpSsl)
                && java.util.Objects.equals(this.privateZoneId, other.privateZoneId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(
                        this.fileSystemConfigurationDetails, other.fileSystemConfigurationDetails)
                && java.util.Objects.equals(
                        this.cloudAutomationUpdateDetails, other.cloudAutomationUpdateDetails)
                && java.util.Objects.equals(this.vmClusterType, other.vmClusterType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSubnetId == null ? 43 : this.backupSubnetId.hashCode());
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isSparseDiskgroupEnabled == null
                                ? 43
                                : this.isSparseDiskgroupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalBackupEnabled == null
                                ? 43
                                : this.isLocalBackupEnabled.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
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
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkNsgIds == null
                                ? 43
                                : this.backupNetworkNsgIds.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSystemConfigurationDetails == null
                                ? 43
                                : this.fileSystemConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutomationUpdateDetails == null
                                ? 43
                                : this.cloudAutomationUpdateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterType == null ? 43 : this.vmClusterType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
