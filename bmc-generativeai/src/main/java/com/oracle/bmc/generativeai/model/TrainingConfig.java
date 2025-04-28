/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The fine-tuning method and hyperparameters used for fine-tuning a custom model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "trainingConfigType",
        defaultImpl = TrainingConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoraTrainingConfig.class,
            name = "LORA_TRAINING_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VanillaTrainingConfig.class,
            name = "VANILLA_TRAINING_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TFewTrainingConfig.class,
            name = "TFEW_TRAINING_CONFIG")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TrainingConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalTrainingEpochs",
        "learningRate",
        "trainingBatchSize",
        "earlyStoppingPatience",
        "earlyStoppingThreshold",
        "logModelMetricsIntervalInSteps"
    })
    protected TrainingConfig(
            Integer totalTrainingEpochs,
            Double learningRate,
            Integer trainingBatchSize,
            Integer earlyStoppingPatience,
            Double earlyStoppingThreshold,
            Integer logModelMetricsIntervalInSteps) {
        super();
        this.totalTrainingEpochs = totalTrainingEpochs;
        this.learningRate = learningRate;
        this.trainingBatchSize = trainingBatchSize;
        this.earlyStoppingPatience = earlyStoppingPatience;
        this.earlyStoppingThreshold = earlyStoppingThreshold;
        this.logModelMetricsIntervalInSteps = logModelMetricsIntervalInSteps;
    }

    /** The maximum number of training epochs to run for. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTrainingEpochs")
    private final Integer totalTrainingEpochs;

    /**
     * The maximum number of training epochs to run for.
     *
     * @return the value
     */
    public Integer getTotalTrainingEpochs() {
        return totalTrainingEpochs;
    }

    /** The initial learning rate to be used during training */
    @com.fasterxml.jackson.annotation.JsonProperty("learningRate")
    private final Double learningRate;

    /**
     * The initial learning rate to be used during training
     *
     * @return the value
     */
    public Double getLearningRate() {
        return learningRate;
    }

    /** The batch size used during training. */
    @com.fasterxml.jackson.annotation.JsonProperty("trainingBatchSize")
    private final Integer trainingBatchSize;

    /**
     * The batch size used during training.
     *
     * @return the value
     */
    public Integer getTrainingBatchSize() {
        return trainingBatchSize;
    }

    /**
     * Stop training if the loss metric does not improve beyond 'early_stopping_threshold' for this
     * many times of evaluation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("earlyStoppingPatience")
    private final Integer earlyStoppingPatience;

    /**
     * Stop training if the loss metric does not improve beyond 'early_stopping_threshold' for this
     * many times of evaluation.
     *
     * @return the value
     */
    public Integer getEarlyStoppingPatience() {
        return earlyStoppingPatience;
    }

    /** How much the loss must improve to prevent early stopping. */
    @com.fasterxml.jackson.annotation.JsonProperty("earlyStoppingThreshold")
    private final Double earlyStoppingThreshold;

    /**
     * How much the loss must improve to prevent early stopping.
     *
     * @return the value
     */
    public Double getEarlyStoppingThreshold() {
        return earlyStoppingThreshold;
    }

    /**
     * Determines how frequently to log model metrics.
     *
     * <p>Every step is logged for the first 20 steps and then follows this parameter for log
     * frequency. Set to 0 to disable logging the model metrics.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logModelMetricsIntervalInSteps")
    private final Integer logModelMetricsIntervalInSteps;

    /**
     * Determines how frequently to log model metrics.
     *
     * <p>Every step is logged for the first 20 steps and then follows this parameter for log
     * frequency. Set to 0 to disable logging the model metrics.
     *
     * @return the value
     */
    public Integer getLogModelMetricsIntervalInSteps() {
        return logModelMetricsIntervalInSteps;
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
        sb.append("TrainingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("totalTrainingEpochs=").append(String.valueOf(this.totalTrainingEpochs));
        sb.append(", learningRate=").append(String.valueOf(this.learningRate));
        sb.append(", trainingBatchSize=").append(String.valueOf(this.trainingBatchSize));
        sb.append(", earlyStoppingPatience=").append(String.valueOf(this.earlyStoppingPatience));
        sb.append(", earlyStoppingThreshold=").append(String.valueOf(this.earlyStoppingThreshold));
        sb.append(", logModelMetricsIntervalInSteps=")
                .append(String.valueOf(this.logModelMetricsIntervalInSteps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrainingConfig)) {
            return false;
        }

        TrainingConfig other = (TrainingConfig) o;
        return java.util.Objects.equals(this.totalTrainingEpochs, other.totalTrainingEpochs)
                && java.util.Objects.equals(this.learningRate, other.learningRate)
                && java.util.Objects.equals(this.trainingBatchSize, other.trainingBatchSize)
                && java.util.Objects.equals(this.earlyStoppingPatience, other.earlyStoppingPatience)
                && java.util.Objects.equals(
                        this.earlyStoppingThreshold, other.earlyStoppingThreshold)
                && java.util.Objects.equals(
                        this.logModelMetricsIntervalInSteps, other.logModelMetricsIntervalInSteps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalTrainingEpochs == null
                                ? 43
                                : this.totalTrainingEpochs.hashCode());
        result = (result * PRIME) + (this.learningRate == null ? 43 : this.learningRate.hashCode());
        result =
                (result * PRIME)
                        + (this.trainingBatchSize == null ? 43 : this.trainingBatchSize.hashCode());
        result =
                (result * PRIME)
                        + (this.earlyStoppingPatience == null
                                ? 43
                                : this.earlyStoppingPatience.hashCode());
        result =
                (result * PRIME)
                        + (this.earlyStoppingThreshold == null
                                ? 43
                                : this.earlyStoppingThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.logModelMetricsIntervalInSteps == null
                                ? 43
                                : this.logModelMetricsIntervalInSteps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The fine-tuning method for training a custom model. */
    public enum TrainingConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        TfewTrainingConfig("TFEW_TRAINING_CONFIG"),
        VanillaTrainingConfig("VANILLA_TRAINING_CONFIG"),
        LoraTrainingConfig("LORA_TRAINING_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TrainingConfigType.class);

        private final String value;
        private static java.util.Map<String, TrainingConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (TrainingConfigType v : TrainingConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrainingConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrainingConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrainingConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
