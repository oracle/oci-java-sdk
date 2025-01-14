/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Possible NER model error analysis <br>
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
        builder = NamedEntityRecognitionEvaluationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamedEntityRecognitionEvaluationResult extends EvaluationResultSummary {
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
        @com.fasterxml.jackson.annotation.JsonProperty("record")
        private String record;

        /**
         * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line
         * sequence(1 is metadata)
         *
         * @param record the value to set
         * @return this builder
         */
        public Builder record(String record) {
            this.record = record;
            this.__explicitlySet__.add("record");
            return this;
        }
        /** List of true(actual) entities in test data for NER model */
        @com.fasterxml.jackson.annotation.JsonProperty("trueEntities")
        private java.util.List<EntityLabelErrorAnalysis> trueEntities;

        /**
         * List of true(actual) entities in test data for NER model
         *
         * @param trueEntities the value to set
         * @return this builder
         */
        public Builder trueEntities(java.util.List<EntityLabelErrorAnalysis> trueEntities) {
            this.trueEntities = trueEntities;
            this.__explicitlySet__.add("trueEntities");
            return this;
        }
        /** List of true(actual) entities in test data for NER model */
        @com.fasterxml.jackson.annotation.JsonProperty("predictedEntities")
        private java.util.List<EntityLabelErrorAnalysis> predictedEntities;

        /**
         * List of true(actual) entities in test data for NER model
         *
         * @param predictedEntities the value to set
         * @return this builder
         */
        public Builder predictedEntities(
                java.util.List<EntityLabelErrorAnalysis> predictedEntities) {
            this.predictedEntities = predictedEntities;
            this.__explicitlySet__.add("predictedEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamedEntityRecognitionEvaluationResult build() {
            NamedEntityRecognitionEvaluationResult model =
                    new NamedEntityRecognitionEvaluationResult(
                            this.freeformTags,
                            this.definedTags,
                            this.record,
                            this.trueEntities,
                            this.predictedEntities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamedEntityRecognitionEvaluationResult model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("record")) {
                this.record(model.getRecord());
            }
            if (model.wasPropertyExplicitlySet("trueEntities")) {
                this.trueEntities(model.getTrueEntities());
            }
            if (model.wasPropertyExplicitlySet("predictedEntities")) {
                this.predictedEntities(model.getPredictedEntities());
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
    public NamedEntityRecognitionEvaluationResult(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String record,
            java.util.List<EntityLabelErrorAnalysis> trueEntities,
            java.util.List<EntityLabelErrorAnalysis> predictedEntities) {
        super(freeformTags, definedTags);
        this.record = record;
        this.trueEntities = trueEntities;
        this.predictedEntities = predictedEntities;
    }

    /**
     * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line sequence(1
     * is metadata)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("record")
    private final String record;

    /**
     * For CSV format location is rowId(1 is header) and for JSONL location is jsonL line sequence(1
     * is metadata)
     *
     * @return the value
     */
    public String getRecord() {
        return record;
    }

    /** List of true(actual) entities in test data for NER model */
    @com.fasterxml.jackson.annotation.JsonProperty("trueEntities")
    private final java.util.List<EntityLabelErrorAnalysis> trueEntities;

    /**
     * List of true(actual) entities in test data for NER model
     *
     * @return the value
     */
    public java.util.List<EntityLabelErrorAnalysis> getTrueEntities() {
        return trueEntities;
    }

    /** List of true(actual) entities in test data for NER model */
    @com.fasterxml.jackson.annotation.JsonProperty("predictedEntities")
    private final java.util.List<EntityLabelErrorAnalysis> predictedEntities;

    /**
     * List of true(actual) entities in test data for NER model
     *
     * @return the value
     */
    public java.util.List<EntityLabelErrorAnalysis> getPredictedEntities() {
        return predictedEntities;
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
        sb.append("NamedEntityRecognitionEvaluationResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", record=").append(String.valueOf(this.record));
        sb.append(", trueEntities=").append(String.valueOf(this.trueEntities));
        sb.append(", predictedEntities=").append(String.valueOf(this.predictedEntities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamedEntityRecognitionEvaluationResult)) {
            return false;
        }

        NamedEntityRecognitionEvaluationResult other = (NamedEntityRecognitionEvaluationResult) o;
        return java.util.Objects.equals(this.record, other.record)
                && java.util.Objects.equals(this.trueEntities, other.trueEntities)
                && java.util.Objects.equals(this.predictedEntities, other.predictedEntities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.record == null ? 43 : this.record.hashCode());
        result = (result * PRIME) + (this.trueEntities == null ? 43 : this.trueEntities.hashCode());
        result =
                (result * PRIME)
                        + (this.predictedEntities == null ? 43 : this.predictedEntities.hashCode());
        return result;
    }
}
