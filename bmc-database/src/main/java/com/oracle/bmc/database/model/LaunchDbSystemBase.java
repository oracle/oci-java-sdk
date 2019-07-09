/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * Parameters for provisioning a bare metal, virtual machine, or Exadata DB system.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = LaunchDbSystemBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LaunchDbSystemDetails.class,
        name = "NONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = LaunchDbSystemFromBackupDetails.class,
        name = "DB_BACKUP"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LaunchDbSystemBase {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment the DB system  belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A Fault Domain is a grouping of hardware and infrastructure within an availability domain.
     * Fault Domains let you distribute your instances so that they are not on the same physical
     * hardware within a single availability domain. A hardware failure or maintenance
     * that affects one Fault Domain does not affect DB systems in other Fault Domains.
     * <p>
     * If you do not specify the Fault Domain, the system selects one for you. To change the Fault
     * Domain for a DB system, terminate it and launch a new DB system in the preferred Fault Domain.
     * <p>
     * If the node count is greater than 1, you can specify which Fault Domains these nodes will be distributed into.
     * The system assigns your nodes automatically to the Fault Domains you specify so that
     * no Fault Domain contains more than one node.
     * <p>
     * To get a list of Fault Domains, use the
     * {@link #listFaultDomains(ListFaultDomainsRequest) listFaultDomains} operation in the
     * Identity and Access Management Service API.
     * <p>
     * Example: `FAULT-DOMAIN-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomains")
    java.util.List<String> faultDomains;

    /**
     * The user-friendly name for the DB system. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The availability domain where the DB system is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the DB system is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC DB systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and the backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup network subnet the DB system is associated with. Applicable only to Exadata DB systems.
     * <p>
     **Subnet Restrictions:** See the subnet restrictions information for **subnetId**.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSubnetId")
    String backupSubnetId;

    /**
     * The list of Network Security Group [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with this DB system.
     * A maximum of 5 allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    /**
     * The list of Network Security Group [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the backup network of this DB system.
     * Applicable only to Exadata DB systems.
     * A maximum of 5 allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkNsgIds")
    java.util.List<String> backupNetworkNsgIds;

    /**
     * The shape of the DB system. The shape determines resources allocated to the DB system.
     * - For virtual machine shapes, the number of CPU cores and memory
     * - For bare metal and Exadata shapes, the number of CPU cores, memory, and storage
     * <p>
     * To get a list of shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The time zone to use for the DB system. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    String timeZone;

    /**
     * If true, Sparse Diskgroup is configured for Exadata dbsystem. If False, Sparse diskgroup is not configured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparseDiskgroup")
    Boolean sparseDiskgroup;

    /**
     * The public key portion of the key pair to use for SSH access to the DB system. Multiple public keys can be provided. The length of the combined keys cannot exceed 40,000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    java.util.List<String> sshPublicKeys;

    /**
     * The hostname for the DB system. The hostname must begin with an alphabetic character, and
     * can contain alphanumeric characters and hyphens (-). The maximum length of the hostname is 16 characters for bare metal and virtual machine DB systems, and 12 characters for Exadata DB systems.
     * <p>
     * The maximum length of the combined hostname and domain is 63 characters.
     * <p>
     **Note:** The hostname must be unique within the subnet. If it is not unique,
     * the DB system will fail to provision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * A domain name used for the DB system. If the Oracle-provided Internet and VCN
     * Resolver is enabled for the specified subnet, the domain name for the subnet is used
     * (do not provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * The number of CPU cores to enable for a bare metal or Exadata DB system. The valid values depend on the specified shape:
     * <p>
     * - BM.DenseIO1.36 - Specify a multiple of 2, from 2 to 36.
     * - BM.DenseIO2.52 - Specify a multiple of 2, from 2 to 52.
     * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
     * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
     * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * - Exadata.Quarter2.92 - Specify a multiple of 2, from 0 to 92.
     * - Exadata.Half2.184 - Specify a multiple of 4, from 0 to 184.
     * - Exadata.Full2.368 - Specify a multiple of 8, from 0 to 368.
     * <p>
     * This parameter is not used for virtual machine DB systems because virtual machine DB systems have a set number of cores for each shape.
     * For information about the number of cores for a virtual machine DB system shape, see [Virtual Machine DB Systems](https://docs.cloud.oracle.com/Content/Database/Concepts/overview.htm#virtualmachine)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The cluster name for Exadata and 2-node RAC virtual machine DB systems. The cluster name must begin with an an alphabetic character, and may contain hyphens (-). Underscores (_) are not permitted. The cluster name can be no longer than 11 characters and is not case sensitive.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    String clusterName;

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups).
     * Specify 80 or 40. The default is 80 percent assigned to DATA storage. Not applicable for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    Integer dataStoragePercentage;

    /**
     * Size (in GB) of the initial data volume that will be created and attached to a virtual machine DB system. You can scale up storage after provisioning, as needed. Note that the total storage size attached will be more than the amount you specify to allow for REDO/RECO space and software volume.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialDataStorageSizeInGB")
    Integer initialDataStorageSizeInGB;

    /**
     * The number of nodes to launch for a 2-node RAC virtual machine DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    Integer nodeCount;

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
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
}
