/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * A period where upgrades may be applied to Compute Cloud@Customer infrastructures associated with
 * the schedule. All upgrade windows may not be used. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CccScheduleEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccScheduleEvent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "timeStart",
        "scheduleEventDuration",
        "scheduleEventRecurrences"
    })
    public CccScheduleEvent(
            String name,
            String description,
            java.util.Date timeStart,
            String scheduleEventDuration,
            String scheduleEventRecurrences) {
        super();
        this.name = name;
        this.description = description;
        this.timeStart = timeStart;
        this.scheduleEventDuration = scheduleEventDuration;
        this.scheduleEventRecurrences = scheduleEventRecurrences;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Generated name associated with the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Generated name associated with the event.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A description of the Compute Cloud@Customer upgrade schedule time block. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the Compute Cloud@Customer upgrade schedule time block.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time when the Compute Cloud@Customer upgrade schedule event starts,
         * inclusive. An RFC3339 formatted UTC datetime string. For an event with recurrences, this
         * is the date that a recurrence can start being applied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The date and time when the Compute Cloud@Customer upgrade schedule event starts,
         * inclusive. An RFC3339 formatted UTC datetime string. For an event with recurrences, this
         * is the date that a recurrence can start being applied.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * The duration of this block of time. The duration must be specified and be of the ISO-8601
         * format for durations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleEventDuration")
        private String scheduleEventDuration;

        /**
         * The duration of this block of time. The duration must be specified and be of the ISO-8601
         * format for durations.
         *
         * @param scheduleEventDuration the value to set
         * @return this builder
         */
        public Builder scheduleEventDuration(String scheduleEventDuration) {
            this.scheduleEventDuration = scheduleEventDuration;
            this.__explicitlySet__.add("scheduleEventDuration");
            return this;
        }
        /**
         * Frequency of recurrence of schedule block. When this field is not included, the event is
         * assumed to be a one time occurrence. The frequency field is strictly parsed and must
         * conform to RFC-5545 formatting for recurrences.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleEventRecurrences")
        private String scheduleEventRecurrences;

        /**
         * Frequency of recurrence of schedule block. When this field is not included, the event is
         * assumed to be a one time occurrence. The frequency field is strictly parsed and must
         * conform to RFC-5545 formatting for recurrences.
         *
         * @param scheduleEventRecurrences the value to set
         * @return this builder
         */
        public Builder scheduleEventRecurrences(String scheduleEventRecurrences) {
            this.scheduleEventRecurrences = scheduleEventRecurrences;
            this.__explicitlySet__.add("scheduleEventRecurrences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccScheduleEvent build() {
            CccScheduleEvent model =
                    new CccScheduleEvent(
                            this.name,
                            this.description,
                            this.timeStart,
                            this.scheduleEventDuration,
                            this.scheduleEventRecurrences);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccScheduleEvent model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("scheduleEventDuration")) {
                this.scheduleEventDuration(model.getScheduleEventDuration());
            }
            if (model.wasPropertyExplicitlySet("scheduleEventRecurrences")) {
                this.scheduleEventRecurrences(model.getScheduleEventRecurrences());
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

    /** Generated name associated with the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Generated name associated with the event.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A description of the Compute Cloud@Customer upgrade schedule time block. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the Compute Cloud@Customer upgrade schedule time block.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The date and time when the Compute Cloud@Customer upgrade schedule event starts, inclusive.
     * An RFC3339 formatted UTC datetime string. For an event with recurrences, this is the date
     * that a recurrence can start being applied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The date and time when the Compute Cloud@Customer upgrade schedule event starts, inclusive.
     * An RFC3339 formatted UTC datetime string. For an event with recurrences, this is the date
     * that a recurrence can start being applied.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * The duration of this block of time. The duration must be specified and be of the ISO-8601
     * format for durations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleEventDuration")
    private final String scheduleEventDuration;

    /**
     * The duration of this block of time. The duration must be specified and be of the ISO-8601
     * format for durations.
     *
     * @return the value
     */
    public String getScheduleEventDuration() {
        return scheduleEventDuration;
    }

    /**
     * Frequency of recurrence of schedule block. When this field is not included, the event is
     * assumed to be a one time occurrence. The frequency field is strictly parsed and must conform
     * to RFC-5545 formatting for recurrences.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleEventRecurrences")
    private final String scheduleEventRecurrences;

    /**
     * Frequency of recurrence of schedule block. When this field is not included, the event is
     * assumed to be a one time occurrence. The frequency field is strictly parsed and must conform
     * to RFC-5545 formatting for recurrences.
     *
     * @return the value
     */
    public String getScheduleEventRecurrences() {
        return scheduleEventRecurrences;
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
        sb.append("CccScheduleEvent(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", scheduleEventDuration=").append(String.valueOf(this.scheduleEventDuration));
        sb.append(", scheduleEventRecurrences=")
                .append(String.valueOf(this.scheduleEventRecurrences));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccScheduleEvent)) {
            return false;
        }

        CccScheduleEvent other = (CccScheduleEvent) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.scheduleEventDuration, other.scheduleEventDuration)
                && java.util.Objects.equals(
                        this.scheduleEventRecurrences, other.scheduleEventRecurrences)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleEventDuration == null
                                ? 43
                                : this.scheduleEventDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleEventRecurrences == null
                                ? 43
                                : this.scheduleEventRecurrences.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
