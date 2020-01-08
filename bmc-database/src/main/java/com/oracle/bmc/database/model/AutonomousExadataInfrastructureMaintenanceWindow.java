/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Exadata Infrastructure maintenance window details for quarterly patching.
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
    builder = AutonomousExadataInfrastructureMaintenanceWindow.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AutonomousExadataInfrastructureMaintenanceWindow {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
        private Integer hourOfDay;

        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            this.__explicitlySet__.add("hourOfDay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousExadataInfrastructureMaintenanceWindow build() {
            AutonomousExadataInfrastructureMaintenanceWindow __instance__ =
                    new AutonomousExadataInfrastructureMaintenanceWindow(dayOfWeek, hourOfDay);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousExadataInfrastructureMaintenanceWindow o) {
            Builder copiedBuilder = dayOfWeek(o.getDayOfWeek()).hourOfDay(o.getHourOfDay());

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
     * Day of the week that the patch should be applied to the Autonomous Exadata Infrastructure. Patches are applied during the first week of the quarter.
     **/
    public enum DayOfWeek {
        Any("ANY"),
        Sunday("SUNDAY"),
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),
        ;

        private final String value;
        private static java.util.Map<String, DayOfWeek> map;

        static {
            map = new java.util.HashMap<>();
            for (DayOfWeek v : DayOfWeek.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid DayOfWeek: " + key);
        }
    };
    /**
     * Day of the week that the patch should be applied to the Autonomous Exadata Infrastructure. Patches are applied during the first week of the quarter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    DayOfWeek dayOfWeek;

    /**
     * Hour of the day that the patch should be applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hourOfDay")
    Integer hourOfDay;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
