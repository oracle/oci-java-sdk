/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a Managed Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ManagedDatabase.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedDatabase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "databaseType",
        "databaseSubType",
        "deploymentType",
        "managementOption",
        "workloadType",
        "isCluster",
        "parentContainerId",
        "managedDatabaseGroups",
        "dbSystemId",
        "storageSystemId",
        "timeCreated",
        "databaseVersion",
        "databaseStatus",
        "parentContainerName",
        "parentContainerCompartmentId",
        "instanceCount",
        "instanceDetails",
        "pdbCount",
        "pdbStatus",
        "additionalDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "dbmgmtFeatureConfigs",
        "databasePlatformName"
    })
    public ManagedDatabase(
            String id,
            String compartmentId,
            String name,
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            DeploymentType deploymentType,
            ManagementOption managementOption,
            WorkloadType workloadType,
            Boolean isCluster,
            String parentContainerId,
            java.util.List<ParentGroup> managedDatabaseGroups,
            String dbSystemId,
            String storageSystemId,
            java.util.Date timeCreated,
            String databaseVersion,
            DatabaseStatus databaseStatus,
            String parentContainerName,
            String parentContainerCompartmentId,
            Integer instanceCount,
            java.util.List<InstanceDetails> instanceDetails,
            Integer pdbCount,
            java.util.List<PdbStatusDetails> pdbStatus,
            java.util.Map<String, String> additionalDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs,
            String databasePlatformName) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.deploymentType = deploymentType;
        this.managementOption = managementOption;
        this.workloadType = workloadType;
        this.isCluster = isCluster;
        this.parentContainerId = parentContainerId;
        this.managedDatabaseGroups = managedDatabaseGroups;
        this.dbSystemId = dbSystemId;
        this.storageSystemId = storageSystemId;
        this.timeCreated = timeCreated;
        this.databaseVersion = databaseVersion;
        this.databaseStatus = databaseStatus;
        this.parentContainerName = parentContainerName;
        this.parentContainerCompartmentId = parentContainerCompartmentId;
        this.instanceCount = instanceCount;
        this.instanceDetails = instanceDetails;
        this.pdbCount = pdbCount;
        this.pdbStatus = pdbStatus;
        this.additionalDetails = additionalDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.dbmgmtFeatureConfigs = dbmgmtFeatureConfigs;
        this.databasePlatformName = databasePlatformName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
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
        /** The name of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Managed Database.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of Oracle Database installation. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of Oracle Database installation.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container
         * Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous
         * Container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container
         * Database, Pluggable Database, Non-container Database, Autonomous Database, or Autonomous
         * Container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         */
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /** The infrastructure used to deploy the Oracle Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The infrastructure used to deploy the Oracle Database.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /** The management option used when enabling Database Management. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
        private ManagementOption managementOption;

        /**
         * The management option used when enabling Database Management.
         *
         * @param managementOption the value to set
         * @return this builder
         */
        public Builder managementOption(ManagementOption managementOption) {
            this.managementOption = managementOption;
            this.__explicitlySet__.add("managementOption");
            return this;
        }
        /** The workload type of the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private WorkloadType workloadType;

        /**
         * The workload type of the Autonomous Database.
         *
         * @param workloadType the value to set
         * @return this builder
         */
        public Builder workloadType(WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /** Indicates whether the Oracle Database is part of a cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Indicates whether the Oracle Database is part of a cluster.
         *
         * @param isCluster the value to set
         * @return this builder
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * parent Container Database if Managed Database is a Pluggable Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
        private String parentContainerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * parent Container Database if Managed Database is a Pluggable Database.
         *
         * @param parentContainerId the value to set
         * @return this builder
         */
        public Builder parentContainerId(String parentContainerId) {
            this.parentContainerId = parentContainerId;
            this.__explicitlySet__.add("parentContainerId");
            return this;
        }
        /** A list of Managed Database Groups that the Managed Database belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroups")
        private java.util.List<ParentGroup> managedDatabaseGroups;

        /**
         * A list of Managed Database Groups that the Managed Database belongs to.
         *
         * @param managedDatabaseGroups the value to set
         * @return this builder
         */
        public Builder managedDatabaseGroups(java.util.List<ParentGroup> managedDatabaseGroups) {
            this.managedDatabaseGroups = managedDatabaseGroups;
            this.__explicitlySet__.add("managedDatabaseGroups");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * external DB system that this Managed Database is part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * external DB system that this Managed Database is part of.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * storage DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSystemId")
        private String storageSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * storage DB system.
         *
         * @param storageSystemId the value to set
         * @return this builder
         */
        public Builder storageSystemId(String storageSystemId) {
            this.storageSystemId = storageSystemId;
            this.__explicitlySet__.add("storageSystemId");
            return this;
        }
        /** The date and time the Managed Database was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Managed Database was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The Oracle Database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The Oracle Database version.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /**
         * The status of the Oracle Database. Indicates whether the status of the database is UP,
         * DOWN, or UNKNOWN at the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
        private DatabaseStatus databaseStatus;

        /**
         * The status of the Oracle Database. Indicates whether the status of the database is UP,
         * DOWN, or UNKNOWN at the current time.
         *
         * @param databaseStatus the value to set
         * @return this builder
         */
        public Builder databaseStatus(DatabaseStatus databaseStatus) {
            this.databaseStatus = databaseStatus;
            this.__explicitlySet__.add("databaseStatus");
            return this;
        }
        /** The name of the parent Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerName")
        private String parentContainerName;

        /**
         * The name of the parent Container Database.
         *
         * @param parentContainerName the value to set
         * @return this builder
         */
        public Builder parentContainerName(String parentContainerName) {
            this.parentContainerName = parentContainerName;
            this.__explicitlySet__.add("parentContainerName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the parent Container Database resides, if the Managed Database is a
         * Pluggable Database (PDB).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerCompartmentId")
        private String parentContainerCompartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the parent Container Database resides, if the Managed Database is a
         * Pluggable Database (PDB).
         *
         * @param parentContainerCompartmentId the value to set
         * @return this builder
         */
        public Builder parentContainerCompartmentId(String parentContainerCompartmentId) {
            this.parentContainerCompartmentId = parentContainerCompartmentId;
            this.__explicitlySet__.add("parentContainerCompartmentId");
            return this;
        }
        /** The number of Oracle Real Application Clusters (Oracle RAC) database instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
        private Integer instanceCount;

        /**
         * The number of Oracle Real Application Clusters (Oracle RAC) database instances.
         *
         * @param instanceCount the value to set
         * @return this builder
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            this.__explicitlySet__.add("instanceCount");
            return this;
        }
        /** The details of the Oracle Real Application Clusters (Oracle RAC) database instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
        private java.util.List<InstanceDetails> instanceDetails;

        /**
         * The details of the Oracle Real Application Clusters (Oracle RAC) database instances.
         *
         * @param instanceDetails the value to set
         * @return this builder
         */
        public Builder instanceDetails(java.util.List<InstanceDetails> instanceDetails) {
            this.instanceDetails = instanceDetails;
            this.__explicitlySet__.add("instanceDetails");
            return this;
        }
        /** The number of PDBs in the Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbCount")
        private Integer pdbCount;

        /**
         * The number of PDBs in the Container Database.
         *
         * @param pdbCount the value to set
         * @return this builder
         */
        public Builder pdbCount(Integer pdbCount) {
            this.pdbCount = pdbCount;
            this.__explicitlySet__.add("pdbCount");
            return this;
        }
        /** The status of the PDB in the Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbStatus")
        private java.util.List<PdbStatusDetails> pdbStatus;

        /**
         * The status of the PDB in the Container Database.
         *
         * @param pdbStatus the value to set
         * @return this builder
         */
        public Builder pdbStatus(java.util.List<PdbStatusDetails> pdbStatus) {
            this.pdbStatus = pdbStatus;
            this.__explicitlySet__.add("pdbStatus");
            return this;
        }
        /**
         * The additional details specific to a type of database defined in {@code {"key": "value"}}
         * format. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details specific to a type of database defined in {@code {"key": "value"}}
         * format. Example: {@code {"bar-key": "value"}}
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** The list of feature configurations */
        @com.fasterxml.jackson.annotation.JsonProperty("dbmgmtFeatureConfigs")
        private java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs;

        /**
         * The list of feature configurations
         *
         * @param dbmgmtFeatureConfigs the value to set
         * @return this builder
         */
        public Builder dbmgmtFeatureConfigs(
                java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs) {
            this.dbmgmtFeatureConfigs = dbmgmtFeatureConfigs;
            this.__explicitlySet__.add("dbmgmtFeatureConfigs");
            return this;
        }
        /** The operating system of database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databasePlatformName")
        private String databasePlatformName;

        /**
         * The operating system of database.
         *
         * @param databasePlatformName the value to set
         * @return this builder
         */
        public Builder databasePlatformName(String databasePlatformName) {
            this.databasePlatformName = databasePlatformName;
            this.__explicitlySet__.add("databasePlatformName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedDatabase build() {
            ManagedDatabase model =
                    new ManagedDatabase(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.databaseType,
                            this.databaseSubType,
                            this.deploymentType,
                            this.managementOption,
                            this.workloadType,
                            this.isCluster,
                            this.parentContainerId,
                            this.managedDatabaseGroups,
                            this.dbSystemId,
                            this.storageSystemId,
                            this.timeCreated,
                            this.databaseVersion,
                            this.databaseStatus,
                            this.parentContainerName,
                            this.parentContainerCompartmentId,
                            this.instanceCount,
                            this.instanceDetails,
                            this.pdbCount,
                            this.pdbStatus,
                            this.additionalDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.dbmgmtFeatureConfigs,
                            this.databasePlatformName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedDatabase model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseSubType")) {
                this.databaseSubType(model.getDatabaseSubType());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("managementOption")) {
                this.managementOption(model.getManagementOption());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("parentContainerId")) {
                this.parentContainerId(model.getParentContainerId());
            }
            if (model.wasPropertyExplicitlySet("managedDatabaseGroups")) {
                this.managedDatabaseGroups(model.getManagedDatabaseGroups());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("storageSystemId")) {
                this.storageSystemId(model.getStorageSystemId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("databaseStatus")) {
                this.databaseStatus(model.getDatabaseStatus());
            }
            if (model.wasPropertyExplicitlySet("parentContainerName")) {
                this.parentContainerName(model.getParentContainerName());
            }
            if (model.wasPropertyExplicitlySet("parentContainerCompartmentId")) {
                this.parentContainerCompartmentId(model.getParentContainerCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("instanceCount")) {
                this.instanceCount(model.getInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("instanceDetails")) {
                this.instanceDetails(model.getInstanceDetails());
            }
            if (model.wasPropertyExplicitlySet("pdbCount")) {
                this.pdbCount(model.getPdbCount());
            }
            if (model.wasPropertyExplicitlySet("pdbStatus")) {
                this.pdbStatus(model.getPdbStatus());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("dbmgmtFeatureConfigs")) {
                this.dbmgmtFeatureConfigs(model.getDbmgmtFeatureConfigs());
            }
            if (model.wasPropertyExplicitlySet("databasePlatformName")) {
                this.databasePlatformName(model.getDatabasePlatformName());
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
     * Managed Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
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

    /** The name of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Managed Database.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of Oracle Database installation. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of Oracle Database installation.
     *
     * @return the value
     */
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container
     * Database.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /** The infrastructure used to deploy the Oracle Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The infrastructure used to deploy the Oracle Database.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /** The management option used when enabling Database Management. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
    private final ManagementOption managementOption;

    /**
     * The management option used when enabling Database Management.
     *
     * @return the value
     */
    public ManagementOption getManagementOption() {
        return managementOption;
    }

    /** The workload type of the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final WorkloadType workloadType;

    /**
     * The workload type of the Autonomous Database.
     *
     * @return the value
     */
    public WorkloadType getWorkloadType() {
        return workloadType;
    }

    /** Indicates whether the Oracle Database is part of a cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Indicates whether the Oracle Database is part of a cluster.
     *
     * @return the value
     */
    public Boolean getIsCluster() {
        return isCluster;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * parent Container Database if Managed Database is a Pluggable Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
    private final String parentContainerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * parent Container Database if Managed Database is a Pluggable Database.
     *
     * @return the value
     */
    public String getParentContainerId() {
        return parentContainerId;
    }

    /** A list of Managed Database Groups that the Managed Database belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroups")
    private final java.util.List<ParentGroup> managedDatabaseGroups;

    /**
     * A list of Managed Database Groups that the Managed Database belongs to.
     *
     * @return the value
     */
    public java.util.List<ParentGroup> getManagedDatabaseGroups() {
        return managedDatabaseGroups;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * external DB system that this Managed Database is part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * external DB system that this Managed Database is part of.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * storage DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSystemId")
    private final String storageSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * storage DB system.
     *
     * @return the value
     */
    public String getStorageSystemId() {
        return storageSystemId;
    }

    /** The date and time the Managed Database was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Managed Database was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The Oracle Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The Oracle Database version.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /**
     * The status of the Oracle Database. Indicates whether the status of the database is UP, DOWN,
     * or UNKNOWN at the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    private final DatabaseStatus databaseStatus;

    /**
     * The status of the Oracle Database. Indicates whether the status of the database is UP, DOWN,
     * or UNKNOWN at the current time.
     *
     * @return the value
     */
    public DatabaseStatus getDatabaseStatus() {
        return databaseStatus;
    }

    /** The name of the parent Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerName")
    private final String parentContainerName;

    /**
     * The name of the parent Container Database.
     *
     * @return the value
     */
    public String getParentContainerName() {
        return parentContainerName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the parent Container Database resides, if the Managed Database is a
     * Pluggable Database (PDB).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerCompartmentId")
    private final String parentContainerCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the parent Container Database resides, if the Managed Database is a
     * Pluggable Database (PDB).
     *
     * @return the value
     */
    public String getParentContainerCompartmentId() {
        return parentContainerCompartmentId;
    }

    /** The number of Oracle Real Application Clusters (Oracle RAC) database instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
    private final Integer instanceCount;

    /**
     * The number of Oracle Real Application Clusters (Oracle RAC) database instances.
     *
     * @return the value
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /** The details of the Oracle Real Application Clusters (Oracle RAC) database instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDetails")
    private final java.util.List<InstanceDetails> instanceDetails;

    /**
     * The details of the Oracle Real Application Clusters (Oracle RAC) database instances.
     *
     * @return the value
     */
    public java.util.List<InstanceDetails> getInstanceDetails() {
        return instanceDetails;
    }

    /** The number of PDBs in the Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbCount")
    private final Integer pdbCount;

    /**
     * The number of PDBs in the Container Database.
     *
     * @return the value
     */
    public Integer getPdbCount() {
        return pdbCount;
    }

    /** The status of the PDB in the Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbStatus")
    private final java.util.List<PdbStatusDetails> pdbStatus;

    /**
     * The status of the PDB in the Container Database.
     *
     * @return the value
     */
    public java.util.List<PdbStatusDetails> getPdbStatus() {
        return pdbStatus;
    }

    /**
     * The additional details specific to a type of database defined in {@code {"key": "value"}}
     * format. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details specific to a type of database defined in {@code {"key": "value"}}
     * format. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The list of feature configurations */
    @com.fasterxml.jackson.annotation.JsonProperty("dbmgmtFeatureConfigs")
    private final java.util.List<DatabaseFeatureConfiguration> dbmgmtFeatureConfigs;

    /**
     * The list of feature configurations
     *
     * @return the value
     */
    public java.util.List<DatabaseFeatureConfiguration> getDbmgmtFeatureConfigs() {
        return dbmgmtFeatureConfigs;
    }

    /** The operating system of database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databasePlatformName")
    private final String databasePlatformName;

    /**
     * The operating system of database.
     *
     * @return the value
     */
    public String getDatabasePlatformName() {
        return databasePlatformName;
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
        sb.append("ManagedDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", managementOption=").append(String.valueOf(this.managementOption));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", parentContainerId=").append(String.valueOf(this.parentContainerId));
        sb.append(", managedDatabaseGroups=").append(String.valueOf(this.managedDatabaseGroups));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", storageSystemId=").append(String.valueOf(this.storageSystemId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", databaseStatus=").append(String.valueOf(this.databaseStatus));
        sb.append(", parentContainerName=").append(String.valueOf(this.parentContainerName));
        sb.append(", parentContainerCompartmentId=")
                .append(String.valueOf(this.parentContainerCompartmentId));
        sb.append(", instanceCount=").append(String.valueOf(this.instanceCount));
        sb.append(", instanceDetails=").append(String.valueOf(this.instanceDetails));
        sb.append(", pdbCount=").append(String.valueOf(this.pdbCount));
        sb.append(", pdbStatus=").append(String.valueOf(this.pdbStatus));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", dbmgmtFeatureConfigs=").append(String.valueOf(this.dbmgmtFeatureConfigs));
        sb.append(", databasePlatformName=").append(String.valueOf(this.databasePlatformName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedDatabase)) {
            return false;
        }

        ManagedDatabase other = (ManagedDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.managementOption, other.managementOption)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.parentContainerId, other.parentContainerId)
                && java.util.Objects.equals(this.managedDatabaseGroups, other.managedDatabaseGroups)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.storageSystemId, other.storageSystemId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.databaseStatus, other.databaseStatus)
                && java.util.Objects.equals(this.parentContainerName, other.parentContainerName)
                && java.util.Objects.equals(
                        this.parentContainerCompartmentId, other.parentContainerCompartmentId)
                && java.util.Objects.equals(this.instanceCount, other.instanceCount)
                && java.util.Objects.equals(this.instanceDetails, other.instanceDetails)
                && java.util.Objects.equals(this.pdbCount, other.pdbCount)
                && java.util.Objects.equals(this.pdbStatus, other.pdbStatus)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.dbmgmtFeatureConfigs, other.dbmgmtFeatureConfigs)
                && java.util.Objects.equals(this.databasePlatformName, other.databasePlatformName)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.managementOption == null ? 43 : this.managementOption.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.parentContainerId == null ? 43 : this.parentContainerId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroups == null
                                ? 43
                                : this.managedDatabaseGroups.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSystemId == null ? 43 : this.storageSystemId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseStatus == null ? 43 : this.databaseStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.parentContainerName == null
                                ? 43
                                : this.parentContainerName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentContainerCompartmentId == null
                                ? 43
                                : this.parentContainerCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceCount == null ? 43 : this.instanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDetails == null ? 43 : this.instanceDetails.hashCode());
        result = (result * PRIME) + (this.pdbCount == null ? 43 : this.pdbCount.hashCode());
        result = (result * PRIME) + (this.pdbStatus == null ? 43 : this.pdbStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dbmgmtFeatureConfigs == null
                                ? 43
                                : this.dbmgmtFeatureConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.databasePlatformName == null
                                ? 43
                                : this.databasePlatformName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
