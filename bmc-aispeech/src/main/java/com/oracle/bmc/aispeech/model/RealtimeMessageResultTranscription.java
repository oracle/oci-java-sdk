/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Transcription object.
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
    builder = RealtimeMessageResultTranscription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RealtimeMessageResultTranscription
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "transcription",
        "isFinal",
        "startTimeInMs",
        "endTimeInMs",
        "confidence",
        "trailingSilence",
        "tokens"
    })
    public RealtimeMessageResultTranscription(
            String transcription,
            Boolean isFinal,
            Integer startTimeInMs,
            Integer endTimeInMs,
            Float confidence,
            Integer trailingSilence,
            java.util.List<RealtimeMessageResultTranscriptionToken> tokens) {
        super();
        this.transcription = transcription;
        this.isFinal = isFinal;
        this.startTimeInMs = startTimeInMs;
        this.endTimeInMs = endTimeInMs;
        this.confidence = confidence;
        this.trailingSilence = trailingSilence;
        this.tokens = tokens;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Transcription text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transcription")
        private String transcription;

        /**
         * Transcription text.
         * @param transcription the value to set
         * @return this builder
         **/
        public Builder transcription(String transcription) {
            this.transcription = transcription;
            this.__explicitlySet__.add("transcription");
            return this;
        }
        /**
         * Whether the transcription is final or partial.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFinal")
        private Boolean isFinal;

        /**
         * Whether the transcription is final or partial.
         * @param isFinal the value to set
         * @return this builder
         **/
        public Builder isFinal(Boolean isFinal) {
            this.isFinal = isFinal;
            this.__explicitlySet__.add("isFinal");
            return this;
        }
        /**
         * Start time in milliseconds for the transcription text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMs")
        private Integer startTimeInMs;

        /**
         * Start time in milliseconds for the transcription text.
         * @param startTimeInMs the value to set
         * @return this builder
         **/
        public Builder startTimeInMs(Integer startTimeInMs) {
            this.startTimeInMs = startTimeInMs;
            this.__explicitlySet__.add("startTimeInMs");
            return this;
        }
        /**
         * End time in milliseconds for the transcription text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMs")
        private Integer endTimeInMs;

        /**
         * End time in milliseconds for the transcription text.
         * @param endTimeInMs the value to set
         * @return this builder
         **/
        public Builder endTimeInMs(Integer endTimeInMs) {
            this.endTimeInMs = endTimeInMs;
            this.__explicitlySet__.add("endTimeInMs");
            return this;
        }
        /**
         * Confidence for the transcription text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * Confidence for the transcription text.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * Trailing silence after the transcription text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trailingSilence")
        private Integer trailingSilence;

        /**
         * Trailing silence after the transcription text.
         * @param trailingSilence the value to set
         * @return this builder
         **/
        public Builder trailingSilence(Integer trailingSilence) {
            this.trailingSilence = trailingSilence;
            this.__explicitlySet__.add("trailingSilence");
            return this;
        }
        /**
         * Array of individual transcription tokens.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tokens")
        private java.util.List<RealtimeMessageResultTranscriptionToken> tokens;

        /**
         * Array of individual transcription tokens.
         * @param tokens the value to set
         * @return this builder
         **/
        public Builder tokens(java.util.List<RealtimeMessageResultTranscriptionToken> tokens) {
            this.tokens = tokens;
            this.__explicitlySet__.add("tokens");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeMessageResultTranscription build() {
            RealtimeMessageResultTranscription model =
                    new RealtimeMessageResultTranscription(
                            this.transcription,
                            this.isFinal,
                            this.startTimeInMs,
                            this.endTimeInMs,
                            this.confidence,
                            this.trailingSilence,
                            this.tokens);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeMessageResultTranscription model) {
            if (model.wasPropertyExplicitlySet("transcription")) {
                this.transcription(model.getTranscription());
            }
            if (model.wasPropertyExplicitlySet("isFinal")) {
                this.isFinal(model.getIsFinal());
            }
            if (model.wasPropertyExplicitlySet("startTimeInMs")) {
                this.startTimeInMs(model.getStartTimeInMs());
            }
            if (model.wasPropertyExplicitlySet("endTimeInMs")) {
                this.endTimeInMs(model.getEndTimeInMs());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("trailingSilence")) {
                this.trailingSilence(model.getTrailingSilence());
            }
            if (model.wasPropertyExplicitlySet("tokens")) {
                this.tokens(model.getTokens());
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
     * Transcription text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transcription")
    private final String transcription;

    /**
     * Transcription text.
     * @return the value
     **/
    public String getTranscription() {
        return transcription;
    }

    /**
     * Whether the transcription is final or partial.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFinal")
    private final Boolean isFinal;

    /**
     * Whether the transcription is final or partial.
     * @return the value
     **/
    public Boolean getIsFinal() {
        return isFinal;
    }

    /**
     * Start time in milliseconds for the transcription text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMs")
    private final Integer startTimeInMs;

    /**
     * Start time in milliseconds for the transcription text.
     * @return the value
     **/
    public Integer getStartTimeInMs() {
        return startTimeInMs;
    }

    /**
     * End time in milliseconds for the transcription text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMs")
    private final Integer endTimeInMs;

    /**
     * End time in milliseconds for the transcription text.
     * @return the value
     **/
    public Integer getEndTimeInMs() {
        return endTimeInMs;
    }

    /**
     * Confidence for the transcription text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * Confidence for the transcription text.
     * @return the value
     **/
    public Float getConfidence() {
        return confidence;
    }

    /**
     * Trailing silence after the transcription text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailingSilence")
    private final Integer trailingSilence;

    /**
     * Trailing silence after the transcription text.
     * @return the value
     **/
    public Integer getTrailingSilence() {
        return trailingSilence;
    }

    /**
     * Array of individual transcription tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tokens")
    private final java.util.List<RealtimeMessageResultTranscriptionToken> tokens;

    /**
     * Array of individual transcription tokens.
     * @return the value
     **/
    public java.util.List<RealtimeMessageResultTranscriptionToken> getTokens() {
        return tokens;
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
        sb.append("RealtimeMessageResultTranscription(");
        sb.append("super=").append(super.toString());
        sb.append("transcription=").append(String.valueOf(this.transcription));
        sb.append(", isFinal=").append(String.valueOf(this.isFinal));
        sb.append(", startTimeInMs=").append(String.valueOf(this.startTimeInMs));
        sb.append(", endTimeInMs=").append(String.valueOf(this.endTimeInMs));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", trailingSilence=").append(String.valueOf(this.trailingSilence));
        sb.append(", tokens=").append(String.valueOf(this.tokens));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessageResultTranscription)) {
            return false;
        }

        RealtimeMessageResultTranscription other = (RealtimeMessageResultTranscription) o;
        return java.util.Objects.equals(this.transcription, other.transcription)
                && java.util.Objects.equals(this.isFinal, other.isFinal)
                && java.util.Objects.equals(this.startTimeInMs, other.startTimeInMs)
                && java.util.Objects.equals(this.endTimeInMs, other.endTimeInMs)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.trailingSilence, other.trailingSilence)
                && java.util.Objects.equals(this.tokens, other.tokens)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.transcription == null ? 43 : this.transcription.hashCode());
        result = (result * PRIME) + (this.isFinal == null ? 43 : this.isFinal.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeInMs == null ? 43 : this.startTimeInMs.hashCode());
        result = (result * PRIME) + (this.endTimeInMs == null ? 43 : this.endTimeInMs.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.trailingSilence == null ? 43 : this.trailingSilence.hashCode());
        result = (result * PRIME) + (this.tokens == null ? 43 : this.tokens.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
