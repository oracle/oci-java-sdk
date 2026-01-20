/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Represents a single instance of Chat Document content <br>
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
        builder = CohereDocumentContentV2.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CohereDocumentContentV2 extends CohereContentV2 {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Relevant information that could be used by the model to generate a more accurate reply.
         * The content of each document are generally short (should be under 300 words). Metadata
         * should be used to provide additional information, both the key name and the value will be
         * passed to the model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("document")
        private Object document;

        /**
         * Relevant information that could be used by the model to generate a more accurate reply.
         * The content of each document are generally short (should be under 300 words). Metadata
         * should be used to provide additional information, both the key name and the value will be
         * passed to the model.
         *
         * @param document the value to set
         * @return this builder
         */
        public Builder document(Object document) {
            this.document = document;
            this.__explicitlySet__.add("document");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereDocumentContentV2 build() {
            CohereDocumentContentV2 model = new CohereDocumentContentV2(this.document);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereDocumentContentV2 model) {
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

    @Deprecated
    public CohereDocumentContentV2(Object document) {
        super();
        this.document = document;
    }

    /**
     * Relevant information that could be used by the model to generate a more accurate reply. The
     * content of each document are generally short (should be under 300 words). Metadata should be
     * used to provide additional information, both the key name and the value will be passed to the
     * model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("document")
    private final Object document;

    /**
     * Relevant information that could be used by the model to generate a more accurate reply. The
     * content of each document are generally short (should be under 300 words). Metadata should be
     * used to provide additional information, both the key name and the value will be passed to the
     * model.
     *
     * @return the value
     */
    public Object getDocument() {
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
        sb.append("CohereDocumentContentV2(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", document=").append(String.valueOf(this.document));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereDocumentContentV2)) {
            return false;
        }

        CohereDocumentContentV2 other = (CohereDocumentContentV2) o;
        return java.util.Objects.equals(this.document, other.document) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.document == null ? 43 : this.document.hashCode());
        return result;
    }
}
