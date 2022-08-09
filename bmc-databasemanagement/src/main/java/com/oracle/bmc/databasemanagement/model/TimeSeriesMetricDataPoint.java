/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The metric values with dimension details.
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
    builder = TimeSeriesMetricDataPoint.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeSeriesMetricDataPoint
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "value", "unit", "dimensions"})
    public TimeSeriesMetricDataPoint(
            java.util.Date timestamp,
            Double value,
            String unit,
            java.util.List<MetricDimensionDefinition> dimensions) {
        super();
        this.timestamp = timestamp;
        this.value = value;
        this.unit = unit;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date and time the metric was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the metric was created.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Double value;

        /**
         * The value of the metric.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Double value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The unit of the metric value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit of the metric value.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * The dimensions of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<MetricDimensionDefinition> dimensions;

        /**
         * The dimensions of the metric.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<MetricDimensionDefinition> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeSeriesMetricDataPoint build() {
            TimeSeriesMetricDataPoint model =
                    new TimeSeriesMetricDataPoint(
                            this.timestamp, this.value, this.unit, this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeSeriesMetricDataPoint model) {
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
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
     * The date and time the metric was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the metric was created.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Double value;

    /**
     * The value of the metric.
     * @return the value
     **/
    public Double getValue() {
        return value;
    }

    /**
     * The unit of the metric value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit of the metric value.
     * @return the value
     **/
    public String getUnit() {
        return unit;
    }

    /**
     * The dimensions of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<MetricDimensionDefinition> dimensions;

    /**
     * The dimensions of the metric.
     * @return the value
     **/
    public java.util.List<MetricDimensionDefinition> getDimensions() {
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
        sb.append("TimeSeriesMetricDataPoint(");
        sb.append("super=").append(super.toString());
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeSeriesMetricDataPoint)) {
            return false;
        }

        TimeSeriesMetricDataPoint other = (TimeSeriesMetricDataPoint) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
