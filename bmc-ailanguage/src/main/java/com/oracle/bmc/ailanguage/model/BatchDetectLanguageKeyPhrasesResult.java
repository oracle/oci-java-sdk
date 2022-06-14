/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of keyPhrases detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BatchDetectLanguageKeyPhrasesResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BatchDetectLanguageKeyPhrasesResult {
    @Deprecated
    @java.beans.ConstructorProperties({"documents", "errors"})
    public BatchDetectLanguageKeyPhrasesResult(
            java.util.List<KeyPhraseDocumentResult> documents,
            java.util.List<DocumentError> errors) {
        super();
        this.documents = documents;
        this.errors = errors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of succeeded document response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<KeyPhraseDocumentResult> documents;

        /**
         * List of succeeded document response.
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<KeyPhraseDocumentResult> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /**
         * List of failed document response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<DocumentError> errors;

        /**
         * List of failed document response.
         * @param errors the value to set
         * @return this builder
         **/
        public Builder errors(java.util.List<DocumentError> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDetectLanguageKeyPhrasesResult build() {
            BatchDetectLanguageKeyPhrasesResult __instance__ =
                    new BatchDetectLanguageKeyPhrasesResult(documents, errors);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDetectLanguageKeyPhrasesResult o) {
            Builder copiedBuilder = documents(o.getDocuments()).errors(o.getErrors());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * List of succeeded document response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<KeyPhraseDocumentResult> documents;

    /**
     * List of succeeded document response.
     * @return the value
     **/
    public java.util.List<KeyPhraseDocumentResult> getDocuments() {
        return documents;
    }

    /**
     * List of failed document response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<DocumentError> errors;

    /**
     * List of failed document response.
     * @return the value
     **/
    public java.util.List<DocumentError> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectLanguageKeyPhrasesResult(");
        sb.append("documents=").append(String.valueOf(this.documents));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectLanguageKeyPhrasesResult)) {
            return false;
        }

        BatchDetectLanguageKeyPhrasesResult other = (BatchDetectLanguageKeyPhrasesResult) o;
        return java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.errors, other.errors)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
