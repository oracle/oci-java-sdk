/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The Lora training method hyperparameters. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LoraTrainingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "trainingConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoraTrainingConfig extends TrainingConfig {
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
        /** This parameter represents the LoRA rank of the update matrices. */
        @com.fasterxml.jackson.annotation.JsonProperty("loraR")
        private Integer loraR;

        /**
         * This parameter represents the LoRA rank of the update matrices.
         *
         * @param loraR the value to set
         * @return this builder
         */
        public Builder loraR(Integer loraR) {
            this.loraR = loraR;
            this.__explicitlySet__.add("loraR");
            return this;
        }
        /** This parameter represents the scaling factor for the weight matrices in LoRA. */
        @com.fasterxml.jackson.annotation.JsonProperty("loraAlpha")
        private Integer loraAlpha;

        /**
         * This parameter represents the scaling factor for the weight matrices in LoRA.
         *
         * @param loraAlpha the value to set
         * @return this builder
         */
        public Builder loraAlpha(Integer loraAlpha) {
            this.loraAlpha = loraAlpha;
            this.__explicitlySet__.add("loraAlpha");
            return this;
        }
        /** This parameter indicates the dropout probability for LoRA layers. */
        @com.fasterxml.jackson.annotation.JsonProperty("loraDropout")
        private Double loraDropout;

        /**
         * This parameter indicates the dropout probability for LoRA layers.
         *
         * @param loraDropout the value to set
         * @return this builder
         */
        public Builder loraDropout(Double loraDropout) {
            this.loraDropout = loraDropout;
            this.__explicitlySet__.add("loraDropout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoraTrainingConfig build() {
            LoraTrainingConfig model =
                    new LoraTrainingConfig(
                            this.totalTrainingEpochs,
                            this.learningRate,
                            this.trainingBatchSize,
                            this.earlyStoppingPatience,
                            this.earlyStoppingThreshold,
                            this.logModelMetricsIntervalInSteps,
                            this.loraR,
                            this.loraAlpha,
                            this.loraDropout);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoraTrainingConfig model) {
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
            if (model.wasPropertyExplicitlySet("loraR")) {
                this.loraR(model.getLoraR());
            }
            if (model.wasPropertyExplicitlySet("loraAlpha")) {
                this.loraAlpha(model.getLoraAlpha());
            }
            if (model.wasPropertyExplicitlySet("loraDropout")) {
                this.loraDropout(model.getLoraDropout());
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
    public LoraTrainingConfig(
            Integer totalTrainingEpochs,
            Double learningRate,
            Integer trainingBatchSize,
            Integer earlyStoppingPatience,
            Double earlyStoppingThreshold,
            Integer logModelMetricsIntervalInSteps,
            Integer loraR,
            Integer loraAlpha,
            Double loraDropout) {
        super(
                totalTrainingEpochs,
                learningRate,
                trainingBatchSize,
                earlyStoppingPatience,
                earlyStoppingThreshold,
                logModelMetricsIntervalInSteps);
        this.loraR = loraR;
        this.loraAlpha = loraAlpha;
        this.loraDropout = loraDropout;
    }

    /** This parameter represents the LoRA rank of the update matrices. */
    @com.fasterxml.jackson.annotation.JsonProperty("loraR")
    private final Integer loraR;

    /**
     * This parameter represents the LoRA rank of the update matrices.
     *
     * @return the value
     */
    public Integer getLoraR() {
        return loraR;
    }

    /** This parameter represents the scaling factor for the weight matrices in LoRA. */
    @com.fasterxml.jackson.annotation.JsonProperty("loraAlpha")
    private final Integer loraAlpha;

    /**
     * This parameter represents the scaling factor for the weight matrices in LoRA.
     *
     * @return the value
     */
    public Integer getLoraAlpha() {
        return loraAlpha;
    }

    /** This parameter indicates the dropout probability for LoRA layers. */
    @com.fasterxml.jackson.annotation.JsonProperty("loraDropout")
    private final Double loraDropout;

    /**
     * This parameter indicates the dropout probability for LoRA layers.
     *
     * @return the value
     */
    public Double getLoraDropout() {
        return loraDropout;
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
        sb.append("LoraTrainingConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", loraR=").append(String.valueOf(this.loraR));
        sb.append(", loraAlpha=").append(String.valueOf(this.loraAlpha));
        sb.append(", loraDropout=").append(String.valueOf(this.loraDropout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoraTrainingConfig)) {
            return false;
        }

        LoraTrainingConfig other = (LoraTrainingConfig) o;
        return java.util.Objects.equals(this.loraR, other.loraR)
                && java.util.Objects.equals(this.loraAlpha, other.loraAlpha)
                && java.util.Objects.equals(this.loraDropout, other.loraDropout)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.loraR == null ? 43 : this.loraR.hashCode());
        result = (result * PRIME) + (this.loraAlpha == null ? 43 : this.loraAlpha.hashCode());
        result = (result * PRIME) + (this.loraDropout == null ? 43 : this.loraDropout.hashCode());
        return result;
    }
}
