/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * An object that contains a relevance score, an index and the text for a document. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DocumentRank.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DocumentRank extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"index", "relevanceScore", "document"})
    public DocumentRank(Integer index, Double relevanceScore, Document document) {
        super();
        this.index = index;
        this.relevanceScore = relevanceScore;
        this.document = document;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Index of the document in documents array. */
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        /**
         * Index of the document in documents array.
         *
         * @param index the value to set
         * @return this builder
         */
        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }
        /** The relevance score for the document at that index. */
        @com.fasterxml.jackson.annotation.JsonProperty("relevanceScore")
        private Double relevanceScore;

        /**
         * The relevance score for the document at that index.
         *
         * @param relevanceScore the value to set
         * @return this builder
         */
        public Builder relevanceScore(Double relevanceScore) {
            this.relevanceScore = relevanceScore;
            this.__explicitlySet__.add("relevanceScore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("document")
        private Document document;

        public Builder document(Document document) {
            this.document = document;
            this.__explicitlySet__.add("document");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentRank build() {
            DocumentRank model = new DocumentRank(this.index, this.relevanceScore, this.document);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentRank model) {
            if (model.wasPropertyExplicitlySet("index")) {
                this.index(model.getIndex());
            }
            if (model.wasPropertyExplicitlySet("relevanceScore")) {
                this.relevanceScore(model.getRelevanceScore());
            }
            if (model.wasPropertyExplicitlySet("document")) {
                this.document(model.getDocument());
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

    /** Index of the document in documents array. */
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    private final Integer index;

    /**
     * Index of the document in documents array.
     *
     * @return the value
     */
    public Integer getIndex() {
        return index;
    }

    /** The relevance score for the document at that index. */
    @com.fasterxml.jackson.annotation.JsonProperty("relevanceScore")
    private final Double relevanceScore;

    /**
     * The relevance score for the document at that index.
     *
     * @return the value
     */
    public Double getRelevanceScore() {
        return relevanceScore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("document")
    private final Document document;

    public Document getDocument() {
        return document;
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
        sb.append("DocumentRank(");
        sb.append("super=").append(super.toString());
        sb.append("index=").append(String.valueOf(this.index));
        sb.append(", relevanceScore=").append(String.valueOf(this.relevanceScore));
        sb.append(", document=").append(String.valueOf(this.document));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentRank)) {
            return false;
        }

        DocumentRank other = (DocumentRank) o;
        return java.util.Objects.equals(this.index, other.index)
                && java.util.Objects.equals(this.relevanceScore, other.relevanceScore)
                && java.util.Objects.equals(this.document, other.document)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.index == null ? 43 : this.index.hashCode());
        result =
                (result * PRIME)
                        + (this.relevanceScore == null ? 43 : this.relevanceScore.hashCode());
        result = (result * PRIME) + (this.document == null ? 43 : this.document.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
