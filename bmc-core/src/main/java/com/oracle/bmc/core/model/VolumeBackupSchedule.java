/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the backup frequency and retention period for a volume backup policy. For more
 * information, see [Policy-Based
 * Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VolumeBackupSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VolumeBackupSchedule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupType",
        "offsetSeconds",
        "period",
        "offsetType",
        "hourOfDay",
        "dayOfWeek",
        "dayOfMonth",
        "month",
        "retentionSeconds",
        "timeZone"
    })
    public VolumeBackupSchedule(
            BackupType backupType,
            Integer offsetSeconds,
            Period period,
            OffsetType offsetType,
            Integer hourOfDay,
            DayOfWeek dayOfWeek,
            Integer dayOfMonth,
            Month month,
            Integer retentionSeconds,
            TimeZone timeZone) {
        super();
        this.backupType = backupType;
        this.offsetSeconds = offsetSeconds;
        this.period = period;
        this.offsetType = offsetType;
        this.hourOfDay = hourOfDay;
        this.dayOfWeek = dayOfWeek;
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.retentionSeconds = retentionSeconds;
        this.timeZone = timeZone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of volume backup to create. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        /**
         * The type of volume backup to create.
         *
         * @param backupType the value to set
         * @return this builder
         */
        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }
        /**
         * The number of seconds that the volume backup start time should be shifted from the
         * default interval boundaries specified by the period. The volume backup start time is the
         * frequency start time plus the offset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
        private Integer offsetSeconds;

        /**
         * The number of seconds that the volume backup start time should be shifted from the
         * default interval boundaries specified by the period. The volume backup start time is the
         * frequency start time plus the offset.
         *
         * @param offsetSeconds the value to set
         * @return this builder
         */
        public Builder offsetSeconds(Integer offsetSeconds) {
            this.offsetSeconds = offsetSeconds;
            this.__explicitlySet__.add("offsetSeconds");
            return this;
        }
        /** The volume backup frequency. */
        @com.fasterxml.jackson.annotation.JsonProperty("period")
        private Period period;

        /**
         * The volume backup frequency.
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
         * Indicates how the offset is defined. If value is {@code STRUCTURED}, then {@code
         * hourOfDay}, {@code dayOfWeek}, {@code dayOfMonth}, and {@code month} fields are used and
         * {@code offsetSeconds} will be ignored in requests and users should ignore its value from
         * the responses.
         *
         * <p>{@code hourOfDay} is applicable for periods {@code ONE_DAY}, {@code ONE_WEEK}, {@code
         * ONE_MONTH} and {@code ONE_YEAR}.
         *
         * <p>{@code dayOfWeek} is applicable for period {@code ONE_WEEK}.
         *
         * <p>{@code dayOfMonth} is applicable for periods {@code ONE_MONTH} and {@code ONE_YEAR}.
         *
         * <p>'month' is applicable for period 'ONE_YEAR'.
         *
         * <p>They will be ignored in the requests for inapplicable periods.
         *
         * <p>If value is {@code NUMERIC_SECONDS}, then {@code offsetSeconds} will be used for both
         * requests and responses and the structured fields will be ignored in the requests and
         * users should ignore their values from the responses.
         *
         * <p>For clients using older versions of Apis and not sending {@code offsetType} in their
         * requests, the behaviour is just like {@code NUMERIC_SECONDS}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offsetType")
        private OffsetType offsetType;

        /**
         * Indicates how the offset is defined. If value is {@code STRUCTURED}, then {@code
         * hourOfDay}, {@code dayOfWeek}, {@code dayOfMonth}, and {@code month} fields are used and
         * {@code offsetSeconds} will be ignored in requests and users should ignore its value from
         * the responses.
         *
         * <p>{@code hourOfDay} is applicable for periods {@code ONE_DAY}, {@code ONE_WEEK}, {@code
         * ONE_MONTH} and {@code ONE_YEAR}.
         *
         * <p>{@code dayOfWeek} is applicable for period {@code ONE_WEEK}.
         *
         * <p>{@code dayOfMonth} is applicable for periods {@code ONE_MONTH} and {@code ONE_YEAR}.
         *
         * <p>'month' is applicable for period 'ONE_YEAR'.
         *
         * <p>They will be ignored in the requests for inapplicable periods.
         *
         * <p>If value is {@code NUMERIC_SECONDS}, then {@code offsetSeconds} will be used for both
         * requests and responses and the structured fields will be ignored in the requests and
         * users should ignore their values from the responses.
         *
         * <p>For clients using older versions of Apis and not sending {@code offsetType} in their
         * requests, the behaviour is just like {@code NUMERIC_SECONDS}.
         *
         * @param offsetType the value to set
         * @return this builder
         */
        public Builder offsetType(OffsetType offsetType) {
            this.offsetType = offsetType;
            this.__explicitlySet__.add("offsetType");
            return this;
        }
        /** The hour of the day to schedule the volume backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
        private Integer hourOfDay;

        /**
         * The hour of the day to schedule the volume backup.
         *
         * @param hourOfDay the value to set
         * @return this builder
         */
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            this.__explicitlySet__.add("hourOfDay");
            return this;
        }
        /** The day of the week to schedule the volume backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * The day of the week to schedule the volume backup.
         *
         * @param dayOfWeek the value to set
         * @return this builder
         */
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /** The day of the month to schedule the volume backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
        private Integer dayOfMonth;

        /**
         * The day of the month to schedule the volume backup.
         *
         * @param dayOfMonth the value to set
         * @return this builder
         */
        public Builder dayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            this.__explicitlySet__.add("dayOfMonth");
            return this;
        }
        /** The month of the year to schedule the volume backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("month")
        private Month month;

        /**
         * The month of the year to schedule the volume backup.
         *
         * @param month the value to set
         * @return this builder
         */
        public Builder month(Month month) {
            this.month = month;
            this.__explicitlySet__.add("month");
            return this;
        }
        /** How long, in seconds, to keep the volume backups created by this schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
        private Integer retentionSeconds;

        /**
         * How long, in seconds, to keep the volume backups created by this schedule.
         *
         * @param retentionSeconds the value to set
         * @return this builder
         */
        public Builder retentionSeconds(Integer retentionSeconds) {
            this.retentionSeconds = retentionSeconds;
            this.__explicitlySet__.add("retentionSeconds");
            return this;
        }
        /** Specifies what time zone is the schedule in */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private TimeZone timeZone;

        /**
         * Specifies what time zone is the schedule in
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeBackupSchedule build() {
            VolumeBackupSchedule model =
                    new VolumeBackupSchedule(
                            this.backupType,
                            this.offsetSeconds,
                            this.period,
                            this.offsetType,
                            this.hourOfDay,
                            this.dayOfWeek,
                            this.dayOfMonth,
                            this.month,
                            this.retentionSeconds,
                            this.timeZone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeBackupSchedule model) {
            if (model.wasPropertyExplicitlySet("backupType")) {
                this.backupType(model.getBackupType());
            }
            if (model.wasPropertyExplicitlySet("offsetSeconds")) {
                this.offsetSeconds(model.getOffsetSeconds());
            }
            if (model.wasPropertyExplicitlySet("period")) {
                this.period(model.getPeriod());
            }
            if (model.wasPropertyExplicitlySet("offsetType")) {
                this.offsetType(model.getOffsetType());
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
            if (model.wasPropertyExplicitlySet("retentionSeconds")) {
                this.retentionSeconds(model.getRetentionSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
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

    /** The type of volume backup to create. */
    public enum BackupType implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupType.class);

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
    /** The type of volume backup to create. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    private final BackupType backupType;

    /**
     * The type of volume backup to create.
     *
     * @return the value
     */
    public BackupType getBackupType() {
        return backupType;
    }

    /**
     * The number of seconds that the volume backup start time should be shifted from the default
     * interval boundaries specified by the period. The volume backup start time is the frequency
     * start time plus the offset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offsetSeconds")
    private final Integer offsetSeconds;

    /**
     * The number of seconds that the volume backup start time should be shifted from the default
     * interval boundaries specified by the period. The volume backup start time is the frequency
     * start time plus the offset.
     *
     * @return the value
     */
    public Integer getOffsetSeconds() {
        return offsetSeconds;
    }

    /** The volume backup frequency. */
    public enum Period implements com.oracle.bmc.http.internal.BmcEnum {
        OneHour("ONE_HOUR"),
        OneDay("ONE_DAY"),
        OneWeek("ONE_WEEK"),
        OneMonth("ONE_MONTH"),
        OneYear("ONE_YEAR"),

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
    /** The volume backup frequency. */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    private final Period period;

    /**
     * The volume backup frequency.
     *
     * @return the value
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Indicates how the offset is defined. If value is {@code STRUCTURED}, then {@code hourOfDay},
     * {@code dayOfWeek}, {@code dayOfMonth}, and {@code month} fields are used and {@code
     * offsetSeconds} will be ignored in requests and users should ignore its value from the
     * responses.
     *
     * <p>{@code hourOfDay} is applicable for periods {@code ONE_DAY}, {@code ONE_WEEK}, {@code
     * ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>{@code dayOfWeek} is applicable for period {@code ONE_WEEK}.
     *
     * <p>{@code dayOfMonth} is applicable for periods {@code ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>'month' is applicable for period 'ONE_YEAR'.
     *
     * <p>They will be ignored in the requests for inapplicable periods.
     *
     * <p>If value is {@code NUMERIC_SECONDS}, then {@code offsetSeconds} will be used for both
     * requests and responses and the structured fields will be ignored in the requests and users
     * should ignore their values from the responses.
     *
     * <p>For clients using older versions of Apis and not sending {@code offsetType} in their
     * requests, the behaviour is just like {@code NUMERIC_SECONDS}.
     */
    public enum OffsetType implements com.oracle.bmc.http.internal.BmcEnum {
        Structured("STRUCTURED"),
        NumericSeconds("NUMERIC_SECONDS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OffsetType.class);

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
     * Indicates how the offset is defined. If value is {@code STRUCTURED}, then {@code hourOfDay},
     * {@code dayOfWeek}, {@code dayOfMonth}, and {@code month} fields are used and {@code
     * offsetSeconds} will be ignored in requests and users should ignore its value from the
     * responses.
     *
     * <p>{@code hourOfDay} is applicable for periods {@code ONE_DAY}, {@code ONE_WEEK}, {@code
     * ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>{@code dayOfWeek} is applicable for period {@code ONE_WEEK}.
     *
     * <p>{@code dayOfMonth} is applicable for periods {@code ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>'month' is applicable for period 'ONE_YEAR'.
     *
     * <p>They will be ignored in the requests for inapplicable periods.
     *
     * <p>If value is {@code NUMERIC_SECONDS}, then {@code offsetSeconds} will be used for both
     * requests and responses and the structured fields will be ignored in the requests and users
     * should ignore their values from the responses.
     *
     * <p>For clients using older versions of Apis and not sending {@code offsetType} in their
     * requests, the behaviour is just like {@code NUMERIC_SECONDS}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offsetType")
    private final OffsetType offsetType;

    /**
     * Indicates how the offset is defined. If value is {@code STRUCTURED}, then {@code hourOfDay},
     * {@code dayOfWeek}, {@code dayOfMonth}, and {@code month} fields are used and {@code
     * offsetSeconds} will be ignored in requests and users should ignore its value from the
     * responses.
     *
     * <p>{@code hourOfDay} is applicable for periods {@code ONE_DAY}, {@code ONE_WEEK}, {@code
     * ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>{@code dayOfWeek} is applicable for period {@code ONE_WEEK}.
     *
     * <p>{@code dayOfMonth} is applicable for periods {@code ONE_MONTH} and {@code ONE_YEAR}.
     *
     * <p>'month' is applicable for period 'ONE_YEAR'.
     *
     * <p>They will be ignored in the requests for inapplicable periods.
     *
     * <p>If value is {@code NUMERIC_SECONDS}, then {@code offsetSeconds} will be used for both
     * requests and responses and the structured fields will be ignored in the requests and users
     * should ignore their values from the responses.
     *
     * <p>For clients using older versions of Apis and not sending {@code offsetType} in their
     * requests, the behaviour is just like {@code NUMERIC_SECONDS}.
     *
     * @return the value
     */
    public OffsetType getOffsetType() {
        return offsetType;
    }

    /** The hour of the day to schedule the volume backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
    private final Integer hourOfDay;

    /**
     * The hour of the day to schedule the volume backup.
     *
     * @return the value
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /** The day of the week to schedule the volume backup. */
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
    /** The day of the week to schedule the volume backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * The day of the week to schedule the volume backup.
     *
     * @return the value
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /** The day of the month to schedule the volume backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfMonth")
    private final Integer dayOfMonth;

    /**
     * The day of the month to schedule the volume backup.
     *
     * @return the value
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /** The month of the year to schedule the volume backup. */
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
    /** The month of the year to schedule the volume backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("month")
    private final Month month;

    /**
     * The month of the year to schedule the volume backup.
     *
     * @return the value
     */
    public Month getMonth() {
        return month;
    }

    /** How long, in seconds, to keep the volume backups created by this schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionSeconds")
    private final Integer retentionSeconds;

    /**
     * How long, in seconds, to keep the volume backups created by this schedule.
     *
     * @return the value
     */
    public Integer getRetentionSeconds() {
        return retentionSeconds;
    }

    /** Specifies what time zone is the schedule in */
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
    /** Specifies what time zone is the schedule in */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final TimeZone timeZone;

    /**
     * Specifies what time zone is the schedule in
     *
     * @return the value
     */
    public TimeZone getTimeZone() {
        return timeZone;
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
        sb.append("VolumeBackupSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("backupType=").append(String.valueOf(this.backupType));
        sb.append(", offsetSeconds=").append(String.valueOf(this.offsetSeconds));
        sb.append(", period=").append(String.valueOf(this.period));
        sb.append(", offsetType=").append(String.valueOf(this.offsetType));
        sb.append(", hourOfDay=").append(String.valueOf(this.hourOfDay));
        sb.append(", dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", dayOfMonth=").append(String.valueOf(this.dayOfMonth));
        sb.append(", month=").append(String.valueOf(this.month));
        sb.append(", retentionSeconds=").append(String.valueOf(this.retentionSeconds));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeBackupSchedule)) {
            return false;
        }

        VolumeBackupSchedule other = (VolumeBackupSchedule) o;
        return java.util.Objects.equals(this.backupType, other.backupType)
                && java.util.Objects.equals(this.offsetSeconds, other.offsetSeconds)
                && java.util.Objects.equals(this.period, other.period)
                && java.util.Objects.equals(this.offsetType, other.offsetType)
                && java.util.Objects.equals(this.hourOfDay, other.hourOfDay)
                && java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.dayOfMonth, other.dayOfMonth)
                && java.util.Objects.equals(this.month, other.month)
                && java.util.Objects.equals(this.retentionSeconds, other.retentionSeconds)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.backupType == null ? 43 : this.backupType.hashCode());
        result =
                (result * PRIME)
                        + (this.offsetSeconds == null ? 43 : this.offsetSeconds.hashCode());
        result = (result * PRIME) + (this.period == null ? 43 : this.period.hashCode());
        result = (result * PRIME) + (this.offsetType == null ? 43 : this.offsetType.hashCode());
        result = (result * PRIME) + (this.hourOfDay == null ? 43 : this.hourOfDay.hashCode());
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result = (result * PRIME) + (this.dayOfMonth == null ? 43 : this.dayOfMonth.hashCode());
        result = (result * PRIME) + (this.month == null ? 43 : this.month.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionSeconds == null ? 43 : this.retentionSeconds.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
