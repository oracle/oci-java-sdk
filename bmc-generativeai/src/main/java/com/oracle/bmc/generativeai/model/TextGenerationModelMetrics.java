/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The text generation model metrics of the fine-tuning process. <br>
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
        builder = TextGenerationModelMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelMetricsType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TextGenerationModelMetrics extends ModelMetrics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Fine-tuned model accuracy. */
        @com.fasterxml.jackson.annotation.JsonProperty("finalAccuracy")
        private Double finalAccuracy;

        /**
         * Fine-tuned model accuracy.
         *
         * @param finalAccuracy the value to set
         * @return this builder
         */
        public Builder finalAccuracy(Double finalAccuracy) {
            this.finalAccuracy = finalAccuracy;
            this.__explicitlySet__.add("finalAccuracy");
            return this;
        }
        /** Fine-tuned model loss. */
        @com.fasterxml.jackson.annotation.JsonProperty("finalLoss")
        private Double finalLoss;

        /**
         * Fine-tuned model loss.
         *
         * @param finalLoss the value to set
         * @return this builder
         */
        public Builder finalLoss(Double finalLoss) {
            this.finalLoss = finalLoss;
            this.__explicitlySet__.add("finalLoss");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TextGenerationModelMetrics build() {
            TextGenerationModelMetrics model =
                    new TextGenerationModelMetrics(this.finalAccuracy, this.finalLoss);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TextGenerationModelMetrics model) {
            if (model.wasPropertyExplicitlySet("finalAccuracy")) {
                this.finalAccuracy(model.getFinalAccuracy());
            }
            if (model.wasPropertyExplicitlySet("finalLoss")) {
                this.finalLoss(model.getFinalLoss());
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
    public TextGenerationModelMetrics(Double finalAccuracy, Double finalLoss) {
        super();
        this.finalAccuracy = finalAccuracy;
        this.finalLoss = finalLoss;
    }

    /** Fine-tuned model accuracy. */
    @com.fasterxml.jackson.annotation.JsonProperty("finalAccuracy")
    private final Double finalAccuracy;

    /**
     * Fine-tuned model accuracy.
     *
     * @return the value
     */
    public Double getFinalAccuracy() {
        return finalAccuracy;
    }

    /** Fine-tuned model loss. */
    @com.fasterxml.jackson.annotation.JsonProperty("finalLoss")
    private final Double finalLoss;

    /**
     * Fine-tuned model loss.
     *
     * @return the value
     */
    public Double getFinalLoss() {
        return finalLoss;
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
        sb.append("TextGenerationModelMetrics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", finalAccuracy=").append(String.valueOf(this.finalAccuracy));
        sb.append(", finalLoss=").append(String.valueOf(this.finalLoss));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextGenerationModelMetrics)) {
            return false;
        }

        TextGenerationModelMetrics other = (TextGenerationModelMetrics) o;
        return java.util.Objects.equals(this.finalAccuracy, other.finalAccuracy)
                && java.util.Objects.equals(this.finalLoss, other.finalLoss)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.finalAccuracy == null ? 43 : this.finalAccuracy.hashCode());
        result = (result * PRIME) + (this.finalLoss == null ? 43 : this.finalLoss.hashCode());
        return result;
    }
}
