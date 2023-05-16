/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Model level named entity recognition metrics <br>
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
        builder = NamedEntityRecognitionModelMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedEntityRecognitionModelMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "microF1",
        "microPrecision",
        "microRecall",
        "macroF1",
        "macroPrecision",
        "macroRecall",
        "weightedF1",
        "weightedPrecision",
        "weightedRecall"
    })
    public NamedEntityRecognitionModelMetrics(
            Float microF1,
            Float microPrecision,
            Float microRecall,
            Float macroF1,
            Float macroPrecision,
            Float macroRecall,
            Float weightedF1,
            Float weightedPrecision,
            Float weightedRecall) {
        super();
        this.microF1 = microF1;
        this.microPrecision = microPrecision;
        this.microRecall = microRecall;
        this.macroF1 = macroF1;
        this.macroPrecision = macroPrecision;
        this.macroRecall = macroRecall;
        this.weightedF1 = weightedF1;
        this.weightedPrecision = weightedPrecision;
        this.weightedRecall = weightedRecall;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
        @com.fasterxml.jackson.annotation.JsonProperty("microF1")
        private Float microF1;

        /**
         * F1-score, is a measure of a model\u2019s accuracy on a dataset
         *
         * @param microF1 the value to set
         * @return this builder
         */
        public Builder microF1(Float microF1) {
            this.microF1 = microF1;
            this.__explicitlySet__.add("microF1");
            return this;
        }
        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("microPrecision")
        private Float microPrecision;

        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         *
         * @param microPrecision the value to set
         * @return this builder
         */
        public Builder microPrecision(Float microPrecision) {
            this.microPrecision = microPrecision;
            this.__explicitlySet__.add("microPrecision");
            return this;
        }
        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("microRecall")
        private Float microRecall;

        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         *
         * @param microRecall the value to set
         * @return this builder
         */
        public Builder microRecall(Float microRecall) {
            this.microRecall = microRecall;
            this.__explicitlySet__.add("microRecall");
            return this;
        }
        /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
        @com.fasterxml.jackson.annotation.JsonProperty("macroF1")
        private Float macroF1;

        /**
         * F1-score, is a measure of a model\u2019s accuracy on a dataset
         *
         * @param macroF1 the value to set
         * @return this builder
         */
        public Builder macroF1(Float macroF1) {
            this.macroF1 = macroF1;
            this.__explicitlySet__.add("macroF1");
            return this;
        }
        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("macroPrecision")
        private Float macroPrecision;

        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         *
         * @param macroPrecision the value to set
         * @return this builder
         */
        public Builder macroPrecision(Float macroPrecision) {
            this.macroPrecision = macroPrecision;
            this.__explicitlySet__.add("macroPrecision");
            return this;
        }
        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("macroRecall")
        private Float macroRecall;

        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         *
         * @param macroRecall the value to set
         * @return this builder
         */
        public Builder macroRecall(Float macroRecall) {
            this.macroRecall = macroRecall;
            this.__explicitlySet__.add("macroRecall");
            return this;
        }
        /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
        @com.fasterxml.jackson.annotation.JsonProperty("weightedF1")
        private Float weightedF1;

        /**
         * F1-score, is a measure of a model\u2019s accuracy on a dataset
         *
         * @param weightedF1 the value to set
         * @return this builder
         */
        public Builder weightedF1(Float weightedF1) {
            this.weightedF1 = weightedF1;
            this.__explicitlySet__.add("weightedF1");
            return this;
        }
        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weightedPrecision")
        private Float weightedPrecision;

        /**
         * Precision refers to the number of true positives divided by the total number of positive
         * predictions (i.e., the number of true positives plus the number of false positives)
         *
         * @param weightedPrecision the value to set
         * @return this builder
         */
        public Builder weightedPrecision(Float weightedPrecision) {
            this.weightedPrecision = weightedPrecision;
            this.__explicitlySet__.add("weightedPrecision");
            return this;
        }
        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weightedRecall")
        private Float weightedRecall;

        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between
         * the predicted true positives and what was actually tagged. The recall metric reveals how
         * many of the predicted classes are correct.
         *
         * @param weightedRecall the value to set
         * @return this builder
         */
        public Builder weightedRecall(Float weightedRecall) {
            this.weightedRecall = weightedRecall;
            this.__explicitlySet__.add("weightedRecall");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedEntityRecognitionModelMetrics build() {
            NamedEntityRecognitionModelMetrics model =
                    new NamedEntityRecognitionModelMetrics(
                            this.microF1,
                            this.microPrecision,
                            this.microRecall,
                            this.macroF1,
                            this.macroPrecision,
                            this.macroRecall,
                            this.weightedF1,
                            this.weightedPrecision,
                            this.weightedRecall);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedEntityRecognitionModelMetrics model) {
            if (model.wasPropertyExplicitlySet("microF1")) {
                this.microF1(model.getMicroF1());
            }
            if (model.wasPropertyExplicitlySet("microPrecision")) {
                this.microPrecision(model.getMicroPrecision());
            }
            if (model.wasPropertyExplicitlySet("microRecall")) {
                this.microRecall(model.getMicroRecall());
            }
            if (model.wasPropertyExplicitlySet("macroF1")) {
                this.macroF1(model.getMacroF1());
            }
            if (model.wasPropertyExplicitlySet("macroPrecision")) {
                this.macroPrecision(model.getMacroPrecision());
            }
            if (model.wasPropertyExplicitlySet("macroRecall")) {
                this.macroRecall(model.getMacroRecall());
            }
            if (model.wasPropertyExplicitlySet("weightedF1")) {
                this.weightedF1(model.getWeightedF1());
            }
            if (model.wasPropertyExplicitlySet("weightedPrecision")) {
                this.weightedPrecision(model.getWeightedPrecision());
            }
            if (model.wasPropertyExplicitlySet("weightedRecall")) {
                this.weightedRecall(model.getWeightedRecall());
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

    /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
    @com.fasterxml.jackson.annotation.JsonProperty("microF1")
    private final Float microF1;

    /**
     * F1-score, is a measure of a model\u2019s accuracy on a dataset
     *
     * @return the value
     */
    public Float getMicroF1() {
        return microF1;
    }

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("microPrecision")
    private final Float microPrecision;

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     *
     * @return the value
     */
    public Float getMicroPrecision() {
        return microPrecision;
    }

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("microRecall")
    private final Float microRecall;

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     *
     * @return the value
     */
    public Float getMicroRecall() {
        return microRecall;
    }

    /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
    @com.fasterxml.jackson.annotation.JsonProperty("macroF1")
    private final Float macroF1;

    /**
     * F1-score, is a measure of a model\u2019s accuracy on a dataset
     *
     * @return the value
     */
    public Float getMacroF1() {
        return macroF1;
    }

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macroPrecision")
    private final Float macroPrecision;

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     *
     * @return the value
     */
    public Float getMacroPrecision() {
        return macroPrecision;
    }

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("macroRecall")
    private final Float macroRecall;

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     *
     * @return the value
     */
    public Float getMacroRecall() {
        return macroRecall;
    }

    /** F1-score, is a measure of a model\u2019s accuracy on a dataset */
    @com.fasterxml.jackson.annotation.JsonProperty("weightedF1")
    private final Float weightedF1;

    /**
     * F1-score, is a measure of a model\u2019s accuracy on a dataset
     *
     * @return the value
     */
    public Float getWeightedF1() {
        return weightedF1;
    }

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weightedPrecision")
    private final Float weightedPrecision;

    /**
     * Precision refers to the number of true positives divided by the total number of positive
     * predictions (i.e., the number of true positives plus the number of false positives)
     *
     * @return the value
     */
    public Float getWeightedPrecision() {
        return weightedPrecision;
    }

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weightedRecall")
    private final Float weightedRecall;

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the
     * predicted true positives and what was actually tagged. The recall metric reveals how many of
     * the predicted classes are correct.
     *
     * @return the value
     */
    public Float getWeightedRecall() {
        return weightedRecall;
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
        sb.append("NamedEntityRecognitionModelMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("microF1=").append(String.valueOf(this.microF1));
        sb.append(", microPrecision=").append(String.valueOf(this.microPrecision));
        sb.append(", microRecall=").append(String.valueOf(this.microRecall));
        sb.append(", macroF1=").append(String.valueOf(this.macroF1));
        sb.append(", macroPrecision=").append(String.valueOf(this.macroPrecision));
        sb.append(", macroRecall=").append(String.valueOf(this.macroRecall));
        sb.append(", weightedF1=").append(String.valueOf(this.weightedF1));
        sb.append(", weightedPrecision=").append(String.valueOf(this.weightedPrecision));
        sb.append(", weightedRecall=").append(String.valueOf(this.weightedRecall));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedEntityRecognitionModelMetrics)) {
            return false;
        }

        NamedEntityRecognitionModelMetrics other = (NamedEntityRecognitionModelMetrics) o;
        return java.util.Objects.equals(this.microF1, other.microF1)
                && java.util.Objects.equals(this.microPrecision, other.microPrecision)
                && java.util.Objects.equals(this.microRecall, other.microRecall)
                && java.util.Objects.equals(this.macroF1, other.macroF1)
                && java.util.Objects.equals(this.macroPrecision, other.macroPrecision)
                && java.util.Objects.equals(this.macroRecall, other.macroRecall)
                && java.util.Objects.equals(this.weightedF1, other.weightedF1)
                && java.util.Objects.equals(this.weightedPrecision, other.weightedPrecision)
                && java.util.Objects.equals(this.weightedRecall, other.weightedRecall)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.microF1 == null ? 43 : this.microF1.hashCode());
        result =
                (result * PRIME)
                        + (this.microPrecision == null ? 43 : this.microPrecision.hashCode());
        result = (result * PRIME) + (this.microRecall == null ? 43 : this.microRecall.hashCode());
        result = (result * PRIME) + (this.macroF1 == null ? 43 : this.macroF1.hashCode());
        result =
                (result * PRIME)
                        + (this.macroPrecision == null ? 43 : this.macroPrecision.hashCode());
        result = (result * PRIME) + (this.macroRecall == null ? 43 : this.macroRecall.hashCode());
        result = (result * PRIME) + (this.weightedF1 == null ? 43 : this.weightedF1.hashCode());
        result =
                (result * PRIME)
                        + (this.weightedPrecision == null ? 43 : this.weightedPrecision.hashCode());
        result =
                (result * PRIME)
                        + (this.weightedRecall == null ? 43 : this.weightedRecall.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
