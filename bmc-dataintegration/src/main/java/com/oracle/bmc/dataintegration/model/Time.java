/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A model to hold time in hour:minute:second format. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Time.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Time extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"hour", "minute", "second"})
    public Time(Integer hour, Integer minute, Integer second) {
        super();
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The hour value. */
        @com.fasterxml.jackson.annotation.JsonProperty("hour")
        private Integer hour;

        /**
         * The hour value.
         *
         * @param hour the value to set
         * @return this builder
         */
        public Builder hour(Integer hour) {
            this.hour = hour;
            this.__explicitlySet__.add("hour");
            return this;
        }
        /** The minute value. */
        @com.fasterxml.jackson.annotation.JsonProperty("minute")
        private Integer minute;

        /**
         * The minute value.
         *
         * @param minute the value to set
         * @return this builder
         */
        public Builder minute(Integer minute) {
            this.minute = minute;
            this.__explicitlySet__.add("minute");
            return this;
        }
        /** The second value. */
        @com.fasterxml.jackson.annotation.JsonProperty("second")
        private Integer second;

        /**
         * The second value.
         *
         * @param second the value to set
         * @return this builder
         */
        public Builder second(Integer second) {
            this.second = second;
            this.__explicitlySet__.add("second");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Time build() {
            Time model = new Time(this.hour, this.minute, this.second);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Time model) {
            if (model.wasPropertyExplicitlySet("hour")) {
                this.hour(model.getHour());
            }
            if (model.wasPropertyExplicitlySet("minute")) {
                this.minute(model.getMinute());
            }
            if (model.wasPropertyExplicitlySet("second")) {
                this.second(model.getSecond());
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

    /** The hour value. */
    @com.fasterxml.jackson.annotation.JsonProperty("hour")
    private final Integer hour;

    /**
     * The hour value.
     *
     * @return the value
     */
    public Integer getHour() {
        return hour;
    }

    /** The minute value. */
    @com.fasterxml.jackson.annotation.JsonProperty("minute")
    private final Integer minute;

    /**
     * The minute value.
     *
     * @return the value
     */
    public Integer getMinute() {
        return minute;
    }

    /** The second value. */
    @com.fasterxml.jackson.annotation.JsonProperty("second")
    private final Integer second;

    /**
     * The second value.
     *
     * @return the value
     */
    public Integer getSecond() {
        return second;
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
        sb.append("Time(");
        sb.append("super=").append(super.toString());
        sb.append("hour=").append(String.valueOf(this.hour));
        sb.append(", minute=").append(String.valueOf(this.minute));
        sb.append(", second=").append(String.valueOf(this.second));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Time)) {
            return false;
        }

        Time other = (Time) o;
        return java.util.Objects.equals(this.hour, other.hour)
                && java.util.Objects.equals(this.minute, other.minute)
                && java.util.Objects.equals(this.second, other.second)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hour == null ? 43 : this.hour.hashCode());
        result = (result * PRIME) + (this.minute == null ? 43 : this.minute.hashCode());
        result = (result * PRIME) + (this.second == null ? 43 : this.second.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
