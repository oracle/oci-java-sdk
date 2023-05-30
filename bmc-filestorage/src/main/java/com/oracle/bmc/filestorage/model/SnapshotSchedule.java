/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * The snapshot schedule is a structure within a parent file system snapshot policy. It contains
 * data about the frequency of snapshot creation and the retention time of the taken snapshots. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SnapshotSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SnapshotSchedule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schedulePrefix",
        "timeScheduleStart",
        "period",
        "retentionDurationInSeconds",
        "timeZone",
        "hourOfDay",
        "dayOfWeek",
        "dayOfMonth",
        "month"
    })
    public SnapshotSchedule(
            String schedulePrefix,
            java.util.Date timeScheduleStart,
            Period period,
            Long retentionDurationInSeconds,
            TimeZone timeZone,
            Integer hourOfDay,
            DayOfWeek dayOfWeek,
            Integer dayOfMonth,
            Month month) {
        super();
        this.schedulePrefix = schedulePrefix;
        this.timeScheduleStart = timeScheduleStart;
        this.period = period;
        this.retentionDurationInSeconds = retentionDurationInSeconds;
        this.timeZone = timeZone;
        this.hourOfDay = hourOfDay;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A name prefix to be applied to snapshots created by this schedule.
         *
         * <p>Example: {@code compliance1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulePrefix")
        private String schedulePrefix;

        /**
         * A name prefix to be applied to snapshots created by this schedule.
         *
         * <p>Example: {@code compliance1}
         *
         * @param schedulePrefix the value to set
         * @return this builder
         */
        public Builder schedulePrefix(String schedulePrefix) {
            this.schedulePrefix = schedulePrefix;
            this.__explicitlySet__.add("schedulePrefix");
            return this;
        }
        /**
         * The starting point used to begin the scheduling of the snapshots based upon recurrence
         * string in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. If no {@code
         * timeScheduleStart} is provided, the value will be set to the time when the schedule was
         * created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleStart")
        private java.util.Date timeScheduleStart;

        /**
         * The starting point used to begin the scheduling of the snapshots based upon recurrence
         * string in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. If no {@code
         * timeScheduleStart} is provided, the value will be set to the time when the schedule was
         * created.
         *
         * @param timeScheduleStart the value to set
         * @return this builder
         */
        public Builder timeScheduleStart(java.util.Date timeScheduleStart) {
            this.timeScheduleStart = timeScheduleStart;
            this.__explicitlySet__.add("timeScheduleStart");
            return this;
        }
        /** The frequency of scheduled snapshots. */
        @com.fasterxml.jackson.annotation.JsonProperty("period")
        private Period period;

        /**
         * The frequency of scheduled snapshots.
         *
         * @param period the value to set
         * @return this builder
         */
        public Builder period(Period period) {
            this.period = period;
            this.__explicitlySet__.add("period");
            return this;
        }
        /**
         * The number of seconds to retain snapshots created with this schedule. Snapshot expiration
         * time will not be set if this value is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionDurationInSeconds")
        private Long retentionDurationInSeconds;

        /**
         * The number of seconds to retain snapshots created with this schedule. Snapshot expiration
         * time will not be set if this value is empty.
         *
         * @param retentionDurationInSeconds the value to set
         * @return this builder
         */
        public Builder retentionDurationInSeconds(Long retentionDurationInSeconds) {
            this.retentionDurationInSeconds = retentionDurationInSeconds;
            this.__explicitlySet__.add("retentionDurationInSeconds");
            return this;
        }
        /** Time zone used for scheduling the snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private TimeZone timeZone;

        /**
         * Time zone used for scheduling the snapshot.
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * The hour of the day to create a DAILY, WEEKLY, MONTHLY, or YEARLY snapshot. If not set, a
         * value will be chosen at creation time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
        private Integer hourOfDay;

        /**
         * The hour of the day to create a DAILY, WEEKLY, MONTHLY, or YEARLY snapshot. If not set, a
         * value will be chosen at creation time.
         *
         * @param hourOfDay the value to set
         * @return this builder
         */
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            this.__explicitlySet__.add("hourOfDay");
            return this;
        }
        /**
         * The day of the week to create a scheduled snapshot. Used for WEEKLY snapshot schedules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * The day of the week to create a scheduled snapshot. Used for WEEKLY snapshot schedules.
         *
         * @param dayOfWeek the value to set
         * @return this builder
         */
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /**
         * The day of the month to create a scheduled snapshot. If the day does not exist for the
         * month, snapshot creation will be skipped. Used for MONTHLY and YEARLY snapshot schedules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
        private Integer dayOfMonth;

        /**
         * The day of the month to create a scheduled snapshot. If the day does not exist for the
         * month, snapshot creation will be skipped. Used for MONTHLY and YEARLY snapshot schedules.
         *
         * @param dayOfMonth the value to set
         * @return this builder
         */
        public Builder dayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            this.__explicitlySet__.add("dayOfMonth");
            return this;
        }
        /** The month to create a scheduled snapshot. Used only for YEARLY snapshot schedules. */
        @com.fasterxml.jackson.annotation.JsonProperty("month")
        private Month month;

        /**
         * The month to create a scheduled snapshot. Used only for YEARLY snapshot schedules.
         *
         * @param month the value to set
         * @return this builder
         */
        public Builder month(Month month) {
            this.month = month;
            this.__explicitlySet__.add("month");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SnapshotSchedule build() {
            SnapshotSchedule model =
                    new SnapshotSchedule(
                            this.schedulePrefix,
                            this.timeScheduleStart,
                            this.period,
                            this.retentionDurationInSeconds,
                            this.timeZone,
                            this.hourOfDay,
                            this.dayOfWeek,
                            this.dayOfMonth,
                            this.month);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SnapshotSchedule model) {
            if (model.wasPropertyExplicitlySet("schedulePrefix")) {
                this.schedulePrefix(model.getSchedulePrefix());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleStart")) {
                this.timeScheduleStart(model.getTimeScheduleStart());
            }
            if (model.wasPropertyExplicitlySet("period")) {
                this.period(model.getPeriod());
            }
            if (model.wasPropertyExplicitlySet("retentionDurationInSeconds")) {
                this.retentionDurationInSeconds(model.getRetentionDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("hourOfDay")) {
                this.hourOfDay(model.getHourOfDay());
            }
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("dayOfMonth")) {
                this.dayOfMonth(model.getDayOfMonth());
            }
            if (model.wasPropertyExplicitlySet("month")) {
                this.month(model.getMonth());
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
     * A name prefix to be applied to snapshots created by this schedule.
     *
     * <p>Example: {@code compliance1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulePrefix")
    private final String schedulePrefix;

    /**
     * A name prefix to be applied to snapshots created by this schedule.
     *
     * <p>Example: {@code compliance1}
     *
     * @return the value
     */
    public String getSchedulePrefix() {
        return schedulePrefix;
    }

    /**
     * The starting point used to begin the scheduling of the snapshots based upon recurrence string
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. If no {@code
     * timeScheduleStart} is provided, the value will be set to the time when the schedule was
     * created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleStart")
    private final java.util.Date timeScheduleStart;

    /**
     * The starting point used to begin the scheduling of the snapshots based upon recurrence string
     * in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format. If no {@code
     * timeScheduleStart} is provided, the value will be set to the time when the schedule was
     * created.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduleStart() {
        return timeScheduleStart;
    }

    /** The frequency of scheduled snapshots. */
    public enum Period implements com.oracle.bmc.http.internal.BmcEnum {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        Yearly("YEARLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Period.class);

        private final String value;
        private static java.util.Map<String, Period> map;

        static {
            map = new java.util.HashMap<>();
            for (Period v : Period.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Period(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Period create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Period', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The frequency of scheduled snapshots. */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    private final Period period;

    /**
     * The frequency of scheduled snapshots.
     *
     * @return the value
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * The number of seconds to retain snapshots created with this schedule. Snapshot expiration
     * time will not be set if this value is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDurationInSeconds")
    private final Long retentionDurationInSeconds;

    /**
     * The number of seconds to retain snapshots created with this schedule. Snapshot expiration
     * time will not be set if this value is empty.
     *
     * @return the value
     */
    public Long getRetentionDurationInSeconds() {
        return retentionDurationInSeconds;
    }

    /** Time zone used for scheduling the snapshot. */
    public enum TimeZone implements com.oracle.bmc.http.internal.BmcEnum {
        Utc("UTC"),
        RegionalDataCenterTime("REGIONAL_DATA_CENTER_TIME"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TimeZone.class);

        private final String value;
        private static java.util.Map<String, TimeZone> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeZone v : TimeZone.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TimeZone(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeZone create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TimeZone', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Time zone used for scheduling the snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final TimeZone timeZone;

    /**
     * Time zone used for scheduling the snapshot.
     *
     * @return the value
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * The hour of the day to create a DAILY, WEEKLY, MONTHLY, or YEARLY snapshot. If not set, a
     * value will be chosen at creation time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
    private final Integer hourOfDay;

    /**
     * The hour of the day to create a DAILY, WEEKLY, MONTHLY, or YEARLY snapshot. If not set, a
     * value will be chosen at creation time.
     *
     * @return the value
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /** The day of the week to create a scheduled snapshot. Used for WEEKLY snapshot schedules. */
    public enum DayOfWeek implements com.oracle.bmc.http.internal.BmcEnum {
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),
        Sunday("SUNDAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DayOfWeek.class);

        private final String value;
        private static java.util.Map<String, DayOfWeek> map;

        static {
            map = new java.util.HashMap<>();
            for (DayOfWeek v : DayOfWeek.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DayOfWeek(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DayOfWeek create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DayOfWeek', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The day of the week to create a scheduled snapshot. Used for WEEKLY snapshot schedules. */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * The day of the week to create a scheduled snapshot. Used for WEEKLY snapshot schedules.
     *
     * @return the value
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * The day of the month to create a scheduled snapshot. If the day does not exist for the month,
     * snapshot creation will be skipped. Used for MONTHLY and YEARLY snapshot schedules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
    private final Integer dayOfMonth;

    /**
     * The day of the month to create a scheduled snapshot. If the day does not exist for the month,
     * snapshot creation will be skipped. Used for MONTHLY and YEARLY snapshot schedules.
     *
     * @return the value
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /** The month to create a scheduled snapshot. Used only for YEARLY snapshot schedules. */
    public enum Month implements com.oracle.bmc.http.internal.BmcEnum {
        January("JANUARY"),
        February("FEBRUARY"),
        March("MARCH"),
        April("APRIL"),
        May("MAY"),
        June("JUNE"),
        July("JULY"),
        August("AUGUST"),
        September("SEPTEMBER"),
        October("OCTOBER"),
        November("NOVEMBER"),
        December("DECEMBER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Month.class);

        private final String value;
        private static java.util.Map<String, Month> map;

        static {
            map = new java.util.HashMap<>();
            for (Month v : Month.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Month(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Month create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Month', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The month to create a scheduled snapshot. Used only for YEARLY snapshot schedules. */
    @com.fasterxml.jackson.annotation.JsonProperty("month")
    private final Month month;

    /**
     * The month to create a scheduled snapshot. Used only for YEARLY snapshot schedules.
     *
     * @return the value
     */
    public Month getMonth() {
        return month;
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
        sb.append("SnapshotSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("schedulePrefix=").append(String.valueOf(this.schedulePrefix));
        sb.append(", timeScheduleStart=").append(String.valueOf(this.timeScheduleStart));
        sb.append(", period=").append(String.valueOf(this.period));
        sb.append(", retentionDurationInSeconds=")
                .append(String.valueOf(this.retentionDurationInSeconds));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", hourOfDay=").append(String.valueOf(this.hourOfDay));
        sb.append(", dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", dayOfMonth=").append(String.valueOf(this.dayOfMonth));
        sb.append(", month=").append(String.valueOf(this.month));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SnapshotSchedule)) {
            return false;
        }

        SnapshotSchedule other = (SnapshotSchedule) o;
        return java.util.Objects.equals(this.schedulePrefix, other.schedulePrefix)
                && java.util.Objects.equals(this.timeScheduleStart, other.timeScheduleStart)
                && java.util.Objects.equals(this.period, other.period)
                && java.util.Objects.equals(
                        this.retentionDurationInSeconds, other.retentionDurationInSeconds)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.hourOfDay, other.hourOfDay)
                && java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.dayOfMonth, other.dayOfMonth)
                && java.util.Objects.equals(this.month, other.month)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.schedulePrefix == null ? 43 : this.schedulePrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleStart == null ? 43 : this.timeScheduleStart.hashCode());
        result = (result * PRIME) + (this.period == null ? 43 : this.period.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionDurationInSeconds == null
                                ? 43
                                : this.retentionDurationInSeconds.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.hourOfDay == null ? 43 : this.hourOfDay.hashCode());
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result = (result * PRIME) + (this.dayOfMonth == null ? 43 : this.dayOfMonth.hashCode());
        result = (result * PRIME) + (this.month == null ? 43 : this.month.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
