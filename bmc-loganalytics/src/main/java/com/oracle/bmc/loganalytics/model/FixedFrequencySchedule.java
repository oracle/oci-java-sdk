/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Fixed frequency schedule for a scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FixedFrequencySchedule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FixedFrequencySchedule extends Schedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("misfirePolicy")
        private MisfirePolicy misfirePolicy;

        public Builder misfirePolicy(MisfirePolicy misfirePolicy) {
            this.misfirePolicy = misfirePolicy;
            this.__explicitlySet__.add("misfirePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recurringInterval")
        private String recurringInterval;

        public Builder recurringInterval(String recurringInterval) {
            this.recurringInterval = recurringInterval;
            this.__explicitlySet__.add("recurringInterval");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
        private Integer repeatCount;

        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            this.__explicitlySet__.add("repeatCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedFrequencySchedule build() {
            FixedFrequencySchedule __instance__ =
                    new FixedFrequencySchedule(misfirePolicy, recurringInterval, repeatCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedFrequencySchedule o) {
            Builder copiedBuilder =
                    misfirePolicy(o.getMisfirePolicy())
                            .recurringInterval(o.getRecurringInterval())
                            .repeatCount(o.getRepeatCount());

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
    public FixedFrequencySchedule(
            MisfirePolicy misfirePolicy, String recurringInterval, Integer repeatCount) {
        super(misfirePolicy);
        this.recurringInterval = recurringInterval;
        this.repeatCount = repeatCount;
    }

    /**
     * Recurring interval in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. P14D (not P2W).
     * The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurringInterval")
    String recurringInterval;

    /**
     * Number of times (0-based) to execute until auto-stop.
     * Default value -1 will execute indefinitely.
     * Value 0 will execute once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
    Integer repeatCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
