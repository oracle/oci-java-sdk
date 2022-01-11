/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Frequency Details model for monthly frequency based on week of month and day of week.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonthlyRuleFrequencyDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonthlyRuleFrequencyDetails extends AbstractFrequencyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("frequency")
        private Frequency frequency;

        public Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            this.__explicitlySet__.add("frequency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weekOfMonth")
        private WeekOfMonth weekOfMonth;

        public Builder weekOfMonth(WeekOfMonth weekOfMonth) {
            this.weekOfMonth = weekOfMonth;
            this.__explicitlySet__.add("weekOfMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("interval")
        private Integer interval;

        public Builder interval(Integer interval) {
            this.interval = interval;
            this.__explicitlySet__.add("interval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private Time time;

        public Builder time(Time time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonthlyRuleFrequencyDetails build() {
            MonthlyRuleFrequencyDetails __instance__ =
                    new MonthlyRuleFrequencyDetails(
                            frequency, weekOfMonth, interval, time, dayOfWeek);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonthlyRuleFrequencyDetails o) {
            Builder copiedBuilder =
                    frequency(o.getFrequency())
                            .weekOfMonth(o.getWeekOfMonth())
                            .interval(o.getInterval())
                            .time(o.getTime())
                            .dayOfWeek(o.getDayOfWeek());

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

    @Deprecated
    public MonthlyRuleFrequencyDetails(
            Frequency frequency,
            WeekOfMonth weekOfMonth,
            Integer interval,
            Time time,
            DayOfWeek dayOfWeek) {
        super(frequency);
        this.weekOfMonth = weekOfMonth;
        this.interval = interval;
        this.time = time;
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * This holds the week of the month in which the schedule should be triggered.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum WeekOfMonth {
        First("FIRST"),
        Second("SECOND"),
        Third("THIRD"),
        Fourth("FOURTH"),
        Fifth("FIFTH"),
        Last("LAST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, WeekOfMonth> map;

        static {
            map = new java.util.HashMap<>();
            for (WeekOfMonth v : WeekOfMonth.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WeekOfMonth(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WeekOfMonth create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WeekOfMonth', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This holds the week of the month in which the schedule should be triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weekOfMonth")
    WeekOfMonth weekOfMonth;

    /**
     * This hold the repeatability aspect of a schedule. i.e. in a monhtly frequency, a task can be scheduled for every month, once in two months, once in tree months etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    Integer interval;

    @com.fasterxml.jackson.annotation.JsonProperty("time")
    Time time;
    /**
     * This holds the day of the week on which the schedule should be triggered.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DayOfWeek {
        Sunday("SUNDAY"),
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),

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
     * This holds the day of the week on which the schedule should be triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    DayOfWeek dayOfWeek;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
