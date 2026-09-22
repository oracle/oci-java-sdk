/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details required to schedule maintenance window. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceWindowSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceWindowSchedule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scheduleType",
        "timeStarted",
        "timeEnded",
        "recurrenceType"
    })
    public MaintenanceWindowSchedule(
            MaintenanceWindowScheduleType scheduleType,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            MaintenanceWindowRecurrenceType recurrenceType) {
        super();
        this.scheduleType = scheduleType;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.recurrenceType = recurrenceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of maintenance window schedule. If not provided, a schedule with timeStarted and
         * timeEnded is treated as ONE_TIME.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private MaintenanceWindowScheduleType scheduleType;

        /**
         * Type of maintenance window schedule. If not provided, a schedule with timeStarted and
         * timeEnded is treated as ONE_TIME.
         *
         * @param scheduleType the value to set
         * @return this builder
         */
        public Builder scheduleType(MaintenanceWindowScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * Start time of the maintenance window, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Start time of the maintenance window, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * End time of the maintenance window, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * End time of the maintenance window, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Type of recurrence for a recurring maintenance window. */
        @com.fasterxml.jackson.annotation.JsonProperty("recurrenceType")
        private MaintenanceWindowRecurrenceType recurrenceType;

        /**
         * Type of recurrence for a recurring maintenance window.
         *
         * @param recurrenceType the value to set
         * @return this builder
         */
        public Builder recurrenceType(MaintenanceWindowRecurrenceType recurrenceType) {
            this.recurrenceType = recurrenceType;
            this.__explicitlySet__.add("recurrenceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceWindowSchedule build() {
            MaintenanceWindowSchedule model =
                    new MaintenanceWindowSchedule(
                            this.scheduleType,
                            this.timeStarted,
                            this.timeEnded,
                            this.recurrenceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceWindowSchedule model) {
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("recurrenceType")) {
                this.recurrenceType(model.getRecurrenceType());
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
     * Type of maintenance window schedule. If not provided, a schedule with timeStarted and
     * timeEnded is treated as ONE_TIME.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final MaintenanceWindowScheduleType scheduleType;

    /**
     * Type of maintenance window schedule. If not provided, a schedule with timeStarted and
     * timeEnded is treated as ONE_TIME.
     *
     * @return the value
     */
    public MaintenanceWindowScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * Start time of the maintenance window, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Start time of the maintenance window, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * End time of the maintenance window, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * End time of the maintenance window, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Type of recurrence for a recurring maintenance window. */
    @com.fasterxml.jackson.annotation.JsonProperty("recurrenceType")
    private final MaintenanceWindowRecurrenceType recurrenceType;

    /**
     * Type of recurrence for a recurring maintenance window.
     *
     * @return the value
     */
    public MaintenanceWindowRecurrenceType getRecurrenceType() {
        return recurrenceType;
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
        sb.append("MaintenanceWindowSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", recurrenceType=").append(String.valueOf(this.recurrenceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceWindowSchedule)) {
            return false;
        }

        MaintenanceWindowSchedule other = (MaintenanceWindowSchedule) o;
        return java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.recurrenceType, other.recurrenceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.recurrenceType == null ? 43 : this.recurrenceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
