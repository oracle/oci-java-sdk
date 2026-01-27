/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Details of model parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelParams.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelParams extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxTokens",
        "temperature",
        "topP",
        "topK",
        "frequencyPenalty",
        "presencePenalty",
        "seed",
        "reasoningEffort",
        "verbosity"
    })
    public ModelParams(
            Integer maxTokens,
            Float temperature,
            Float topP,
            Integer topK,
            Float frequencyPenalty,
            Float presencePenalty,
            Integer seed,
            String reasoningEffort,
            String verbosity) {
        super();
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.topP = topP;
        this.topK = topK;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.seed = seed;
        this.reasoningEffort = reasoningEffort;
        this.verbosity = verbosity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Maximum number of tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
        private Integer maxTokens;

        /**
         * Maximum number of tokens.
         *
         * @param maxTokens the value to set
         * @return this builder
         */
        public Builder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            this.__explicitlySet__.add("maxTokens");
            return this;
        }
        /** Sampling temperature. */
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Float temperature;

        /**
         * Sampling temperature.
         *
         * @param temperature the value to set
         * @return this builder
         */
        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            this.__explicitlySet__.add("temperature");
            return this;
        }
        /** Nucleus sampling probability. */
        @com.fasterxml.jackson.annotation.JsonProperty("topP")
        private Float topP;

        /**
         * Nucleus sampling probability.
         *
         * @param topP the value to set
         * @return this builder
         */
        public Builder topP(Float topP) {
            this.topP = topP;
            this.__explicitlySet__.add("topP");
            return this;
        }
        /** Top-K sampling parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("topK")
        private Integer topK;

        /**
         * Top-K sampling parameter.
         *
         * @param topK the value to set
         * @return this builder
         */
        public Builder topK(Integer topK) {
            this.topK = topK;
            this.__explicitlySet__.add("topK");
            return this;
        }
        /** Frequency penalty to reduce repeating tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
        private Float frequencyPenalty;

        /**
         * Frequency penalty to reduce repeating tokens.
         *
         * @param frequencyPenalty the value to set
         * @return this builder
         */
        public Builder frequencyPenalty(Float frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            this.__explicitlySet__.add("frequencyPenalty");
            return this;
        }
        /** Presence penalty to encourage new topics. */
        @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
        private Float presencePenalty;

        /**
         * Presence penalty to encourage new topics.
         *
         * @param presencePenalty the value to set
         * @return this builder
         */
        public Builder presencePenalty(Float presencePenalty) {
            this.presencePenalty = presencePenalty;
            this.__explicitlySet__.add("presencePenalty");
            return this;
        }
        /** Seed makes best effort to sample tokens deterministically. */
        @com.fasterxml.jackson.annotation.JsonProperty("seed")
        private Integer seed;

        /**
         * Seed makes best effort to sample tokens deterministically.
         *
         * @param seed the value to set
         * @return this builder
         */
        public Builder seed(Integer seed) {
            this.seed = seed;
            this.__explicitlySet__.add("seed");
            return this;
        }
        /** Constrains effort on reasoning for reasoning models. */
        @com.fasterxml.jackson.annotation.JsonProperty("reasoningEffort")
        private String reasoningEffort;

        /**
         * Constrains effort on reasoning for reasoning models.
         *
         * @param reasoningEffort the value to set
         * @return this builder
         */
        public Builder reasoningEffort(String reasoningEffort) {
            this.reasoningEffort = reasoningEffort;
            this.__explicitlySet__.add("reasoningEffort");
            return this;
        }
        /** Constrains the verbosity of the model's response. */
        @com.fasterxml.jackson.annotation.JsonProperty("verbosity")
        private String verbosity;

        /**
         * Constrains the verbosity of the model's response.
         *
         * @param verbosity the value to set
         * @return this builder
         */
        public Builder verbosity(String verbosity) {
            this.verbosity = verbosity;
            this.__explicitlySet__.add("verbosity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelParams build() {
            ModelParams model =
                    new ModelParams(
                            this.maxTokens,
                            this.temperature,
                            this.topP,
                            this.topK,
                            this.frequencyPenalty,
                            this.presencePenalty,
                            this.seed,
                            this.reasoningEffort,
                            this.verbosity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelParams model) {
            if (model.wasPropertyExplicitlySet("maxTokens")) {
                this.maxTokens(model.getMaxTokens());
            }
            if (model.wasPropertyExplicitlySet("temperature")) {
                this.temperature(model.getTemperature());
            }
            if (model.wasPropertyExplicitlySet("topP")) {
                this.topP(model.getTopP());
            }
            if (model.wasPropertyExplicitlySet("topK")) {
                this.topK(model.getTopK());
            }
            if (model.wasPropertyExplicitlySet("frequencyPenalty")) {
                this.frequencyPenalty(model.getFrequencyPenalty());
            }
            if (model.wasPropertyExplicitlySet("presencePenalty")) {
                this.presencePenalty(model.getPresencePenalty());
            }
            if (model.wasPropertyExplicitlySet("seed")) {
                this.seed(model.getSeed());
            }
            if (model.wasPropertyExplicitlySet("reasoningEffort")) {
                this.reasoningEffort(model.getReasoningEffort());
            }
            if (model.wasPropertyExplicitlySet("verbosity")) {
                this.verbosity(model.getVerbosity());
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

    /** Maximum number of tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTokens")
    private final Integer maxTokens;

    /**
     * Maximum number of tokens.
     *
     * @return the value
     */
    public Integer getMaxTokens() {
        return maxTokens;
    }

    /** Sampling temperature. */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Float temperature;

    /**
     * Sampling temperature.
     *
     * @return the value
     */
    public Float getTemperature() {
        return temperature;
    }

    /** Nucleus sampling probability. */
    @com.fasterxml.jackson.annotation.JsonProperty("topP")
    private final Float topP;

    /**
     * Nucleus sampling probability.
     *
     * @return the value
     */
    public Float getTopP() {
        return topP;
    }

    /** Top-K sampling parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final Integer topK;

    /**
     * Top-K sampling parameter.
     *
     * @return the value
     */
    public Integer getTopK() {
        return topK;
    }

    /** Frequency penalty to reduce repeating tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
    private final Float frequencyPenalty;

    /**
     * Frequency penalty to reduce repeating tokens.
     *
     * @return the value
     */
    public Float getFrequencyPenalty() {
        return frequencyPenalty;
    }

    /** Presence penalty to encourage new topics. */
    @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
    private final Float presencePenalty;

    /**
     * Presence penalty to encourage new topics.
     *
     * @return the value
     */
    public Float getPresencePenalty() {
        return presencePenalty;
    }

    /** Seed makes best effort to sample tokens deterministically. */
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    private final Integer seed;

    /**
     * Seed makes best effort to sample tokens deterministically.
     *
     * @return the value
     */
    public Integer getSeed() {
        return seed;
    }

    /** Constrains effort on reasoning for reasoning models. */
    @com.fasterxml.jackson.annotation.JsonProperty("reasoningEffort")
    private final String reasoningEffort;

    /**
     * Constrains effort on reasoning for reasoning models.
     *
     * @return the value
     */
    public String getReasoningEffort() {
        return reasoningEffort;
    }

    /** Constrains the verbosity of the model's response. */
    @com.fasterxml.jackson.annotation.JsonProperty("verbosity")
    private final String verbosity;

    /**
     * Constrains the verbosity of the model's response.
     *
     * @return the value
     */
    public String getVerbosity() {
        return verbosity;
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
        sb.append("ModelParams(");
        sb.append("super=").append(super.toString());
        sb.append("maxTokens=").append(String.valueOf(this.maxTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", seed=").append(String.valueOf(this.seed));
        sb.append(", reasoningEffort=").append(String.valueOf(this.reasoningEffort));
        sb.append(", verbosity=").append(String.valueOf(this.verbosity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelParams)) {
            return false;
        }

        ModelParams other = (ModelParams) o;
        return java.util.Objects.equals(this.maxTokens, other.maxTokens)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.topP, other.topP)
                && java.util.Objects.equals(this.topK, other.topK)
                && java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty)
                && java.util.Objects.equals(this.presencePenalty, other.presencePenalty)
                && java.util.Objects.equals(this.seed, other.seed)
                && java.util.Objects.equals(this.reasoningEffort, other.reasoningEffort)
                && java.util.Objects.equals(this.verbosity, other.verbosity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxTokens == null ? 43 : this.maxTokens.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result = (result * PRIME) + (this.topP == null ? 43 : this.topP.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        result =
                (result * PRIME)
                        + (this.frequencyPenalty == null ? 43 : this.frequencyPenalty.hashCode());
        result =
                (result * PRIME)
                        + (this.presencePenalty == null ? 43 : this.presencePenalty.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result =
                (result * PRIME)
                        + (this.reasoningEffort == null ? 43 : this.reasoningEffort.hashCode());
        result = (result * PRIME) + (this.verbosity == null ? 43 : this.verbosity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
