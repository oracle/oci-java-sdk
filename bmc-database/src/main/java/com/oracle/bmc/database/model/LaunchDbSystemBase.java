/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@lombok.experimental.NonFinal
@lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
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
     * The Availability Domain where the DB System is located.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the backup network subnet the DB System is associated with. Applicable only to Exadata.
     * <p>
     **Subnet Restrictions:** See above subnetId's **Subnet Restriction**.
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
     * The Oracle Cloud ID (OCID) of the compartment the DB System  belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The number of CPU cores to enable. The valid values depend on the specified shape:
     * <p>
     * - BM.DenseIO1.36 and BM.HighIO1.36 - Specify a multiple of 2, from 2 to 36.
     * - BM.RACLocalStorage1.72 - Specify a multiple of 4, from 4 to 72.
     * - Exadata.Quarter1.84 - Specify a multiple of 2, from 22 to 84.
     * - Exadata.Half1.168 - Specify a multiple of 4, from 44 to 168.
     * - Exadata.Full1.336 - Specify a multiple of 8, from 88 to 336.
     * <p>
     * For VM DB systems, the core count is inferred from the specific VM shape chosen, so this parameter is not used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The percentage assigned to DATA storage (user data and database files).
     * The remaining percentage is assigned to RECO storage (database redo logs, archive logs, and recovery manager backups).
     * Specify 80 or 40. The default is 80 percent assigned to DATA storage. This is not applicable for VM based DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStoragePercentage")
    Integer dataStoragePercentage;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A domain name used for the DB System. If the Oracle-provided Internet and VCN
     * Resolver is enabled for the specified subnet, the domain name for the subnet is used
     * (don't provide one). Otherwise, provide a valid DNS domain name. Hyphens (-) are not permitted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The host name for the DB System. The host name must begin with an alphabetic character and
     * can contain a maximum of 30 alphanumeric characters, including hyphens (-).
     * <p>
     * The maximum length of the combined hostname and domain is 63 characters.
     * <p>
     **Note:** The hostname must be unique within the subnet. If it is not unique,
     * the DB System will fail to provision.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * Size, in GBs, of the initial data volume that will be created and attached to VM-shape based DB system. This storage can later be scaled up if needed. Note that the total storage size attached will be more than what is requested, to account for REDO/RECO space and software volume.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialDataStorageSizeInGB")
    Integer initialDataStorageSizeInGB;

    /**
     * Number of nodes to launch for a VM-shape based RAC DB system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    Integer nodeCount;

    /**
     * The shape of the DB System. The shape determines resources allocated to the DB System - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes. To get a list of shapes, use the {@link #listDbSystemShapes(ListDbSystemShapesRequest) listDbSystemShapes} operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The public key portion of the key pair to use for SSH access to the DB System. Multiple public keys can be provided. The length of the combined keys cannot exceed 10,000 characters.
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
}
