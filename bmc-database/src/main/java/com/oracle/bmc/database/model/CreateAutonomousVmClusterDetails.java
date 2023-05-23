/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for the create Autonomous VM cluster operation.
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
    builder = CreateAutonomousVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAutonomousVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "exadataInfrastructureId",
        "vmClusterNetworkId",
        "timeZone",
        "isLocalBackupEnabled",
        "licenseModel",
        "totalContainerDatabases",
        "cpuCoreCountPerNode",
        "computeModel",
        "memoryPerOracleComputeUnitInGBs",
        "autonomousDataStorageSizeInTBs",
        "maintenanceWindowDetails",
        "dbServers",
        "freeformTags",
        "definedTags",
        "scanListenerPortTls",
        "scanListenerPortNonTls",
        "isMtlsEnabled"
    })
    public CreateAutonomousVmClusterDetails(
            String compartmentId,
            String displayName,
            String exadataInfrastructureId,
            String vmClusterNetworkId,
            String timeZone,
            Boolean isLocalBackupEnabled,
            LicenseModel licenseModel,
            Integer totalContainerDatabases,
            Integer cpuCoreCountPerNode,
            ComputeModel computeModel,
            Integer memoryPerOracleComputeUnitInGBs,
            Double autonomousDataStorageSizeInTBs,
            MaintenanceWindow maintenanceWindowDetails,
            java.util.List<String> dbServers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Integer scanListenerPortTls,
            Integer scanListenerPortNonTls,
            Boolean isMtlsEnabled) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.vmClusterNetworkId = vmClusterNetworkId;
        this.timeZone = timeZone;
        this.isLocalBackupEnabled = isLocalBackupEnabled;
        this.licenseModel = licenseModel;
        this.totalContainerDatabases = totalContainerDatabases;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.computeModel = computeModel;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.dbServers = dbServers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.scanListenerPortTls = scanListenerPortTls;
        this.scanListenerPortNonTls = scanListenerPortNonTls;
        this.isMtlsEnabled = isMtlsEnabled;
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
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
         * @param exadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
        private String vmClusterNetworkId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
         * @param vmClusterNetworkId the value to set
         * @return this builder
         **/
        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = vmClusterNetworkId;
            this.__explicitlySet__.add("vmClusterNetworkId");
            return this;
        }
        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        /**
         * If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
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
         * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
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
         * The number of CPU cores to enable per VM cluster node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
        private Integer cpuCoreCountPerNode;

        /**
         * The number of CPU cores to enable per VM cluster node.
         * @param cpuCoreCountPerNode the value to set
         * @return this builder
         **/
        public Builder cpuCoreCountPerNode(Integer cpuCoreCountPerNode) {
            this.cpuCoreCountPerNode = cpuCoreCountPerNode;
            this.__explicitlySet__.add("cpuCoreCountPerNode");
            return this;
        }
        /**
         * The compute model of the Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private ComputeModel computeModel;

        /**
         * The compute model of the Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
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

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db servers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db servers.
         * @param dbServers the value to set
         * @return this builder
         **/
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
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
        /**
         * The SCAN Listener TLS port number. Default value is 2484.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
        private Integer scanListenerPortTls;

        /**
         * The SCAN Listener TLS port number. Default value is 2484.
         * @param scanListenerPortTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortTls(Integer scanListenerPortTls) {
            this.scanListenerPortTls = scanListenerPortTls;
            this.__explicitlySet__.add("scanListenerPortTls");
            return this;
        }
        /**
         * The SCAN Listener Non TLS port number. Default value is 1521.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
        private Integer scanListenerPortNonTls;

        /**
         * The SCAN Listener Non TLS port number. Default value is 1521.
         * @param scanListenerPortNonTls the value to set
         * @return this builder
         **/
        public Builder scanListenerPortNonTls(Integer scanListenerPortNonTls) {
            this.scanListenerPortNonTls = scanListenerPortNonTls;
            this.__explicitlySet__.add("scanListenerPortNonTls");
            return this;
        }
        /**
         * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default is TLS.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
        private Boolean isMtlsEnabled;

        /**
         * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default is TLS.
         * @param isMtlsEnabled the value to set
         * @return this builder
         **/
        public Builder isMtlsEnabled(Boolean isMtlsEnabled) {
            this.isMtlsEnabled = isMtlsEnabled;
            this.__explicitlySet__.add("isMtlsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousVmClusterDetails build() {
            CreateAutonomousVmClusterDetails model =
                    new CreateAutonomousVmClusterDetails(
                            this.compartmentId,
                            this.displayName,
                            this.exadataInfrastructureId,
                            this.vmClusterNetworkId,
                            this.timeZone,
                            this.isLocalBackupEnabled,
                            this.licenseModel,
                            this.totalContainerDatabases,
                            this.cpuCoreCountPerNode,
                            this.computeModel,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.autonomousDataStorageSizeInTBs,
                            this.maintenanceWindowDetails,
                            this.dbServers,
                            this.freeformTags,
                            this.definedTags,
                            this.scanListenerPortTls,
                            this.scanListenerPortNonTls,
                            this.isMtlsEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("vmClusterNetworkId")) {
                this.vmClusterNetworkId(model.getVmClusterNetworkId());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("isLocalBackupEnabled")) {
                this.isLocalBackupEnabled(model.getIsLocalBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * @return the value
     **/
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
    private final String vmClusterNetworkId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     * @return the value
     **/
    public String getVmClusterNetworkId() {
        return vmClusterNetworkId;
    }

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    private final Boolean isLocalBackupEnabled;

    /**
     * If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
     *
     * @return the value
     **/
    public Boolean getIsLocalBackupEnabled() {
        return isLocalBackupEnabled;
    }

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
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
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is BRING_YOUR_OWN_LICENSE.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
     * The number of CPU cores to enable per VM cluster node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCountPerNode")
    private final Integer cpuCoreCountPerNode;

    /**
     * The number of CPU cores to enable per VM cluster node.
     * @return the value
     **/
    public Integer getCpuCoreCountPerNode() {
        return cpuCoreCountPerNode;
    }

    /**
     * The compute model of the Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
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
     * The compute model of the Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Autonomous VM Cluster. See [Compute Models in Autonomous Database on Dedicated Exadata Infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/adbak) for more details.
     *
     * @return the value
     **/
    public ComputeModel getComputeModel() {
        return computeModel;
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

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db servers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db servers.
     * @return the value
     **/
    public java.util.List<String> getDbServers() {
        return dbServers;
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

    /**
     * The SCAN Listener TLS port number. Default value is 2484.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortTls")
    private final Integer scanListenerPortTls;

    /**
     * The SCAN Listener TLS port number. Default value is 2484.
     * @return the value
     **/
    public Integer getScanListenerPortTls() {
        return scanListenerPortTls;
    }

    /**
     * The SCAN Listener Non TLS port number. Default value is 1521.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanListenerPortNonTls")
    private final Integer scanListenerPortNonTls;

    /**
     * The SCAN Listener Non TLS port number. Default value is 1521.
     * @return the value
     **/
    public Integer getScanListenerPortNonTls() {
        return scanListenerPortNonTls;
    }

    /**
     * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default is TLS.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsEnabled")
    private final Boolean isMtlsEnabled;

    /**
     * Enable mutual TLS(mTLS) authentication for database while provisioning a VMCluster. Default is TLS.
     * @return the value
     **/
    public Boolean getIsMtlsEnabled() {
        return isMtlsEnabled;
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
        sb.append("CreateAutonomousVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", vmClusterNetworkId=").append(String.valueOf(this.vmClusterNetworkId));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", isLocalBackupEnabled=").append(String.valueOf(this.isLocalBackupEnabled));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", scanListenerPortTls=").append(String.valueOf(this.scanListenerPortTls));
        sb.append(", scanListenerPortNonTls=").append(String.valueOf(this.scanListenerPortNonTls));
        sb.append(", isMtlsEnabled=").append(String.valueOf(this.isMtlsEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousVmClusterDetails)) {
            return false;
        }

        CreateAutonomousVmClusterDetails other = (CreateAutonomousVmClusterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.vmClusterNetworkId, other.vmClusterNetworkId)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.isLocalBackupEnabled, other.isLocalBackupEnabled)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.scanListenerPortTls, other.scanListenerPortTls)
                && java.util.Objects.equals(
                        this.scanListenerPortNonTls, other.scanListenerPortNonTls)
                && java.util.Objects.equals(this.isMtlsEnabled, other.isMtlsEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalBackupEnabled == null
                                ? 43
                                : this.isLocalBackupEnabled.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
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
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
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
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
