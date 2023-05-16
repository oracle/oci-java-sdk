/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The name of a form field. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FieldName.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FieldName extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "confidence", "boundingPolygon", "wordIndexes"})
    public FieldName(
            String name,
            Float confidence,
            BoundingPolygon boundingPolygon,
            java.util.List<Integer> wordIndexes) {
        super();
        this.name = name;
        this.confidence = confidence;
        this.boundingPolygon = boundingPolygon;
        this.wordIndexes = wordIndexes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the field. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the field.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The confidence score between 0 and 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score between 0 and 1.
         *
         * @param confidence the value to set
         * @return this builder
         */
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
        /** The indexes of the words in the field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
        private java.util.List<Integer> wordIndexes;

        /**
         * The indexes of the words in the field name.
         *
         * @param wordIndexes the value to set
         * @return this builder
         */
        public Builder wordIndexes(java.util.List<Integer> wordIndexes) {
            this.wordIndexes = wordIndexes;
            this.__explicitlySet__.add("wordIndexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldName build() {
            FieldName model =
                    new FieldName(
                            this.name, this.confidence, this.boundingPolygon, this.wordIndexes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldName model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** The name of the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the field.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The confidence score between 0 and 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score between 0 and 1.
     *
     * @return the value
     */
    public Float getConfidence() {
        return confidence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
    }

    /** The indexes of the words in the field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
    private final java.util.List<Integer> wordIndexes;

    /**
     * The indexes of the words in the field name.
     *
     * @return the value
     */
    public java.util.List<Integer> getWordIndexes() {
        return wordIndexes;
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
        sb.append("FieldName(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", wordIndexes=").append(String.valueOf(this.wordIndexes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldName)) {
            return false;
        }

        FieldName other = (FieldName) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.wordIndexes, other.wordIndexes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.wordIndexes == null ? 43 : this.wordIndexes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
