/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the create cloud Autonomous VM cluster operation.
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
    builder = CreateCloudAutonomousVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCloudAutonomousVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "description",
        "subnetId",
        "displayName",
        "cloudExadataInfrastructureId",
        "totalContainerDatabases",
        "cpuCoreCountPerNode",
        "memoryPerOracleComputeUnitInGBs",
        "autonomousDataStorageSizeInTBs",
        "clusterTimeZone",
        "computeModel",
        "isMtlsEnabledVmCluster",
        "dbServers",
        "maintenanceWindowDetails",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "licenseModel",
        "nsgIds",
        "freeformTags",
        "definedTags"
    })
    public CreateCloudAutonomousVmClusterDetails(
            String compartmentId,
            String description,
            String subnetId,
            String displayName,
            String cloudExadataInfrastructureId,
            Integer totalContainerDatabases,
            Integer cpuCoreCountPerNode,
            Integer memoryPerOracleComputeUnitInGBs,
            Double autonomousDataStorageSizeInTBs,
            String clusterTimeZone,
            ComputeModel computeModel,
            Boolean isMtlsEnabledVmCluster,
            java.util.List<String> dbServers,
            MaintenanceWindow maintenanceWindowDetails,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            LicenseModel licenseModel,
            java.util.List<String> nsgIds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.description = description;
        this.subnetId = subnetId;
        this.displayName = displayName;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.totalContainerDatabases = totalContainerDatabases;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.clusterTimeZone = clusterTimeZone;
        this.computeModel = computeModel;
        this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
        this.dbServers = dbServers;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.licenseModel = licenseModel;
        this.nsgIds = nsgIds;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * User defined description of the cloud Autonomous VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User defined description of the cloud Autonomous VM cluster.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the cloud Autonomous VM Cluster is associated with.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the cloud Autonomous VM Cluster is associated with.
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
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
            return this;
        }
        /**
         * The total number of Autonomous Container Databases that can be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
        private Integer totalContainerDatabases;

        /**
         * The total number of Autonomous Container Databases that can be created.
         * @param totalContainerDatabases the value to set
         * @return this builder
         **/
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = totalContainerDatabases;
            this.__explicitlySet__.add("totalContainerDatabases");
            return this;
        }
        /**
         * The number of CPU cores to be enabled per VM cluster node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
        private Integer cpuCoreCountPerNode;

        /**
         * The number of CPU cores to be enabled per VM cluster node.
         * @param cpuCoreCountPerNode the value to set
         * @return this builder
         **/
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = cpuCoreCountPerNode;
            this.__explicitlySet__.add("cpuCoreCountPerNode");
            return this;
        }
        /**
         * The amount of memory (in GBs) to be enabled per OCPU or ECPU. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) to be enabled per OCPU or ECPU. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         **/
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
            return this;
        }
        /**
         * The data disk group size to be allocated for Autonomous Databases, in TBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Double autonomousDataStorageSizeInTBs;

        /**
         * The data disk group size to be allocated for Autonomous Databases, in TBs.
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder autonomousDataStorageSizeInTBs(Double autonomousDataStorageSizeInTBs) {
            this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("autonomousDataStorageSizeInTBs");
            return this;
        }
        /**
         * The time zone to use for the Cloud Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
        private String clusterTimeZone;

        /**
         * The time zone to use for the Cloud Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         * @param clusterTimeZone the value to set
         * @return this builder
         **/
        public Builder clusterTimeZone(String clusterTimeZone) {
            this.clusterTimeZone = clusterTimeZone;
            this.__explicitlySet__.add("clusterTimeZone");
            return this;
        }
        /**
         * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
         *
         * @param computeModel the value to set
         * @return this builder
         **/
        public Builder computeModel(ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This is applicable to database TLS Certificates only. Default is TLS
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
        private Boolean isMtlsEnabledVmCluster;

        /**
         * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This is applicable to database TLS Certificates only. Default is TLS
         * @param isMtlsEnabledVmCluster the value to set
         * @return this builder
         **/
        public Builder isMtlsEnabledVmCluster(Boolean isMtlsEnabledVmCluster) {
            this.isMtlsEnabledVmCluster = isMtlsEnabledVmCluster;
            this.__explicitlySet__.add("isMtlsEnabledVmCluster");
            return this;
        }
        /**
         * The list of database servers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of database servers.
         * @param dbServers the value to set
         * @return this builder
         **/
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }
        /**
         * The SCAN Listener TLS port. Default is 2484.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listener TLS port. Default is 2484.
         * @param scanListenerPortTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /**
         * The SCAN Listener Non TLS port. Default is 1521.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port. Default is 1521.
         * @param scanListenerPortNonTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortNonTls(Integer scanListenerPortNonTls) {
            this.scanListenerPortNonTls = scanListenerPortNonTls;
            this.__explicitlySet__.add("scanListenerPortNonTls");
            return this;
        }
        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
         * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
         * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
         * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
         * <p>
         * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
         * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
         * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
         * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
         * <p>
         * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
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
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCloudAutonomousVmClusterDetails build() {
            CreateCloudAutonomousVmClusterDetails model =
                    new CreateCloudAutonomousVmClusterDetails(
                            this.compartmentId,
                            this.description,
                            this.subnetId,
                            this.displayName,
                            this.cloudExadataInfrastructureId,
                            this.totalContainerDatabases,
                            this.cpuCoreCountPerNode,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.autonomousDataStorageSizeInTBs,
                            this.clusterTimeZone,
                            this.computeModel,
                            this.isMtlsEnabledVmCluster,
                            this.dbServers,
                            this.maintenanceWindowDetails,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.licenseModel,
                            this.nsgIds,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCloudAutonomousVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("clusterTimeZone")) {
                this.clusterTimeZone(model.getClusterTimeZone());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("isMtlsEnabledVmCluster")) {
                this.isMtlsEnabledVmCluster(model.getIsMtlsEnabledVmCluster());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTls")) {
                this.scanListenerPortTls(model.getScanListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortNonTls")) {
                this.scanListenerPortNonTls(model.getScanListenerPortNonTls());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * User defined description of the cloud Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User defined description of the cloud Autonomous VM cluster.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the cloud Autonomous VM Cluster is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the cloud Autonomous VM Cluster is associated with.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cloud Autonomous VM cluster. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     * @return the value
     **/
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }

    /**
     * The total number of Autonomous Container Databases that can be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
    private final Integer totalContainerDatabases;

    /**
     * The total number of Autonomous Container Databases that can be created.
     * @return the value
     **/
    public Integer getTotalContainerDatabases() {
        return totalContainerDatabases;
    }

    /**
     * The number of CPU cores to be enabled per VM cluster node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
    private final Integer cpuCoreCountPerNode;

    /**
     * The number of CPU cores to be enabled per VM cluster node.
     * @return the value
     **/
    public Integer getCpuCoreCountPerNode() {
        return cpuCoreCountPerNode;
    }

    /**
     * The amount of memory (in GBs) to be enabled per OCPU or ECPU. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) to be enabled per OCPU or ECPU. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     * @return the value
     **/
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
    }

    /**
     * The data disk group size to be allocated for Autonomous Databases, in TBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Double autonomousDataStorageSizeInTBs;

    /**
     * The data disk group size to be allocated for Autonomous Databases, in TBs.
     * @return the value
     **/
    public Double getAutonomousDataStorageSizeInTBs() {
        return autonomousDataStorageSizeInTBs;
    }

    /**
     * The time zone to use for the Cloud Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterTimeZone")
    private final String clusterTimeZone;

    /**
     * The time zone to use for the Cloud Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     * @return the value
     **/
    public String getClusterTimeZone() {
        return clusterTimeZone;
    }

    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     *
     **/
    public enum ComputeModel {
        Ecpu("ECPU"),
        Ocpu("OCPU"),
        ;

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ComputeModel: " + key);
        }
    };
    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Cloud Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     *
     * @return the value
     **/
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This is applicable to database TLS Certificates only. Default is TLS
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabledVmCluster")
    private final Boolean isMtlsEnabledVmCluster;

    /**
     * Enable mutual TLS(mTLS) authentication for database at time of provisioning a VMCluster. This is applicable to database TLS Certificates only. Default is TLS
     * @return the value
     **/
    public Boolean getIsMtlsEnabledVmCluster() {
        return isMtlsEnabledVmCluster;
    }

    /**
     * The list of database servers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of database servers.
     * @return the value
     **/
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The SCAN Listener TLS port. Default is 2484.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listener TLS port. Default is 2484.
     * @return the value
     **/
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /**
     * The SCAN Listener Non TLS port. Default is 1521.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port. Default is 1521.
     * @return the value
     **/
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
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
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, maxCpuCoreCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateCloudAutonomousVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", clusterTimeZone=").append(String.valueOf(this.clusterTimeZone));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", isMtlsEnabledVmCluster=").append(String.valueOf(this.isMtlsEnabledVmCluster));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCloudAutonomousVmClusterDetails)) {
            return false;
        }

        CreateCloudAutonomousVmClusterDetails other = (CreateCloudAutonomousVmClusterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(this.clusterTimeZone, other.clusterTimeZone)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(
                        this.isMtlsEnabledVmCluster, other.isMtlsEnabledVmCluster)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.totalContainerDatabases == null
                                ? 43
                                : this.totalContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCoreCountPerNode == null
                                ? 43
                                : this.cpuCoreCountPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.autonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterTimeZone == null ? 43 : this.clusterTimeZone.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsEnabledVmCluster == null
                                ? 43
                                : this.isMtlsEnabledVmCluster.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
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
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
