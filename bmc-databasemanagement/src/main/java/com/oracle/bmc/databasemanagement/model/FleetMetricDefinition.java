/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetMetricDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FleetMetricDefinition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The name of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    String metricName;

    /**
     * The baseline value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
    Double baselineValue;

    /**
     * The target value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
    Double targetValue;

    /**
     * The unit of the value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    String unit;

    /**
     * The data point date and time in UTC in ISO-8601 format, which is \"yyyy-MM-dd'T'hh:mm:ss.sss'Z'\".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    /**
     * The percentage change in the metric aggregated value compared to the baseline value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentageChange")
    Double percentageChange;

    /**
     * The dimensions of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    java.util.List<MetricDimensionDefinition> dimensions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
