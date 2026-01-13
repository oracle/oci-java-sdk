/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Cloud Autonomous VM Cluster usage details, including the Autonomous Container Databases usage.
 * <br>
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
        builder = CloudAutonomousVmClusterResourceUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudAutonomousVmClusterResourceUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "id",
        "autonomousDataStorageSizeInTBs",
        "dbNodeStorageSizeInGBs",
        "memorySizeInGBs",
        "totalContainerDatabases",
        "availableAutonomousDataStorageSizeInTBs",
        "usedAutonomousDataStorageSizeInTBs",
        "memoryPerOracleComputeUnitInGBs",
        "memoryPerComputeUnitInGBs",
        "exadataStorageInTBs",
        "totalCpus",
        "usedCpus",
        "availableCpus",
        "reclaimableCpus",
        "provisionedCpus",
        "reservedCpus",
        "provisionableAutonomousContainerDatabases",
        "provisionedAutonomousContainerDatabases",
        "nonProvisionableAutonomousContainerDatabases",
        "autonomousVmResourceUsage"
    })
    public CloudAutonomousVmClusterResourceUsage(
            String displayName,
            String id,
            Float autonomousDataStorageSizeInTBs,
            Integer dbNodeStorageSizeInGBs,
            Integer memorySizeInGBs,
            Integer totalContainerDatabases,
            Float availableAutonomousDataStorageSizeInTBs,
            Float usedAutonomousDataStorageSizeInTBs,
            Integer memoryPerOracleComputeUnitInGBs,
            Float memoryPerComputeUnitInGBs,
            Double exadataStorageInTBs,
            Float totalCpus,
            Float usedCpus,
            Float availableCpus,
            Float reclaimableCpus,
            Float provisionedCpus,
            Float reservedCpus,
            Integer provisionableAutonomousContainerDatabases,
            Integer provisionedAutonomousContainerDatabases,
            Integer nonProvisionableAutonomousContainerDatabases,
            java.util.List<AutonomousVmResourceUsage> autonomousVmResourceUsage) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.autonomousDataStorageSizeInTBs = autonomousDataStorageSizeInTBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.memorySizeInGBs = memorySizeInGBs;
        this.totalContainerDatabases = totalContainerDatabases;
        this.availableAutonomousDataStorageSizeInTBs = availableAutonomousDataStorageSizeInTBs;
        this.usedAutonomousDataStorageSizeInTBs = usedAutonomousDataStorageSizeInTBs;
        this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
        this.memoryPerComputeUnitInGBs = memoryPerComputeUnitInGBs;
        this.exadataStorageInTBs = exadataStorageInTBs;
        this.totalCpus = totalCpus;
        this.usedCpus = usedCpus;
        this.availableCpus = availableCpus;
        this.reclaimableCpus = reclaimableCpus;
        this.provisionedCpus = provisionedCpus;
        this.reservedCpus = reservedCpus;
        this.provisionableAutonomousContainerDatabases = provisionableAutonomousContainerDatabases;
        this.provisionedAutonomousContainerDatabases = provisionedAutonomousContainerDatabases;
        this.nonProvisionableAutonomousContainerDatabases =
                nonProvisionableAutonomousContainerDatabases;
        this.autonomousVmResourceUsage = autonomousVmResourceUsage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Cloud Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** The data disk group size allocated for Autonomous AI Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
        private Float autonomousDataStorageSizeInTBs;

        /**
         * The data disk group size allocated for Autonomous AI Databases, in TBs.
         *
         * @param autonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder autonomousDataStorageSizeInTBs(Float autonomousDataStorageSizeInTBs) {
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
        /** The data disk group size available for Autonomous AI Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
        private Float availableAutonomousDataStorageSizeInTBs;

        /**
         * The data disk group size available for Autonomous AI Databases, in TBs.
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
        /** The data disk group size used for Autonomous AI Databases, in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedAutonomousDataStorageSizeInTBs")
        private Float usedAutonomousDataStorageSizeInTBs;

        /**
         * The data disk group size used for Autonomous AI Databases, in TBs.
         *
         * @param usedAutonomousDataStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder usedAutonomousDataStorageSizeInTBs(
                Float usedAutonomousDataStorageSizeInTBs) {
            this.usedAutonomousDataStorageSizeInTBs = usedAutonomousDataStorageSizeInTBs;
            this.__explicitlySet__.add("usedAutonomousDataStorageSizeInTBs");
            return this;
        }
        /**
         * The amount of memory (in GBs rounded off to nearest integer value) enabled per ECPU or
         * OCPU. This is deprecated. Please refer to memoryPerComputeUnitInGBs for accurate value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
        private Integer memoryPerOracleComputeUnitInGBs;

        /**
         * The amount of memory (in GBs rounded off to nearest integer value) enabled per ECPU or
         * OCPU. This is deprecated. Please refer to memoryPerComputeUnitInGBs for accurate value.
         *
         * @param memoryPerOracleComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerOracleComputeUnitInGBs(Integer memoryPerOracleComputeUnitInGBs) {
            this.memoryPerOracleComputeUnitInGBs = memoryPerOracleComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerOracleComputeUnitInGBs");
            return this;
        }
        /** The amount of memory (in GBs) to be enabled per OCPU or ECPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryPerComputeUnitInGBs")
        private Float memoryPerComputeUnitInGBs;

        /**
         * The amount of memory (in GBs) to be enabled per OCPU or ECPU.
         *
         * @param memoryPerComputeUnitInGBs the value to set
         * @return this builder
         */
        public Builder memoryPerComputeUnitInGBs(Float memoryPerComputeUnitInGBs) {
            this.memoryPerComputeUnitInGBs = memoryPerComputeUnitInGBs;
            this.__explicitlySet__.add("memoryPerComputeUnitInGBs");
            return this;
        }
        /**
         * Total exadata storage allocated for the Autonomous VM Cluster. DATA + RECOVERY + SPARSE +
         * any overhead in TBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
        private Double exadataStorageInTBs;

        /**
         * Total exadata storage allocated for the Autonomous VM Cluster. DATA + RECOVERY + SPARSE +
         * any overhead in TBs.
         *
         * @param exadataStorageInTBs the value to set
         * @return this builder
         */
        public Builder exadataStorageInTBs(Double exadataStorageInTBs) {
            this.exadataStorageInTBs = exadataStorageInTBs;
            this.__explicitlySet__.add("exadataStorageInTBs");
            return this;
        }
        /** The number of CPU cores enabled on the Cloud Autonomous VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
        private Float totalCpus;

        /**
         * The number of CPU cores enabled on the Cloud Autonomous VM cluster.
         *
         * @param totalCpus the value to set
         * @return this builder
         */
        public Builder totalCpus(Float totalCpus) {
            this.totalCpus = totalCpus;
            this.__explicitlySet__.add("totalCpus");
            return this;
        }
        /**
         * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud
         * Autonomous VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
        private Float usedCpus;

        /**
         * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud
         * Autonomous VM cluster.
         *
         * @param usedCpus the value to set
         * @return this builder
         */
        public Builder usedCpus(Float usedCpus) {
            this.usedCpus = usedCpus;
            this.__explicitlySet__.add("usedCpus");
            return this;
        }
        /** The number of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Float availableCpus;

        /**
         * The number of CPU cores available.
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
         * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database even after one of its Autonomous AI Database is terminated or scaled
         * down. You can release them to the available OCPUs at its parent AVMC level by restarting
         * the Autonomous Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
        private Float reclaimableCpus;

        /**
         * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
         * Container Database even after one of its Autonomous AI Database is terminated or scaled
         * down. You can release them to the available OCPUs at its parent AVMC level by restarting
         * the Autonomous Container Database.
         *
         * @param reclaimableCpus the value to set
         * @return this builder
         */
        public Builder reclaimableCpus(Float reclaimableCpus) {
            this.reclaimableCpus = reclaimableCpus;
            this.__explicitlySet__.add("reclaimableCpus");
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
        /**
         * The number of provisionable Autonomous Container Databases in an Autonomous VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
        private Integer provisionableAutonomousContainerDatabases;

        /**
         * The number of provisionable Autonomous Container Databases in an Autonomous VM Cluster.
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
        /** List of Autonomous VM resource usages. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmResourceUsage")
        private java.util.List<AutonomousVmResourceUsage> autonomousVmResourceUsage;

        /**
         * List of Autonomous VM resource usages.
         *
         * @param autonomousVmResourceUsage the value to set
         * @return this builder
         */
        public Builder autonomousVmResourceUsage(
                java.util.List<AutonomousVmResourceUsage> autonomousVmResourceUsage) {
            this.autonomousVmResourceUsage = autonomousVmResourceUsage;
            this.__explicitlySet__.add("autonomousVmResourceUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudAutonomousVmClusterResourceUsage build() {
            CloudAutonomousVmClusterResourceUsage model =
                    new CloudAutonomousVmClusterResourceUsage(
                            this.displayName,
                            this.id,
                            this.autonomousDataStorageSizeInTBs,
                            this.dbNodeStorageSizeInGBs,
                            this.memorySizeInGBs,
                            this.totalContainerDatabases,
                            this.availableAutonomousDataStorageSizeInTBs,
                            this.usedAutonomousDataStorageSizeInTBs,
                            this.memoryPerOracleComputeUnitInGBs,
                            this.memoryPerComputeUnitInGBs,
                            this.exadataStorageInTBs,
                            this.totalCpus,
                            this.usedCpus,
                            this.availableCpus,
                            this.reclaimableCpus,
                            this.provisionedCpus,
                            this.reservedCpus,
                            this.provisionableAutonomousContainerDatabases,
                            this.provisionedAutonomousContainerDatabases,
                            this.nonProvisionableAutonomousContainerDatabases,
                            this.autonomousVmResourceUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudAutonomousVmClusterResourceUsage model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("autonomousDataStorageSizeInTBs")) {
                this.autonomousDataStorageSizeInTBs(model.getAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("totalContainerDatabases")) {
                this.totalContainerDatabases(model.getTotalContainerDatabases());
            }
            if (model.wasPropertyExplicitlySet("availableAutonomousDataStorageSizeInTBs")) {
                this.availableAutonomousDataStorageSizeInTBs(
                        model.getAvailableAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("usedAutonomousDataStorageSizeInTBs")) {
                this.usedAutonomousDataStorageSizeInTBs(
                        model.getUsedAutonomousDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("memoryPerOracleComputeUnitInGBs")) {
                this.memoryPerOracleComputeUnitInGBs(model.getMemoryPerOracleComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("memoryPerComputeUnitInGBs")) {
                this.memoryPerComputeUnitInGBs(model.getMemoryPerComputeUnitInGBs());
            }
            if (model.wasPropertyExplicitlySet("exadataStorageInTBs")) {
                this.exadataStorageInTBs(model.getExadataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("totalCpus")) {
                this.totalCpus(model.getTotalCpus());
            }
            if (model.wasPropertyExplicitlySet("usedCpus")) {
                this.usedCpus(model.getUsedCpus());
            }
            if (model.wasPropertyExplicitlySet("availableCpus")) {
                this.availableCpus(model.getAvailableCpus());
            }
            if (model.wasPropertyExplicitlySet("reclaimableCpus")) {
                this.reclaimableCpus(model.getReclaimableCpus());
            }
            if (model.wasPropertyExplicitlySet("provisionedCpus")) {
                this.provisionedCpus(model.getProvisionedCpus());
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
            if (model.wasPropertyExplicitlySet("autonomousVmResourceUsage")) {
                this.autonomousVmResourceUsage(model.getAutonomousVmResourceUsage());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cloud Autonomous VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The data disk group size allocated for Autonomous AI Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDataStorageSizeInTBs")
    private final Float autonomousDataStorageSizeInTBs;

    /**
     * The data disk group size allocated for Autonomous AI Databases, in TBs.
     *
     * @return the value
     */
    public Float getAutonomousDataStorageSizeInTBs() {
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

    /** The data disk group size available for Autonomous AI Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableAutonomousDataStorageSizeInTBs")
    private final Float availableAutonomousDataStorageSizeInTBs;

    /**
     * The data disk group size available for Autonomous AI Databases, in TBs.
     *
     * @return the value
     */
    public Float getAvailableAutonomousDataStorageSizeInTBs() {
        return availableAutonomousDataStorageSizeInTBs;
    }

    /** The data disk group size used for Autonomous AI Databases, in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedAutonomousDataStorageSizeInTBs")
    private final Float usedAutonomousDataStorageSizeInTBs;

    /**
     * The data disk group size used for Autonomous AI Databases, in TBs.
     *
     * @return the value
     */
    public Float getUsedAutonomousDataStorageSizeInTBs() {
        return usedAutonomousDataStorageSizeInTBs;
    }

    /**
     * The amount of memory (in GBs rounded off to nearest integer value) enabled per ECPU or OCPU.
     * This is deprecated. Please refer to memoryPerComputeUnitInGBs for accurate value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerOracleComputeUnitInGBs")
    private final Integer memoryPerOracleComputeUnitInGBs;

    /**
     * The amount of memory (in GBs rounded off to nearest integer value) enabled per ECPU or OCPU.
     * This is deprecated. Please refer to memoryPerComputeUnitInGBs for accurate value.
     *
     * @return the value
     */
    public Integer getMemoryPerOracleComputeUnitInGBs() {
        return memoryPerOracleComputeUnitInGBs;
    }

    /** The amount of memory (in GBs) to be enabled per OCPU or ECPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryPerComputeUnitInGBs")
    private final Float memoryPerComputeUnitInGBs;

    /**
     * The amount of memory (in GBs) to be enabled per OCPU or ECPU.
     *
     * @return the value
     */
    public Float getMemoryPerComputeUnitInGBs() {
        return memoryPerComputeUnitInGBs;
    }

    /**
     * Total exadata storage allocated for the Autonomous VM Cluster. DATA + RECOVERY + SPARSE + any
     * overhead in TBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataStorageInTBs")
    private final Double exadataStorageInTBs;

    /**
     * Total exadata storage allocated for the Autonomous VM Cluster. DATA + RECOVERY + SPARSE + any
     * overhead in TBs.
     *
     * @return the value
     */
    public Double getExadataStorageInTBs() {
        return exadataStorageInTBs;
    }

    /** The number of CPU cores enabled on the Cloud Autonomous VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
    private final Float totalCpus;

    /**
     * The number of CPU cores enabled on the Cloud Autonomous VM cluster.
     *
     * @return the value
     */
    public Float getTotalCpus() {
        return totalCpus;
    }

    /**
     * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud Autonomous
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedCpus")
    private final Float usedCpus;

    /**
     * The number of CPU cores alloted to the Autonomous Container Databases in an Cloud Autonomous
     * VM cluster.
     *
     * @return the value
     */
    public Float getUsedCpus() {
        return usedCpus;
    }

    /** The number of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    private final Float availableCpus;

    /**
     * The number of CPU cores available.
     *
     * @return the value
     */
    public Float getAvailableCpus() {
        return availableCpus;
    }

    /**
     * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database even after one of its Autonomous AI Database is terminated or scaled down.
     * You can release them to the available OCPUs at its parent AVMC level by restarting the
     * Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimableCpus")
    private final Float reclaimableCpus;

    /**
     * CPU cores that continue to be included in the count of OCPUs available to the Autonomous
     * Container Database even after one of its Autonomous AI Database is terminated or scaled down.
     * You can release them to the available OCPUs at its parent AVMC level by restarting the
     * Autonomous Container Database.
     *
     * @return the value
     */
    public Float getReclaimableCpus() {
        return reclaimableCpus;
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

    /** The number of provisionable Autonomous Container Databases in an Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionableAutonomousContainerDatabases")
    private final Integer provisionableAutonomousContainerDatabases;

    /**
     * The number of provisionable Autonomous Container Databases in an Autonomous VM Cluster.
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

    /** List of Autonomous VM resource usages. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmResourceUsage")
    private final java.util.List<AutonomousVmResourceUsage> autonomousVmResourceUsage;

    /**
     * List of Autonomous VM resource usages.
     *
     * @return the value
     */
    public java.util.List<AutonomousVmResourceUsage> getAutonomousVmResourceUsage() {
        return autonomousVmResourceUsage;
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
        sb.append("CloudAutonomousVmClusterResourceUsage(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", autonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.autonomousDataStorageSizeInTBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", totalContainerDatabases=")
                .append(String.valueOf(this.totalContainerDatabases));
        sb.append(", availableAutonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.availableAutonomousDataStorageSizeInTBs));
        sb.append(", usedAutonomousDataStorageSizeInTBs=")
                .append(String.valueOf(this.usedAutonomousDataStorageSizeInTBs));
        sb.append(", memoryPerOracleComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerOracleComputeUnitInGBs));
        sb.append(", memoryPerComputeUnitInGBs=")
                .append(String.valueOf(this.memoryPerComputeUnitInGBs));
        sb.append(", exadataStorageInTBs=").append(String.valueOf(this.exadataStorageInTBs));
        sb.append(", totalCpus=").append(String.valueOf(this.totalCpus));
        sb.append(", usedCpus=").append(String.valueOf(this.usedCpus));
        sb.append(", availableCpus=").append(String.valueOf(this.availableCpus));
        sb.append(", reclaimableCpus=").append(String.valueOf(this.reclaimableCpus));
        sb.append(", provisionedCpus=").append(String.valueOf(this.provisionedCpus));
        sb.append(", reservedCpus=").append(String.valueOf(this.reservedCpus));
        sb.append(", provisionableAutonomousContainerDatabases=")
                .append(String.valueOf(this.provisionableAutonomousContainerDatabases));
        sb.append(", provisionedAutonomousContainerDatabases=")
                .append(String.valueOf(this.provisionedAutonomousContainerDatabases));
        sb.append(", nonProvisionableAutonomousContainerDatabases=")
                .append(String.valueOf(this.nonProvisionableAutonomousContainerDatabases));
        sb.append(", autonomousVmResourceUsage=")
                .append(String.valueOf(this.autonomousVmResourceUsage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudAutonomousVmClusterResourceUsage)) {
            return false;
        }

        CloudAutonomousVmClusterResourceUsage other = (CloudAutonomousVmClusterResourceUsage) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.autonomousDataStorageSizeInTBs, other.autonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.totalContainerDatabases, other.totalContainerDatabases)
                && java.util.Objects.equals(
                        this.availableAutonomousDataStorageSizeInTBs,
                        other.availableAutonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.usedAutonomousDataStorageSizeInTBs,
                        other.usedAutonomousDataStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.memoryPerOracleComputeUnitInGBs, other.memoryPerOracleComputeUnitInGBs)
                && java.util.Objects.equals(
                        this.memoryPerComputeUnitInGBs, other.memoryPerComputeUnitInGBs)
                && java.util.Objects.equals(this.exadataStorageInTBs, other.exadataStorageInTBs)
                && java.util.Objects.equals(this.totalCpus, other.totalCpus)
                && java.util.Objects.equals(this.usedCpus, other.usedCpus)
                && java.util.Objects.equals(this.availableCpus, other.availableCpus)
                && java.util.Objects.equals(this.reclaimableCpus, other.reclaimableCpus)
                && java.util.Objects.equals(this.provisionedCpus, other.provisionedCpus)
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
                && java.util.Objects.equals(
                        this.autonomousVmResourceUsage, other.autonomousVmResourceUsage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
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
                        + (this.usedAutonomousDataStorageSizeInTBs == null
                                ? 43
                                : this.usedAutonomousDataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerOracleComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerOracleComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryPerComputeUnitInGBs == null
                                ? 43
                                : this.memoryPerComputeUnitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataStorageInTBs == null
                                ? 43
                                : this.exadataStorageInTBs.hashCode());
        result = (result * PRIME) + (this.totalCpus == null ? 43 : this.totalCpus.hashCode());
        result = (result * PRIME) + (this.usedCpus == null ? 43 : this.usedCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCpus == null ? 43 : this.availableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimableCpus == null ? 43 : this.reclaimableCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedCpus == null ? 43 : this.provisionedCpus.hashCode());
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
                        + (this.autonomousVmResourceUsage == null
                                ? 43
                                : this.autonomousVmResourceUsage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
