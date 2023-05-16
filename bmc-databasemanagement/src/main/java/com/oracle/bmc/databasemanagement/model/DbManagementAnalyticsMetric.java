/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The metric details of a Database Management resource. <br>
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
        builder = DbManagementAnalyticsMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbManagementAnalyticsMetric
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "durationInSeconds",
        "metadata",
        "dimensions",
        "startTimestampInEpochSeconds",
        "mean"
    })
    public DbManagementAnalyticsMetric(
            String metricName,
            Long durationInSeconds,
            java.util.Map<String, String> metadata,
            java.util.Map<String, String> dimensions,
            Long startTimestampInEpochSeconds,
            Double mean) {
        super();
        this.metricName = metricName;
        this.durationInSeconds = durationInSeconds;
        this.metadata = metadata;
        this.dimensions = dimensions;
        this.startTimestampInEpochSeconds = startTimestampInEpochSeconds;
        this.mean = mean;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The duration of the returned aggregated data in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Long durationInSeconds;

        /**
         * The duration of the returned aggregated data in seconds.
         *
         * @param durationInSeconds the value to set
         * @return this builder
         */
        public Builder durationInSeconds(Long durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /**
         * The additional information about the metric.
         *
         * <p>Example: {@code "unit": "bytes"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * The additional information about the metric.
         *
         * <p>Example: {@code "unit": "bytes"}
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /** The qualifiers provided in the definition of the returned metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * The qualifiers provided in the definition of the returned metric.
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /** The start time associated with the value of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimestampInEpochSeconds")
        private Long startTimestampInEpochSeconds;

        /**
         * The start time associated with the value of the metric.
         *
         * @param startTimestampInEpochSeconds the value to set
         * @return this builder
         */
        public Builder startTimestampInEpochSeconds(Long startTimestampInEpochSeconds) {
            this.startTimestampInEpochSeconds = startTimestampInEpochSeconds;
            this.__explicitlySet__.add("startTimestampInEpochSeconds");
            return this;
        }
        /** The mean value of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("mean")
        private Double mean;

        /**
         * The mean value of the metric.
         *
         * @param mean the value to set
         * @return this builder
         */
        public Builder mean(Double mean) {
            this.mean = mean;
            this.__explicitlySet__.add("mean");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbManagementAnalyticsMetric build() {
            DbManagementAnalyticsMetric model =
                    new DbManagementAnalyticsMetric(
                            this.metricName,
                            this.durationInSeconds,
                            this.metadata,
                            this.dimensions,
                            this.startTimestampInEpochSeconds,
                            this.mean);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbManagementAnalyticsMetric model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("startTimestampInEpochSeconds")) {
                this.startTimestampInEpochSeconds(model.getStartTimestampInEpochSeconds());
            }
            if (model.wasPropertyExplicitlySet("mean")) {
                this.mean(model.getMean());
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

    /** The duration of the returned aggregated data in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Long durationInSeconds;

    /**
     * The duration of the returned aggregated data in seconds.
     *
     * @return the value
     */
    public Long getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * The additional information about the metric.
     *
     * <p>Example: {@code "unit": "bytes"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * The additional information about the metric.
     *
     * <p>Example: {@code "unit": "bytes"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /** The qualifiers provided in the definition of the returned metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * The qualifiers provided in the definition of the returned metric.
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /** The start time associated with the value of the metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimestampInEpochSeconds")
    private final Long startTimestampInEpochSeconds;

    /**
     * The start time associated with the value of the metric.
     *
     * @return the value
     */
    public Long getStartTimestampInEpochSeconds() {
        return startTimestampInEpochSeconds;
    }

    /** The mean value of the metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("mean")
    private final Double mean;

    /**
     * The mean value of the metric.
     *
     * @return the value
     */
    public Double getMean() {
        return mean;
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
        sb.append("DbManagementAnalyticsMetric(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", startTimestampInEpochSeconds=")
                .append(String.valueOf(this.startTimestampInEpochSeconds));
        sb.append(", mean=").append(String.valueOf(this.mean));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbManagementAnalyticsMetric)) {
            return false;
        }

        DbManagementAnalyticsMetric other = (DbManagementAnalyticsMetric) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(
                        this.startTimestampInEpochSeconds, other.startTimestampInEpochSeconds)
                && java.util.Objects.equals(this.mean, other.mean)
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
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimestampInEpochSeconds == null
                                ? 43
                                : this.startTimestampInEpochSeconds.hashCode());
        result = (result * PRIME) + (this.mean == null ? 43 : this.mean.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
