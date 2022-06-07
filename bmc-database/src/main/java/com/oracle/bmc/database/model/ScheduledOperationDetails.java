/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of scheduled operation.
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
    builder = ScheduledOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledOperationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"dayOfWeek", "scheduledStartTime", "scheduledStopTime"})
    public ScheduledOperationDetails(
            DayOfWeek dayOfWeek, String scheduledStartTime, String scheduledStopTime) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.scheduledStartTime = scheduledStartTime;
        this.scheduledStopTime = scheduledStopTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduledStartTime")
        private String scheduledStartTime;

        public Builder scheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = scheduledStartTime;
            this.__explicitlySet__.add("scheduledStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduledStopTime")
        private String scheduledStopTime;

        public Builder scheduledStopTime(String scheduledStopTime) {
            this.scheduledStopTime = scheduledStopTime;
            this.__explicitlySet__.add("scheduledStopTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledOperationDetails build() {
            ScheduledOperationDetails __instance__ =
                    new ScheduledOperationDetails(dayOfWeek, scheduledStartTime, scheduledStopTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledOperationDetails o) {
            Builder copiedBuilder =
                    dayOfWeek(o.getDayOfWeek())
                            .scheduledStartTime(o.getScheduledStartTime())
                            .scheduledStopTime(o.getScheduledStopTime());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * auto start time. value must be of ISO-8601 format "HH:mm"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledStartTime")
    private final String scheduledStartTime;

    public String getScheduledStartTime() {
        return scheduledStartTime;
    }

    /**
     * auto stop time. value must be of ISO-8601 format "HH:mm"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledStopTime")
    private final String scheduledStopTime;

    public String getScheduledStopTime() {
        return scheduledStopTime;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScheduledOperationDetails(");
        sb.append("dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", scheduledStartTime=").append(String.valueOf(this.scheduledStartTime));
        sb.append(", scheduledStopTime=").append(String.valueOf(this.scheduledStopTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledOperationDetails)) {
            return false;
        }

        ScheduledOperationDetails other = (ScheduledOperationDetails) o;
        return java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.scheduledStartTime, other.scheduledStartTime)
                && java.util.Objects.equals(this.scheduledStopTime, other.scheduledStopTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledStartTime == null
                                ? 43
                                : this.scheduledStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledStopTime == null ? 43 : this.scheduledStopTime.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
