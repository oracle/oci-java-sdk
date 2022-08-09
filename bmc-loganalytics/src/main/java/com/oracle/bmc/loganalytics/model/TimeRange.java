/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Specify time range. This paramter can be overwritten if time criteria is specified in the query string. If no time criteria are found in query string this time range is used.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TimeRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeRange extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStart", "timeEnd", "timeZone"})
    public TimeRange(java.util.Date timeStart, java.util.Date timeEnd, String timeZone) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.timeZone = timeZone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Time for query to start matching results from. Start time must be less than end time otherwise it will result in error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Time for query to start matching results from. Start time must be less than end time otherwise it will result in error.
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Time for query to stop matching results to. End Time must be greater than or equal to start time otherwise it will result in error.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Time for query to stop matching results to. End Time must be greater than or equal to start time otherwise it will result in error.
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Time zone for query.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * Time zone for query.
         *
         * @param timeZone the value to set
         * @return this builder
         **/
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeRange build() {
            TimeRange model = new TimeRange(this.timeStart, this.timeEnd, this.timeZone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeRange model) {
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
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
     * Time for query to start matching results from. Start time must be less than end time otherwise it will result in error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Time for query to start matching results from. Start time must be less than end time otherwise it will result in error.
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Time for query to stop matching results to. End Time must be greater than or equal to start time otherwise it will result in error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Time for query to stop matching results to. End Time must be greater than or equal to start time otherwise it will result in error.
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Time zone for query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * Time zone for query.
     *
     * @return the value
     **/
    public String getTimeZone() {
        return timeZone;
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
        sb.append("TimeRange(");
        sb.append("super=").append(super.toString());
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeRange)) {
            return false;
        }

        TimeRange other = (TimeRange) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
