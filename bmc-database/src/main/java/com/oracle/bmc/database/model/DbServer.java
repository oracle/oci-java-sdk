/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Exacc Db server resource. Applies to Exadata Cloud@Customer instances only. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbServer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DbServer extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "exadataInfrastructureId",
        "cpuCoreCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "vmClusterIds",
        "autonomousVmClusterIds",
        "autonomousVirtualMachineIds",
        "dbNodeIds",
        "shape",
        "lifecycleState",
        "lifecycleDetails",
        "maxCpuCount",
        "maxMemoryInGBs",
        "maxDbNodeStorageInGBs",
        "timeCreated",
        "dbServerPatchingDetails",
        "freeformTags",
        "definedTags"
    })
    public DbServer(
            String id,
            String displayName,
            String compartmentId,
            String exadataInfrastructureId,
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            java.util.List<String> vmClusterIds,
            java.util.List<String> autonomousVmClusterIds,
            java.util.List<String> autonomousVirtualMachineIds,
            java.util.List<String> dbNodeIds,
            String shape,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Integer maxCpuCount,
            Integer maxMemoryInGBs,
            Integer maxDbNodeStorageInGBs,
            java.util.Date timeCreated,
            DbServerPatchingDetails dbServerPatchingDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.vmClusterIds = vmClusterIds;
        this.autonomousVmClusterIds = autonomousVmClusterIds;
        this.autonomousVirtualMachineIds = autonomousVirtualMachineIds;
        this.dbNodeIds = dbNodeIds;
        this.shape = shape;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.maxCpuCount = maxCpuCount;
        this.maxMemoryInGBs = maxMemoryInGBs;
        this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
        this.timeCreated = timeCreated;
        this.dbServerPatchingDetails = dbServerPatchingDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exacc Db server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exacc Db server.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the Db server. The name does not need to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Db server. The name does not need to be unique.
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
        /** The number of CPU cores enabled on the Db server. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores enabled on the Db server.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         */
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /** The allocated memory in GBs on the Db server. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The allocated memory in GBs on the Db server.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** The allocated local node storage in GBs on the Db server. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The allocated local node storage in GBs on the Db server.
         *
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VM Clusters associated with the Db server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
        private java.util.List<String> vmClusterIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VM Clusters associated with the Db server.
         *
         * @param vmClusterIds the value to set
         * @return this builder
         */
        public Builder vmClusterIds(java.util.List<String> vmClusterIds) {
            this.vmClusterIds = vmClusterIds;
            this.__explicitlySet__.add("vmClusterIds");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Clusters associated with the Db server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterIds")
        private java.util.List<String> autonomousVmClusterIds;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous VM Clusters associated with the Db server.
         *
         * @param autonomousVmClusterIds the value to set
         * @return this builder
         */
        public Builder autonomousVmClusterIds(java.util.List<String> autonomousVmClusterIds) {
            this.autonomousVmClusterIds = autonomousVmClusterIds;
            this.__explicitlySet__.add("autonomousVmClusterIds");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Virtual Machines associated with the Db server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVirtualMachineIds")
        private java.util.List<String> autonomousVirtualMachineIds;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Virtual Machines associated with the Db server.
         *
         * @param autonomousVirtualMachineIds the value to set
         * @return this builder
         */
        public Builder autonomousVirtualMachineIds(
                java.util.List<String> autonomousVirtualMachineIds) {
            this.autonomousVirtualMachineIds = autonomousVirtualMachineIds;
            this.__explicitlySet__.add("autonomousVirtualMachineIds");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Db nodes associated with the Db server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeIds")
        private java.util.List<String> dbNodeIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Db nodes associated with the Db server.
         *
         * @param dbNodeIds the value to set
         * @return this builder
         */
        public Builder dbNodeIds(java.util.List<String> dbNodeIds) {
            this.dbNodeIds = dbNodeIds;
            this.__explicitlySet__.add("dbNodeIds");
            return this;
        }
        /**
         * The shape of the Db server. The shape determines the amount of CPU, storage, and memory
         * resources available.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the Db server. The shape determines the amount of CPU, storage, and memory
         * resources available.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The current state of the Db server. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Db server.
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
        /** The total number of CPU cores available. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
        private Integer maxCpuCount;

        /**
         * The total number of CPU cores available.
         *
         * @param maxCpuCount the value to set
         * @return this builder
         */
        public Builder maxCpuCount(Integer maxCpuCount) {
            this.maxCpuCount = maxCpuCount;
            this.__explicitlySet__.add("maxCpuCount");
            return this;
        }
        /** The total memory available in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
        private Integer maxMemoryInGBs;

        /**
         * The total memory available in GBs.
         *
         * @param maxMemoryInGBs the value to set
         * @return this builder
         */
        public Builder maxMemoryInGBs(Integer maxMemoryInGBs) {
            this.maxMemoryInGBs = maxMemoryInGBs;
            this.__explicitlySet__.add("maxMemoryInGBs");
            return this;
        }
        /** The total local node storage available in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
        private Integer maxDbNodeStorageInGBs;

        /**
         * The total local node storage available in GBs.
         *
         * @param maxDbNodeStorageInGBs the value to set
         * @return this builder
         */
        public Builder maxDbNodeStorageInGBs(Integer maxDbNodeStorageInGBs) {
            this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
            this.__explicitlySet__.add("maxDbNodeStorageInGBs");
            return this;
        }
        /** The date and time that the Db Server was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Db Server was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbServerPatchingDetails")
        private DbServerPatchingDetails dbServerPatchingDetails;

        public Builder dbServerPatchingDetails(DbServerPatchingDetails dbServerPatchingDetails) {
            this.dbServerPatchingDetails = dbServerPatchingDetails;
            this.__explicitlySet__.add("dbServerPatchingDetails");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbServer build() {
            DbServer model =
                    new DbServer(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.exadataInfrastructureId,
                            this.cpuCoreCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.vmClusterIds,
                            this.autonomousVmClusterIds,
                            this.autonomousVirtualMachineIds,
                            this.dbNodeIds,
                            this.shape,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.maxCpuCount,
                            this.maxMemoryInGBs,
                            this.maxDbNodeStorageInGBs,
                            this.timeCreated,
                            this.dbServerPatchingDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbServer model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("vmClusterIds")) {
                this.vmClusterIds(model.getVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("autonomousVmClusterIds")) {
                this.autonomousVmClusterIds(model.getAutonomousVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("autonomousVirtualMachineIds")) {
                this.autonomousVirtualMachineIds(model.getAutonomousVirtualMachineIds());
            }
            if (model.wasPropertyExplicitlySet("dbNodeIds")) {
                this.dbNodeIds(model.getDbNodeIds());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("maxCpuCount")) {
                this.maxCpuCount(model.getMaxCpuCount());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryInGBs")) {
                this.maxMemoryInGBs(model.getMaxMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("maxDbNodeStorageInGBs")) {
                this.maxDbNodeStorageInGBs(model.getMaxDbNodeStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("dbServerPatchingDetails")) {
                this.dbServerPatchingDetails(model.getDbServerPatchingDetails());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exacc Db server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exacc Db server.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the Db server. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Db server. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     *
     * @return the value
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /** The number of CPU cores enabled on the Db server. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores enabled on the Db server.
     *
     * @return the value
     */
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /** The allocated memory in GBs on the Db server. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The allocated memory in GBs on the Db server.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** The allocated local node storage in GBs on the Db server. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The allocated local node storage in GBs on the Db server.
     *
     * @return the value
     */
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM
     * Clusters associated with the Db server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
    private final java.util.List<String> vmClusterIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM
     * Clusters associated with the Db server.
     *
     * @return the value
     */
    public java.util.List<String> getVmClusterIds() {
        return vmClusterIds;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Autonomous VM Clusters associated with the Db server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterIds")
    private final java.util.List<String> autonomousVmClusterIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Autonomous VM Clusters associated with the Db server.
     *
     * @return the value
     */
    public java.util.List<String> getAutonomousVmClusterIds() {
        return autonomousVmClusterIds;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Autonomous Virtual Machines associated with the Db server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVirtualMachineIds")
    private final java.util.List<String> autonomousVirtualMachineIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Autonomous Virtual Machines associated with the Db server.
     *
     * @return the value
     */
    public java.util.List<String> getAutonomousVirtualMachineIds() {
        return autonomousVirtualMachineIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
     * nodes associated with the Db server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeIds")
    private final java.util.List<String> dbNodeIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
     * nodes associated with the Db server.
     *
     * @return the value
     */
    public java.util.List<String> getDbNodeIds() {
        return dbNodeIds;
    }

    /**
     * The shape of the Db server. The shape determines the amount of CPU, storage, and memory
     * resources available.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the Db server. The shape determines the amount of CPU, storage, and memory
     * resources available.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The current state of the Db server. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Available("AVAILABLE"),
        Unavailable("UNAVAILABLE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
    /** The current state of the Db server. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Db server.
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

    /** The total number of CPU cores available. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
    private final Integer maxCpuCount;

    /**
     * The total number of CPU cores available.
     *
     * @return the value
     */
    public Integer getMaxCpuCount() {
        return maxCpuCount;
    }

    /** The total memory available in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
    private final Integer maxMemoryInGBs;

    /**
     * The total memory available in GBs.
     *
     * @return the value
     */
    public Integer getMaxMemoryInGBs() {
        return maxMemoryInGBs;
    }

    /** The total local node storage available in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
    private final Integer maxDbNodeStorageInGBs;

    /**
     * The total local node storage available in GBs.
     *
     * @return the value
     */
    public Integer getMaxDbNodeStorageInGBs() {
        return maxDbNodeStorageInGBs;
    }

    /** The date and time that the Db Server was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Db Server was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbServerPatchingDetails")
    private final DbServerPatchingDetails dbServerPatchingDetails;

    public DbServerPatchingDetails getDbServerPatchingDetails() {
        return dbServerPatchingDetails;
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
        sb.append("DbServer(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", vmClusterIds=").append(String.valueOf(this.vmClusterIds));
        sb.append(", autonomousVmClusterIds=").append(String.valueOf(this.autonomousVmClusterIds));
        sb.append(", autonomousVirtualMachineIds=")
                .append(String.valueOf(this.autonomousVirtualMachineIds));
        sb.append(", dbNodeIds=").append(String.valueOf(this.dbNodeIds));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", maxCpuCount=").append(String.valueOf(this.maxCpuCount));
        sb.append(", maxMemoryInGBs=").append(String.valueOf(this.maxMemoryInGBs));
        sb.append(", maxDbNodeStorageInGBs=").append(String.valueOf(this.maxDbNodeStorageInGBs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", dbServerPatchingDetails=")
                .append(String.valueOf(this.dbServerPatchingDetails));
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
        if (!(o instanceof DbServer)) {
            return false;
        }

        DbServer other = (DbServer) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.vmClusterIds, other.vmClusterIds)
                && java.util.Objects.equals(
                        this.autonomousVmClusterIds, other.autonomousVmClusterIds)
                && java.util.Objects.equals(
                        this.autonomousVirtualMachineIds, other.autonomousVirtualMachineIds)
                && java.util.Objects.equals(this.dbNodeIds, other.dbNodeIds)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.maxCpuCount, other.maxCpuCount)
                && java.util.Objects.equals(this.maxMemoryInGBs, other.maxMemoryInGBs)
                && java.util.Objects.equals(this.maxDbNodeStorageInGBs, other.maxDbNodeStorageInGBs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.dbServerPatchingDetails, other.dbServerPatchingDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.vmClusterIds == null ? 43 : this.vmClusterIds.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterIds == null
                                ? 43
                                : this.autonomousVmClusterIds.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVirtualMachineIds == null
                                ? 43
                                : this.autonomousVirtualMachineIds.hashCode());
        result = (result * PRIME) + (this.dbNodeIds == null ? 43 : this.dbNodeIds.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.maxCpuCount == null ? 43 : this.maxCpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMemoryInGBs == null ? 43 : this.maxMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDbNodeStorageInGBs == null
                                ? 43
                                : this.maxDbNodeStorageInGBs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.dbServerPatchingDetails == null
                                ? 43
                                : this.dbServerPatchingDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
