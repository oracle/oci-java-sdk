/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Possible TXTC model error analysis <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TextClassificationModelEvaluationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TextClassificationModelEvaluationResult extends EvaluationResultSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line
         * sequence(1 is metadata)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line
         * sequence(1 is metadata)
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /**
         * List of true(actual) labels in test data for multi class or multi label
         * TextClassification
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trueLabels")
        private java.util.List<String> trueLabels;

        /**
         * List of true(actual) labels in test data for multi class or multi label
         * TextClassification
         *
         * @param trueLabels the value to set
         * @return this builder
         */
        public Builder trueLabels(java.util.List<String> trueLabels) {
            this.trueLabels = trueLabels;
            this.__explicitlySet__.add("trueLabels");
            return this;
        }
        /**
         * List of predicted labels by custom multi class or multi label TextClassification model
         */
        @com.fasterxml.jackson.annotation.JsonProperty("predictedLabels")
        private java.util.List<String> predictedLabels;

        /**
         * List of predicted labels by custom multi class or multi label TextClassification model
         *
         * @param predictedLabels the value to set
         * @return this builder
         */
        public Builder predictedLabels(java.util.List<String> predictedLabels) {
            this.predictedLabels = predictedLabels;
            this.__explicitlySet__.add("predictedLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TextClassificationModelEvaluationResult build() {
            TextClassificationModelEvaluationResult model =
                    new TextClassificationModelEvaluationResult(
                            this.freeformTags,
                            this.definedTags,
                            this.location,
                            this.trueLabels,
                            this.predictedLabels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TextClassificationModelEvaluationResult model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("trueLabels")) {
                this.trueLabels(model.getTrueLabels());
            }
            if (model.wasPropertyExplicitlySet("predictedLabels")) {
                this.predictedLabels(model.getPredictedLabels());
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
    public TextClassificationModelEvaluationResult(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String location,
            java.util.List<String> trueLabels,
            java.util.List<String> predictedLabels) {
        super(freeformTags, definedTags);
        this.location = location;
        this.trueLabels = trueLabels;
        this.predictedLabels = predictedLabels;
    }

    /**
     * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line sequence(1
     * is metadata)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line sequence(1
     * is metadata)
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * List of true(actual) labels in test data for multi class or multi label TextClassification
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trueLabels")
    private final java.util.List<String> trueLabels;

    /**
     * List of true(actual) labels in test data for multi class or multi label TextClassification
     *
     * @return the value
     */
    public java.util.List<String> getTrueLabels() {
        return trueLabels;
    }

    /** List of predicted labels by custom multi class or multi label TextClassification model */
    @com.fasterxml.jackson.annotation.JsonProperty("predictedLabels")
    private final java.util.List<String> predictedLabels;

    /**
     * List of predicted labels by custom multi class or multi label TextClassification model
     *
     * @return the value
     */
    public java.util.List<String> getPredictedLabels() {
        return predictedLabels;
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
        sb.append("TextClassificationModelEvaluationResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", trueLabels=").append(String.valueOf(this.trueLabels));
        sb.append(", predictedLabels=").append(String.valueOf(this.predictedLabels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextClassificationModelEvaluationResult)) {
            return false;
        }

        TextClassificationModelEvaluationResult other = (TextClassificationModelEvaluationResult) o;
        return java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.trueLabels, other.trueLabels)
                && java.util.Objects.equals(this.predictedLabels, other.predictedLabels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.trueLabels == null ? 43 : this.trueLabels.hashCode());
        result =
                (result * PRIME)
                        + (this.predictedLabels == null ? 43 : this.predictedLabels.hashCode());
        return result;
    }
}
