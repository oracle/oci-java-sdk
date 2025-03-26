/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The MEL concepts details for health ner.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MelConcept.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MelConcept extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ontologyName", "concepts"})
    public MelConcept(String ontologyName, java.util.List<MelConceptDetails> concepts) {
        super();
        this.ontologyName = ontologyName;
        this.concepts = concepts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the ontology to which the Entity is mapped
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ontologyName")
        private String ontologyName;

        /**
         * Name of the ontology to which the Entity is mapped
         * @param ontologyName the value to set
         * @return this builder
         **/
        public Builder ontologyName(String ontologyName) {
            this.ontologyName = ontologyName;
            this.__explicitlySet__.add("ontologyName");
            return this;
        }
        /**
         * This contains the list of matched concepts which are ranked by the relevant score with the input text
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("concepts")
        private java.util.List<MelConceptDetails> concepts;

        /**
         * This contains the list of matched concepts which are ranked by the relevant score with the input text
         * @param concepts the value to set
         * @return this builder
         **/
        public Builder concepts(java.util.List<MelConceptDetails> concepts) {
            this.concepts = concepts;
            this.__explicitlySet__.add("concepts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MelConcept build() {
            MelConcept model = new MelConcept(this.ontologyName, this.concepts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MelConcept model) {
            if (model.wasPropertyExplicitlySet("ontologyName")) {
                this.ontologyName(model.getOntologyName());
            }
            if (model.wasPropertyExplicitlySet("concepts")) {
                this.concepts(model.getConcepts());
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
     * Name of the ontology to which the Entity is mapped
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyName")
    private final String ontologyName;

    /**
     * Name of the ontology to which the Entity is mapped
     * @return the value
     **/
    public String getOntologyName() {
        return ontologyName;
    }

    /**
     * This contains the list of matched concepts which are ranked by the relevant score with the input text
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("concepts")
    private final java.util.List<MelConceptDetails> concepts;

    /**
     * This contains the list of matched concepts which are ranked by the relevant score with the input text
     * @return the value
     **/
    public java.util.List<MelConceptDetails> getConcepts() {
        return concepts;
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
        sb.append("MelConcept(");
        sb.append("super=").append(super.toString());
        sb.append("ontologyName=").append(String.valueOf(this.ontologyName));
        sb.append(", concepts=").append(String.valueOf(this.concepts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MelConcept)) {
            return false;
        }

        MelConcept other = (MelConcept) o;
        return java.util.Objects.equals(this.ontologyName, other.ontologyName)
                && java.util.Objects.equals(this.concepts, other.concepts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ontologyName == null ? 43 : this.ontologyName.hashCode());
        result = (result * PRIME) + (this.concepts == null ? 43 : this.concepts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
