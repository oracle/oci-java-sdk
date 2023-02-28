/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Time filters to be applied in the data object query. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataObjectQueryTimeFilters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataObjectQueryTimeFilters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timePeriod", "timeStart", "timeEnd"})
    public DataObjectQueryTimeFilters(
            String timePeriod, java.util.Date timeStart, java.util.Date timeEnd) {
        super();
        this.timePeriod = timePeriod;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specify time period in ISO 8601 format with respect to current time. Default is last 30
         * days represented by P30D. If timePeriod is specified, then timeStart and timeEnd will be
         * ignored. Examples: P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y
         * (last 12 months).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timePeriod")
        private String timePeriod;

        /**
         * Specify time period in ISO 8601 format with respect to current time. Default is last 30
         * days represented by P30D. If timePeriod is specified, then timeStart and timeEnd will be
         * ignored. Examples: P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y
         * (last 12 months).
         *
         * @param timePeriod the value to set
         * @return this builder
         */
        public Builder timePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
            this.__explicitlySet__.add("timePeriod");
            return this;
        }
        /**
         * Start time in UTC in RFC3339 formatted datetime string. Example:
         * 2021-10-30T00:00:00.000Z. timeStart and timeEnd are used together. If timePeriod is
         * specified, this parameter is ignored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Start time in UTC in RFC3339 formatted datetime string. Example:
         * 2021-10-30T00:00:00.000Z. timeStart and timeEnd are used together. If timePeriod is
         * specified, this parameter is ignored.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * End time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
         * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
         * ignored. If timeEnd is not specified, current time is used as timeEnd.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * End time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
         * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
         * ignored. If timeEnd is not specified, current time is used as timeEnd.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataObjectQueryTimeFilters build() {
            DataObjectQueryTimeFilters model =
                    new DataObjectQueryTimeFilters(this.timePeriod, this.timeStart, this.timeEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectQueryTimeFilters model) {
            if (model.wasPropertyExplicitlySet("timePeriod")) {
                this.timePeriod(model.getTimePeriod());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
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

    /**
     * Specify time period in ISO 8601 format with respect to current time. Default is last 30 days
     * represented by P30D. If timePeriod is specified, then timeStart and timeEnd will be ignored.
     * Examples: P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timePeriod")
    private final String timePeriod;

    /**
     * Specify time period in ISO 8601 format with respect to current time. Default is last 30 days
     * represented by P30D. If timePeriod is specified, then timeStart and timeEnd will be ignored.
     * Examples: P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months).
     *
     * @return the value
     */
    public String getTimePeriod() {
        return timePeriod;
    }

    /**
     * Start time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
     * ignored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Start time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
     * ignored.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * End time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
     * ignored. If timeEnd is not specified, current time is used as timeEnd.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * End time in UTC in RFC3339 formatted datetime string. Example: 2021-10-30T00:00:00.000Z.
     * timeStart and timeEnd are used together. If timePeriod is specified, this parameter is
     * ignored. If timeEnd is not specified, current time is used as timeEnd.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
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
        sb.append("DataObjectQueryTimeFilters(");
        sb.append("super=").append(super.toString());
        sb.append("timePeriod=").append(String.valueOf(this.timePeriod));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectQueryTimeFilters)) {
            return false;
        }

        DataObjectQueryTimeFilters other = (DataObjectQueryTimeFilters) o;
        return java.util.Objects.equals(this.timePeriod, other.timePeriod)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timePeriod == null ? 43 : this.timePeriod.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
