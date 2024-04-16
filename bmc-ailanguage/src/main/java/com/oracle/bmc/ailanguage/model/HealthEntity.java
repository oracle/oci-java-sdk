/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Health entity object <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HealthEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HealthEntity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "offset",
        "length",
        "text",
        "type",
        "subType",
        "score",
        "category",
        "id",
        "assertions",
        "matchedConcepts"
    })
    public HealthEntity(
            Integer offset,
            Integer length,
            String text,
            String type,
            String subType,
            Double score,
            String category,
            String id,
            java.util.List<AssertionDetails> assertions,
            java.util.List<MelConcept> matchedConcepts) {
        super();
        this.offset = offset;
        this.length = length;
        this.text = text;
        this.type = type;
        this.subType = subType;
        this.score = score;
        this.category = category;
        this.id = id;
        this.assertions = assertions;
        this.matchedConcepts = matchedConcepts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of Unicode code points preceding this entity in the submitted text. */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * The number of Unicode code points preceding this entity in the submitted text.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /** Length of entity text */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * Length of entity text
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** Entity text like name of person, location, and so on. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Entity text like name of person, location, and so on.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Type of entity text like PER, LOC. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of entity text like PER, LOC.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Sub-type of entity text like GPE for LOCATION type */
        @com.fasterxml.jackson.annotation.JsonProperty("subType")
        private String subType;

        /**
         * Sub-type of entity text like GPE for LOCATION type
         *
         * @param subType the value to set
         * @return this builder
         */
        public Builder subType(String subType) {
            this.subType = subType;
            this.__explicitlySet__.add("subType");
            return this;
        }
        /** Score or confidence for detected entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence for detected entity.
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }
        /** Entity category e.g, MEDICAL_CONDITION, MEDICATION, GENERAL, ANATOMY */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Entity category e.g, MEDICAL_CONDITION, MEDICATION, GENERAL, ANATOMY
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** Unique id of the entity */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique id of the entity
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** list of all assertions associated with this entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("assertions")
        private java.util.List<AssertionDetails> assertions;

        /**
         * list of all assertions associated with this entity.
         *
         * @param assertions the value to set
         * @return this builder
         */
        public Builder assertions(java.util.List<AssertionDetails> assertions) {
            this.assertions = assertions;
            this.__explicitlySet__.add("assertions");
            return this;
        }
        /**
         * This contains the list of matched concepts which are ranked by the relevant score with
         * the input text
         */
        @com.fasterxml.jackson.annotation.JsonProperty("matchedConcepts")
        private java.util.List<MelConcept> matchedConcepts;

        /**
         * This contains the list of matched concepts which are ranked by the relevant score with
         * the input text
         *
         * @param matchedConcepts the value to set
         * @return this builder
         */
        public Builder matchedConcepts(java.util.List<MelConcept> matchedConcepts) {
            this.matchedConcepts = matchedConcepts;
            this.__explicitlySet__.add("matchedConcepts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthEntity build() {
            HealthEntity model =
                    new HealthEntity(
                            this.offset,
                            this.length,
                            this.text,
                            this.type,
                            this.subType,
                            this.score,
                            this.category,
                            this.id,
                            this.assertions,
                            this.matchedConcepts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthEntity model) {
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("subType")) {
                this.subType(model.getSubType());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("assertions")) {
                this.assertions(model.getAssertions());
            }
            if (model.wasPropertyExplicitlySet("matchedConcepts")) {
                this.matchedConcepts(model.getMatchedConcepts());
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

    /** The number of Unicode code points preceding this entity in the submitted text. */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * The number of Unicode code points preceding this entity in the submitted text.
     *
     * @return the value
     */
    public Integer getOffset() {
        return offset;
    }

    /** Length of entity text */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * Length of entity text
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
    }

    /** Entity text like name of person, location, and so on. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Entity text like name of person, location, and so on.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Type of entity text like PER, LOC. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of entity text like PER, LOC.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Sub-type of entity text like GPE for LOCATION type */
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    private final String subType;

    /**
     * Sub-type of entity text like GPE for LOCATION type
     *
     * @return the value
     */
    public String getSubType() {
        return subType;
    }

    /** Score or confidence for detected entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence for detected entity.
     *
     * @return the value
     */
    public Double getScore() {
        return score;
    }

    /** Entity category e.g, MEDICAL_CONDITION, MEDICATION, GENERAL, ANATOMY */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Entity category e.g, MEDICAL_CONDITION, MEDICATION, GENERAL, ANATOMY
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** Unique id of the entity */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique id of the entity
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** list of all assertions associated with this entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("assertions")
    private final java.util.List<AssertionDetails> assertions;

    /**
     * list of all assertions associated with this entity.
     *
     * @return the value
     */
    public java.util.List<AssertionDetails> getAssertions() {
        return assertions;
    }

    /**
     * This contains the list of matched concepts which are ranked by the relevant score with the
     * input text
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchedConcepts")
    private final java.util.List<MelConcept> matchedConcepts;

    /**
     * This contains the list of matched concepts which are ranked by the relevant score with the
     * input text
     *
     * @return the value
     */
    public java.util.List<MelConcept> getMatchedConcepts() {
        return matchedConcepts;
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
        sb.append("HealthEntity(");
        sb.append("super=").append(super.toString());
        sb.append("offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", subType=").append(String.valueOf(this.subType));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", assertions=").append(String.valueOf(this.assertions));
        sb.append(", matchedConcepts=").append(String.valueOf(this.matchedConcepts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthEntity)) {
            return false;
        }

        HealthEntity other = (HealthEntity) o;
        return java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.assertions, other.assertions)
                && java.util.Objects.equals(this.matchedConcepts, other.matchedConcepts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.assertions == null ? 43 : this.assertions.hashCode());
        result =
                (result * PRIME)
                        + (this.matchedConcepts == null ? 43 : this.matchedConcepts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
