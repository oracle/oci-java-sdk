/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of translation call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BatchLanguageTranslationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BatchLanguageTranslationResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"documents", "errors"})
    public BatchLanguageTranslationResult(
            java.util.List<TranslationDocumentResult> documents,
            java.util.List<DocumentError> errors) {
        super();
        this.documents = documents;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of succeeded document response. */
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<TranslationDocumentResult> documents;

        /**
         * List of succeeded document response.
         *
         * @param documents the value to set
         * @return this builder
         */
        public Builder documents(java.util.List<TranslationDocumentResult> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /** List of failed document response. */
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<DocumentError> errors;

        /**
         * List of failed document response.
         *
         * @param errors the value to set
         * @return this builder
         */
        public Builder errors(java.util.List<DocumentError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchLanguageTranslationResult build() {
            BatchLanguageTranslationResult model =
                    new BatchLanguageTranslationResult(this.documents, this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchLanguageTranslationResult model) {
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
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

    /** List of succeeded document response. */
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<TranslationDocumentResult> documents;

    /**
     * List of succeeded document response.
     *
     * @return the value
     */
    public java.util.List<TranslationDocumentResult> getDocuments() {
        return documents;
    }

    /** List of failed document response. */
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<DocumentError> errors;

    /**
     * List of failed document response.
     *
     * @return the value
     */
    public java.util.List<DocumentError> getErrors() {
        return errors;
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
        sb.append("BatchLanguageTranslationResult(");
        sb.append("super=").append(super.toString());
        sb.append("documents=").append(String.valueOf(this.documents));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchLanguageTranslationResult)) {
            return false;
        }

        BatchLanguageTranslationResult other = (BatchLanguageTranslationResult) o;
        return java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
