/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The date field value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ValueDate.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "valueType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValueDate extends FieldValue {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
        private java.util.List<Integer> wordIndexes;

        public Builder wordIndexes(java.util.List<Integer> wordIndexes) {
            this.wordIndexes = wordIndexes;
            this.__explicitlySet__.add("wordIndexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("normalizedValue")
        private String normalizedValue;

        public Builder normalizedValue(String normalizedValue) {
            this.normalizedValue = normalizedValue;
            this.__explicitlySet__.add("normalizedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("normalizedConfidence")
        private Float normalizedConfidence;

        public Builder normalizedConfidence(Float normalizedConfidence) {
            this.normalizedConfidence = normalizedConfidence;
            this.__explicitlySet__.add("normalizedConfidence");
            return this;
        }
        /** The date field value as yyyy-mm-dd. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Date value;

        /**
         * The date field value as yyyy-mm-dd.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(java.util.Date value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValueDate build() {
            ValueDate model =
                    new ValueDate(
                            this.text,
                            this.confidence,
                            this.boundingPolygon,
                            this.wordIndexes,
                            this.normalizedValue,
                            this.normalizedConfidence,
                            this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValueDate model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
            }
            if (model.wasPropertyExplicitlySet("wordIndexes")) {
                this.wordIndexes(model.getWordIndexes());
            }
            if (model.wasPropertyExplicitlySet("normalizedValue")) {
                this.normalizedValue(model.getNormalizedValue());
            }
            if (model.wasPropertyExplicitlySet("normalizedConfidence")) {
                this.normalizedConfidence(model.getNormalizedConfidence());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
    public ValueDate(
            String text,
            Float confidence,
            BoundingPolygon boundingPolygon,
            java.util.List<Integer> wordIndexes,
            String normalizedValue,
            Float normalizedConfidence,
            java.util.Date value) {
        super(
                text,
                confidence,
                boundingPolygon,
                wordIndexes,
                normalizedValue,
                normalizedConfidence);
        this.value = value;
    }

    /** The date field value as yyyy-mm-dd. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final java.util.Date value;

    /**
     * The date field value as yyyy-mm-dd.
     *
     * @return the value
     */
    public java.util.Date getValue() {
        return value;
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
        sb.append("ValueDate(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValueDate)) {
            return false;
        }

        ValueDate other = (ValueDate) o;
        return java.util.Objects.equals(this.value, other.value) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
