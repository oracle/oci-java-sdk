/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of a job execution on a Managed Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobExecutionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JobExecutionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "compartmentId",
        "managedDatabaseGroupId",
        "managedDatabaseId",
        "managedDatabaseName",
        "databaseType",
        "databaseSubType",
        "deploymentType",
        "isCluster",
        "workloadType",
        "jobId",
        "jobName",
        "status",
        "timeCreated",
        "timeCompleted"
    })
    public JobExecutionSummary(
            String id,
            String name,
            String compartmentId,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            String managedDatabaseName,
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            DeploymentType deploymentType,
            Boolean isCluster,
            WorkloadType workloadType,
            String jobId,
            String jobName,
            JobExecution.Status status,
            java.util.Date timeCreated,
            java.util.Date timeCompleted) {
        super();
        this.id = id;
        this.name = name;
        this.compartmentId = compartmentId;
        this.managedDatabaseGroupId = managedDatabaseGroupId;
        this.managedDatabaseId = managedDatabaseId;
        this.managedDatabaseName = managedDatabaseName;
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.deploymentType = deploymentType;
        this.isCluster = isCluster;
        this.workloadType = workloadType;
        this.jobId = jobId;
        this.jobName = jobName;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The identifier of the job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the job execution.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the job execution.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the parent job resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the parent job resides.
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
         * Managed Database Group where the parent job has to be executed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
        private String managedDatabaseGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database Group where the parent job has to be executed.
         *
         * @param managedDatabaseGroupId the value to set
         * @return this builder
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            this.__explicitlySet__.add("managedDatabaseGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Managed Database associated with the job execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
        private String managedDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * Managed Database associated with the job execution.
         *
         * @param managedDatabaseId the value to set
         * @return this builder
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            this.__explicitlySet__.add("managedDatabaseId");
            return this;
        }
        /** The name of the Managed Database associated with the job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseName")
        private String managedDatabaseName;

        /**
         * The name of the Managed Database associated with the job execution.
         *
         * @param managedDatabaseName the value to set
         * @return this builder
         */
        public Builder managedDatabaseName(String managedDatabaseName) {
            this.managedDatabaseName = managedDatabaseName;
            this.__explicitlySet__.add("managedDatabaseName");
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
         * Database, Pluggable Database, or a Non-container Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container
         * Database, Pluggable Database, or a Non-container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         */
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /** A list of the supported infrastructure that can be used to deploy the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * A list of the supported infrastructure that can be used to deploy the database.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * parent job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * parent job.
         *
         * @param jobId the value to set
         * @return this builder
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }
        /** The name of the parent job. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the parent job.
         *
         * @param jobName the value to set
         * @return this builder
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /** The status of the job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobExecution.Status status;

        /**
         * The status of the job execution.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(JobExecution.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The date and time when the job execution was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the job execution was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time when the job execution was completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time when the job execution was completed.
         *
         * @param timeCompleted the value to set
         * @return this builder
         */
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecutionSummary build() {
            JobExecutionSummary model =
                    new JobExecutionSummary(
                            this.id,
                            this.name,
                            this.compartmentId,
                            this.managedDatabaseGroupId,
                            this.managedDatabaseId,
                            this.managedDatabaseName,
                            this.databaseType,
                            this.databaseSubType,
                            this.deploymentType,
                            this.isCluster,
                            this.workloadType,
                            this.jobId,
                            this.jobName,
                            this.status,
                            this.timeCreated,
                            this.timeCompleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecutionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("managedDatabaseGroupId")) {
                this.managedDatabaseGroupId(model.getManagedDatabaseGroupId());
            }
            if (model.wasPropertyExplicitlySet("managedDatabaseId")) {
                this.managedDatabaseId(model.getManagedDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("managedDatabaseName")) {
                this.managedDatabaseName(model.getManagedDatabaseName());
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
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("workloadType")) {
                this.workloadType(model.getWorkloadType());
            }
            if (model.wasPropertyExplicitlySet("jobId")) {
                this.jobId(model.getJobId());
            }
            if (model.wasPropertyExplicitlySet("jobName")) {
                this.jobName(model.getJobName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
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

    /** The identifier of the job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the job execution.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the job execution.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the parent job resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the parent job resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the parent job has to be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    private final String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the parent job has to be executed.
     *
     * @return the value
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Managed
     * Database associated with the job execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    private final String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of Managed
     * Database associated with the job execution.
     *
     * @return the value
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }

    /** The name of the Managed Database associated with the job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseName")
    private final String managedDatabaseName;

    /**
     * The name of the Managed Database associated with the job execution.
     *
     * @return the value
     */
    public String getManagedDatabaseName() {
        return managedDatabaseName;
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
     * Pluggable Database, or a Non-container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, or a Non-container Database.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /** A list of the supported infrastructure that can be used to deploy the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * A list of the supported infrastructure that can be used to deploy the database.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * parent job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    private final String jobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * parent job.
     *
     * @return the value
     */
    public String getJobId() {
        return jobId;
    }

    /** The name of the parent job. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the parent job.
     *
     * @return the value
     */
    public String getJobName() {
        return jobName;
    }

    /** The status of the job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobExecution.Status status;

    /**
     * The status of the job execution.
     *
     * @return the value
     */
    public JobExecution.Status getStatus() {
        return status;
    }

    /** The date and time when the job execution was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the job execution was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time when the job execution was completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time when the job execution was completed.
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
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
        sb.append("JobExecutionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(", managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(", managedDatabaseName=").append(String.valueOf(this.managedDatabaseName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", workloadType=").append(String.valueOf(this.workloadType));
        sb.append(", jobId=").append(String.valueOf(this.jobId));
        sb.append(", jobName=").append(String.valueOf(this.jobName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecutionSummary)) {
            return false;
        }

        JobExecutionSummary other = (JobExecutionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.managedDatabaseName, other.managedDatabaseName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.jobName, other.jobName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseName == null
                                ? 43
                                : this.managedDatabaseName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.jobName == null ? 43 : this.jobName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
