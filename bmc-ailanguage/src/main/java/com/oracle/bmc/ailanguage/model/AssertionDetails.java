/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The assertion details for health ner. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssertionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssertionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "value", "score"})
    public AssertionDetails(String id, String type, String value, Double score) {
        super();
        this.id = id;
        this.type = type;
        this.value = value;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** id of the relation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of the relation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** type of assertion ex, Status, Certainty, Temporality, Actor, etc. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * type of assertion ex, Status, Certainty, Temporality, Actor, etc.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Possible value for assertion type */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Possible value for assertion type
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Score or confidence for health detected entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence for health detected entity.
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

        public AssertionDetails build() {
            AssertionDetails model =
                    new AssertionDetails(this.id, this.type, this.value, this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssertionDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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

    /** id of the relation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of the relation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** type of assertion ex, Status, Certainty, Temporality, Actor, etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * type of assertion ex, Status, Certainty, Temporality, Actor, etc.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Possible value for assertion type */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Possible value for assertion type
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Score or confidence for health detected entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence for health detected entity.
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
        sb.append("AssertionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssertionDetails)) {
            return false;
        }

        AssertionDetails other = (AssertionDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
