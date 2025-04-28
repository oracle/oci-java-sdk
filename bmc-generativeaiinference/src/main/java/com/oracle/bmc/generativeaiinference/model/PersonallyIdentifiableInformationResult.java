/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * An item of personally identifiable information. <br>
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
        builder = PersonallyIdentifiableInformationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PersonallyIdentifiableInformationResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"length", "offset", "text", "label", "score"})
    public PersonallyIdentifiableInformationResult(
            Integer length, Integer offset, String text, String label, Double score) {
        super();
        this.length = length;
        this.offset = offset;
        this.text = text;
        this.label = label;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The length of the personally identifiable information. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * The length of the personally identifiable information.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** The offset of the personally identifiable information. */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * The offset of the personally identifiable information.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /** The text of the personally identifiable information. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The text of the personally identifiable information.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** The label of the personally identifiable information. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * The label of the personally identifiable information.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** The score of the personally identifiable information. */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * The score of the personally identifiable information.
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PersonallyIdentifiableInformationResult build() {
            PersonallyIdentifiableInformationResult model =
                    new PersonallyIdentifiableInformationResult(
                            this.length, this.offset, this.text, this.label, this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PersonallyIdentifiableInformationResult model) {
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
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

    /** The length of the personally identifiable information. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * The length of the personally identifiable information.
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
    }

    /** The offset of the personally identifiable information. */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * The offset of the personally identifiable information.
     *
     * @return the value
     */
    public Integer getOffset() {
        return offset;
    }

    /** The text of the personally identifiable information. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The text of the personally identifiable information.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** The label of the personally identifiable information. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * The label of the personally identifiable information.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** The score of the personally identifiable information. */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * The score of the personally identifiable information.
     *
     * @return the value
     */
    public Double getScore() {
        return score;
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
        sb.append("PersonallyIdentifiableInformationResult(");
        sb.append("super=").append(super.toString());
        sb.append("length=").append(String.valueOf(this.length));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonallyIdentifiableInformationResult)) {
            return false;
        }

        PersonallyIdentifiableInformationResult other = (PersonallyIdentifiableInformationResult) o;
        return java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
