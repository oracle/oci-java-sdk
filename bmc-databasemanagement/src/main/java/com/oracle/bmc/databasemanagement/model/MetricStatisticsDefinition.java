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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricStatisticsDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetricStatisticsDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The minimum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    Double min;

    /**
     * The maximum value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    Double max;

    /**
     * The median value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    Double median;

    /**
     * The first quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    Double lowerQuartile;

    /**
     * The third quartile value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    Double upperQuartile;

    /**
     * The unit of the metric value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    String unit;

    /**
     * The dimensions of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    java.util.List<MetricDimensionDefinition> dimensions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
