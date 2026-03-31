/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * Information about the list of available start times on a particular day of the week.
 * User can choose their preferred day of the week and start time for creating request/input
 * for Create or Update LustreFileSystem operation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailableMaintenanceScheduleStartTimeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AvailableMaintenanceScheduleStartTimeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dayOfWeek", "startTimes"})
    public AvailableMaintenanceScheduleStartTimeSummary(
            DayOfWeek dayOfWeek, java.util.List<String> startTimes) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.startTimes = startTimes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Day of the week
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * Day of the week
         * @param dayOfWeek the value to set
         * @return this builder
         **/
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /**
         * List of available start times. Each array item is of the format {@code HH:mm}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimes")
        private java.util.List<String> startTimes;

        /**
         * List of available start times. Each array item is of the format {@code HH:mm}
         * @param startTimes the value to set
         * @return this builder
         **/
        public Builder startTimes(java.util.List<String> startTimes) {
            this.startTimes = startTimes;
            this.__explicitlySet__.add("startTimes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableMaintenanceScheduleStartTimeSummary build() {
            AvailableMaintenanceScheduleStartTimeSummary model =
                    new AvailableMaintenanceScheduleStartTimeSummary(
                            this.dayOfWeek, this.startTimes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableMaintenanceScheduleStartTimeSummary model) {
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("startTimes")) {
                this.startTimes(model.getStartTimes());
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

    /**
     * Day of the week
     **/
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
    /**
     * Day of the week
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * Day of the week
     * @return the value
     **/
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * List of available start times. Each array item is of the format {@code HH:mm}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimes")
    private final java.util.List<String> startTimes;

    /**
     * List of available start times. Each array item is of the format {@code HH:mm}
     * @return the value
     **/
    public java.util.List<String> getStartTimes() {
        return startTimes;
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
        sb.append("AvailableMaintenanceScheduleStartTimeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", startTimes=").append(String.valueOf(this.startTimes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableMaintenanceScheduleStartTimeSummary)) {
            return false;
        }

        AvailableMaintenanceScheduleStartTimeSummary other =
                (AvailableMaintenanceScheduleStartTimeSummary) o;
        return java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.startTimes, other.startTimes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result = (result * PRIME) + (this.startTimes == null ? 43 : this.startTimes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
