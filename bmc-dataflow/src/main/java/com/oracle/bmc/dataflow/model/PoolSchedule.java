/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * Definition of when pool auto start or stop for a given day of a week. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PoolSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PoolSchedule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dayOfWeek", "startTime", "stopTime"})
    public PoolSchedule(DayOfWeek dayOfWeek, Integer startTime, Integer stopTime) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Day of the week SUN-SAT */
        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        /**
         * Day of the week SUN-SAT
         *
         * @param dayOfWeek the value to set
         * @return this builder
         */
        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /** Hour of the day to start or stop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private Integer startTime;

        /**
         * Hour of the day to start or stop pool.
         *
         * @param startTime the value to set
         * @return this builder
         */
        public Builder startTime(Integer startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /** Hour of the day to stop the pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("stopTime")
        private Integer stopTime;

        /**
         * Hour of the day to stop the pool.
         *
         * @param stopTime the value to set
         * @return this builder
         */
        public Builder stopTime(Integer stopTime) {
            this.stopTime = stopTime;
            this.__explicitlySet__.add("stopTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PoolSchedule build() {
            PoolSchedule model = new PoolSchedule(this.dayOfWeek, this.startTime, this.stopTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PoolSchedule model) {
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("stopTime")) {
                this.stopTime(model.getStopTime());
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

    /** Day of the week SUN-SAT */
    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    /**
     * Day of the week SUN-SAT
     *
     * @return the value
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /** Hour of the day to start or stop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final Integer startTime;

    /**
     * Hour of the day to start or stop pool.
     *
     * @return the value
     */
    public Integer getStartTime() {
        return startTime;
    }

    /** Hour of the day to stop the pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("stopTime")
    private final Integer stopTime;

    /**
     * Hour of the day to stop the pool.
     *
     * @return the value
     */
    public Integer getStopTime() {
        return stopTime;
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
        sb.append("PoolSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", stopTime=").append(String.valueOf(this.stopTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PoolSchedule)) {
            return false;
        }

        PoolSchedule other = (PoolSchedule) o;
        return java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.stopTime, other.stopTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.stopTime == null ? 43 : this.stopTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
