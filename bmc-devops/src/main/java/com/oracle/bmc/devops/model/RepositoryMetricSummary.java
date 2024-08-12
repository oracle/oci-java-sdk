/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The metrics details of a repository resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RepositoryMetricSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryMetricSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "durationInSeconds",
        "dimensions",
        "startTimestampInEpochSeconds",
        "count",
        "sum"
    })
    public RepositoryMetricSummary(
            MetricName metricName,
            Long durationInSeconds,
            java.util.Map<String, String> dimensions,
            Long startTimestampInEpochSeconds,
            Double count,
            Double sum) {
        super();
        this.metricName = metricName;
        this.durationInSeconds = durationInSeconds;
        this.dimensions = dimensions;
        this.startTimestampInEpochSeconds = startTimestampInEpochSeconds;
        this.count = count;
        this.sum = sum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private MetricName metricName;

        /**
         * Type of metric
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(MetricName metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * The duration of the returned aggregated data in seconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Long durationInSeconds;

        /**
         * The duration of the returned aggregated data in seconds.
         * @param durationInSeconds the value to set
         * @return this builder
         **/
        public Builder durationInSeconds(Long durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /**
         * The qualifiers provided in the definition of the returned metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * The qualifiers provided in the definition of the returned metric.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The start time associated with the value of the metric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimestampInEpochSeconds")
        private Long startTimestampInEpochSeconds;

        /**
         * The start time associated with the value of the metric.
         * @param startTimestampInEpochSeconds the value to set
         * @return this builder
         **/
        public Builder startTimestampInEpochSeconds(Long startTimestampInEpochSeconds) {
            this.startTimestampInEpochSeconds = startTimestampInEpochSeconds;
            this.__explicitlySet__.add("startTimestampInEpochSeconds");
            return this;
        }
        /**
         * Represents the total number of the metric being calculated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Double count;

        /**
         * Represents the total number of the metric being calculated.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Double count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * Represents the total duration in days calculated corresponding to the total no. of PRs.
         * This is used only for "PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS" and "PULL_REQUEST_REVIEW_DURATION_IN_DAYS" metrics.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sum")
        private Double sum;

        /**
         * Represents the total duration in days calculated corresponding to the total no. of PRs.
         * This is used only for "PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS" and "PULL_REQUEST_REVIEW_DURATION_IN_DAYS" metrics.
         *
         * @param sum the value to set
         * @return this builder
         **/
        public Builder sum(Double sum) {
            this.sum = sum;
            this.__explicitlySet__.add("sum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryMetricSummary build() {
            RepositoryMetricSummary model =
                    new RepositoryMetricSummary(
                            this.metricName,
                            this.durationInSeconds,
                            this.dimensions,
                            this.startTimestampInEpochSeconds,
                            this.count,
                            this.sum);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryMetricSummary model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("startTimestampInEpochSeconds")) {
                this.startTimestampInEpochSeconds(model.getStartTimestampInEpochSeconds());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("sum")) {
                this.sum(model.getSum());
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
     * Type of metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final MetricName metricName;

    /**
     * Type of metric
     * @return the value
     **/
    public MetricName getMetricName() {
        return metricName;
    }

    /**
     * The duration of the returned aggregated data in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Long durationInSeconds;

    /**
     * The duration of the returned aggregated data in seconds.
     * @return the value
     **/
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * The qualifiers provided in the definition of the returned metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * The qualifiers provided in the definition of the returned metric.
     * @return the value
     **/
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * The start time associated with the value of the metric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestampInEpochSeconds")
    private final Long startTimestampInEpochSeconds;

    /**
     * The start time associated with the value of the metric.
     * @return the value
     **/
    public Long getStartTimestampInEpochSeconds() {
        return startTimestampInEpochSeconds;
    }

    /**
     * Represents the total number of the metric being calculated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Double count;

    /**
     * Represents the total number of the metric being calculated.
     * @return the value
     **/
    public Double getCount() {
        return count;
    }

    /**
     * Represents the total duration in days calculated corresponding to the total no. of PRs.
     * This is used only for "PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS" and "PULL_REQUEST_REVIEW_DURATION_IN_DAYS" metrics.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sum")
    private final Double sum;

    /**
     * Represents the total duration in days calculated corresponding to the total no. of PRs.
     * This is used only for "PULL_REQUEST_REVIEW_START_DURATION_IN_DAYS" and "PULL_REQUEST_REVIEW_DURATION_IN_DAYS" metrics.
     *
     * @return the value
     **/
    public Double getSum() {
        return sum;
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
        sb.append("RepositoryMetricSummary(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", startTimestampInEpochSeconds=")
                .append(String.valueOf(this.startTimestampInEpochSeconds));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", sum=").append(String.valueOf(this.sum));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepositoryMetricSummary)) {
            return false;
        }

        RepositoryMetricSummary other = (RepositoryMetricSummary) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(
                        this.startTimestampInEpochSeconds, other.startTimestampInEpochSeconds)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.sum, other.sum)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimestampInEpochSeconds == null
                                ? 43
                                : this.startTimestampInEpochSeconds.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.sum == null ? 43 : this.sum.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
