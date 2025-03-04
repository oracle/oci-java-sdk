/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create a job. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "jobType",
        defaultImpl = CreateJobDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateSqlJobDetails.class,
            name = "SQL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateJobDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "compartmentId",
        "managedDatabaseGroupId",
        "managedDatabaseId",
        "databaseSubType",
        "scheduleType",
        "timeout",
        "resultLocation",
        "scheduleDetails"
    })
    protected CreateJobDetails(
            String name,
            String description,
            String compartmentId,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            DatabaseSubType databaseSubType,
            Job.ScheduleType scheduleType,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails) {
        super();
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.managedDatabaseGroupId = managedDatabaseGroupId;
        this.managedDatabaseId = managedDatabaseId;
        this.databaseSubType = databaseSubType;
        this.scheduleType = scheduleType;
        this.timeout = timeout;
        this.resultLocation = resultLocation;
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * The name of the job. Valid characters are uppercase or lowercase letters, numbers, and "_".
     * The name of the job cannot be modified. It must be unique in the compartment and must begin
     * with an alphabetic character.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the job. Valid characters are uppercase or lowercase letters, numbers, and "_".
     * The name of the job cannot be modified. It must be unique in the compartment and must begin
     * with an alphabetic character.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the job.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the job resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the job resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the job has to be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    private final String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the job has to be executed.
     *
     * @return the value
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database where the job has to be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    private final String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database where the job has to be executed.
     *
     * @return the value
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }

    /**
     * The subtype of the Oracle Database where the job has to be executed. Only applicable when
     * managedDatabaseGroupId is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database where the job has to be executed. Only applicable when
     * managedDatabaseGroupId is provided.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /** The schedule type of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final Job.ScheduleType scheduleType;

    /**
     * The schedule type of the job.
     *
     * @return the value
     */
    public Job.ScheduleType getScheduleType() {
        return scheduleType;
    }

    /** The job timeout duration, which is expressed like "1h 10m 15s". */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final String timeout;

    /**
     * The job timeout duration, which is expressed like "1h 10m 15s".
     *
     * @return the value
     */
    public String getTimeout() {
        return timeout;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
    private final JobExecutionResultLocation resultLocation;

    public JobExecutionResultLocation getResultLocation() {
        return resultLocation;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(", managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", resultLocation=").append(String.valueOf(this.resultLocation));
        sb.append(", scheduleDetails=").append(String.valueOf(this.scheduleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobDetails)) {
            return false;
        }

        CreateJobDetails other = (CreateJobDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(this.resultLocation, other.resultLocation)
                && java.util.Objects.equals(this.scheduleDetails, other.scheduleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result =
                (result * PRIME)
                        + (this.resultLocation == null ? 43 : this.resultLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleDetails == null ? 43 : this.scheduleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
