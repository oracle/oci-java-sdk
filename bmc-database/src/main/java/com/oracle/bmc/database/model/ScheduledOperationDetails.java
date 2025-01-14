/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of scheduled operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduledOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduledOperationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** auto start time. value must be of ISO-8601 format "HH:mm" */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledStartTime")
        private String scheduledStartTime;

        /**
         * auto start time. value must be of ISO-8601 format "HH:mm"
         *
         * @param scheduledStartTime the value to set
         * @return this builder
         */
        public Builder scheduledStartTime(String scheduledStartTime) {
            this.scheduledStartTime = scheduledStartTime;
            this.__explicitlySet__.add("scheduledStartTime");
            return this;
        }
        /** auto stop time. value must be of ISO-8601 format "HH:mm" */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledStopTime")
        private String scheduledStopTime;

        /**
         * auto stop time. value must be of ISO-8601 format "HH:mm"
         *
         * @param scheduledStopTime the value to set
         * @return this builder
         */
        public Builder scheduledStopTime(String scheduledStopTime) {
            this.scheduledStopTime = scheduledStopTime;
            this.__explicitlySet__.add("scheduledStopTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledOperationDetails build() {
            ScheduledOperationDetails model =
                    new ScheduledOperationDetails(
                            this.dayOfWeek, this.scheduledStartTime, this.scheduledStopTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledOperationDetails model) {
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("scheduledStartTime")) {
                this.scheduledStartTime(model.getScheduledStartTime());
            }
            if (model.wasPropertyExplicitlySet("scheduledStopTime")) {
                this.scheduledStopTime(model.getScheduledStopTime());
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

    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /** auto start time. value must be of ISO-8601 format "HH:mm" */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledStartTime")
    private final String scheduledStartTime;

    /**
     * auto start time. value must be of ISO-8601 format "HH:mm"
     *
     * @return the value
     */
    public String getScheduledStartTime() {
        return scheduledStartTime;
    }

    /** auto stop time. value must be of ISO-8601 format "HH:mm" */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledStopTime")
    private final String scheduledStopTime;

    /**
     * auto stop time. value must be of ISO-8601 format "HH:mm"
     *
     * @return the value
     */
    public String getScheduledStopTime() {
        return scheduledStopTime;
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
        sb.append("ScheduledOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", scheduledStartTime=").append(String.valueOf(this.scheduledStartTime));
        sb.append(", scheduledStopTime=").append(String.valueOf(this.scheduledStopTime));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
