/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class MetricStatisticsDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * The minimum value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Double min;

        /**
         * The minimum value of the metric.
         * @param min the value to set
         * @return this builder
         **/
        public Builder min(Double min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }
        /**
         * The maximum value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Double max;

        /**
         * The maximum value of the metric.
         * @param max the value to set
         * @return this builder
         **/
        public Builder max(Double max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }
        /**
         * The median value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private Double median;

        /**
         * The median value of the metric.
         * @param median the value to set
         * @return this builder
         **/
        public Builder median(Double median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }
        /**
         * The first quartile value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
        private Double lowerQuartile;

        /**
         * The first quartile value of the metric.
         * @param lowerQuartile the value to set
         * @return this builder
         **/
        public Builder lowerQuartile(Double lowerQuartile) {
            this.lowerQuartile = lowerQuartile;
            this.__explicitlySet__.add("lowerQuartile");
            return this;
        }
        /**
         * The third quartile value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
        private Double upperQuartile;

        /**
         * The third quartile value of the metric.
         * @param upperQuartile the value to set
         * @return this builder
         **/
        public Builder upperQuartile(Double upperQuartile) {
            this.upperQuartile = upperQuartile;
            this.__explicitlySet__.add("upperQuartile");
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

        public MetricStatisticsDefinition build() {
            MetricStatisticsDefinition model =
                    new MetricStatisticsDefinition(
                            this.min,
                            this.max,
                            this.median,
                            this.lowerQuartile,
                            this.upperQuartile,
                            this.unit,
                            this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricStatisticsDefinition model) {
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
            }
            if (model.wasPropertyExplicitlySet("median")) {
                this.median(model.getMedian());
            }
            if (model.wasPropertyExplicitlySet("lowerQuartile")) {
                this.lowerQuartile(model.getLowerQuartile());
            }
            if (model.wasPropertyExplicitlySet("upperQuartile")) {
                this.upperQuartile(model.getUpperQuartile());
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
     * The minimum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Double min;

    /**
     * The minimum value of the metric.
     * @return the value
     **/
    public Double getMin() {
        return min;
    }

    /**
     * The maximum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Double max;

    /**
     * The maximum value of the metric.
     * @return the value
     **/
    public Double getMax() {
        return max;
    }

    /**
     * The median value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    private final Double median;

    /**
     * The median value of the metric.
     * @return the value
     **/
    public Double getMedian() {
        return median;
    }

    /**
     * The first quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    private final Double lowerQuartile;

    /**
     * The first quartile value of the metric.
     * @return the value
     **/
    public Double getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * The third quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    private final Double upperQuartile;

    /**
     * The third quartile value of the metric.
     * @return the value
     **/
    public Double getUpperQuartile() {
        return upperQuartile;
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
        sb.append("MetricStatisticsDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", median=").append(String.valueOf(this.median));
        sb.append(", lowerQuartile=").append(String.valueOf(this.lowerQuartile));
        sb.append(", upperQuartile=").append(String.valueOf(this.upperQuartile));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
