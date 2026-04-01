/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * A generic object to show date and time in the below specified format
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DateAndTime.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DateAndTime extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"date", "time"})
    public DateAndTime(String date, String time) {
        super();
        this.date = date;
        this.time = time;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly date.
         * Example: {@code 2025-04-25}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("date")
        private String date;

        /**
         * A user-friendly date.
         * Example: {@code 2025-04-25}
         *
         * @param date the value to set
         * @return this builder
         **/
        public Builder date(String date) {
            this.date = date;
            this.__explicitlySet__.add("date");
            return this;
        }
        /**
         * A user-friendly time. The format is 'HH:MM', 'HH:MM' represents the time in UTC.
         * Example: {@code 22:00}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private String time;

        /**
         * A user-friendly time. The format is 'HH:MM', 'HH:MM' represents the time in UTC.
         * Example: {@code 22:00}
         *
         * @param time the value to set
         * @return this builder
         **/
        public Builder time(String time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DateAndTime build() {
            DateAndTime model = new DateAndTime(this.date, this.time);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DateAndTime model) {
            if (model.wasPropertyExplicitlySet("date")) {
                this.date(model.getDate());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
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
     * A user-friendly date.
     * Example: {@code 2025-04-25}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    private final String date;

    /**
     * A user-friendly date.
     * Example: {@code 2025-04-25}
     *
     * @return the value
     **/
    public String getDate() {
        return date;
    }

    /**
     * A user-friendly time. The format is 'HH:MM', 'HH:MM' represents the time in UTC.
     * Example: {@code 22:00}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final String time;

    /**
     * A user-friendly time. The format is 'HH:MM', 'HH:MM' represents the time in UTC.
     * Example: {@code 22:00}
     *
     * @return the value
     **/
    public String getTime() {
        return time;
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
        sb.append("DateAndTime(");
        sb.append("super=").append(super.toString());
        sb.append("date=").append(String.valueOf(this.date));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DateAndTime)) {
            return false;
        }

        DateAndTime other = (DateAndTime) o;
        return java.util.Objects.equals(this.date, other.date)
                && java.util.Objects.equals(this.time, other.time)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.date == null ? 43 : this.date.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
