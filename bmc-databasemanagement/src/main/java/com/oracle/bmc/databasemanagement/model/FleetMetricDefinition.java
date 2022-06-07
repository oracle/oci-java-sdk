/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database metric details.
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
    builder = FleetMetricDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetMetricDefinition {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "baselineValue",
        "targetValue",
        "unit",
        "timestamp",
        "percentageChange",
        "dimensions"
    })
    public FleetMetricDefinition(
            String metricName,
            Double baselineValue,
            Double targetValue,
            String unit,
            java.util.Date timestamp,
            Double percentageChange,
            java.util.List<MetricDimensionDefinition> dimensions) {
        super();
        this.metricName = metricName;
        this.baselineValue = baselineValue;
        this.targetValue = targetValue;
        this.unit = unit;
        this.timestamp = timestamp;
        this.percentageChange = percentageChange;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
        private Double baselineValue;

        public Builder baselineValue(Double baselineValue) {
            this.baselineValue = baselineValue;
            this.__explicitlySet__.add("baselineValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
        private Double targetValue;

        public Builder targetValue(Double targetValue) {
            this.targetValue = targetValue;
            this.__explicitlySet__.add("targetValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentageChange")
        private Double percentageChange;

        public Builder percentageChange(Double percentageChange) {
            this.percentageChange = percentageChange;
            this.__explicitlySet__.add("percentageChange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<MetricDimensionDefinition> dimensions;

        public Builder dimensions(java.util.List<MetricDimensionDefinition> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetMetricDefinition build() {
            FleetMetricDefinition __instance__ =
                    new FleetMetricDefinition(
                            metricName,
                            baselineValue,
                            targetValue,
                            unit,
                            timestamp,
                            percentageChange,
                            dimensions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetMetricDefinition o) {
            Builder copiedBuilder =
                    metricName(o.getMetricName())
                            .baselineValue(o.getBaselineValue())
                            .targetValue(o.getTargetValue())
                            .unit(o.getUnit())
                            .timestamp(o.getTimestamp())
                            .percentageChange(o.getPercentageChange())
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
     * The name of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    public String getMetricName() {
        return metricName;
    }

    /**
     * The baseline value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
    private final Double baselineValue;

    public Double getBaselineValue() {
        return baselineValue;
    }

    /**
     * The target value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
    private final Double targetValue;

    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * The unit of the value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    public String getUnit() {
        return unit;
    }

    /**
     * The data point date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The percentage change in the metric aggregated value compared to the baseline value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentageChange")
    private final Double percentageChange;

    public Double getPercentageChange() {
        return percentageChange;
    }

    /**
     * The dimensions of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<MetricDimensionDefinition> dimensions;

    public java.util.List<MetricDimensionDefinition> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FleetMetricDefinition(");
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", baselineValue=").append(String.valueOf(this.baselineValue));
        sb.append(", targetValue=").append(String.valueOf(this.targetValue));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", percentageChange=").append(String.valueOf(this.percentageChange));
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
        if (!(o instanceof FleetMetricDefinition)) {
            return false;
        }

        FleetMetricDefinition other = (FleetMetricDefinition) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.baselineValue, other.baselineValue)
                && java.util.Objects.equals(this.targetValue, other.targetValue)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.percentageChange, other.percentageChange)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineValue == null ? 43 : this.baselineValue.hashCode());
        result = (result * PRIME) + (this.targetValue == null ? 43 : this.targetValue.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.percentageChange == null ? 43 : this.percentageChange.hashCode());
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
