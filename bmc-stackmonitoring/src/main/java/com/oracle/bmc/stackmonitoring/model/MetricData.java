/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Metric Details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricData extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dimensions", "trainingDataPoints", "evaluationDataPoints"})
    public MetricData(
            java.util.Map<String, String> dimensions,
            java.util.List<DataPoint> trainingDataPoints,
            java.util.List<DataPoint> evaluationDataPoints) {
        super();
        this.dimensions = dimensions;
        this.trainingDataPoints = trainingDataPoints;
        this.evaluationDataPoints = evaluationDataPoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * list of dimensions for the metric
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * list of dimensions for the metric
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * list of data points for the metric for training of baseline
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trainingDataPoints")
        private java.util.List<DataPoint> trainingDataPoints;

        /**
         * list of data points for the metric for training of baseline
         * @param trainingDataPoints the value to set
         * @return this builder
         **/
        public Builder trainingDataPoints(java.util.List<DataPoint> trainingDataPoints) {
            this.trainingDataPoints = trainingDataPoints;
            this.__explicitlySet__.add("trainingDataPoints");
            return this;
        }
        /**
         * list of data points for the metric for evaluation of anomalies
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("evaluationDataPoints")
        private java.util.List<DataPoint> evaluationDataPoints;

        /**
         * list of data points for the metric for evaluation of anomalies
         * @param evaluationDataPoints the value to set
         * @return this builder
         **/
        public Builder evaluationDataPoints(java.util.List<DataPoint> evaluationDataPoints) {
            this.evaluationDataPoints = evaluationDataPoints;
            this.__explicitlySet__.add("evaluationDataPoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricData build() {
            MetricData model =
                    new MetricData(
                            this.dimensions, this.trainingDataPoints, this.evaluationDataPoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricData model) {
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("trainingDataPoints")) {
                this.trainingDataPoints(model.getTrainingDataPoints());
            }
            if (model.wasPropertyExplicitlySet("evaluationDataPoints")) {
                this.evaluationDataPoints(model.getEvaluationDataPoints());
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
     * list of dimensions for the metric
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * list of dimensions for the metric
     * @return the value
     **/
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * list of data points for the metric for training of baseline
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trainingDataPoints")
    private final java.util.List<DataPoint> trainingDataPoints;

    /**
     * list of data points for the metric for training of baseline
     * @return the value
     **/
    public java.util.List<DataPoint> getTrainingDataPoints() {
        return trainingDataPoints;
    }

    /**
     * list of data points for the metric for evaluation of anomalies
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("evaluationDataPoints")
    private final java.util.List<DataPoint> evaluationDataPoints;

    /**
     * list of data points for the metric for evaluation of anomalies
     * @return the value
     **/
    public java.util.List<DataPoint> getEvaluationDataPoints() {
        return evaluationDataPoints;
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
        sb.append("MetricData(");
        sb.append("super=").append(super.toString());
        sb.append("dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", trainingDataPoints=").append(String.valueOf(this.trainingDataPoints));
        sb.append(", evaluationDataPoints=").append(String.valueOf(this.evaluationDataPoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricData)) {
            return false;
        }

        MetricData other = (MetricData) o;
        return java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.trainingDataPoints, other.trainingDataPoints)
                && java.util.Objects.equals(this.evaluationDataPoints, other.evaluationDataPoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingDataPoints == null
                                ? 43
                                : this.trainingDataPoints.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluationDataPoints == null
                                ? 43
                                : this.evaluationDataPoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
