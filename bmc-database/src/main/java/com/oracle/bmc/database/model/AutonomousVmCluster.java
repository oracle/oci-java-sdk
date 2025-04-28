/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Autonomous VM cluster. <br>
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
        builder = AutonomousVmCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousVmCluster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "timeZone",
        "exadataInfrastructureId",
        "vmClusterNetworkId",
        "isLocalBackupEnabled",
        "cpusEnabled",
        "computeModel",
        "ocpusEnabled",
        "availableCpus",
        "totalContainerDatabases",
        "memoryPerOracleComputeUnitInGBs",
        "cpuCoreCountPerNode",
        "autonomousDataStorageSizeInTBs",
        "maintenanceWindow",
        "lastMaintenanceRunId",
        "nextMaintenanceRunId",
        "cpuPercentage",
        "autonomousDataStoragePercentage",
        "provisionedCpus",
        "totalAutonomousDataStorageInTBs",
        "reservedCpus",
        "provisionableAutonomousContainerDatabases",
        "provisionedAutonomousContainerDatabases",
        "nonProvisionableAutonomousContainerDatabases",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "availableDataStorageSizeInTBs",
        "nodeCount",
        "licenseModel",
        "freeformTags",
        "definedTags",
        "dbServers",
        "reclaimableCpus",
        "availableContainerDatabases",
        "availableAutonomousDataStorageSizeInTBs",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "isMtlsEnabled",
        "timeDatabaseSslCertificateExpires",
        "timeOrdsCertificateExpires",
        "exadataStorageInTBsLowestScaledValue",
        "cpusLowestScaledValue",
        "maxAcdsLowestScaledValue"
    })
    public AutonomousVmCluster(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String timeZone,
            String exadataInfrastructureId,
            String vmClusterNetworkId,
            Boolean isLocalBackupEnabled,
            Integer cpusEnabled,
            ComputeModel computeModel,
            Float ocpusEnabled,
            Integer availableCpus,
            Integer totalContainerDatabases,
            Integer memoryPerOracleComputeUnitInGBs,
            Integer cpuCoreCountPerNode,
            Double autonomousDataStorageSizeInTBs,
            MaintenanceWindow maintenanceWindow,
            String lastMaintenanceRunId,
            String nextMaintenanceRunId,
            Float cpuPercentage,
            Float autonomousDataStoragePercentage,
            Float provisionedCpus,
            Float totalAutonomousDataStorageInTBs,
            Float reservedCpus,
            Integer provisionableAutonomousContainerDatabases,
            Integer provisionedAutonomousContainerDatabases,
            Integer nonProvisionableAutonomousContainerDatabases,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Double dataStorageSizeInTBs,
            Double dataStorageSizeInGBs,
            Double availableDataStorageSizeInTBs,
            Integer nodeCount,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<String> dbServers,
            Integer reclaimableCpus,
            Integer availableContainerDatabases,
            Double availableAutonomousDataStorageSizeInTBs,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            Boolean isMtlsEnabled,
            java.util.Date timeDatabaseSslCertificateExpires,
            java.util.Date timeOrdsCertificateExpires,
            Double exadataStorageInTBsLowestScaledValue,
            Integer cpusLowestScaledValue,
            Integer maxAcdsLowestScaledValue) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeZone = timeZone;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.vmClusterNetworkId = vmClusterNetworkId;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.cpusEnabled = cpusEnabled;
        this.computeModel = computeModel;
        this.ocpusEnabled = ocpusEnabled;
        this.availableCpus = availableCpus;
        this.totalContainerDatabases = totalContainerDatabases;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.maintenanceWindow = maintenanceWindow;
        this.lastMaintenanceRunId = lastMaintenanceRunId;
        this.nextMaintenanceRunId = nextMaintenanceRunId;
        this.cpuPercentage = cpuPercentage;
        this.autonomousDataStoragePercentage = autonomousDataStoragePercentage;
        this.provisionedCpus = provisionedCpus;
        this.totalAutonomousDataStorageInTBs = totalAutonomousDataStorageInTBs;
        this.reservedCpus = reservedCpus;
        this.provisionableAutonomousContainerDatabases = provisionableAutonomousContainerDatabases;
        this.provisionedAutonomousContainerDatabases = provisionedAutonomousContainerDatabases;
        this.nonProvisionableAutonomousContainerDatabases =
                nonProvisionableAutonomousContainerDatabases;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.availableDataStorageSizeInTBs = availableDataStorageSizeInTBs;
        this.nodeCount = nodeCount;
        this.licenseModel = licenseModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dbServers = dbServers;
        this.reclaimableCpus = reclaimableCpus;
        this.availableContainerDatabases = availableContainerDatabases;
        this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.isMtlsEnabled = isMtlsEnabled;
        this.timeDatabaseSslCertificateExpires = timeDatabaseSslCertificateExpires;
        this.timeOrdsCertificateExpires = timeOrdsCertificateExpires;
        this.exadataStorageInTBsLowestScaledValue = exadataStorageInTBsLowestScaledValue;
        this.cpusLowestScaledValue = cpusLowestScaledValue;
        this.maxAcdsLowestScaledValue = maxAcdsLowestScaledValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM cluster.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be
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
        /** The date and time that the Autonomous VM cluster was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Autonomous VM cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Autonomous VM cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         *
         * @param exadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM cluster network.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
        private String vmClusterNetworkId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM cluster network.
         *
         * @param vmClusterNetworkId the value to set
         * @return this builder
         */
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = vmClusterNetworkId;
            this.__explicitlySet__.add("vmClusterNetworkId");
            return this;
        }
        /**
         * If true, database backup on local Exadata storage is configured for the Autonomous VM
         * cluster. If false, database backup on local Exadata storage is not available in the
         * Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        /**
         * If true, database backup on local Exadata storage is configured for the Autonomous VM
         * cluster. If false, database backup on local Exadata storage is not available in the
         * Autonomous VM cluster.
         *
         * @param isLocalBackupEnabled the value to set
         * @return this builder
         */
        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = isLocalBackupEnabled;
            this.__explicitlySet__.add("isLocalBackupEnabled");
            return this;
        }
        /** The number of enabled CPU cores. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        /**
         * The number of enabled CPU cores.
         *
         * @param cpusEnabled the value to set
         * @return this builder
         */
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }
        /**
         * The compute model of the Autonomous VM Cluster. ECPU compute model is the recommended
         * model and OCPU compute model is legacy. See [Compute Models in Autonomous Database on
         * Dedicated Exadata
         * #Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
         * for more details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Autonomous VM Cluster. ECPU compute model is the recommended
         * model and OCPU compute model is legacy. See [Compute Models in Autonomous Database on
         * Dedicated Exadata
         * #Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
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
        /** The number of enabled OCPU cores. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
        private Float ocpusEnabled;

        /**
         * The number of enabled OCPU cores.
         *
         * @param ocpusEnabled the value to set
         * @return this builder
         */
        public Builder ocpusEnabled(Float ocpusEnabled) {
            this.ocpusEnabled = ocpusEnabled;
            this.__explicitlySet__.add("ocpusEnabled");
            return this;
        }
        /** The numnber of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Integer availableCpus;

        /**
         * The numnber of CPU cores available.
         *
         * @param availableCpus the value to set
         * @return this builder
         */
        public Builder availableCpus(Integer availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
            return this;
        }
        /** The total number of Autonomous Container Databases that can be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
        private Integer totalContainerDatabases;

        /**
         * The total number of Autonomous Container Databases that can be created.
         *
         * @param totalContainerDatabases the value to set
         * @return this builder
         */
        public Builder totalContainerDatabases(Integer totalContainerDatabases) {
            this.totalContainerDatabases = totalContainerDatabases;
            this.__explicitlySet__.add("totalContainerDatabases");
            return this;
        }
        /** The amount of memory (in GBs) to be enabled per OCPU or ECPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) to be enabled per OCPU or ECPU.
         *
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
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

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * next maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** The percentage of total number of CPUs used in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuPercentage")
        private Float cpuPercentage;

        /**
         * The percentage of total number of CPUs used in an Autonomous VM Cluster.
         *
         * @param cpuPercentage the value to set
         * @return this builder
         */
        public Builder cpuPercentage(Float cpuPercentage) {
            this.cpuPercentage = cpuPercentage;
            this.__explicitlySet__.add("cpuPercentage");
            return this;
        }
        /**
         * The percentage of the data storage used for the Autonomous Databases in an Autonomous VM
         * Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStoragePercentage")
        private Float autonomousDataStoragePercentage;

        /**
         * The percentage of the data storage used for the Autonomous Databases in an Autonomous VM
         * Cluster.
         *
         * @param autonomousDataStoragePercentage the value to set
         * @return this builder
         */
        public Builder autonomousDataStoragePercentage(Float autonomousDataStoragePercentage) {
            this.autonomousDataStoragePercentage = autonomousDataStoragePercentage;
            this.__explicitlySet__.add("autonomousDataStoragePercentage");
            return this;
        }
        /** The number of CPUs provisioned in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
        private Float provisionedCpus;

        /**
         * The number of CPUs provisioned in an Autonomous VM Cluster.
         *
         * @param provisionedCpus the value to set
         * @return this builder
         */
        public Builder provisionedCpus(Float provisionedCpus) {
            this.provisionedCpus = provisionedCpus;
            this.__explicitlySet__.add("provisionedCpus");
            return this;
        }
        /** The total data disk group size for Autonomous Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalAutonomousDataStorageInTBs")
        private Float totalAutonomousDataStorageInTBs;

        /**
         * The total data disk group size for Autonomous Databases, in TBs.
         *
         * @param totalAutonomousDataStorageInTBs the value to set
         * @return this builder
         */
        public Builder totalAutonomousDataStorageInTBs(Float totalAutonomousDataStorageInTBs) {
            this.totalAutonomousDataStorageInTBs = totalAutonomousDataStorageInTBs;
            this.__explicitlySet__.add("totalAutonomousDataStorageInTBs");
            return this;
        }
        /** The number of CPUs reserved in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
        private Float reservedCpus;

        /**
         * The number of CPUs reserved in an Autonomous VM Cluster.
         *
         * @param reservedCpus the value to set
         * @return this builder
         */
        public Builder reservedCpus(Float reservedCpus) {
            this.reservedCpus = reservedCpus;
            this.__explicitlySet__.add("reservedCpus");
            return this;
        }
        /** **Deprecated.** Use field totalContainerDatabases. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
        private Integer provisionableAutonomousContainerDatabases;

        /**
         * **Deprecated.** Use field totalContainerDatabases.
         *
         * @param provisionableAutonomousContainerDatabases the value to set
         * @return this builder
         */
        public Builder provisionableAutonomousContainerDatabases(
                Integer provisionableAutonomousContainerDatabases) {
            this.provisionableAutonomousContainerDatabases =
                    provisionableAutonomousContainerDatabases;
            this.__explicitlySet__.add("provisionableAutonomousContainerDatabases");
            return this;
        }
        /** The number of provisioned Autonomous Container Databases in an Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionedAutonomousContainerDatabases")
        private Integer provisionedAutonomousContainerDatabases;

        /**
         * The number of provisioned Autonomous Container Databases in an Autonomous VM Cluster.
         *
         * @param provisionedAutonomousContainerDatabases the value to set
         * @return this builder
         */
        public Builder provisionedAutonomousContainerDatabases(
                Integer provisionedAutonomousContainerDatabases) {
            this.provisionedAutonomousContainerDatabases = provisionedAutonomousContainerDatabases;
            this.__explicitlySet__.add("provisionedAutonomousContainerDatabases");
            return this;
        }
        /**
         * The number of non-provisionable Autonomous Container Databases in an Autonomous VM
         * Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "nonProvisionableAutonomousContainerDatabases")
        private Integer nonProvisionableAutonomousContainerDatabases;

        /**
         * The number of non-provisionable Autonomous Container Databases in an Autonomous VM
         * Cluster.
         *
         * @param nonProvisionableAutonomousContainerDatabases the value to set
         * @return this builder
         */
        public Builder nonProvisionableAutonomousContainerDatabases(
                Integer nonProvisionableAutonomousContainerDatabases) {
            this.nonProvisionableAutonomousContainerDatabases =
                    nonProvisionableAutonomousContainerDatabases;
            this.__explicitlySet__.add("nonProvisionableAutonomousContainerDatabases");
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
        /** The total data storage allocated in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        /**
         * The total data storage allocated in TBs
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /** The total data storage allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        /**
         * The total data storage allocated in GBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * **Deprecated.** Use {@code availableAutonomousDataStorageSizeInTBs} for Autonomous
         * Databases' data storage availability in TBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageSizeInTBs")
        private Double availableDataStorageSizeInTBs;

        /**
         * **Deprecated.** Use {@code availableAutonomousDataStorageSizeInTBs} for Autonomous
         * Databases' data storage availability in TBs.
         *
         * @param availableDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder availableDataStorageSizeInTBs(Double availableDataStorageSizeInTBs) {
            this.availableDataStorageSizeInTBs = availableDataStorageSizeInTBs;
            this.__explicitlySet__.add("availableDataStorageSizeInTBs");
            return this;
        }
        /** The number of nodes in the Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the Autonomous VM Cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is
         * LICENSE_INCLUDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Db
         * servers.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Db
         * servers.
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
         * CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Integer reclaimableCpus;

        /**
         * CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Integer reclaimableCpus) {
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
        /** The SCAN Listener TLS port number. Default value is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listener TLS port number. Default value is 2484.
         *
         * @param scanListenerPortTls the value to set
         * @return this builder
         */
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /** The SCAN Listener Non TLS port number. Default value is 1521. */
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port number. Default value is 1521.
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
         * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster.
         * Default is TLS.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
        private Boolean isMtlsEnabled;

        /**
         * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster.
         * Default is TLS.
         *
         * @param isMtlsEnabled the value to set
         * @return this builder
         */
        public Builder isMtlsEnabled(Boolean isMtlsEnabled) {
            this.isMtlsEnabled = isMtlsEnabled;
            this.__explicitlySet__.add("isMtlsEnabled");
            return this;
        }
        /** The date and time of the Database SSL certificate expiration. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDatabaseSslCertificateExpires")
        private java.util.Date timeDatabaseSslCertificateExpires;

        /**
         * The date and time of the Database SSL certificate expiration.
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
        /** The date and time of the ORDS certificate expiration. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOrdsCertificateExpires")
        private java.util.Date timeOrdsCertificateExpires;

        /**
         * The date and time of the ORDS certificate expiration.
         *
         * @param timeOrdsCertificateExpires the value to set
         * @return this builder
         */
        public Builder timeOrdsCertificateExpires(java.util.Date timeOrdsCertificateExpires) {
            this.timeOrdsCertificateExpires = timeOrdsCertificateExpires;
            this.__explicitlySet__.add("timeOrdsCertificateExpires");
            return this;
        }
        /** The lowest value to which exadataStorage(in TBs) can be scaled down. */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBsLowestScaledValue")
        private Double exadataStorageInTBsLowestScaledValue;

        /**
         * The lowest value to which exadataStorage(in TBs) can be scaled down.
         *
         * @param exadataStorageInTBsLowestScaledValue the value to set
         * @return this builder
         */
        public Builder exadataStorageInTBsLowestScaledValue(
                Double exadataStorageInTBsLowestScaledValue) {
            this.exadataStorageInTBsLowestScaledValue = exadataStorageInTBsLowestScaledValue;
            this.__explicitlySet__.add("exadataStorageInTBsLowestScaledValue");
            return this;
        }
        /** The lowest value to which cpus can be scaled down. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpusLowestScaledValue")
        private Integer cpusLowestScaledValue;

        /**
         * The lowest value to which cpus can be scaled down.
         *
         * @param cpusLowestScaledValue the value to set
         * @return this builder
         */
        public Builder cpusLowestScaledValue(Integer cpusLowestScaledValue) {
            this.cpusLowestScaledValue = cpusLowestScaledValue;
            this.__explicitlySet__.add("cpusLowestScaledValue");
            return this;
        }
        /** The lowest value to which maximum number of ACDs can be scaled down. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAcdsLowestScaledValue")
        private Integer maxAcdsLowestScaledValue;

        /**
         * The lowest value to which maximum number of ACDs can be scaled down.
         *
         * @param maxAcdsLowestScaledValue the value to set
         * @return this builder
         */
        public Builder maxAcdsLowestScaledValue(Integer maxAcdsLowestScaledValue) {
            this.maxAcdsLowestScaledValue = maxAcdsLowestScaledValue;
            this.__explicitlySet__.add("maxAcdsLowestScaledValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousVmCluster build() {
            AutonomousVmCluster model =
                    new AutonomousVmCluster(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeZone,
                            this.exadataInfrastructureId,
                            this.vmClusterNetworkId,
                            this.isLocalBackupEnabled,
                            this.cpusEnabled,
                            this.computeModel,
                            this.ocpusEnabled,
                            this.availableCpus,
                            this.totalContainerDatabases,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.cpuCoreCountPerNode,
                            this.autonomousDataStorageSizeInTBs,
                            this.maintenanceWindow,
                            this.lastMaintenanceRunId,
                            this.nextMaintenanceRunId,
                            this.cpuPercentage,
                            this.autonomousDataStoragePercentage,
                            this.provisionedCpus,
                            this.totalAutonomousDataStorageInTBs,
                            this.reservedCpus,
                            this.provisionableAutonomousContainerDatabases,
                            this.provisionedAutonomousContainerDatabases,
                            this.nonProvisionableAutonomousContainerDatabases,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.availableDataStorageSizeInTBs,
                            this.nodeCount,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.dbServers,
                            this.reclaimableCpus,
                            this.availableContainerDatabases,
                            this.availableAutonomousDataStorageSizeInTBs,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.isMtlsEnabled,
                            this.timeDatabaseSslCertificateExpires,
                            this.timeOrdsCertificateExpires,
                            this.exadataStorageInTBsLowestScaledValue,
                            this.cpusLowestScaledValue,
                            this.maxAcdsLowestScaledValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousVmCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("vmClusterNetworkId")) {
                this.vmClusterNetworkId(model.getVmClusterNetworkId());
            }
            if (model.wasPropertyExplicitlySet("isLocalBackupEnabled")) {
                this.isLocalBackupEnabled(model.getIsLocalBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("cpusEnabled")) {
                this.cpusEnabled(model.getCpusEnabled());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("ocpusEnabled")) {
                this.ocpusEnabled(model.getOcpusEnabled());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindow")) {
                this.maintenanceWindow(model.getMaintenanceWindow());
            }
            if (model.wasPropertyExplicitlySet("lastMaintenanceRunId")) {
                this.lastMaintenanceRunId(model.getLastMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("nextMaintenanceRunId")) {
                this.nextMaintenanceRunId(model.getNextMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("cpuPercentage")) {
                this.cpuPercentage(model.getCpuPercentage());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStoragePercentage")) {
                this.autonomousDataStoragePercentage(model.getAutonomousDataStoragePercentage());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
            }
            if (model.wasPropertyExplicitlySet("totalAutonomousDataStorageInTBs")) {
                this.totalAutonomousDataStorageInTBs(model.getTotalAutonomousDataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("reservedCpus")) {
                this.reservedCpus(model.getReservedCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionableAutonomousContainerDatabases")) {
                this.provisionableAutonomousContainerDatabases(
                        model.getProvisionableAutonomousContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("provisionedAutonomousContainerDatabases")) {
                this.provisionedAutonomousContainerDatabases(
                        model.getProvisionedAutonomousContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("nonProvisionableAutonomousContainerDatabases")) {
                this.nonProvisionableAutonomousContainerDatabases(
                        model.getNonProvisionableAutonomousContainerDatabases());
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
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableDataStorageSizeInTBs")) {
                this.availableDataStorageSizeInTBs(model.getAvailableDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("availableContainerDatabases")) {
                this.availableContainerDatabases(model.getAvailableContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("availableAutonomousDataStorageSizeInTBs")) {
                this.availableAutonomousDataStorageSizeInTBs(
                        model.getAvailableAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortTls")) {
                this.scanListenerPortTls(model.getScanListenerPortTls());
            }
            if (model.wasPropertyExplicitlySet("scanListenerPortNonTls")) {
                this.scanListenerPortNonTls(model.getScanListenerPortNonTls());
            }
            if (model.wasPropertyExplicitlySet("isMtlsEnabled")) {
                this.isMtlsEnabled(model.getIsMtlsEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeDatabaseSslCertificateExpires")) {
                this.timeDatabaseSslCertificateExpires(
                        model.getTimeDatabaseSslCertificateExpires());
            }
            if (model.wasPropertyExplicitlySet("timeOrdsCertificateExpires")) {
                this.timeOrdsCertificateExpires(model.getTimeOrdsCertificateExpires());
            }
            if (model.wasPropertyExplicitlySet("exadataStorageInTBsLowestScaledValue")) {
                this.exadataStorageInTBsLowestScaledValue(
                        model.getExadataStorageInTBsLowestScaledValue());
            }
            if (model.wasPropertyExplicitlySet("cpusLowestScaledValue")) {
                this.cpusLowestScaledValue(model.getCpusLowestScaledValue());
            }
            if (model.wasPropertyExplicitlySet("maxAcdsLowestScaledValue")) {
                this.maxAcdsLowestScaledValue(model.getMaxAcdsLowestScaledValue());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Autonomous VM cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The date and time that the Autonomous VM cluster was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Autonomous VM cluster was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the Autonomous VM cluster. */
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
    /** The current state of the Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Autonomous VM cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     *
     * @return the value
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * cluster network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
    private final String vmClusterNetworkId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * cluster network.
     *
     * @return the value
     */
    public String getVmClusterNetworkId() {
        return vmClusterNetworkId;
    }

    /**
     * If true, database backup on local Exadata storage is configured for the Autonomous VM
     * cluster. If false, database backup on local Exadata storage is not available in the
     * Autonomous VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    private final Boolean isLocalBackupEnabled;

    /**
     * If true, database backup on local Exadata storage is configured for the Autonomous VM
     * cluster. If false, database backup on local Exadata storage is not available in the
     * Autonomous VM cluster.
     *
     * @return the value
     */
    public Boolean getIsLocalBackupEnabled() {
        return isLocalBackupEnabled;
    }

    /** The number of enabled CPU cores. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    private final Integer cpusEnabled;

    /**
     * The number of enabled CPU cores.
     *
     * @return the value
     */
    public Integer getCpusEnabled() {
        return cpusEnabled;
    }

    /**
     * The compute model of the Autonomous VM Cluster. ECPU compute model is the recommended model
     * and OCPU compute model is legacy. See [Compute Models in Autonomous Database on Dedicated
     * Exadata
     * #Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
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
     * The compute model of the Autonomous VM Cluster. ECPU compute model is the recommended model
     * and OCPU compute model is legacy. See [Compute Models in Autonomous Database on Dedicated
     * Exadata
     * #Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Autonomous VM Cluster. ECPU compute model is the recommended model
     * and OCPU compute model is legacy. See [Compute Models in Autonomous Database on Dedicated
     * Exadata
     * #Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak)
     * for more details.
     *
     * @return the value
     */
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /** The number of enabled OCPU cores. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
    private final Float ocpusEnabled;

    /**
     * The number of enabled OCPU cores.
     *
     * @return the value
     */
    public Float getOcpusEnabled() {
        return ocpusEnabled;
    }

    /** The numnber of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Integer availableCpus;

    /**
     * The numnber of CPU cores available.
     *
     * @return the value
     */
    public Integer getAvailableCpus() {
        return availableCpus;
    }

    /** The total number of Autonomous Container Databases that can be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalContainerDatabases")
    private final Integer totalContainerDatabases;

    /**
     * The total number of Autonomous Container Databases that can be created.
     *
     * @return the value
     */
    public Integer getTotalContainerDatabases() {
        return totalContainerDatabases;
    }

    /** The amount of memory (in GBs) to be enabled per OCPU or ECPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) to be enabled per OCPU or ECPU.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    private final MaintenanceWindow maintenanceWindow;

    public MaintenanceWindow getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    private final String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * maintenance run.
     *
     * @return the value
     */
    public String getLastMaintenanceRunId() {
        return lastMaintenanceRunId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    private final String nextMaintenanceRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the next
     * maintenance run.
     *
     * @return the value
     */
    public String getNextMaintenanceRunId() {
        return nextMaintenanceRunId;
    }

    /** The percentage of total number of CPUs used in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuPercentage")
    private final Float cpuPercentage;

    /**
     * The percentage of total number of CPUs used in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Float getCpuPercentage() {
        return cpuPercentage;
    }

    /**
     * The percentage of the data storage used for the Autonomous Databases in an Autonomous VM
     * Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStoragePercentage")
    private final Float autonomousDataStoragePercentage;

    /**
     * The percentage of the data storage used for the Autonomous Databases in an Autonomous VM
     * Cluster.
     *
     * @return the value
     */
    public Float getAutonomousDataStoragePercentage() {
        return autonomousDataStoragePercentage;
    }

    /** The number of CPUs provisioned in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedCpus")
    private final Float provisionedCpus;

    /**
     * The number of CPUs provisioned in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Float getProvisionedCpus() {
        return provisionedCpus;
    }

    /** The total data disk group size for Autonomous Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalAutonomousDataStorageInTBs")
    private final Float totalAutonomousDataStorageInTBs;

    /**
     * The total data disk group size for Autonomous Databases, in TBs.
     *
     * @return the value
     */
    public Float getTotalAutonomousDataStorageInTBs() {
        return totalAutonomousDataStorageInTBs;
    }

    /** The number of CPUs reserved in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedCpus")
    private final Float reservedCpus;

    /**
     * The number of CPUs reserved in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Float getReservedCpus() {
        return reservedCpus;
    }

    /** **Deprecated.** Use field totalContainerDatabases. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
    private final Integer provisionableAutonomousContainerDatabases;

    /**
     * **Deprecated.** Use field totalContainerDatabases.
     *
     * @return the value
     */
    public Integer getProvisionableAutonomousContainerDatabases() {
        return provisionableAutonomousContainerDatabases;
    }

    /** The number of provisioned Autonomous Container Databases in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionedAutonomousContainerDatabases")
    private final Integer provisionedAutonomousContainerDatabases;

    /**
     * The number of provisioned Autonomous Container Databases in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Integer getProvisionedAutonomousContainerDatabases() {
        return provisionedAutonomousContainerDatabases;
    }

    /**
     * The number of non-provisionable Autonomous Container Databases in an Autonomous VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonProvisionableAutonomousContainerDatabases")
    private final Integer nonProvisionableAutonomousContainerDatabases;

    /**
     * The number of non-provisionable Autonomous Container Databases in an Autonomous VM Cluster.
     *
     * @return the value
     */
    public Integer getNonProvisionableAutonomousContainerDatabases() {
        return nonProvisionableAutonomousContainerDatabases;
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

    /** The total data storage allocated in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Double dataStorageSizeInTBs;

    /**
     * The total data storage allocated in TBs
     *
     * @return the value
     */
    public Double getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /** The total data storage allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Double dataStorageSizeInGBs;

    /**
     * The total data storage allocated in GBs.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * **Deprecated.** Use {@code availableAutonomousDataStorageSizeInTBs} for Autonomous Databases'
     * data storage availability in TBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageSizeInTBs")
    private final Double availableDataStorageSizeInTBs;

    /**
     * **Deprecated.** Use {@code availableAutonomousDataStorageSizeInTBs} for Autonomous Databases'
     * data storage availability in TBs.
     *
     * @return the value
     */
    public Double getAvailableDataStorageSizeInTBs() {
        return availableDataStorageSizeInTBs;
    }

    /** The number of nodes in the Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the Autonomous VM Cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
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
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
     * LICENSE_INCLUDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is
     * LICENSE_INCLUDED.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Db servers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Db servers.
     *
     * @return the value
     */
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /**
     * CPUs that continue to be included in the count of CPUs available to the Autonomous Container
     * Database even after one of its Autonomous Database is terminated or scaled down. You can
     * release them to the available CPUs at its parent Autonomous VM Cluster level by restarting
     * the Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Integer reclaimableCpus;

    /**
     * CPUs that continue to be included in the count of CPUs available to the Autonomous Container
     * Database even after one of its Autonomous Database is terminated or scaled down. You can
     * release them to the available CPUs at its parent Autonomous VM Cluster level by restarting
     * the Autonomous Container Database.
     *
     * @return the value
     */
    public Integer getReclaimableCpus() {
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

    /** The SCAN Listener TLS port number. Default value is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listener TLS port number. Default value is 2484.
     *
     * @return the value
     */
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /** The SCAN Listener Non TLS port number. Default value is 1521. */
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port number. Default value is 1521.
     *
     * @return the value
     */
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default
     * is TLS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
    private final Boolean isMtlsEnabled;

    /**
     * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default
     * is TLS.
     *
     * @return the value
     */
    public Boolean getIsMtlsEnabled() {
        return isMtlsEnabled;
    }

    /** The date and time of the Database SSL certificate expiration. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDatabaseSslCertificateExpires")
    private final java.util.Date timeDatabaseSslCertificateExpires;

    /**
     * The date and time of the Database SSL certificate expiration.
     *
     * @return the value
     */
    public java.util.Date getTimeDatabaseSslCertificateExpires() {
        return timeDatabaseSslCertificateExpires;
    }

    /** The date and time of the ORDS certificate expiration. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOrdsCertificateExpires")
    private final java.util.Date timeOrdsCertificateExpires;

    /**
     * The date and time of the ORDS certificate expiration.
     *
     * @return the value
     */
    public java.util.Date getTimeOrdsCertificateExpires() {
        return timeOrdsCertificateExpires;
    }

    /** The lowest value to which exadataStorage(in TBs) can be scaled down. */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBsLowestScaledValue")
    private final Double exadataStorageInTBsLowestScaledValue;

    /**
     * The lowest value to which exadataStorage(in TBs) can be scaled down.
     *
     * @return the value
     */
    public Double getExadataStorageInTBsLowestScaledValue() {
        return exadataStorageInTBsLowestScaledValue;
    }

    /** The lowest value to which cpus can be scaled down. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpusLowestScaledValue")
    private final Integer cpusLowestScaledValue;

    /**
     * The lowest value to which cpus can be scaled down.
     *
     * @return the value
     */
    public Integer getCpusLowestScaledValue() {
        return cpusLowestScaledValue;
    }

    /** The lowest value to which maximum number of ACDs can be scaled down. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAcdsLowestScaledValue")
    private final Integer maxAcdsLowestScaledValue;

    /**
     * The lowest value to which maximum number of ACDs can be scaled down.
     *
     * @return the value
     */
    public Integer getMaxAcdsLowestScaledValue() {
        return maxAcdsLowestScaledValue;
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
        sb.append("AutonomousVmCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", vmClusterNetworkId=").append(String.valueOf(this.vmClusterNetworkId));
        sb.append(", isLocalBackupEnabled=").append(String.valueOf(this.isLocalBackupEnabled));
        sb.append(", cpusEnabled=").append(String.valueOf(this.cpusEnabled));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", ocpusEnabled=").append(String.valueOf(this.ocpusEnabled));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", maintenanceWindow=").append(String.valueOf(this.maintenanceWindow));
        sb.append(", lastMaintenanceRunId=").append(String.valueOf(this.lastMaintenanceRunId));
        sb.append(", nextMaintenanceRunId=").append(String.valueOf(this.nextMaintenanceRunId));
        sb.append(", cpuPercentage=").append(String.valueOf(this.cpuPercentage));
        sb.append(", autonomousDataStoragePercentage=")
                .append(String.valueOf(this.autonomousDataStoragePercentage));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", totalAutonomousDataStorageInTBs=")
                .append(String.valueOf(this.totalAutonomousDataStorageInTBs));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", provisionableAutonomousContainerDatabases=")
                .append(String.valueOf(this.provisionableAutonomousContainerDatabases));
        sb.append(", provisionedAutonomousContainerDatabases=")
                .append(String.valueOf(this.provisionedAutonomousContainerDatabases));
        sb.append(", nonProvisionableAutonomousContainerDatabases=")
                .append(String.valueOf(this.nonProvisionableAutonomousContainerDatabases));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", availableDataStorageSizeInTBs=")
                .append(String.valueOf(this.availableDataStorageSizeInTBs));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", availableContainerDatabases=")
                .append(String.valueOf(this.availableContainerDatabases));
        sb.append(", availableAutonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.availableAutonomousDataStorageSizeInTBs));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", isMtlsEnabled=").append(String.valueOf(this.isMtlsEnabled));
        sb.append(", timeDatabaseSslCertificateExpires=")
                .append(String.valueOf(this.timeDatabaseSslCertificateExpires));
        sb.append(", timeOrdsCertificateExpires=")
                .append(String.valueOf(this.timeOrdsCertificateExpires));
        sb.append(", exadataStorageInTBsLowestScaledValue=")
                .append(String.valueOf(this.exadataStorageInTBsLowestScaledValue));
        sb.append(", cpusLowestScaledValue=").append(String.valueOf(this.cpusLowestScaledValue));
        sb.append(", maxAcdsLowestScaledValue=")
                .append(String.valueOf(this.maxAcdsLowestScaledValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousVmCluster)) {
            return false;
        }

        AutonomousVmCluster other = (AutonomousVmCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.vmClusterNetworkId, other.vmClusterNetworkId)
                && java.util.Objects.equals(this.isLocalBackupEnabled, other.isLocalBackupEnabled)
                && java.util.Objects.equals(this.cpusEnabled, other.cpusEnabled)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.ocpusEnabled, other.ocpusEnabled)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(this.maintenanceWindow, other.maintenanceWindow)
                && java.util.Objects.equals(this.lastMaintenanceRunId, other.lastMaintenanceRunId)
                && java.util.Objects.equals(this.nextMaintenanceRunId, other.nextMaintenanceRunId)
                && java.util.Objects.equals(this.cpuPercentage, other.cpuPercentage)
                && java.util.Objects.equals(
                        this.autonomousDataStoragePercentage, other.autonomousDataStoragePercentage)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
                && java.util.Objects.equals(
                        this.totalAutonomousDataStorageInTBs, other.totalAutonomousDataStorageInTBs)
                && java.util.Objects.equals(this.reservedCpus, other.reservedCpus)
                && java.util.Objects.equals(
                        this.provisionableAutonomousContainerDatabases,
                        other.provisionableAutonomousContainerDatabases)
                && java.util.Objects.equals(
                        this.provisionedAutonomousContainerDatabases,
                        other.provisionedAutonomousContainerDatabases)
                && java.util.Objects.equals(
                        this.nonProvisionableAutonomousContainerDatabases,
                        other.nonProvisionableAutonomousContainerDatabases)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.availableDataStorageSizeInTBs, other.availableDataStorageSizeInTBs)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(
                        this.availableContainerDatabases, other.availableContainerDatabases)
                && java.util.Objects.equals(
                        this.availableAutonomousDataStorageSizeInTBs,
                        other.availableAutonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(this.isMtlsEnabled, other.isMtlsEnabled)
                && java.util.Objects.equals(
                        this.timeDatabaseSslCertificateExpires,
                        other.timeDatabaseSslCertificateExpires)
                && java.util.Objects.equals(
                        this.timeOrdsCertificateExpires, other.timeOrdsCertificateExpires)
                && java.util.Objects.equals(
                        this.exadataStorageInTBsLowestScaledValue,
                        other.exadataStorageInTBsLowestScaledValue)
                && java.util.Objects.equals(this.cpusLowestScaledValue, other.cpusLowestScaledValue)
                && java.util.Objects.equals(
                        this.maxAcdsLowestScaledValue, other.maxAcdsLowestScaledValue)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterNetworkId == null
                                ? 43
                                : this.vmClusterNetworkId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalBackupEnabled == null
                                ? 43
                                : this.isLocalBackupEnabled.hashCode());
        result = (result * PRIME) + (this.cpusEnabled == null ? 43 : this.cpusEnabled.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result = (result * PRIME) + (this.ocpusEnabled == null ? 43 : this.ocpusEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalContainerDatabases == null
                                ? 43
                                : this.totalContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCoreCountPerNode == null
                                ? 43
                                : this.cpuCoreCountPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.autonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindow == null ? 43 : this.maintenanceWindow.hashCode());
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
                        + (this.cpuPercentage == null ? 43 : this.cpuPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStoragePercentage == null
                                ? 43
                                : this.autonomousDataStoragePercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAutonomousDataStorageInTBs == null
                                ? 43
                                : this.totalAutonomousDataStorageInTBs.hashCode());
        result = (result * PRIME) + (this.reservedCpus == null ? 43 : this.reservedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionableAutonomousContainerDatabases == null
                                ? 43
                                : this.provisionableAutonomousContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedAutonomousContainerDatabases == null
                                ? 43
                                : this.provisionedAutonomousContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.nonProvisionableAutonomousContainerDatabases == null
                                ? 43
                                : this.nonProvisionableAutonomousContainerDatabases.hashCode());
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
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDataStorageSizeInTBs == null
                                ? 43
                                : this.availableDataStorageSizeInTBs.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
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
                        + (this.availableAutonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.availableAutonomousDataStorageSizeInTBs.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isMtlsEnabled == null ? 43 : this.isMtlsEnabled.hashCode());
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
                        + (this.exadataStorageInTBsLowestScaledValue == null
                                ? 43
                                : this.exadataStorageInTBsLowestScaledValue.hashCode());
        result =
                (result * PRIME)
                        + (this.cpusLowestScaledValue == null
                                ? 43
                                : this.cpusLowestScaledValue.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAcdsLowestScaledValue == null
                                ? 43
                                : this.maxAcdsLowestScaledValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
