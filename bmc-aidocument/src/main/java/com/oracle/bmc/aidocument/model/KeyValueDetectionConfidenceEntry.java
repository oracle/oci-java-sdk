/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * Key Value Detection Confidence Entry. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KeyValueDetectionConfidenceEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyValueDetectionConfidenceEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"threshold", "precision", "recall", "f1Score", "accuracy"})
    public KeyValueDetectionConfidenceEntry(
            Float threshold, Float precision, Float recall, Float f1Score, Float accuracy) {
        super();
        this.threshold = threshold;
        this.precision = precision;
        this.recall = recall;
        this.f1Score = f1Score;
        this.accuracy = accuracy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Threshold used to calculate precision and recall. */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Float threshold;

        /**
         * Threshold used to calculate precision and recall.
         *
         * @param threshold the value to set
         * @return this builder
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }
        /** Precision under the threshold */
        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Float precision;

        /**
         * Precision under the threshold
         *
         * @param precision the value to set
         * @return this builder
         */
        public Builder precision(Float precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }
        /** Recall under the threshold */
        @com.fasterxml.jackson.annotation.JsonProperty("recall")
        private Float recall;

        /**
         * Recall under the threshold
         *
         * @param recall the value to set
         * @return this builder
         */
        public Builder recall(Float recall) {
            this.recall = recall;
            this.__explicitlySet__.add("recall");
            return this;
        }
        /** f1Score under the threshold */
        @com.fasterxml.jackson.annotation.JsonProperty("f1Score")
        private Float f1Score;

        /**
         * f1Score under the threshold
         *
         * @param f1Score the value to set
         * @return this builder
         */
        public Builder f1Score(Float f1Score) {
            this.f1Score = f1Score;
            this.__explicitlySet__.add("f1Score");
            return this;
        }
        /** accuracy under the threshold */
        @com.fasterxml.jackson.annotation.JsonProperty("accuracy")
        private Float accuracy;

        /**
         * accuracy under the threshold
         *
         * @param accuracy the value to set
         * @return this builder
         */
        public Builder accuracy(Float accuracy) {
            this.accuracy = accuracy;
            this.__explicitlySet__.add("accuracy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyValueDetectionConfidenceEntry build() {
            KeyValueDetectionConfidenceEntry model =
                    new KeyValueDetectionConfidenceEntry(
                            this.threshold,
                            this.precision,
                            this.recall,
                            this.f1Score,
                            this.accuracy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyValueDetectionConfidenceEntry model) {
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("recall")) {
                this.recall(model.getRecall());
            }
            if (model.wasPropertyExplicitlySet("f1Score")) {
                this.f1Score(model.getF1Score());
            }
            if (model.wasPropertyExplicitlySet("accuracy")) {
                this.accuracy(model.getAccuracy());
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

    /** Threshold used to calculate precision and recall. */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Float threshold;

    /**
     * Threshold used to calculate precision and recall.
     *
     * @return the value
     */
    public Float getThreshold() {
        return threshold;
    }

    /** Precision under the threshold */
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Float precision;

    /**
     * Precision under the threshold
     *
     * @return the value
     */
    public Float getPrecision() {
        return precision;
    }

    /** Recall under the threshold */
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    private final Float recall;

    /**
     * Recall under the threshold
     *
     * @return the value
     */
    public Float getRecall() {
        return recall;
    }

    /** f1Score under the threshold */
    @com.fasterxml.jackson.annotation.JsonProperty("f1Score")
    private final Float f1Score;

    /**
     * f1Score under the threshold
     *
     * @return the value
     */
    public Float getF1Score() {
        return f1Score;
    }

    /** accuracy under the threshold */
    @com.fasterxml.jackson.annotation.JsonProperty("accuracy")
    private final Float accuracy;

    /**
     * accuracy under the threshold
     *
     * @return the value
     */
    public Float getAccuracy() {
        return accuracy;
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
        sb.append("KeyValueDetectionConfidenceEntry(");
        sb.append("super=").append(super.toString());
        sb.append("threshold=").append(String.valueOf(this.threshold));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", recall=").append(String.valueOf(this.recall));
        sb.append(", f1Score=").append(String.valueOf(this.f1Score));
        sb.append(", accuracy=").append(String.valueOf(this.accuracy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyValueDetectionConfidenceEntry)) {
            return false;
        }

        KeyValueDetectionConfidenceEntry other = (KeyValueDetectionConfidenceEntry) o;
        return java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.recall, other.recall)
                && java.util.Objects.equals(this.f1Score, other.f1Score)
                && java.util.Objects.equals(this.accuracy, other.accuracy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.recall == null ? 43 : this.recall.hashCode());
        result = (result * PRIME) + (this.f1Score == null ? 43 : this.f1Score.hashCode());
        result = (result * PRIME) + (this.accuracy == null ? 43 : this.accuracy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
