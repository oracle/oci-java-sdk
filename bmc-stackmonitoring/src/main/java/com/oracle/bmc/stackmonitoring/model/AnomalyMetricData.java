/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Anomaly Metric Details <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnomalyMetricData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnomalyMetricData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensions", "dataPoints"})
    public AnomalyMetricData(
            java.util.Map<String, String> dimensions, java.util.List<AnomalyDataPoint> dataPoints) {
        super();
        this.dimensions = dimensions;
        this.dataPoints = dataPoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** list of dimensions for the metric */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * list of dimensions for the metric
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /** list of anomaly data points for the metric */
        @com.fasterxml.jackson.annotation.JsonProperty("dataPoints")
        private java.util.List<AnomalyDataPoint> dataPoints;

        /**
         * list of anomaly data points for the metric
         *
         * @param dataPoints the value to set
         * @return this builder
         */
        public Builder dataPoints(java.util.List<AnomalyDataPoint> dataPoints) {
            this.dataPoints = dataPoints;
            this.__explicitlySet__.add("dataPoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnomalyMetricData build() {
            AnomalyMetricData model = new AnomalyMetricData(this.dimensions, this.dataPoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnomalyMetricData model) {
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("dataPoints")) {
                this.dataPoints(model.getDataPoints());
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

    /** list of dimensions for the metric */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * list of dimensions for the metric
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /** list of anomaly data points for the metric */
    @com.fasterxml.jackson.annotation.JsonProperty("dataPoints")
    private final java.util.List<AnomalyDataPoint> dataPoints;

    /**
     * list of anomaly data points for the metric
     *
     * @return the value
     */
    public java.util.List<AnomalyDataPoint> getDataPoints() {
        return dataPoints;
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
        sb.append("AnomalyMetricData(");
        sb.append("super=").append(super.toString());
        sb.append("dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", dataPoints=").append(String.valueOf(this.dataPoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnomalyMetricData)) {
            return false;
        }

        AnomalyMetricData other = (AnomalyMetricData) o;
        return java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.dataPoints, other.dataPoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.dataPoints == null ? 43 : this.dataPoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
