/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FixedFrequencySchedule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FixedFrequencySchedule extends Schedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("misfirePolicy")
        private MisfirePolicy misfirePolicy;

        public Builder misfirePolicy(MisfirePolicy misfirePolicy) {
            this.misfirePolicy = misfirePolicy;
            this.__explicitlySet__.add("misfirePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfFirstExecution")
        private java.util.Date timeOfFirstExecution;

        public Builder timeOfFirstExecution(java.util.Date timeOfFirstExecution) {
            this.timeOfFirstExecution = timeOfFirstExecution;
            this.__explicitlySet__.add("timeOfFirstExecution");
            return this;
        }
        /**
         * Recurring interval in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The largest supported unit is D, e.g. P14D (not P2W).
         * The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurringInterval")
        private String recurringInterval;

        /**
         * Recurring interval in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The largest supported unit is D, e.g. P14D (not P2W).
         * The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
         *
         * @param recurringInterval the value to set
         * @return this builder
         **/
        public Builder recurringInterval(String recurringInterval) {
            this.recurringInterval = recurringInterval;
            this.__explicitlySet__.add("recurringInterval");
            return this;
        }
        /**
         * Number of times (0-based) to execute until auto-stop.
         * Default value -1 will execute indefinitely.
         * Value 0 will execute once.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
        private Integer repeatCount;

        /**
         * Number of times (0-based) to execute until auto-stop.
         * Default value -1 will execute indefinitely.
         * Value 0 will execute once.
         *
         * @param repeatCount the value to set
         * @return this builder
         **/
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            this.__explicitlySet__.add("repeatCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedFrequencySchedule build() {
            FixedFrequencySchedule __instance__ =
                    new FixedFrequencySchedule(
                            misfirePolicy, timeOfFirstExecution, recurringInterval, repeatCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedFrequencySchedule o) {
            Builder copiedBuilder =
                    misfirePolicy(o.getMisfirePolicy())
                            .timeOfFirstExecution(o.getTimeOfFirstExecution())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public FixedFrequencySchedule(
            MisfirePolicy misfirePolicy,
            java.util.Date timeOfFirstExecution,
            String recurringInterval,
            Integer repeatCount) {
        super(misfirePolicy, timeOfFirstExecution);
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
    private final String recurringInterval;

    /**
     * Recurring interval in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The largest supported unit is D, e.g. P14D (not P2W).
     * The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
     *
     * @return the value
     **/
    public String getRecurringInterval() {
        return recurringInterval;
    }

    /**
     * Number of times (0-based) to execute until auto-stop.
     * Default value -1 will execute indefinitely.
     * Value 0 will execute once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repeatCount")
    private final Integer repeatCount;

    /**
     * Number of times (0-based) to execute until auto-stop.
     * Default value -1 will execute indefinitely.
     * Value 0 will execute once.
     *
     * @return the value
     **/
    public Integer getRepeatCount() {
        return repeatCount;
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
        sb.append("FixedFrequencySchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", recurringInterval=").append(String.valueOf(this.recurringInterval));
        sb.append(", repeatCount=").append(String.valueOf(this.repeatCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedFrequencySchedule)) {
            return false;
        }

        FixedFrequencySchedule other = (FixedFrequencySchedule) o;
        return java.util.Objects.equals(this.recurringInterval, other.recurringInterval)
                && java.util.Objects.equals(this.repeatCount, other.repeatCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.recurringInterval == null ? 43 : this.recurringInterval.hashCode());
        result = (result * PRIME) + (this.repeatCount == null ? 43 : this.repeatCount.hashCode());
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
