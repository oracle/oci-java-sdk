/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The MEL concepts details for health ner. <br>
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
        builder = MelConceptDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MelConceptDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "score", "attributes"})
    public MelConceptDetails(
            String id, String name, Double score, java.util.Map<String, String> attributes) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
        this.attributes = attributes;
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
        /** The matched concept name/description on the ontology */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The matched concept name/description on the ontology
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The relevant score between the concept and the input text */
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * The relevant score between the concept and the input text
         *
         * @param score the value to set
         * @return this builder
         */
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }
        /**
         * additional attribute values specific to ontology for ex. for SNOMED semantic_type and for
         * for ICD-10 default_charge_code etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.Map<String, String> attributes;

        /**
         * additional attribute values specific to ontology for ex. for SNOMED semantic_type and for
         * for ICD-10 default_charge_code etc.
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.Map<String, String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MelConceptDetails build() {
            MelConceptDetails model =
                    new MelConceptDetails(this.id, this.name, this.score, this.attributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MelConceptDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
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

    /** The matched concept name/description on the ontology */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The matched concept name/description on the ontology
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The relevant score between the concept and the input text */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * The relevant score between the concept and the input text
     *
     * @return the value
     */
    public Double getScore() {
        return score;
    }

    /**
     * additional attribute values specific to ontology for ex. for SNOMED semantic_type and for for
     * ICD-10 default_charge_code etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.Map<String, String> attributes;

    /**
     * additional attribute values specific to ontology for ex. for SNOMED semantic_type and for for
     * ICD-10 default_charge_code etc.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
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
        sb.append("MelConceptDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MelConceptDetails)) {
            return false;
        }

        MelConceptDetails other = (MelConceptDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.score, other.score)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
