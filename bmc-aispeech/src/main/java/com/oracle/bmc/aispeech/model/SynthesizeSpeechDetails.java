/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Input JSON to get audio inference from TTS Service.
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
    builder = SynthesizeSpeechDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SynthesizeSpeechDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "text",
        "isStreamEnabled",
        "compartmentId",
        "configuration",
        "audioConfig"
    })
    public SynthesizeSpeechDetails(
            String text,
            Boolean isStreamEnabled,
            String compartmentId,
            TtsConfiguration configuration,
            TtsAudioConfig audioConfig) {
        super();
        this.text = text;
        this.isStreamEnabled = isStreamEnabled;
        this.compartmentId = compartmentId;
        this.configuration = configuration;
        this.audioConfig = audioConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The text input to get the inference audio from TTS Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The text input to get the inference audio from TTS Service.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * If set to true, response will be sent in the chunked transfer-encoding and audio chunks
         * are sent back as and when they are ready. If set to false, response will be sent only once
         * the entire audio is generated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isStreamEnabled")
        private Boolean isStreamEnabled;

        /**
         * If set to true, response will be sent in the chunked transfer-encoding and audio chunks
         * are sent back as and when they are ready. If set to false, response will be sent only once
         * the entire audio is generated.
         *
         * @param isStreamEnabled the value to set
         * @return this builder
         **/
        public Builder isStreamEnabled(Boolean isStreamEnabled) {
            this.isStreamEnabled = isStreamEnabled;
            this.__explicitlySet__.add("isStreamEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the user has access to call {@code SpeechSynthesize} api. But default user access will be checked at tenancy level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the user has access to call {@code SpeechSynthesize} api. But default user access will be checked at tenancy level.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private TtsConfiguration configuration;

        public Builder configuration(TtsConfiguration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("audioConfig")
        private TtsAudioConfig audioConfig;

        public Builder audioConfig(TtsAudioConfig audioConfig) {
            this.audioConfig = audioConfig;
            this.__explicitlySet__.add("audioConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SynthesizeSpeechDetails build() {
            SynthesizeSpeechDetails model =
                    new SynthesizeSpeechDetails(
                            this.text,
                            this.isStreamEnabled,
                            this.compartmentId,
                            this.configuration,
                            this.audioConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SynthesizeSpeechDetails model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("isStreamEnabled")) {
                this.isStreamEnabled(model.getIsStreamEnabled());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("audioConfig")) {
                this.audioConfig(model.getAudioConfig());
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
     * The text input to get the inference audio from TTS Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The text input to get the inference audio from TTS Service.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * If set to true, response will be sent in the chunked transfer-encoding and audio chunks
     * are sent back as and when they are ready. If set to false, response will be sent only once
     * the entire audio is generated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStreamEnabled")
    private final Boolean isStreamEnabled;

    /**
     * If set to true, response will be sent in the chunked transfer-encoding and audio chunks
     * are sent back as and when they are ready. If set to false, response will be sent only once
     * the entire audio is generated.
     *
     * @return the value
     **/
    public Boolean getIsStreamEnabled() {
        return isStreamEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the user has access to call {@code SpeechSynthesize} api. But default user access will be checked at tenancy level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the user has access to call {@code SpeechSynthesize} api. But default user access will be checked at tenancy level.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final TtsConfiguration configuration;

    public TtsConfiguration getConfiguration() {
        return configuration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("audioConfig")
    private final TtsAudioConfig audioConfig;

    public TtsAudioConfig getAudioConfig() {
        return audioConfig;
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
        sb.append("SynthesizeSpeechDetails(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", isStreamEnabled=").append(String.valueOf(this.isStreamEnabled));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", audioConfig=").append(String.valueOf(this.audioConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SynthesizeSpeechDetails)) {
            return false;
        }

        SynthesizeSpeechDetails other = (SynthesizeSpeechDetails) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.isStreamEnabled, other.isStreamEnabled)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.audioConfig, other.audioConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result =
                (result * PRIME)
                        + (this.isStreamEnabled == null ? 43 : this.isStreamEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.audioConfig == null ? 43 : this.audioConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
