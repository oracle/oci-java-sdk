/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The source of information for the paragraph of agent's response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ParagraphCitation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParagraphCitation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"paragraph", "citations"})
    public ParagraphCitation(Paragraph paragraph, java.util.List<Citation> citations) {
        super();
        this.paragraph = paragraph;
        this.citations = citations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("paragraph")
        private Paragraph paragraph;

        public Builder paragraph(Paragraph paragraph) {
            this.paragraph = paragraph;
            this.__explicitlySet__.add("paragraph");
            return this;
        }
        /** A list of citations for the paragraph of the generated message. */
        @com.fasterxml.jackson.annotation.JsonProperty("citations")
        private java.util.List<Citation> citations;

        /**
         * A list of citations for the paragraph of the generated message.
         *
         * @param citations the value to set
         * @return this builder
         */
        public Builder citations(java.util.List<Citation> citations) {
            this.citations = citations;
            this.__explicitlySet__.add("citations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParagraphCitation build() {
            ParagraphCitation model = new ParagraphCitation(this.paragraph, this.citations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParagraphCitation model) {
            if (model.wasPropertyExplicitlySet("paragraph")) {
                this.paragraph(model.getParagraph());
            }
            if (model.wasPropertyExplicitlySet("citations")) {
                this.citations(model.getCitations());
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

    @com.fasterxml.jackson.annotation.JsonProperty("paragraph")
    private final Paragraph paragraph;

    public Paragraph getParagraph() {
        return paragraph;
    }

    /** A list of citations for the paragraph of the generated message. */
    @com.fasterxml.jackson.annotation.JsonProperty("citations")
    private final java.util.List<Citation> citations;

    /**
     * A list of citations for the paragraph of the generated message.
     *
     * @return the value
     */
    public java.util.List<Citation> getCitations() {
        return citations;
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
        sb.append("ParagraphCitation(");
        sb.append("super=").append(super.toString());
        sb.append("paragraph=").append(String.valueOf(this.paragraph));
        sb.append(", citations=").append(String.valueOf(this.citations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParagraphCitation)) {
            return false;
        }

        ParagraphCitation other = (ParagraphCitation) o;
        return java.util.Objects.equals(this.paragraph, other.paragraph)
                && java.util.Objects.equals(this.citations, other.citations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.paragraph == null ? 43 : this.paragraph.hashCode());
        result = (result * PRIME) + (this.citations == null ? 43 : this.citations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
