/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * training model details
 * For this release only one model is allowed to be input here.
 * One of the three modelType, ModelId, endpointId should be given other wise error will be thrown from API
 *
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
    builder = ModelMetadataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelMetadataDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "modelType",
        "modelId",
        "endpointId",
        "languageCode",
        "configuration"
    })
    public ModelMetadataDetails(
            String modelType,
            String modelId,
            String endpointId,
            String languageCode,
            java.util.Map<String, ConfigurationDetails> configuration) {
        super();
        this.modelType = modelType;
        this.modelId = modelId;
        this.endpointId = endpointId;
        this.languageCode = languageCode;
        this.configuration = configuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * model type to used for inference allowed values are
         * - LANGUAGE_SENTIMENT_ANALYSIS
         * - LANGUAGE_DETECTION
         * - TEXT_CLASSIFICATION
         * - NAMED_ENTITY_RECOGNITION
         * - KEY_PHRASE_EXTRACTION
         * - LANGUAGE_PII_ENTITIES
         * - LANGUAGE_TRANSLATION
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * model type to used for inference allowed values are
         * - LANGUAGE_SENTIMENT_ANALYSIS
         * - LANGUAGE_DETECTION
         * - TEXT_CLASSIFICATION
         * - NAMED_ENTITY_RECOGNITION
         * - KEY_PHRASE_EXTRACTION
         * - LANGUAGE_PII_ENTITIES
         * - LANGUAGE_TRANSLATION
         *
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * Unique identifier model OCID that should be used for inference
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * Unique identifier model OCID that should be used for inference
         * @param modelId the value to set
         * @return this builder
         **/
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * Unique identifier endpoint OCID that should be used for inference
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * Unique identifier endpoint OCID that should be used for inference
         * @param endpointId the value to set
         * @return this builder
         **/
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /**
         * Language code supported
         * - auto : Automatically detect language
         * - ar : Arabic
         * - pt-BR : Brazilian Portuguese
         * - cs : Czech
         * - da : Danish
         * - nl : Dutch
         * - en : English
         * - fi : Finnish
         * - fr : French
         * - fr-CA : Canadian French
         * - de : German
         * - it : Italian
         * - ja : Japanese
         * - ko : Korean
         * - no : Norwegian
         * - pl : Polish
         * - ro : Romanian
         * - zh-CN : Simplified Chinese
         * - es : Spanish
         * - sv : Swedish
         * - zh-TW : Traditional Chinese
         * - tr : Turkish
         * - el : Greek
         * - he : Hebrew
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language code supported
         * - auto : Automatically detect language
         * - ar : Arabic
         * - pt-BR : Brazilian Portuguese
         * - cs : Czech
         * - da : Danish
         * - nl : Dutch
         * - en : English
         * - fi : Finnish
         * - fr : French
         * - fr-CA : Canadian French
         * - de : German
         * - it : Italian
         * - ja : Japanese
         * - ko : Korean
         * - no : Norwegian
         * - pl : Polish
         * - ro : Romanian
         * - zh-CN : Simplified Chinese
         * - es : Spanish
         * - sv : Swedish
         * - zh-TW : Traditional Chinese
         * - tr : Turkish
         * - el : Greek
         * - he : Hebrew
         *
         * @param languageCode the value to set
         * @return this builder
         **/
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /**
         * model configuration details
         * For PII :  < ENTITY_TYPE , ConfigurationDetails>
         * ex."ORACLE":{ "mode" : "MASK","maskingCharacter" : "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true  }
         * For language translation : { "targetLanguageCodes" : ConfigurationDetails}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, ConfigurationDetails> configuration;

        /**
         * model configuration details
         * For PII :  < ENTITY_TYPE , ConfigurationDetails>
         * ex."ORACLE":{ "mode" : "MASK","maskingCharacter" : "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true  }
         * For language translation : { "targetLanguageCodes" : ConfigurationDetails}
         *
         * @param configuration the value to set
         * @return this builder
         **/
        public Builder configuration(java.util.Map<String, ConfigurationDetails> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelMetadataDetails build() {
            ModelMetadataDetails model =
                    new ModelMetadataDetails(
                            this.modelType,
                            this.modelId,
                            this.endpointId,
                            this.languageCode,
                            this.configuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelMetadataDetails model) {
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
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
     * model type to used for inference allowed values are
     * - LANGUAGE_SENTIMENT_ANALYSIS
     * - LANGUAGE_DETECTION
     * - TEXT_CLASSIFICATION
     * - NAMED_ENTITY_RECOGNITION
     * - KEY_PHRASE_EXTRACTION
     * - LANGUAGE_PII_ENTITIES
     * - LANGUAGE_TRANSLATION
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * model type to used for inference allowed values are
     * - LANGUAGE_SENTIMENT_ANALYSIS
     * - LANGUAGE_DETECTION
     * - TEXT_CLASSIFICATION
     * - NAMED_ENTITY_RECOGNITION
     * - KEY_PHRASE_EXTRACTION
     * - LANGUAGE_PII_ENTITIES
     * - LANGUAGE_TRANSLATION
     *
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * Unique identifier model OCID that should be used for inference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * Unique identifier model OCID that should be used for inference
     * @return the value
     **/
    public String getModelId() {
        return modelId;
    }

    /**
     * Unique identifier endpoint OCID that should be used for inference
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * Unique identifier endpoint OCID that should be used for inference
     * @return the value
     **/
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Language code supported
     * - auto : Automatically detect language
     * - ar : Arabic
     * - pt-BR : Brazilian Portuguese
     * - cs : Czech
     * - da : Danish
     * - nl : Dutch
     * - en : English
     * - fi : Finnish
     * - fr : French
     * - fr-CA : Canadian French
     * - de : German
     * - it : Italian
     * - ja : Japanese
     * - ko : Korean
     * - no : Norwegian
     * - pl : Polish
     * - ro : Romanian
     * - zh-CN : Simplified Chinese
     * - es : Spanish
     * - sv : Swedish
     * - zh-TW : Traditional Chinese
     * - tr : Turkish
     * - el : Greek
     * - he : Hebrew
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language code supported
     * - auto : Automatically detect language
     * - ar : Arabic
     * - pt-BR : Brazilian Portuguese
     * - cs : Czech
     * - da : Danish
     * - nl : Dutch
     * - en : English
     * - fi : Finnish
     * - fr : French
     * - fr-CA : Canadian French
     * - de : German
     * - it : Italian
     * - ja : Japanese
     * - ko : Korean
     * - no : Norwegian
     * - pl : Polish
     * - ro : Romanian
     * - zh-CN : Simplified Chinese
     * - es : Spanish
     * - sv : Swedish
     * - zh-TW : Traditional Chinese
     * - tr : Turkish
     * - el : Greek
     * - he : Hebrew
     *
     * @return the value
     **/
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * model configuration details
     * For PII :  < ENTITY_TYPE , ConfigurationDetails>
     * ex."ORACLE":{ "mode" : "MASK","maskingCharacter" : "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true  }
     * For language translation : { "targetLanguageCodes" : ConfigurationDetails}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.Map<String, ConfigurationDetails> configuration;

    /**
     * model configuration details
     * For PII :  < ENTITY_TYPE , ConfigurationDetails>
     * ex."ORACLE":{ "mode" : "MASK","maskingCharacter" : "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true  }
     * For language translation : { "targetLanguageCodes" : ConfigurationDetails}
     *
     * @return the value
     **/
    public java.util.Map<String, ConfigurationDetails> getConfiguration() {
        return configuration;
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
        sb.append("ModelMetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelMetadataDetails)) {
            return false;
        }

        ModelMetadataDetails other = (ModelMetadataDetails) o;
        return java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
