/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The set of aggregated data returned for a metric.
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
    builder = MetricsAggregationRange.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricsAggregationRange
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "header",
        "metrics",
        "rangeStartTimeInEpochSeconds",
        "rangeEndTimeInEpochSeconds"
    })
    public MetricsAggregationRange(
            DbManagementAnalyticsMetric header,
            java.util.List<DbManagementAnalyticsMetric> metrics,
            Long rangeStartTimeInEpochSeconds,
            Long rangeEndTimeInEpochSeconds) {
        super();
        this.header = header;
        this.metrics = metrics;
        this.rangeStartTimeInEpochSeconds = rangeStartTimeInEpochSeconds;
        this.rangeEndTimeInEpochSeconds = rangeEndTimeInEpochSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private DbManagementAnalyticsMetric header;

        public Builder header(DbManagementAnalyticsMetric header) {
            this.header = header;
            this.__explicitlySet__.add("header");
            return this;
        }
        /**
         * The list of metrics returned for the specified request. Each of the metrics
         * has a {@code metricName} and additional properties like {@code metadata}, {@code dimensions}.
         * If a property is not set, then use the value from {@code header}.
         * <p>
         * Suppose {@code m} be an item in the {@code metrics} array:
         * - If {@code m.metricName} is not set, use {@code header.metricName} instead
         * - If {@code m.durationInSeconds} is not set, use {@code header.durationInSeconds} instead
         * - If {@code m.dimensions} is not set, use {@code header.dimensions} instead
         * - If {@code m.metadata} is not set, use {@code header.metadata} instead
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<DbManagementAnalyticsMetric> metrics;

        /**
         * The list of metrics returned for the specified request. Each of the metrics
         * has a {@code metricName} and additional properties like {@code metadata}, {@code dimensions}.
         * If a property is not set, then use the value from {@code header}.
         * <p>
         * Suppose {@code m} be an item in the {@code metrics} array:
         * - If {@code m.metricName} is not set, use {@code header.metricName} instead
         * - If {@code m.durationInSeconds} is not set, use {@code header.durationInSeconds} instead
         * - If {@code m.dimensions} is not set, use {@code header.dimensions} instead
         * - If {@code m.metadata} is not set, use {@code header.metadata} instead
         *
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<DbManagementAnalyticsMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /**
         * The beginning of the time range (inclusive) of the returned metric data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rangeStartTimeInEpochSeconds")
        private Long rangeStartTimeInEpochSeconds;

        /**
         * The beginning of the time range (inclusive) of the returned metric data.
         * @param rangeStartTimeInEpochSeconds the value to set
         * @return this builder
         **/
        public Builder rangeStartTimeInEpochSeconds(Long rangeStartTimeInEpochSeconds) {
            this.rangeStartTimeInEpochSeconds = rangeStartTimeInEpochSeconds;
            this.__explicitlySet__.add("rangeStartTimeInEpochSeconds");
            return this;
        }
        /**
         * The end of the time range (exclusive) of the returned metric data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rangeEndTimeInEpochSeconds")
        private Long rangeEndTimeInEpochSeconds;

        /**
         * The end of the time range (exclusive) of the returned metric data.
         * @param rangeEndTimeInEpochSeconds the value to set
         * @return this builder
         **/
        public Builder rangeEndTimeInEpochSeconds(Long rangeEndTimeInEpochSeconds) {
            this.rangeEndTimeInEpochSeconds = rangeEndTimeInEpochSeconds;
            this.__explicitlySet__.add("rangeEndTimeInEpochSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricsAggregationRange build() {
            MetricsAggregationRange model =
                    new MetricsAggregationRange(
                            this.header,
                            this.metrics,
                            this.rangeStartTimeInEpochSeconds,
                            this.rangeEndTimeInEpochSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricsAggregationRange model) {
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("rangeStartTimeInEpochSeconds")) {
                this.rangeStartTimeInEpochSeconds(model.getRangeStartTimeInEpochSeconds());
            }
            if (model.wasPropertyExplicitlySet("rangeEndTimeInEpochSeconds")) {
                this.rangeEndTimeInEpochSeconds(model.getRangeEndTimeInEpochSeconds());
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

    @com.fasterxml.jackson.annotation.JsonProperty("header")
    private final DbManagementAnalyticsMetric header;

    public DbManagementAnalyticsMetric getHeader() {
        return header;
    }

    /**
     * The list of metrics returned for the specified request. Each of the metrics
     * has a {@code metricName} and additional properties like {@code metadata}, {@code dimensions}.
     * If a property is not set, then use the value from {@code header}.
     * <p>
     * Suppose {@code m} be an item in the {@code metrics} array:
     * - If {@code m.metricName} is not set, use {@code header.metricName} instead
     * - If {@code m.durationInSeconds} is not set, use {@code header.durationInSeconds} instead
     * - If {@code m.dimensions} is not set, use {@code header.dimensions} instead
     * - If {@code m.metadata} is not set, use {@code header.metadata} instead
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<DbManagementAnalyticsMetric> metrics;

    /**
     * The list of metrics returned for the specified request. Each of the metrics
     * has a {@code metricName} and additional properties like {@code metadata}, {@code dimensions}.
     * If a property is not set, then use the value from {@code header}.
     * <p>
     * Suppose {@code m} be an item in the {@code metrics} array:
     * - If {@code m.metricName} is not set, use {@code header.metricName} instead
     * - If {@code m.durationInSeconds} is not set, use {@code header.durationInSeconds} instead
     * - If {@code m.dimensions} is not set, use {@code header.dimensions} instead
     * - If {@code m.metadata} is not set, use {@code header.metadata} instead
     *
     * @return the value
     **/
    public java.util.List<DbManagementAnalyticsMetric> getMetrics() {
        return metrics;
    }

    /**
     * The beginning of the time range (inclusive) of the returned metric data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStartTimeInEpochSeconds")
    private final Long rangeStartTimeInEpochSeconds;

    /**
     * The beginning of the time range (inclusive) of the returned metric data.
     * @return the value
     **/
    public Long getRangeStartTimeInEpochSeconds() {
        return rangeStartTimeInEpochSeconds;
    }

    /**
     * The end of the time range (exclusive) of the returned metric data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEndTimeInEpochSeconds")
    private final Long rangeEndTimeInEpochSeconds;

    /**
     * The end of the time range (exclusive) of the returned metric data.
     * @return the value
     **/
    public Long getRangeEndTimeInEpochSeconds() {
        return rangeEndTimeInEpochSeconds;
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
        sb.append("MetricsAggregationRange(");
        sb.append("super=").append(super.toString());
        sb.append("header=").append(String.valueOf(this.header));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", rangeStartTimeInEpochSeconds=")
                .append(String.valueOf(this.rangeStartTimeInEpochSeconds));
        sb.append(", rangeEndTimeInEpochSeconds=")
                .append(String.valueOf(this.rangeEndTimeInEpochSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricsAggregationRange)) {
            return false;
        }

        MetricsAggregationRange other = (MetricsAggregationRange) o;
        return java.util.Objects.equals(this.header, other.header)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(
                        this.rangeStartTimeInEpochSeconds, other.rangeStartTimeInEpochSeconds)
                && java.util.Objects.equals(
                        this.rangeEndTimeInEpochSeconds, other.rangeEndTimeInEpochSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.header == null ? 43 : this.header.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result =
                (result * PRIME)
                        + (this.rangeStartTimeInEpochSeconds == null
                                ? 43
                                : this.rangeStartTimeInEpochSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.rangeEndTimeInEpochSeconds == null
                                ? 43
                                : this.rangeEndTimeInEpochSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
