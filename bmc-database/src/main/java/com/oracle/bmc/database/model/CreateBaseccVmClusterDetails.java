/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a BaseDB-C@C VM cluster. Applies to Base Database Service on Cloud@Customer instances only.
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
    builder = CreateBaseccVmClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateBaseccVmClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "databaseEdition",
        "nodeCount",
        "dbServerId",
        "cpuCoreCount",
        "baseInfrastructureId",
        "baseVmClusterNetworkId",
        "giVersion",
        "dataCollectionOptions",
        "description",
        "displayName",
        "sshPublicKeys",
        "timeZone",
        "additionalVmStorageSizeInGBs",
        "dataStorageSizeInGBs",
        "recoStorageSizeInGBs",
        "memorySizeInGBs",
        "licenseModel",
        "freeformTags",
        "definedTags",
        "vmClusterType",
        "cloudAutomationUpdateDetails"
    })
    public CreateBaseccVmClusterDetails(
            String compartmentId,
            DatabaseEdition databaseEdition,
            Integer nodeCount,
            String dbServerId,
            Integer cpuCoreCount,
            String baseInfrastructureId,
            String baseVmClusterNetworkId,
            String giVersion,
            DataCollectionOptions dataCollectionOptions,
            String description,
            String displayName,
            java.util.List<String> sshPublicKeys,
            String timeZone,
            Integer additionalVmStorageSizeInGBs,
            Integer dataStorageSizeInGBs,
            Integer recoStorageSizeInGBs,
            Integer memorySizeInGBs,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            VmClusterType vmClusterType,
            CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
        super();
        this.compartmentId = compartmentId;
        this.databaseEdition = databaseEdition;
        this.nodeCount = nodeCount;
        this.dbServerId = dbServerId;
        this.cpuCoreCount = cpuCoreCount;
        this.baseInfrastructureId = baseInfrastructureId;
        this.baseVmClusterNetworkId = baseVmClusterNetworkId;
        this.giVersion = giVersion;
        this.dataCollectionOptions = dataCollectionOptions;
        this.description = description;
        this.displayName = displayName;
        this.sshPublicKeys = sshPublicKeys;
        this.timeZone = timeZone;
        this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.recoStorageSizeInGBs = recoStorageSizeInGBs;
        this.memorySizeInGBs = memorySizeInGBs;
        this.licenseModel = licenseModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.vmClusterType = vmClusterType;
        this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
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
         * The Oracle Database Edition that applies to all the databases on the DB system.
         * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to all the databases on the DB system.
         * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         *
         * @param databaseEdition the value to set
         * @return this builder
         **/
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /**
         * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         * @param nodeCount the value to set
         * @return this builder
         **/
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute node of the Oracle Data Cloud@Customer Infrastructure, on which the VM should be launched.
         * Note: Applies to single node Base Database Service on Cloud@Customer (BaseDB-C@C) VM clusters only
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
        private String dbServerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute node of the Oracle Data Cloud@Customer Infrastructure, on which the VM should be launched.
         * Note: Applies to single node Base Database Service on Cloud@Customer (BaseDB-C@C) VM clusters only
         *
         * @param dbServerId the value to set
         * @return this builder
         **/
        public Builder dbServerId(String dbServerId) {
            this.dbServerId = dbServerId;
            this.__explicitlySet__.add("dbServerId");
            return this;
        }
        /**
         * Total CPU cores for the BaseDB C@C VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * Total CPU cores for the BaseDB C@C VM cluster.
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle Data Cloud@Customer Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseInfrastructureId")
        private String baseInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle Data Cloud@Customer Infrastructure.
         * @param baseInfrastructureId the value to set
         * @return this builder
         **/
        public Builder baseInfrastructureId(String baseInfrastructureId) {
            this.baseInfrastructureId = baseInfrastructureId;
            this.__explicitlySet__.add("baseInfrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of BaseDB-C@C VM Cluster Network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseVmClusterNetworkId")
        private String baseVmClusterNetworkId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of BaseDB-C@C VM Cluster Network.
         * @param baseVmClusterNetworkId the value to set
         * @return this builder
         **/
        public Builder baseVmClusterNetworkId(String baseVmClusterNetworkId) {
            this.baseVmClusterNetworkId = baseVmClusterNetworkId;
            this.__explicitlySet__.add("baseVmClusterNetworkId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /**
         * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The name does not need to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The name does not need to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         * @param sshPublicKeys the value to set
         * @return this builder
         **/
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
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
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
        private Integer additionalVmStorageSizeInGBs;

        /**
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param additionalVmStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder additionalVmStorageSizeInGBs(Integer additionalVmStorageSizeInGBs) {
            this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
            this.__explicitlySet__.add("additionalVmStorageSizeInGBs");
            return this;
        }
        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
        private Integer recoStorageSizeInGBs;

        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param recoStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder recoStorageSizeInGBs(Integer recoStorageSizeInGBs) {
            this.recoStorageSizeInGBs = recoStorageSizeInGBs;
            this.__explicitlySet__.add("recoStorageSizeInGBs");
            return this;
        }
        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
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
         * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
        private VmClusterType vmClusterType;

        /**
         * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         * @param vmClusterType the value to set
         * @return this builder
         **/
        public Builder vmClusterType(VmClusterType vmClusterType) {
            this.vmClusterType = vmClusterType;
            this.__explicitlySet__.add("vmClusterType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBaseccVmClusterDetails build() {
            CreateBaseccVmClusterDetails model =
                    new CreateBaseccVmClusterDetails(
                            this.compartmentId,
                            this.databaseEdition,
                            this.nodeCount,
                            this.dbServerId,
                            this.cpuCoreCount,
                            this.baseInfrastructureId,
                            this.baseVmClusterNetworkId,
                            this.giVersion,
                            this.dataCollectionOptions,
                            this.description,
                            this.displayName,
                            this.sshPublicKeys,
                            this.timeZone,
                            this.additionalVmStorageSizeInGBs,
                            this.dataStorageSizeInGBs,
                            this.recoStorageSizeInGBs,
                            this.memorySizeInGBs,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.vmClusterType,
                            this.cloudAutomationUpdateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBaseccVmClusterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("dbServerId")) {
                this.dbServerId(model.getDbServerId());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("baseInfrastructureId")) {
                this.baseInfrastructureId(model.getBaseInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("baseVmClusterNetworkId")) {
                this.baseVmClusterNetworkId(model.getBaseVmClusterNetworkId());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("additionalVmStorageSizeInGBs")) {
                this.additionalVmStorageSizeInGBs(model.getAdditionalVmStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("recoStorageSizeInGBs")) {
                this.recoStorageSizeInGBs(model.getRecoStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
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
            if (model.wasPropertyExplicitlySet("vmClusterType")) {
                this.vmClusterType(model.getVmClusterType());
            }
            if (model.wasPropertyExplicitlySet("cloudAutomationUpdateDetails")) {
                this.cloudAutomationUpdateDetails(model.getCloudAutomationUpdateDetails());
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
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     **/
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionDeveloper("ENTERPRISE_EDITION_DEVELOPER"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseEdition: " + key);
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system.
     * Exadata DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     * @return the value
     **/
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * @return the value
     **/
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute node of the Oracle Data Cloud@Customer Infrastructure, on which the VM should be launched.
     * Note: Applies to single node Base Database Service on Cloud@Customer (BaseDB-C@C) VM clusters only
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
    private final String dbServerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute node of the Oracle Data Cloud@Customer Infrastructure, on which the VM should be launched.
     * Note: Applies to single node Base Database Service on Cloud@Customer (BaseDB-C@C) VM clusters only
     *
     * @return the value
     **/
    public String getDbServerId() {
        return dbServerId;
    }

    /**
     * Total CPU cores for the BaseDB C@C VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * Total CPU cores for the BaseDB C@C VM cluster.
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle Data Cloud@Customer Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseInfrastructureId")
    private final String baseInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle Data Cloud@Customer Infrastructure.
     * @return the value
     **/
    public String getBaseInfrastructureId() {
        return baseInfrastructureId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of BaseDB-C@C VM Cluster Network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseVmClusterNetworkId")
    private final String baseVmClusterNetworkId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of BaseDB-C@C VM Cluster Network.
     * @return the value
     **/
    public String getBaseVmClusterNetworkId() {
        return baseVmClusterNetworkId;
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /**
     * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The name does not need to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * @return the value
     **/
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. For details, see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
    private final Integer additionalVmStorageSizeInGBs;

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     **/
    public Integer getAdditionalVmStorageSizeInGBs() {
        return additionalVmStorageSizeInGBs;
    }

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
    private final Integer recoStorageSizeInGBs;

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     **/
    public Integer getRecoStorageSizeInGBs() {
        return recoStorageSizeInGBs;
    }

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     *
     * @return the value
     **/
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
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
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
     * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
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
     * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
    private final VmClusterType vmClusterType;

    /**
     * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * @return the value
     **/
    public VmClusterType getVmClusterType() {
        return vmClusterType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
    private final CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

    public CloudAutomationUpdateDetails getCloudAutomationUpdateDetails() {
        return cloudAutomationUpdateDetails;
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
        sb.append("CreateBaseccVmClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", dbServerId=").append(String.valueOf(this.dbServerId));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", baseInfrastructureId=").append(String.valueOf(this.baseInfrastructureId));
        sb.append(", baseVmClusterNetworkId=").append(String.valueOf(this.baseVmClusterNetworkId));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", additionalVmStorageSizeInGBs=")
                .append(String.valueOf(this.additionalVmStorageSizeInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", recoStorageSizeInGBs=").append(String.valueOf(this.recoStorageSizeInGBs));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", vmClusterType=").append(String.valueOf(this.vmClusterType));
        sb.append(", cloudAutomationUpdateDetails=")
                .append(String.valueOf(this.cloudAutomationUpdateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBaseccVmClusterDetails)) {
            return false;
        }

        CreateBaseccVmClusterDetails other = (CreateBaseccVmClusterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.dbServerId, other.dbServerId)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.baseInfrastructureId, other.baseInfrastructureId)
                && java.util.Objects.equals(
                        this.baseVmClusterNetworkId, other.baseVmClusterNetworkId)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(
                        this.additionalVmStorageSizeInGBs, other.additionalVmStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.recoStorageSizeInGBs, other.recoStorageSizeInGBs)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.vmClusterType, other.vmClusterType)
                && java.util.Objects.equals(
                        this.cloudAutomationUpdateDetails, other.cloudAutomationUpdateDetails)
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
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.dbServerId == null ? 43 : this.dbServerId.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.baseInfrastructureId == null
                                ? 43
                                : this.baseInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.baseVmClusterNetworkId == null
                                ? 43
                                : this.baseVmClusterNetworkId.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalVmStorageSizeInGBs == null
                                ? 43
                                : this.additionalVmStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStorageSizeInGBs == null
                                ? 43
                                : this.recoStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterType == null ? 43 : this.vmClusterType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutomationUpdateDetails == null
                                ? 43
                                : this.cloudAutomationUpdateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
