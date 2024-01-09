/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The summary of the AWR metric data for a particular metric at a specific time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrDatabaseMetricSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDatabaseMetricSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "timestamp", "avgValue", "minValue", "maxValue"})
    public AwrDatabaseMetricSummary(
            String name,
            java.util.Date timestamp,
            Double avgValue,
            Double minValue,
            Double maxValue) {
        super();
        this.name = name;
        this.timestamp = timestamp;
        this.avgValue = avgValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The time of the sampling. */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The time of the sampling.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** The average value of the sampling period. */
        @com.fasterxml.jackson.annotation.JsonProperty("avgValue")
        private Double avgValue;

        /**
         * The average value of the sampling period.
         *
         * @param avgValue the value to set
         * @return this builder
         */
        public Builder avgValue(Double avgValue) {
            this.avgValue = avgValue;
            this.__explicitlySet__.add("avgValue");
            return this;
        }
        /** The minimum value of the sampling period. */
        @com.fasterxml.jackson.annotation.JsonProperty("minValue")
        private Double minValue;

        /**
         * The minimum value of the sampling period.
         *
         * @param minValue the value to set
         * @return this builder
         */
        public Builder minValue(Double minValue) {
            this.minValue = minValue;
            this.__explicitlySet__.add("minValue");
            return this;
        }
        /** The maximum value of the sampling period. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
        private Double maxValue;

        /**
         * The maximum value of the sampling period.
         *
         * @param maxValue the value to set
         * @return this builder
         */
        public Builder maxValue(Double maxValue) {
            this.maxValue = maxValue;
            this.__explicitlySet__.add("maxValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseMetricSummary build() {
            AwrDatabaseMetricSummary model =
                    new AwrDatabaseMetricSummary(
                            this.name, this.timestamp, this.avgValue, this.minValue, this.maxValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseMetricSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("avgValue")) {
                this.avgValue(model.getAvgValue());
            }
            if (model.wasPropertyExplicitlySet("minValue")) {
                this.minValue(model.getMinValue());
            }
            if (model.wasPropertyExplicitlySet("maxValue")) {
                this.maxValue(model.getMaxValue());
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The time of the sampling. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The time of the sampling.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** The average value of the sampling period. */
    @com.fasterxml.jackson.annotation.JsonProperty("avgValue")
    private final Double avgValue;

    /**
     * The average value of the sampling period.
     *
     * @return the value
     */
    public Double getAvgValue() {
        return avgValue;
    }

    /** The minimum value of the sampling period. */
    @com.fasterxml.jackson.annotation.JsonProperty("minValue")
    private final Double minValue;

    /**
     * The minimum value of the sampling period.
     *
     * @return the value
     */
    public Double getMinValue() {
        return minValue;
    }

    /** The maximum value of the sampling period. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
    private final Double maxValue;

    /**
     * The maximum value of the sampling period.
     *
     * @return the value
     */
    public Double getMaxValue() {
        return maxValue;
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
        sb.append("AwrDatabaseMetricSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", avgValue=").append(String.valueOf(this.avgValue));
        sb.append(", minValue=").append(String.valueOf(this.minValue));
        sb.append(", maxValue=").append(String.valueOf(this.maxValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseMetricSummary)) {
            return false;
        }

        AwrDatabaseMetricSummary other = (AwrDatabaseMetricSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.avgValue, other.avgValue)
                && java.util.Objects.equals(this.minValue, other.minValue)
                && java.util.Objects.equals(this.maxValue, other.maxValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.avgValue == null ? 43 : this.avgValue.hashCode());
        result = (result * PRIME) + (this.minValue == null ? 43 : this.minValue.hashCode());
        result = (result * PRIME) + (this.maxValue == null ? 43 : this.maxValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
