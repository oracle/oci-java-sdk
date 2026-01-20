/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The interval schedule trigger. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduleIntervalTrigger.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "triggerType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduleIntervalTrigger extends ScheduleTrigger {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The type of frequency */
        @com.fasterxml.jackson.annotation.JsonProperty("frequency")
        private Frequency frequency;

        /**
         * The type of frequency
         *
         * @param frequency the value to set
         * @return this builder
         */
        public Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            this.__explicitlySet__.add("frequency");
            return this;
        }
        /** The interval of frequency. */
        @com.fasterxml.jackson.annotation.JsonProperty("interval")
        private Integer interval;

        /**
         * The interval of frequency.
         *
         * @param interval the value to set
         * @return this builder
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            this.__explicitlySet__.add("interval");
            return this;
        }
        /**
         * when true and timeStart is null, system generate a random start time between now and now
         * + interval; isRandomStartTime can be true if timeStart is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRandomStartTime")
        private Boolean isRandomStartTime;

        /**
         * when true and timeStart is null, system generate a random start time between now and now
         * + interval; isRandomStartTime can be true if timeStart is null.
         *
         * @param isRandomStartTime the value to set
         * @return this builder
         */
        public Builder isRandomStartTime(Boolean isRandomStartTime) {
            this.isRandomStartTime = isRandomStartTime;
            this.__explicitlySet__.add("isRandomStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleIntervalTrigger build() {
            ScheduleIntervalTrigger model =
                    new ScheduleIntervalTrigger(
                            this.timeStart,
                            this.timeEnd,
                            this.frequency,
                            this.interval,
                            this.isRandomStartTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleIntervalTrigger model) {
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("frequency")) {
                this.frequency(model.getFrequency());
            }
            if (model.wasPropertyExplicitlySet("interval")) {
                this.interval(model.getInterval());
            }
            if (model.wasPropertyExplicitlySet("isRandomStartTime")) {
                this.isRandomStartTime(model.getIsRandomStartTime());
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

    @Deprecated
    public ScheduleIntervalTrigger(
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Frequency frequency,
            Integer interval,
            Boolean isRandomStartTime) {
        super(timeStart, timeEnd);
        this.frequency = frequency;
        this.interval = interval;
        this.isRandomStartTime = isRandomStartTime;
    }

    /** The type of frequency */
    public enum Frequency implements com.oracle.bmc.http.internal.BmcEnum {
        Hourly("HOURLY"),
        Daily("DAILY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Frequency.class);

        private final String value;
        private static java.util.Map<String, Frequency> map;

        static {
            map = new java.util.HashMap<>();
            for (Frequency v : Frequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Frequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Frequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Frequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of frequency */
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    private final Frequency frequency;

    /**
     * The type of frequency
     *
     * @return the value
     */
    public Frequency getFrequency() {
        return frequency;
    }

    /** The interval of frequency. */
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    private final Integer interval;

    /**
     * The interval of frequency.
     *
     * @return the value
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * when true and timeStart is null, system generate a random start time between now and now +
     * interval; isRandomStartTime can be true if timeStart is null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRandomStartTime")
    private final Boolean isRandomStartTime;

    /**
     * when true and timeStart is null, system generate a random start time between now and now +
     * interval; isRandomStartTime can be true if timeStart is null.
     *
     * @return the value
     */
    public Boolean getIsRandomStartTime() {
        return isRandomStartTime;
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
        sb.append("ScheduleIntervalTrigger(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", frequency=").append(String.valueOf(this.frequency));
        sb.append(", interval=").append(String.valueOf(this.interval));
        sb.append(", isRandomStartTime=").append(String.valueOf(this.isRandomStartTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleIntervalTrigger)) {
            return false;
        }

        ScheduleIntervalTrigger other = (ScheduleIntervalTrigger) o;
        return java.util.Objects.equals(this.frequency, other.frequency)
                && java.util.Objects.equals(this.interval, other.interval)
                && java.util.Objects.equals(this.isRandomStartTime, other.isRandomStartTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.frequency == null ? 43 : this.frequency.hashCode());
        result = (result * PRIME) + (this.interval == null ? 43 : this.interval.hashCode());
        result =
                (result * PRIME)
                        + (this.isRandomStartTime == null ? 43 : this.isRandomStartTime.hashCode());
        return result;
    }
}
