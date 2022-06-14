/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the fleet metrics, which provides the metric aggregated value of the databases in the fleet.
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
    builder = FleetMetricSummaryDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetMetricSummaryDefinition {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "baselineValue",
        "targetValue",
        "unit",
        "percentageChange",
        "dimensions"
    })
    public FleetMetricSummaryDefinition(
            String metricName,
            Double baselineValue,
            Double targetValue,
            String unit,
            Double percentageChange,
            java.util.List<MetricDimensionDefinition> dimensions) {
        super();
        this.metricName = metricName;
        this.baselineValue = baselineValue;
        this.targetValue = targetValue;
        this.unit = unit;
        this.percentageChange = percentageChange;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The name of the metric.
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The metric aggregated value at the baseline date and time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
        private Double baselineValue;

        /**
         * The metric aggregated value at the baseline date and time.
         * @param baselineValue the value to set
         * @return this builder
         **/
        public Builder baselineValue(Double baselineValue) {
            this.baselineValue = baselineValue;
            this.__explicitlySet__.add("baselineValue");
            return this;
        }
        /**
         * The metric aggregated value at the target date and time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
        private Double targetValue;

        /**
         * The metric aggregated value at the target date and time.
         * @param targetValue the value to set
         * @return this builder
         **/
        public Builder targetValue(Double targetValue) {
            this.targetValue = targetValue;
            this.__explicitlySet__.add("targetValue");
            return this;
        }
        /**
         * The unit of the value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit of the value.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * The percentage change in the metric aggregated value compared to the baseline value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentageChange")
        private Double percentageChange;

        /**
         * The percentage change in the metric aggregated value compared to the baseline value.
         * @param percentageChange the value to set
         * @return this builder
         **/
        public Builder percentageChange(Double percentageChange) {
            this.percentageChange = percentageChange;
            this.__explicitlySet__.add("percentageChange");
            return this;
        }
        /**
         * The unique dimension key and values of the baseline metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<MetricDimensionDefinition> dimensions;

        /**
         * The unique dimension key and values of the baseline metric.
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

        public FleetMetricSummaryDefinition build() {
            FleetMetricSummaryDefinition __instance__ =
                    new FleetMetricSummaryDefinition(
                            metricName,
                            baselineValue,
                            targetValue,
                            unit,
                            percentageChange,
                            dimensions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetMetricSummaryDefinition o) {
            Builder copiedBuilder =
                    metricName(o.getMetricName())
                            .baselineValue(o.getBaselineValue())
                            .targetValue(o.getTargetValue())
                            .unit(o.getUnit())
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

    /**
     * The name of the metric.
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * The metric aggregated value at the baseline date and time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
    private final Double baselineValue;

    /**
     * The metric aggregated value at the baseline date and time.
     * @return the value
     **/
    public Double getBaselineValue() {
        return baselineValue;
    }

    /**
     * The metric aggregated value at the target date and time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
    private final Double targetValue;

    /**
     * The metric aggregated value at the target date and time.
     * @return the value
     **/
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * The unit of the value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit of the value.
     * @return the value
     **/
    public String getUnit() {
        return unit;
    }

    /**
     * The percentage change in the metric aggregated value compared to the baseline value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentageChange")
    private final Double percentageChange;

    /**
     * The percentage change in the metric aggregated value compared to the baseline value.
     * @return the value
     **/
    public Double getPercentageChange() {
        return percentageChange;
    }

    /**
     * The unique dimension key and values of the baseline metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<MetricDimensionDefinition> dimensions;

    /**
     * The unique dimension key and values of the baseline metric.
     * @return the value
     **/
    public java.util.List<MetricDimensionDefinition> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FleetMetricSummaryDefinition(");
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", baselineValue=").append(String.valueOf(this.baselineValue));
        sb.append(", targetValue=").append(String.valueOf(this.targetValue));
        sb.append(", unit=").append(String.valueOf(this.unit));
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
        if (!(o instanceof FleetMetricSummaryDefinition)) {
            return false;
        }

        FleetMetricSummaryDefinition other = (FleetMetricSummaryDefinition) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.baselineValue, other.baselineValue)
                && java.util.Objects.equals(this.targetValue, other.targetValue)
                && java.util.Objects.equals(this.unit, other.unit)
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
