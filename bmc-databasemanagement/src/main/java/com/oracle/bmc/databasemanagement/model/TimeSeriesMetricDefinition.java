/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response object representing time series metric details
 * for a specific Managed Database at a particular time.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TimeSeriesMetricDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeSeriesMetricDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metricName", "datapoints"})
    public TimeSeriesMetricDefinition(
            String metricName, java.util.List<TimeSeriesMetricDataPoint> datapoints) {
        super();
        this.metricName = metricName;
        this.datapoints = datapoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the metric the time series data corresponds to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The name of the metric the time series data corresponds to.
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The time series metric data for the given metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
        private java.util.List<TimeSeriesMetricDataPoint> datapoints;

        /**
         * The time series metric data for the given metric.
         * @param datapoints the value to set
         * @return this builder
         **/
        public Builder datapoints(java.util.List<TimeSeriesMetricDataPoint> datapoints) {
            this.datapoints = datapoints;
            this.__explicitlySet__.add("datapoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeSeriesMetricDefinition build() {
            TimeSeriesMetricDefinition model =
                    new TimeSeriesMetricDefinition(this.metricName, this.datapoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeSeriesMetricDefinition model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("datapoints")) {
                this.datapoints(model.getDatapoints());
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
     * The name of the metric the time series data corresponds to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The name of the metric the time series data corresponds to.
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * The time series metric data for the given metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datapoints")
    private final java.util.List<TimeSeriesMetricDataPoint> datapoints;

    /**
     * The time series metric data for the given metric.
     * @return the value
     **/
    public java.util.List<TimeSeriesMetricDataPoint> getDatapoints() {
        return datapoints;
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
        sb.append("TimeSeriesMetricDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", datapoints=").append(String.valueOf(this.datapoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeSeriesMetricDefinition)) {
            return false;
        }

        TimeSeriesMetricDefinition other = (TimeSeriesMetricDefinition) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.datapoints, other.datapoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.datapoints == null ? 43 : this.datapoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
