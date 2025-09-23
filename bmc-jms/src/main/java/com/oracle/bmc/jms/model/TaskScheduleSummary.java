/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * A summary of the task schedule properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TaskScheduleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TaskScheduleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "fleetId",
        "name",
        "lifecycleState",
        "createdBy",
        "executionRecurrences",
        "taskDetails",
        "timeCreated",
        "timeLastRun",
        "timeNextRun",
        "timeLastUpdated"
    })
    public TaskScheduleSummary(
            String id,
            String fleetId,
            String name,
            TaskSchedule.LifecycleState lifecycleState,
            String createdBy,
            String executionRecurrences,
            TaskDetails taskDetails,
            java.util.Date timeCreated,
            java.util.Date timeLastRun,
            java.util.Date timeNextRun,
            java.util.Date timeLastUpdated) {
        super();
        this.id = id;
        this.fleetId = fleetId;
        this.name = name;
        this.lifecycleState = lifecycleState;
        this.createdBy = createdBy;
        this.executionRecurrences = executionRecurrences;
        this.taskDetails = taskDetails;
        this.timeCreated = timeCreated;
        this.timeLastRun = timeLastRun;
        this.timeNextRun = timeNextRun;
        this.timeLastUpdated = timeLastUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * identify this task schedule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * identify this task schedule.
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
         * Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The name of the task schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the task schedule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The current state of the task schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TaskSchedule.LifecycleState lifecycleState;

        /**
         * The current state of the task schedule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(TaskSchedule.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The name of the task creator. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The name of the task creator.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Recurrence specification for the task schedule execution (formatted according to
         * [RFC-5545](https://icalendar.org/RFC-Specifications/iCalendar-RFC-5545/)). To run daily
         * for 10 occurrences starts on September 2, 2024 09:00 EDT, it should be
         * 'DTSTART;TZID=America/New_York:20240902T090000 RRULE:FREQ=DAILY;COUNT=10'. To run every 3
         * hours from 9:00 AM to 5:00 PM on August 5, 2024 EDT, it should be
         * 'DTSTART;TZID=America/New_York:20240805T090000
         * RRULE:FREQ=HOURLY;INTERVAL=3;UNTIL=20240805T170000Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionRecurrences")
        private String executionRecurrences;

        /**
         * Recurrence specification for the task schedule execution (formatted according to
         * [RFC-5545](https://icalendar.org/RFC-Specifications/iCalendar-RFC-5545/)). To run daily
         * for 10 occurrences starts on September 2, 2024 09:00 EDT, it should be
         * 'DTSTART;TZID=America/New_York:20240902T090000 RRULE:FREQ=DAILY;COUNT=10'. To run every 3
         * hours from 9:00 AM to 5:00 PM on August 5, 2024 EDT, it should be
         * 'DTSTART;TZID=America/New_York:20240805T090000
         * RRULE:FREQ=HOURLY;INTERVAL=3;UNTIL=20240805T170000Z'.
         *
         * @param executionRecurrences the value to set
         * @return this builder
         */
        public Builder executionRecurrences(String executionRecurrences) {
            this.executionRecurrences = executionRecurrences;
            this.__explicitlySet__.add("executionRecurrences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskDetails")
        private TaskDetails taskDetails;

        public Builder taskDetails(TaskDetails taskDetails) {
            this.taskDetails = taskDetails;
            this.__explicitlySet__.add("taskDetails");
            return this;
        }
        /**
         * The date and time the task schedule was created (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the task schedule was created (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the task schedule ran last (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
        private java.util.Date timeLastRun;

        /**
         * The date and time the task schedule ran last (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastRun the value to set
         * @return this builder
         */
        public Builder timeLastRun(java.util.Date timeLastRun) {
            this.timeLastRun = timeLastRun;
            this.__explicitlySet__.add("timeLastRun");
            return this;
        }
        /**
         * The date and time the task schedule will run next (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
        private java.util.Date timeNextRun;

        /**
         * The date and time the task schedule will run next (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeNextRun the value to set
         * @return this builder
         */
        public Builder timeNextRun(java.util.Date timeNextRun) {
            this.timeNextRun = timeNextRun;
            this.__explicitlySet__.add("timeNextRun");
            return this;
        }
        /**
         * The date and time the task schedule was last updated (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * The date and time the task schedule was last updated (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastUpdated the value to set
         * @return this builder
         */
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskScheduleSummary build() {
            TaskScheduleSummary model =
                    new TaskScheduleSummary(
                            this.id,
                            this.fleetId,
                            this.name,
                            this.lifecycleState,
                            this.createdBy,
                            this.executionRecurrences,
                            this.taskDetails,
                            this.timeCreated,
                            this.timeLastRun,
                            this.timeNextRun,
                            this.timeLastUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskScheduleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("executionRecurrences")) {
                this.executionRecurrences(model.getExecutionRecurrences());
            }
            if (model.wasPropertyExplicitlySet("taskDetails")) {
                this.taskDetails(model.getTaskDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastRun")) {
                this.timeLastRun(model.getTimeLastRun());
            }
            if (model.wasPropertyExplicitlySet("timeNextRun")) {
                this.timeNextRun(model.getTimeNextRun());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdated")) {
                this.timeLastUpdated(model.getTimeLastUpdated());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to identify
     * this task schedule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to identify
     * this task schedule.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The name of the task schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the task schedule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The current state of the task schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TaskSchedule.LifecycleState lifecycleState;

    /**
     * The current state of the task schedule.
     *
     * @return the value
     */
    public TaskSchedule.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The name of the task creator. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The name of the task creator.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Recurrence specification for the task schedule execution (formatted according to
     * [RFC-5545](https://icalendar.org/RFC-Specifications/iCalendar-RFC-5545/)). To run daily for
     * 10 occurrences starts on September 2, 2024 09:00 EDT, it should be
     * 'DTSTART;TZID=America/New_York:20240902T090000 RRULE:FREQ=DAILY;COUNT=10'. To run every 3
     * hours from 9:00 AM to 5:00 PM on August 5, 2024 EDT, it should be
     * 'DTSTART;TZID=America/New_York:20240805T090000
     * RRULE:FREQ=HOURLY;INTERVAL=3;UNTIL=20240805T170000Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionRecurrences")
    private final String executionRecurrences;

    /**
     * Recurrence specification for the task schedule execution (formatted according to
     * [RFC-5545](https://icalendar.org/RFC-Specifications/iCalendar-RFC-5545/)). To run daily for
     * 10 occurrences starts on September 2, 2024 09:00 EDT, it should be
     * 'DTSTART;TZID=America/New_York:20240902T090000 RRULE:FREQ=DAILY;COUNT=10'. To run every 3
     * hours from 9:00 AM to 5:00 PM on August 5, 2024 EDT, it should be
     * 'DTSTART;TZID=America/New_York:20240805T090000
     * RRULE:FREQ=HOURLY;INTERVAL=3;UNTIL=20240805T170000Z'.
     *
     * @return the value
     */
    public String getExecutionRecurrences() {
        return executionRecurrences;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("taskDetails")
    private final TaskDetails taskDetails;

    public TaskDetails getTaskDetails() {
        return taskDetails;
    }

    /**
     * The date and time the task schedule was created (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the task schedule was created (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the task schedule ran last (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
    private final java.util.Date timeLastRun;

    /**
     * The date and time the task schedule ran last (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeLastRun() {
        return timeLastRun;
    }

    /**
     * The date and time the task schedule will run next (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
    private final java.util.Date timeNextRun;

    /**
     * The date and time the task schedule will run next (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeNextRun() {
        return timeNextRun;
    }

    /**
     * The date and time the task schedule was last updated (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * The date and time the task schedule was last updated (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
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
        sb.append("TaskScheduleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", executionRecurrences=").append(String.valueOf(this.executionRecurrences));
        sb.append(", taskDetails=").append(String.valueOf(this.taskDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastRun=").append(String.valueOf(this.timeLastRun));
        sb.append(", timeNextRun=").append(String.valueOf(this.timeNextRun));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskScheduleSummary)) {
            return false;
        }

        TaskScheduleSummary other = (TaskScheduleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.executionRecurrences, other.executionRecurrences)
                && java.util.Objects.equals(this.taskDetails, other.taskDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastRun, other.timeLastRun)
                && java.util.Objects.equals(this.timeNextRun, other.timeNextRun)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.executionRecurrences == null
                                ? 43
                                : this.executionRecurrences.hashCode());
        result = (result * PRIME) + (this.taskDetails == null ? 43 : this.taskDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeLastRun == null ? 43 : this.timeLastRun.hashCode());
        result = (result * PRIME) + (this.timeNextRun == null ? 43 : this.timeNextRun.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
