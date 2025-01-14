/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocicontrolcenter.model;

/**
 * The recorded metric value at a specific timestamp. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230515")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SummarizedMetricData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SummarizedMetricData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sampleTime",
        "resolution",
        "dimensions",
        "aggregationMethod",
        "aggregatedValue"
    })
    public SummarizedMetricData(
            java.util.Date sampleTime,
            String resolution,
            java.util.Map<String, DimensionValue> dimensions,
            String aggregationMethod,
            Float aggregatedValue) {
        super();
        this.sampleTime = sampleTime;
        this.resolution = resolution;
        this.dimensions = dimensions;
        this.aggregationMethod = aggregationMethod;
        this.aggregatedValue = aggregatedValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The time at which the metric data was recorded. */
        @com.fasterxml.jackson.annotation.JsonProperty("sampleTime")
        private java.util.Date sampleTime;

        /**
         * The time at which the metric data was recorded.
         *
         * @param sampleTime the value to set
         * @return this builder
         */
        public Builder sampleTime(java.util.Date sampleTime) {
            this.sampleTime = sampleTime;
            this.__explicitlySet__.add("sampleTime");
            return this;
        }
        /**
         * The duration over which the metric data is aggregated. Supported values: {@code
         * 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        /**
         * The duration over which the metric data is aggregated. Supported values: {@code
         * 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         *
         * @param resolution the value to set
         * @return this builder
         */
        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }
        /**
         * Qualifiers provided in the definition of the returned metric. Available dimensions vary
         * by metric namespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, DimensionValue> dimensions;

        /**
         * Qualifiers provided in the definition of the returned metric. Available dimensions vary
         * by metric namespace.
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, DimensionValue> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The aggregation method used for aggregating the metric values. The aggregation method
         * depends on the metric itself.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationMethod")
        private String aggregationMethod;

        /**
         * The aggregation method used for aggregating the metric values. The aggregation method
         * depends on the metric itself.
         *
         * @param aggregationMethod the value to set
         * @return this builder
         */
        public Builder aggregationMethod(String aggregationMethod) {
            this.aggregationMethod = aggregationMethod;
            this.__explicitlySet__.add("aggregationMethod");
            return this;
        }
        /** The aggregated metric value for the specified request. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedValue")
        private Float aggregatedValue;

        /**
         * The aggregated metric value for the specified request.
         *
         * @param aggregatedValue the value to set
         * @return this builder
         */
        public Builder aggregatedValue(Float aggregatedValue) {
            this.aggregatedValue = aggregatedValue;
            this.__explicitlySet__.add("aggregatedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizedMetricData build() {
            SummarizedMetricData model =
                    new SummarizedMetricData(
                            this.sampleTime,
                            this.resolution,
                            this.dimensions,
                            this.aggregationMethod,
                            this.aggregatedValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizedMetricData model) {
            if (model.wasPropertyExplicitlySet("sampleTime")) {
                this.sampleTime(model.getSampleTime());
            }
            if (model.wasPropertyExplicitlySet("resolution")) {
                this.resolution(model.getResolution());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("aggregationMethod")) {
                this.aggregationMethod(model.getAggregationMethod());
            }
            if (model.wasPropertyExplicitlySet("aggregatedValue")) {
                this.aggregatedValue(model.getAggregatedValue());
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

    /** The time at which the metric data was recorded. */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleTime")
    private final java.util.Date sampleTime;

    /**
     * The time at which the metric data was recorded.
     *
     * @return the value
     */
    public java.util.Date getSampleTime() {
        return sampleTime;
    }

    /**
     * The duration over which the metric data is aggregated. Supported values: {@code 1m}-{@code
     * 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

    /**
     * The duration over which the metric data is aggregated. Supported values: {@code 1m}-{@code
     * 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
     *
     * @return the value
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Qualifiers provided in the definition of the returned metric. Available dimensions vary by
     * metric namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, DimensionValue> dimensions;

    /**
     * Qualifiers provided in the definition of the returned metric. Available dimensions vary by
     * metric namespace.
     *
     * @return the value
     */
    public java.util.Map<String, DimensionValue> getDimensions() {
        return dimensions;
    }

    /**
     * The aggregation method used for aggregating the metric values. The aggregation method depends
     * on the metric itself.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationMethod")
    private final String aggregationMethod;

    /**
     * The aggregation method used for aggregating the metric values. The aggregation method depends
     * on the metric itself.
     *
     * @return the value
     */
    public String getAggregationMethod() {
        return aggregationMethod;
    }

    /** The aggregated metric value for the specified request. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedValue")
    private final Float aggregatedValue;

    /**
     * The aggregated metric value for the specified request.
     *
     * @return the value
     */
    public Float getAggregatedValue() {
        return aggregatedValue;
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
        sb.append("SummarizedMetricData(");
        sb.append("super=").append(super.toString());
        sb.append("sampleTime=").append(String.valueOf(this.sampleTime));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", aggregationMethod=").append(String.valueOf(this.aggregationMethod));
        sb.append(", aggregatedValue=").append(String.valueOf(this.aggregatedValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizedMetricData)) {
            return false;
        }

        SummarizedMetricData other = (SummarizedMetricData) o;
        return java.util.Objects.equals(this.sampleTime, other.sampleTime)
                && java.util.Objects.equals(this.resolution, other.resolution)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.aggregationMethod, other.aggregationMethod)
                && java.util.Objects.equals(this.aggregatedValue, other.aggregatedValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sampleTime == null ? 43 : this.sampleTime.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationMethod == null ? 43 : this.aggregationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedValue == null ? 43 : this.aggregatedValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
