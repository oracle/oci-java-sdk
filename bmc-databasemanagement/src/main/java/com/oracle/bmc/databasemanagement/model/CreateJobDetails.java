/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create a job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobType",
    defaultImpl = CreateJobDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateSqlJobDetails.class,
        name = "SQL"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateJobDetails {

    /**
     * The name of the job. Valid characters are uppercase or lowercase letters,
     * numbers, and "_". The name of the job cannot be modified. It must be unique
     * in the compartment and must begin with an alphabetic character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which the job resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database where the job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    String managedDatabaseId;

    /**
     * The subtype of the Oracle Database where the job has to be executed. Only applicable when managedDatabaseGroupId is provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    DatabaseSubType databaseSubType;

    /**
     * The schedule type of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    Job.ScheduleType scheduleType;

    /**
     * The job timeout duration, which is expressed like "1h 10m 15s".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    String timeout;

    @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
    JobExecutionResultLocation resultLocation;
}
