/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Text Classification model testing and evaluation results <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TextClassificationEvaluationResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TextClassificationEvaluationResults extends EvaluationResults {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private TextClassificationModelMetrics metrics;

        public Builder metrics(TextClassificationModelMetrics metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /** List of text classification metrics */
        @com.fasterxml.jackson.annotation.JsonProperty("classMetrics")
        private java.util.List<ClassMetrics> classMetrics;

        /**
         * List of text classification metrics
         *
         * @param classMetrics the value to set
         * @return this builder
         */
        public Builder classMetrics(java.util.List<ClassMetrics> classMetrics) {
            this.classMetrics = classMetrics;
            this.__explicitlySet__.add("classMetrics");
            return this;
        }
        /** class level confusion matrix */
        @com.fasterxml.jackson.annotation.JsonProperty("confusionMatrix")
        private java.util.Map<String, ConfusionMatrixDetails> confusionMatrix;

        /**
         * class level confusion matrix
         *
         * @param confusionMatrix the value to set
         * @return this builder
         */
        public Builder confusionMatrix(
                java.util.Map<String, ConfusionMatrixDetails> confusionMatrix) {
            this.confusionMatrix = confusionMatrix;
            this.__explicitlySet__.add("confusionMatrix");
            return this;
        }
        /** labels */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * labels
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TextClassificationEvaluationResults build() {
            TextClassificationEvaluationResults model =
                    new TextClassificationEvaluationResults(
                            this.metrics, this.classMetrics, this.confusionMatrix, this.labels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TextClassificationEvaluationResults model) {
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("classMetrics")) {
                this.classMetrics(model.getClassMetrics());
            }
            if (model.wasPropertyExplicitlySet("confusionMatrix")) {
                this.confusionMatrix(model.getConfusionMatrix());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
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

    @Deprecated
    public TextClassificationEvaluationResults(
            TextClassificationModelMetrics metrics,
            java.util.List<ClassMetrics> classMetrics,
            java.util.Map<String, ConfusionMatrixDetails> confusionMatrix,
            java.util.List<String> labels) {
        super();
        this.metrics = metrics;
        this.classMetrics = classMetrics;
        this.confusionMatrix = confusionMatrix;
        this.labels = labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final TextClassificationModelMetrics metrics;

    public TextClassificationModelMetrics getMetrics() {
        return metrics;
    }

    /** List of text classification metrics */
    @com.fasterxml.jackson.annotation.JsonProperty("classMetrics")
    private final java.util.List<ClassMetrics> classMetrics;

    /**
     * List of text classification metrics
     *
     * @return the value
     */
    public java.util.List<ClassMetrics> getClassMetrics() {
        return classMetrics;
    }

    /** class level confusion matrix */
    @com.fasterxml.jackson.annotation.JsonProperty("confusionMatrix")
    private final java.util.Map<String, ConfusionMatrixDetails> confusionMatrix;

    /**
     * class level confusion matrix
     *
     * @return the value
     */
    public java.util.Map<String, ConfusionMatrixDetails> getConfusionMatrix() {
        return confusionMatrix;
    }

    /** labels */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * labels
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
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
        sb.append("TextClassificationEvaluationResults(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", classMetrics=").append(String.valueOf(this.classMetrics));
        sb.append(", confusionMatrix=").append(String.valueOf(this.confusionMatrix));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextClassificationEvaluationResults)) {
            return false;
        }

        TextClassificationEvaluationResults other = (TextClassificationEvaluationResults) o;
        return java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.classMetrics, other.classMetrics)
                && java.util.Objects.equals(this.confusionMatrix, other.confusionMatrix)
                && java.util.Objects.equals(this.labels, other.labels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.classMetrics == null ? 43 : this.classMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.confusionMatrix == null ? 43 : this.confusionMatrix.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        return result;
    }
}
