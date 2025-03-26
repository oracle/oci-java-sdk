/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Schedule information for the Maintenance Window that is executed multiple times.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecurrentMaintenanceWindowSchedule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "scheduleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecurrentMaintenanceWindowSchedule extends MaintenanceWindowSchedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
        private java.util.Date timeMaintenanceWindowStart;

        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         * @param timeMaintenanceWindowStart the value to set
         * @return this builder
         **/
        public Builder timeMaintenanceWindowStart(java.util.Date timeMaintenanceWindowStart) {
            this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
            this.__explicitlySet__.add("timeMaintenanceWindowStart");
            return this;
        }
        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
        private java.util.Date timeMaintenanceWindowEnd;

        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         * @param timeMaintenanceWindowEnd the value to set
         * @return this builder
         **/
        public Builder timeMaintenanceWindowEnd(java.util.Date timeMaintenanceWindowEnd) {
            this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
            this.__explicitlySet__.add("timeMaintenanceWindowEnd");
            return this;
        }
        /**
         * A RFC5545 formatted recurrence string which represents the Maintenance Window Recurrence.
         * Please refer this for details:https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10
         * FREQ: Frequency of the Maintenance Window. The supported values are: DAILY and WEEKLY.
         * BYDAY: Comma separated days for Weekly Maintenance Window.
         * BYHOUR: Specifies the start hour of each recurrence after {@code timeMaintenanceWindowStart} value.
         * BYMINUTE: Specifies the start minute of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
         * BYSECOND: Specifies the start second of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
         * Other Rules are not supported.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowRecurrences")
        private String maintenanceWindowRecurrences;

        /**
         * A RFC5545 formatted recurrence string which represents the Maintenance Window Recurrence.
         * Please refer this for details:https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10
         * FREQ: Frequency of the Maintenance Window. The supported values are: DAILY and WEEKLY.
         * BYDAY: Comma separated days for Weekly Maintenance Window.
         * BYHOUR: Specifies the start hour of each recurrence after {@code timeMaintenanceWindowStart} value.
         * BYMINUTE: Specifies the start minute of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
         * BYSECOND: Specifies the start second of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
         * Other Rules are not supported.
         *
         * @param maintenanceWindowRecurrences the value to set
         * @return this builder
         **/
        public Builder maintenanceWindowRecurrences(String maintenanceWindowRecurrences) {
            this.maintenanceWindowRecurrences = maintenanceWindowRecurrences;
            this.__explicitlySet__.add("maintenanceWindowRecurrences");
            return this;
        }
        /**
         * Duration time of each recurrence of each Maintenance Window.
         * It must be specified as a string in ISO 8601 extended format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDuration")
        private String maintenanceWindowDuration;

        /**
         * Duration time of each recurrence of each Maintenance Window.
         * It must be specified as a string in ISO 8601 extended format.
         *
         * @param maintenanceWindowDuration the value to set
         * @return this builder
         **/
        public Builder maintenanceWindowDuration(String maintenanceWindowDuration) {
            this.maintenanceWindowDuration = maintenanceWindowDuration;
            this.__explicitlySet__.add("maintenanceWindowDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecurrentMaintenanceWindowSchedule build() {
            RecurrentMaintenanceWindowSchedule model =
                    new RecurrentMaintenanceWindowSchedule(
                            this.timeMaintenanceWindowStart,
                            this.timeMaintenanceWindowEnd,
                            this.maintenanceWindowRecurrences,
                            this.maintenanceWindowDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecurrentMaintenanceWindowSchedule model) {
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowStart")) {
                this.timeMaintenanceWindowStart(model.getTimeMaintenanceWindowStart());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowEnd")) {
                this.timeMaintenanceWindowEnd(model.getTimeMaintenanceWindowEnd());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowRecurrences")) {
                this.maintenanceWindowRecurrences(model.getMaintenanceWindowRecurrences());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDuration")) {
                this.maintenanceWindowDuration(model.getMaintenanceWindowDuration());
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

    @Deprecated
    public RecurrentMaintenanceWindowSchedule(
            java.util.Date timeMaintenanceWindowStart,
            java.util.Date timeMaintenanceWindowEnd,
            String maintenanceWindowRecurrences,
            String maintenanceWindowDuration) {
        super();
        this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
        this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
        this.maintenanceWindowRecurrences = maintenanceWindowRecurrences;
        this.maintenanceWindowDuration = maintenanceWindowDuration;
    }

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
    private final java.util.Date timeMaintenanceWindowStart;

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     * @return the value
     **/
    public java.util.Date getTimeMaintenanceWindowStart() {
        return timeMaintenanceWindowStart;
    }

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
    private final java.util.Date timeMaintenanceWindowEnd;

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     * @return the value
     **/
    public java.util.Date getTimeMaintenanceWindowEnd() {
        return timeMaintenanceWindowEnd;
    }

    /**
     * A RFC5545 formatted recurrence string which represents the Maintenance Window Recurrence.
     * Please refer this for details:https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10
     * FREQ: Frequency of the Maintenance Window. The supported values are: DAILY and WEEKLY.
     * BYDAY: Comma separated days for Weekly Maintenance Window.
     * BYHOUR: Specifies the start hour of each recurrence after {@code timeMaintenanceWindowStart} value.
     * BYMINUTE: Specifies the start minute of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
     * BYSECOND: Specifies the start second of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
     * Other Rules are not supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowRecurrences")
    private final String maintenanceWindowRecurrences;

    /**
     * A RFC5545 formatted recurrence string which represents the Maintenance Window Recurrence.
     * Please refer this for details:https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10
     * FREQ: Frequency of the Maintenance Window. The supported values are: DAILY and WEEKLY.
     * BYDAY: Comma separated days for Weekly Maintenance Window.
     * BYHOUR: Specifies the start hour of each recurrence after {@code timeMaintenanceWindowStart} value.
     * BYMINUTE: Specifies the start minute of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
     * BYSECOND: Specifies the start second of each reccurrence after {@code timeMaintenanceWindowStart} value. The default value is 00
     * Other Rules are not supported.
     *
     * @return the value
     **/
    public String getMaintenanceWindowRecurrences() {
        return maintenanceWindowRecurrences;
    }

    /**
     * Duration time of each recurrence of each Maintenance Window.
     * It must be specified as a string in ISO 8601 extended format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDuration")
    private final String maintenanceWindowDuration;

    /**
     * Duration time of each recurrence of each Maintenance Window.
     * It must be specified as a string in ISO 8601 extended format.
     *
     * @return the value
     **/
    public String getMaintenanceWindowDuration() {
        return maintenanceWindowDuration;
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
        sb.append("RecurrentMaintenanceWindowSchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeMaintenanceWindowStart=")
                .append(String.valueOf(this.timeMaintenanceWindowStart));
        sb.append(", timeMaintenanceWindowEnd=")
                .append(String.valueOf(this.timeMaintenanceWindowEnd));
        sb.append(", maintenanceWindowRecurrences=")
                .append(String.valueOf(this.maintenanceWindowRecurrences));
        sb.append(", maintenanceWindowDuration=")
                .append(String.valueOf(this.maintenanceWindowDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecurrentMaintenanceWindowSchedule)) {
            return false;
        }

        RecurrentMaintenanceWindowSchedule other = (RecurrentMaintenanceWindowSchedule) o;
        return java.util.Objects.equals(
                        this.timeMaintenanceWindowStart, other.timeMaintenanceWindowStart)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowEnd, other.timeMaintenanceWindowEnd)
                && java.util.Objects.equals(
                        this.maintenanceWindowRecurrences, other.maintenanceWindowRecurrences)
                && java.util.Objects.equals(
                        this.maintenanceWindowDuration, other.maintenanceWindowDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowStart == null
                                ? 43
                                : this.timeMaintenanceWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowEnd == null
                                ? 43
                                : this.timeMaintenanceWindowEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowRecurrences == null
                                ? 43
                                : this.maintenanceWindowRecurrences.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDuration == null
                                ? 43
                                : this.maintenanceWindowDuration.hashCode());
        return result;
    }
}
