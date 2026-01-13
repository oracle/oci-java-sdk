/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Settings to use for generating speech with a model from ORACLE family. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TtsOracleSpeechSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TtsOracleSpeechSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "textType",
        "sampleRateInHz",
        "outputFormat",
        "speechMarkTypes"
    })
    public TtsOracleSpeechSettings(
            TextType textType,
            Integer sampleRateInHz,
            OutputFormat outputFormat,
            java.util.List<SpeechMarkTypes> speechMarkTypes) {
        super();
        this.textType = textType;
        this.sampleRateInHz = sampleRateInHz;
        this.outputFormat = outputFormat;
        this.speechMarkTypes = speechMarkTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The format in which the input text has been supplied i.e., Text or SSML. The supported
         * text types are: - TEXT - SSML : This is only supported for en-US language.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("textType")
        private TextType textType;

        /**
         * The format in which the input text has been supplied i.e., Text or SSML. The supported
         * text types are: - TEXT - SSML : This is only supported for en-US language.
         *
         * @param textType the value to set
         * @return this builder
         */
        public Builder textType(TextType textType) {
            this.textType = textType;
            this.__explicitlySet__.add("textType");
            return this;
        }
        /**
         * The sample rate of the generated audio. By default, the audio will be generated with
         * speaker voice sample rate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHz")
        private Integer sampleRateInHz;

        /**
         * The sample rate of the generated audio. By default, the audio will be generated with
         * speaker voice sample rate.
         *
         * @param sampleRateInHz the value to set
         * @return this builder
         */
        public Builder sampleRateInHz(Integer sampleRateInHz) {
            this.sampleRateInHz = sampleRateInHz;
            this.__explicitlySet__.add("sampleRateInHz");
            return this;
        }
        /**
         * The format of audio in which the user wants the audio to be in. The supported output
         * formats are: - MP3 - OGG - PCM - JSON
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
        private OutputFormat outputFormat;

        /**
         * The format of audio in which the user wants the audio to be in. The supported output
         * formats are: - MP3 - OGG - PCM - JSON
         *
         * @param outputFormat the value to set
         * @return this builder
         */
        public Builder outputFormat(OutputFormat outputFormat) {
            this.outputFormat = outputFormat;
            this.__explicitlySet__.add("outputFormat");
            return this;
        }
        /**
         * The kind of time stamp markings the user wants for the audio. This property should be
         * provided if outputFormat is json, otherwise it will be ignored. null value (i.e. no value
         * is not specified) indicates no speech marking. The supported speech mark types are: -
         * SENTENCE - WORD
         */
        @com.fasterxml.jackson.annotation.JsonProperty("speechMarkTypes")
        private java.util.List<SpeechMarkTypes> speechMarkTypes;

        /**
         * The kind of time stamp markings the user wants for the audio. This property should be
         * provided if outputFormat is json, otherwise it will be ignored. null value (i.e. no value
         * is not specified) indicates no speech marking. The supported speech mark types are: -
         * SENTENCE - WORD
         *
         * @param speechMarkTypes the value to set
         * @return this builder
         */
        public Builder speechMarkTypes(java.util.List<SpeechMarkTypes> speechMarkTypes) {
            this.speechMarkTypes = speechMarkTypes;
            this.__explicitlySet__.add("speechMarkTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TtsOracleSpeechSettings build() {
            TtsOracleSpeechSettings model =
                    new TtsOracleSpeechSettings(
                            this.textType,
                            this.sampleRateInHz,
                            this.outputFormat,
                            this.speechMarkTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TtsOracleSpeechSettings model) {
            if (model.wasPropertyExplicitlySet("textType")) {
                this.textType(model.getTextType());
            }
            if (model.wasPropertyExplicitlySet("sampleRateInHz")) {
                this.sampleRateInHz(model.getSampleRateInHz());
            }
            if (model.wasPropertyExplicitlySet("outputFormat")) {
                this.outputFormat(model.getOutputFormat());
            }
            if (model.wasPropertyExplicitlySet("speechMarkTypes")) {
                this.speechMarkTypes(model.getSpeechMarkTypes());
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

    /**
     * The format in which the input text has been supplied i.e., Text or SSML. The supported text
     * types are: - TEXT - SSML : This is only supported for en-US language.
     */
    public enum TextType implements com.oracle.bmc.http.internal.BmcEnum {
        Text("TEXT"),
        Ssml("SSML"),
        ;

        private final String value;
        private static java.util.Map<String, TextType> map;

        static {
            map = new java.util.HashMap<>();
            for (TextType v : TextType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TextType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TextType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TextType: " + key);
        }
    };
    /**
     * The format in which the input text has been supplied i.e., Text or SSML. The supported text
     * types are: - TEXT - SSML : This is only supported for en-US language.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("textType")
    private final TextType textType;

    /**
     * The format in which the input text has been supplied i.e., Text or SSML. The supported text
     * types are: - TEXT - SSML : This is only supported for en-US language.
     *
     * @return the value
     */
    public TextType getTextType() {
        return textType;
    }

    /**
     * The sample rate of the generated audio. By default, the audio will be generated with speaker
     * voice sample rate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHz")
    private final Integer sampleRateInHz;

    /**
     * The sample rate of the generated audio. By default, the audio will be generated with speaker
     * voice sample rate.
     *
     * @return the value
     */
    public Integer getSampleRateInHz() {
        return sampleRateInHz;
    }

    /**
     * The format of audio in which the user wants the audio to be in. The supported output formats
     * are: - MP3 - OGG - PCM - JSON
     */
    public enum OutputFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Mp3("MP3"),
        Ogg("OGG"),
        Pcm("PCM"),
        Json("JSON"),
        ;

        private final String value;
        private static java.util.Map<String, OutputFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputFormat v : OutputFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputFormat: " + key);
        }
    };
    /**
     * The format of audio in which the user wants the audio to be in. The supported output formats
     * are: - MP3 - OGG - PCM - JSON
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputFormat")
    private final OutputFormat outputFormat;

    /**
     * The format of audio in which the user wants the audio to be in. The supported output formats
     * are: - MP3 - OGG - PCM - JSON
     *
     * @return the value
     */
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    /** */
    public enum SpeechMarkTypes implements com.oracle.bmc.http.internal.BmcEnum {
        Sentence("SENTENCE"),
        Word("WORD"),
        ;

        private final String value;
        private static java.util.Map<String, SpeechMarkTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (SpeechMarkTypes v : SpeechMarkTypes.values()) {
                map.put(v.getValue(), v);
            }
        }

        SpeechMarkTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SpeechMarkTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SpeechMarkTypes: " + key);
        }
    };
    /**
     * The kind of time stamp markings the user wants for the audio. This property should be
     * provided if outputFormat is json, otherwise it will be ignored. null value (i.e. no value is
     * not specified) indicates no speech marking. The supported speech mark types are: - SENTENCE -
     * WORD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("speechMarkTypes")
    private final java.util.List<SpeechMarkTypes> speechMarkTypes;

    /**
     * The kind of time stamp markings the user wants for the audio. This property should be
     * provided if outputFormat is json, otherwise it will be ignored. null value (i.e. no value is
     * not specified) indicates no speech marking. The supported speech mark types are: - SENTENCE -
     * WORD
     *
     * @return the value
     */
    public java.util.List<SpeechMarkTypes> getSpeechMarkTypes() {
        return speechMarkTypes;
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
        sb.append("TtsOracleSpeechSettings(");
        sb.append("super=").append(super.toString());
        sb.append("textType=").append(String.valueOf(this.textType));
        sb.append(", sampleRateInHz=").append(String.valueOf(this.sampleRateInHz));
        sb.append(", outputFormat=").append(String.valueOf(this.outputFormat));
        sb.append(", speechMarkTypes=").append(String.valueOf(this.speechMarkTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TtsOracleSpeechSettings)) {
            return false;
        }

        TtsOracleSpeechSettings other = (TtsOracleSpeechSettings) o;
        return java.util.Objects.equals(this.textType, other.textType)
                && java.util.Objects.equals(this.sampleRateInHz, other.sampleRateInHz)
                && java.util.Objects.equals(this.outputFormat, other.outputFormat)
                && java.util.Objects.equals(this.speechMarkTypes, other.speechMarkTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.textType == null ? 43 : this.textType.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleRateInHz == null ? 43 : this.sampleRateInHz.hashCode());
        result = (result * PRIME) + (this.outputFormat == null ? 43 : this.outputFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.speechMarkTypes == null ? 43 : this.speechMarkTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
