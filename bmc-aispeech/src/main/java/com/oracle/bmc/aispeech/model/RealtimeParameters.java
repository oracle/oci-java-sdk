/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Parameters to be sent to the realtime speech service over a websocket connection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RealtimeParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RealtimeParameters extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "encoding",
        "isAckEnabled",
        "partialSilenceThresholdInMs",
        "finalSilenceThresholdInMs",
        "stabilizePartialResults",
        "modelDomain",
        "languageCode",
        "shouldIgnoreInvalidCustomizations",
        "customizations",
        "punctuation"
    })
    public RealtimeParameters(
            String encoding,
            Boolean isAckEnabled,
            Integer partialSilenceThresholdInMs,
            Integer finalSilenceThresholdInMs,
            StabilizePartialResults stabilizePartialResults,
            ModelDomain modelDomain,
            String languageCode,
            Boolean shouldIgnoreInvalidCustomizations,
            java.util.List<CustomizationInference> customizations,
            Punctuation punctuation) {
        super();
        this.encoding = encoding;
        this.isAckEnabled = isAckEnabled;
        this.partialSilenceThresholdInMs = partialSilenceThresholdInMs;
        this.finalSilenceThresholdInMs = finalSilenceThresholdInMs;
        this.stabilizePartialResults = stabilizePartialResults;
        this.modelDomain = modelDomain;
        this.languageCode = languageCode;
        this.shouldIgnoreInvalidCustomizations = shouldIgnoreInvalidCustomizations;
        this.customizations = customizations;
        this.punctuation = punctuation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Audio encoding to use
         * - audio/raw;rate=16000
         * - audio/raw;rate=8000
         * - audio/raw;rate=8000;codec=mulaw
         * - audio/raw;rate=8000;codec=alaw
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encoding")
        private String encoding;

        /**
         * Audio encoding to use
         * - audio/raw;rate=16000
         * - audio/raw;rate=8000
         * - audio/raw;rate=8000;codec=mulaw
         * - audio/raw;rate=8000;codec=alaw
         *
         * @param encoding the value to set
         * @return this builder
         **/
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            this.__explicitlySet__.add("encoding");
            return this;
        }
        /**
         * Toggle for ack messages.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAckEnabled")
        private Boolean isAckEnabled;

        /**
         * Toggle for ack messages.
         * @param isAckEnabled the value to set
         * @return this builder
         **/
        public Builder isAckEnabled(Boolean isAckEnabled) {
            this.isAckEnabled = isAckEnabled;
            this.__explicitlySet__.add("isAckEnabled");
            return this;
        }
        /**
         * Silence threshold for Realtime Speech partial results in milliseconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partialSilenceThresholdInMs")
        private Integer partialSilenceThresholdInMs;

        /**
         * Silence threshold for Realtime Speech partial results in milliseconds.
         * @param partialSilenceThresholdInMs the value to set
         * @return this builder
         **/
        public Builder partialSilenceThresholdInMs(Integer partialSilenceThresholdInMs) {
            this.partialSilenceThresholdInMs = partialSilenceThresholdInMs;
            this.__explicitlySet__.add("partialSilenceThresholdInMs");
            return this;
        }
        /**
         * Silence threshold for Realtime Speech final results in milliseconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("finalSilenceThresholdInMs")
        private Integer finalSilenceThresholdInMs;

        /**
         * Silence threshold for Realtime Speech final results in milliseconds.
         * @param finalSilenceThresholdInMs the value to set
         * @return this builder
         **/
        public Builder finalSilenceThresholdInMs(Integer finalSilenceThresholdInMs) {
            this.finalSilenceThresholdInMs = finalSilenceThresholdInMs;
            this.__explicitlySet__.add("finalSilenceThresholdInMs");
            return this;
        }
        /**
         * When enabled sets the amount of confidence required for latest tokens before returning them as part of a new partial result
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stabilizePartialResults")
        private StabilizePartialResults stabilizePartialResults;

        /**
         * When enabled sets the amount of confidence required for latest tokens before returning them as part of a new partial result
         * @param stabilizePartialResults the value to set
         * @return this builder
         **/
        public Builder stabilizePartialResults(StabilizePartialResults stabilizePartialResults) {
            this.stabilizePartialResults = stabilizePartialResults;
            this.__explicitlySet__.add("stabilizePartialResults");
            return this;
        }
        /**
         * Model Domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelDomain")
        private ModelDomain modelDomain;

        /**
         * Model Domain.
         * @param modelDomain the value to set
         * @return this builder
         **/
        public Builder modelDomain(ModelDomain modelDomain) {
            this.modelDomain = modelDomain;
            this.__explicitlySet__.add("modelDomain");
            return this;
        }
        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646].
         * - en-US: English - United States
         * - es-ES: Spanish - Spain
         * - pt-BR: Portuguese - Brazil
         * - en-GB: English - Great Britain
         * - en-AU: English - Australia
         * - en-IN: English - India
         * - hi-IN: Hindi - India
         * - fr-FR: French - France
         * - de-DE: German - Germany
         * - it-IT: Italian - Italy
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646].
         * - en-US: English - United States
         * - es-ES: Spanish - Spain
         * - pt-BR: Portuguese - Brazil
         * - en-GB: English - Great Britain
         * - en-AU: English - Australia
         * - en-IN: English - India
         * - hi-IN: Hindi - India
         * - fr-FR: French - France
         * - de-DE: German - Germany
         * - it-IT: Italian - Italy
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
         * If set to true, the service will not fail connection attempt if it encounters any issues that prevent the loading of all specified user customizations. Any invalid customizations will simply be ignored and connection will continue being established with the default base model and any remaining valid customizations.
         * If set to false, if the service is unable to load any of the specified customizations, an error detailing why will be returned and the session will end.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIgnoreInvalidCustomizations")
        private Boolean shouldIgnoreInvalidCustomizations;

        /**
         * If set to true, the service will not fail connection attempt if it encounters any issues that prevent the loading of all specified user customizations. Any invalid customizations will simply be ignored and connection will continue being established with the default base model and any remaining valid customizations.
         * If set to false, if the service is unable to load any of the specified customizations, an error detailing why will be returned and the session will end.
         *
         * @param shouldIgnoreInvalidCustomizations the value to set
         * @return this builder
         **/
        public Builder shouldIgnoreInvalidCustomizations(
                Boolean shouldIgnoreInvalidCustomizations) {
            this.shouldIgnoreInvalidCustomizations = shouldIgnoreInvalidCustomizations;
            this.__explicitlySet__.add("shouldIgnoreInvalidCustomizations");
            return this;
        }
        /**
         * Array of customization objects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customizations")
        private java.util.List<CustomizationInference> customizations;

        /**
         * Array of customization objects.
         * @param customizations the value to set
         * @return this builder
         **/
        public Builder customizations(java.util.List<CustomizationInference> customizations) {
            this.customizations = customizations;
            this.__explicitlySet__.add("customizations");
            return this;
        }
        /**
         * Configure punctuations in the generated transcriptions. Disabled by default.
         * - NONE: No punctuation in the transcription response
         * - SPOKEN: Punctuations in response only when verbally spoken
         * - AUTO: Automatic punctuation in the response, spoken punctuations are disabled
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("punctuation")
        private Punctuation punctuation;

        /**
         * Configure punctuations in the generated transcriptions. Disabled by default.
         * - NONE: No punctuation in the transcription response
         * - SPOKEN: Punctuations in response only when verbally spoken
         * - AUTO: Automatic punctuation in the response, spoken punctuations are disabled
         *
         * @param punctuation the value to set
         * @return this builder
         **/
        public Builder punctuation(Punctuation punctuation) {
            this.punctuation = punctuation;
            this.__explicitlySet__.add("punctuation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeParameters build() {
            RealtimeParameters model =
                    new RealtimeParameters(
                            this.encoding,
                            this.isAckEnabled,
                            this.partialSilenceThresholdInMs,
                            this.finalSilenceThresholdInMs,
                            this.stabilizePartialResults,
                            this.modelDomain,
                            this.languageCode,
                            this.shouldIgnoreInvalidCustomizations,
                            this.customizations,
                            this.punctuation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeParameters model) {
            if (model.wasPropertyExplicitlySet("encoding")) {
                this.encoding(model.getEncoding());
            }
            if (model.wasPropertyExplicitlySet("isAckEnabled")) {
                this.isAckEnabled(model.getIsAckEnabled());
            }
            if (model.wasPropertyExplicitlySet("partialSilenceThresholdInMs")) {
                this.partialSilenceThresholdInMs(model.getPartialSilenceThresholdInMs());
            }
            if (model.wasPropertyExplicitlySet("finalSilenceThresholdInMs")) {
                this.finalSilenceThresholdInMs(model.getFinalSilenceThresholdInMs());
            }
            if (model.wasPropertyExplicitlySet("stabilizePartialResults")) {
                this.stabilizePartialResults(model.getStabilizePartialResults());
            }
            if (model.wasPropertyExplicitlySet("modelDomain")) {
                this.modelDomain(model.getModelDomain());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("shouldIgnoreInvalidCustomizations")) {
                this.shouldIgnoreInvalidCustomizations(
                        model.getShouldIgnoreInvalidCustomizations());
            }
            if (model.wasPropertyExplicitlySet("customizations")) {
                this.customizations(model.getCustomizations());
            }
            if (model.wasPropertyExplicitlySet("punctuation")) {
                this.punctuation(model.getPunctuation());
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
     * Audio encoding to use
     * - audio/raw;rate=16000
     * - audio/raw;rate=8000
     * - audio/raw;rate=8000;codec=mulaw
     * - audio/raw;rate=8000;codec=alaw
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encoding")
    private final String encoding;

    /**
     * Audio encoding to use
     * - audio/raw;rate=16000
     * - audio/raw;rate=8000
     * - audio/raw;rate=8000;codec=mulaw
     * - audio/raw;rate=8000;codec=alaw
     *
     * @return the value
     **/
    public String getEncoding() {
        return encoding;
    }

    /**
     * Toggle for ack messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAckEnabled")
    private final Boolean isAckEnabled;

    /**
     * Toggle for ack messages.
     * @return the value
     **/
    public Boolean getIsAckEnabled() {
        return isAckEnabled;
    }

    /**
     * Silence threshold for Realtime Speech partial results in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partialSilenceThresholdInMs")
    private final Integer partialSilenceThresholdInMs;

    /**
     * Silence threshold for Realtime Speech partial results in milliseconds.
     * @return the value
     **/
    public Integer getPartialSilenceThresholdInMs() {
        return partialSilenceThresholdInMs;
    }

    /**
     * Silence threshold for Realtime Speech final results in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("finalSilenceThresholdInMs")
    private final Integer finalSilenceThresholdInMs;

    /**
     * Silence threshold for Realtime Speech final results in milliseconds.
     * @return the value
     **/
    public Integer getFinalSilenceThresholdInMs() {
        return finalSilenceThresholdInMs;
    }

    /**
     * When enabled sets the amount of confidence required for latest tokens before returning them as part of a new partial result
     **/
    public enum StabilizePartialResults {
        None("NONE"),
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, StabilizePartialResults> map;

        static {
            map = new java.util.HashMap<>();
            for (StabilizePartialResults v : StabilizePartialResults.values()) {
                map.put(v.getValue(), v);
            }
        }

        StabilizePartialResults(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StabilizePartialResults create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StabilizePartialResults: " + key);
        }
    };
    /**
     * When enabled sets the amount of confidence required for latest tokens before returning them as part of a new partial result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stabilizePartialResults")
    private final StabilizePartialResults stabilizePartialResults;

    /**
     * When enabled sets the amount of confidence required for latest tokens before returning them as part of a new partial result
     * @return the value
     **/
    public StabilizePartialResults getStabilizePartialResults() {
        return stabilizePartialResults;
    }

    /**
     * Model Domain.
     **/
    public enum ModelDomain {
        Generic("GENERIC"),
        Medical("MEDICAL"),
        ;

        private final String value;
        private static java.util.Map<String, ModelDomain> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelDomain v : ModelDomain.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelDomain(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelDomain create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelDomain: " + key);
        }
    };
    /**
     * Model Domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelDomain")
    private final ModelDomain modelDomain;

    /**
     * Model Domain.
     * @return the value
     **/
    public ModelDomain getModelDomain() {
        return modelDomain;
    }

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646].
     * - en-US: English - United States
     * - es-ES: Spanish - Spain
     * - pt-BR: Portuguese - Brazil
     * - en-GB: English - Great Britain
     * - en-AU: English - Australia
     * - en-IN: English - India
     * - hi-IN: Hindi - India
     * - fr-FR: French - France
     * - de-DE: German - Germany
     * - it-IT: Italian - Italy
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646].
     * - en-US: English - United States
     * - es-ES: Spanish - Spain
     * - pt-BR: Portuguese - Brazil
     * - en-GB: English - Great Britain
     * - en-AU: English - Australia
     * - en-IN: English - India
     * - hi-IN: Hindi - India
     * - fr-FR: French - France
     * - de-DE: German - Germany
     * - it-IT: Italian - Italy
     *
     * @return the value
     **/
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * If set to true, the service will not fail connection attempt if it encounters any issues that prevent the loading of all specified user customizations. Any invalid customizations will simply be ignored and connection will continue being established with the default base model and any remaining valid customizations.
     * If set to false, if the service is unable to load any of the specified customizations, an error detailing why will be returned and the session will end.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIgnoreInvalidCustomizations")
    private final Boolean shouldIgnoreInvalidCustomizations;

    /**
     * If set to true, the service will not fail connection attempt if it encounters any issues that prevent the loading of all specified user customizations. Any invalid customizations will simply be ignored and connection will continue being established with the default base model and any remaining valid customizations.
     * If set to false, if the service is unable to load any of the specified customizations, an error detailing why will be returned and the session will end.
     *
     * @return the value
     **/
    public Boolean getShouldIgnoreInvalidCustomizations() {
        return shouldIgnoreInvalidCustomizations;
    }

    /**
     * Array of customization objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customizations")
    private final java.util.List<CustomizationInference> customizations;

    /**
     * Array of customization objects.
     * @return the value
     **/
    public java.util.List<CustomizationInference> getCustomizations() {
        return customizations;
    }

    /**
     * Configure punctuations in the generated transcriptions. Disabled by default.
     * - NONE: No punctuation in the transcription response
     * - SPOKEN: Punctuations in response only when verbally spoken
     * - AUTO: Automatic punctuation in the response, spoken punctuations are disabled
     *
     **/
    public enum Punctuation {
        None("NONE"),
        Spoken("SPOKEN"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, Punctuation> map;

        static {
            map = new java.util.HashMap<>();
            for (Punctuation v : Punctuation.values()) {
                map.put(v.getValue(), v);
            }
        }

        Punctuation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Punctuation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Punctuation: " + key);
        }
    };
    /**
     * Configure punctuations in the generated transcriptions. Disabled by default.
     * - NONE: No punctuation in the transcription response
     * - SPOKEN: Punctuations in response only when verbally spoken
     * - AUTO: Automatic punctuation in the response, spoken punctuations are disabled
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("punctuation")
    private final Punctuation punctuation;

    /**
     * Configure punctuations in the generated transcriptions. Disabled by default.
     * - NONE: No punctuation in the transcription response
     * - SPOKEN: Punctuations in response only when verbally spoken
     * - AUTO: Automatic punctuation in the response, spoken punctuations are disabled
     *
     * @return the value
     **/
    public Punctuation getPunctuation() {
        return punctuation;
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
        sb.append("RealtimeParameters(");
        sb.append("super=").append(super.toString());
        sb.append("encoding=").append(String.valueOf(this.encoding));
        sb.append(", isAckEnabled=").append(String.valueOf(this.isAckEnabled));
        sb.append(", partialSilenceThresholdInMs=")
                .append(String.valueOf(this.partialSilenceThresholdInMs));
        sb.append(", finalSilenceThresholdInMs=")
                .append(String.valueOf(this.finalSilenceThresholdInMs));
        sb.append(", stabilizePartialResults=")
                .append(String.valueOf(this.stabilizePartialResults));
        sb.append(", modelDomain=").append(String.valueOf(this.modelDomain));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", shouldIgnoreInvalidCustomizations=")
                .append(String.valueOf(this.shouldIgnoreInvalidCustomizations));
        sb.append(", customizations=").append(String.valueOf(this.customizations));
        sb.append(", punctuation=").append(String.valueOf(this.punctuation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeParameters)) {
            return false;
        }

        RealtimeParameters other = (RealtimeParameters) o;
        return java.util.Objects.equals(this.encoding, other.encoding)
                && java.util.Objects.equals(this.isAckEnabled, other.isAckEnabled)
                && java.util.Objects.equals(
                        this.partialSilenceThresholdInMs, other.partialSilenceThresholdInMs)
                && java.util.Objects.equals(
                        this.finalSilenceThresholdInMs, other.finalSilenceThresholdInMs)
                && java.util.Objects.equals(
                        this.stabilizePartialResults, other.stabilizePartialResults)
                && java.util.Objects.equals(this.modelDomain, other.modelDomain)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(
                        this.shouldIgnoreInvalidCustomizations,
                        other.shouldIgnoreInvalidCustomizations)
                && java.util.Objects.equals(this.customizations, other.customizations)
                && java.util.Objects.equals(this.punctuation, other.punctuation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.encoding == null ? 43 : this.encoding.hashCode());
        result = (result * PRIME) + (this.isAckEnabled == null ? 43 : this.isAckEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.partialSilenceThresholdInMs == null
                                ? 43
                                : this.partialSilenceThresholdInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.finalSilenceThresholdInMs == null
                                ? 43
                                : this.finalSilenceThresholdInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.stabilizePartialResults == null
                                ? 43
                                : this.stabilizePartialResults.hashCode());
        result = (result * PRIME) + (this.modelDomain == null ? 43 : this.modelDomain.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIgnoreInvalidCustomizations == null
                                ? 43
                                : this.shouldIgnoreInvalidCustomizations.hashCode());
        result =
                (result * PRIME)
                        + (this.customizations == null ? 43 : this.customizations.hashCode());
        result = (result * PRIME) + (this.punctuation == null ? 43 : this.punctuation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
