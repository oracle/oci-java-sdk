/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a job execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobExecution extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "jobRunId",
        "status",
        "errorMessage",
        "resultDetails",
        "timeCreated",
        "timeCompleted",
        "userName",
        "sqlText",
        "inBinds",
        "outBinds",
        "scheduleDetails"
    })
    public JobExecution(
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
            String jobRunId,
            Status status,
            String errorMessage,
            JobExecutionResultDetails resultDetails,
            java.util.Date timeCreated,
            java.util.Date timeCompleted,
            String userName,
            String sqlText,
            JobInBindsDetails inBinds,
            JobOutBindsDetails outBinds,
            JobScheduleDetails scheduleDetails) {
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
        this.jobRunId = jobRunId;
        this.status = status;
        this.errorMessage = errorMessage;
        this.resultDetails = resultDetails;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
        this.userName = userName;
        this.sqlText = sqlText;
        this.inBinds = inBinds;
        this.outBinds = outBinds;
        this.scheduleDetails = scheduleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the job execution.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the job execution.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the parent job resides.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the parent job resides.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the parent job has to be executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
        private String managedDatabaseGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the parent job has to be executed.
         * @param managedDatabaseGroupId the value to set
         * @return this builder
         **/
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            this.__explicitlySet__.add("managedDatabaseGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database associated with the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
        private String managedDatabaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database associated with the job execution.
         * @param managedDatabaseId the value to set
         * @return this builder
         **/
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            this.__explicitlySet__.add("managedDatabaseId");
            return this;
        }
        /**
         * The name of the Managed Database associated with the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseName")
        private String managedDatabaseName;

        /**
         * The name of the Managed Database associated with the job execution.
         * @param managedDatabaseName the value to set
         * @return this builder
         **/
        public Builder managedDatabaseName(String managedDatabaseName) {
            this.managedDatabaseName = managedDatabaseName;
            this.__explicitlySet__.add("managedDatabaseName");
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
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, or a Non-container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, or a Non-container Database.
         * @param databaseSubType the value to set
         * @return this builder
         **/
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /**
         * A list of the supported infrastructure that can be used to deploy the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * A list of the supported infrastructure that can be used to deploy the database.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent job.
         * @param jobId the value to set
         * @return this builder
         **/
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }
        /**
         * The name of the parent job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobName")
        private String jobName;

        /**
         * The name of the parent job.
         * @param jobName the value to set
         * @return this builder
         **/
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            this.__explicitlySet__.add("jobName");
            return this;
        }
        /**
         * The identifier of the associated job run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobRunId")
        private String jobRunId;

        /**
         * The identifier of the associated job run.
         * @param jobRunId the value to set
         * @return this builder
         **/
        public Builder jobRunId(String jobRunId) {
            this.jobRunId = jobRunId;
            this.__explicitlySet__.add("jobRunId");
            return this;
        }
        /**
         * The status of the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the job execution.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The error message that is returned if the job execution fails. Null is returned if the job is
         * still running or if the job execution is successful.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * The error message that is returned if the job execution fails. Null is returned if the job is
         * still running or if the job execution is successful.
         *
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultDetails")
        private JobExecutionResultDetails resultDetails;

        public Builder resultDetails(JobExecutionResultDetails resultDetails) {
            this.resultDetails = resultDetails;
            this.__explicitlySet__.add("resultDetails");
            return this;
        }
        /**
         * The date and time when the job execution was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the job execution was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time when the job execution completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time when the job execution completed.
         * @param timeCompleted the value to set
         * @return this builder
         **/
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }
        /**
         * The database user name used to execute the SQL job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name used to execute the SQL job.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The SQL text executed as part of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
        private String sqlText;

        /**
         * The SQL text executed as part of the job.
         * @param sqlText the value to set
         * @return this builder
         **/
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            this.__explicitlySet__.add("sqlText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inBinds")
        private JobInBindsDetails inBinds;

        public Builder inBinds(JobInBindsDetails inBinds) {
            this.inBinds = inBinds;
            this.__explicitlySet__.add("inBinds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outBinds")
        private JobOutBindsDetails outBinds;

        public Builder outBinds(JobOutBindsDetails outBinds) {
            this.outBinds = outBinds;
            this.__explicitlySet__.add("outBinds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private JobScheduleDetails scheduleDetails;

        public Builder scheduleDetails(JobScheduleDetails scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecution build() {
            JobExecution model =
                    new JobExecution(
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
                            this.jobRunId,
                            this.status,
                            this.errorMessage,
                            this.resultDetails,
                            this.timeCreated,
                            this.timeCompleted,
                            this.userName,
                            this.sqlText,
                            this.inBinds,
                            this.outBinds,
                            this.scheduleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecution model) {
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
            if (model.wasPropertyExplicitlySet("jobRunId")) {
                this.jobRunId(model.getJobRunId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("resultDetails")) {
                this.resultDetails(model.getResultDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("sqlText")) {
                this.sqlText(model.getSqlText());
            }
            if (model.wasPropertyExplicitlySet("inBinds")) {
                this.inBinds(model.getInBinds());
            }
            if (model.wasPropertyExplicitlySet("outBinds")) {
                this.outBinds(model.getOutBinds());
            }
            if (model.wasPropertyExplicitlySet("scheduleDetails")) {
                this.scheduleDetails(model.getScheduleDetails());
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
     * The identifier of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the job execution.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the job execution.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the parent job resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the parent job resides.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the parent job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    private final String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the parent job has to be executed.
     * @return the value
     **/
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database associated with the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    private final String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database associated with the job execution.
     * @return the value
     **/
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }

    /**
     * The name of the Managed Database associated with the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseName")
    private final String managedDatabaseName;

    /**
     * The name of the Managed Database associated with the job execution.
     * @return the value
     **/
    public String getManagedDatabaseName() {
        return managedDatabaseName;
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
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, or a Non-container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database, Pluggable Database, or a Non-container Database.
     * @return the value
     **/
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /**
     * A list of the supported infrastructure that can be used to deploy the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * A list of the supported infrastructure that can be used to deploy the database.
     * @return the value
     **/
    public DeploymentType getDeploymentType() {
        return deploymentType;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    private final String jobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the parent job.
     * @return the value
     **/
    public String getJobId() {
        return jobId;
    }

    /**
     * The name of the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobName")
    private final String jobName;

    /**
     * The name of the parent job.
     * @return the value
     **/
    public String getJobName() {
        return jobName;
    }

    /**
     * The identifier of the associated job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobRunId")
    private final String jobRunId;

    /**
     * The identifier of the associated job run.
     * @return the value
     **/
    public String getJobRunId() {
        return jobRunId;
    }

    /**
     * The status of the job execution.
     **/
    public enum Status {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the job execution.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The error message that is returned if the job execution fails. Null is returned if the job is
     * still running or if the job execution is successful.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * The error message that is returned if the job execution fails. Null is returned if the job is
     * still running or if the job execution is successful.
     *
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultDetails")
    private final JobExecutionResultDetails resultDetails;

    public JobExecutionResultDetails getResultDetails() {
        return resultDetails;
    }

    /**
     * The date and time when the job execution was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the job execution was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the job execution completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time when the job execution completed.
     * @return the value
     **/
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * The database user name used to execute the SQL job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name used to execute the SQL job.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The SQL text executed as part of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlText")
    private final String sqlText;

    /**
     * The SQL text executed as part of the job.
     * @return the value
     **/
    public String getSqlText() {
        return sqlText;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inBinds")
    private final JobInBindsDetails inBinds;

    public JobInBindsDetails getInBinds() {
        return inBinds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outBinds")
    private final JobOutBindsDetails outBinds;

    public JobOutBindsDetails getOutBinds() {
        return outBinds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
    private final JobScheduleDetails scheduleDetails;

    public JobScheduleDetails getScheduleDetails() {
        return scheduleDetails;
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
        sb.append("JobExecution(");
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
        sb.append(", jobRunId=").append(String.valueOf(this.jobRunId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", resultDetails=").append(String.valueOf(this.resultDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", sqlText=").append(String.valueOf(this.sqlText));
        sb.append(", inBinds=").append(String.valueOf(this.inBinds));
        sb.append(", outBinds=").append(String.valueOf(this.outBinds));
        sb.append(", scheduleDetails=").append(String.valueOf(this.scheduleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecution)) {
            return false;
        }

        JobExecution other = (JobExecution) o;
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
                && java.util.Objects.equals(this.jobRunId, other.jobRunId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.resultDetails, other.resultDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.inBinds, other.inBinds)
                && java.util.Objects.equals(this.outBinds, other.outBinds)
                && java.util.Objects.equals(this.scheduleDetails, other.scheduleDetails)
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
        result = (result * PRIME) + (this.jobRunId == null ? 43 : this.jobRunId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.resultDetails == null ? 43 : this.resultDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.inBinds == null ? 43 : this.inBinds.hashCode());
        result = (result * PRIME) + (this.outBinds == null ? 43 : this.outBinds.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleDetails == null ? 43 : this.scheduleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
