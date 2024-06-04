/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * A section of the generated response which cites the documents that were used for generating the
 * response. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Citation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Citation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"start", "end", "text", "documentIds"})
    public Citation(Integer start, Integer end, String text, java.util.List<String> documentIds) {
        super();
        this.start = start;
        this.end = end;
        this.text = text;
        this.documentIds = documentIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Counting from zero, the index of the text where the citation starts. */
        @com.fasterxml.jackson.annotation.JsonProperty("start")
        private Integer start;

        /**
         * Counting from zero, the index of the text where the citation starts.
         *
         * @param start the value to set
         * @return this builder
         */
        public Builder start(Integer start) {
            this.start = start;
            this.__explicitlySet__.add("start");
            return this;
        }
        /** Counting from zero, the index of the text that the citation ends after. */
        @com.fasterxml.jackson.annotation.JsonProperty("end")
        private Integer end;

        /**
         * Counting from zero, the index of the text that the citation ends after.
         *
         * @param end the value to set
         * @return this builder
         */
        public Builder end(Integer end) {
            this.end = end;
            this.__explicitlySet__.add("end");
            return this;
        }
        /** The text of the citation. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The text of the citation.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** Identifiers for the documents cited in the current generated response. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentIds")
        private java.util.List<String> documentIds;

        /**
         * Identifiers for the documents cited in the current generated response.
         *
         * @param documentIds the value to set
         * @return this builder
         */
        public Builder documentIds(java.util.List<String> documentIds) {
            this.documentIds = documentIds;
            this.__explicitlySet__.add("documentIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Citation build() {
            Citation model = new Citation(this.start, this.end, this.text, this.documentIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Citation model) {
            if (model.wasPropertyExplicitlySet("start")) {
                this.start(model.getStart());
            }
            if (model.wasPropertyExplicitlySet("end")) {
                this.end(model.getEnd());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("documentIds")) {
                this.documentIds(model.getDocumentIds());
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

    /** Counting from zero, the index of the text where the citation starts. */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    private final Integer start;

    /**
     * Counting from zero, the index of the text where the citation starts.
     *
     * @return the value
     */
    public Integer getStart() {
        return start;
    }

    /** Counting from zero, the index of the text that the citation ends after. */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    private final Integer end;

    /**
     * Counting from zero, the index of the text that the citation ends after.
     *
     * @return the value
     */
    public Integer getEnd() {
        return end;
    }

    /** The text of the citation. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The text of the citation.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** Identifiers for the documents cited in the current generated response. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentIds")
    private final java.util.List<String> documentIds;

    /**
     * Identifiers for the documents cited in the current generated response.
     *
     * @return the value
     */
    public java.util.List<String> getDocumentIds() {
        return documentIds;
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
        sb.append("Citation(");
        sb.append("super=").append(super.toString());
        sb.append("start=").append(String.valueOf(this.start));
        sb.append(", end=").append(String.valueOf(this.end));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", documentIds=").append(String.valueOf(this.documentIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Citation)) {
            return false;
        }

        Citation other = (Citation) o;
        return java.util.Objects.equals(this.start, other.start)
                && java.util.Objects.equals(this.end, other.end)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.documentIds, other.documentIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.documentIds == null ? 43 : this.documentIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
