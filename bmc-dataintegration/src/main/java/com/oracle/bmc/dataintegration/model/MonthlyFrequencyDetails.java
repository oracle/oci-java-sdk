/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Frequency Details model for monthly frequency.
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
    builder = MonthlyFrequencyDetails.Builder.class
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
public class MonthlyFrequencyDetails extends AbstractFrequencyDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("days")
        private java.util.List<Integer> days;

        public Builder days(java.util.List<Integer> days) {
            this.days = days;
            this.__explicitlySet__.add("days");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonthlyFrequencyDetails build() {
            MonthlyFrequencyDetails __instance__ =
                    new MonthlyFrequencyDetails(frequency, interval, time, days);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonthlyFrequencyDetails o) {
            Builder copiedBuilder =
                    frequency(o.getFrequency())
                            .interval(o.getInterval())
                            .time(o.getTime())
                            .days(o.getDays());

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
    public MonthlyFrequencyDetails(
            Frequency frequency, Integer interval, Time time, java.util.List<Integer> days) {
        super(frequency);
        this.interval = interval;
        this.time = time;
        this.days = days;
    }

    /**
     * This hold the repeatability aspect of a schedule. i.e. in a monhtly frequency, a task can be scheduled for every month, once in two months, once in tree months etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    Integer interval;

    @com.fasterxml.jackson.annotation.JsonProperty("time")
    Time time;

    /**
     * A list of days of the month to be scheduled. i.e. excute every 2nd,3rd, 10th of the month.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("days")
    java.util.List<Integer> days;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
