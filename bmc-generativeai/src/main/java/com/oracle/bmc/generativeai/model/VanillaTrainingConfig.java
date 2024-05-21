/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The Vanilla training method hyperparameters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VanillaTrainingConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "trainingConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VanillaTrainingConfig extends TrainingConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalTrainingEpochs")
        private Integer totalTrainingEpochs;

        public Builder totalTrainingEpochs(Integer totalTrainingEpochs) {
            this.totalTrainingEpochs = totalTrainingEpochs;
            this.__explicitlySet__.add("totalTrainingEpochs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("learningRate")
        private Double learningRate;

        public Builder learningRate(Double learningRate) {
            this.learningRate = learningRate;
            this.__explicitlySet__.add("learningRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trainingBatchSize")
        private Integer trainingBatchSize;

        public Builder trainingBatchSize(Integer trainingBatchSize) {
            this.trainingBatchSize = trainingBatchSize;
            this.__explicitlySet__.add("trainingBatchSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("earlyStoppingPatience")
        private Integer earlyStoppingPatience;

        public Builder earlyStoppingPatience(Integer earlyStoppingPatience) {
            this.earlyStoppingPatience = earlyStoppingPatience;
            this.__explicitlySet__.add("earlyStoppingPatience");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("earlyStoppingThreshold")
        private Double earlyStoppingThreshold;

        public Builder earlyStoppingThreshold(Double earlyStoppingThreshold) {
            this.earlyStoppingThreshold = earlyStoppingThreshold;
            this.__explicitlySet__.add("earlyStoppingThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logModelMetricsIntervalInSteps")
        private Integer logModelMetricsIntervalInSteps;

        public Builder logModelMetricsIntervalInSteps(Integer logModelMetricsIntervalInSteps) {
            this.logModelMetricsIntervalInSteps = logModelMetricsIntervalInSteps;
            this.__explicitlySet__.add("logModelMetricsIntervalInSteps");
            return this;
        }
        /**
         * The number of last layers to be fine-tuned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numOfLastLayers")
        private Integer numOfLastLayers;

        /**
         * The number of last layers to be fine-tuned.
         * @param numOfLastLayers the value to set
         * @return this builder
         **/
        public Builder numOfLastLayers(Integer numOfLastLayers) {
            this.numOfLastLayers = numOfLastLayers;
            this.__explicitlySet__.add("numOfLastLayers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanillaTrainingConfig build() {
            VanillaTrainingConfig model =
                    new VanillaTrainingConfig(
                            this.totalTrainingEpochs,
                            this.learningRate,
                            this.trainingBatchSize,
                            this.earlyStoppingPatience,
                            this.earlyStoppingThreshold,
                            this.logModelMetricsIntervalInSteps,
                            this.numOfLastLayers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanillaTrainingConfig model) {
            if (model.wasPropertyExplicitlySet("totalTrainingEpochs")) {
                this.totalTrainingEpochs(model.getTotalTrainingEpochs());
            }
            if (model.wasPropertyExplicitlySet("learningRate")) {
                this.learningRate(model.getLearningRate());
            }
            if (model.wasPropertyExplicitlySet("trainingBatchSize")) {
                this.trainingBatchSize(model.getTrainingBatchSize());
            }
            if (model.wasPropertyExplicitlySet("earlyStoppingPatience")) {
                this.earlyStoppingPatience(model.getEarlyStoppingPatience());
            }
            if (model.wasPropertyExplicitlySet("earlyStoppingThreshold")) {
                this.earlyStoppingThreshold(model.getEarlyStoppingThreshold());
            }
            if (model.wasPropertyExplicitlySet("logModelMetricsIntervalInSteps")) {
                this.logModelMetricsIntervalInSteps(model.getLogModelMetricsIntervalInSteps());
            }
            if (model.wasPropertyExplicitlySet("numOfLastLayers")) {
                this.numOfLastLayers(model.getNumOfLastLayers());
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
    public VanillaTrainingConfig(
            Integer totalTrainingEpochs,
            Double learningRate,
            Integer trainingBatchSize,
            Integer earlyStoppingPatience,
            Double earlyStoppingThreshold,
            Integer logModelMetricsIntervalInSteps,
            Integer numOfLastLayers) {
        super(
                totalTrainingEpochs,
                learningRate,
                trainingBatchSize,
                earlyStoppingPatience,
                earlyStoppingThreshold,
                logModelMetricsIntervalInSteps);
        this.numOfLastLayers = numOfLastLayers;
    }

    /**
     * The number of last layers to be fine-tuned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numOfLastLayers")
    private final Integer numOfLastLayers;

    /**
     * The number of last layers to be fine-tuned.
     * @return the value
     **/
    public Integer getNumOfLastLayers() {
        return numOfLastLayers;
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
        sb.append("VanillaTrainingConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", numOfLastLayers=").append(String.valueOf(this.numOfLastLayers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VanillaTrainingConfig)) {
            return false;
        }

        VanillaTrainingConfig other = (VanillaTrainingConfig) o;
        return java.util.Objects.equals(this.numOfLastLayers, other.numOfLastLayers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.numOfLastLayers == null ? 43 : this.numOfLastLayers.hashCode());
        return result;
    }
}
