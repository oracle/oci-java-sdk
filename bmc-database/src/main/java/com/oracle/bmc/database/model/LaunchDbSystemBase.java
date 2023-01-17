/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for provisioning a bare metal, virtual machine, or Exadata DB system.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source",
        defaultImpl = LaunchDbSystemBase.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LaunchDbSystemDetails.class,
            name = "NONE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LaunchDbSystemFromDbSystemDetails.class,
            name = "DB_SYSTEM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LaunchDbSystemFromDatabaseDetails.class,
            name = "DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LaunchDbSystemFromBackupDetails.class,
            name = "DB_BACKUP")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class LaunchDbSystemBase extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "faultDomains",
        "displayName",
        "availabilityDomain",
        "subnetId",
        "backupSubnetId",
        "nsgIds",
        "backupNetworkNsgIds",
        "shape",
        "timeZone",
        "dbSystemOptions",
        "storageVolumePerformanceMode",
        "sparseDiskgroup",
        "sshPublicKeys",
        "hostname",
        "domain",
        "cpuCoreCount",
        "clusterName",
        "dataStoragePercentage",
        "initialDataStorageSizeInGB",
        "kmsKeyId",
        "kmsKeyVersionId",
        "nodeCount",
        "freeformTags",
        "definedTags",
        "privateIp",
        "dataCollectionOptions"
    })
    protected LaunchDbSystemBase(
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
            DataCollectionOptions dataCollectionOptions) {
        super();
        this.compartmentId = compartmentId;
        this.faultDomains = faultDomains;
        this.displayName = displayName;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.backupSubnetId = backupSubnetId;
        this.nsgIds = nsgIds;
        this.backupNetworkNsgIds = backupNetworkNsgIds;
        this.shape = shape;
        this.timeZone = timeZone;
        this.dbSystemOptions = dbSystemOptions;
        this.storageVolumePerformanceMode = storageVolumePerformanceMode;
        this.sparseDiskgroup = sparseDiskgroup;
        this.sshPublicKeys = sshPublicKeys;
        this.hostname = hostname;
        this.domain = domain;
        this.cpuCoreCount = cpuCoreCount;
        this.clusterName = clusterName;
        this.dataStoragePercentage = dataStoragePercentage;
        this.initialDataStorageSizeInGB = initialDataStorageSizeInGB;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.nodeCount = nodeCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.privateIp = privateIp;
        this.dataCollectionOptions = dataCollectionOptions;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment the DB system belongs in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment the DB system belongs in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A Fault Domain is a grouping of hardware and infrastructure within an availability domain.
     * Fault Domains let you distribute your instances so that they are not on the same physical
     * hardware within a single availability domain. A hardware failure or maintenance that affects
     * one Fault Domain does not affect DB systems in other Fault Domains.
     *
     * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
     * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred Fault
     * Domain.
     *
     * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes will
     * be distributed into. The system assigns your nodes automatically to the Fault Domains you
     * specify so that no Fault Domain contains more than one node.
     *
     * <p>To get a list of Fault Domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    private final java.util.List<String> faultDomains;

    /**
     * A Fault Domain is a grouping of hardware and infrastructure within an availability domain.
     * Fault Domains let you distribute your instances so that they are not on the same physical
     * hardware within a single availability domain. A hardware failure or maintenance that affects
     * one Fault Domain does not affect DB systems in other Fault Domains.
     *
     * <p>If you do not specify the Fault Domain, the system selects one for you. To change the
     * Fault Domain for a DB system, terminate it and launch a new DB system in the preferred Fault
     * Domain.
     *
     * <p>If the node count is greater than 1, you can specify which Fault Domains these nodes will
     * be distributed into. The system assigns your nodes automatically to the Fault Domains you
     * specify so that no Fault Domain contains more than one node.
     *
     * <p>To get a list of Fault Domains, use the {@link #listFaultDomains(ListFaultDomainsRequest)
     * listFaultDomains} operation in the Identity and Access Management Service API.
     *
     * <p>Example: {@code FAULT-DOMAIN-1}
     *
     * @return the value
     */
    public java.util.List<String> getFaultDomains() {
        return faultDomains;
    }

    /** The user-friendly name for the DB system. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the DB system. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The availability domain where the DB system is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain where the DB system is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet the DB system is associated with.
     *
     * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual machine DB
     * systems, do not use a subnet that overlaps with 192.168.16.16/28. - For Exadata and virtual
     * machine 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.128.0/20.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and the backup subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet the DB system is associated with.
     *
     * <p>*Subnet Restrictions:** - For bare metal DB systems and for single node virtual machine DB
     * systems, do not use a subnet that overlaps with 192.168.16.16/28. - For Exadata and virtual
     * machine 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.128.0/20.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and the backup subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet the DB system is associated with. Applicable only to Exadata DB
     * systems.
     *
     * <p>*Subnet Restrictions:** See the subnet restrictions information for **subnetId**.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    private final String backupSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * backup network subnet the DB system is associated with. Applicable only to Exadata DB
     * systems.
     *
     * <p>*Subnet Restrictions:** See the subnet restrictions information for **subnetId**.
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
     * The shape of the DB system. The shape determines resources allocated to the DB system. - For
     * virtual machine shapes, the number of CPU cores and memory - For bare metal and Exadata
     * shapes, the number of CPU cores, memory, and storage
     *
     * <p>To get a list of shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest)
     * listDbSystemShapes} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the DB system. The shape determines resources allocated to the DB system. - For
     * virtual machine shapes, the number of CPU cores and memory - For bare metal and Exadata
     * shapes, the number of CPU cores, memory, and storage
     *
     * <p>To get a list of shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest)
     * listDbSystemShapes} operation.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The time zone to use for the DB system. For details, see [DB System Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the DB system. For details, see [DB System Time
     * Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemOptions")
    private final DbSystemOptions dbSystemOptions;

    public DbSystemOptions getDbSystemOptions() {
        return dbSystemOptions;
    }

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     */
    public enum StorageVolumePerformanceMode implements com.oracle.bmc.http.internal.BmcEnum {
        Balanced("BALANCED"),
        HighPerformance("HIGH_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, StorageVolumePerformanceMode> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageVolumePerformanceMode v : StorageVolumePerformanceMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        StorageVolumePerformanceMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageVolumePerformanceMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StorageVolumePerformanceMode: " + key);
        }
    };
    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageVolumePerformanceMode")
    private final StorageVolumePerformanceMode storageVolumePerformanceMode;

    /**
     * The block storage volume performance level. Valid values are {@code BALANCED} and {@code
     * HIGH_PERFORMANCE}. See [Block Volume
     * Performance](https://docs.cloud.oracle.com/Content/Block/Concepts/blockvolumeperformance.htm)
     * for more information.
     *
     * @return the value
     */
    public StorageVolumePerformanceMode getStorageVolumePerformanceMode() {
        return storageVolumePerformanceMode;
    }

    /**
     * If true, Sparse Diskgroup is configured for Exadata dbsystem. If False, Sparse diskgroup is
     * not configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sparseDiskgroup")
    private final Boolean sparseDiskgroup;

    /**
     * If true, Sparse Diskgroup is configured for Exadata dbsystem. If False, Sparse diskgroup is
     * not configured.
     *
     * @return the value
     */
    public Boolean getSparseDiskgroup() {
        return sparseDiskgroup;
    }

    /**
     * The public key portion of the key pair to use for SSH access to the DB system. Multiple
     * public keys can be provided. The length of the combined keys cannot exceed 40,000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of the key pair to use for SSH access to the DB system. Multiple
     * public keys can be provided. The length of the combined keys cannot exceed 40,000 characters.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The hostname for the DB system. The hostname must begin with an alphabetic character, and can
     * contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16
     * characters for bare metal and virtual machine DB systems, and 12 characters for Exadata DB
     * systems.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, the DB system
     * will fail to provision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the DB system. The hostname must begin with an alphabetic character, and can
     * contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16
     * characters for bare metal and virtual machine DB systems, and 12 characters for Exadata DB
     * systems.
     *
     * <p>The maximum length of the combined hostname and domain is 63 characters.
     *
     * <p>*Note:** The hostname must be unique within the subnet. If it is not unique, the DB system
     * will fail to provision.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
     * enabled for the specified subnet, the domain name for the subnet is used (do not provide
     * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * A domain name used for the DB system. If the Oracle-provided Internet and VCN Resolver is
     * enabled for the specified subnet, the domain name for the subnet is used (do not provide
     * one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * The number of CPU cores to enable for a bare metal or Exadata DB system or AMD VMDB Systems.
     * The valid values depend on the specified shape:
     *
     * <p>- BM.DenseIO1.36 - Specify a multiple of 2, from 2 to 36. - BM.DenseIO2.52 - Specify a
     * multiple of 2, from 2 to 52. - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48. -
     * Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84. - Exadata.Half1.168 - Specify a
     * multiple of 4, from 44 to 168. - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92. - Exadata.Half2.184 - Specify
     * a multiple of 4, from 0 to 184. - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
     * - VM.Standard.E4.Flex - Specify any thing from 1 to 64.
     *
     * <p>This parameter is not used for INTEL virtual machine DB systems because virtual machine DB
     * systems have a set number of cores for each shape. For information about the number of cores
     * for a virtual machine DB system shape, see [Virtual Machine DB
     * Systems](https://docs.cloud.oracle.com/Content/Database/Concepts/overview.htm#virtualmachine)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores to enable for a bare metal or Exadata DB system or AMD VMDB Systems.
     * The valid values depend on the specified shape:
     *
     * <p>- BM.DenseIO1.36 - Specify a multiple of 2, from 2 to 36. - BM.DenseIO2.52 - Specify a
     * multiple of 2, from 2 to 52. - Exadata.Base.48 - Specify a multiple of 2, from 0 to 48. -
     * Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84. - Exadata.Half1.168 - Specify a
     * multiple of 4, from 44 to 168. - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92. - Exadata.Half2.184 - Specify
     * a multiple of 4, from 0 to 184. - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
     * - VM.Standard.E4.Flex - Specify any thing from 1 to 64.
     *
     * <p>This parameter is not used for INTEL virtual machine DB systems because virtual machine DB
     * systems have a set number of cores for each shape. For information about the number of cores
     * for a virtual machine DB system shape, see [Virtual Machine DB
     * Systems](https://docs.cloud.oracle.com/Content/Database/Concepts/overview.htm#virtualmachine)
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The cluster name for Exadata and 2-node RAC virtual machine DB systems. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for Exadata and 2-node RAC virtual machine DB systems. The cluster name must
     * begin with an alphabetic character, and may contain hyphens (-). Underscores (_) are not
     * permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     * @return the value
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * The percentage assigned to DATA storage (user data and database files). The remaining
     * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
     * manager backups). Specify 80 or 40. The default is 80 percent assigned to DATA storage. Not
     * applicable for virtual machine DB systems.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    private final Integer dataStoragePercentage;

    /**
     * The percentage assigned to DATA storage (user data and database files). The remaining
     * percentage is assigned to RECO storage (database redo logs, archive logs, and recovery
     * manager backups). Specify 80 or 40. The default is 80 percent assigned to DATA storage. Not
     * applicable for virtual machine DB systems.
     *
     * @return the value
     */
    public Integer getDataStoragePercentage() {
        return dataStoragePercentage;
    }

    /**
     * Size (in GB) of the initial data volume that will be created and attached to a virtual
     * machine DB system. You can scale up storage after provisioning, as needed. Note that the
     * total storage size attached will be more than the amount you specify to allow for REDO/RECO
     * space and software volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDataStorageSizeInGB")
    private final Integer initialDataStorageSizeInGB;

    /**
     * Size (in GB) of the initial data volume that will be created and attached to a virtual
     * machine DB system. You can scale up storage after provisioning, as needed. Note that the
     * total storage size attached will be more than the amount you specify to allow for REDO/RECO
     * space and software volume.
     *
     * @return the value
     */
    public Integer getInitialDataStorageSizeInGB() {
        return initialDataStorageSizeInGB;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The number of nodes to launch for a 2-node RAC virtual machine DB system. Specify either 1 or
     * 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes to launch for a 2-node RAC virtual machine DB system. Specify either 1 or
     * 2.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
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
     * A private IP address of your choice. Must be an available IP address within the subnet's
     * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address from
     * the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * A private IP address of your choice. Must be an available IP address within the subnet's
     * CIDR. If you don't specify a value, Oracle automatically assigns a private IP address from
     * the subnet.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
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
        sb.append("LaunchDbSystemBase(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", faultDomains=").append(String.valueOf(this.faultDomains));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", backupSubnetId=").append(String.valueOf(this.backupSubnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", backupNetworkNsgIds=").append(String.valueOf(this.backupNetworkNsgIds));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", dbSystemOptions=").append(String.valueOf(this.dbSystemOptions));
        sb.append(", storageVolumePerformanceMode=")
                .append(String.valueOf(this.storageVolumePerformanceMode));
        sb.append(", sparseDiskgroup=").append(String.valueOf(this.sparseDiskgroup));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", dataStoragePercentage=").append(String.valueOf(this.dataStoragePercentage));
        sb.append(", initialDataStorageSizeInGB=")
                .append(String.valueOf(this.initialDataStorageSizeInGB));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchDbSystemBase)) {
            return false;
        }

        LaunchDbSystemBase other = (LaunchDbSystemBase) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.faultDomains, other.faultDomains)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.backupSubnetId, other.backupSubnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.backupNetworkNsgIds, other.backupNetworkNsgIds)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.dbSystemOptions, other.dbSystemOptions)
                && java.util.Objects.equals(
                        this.storageVolumePerformanceMode, other.storageVolumePerformanceMode)
                && java.util.Objects.equals(this.sparseDiskgroup, other.sparseDiskgroup)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.dataStoragePercentage, other.dataStoragePercentage)
                && java.util.Objects.equals(
                        this.initialDataStorageSizeInGB, other.initialDataStorageSizeInGB)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.faultDomains == null ? 43 : this.faultDomains.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemOptions == null ? 43 : this.dbSystemOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.storageVolumePerformanceMode == null
                                ? 43
                                : this.storageVolumePerformanceMode.hashCode());
        result =
                (result * PRIME)
                        + (this.sparseDiskgroup == null ? 43 : this.sparseDiskgroup.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStoragePercentage == null
                                ? 43
                                : this.dataStoragePercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.initialDataStorageSizeInGB == null
                                ? 43
                                : this.initialDataStorageSizeInGB.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the database: Use {@code NONE} for creating a new database. Use {@code
     * DB_BACKUP} for creating a new database by restoring from a backup. Use {@code DATABASE} for
     * creating a new database from an existing database, including archive redo log data. The
     * default is {@code NONE}.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        DbBackup("DB_BACKUP"),
        Database("DATABASE"),
        DbSystem("DB_SYSTEM"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
