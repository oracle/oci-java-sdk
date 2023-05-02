/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the cloud Autonomous VM cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloudAutonomousVmCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CloudAutonomousVmCluster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "description",
        "availabilityDomain",
        "subnetId",
        "nsgIds",
        "lastUpdateHistoryEntryId",
        "lifecycleState",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "clusterTimeZone",
        "lifecycleDetails",
        "hostname",
        "domain",
        "cloudExadataInfrastructureId",
        "shape",
        "nodeCount",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "cpuCoreCount",
        "ocpuCount",
        "computeModel",
        "isMtlsEnabledVmCluster",
        "cpuCoreCountPerNode",
        "memorySizeInGBs",
        "licenseModel",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "maintenanceWindow",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "freeformTags",
        "definedTags",
        "timeDatabaseSslCertificateExpires",
        "timeOrdsCertificateExpires",
        "availableCpus",
        "reclaimableCpus",
        "availableContainerDatabases",
        "totalContainerDatabases",
        "availableAutonomousDataStorageSizeInTBs",
        "autonomousDataStorageSizeInTBs",
        "dbNodeStorageSizeInGBs",
        "memoryPerOracleComputeUnitInGBs"
    })
    public CloudAutonomousVmCluster(
            String id,
            String compartmentId,
            String description,
            String availabilityDomain,
            String subnetId,
            java.util.List<String> nsgIds,
            String lastUpdateHistoryEntryId,
            LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String clusterTimeZone,
            String lifecycleDetails,
            String hostname,
            String domain,
            String cloudExadataInfrastructureId,
            String shape,
            Integer nodeCount,
            Double dataStorageSizeInTBs,
            Double dataStorageSizeInGBs,
            Integer cpuCoreCount,
            Float ocpuCount,
            ComputeModel computeModel,
            Boolean isMtlsEnabledVmCluster,
            Integer cpuCoreCountPerNode,
            Integer memorySizeInGBs,
            LicenseModel licenseModel,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            MaintenanceWindow maintenanceWindow,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeDatabaseSslCertificateExpires,
            java.util.Date timeOrdsCertificateExpires,
            Float availableCpus,
            Float reclaimableCpus,
            Integer availableContainerDatabases,
            Integer totalContainerDatabases,
            Double availableAutonomousDataStorageSizeInTBs,
            Double autonomousDataStorageSizeInTBs,
            Integer dbNodeStorageSizeInGBs,
            Integer memoryPerOracleComputeUnitInGBs) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.description = description;
        this.availabilityDomain = availabilityDomain;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.clusterTimeZone = clusterTimeZone;
        this.lifecycleDetails = lifecycleDetails;
        this.hostname = hostname;
        this.domain = domain;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.shape = shape;
        this.nodeCount = nodeCount;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.cpuCoreCount = cpuCoreCount;
        this.ocpuCount = ocpuCount;
        this.computeModel = computeModel;
        this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.memorySizeInGBs = memorySizeInGBs;
        this.licenseModel = licenseModel;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.maintenanceWindow = maintenanceWindow;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeDatabaseSslCertificateExpires = timeDatabaseSslCertificateExpires;
        this.timeOrdsCertificateExpires = timeOrdsCertificateExpires;
        this.availableCpus = availableCpus;
        this.reclaimableCpus = reclaimableCpus;
        this.availableContainerDatabases = availableContainerDatabases;
        this.totalContainerDatabases = totalContainerDatabases;
        this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Cloud Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Cloud Autonomous VM cluster.
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
        /** User defined description of the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User defined description of the cloud Autonomous VM cluster.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The name of the availability domain that the cloud Autonomous VM cluster is located in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the cloud Autonomous VM cluster is located in.
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
         * subnet the cloud Autonomous VM Cluster is associated with.
         *
         * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC DB systems, do
         * not use a subnet that overlaps with 192.168.128.0/20.
         *
         * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
         * instance. Specifying an overlapping subnet will cause the private interconnect to
         * malfunction. This restriction applies to both the client subnet and backup subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * subnet the cloud Autonomous VM Cluster is associated with.
         *
         * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC DB systems, do
         * not use a subnet that overlaps with 192.168.128.0/20.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance update history. This value is updated when a maintenance update starts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateHistoryEntryId")
        private String lastUpdateHistoryEntryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance update history. This value is updated when a maintenance update starts.
         *
         * @param lastUpdateHistoryEntryId the value to set
         * @return this builder
         */
        public Builder lastUpdateHistoryEntryId(String lastUpdateHistoryEntryId) {
            this.lastUpdateHistoryEntryId = lastUpdateHistoryEntryId;
            this.__explicitlySet__.add("lastUpdateHistoryEntryId");
            return this;
        }
        /** The current state of the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the cloud Autonomous VM cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
         * unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The date and time that the cloud Autonomous VM cluster was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the cloud Autonomous VM cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The last date and time that the cloud Autonomous VM cluster was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last date and time that the cloud Autonomous VM cluster was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The time zone of the Cloud Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
        private String clusterTimeZone;

        /**
         * The time zone of the Cloud Autonomous VM Cluster.
         *
         * @param clusterTimeZone the value to set
         * @return this builder
         */
        public Builder clusterTimeZone(String clusterTimeZone) {
            this.clusterTimeZone = clusterTimeZone;
            this.__explicitlySet__.add("clusterTimeZone");
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
        /** The hostname for the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname for the cloud Autonomous VM cluster.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The domain name for the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The domain name for the cloud Autonomous VM cluster.
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
        /** The model name of the Exadata hardware running the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The model name of the Exadata hardware running the cloud Autonomous VM cluster.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The number of database servers in the cloud VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of database servers in the cloud VM cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The total data storage allocated, in terabytes (TB). */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * The total data storage allocated, in terabytes (TB).
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The total data storage allocated, in gigabytes (GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        /**
         * The total data storage allocated, in gigabytes (GB).
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /** The number of CPU cores on the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores on the cloud Autonomous VM cluster.
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
         * The number of CPU cores on the cloud Autonomous VM cluster. Only 1 decimal place is
         * allowed for the fractional part.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of CPU cores on the cloud Autonomous VM cluster. Only 1 decimal place is
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
        /**
         * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous
         * Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous
         * Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster.
         * This is applicable to database TLS Certificates only. Default is TLS
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
        private Boolean isMtlsEnabledVmCluster;

        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster.
         * This is applicable to database TLS Certificates only. Default is TLS
         *
         * @param isMtlsEnabledVmCluster the value to set
         * @return this builder
         */
        public Builder isMtlsEnabledVmCluster(Boolean isMtlsEnabledVmCluster) {
            this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
            this.__explicitlySet__.add("isMtlsEnabledVmCluster");
            return this;
        }
        /** The number of CPU cores enabled per VM cluster node. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
        private Integer cpuCoreCountPerNode;

        /**
         * The number of CPU cores enabled per VM cluster node.
         *
         * @param cpuCoreCountPerNode the value to set
         * @return this builder
         */
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = cpuCoreCountPerNode;
            this.__explicitlySet__.add("cpuCoreCountPerNode");
            return this;
        }
        /** The memory allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The memory allocated in GBs.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
         * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
         * equivalent, highly automated Oracle PaaS and IaaS services in the cloud. License Included
         * allows you to subscribe to new Oracle Database software licenses and the Database
         * service. Note that when provisioning an Autonomous Database on [dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null because the attribute is already set at the Autonomous
         * Exadata Infrastructure level. When using [shared Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if
         * a value is not specified, the system will supply the value of {@code
         * BRING_YOUR_OWN_LICENSE}.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword,
         * isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName,
         * scheduledOperations, dbToolsDetails, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
         * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
         * equivalent, highly automated Oracle PaaS and IaaS services in the cloud. License Included
         * allows you to subscribe to new Oracle Database software licenses and the Database
         * service. Note that when provisioning an Autonomous Database on [dedicated Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html),
         * this attribute must be null because the attribute is already set at the Autonomous
         * Exadata Infrastructure level. When using [shared Exadata
         * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if
         * a value is not specified, the system will supply the value of {@code
         * BRING_YOUR_OWN_LICENSE}.
         *
         * <p>This cannot be updated in parallel with any of the following: cpuCoreCount,
         * computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword,
         * isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName,
         * scheduledOperations, dbToolsDetails, or isFreeTier.
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
         * last maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         *
         * @param lastMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         *
         * @param nextMaintenanceRunId the value to set
         * @return this builder
         */
        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /** The SCAN Listenenr TLS port. Default is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listenenr TLS port. Default is 2484.
         *
         * @param scanListenerPortTls the value to set
         * @return this builder
         */
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /** The SCAN Listener Non TLS port. Default is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port. Default is 1521.
         *
         * @param scanListenerPortNonTls the value to set
         * @return this builder
         */
        public Builder scanListenerPortNonTls(Integer scanListenerPortNonTls) {
            this.scanListenerPortNonTls = scanListenerPortNonTls;
            this.__explicitlySet__.add("scanListenerPortNonTls");
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
        /** The date and time of Database SSL certificate expiration. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDatabaseSslCertificateExpires")
        private java.util.Date timeDatabaseSslCertificateExpires;

        /**
         * The date and time of Database SSL certificate expiration.
         *
         * @param timeDatabaseSslCertificateExpires the value to set
         * @return this builder
         */
        public Builder timeDatabaseSslCertificateExpires(
                java.util.Date timeDatabaseSslCertificateExpires) {
            this.timeDatabaseSslCertificateExpires = timeDatabaseSslCertificateExpires;
            this.__explicitlySet__.add("timeDatabaseSslCertificateExpires");
            return this;
        }
        /** The date and time of ORDS certificate expiration. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOrdsCertificateExpires")
        private java.util.Date timeOrdsCertificateExpires;

        /**
         * The date and time of ORDS certificate expiration.
         *
         * @param timeOrdsCertificateExpires the value to set
         * @return this builder
         */
        public Builder timeOrdsCertificateExpires(java.util.Date timeOrdsCertificateExpires) {
            this.timeOrdsCertificateExpires = timeOrdsCertificateExpires;
            this.__explicitlySet__.add("timeOrdsCertificateExpires");
            return this;
        }
        /** CPU cores available for allocation to Autonomous Databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Float availableCpus;

        /**
         * CPU cores available for allocation to Autonomous Databases.
         *
         * @param availableCpus the value to set
         * @return this builder
         */
        public Builder availableCpus(Float availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
            return this;
        }
        /**
         * For Autonomous Databases on Dedicated Exadata Infrastructure: - These are the CPUs that
         * continue to be included in the count of CPUs available to the Autonomous Container
         * Database even after one of its Autonomous Database is terminated or scaled down. You can
         * release them to the available CPUs at its parent Autonomous VM Cluster level by
         * restarting the Autonomous Container Database. - The CPU type (OCPUs or ECPUs) is
         * determined by the parent Autonomous Exadata VM Cluster's compute model. See [Compute
         * Models in Autonomous Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * For Autonomous Databases on Dedicated Exadata Infrastructure: - These are the CPUs that
         * continue to be included in the count of CPUs available to the Autonomous Container
         * Database even after one of its Autonomous Database is terminated or scaled down. You can
         * release them to the available CPUs at its parent Autonomous VM Cluster level by
         * restarting the Autonomous Container Database. - The CPU type (OCPUs or ECPUs) is
         * determined by the parent Autonomous Exadata VM Cluster's compute model. See [Compute
         * Models in Autonomous Database on Dedicated Exadata
         * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
            return this;
        }
        /**
         * The number of Autonomous Container Databases that can be created with the currently
         * available local storage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableContainerDatabases")
        private Integer availableContainerDatabases;

        /**
         * The number of Autonomous Container Databases that can be created with the currently
         * available local storage.
         *
         * @param availableContainerDatabases the value to set
         * @return this builder
         */
        public Builder availableContainerDatabases(Integer availableContainerDatabases) {
            this.availableContainerDatabases = availableContainerDatabases;
            this.__explicitlySet__.add("availableContainerDatabases");
            return this;
        }
        /**
         * The total number of Autonomous Container Databases that can be created with the allocated
         * local storage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
        private Integer totalContainerDatabases;

        /**
         * The total number of Autonomous Container Databases that can be created with the allocated
         * local storage.
         *
         * @param totalContainerDatabases the value to set
         * @return this builder
         */
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = totalContainerDatabases;
            this.__explicitlySet__.add("totalContainerDatabases");
            return this;
        }
        /** The data disk group size available for Autonomous Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
        private Double availableAutonomousDataStorageSizeInTBs;

        /**
         * The data disk group size available for Autonomous Databases, in TBs.
         *
         * @param availableAutonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder availableAutonomousDataStorageSizeInTBs(
                Double availableAutonomousDataStorageSizeInTBs) {
            this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("availableAutonomousDataStorageSizeInTBs");
            return this;
        }
        /** The data disk group size allocated for Autonomous Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Double autonomousDataStorageSizeInTBs;

        /**
         * The data disk group size allocated for Autonomous Databases, in TBs.
         *
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder autonomousDataStorageSizeInTBs(Double autonomousDataStorageSizeInTBs) {
            this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("autonomousDataStorageSizeInTBs");
            return this;
        }
        /** The local node storage allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The local node storage allocated in GBs.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /** The amount of memory (in GBs) enabled per each CPU core. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) enabled per each CPU core.
         *
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudAutonomousVmCluster build() {
            CloudAutonomousVmCluster model =
                    new CloudAutonomousVmCluster(
                            this.id,
                            this.compartmentId,
                            this.description,
                            this.availabilityDomain,
                            this.subnetId,
                            this.nsgIds,
                            this.lastUpdateHistoryEntryId,
                            this.lifecycleState,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.clusterTimeZone,
                            this.lifecycleDetails,
                            this.hostname,
                            this.domain,
                            this.cloudExadataInfrastructureId,
                            this.shape,
                            this.nodeCount,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.cpuCoreCount,
                            this.ocpuCount,
                            this.computeModel,
                            this.isMtlsEnabledVmCluster,
                            this.cpuCoreCountPerNode,
                            this.memorySizeInGBs,
                            this.licenseModel,
                            this.lastMaintenanceRunId,
                            this.nextMaintenanceRunId,
                            this.maintenanceWindow,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.freeformTags,
                            this.definedTags,
                            this.timeDatabaseSslCertificateExpires,
                            this.timeOrdsCertificateExpires,
                            this.availableCpus,
                            this.reclaimableCpus,
                            this.availableContainerDatabases,
                            this.totalContainerDatabases,
                            this.availableAutonomousDataStorageSizeInTBs,
                            this.autonomousDataStorageSizeInTBs,
                            this.dbNodeStorageSizeInGBs,
                            this.memoryPerOracleComputeUnitInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudAutonomousVmCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("lastUpdateHistoryEntryId")) {
                this.lastUpdateHistoryEntryId(model.getLastUpdateHistoryEntryId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("clusterTimeZone")) {
                this.clusterTimeZone(model.getClusterTimeZone());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("isMtlsEnabledVmCluster")) {
                this.isMtlsEnabledVmCluster(model.getIsMtlsEnabledVmCluster());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("lastMaintenanceRunId")) {
                this.lastMaintenanceRunId(model.getLastMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceRunId")) {
                this.nextMaintenanceRunId(model.getNextMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTls")) {
                this.scanListenerPortTls(model.getScanListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortNonTls")) {
                this.scanListenerPortNonTls(model.getScanListenerPortNonTls());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("timeDatabaseSslCertificateExpires")) {
                this.timeDatabaseSslCertificateExpires(
                        model.getTimeDatabaseSslCertificateExpires());
            }
            if (model.wasPropertyExplicitlySet("timeOrdsCertificateExpires")) {
                this.timeOrdsCertificateExpires(model.getTimeOrdsCertificateExpires());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("availableContainerDatabases")) {
                this.availableContainerDatabases(model.getAvailableContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("availableAutonomousDataStorageSizeInTBs")) {
                this.availableAutonomousDataStorageSizeInTBs(
                        model.getAvailableAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
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
     * Cloud Autonomous VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Cloud Autonomous VM cluster.
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

    /** User defined description of the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User defined description of the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The name of the availability domain that the cloud Autonomous VM cluster is located in. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the cloud Autonomous VM cluster is located in.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet the cloud Autonomous VM Cluster is associated with.
     *
     * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC DB systems, do not
     * use a subnet that overlaps with 192.168.128.0/20.
     *
     * <p>These subnets are used by the Oracle Clusterware private interconnect on the database
     * instance. Specifying an overlapping subnet will cause the private interconnect to
     * malfunction. This restriction applies to both the client subnet and backup subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * subnet the cloud Autonomous VM Cluster is associated with.
     *
     * <p>*Subnet Restrictions:** - For Exadata and virtual machine 2-node RAC DB systems, do not
     * use a subnet that overlaps with 192.168.128.0/20.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance update history. This value is updated when a maintenance update starts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateHistoryEntryId")
    private final String lastUpdateHistoryEntryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance update history. This value is updated when a maintenance update starts.
     *
     * @return the value
     */
    public String getLastUpdateHistoryEntryId() {
        return lastUpdateHistoryEntryId;
    }

    /** The current state of the cloud Autonomous VM cluster. */
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
    /** The current state of the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be
     * unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The date and time that the cloud Autonomous VM cluster was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the cloud Autonomous VM cluster was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The last date and time that the cloud Autonomous VM cluster was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last date and time that the cloud Autonomous VM cluster was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The time zone of the Cloud Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
    private final String clusterTimeZone;

    /**
     * The time zone of the Cloud Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getClusterTimeZone() {
        return clusterTimeZone;
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

    /** The hostname for the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname for the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The domain name for the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The domain name for the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
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

    /** The model name of the Exadata hardware running the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The model name of the Exadata hardware running the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The number of database servers in the cloud VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of database servers in the cloud VM cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The total data storage allocated, in terabytes (TB). */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * The total data storage allocated, in terabytes (TB).
     *
     * @return the value
     */
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The total data storage allocated, in gigabytes (GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Double dataStorageSizeInGBs;

    /**
     * The total data storage allocated, in gigabytes (GB).
     *
     * @return the value
     */
    public Double getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /** The number of CPU cores on the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores on the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The number of CPU cores on the cloud Autonomous VM cluster. Only 1 decimal place is allowed
     * for the fractional part.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of CPU cores on the cloud Autonomous VM cluster. Only 1 decimal place is allowed
     * for the fractional part.
     *
     * @return the value
     */
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous
     * Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    public enum ComputeModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ecpu("ECPU"),
        Ocpu("OCPU"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ComputeModel.class);

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ComputeModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ComputeModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous
     * Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous
     * Database on Dedicated Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     *
     * @return the value
     */
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This
     * is applicable to database TLS Certificates only. Default is TLS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
    private final Boolean isMtlsEnabledVmCluster;

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This
     * is applicable to database TLS Certificates only. Default is TLS
     *
     * @return the value
     */
    public Boolean getIsMtlsEnabledVmCluster() {
        return isMtlsEnabledVmCluster;
    }

    /** The number of CPU cores enabled per VM cluster node. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
    private final Integer cpuCoreCountPerNode;

    /**
     * The number of CPU cores enabled per VM cluster node.
     *
     * @return the value
     */
    public Integer getCpuCoreCountPerNode() {
        return cpuCoreCountPerNode;
    }

    /** The memory allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The memory allocated in GBs.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle PaaS and IaaS services in the cloud. License Included
     * allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null because the attribute is already set at the Autonomous Exadata
     * Infrastructure level. When using [shared Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a
     * value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
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
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle PaaS and IaaS services in the cloud. License Included
     * allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null because the attribute is already set at the Autonomous Exadata
     * Infrastructure level. When using [shared Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a
     * value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own
     * license (BYOL) allows you to apply your current on-premises Oracle software licenses to
     * equivalent, highly automated Oracle PaaS and IaaS services in the cloud. License Included
     * allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this
     * attribute must be null because the attribute is already set at the Autonomous Exadata
     * Infrastructure level. When using [shared Exadata
     * infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a
     * value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     * <p>This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount,
     * maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload,
     * privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or
     * isFreeTier.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last maintenance run.
     *
     * @return the value
     */
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * next maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * next maintenance run.
     *
     * @return the value
     */
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /** The SCAN Listenenr TLS port. Default is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listenenr TLS port. Default is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /** The SCAN Listener Non TLS port. Default is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port. Default is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
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

    /** The date and time of Database SSL certificate expiration. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDatabaseSslCertificateExpires")
    private final java.util.Date timeDatabaseSslCertificateExpires;

    /**
     * The date and time of Database SSL certificate expiration.
     *
     * @return the value
     */
    public java.util.Date getTimeDatabaseSslCertificateExpires() {
        return timeDatabaseSslCertificateExpires;
    }

    /** The date and time of ORDS certificate expiration. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOrdsCertificateExpires")
    private final java.util.Date timeOrdsCertificateExpires;

    /**
     * The date and time of ORDS certificate expiration.
     *
     * @return the value
     */
    public java.util.Date getTimeOrdsCertificateExpires() {
        return timeOrdsCertificateExpires;
    }

    /** CPU cores available for allocation to Autonomous Databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Float availableCpus;

    /**
     * CPU cores available for allocation to Autonomous Databases.
     *
     * @return the value
     */
    public Float getAvailableCpus() {
        return availableCpus;
    }

    /**
     * For Autonomous Databases on Dedicated Exadata Infrastructure: - These are the CPUs that
     * continue to be included in the count of CPUs available to the Autonomous Container Database
     * even after one of its Autonomous Database is terminated or scaled down. You can release them
     * to the available CPUs at its parent Autonomous VM Cluster level by restarting the Autonomous
     * Container Database. - The CPU type (OCPUs or ECPUs) is determined by the parent Autonomous
     * Exadata VM Cluster's compute model. See [Compute Models in Autonomous Database on Dedicated
     * Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * For Autonomous Databases on Dedicated Exadata Infrastructure: - These are the CPUs that
     * continue to be included in the count of CPUs available to the Autonomous Container Database
     * even after one of its Autonomous Database is terminated or scaled down. You can release them
     * to the available CPUs at its parent Autonomous VM Cluster level by restarting the Autonomous
     * Container Database. - The CPU type (OCPUs or ECPUs) is determined by the parent Autonomous
     * Exadata VM Cluster's compute model. See [Compute Models in Autonomous Database on Dedicated
     * Exadata
     * Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
    }

    /**
     * The number of Autonomous Container Databases that can be created with the currently available
     * local storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableContainerDatabases")
    private final Integer availableContainerDatabases;

    /**
     * The number of Autonomous Container Databases that can be created with the currently available
     * local storage.
     *
     * @return the value
     */
    public Integer getAvailableContainerDatabases() {
        return availableContainerDatabases;
    }

    /**
     * The total number of Autonomous Container Databases that can be created with the allocated
     * local storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
    private final Integer totalContainerDatabases;

    /**
     * The total number of Autonomous Container Databases that can be created with the allocated
     * local storage.
     *
     * @return the value
     */
    public Integer getTotalContainerDatabases() {
        return totalContainerDatabases;
    }

    /** The data disk group size available for Autonomous Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
    private final Double availableAutonomousDataStorageSizeInTBs;

    /**
     * The data disk group size available for Autonomous Databases, in TBs.
     *
     * @return the value
     */
    public Double getAvailableAutonomousDataStorageSizeInTBs() {
        return availableAutonomousDataStorageSizeInTBs;
    }

    /** The data disk group size allocated for Autonomous Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Double autonomousDataStorageSizeInTBs;

    /**
     * The data disk group size allocated for Autonomous Databases, in TBs.
     *
     * @return the value
     */
    public Double getAutonomousDataStorageSizeInTBs() {
        return autonomousDataStorageSizeInTBs;
    }

    /** The local node storage allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The local node storage allocated in GBs.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /** The amount of memory (in GBs) enabled per each CPU core. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) enabled per each CPU core.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
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
        sb.append("CloudAutonomousVmCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", lastUpdateHistoryEntryId=")
                .append(String.valueOf(this.lastUpdateHistoryEntryId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", clusterTimeZone=").append(String.valueOf(this.clusterTimeZone));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", isMtlsEnabledVmCluster=").append(String.valueOf(this.isMtlsEnabledVmCluster));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeDatabaseSslCertificateExpires=")
                .append(String.valueOf(this.timeDatabaseSslCertificateExpires));
        sb.append(", timeOrdsCertificateExpires=")
                .append(String.valueOf(this.timeOrdsCertificateExpires));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", availableContainerDatabases=")
                .append(String.valueOf(this.availableContainerDatabases));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", availableAutonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.availableAutonomousDataStorageSizeInTBs));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudAutonomousVmCluster)) {
            return false;
        }

        CloudAutonomousVmCluster other = (CloudAutonomousVmCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(
                        this.lastUpdateHistoryEntryId, other.lastUpdateHistoryEntryId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.clusterTimeZone, other.clusterTimeZone)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(
                        this.isMtlsEnabledVmCluster, other.isMtlsEnabledVmCluster)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.timeDatabaseSslCertificateExpires,
                        other.timeDatabaseSslCertificateExpires)
                && java.util.Objects.equals(
                        this.timeOrdsCertificateExpires, other.timeOrdsCertificateExpires)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(
                        this.availableContainerDatabases, other.availableContainerDatabases)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(
                        this.availableAutonomousDataStorageSizeInTBs,
                        other.availableAutonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdateHistoryEntryId == null
                                ? 43
                                : this.lastUpdateHistoryEntryId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterTimeZone == null ? 43 : this.clusterTimeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsEnabledVmCluster == null
                                ? 43
                                : this.isMtlsEnabledVmCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCoreCountPerNode == null
                                ? 43
                                : this.cpuCoreCountPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.lastMaintenanceRunId == null
                                ? 43
                                : this.lastMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextMaintenanceRunId == null
                                ? 43
                                : this.nextMaintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortTls == null
                                ? 43
                                : this.scanListenerPortTls.hashCode());
        result =
                (result * PRIME)
                        + (this.scanListenerPortNonTls == null
                                ? 43
                                : this.scanListenerPortNonTls.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDatabaseSslCertificateExpires == null
                                ? 43
                                : this.timeDatabaseSslCertificateExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOrdsCertificateExpires == null
                                ? 43
                                : this.timeOrdsCertificateExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availableContainerDatabases == null
                                ? 43
                                : this.availableContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.totalContainerDatabases == null
                                ? 43
                                : this.totalContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAutonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.availableAutonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.autonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
