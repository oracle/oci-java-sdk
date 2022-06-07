/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The metric statistics values with dimension details.
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
    builder = MetricStatisticsDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricStatisticsDefinition {
    @Deprecated
    @java.beans.ConstructorProperties({
        "min",
        "max",
        "median",
        "lowerQuartile",
        "upperQuartile",
        "unit",
        "dimensions"
    })
    public MetricStatisticsDefinition(
            Double min,
            Double max,
            Double median,
            Double lowerQuartile,
            Double upperQuartile,
            String unit,
            java.util.List<MetricDimensionDefinition> dimensions) {
        super();
        this.min = min;
        this.max = max;
        this.median = median;
        this.lowerQuartile = lowerQuartile;
        this.upperQuartile = upperQuartile;
        this.unit = unit;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Double min;

        public Builder min(Double min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Double max;

        public Builder max(Double max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private Double median;

        public Builder median(Double median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
        private Double lowerQuartile;

        public Builder lowerQuartile(Double lowerQuartile) {
            this.lowerQuartile = lowerQuartile;
            this.__explicitlySet__.add("lowerQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
        private Double upperQuartile;

        public Builder upperQuartile(Double upperQuartile) {
            this.upperQuartile = upperQuartile;
            this.__explicitlySet__.add("upperQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
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

        public MetricStatisticsDefinition build() {
            MetricStatisticsDefinition __instance__ =
                    new MetricStatisticsDefinition(
                            min, max, median, lowerQuartile, upperQuartile, unit, dimensions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricStatisticsDefinition o) {
            Builder copiedBuilder =
                    min(o.getMin())
                            .max(o.getMax())
                            .median(o.getMedian())
                            .lowerQuartile(o.getLowerQuartile())
                            .upperQuartile(o.getUpperQuartile())
                            .unit(o.getUnit())
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
     * The minimum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Double min;

    public Double getMin() {
        return min;
    }

    /**
     * The maximum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Double max;

    public Double getMax() {
        return max;
    }

    /**
     * The median value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    private final Double median;

    public Double getMedian() {
        return median;
    }

    /**
     * The first quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    private final Double lowerQuartile;

    public Double getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * The third quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    private final Double upperQuartile;

    public Double getUpperQuartile() {
        return upperQuartile;
    }

    /**
     * The unit of the metric value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    public String getUnit() {
        return unit;
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
        sb.append("MetricStatisticsDefinition(");
        sb.append("min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", median=").append(String.valueOf(this.median));
        sb.append(", lowerQuartile=").append(String.valueOf(this.lowerQuartile));
        sb.append(", upperQuartile=").append(String.valueOf(this.upperQuartile));
        sb.append(", unit=").append(String.valueOf(this.unit));
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
        if (!(o instanceof MetricStatisticsDefinition)) {
            return false;
        }

        MetricStatisticsDefinition other = (MetricStatisticsDefinition) o;
        return java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.median, other.median)
                && java.util.Objects.equals(this.lowerQuartile, other.lowerQuartile)
                && java.util.Objects.equals(this.upperQuartile, other.upperQuartile)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result = (result * PRIME) + (this.median == null ? 43 : this.median.hashCode());
        result =
                (result * PRIME)
                        + (this.lowerQuartile == null ? 43 : this.lowerQuartile.hashCode());
        result =
                (result * PRIME)
                        + (this.upperQuartile == null ? 43 : this.upperQuartile.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
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
