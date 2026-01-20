/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Use this schema for specifying properties of TTS_2_NATURAL model from Oracle model family. <br>
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
        builder = TtsOracleTts2NaturalModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TtsOracleTts2NaturalModelDetails extends TtsOracleModelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Speaker in whose voice the user wants the output speech to be in. The possible values for
         * {@code voiceId} can be obtained by calling {@link #listVoices(ListVoicesRequest)
         * listVoices} api.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("voiceId")
        private String voiceId;

        /**
         * Speaker in whose voice the user wants the output speech to be in. The possible values for
         * {@code voiceId} can be obtained by calling {@link #listVoices(ListVoicesRequest)
         * listVoices} api.
         *
         * @param voiceId the value to set
         * @return this builder
         */
        public Builder voiceId(String voiceId) {
            this.voiceId = voiceId;
            this.__explicitlySet__.add("voiceId");
            return this;
        }
        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. Default
         * en-US - en-US: English - United States - en-GB: English - Great Britain - es-ES: Spanish
         * - Spain - pt-BR: Portuguese - Brazil - hi-IN: Hindi - India - fr-FR: French - France -
         * it-IT: Italian - Italy - ja-JP: Japanese - Japan - cmn-CN: Mandarin - China
         */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. Default
         * en-US - en-US: English - United States - en-GB: English - Great Britain - es-ES: Spanish
         * - Spain - pt-BR: Portuguese - Brazil - hi-IN: Hindi - India - fr-FR: French - France -
         * it-IT: Italian - Italy - ja-JP: Japanese - Japan - cmn-CN: Mandarin - China
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

        public TtsOracleTts2NaturalModelDetails build() {
            TtsOracleTts2NaturalModelDetails model =
                    new TtsOracleTts2NaturalModelDetails(this.voiceId, this.languageCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TtsOracleTts2NaturalModelDetails model) {
            if (model.wasPropertyExplicitlySet("voiceId")) {
                this.voiceId(model.getVoiceId());
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

    @Deprecated
    public TtsOracleTts2NaturalModelDetails(String voiceId, String languageCode) {
        super();
        this.voiceId = voiceId;
        this.languageCode = languageCode;
    }

    /**
     * Speaker in whose voice the user wants the output speech to be in. The possible values for
     * {@code voiceId} can be obtained by calling {@link #listVoices(ListVoicesRequest) listVoices}
     * api.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("voiceId")
    private final String voiceId;

    /**
     * Speaker in whose voice the user wants the output speech to be in. The possible values for
     * {@code voiceId} can be obtained by calling {@link #listVoices(ListVoicesRequest) listVoices}
     * api.
     *
     * @return the value
     */
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. Default en-US -
     * en-US: English - United States - en-GB: English - Great Britain - es-ES: Spanish - Spain -
     * pt-BR: Portuguese - Brazil - hi-IN: Hindi - India - fr-FR: French - France - it-IT: Italian -
     * Italy - ja-JP: Japanese - Japan - cmn-CN: Mandarin - China
     */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Locale value as per given in [https://datatracker.ietf.org/doc/html/rfc5646]. Default en-US -
     * en-US: English - United States - en-GB: English - Great Britain - es-ES: Spanish - Spain -
     * pt-BR: Portuguese - Brazil - hi-IN: Hindi - India - fr-FR: French - France - it-IT: Italian -
     * Italy - ja-JP: Japanese - Japan - cmn-CN: Mandarin - China
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
        sb.append("TtsOracleTts2NaturalModelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", voiceId=").append(String.valueOf(this.voiceId));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TtsOracleTts2NaturalModelDetails)) {
            return false;
        }

        TtsOracleTts2NaturalModelDetails other = (TtsOracleTts2NaturalModelDetails) o;
        return java.util.Objects.equals(this.voiceId, other.voiceId)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.voiceId == null ? 43 : this.voiceId.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        return result;
    }
}
