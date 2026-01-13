/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to create a task schedule. <br>
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
        builder = CreateTaskScheduleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateTaskScheduleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fleetId", "executionRecurrences", "taskDetails"})
    public CreateTaskScheduleDetails(
            String fleetId, String executionRecurrences, TaskDetails taskDetails) {
        super();
        this.fleetId = fleetId;
        this.executionRecurrences = executionRecurrences;
        this.taskDetails = taskDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTaskScheduleDetails build() {
            CreateTaskScheduleDetails model =
                    new CreateTaskScheduleDetails(
                            this.fleetId, this.executionRecurrences, this.taskDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTaskScheduleDetails model) {
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("executionRecurrences")) {
                this.executionRecurrences(model.getExecutionRecurrences());
            }
            if (model.wasPropertyExplicitlySet("taskDetails")) {
                this.taskDetails(model.getTaskDetails());
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
        sb.append("CreateTaskScheduleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", executionRecurrences=").append(String.valueOf(this.executionRecurrences));
        sb.append(", taskDetails=").append(String.valueOf(this.taskDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTaskScheduleDetails)) {
            return false;
        }

        CreateTaskScheduleDetails other = (CreateTaskScheduleDetails) o;
        return java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.executionRecurrences, other.executionRecurrences)
                && java.util.Objects.equals(this.taskDetails, other.taskDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.executionRecurrences == null
                                ? 43
                                : this.executionRecurrences.hashCode());
        result = (result * PRIME) + (this.taskDetails == null ? 43 : this.taskDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
