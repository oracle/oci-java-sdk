/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * anomaly evaluation result fo the data point <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AnomalyDataPoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnomalyDataPoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"anomaly", "low", "high", "timestamp", "value"})
    public AnomalyDataPoint(
            Double anomaly, Double low, Double high, java.util.Date timestamp, Double value) {
        super();
        this.anomaly = anomaly;
        this.low = low;
        this.high = high;
        this.timestamp = timestamp;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * if the value is anomaly or not 0 indicates not an anomaly -1 indicates value is below the
         * threshold +1 indicates value is above the threshold
         */
        @com.fasterxml.jackson.annotation.JsonProperty("anomaly")
        private Double anomaly;

        /**
         * if the value is anomaly or not 0 indicates not an anomaly -1 indicates value is below the
         * threshold +1 indicates value is above the threshold
         *
         * @param anomaly the value to set
         * @return this builder
         */
        public Builder anomaly(Double anomaly) {
            this.anomaly = anomaly;
            this.__explicitlySet__.add("anomaly");
            return this;
        }
        /** lower threshold for the metric value */
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private Double low;

        /**
         * lower threshold for the metric value
         *
         * @param low the value to set
         * @return this builder
         */
        public Builder low(Double low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }
        /** upper threshold for the metric value */
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private Double high;

        /**
         * upper threshold for the metric value
         *
         * @param high the value to set
         * @return this builder
         */
        public Builder high(Double high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }
        /** timestamp of when the metric was collected */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * timestamp of when the metric was collected
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** value for the metric data point */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Double value;

        /**
         * value for the metric data point
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Double value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnomalyDataPoint build() {
            AnomalyDataPoint model =
                    new AnomalyDataPoint(
                            this.anomaly, this.low, this.high, this.timestamp, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnomalyDataPoint model) {
            if (model.wasPropertyExplicitlySet("anomaly")) {
                this.anomaly(model.getAnomaly());
            }
            if (model.wasPropertyExplicitlySet("low")) {
                this.low(model.getLow());
            }
            if (model.wasPropertyExplicitlySet("high")) {
                this.high(model.getHigh());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /**
     * if the value is anomaly or not 0 indicates not an anomaly -1 indicates value is below the
     * threshold +1 indicates value is above the threshold
     */
    @com.fasterxml.jackson.annotation.JsonProperty("anomaly")
    private final Double anomaly;

    /**
     * if the value is anomaly or not 0 indicates not an anomaly -1 indicates value is below the
     * threshold +1 indicates value is above the threshold
     *
     * @return the value
     */
    public Double getAnomaly() {
        return anomaly;
    }

    /** lower threshold for the metric value */
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final Double low;

    /**
     * lower threshold for the metric value
     *
     * @return the value
     */
    public Double getLow() {
        return low;
    }

    /** upper threshold for the metric value */
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final Double high;

    /**
     * upper threshold for the metric value
     *
     * @return the value
     */
    public Double getHigh() {
        return high;
    }

    /** timestamp of when the metric was collected */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * timestamp of when the metric was collected
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** value for the metric data point */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Double value;

    /**
     * value for the metric data point
     *
     * @return the value
     */
    public Double getValue() {
        return value;
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
        sb.append("AnomalyDataPoint(");
        sb.append("super=").append(super.toString());
        sb.append("anomaly=").append(String.valueOf(this.anomaly));
        sb.append(", low=").append(String.valueOf(this.low));
        sb.append(", high=").append(String.valueOf(this.high));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnomalyDataPoint)) {
            return false;
        }

        AnomalyDataPoint other = (AnomalyDataPoint) o;
        return java.util.Objects.equals(this.anomaly, other.anomaly)
                && java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.anomaly == null ? 43 : this.anomaly.hashCode());
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
