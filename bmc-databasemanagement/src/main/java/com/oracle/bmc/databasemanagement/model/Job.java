/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "jobType",
        defaultImpl = Job.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SqlJob.class, name = "SQL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class Job extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "description",
        "managedDatabaseGroupId",
        "managedDatabaseId",
        "managedDatabasesDetails",
        "databaseSubType",
        "scheduleType",
        "lifecycleState",
        "timeout",
        "resultLocation",
        "scheduleDetails",
        "submissionErrorMessage",
        "timeCreated",
        "timeUpdated"
    })
    protected Job(
            String id,
            String compartmentId,
            String name,
            String description,
            String managedDatabaseGroupId,
            String managedDatabaseId,
            java.util.List<JobDatabase> managedDatabasesDetails,
            DatabaseSubType databaseSubType,
            ScheduleType scheduleType,
            LifecycleState lifecycleState,
            String timeout,
            JobExecutionResultLocation resultLocation,
            JobScheduleDetails scheduleDetails,
            String submissionErrorMessage,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.managedDatabaseGroupId = managedDatabaseGroupId;
        this.managedDatabaseId = managedDatabaseId;
        this.managedDatabasesDetails = managedDatabasesDetails;
        this.databaseSubType = databaseSubType;
        this.scheduleType = scheduleType;
        this.lifecycleState = lifecycleState;
        this.timeout = timeout;
        this.resultLocation = resultLocation;
        this.scheduleDetails = scheduleDetails;
        this.submissionErrorMessage = submissionErrorMessage;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the job resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the job resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The display name of the job.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the job has to be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    private final String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group where the job has to be executed.
     *
     * @return the value
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database where the job has to be executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    private final String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database where the job has to be executed.
     *
     * @return the value
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }

    /** The details of the Managed Databases where the job has to be executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabasesDetails")
    private final java.util.List<JobDatabase> managedDatabasesDetails;

    /**
     * The details of the Managed Databases where the job has to be executed.
     *
     * @return the value
     */
    public java.util.List<JobDatabase> getManagedDatabasesDetails() {
        return managedDatabasesDetails;
    }

    /**
     * The subtype of the Oracle Database where the job has to be executed. Applicable only when
     * managedDatabaseGroupId is provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database where the job has to be executed. Applicable only when
     * managedDatabaseGroupId is provided.
     *
     * @return the value
     */
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /** The schedule type of the job. */
    public enum ScheduleType implements com.oracle.bmc.http.internal.BmcEnum {
        Immediate("IMMEDIATE"),
        Later("LATER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScheduleType.class);

        private final String value;
        private static java.util.Map<String, ScheduleType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScheduleType v : ScheduleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScheduleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScheduleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScheduleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The schedule type of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final ScheduleType scheduleType;

    /**
     * The schedule type of the job.
     *
     * @return the value
     */
    public ScheduleType getScheduleType() {
        return scheduleType;
    }

    /** The lifecycle state of the job. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),

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
    /** The lifecycle state of the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the job.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /**
     * The error message that is returned if the job submission fails. Null is returned in all other
     * scenarios.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("submissionErrorMessage")
    private final String submissionErrorMessage;

    /**
     * The error message that is returned if the job submission fails. Null is returned in all other
     * scenarios.
     *
     * @return the value
     */
    public String getSubmissionErrorMessage() {
        return submissionErrorMessage;
    }

    /** The date and time when the job was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the job was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time when the job was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the job was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("Job(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(", managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(", managedDatabasesDetails=")
                .append(String.valueOf(this.managedDatabasesDetails));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", resultLocation=").append(String.valueOf(this.resultLocation));
        sb.append(", scheduleDetails=").append(String.valueOf(this.scheduleDetails));
        sb.append(", submissionErrorMessage=").append(String.valueOf(this.submissionErrorMessage));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Job)) {
            return false;
        }

        Job other = (Job) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.managedDatabasesDetails, other.managedDatabasesDetails)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(this.resultLocation, other.resultLocation)
                && java.util.Objects.equals(this.scheduleDetails, other.scheduleDetails)
                && java.util.Objects.equals(
                        this.submissionErrorMessage, other.submissionErrorMessage)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.managedDatabasesDetails == null
                                ? 43
                                : this.managedDatabasesDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result =
                (result * PRIME)
                        + (this.resultLocation == null ? 43 : this.resultLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleDetails == null ? 43 : this.scheduleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.submissionErrorMessage == null
                                ? 43
                                : this.submissionErrorMessage.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
