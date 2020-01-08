/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
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
    builder = MaintenanceWindow.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class MaintenanceWindow {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("preference")
        private Preference preference;

        public Builder preference(Preference preference) {
            this.preference = preference;
            this.__explicitlySet__.add("preference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("months")
        private java.util.List<Month> months;

        public Builder months(java.util.List<Month> months) {
            this.months = months;
            this.__explicitlySet__.add("months");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
        private java.util.List<Integer> weeksOfMonth;

        public Builder weeksOfMonth(java.util.List<Integer> weeksOfMonth) {
            this.weeksOfMonth = weeksOfMonth;
            this.__explicitlySet__.add("weeksOfMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
        private java.util.List<DayOfWeek> daysOfWeek;

        public Builder daysOfWeek(java.util.List<DayOfWeek> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            this.__explicitlySet__.add("daysOfWeek");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hoursOfDay")
        private java.util.List<Integer> hoursOfDay;

        public Builder hoursOfDay(java.util.List<Integer> hoursOfDay) {
            this.hoursOfDay = hoursOfDay;
            this.__explicitlySet__.add("hoursOfDay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceWindow build() {
            MaintenanceWindow __instance__ =
                    new MaintenanceWindow(preference, months, weeksOfMonth, daysOfWeek, hoursOfDay);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceWindow o) {
            Builder copiedBuilder =
                    preference(o.getPreference())
                            .months(o.getMonths())
                            .weeksOfMonth(o.getWeeksOfMonth())
                            .daysOfWeek(o.getDaysOfWeek())
                            .hoursOfDay(o.getHoursOfDay());

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
     * The maintenance window scheduling preference.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Preference {
        NoPreference("NO_PREFERENCE"),
        CustomPreference("CUSTOM_PREFERENCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Preference> map;

        static {
            map = new java.util.HashMap<>();
            for (Preference v : Preference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Preference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Preference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Preference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The maintenance window scheduling preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    Preference preference;

    /**
     * Months during the year when maintenance should be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("months")
    java.util.List<Month> months;

    /**
     * Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week.
     * For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days.
     * Note that this parameter works in conjunction with the  daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
    java.util.List<Integer> weeksOfMonth;

    /**
     * Days during the week when maintenance should be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Valid values are
     * - 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hoursOfDay")
    java.util.List<Integer> hoursOfDay;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
