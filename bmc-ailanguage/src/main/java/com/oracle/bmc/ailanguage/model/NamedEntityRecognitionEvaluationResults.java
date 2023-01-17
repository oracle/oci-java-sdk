/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Named entity recognition model testing and evaluation results
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NamedEntityRecognitionEvaluationResults.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NamedEntityRecognitionEvaluationResults extends EvaluationResults {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private NamedEntityRecognitionModelMetrics metrics;

        public Builder metrics(NamedEntityRecognitionModelMetrics metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /**
         * List of entity metrics
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityMetrics")
        private java.util.List<EntityMetrics> entityMetrics;

        /**
         * List of entity metrics
         * @param entityMetrics the value to set
         * @return this builder
         **/
        public Builder entityMetrics(java.util.List<EntityMetrics> entityMetrics) {
            this.entityMetrics = entityMetrics;
            this.__explicitlySet__.add("entityMetrics");
            return this;
        }
        /**
         * class level confusion matrix
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confusionMatrix")
        private java.util.Map<String, ConfusionMatrixDetails> confusionMatrix;

        /**
         * class level confusion matrix
         * @param confusionMatrix the value to set
         * @return this builder
         **/
        public Builder confusionMatrix(
                java.util.Map<String, ConfusionMatrixDetails> confusionMatrix) {
            this.confusionMatrix = confusionMatrix;
            this.__explicitlySet__.add("confusionMatrix");
            return this;
        }
        /**
         * labels
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * labels
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedEntityRecognitionEvaluationResults build() {
            NamedEntityRecognitionEvaluationResults model =
                    new NamedEntityRecognitionEvaluationResults(
                            this.metrics, this.entityMetrics, this.confusionMatrix, this.labels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedEntityRecognitionEvaluationResults model) {
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("entityMetrics")) {
                this.entityMetrics(model.getEntityMetrics());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public NamedEntityRecognitionEvaluationResults(
            NamedEntityRecognitionModelMetrics metrics,
            java.util.List<EntityMetrics> entityMetrics,
            java.util.Map<String, ConfusionMatrixDetails> confusionMatrix,
            java.util.List<String> labels) {
        super();
        this.metrics = metrics;
        this.entityMetrics = entityMetrics;
        this.confusionMatrix = confusionMatrix;
        this.labels = labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final NamedEntityRecognitionModelMetrics metrics;

    public NamedEntityRecognitionModelMetrics getMetrics() {
        return metrics;
    }

    /**
     * List of entity metrics
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityMetrics")
    private final java.util.List<EntityMetrics> entityMetrics;

    /**
     * List of entity metrics
     * @return the value
     **/
    public java.util.List<EntityMetrics> getEntityMetrics() {
        return entityMetrics;
    }

    /**
     * class level confusion matrix
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confusionMatrix")
    private final java.util.Map<String, ConfusionMatrixDetails> confusionMatrix;

    /**
     * class level confusion matrix
     * @return the value
     **/
    public java.util.Map<String, ConfusionMatrixDetails> getConfusionMatrix() {
        return confusionMatrix;
    }

    /**
     * labels
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * labels
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
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
        sb.append("NamedEntityRecognitionEvaluationResults(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", entityMetrics=").append(String.valueOf(this.entityMetrics));
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
        if (!(o instanceof NamedEntityRecognitionEvaluationResults)) {
            return false;
        }

        NamedEntityRecognitionEvaluationResults other = (NamedEntityRecognitionEvaluationResults) o;
        return java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.entityMetrics, other.entityMetrics)
                && java.util.Objects.equals(this.confusionMatrix, other.confusionMatrix)
                && java.util.Objects.equals(this.labels, other.labels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result =
                (result * PRIME)
                        + (this.entityMetrics == null ? 43 : this.entityMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.confusionMatrix == null ? 43 : this.confusionMatrix.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        return result;
    }
}
