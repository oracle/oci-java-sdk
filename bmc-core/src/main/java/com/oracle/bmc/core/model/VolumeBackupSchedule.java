/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the backup frequency and retention period for a volume backup policy. For more information,
 * see [Policy-Based Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VolumeBackupSchedule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VolumeBackupSchedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
        private Integer offsetSeconds;

        public Builder offsetSeconds(Integer offsetSeconds) {
            this.offsetSeconds = offsetSeconds;
            this.__explicitlySet__.add("offsetSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("period")
        private Period period;

        public Builder period(Period period) {
            this.period = period;
            this.__explicitlySet__.add("period");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offsetType")
        private OffsetType offsetType;

        public Builder offsetType(OffsetType offsetType) {
            this.offsetType = offsetType;
            this.__explicitlySet__.add("offsetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
        private Integer hourOfDay;

        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            this.__explicitlySet__.add("hourOfDay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
        private Integer dayOfMonth;

        public Builder dayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            this.__explicitlySet__.add("dayOfMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("month")
        private Month month;

        public Builder month(Month month) {
            this.month = month;
            this.__explicitlySet__.add("month");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
        private Integer retentionSeconds;

        public Builder retentionSeconds(Integer retentionSeconds) {
            this.retentionSeconds = retentionSeconds;
            this.__explicitlySet__.add("retentionSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private TimeZone timeZone;

        public Builder timeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeBackupSchedule build() {
            VolumeBackupSchedule __instance__ =
                    new VolumeBackupSchedule(
                            backupType,
                            offsetSeconds,
                            period,
                            offsetType,
                            hourOfDay,
                            dayOfWeek,
                            dayOfMonth,
                            month,
                            retentionSeconds,
                            timeZone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeBackupSchedule o) {
            Builder copiedBuilder =
                    backupType(o.getBackupType())
                            .offsetSeconds(o.getOffsetSeconds())
                            .period(o.getPeriod())
                            .offsetType(o.getOffsetType())
                            .hourOfDay(o.getHourOfDay())
                            .dayOfWeek(o.getDayOfWeek())
                            .dayOfMonth(o.getDayOfMonth())
                            .month(o.getMonth())
                            .retentionSeconds(o.getRetentionSeconds())
                            .timeZone(o.getTimeZone());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The type of volume backup to create.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BackupType {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of volume backup to create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    BackupType backupType;

    /**
     * The number of seconds that the volume backup start
     * time should be shifted from the default interval boundaries specified by
     * the period. The volume backup start time is the frequency start time plus the offset.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
    Integer offsetSeconds;
    /**
     * The volume backup frequency.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Period {
        OneHour("ONE_HOUR"),
        OneDay("ONE_DAY"),
        OneWeek("ONE_WEEK"),
        OneMonth("ONE_MONTH"),
        OneYear("ONE_YEAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The volume backup frequency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    Period period;
    /**
     * Indicates how the offset is defined. If value is `STRUCTURED`,
     * then `hourOfDay`, `dayOfWeek`, `dayOfMonth`, and `month` fields are used
     * and `offsetSeconds` will be ignored in requests and users should ignore its
     * value from the responses.
     * <p>
     * `hourOfDay` is applicable for periods `ONE_DAY`,
     * `ONE_WEEK`, `ONE_MONTH` and `ONE_YEAR`.
     * <p>
     * `dayOfWeek` is applicable for period
     * `ONE_WEEK`.
     * <p>
     * `dayOfMonth` is applicable for periods `ONE_MONTH` and `ONE_YEAR`.
     * <p>
     * 'month' is applicable for period 'ONE_YEAR'.
     * <p>
     * They will be ignored in the requests for inapplicable periods.
     * <p>
     * If value is `NUMERIC_SECONDS`, then `offsetSeconds`
     * will be used for both requests and responses and the structured fields will be
     * ignored in the requests and users should ignore their values from the responses.
     * <p>
     * For clients using older versions of Apis and not sending `offsetType` in their
     * requests, the behaviour is just like `NUMERIC_SECONDS`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OffsetType {
        Structured("STRUCTURED"),
        NumericSeconds("NUMERIC_SECONDS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OffsetType> map;

        static {
            map = new java.util.HashMap<>();
            for (OffsetType v : OffsetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OffsetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OffsetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OffsetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the offset is defined. If value is `STRUCTURED`,
     * then `hourOfDay`, `dayOfWeek`, `dayOfMonth`, and `month` fields are used
     * and `offsetSeconds` will be ignored in requests and users should ignore its
     * value from the responses.
     * <p>
     * `hourOfDay` is applicable for periods `ONE_DAY`,
     * `ONE_WEEK`, `ONE_MONTH` and `ONE_YEAR`.
     * <p>
     * `dayOfWeek` is applicable for period
     * `ONE_WEEK`.
     * <p>
     * `dayOfMonth` is applicable for periods `ONE_MONTH` and `ONE_YEAR`.
     * <p>
     * 'month' is applicable for period 'ONE_YEAR'.
     * <p>
     * They will be ignored in the requests for inapplicable periods.
     * <p>
     * If value is `NUMERIC_SECONDS`, then `offsetSeconds`
     * will be used for both requests and responses and the structured fields will be
     * ignored in the requests and users should ignore their values from the responses.
     * <p>
     * For clients using older versions of Apis and not sending `offsetType` in their
     * requests, the behaviour is just like `NUMERIC_SECONDS`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offsetType")
    OffsetType offsetType;

    /**
     * The hour of the day to schedule the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
    Integer hourOfDay;
    /**
     * The day of the week to schedule the volume backup.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DayOfWeek {
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),
        Sunday("SUNDAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The day of the week to schedule the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    DayOfWeek dayOfWeek;

    /**
     * The day of the month to schedule the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
    Integer dayOfMonth;
    /**
     * The month of the year to schedule the volume backup.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Month {
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
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The month of the year to schedule the volume backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("month")
    Month month;

    /**
     * How long, in seconds, to keep the volume backups created by this schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
    Integer retentionSeconds;
    /**
     * Specifies what time zone is the schedule in
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TimeZone {
        Utc("UTC"),
        RegionalDataCenterTime("REGIONAL_DATA_CENTER_TIME"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * Specifies what time zone is the schedule in
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    TimeZone timeZone;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
