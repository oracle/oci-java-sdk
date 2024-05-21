/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class FleetMetricDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
         * The baseline value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
        private Double baselineValue;

        /**
         * The baseline value of the metric.
         * @param baselineValue the value to set
         * @return this builder
         **/
        public Builder baselineValue(Double baselineValue) {
            this.baselineValue = baselineValue;
            this.__explicitlySet__.add("baselineValue");
            return this;
        }
        /**
         * The target value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
        private Double targetValue;

        /**
         * The target value of the metric.
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
         * The data point date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The data point date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
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

        public FleetMetricDefinition build() {
            FleetMetricDefinition model =
                    new FleetMetricDefinition(
                            this.metricName,
                            this.baselineValue,
                            this.targetValue,
                            this.unit,
                            this.timestamp,
                            this.percentageChange,
                            this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetMetricDefinition model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("baselineValue")) {
                this.baselineValue(model.getBaselineValue());
            }
            if (model.wasPropertyExplicitlySet("targetValue")) {
                this.targetValue(model.getTargetValue());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("percentageChange")) {
                this.percentageChange(model.getPercentageChange());
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
     * The baseline value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineValue")
    private final Double baselineValue;

    /**
     * The baseline value of the metric.
     * @return the value
     **/
    public Double getBaselineValue() {
        return baselineValue;
    }

    /**
     * The target value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetValue")
    private final Double targetValue;

    /**
     * The target value of the metric.
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
     * The data point date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The data point date and time in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("FleetMetricDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", baselineValue=").append(String.valueOf(this.baselineValue));
        sb.append(", targetValue=").append(String.valueOf(this.targetValue));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", percentageChange=").append(String.valueOf(this.percentageChange));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
