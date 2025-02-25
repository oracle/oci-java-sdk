/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Single Scheduling Window details.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WindowPreferenceDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WindowPreferenceDetail
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "months",
        "weeksOfMonth",
        "daysOfWeek",
        "startTime",
        "duration",
        "isEnforcedDuration"
    })
    public WindowPreferenceDetail(
            java.util.List<Month> months,
            java.util.List<Integer> weeksOfMonth,
            java.util.List<DayOfWeek> daysOfWeek,
            String startTime,
            Integer duration,
            Boolean isEnforcedDuration) {
        super();
        this.months = months;
        this.weeksOfMonth = weeksOfMonth;
        this.daysOfWeek = daysOfWeek;
        this.startTime = startTime;
        this.duration = duration;
        this.isEnforcedDuration = isEnforcedDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Months during the year when scheduled window should be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("months")
        private java.util.List<Month> months;

        /**
         * Months during the year when scheduled window should be performed.
         * @param months the value to set
         * @return this builder
         **/
        public Builder months(java.util.List<Month> months) {
            this.months = months;
            this.__explicitlySet__.add("months");
            return this;
        }
        /**
         * Weeks during the month when scheduled window should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week.
         * For example, to allow scheduling window during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Scheduling window cannot be scheduled for the fifth week of months that contain more than 28 days.
         * Note that this parameter works in conjunction with the  daysOfWeek and startTime parameters to allow you to specify specific days of the week and hours that scheduled window will be performed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
        private java.util.List<Integer> weeksOfMonth;

        /**
         * Weeks during the month when scheduled window should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week.
         * For example, to allow scheduling window during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Scheduling window cannot be scheduled for the fifth week of months that contain more than 28 days.
         * Note that this parameter works in conjunction with the  daysOfWeek and startTime parameters to allow you to specify specific days of the week and hours that scheduled window will be performed.
         *
         * @param weeksOfMonth the value to set
         * @return this builder
         **/
        public Builder weeksOfMonth(java.util.List<Integer> weeksOfMonth) {
            this.weeksOfMonth = weeksOfMonth;
            this.__explicitlySet__.add("weeksOfMonth");
            return this;
        }
        /**
         * Days during the week when scheduling window should be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
        private java.util.List<DayOfWeek> daysOfWeek;

        /**
         * Days during the week when scheduling window should be performed.
         * @param daysOfWeek the value to set
         * @return this builder
         **/
        public Builder daysOfWeek(java.util.List<DayOfWeek> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            this.__explicitlySet__.add("daysOfWeek");
            return this;
        }
        /**
         * The scheduling window start time. The value must use the ISO-8601 format "hh:mm".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * The scheduling window start time. The value must use the ISO-8601 format "hh:mm".
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling window. The duration is in minutes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling window. The duration is in minutes.
         *
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly enforced. The default value is {@code FALSE}.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDuration")
        private Boolean isEnforcedDuration;

        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly enforced. The default value is {@code FALSE}.
         * @param isEnforcedDuration the value to set
         * @return this builder
         **/
        public Builder isEnforcedDuration(Boolean isEnforcedDuration) {
            this.isEnforcedDuration = isEnforcedDuration;
            this.__explicitlySet__.add("isEnforcedDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WindowPreferenceDetail build() {
            WindowPreferenceDetail model =
                    new WindowPreferenceDetail(
                            this.months,
                            this.weeksOfMonth,
                            this.daysOfWeek,
                            this.startTime,
                            this.duration,
                            this.isEnforcedDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WindowPreferenceDetail model) {
            if (model.wasPropertyExplicitlySet("months")) {
                this.months(model.getMonths());
            }
            if (model.wasPropertyExplicitlySet("weeksOfMonth")) {
                this.weeksOfMonth(model.getWeeksOfMonth());
            }
            if (model.wasPropertyExplicitlySet("daysOfWeek")) {
                this.daysOfWeek(model.getDaysOfWeek());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedDuration")) {
                this.isEnforcedDuration(model.getIsEnforcedDuration());
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
     * Months during the year when scheduled window should be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("months")
    private final java.util.List<Month> months;

    /**
     * Months during the year when scheduled window should be performed.
     * @return the value
     **/
    public java.util.List<Month> getMonths() {
        return months;
    }

    /**
     * Weeks during the month when scheduled window should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week.
     * For example, to allow scheduling window during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Scheduling window cannot be scheduled for the fifth week of months that contain more than 28 days.
     * Note that this parameter works in conjunction with the  daysOfWeek and startTime parameters to allow you to specify specific days of the week and hours that scheduled window will be performed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weeksOfMonth")
    private final java.util.List<Integer> weeksOfMonth;

    /**
     * Weeks during the month when scheduled window should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week.
     * For example, to allow scheduling window during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Scheduling window cannot be scheduled for the fifth week of months that contain more than 28 days.
     * Note that this parameter works in conjunction with the  daysOfWeek and startTime parameters to allow you to specify specific days of the week and hours that scheduled window will be performed.
     *
     * @return the value
     **/
    public java.util.List<Integer> getWeeksOfMonth() {
        return weeksOfMonth;
    }

    /**
     * Days during the week when scheduling window should be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysOfWeek")
    private final java.util.List<DayOfWeek> daysOfWeek;

    /**
     * Days during the week when scheduling window should be performed.
     * @return the value
     **/
    public java.util.List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * The scheduling window start time. The value must use the ISO-8601 format "hh:mm".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * The scheduling window start time. The value must use the ISO-8601 format "hh:mm".
     * @return the value
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window. The duration is in minutes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window. The duration is in minutes.
     *
     * @return the value
     **/
    public Integer getDuration() {
        return duration;
    }

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced. The default value is {@code FALSE}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDuration")
    private final Boolean isEnforcedDuration;

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced. The default value is {@code FALSE}.
     * @return the value
     **/
    public Boolean getIsEnforcedDuration() {
        return isEnforcedDuration;
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
        sb.append("WindowPreferenceDetail(");
        sb.append("super=").append(super.toString());
        sb.append("months=").append(String.valueOf(this.months));
        sb.append(", weeksOfMonth=").append(String.valueOf(this.weeksOfMonth));
        sb.append(", daysOfWeek=").append(String.valueOf(this.daysOfWeek));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", isEnforcedDuration=").append(String.valueOf(this.isEnforcedDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WindowPreferenceDetail)) {
            return false;
        }

        WindowPreferenceDetail other = (WindowPreferenceDetail) o;
        return java.util.Objects.equals(this.months, other.months)
                && java.util.Objects.equals(this.weeksOfMonth, other.weeksOfMonth)
                && java.util.Objects.equals(this.daysOfWeek, other.daysOfWeek)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.isEnforcedDuration, other.isEnforcedDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.months == null ? 43 : this.months.hashCode());
        result = (result * PRIME) + (this.weeksOfMonth == null ? 43 : this.weeksOfMonth.hashCode());
        result = (result * PRIME) + (this.daysOfWeek == null ? 43 : this.daysOfWeek.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedDuration == null
                                ? 43
                                : this.isEnforcedDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
