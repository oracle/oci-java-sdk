/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Possible model types <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = ModelDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedKeyPhraseExtractionModelDetails.class,
            name = "PRE_TRAINED_KEYPHRASE_EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedTranslationModelDetails.class,
            name = "PRE_TRAINED_TRANSLATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedHealthNluModelDetails.class,
            name = "PRE_TRAINED_HEALTH_NLU"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedUniversalModel.class,
            name = "PRE_TRAINED_UNIVERSAL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedLanguageDetectionModelDetails.class,
            name = "PRE_TRAINED_LANGUAGE_DETECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedSentimentAnalysisModelDetails.class,
            name = "PRE_TRAINED_SENTIMENT_ANALYSIS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TextClassificationModelDetails.class,
            name = "TEXT_CLASSIFICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HealthNluModelDetails.class,
            name = "HEALTH_NLU"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedSummarization.class,
            name = "PRE_TRAINED_SUMMARIZATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NamedEntityRecognitionModelDetails.class,
            name = "NAMED_ENTITY_RECOGNITION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PiiModelDetails.class,
            name = "PII"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedNamedEntityRecognitionModelDetails.class,
            name = "PRE_TRAINED_NAMED_ENTITY_RECOGNITION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedTextClassificationModelDetails.class,
            name = "PRE_TRAINED_TEXT_CLASSIFICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PreTrainedPiiModelDetails.class,
            name = "PRE_TRAINED_PII")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ModelDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"languageCode"})
    protected ModelDetails(String languageCode) {
        super();
        this.languageCode = languageCode;
    }

    /** supported language default value is en */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * supported language default value is en
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
        sb.append("ModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("languageCode=").append(String.valueOf(this.languageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDetails)) {
            return false;
        }

        ModelDetails other = (ModelDetails) o;
        return java.util.Objects.equals(this.languageCode, other.languageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Model type */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        NamedEntityRecognition("NAMED_ENTITY_RECOGNITION"),
        TextClassification("TEXT_CLASSIFICATION"),
        PreTrainedNamedEntityRecognition("PRE_TRAINED_NAMED_ENTITY_RECOGNITION"),
        PreTrainedTextClassification("PRE_TRAINED_TEXT_CLASSIFICATION"),
        PreTrainedSentimentAnalysis("PRE_TRAINED_SENTIMENT_ANALYSIS"),
        PreTrainedKeyphraseExtraction("PRE_TRAINED_KEYPHRASE_EXTRACTION"),
        PreTrainedLanguageDetection("PRE_TRAINED_LANGUAGE_DETECTION"),
        PreTrainedPii("PRE_TRAINED_PII"),
        PreTrainedHealthNlu("PRE_TRAINED_HEALTH_NLU"),
        PreTrainedSummarization("PRE_TRAINED_SUMMARIZATION"),
        PreTrainedUniversal("PRE_TRAINED_UNIVERSAL"),
        Pii("PII"),
        PreTrainedTranslation("PRE_TRAINED_TRANSLATION"),
        HealthNlu("HEALTH_NLU"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
