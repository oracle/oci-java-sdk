/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for batch detect personal identification. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PiiEntityDocumentResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PiiEntityDocumentResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "entities", "maskedText", "languageCode"})
    public PiiEntityDocumentResult(
            String key,
            java.util.List<PiiEntity> entities,
            String maskedText,
            String languageCode) {
        super();
        this.key = key;
        this.entities = entities;
        this.maskedText = maskedText;
        this.languageCode = languageCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Document unique identifier defined by the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Document unique identifier defined by the user.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** List of batch detect personal identification. */
        @com.fasterxml.jackson.annotation.JsonProperty("entities")
        private java.util.List<PiiEntity> entities;

        /**
         * List of batch detect personal identification.
         *
         * @param entities the value to set
         * @return this builder
         */
        public Builder entities(java.util.List<PiiEntity> entities) {
            this.entities = entities;
            this.__explicitlySet__.add("entities");
            return this;
        }
        /** Masked text per given mask mode. */
        @com.fasterxml.jackson.annotation.JsonProperty("maskedText")
        private String maskedText;

        /**
         * Masked text per given mask mode.
         *
         * @param maskedText the value to set
         * @return this builder
         */
        public Builder maskedText(String maskedText) {
            this.maskedText = maskedText;
            this.__explicitlySet__.add("maskedText");
            return this;
        }
        /**
         * Language code per the [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)
         * standard.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code per the [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)
         * standard.
         *
         * @param languageCode the value to set
         * @return this builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PiiEntityDocumentResult build() {
            PiiEntityDocumentResult model =
                    new PiiEntityDocumentResult(
                            this.key, this.entities, this.maskedText, this.languageCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PiiEntityDocumentResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("entities")) {
                this.entities(model.getEntities());
            }
            if (model.wasPropertyExplicitlySet("maskedText")) {
                this.maskedText(model.getMaskedText());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
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

    /** Document unique identifier defined by the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Document unique identifier defined by the user.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** List of batch detect personal identification. */
    @com.fasterxml.jackson.annotation.JsonProperty("entities")
    private final java.util.List<PiiEntity> entities;

    /**
     * List of batch detect personal identification.
     *
     * @return the value
     */
    public java.util.List<PiiEntity> getEntities() {
        return entities;
    }

    /** Masked text per given mask mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("maskedText")
    private final String maskedText;

    /**
     * Masked text per given mask mode.
     *
     * @return the value
     */
    public String getMaskedText() {
        return maskedText;
    }

    /**
     * Language code per the [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)
     * standard.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code per the [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes)
     * standard.
     *
     * @return the value
     */
    public String getLanguageCode() {
        return languageCode;
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
        sb.append("PiiEntityDocumentResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", entities=").append(String.valueOf(this.entities));
        sb.append(", maskedText=").append(String.valueOf(this.maskedText));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiEntityDocumentResult)) {
            return false;
        }

        PiiEntityDocumentResult other = (PiiEntityDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.entities, other.entities)
                && java.util.Objects.equals(this.maskedText, other.maskedText)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.entities == null ? 43 : this.entities.hashCode());
        result = (result * PRIME) + (this.maskedText == null ? 43 : this.maskedText.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
