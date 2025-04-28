/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for translation call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TranslationDocumentResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TranslationDocumentResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "translatedText",
        "sourceLanguageCode",
        "targetLanguageCode"
    })
    public TranslationDocumentResult(
            String key,
            String translatedText,
            String sourceLanguageCode,
            String targetLanguageCode) {
        super();
        this.key = key;
        this.translatedText = translatedText;
        this.sourceLanguageCode = sourceLanguageCode;
        this.targetLanguageCode = targetLanguageCode;
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
        /** Translated text in selected target language. */
        @com.fasterxml.jackson.annotation.JsonProperty("translatedText")
        private String translatedText;

        /**
         * Translated text in selected target language.
         *
         * @param translatedText the value to set
         * @return this builder
         */
        public Builder translatedText(String translatedText) {
            this.translatedText = translatedText;
            this.__explicitlySet__.add("translatedText");
            return this;
        }
        /**
         * Language code supported Automatically detect language - auto Arabic - ar Brazilian
         * Portuguese - pt-BR Canadian French - fr-CA Croatian - hr Czech - cs Danish - da Dutch -
         * nl English - en Finnish - fi French - fr German - de Greek - el Hebrew - he Hungarian -
         * hu Italian - it Japanese - ja Korean - ko Norwegian - no Polish - pl Portuguese - pt
         * Romanian - ro Russian - ru Simplified Chinese - zh-CN Slovak - sk Slovenian - sl Spanish
         * - es Swedish - sv Thai - th Traditional Chinese - zh-TW Turkish - tr Vietnamese - vi
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceLanguageCode")
        private String sourceLanguageCode;

        /**
         * Language code supported Automatically detect language - auto Arabic - ar Brazilian
         * Portuguese - pt-BR Canadian French - fr-CA Croatian - hr Czech - cs Danish - da Dutch -
         * nl English - en Finnish - fi French - fr German - de Greek - el Hebrew - he Hungarian -
         * hu Italian - it Japanese - ja Korean - ko Norwegian - no Polish - pl Portuguese - pt
         * Romanian - ro Russian - ru Simplified Chinese - zh-CN Slovak - sk Slovenian - sl Spanish
         * - es Swedish - sv Thai - th Traditional Chinese - zh-TW Turkish - tr Vietnamese - vi
         *
         * @param sourceLanguageCode the value to set
         * @return this builder
         */
        public Builder sourceLanguageCode(String sourceLanguageCode) {
            this.sourceLanguageCode = sourceLanguageCode;
            this.__explicitlySet__.add("sourceLanguageCode");
            return this;
        }
        /**
         * Language code supported Arabic - ar Brazilian Portuguese - pt-BR Canadian French - fr-CA
         * Croatian - hr Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr
         * German - de Greek - el Hebrew - he Hungarian - hu Italian - it Japanese - ja Korean - ko
         * Norwegian - no Polish - pl Portuguese - pt Romanian - ro Russian - ru Simplified Chinese
         * - zh-CN Slovak - sk Slovenian - sl Spanish - es Swedish - sv Thai - th Traditional
         * Chinese - zh-TW Turkish - tr Vietnamese - vi
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetLanguageCode")
        private String targetLanguageCode;

        /**
         * Language code supported Arabic - ar Brazilian Portuguese - pt-BR Canadian French - fr-CA
         * Croatian - hr Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr
         * German - de Greek - el Hebrew - he Hungarian - hu Italian - it Japanese - ja Korean - ko
         * Norwegian - no Polish - pl Portuguese - pt Romanian - ro Russian - ru Simplified Chinese
         * - zh-CN Slovak - sk Slovenian - sl Spanish - es Swedish - sv Thai - th Traditional
         * Chinese - zh-TW Turkish - tr Vietnamese - vi
         *
         * @param targetLanguageCode the value to set
         * @return this builder
         */
        public Builder targetLanguageCode(String targetLanguageCode) {
            this.targetLanguageCode = targetLanguageCode;
            this.__explicitlySet__.add("targetLanguageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TranslationDocumentResult build() {
            TranslationDocumentResult model =
                    new TranslationDocumentResult(
                            this.key,
                            this.translatedText,
                            this.sourceLanguageCode,
                            this.targetLanguageCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TranslationDocumentResult model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("translatedText")) {
                this.translatedText(model.getTranslatedText());
            }
            if (model.wasPropertyExplicitlySet("sourceLanguageCode")) {
                this.sourceLanguageCode(model.getSourceLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("targetLanguageCode")) {
                this.targetLanguageCode(model.getTargetLanguageCode());
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

    /** Translated text in selected target language. */
    @com.fasterxml.jackson.annotation.JsonProperty("translatedText")
    private final String translatedText;

    /**
     * Translated text in selected target language.
     *
     * @return the value
     */
    public String getTranslatedText() {
        return translatedText;
    }

    /**
     * Language code supported Automatically detect language - auto Arabic - ar Brazilian Portuguese
     * - pt-BR Canadian French - fr-CA Croatian - hr Czech - cs Danish - da Dutch - nl English - en
     * Finnish - fi French - fr German - de Greek - el Hebrew - he Hungarian - hu Italian - it
     * Japanese - ja Korean - ko Norwegian - no Polish - pl Portuguese - pt Romanian - ro Russian -
     * ru Simplified Chinese - zh-CN Slovak - sk Slovenian - sl Spanish - es Swedish - sv Thai - th
     * Traditional Chinese - zh-TW Turkish - tr Vietnamese - vi
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceLanguageCode")
    private final String sourceLanguageCode;

    /**
     * Language code supported Automatically detect language - auto Arabic - ar Brazilian Portuguese
     * - pt-BR Canadian French - fr-CA Croatian - hr Czech - cs Danish - da Dutch - nl English - en
     * Finnish - fi French - fr German - de Greek - el Hebrew - he Hungarian - hu Italian - it
     * Japanese - ja Korean - ko Norwegian - no Polish - pl Portuguese - pt Romanian - ro Russian -
     * ru Simplified Chinese - zh-CN Slovak - sk Slovenian - sl Spanish - es Swedish - sv Thai - th
     * Traditional Chinese - zh-TW Turkish - tr Vietnamese - vi
     *
     * @return the value
     */
    public String getSourceLanguageCode() {
        return sourceLanguageCode;
    }

    /**
     * Language code supported Arabic - ar Brazilian Portuguese - pt-BR Canadian French - fr-CA
     * Croatian - hr Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr German
     * - de Greek - el Hebrew - he Hungarian - hu Italian - it Japanese - ja Korean - ko Norwegian -
     * no Polish - pl Portuguese - pt Romanian - ro Russian - ru Simplified Chinese - zh-CN Slovak -
     * sk Slovenian - sl Spanish - es Swedish - sv Thai - th Traditional Chinese - zh-TW Turkish -
     * tr Vietnamese - vi
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetLanguageCode")
    private final String targetLanguageCode;

    /**
     * Language code supported Arabic - ar Brazilian Portuguese - pt-BR Canadian French - fr-CA
     * Croatian - hr Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr German
     * - de Greek - el Hebrew - he Hungarian - hu Italian - it Japanese - ja Korean - ko Norwegian -
     * no Polish - pl Portuguese - pt Romanian - ro Russian - ru Simplified Chinese - zh-CN Slovak -
     * sk Slovenian - sl Spanish - es Swedish - sv Thai - th Traditional Chinese - zh-TW Turkish -
     * tr Vietnamese - vi
     *
     * @return the value
     */
    public String getTargetLanguageCode() {
        return targetLanguageCode;
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
        sb.append("TranslationDocumentResult(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", translatedText=").append(String.valueOf(this.translatedText));
        sb.append(", sourceLanguageCode=").append(String.valueOf(this.sourceLanguageCode));
        sb.append(", targetLanguageCode=").append(String.valueOf(this.targetLanguageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TranslationDocumentResult)) {
            return false;
        }

        TranslationDocumentResult other = (TranslationDocumentResult) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.translatedText, other.translatedText)
                && java.util.Objects.equals(this.sourceLanguageCode, other.sourceLanguageCode)
                && java.util.Objects.equals(this.targetLanguageCode, other.targetLanguageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.translatedText == null ? 43 : this.translatedText.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceLanguageCode == null
                                ? 43
                                : this.sourceLanguageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.targetLanguageCode == null
                                ? 43
                                : this.targetLanguageCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
