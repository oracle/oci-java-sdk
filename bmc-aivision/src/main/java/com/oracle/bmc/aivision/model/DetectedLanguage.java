/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The language detected in a document.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DetectedLanguage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectedLanguage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"languageCode", "confidence"})
    public DetectedLanguage(DocumentLanguage languageCode, Float confidence) {
        super();
        this.languageCode = languageCode;
        this.confidence = confidence;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The language of the document, abbreviated according to ISO 639-2.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private DocumentLanguage languageCode;

        /**
         * The language of the document, abbreviated according to ISO 639-2.
         * @param languageCode the value to set
         * @return this builder
         **/
        public Builder languageCode(DocumentLanguage languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /**
         * The confidence score between 0 and 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score between 0 and 1.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectedLanguage build() {
            DetectedLanguage model = new DetectedLanguage(this.languageCode, this.confidence);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectedLanguage model) {
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
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
     * The language of the document, abbreviated according to ISO 639-2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final DocumentLanguage languageCode;

    /**
     * The language of the document, abbreviated according to ISO 639-2.
     * @return the value
     **/
    public DocumentLanguage getLanguageCode() {
        return languageCode;
    }

    /**
     * The confidence score between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score between 0 and 1.
     * @return the value
     **/
    public Float getConfidence() {
        return confidence;
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
        sb.append("DetectedLanguage(");
        sb.append("super=").append(super.toString());
        sb.append("languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectedLanguage)) {
            return false;
        }

        DetectedLanguage other = (DetectedLanguage) o;
        return java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
