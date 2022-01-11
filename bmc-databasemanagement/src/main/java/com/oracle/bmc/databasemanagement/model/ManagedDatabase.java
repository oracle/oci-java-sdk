/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a Managed Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagedDatabase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
        private ManagementOption managementOption;

        public Builder managementOption(ManagementOption managementOption) {
            this.managementOption = managementOption;
            this.__explicitlySet__.add("managementOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private WorkloadType workloadType;

        public Builder workloadType(WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
        private String parentContainerId;

        public Builder parentContainerId(String parentContainerId) {
            this.parentContainerId = parentContainerId;
            this.__explicitlySet__.add("parentContainerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroups")
        private java.util.List<ParentGroup> managedDatabaseGroups;

        public Builder managedDatabaseGroups(java.util.List<ParentGroup> managedDatabaseGroups) {
            this.managedDatabaseGroups = managedDatabaseGroups;
            this.__explicitlySet__.add("managedDatabaseGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
        private DatabaseStatus databaseStatus;

        public Builder databaseStatus(DatabaseStatus databaseStatus) {
            this.databaseStatus = databaseStatus;
            this.__explicitlySet__.add("databaseStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerName")
        private String parentContainerName;

        public Builder parentContainerName(String parentContainerName) {
            this.parentContainerName = parentContainerName;
            this.__explicitlySet__.add("parentContainerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerCompartmentId")
        private String parentContainerCompartmentId;

        public Builder parentContainerCompartmentId(String parentContainerCompartmentId) {
            this.parentContainerCompartmentId = parentContainerCompartmentId;
            this.__explicitlySet__.add("parentContainerCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
        private Integer instanceCount;

        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            this.__explicitlySet__.add("instanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
        private java.util.List<InstanceDetails> instanceDetails;

        public Builder instanceDetails(java.util.List<InstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            this.__explicitlySet__.add("instanceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbCount")
        private Integer pdbCount;

        public Builder pdbCount(Integer pdbCount) {
            this.pdbCount = pdbCount;
            this.__explicitlySet__.add("pdbCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbStatus")
        private java.util.List<PdbStatusDetails> pdbStatus;

        public Builder pdbStatus(java.util.List<PdbStatusDetails> pdbStatus) {
            this.pdbStatus = pdbStatus;
            this.__explicitlySet__.add("pdbStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedDatabase build() {
            ManagedDatabase __instance__ =
                    new ManagedDatabase(
                            id,
                            compartmentId,
                            name,
                            databaseType,
                            databaseSubType,
                            deploymentType,
                            managementOption,
                            workloadType,
                            isCluster,
                            parentContainerId,
                            managedDatabaseGroups,
                            timeCreated,
                            databaseStatus,
                            parentContainerName,
                            parentContainerCompartmentId,
                            instanceCount,
                            instanceDetails,
                            pdbCount,
                            pdbStatus,
                            additionalDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedDatabase o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .databaseType(o.getDatabaseType())
                            .databaseSubType(o.getDatabaseSubType())
                            .deploymentType(o.getDeploymentType())
                            .managementOption(o.getManagementOption())
                            .workloadType(o.getWorkloadType())
                            .isCluster(o.getIsCluster())
                            .parentContainerId(o.getParentContainerId())
                            .managedDatabaseGroups(o.getManagedDatabaseGroups())
                            .timeCreated(o.getTimeCreated())
                            .databaseStatus(o.getDatabaseStatus())
                            .parentContainerName(o.getParentContainerName())
                            .parentContainerCompartmentId(o.getParentContainerCompartmentId())
                            .instanceCount(o.getInstanceCount())
                            .instanceDetails(o.getInstanceDetails())
                            .pdbCount(o.getPdbCount())
                            .pdbStatus(o.getPdbStatus())
                            .additionalDetails(o.getAdditionalDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The type of Oracle Database installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    DatabaseType databaseType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    DatabaseSubType databaseSubType;

    /**
     * The infrastructure used to deploy the Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    DeploymentType deploymentType;

    /**
     * The management option used when enabling Database Management.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
    ManagementOption managementOption;

    /**
     * The workload type of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    WorkloadType workloadType;

    /**
     * Indicates whether the Oracle Database is part of a cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    Boolean isCluster;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent Container Database
     * if Managed Database is a Pluggable Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
    String parentContainerId;

    /**
     * A list of Managed Database Groups that the Managed Database belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroups")
    java.util.List<ParentGroup> managedDatabaseGroups;

    /**
     * The date and time the Managed Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The status of the Oracle Database. Indicates whether the status of the database
     * is UP, DOWN, or UNKNOWN at the current time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    DatabaseStatus databaseStatus;

    /**
     * The name of the parent Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerName")
    String parentContainerName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment
     * in which the parent Container Database resides, if the Managed Database
     * is a Pluggable Database (PDB).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerCompartmentId")
    String parentContainerCompartmentId;

    /**
     * The number of Oracle Real Application Clusters (Oracle RAC) database instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
    Integer instanceCount;

    /**
     * The details of the Oracle Real Application Clusters (Oracle RAC) database instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
    java.util.List<InstanceDetails> instanceDetails;

    /**
     * The number of PDBs in the Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbCount")
    Integer pdbCount;

    /**
     * The status of the PDB in the Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbStatus")
    java.util.List<PdbStatusDetails> pdbStatus;

    /**
     * The additional details specific to a type of database defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    java.util.Map<String, String> additionalDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
