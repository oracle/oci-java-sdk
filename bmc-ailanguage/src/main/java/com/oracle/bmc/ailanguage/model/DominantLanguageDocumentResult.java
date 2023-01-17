/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for language detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DominantLanguageDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DominantLanguageDocumentResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "languages"})
    public DominantLanguageDocumentResult(String key, java.util.List<DetectedLanguage> languages) {
        super();
        this.key = key;
        this.languages = languages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Document unique identifier defined by the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Document unique identifier defined by the user.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * List of detected languages with results sorted in descending order of the scores. Most likely language is on top.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languages")
        private java.util.List<DetectedLanguage> languages;

        /**
         * List of detected languages with results sorted in descending order of the scores. Most likely language is on top.
         *
         * @param languages the value to set
         * @return this builder
         **/
        public Builder languages(java.util.List<DetectedLanguage> languages) {
            this.languages = languages;
            this.__explicitlySet__.add("languages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DominantLanguageDocumentResult build() {
            DominantLanguageDocumentResult model =
                    new DominantLanguageDocumentResult(this.key, this.languages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DominantLanguageDocumentResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("languages")) {
                this.languages(model.getLanguages());
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
     * Document unique identifier defined by the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Document unique identifier defined by the user.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * List of detected languages with results sorted in descending order of the scores. Most likely language is on top.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languages")
    private final java.util.List<DetectedLanguage> languages;

    /**
     * List of detected languages with results sorted in descending order of the scores. Most likely language is on top.
     *
     * @return the value
     **/
    public java.util.List<DetectedLanguage> getLanguages() {
        return languages;
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
        sb.append("DominantLanguageDocumentResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", languages=").append(String.valueOf(this.languages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DominantLanguageDocumentResult)) {
            return false;
        }

        DominantLanguageDocumentResult other = (DominantLanguageDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.languages, other.languages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.languages == null ? 43 : this.languages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
