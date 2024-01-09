/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of aggregated metrics for the Managed MySQL Databases in the fleet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlFleetMetricDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlFleetMetricDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricValue",
        "metricName",
        "timestamp",
        "dimensions",
        "unit"
    })
    public MySqlFleetMetricDefinition(
            Integer metricValue,
            String metricName,
            java.util.Date timestamp,
            java.util.List<MetricDimensionDefinition> dimensions,
            String unit) {
        super();
        this.metricValue = metricValue;
        this.metricName = metricName;
        this.timestamp = timestamp;
        this.dimensions = dimensions;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The value of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricValue")
        private Integer metricValue;

        /**
         * The value of the metric.
         *
         * @param metricValue the value to set
         * @return this builder
         */
        public Builder metricValue(Integer metricValue) {
            this.metricValue = metricValue;
            this.__explicitlySet__.add("metricValue");
            return this;
        }
        /** The name of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The name of the metric.
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /** The data point date and time in UTC in ISO-8601 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The data point date and time in UTC in ISO-8601 format.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** The dimensions of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<MetricDimensionDefinition> dimensions;

        /**
         * The dimensions of the metric.
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.List<MetricDimensionDefinition> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /** The unit of the metric value. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The unit of the metric value.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlFleetMetricDefinition build() {
            MySqlFleetMetricDefinition model =
                    new MySqlFleetMetricDefinition(
                            this.metricValue,
                            this.metricName,
                            this.timestamp,
                            this.dimensions,
                            this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlFleetMetricDefinition model) {
            if (model.wasPropertyExplicitlySet("metricValue")) {
                this.metricValue(model.getMetricValue());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The value of the metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricValue")
    private final Integer metricValue;

    /**
     * The value of the metric.
     *
     * @return the value
     */
    public Integer getMetricValue() {
        return metricValue;
    }

    /** The name of the metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The name of the metric.
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /** The data point date and time in UTC in ISO-8601 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The data point date and time in UTC in ISO-8601 format.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** The dimensions of the metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<MetricDimensionDefinition> dimensions;

    /**
     * The dimensions of the metric.
     *
     * @return the value
     */
    public java.util.List<MetricDimensionDefinition> getDimensions() {
        return dimensions;
    }

    /** The unit of the metric value. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The unit of the metric value.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MySqlFleetMetricDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("metricValue=").append(String.valueOf(this.metricValue));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlFleetMetricDefinition)) {
            return false;
        }

        MySqlFleetMetricDefinition other = (MySqlFleetMetricDefinition) o;
        return java.util.Objects.equals(this.metricValue, other.metricValue)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricValue == null ? 43 : this.metricValue.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
