/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Frequency Details model for weekly frequency based on day of week. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WeeklyFrequencyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WeeklyFrequencyDetails extends AbstractFrequencyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("frequency")
        private Frequency frequency;

        public Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            this.__explicitlySet__.add("frequency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private Time time;

        public Builder time(Time time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }
        /** A list of days of the week to be scheduled. i.e. execute on Monday and Thursday. */
        @com.fasterxml.jackson.annotation.JsonProperty("days")
        private java.util.List<Days> days;

        /**
         * A list of days of the week to be scheduled. i.e. execute on Monday and Thursday.
         *
         * @param days the value to set
         * @return this builder
         */
        public Builder days(java.util.List<Days> days) {
            this.days = days;
            this.__explicitlySet__.add("days");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WeeklyFrequencyDetails build() {
            WeeklyFrequencyDetails model =
                    new WeeklyFrequencyDetails(this.frequency, this.time, this.days);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WeeklyFrequencyDetails model) {
            if (model.wasPropertyExplicitlySet("frequency")) {
                this.frequency(model.getFrequency());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
            }
            if (model.wasPropertyExplicitlySet("days")) {
                this.days(model.getDays());
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
    public WeeklyFrequencyDetails(Frequency frequency, Time time, java.util.List<Days> days) {
        super(frequency);
        this.time = time;
        this.days = days;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final Time time;

    public Time getTime() {
        return time;
    }

    /** */
    public enum Days implements com.oracle.bmc.http.internal.BmcEnum {
        Sunday("SUNDAY"),
        Monday("MONDAY"),
        Tuesday("TUESDAY"),
        Wednesday("WEDNESDAY"),
        Thursday("THURSDAY"),
        Friday("FRIDAY"),
        Saturday("SATURDAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Days.class);

        private final String value;
        private static java.util.Map<String, Days> map;

        static {
            map = new java.util.HashMap<>();
            for (Days v : Days.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Days(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Days create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Days', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** A list of days of the week to be scheduled. i.e. execute on Monday and Thursday. */
    @com.fasterxml.jackson.annotation.JsonProperty("days")
    private final java.util.List<Days> days;

    /**
     * A list of days of the week to be scheduled. i.e. execute on Monday and Thursday.
     *
     * @return the value
     */
    public java.util.List<Days> getDays() {
        return days;
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
        sb.append("WeeklyFrequencyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(", days=").append(String.valueOf(this.days));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WeeklyFrequencyDetails)) {
            return false;
        }

        WeeklyFrequencyDetails other = (WeeklyFrequencyDetails) o;
        return java.util.Objects.equals(this.time, other.time)
                && java.util.Objects.equals(this.days, other.days)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + (this.days == null ? 43 : this.days.hashCode());
        return result;
    }
}
