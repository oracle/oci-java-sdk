/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * class level Text Classification model metrics
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClassMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClassMetrics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "f1", "precision", "recall", "support"})
    public ClassMetrics(String label, Float f1, Float precision, Float recall, Float support) {
        super();
        this.label = label;
        this.f1 = f1;
        this.precision = precision;
        this.recall = recall;
        this.support = support;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Text classification label
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Text classification label
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * F1-score, is a measure of a model\u2019s accuracy on a dataset
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("f1")
        private Float f1;

        /**
         * F1-score, is a measure of a model\u2019s accuracy on a dataset
         * @param f1 the value to set
         * @return this builder
         **/
        public Builder f1(Float f1) {
            this.f1 = f1;
            this.__explicitlySet__.add("f1");
            return this;
        }
        /**
         * Precision refers to the number of true positives divided by the total number of positive predictions (i.e., the number of true positives plus the number of false positives)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("precision")
        private Float precision;

        /**
         * Precision refers to the number of true positives divided by the total number of positive predictions (i.e., the number of true positives plus the number of false positives)
         * @param precision the value to set
         * @return this builder
         **/
        public Builder precision(Float precision) {
            this.precision = precision;
            this.__explicitlySet__.add("precision");
            return this;
        }
        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between the predicted true positives and what was actually tagged. The recall metric reveals how many of the predicted classes are correct.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recall")
        private Float recall;

        /**
         * Measures the model's ability to predict actual positive classes. It is the ratio between the predicted true positives and what was actually tagged. The recall metric reveals how many of the predicted classes are correct.
         * @param recall the value to set
         * @return this builder
         **/
        public Builder recall(Float recall) {
            this.recall = recall;
            this.__explicitlySet__.add("recall");
            return this;
        }
        /**
         * number of samples in the test set
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("support")
        private Float support;

        /**
         * number of samples in the test set
         * @param support the value to set
         * @return this builder
         **/
        public Builder support(Float support) {
            this.support = support;
            this.__explicitlySet__.add("support");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClassMetrics build() {
            ClassMetrics model =
                    new ClassMetrics(
                            this.label, this.f1, this.precision, this.recall, this.support);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClassMetrics model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("f1")) {
                this.f1(model.getF1());
            }
            if (model.wasPropertyExplicitlySet("precision")) {
                this.precision(model.getPrecision());
            }
            if (model.wasPropertyExplicitlySet("recall")) {
                this.recall(model.getRecall());
            }
            if (model.wasPropertyExplicitlySet("support")) {
                this.support(model.getSupport());
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
     * Text classification label
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Text classification label
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * F1-score, is a measure of a model\u2019s accuracy on a dataset
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("f1")
    private final Float f1;

    /**
     * F1-score, is a measure of a model\u2019s accuracy on a dataset
     * @return the value
     **/
    public Float getF1() {
        return f1;
    }

    /**
     * Precision refers to the number of true positives divided by the total number of positive predictions (i.e., the number of true positives plus the number of false positives)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    private final Float precision;

    /**
     * Precision refers to the number of true positives divided by the total number of positive predictions (i.e., the number of true positives plus the number of false positives)
     * @return the value
     **/
    public Float getPrecision() {
        return precision;
    }

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the predicted true positives and what was actually tagged. The recall metric reveals how many of the predicted classes are correct.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    private final Float recall;

    /**
     * Measures the model's ability to predict actual positive classes. It is the ratio between the predicted true positives and what was actually tagged. The recall metric reveals how many of the predicted classes are correct.
     * @return the value
     **/
    public Float getRecall() {
        return recall;
    }

    /**
     * number of samples in the test set
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("support")
    private final Float support;

    /**
     * number of samples in the test set
     * @return the value
     **/
    public Float getSupport() {
        return support;
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
        sb.append("ClassMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", f1=").append(String.valueOf(this.f1));
        sb.append(", precision=").append(String.valueOf(this.precision));
        sb.append(", recall=").append(String.valueOf(this.recall));
        sb.append(", support=").append(String.valueOf(this.support));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClassMetrics)) {
            return false;
        }

        ClassMetrics other = (ClassMetrics) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.f1, other.f1)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.recall, other.recall)
                && java.util.Objects.equals(this.support, other.support)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.f1 == null ? 43 : this.f1.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.recall == null ? 43 : this.recall.hashCode());
        result = (result * PRIME) + (this.support == null ? 43 : this.support.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
