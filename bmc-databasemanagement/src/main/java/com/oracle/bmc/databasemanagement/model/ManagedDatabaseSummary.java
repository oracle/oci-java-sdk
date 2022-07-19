/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the Managed Database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedDatabaseSummary {
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
        "timeCreated"
    })
    public ManagedDatabaseSummary(
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
            java.util.Date timeCreated) {
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
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
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
         * The name of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Managed Database.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of Oracle Database installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of Oracle Database installation.
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         **/
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /**
         * The infrastructure used to deploy the Oracle Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The infrastructure used to deploy the Oracle Database.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The management option used when enabling Database Management.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
        private ManagementOption managementOption;

        /**
         * The management option used when enabling Database Management.
         * @param managementOption the value to set
         * @return this builder
         **/
        public Builder managementOption(ManagementOption managementOption) {
            this.managementOption = managementOption;
            this.__explicitlySet__.add("managementOption");
            return this;
        }
        /**
         * The workload type of the Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
        private WorkloadType workloadType;

        /**
         * The workload type of the Autonomous Database.
         * @param workloadType the value to set
         * @return this builder
         **/
        public Builder workloadType(WorkloadType workloadType) {
            this.workloadType = workloadType;
            this.__explicitlySet__.add("workloadType");
            return this;
        }
        /**
         * Indicates whether the Oracle Database is part of a cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Indicates whether the Oracle Database is part of a cluster.
         * @param isCluster the value to set
         * @return this builder
         **/
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent Container Database
         * if the Managed Database is a Pluggable Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
        private String parentContainerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent Container Database
         * if the Managed Database is a Pluggable Database.
         *
         * @param parentContainerId the value to set
         * @return this builder
         **/
        public Builder parentContainerId(String parentContainerId) {
            this.parentContainerId = parentContainerId;
            this.__explicitlySet__.add("parentContainerId");
            return this;
        }
        /**
         * The date and time the Managed Database was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Managed Database was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedDatabaseSummary build() {
            ManagedDatabaseSummary __instance__ =
                    new ManagedDatabaseSummary(
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
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedDatabaseSummary o) {
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
                            .timeCreated(o.getTimeCreated());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * @return the value
     **/
    public String getId() {
        return id;
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
     * The name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Managed Database.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The type of Oracle Database installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of Oracle Database installation.
     * @return the value
     **/
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     *
     * @return the value
     **/
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /**
     * The infrastructure used to deploy the Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The infrastructure used to deploy the Oracle Database.
     * @return the value
     **/
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The management option used when enabling Database Management.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementOption")
    private final ManagementOption managementOption;

    /**
     * The management option used when enabling Database Management.
     * @return the value
     **/
    public ManagementOption getManagementOption() {
        return managementOption;
    }

    /**
     * The workload type of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workloadType")
    private final WorkloadType workloadType;

    /**
     * The workload type of the Autonomous Database.
     * @return the value
     **/
    public WorkloadType getWorkloadType() {
        return workloadType;
    }

    /**
     * Indicates whether the Oracle Database is part of a cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Indicates whether the Oracle Database is part of a cluster.
     * @return the value
     **/
    public Boolean getIsCluster() {
        return isCluster;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent Container Database
     * if the Managed Database is a Pluggable Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentContainerId")
    private final String parentContainerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the parent Container Database
     * if the Managed Database is a Pluggable Database.
     *
     * @return the value
     **/
    public String getParentContainerId() {
        return parentContainerId;
    }

    /**
     * The date and time the Managed Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Managed Database was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ManagedDatabaseSummary(");
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
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedDatabaseSummary)) {
            return false;
        }

        ManagedDatabaseSummary other = (ManagedDatabaseSummary) o;
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
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
