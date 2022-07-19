/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of alerts aggregation items.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AlertAggregationItems.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AlertAggregationItems {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "timeStarted",
        "timeEnded",
        "count",
        "dimensions"
    })
    public AlertAggregationItems(
            String metricName,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Long count,
            AlertsAggregationDimension dimensions) {
        super();
        this.metricName = metricName;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.count = count;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the aggregation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The name of the aggregation.
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The time at which the aggregation started.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time at which the aggregation started.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time at which the aggregation ended.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time at which the aggregation ended.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Total count of aggregated values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Long count;

        /**
         * Total count of aggregated values.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Long count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private AlertsAggregationDimension dimensions;

        public Builder dimensions(AlertsAggregationDimension dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlertAggregationItems build() {
            AlertAggregationItems __instance__ =
                    new AlertAggregationItems(
                            metricName, timeStarted, timeEnded, count, dimensions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlertAggregationItems o) {
            Builder copiedBuilder =
                    metricName(o.getMetricName())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .count(o.getCount())
                            .dimensions(o.getDimensions());

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

    /**
     * The name of the aggregation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The name of the aggregation.
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * The time at which the aggregation started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time at which the aggregation started.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time at which the aggregation ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time at which the aggregation ended.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Total count of aggregated values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Long count;

    /**
     * Total count of aggregated values.
     * @return the value
     **/
    public Long getCount() {
        return count;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final AlertsAggregationDimension dimensions;

    public AlertsAggregationDimension getDimensions() {
        return dimensions;
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
        sb.append("AlertAggregationItems(");
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlertAggregationItems)) {
            return false;
        }

        AlertAggregationItems other = (AlertAggregationItems) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
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
