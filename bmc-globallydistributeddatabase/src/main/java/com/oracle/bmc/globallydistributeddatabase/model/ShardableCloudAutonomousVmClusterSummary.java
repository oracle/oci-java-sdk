/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Shardable cloud autonomous vm cluster summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShardableCloudAutonomousVmClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShardableCloudAutonomousVmClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "lifecycleState",
        "lifecycleStateDetails",
        "displayName",
        "computeModel",
        "availableContainerDatabases",
        "availableCpus",
        "availabilityDomain",
        "autonomousDataStorageSizeInTBs",
        "availableAutonomousDataStorageSizeInTBs",
        "cloudExadataInfrastructureId",
        "clusterTimeZone",
        "totalContainerDatabases",
        "subnetId",
        "shape",
        "nodeCount",
        "licenseModel",
        "memorySizeInGBs",
        "memoryPerOracleComputeUnitInGBs",
        "cpuCoreCount",
        "cpuCoreCountPerNode",
        "ocpuCount",
        "reclaimableCpus",
        "provisionableAutonomousContainerDatabases",
        "freeformTags",
        "definedTags"
    })
    public ShardableCloudAutonomousVmClusterSummary(
            String id,
            String compartmentId,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            String displayName,
            String computeModel,
            Integer availableContainerDatabases,
            Float availableCpus,
            String availabilityDomain,
            Float autonomousDataStorageSizeInTBs,
            Float availableAutonomousDataStorageSizeInTBs,
            String cloudExadataInfrastructureId,
            String clusterTimeZone,
            Integer totalContainerDatabases,
            String subnetId,
            String shape,
            Integer nodeCount,
            String licenseModel,
            Integer memorySizeInGBs,
            Integer memoryPerOracleComputeUnitInGBs,
            Integer cpuCoreCount,
            Integer cpuCoreCountPerNode,
            Float ocpuCount,
            Float reclaimableCpus,
            Integer provisionableAutonomousContainerDatabases,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.displayName = displayName;
        this.computeModel = computeModel;
        this.availableContainerDatabases = availableContainerDatabases;
        this.availableCpus = availableCpus;
        this.availabilityDomain = availabilityDomain;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.clusterTimeZone = clusterTimeZone;
        this.totalContainerDatabases = totalContainerDatabases;
        this.subnetId = subnetId;
        this.shape = shape;
        this.nodeCount = nodeCount;
        this.licenseModel = licenseModel;
        this.memorySizeInGBs = memorySizeInGBs;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.cpuCoreCount = cpuCoreCount;
        this.cpuCoreCountPerNode = cpuCoreCountPerNode;
        this.ocpuCount = ocpuCount;
        this.reclaimableCpus = reclaimableCpus;
        this.provisionableAutonomousContainerDatabases = provisionableAutonomousContainerDatabases;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Cloud autonomous vmcluster identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Cloud autonomous vmcluster identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Cloud autonomous vmcluster compartment id */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Cloud autonomous vmcluster compartment id
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Lifecycle states for shardable Cloud autonomous vm cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for shardable Cloud autonomous vm cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Detailed message for the lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Detailed message for the lifecycle state.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** Cloud autonomous vmcluster displayName */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Cloud autonomous vmcluster displayName
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The compute model of the Cloud Autonomous VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private String computeModel;

        /**
         * The compute model of the Cloud Autonomous VM Cluster.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(String computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
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
         * The name of the availability domain that the cloud Autonomous VM cluster is located in.
         * The format of the availability domain is the same as returned by Cloud Autonomous VM
         * Cluster API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the cloud Autonomous VM cluster is located in.
         * The format of the availability domain is the same as returned by Cloud Autonomous VM
         * Cluster API.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The data disk group size allocated for Autonomous Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Float autonomousDataStorageSizeInTBs;

        /**
         * The data disk group size allocated for Autonomous Databases, in TBs.
         *
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder autonomousDataStorageSizeInTBs(Float autonomousDataStorageSizeInTBs) {
            this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("autonomousDataStorageSizeInTBs");
            return this;
        }
        /** The data disk group size available for Autonomous Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
        private Float availableAutonomousDataStorageSizeInTBs;

        /**
         * The data disk group size available for Autonomous Databases, in TBs.
         *
         * @param availableAutonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder availableAutonomousDataStorageSizeInTBs(
                Float availableAutonomousDataStorageSizeInTBs) {
            this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("availableAutonomousDataStorageSizeInTBs");
            return this;
        }
        /** Cloud Exadata Infrastructure Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
        private String cloudExadataInfrastructureId;

        /**
         * Cloud Exadata Infrastructure Identifier.
         *
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            this.__explicitlySet__.add("cloudExadataInfrastructureId");
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
        /** Cloud autonomous vmcluster subnet id */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Cloud autonomous vmcluster subnet id
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** Cloud autonomous vmcluster shape */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Cloud autonomous vmcluster shape
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Cloud autonomous vmcluster node count */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * Cloud autonomous vmcluster node count
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The Oracle license model that applies to the Oracle Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private String licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous Database.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
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
        /** The amount of memory (in GBs) enabled per OCPU or ECPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) enabled per OCPU or ECPU.
         *
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
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
        /** The number of CPU cores on the cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of CPU cores on the cloud Autonomous VM cluster.
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
         * The CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * The CPUs that continue to be included in the count of CPUs available to the Autonomous
         * Container Database even after one of its Autonomous Database is terminated or scaled
         * down. You can release them to the available CPUs at its parent Autonomous VM Cluster
         * level by restarting the Autonomous Container Database.
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
         * Number of Autonomous Container Databases that can be created in the Autonomous VM Cluster
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
        private Integer provisionableAutonomousContainerDatabases;

        /**
         * Number of Autonomous Container Databases that can be created in the Autonomous VM Cluster
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
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShardableCloudAutonomousVmClusterSummary build() {
            ShardableCloudAutonomousVmClusterSummary model =
                    new ShardableCloudAutonomousVmClusterSummary(
                            this.id,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.displayName,
                            this.computeModel,
                            this.availableContainerDatabases,
                            this.availableCpus,
                            this.availabilityDomain,
                            this.autonomousDataStorageSizeInTBs,
                            this.availableAutonomousDataStorageSizeInTBs,
                            this.cloudExadataInfrastructureId,
                            this.clusterTimeZone,
                            this.totalContainerDatabases,
                            this.subnetId,
                            this.shape,
                            this.nodeCount,
                            this.licenseModel,
                            this.memorySizeInGBs,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.cpuCoreCount,
                            this.cpuCoreCountPerNode,
                            this.ocpuCount,
                            this.reclaimableCpus,
                            this.provisionableAutonomousContainerDatabases,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShardableCloudAutonomousVmClusterSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("availableContainerDatabases")) {
                this.availableContainerDatabases(model.getAvailableContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("availableAutonomousDataStorageSizeInTBs")) {
                this.availableAutonomousDataStorageSizeInTBs(
                        model.getAvailableAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("cloudExadataInfrastructureId")) {
                this.cloudExadataInfrastructureId(model.getCloudExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("clusterTimeZone")) {
                this.clusterTimeZone(model.getClusterTimeZone());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCountPerNode")) {
                this.cpuCoreCountPerNode(model.getCpuCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionableAutonomousContainerDatabases")) {
                this.provisionableAutonomousContainerDatabases(
                        model.getProvisionableAutonomousContainerDatabases());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Cloud autonomous vmcluster identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Cloud autonomous vmcluster identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Cloud autonomous vmcluster compartment id */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Cloud autonomous vmcluster compartment id
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Lifecycle states for shardable Cloud autonomous vm cluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Failed("FAILED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Unavailable("UNAVAILABLE"),

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
    /** Lifecycle states for shardable Cloud autonomous vm cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for shardable Cloud autonomous vm cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Detailed message for the lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Detailed message for the lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** Cloud autonomous vmcluster displayName */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Cloud autonomous vmcluster displayName
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The compute model of the Cloud Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final String computeModel;

    /**
     * The compute model of the Cloud Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getComputeModel() {
        return computeModel;
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
     * The name of the availability domain that the cloud Autonomous VM cluster is located in. The
     * format of the availability domain is the same as returned by Cloud Autonomous VM Cluster API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the cloud Autonomous VM cluster is located in. The
     * format of the availability domain is the same as returned by Cloud Autonomous VM Cluster API.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The data disk group size allocated for Autonomous Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Float autonomousDataStorageSizeInTBs;

    /**
     * The data disk group size allocated for Autonomous Databases, in TBs.
     *
     * @return the value
     */
    public Float getAutonomousDataStorageSizeInTBs() {
        return autonomousDataStorageSizeInTBs;
    }

    /** The data disk group size available for Autonomous Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
    private final Float availableAutonomousDataStorageSizeInTBs;

    /**
     * The data disk group size available for Autonomous Databases, in TBs.
     *
     * @return the value
     */
    public Float getAvailableAutonomousDataStorageSizeInTBs() {
        return availableAutonomousDataStorageSizeInTBs;
    }

    /** Cloud Exadata Infrastructure Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudExadataInfrastructureId")
    private final String cloudExadataInfrastructureId;

    /**
     * Cloud Exadata Infrastructure Identifier.
     *
     * @return the value
     */
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
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

    /** Cloud autonomous vmcluster subnet id */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Cloud autonomous vmcluster subnet id
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** Cloud autonomous vmcluster shape */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Cloud autonomous vmcluster shape
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Cloud autonomous vmcluster node count */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * Cloud autonomous vmcluster node count
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The Oracle license model that applies to the Oracle Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final String licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database.
     *
     * @return the value
     */
    public String getLicenseModel() {
        return licenseModel;
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

    /** The amount of memory (in GBs) enabled per OCPU or ECPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) enabled per OCPU or ECPU.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
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

    /** The number of CPU cores on the cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of CPU cores on the cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The CPUs that continue to be included in the count of CPUs available to the Autonomous
     * Container Database even after one of its Autonomous Database is terminated or scaled down.
     * You can release them to the available CPUs at its parent Autonomous VM Cluster level by
     * restarting the Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * The CPUs that continue to be included in the count of CPUs available to the Autonomous
     * Container Database even after one of its Autonomous Database is terminated or scaled down.
     * You can release them to the available CPUs at its parent Autonomous VM Cluster level by
     * restarting the Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
    }

    /** Number of Autonomous Container Databases that can be created in the Autonomous VM Cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
    private final Integer provisionableAutonomousContainerDatabases;

    /**
     * Number of Autonomous Container Databases that can be created in the Autonomous VM Cluster
     *
     * @return the value
     */
    public Integer getProvisionableAutonomousContainerDatabases() {
        return provisionableAutonomousContainerDatabases;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ShardableCloudAutonomousVmClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", availableContainerDatabases=")
                .append(String.valueOf(this.availableContainerDatabases));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", availableAutonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.availableAutonomousDataStorageSizeInTBs));
        sb.append(", cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(", clusterTimeZone=").append(String.valueOf(this.clusterTimeZone));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", cpuCoreCountPerNode=").append(String.valueOf(this.cpuCoreCountPerNode));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", provisionableAutonomousContainerDatabases=")
                .append(String.valueOf(this.provisionableAutonomousContainerDatabases));
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
        if (!(o instanceof ShardableCloudAutonomousVmClusterSummary)) {
            return false;
        }

        ShardableCloudAutonomousVmClusterSummary other =
                (ShardableCloudAutonomousVmClusterSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(
                        this.availableContainerDatabases, other.availableContainerDatabases)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.availableAutonomousDataStorageSizeInTBs,
                        other.availableAutonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(this.clusterTimeZone, other.clusterTimeZone)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.cpuCoreCountPerNode, other.cpuCoreCountPerNode)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(
                        this.provisionableAutonomousContainerDatabases,
                        other.provisionableAutonomousContainerDatabases)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.availableContainerDatabases == null
                                ? 43
                                : this.availableContainerDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.autonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAutonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.availableAutonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterTimeZone == null ? 43 : this.clusterTimeZone.hashCode());
        result =
                (result * PRIME)
                        + (this.totalContainerDatabases == null
                                ? 43
                                : this.totalContainerDatabases.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuCoreCountPerNode == null
                                ? 43
                                : this.cpuCoreCountPerNode.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionableAutonomousContainerDatabases == null
                                ? 43
                                : this.provisionableAutonomousContainerDatabases.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
